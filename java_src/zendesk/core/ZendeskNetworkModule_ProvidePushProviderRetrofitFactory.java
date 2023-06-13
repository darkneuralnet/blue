package zendesk.core;

import okhttp3.OkHttpClient;
/* loaded from: classes8.dex */
public final class ZendeskNetworkModule_ProvidePushProviderRetrofitFactory implements InterfaceC48812sj1<MN4> {
    private final Y94<ZendeskAuthHeaderInterceptor> authHeaderInterceptorProvider;
    private final Y94<ApplicationConfiguration> configurationProvider;
    private final Y94<C46153oE1> gsonProvider;
    private final Y94<OkHttpClient> okHttpClientProvider;

    public ZendeskNetworkModule_ProvidePushProviderRetrofitFactory(Y94<ApplicationConfiguration> y94, Y94<C46153oE1> y942, Y94<OkHttpClient> y943, Y94<ZendeskAuthHeaderInterceptor> y944) {
        this.configurationProvider = y94;
        this.gsonProvider = y942;
        this.okHttpClientProvider = y943;
        this.authHeaderInterceptorProvider = y944;
    }

    public static ZendeskNetworkModule_ProvidePushProviderRetrofitFactory create(Y94<ApplicationConfiguration> y94, Y94<C46153oE1> y942, Y94<OkHttpClient> y943, Y94<ZendeskAuthHeaderInterceptor> y944) {
        return new ZendeskNetworkModule_ProvidePushProviderRetrofitFactory(y94, y942, y943, y944);
    }

    public static MN4 providePushProviderRetrofit(ApplicationConfiguration applicationConfiguration, C46153oE1 c46153oE1, OkHttpClient okHttpClient, Object obj) {
        return (MN4) C51679xZ3.m5002e(ZendeskNetworkModule.providePushProviderRetrofit(applicationConfiguration, c46153oE1, okHttpClient, (ZendeskAuthHeaderInterceptor) obj));
    }

    @Override // p000.Y94
    public MN4 get() {
        return providePushProviderRetrofit(this.configurationProvider.get(), this.gsonProvider.get(), this.okHttpClientProvider.get(), this.authHeaderInterceptorProvider.get());
    }
}
