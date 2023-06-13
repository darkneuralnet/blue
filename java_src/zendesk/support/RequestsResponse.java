package zendesk.support;

import java.util.List;
/* loaded from: classes8.dex */
class RequestsResponse extends ResponseWrapper {
    private List<User> lastCommentingAgents;
    private List<Request> requests;

    public List<User> getLastCommentingAgents() {
        return C43505jm0.m29954c(this.lastCommentingAgents);
    }

    public List<Request> getRequests() {
        return C43505jm0.m29954c(this.requests);
    }
}
