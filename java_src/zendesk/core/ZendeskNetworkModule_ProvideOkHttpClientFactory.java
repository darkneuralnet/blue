package zendesk.core;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
/* loaded from: classes8.dex */
public final class ZendeskNetworkModule_ProvideOkHttpClientFactory implements InterfaceC48812sj1<OkHttpClient> {
    private final Y94<AcceptHeaderInterceptor> acceptHeaderInterceptorProvider;
    private final Y94<ZendeskAccessInterceptor> accessInterceptorProvider;
    private final Y94<ZendeskAuthHeaderInterceptor> authHeaderInterceptorProvider;
    private final Y94<Cache> cacheProvider;
    private final ZendeskNetworkModule module;
    private final Y94<OkHttpClient> okHttpClientProvider;
    private final Y94<ZendeskPushInterceptor> pushInterceptorProvider;
    private final Y94<ZendeskSettingsInterceptor> settingsInterceptorProvider;
    private final Y94<ZendeskUnauthorizedInterceptor> unauthorizedInterceptorProvider;

    public ZendeskNetworkModule_ProvideOkHttpClientFactory(ZendeskNetworkModule zendeskNetworkModule, Y94<OkHttpClient> y94, Y94<ZendeskAccessInterceptor> y942, Y94<ZendeskUnauthorizedInterceptor> y943, Y94<ZendeskAuthHeaderInterceptor> y944, Y94<ZendeskSettingsInterceptor> y945, Y94<AcceptHeaderInterceptor> y946, Y94<ZendeskPushInterceptor> y947, Y94<Cache> y948) {
        this.module = zendeskNetworkModule;
        this.okHttpClientProvider = y94;
        this.accessInterceptorProvider = y942;
        this.unauthorizedInterceptorProvider = y943;
        this.authHeaderInterceptorProvider = y944;
        this.settingsInterceptorProvider = y945;
        this.acceptHeaderInterceptorProvider = y946;
        this.pushInterceptorProvider = y947;
        this.cacheProvider = y948;
    }

    public static ZendeskNetworkModule_ProvideOkHttpClientFactory create(ZendeskNetworkModule zendeskNetworkModule, Y94<OkHttpClient> y94, Y94<ZendeskAccessInterceptor> y942, Y94<ZendeskUnauthorizedInterceptor> y943, Y94<ZendeskAuthHeaderInterceptor> y944, Y94<ZendeskSettingsInterceptor> y945, Y94<AcceptHeaderInterceptor> y946, Y94<ZendeskPushInterceptor> y947, Y94<Cache> y948) {
        return new ZendeskNetworkModule_ProvideOkHttpClientFactory(zendeskNetworkModule, y94, y942, y943, y944, y945, y946, y947, y948);
    }

    public static OkHttpClient provideOkHttpClient(ZendeskNetworkModule zendeskNetworkModule, OkHttpClient okHttpClient, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Cache cache) {
        return (OkHttpClient) C51679xZ3.m5002e(zendeskNetworkModule.provideOkHttpClient(okHttpClient, (ZendeskAccessInterceptor) obj, (ZendeskUnauthorizedInterceptor) obj2, (ZendeskAuthHeaderInterceptor) obj3, (ZendeskSettingsInterceptor) obj4, (AcceptHeaderInterceptor) obj5, (ZendeskPushInterceptor) obj6, cache));
    }

    @Override // p000.Y94
    public OkHttpClient get() {
        return provideOkHttpClient(this.module, this.okHttpClientProvider.get(), this.accessInterceptorProvider.get(), this.unauthorizedInterceptorProvider.get(), this.authHeaderInterceptorProvider.get(), this.settingsInterceptorProvider.get(), this.acceptHeaderInterceptorProvider.get(), this.pushInterceptorProvider.get(), this.cacheProvider.get());
    }
}
