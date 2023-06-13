package zendesk.messaging.p061ui;

import zendesk.messaging.AgentDetails;
/* renamed from: zendesk.messaging.ui.AvatarStateFactory */
/* loaded from: classes8.dex */
class AvatarStateFactory {
    public AvatarState createAvatarState(AgentDetails agentDetails) {
        String str;
        if (C44504lS5.m27273b(agentDetails.getAgentName())) {
            str = agentDetails.getAgentName().substring(0, 1);
        } else {
            str = "";
        }
        return new AvatarState(agentDetails.getAgentId(), str, agentDetails.getAvatarPath(), agentDetails.getAvatarDrawableRes());
    }
}
