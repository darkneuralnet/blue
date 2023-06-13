package zendesk.support;

import java.util.Date;
import java.util.List;
/* loaded from: classes8.dex */
public class Comment {
    @InterfaceC41208ft5("uploads")
    private List<String> attachments;
    private Long authorId;
    private String body;
    private Date createdAt;
    private String htmlBody;

    /* renamed from: id */
    private Long f121945id;
    @InterfaceC41208ft5("public")
    private boolean isPublic = true;
    private String requestId;
    private String url;

    public List<String> getAttachments() {
        return C43505jm0.m29954c(this.attachments);
    }

    public Long getAuthorId() {
        return this.authorId;
    }

    public String getBody() {
        return this.body;
    }

    public Date getCreatedAt() {
        if (this.createdAt == null) {
            return null;
        }
        return new Date(this.createdAt.getTime());
    }

    public String getHtmlBody() {
        return this.htmlBody;
    }

    public Long getId() {
        return this.f121945id;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isPublic() {
        return this.isPublic;
    }

    public void setAttachments(List<String> list) {
        this.attachments = list;
    }

    public void setAuthorId(Long l) {
        this.authorId = l;
    }

    public void setBody(String str) {
        this.body = str;
    }

    public void setCreatedAt(Date date) {
        this.createdAt = date;
    }
}
