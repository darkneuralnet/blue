package zendesk.support.requestlist;

import zendesk.core.MemoryCache;
import zendesk.support.SupportBlipsProvider;
import zendesk.support.SupportSettingsProvider;
import zendesk.support.requestlist.RequestInfoDataSource;
/* loaded from: classes8.dex */
public final class RequestListModule_ModelFactory implements InterfaceC48812sj1<RequestListModel> {
    private final Y94<SupportBlipsProvider> blipsProvider;
    private final Y94<MemoryCache> memoryCacheProvider;
    private final RequestListModule module;
    private final Y94<RequestInfoDataSource.Repository> requestInfoDataSourceProvider;
    private final Y94<SupportSettingsProvider> settingsProvider;

    public RequestListModule_ModelFactory(RequestListModule requestListModule, Y94<RequestInfoDataSource.Repository> y94, Y94<MemoryCache> y942, Y94<SupportBlipsProvider> y943, Y94<SupportSettingsProvider> y944) {
        this.module = requestListModule;
        this.requestInfoDataSourceProvider = y94;
        this.memoryCacheProvider = y942;
        this.blipsProvider = y943;
        this.settingsProvider = y944;
    }

    public static RequestListModule_ModelFactory create(RequestListModule requestListModule, Y94<RequestInfoDataSource.Repository> y94, Y94<MemoryCache> y942, Y94<SupportBlipsProvider> y943, Y94<SupportSettingsProvider> y944) {
        return new RequestListModule_ModelFactory(requestListModule, y94, y942, y943, y944);
    }

    public static RequestListModel model(RequestListModule requestListModule, RequestInfoDataSource.Repository repository, MemoryCache memoryCache, SupportBlipsProvider supportBlipsProvider, SupportSettingsProvider supportSettingsProvider) {
        return (RequestListModel) C51679xZ3.m5002e(requestListModule.model(repository, memoryCache, supportBlipsProvider, supportSettingsProvider));
    }

    @Override // p000.Y94
    public RequestListModel get() {
        return model(this.module, this.requestInfoDataSourceProvider.get(), this.memoryCacheProvider.get(), this.blipsProvider.get(), this.settingsProvider.get());
    }
}
