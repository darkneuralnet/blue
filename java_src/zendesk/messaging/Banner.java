package zendesk.messaging;
/* loaded from: classes8.dex */
public class Banner {
    private final String label;
    private final Position position;

    /* loaded from: classes8.dex */
    public enum Position {
        BOTTOM
    }

    public String getLabel() {
        return this.label;
    }

    public Position getPosition() {
        return this.position;
    }
}
