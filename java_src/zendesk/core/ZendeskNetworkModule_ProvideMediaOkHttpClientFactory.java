package zendesk.core;

import okhttp3.OkHttpClient;
/* loaded from: classes8.dex */
public final class ZendeskNetworkModule_ProvideMediaOkHttpClientFactory implements InterfaceC48812sj1<OkHttpClient> {
    private final Y94<ZendeskAccessInterceptor> accessInterceptorProvider;
    private final Y94<ZendeskAuthHeaderInterceptor> authHeaderInterceptorProvider;
    private final Y94<CachingInterceptor> cachingInterceptorProvider;
    private final ZendeskNetworkModule module;
    private final Y94<OkHttpClient> okHttpClientProvider;
    private final Y94<ZendeskSettingsInterceptor> settingsInterceptorProvider;
    private final Y94<ZendeskUnauthorizedInterceptor> unauthorizedInterceptorProvider;

    public ZendeskNetworkModule_ProvideMediaOkHttpClientFactory(ZendeskNetworkModule zendeskNetworkModule, Y94<OkHttpClient> y94, Y94<ZendeskAccessInterceptor> y942, Y94<ZendeskAuthHeaderInterceptor> y943, Y94<ZendeskSettingsInterceptor> y944, Y94<CachingInterceptor> y945, Y94<ZendeskUnauthorizedInterceptor> y946) {
        this.module = zendeskNetworkModule;
        this.okHttpClientProvider = y94;
        this.accessInterceptorProvider = y942;
        this.authHeaderInterceptorProvider = y943;
        this.settingsInterceptorProvider = y944;
        this.cachingInterceptorProvider = y945;
        this.unauthorizedInterceptorProvider = y946;
    }

    public static ZendeskNetworkModule_ProvideMediaOkHttpClientFactory create(ZendeskNetworkModule zendeskNetworkModule, Y94<OkHttpClient> y94, Y94<ZendeskAccessInterceptor> y942, Y94<ZendeskAuthHeaderInterceptor> y943, Y94<ZendeskSettingsInterceptor> y944, Y94<CachingInterceptor> y945, Y94<ZendeskUnauthorizedInterceptor> y946) {
        return new ZendeskNetworkModule_ProvideMediaOkHttpClientFactory(zendeskNetworkModule, y94, y942, y943, y944, y945, y946);
    }

    public static OkHttpClient provideMediaOkHttpClient(ZendeskNetworkModule zendeskNetworkModule, OkHttpClient okHttpClient, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return (OkHttpClient) C51679xZ3.m5002e(zendeskNetworkModule.provideMediaOkHttpClient(okHttpClient, (ZendeskAccessInterceptor) obj, (ZendeskAuthHeaderInterceptor) obj2, (ZendeskSettingsInterceptor) obj3, (CachingInterceptor) obj4, (ZendeskUnauthorizedInterceptor) obj5));
    }

    @Override // p000.Y94
    public OkHttpClient get() {
        return provideMediaOkHttpClient(this.module, this.okHttpClientProvider.get(), this.accessInterceptorProvider.get(), this.authHeaderInterceptorProvider.get(), this.settingsInterceptorProvider.get(), this.cachingInterceptorProvider.get(), this.unauthorizedInterceptorProvider.get());
    }
}
