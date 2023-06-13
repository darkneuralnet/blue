package zendesk.messaging;
/* loaded from: classes8.dex */
public class AttachmentSettings {
    private final long maxFileSize;
    private final boolean sendingEnabled;

    public AttachmentSettings(long j, boolean z) {
        this.maxFileSize = j;
        this.sendingEnabled = z;
    }

    public long getMaxFileSize() {
        return this.maxFileSize;
    }

    public boolean isSendingEnabled() {
        return this.sendingEnabled;
    }
}
