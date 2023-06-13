package zendesk.support.request;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.DialogInterfaceC10997b;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.snackbar.Snackbar;
import java.util.Map;
import zendesk.belvedere.BelvedereUi;
import zendesk.core.ActionDescription;
import zendesk.core.ActionHandler;
import zendesk.core.ActionHandlerRegistry;
import zendesk.support.SdkDependencyProvider;
import zendesk.support.request.RequestConfiguration;
import zendesk.support.suas.CombinedSubscription;
import zendesk.support.suas.State;
import zendesk.support.suas.Store;
import zendesk.support.suas.Subscription;
/* loaded from: classes8.dex */
public class RequestActivity extends AppCompatActivity {
    static final boolean DEBUG = false;
    static final String LOG_TAG = "RequestActivity";
    private static final String SAVED_STATE = "saved_state";
    private RequestAccessibilityHerald accessibilityHerald;
    ActionHandlerRegistry actionHandlerRegistry;

    /* renamed from: af */
    ActionFactory f121998af;
    HeadlessComponentListener headlessComponentListener;
    C42732iT3 picasso;
    private RefreshRequestActionHandler refreshActionHandler;
    private RequestComponent requestComponent;
    private ComponentRequestRouter requestRouter;
    Store store;
    private Subscription subscription;

    /* loaded from: classes8.dex */
    public static class MoveUpWithSnackbarBehaviour extends AppBarLayout.ScrollingViewBehavior {
        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return super.layoutDependsOn(coordinatorLayout, view, view2) || (view2 instanceof Snackbar.SnackbarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            boolean onDependentViewChanged = super.onDependentViewChanged(coordinatorLayout, view, view2);
            if (view2 instanceof Snackbar.SnackbarLayout) {
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), (int) Math.abs(Math.min(0.0f, view2.getTranslationY() - view2.getHeight())));
                return true;
            }
            return onDependentViewChanged;
        }
    }

    /* loaded from: classes8.dex */
    public final class RefreshRequestActionHandler implements ActionHandler {
        private final String requestId;

        public RefreshRequestActionHandler(String str) {
            this.requestId = str;
        }

        @Override // zendesk.core.ActionHandler
        public boolean canHandle(String str) {
            if (str.contains("request_conversation_refresh") && str.contains(this.requestId)) {
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
            RequestActivity requestActivity = RequestActivity.this;
            requestActivity.store.dispatch(requestActivity.f121998af.updateCommentsAsync());
        }

        @Override // zendesk.core.ActionHandler
        public void updateSettings(Map<String, AbstractC52360yi2> map) {
        }
    }

    private Subscription bindComponents(boolean z) {
        ComponentToolbar bindToolbar = bindToolbar();
        ComponentError create = ComponentError.create(this, this.store, this.f121998af);
        this.requestRouter = ComponentRequestRouter.create(this, z, this.requestComponent);
        this.accessibilityHerald = RequestAccessibilityHerald.create(this);
        return CombinedSubscription.from(this.store.addListener(bindToolbar.getToolbarSelector(), bindToolbar), this.store.addListener(this.requestRouter.getSelector(), this.requestRouter), this.store.addListener(ComponentError.getSelector(), create), this.store.addActionListener(this.accessibilityHerald));
    }

    @SuppressLint({"PrivateResource"})
    private ComponentToolbar bindToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(C35181Pg4.activity_request_toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: zendesk.support.request.RequestActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                RequestActivity.this.onBackPressed();
            }
        });
        findViewById(C35181Pg4.activity_request_compat_toolbar_shadow).setVisibility(8);
        return new ComponentToolbar(this.picasso, toolbar, (ViewAlmostRealProgressBar) findViewById(C35181Pg4.activity_request_progressbar));
    }

    public static RequestConfiguration.Builder builder() {
        return new RequestConfiguration.Builder();
    }

    private void initViews() {
        ((CoordinatorLayout.C11529e) findViewById(C35181Pg4.activity_request_root).getLayoutParams()).m67758q(new MoveUpWithSnackbarBehaviour());
    }

    private boolean initializeStoreAndDependencies(Bundle bundle, RequestConfiguration requestConfiguration) {
        if (!injectDependencies(requestConfiguration)) {
            State restoreState = restoreState(bundle);
            if (restoreState != null) {
                this.store.reset(restoreState);
            } else {
                return true;
            }
        }
        return false;
    }

    private boolean injectDependencies(RequestConfiguration requestConfiguration) {
        boolean z;
        RequestComponent requestComponent = (RequestComponent) HeadlessFragment.getData(getSupportFragmentManager());
        this.requestComponent = requestComponent;
        if (requestComponent == null) {
            this.requestComponent = SdkDependencyProvider.INSTANCE.provideSupportSdkComponent().plus(new RequestModule(requestConfiguration));
            HeadlessFragment.install(getSupportFragmentManager(), this.requestComponent);
            z = false;
        } else {
            z = true;
        }
        this.requestComponent.inject(this);
        return z;
    }

    private State restoreState(Bundle bundle) {
        if (bundle != null && bundle.containsKey(SAVED_STATE)) {
            return (State) bundle.getSerializable(SAVED_STATE);
        }
        return null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        RequestView currentScreen = this.requestRouter.getCurrentScreen();
        if (currentScreen != null && currentScreen.hasUnsavedInput()) {
            new DialogInterfaceC10997b.C10998a(this).mo70286p(C41720gl4.request_dialog_title_unsaved_changes).mo70295g(C41720gl4.request_dialog_body_unsaved_changes).mo70289m(C41720gl4.request_dialog_button_label_delete, new DialogInterface.OnClickListener() { // from class: zendesk.support.request.RequestActivity.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    RequestActivity.super.onBackPressed();
                }
            }).mo70293i(C41720gl4.request_dialog_button_label_cancel, new DialogInterface.OnClickListener() { // from class: zendesk.support.request.RequestActivity.1
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            }).m70283s();
        } else {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getTheme().applyStyle(C52392yl4.ZendeskActivityDefaultTheme, true);
        setContentView(C52975zk4.zs_activity_request);
        BelvedereUi.m865b(this);
        initViews();
        if (!SdkDependencyProvider.INSTANCE.isInitialized()) {
            C33694Ix2.m101454e(LOG_TAG, SdkDependencyProvider.NOT_INITIALIZED_LOG, new Object[0]);
            finish();
            return;
        }
        RequestConfiguration requestConfiguration = (RequestConfiguration) C32756Ex0.m108194e(getIntent().getExtras(), RequestConfiguration.class);
        if (requestConfiguration == null) {
            C33694Ix2.m101454e(LOG_TAG, "No configuration found. Please use RequestActivity.builder()", new Object[0]);
            finish();
            return;
        }
        this.refreshActionHandler = new RefreshRequestActionHandler(requestConfiguration.getRequestId());
        boolean initializeStoreAndDependencies = initializeStoreAndDependencies(bundle, requestConfiguration);
        if (initializeStoreAndDependencies) {
            this.headlessComponentListener.startListening(this.store);
            this.store.dispatch(this.f121998af.installStartConfigAsync(requestConfiguration));
            this.store.dispatch(this.f121998af.loadSettingsAsync());
        }
        this.subscription = bindComponents(initializeStoreAndDependencies);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        RequestView currentScreen = this.requestRouter.getCurrentScreen();
        if (currentScreen != null && currentScreen.inflateMenu(getMenuInflater(), menu)) {
            return true;
        }
        return false;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        RequestView currentScreen = this.requestRouter.getCurrentScreen();
        if (currentScreen != null) {
            return currentScreen.onOptionsItemClicked(menuItem);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        Store store = this.store;
        if (store != null) {
            store.dispatch(this.f121998af.androidOnPause());
        }
        Subscription subscription = this.subscription;
        if (subscription != null) {
            subscription.removeListener();
        }
        ActionHandlerRegistry actionHandlerRegistry = this.actionHandlerRegistry;
        if (actionHandlerRegistry != null) {
            actionHandlerRegistry.remove(this.refreshActionHandler);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.store.dispatch(this.f121998af.androidOnResume());
        this.subscription.addListener();
        this.subscription.informWithCurrentState();
        this.actionHandlerRegistry.add(this.refreshActionHandler);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putSerializable(SAVED_STATE, this.store.getState());
        super.onSaveInstanceState(bundle);
    }
}
