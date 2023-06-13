package zendesk.support;

import java.util.Collections;
import java.util.List;
/* loaded from: classes8.dex */
class ContactUsSettings {
    private static ContactUsSettings DEFAULT = new ContactUsSettings(Collections.emptyList());
    private List<String> tags;

    public ContactUsSettings(List<String> list) {
        this.tags = list;
    }

    public static ContactUsSettings defaultSettings() {
        return DEFAULT;
    }

    public List<String> getTags() {
        return C43505jm0.m29954c(this.tags);
    }

    public ContactUsSettings() {
    }
}
