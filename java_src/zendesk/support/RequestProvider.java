package zendesk.support;

import java.util.Date;
import java.util.List;
/* loaded from: classes8.dex */
public interface RequestProvider {
    void addComment(String str, EndUserComment endUserComment, AbstractC44415lI6<Comment> abstractC44415lI6);

    void createRequest(CreateRequest createRequest, AbstractC44415lI6<Request> abstractC44415lI6);

    void getAllRequests(AbstractC44415lI6<List<Request>> abstractC44415lI6);

    void getComments(String str, AbstractC44415lI6<CommentsResponse> abstractC44415lI6);

    void getCommentsSince(String str, Date date, boolean z, AbstractC44415lI6<CommentsResponse> abstractC44415lI6);

    void getRequest(String str, AbstractC44415lI6<Request> abstractC44415lI6);

    void getRequests(String str, AbstractC44415lI6<List<Request>> abstractC44415lI6);

    void getTicketFormsById(List<Long> list, AbstractC44415lI6<List<TicketForm>> abstractC44415lI6);

    void getUpdatesForDevice(AbstractC44415lI6<RequestUpdates> abstractC44415lI6);

    void markRequestAsRead(String str, int i);

    void markRequestAsUnread(String str);
}
