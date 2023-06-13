package zendesk.support.request;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import zendesk.support.SupportSdkSettings;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class StateSettings implements Serializable {
    private final boolean attachmentsEnabled;
    private final boolean conversationsEnabled;
    private final boolean hasIdentityEmailAddress;
    private final boolean hasIdentityName;
    private final long maxAttachmentSize;
    private final boolean neverRequestEmail;
    private final String referrerUrl;
    private final boolean settingsLoaded;
    private final boolean showZendeskLogo;
    private final String systemMessage;

    public StateSettings(boolean z, boolean z2, long j, boolean z3, boolean z4, boolean z5, boolean z6, String str, String str2) {
        this.settingsLoaded = true;
        this.conversationsEnabled = z;
        this.attachmentsEnabled = z2;
        this.maxAttachmentSize = j;
        this.neverRequestEmail = z3;
        this.hasIdentityEmailAddress = z4;
        this.hasIdentityName = z5;
        this.showZendeskLogo = z6;
        this.referrerUrl = str;
        this.systemMessage = str2;
    }

    public static StateSettings fromSupportSettings(SupportSdkSettings supportSdkSettings, boolean z, boolean z2) {
        return new StateSettings(supportSdkSettings.isConversationsEnabled(), supportSdkSettings.isAttachmentsEnabled(), supportSdkSettings.getMaxAttachmentSize(), supportSdkSettings.isNeverAskForEmailEnabled(), z, z2, supportSdkSettings.isShowReferrerLogoEnabled(), supportSdkSettings.getReferrerUrl(), supportSdkSettings.getRequestSystemMessage());
    }

    public long getMaxAttachmentSize() {
        return this.maxAttachmentSize;
    }

    public String getReferrerUrl() {
        return this.referrerUrl;
    }

    public String getSystemMessage() {
        return this.systemMessage;
    }

    public boolean hasIdentityEmailAddress() {
        return this.hasIdentityEmailAddress;
    }

    public boolean hasIdentityName() {
        return this.hasIdentityName;
    }

    public boolean hasSettings() {
        return this.settingsLoaded;
    }

    public boolean isAttachmentsEnabled() {
        return this.attachmentsEnabled;
    }

    public boolean isConversationsEnabled() {
        return this.conversationsEnabled;
    }

    public boolean isNeverRequestEmailOn() {
        return this.neverRequestEmail;
    }

    public boolean isShowZendeskLogo() {
        return this.showZendeskLogo;
    }

    public String toString() {
        return "Settings{settingsLoaded=" + this.settingsLoaded + ", conversationsEnabled=" + this.conversationsEnabled + ", attachmentsEnabled=" + this.attachmentsEnabled + ", maxAttachmentSize=" + this.maxAttachmentSize + ", neverRequestEmail=" + this.neverRequestEmail + ", hasIdentityEmailAddress=" + this.hasIdentityEmailAddress + ", hasIdentityName=" + this.hasIdentityName + ", referrerUrl=" + this.referrerUrl + ", systemMessage=" + this.systemMessage + CoreConstants.CURLY_RIGHT;
    }

    public StateSettings() {
        this.settingsLoaded = false;
        this.conversationsEnabled = false;
        this.attachmentsEnabled = false;
        this.maxAttachmentSize = -1L;
        this.neverRequestEmail = true;
        this.hasIdentityEmailAddress = false;
        this.hasIdentityName = false;
        this.showZendeskLogo = true;
        this.referrerUrl = "";
        this.systemMessage = "";
    }
}
