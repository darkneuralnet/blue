package zendesk.core;

import java.util.Iterator;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import p000.MN4;
/* loaded from: classes8.dex */
class ZendeskRestServiceProvider implements RestServiceProvider {
    private final OkHttpClient coreOkHttpClient;
    private final OkHttpClient mediaHttpClient;
    final MN4 retrofit;
    final OkHttpClient standardOkHttpClient;

    public ZendeskRestServiceProvider(MN4 mn4, OkHttpClient okHttpClient, OkHttpClient okHttpClient2, OkHttpClient okHttpClient3) {
        this.retrofit = mn4;
        this.mediaHttpClient = okHttpClient;
        this.standardOkHttpClient = okHttpClient2;
        this.coreOkHttpClient = okHttpClient3;
    }

    private OkHttpClient.Builder createNonAuthenticatedOkHttpClient() {
        OkHttpClient.Builder newBuilder = this.standardOkHttpClient.newBuilder();
        Iterator<Interceptor> it = newBuilder.interceptors().iterator();
        while (it.hasNext()) {
            if (it.next() instanceof ZendeskAuthHeaderInterceptor) {
                it.remove();
            }
        }
        return newBuilder;
    }

    @Override // zendesk.core.RestServiceProvider
    public <E> E createRestService(Class<E> cls, String str, String str2) {
        return (E) this.retrofit.m95383d().m95369g(this.standardOkHttpClient.newBuilder().addInterceptor(new UserAgentAndClientHeadersInterceptor(str, str2)).build()).m95371e().m95385b(cls);
    }

    @Override // zendesk.core.RestServiceProvider
    public <E> E createUnauthenticatedRestService(Class<E> cls, String str, String str2, CustomNetworkConfig customNetworkConfig) {
        OkHttpClient.Builder createNonAuthenticatedOkHttpClient = createNonAuthenticatedOkHttpClient();
        customNetworkConfig.configureOkHttpClient(createNonAuthenticatedOkHttpClient);
        createNonAuthenticatedOkHttpClient.addInterceptor(new UserAgentAndClientHeadersInterceptor(str, str2));
        MN4.C5282b m95383d = this.retrofit.m95383d();
        customNetworkConfig.configureRetrofit(m95383d);
        return (E) m95383d.m95369g(createNonAuthenticatedOkHttpClient.build()).m95371e().m95385b(cls);
    }

    @Override // zendesk.core.RestServiceProvider
    public OkHttpClient getCoreOkHttpClient() {
        return this.coreOkHttpClient;
    }

    @Override // zendesk.core.RestServiceProvider
    public OkHttpClient getMediaOkHttpClient() {
        return this.mediaHttpClient;
    }

    @Override // zendesk.core.RestServiceProvider
    public <E> E createRestService(Class<E> cls, String str, String str2, CustomNetworkConfig customNetworkConfig) {
        OkHttpClient.Builder newBuilder = this.standardOkHttpClient.newBuilder();
        customNetworkConfig.configureOkHttpClient(newBuilder);
        newBuilder.addInterceptor(new UserAgentAndClientHeadersInterceptor(str, str2));
        MN4.C5282b m95383d = this.retrofit.m95383d();
        customNetworkConfig.configureRetrofit(m95383d);
        return (E) m95383d.m95369g(newBuilder.build()).m95371e().m95385b(cls);
    }
}
