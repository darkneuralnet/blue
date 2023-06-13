package zendesk.messaging;
/* loaded from: classes8.dex */
public class DialogContent {
    private final Config config;
    private final String message;
    private final Config previousConfig;
    private final String title;

    /* loaded from: classes8.dex */
    public enum Config {
        TRANSCRIPT_PROMPT,
        TRANSCRIPT_EMAIL
    }

    public Config getConfig() {
        return this.config;
    }

    public String getMessage() {
        return this.message;
    }

    public String getTitle() {
        return this.title;
    }

    public Config previousConfig() {
        return this.previousConfig;
    }
}
