package zendesk.support;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.List;
import java.util.Map;
import zendesk.core.ActionDescription;
import zendesk.core.ActionHandler;
import zendesk.core.Zendesk;
import zendesk.support.request.RequestActivity;
/* loaded from: classes8.dex */
public final class CreateRequestActionHandler implements ActionHandler {
    private static final String LOG_TAG = "CreateRequestActionHandler";
    private final Context context;

    public CreateRequestActionHandler(Context context) {
        this.context = context;
    }

    private static boolean isInitialized() {
        if (Support.INSTANCE.isInitialized() && Zendesk.INSTANCE.isInitialized()) {
            return true;
        }
        C33694Ix2.m101447l(LOG_TAG, "Support SDK contact handler returning false because Support.init(..) or Zendesk.init(..) has not been called!", new Object[0]);
        return false;
    }

    @Override // zendesk.core.ActionHandler
    public boolean canHandle(String str) {
        return isInitialized() && "action_contact_option".equals(str);
    }

    @SuppressLint({"RestrictedApi"})
    public List<InterfaceC40057dx0> extractConfigs(Map<String, Object> map) {
        InterfaceC40057dx0 m108193f = C32756Ex0.m108193f(map, InterfaceC40057dx0.class);
        if (m108193f != null) {
            return m108193f.getConfigurations();
        }
        return null;
    }

    @Override // zendesk.core.ActionHandler
    public ActionDescription getActionDescription() {
        String string = this.context.getString(C41720gl4.zs_request_contact_option_leave_a_message);
        return new ActionDescription(string, string, C32373Dg4.zs_contact_leave_message);
    }

    @Override // zendesk.core.ActionHandler
    public int getPriority() {
        return 0;
    }

    @Override // zendesk.core.ActionHandler
    @SuppressLint({"RestrictedApi"})
    public void handle(Map<String, Object> map, Context context) {
        if (isInitialized()) {
            List<InterfaceC40057dx0> extractConfigs = extractConfigs(map);
            if (extractConfigs != null) {
                RequestActivity.builder().show(context, extractConfigs);
            } else {
                RequestActivity.builder().show(context, new InterfaceC40057dx0[0]);
            }
        }
    }

    @Override // zendesk.core.ActionHandler
    public void updateSettings(Map<String, AbstractC52360yi2> map) {
    }
}
