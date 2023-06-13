package zendesk.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes8.dex */
public class User {

    /* renamed from: id */
    private final Long f121911id = -1L;
    private final String name = "";
    private final Attachment photo = null;
    private final boolean agent = false;
    private final List<String> tags = new ArrayList();
    private final Map<String, String> userFields = new HashMap();

    public Long getId() {
        return this.f121911id;
    }

    public String getName() {
        return this.name;
    }

    public String getPhoto() {
        Attachment attachment = this.photo;
        if (attachment == null) {
            return null;
        }
        return attachment.getContentUrl();
    }

    public List<String> getTags() {
        return C43505jm0.m29954c(this.tags);
    }

    public Map<String, String> getUserFields() {
        return C43505jm0.m29953d(this.userFields);
    }

    public boolean isAgent() {
        return this.agent;
    }
}
