package zendesk.core;

import okhttp3.OkHttpClient;
/* loaded from: classes8.dex */
public final class ZendeskNetworkModule_ProvideRestServiceProviderFactory implements InterfaceC48812sj1<RestServiceProvider> {
    private final Y94<OkHttpClient> coreOkHttpClientProvider;
    private final Y94<OkHttpClient> mediaOkHttpClientProvider;
    private final ZendeskNetworkModule module;
    private final Y94<MN4> retrofitProvider;
    private final Y94<OkHttpClient> standardOkHttpClientProvider;

    public ZendeskNetworkModule_ProvideRestServiceProviderFactory(ZendeskNetworkModule zendeskNetworkModule, Y94<MN4> y94, Y94<OkHttpClient> y942, Y94<OkHttpClient> y943, Y94<OkHttpClient> y944) {
        this.module = zendeskNetworkModule;
        this.retrofitProvider = y94;
        this.mediaOkHttpClientProvider = y942;
        this.standardOkHttpClientProvider = y943;
        this.coreOkHttpClientProvider = y944;
    }

    public static ZendeskNetworkModule_ProvideRestServiceProviderFactory create(ZendeskNetworkModule zendeskNetworkModule, Y94<MN4> y94, Y94<OkHttpClient> y942, Y94<OkHttpClient> y943, Y94<OkHttpClient> y944) {
        return new ZendeskNetworkModule_ProvideRestServiceProviderFactory(zendeskNetworkModule, y94, y942, y943, y944);
    }

    public static RestServiceProvider provideRestServiceProvider(ZendeskNetworkModule zendeskNetworkModule, MN4 mn4, OkHttpClient okHttpClient, OkHttpClient okHttpClient2, OkHttpClient okHttpClient3) {
        return (RestServiceProvider) C51679xZ3.m5002e(zendeskNetworkModule.provideRestServiceProvider(mn4, okHttpClient, okHttpClient2, okHttpClient3));
    }

    @Override // p000.Y94
    public RestServiceProvider get() {
        return provideRestServiceProvider(this.module, this.retrofitProvider.get(), this.mediaOkHttpClientProvider.get(), this.standardOkHttpClientProvider.get(), this.coreOkHttpClientProvider.get());
    }
}
