package zendesk.support.request;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import zendesk.belvedere.MediaResult;
import zendesk.support.CommentResponse;
import zendesk.support.CommentsResponse;
import zendesk.support.Request;
import zendesk.support.RequestStatus;
import zendesk.support.request.ActionCreateComment;
import zendesk.support.request.StateConversation;
import zendesk.support.suas.Action;
import zendesk.support.suas.Reducer;
/* loaded from: classes8.dex */
class ReducerConversation extends Reducer<StateConversation> {
    @Override // zendesk.support.suas.Reducer
    public /* bridge */ /* synthetic */ StateConversation reduce(StateConversation stateConversation, Action action) {
        return reduce2(stateConversation, (Action<?>) action);
    }

    @Override // zendesk.support.suas.Reducer
    public StateConversation getInitialState() {
        return new StateConversation();
    }

    /* renamed from: reduce  reason: avoid collision after fix types in other method */
    public StateConversation reduce2(StateConversation stateConversation, Action<?> action) {
        String actionType = action.getActionType();
        actionType.hashCode();
        char c = 65535;
        switch (actionType.hashCode()) {
            case -1720252100:
                if (actionType.equals("REQUEST_CLOSED")) {
                    c = 0;
                    break;
                }
                break;
            case -1679314784:
                if (actionType.equals("CREATE_COMMENT_SUCCESS")) {
                    c = 1;
                    break;
                }
                break;
            case -1319777819:
                if (actionType.equals("CREATE_COMMENT_ERROR")) {
                    c = 2;
                    break;
                }
                break;
            case -1193398337:
                if (actionType.equals("LOAD_COMMENTS_UPDATE_SUCCESS")) {
                    c = 3;
                    break;
                }
                break;
            case -1049833133:
                if (actionType.equals("DELETE_MESSAGE")) {
                    c = 4;
                    break;
                }
                break;
            case -903772976:
                if (actionType.equals("CREATE_REQUEST_SUCCESS")) {
                    c = 5;
                    break;
                }
                break;
            case -16010570:
                if (actionType.equals("LOAD_COMMENTS_INITIAL_SUCCESS")) {
                    c = 6;
                    break;
                }
                break;
            case 207206879:
                if (actionType.equals("START_CONFIG")) {
                    c = 7;
                    break;
                }
                break;
            case 397298627:
                if (actionType.equals("ATTACHMENT_DOWNLOADED")) {
                    c = '\b';
                    break;
                }
                break;
            case 619382558:
                if (actionType.equals("CLEAR_MESSAGES")) {
                    c = '\t';
                    break;
                }
                break;
            case 962828474:
                if (actionType.equals("LOAD_REQUEST_SUCCESS")) {
                    c = '\n';
                    break;
                }
                break;
            case 1532422677:
                if (actionType.equals("CREATE_REQUEST_ERROR")) {
                    c = 11;
                    break;
                }
                break;
            case 1712998531:
                if (actionType.equals("LOAD_COMMENTS_FROM_CACHE_SUCCESS")) {
                    c = '\f';
                    break;
                }
                break;
            case 1921186300:
                if (actionType.equals("CREATE_COMMENT")) {
                    c = '\r';
                    break;
                }
                break;
            case 2066480684:
                if (actionType.equals("CREATE_REQUEST")) {
                    c = 14;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return stateConversation.newBuilder().setStatus(RequestStatus.Closed).build();
            case 1:
            case 5:
                ActionCreateComment.CreateCommentResult createCommentResult = (ActionCreateComment.CreateCommentResult) action.getData();
                StateIdMapper addIdMapping = stateConversation.getMessageIdMapper().addIdMapping(Long.valueOf(createCommentResult.getCommentRemoteId()), Long.valueOf(createCommentResult.getMessage().getId()));
                StateIdMapper attachmentIdMapper = stateConversation.getAttachmentIdMapper();
                for (Map.Entry<Long, Long> entry : createCommentResult.getLocalToRemoteAttachments().getLocalToRemoteIdMap().entrySet()) {
                    attachmentIdMapper = attachmentIdMapper.addIdMapping(entry.getValue(), entry.getKey());
                }
                return stateConversation.newBuilder().setRemoteId(createCommentResult.getRequestId()).setMessageIdMapper(addIdMapping).setAttachmentIdMapper(attachmentIdMapper).setMessages(StateMessageMergeUtil.mergeMessages(stateConversation.getMessages(), Collections.singletonList(createCommentResult.getMessage()))).build();
            case 2:
            case 11:
                return stateConversation.newBuilder().setMessages(StateMessageMergeUtil.mergeMessages(stateConversation.getMessages(), Collections.singletonList((StateMessage) action.getData()))).build();
            case 3:
            case 6:
                C48526sE3 c48526sE3 = (C48526sE3) action.getData();
                List<CommentResponse> comments = ((CommentsResponse) c48526sE3.f108491a).getComments();
                Collections.reverse(comments);
                C48526sE3<Map<Long, StateRequestAttachment>, StateIdMapper> convert = StateRequestAttachment.convert(comments, (Map) c48526sE3.f108492b, stateConversation.getAttachmentIdMapper());
                C48526sE3<List<StateMessage>, StateIdMapper> convert2 = StateMessage.convert(comments, stateConversation.getMessageIdMapper(), convert.f108491a);
                return stateConversation.newBuilder().setMessages(StateMessageMergeUtil.mergeMessages(stateConversation.getMessages(), convert2.f108491a)).setAttachmentIdMapper(convert.f108492b.copy()).setMessageIdMapper(convert2.f108492b.copy()).setUsers(StateMessageMergeUtil.mergeUsers(stateConversation.getUsers(), StateRequestUser.convert(((CommentsResponse) c48526sE3.f108491a).getUsers()))).build();
            case 4:
                return stateConversation.newBuilder().setMessages(StateMessageMergeUtil.removeMessageById(((StateMessage) action.getData()).getId(), stateConversation.getMessages())).build();
            case 7:
                RequestConfiguration requestConfiguration = (RequestConfiguration) action.getData();
                return stateConversation.newBuilder().setLocalId(requestConfiguration.getLocalRequestId()).setRemoteId(requestConfiguration.getRequestId()).setStatus(requestConfiguration.getRequestStatus()).setHasAgentReplies(requestConfiguration.hasAgentReplies()).build();
            case '\b':
                C48526sE3 c48526sE32 = (C48526sE3) action.getData();
                MediaResult mediaResult = (MediaResult) c48526sE32.f108492b;
                StateRequestAttachment build = ((StateRequestAttachment) c48526sE32.f108491a).newBuilder().setLocalFile(mediaResult.m785c()).setLocalUri(mediaResult.m779j().toString()).build();
                List<StateMessage> messages = stateConversation.getMessages();
                ArrayList arrayList = new ArrayList(messages.size());
                for (StateMessage stateMessage : messages) {
                    arrayList.add(stateMessage.withUpdatedAttachment(build));
                }
                return stateConversation.newBuilder().setMessages(arrayList).build();
            case '\t':
                return stateConversation.newBuilder().setMessages(Collections.emptyList()).setMessageIdMapper(new StateIdMapper()).setAttachmentIdMapper(new StateIdMapper()).build();
            case '\n':
                Request request = (Request) action.getData();
                return stateConversation.newBuilder().setStatus(request.getStatus()).setHasAgentReplies(C43505jm0.m29948i(request.getLastCommentingAgents())).build();
            case '\f':
                StateConversation stateConversation2 = (StateConversation) action.getData();
                return stateConversation.newBuilder().setMessages(stateConversation2.getMessages()).setAttachmentIdMapper(stateConversation2.getAttachmentIdMapper()).setMessageIdMapper(stateConversation2.getMessageIdMapper()).setUsers(stateConversation2.getUsers()).build();
            case '\r':
            case 14:
                StateConversation.Builder newBuilder = stateConversation.newBuilder();
                List<StateMessage> m29954c = C43505jm0.m29954c(stateConversation.getMessages());
                m29954c.add((StateMessage) action.getData());
                return newBuilder.setMessages(m29954c).build();
            default:
                return null;
        }
    }
}
