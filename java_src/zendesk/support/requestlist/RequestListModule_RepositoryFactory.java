package zendesk.support.requestlist;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import zendesk.support.RequestProvider;
import zendesk.support.SupportUiStorage;
import zendesk.support.requestlist.RequestInfoDataSource;
/* loaded from: classes8.dex */
public final class RequestListModule_RepositoryFactory implements InterfaceC48812sj1<RequestInfoDataSource.Repository> {
    private final Y94<ExecutorService> backgroundThreadExecutorProvider;
    private final Y94<RequestInfoDataSource.LocalDataSource> localDataSourceProvider;
    private final Y94<Executor> mainThreadExecutorProvider;
    private final Y94<RequestProvider> requestProvider;
    private final Y94<SupportUiStorage> supportUiStorageProvider;

    public RequestListModule_RepositoryFactory(Y94<RequestInfoDataSource.LocalDataSource> y94, Y94<SupportUiStorage> y942, Y94<RequestProvider> y943, Y94<Executor> y944, Y94<ExecutorService> y945) {
        this.localDataSourceProvider = y94;
        this.supportUiStorageProvider = y942;
        this.requestProvider = y943;
        this.mainThreadExecutorProvider = y944;
        this.backgroundThreadExecutorProvider = y945;
    }

    public static RequestListModule_RepositoryFactory create(Y94<RequestInfoDataSource.LocalDataSource> y94, Y94<SupportUiStorage> y942, Y94<RequestProvider> y943, Y94<Executor> y944, Y94<ExecutorService> y945) {
        return new RequestListModule_RepositoryFactory(y94, y942, y943, y944, y945);
    }

    public static RequestInfoDataSource.Repository repository(RequestInfoDataSource.LocalDataSource localDataSource, SupportUiStorage supportUiStorage, RequestProvider requestProvider, Executor executor, ExecutorService executorService) {
        return (RequestInfoDataSource.Repository) C51679xZ3.m5002e(RequestListModule.repository(localDataSource, supportUiStorage, requestProvider, executor, executorService));
    }

    @Override // p000.Y94
    public RequestInfoDataSource.Repository get() {
        return repository(this.localDataSourceProvider.get(), this.supportUiStorageProvider.get(), this.requestProvider.get(), this.mainThreadExecutorProvider.get(), this.backgroundThreadExecutorProvider.get());
    }
}
