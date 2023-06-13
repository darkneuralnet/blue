package zendesk.messaging;
/* loaded from: classes8.dex */
public class Typing {
    private final AgentDetails agentDetails;
    private final boolean isTyping;

    public Typing(boolean z) {
        this(z, null);
    }

    public AgentDetails getAgentDetails() {
        return this.agentDetails;
    }

    public boolean isTyping() {
        return this.isTyping;
    }

    public Typing(boolean z, AgentDetails agentDetails) {
        this.isTyping = z;
        this.agentDetails = agentDetails;
    }
}
