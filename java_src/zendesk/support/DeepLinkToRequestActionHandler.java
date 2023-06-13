package zendesk.support;

import android.content.Context;
import android.content.Intent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import zendesk.core.ActionDescription;
import zendesk.core.ActionHandler;
import zendesk.support.requestlist.RequestListActivity;
/* loaded from: classes8.dex */
class DeepLinkToRequestActionHandler implements ActionHandler {
    private static final String BACK_STACK_ACTIVITIES = "back_stack_activities";
    private static final String REQUEST_INTENT = "request_ui_config";
    static final String REQUEST_VIEW_CONVERSATION = "request_view_conversation";

    public static Map<String, Object> data(Intent intent, List<Intent> list) {
        HashMap hashMap = new HashMap();
        hashMap.put(REQUEST_INTENT, intent);
        hashMap.put(BACK_STACK_ACTIVITIES, list);
        return hashMap;
    }

    @Override // zendesk.core.ActionHandler
    public boolean canHandle(String str) {
        return str.equals(REQUEST_VIEW_CONVERSATION);
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
        BZ5 m113853h = BZ5.m113853h(context);
        if (map != null) {
            for (Intent intent : (List) map.get(BACK_STACK_ACTIVITIES)) {
                m113853h.m113857b(intent);
            }
        }
        m113853h.m113857b(RequestListActivity.builder().intent(context, new InterfaceC40057dx0[0]));
        if (map != null) {
            m113853h.m113857b((Intent) map.get(REQUEST_INTENT));
        }
        m113853h.m113850s();
    }

    @Override // zendesk.core.ActionHandler
    public void updateSettings(Map<String, AbstractC52360yi2> map) {
    }
}
