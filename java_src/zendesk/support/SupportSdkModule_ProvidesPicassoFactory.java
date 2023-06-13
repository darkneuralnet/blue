package zendesk.support;

import android.content.Context;
import java.util.concurrent.ExecutorService;
/* loaded from: classes8.dex */
public final class SupportSdkModule_ProvidesPicassoFactory implements InterfaceC48812sj1<C42732iT3> {
    private final Y94<Context> contextProvider;
    private final Y94<ExecutorService> executorServiceProvider;
    private final SupportSdkModule module;
    private final Y94<C33992Ke3> okHttp3DownloaderProvider;

    public SupportSdkModule_ProvidesPicassoFactory(SupportSdkModule supportSdkModule, Y94<Context> y94, Y94<C33992Ke3> y942, Y94<ExecutorService> y943) {
        this.module = supportSdkModule;
        this.contextProvider = y94;
        this.okHttp3DownloaderProvider = y942;
        this.executorServiceProvider = y943;
    }

    public static SupportSdkModule_ProvidesPicassoFactory create(SupportSdkModule supportSdkModule, Y94<Context> y94, Y94<C33992Ke3> y942, Y94<ExecutorService> y943) {
        return new SupportSdkModule_ProvidesPicassoFactory(supportSdkModule, y94, y942, y943);
    }

    public static C42732iT3 providesPicasso(SupportSdkModule supportSdkModule, Context context, C33992Ke3 c33992Ke3, ExecutorService executorService) {
        return (C42732iT3) C51679xZ3.m5002e(supportSdkModule.providesPicasso(context, c33992Ke3, executorService));
    }

    @Override // p000.Y94
    public C42732iT3 get() {
        return providesPicasso(this.module, this.contextProvider.get(), this.okHttp3DownloaderProvider.get(), this.executorServiceProvider.get());
    }
}
