package zendesk.core;
/* loaded from: classes8.dex */
public final class ZendeskStorageModule_ProvideIdentityManagerFactory implements InterfaceC48812sj1<IdentityManager> {
    private final Y94<IdentityStorage> identityStorageProvider;

    public ZendeskStorageModule_ProvideIdentityManagerFactory(Y94<IdentityStorage> y94) {
        this.identityStorageProvider = y94;
    }

    public static ZendeskStorageModule_ProvideIdentityManagerFactory create(Y94<IdentityStorage> y94) {
        return new ZendeskStorageModule_ProvideIdentityManagerFactory(y94);
    }

    public static IdentityManager provideIdentityManager(Object obj) {
        return (IdentityManager) C51679xZ3.m5002e(ZendeskStorageModule.provideIdentityManager((IdentityStorage) obj));
    }

    @Override // p000.Y94
    public IdentityManager get() {
        return provideIdentityManager(this.identityStorageProvider.get());
    }
}
