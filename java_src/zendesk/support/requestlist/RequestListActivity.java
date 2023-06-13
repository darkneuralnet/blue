package zendesk.support.requestlist;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import zendesk.core.ActionHandler;
import zendesk.core.ActionHandlerRegistry;
import zendesk.support.SdkDependencyProvider;
import zendesk.support.requestlist.RequestListConfiguration;
/* loaded from: classes8.dex */
public class RequestListActivity extends AppCompatActivity {
    static final String LOG_TAG = "RequestListActivity";
    ActionHandlerRegistry actionHandlerRegistry;
    RequestListModel model;
    RequestListPresenter presenter;
    RequestListSyncHandler syncHandler;
    RequestListView view;

    public static RequestListConfiguration.Builder builder() {
        return new RequestListConfiguration.Builder();
    }

    public static void refresh(Context context, ActionHandlerRegistry actionHandlerRegistry) {
        ActionHandler handlerByAction = actionHandlerRegistry.handlerByAction("request_list_refresh");
        if (handlerByAction != null) {
            handlerByAction.handle(null, context);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z = true;
        getTheme().applyStyle(C52392yl4.ZendeskActivityDefaultTheme, true);
        SdkDependencyProvider sdkDependencyProvider = SdkDependencyProvider.INSTANCE;
        if (!sdkDependencyProvider.isInitialized()) {
            C33694Ix2.m101454e(LOG_TAG, SdkDependencyProvider.NOT_INITIALIZED_LOG, new Object[0]);
            finish();
            return;
        }
        RequestListConfiguration requestListConfiguration = (RequestListConfiguration) C32756Ex0.m108194e(getIntent().getExtras(), RequestListConfiguration.class);
        if (requestListConfiguration == null) {
            C33694Ix2.m101454e(LOG_TAG, "No configuration found. Please use RequestListActivity.builder()", new Object[0]);
            finish();
            return;
        }
        sdkDependencyProvider.provideRequestListComponent(this, requestListConfiguration).inject(this);
        setContentView(this.view);
        RequestListPresenter requestListPresenter = this.presenter;
        if (bundle != null) {
            z = false;
        }
        requestListPresenter.onCreate(z, this.view);
        this.actionHandlerRegistry.add(this.syncHandler);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ActionHandlerRegistry actionHandlerRegistry = this.actionHandlerRegistry;
        if (actionHandlerRegistry != null) {
            actionHandlerRegistry.remove(this.syncHandler);
        }
        RequestListPresenter requestListPresenter = this.presenter;
        if (requestListPresenter != null) {
            requestListPresenter.onDestroy(isChangingConfigurations());
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.syncHandler.setRunning(false);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.syncHandler.setRunning(true);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        this.view.onStart();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        this.view.onStop();
    }
}
