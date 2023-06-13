package zendesk.messaging;

import java.io.Serializable;
/* loaded from: classes8.dex */
public class AgentDetails implements Serializable {
    private final String agentId;
    private final String agentName;
    private final Integer avatarDrawableRes;
    private final String avatarPath;
    private final boolean isBot;

    public AgentDetails(String str, String str2, boolean z) {
        this(str, str2, z, null, null);
    }

    public String getAgentId() {
        return this.agentId;
    }

    public String getAgentName() {
        return this.agentName;
    }

    public Integer getAvatarDrawableRes() {
        return this.avatarDrawableRes;
    }

    public String getAvatarPath() {
        return this.avatarPath;
    }

    public boolean isBot() {
        return this.isBot;
    }

    public AgentDetails(String str, String str2, boolean z, Integer num) {
        this(str, str2, z, num, null);
    }

    private AgentDetails(String str, String str2, boolean z, Integer num, String str3) {
        this.agentName = str;
        this.agentId = str2;
        this.isBot = z;
        this.avatarDrawableRes = num;
        this.avatarPath = str3;
    }
}
