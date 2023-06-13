package zendesk.support;

import zendesk.core.AuthenticationProvider;
/* loaded from: classes8.dex */
public final class ProviderModule_ProvideRequestProviderFactory implements InterfaceC48812sj1<RequestProvider> {
    private final Y94<AuthenticationProvider> authenticationProvider;
    private final Y94<SupportBlipsProvider> blipsProvider;
    private final ProviderModule module;
    private final Y94<ZendeskRequestService> requestServiceProvider;
    private final Y94<RequestSessionCache> requestSessionCacheProvider;
    private final Y94<RequestStorage> requestStorageProvider;
    private final Y94<SupportSettingsProvider> settingsProvider;
    private final Y94<SupportSdkMetadata> supportSdkMetadataProvider;
    private final Y94<ZendeskTracker> zendeskTrackerProvider;

    public ProviderModule_ProvideRequestProviderFactory(ProviderModule providerModule, Y94<SupportSettingsProvider> y94, Y94<AuthenticationProvider> y942, Y94<ZendeskRequestService> y943, Y94<RequestStorage> y944, Y94<RequestSessionCache> y945, Y94<ZendeskTracker> y946, Y94<SupportSdkMetadata> y947, Y94<SupportBlipsProvider> y948) {
        this.module = providerModule;
        this.settingsProvider = y94;
        this.authenticationProvider = y942;
        this.requestServiceProvider = y943;
        this.requestStorageProvider = y944;
        this.requestSessionCacheProvider = y945;
        this.zendeskTrackerProvider = y946;
        this.supportSdkMetadataProvider = y947;
        this.blipsProvider = y948;
    }

    public static ProviderModule_ProvideRequestProviderFactory create(ProviderModule providerModule, Y94<SupportSettingsProvider> y94, Y94<AuthenticationProvider> y942, Y94<ZendeskRequestService> y943, Y94<RequestStorage> y944, Y94<RequestSessionCache> y945, Y94<ZendeskTracker> y946, Y94<SupportSdkMetadata> y947, Y94<SupportBlipsProvider> y948) {
        return new ProviderModule_ProvideRequestProviderFactory(providerModule, y94, y942, y943, y944, y945, y946, y947, y948);
    }

    public static RequestProvider provideRequestProvider(ProviderModule providerModule, SupportSettingsProvider supportSettingsProvider, AuthenticationProvider authenticationProvider, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, SupportBlipsProvider supportBlipsProvider) {
        return (RequestProvider) C51679xZ3.m5002e(providerModule.provideRequestProvider(supportSettingsProvider, authenticationProvider, (ZendeskRequestService) obj, (RequestStorage) obj2, (RequestSessionCache) obj3, (ZendeskTracker) obj4, (SupportSdkMetadata) obj5, supportBlipsProvider));
    }

    @Override // p000.Y94
    public RequestProvider get() {
        return provideRequestProvider(this.module, this.settingsProvider.get(), this.authenticationProvider.get(), this.requestServiceProvider.get(), this.requestStorageProvider.get(), this.requestSessionCacheProvider.get(), this.zendeskTrackerProvider.get(), this.supportSdkMetadataProvider.get(), this.blipsProvider.get());
    }
}
