package zendesk.support;

import java.util.List;
/* loaded from: classes8.dex */
public class CommentsResponse extends ResponseWrapper {
    private List<CommentResponse> comments;
    private List<Object> organizations;
    private List<User> users;

    public List<CommentResponse> getComments() {
        return C43505jm0.m29954c(this.comments);
    }

    public List<Object> getOrganizations() {
        return C43505jm0.m29954c(this.organizations);
    }

    public List<User> getUsers() {
        return C43505jm0.m29954c(this.users);
    }
}
