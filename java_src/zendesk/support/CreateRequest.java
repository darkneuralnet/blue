package zendesk.support;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes8.dex */
public class CreateRequest {
    private static final transient String METADATA_SDK_KEY = "sdk";
    private Comment comment;
    private List<CustomField> customFields;

    /* renamed from: id */
    private String f121947id;
    private Map<String, Map<String, String>> metadata;
    private String subject;
    private List<String> tags;
    private Long ticketFormId;

    public List<String> getAttachments() {
        Comment comment = this.comment;
        if (comment == null) {
            return Collections.emptyList();
        }
        return comment.getAttachments();
    }

    public List<CustomField> getCustomFields() {
        return this.customFields;
    }

    public String getDescription() {
        Comment comment = this.comment;
        if (comment == null) {
            return null;
        }
        return comment.getBody();
    }

    public String getId() {
        return this.f121947id;
    }

    public String getSubject() {
        return this.subject;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public Long getTicketFormId() {
        return this.ticketFormId;
    }

    public void setAttachments(List<String> list) {
        if (this.comment == null) {
            this.comment = new Comment();
        }
        this.comment.setAttachments(list);
    }

    public void setCustomFields(List<CustomField> list) {
        this.customFields = list;
    }

    public void setDescription(String str) {
        if (this.comment == null) {
            this.comment = new Comment();
        }
        this.comment.setBody(str);
    }

    public void setId(String str) {
        this.f121947id = str;
    }

    public void setMetadata(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        this.metadata = hashMap;
        hashMap.put("sdk", map);
    }

    public void setSubject(String str) {
        this.subject = str;
    }

    public void setTags(List<String> list) {
        this.tags = list;
    }

    public void setTicketFormId(Long l) {
        this.ticketFormId = l;
    }
}
