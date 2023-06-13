package zendesk.support;

import java.util.ArrayList;
import java.util.List;
import zendesk.core.AuthenticationType;
/* loaded from: classes8.dex */
public class SupportSdkSettings {
    private final AuthenticationType authenticationType;
    private final HelpCenterSettings helpCenterSettings;
    private final SupportSettings mobileSettings;

    public SupportSdkSettings(SupportSettings supportSettings, HelpCenterSettings helpCenterSettings, AuthenticationType authenticationType) {
        this.mobileSettings = supportSettings;
        this.helpCenterSettings = helpCenterSettings;
        this.authenticationType = authenticationType;
    }

    private AttachmentSettings getAttachmentSettings() {
        boolean z;
        SupportSettings supportSettings = this.mobileSettings;
        if (supportSettings != null && supportSettings.getAttachments() != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return this.mobileSettings.getAttachments();
        }
        return null;
    }

    private ConversationsSettings getConversationsSettings() {
        boolean z;
        SupportSettings supportSettings = this.mobileSettings;
        if (supportSettings != null && supportSettings.getConversations() != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return this.mobileSettings.getConversations();
        }
        return null;
    }

    public AuthenticationType getAuthenticationType() {
        return this.authenticationType;
    }

    public List<String> getContactZendeskTags() {
        boolean z;
        SupportSettings supportSettings = this.mobileSettings;
        if (supportSettings != null && supportSettings.getContactUs() != null && C43505jm0.m29948i(this.mobileSettings.getContactUs().getTags())) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return this.mobileSettings.getContactUs().getTags();
        }
        return new ArrayList();
    }

    public String getHelpCenterLocale() {
        boolean z;
        HelpCenterSettings helpCenterSettings = this.helpCenterSettings;
        if (helpCenterSettings != null && helpCenterSettings.getLocale() != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return this.helpCenterSettings.getLocale();
        }
        return "";
    }

    public long getMaxAttachmentSize() {
        AttachmentSettings attachmentSettings = getAttachmentSettings();
        if (attachmentSettings != null) {
            return attachmentSettings.getMaxAttachmentSize();
        }
        return 0L;
    }

    public String getReferrerUrl() {
        SupportSettings supportSettings = this.mobileSettings;
        if (supportSettings != null && C44504lS5.m27273b(supportSettings.getReferrerUrl())) {
            return this.mobileSettings.getReferrerUrl();
        }
        return "https://www.zendesk.com/embeddables";
    }

    public String getRequestSystemMessage() {
        SupportSettings supportSettings = this.mobileSettings;
        if (supportSettings != null && C44504lS5.m27273b(supportSettings.getSystemMessage())) {
            return this.mobileSettings.getSystemMessage();
        }
        return "";
    }

    public boolean hasHelpCenterSettings() {
        return this.helpCenterSettings != null;
    }

    public boolean isAttachmentsEnabled() {
        AttachmentSettings attachmentSettings = getAttachmentSettings();
        if (attachmentSettings != null && attachmentSettings.isEnabled()) {
            return true;
        }
        return false;
    }

    public boolean isConversationsEnabled() {
        ConversationsSettings conversationsSettings = getConversationsSettings();
        if (conversationsSettings != null && conversationsSettings.isEnabled()) {
            return true;
        }
        return false;
    }

    public boolean isHelpCenterArticleVotingEnabled() {
        return hasHelpCenterSettings() && this.helpCenterSettings.isArticleVotingEnabled();
    }

    public boolean isHelpCenterEnabled() {
        HelpCenterSettings helpCenterSettings = this.helpCenterSettings;
        return helpCenterSettings != null && helpCenterSettings.isEnabled();
    }

    public boolean isNeverAskForEmailEnabled() {
        SupportSettings supportSettings = this.mobileSettings;
        return supportSettings == null || supportSettings.isNeverRequestEmailOn();
    }

    public boolean isShowClosedRequests() {
        SupportSettings supportSettings = this.mobileSettings;
        return supportSettings == null || supportSettings.isShowClosedRequests();
    }

    public boolean isShowReferrerLogoEnabled() {
        SupportSettings supportSettings = this.mobileSettings;
        return supportSettings != null && supportSettings.isShowReferrerLogo();
    }

    public boolean isTicketFormSupportAvailable() {
        boolean z;
        SupportSettings supportSettings = this.mobileSettings;
        if (supportSettings != null && supportSettings.getTicketForms() != null) {
            z = true;
        } else {
            z = false;
        }
        if (z && this.mobileSettings.getTicketForms().isAvailable()) {
            return true;
        }
        return false;
    }
}
