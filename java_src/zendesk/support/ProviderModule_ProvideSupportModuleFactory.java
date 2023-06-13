package zendesk.support;

import zendesk.core.RestServiceProvider;
/* loaded from: classes8.dex */
public final class ProviderModule_ProvideSupportModuleFactory implements InterfaceC48812sj1<SupportModule> {
    private final Y94<ArticleVoteStorage> articleVoteStorageProvider;
    private final Y94<SupportBlipsProvider> blipsProvider;
    private final Y94<HelpCenterProvider> helpCenterProvider;
    private final ProviderModule module;
    private final Y94<RequestProvider> requestProvider;
    private final Y94<RestServiceProvider> restServiceProvider;
    private final Y94<SupportSettingsProvider> settingsProvider;
    private final Y94<UploadProvider> uploadProvider;
    private final Y94<ZendeskTracker> zendeskTrackerProvider;

    public ProviderModule_ProvideSupportModuleFactory(ProviderModule providerModule, Y94<RequestProvider> y94, Y94<UploadProvider> y942, Y94<HelpCenterProvider> y943, Y94<SupportSettingsProvider> y944, Y94<RestServiceProvider> y945, Y94<SupportBlipsProvider> y946, Y94<ZendeskTracker> y947, Y94<ArticleVoteStorage> y948) {
        this.module = providerModule;
        this.requestProvider = y94;
        this.uploadProvider = y942;
        this.helpCenterProvider = y943;
        this.settingsProvider = y944;
        this.restServiceProvider = y945;
        this.blipsProvider = y946;
        this.zendeskTrackerProvider = y947;
        this.articleVoteStorageProvider = y948;
    }

    public static ProviderModule_ProvideSupportModuleFactory create(ProviderModule providerModule, Y94<RequestProvider> y94, Y94<UploadProvider> y942, Y94<HelpCenterProvider> y943, Y94<SupportSettingsProvider> y944, Y94<RestServiceProvider> y945, Y94<SupportBlipsProvider> y946, Y94<ZendeskTracker> y947, Y94<ArticleVoteStorage> y948) {
        return new ProviderModule_ProvideSupportModuleFactory(providerModule, y94, y942, y943, y944, y945, y946, y947, y948);
    }

    public static SupportModule provideSupportModule(ProviderModule providerModule, RequestProvider requestProvider, UploadProvider uploadProvider, HelpCenterProvider helpCenterProvider, SupportSettingsProvider supportSettingsProvider, RestServiceProvider restServiceProvider, SupportBlipsProvider supportBlipsProvider, Object obj, ArticleVoteStorage articleVoteStorage) {
        return (SupportModule) C51679xZ3.m5002e(providerModule.provideSupportModule(requestProvider, uploadProvider, helpCenterProvider, supportSettingsProvider, restServiceProvider, supportBlipsProvider, (ZendeskTracker) obj, articleVoteStorage));
    }

    @Override // p000.Y94
    public SupportModule get() {
        return provideSupportModule(this.module, this.requestProvider.get(), this.uploadProvider.get(), this.helpCenterProvider.get(), this.settingsProvider.get(), this.restServiceProvider.get(), this.blipsProvider.get(), this.zendeskTrackerProvider.get(), this.articleVoteStorageProvider.get());
    }
}
