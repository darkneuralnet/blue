package zendesk.support;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import zendesk.core.ActionHandler;
import zendesk.core.ActionHandlerRegistry;
/* loaded from: classes8.dex */
public class DeepLinkingBroadcastReceiver extends BroadcastReceiver {
    public static final String EXTRA_BACK_STACK_ACTIVITIES = "extra_follow_up_activities";
    public static final String EXTRA_REQUEST_INTENT = "extra_request_intent";
    private static final String LOG_TAG = "DeepLinkingBroadcastReceiver";
    ActionHandlerRegistry registry;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        SdkDependencyProvider sdkDependencyProvider = SdkDependencyProvider.INSTANCE;
        if (!sdkDependencyProvider.isInitialized()) {
            C33694Ix2.m101454e(LOG_TAG, "Cannot use Support SDK without initializing Zendesk. Call Zendesk.INSTANCE.init(...) and Support.INSTANCE.init(Zendesk)", new Object[0]);
            return;
        }
        sdkDependencyProvider.provideSupportSdkComponent().inject(this);
        Intent intent2 = (Intent) intent.getParcelableExtra(EXTRA_REQUEST_INTENT);
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra(EXTRA_BACK_STACK_ACTIVITIES);
        ActionHandler handlerByAction = this.registry.handlerByAction("request_view_conversation");
        if (handlerByAction != null) {
            handlerByAction.handle(DeepLinkToRequestActionHandler.data(intent2, parcelableArrayListExtra), context);
        }
    }
}
