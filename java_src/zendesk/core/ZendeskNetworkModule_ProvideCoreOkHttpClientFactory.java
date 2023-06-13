package zendesk.core;

import okhttp3.OkHttpClient;
/* loaded from: classes8.dex */
public final class ZendeskNetworkModule_ProvideCoreOkHttpClientFactory implements InterfaceC48812sj1<OkHttpClient> {
    private final Y94<AcceptHeaderInterceptor> acceptHeaderInterceptorProvider;
    private final Y94<AcceptLanguageHeaderInterceptor> acceptLanguageHeaderInterceptorProvider;
    private final ZendeskNetworkModule module;
    private final Y94<OkHttpClient> okHttpClientProvider;

    public ZendeskNetworkModule_ProvideCoreOkHttpClientFactory(ZendeskNetworkModule zendeskNetworkModule, Y94<OkHttpClient> y94, Y94<AcceptLanguageHeaderInterceptor> y942, Y94<AcceptHeaderInterceptor> y943) {
        this.module = zendeskNetworkModule;
        this.okHttpClientProvider = y94;
        this.acceptLanguageHeaderInterceptorProvider = y942;
        this.acceptHeaderInterceptorProvider = y943;
    }

    public static ZendeskNetworkModule_ProvideCoreOkHttpClientFactory create(ZendeskNetworkModule zendeskNetworkModule, Y94<OkHttpClient> y94, Y94<AcceptLanguageHeaderInterceptor> y942, Y94<AcceptHeaderInterceptor> y943) {
        return new ZendeskNetworkModule_ProvideCoreOkHttpClientFactory(zendeskNetworkModule, y94, y942, y943);
    }

    public static OkHttpClient provideCoreOkHttpClient(ZendeskNetworkModule zendeskNetworkModule, OkHttpClient okHttpClient, Object obj, Object obj2) {
        return (OkHttpClient) C51679xZ3.m5002e(zendeskNetworkModule.provideCoreOkHttpClient(okHttpClient, (AcceptLanguageHeaderInterceptor) obj, (AcceptHeaderInterceptor) obj2));
    }

    @Override // p000.Y94
    public OkHttpClient get() {
        return provideCoreOkHttpClient(this.module, this.okHttpClientProvider.get(), this.acceptLanguageHeaderInterceptorProvider.get(), this.acceptHeaderInterceptorProvider.get());
    }
}
