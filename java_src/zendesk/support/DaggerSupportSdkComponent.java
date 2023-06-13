package zendesk.support;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import okhttp3.OkHttpClient;
import zendesk.belvedere.C31096a;
import zendesk.core.ActionHandler;
import zendesk.core.ActionHandlerRegistry;
import zendesk.core.AuthenticationProvider;
import zendesk.core.CoreModule;
import zendesk.core.CoreModule_ActionHandlerRegistryFactory;
import zendesk.core.CoreModule_GetApplicationContextFactory;
import zendesk.core.CoreModule_GetAuthenticationProviderFactory;
import zendesk.core.CoreModule_GetExecutorServiceFactory;
import zendesk.core.CoreModule_GetMemoryCacheFactory;
import zendesk.core.CoreModule_GetSessionStorageFactory;
import zendesk.core.MemoryCache;
import zendesk.core.SessionStorage;
import zendesk.support.request.RequestActivity;
import zendesk.support.request.RequestActivity_MembersInjector;
import zendesk.support.request.RequestComponent;
import zendesk.support.request.RequestModule;
import zendesk.support.request.RequestModule_ProvidesActionFactoryFactory;
import zendesk.support.request.RequestModule_ProvidesAsyncMiddlewareFactory;
import zendesk.support.request.RequestModule_ProvidesAttachmentDownloaderComponentFactory;
import zendesk.support.request.RequestModule_ProvidesAttachmentDownloaderFactory;
import zendesk.support.request.RequestModule_ProvidesAttachmentToDiskServiceFactory;
import zendesk.support.request.RequestModule_ProvidesBelvedereFactory;
import zendesk.support.request.RequestModule_ProvidesComponentListenerFactory;
import zendesk.support.request.RequestModule_ProvidesConUpdatesComponentFactory;
import zendesk.support.request.RequestModule_ProvidesDiskQueueFactory;
import zendesk.support.request.RequestModule_ProvidesDispatcherFactory;
import zendesk.support.request.RequestModule_ProvidesMessageFactoryFactory;
import zendesk.support.request.RequestModule_ProvidesPersistenceComponentFactory;
import zendesk.support.request.RequestModule_ProvidesReducerFactory;
import zendesk.support.request.RequestModule_ProvidesStoreFactory;
import zendesk.support.request.RequestViewConversationsDisabled;
import zendesk.support.request.RequestViewConversationsDisabled_MembersInjector;
import zendesk.support.request.RequestViewConversationsEnabled;
import zendesk.support.request.RequestViewConversationsEnabled_MembersInjector;
import zendesk.support.requestlist.RequestInfoDataSource;
import zendesk.support.requestlist.RequestListActivity;
import zendesk.support.requestlist.RequestListActivity_MembersInjector;
import zendesk.support.requestlist.RequestListComponent;
import zendesk.support.requestlist.RequestListModule;
import zendesk.support.requestlist.RequestListModule_ModelFactory;
import zendesk.support.requestlist.RequestListModule_PresenterFactory;
import zendesk.support.requestlist.RequestListModule_RefreshHandlerFactory;
import zendesk.support.requestlist.RequestListModule_RepositoryFactory;
import zendesk.support.requestlist.RequestListViewModule;
import zendesk.support.requestlist.RequestListViewModule_ViewFactory;
import zendesk.support.suas.Dispatcher;
import zendesk.support.suas.Reducer;
import zendesk.support.suas.Store;
/* loaded from: classes8.dex */
public final class DaggerSupportSdkComponent implements SupportSdkComponent {
    private Y94<ActionHandlerRegistry> actionHandlerRegistryProvider;
    private Y94<C32054Bx0> configurationHelperProvider;
    private final CoreModule coreModule;
    private Y94<Context> getApplicationContextProvider;
    private Y94<AuthenticationProvider> getAuthenticationProvider;
    private Y94<ExecutorService> getExecutorServiceProvider;
    private Y94<MemoryCache> getMemoryCacheProvider;
    private Y94<SessionStorage> getSessionStorageProvider;
    private Y94<Executor> mainThreadExecutorProvider;
    private Y94<C33992Ke3> okHttp3DownloaderProvider;
    private Y94<List<ActionHandler>> providesActionHandlersProvider;
    private Y94<SupportBlipsProvider> providesBlipsProvider;
    private Y94<OkHttpClient> providesOkHttpClientProvider;
    private Y94<C42732iT3> providesPicassoProvider;
    private Y94<C46153oE1> providesProvider;
    private Y94<F41> providesRequestDiskLruCacheProvider;
    private Y94<RequestProvider> providesRequestProvider;
    private Y94<SupportSettingsProvider> providesSettingsProvider;
    private Y94<UploadProvider> providesUploadProvider;
    private Y94<RequestInfoDataSource.LocalDataSource> requestInfoDataSourceProvider;
    private final DaggerSupportSdkComponent supportSdkComponent;
    private Y94<SupportUiStorage> supportUiStorageProvider;

    /* loaded from: classes8.dex */
    public static final class Builder {
        private CoreModule coreModule;
        private SupportModule supportModule;
        private SupportSdkModule supportSdkModule;

        public SupportSdkComponent build() {
            C51679xZ3.m5006a(this.coreModule, CoreModule.class);
            C51679xZ3.m5006a(this.supportModule, SupportModule.class);
            if (this.supportSdkModule == null) {
                this.supportSdkModule = new SupportSdkModule();
            }
            return new DaggerSupportSdkComponent(this.coreModule, this.supportModule, this.supportSdkModule);
        }

        public Builder coreModule(CoreModule coreModule) {
            this.coreModule = (CoreModule) C51679xZ3.m5005b(coreModule);
            return this;
        }

        public Builder supportModule(SupportModule supportModule) {
            this.supportModule = (SupportModule) C51679xZ3.m5005b(supportModule);
            return this;
        }

        public Builder supportSdkModule(SupportSdkModule supportSdkModule) {
            this.supportSdkModule = (SupportSdkModule) C51679xZ3.m5005b(supportSdkModule);
            return this;
        }

        private Builder() {
        }
    }

    /* loaded from: classes8.dex */
    public static final class RequestComponentImpl implements RequestComponent {
        private Y94 providesActionFactoryProvider;
        private Y94 providesAsyncMiddlewareProvider;
        private Y94 providesAttachmentDownloaderComponentProvider;
        private Y94 providesAttachmentDownloaderProvider;
        private Y94 providesAttachmentToDiskServiceProvider;
        private Y94<C31096a> providesBelvedereProvider;
        private Y94 providesComponentListenerProvider;
        private Y94 providesConUpdatesComponentProvider;
        private Y94 providesDiskQueueProvider;
        private Y94<Dispatcher> providesDispatcherProvider;
        private Y94 providesMessageFactoryProvider;
        private Y94 providesPersistenceComponentProvider;
        private Y94<List<Reducer>> providesReducerProvider;
        private Y94<Store> providesStoreProvider;
        private final RequestComponentImpl requestComponentImpl;
        private final DaggerSupportSdkComponent supportSdkComponent;

        private void initialize(RequestModule requestModule) {
            this.providesReducerProvider = V51.m80429b(RequestModule_ProvidesReducerFactory.create());
            Y94 m80429b = V51.m80429b(RequestModule_ProvidesAsyncMiddlewareFactory.create());
            this.providesAsyncMiddlewareProvider = m80429b;
            this.providesStoreProvider = V51.m80429b(RequestModule_ProvidesStoreFactory.create(this.providesReducerProvider, m80429b));
            this.providesBelvedereProvider = V51.m80429b(RequestModule_ProvidesBelvedereFactory.create(this.supportSdkComponent.getApplicationContextProvider));
            this.providesActionFactoryProvider = V51.m80429b(RequestModule_ProvidesActionFactoryFactory.create(this.supportSdkComponent.providesRequestProvider, this.supportSdkComponent.providesSettingsProvider, this.supportSdkComponent.providesUploadProvider, this.providesBelvedereProvider, this.supportSdkComponent.supportUiStorageProvider, this.supportSdkComponent.getExecutorServiceProvider, this.supportSdkComponent.mainThreadExecutorProvider, this.supportSdkComponent.getAuthenticationProvider, this.supportSdkComponent.providesBlipsProvider));
            this.providesDiskQueueProvider = V51.m80429b(RequestModule_ProvidesDiskQueueFactory.create(this.supportSdkComponent.getExecutorServiceProvider));
            this.providesPersistenceComponentProvider = V51.m80429b(RequestModule_ProvidesPersistenceComponentFactory.create(this.supportSdkComponent.supportUiStorageProvider, this.providesDiskQueueProvider, this.supportSdkComponent.getExecutorServiceProvider));
            this.providesDispatcherProvider = V51.m80429b(RequestModule_ProvidesDispatcherFactory.create(this.providesStoreProvider));
            Y94 m80429b2 = V51.m80429b(RequestModule_ProvidesAttachmentToDiskServiceFactory.create(this.supportSdkComponent.providesOkHttpClientProvider, this.supportSdkComponent.getExecutorServiceProvider));
            this.providesAttachmentToDiskServiceProvider = m80429b2;
            Y94 m80429b3 = V51.m80429b(RequestModule_ProvidesAttachmentDownloaderFactory.create(this.providesBelvedereProvider, m80429b2));
            this.providesAttachmentDownloaderProvider = m80429b3;
            this.providesAttachmentDownloaderComponentProvider = V51.m80429b(RequestModule_ProvidesAttachmentDownloaderComponentFactory.create(this.providesDispatcherProvider, this.providesActionFactoryProvider, m80429b3));
            Y94 m34371a = C42572iB5.m34371a(RequestModule_ProvidesConUpdatesComponentFactory.create(this.supportSdkComponent.getApplicationContextProvider, this.supportSdkComponent.actionHandlerRegistryProvider, this.supportSdkComponent.requestInfoDataSourceProvider));
            this.providesConUpdatesComponentProvider = m34371a;
            this.providesComponentListenerProvider = V51.m80429b(RequestModule_ProvidesComponentListenerFactory.create(this.providesPersistenceComponentProvider, this.providesAttachmentDownloaderComponentProvider, m34371a));
            this.providesMessageFactoryProvider = V51.m80429b(RequestModule_ProvidesMessageFactoryFactory.create(requestModule, this.supportSdkComponent.getApplicationContextProvider, this.supportSdkComponent.providesPicassoProvider, this.providesActionFactoryProvider, this.providesDispatcherProvider, this.supportSdkComponent.actionHandlerRegistryProvider, this.supportSdkComponent.configurationHelperProvider));
        }

        private RequestActivity injectRequestActivity(RequestActivity requestActivity) {
            RequestActivity_MembersInjector.injectStore(requestActivity, this.providesStoreProvider.get());
            RequestActivity_MembersInjector.injectAf(requestActivity, this.providesActionFactoryProvider.get());
            RequestActivity_MembersInjector.injectHeadlessComponentListener(requestActivity, this.providesComponentListenerProvider.get());
            RequestActivity_MembersInjector.injectPicasso(requestActivity, (C42732iT3) this.supportSdkComponent.providesPicassoProvider.get());
            RequestActivity_MembersInjector.injectActionHandlerRegistry(requestActivity, CoreModule_ActionHandlerRegistryFactory.actionHandlerRegistry(this.supportSdkComponent.coreModule));
            return requestActivity;
        }

        private RequestViewConversationsDisabled injectRequestViewConversationsDisabled(RequestViewConversationsDisabled requestViewConversationsDisabled) {
            RequestViewConversationsDisabled_MembersInjector.injectStore(requestViewConversationsDisabled, this.providesStoreProvider.get());
            RequestViewConversationsDisabled_MembersInjector.injectAf(requestViewConversationsDisabled, this.providesActionFactoryProvider.get());
            RequestViewConversationsDisabled_MembersInjector.injectPicasso(requestViewConversationsDisabled, (C42732iT3) this.supportSdkComponent.providesPicassoProvider.get());
            return requestViewConversationsDisabled;
        }

        private RequestViewConversationsEnabled injectRequestViewConversationsEnabled(RequestViewConversationsEnabled requestViewConversationsEnabled) {
            RequestViewConversationsEnabled_MembersInjector.injectStore(requestViewConversationsEnabled, this.providesStoreProvider.get());
            RequestViewConversationsEnabled_MembersInjector.injectAf(requestViewConversationsEnabled, this.providesActionFactoryProvider.get());
            RequestViewConversationsEnabled_MembersInjector.injectCellFactory(requestViewConversationsEnabled, this.providesMessageFactoryProvider.get());
            RequestViewConversationsEnabled_MembersInjector.injectPicasso(requestViewConversationsEnabled, (C42732iT3) this.supportSdkComponent.providesPicassoProvider.get());
            return requestViewConversationsEnabled;
        }

        @Override // zendesk.support.request.RequestComponent
        public void inject(RequestActivity requestActivity) {
            injectRequestActivity(requestActivity);
        }

        private RequestComponentImpl(DaggerSupportSdkComponent daggerSupportSdkComponent, RequestModule requestModule) {
            this.requestComponentImpl = this;
            this.supportSdkComponent = daggerSupportSdkComponent;
            initialize(requestModule);
        }

        @Override // zendesk.support.request.RequestComponent
        public void inject(RequestViewConversationsEnabled requestViewConversationsEnabled) {
            injectRequestViewConversationsEnabled(requestViewConversationsEnabled);
        }

        @Override // zendesk.support.request.RequestComponent
        public void inject(RequestViewConversationsDisabled requestViewConversationsDisabled) {
            injectRequestViewConversationsDisabled(requestViewConversationsDisabled);
        }
    }

    /* loaded from: classes8.dex */
    public static final class RequestListComponentImpl implements RequestListComponent {
        private Y94 modelProvider;
        private Y94 presenterProvider;
        private Y94 refreshHandlerProvider;
        private Y94<RequestInfoDataSource.Repository> repositoryProvider;
        private final RequestListComponentImpl requestListComponentImpl;
        private final DaggerSupportSdkComponent supportSdkComponent;
        private Y94 viewProvider;

        private void initialize(RequestListModule requestListModule, RequestListViewModule requestListViewModule) {
            Y94<RequestInfoDataSource.Repository> m80429b = V51.m80429b(RequestListModule_RepositoryFactory.create(this.supportSdkComponent.requestInfoDataSourceProvider, this.supportSdkComponent.supportUiStorageProvider, this.supportSdkComponent.providesRequestProvider, this.supportSdkComponent.mainThreadExecutorProvider, this.supportSdkComponent.getExecutorServiceProvider));
            this.repositoryProvider = m80429b;
            Y94 m80429b2 = V51.m80429b(RequestListModule_ModelFactory.create(requestListModule, m80429b, this.supportSdkComponent.getMemoryCacheProvider, this.supportSdkComponent.providesBlipsProvider, this.supportSdkComponent.providesSettingsProvider));
            this.modelProvider = m80429b2;
            this.presenterProvider = V51.m80429b(RequestListModule_PresenterFactory.create(requestListModule, m80429b2));
            this.viewProvider = V51.m80429b(RequestListViewModule_ViewFactory.create(requestListViewModule, this.supportSdkComponent.providesPicassoProvider));
            this.refreshHandlerProvider = V51.m80429b(RequestListModule_RefreshHandlerFactory.create(this.presenterProvider));
        }

        private RequestListActivity injectRequestListActivity(RequestListActivity requestListActivity) {
            RequestListActivity_MembersInjector.injectPresenter(requestListActivity, this.presenterProvider.get());
            RequestListActivity_MembersInjector.injectView(requestListActivity, this.viewProvider.get());
            RequestListActivity_MembersInjector.injectModel(requestListActivity, this.modelProvider.get());
            RequestListActivity_MembersInjector.injectActionHandlerRegistry(requestListActivity, CoreModule_ActionHandlerRegistryFactory.actionHandlerRegistry(this.supportSdkComponent.coreModule));
            RequestListActivity_MembersInjector.injectSyncHandler(requestListActivity, this.refreshHandlerProvider.get());
            return requestListActivity;
        }

        @Override // zendesk.support.requestlist.RequestListComponent
        public void inject(RequestListActivity requestListActivity) {
            injectRequestListActivity(requestListActivity);
        }

        private RequestListComponentImpl(DaggerSupportSdkComponent daggerSupportSdkComponent, RequestListModule requestListModule, RequestListViewModule requestListViewModule) {
            this.requestListComponentImpl = this;
            this.supportSdkComponent = daggerSupportSdkComponent;
            initialize(requestListModule, requestListViewModule);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private void initialize(CoreModule coreModule, SupportModule supportModule, SupportSdkModule supportSdkModule) {
        this.providesActionHandlersProvider = V51.m80429b(SupportSdkModule_ProvidesActionHandlersFactory.create(supportSdkModule));
        this.providesRequestProvider = SupportModule_ProvidesRequestProviderFactory.create(supportModule);
        this.providesSettingsProvider = SupportModule_ProvidesSettingsProviderFactory.create(supportModule);
        this.providesUploadProvider = SupportModule_ProvidesUploadProviderFactory.create(supportModule);
        this.getApplicationContextProvider = CoreModule_GetApplicationContextFactory.create(coreModule);
        CoreModule_GetSessionStorageFactory create = CoreModule_GetSessionStorageFactory.create(coreModule);
        this.getSessionStorageProvider = create;
        this.providesRequestDiskLruCacheProvider = V51.m80429b(SupportSdkModule_ProvidesRequestDiskLruCacheFactory.create(supportSdkModule, create));
        Y94<C46153oE1> m80429b = V51.m80429b(SupportSdkModule_ProvidesFactory.create(supportSdkModule));
        this.providesProvider = m80429b;
        this.supportUiStorageProvider = V51.m80429b(SupportSdkModule_SupportUiStorageFactory.create(supportSdkModule, this.providesRequestDiskLruCacheProvider, m80429b));
        this.getExecutorServiceProvider = CoreModule_GetExecutorServiceFactory.create(coreModule);
        this.mainThreadExecutorProvider = V51.m80429b(SupportSdkModule_MainThreadExecutorFactory.create(supportSdkModule));
        this.getAuthenticationProvider = CoreModule_GetAuthenticationProviderFactory.create(coreModule);
        this.providesBlipsProvider = SupportModule_ProvidesBlipsProviderFactory.create(supportModule);
        this.providesOkHttpClientProvider = SupportModule_ProvidesOkHttpClientFactory.create(supportModule);
        this.actionHandlerRegistryProvider = CoreModule_ActionHandlerRegistryFactory.create(coreModule);
        this.requestInfoDataSourceProvider = SupportSdkModule_RequestInfoDataSourceFactory.create(supportSdkModule, this.supportUiStorageProvider, this.mainThreadExecutorProvider, this.getExecutorServiceProvider);
        Y94<C33992Ke3> m80429b2 = V51.m80429b(SupportSdkModule_OkHttp3DownloaderFactory.create(supportSdkModule, this.providesOkHttpClientProvider));
        this.okHttp3DownloaderProvider = m80429b2;
        this.providesPicassoProvider = V51.m80429b(SupportSdkModule_ProvidesPicassoFactory.create(supportSdkModule, this.getApplicationContextProvider, m80429b2, this.getExecutorServiceProvider));
        this.configurationHelperProvider = SupportSdkModule_ConfigurationHelperFactory.create(supportSdkModule);
        this.getMemoryCacheProvider = CoreModule_GetMemoryCacheFactory.create(coreModule);
    }

    private DeepLinkingBroadcastReceiver injectDeepLinkingBroadcastReceiver(DeepLinkingBroadcastReceiver deepLinkingBroadcastReceiver) {
        DeepLinkingBroadcastReceiver_MembersInjector.injectRegistry(deepLinkingBroadcastReceiver, CoreModule_ActionHandlerRegistryFactory.actionHandlerRegistry(this.coreModule));
        return deepLinkingBroadcastReceiver;
    }

    private SdkDependencyProvider injectSdkDependencyProvider(SdkDependencyProvider sdkDependencyProvider) {
        SdkDependencyProvider_MembersInjector.injectRegistry(sdkDependencyProvider, CoreModule_ActionHandlerRegistryFactory.actionHandlerRegistry(this.coreModule));
        SdkDependencyProvider_MembersInjector.injectActionHandlers(sdkDependencyProvider, this.providesActionHandlersProvider.get());
        return sdkDependencyProvider;
    }

    @Override // zendesk.support.SupportSdkComponent
    public void inject(SdkDependencyProvider sdkDependencyProvider) {
        injectSdkDependencyProvider(sdkDependencyProvider);
    }

    @Override // zendesk.support.SupportSdkComponent
    public RequestComponent plus(RequestModule requestModule) {
        C51679xZ3.m5005b(requestModule);
        return new RequestComponentImpl(requestModule);
    }

    private DaggerSupportSdkComponent(CoreModule coreModule, SupportModule supportModule, SupportSdkModule supportSdkModule) {
        this.supportSdkComponent = this;
        this.coreModule = coreModule;
        initialize(coreModule, supportModule, supportSdkModule);
    }

    @Override // zendesk.support.SupportSdkComponent
    public void inject(DeepLinkingBroadcastReceiver deepLinkingBroadcastReceiver) {
        injectDeepLinkingBroadcastReceiver(deepLinkingBroadcastReceiver);
    }

    @Override // zendesk.support.SupportSdkComponent
    public RequestListComponent plus(RequestListModule requestListModule, RequestListViewModule requestListViewModule) {
        C51679xZ3.m5005b(requestListModule);
        C51679xZ3.m5005b(requestListViewModule);
        return new RequestListComponentImpl(requestListModule, requestListViewModule);
    }
}
