package zendesk.core;

import okhttp3.OkHttpClient;
/* loaded from: classes8.dex */
public final class ZendeskNetworkModule_ProvideRetrofitFactory implements InterfaceC48812sj1<MN4> {
    private final Y94<ApplicationConfiguration> configurationProvider;
    private final Y94<C46153oE1> gsonProvider;
    private final Y94<OkHttpClient> okHttpClientProvider;

    public ZendeskNetworkModule_ProvideRetrofitFactory(Y94<ApplicationConfiguration> y94, Y94<C46153oE1> y942, Y94<OkHttpClient> y943) {
        this.configurationProvider = y94;
        this.gsonProvider = y942;
        this.okHttpClientProvider = y943;
    }

    public static ZendeskNetworkModule_ProvideRetrofitFactory create(Y94<ApplicationConfiguration> y94, Y94<C46153oE1> y942, Y94<OkHttpClient> y943) {
        return new ZendeskNetworkModule_ProvideRetrofitFactory(y94, y942, y943);
    }

    public static MN4 provideRetrofit(ApplicationConfiguration applicationConfiguration, C46153oE1 c46153oE1, OkHttpClient okHttpClient) {
        return (MN4) C51679xZ3.m5002e(ZendeskNetworkModule.provideRetrofit(applicationConfiguration, c46153oE1, okHttpClient));
    }

    @Override // p000.Y94
    public MN4 get() {
        return provideRetrofit(this.configurationProvider.get(), this.gsonProvider.get(), this.okHttpClientProvider.get());
    }
}
