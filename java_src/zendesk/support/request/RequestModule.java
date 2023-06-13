package zendesk.support.request;

import android.content.Context;
import dagger.Module;
import dagger.Provides;
import dagger.Reusable;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import okhttp3.OkHttpClient;
import zendesk.belvedere.C31096a;
import zendesk.core.ActionHandlerRegistry;
import zendesk.core.AuthenticationProvider;
import zendesk.core.Zendesk;
import zendesk.support.RequestProvider;
import zendesk.support.SupportBlipsProvider;
import zendesk.support.SupportSettingsProvider;
import zendesk.support.SupportUiStorage;
import zendesk.support.UploadProvider;
import zendesk.support.request.AsyncMiddleware;
import zendesk.support.request.AttachmentDownloaderComponent;
import zendesk.support.request.ComponentPersistence;
import zendesk.support.requestlist.RequestInfoDataSource;
import zendesk.support.suas.Dispatcher;
import zendesk.support.suas.Filters;
import zendesk.support.suas.Reducer;
import zendesk.support.suas.Store;
import zendesk.support.suas.Suas;
@Module
/* loaded from: classes8.dex */
public class RequestModule {
    private final InterfaceC40057dx0 configuration;

    public RequestModule(InterfaceC40057dx0 interfaceC40057dx0) {
        this.configuration = interfaceC40057dx0;
    }

    @Provides
    public static ActionFactory providesActionFactory(RequestProvider requestProvider, SupportSettingsProvider supportSettingsProvider, UploadProvider uploadProvider, C31096a c31096a, SupportUiStorage supportUiStorage, ExecutorService executorService, Executor executor, AuthenticationProvider authenticationProvider, SupportBlipsProvider supportBlipsProvider) {
        return new ActionFactory(requestProvider, uploadProvider, supportSettingsProvider, c31096a, supportUiStorage, executorService, "5.0.9", authenticationProvider, Zendesk.INSTANCE, supportBlipsProvider, executor);
    }

    @Provides
    public static AsyncMiddleware providesAsyncMiddleware() {
        return new AsyncMiddleware(new AsyncMiddleware.Queue());
    }

    @Provides
    public static AttachmentDownloaderComponent.AttachmentDownloader providesAttachmentDownloader(C31096a c31096a, AttachmentDownloadService attachmentDownloadService) {
        return new AttachmentDownloaderComponent.AttachmentDownloader(c31096a, attachmentDownloadService);
    }

    @Provides
    public static AttachmentDownloaderComponent providesAttachmentDownloaderComponent(Dispatcher dispatcher, ActionFactory actionFactory, AttachmentDownloaderComponent.AttachmentDownloader attachmentDownloader) {
        return new AttachmentDownloaderComponent(dispatcher, actionFactory, attachmentDownloader);
    }

    @Provides
    public static AttachmentDownloadService providesAttachmentToDiskService(OkHttpClient okHttpClient, ExecutorService executorService) {
        return new AttachmentDownloadService(okHttpClient, executorService);
    }

    @Provides
    public static C31096a providesBelvedere(Context context) {
        return C31096a.m764c(context);
    }

    @Provides
    public static HeadlessComponentListener providesComponentListener(ComponentPersistence componentPersistence, AttachmentDownloaderComponent attachmentDownloaderComponent, ComponentUpdateActionHandlers componentUpdateActionHandlers) {
        return new HeadlessComponentListener(componentPersistence, attachmentDownloaderComponent, componentUpdateActionHandlers);
    }

    @Provides
    @Reusable
    public static ComponentUpdateActionHandlers providesConUpdatesComponent(Context context, ActionHandlerRegistry actionHandlerRegistry, RequestInfoDataSource.LocalDataSource localDataSource) {
        return new ComponentUpdateActionHandlers(context, actionHandlerRegistry, localDataSource);
    }

    @Provides
    public static ComponentPersistence.PersistenceQueue providesDiskQueue(ExecutorService executorService) {
        return new ComponentPersistence.PersistenceQueue(executorService);
    }

    @Provides
    public static Dispatcher providesDispatcher(Store store) {
        return store;
    }

    @Provides
    public static ComponentPersistence providesPersistenceComponent(SupportUiStorage supportUiStorage, ComponentPersistence.PersistenceQueue persistenceQueue, ExecutorService executorService) {
        return new ComponentPersistence(supportUiStorage, persistenceQueue, executorService);
    }

    @Provides
    public static List<Reducer> providesReducer() {
        return Arrays.asList(new ReducerProgress(), new ReducerConfiguration(), new ReducerConversation(), new ReducerAttachments(), new ReducerAndroidLifecycle(), new ReducerUiState(), new ReducerError());
    }

    @Provides
    public static Store providesStore(List<Reducer> list, AsyncMiddleware asyncMiddleware) {
        return Suas.createStore(list).withMiddleware(asyncMiddleware).withDefaultFilter(Filters.EQUALS).build();
    }

    @Provides
    public CellFactory providesMessageFactory(Context context, C42732iT3 c42732iT3, ActionFactory actionFactory, Dispatcher dispatcher, ActionHandlerRegistry actionHandlerRegistry, C32054Bx0 c32054Bx0) {
        return new CellFactory(context.getApplicationContext(), c42732iT3, actionFactory, dispatcher, actionHandlerRegistry, c32054Bx0, this.configuration);
    }
}
