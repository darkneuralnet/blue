package zendesk.support;

import android.content.Context;
import java.util.Map;
import zendesk.core.ActionDescription;
import zendesk.core.ActionHandler;
import zendesk.support.requestlist.RequestListActivity;
import zendesk.support.requestlist.RequestListConfiguration;
/* loaded from: classes8.dex */
class RequestListActionHandler implements ActionHandler {
    private boolean conversationsEnabled;
    private final C46153oE1 gson = new C46746pE1().m19808b();

    @Override // zendesk.core.ActionHandler
    public boolean canHandle(String str) {
        if (str.equals("action_conversation_list") && this.conversationsEnabled) {
            return true;
        }
        return false;
    }

    @Override // zendesk.core.ActionHandler
    public ActionDescription getActionDescription() {
        return null;
    }

    @Override // zendesk.core.ActionHandler
    public int getPriority() {
        return 0;
    }

    @Override // zendesk.core.ActionHandler
    public void handle(Map<String, Object> map, Context context) {
        RequestListActivity.builder().show(context, (RequestListConfiguration) C32756Ex0.m108193f(map, RequestListConfiguration.class));
    }

    @Override // zendesk.core.ActionHandler
    public void updateSettings(Map<String, AbstractC52360yi2> map) {
        AbstractC52360yi2 abstractC52360yi2;
        if (map == null) {
            abstractC52360yi2 = null;
        } else {
            abstractC52360yi2 = map.get("support");
        }
        SupportSettings supportSettings = (SupportSettings) this.gson.m21561h(abstractC52360yi2, SupportSettings.class);
        if (supportSettings != null) {
            this.conversationsEnabled = supportSettings.getConversations().isEnabled();
        }
    }
}
