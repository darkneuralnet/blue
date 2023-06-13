package zendesk.support;
/* loaded from: classes8.dex */
public class TicketFormSettings {
    private static TicketFormSettings DEFAULT = new TicketFormSettings(false);
    private boolean available;

    public TicketFormSettings(boolean z) {
        this.available = z;
    }

    public static TicketFormSettings defaultSettings() {
        return DEFAULT;
    }

    public boolean isAvailable() {
        return this.available;
    }
}
