package zendesk.support;

import okhttp3.OkHttpClient;
/* loaded from: classes8.dex */
public final class SupportModule_ProvidesOkHttpClientFactory implements InterfaceC48812sj1<OkHttpClient> {
    private final SupportModule module;

    public SupportModule_ProvidesOkHttpClientFactory(SupportModule supportModule) {
        this.module = supportModule;
    }

    public static SupportModule_ProvidesOkHttpClientFactory create(SupportModule supportModule) {
        return new SupportModule_ProvidesOkHttpClientFactory(supportModule);
    }

    public static OkHttpClient providesOkHttpClient(SupportModule supportModule) {
        return (OkHttpClient) C51679xZ3.m5002e(supportModule.providesOkHttpClient());
    }

    @Override // p000.Y94
    public OkHttpClient get() {
        return providesOkHttpClient(this.module);
    }
}
