package zendesk.support;
/* loaded from: classes8.dex */
class ConversationsSettings {
    private static ConversationsSettings DEFAULT = new ConversationsSettings(false);
    private boolean enabled;

    public ConversationsSettings(boolean z) {
        this.enabled = z;
    }

    public static ConversationsSettings defaultSettings() {
        return DEFAULT;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public ConversationsSettings() {
    }
}
