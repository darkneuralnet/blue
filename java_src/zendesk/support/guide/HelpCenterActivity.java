package zendesk.support.guide;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import zendesk.core.ActionDescription;
import zendesk.core.ActionHandler;
import zendesk.core.ActionHandlerRegistry;
import zendesk.core.NetworkInfoProvider;
import zendesk.core.RetryAction;
import zendesk.messaging.Engine;
import zendesk.messaging.MessagingActivity;
import zendesk.support.HelpCenterProvider;
import zendesk.support.HelpCenterSettingsProvider;
import zendesk.support.SearchArticle;
import zendesk.support.guide.HelpCenterConfiguration;
/* loaded from: classes8.dex */
public class HelpCenterActivity extends AppCompatActivity implements HelpCenterMvp$View {
    static final String LOG_TAG = "HelpCenterActivity";
    ActionHandlerRegistry actionHandlerRegistry;
    C32054Bx0 configurationHelper;
    private FloatingActionButton contactUsButton;
    private MenuItem conversationsMenuItem;
    private List<Engine> engines;
    private Snackbar errorSnackbar;
    private HelpCenterConfiguration helpCenterConfiguration;
    HelpCenterProvider helpCenterProvider;
    private View loadingView;
    NetworkInfoProvider networkInfoProvider;
    private HelpCenterMvp$Presenter presenter;
    private MenuItem searchViewMenuItem;
    HelpCenterSettingsProvider settingsProvider;
    private SnackbarStatus snackbarStatus = SnackbarStatus.NONE;

    /* renamed from: zendesk.support.guide.HelpCenterActivity$5 */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C313285 {
        static final /* synthetic */ int[] $SwitchMap$zendesk$support$guide$HelpCenterMvp$ErrorType;

        static {
            int[] iArr = new int[HelpCenterMvp$ErrorType.values().length];
            $SwitchMap$zendesk$support$guide$HelpCenterMvp$ErrorType = iArr;
            try {
                iArr[HelpCenterMvp$ErrorType.CATEGORY_LOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$zendesk$support$guide$HelpCenterMvp$ErrorType[HelpCenterMvp$ErrorType.SECTION_LOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$zendesk$support$guide$HelpCenterMvp$ErrorType[HelpCenterMvp$ErrorType.ARTICLES_LOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes8.dex */
    public enum SnackbarStatus {
        NO_CONNECTION,
        NONE,
        CONTENT_ERROR
    }

    private void addFragment(Fragment fragment) {
        getSupportFragmentManager().m67311q().m67121c(C34497Mi4.fragment_container, fragment, fragment.getClass().getSimpleName()).mo67115i();
    }

    private void addOnBackStackChangedListener() {
        getSupportFragmentManager().m67326l(new FragmentManager.InterfaceC11640n() { // from class: zendesk.support.guide.HelpCenterActivity.2
            @Override // androidx.fragment.app.FragmentManager.InterfaceC11640n
            public void onBackStackChanged() {
                if (HelpCenterActivity.this.getCurrentFragment().isHidden()) {
                    HelpCenterActivity.this.getSupportFragmentManager().m67311q().mo67123A(HelpCenterActivity.this.getCurrentFragment()).mo67115i();
                    if (HelpCenterActivity.this.getCurrentFragment() instanceof HelpCenterFragment) {
                        ((HelpCenterFragment) HelpCenterActivity.this.getCurrentFragment()).setPresenter(HelpCenterActivity.this.presenter);
                    }
                }
            }
        });
    }

    public static HelpCenterConfiguration.Builder builder() {
        return new HelpCenterConfiguration.Builder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Fragment getCurrentFragment() {
        return getSupportFragmentManager().m67325l0(C34497Mi4.fragment_container);
    }

    private HelpSearchFragment getSearchFragment() {
        if (getCurrentFragment() instanceof HelpSearchFragment) {
            C33694Ix2.m101457b(LOG_TAG, "showSearchResults: current fragment is a HelpSearchFragment", new Object[0]);
            return (HelpSearchFragment) getCurrentFragment();
        }
        HelpSearchFragment newInstance = HelpSearchFragment.newInstance(this.helpCenterConfiguration, this.helpCenterProvider);
        getSupportFragmentManager().m67311q().m67104t(C34497Mi4.fragment_container, newInstance).m67117g(null).mo67115i();
        return newInstance;
    }

    private ActionBar initToolbar() {
        findViewById(C34497Mi4.support_compat_shadow).setVisibility(8);
        setSupportActionBar((Toolbar) findViewById(C34497Mi4.support_toolbar));
        return getSupportActionBar();
    }

    private boolean noFragmentAdded() {
        return getCurrentFragment() == null;
    }

    private void showCreateRequest(Map<String, Object> map) {
        String simpleName;
        ActionHandler handlerByAction = this.actionHandlerRegistry.handlerByAction("action_contact_option");
        if (handlerByAction != null) {
            ActionDescription actionDescription = handlerByAction.getActionDescription();
            if (actionDescription != null) {
                simpleName = actionDescription.getLocalizedLabel();
            } else {
                simpleName = handlerByAction.getClass().getSimpleName();
            }
            C33694Ix2.m101457b(LOG_TAG, "No Deflection ActionHandler Available, opening %s", simpleName);
            handlerByAction.handle(map, this);
        }
    }

    @Override // zendesk.support.guide.HelpCenterMvp$View
    public void announceContentLoaded() {
        this.contactUsButton.announceForAccessibility(getString(C41127fl4.zs_help_center_content_loaded_accessibility));
    }

    @Override // zendesk.support.guide.HelpCenterMvp$View
    public void clearSearchResults() {
        if (getCurrentFragment() instanceof HelpSearchFragment) {
            ((HelpSearchFragment) getCurrentFragment()).clearResults();
        }
    }

    @Override // zendesk.support.guide.HelpCenterMvp$View
    public void dismissError() {
        Snackbar snackbar = this.errorSnackbar;
        if (snackbar != null) {
            snackbar.mo48847x();
        }
        this.snackbarStatus = SnackbarStatus.NONE;
    }

    @Override // zendesk.support.guide.HelpCenterMvp$View
    public void exitActivity() {
        finish();
    }

    @Override // zendesk.support.guide.HelpCenterMvp$View
    public Context getContext() {
        return getApplicationContext();
    }

    @Override // zendesk.support.guide.HelpCenterMvp$View
    public void hideLoadingState() {
        this.loadingView.setVisibility(8);
    }

    @Override // zendesk.support.guide.HelpCenterMvp$View
    public boolean isShowingHelp() {
        return getCurrentFragment() instanceof HelpCenterFragment;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Resources.Theme theme = getTheme();
        theme.applyStyle(C51799xl4.ZendeskActivityDefaultTheme, true);
        theme.applyStyle(C51799xl4.ZendeskSupportActivityThemeDefaultIcon, false);
        setContentView(C52382yk4.zs_activity_help_center);
        GuideSdkDependencyProvider guideSdkDependencyProvider = GuideSdkDependencyProvider.INSTANCE;
        if (!guideSdkDependencyProvider.isInitialized()) {
            C33694Ix2.m101454e(LOG_TAG, GuideSdkDependencyProvider.NOT_INITIALIZED_LOG, new Object[0]);
            finish();
            return;
        }
        guideSdkDependencyProvider.provideGuideSdkComponent().inject(this);
        HelpCenterConfiguration helpCenterConfiguration = (HelpCenterConfiguration) this.configurationHelper.m113275f(getIntent().getExtras(), HelpCenterConfiguration.class);
        this.helpCenterConfiguration = helpCenterConfiguration;
        if (helpCenterConfiguration == null) {
            C33694Ix2.m101454e(LOG_TAG, "No configuration found. Please use HelpCenterActivity.builder()", new Object[0]);
            finish();
            return;
        }
        this.engines = helpCenterConfiguration.getEngines();
        initToolbar().mo70212v(true);
        this.loadingView = findViewById(C34497Mi4.loading_view);
        FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(C34497Mi4.contact_us_button);
        this.contactUsButton = floatingActionButton;
        floatingActionButton.setOnClickListener(new View.OnClickListener() { // from class: zendesk.support.guide.HelpCenterActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HelpCenterActivity.this.showContactZendesk();
            }
        });
        HelpCenterPresenter helpCenterPresenter = new HelpCenterPresenter(this, new HelpCenterModel(this.helpCenterProvider, this.settingsProvider), this.networkInfoProvider, this.actionHandlerRegistry);
        this.presenter = helpCenterPresenter;
        helpCenterPresenter.init(this.helpCenterConfiguration, this.engines);
        addOnBackStackChangedListener();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C33813Jk4.zs_fragment_help_menu_conversations, menu);
        this.conversationsMenuItem = menu.findItem(C34497Mi4.fragment_help_menu_contact);
        MenuItem findItem = menu.findItem(C34497Mi4.fragment_help_menu_search);
        this.searchViewMenuItem = findItem;
        if (findItem != null) {
            if (!this.networkInfoProvider.isNetworkAvailable()) {
                this.searchViewMenuItem.setEnabled(false);
            }
            SearchView searchView = (SearchView) this.searchViewMenuItem.getActionView();
            searchView.setImeOptions(searchView.getImeOptions() | 268435456);
            searchView.setOnQueryTextListener(new SearchView.InterfaceC11119m() { // from class: zendesk.support.guide.HelpCenterActivity.3
                @Override // androidx.appcompat.widget.SearchView.InterfaceC11119m
                public boolean onQueryTextChange(String str) {
                    return false;
                }

                @Override // androidx.appcompat.widget.SearchView.InterfaceC11119m
                public boolean onQueryTextSubmit(String str) {
                    if (HelpCenterActivity.this.presenter != null) {
                        HelpCenterActivity.this.presenter.onSearchSubmit(str);
                        return true;
                    }
                    return false;
                }
            });
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        } else if (itemId == C34497Mi4.fragment_help_menu_contact) {
            showRequestList();
            return true;
        } else {
            return false;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        HelpCenterMvp$Presenter helpCenterMvp$Presenter = this.presenter;
        if (helpCenterMvp$Presenter != null) {
            helpCenterMvp$Presenter.onPause();
        }
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        boolean z;
        MenuItem menuItem;
        HelpCenterMvp$Presenter helpCenterMvp$Presenter = this.presenter;
        if (helpCenterMvp$Presenter != null && (menuItem = this.searchViewMenuItem) != null) {
            menuItem.setVisible(helpCenterMvp$Presenter.shouldShowSearchMenuItem());
        }
        if (this.presenter != null && this.conversationsMenuItem != null) {
            boolean z2 = true;
            if (this.actionHandlerRegistry.handlerByAction("action_conversation_list") != null) {
                z = true;
            } else {
                z = false;
            }
            MenuItem menuItem2 = this.conversationsMenuItem;
            if (!this.presenter.shouldShowConversationsMenuItem() || !z) {
                z2 = false;
            }
            menuItem2.setVisible(z2);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        HelpCenterMvp$Presenter helpCenterMvp$Presenter = this.presenter;
        if (helpCenterMvp$Presenter != null) {
            helpCenterMvp$Presenter.onResume(this);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        Snackbar snackbar;
        super.onStart();
        if (this.snackbarStatus != SnackbarStatus.NONE && (snackbar = this.errorSnackbar) != null) {
            snackbar.mo48864Y();
        }
    }

    @Override // zendesk.support.guide.HelpCenterMvp$View
    public void setSearchEnabled(boolean z) {
        this.searchViewMenuItem.setEnabled(z);
    }

    @Override // zendesk.support.guide.HelpCenterMvp$View
    public void showContactUsButton() {
        this.contactUsButton.setVisibility(0);
    }

    @Override // zendesk.support.guide.HelpCenterMvp$View
    public void showContactZendesk() {
        HashMap hashMap = new HashMap();
        this.configurationHelper.m113277d(hashMap, this.helpCenterConfiguration);
        if (C43505jm0.m29948i(this.engines)) {
            MessagingActivity.builder().withEngines(this.engines).show(this, this.helpCenterConfiguration.getConfigurations());
        } else {
            showCreateRequest(hashMap);
        }
    }

    @Override // zendesk.support.guide.HelpCenterMvp$View
    public void showHelp(HelpCenterConfiguration helpCenterConfiguration) {
        if (noFragmentAdded()) {
            HelpCenterFragment newInstance = HelpCenterFragment.newInstance(helpCenterConfiguration);
            newInstance.setPresenter(this.presenter);
            addFragment(newInstance);
        } else if (getCurrentFragment() instanceof HelpCenterFragment) {
            ((HelpCenterFragment) getCurrentFragment()).setPresenter(this.presenter);
        }
        invalidateOptionsMenu();
    }

    @Override // zendesk.support.guide.HelpCenterMvp$View
    public void showLoadArticleErrorWithRetry(HelpCenterMvp$ErrorType helpCenterMvp$ErrorType, final RetryAction retryAction) {
        String string;
        if (helpCenterMvp$ErrorType == null) {
            C33694Ix2.m101447l(LOG_TAG, "ErrorType was null, falling back to 'retry' as label", new Object[0]);
            string = getString(C41127fl4.zui_retry_button_label);
        } else {
            int i = C313285.$SwitchMap$zendesk$support$guide$HelpCenterMvp$ErrorType[helpCenterMvp$ErrorType.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        C33694Ix2.m101447l(LOG_TAG, "Unknown or unhandled error type, falling back to error type name as label", new Object[0]);
                        string = getString(C41127fl4.support_help_search_no_results_label) + " " + helpCenterMvp$ErrorType.name();
                    } else {
                        string = getString(C41127fl4.support_articles_list_fragment_error_message);
                    }
                } else {
                    string = getString(C41127fl4.support_sections_list_fragment_error_message);
                }
            } else {
                string = getString(C41127fl4.support_categories_list_fragment_error_message);
            }
        }
        if (this.snackbarStatus == SnackbarStatus.NONE) {
            Snackbar m48855o0 = Snackbar.m48855o0(this.contactUsButton, string, -2);
            this.errorSnackbar = m48855o0;
            m48855o0.m48853q0(C41127fl4.zui_retry_button_label, new View.OnClickListener() { // from class: zendesk.support.guide.HelpCenterActivity.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    HelpCenterActivity.this.errorSnackbar.mo48847x();
                    HelpCenterActivity.this.snackbarStatus = SnackbarStatus.NONE;
                    retryAction.onRetry();
                }
            });
            this.errorSnackbar.mo48864Y();
            this.snackbarStatus = SnackbarStatus.CONTENT_ERROR;
        }
    }

    @Override // zendesk.support.guide.HelpCenterMvp$View
    public void showLoadingState() {
        Fragment currentFragment = getCurrentFragment();
        if (currentFragment != null && currentFragment.isVisible()) {
            getSupportFragmentManager().m67311q().mo67107q(getCurrentFragment()).mo67115i();
        }
        this.loadingView.setVisibility(0);
    }

    @Override // zendesk.support.guide.HelpCenterMvp$View
    public void showNoConnectionError() {
        SnackbarStatus snackbarStatus = this.snackbarStatus;
        SnackbarStatus snackbarStatus2 = SnackbarStatus.NO_CONNECTION;
        if (snackbarStatus != snackbarStatus2) {
            Snackbar m48856n0 = Snackbar.m48856n0(this.contactUsButton, C41127fl4.zg_general_no_connection_message, -2);
            this.errorSnackbar = m48856n0;
            m48856n0.mo48864Y();
            this.snackbarStatus = snackbarStatus2;
        }
    }

    @Override // zendesk.support.guide.HelpCenterMvp$View
    public void showRequestList() {
        ActionHandler handlerByAction = this.actionHandlerRegistry.handlerByAction("action_conversation_list");
        if (handlerByAction != null) {
            HashMap hashMap = new HashMap();
            this.configurationHelper.m113277d(hashMap, this.helpCenterConfiguration);
            handlerByAction.handle(hashMap, this);
        }
    }

    @Override // zendesk.support.guide.HelpCenterMvp$View
    public void showSearchResults(List<SearchArticle> list, String str) {
        getSearchFragment().updateResults(list, str);
    }
}
