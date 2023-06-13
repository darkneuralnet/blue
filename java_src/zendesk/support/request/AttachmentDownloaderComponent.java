package zendesk.support.request;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import okhttp3.ResponseBody;
import zendesk.belvedere.C31096a;
import zendesk.belvedere.MediaResult;
import zendesk.support.suas.Dispatcher;
import zendesk.support.suas.Listener;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class AttachmentDownloaderComponent implements Listener<StateConversation> {
    private final ActionFactory actionFactory;
    private final AttachmentDownloader attachmentDownloader;
    private final Dispatcher dispatcher;
    private final AttachmentDownloaderSelector selector = new AttachmentDownloaderSelector();

    /* loaded from: classes8.dex */
    public static class AttachmentDownloader {
        private final AttachmentDownloadService attachmentIo;
        private final C31096a belvedere;
        private final Set<String> downloadingHistory = new HashSet();

        /* loaded from: classes8.dex */
        public class CacheCallback extends AbstractC44415lI6<MediaResult> {
            private final AbstractC44415lI6<MediaResult> callback;
            private final StateRequestAttachment requestAttachment;

            public CacheCallback(StateRequestAttachment stateRequestAttachment, AbstractC44415lI6<MediaResult> abstractC44415lI6) {
                this.requestAttachment = stateRequestAttachment;
                this.callback = abstractC44415lI6;
            }

            @Override // p000.AbstractC44415lI6
            public void onError(InterfaceC48782sg1 interfaceC48782sg1) {
                AttachmentDownloader.this.handleError(this.requestAttachment.getUrl(), interfaceC48782sg1, this.callback);
            }

            @Override // p000.AbstractC44415lI6
            public void onSuccess(MediaResult mediaResult) {
                this.callback.onSuccess(mediaResult);
                AttachmentDownloader.this.downloadingHistory.remove(this.requestAttachment.getUrl());
            }
        }

        /* loaded from: classes8.dex */
        public class HttpCallback extends AbstractC44415lI6<ResponseBody> {
            private final AbstractC44415lI6<MediaResult> callback;
            private final Request request;
            private final StateRequestAttachment requestAttachment;

            public HttpCallback(Request request, StateRequestAttachment stateRequestAttachment, AbstractC44415lI6<MediaResult> abstractC44415lI6) {
                this.request = request;
                this.requestAttachment = stateRequestAttachment;
                this.callback = abstractC44415lI6;
            }

            @Override // p000.AbstractC44415lI6
            public void onError(InterfaceC48782sg1 interfaceC48782sg1) {
                AttachmentDownloader.this.handleError(this.requestAttachment.getUrl(), interfaceC48782sg1, this.callback);
            }

            @Override // p000.AbstractC44415lI6
            public void onSuccess(ResponseBody responseBody) {
                AttachmentDownloader.this.attachmentIo.storeAttachment(responseBody, UtilsAttachment.getLocalFile(AttachmentDownloader.this.belvedere, this.request.getRequestId(), this.request.getRemoteAttachmentId(), this.requestAttachment.getName()), new CacheCallback(this.requestAttachment, this.callback));
            }
        }

        /* loaded from: classes8.dex */
        public static class Request {
            private final long remoteAttachmentId;
            private final StateRequestAttachment requestAttachment;
            private final String requestId;

            public Request(String str, long j, StateRequestAttachment stateRequestAttachment) {
                this.requestId = str;
                this.remoteAttachmentId = j;
                this.requestAttachment = stateRequestAttachment;
            }

            public long getRemoteAttachmentId() {
                return this.remoteAttachmentId;
            }

            public StateRequestAttachment getRequestAttachment() {
                return this.requestAttachment;
            }

            public String getRequestId() {
                return this.requestId;
            }
        }

        public AttachmentDownloader(C31096a c31096a, AttachmentDownloadService attachmentDownloadService) {
            this.belvedere = c31096a;
            this.attachmentIo = attachmentDownloadService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void handleError(String str, InterfaceC48782sg1 interfaceC48782sg1, AbstractC44415lI6 abstractC44415lI6) {
            this.downloadingHistory.remove(str);
            if (abstractC44415lI6 != null) {
                abstractC44415lI6.onError(interfaceC48782sg1);
            }
        }

        public void download(Request request, AbstractC44415lI6<MediaResult> abstractC44415lI6) {
            StateRequestAttachment requestAttachment = request.getRequestAttachment();
            String url = requestAttachment.getUrl();
            if (!this.downloadingHistory.contains(url)) {
                this.downloadingHistory.add(url);
                this.attachmentIo.downloadAttachment(url, new HttpCallback(request, requestAttachment, abstractC44415lI6));
            }
        }
    }

    /* loaded from: classes8.dex */
    public static class AttachmentDownloaderSelector {
        public List<AttachmentDownloader.Request> selectData(StateConversation stateConversation) {
            boolean z;
            StateIdMapper attachmentIdMapper = stateConversation.getAttachmentIdMapper();
            String localId = stateConversation.getLocalId();
            List<StateMessage> messages = stateConversation.getMessages();
            LinkedList linkedList = new LinkedList();
            for (StateMessage stateMessage : messages) {
                for (StateRequestAttachment stateRequestAttachment : stateMessage.getAttachments()) {
                    long id = stateRequestAttachment.getId();
                    if (stateRequestAttachment.getLocalFile() != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean hasRemoteId = attachmentIdMapper.hasRemoteId(Long.valueOf(id));
                    boolean m27273b = C44504lS5.m27273b(stateRequestAttachment.getUrl());
                    if (!z && hasRemoteId && m27273b) {
                        linkedList.add(new AttachmentDownloader.Request(localId, attachmentIdMapper.getRemoteId(Long.valueOf(id)).longValue(), stateRequestAttachment));
                    }
                }
            }
            return linkedList;
        }
    }

    /* loaded from: classes8.dex */
    public class DownloadCallback extends AbstractC44415lI6<MediaResult> {
        private final StateRequestAttachment requestAttachment;

        public DownloadCallback(StateRequestAttachment stateRequestAttachment) {
            this.requestAttachment = stateRequestAttachment;
        }

        @Override // p000.AbstractC44415lI6
        public void onError(InterfaceC48782sg1 interfaceC48782sg1) {
            C33694Ix2.m101457b("RequestActivity", "Unable to download attachment. Error: %s", interfaceC48782sg1.mo9891c());
        }

        @Override // p000.AbstractC44415lI6
        public void onSuccess(MediaResult mediaResult) {
            AttachmentDownloaderComponent.this.dispatcher.dispatch(AttachmentDownloaderComponent.this.actionFactory.attachmentDownloaded(this.requestAttachment, mediaResult));
        }
    }

    public AttachmentDownloaderComponent(Dispatcher dispatcher, ActionFactory actionFactory, AttachmentDownloader attachmentDownloader) {
        this.dispatcher = dispatcher;
        this.actionFactory = actionFactory;
        this.attachmentDownloader = attachmentDownloader;
    }

    @Override // zendesk.support.suas.Listener
    public void update(StateConversation stateConversation) {
        for (AttachmentDownloader.Request request : this.selector.selectData(stateConversation)) {
            this.attachmentDownloader.download(request, new DownloadCallback(request.getRequestAttachment()));
        }
    }
}
