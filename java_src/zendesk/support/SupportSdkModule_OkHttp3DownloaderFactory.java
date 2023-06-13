package zendesk.support;

import okhttp3.OkHttpClient;
/* loaded from: classes8.dex */
public final class SupportSdkModule_OkHttp3DownloaderFactory implements InterfaceC48812sj1<C33992Ke3> {
    private final SupportSdkModule module;
    private final Y94<OkHttpClient> okHttpClientProvider;

    public SupportSdkModule_OkHttp3DownloaderFactory(SupportSdkModule supportSdkModule, Y94<OkHttpClient> y94) {
        this.module = supportSdkModule;
        this.okHttpClientProvider = y94;
    }

    public static SupportSdkModule_OkHttp3DownloaderFactory create(SupportSdkModule supportSdkModule, Y94<OkHttpClient> y94) {
        return new SupportSdkModule_OkHttp3DownloaderFactory(supportSdkModule, y94);
    }

    public static C33992Ke3 okHttp3Downloader(SupportSdkModule supportSdkModule, OkHttpClient okHttpClient) {
        return (C33992Ke3) C51679xZ3.m5002e(supportSdkModule.okHttp3Downloader(okHttpClient));
    }

    @Override // p000.Y94
    public C33992Ke3 get() {
        return okHttp3Downloader(this.module, this.okHttpClientProvider.get());
    }
}
