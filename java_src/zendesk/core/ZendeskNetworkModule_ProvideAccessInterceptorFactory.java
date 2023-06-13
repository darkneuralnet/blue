package zendesk.core;
/* loaded from: classes8.dex */
public final class ZendeskNetworkModule_ProvideAccessInterceptorFactory implements InterfaceC48812sj1<ZendeskAccessInterceptor> {
    private final Y94<AccessProvider> accessProvider;
    private final Y94<CoreSettingsStorage> coreSettingsStorageProvider;
    private final Y94<IdentityManager> identityManagerProvider;
    private final Y94<Storage> storageProvider;

    public ZendeskNetworkModule_ProvideAccessInterceptorFactory(Y94<IdentityManager> y94, Y94<AccessProvider> y942, Y94<Storage> y943, Y94<CoreSettingsStorage> y944) {
        this.identityManagerProvider = y94;
        this.accessProvider = y942;
        this.storageProvider = y943;
        this.coreSettingsStorageProvider = y944;
    }

    public static ZendeskNetworkModule_ProvideAccessInterceptorFactory create(Y94<IdentityManager> y94, Y94<AccessProvider> y942, Y94<Storage> y943, Y94<CoreSettingsStorage> y944) {
        return new ZendeskNetworkModule_ProvideAccessInterceptorFactory(y94, y942, y943, y944);
    }

    public static ZendeskAccessInterceptor provideAccessInterceptor(Object obj, Object obj2, Object obj3, Object obj4) {
        return (ZendeskAccessInterceptor) C51679xZ3.m5002e(ZendeskNetworkModule.provideAccessInterceptor((IdentityManager) obj, (AccessProvider) obj2, (Storage) obj3, (CoreSettingsStorage) obj4));
    }

    @Override // p000.Y94
    public ZendeskAccessInterceptor get() {
        return provideAccessInterceptor(this.identityManagerProvider.get(), this.accessProvider.get(), this.storageProvider.get(), this.coreSettingsStorageProvider.get());
    }
}
