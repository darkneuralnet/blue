package zendesk.support.request;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import zendesk.belvedere.C31096a;
import zendesk.belvedere.MediaResult;
import zendesk.support.SupportUiStorage;
import zendesk.support.request.AsyncMiddleware;
import zendesk.support.request.ComponentPersistence;
import zendesk.support.suas.Action;
import zendesk.support.suas.Dispatcher;
import zendesk.support.suas.GetState;
/* loaded from: classes8.dex */
class ActionLoadCachedComments implements AsyncMiddleware.AsyncAction {

    /* renamed from: af */
    private final ActionFactory f121969af;
    private final C31096a belvedere;
    private final Executor executorService;
    private final String sdkVersion;
    private final SupportUiStorage supportUiStorage;

    /* loaded from: classes8.dex */
    public static class LoadComments implements Runnable {

        /* renamed from: af */
        private final ActionFactory f121970af;
        private final C31096a belvedere;
        private final AsyncMiddleware.Callback callback;
        private final Dispatcher dispatcher;

        /* renamed from: id */
        private final String f121971id;
        private final String sdkVersion;
        private final SupportUiStorage supportUiStorage;

        public LoadComments(String str, Dispatcher dispatcher, AsyncMiddleware.Callback callback, SupportUiStorage supportUiStorage, ActionFactory actionFactory, C31096a c31096a, String str2) {
            this.f121971id = str;
            this.dispatcher = dispatcher;
            this.callback = callback;
            this.supportUiStorage = supportUiStorage;
            this.f121970af = actionFactory;
            this.belvedere = c31096a;
            this.sdkVersion = str2;
        }

        private StateMessage findLocalAttachmentForMessage(StateMessage stateMessage, StateIdMapper stateIdMapper, C31096a c31096a, String str) {
            List<StateRequestAttachment> attachments = stateMessage.getAttachments();
            if (C43505jm0.m29948i(attachments)) {
                ArrayList arrayList = new ArrayList(stateMessage.getAttachments().size());
                for (StateRequestAttachment stateRequestAttachment : attachments) {
                    if (stateIdMapper.hasRemoteId(Long.valueOf(stateRequestAttachment.getId()))) {
                        arrayList.add(updateAttachment(stateRequestAttachment, UtilsAttachment.getLocalFile(c31096a, str, stateIdMapper.getRemoteId(Long.valueOf(stateRequestAttachment.getId())).longValue(), stateRequestAttachment.getName())));
                    } else {
                        arrayList.add(stateRequestAttachment);
                    }
                }
                return stateMessage.withAttachments(arrayList);
            }
            return stateMessage;
        }

        private StateRequestAttachment updateAttachment(StateRequestAttachment stateRequestAttachment, MediaResult mediaResult) {
            File file;
            String str;
            if (stateRequestAttachment.getSize() == mediaResult.m785c().length()) {
                file = mediaResult.m785c();
                str = mediaResult.m779j().toString();
            } else {
                file = null;
                str = null;
            }
            return stateRequestAttachment.newBuilder().setLocalFile(file).setLocalUri(str).build();
        }

        public String getId() {
            return this.f121971id;
        }

        public StateConversation resolveAttachments(StateConversation stateConversation) {
            ArrayList arrayList = new ArrayList(stateConversation.getMessages().size());
            for (StateMessage stateMessage : stateConversation.getMessages()) {
                arrayList.add(findLocalAttachmentForMessage(stateMessage, stateConversation.getAttachmentIdMapper(), this.belvedere, stateConversation.getLocalId()));
            }
            return stateConversation.newBuilder().setMessages(arrayList).build();
        }

        @Override // java.lang.Runnable
        public void run() {
            Action loadCommentsFromCacheError;
            ComponentPersistence.RequestPersistenceModel requestPersistenceModel = (ComponentPersistence.RequestPersistenceModel) this.supportUiStorage.read(this.f121971id, ComponentPersistence.RequestPersistenceModel.class);
            if (requestPersistenceModel != null && requestPersistenceModel.getConversation() != null) {
                if (this.sdkVersion.equals(requestPersistenceModel.getVersion())) {
                    C33694Ix2.m101457b("RequestActivity", "Successfully loaded request from disk", new Object[0]);
                    loadCommentsFromCacheError = this.f121970af.loadCommentsFromCacheSuccess(resolveAttachments(requestPersistenceModel.getConversation()));
                } else {
                    C33694Ix2.m101457b("RequestActivity", "Cached version doesn't match with SDK version. Ignoring cached data. [%s, %s]", requestPersistenceModel.getVersion(), "5.0.9");
                    loadCommentsFromCacheError = this.f121970af.loadCommentsFromCacheError();
                }
            } else {
                C33694Ix2.m101457b("RequestActivity", "Unable to loaded request from disk", new Object[0]);
                loadCommentsFromCacheError = this.f121970af.loadCommentsFromCacheError();
            }
            this.dispatcher.dispatch(loadCommentsFromCacheError);
            this.callback.done();
        }
    }

    public ActionLoadCachedComments(ActionFactory actionFactory, SupportUiStorage supportUiStorage, C31096a c31096a, Executor executor, String str) {
        this.f121969af = actionFactory;
        this.supportUiStorage = supportUiStorage;
        this.belvedere = c31096a;
        this.executorService = executor;
        this.sdkVersion = str;
    }

    @Override // zendesk.support.request.AsyncMiddleware.AsyncAction
    public void actionQueued(Dispatcher dispatcher, GetState getState) {
        dispatcher.dispatch(this.f121969af.loadCommentsFromCache());
    }

    @Override // zendesk.support.request.AsyncMiddleware.AsyncAction
    public void execute(Dispatcher dispatcher, GetState getState, AsyncMiddleware.Callback callback) {
        StateConversation fromState = StateConversation.fromState(getState.getState());
        if (C44504lS5.m27273b(fromState.getLocalId())) {
            this.executorService.execute(new LoadComments(fromState.getLocalId(), dispatcher, callback, this.supportUiStorage, this.f121969af, this.belvedere, this.sdkVersion));
            return;
        }
        dispatcher.dispatch(this.f121969af.skipAction());
        callback.done();
    }
}
