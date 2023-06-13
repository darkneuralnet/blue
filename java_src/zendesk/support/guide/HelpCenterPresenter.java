package zendesk.support.guide;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import zendesk.core.ActionHandlerRegistry;
import zendesk.core.NetworkAware;
import zendesk.core.NetworkInfoProvider;
import zendesk.core.RetryAction;
import zendesk.messaging.Engine;
import zendesk.support.HelpCenterSettings;
import zendesk.support.SearchArticle;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class HelpCenterPresenter implements HelpCenterMvp$Presenter, NetworkAware {
    private static final Integer NETWORK_AWARE_ID = 31;
    private static final Integer RETRY_ACTION_ID = 8642;
    private ActionHandlerRegistry actionHandlerRegistry;
    private HelpCenterConfiguration config;
    private List<Engine> engines;
    private HelpCenterSettings helpCenterSettings;
    private Set<RetryAction> internalRetryActions = new HashSet();
    private HelpCenterMvp$Model model;
    private NetworkInfoProvider networkInfoProvider;
    private boolean networkPreviouslyUnavailable;
    private HelpCenterMvp$View view;

    /* loaded from: classes8.dex */
    public class ViewSafeRetryZendeskCallback extends AbstractC44415lI6<List<SearchArticle>> {
        private String query;

        public ViewSafeRetryZendeskCallback(String str) {
            this.query = str;
        }

        @Override // p000.AbstractC44415lI6
        public void onError(final InterfaceC48782sg1 interfaceC48782sg1) {
            if (HelpCenterPresenter.this.view != null) {
                HelpCenterPresenter.this.view.hideLoadingState();
                HelpCenterPresenter.this.view.showLoadArticleErrorWithRetry(HelpCenterMvp$ErrorType.ARTICLES_LOAD, new RetryAction() { // from class: zendesk.support.guide.HelpCenterPresenter.ViewSafeRetryZendeskCallback.2
                    @Override // zendesk.core.RetryAction
                    public void onRetry() {
                        ViewSafeRetryZendeskCallback viewSafeRetryZendeskCallback = ViewSafeRetryZendeskCallback.this;
                        HelpCenterPresenter.this.onSearchSubmit(viewSafeRetryZendeskCallback.query);
                    }
                });
                return;
            }
            HelpCenterPresenter.this.internalRetryActions.add(new RetryAction() { // from class: zendesk.support.guide.HelpCenterPresenter.ViewSafeRetryZendeskCallback.3
                @Override // zendesk.core.RetryAction
                public void onRetry() {
                    ViewSafeRetryZendeskCallback.this.onError(interfaceC48782sg1);
                }
            });
        }

        @Override // p000.AbstractC44415lI6
        public void onSuccess(final List<SearchArticle> list) {
            if (HelpCenterPresenter.this.view != null) {
                HelpCenterPresenter.this.view.hideLoadingState();
                HelpCenterPresenter.this.view.showSearchResults(list, this.query);
                if (HelpCenterPresenter.this.shouldShowContactUsButton()) {
                    HelpCenterPresenter.this.view.showContactUsButton();
                    return;
                }
                return;
            }
            HelpCenterPresenter.this.internalRetryActions.add(new RetryAction() { // from class: zendesk.support.guide.HelpCenterPresenter.ViewSafeRetryZendeskCallback.1
                @Override // zendesk.core.RetryAction
                public void onRetry() {
                    ViewSafeRetryZendeskCallback.this.onSuccess(list);
                }
            });
        }
    }

    public HelpCenterPresenter(HelpCenterMvp$View helpCenterMvp$View, HelpCenterMvp$Model helpCenterMvp$Model, NetworkInfoProvider networkInfoProvider, ActionHandlerRegistry actionHandlerRegistry) {
        this.view = helpCenterMvp$View;
        this.model = helpCenterMvp$Model;
        this.networkInfoProvider = networkInfoProvider;
        this.actionHandlerRegistry = actionHandlerRegistry;
    }

    private void invokeRetryActions() {
        for (RetryAction retryAction : this.internalRetryActions) {
            retryAction.onRetry();
        }
        this.internalRetryActions.clear();
    }

    @Override // zendesk.support.guide.HelpCenterMvp$Presenter
    public void init(HelpCenterConfiguration helpCenterConfiguration, List<Engine> list) {
        this.config = helpCenterConfiguration;
        this.engines = list;
        this.view.showLoadingState();
        this.model.getSettings(new AbstractC44415lI6<HelpCenterSettings>() { // from class: zendesk.support.guide.HelpCenterPresenter.5
            @Override // p000.AbstractC44415lI6
            public void onError(InterfaceC48782sg1 interfaceC48782sg1) {
                C33694Ix2.m101454e("HelpCenterActivity", "Failed to get mobile settings. Cannot determine start screen.", new Object[0]);
                C33694Ix2.m101456c("HelpCenterActivity", interfaceC48782sg1);
                if (HelpCenterPresenter.this.view != null) {
                    HelpCenterPresenter.this.view.hideLoadingState();
                    HelpCenterPresenter.this.view.exitActivity();
                    return;
                }
                HelpCenterPresenter.this.internalRetryActions.add(new RetryAction() { // from class: zendesk.support.guide.HelpCenterPresenter.5.7
                    @Override // zendesk.core.RetryAction
                    public void onRetry() {
                        HelpCenterPresenter.this.view.hideLoadingState();
                        HelpCenterPresenter.this.view.exitActivity();
                    }
                });
            }

            @Override // p000.AbstractC44415lI6
            public void onSuccess(HelpCenterSettings helpCenterSettings) {
                if (HelpCenterPresenter.this.view != null) {
                    HelpCenterPresenter.this.view.hideLoadingState();
                } else {
                    HelpCenterPresenter.this.internalRetryActions.add(new RetryAction() { // from class: zendesk.support.guide.HelpCenterPresenter.5.1
                        @Override // zendesk.core.RetryAction
                        public void onRetry() {
                            HelpCenterPresenter.this.view.hideLoadingState();
                        }
                    });
                }
                HelpCenterPresenter.this.helpCenterSettings = helpCenterSettings;
                if (helpCenterSettings.isEnabled()) {
                    C33694Ix2.m101457b("HelpCenterActivity", "Help center is enabled. starting with Help Center", new Object[0]);
                    if (HelpCenterPresenter.this.view != null) {
                        HelpCenterPresenter.this.view.showHelp(HelpCenterPresenter.this.config);
                    } else {
                        HelpCenterPresenter.this.internalRetryActions.add(new RetryAction() { // from class: zendesk.support.guide.HelpCenterPresenter.5.2
                            @Override // zendesk.core.RetryAction
                            public void onRetry() {
                                HelpCenterPresenter.this.view.showHelp(HelpCenterPresenter.this.config);
                            }
                        });
                    }
                    if (HelpCenterPresenter.this.shouldShowContactUsButton()) {
                        C33694Ix2.m101457b("HelpCenterActivity", "Saved instance states that we should show the contact FAB", new Object[0]);
                        if (HelpCenterPresenter.this.view != null) {
                            HelpCenterPresenter.this.view.showContactUsButton();
                            return;
                        } else {
                            HelpCenterPresenter.this.internalRetryActions.add(new RetryAction() { // from class: zendesk.support.guide.HelpCenterPresenter.5.3
                                @Override // zendesk.core.RetryAction
                                public void onRetry() {
                                    HelpCenterPresenter.this.view.showContactUsButton();
                                }
                            });
                            return;
                        }
                    }
                    return;
                }
                C33694Ix2.m101457b("HelpCenterActivity", "Help center is disabled", new Object[0]);
                if (HelpCenterPresenter.this.actionHandlerRegistry.handlerByAction("action_conversation_list") != null) {
                    C33694Ix2.m101457b("HelpCenterActivity", "Starting with conversations", new Object[0]);
                    if (HelpCenterPresenter.this.view != null) {
                        HelpCenterPresenter.this.view.showRequestList();
                        HelpCenterPresenter.this.view.exitActivity();
                        return;
                    }
                    HelpCenterPresenter.this.internalRetryActions.add(new RetryAction() { // from class: zendesk.support.guide.HelpCenterPresenter.5.4
                        @Override // zendesk.core.RetryAction
                        public void onRetry() {
                            HelpCenterPresenter.this.view.showRequestList();
                            HelpCenterPresenter.this.view.exitActivity();
                        }
                    });
                } else if (HelpCenterPresenter.this.actionHandlerRegistry.handlerByAction("action_contact_option") != null) {
                    C33694Ix2.m101457b("HelpCenterActivity", "Starting with contact", new Object[0]);
                    if (HelpCenterPresenter.this.view != null) {
                        HelpCenterPresenter.this.view.showContactZendesk();
                        HelpCenterPresenter.this.view.exitActivity();
                        return;
                    }
                    HelpCenterPresenter.this.internalRetryActions.add(new RetryAction() { // from class: zendesk.support.guide.HelpCenterPresenter.5.5
                        @Override // zendesk.core.RetryAction
                        public void onRetry() {
                            HelpCenterPresenter.this.view.showContactZendesk();
                            HelpCenterPresenter.this.view.exitActivity();
                        }
                    });
                } else {
                    C33694Ix2.m101457b("HelpCenterActivity", "Support SDK is not present, nothing to fall back to. Closing Activity.", new Object[0]);
                    if (HelpCenterPresenter.this.view != null) {
                        HelpCenterPresenter.this.view.exitActivity();
                    } else {
                        HelpCenterPresenter.this.internalRetryActions.add(new RetryAction() { // from class: zendesk.support.guide.HelpCenterPresenter.5.6
                            @Override // zendesk.core.RetryAction
                            public void onRetry() {
                                HelpCenterPresenter.this.view.exitActivity();
                            }
                        });
                    }
                }
            }
        });
    }

    @Override // zendesk.support.guide.HelpCenterMvp$Presenter
    public void onErrorWithRetry(final HelpCenterMvp$ErrorType helpCenterMvp$ErrorType, final RetryAction retryAction) {
        HelpCenterMvp$View helpCenterMvp$View = this.view;
        if (helpCenterMvp$View != null) {
            if (helpCenterMvp$View.isShowingHelp()) {
                this.view.hideLoadingState();
                this.view.showLoadArticleErrorWithRetry(helpCenterMvp$ErrorType, retryAction);
                return;
            }
            return;
        }
        this.internalRetryActions.add(new RetryAction() { // from class: zendesk.support.guide.HelpCenterPresenter.3
            @Override // zendesk.core.RetryAction
            public void onRetry() {
                if (HelpCenterPresenter.this.view != null && HelpCenterPresenter.this.view.isShowingHelp()) {
                    HelpCenterPresenter.this.view.hideLoadingState();
                    HelpCenterPresenter.this.view.showLoadArticleErrorWithRetry(helpCenterMvp$ErrorType, retryAction);
                }
            }
        });
    }

    @Override // zendesk.support.guide.HelpCenterMvp$Presenter
    public void onLoad() {
        if (shouldShowContactUsButton()) {
            HelpCenterMvp$View helpCenterMvp$View = this.view;
            if (helpCenterMvp$View != null) {
                helpCenterMvp$View.showContactUsButton();
            } else {
                this.internalRetryActions.add(new RetryAction() { // from class: zendesk.support.guide.HelpCenterPresenter.2
                    @Override // zendesk.core.RetryAction
                    public void onRetry() {
                        HelpCenterPresenter.this.view.showContactUsButton();
                    }
                });
            }
        }
        HelpCenterMvp$View helpCenterMvp$View2 = this.view;
        if (helpCenterMvp$View2 != null) {
            helpCenterMvp$View2.announceContentLoaded();
        }
    }

    @Override // zendesk.core.NetworkAware
    public void onNetworkAvailable() {
        C33694Ix2.m101457b("HelpCenterActivity", "Network is available.", new Object[0]);
        if (!this.networkPreviouslyUnavailable) {
            C33694Ix2.m101457b("HelpCenterActivity", "Network was not previously unavailable, no need to dismiss Snackbar", new Object[0]);
            return;
        }
        this.networkPreviouslyUnavailable = false;
        HelpCenterMvp$View helpCenterMvp$View = this.view;
        if (helpCenterMvp$View != null) {
            helpCenterMvp$View.setSearchEnabled(true);
            this.view.dismissError();
            return;
        }
        this.internalRetryActions.add(new RetryAction() { // from class: zendesk.support.guide.HelpCenterPresenter.4
            @Override // zendesk.core.RetryAction
            public void onRetry() {
                HelpCenterPresenter.this.view.dismissError();
            }
        });
    }

    @Override // zendesk.core.NetworkAware
    public void onNetworkUnavailable() {
        C33694Ix2.m101457b("HelpCenterActivity", "Network is unavailable.", new Object[0]);
        this.networkPreviouslyUnavailable = true;
        HelpCenterMvp$View helpCenterMvp$View = this.view;
        if (helpCenterMvp$View != null) {
            helpCenterMvp$View.setSearchEnabled(false);
            this.view.showNoConnectionError();
            this.view.hideLoadingState();
        }
    }

    @Override // zendesk.support.guide.HelpCenterMvp$Presenter
    public void onPause() {
        this.view = null;
        this.networkInfoProvider.removeNetworkAwareListener(NETWORK_AWARE_ID);
        this.networkInfoProvider.removeRetryAction(RETRY_ACTION_ID);
        this.networkInfoProvider.unregister();
    }

    @Override // zendesk.support.guide.HelpCenterMvp$Presenter
    public void onResume(HelpCenterMvp$View helpCenterMvp$View) {
        this.view = helpCenterMvp$View;
        this.networkInfoProvider.addNetworkAwareListener(NETWORK_AWARE_ID, this);
        this.networkInfoProvider.register();
        if (!this.networkInfoProvider.isNetworkAvailable()) {
            helpCenterMvp$View.showNoConnectionError();
            helpCenterMvp$View.hideLoadingState();
            this.networkPreviouslyUnavailable = true;
        }
        invokeRetryActions();
    }

    @Override // zendesk.support.guide.HelpCenterMvp$Presenter
    public void onSearchSubmit(final String str) {
        if (this.networkInfoProvider.isNetworkAvailable()) {
            this.view.dismissError();
            this.view.showLoadingState();
            this.view.clearSearchResults();
            this.model.search(this.config.getCategoryIds(), this.config.getSectionIds(), str, this.config.getLabelNames(), new ViewSafeRetryZendeskCallback(str));
            return;
        }
        this.networkInfoProvider.addRetryAction(RETRY_ACTION_ID, new RetryAction() { // from class: zendesk.support.guide.HelpCenterPresenter.1
            @Override // zendesk.core.RetryAction
            public void onRetry() {
                HelpCenterPresenter.this.onSearchSubmit(str);
            }
        });
    }

    public boolean shouldShowContactUsButton() {
        boolean z;
        if (this.actionHandlerRegistry.handlerByAction("action_contact_option") != null) {
            z = true;
        } else {
            z = false;
        }
        boolean m29948i = C43505jm0.m29948i(this.engines);
        if (this.config.isContactUsButtonVisible() && (z || m29948i)) {
            return true;
        }
        return false;
    }

    @Override // zendesk.support.guide.HelpCenterMvp$Presenter
    public boolean shouldShowConversationsMenuItem() {
        if (this.actionHandlerRegistry.handlerByAction("action_conversation_list") != null && this.config.isShowConversationsMenuButton()) {
            return true;
        }
        return false;
    }

    @Override // zendesk.support.guide.HelpCenterMvp$Presenter
    public boolean shouldShowSearchMenuItem() {
        HelpCenterSettings helpCenterSettings = this.helpCenterSettings;
        return helpCenterSettings != null && helpCenterSettings.isEnabled();
    }
}
