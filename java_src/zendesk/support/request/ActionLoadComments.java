package zendesk.support.request;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import zendesk.belvedere.C31096a;
import zendesk.belvedere.MediaResult;
import zendesk.support.Attachment;
import zendesk.support.CommentResponse;
import zendesk.support.CommentsResponse;
import zendesk.support.RequestProvider;
import zendesk.support.request.AsyncMiddleware;
import zendesk.support.suas.Dispatcher;
import zendesk.support.suas.GetState;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class ActionLoadComments implements AsyncMiddleware.AsyncAction {
    private final ActionFactory actionFactory;
    private final C31096a belvedere;
    private final Handler handler;
    private final boolean initialLoad;
    private final RequestProvider requestProvider;

    /* loaded from: classes8.dex */
    public static abstract class MinimumTimeCallback<E> extends AbstractC44415lI6<E> {
        private final Handler handler;
        private final long minTime;
        private final TimeUnit minTimeUnit;
        private final long start = System.nanoTime();

        public MinimumTimeCallback(Handler handler, long j, TimeUnit timeUnit) {
            this.handler = handler;
            this.minTime = j;
            this.minTimeUnit = timeUnit;
        }

        private long remainingTime() {
            long nanoTime = System.nanoTime() - this.start;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long convert = timeUnit.convert(this.minTime, this.minTimeUnit);
            if (nanoTime < convert) {
                return TimeUnit.MILLISECONDS.convert(convert - nanoTime, timeUnit);
            }
            return 0L;
        }

        public abstract void onDelayedError(InterfaceC48782sg1 interfaceC48782sg1);

        public abstract void onDelayedSuccess(E e);

        @Override // p000.AbstractC44415lI6
        public void onError(final InterfaceC48782sg1 interfaceC48782sg1) {
            this.handler.postDelayed(new Runnable() { // from class: zendesk.support.request.ActionLoadComments.MinimumTimeCallback.2
                @Override // java.lang.Runnable
                public void run() {
                    MinimumTimeCallback.this.onDelayedError(interfaceC48782sg1);
                }
            }, remainingTime());
        }

        @Override // p000.AbstractC44415lI6
        public void onSuccess(final E e) {
            this.handler.postDelayed(new Runnable() { // from class: zendesk.support.request.ActionLoadComments.MinimumTimeCallback.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public void run() {
                    MinimumTimeCallback.this.onDelayedSuccess(e);
                }
            }, remainingTime());
        }
    }

    public ActionLoadComments(ActionFactory actionFactory, RequestProvider requestProvider, C31096a c31096a, boolean z) {
        this(actionFactory, requestProvider, c31096a, new Handler(Looper.getMainLooper()), z);
    }

    private StateMessage find2ndLastDeliveredMessage(List<StateMessage> list) {
        ListIterator<StateMessage> listIterator = list.listIterator(list.size());
        int i = 0;
        while (listIterator.hasPrevious()) {
            StateMessage previous = listIterator.previous();
            if (previous.getState().getStatus() == 2 && (i = i + 1) == 2) {
                return previous;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"UseSparseArrays"})
    public Map<Long, MediaResult> findAttachments(String str, CommentsResponse commentsResponse) {
        List<CommentResponse> comments = commentsResponse.getComments();
        HashMap hashMap = new HashMap();
        for (CommentResponse commentResponse : comments) {
            for (Attachment attachment : commentResponse.getAttachments()) {
                MediaResult localFile = UtilsAttachment.getLocalFile(this.belvedere, str, attachment.getId().longValue(), attachment.getFileName());
                if (attachment.getSize().longValue() == localFile.m785c().length()) {
                    hashMap.put(attachment.getId(), localFile);
                }
            }
        }
        return hashMap;
    }

    @Override // zendesk.support.request.AsyncMiddleware.AsyncAction
    public void actionQueued(Dispatcher dispatcher, GetState getState) {
        dispatcher.dispatch(this.actionFactory.loadComments(this.initialLoad));
    }

    @Override // zendesk.support.request.AsyncMiddleware.AsyncAction
    public void execute(final Dispatcher dispatcher, GetState getState, final AsyncMiddleware.Callback callback) {
        final StateConversation fromState = StateConversation.fromState(getState.getState());
        if (!C44504lS5.m27273b(fromState.getRemoteId())) {
            C33694Ix2.m101457b("RequestActivity", "Skip loading comments. No remote id found.", new Object[0]);
            dispatcher.dispatch(this.actionFactory.skipAction());
            callback.done();
            return;
        }
        MinimumTimeCallback<CommentsResponse> minimumTimeCallback = new MinimumTimeCallback<CommentsResponse>(this.handler, 1L, TimeUnit.SECONDS) { // from class: zendesk.support.request.ActionLoadComments.1
            @Override // zendesk.support.request.ActionLoadComments.MinimumTimeCallback
            public void onDelayedError(InterfaceC48782sg1 interfaceC48782sg1) {
                C33694Ix2.m101447l("RequestActivity", "Unable to load comments. Error: '%s'", interfaceC48782sg1.mo9891c());
                dispatcher.dispatch(ActionLoadComments.this.actionFactory.loadCommentsError(ActionLoadComments.this.initialLoad, interfaceC48782sg1));
                callback.done();
            }

            @Override // zendesk.support.request.ActionLoadComments.MinimumTimeCallback
            public void onDelayedSuccess(CommentsResponse commentsResponse) {
                HashSet hashSet = new HashSet(fromState.getMessageIdMapper().getRemoteIds());
                for (CommentResponse commentResponse : commentsResponse.getComments()) {
                    hashSet.add(commentResponse.getId());
                }
                ActionLoadComments.this.requestProvider.markRequestAsRead(fromState.getRemoteId(), hashSet.size());
                dispatcher.dispatch(ActionLoadComments.this.actionFactory.loadCommentsSuccess(ActionLoadComments.this.initialLoad, commentsResponse, ActionLoadComments.this.findAttachments(fromState.getLocalId(), commentsResponse)));
                callback.done();
            }
        };
        StateMessage find2ndLastDeliveredMessage = find2ndLastDeliveredMessage(fromState.getMessages());
        if (find2ndLastDeliveredMessage != null) {
            this.requestProvider.getCommentsSince(fromState.getRemoteId(), find2ndLastDeliveredMessage.getDate(), false, minimumTimeCallback);
        } else {
            this.requestProvider.getComments(fromState.getRemoteId(), minimumTimeCallback);
        }
    }

    public ActionLoadComments(ActionFactory actionFactory, RequestProvider requestProvider, C31096a c31096a, Handler handler, boolean z) {
        this.actionFactory = actionFactory;
        this.requestProvider = requestProvider;
        this.belvedere = c31096a;
        this.handler = handler;
        this.initialLoad = z;
    }
}
