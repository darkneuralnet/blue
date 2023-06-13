package zendesk.support;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import zendesk.support.requestlist.RequestInfoDataSource;
/* loaded from: classes8.dex */
public final class SupportSdkModule_RequestInfoDataSourceFactory implements InterfaceC48812sj1<RequestInfoDataSource.LocalDataSource> {
    private final Y94<ExecutorService> backgroundThreadExecutorProvider;
    private final Y94<Executor> mainThreadExecutorProvider;
    private final SupportSdkModule module;
    private final Y94<SupportUiStorage> supportUiStorageProvider;

    public SupportSdkModule_RequestInfoDataSourceFactory(SupportSdkModule supportSdkModule, Y94<SupportUiStorage> y94, Y94<Executor> y942, Y94<ExecutorService> y943) {
        this.module = supportSdkModule;
        this.supportUiStorageProvider = y94;
        this.mainThreadExecutorProvider = y942;
        this.backgroundThreadExecutorProvider = y943;
    }

    public static SupportSdkModule_RequestInfoDataSourceFactory create(SupportSdkModule supportSdkModule, Y94<SupportUiStorage> y94, Y94<Executor> y942, Y94<ExecutorService> y943) {
        return new SupportSdkModule_RequestInfoDataSourceFactory(supportSdkModule, y94, y942, y943);
    }

    public static RequestInfoDataSource.LocalDataSource requestInfoDataSource(SupportSdkModule supportSdkModule, SupportUiStorage supportUiStorage, Executor executor, ExecutorService executorService) {
        return (RequestInfoDataSource.LocalDataSource) C51679xZ3.m5002e(supportSdkModule.requestInfoDataSource(supportUiStorage, executor, executorService));
    }

    @Override // p000.Y94
    public RequestInfoDataSource.LocalDataSource get() {
        return requestInfoDataSource(this.module, this.supportUiStorageProvider.get(), this.mainThreadExecutorProvider.get(), this.backgroundThreadExecutorProvider.get());
    }
}
