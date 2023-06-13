package zendesk.core;
/* loaded from: classes8.dex */
public final class ZendeskStorageModule_ProvidePushDeviceIdStorageFactory implements InterfaceC48812sj1<PushDeviceIdStorage> {
    private final Y94<BaseStorage> additionalSdkStorageProvider;

    public ZendeskStorageModule_ProvidePushDeviceIdStorageFactory(Y94<BaseStorage> y94) {
        this.additionalSdkStorageProvider = y94;
    }

    public static ZendeskStorageModule_ProvidePushDeviceIdStorageFactory create(Y94<BaseStorage> y94) {
        return new ZendeskStorageModule_ProvidePushDeviceIdStorageFactory(y94);
    }

    public static PushDeviceIdStorage providePushDeviceIdStorage(BaseStorage baseStorage) {
        return (PushDeviceIdStorage) C51679xZ3.m5002e(ZendeskStorageModule.providePushDeviceIdStorage(baseStorage));
    }

    @Override // p000.Y94
    public PushDeviceIdStorage get() {
        return providePushDeviceIdStorage(this.additionalSdkStorageProvider.get());
    }
}
