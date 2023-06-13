package zendesk.support.requestlist;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.C11915i;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.transition.C12055c;
import androidx.transition.Fade;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import java.util.List;
import zendesk.support.UiUtils;
import zendesk.support.request.RequestConfiguration;
import zendesk.support.request.ViewAlmostRealProgressBar;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes8.dex */
public class RequestListView extends FrameLayout {
    private static final String IS_SHOWING_SNACKBAR_KEY = "is_showing_snackbar";
    private static final String REQUEST_LIST_VIEW_SUPERSTATE_KEY = "request_list_view_superstate";
    private final AppCompatActivity activity;
    private final RequestListAdapter adapter;
    private final RequestListConfiguration config;
    private final FloatingActionButton createTicketFab;
    private final C47068pm5 emptyScene;
    private final Fade fade;
    private boolean isLoading;
    private boolean isStopped;
    private OnItemClick itemClickListener;
    private final C47068pm5 listScene;
    private final View listSceneView;
    private final View logoImage;
    private final View logoImageEmpty;
    private final ViewAlmostRealProgressBar progressBar;
    private final RecyclerView recyclerView;
    private View.OnClickListener retryClickListener;
    private final ViewGroup rootLayout;
    private final ViewGroup sceneRoot;
    private SceneState sceneState;
    Snackbar snackbar;
    private final View startConversationButton;
    private final SwipeRefreshLayout swipeRefreshLayout;
    private final SwipeRefreshLayout swipeRefreshLayoutEmpty;
    private final Toolbar toolbar;

    /* loaded from: classes8.dex */
    public interface OnItemClick {
        void onClick(RequestListItem requestListItem);
    }

    /* loaded from: classes8.dex */
    public enum SceneState {
        LIST,
        EMPTY,
        NONE
    }

    public RequestListView(AppCompatActivity appCompatActivity, RequestListConfiguration requestListConfiguration, C42732iT3 c42732iT3) {
        super(appCompatActivity);
        this.sceneState = SceneState.NONE;
        this.itemClickListener = null;
        this.retryClickListener = null;
        this.isLoading = false;
        this.isStopped = true;
        this.fade = new Fade();
        this.activity = appCompatActivity;
        this.config = requestListConfiguration;
        setId(C35181Pg4.request_list_view);
        View.inflate(appCompatActivity, C52975zk4.zs_activity_request_list, this);
        ViewGroup viewGroup = (ViewGroup) findViewById(C35181Pg4.request_list_scene_root);
        this.sceneRoot = viewGroup;
        LayoutInflater from = LayoutInflater.from(appCompatActivity);
        View inflate = from.inflate(C52975zk4.zs_activity_request_list_scene_data, viewGroup, false);
        this.listSceneView = inflate;
        View inflate2 = from.inflate(C52975zk4.zs_activity_request_list_scene_empty, viewGroup, false);
        this.listScene = new C47068pm5(viewGroup, inflate);
        this.emptyScene = new C47068pm5(viewGroup, inflate2);
        this.progressBar = (ViewAlmostRealProgressBar) findViewById(C35181Pg4.request_list_progressBar);
        this.toolbar = (Toolbar) findViewById(C35181Pg4.request_list_toolbar);
        this.rootLayout = (ViewGroup) findViewById(C35181Pg4.request_list_coordinator_layout);
        FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(C35181Pg4.request_list_create_new_ticket_fab);
        this.createTicketFab = floatingActionButton;
        this.logoImage = inflate.findViewById(C35181Pg4.request_list_zendesk_logo);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C35181Pg4.request_list_recycler);
        this.recyclerView = recyclerView;
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(C35181Pg4.request_list_swipe_refresh_layout);
        this.swipeRefreshLayout = swipeRefreshLayout;
        this.startConversationButton = inflate2.findViewById(C35181Pg4.request_list_empty_start_conversation);
        SwipeRefreshLayout swipeRefreshLayout2 = (SwipeRefreshLayout) inflate2.findViewById(C35181Pg4.request_list_swipe_refresh_layout_empty);
        this.swipeRefreshLayoutEmpty = swipeRefreshLayout2;
        this.logoImageEmpty = inflate2.findViewById(C35181Pg4.request_list_zendesk_logo_empty);
        RequestListAdapter requestListAdapter = new RequestListAdapter(new OnItemClick() { // from class: zendesk.support.requestlist.RequestListView.1
            @Override // zendesk.support.requestlist.RequestListView.OnItemClick
            public void onClick(RequestListItem requestListItem) {
                if (RequestListView.this.itemClickListener != null) {
                    RequestListView.this.itemClickListener.onClick(requestListItem);
                }
            }
        }, c42732iT3);
        this.adapter = requestListAdapter;
        recyclerView.setAdapter(requestListAdapter);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(appCompatActivity, 1, false));
        recyclerView.addItemDecoration(new C11915i(appCompatActivity, 1));
        recyclerView.setItemAnimator(new C11894g());
        floatingActionButton.m49515t();
        View findViewById = findViewById(C35181Pg4.request_list_compat_shadow);
        ((ViewGroup) findViewById.getParent()).removeView(findViewById);
        int themeAttributeToColor = UiUtils.themeAttributeToColor(C44032kf4.colorAccent, getContext(), C52925zf4.zs_color_black);
        swipeRefreshLayout.setColorSchemeColors(themeAttributeToColor);
        swipeRefreshLayout2.setColorSchemeColors(themeAttributeToColor);
    }

    private void dismissSnackbar() {
        Snackbar snackbar = this.snackbar;
        if (snackbar != null) {
            snackbar.mo48847x();
        }
        this.snackbar = null;
    }

    private boolean isShowingSnackBar() {
        Snackbar snackbar = this.snackbar;
        return snackbar != null && snackbar.m48929M();
    }

    public void announceAccessibility(int i) {
        announceForAccessibility(getResources().getString(i));
    }

    public void finish(String str) {
        if (C44504lS5.m27273b(str)) {
            C33694Ix2.m101457b("RequestListActivity", str, new Object[0]);
        }
        finish();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            boolean z = bundle.getBoolean(IS_SHOWING_SNACKBAR_KEY);
            parcelable = bundle.getParcelable(REQUEST_LIST_VIEW_SUPERSTATE_KEY);
            if (z) {
                showErrorMessage();
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(REQUEST_LIST_VIEW_SUPERSTATE_KEY, super.onSaveInstanceState());
        bundle.putBoolean(IS_SHOWING_SNACKBAR_KEY, isShowingSnackBar());
        return bundle;
    }

    public void onStart() {
        this.isStopped = false;
    }

    public void onStop() {
        this.isStopped = true;
        dismissSnackbar();
    }

    public void setBackClickListener(View.OnClickListener onClickListener) {
        this.toolbar.setNavigationOnClickListener(onClickListener);
    }

    public void setCreateRequestListener(View.OnClickListener onClickListener) {
        this.createTicketFab.setOnClickListener(onClickListener);
        this.startConversationButton.setOnClickListener(onClickListener);
    }

    public void setItemClickListener(OnItemClick onItemClick) {
        this.itemClickListener = onItemClick;
    }

    public void setLoading(boolean z) {
        dismissSnackbar();
        if (this.isLoading != z) {
            if (z) {
                if (!this.swipeRefreshLayout.m66032i() && !this.swipeRefreshLayoutEmpty.m66032i()) {
                    announceAccessibility(C41720gl4.zs_request_list_content_loading_accessibility);
                    this.progressBar.start(ViewAlmostRealProgressBar.DONT_STOP_MOVING);
                }
            } else if (!this.swipeRefreshLayout.m66032i() && !this.swipeRefreshLayoutEmpty.m66032i()) {
                this.progressBar.stop(300L);
            } else {
                this.swipeRefreshLayout.setRefreshing(false);
                this.swipeRefreshLayoutEmpty.setRefreshing(false);
            }
        }
        this.isLoading = z;
    }

    public void setLogoClickListener(boolean z, View.OnClickListener onClickListener) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 4;
            onClickListener = null;
        }
        this.logoImage.setVisibility(i);
        this.logoImageEmpty.setVisibility(i);
        this.logoImage.setOnClickListener(onClickListener);
        this.logoImageEmpty.setOnClickListener(onClickListener);
    }

    public void setRetryClickListener(View.OnClickListener onClickListener) {
        this.retryClickListener = onClickListener;
    }

    public void setSwipeRefreshListener(SwipeRefreshLayout.InterfaceC11985j interfaceC11985j) {
        this.swipeRefreshLayout.setOnRefreshListener(interfaceC11985j);
        this.swipeRefreshLayoutEmpty.setOnRefreshListener(interfaceC11985j);
    }

    public void showErrorMessage() {
        if (!this.isStopped && !isShowingSnackBar()) {
            announceAccessibility(C41720gl4.zs_request_list_content_load_failed_accessibility);
            Snackbar m48853q0 = Snackbar.m48856n0(this.rootLayout, C41720gl4.request_list_error_message, -2).m48853q0(C41720gl4.zendesk_retry_button_label, this.retryClickListener);
            this.snackbar = m48853q0;
            m48853q0.mo48864Y();
        }
    }

    public void showRequestList(List<RequestListItem> list) {
        dismissSnackbar();
        this.progressBar.stop(300L);
        if (C43505jm0.m29950g(list)) {
            SceneState sceneState = this.sceneState;
            SceneState sceneState2 = SceneState.EMPTY;
            if (sceneState != sceneState2) {
                this.createTicketFab.m49515t();
                C12055c.m65800f(this.emptyScene, this.fade);
                announceAccessibility(C41720gl4.zs_request_list_content_loaded_empty_accessibility);
                this.sceneState = sceneState2;
                return;
            }
            return;
        }
        this.adapter.swapRequests(list);
        this.progressBar.stop(300L);
        SceneState sceneState3 = this.sceneState;
        SceneState sceneState4 = SceneState.LIST;
        if (sceneState3 != sceneState4) {
            if (this.config.isContactUsButtonVisible()) {
                this.createTicketFab.m49534A();
            } else {
                this.createTicketFab.m49515t();
            }
            if (this.listSceneView.getParent() == null) {
                C12055c.m65800f(this.listScene, this.fade);
            }
            announceAccessibility(C41720gl4.zs_request_list_content_loaded_accessibility);
            this.sceneState = sceneState4;
        }
    }

    public void startReferrerPage(String str) {
        this.activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    public void startRequestActivity(RequestConfiguration.Builder builder) {
        builder.show(this.activity, this.config.getConfigurations());
    }

    public void finish() {
        if (this.activity.isFinishing()) {
            return;
        }
        this.activity.finish();
    }
}
