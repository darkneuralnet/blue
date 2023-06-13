package zendesk.support.request;

import java.util.ArrayList;
import java.util.List;
import zendesk.support.Comment;
import zendesk.support.CreateRequest;
import zendesk.support.EndUserComment;
import zendesk.support.Request;
import zendesk.support.RequestProvider;
import zendesk.support.request.AsyncMiddleware;
import zendesk.support.request.AttachmentUploadService;
import zendesk.support.suas.Dispatcher;
import zendesk.support.suas.GetState;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class ActionCreateComment implements AsyncMiddleware.AsyncAction {

    /* renamed from: af */
    private final ActionFactory f121967af;
    private AbstractC44415lI6<AttachmentUploadService.AttachmentUploadResult> attachmentCallback;
    private final AttachmentUploadService attachmentUploader;
    private final StateMessage message;
    private final RequestProvider requestProvider;

    /* loaded from: classes8.dex */
    public static class CreateCommentResult {
        private final long commentRemoteId;
        private final AttachmentUploadService.AttachmentUploadResult localToRemoteAttachments;
        private final StateMessage message;
        private final String requestId;

        public CreateCommentResult(StateMessage stateMessage, String str, long j, AttachmentUploadService.AttachmentUploadResult attachmentUploadResult) {
            this.message = stateMessage;
            this.requestId = str;
            this.commentRemoteId = j;
            this.localToRemoteAttachments = attachmentUploadResult;
        }

        public long getCommentRemoteId() {
            return this.commentRemoteId;
        }

        public AttachmentUploadService.AttachmentUploadResult getLocalToRemoteAttachments() {
            return this.localToRemoteAttachments;
        }

        public StateMessage getMessage() {
            return this.message;
        }

        public String getRequestId() {
            return this.requestId;
        }
    }

    public ActionCreateComment(ActionFactory actionFactory, RequestProvider requestProvider, AttachmentUploadService attachmentUploadService, StateMessage stateMessage) {
        this.f121967af = actionFactory;
        this.requestProvider = requestProvider;
        this.message = stateMessage;
        this.attachmentUploader = attachmentUploadService;
    }

    private void addComment(final AsyncMiddleware.Callback callback, final Dispatcher dispatcher, final StateConversation stateConversation, final AttachmentUploadService.AttachmentUploadResult attachmentUploadResult) {
        EndUserComment endUserComment = new EndUserComment();
        endUserComment.setValue(this.message.getBody());
        endUserComment.setAttachments(getAttachmentToken(attachmentUploadResult.getRequestAttachments()));
        final String remoteId = stateConversation.getRemoteId();
        this.requestProvider.addComment(remoteId, endUserComment, new AbstractC44415lI6<Comment>() { // from class: zendesk.support.request.ActionCreateComment.2
            @Override // p000.AbstractC44415lI6
            public void onError(InterfaceC48782sg1 interfaceC48782sg1) {
                C33694Ix2.m101447l("RequestActivity", "Unable to add comment to request. Error: '%s'. Message Id: %d", interfaceC48782sg1.mo9891c(), Long.valueOf(ActionCreateComment.this.message.getId()));
                if (interfaceC48782sg1.mo9890d() && interfaceC48782sg1.getStatus() == 422) {
                    C33694Ix2.m101447l("RequestActivity", "This request (%s) is closed. Error: '%s'. Message Id: %d", remoteId, interfaceC48782sg1.mo9891c(), Long.valueOf(ActionCreateComment.this.message.getId()));
                    dispatcher.dispatch(ActionCreateComment.this.f121967af.requestClosed());
                }
                dispatcher.dispatch(ActionCreateComment.this.f121967af.createCommentError(interfaceC48782sg1, ActionCreateComment.this.message.withError(interfaceC48782sg1)));
                callback.done();
            }

            @Override // p000.AbstractC44415lI6
            public void onSuccess(Comment comment) {
                dispatcher.dispatch(ActionCreateComment.this.f121967af.createCommentSuccess(new CreateCommentResult(ActionCreateComment.this.message.withAttachments(attachmentUploadResult.getRequestAttachments()).withDelivered(), remoteId, comment.getId().longValue(), attachmentUploadResult)));
                ActionCreateComment.this.requestProvider.markRequestAsRead(remoteId, stateConversation.getMessageIdMapper().getRemoteIds().size());
                callback.done();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createMessage(StateConversation stateConversation, StateConfig stateConfig, Dispatcher dispatcher, AsyncMiddleware.Callback callback, AttachmentUploadService.AttachmentUploadResult attachmentUploadResult) {
        if (C44504lS5.m27273b(stateConversation.getRemoteId())) {
            C33694Ix2.m101457b("RequestActivity", "Adding a comment to an existing request. Message Id %s", Long.valueOf(this.message.getId()));
            addComment(callback, dispatcher, stateConversation, attachmentUploadResult);
            return;
        }
        C33694Ix2.m101457b("RequestActivity", "Creating a new request. Message Id %s", Long.valueOf(this.message.getId()));
        createRequest(callback, dispatcher, attachmentUploadResult, stateConfig);
    }

    private void createRequest(final AsyncMiddleware.Callback callback, final Dispatcher dispatcher, final AttachmentUploadService.AttachmentUploadResult attachmentUploadResult, StateConfig stateConfig) {
        CreateRequest createRequest = new CreateRequest();
        createRequest.setDescription(this.message.getBody());
        createRequest.setAttachments(getAttachmentToken(attachmentUploadResult.getRequestAttachments()));
        if (C43505jm0.m29948i(stateConfig.getTags())) {
            createRequest.setTags(stateConfig.getTags());
        }
        if (C44504lS5.m27273b(stateConfig.getSubject())) {
            createRequest.setSubject(stateConfig.getSubject());
        }
        if (stateConfig.getTicketForm() != null) {
            if (stateConfig.getTicketForm().getId() != -1) {
                createRequest.setTicketFormId(Long.valueOf(stateConfig.getTicketForm().getId()));
            }
            createRequest.setCustomFields(stateConfig.getTicketForm().getTicketFieldsForApi());
        }
        this.requestProvider.createRequest(createRequest, new AbstractC44415lI6<Request>() { // from class: zendesk.support.request.ActionCreateComment.3
            @Override // p000.AbstractC44415lI6
            public void onError(InterfaceC48782sg1 interfaceC48782sg1) {
                dispatcher.dispatch(ActionCreateComment.this.f121967af.createRequestError(interfaceC48782sg1, ActionCreateComment.this.message.withError(interfaceC48782sg1)));
                callback.done();
            }

            @Override // p000.AbstractC44415lI6
            public void onSuccess(Request request) {
                dispatcher.dispatch(ActionCreateComment.this.f121967af.createRequestSuccess(new CreateCommentResult(ActionCreateComment.this.message.withAttachments(attachmentUploadResult.getRequestAttachments()).withDelivered(), request.getId(), request.getLastComment().getId().longValue(), attachmentUploadResult)));
                callback.done();
                if (request.getId() != null) {
                    ActionCreateComment.this.requestProvider.markRequestAsRead(request.getId(), 1);
                }
            }
        });
    }

    private List<String> getAttachmentToken(List<StateRequestAttachment> list) {
        ArrayList arrayList = new ArrayList();
        for (StateRequestAttachment stateRequestAttachment : list) {
            arrayList.add(stateRequestAttachment.getToken());
        }
        return arrayList;
    }

    private void waitForAttachments(final Dispatcher dispatcher, GetState getState, final AsyncMiddleware.Callback callback) {
        final StateConversation fromState = StateConversation.fromState(getState.getState());
        final StateConfig fromState2 = StateConfig.fromState(getState.getState());
        C33694Ix2.m101457b("RequestActivity", "Waiting for attachments to be uploaded. Message Id: %s", Long.valueOf(this.message.getId()));
        AbstractC44415lI6<AttachmentUploadService.AttachmentUploadResult> abstractC44415lI6 = new AbstractC44415lI6<AttachmentUploadService.AttachmentUploadResult>() { // from class: zendesk.support.request.ActionCreateComment.1
            @Override // p000.AbstractC44415lI6
            public void onError(InterfaceC48782sg1 interfaceC48782sg1) {
                C33694Ix2.m101447l("RequestActivity", "Attachment upload error. '%s'. Message Id: %s", interfaceC48782sg1.mo9891c(), Long.valueOf(ActionCreateComment.this.message.getId()));
                StateMessage withError = ActionCreateComment.this.message.withError(interfaceC48782sg1);
                if (C44504lS5.m27273b(fromState.getRemoteId())) {
                    dispatcher.dispatch(ActionCreateComment.this.f121967af.createCommentError(interfaceC48782sg1, withError));
                } else {
                    dispatcher.dispatch(ActionCreateComment.this.f121967af.createRequestError(interfaceC48782sg1, withError));
                }
                callback.done();
            }

            @Override // p000.AbstractC44415lI6
            public void onSuccess(AttachmentUploadService.AttachmentUploadResult attachmentUploadResult) {
                C33694Ix2.m101457b("RequestActivity", "Attachments resolved and uploaded. Message Id: %s", Long.valueOf(ActionCreateComment.this.message.getId()));
                ActionCreateComment.this.createMessage(fromState, fromState2, dispatcher, callback, attachmentUploadResult);
            }
        };
        this.attachmentCallback = abstractC44415lI6;
        this.attachmentUploader.setResultListener(abstractC44415lI6);
    }

    @Override // zendesk.support.request.AsyncMiddleware.AsyncAction
    public void actionQueued(Dispatcher dispatcher, GetState getState) {
        List<StateRequestAttachment> attachments = this.message.getAttachments();
        String localId = StateConversation.fromState(getState.getState()).getLocalId();
        if (C43505jm0.m29948i(attachments)) {
            C33694Ix2.m101457b("RequestActivity", "Start uploading %d attachments. Message Id: %s", Integer.valueOf(attachments.size()), Long.valueOf(this.message.getId()));
            this.attachmentUploader.start(localId);
        }
        dispatcher.dispatch(this.f121967af.createComment(this.message.withPending()));
    }

    @Override // zendesk.support.request.AsyncMiddleware.AsyncAction
    public void execute(Dispatcher dispatcher, GetState getState, AsyncMiddleware.Callback callback) {
        waitForAttachments(dispatcher, getState, callback);
    }
}
