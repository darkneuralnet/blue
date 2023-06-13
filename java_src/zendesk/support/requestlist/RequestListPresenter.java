package zendesk.support.requestlist;

import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import java.util.List;
import zendesk.support.SupportSdkSettings;
import zendesk.support.request.RequestActivity;
import zendesk.support.requestlist.RequestListView;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class RequestListPresenter {
    private final CancelableCompositeCallback callbacks = new CancelableCompositeCallback();
    private final RequestListModel model;
    private RequestListView view;

    /* loaded from: classes8.dex */
    public interface SettingsCallback {
        void onSettings(SupportSdkSettings supportSdkSettings);
    }

    public RequestListPresenter(RequestListModel requestListModel) {
        this.model = requestListModel;
    }

    private void fetchSettingsFromNetwork(final SettingsCallback settingsCallback) {
        C52353yh5 m2896a = C52353yh5.m2896a(new AbstractC44415lI6<SupportSdkSettings>() { // from class: zendesk.support.requestlist.RequestListPresenter.4
            @Override // p000.AbstractC44415lI6
            public void onError(InterfaceC48782sg1 interfaceC48782sg1) {
                settingsCallback.onSettings(null);
                if (RequestListPresenter.this.view != null) {
                    RequestListPresenter.this.view.finish("Conversations are disabled in sdk settings, closing the request list screen!");
                }
            }

            @Override // p000.AbstractC44415lI6
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                RequestListPresenter.this.model.cacheSupportSdkSettings(supportSdkSettings);
                settingsCallback.onSettings(supportSdkSettings);
            }
        });
        this.callbacks.add(m2896a);
        this.view.setLoading(true);
        this.model.loadSettings(m2896a);
    }

    private void loadSettings(SettingsCallback settingsCallback) {
        SupportSdkSettings cachedSettings = this.model.getCachedSettings();
        if (cachedSettings == null) {
            fetchSettingsFromNetwork(settingsCallback);
        } else {
            settingsCallback.onSettings(cachedSettings);
        }
    }

    private void setupCreateTicketClickListener() {
        this.view.setCreateRequestListener(new View.OnClickListener() { // from class: zendesk.support.requestlist.RequestListPresenter.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                RequestListPresenter.this.view.startRequestActivity(RequestActivity.builder());
            }
        });
    }

    private void setupErrorClickListener() {
        this.view.setRetryClickListener(new View.OnClickListener() { // from class: zendesk.support.requestlist.RequestListPresenter.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                RequestListPresenter.this.refresh();
            }
        });
    }

    private void setupItemClickListener() {
        this.view.setItemClickListener(new RequestListView.OnItemClick() { // from class: zendesk.support.requestlist.RequestListPresenter.7
            @Override // zendesk.support.requestlist.RequestListView.OnItemClick
            public void onClick(RequestListItem requestListItem) {
                RequestListPresenter.this.view.startRequestActivity(requestListItem.configure(RequestActivity.builder()));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setupLogoView(final RequestListView requestListView, boolean z, final String str) {
        requestListView.setLogoClickListener(z, new View.OnClickListener() { // from class: zendesk.support.requestlist.RequestListPresenter.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                requestListView.startReferrerPage(str);
            }
        });
    }

    private void setupNavigationClickListener() {
        this.view.setBackClickListener(new View.OnClickListener() { // from class: zendesk.support.requestlist.RequestListPresenter.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                RequestListPresenter.this.view.finish();
            }
        });
    }

    private void setupPullToRefreshListener() {
        this.view.setSwipeRefreshListener(new SwipeRefreshLayout.InterfaceC11985j() { // from class: zendesk.support.requestlist.RequestListPresenter.8
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC11985j
            public void onRefresh() {
                RequestListPresenter.this.refresh();
            }
        });
    }

    public void loadItems(boolean z, SupportSdkSettings supportSdkSettings) {
        AbstractC44415lI6<List<RequestListItem>> abstractC44415lI6 = new AbstractC44415lI6<List<RequestListItem>>() { // from class: zendesk.support.requestlist.RequestListPresenter.3
            @Override // p000.AbstractC44415lI6
            public void onError(InterfaceC48782sg1 interfaceC48782sg1) {
                RequestListPresenter.this.showError(interfaceC48782sg1);
            }

            @Override // p000.AbstractC44415lI6
            public void onSuccess(List<RequestListItem> list) {
                RequestListPresenter.this.showRequestList(list);
            }
        };
        this.callbacks.add(C52353yh5.m2896a(abstractC44415lI6));
        this.view.setLoading(true);
        this.model.loadItems(z, supportSdkSettings, abstractC44415lI6);
    }

    public void onCreate(final boolean z, RequestListView requestListView) {
        this.view = requestListView;
        setupItemClickListener();
        setupPullToRefreshListener();
        setupNavigationClickListener();
        setupErrorClickListener();
        setupCreateTicketClickListener();
        loadSettings(new SettingsCallback() { // from class: zendesk.support.requestlist.RequestListPresenter.1
            @Override // zendesk.support.requestlist.RequestListPresenter.SettingsCallback
            public void onSettings(SupportSdkSettings supportSdkSettings) {
                if (supportSdkSettings != null && supportSdkSettings.isConversationsEnabled()) {
                    RequestListPresenter requestListPresenter = RequestListPresenter.this;
                    requestListPresenter.setupLogoView(requestListPresenter.view, supportSdkSettings.isShowReferrerLogoEnabled(), supportSdkSettings.getReferrerUrl());
                    RequestListPresenter.this.loadItems(z, supportSdkSettings);
                    if (z) {
                        RequestListPresenter.this.model.trackRequestListViewed();
                    }
                } else if (RequestListPresenter.this.view != null) {
                    RequestListPresenter.this.view.finish("Conversations are disabled in sdk settings, closing the request list screen!");
                }
            }
        });
    }

    public void onDestroy(boolean z) {
        if (!z) {
            this.model.cleanup();
        }
        this.view = null;
        this.callbacks.cancel();
    }

    public void refresh() {
        loadSettings(new SettingsCallback() { // from class: zendesk.support.requestlist.RequestListPresenter.2
            @Override // zendesk.support.requestlist.RequestListPresenter.SettingsCallback
            public void onSettings(SupportSdkSettings supportSdkSettings) {
                if (supportSdkSettings != null && supportSdkSettings.isConversationsEnabled()) {
                    RequestListPresenter.this.loadItems(true, supportSdkSettings);
                } else if (RequestListPresenter.this.view != null) {
                    RequestListPresenter.this.view.finish("Conversations are disabled in sdk settings, closing the request list screen!");
                }
            }
        });
    }

    public void showError(InterfaceC48782sg1 interfaceC48782sg1) {
        RequestListView requestListView = this.view;
        if (requestListView != null) {
            requestListView.setLoading(false);
            this.view.showErrorMessage();
        }
    }

    public void showRequestList(List<RequestListItem> list) {
        RequestListView requestListView = this.view;
        if (requestListView != null) {
            requestListView.showRequestList(list);
            this.view.setLoading(false);
        }
    }
}
