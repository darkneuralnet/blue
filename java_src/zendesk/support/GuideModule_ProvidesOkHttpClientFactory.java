package zendesk.support;

import okhttp3.OkHttpClient;
/* loaded from: classes8.dex */
public final class GuideModule_ProvidesOkHttpClientFactory implements InterfaceC48812sj1<OkHttpClient> {
    private final GuideModule module;

    public GuideModule_ProvidesOkHttpClientFactory(GuideModule guideModule) {
        this.module = guideModule;
    }

    public static GuideModule_ProvidesOkHttpClientFactory create(GuideModule guideModule) {
        return new GuideModule_ProvidesOkHttpClientFactory(guideModule);
    }

    public static OkHttpClient providesOkHttpClient(GuideModule guideModule) {
        return (OkHttpClient) C51679xZ3.m5002e(guideModule.providesOkHttpClient());
    }

    @Override // p000.Y94
    public OkHttpClient get() {
        return providesOkHttpClient(this.module);
    }
}
