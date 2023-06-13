package zendesk.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes8.dex */
public class MessagingConfiguration implements InterfaceC40057dx0 {
    private AgentDetails botAgentDetails;
    private final int botAvatarDrawable;
    private final String botLabelString;
    private final int botLabelStringRes;
    private final List<InterfaceC40057dx0> configurations;
    private final String engineRegistryKey;
    private final boolean multilineResponseOptionsEnabled;
    private final String toolbarTitle;
    private final int toolbarTitleRes;

    /* loaded from: classes8.dex */
    public static class Builder {
        private String botLabelString;
        private String toolbarTitle;
        private List<InterfaceC40057dx0> configurations = new ArrayList();
        private List<Engine> engines = new ArrayList();
        private int toolbarTitleRes = R$string.zui_toolbar_title;
        private int botLabelStringRes = R$string.zui_default_bot_name;
        private boolean multilineResponseOptionsEnabled = false;
        private int botAvatarDrawable = R$drawable.zui_avatar_bot_default;

        public InterfaceC40057dx0 config(Context context) {
            return new MessagingConfiguration(this, EngineListRegistry.INSTANCE.register(this.engines));
        }

        @SuppressLint({"RestrictedApi"})
        public Intent intent(Context context, List<InterfaceC40057dx0> list) {
            this.configurations = list;
            InterfaceC40057dx0 config = config(context);
            Intent intent = new Intent(context, MessagingActivity.class);
            C32054Bx0.m113273h().m113278c(intent, config);
            return intent;
        }

        public void show(Context context, List<InterfaceC40057dx0> list) {
            context.startActivity(intent(context, list));
        }

        public Builder withEngines(List<Engine> list) {
            this.engines = list;
            return this;
        }
    }

    private String getBotLabelString(Resources resources) {
        return C44504lS5.m27273b(this.botLabelString) ? this.botLabelString : resources.getString(this.botLabelStringRes);
    }

    public AgentDetails getBotAgentDetails(Resources resources) {
        if (this.botAgentDetails == null) {
            this.botAgentDetails = new AgentDetails(getBotLabelString(resources), "ANSWER_BOT", true, Integer.valueOf(this.botAvatarDrawable));
        }
        return this.botAgentDetails;
    }

    @Override // p000.InterfaceC40057dx0
    public List<InterfaceC40057dx0> getConfigurations() {
        return C32054Bx0.m113273h().m113280a(this.configurations, this);
    }

    public List<Engine> getEngines() {
        return EngineListRegistry.INSTANCE.retrieveEngineList(this.engineRegistryKey);
    }

    public String getToolbarTitle(Resources resources) {
        return C44504lS5.m27273b(this.toolbarTitle) ? this.toolbarTitle : resources.getString(this.toolbarTitleRes);
    }

    public boolean isMultilineResponseOptionsEnabled() {
        return this.multilineResponseOptionsEnabled;
    }

    private MessagingConfiguration(Builder builder, String str) {
        this.configurations = builder.configurations;
        this.engineRegistryKey = str;
        this.toolbarTitle = builder.toolbarTitle;
        this.toolbarTitleRes = builder.toolbarTitleRes;
        this.botLabelString = builder.botLabelString;
        this.botLabelStringRes = builder.botLabelStringRes;
        this.botAvatarDrawable = builder.botAvatarDrawable;
        this.multilineResponseOptionsEnabled = builder.multilineResponseOptionsEnabled;
    }
}
