package zendesk.core;
/* loaded from: classes8.dex */
public final class ZendeskStorageModule_ProvideIdentityStorageFactory implements InterfaceC48812sj1<IdentityStorage> {
    private final Y94<BaseStorage> baseStorageProvider;

    public ZendeskStorageModule_ProvideIdentityStorageFactory(Y94<BaseStorage> y94) {
        this.baseStorageProvider = y94;
    }

    public static ZendeskStorageModule_ProvideIdentityStorageFactory create(Y94<BaseStorage> y94) {
        return new ZendeskStorageModule_ProvideIdentityStorageFactory(y94);
    }

    public static IdentityStorage provideIdentityStorage(BaseStorage baseStorage) {
        return (IdentityStorage) C51679xZ3.m5002e(ZendeskStorageModule.provideIdentityStorage(baseStorage));
    }

    @Override // p000.Y94
    public IdentityStorage get() {
        return provideIdentityStorage(this.baseStorageProvider.get());
    }
}
