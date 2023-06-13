package zendesk.core;

import java.util.concurrent.ExecutorService;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
/* loaded from: classes8.dex */
public final class ZendeskNetworkModule_ProvideBaseOkHttpClientFactory implements InterfaceC48812sj1<OkHttpClient> {
    private final Y94<ExecutorService> executorServiceProvider;
    private final Y94<HttpLoggingInterceptor> loggingInterceptorProvider;
    private final ZendeskNetworkModule module;
    private final Y94<ZendeskOauthIdHeaderInterceptor> oauthIdHeaderInterceptorProvider;
    private final Y94<UserAgentAndClientHeadersInterceptor> userAgentAndClientHeadersInterceptorProvider;

    public ZendeskNetworkModule_ProvideBaseOkHttpClientFactory(ZendeskNetworkModule zendeskNetworkModule, Y94<HttpLoggingInterceptor> y94, Y94<ZendeskOauthIdHeaderInterceptor> y942, Y94<UserAgentAndClientHeadersInterceptor> y943, Y94<ExecutorService> y944) {
        this.module = zendeskNetworkModule;
        this.loggingInterceptorProvider = y94;
        this.oauthIdHeaderInterceptorProvider = y942;
        this.userAgentAndClientHeadersInterceptorProvider = y943;
        this.executorServiceProvider = y944;
    }

    public static ZendeskNetworkModule_ProvideBaseOkHttpClientFactory create(ZendeskNetworkModule zendeskNetworkModule, Y94<HttpLoggingInterceptor> y94, Y94<ZendeskOauthIdHeaderInterceptor> y942, Y94<UserAgentAndClientHeadersInterceptor> y943, Y94<ExecutorService> y944) {
        return new ZendeskNetworkModule_ProvideBaseOkHttpClientFactory(zendeskNetworkModule, y94, y942, y943, y944);
    }

    public static OkHttpClient provideBaseOkHttpClient(ZendeskNetworkModule zendeskNetworkModule, HttpLoggingInterceptor httpLoggingInterceptor, Object obj, Object obj2, ExecutorService executorService) {
        return (OkHttpClient) C51679xZ3.m5002e(zendeskNetworkModule.provideBaseOkHttpClient(httpLoggingInterceptor, (ZendeskOauthIdHeaderInterceptor) obj, (UserAgentAndClientHeadersInterceptor) obj2, executorService));
    }

    @Override // p000.Y94
    public OkHttpClient get() {
        return provideBaseOkHttpClient(this.module, this.loggingInterceptorProvider.get(), this.oauthIdHeaderInterceptorProvider.get(), this.userAgentAndClientHeadersInterceptorProvider.get(), this.executorServiceProvider.get());
    }
}
