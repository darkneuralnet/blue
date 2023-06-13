package zendesk.core;
/* loaded from: classes8.dex */
public final class ZendeskNetworkModule_ProvidePushInterceptorFactory implements InterfaceC48812sj1<ZendeskPushInterceptor> {
    private final Y94<IdentityStorage> identityStorageProvider;
    private final Y94<PushDeviceIdStorage> pushDeviceIdStorageProvider;
    private final Y94<PushRegistrationProviderInternal> pushProvider;

    public ZendeskNetworkModule_ProvidePushInterceptorFactory(Y94<PushRegistrationProviderInternal> y94, Y94<PushDeviceIdStorage> y942, Y94<IdentityStorage> y943) {
        this.pushProvider = y94;
        this.pushDeviceIdStorageProvider = y942;
        this.identityStorageProvider = y943;
    }

    public static ZendeskNetworkModule_ProvidePushInterceptorFactory create(Y94<PushRegistrationProviderInternal> y94, Y94<PushDeviceIdStorage> y942, Y94<IdentityStorage> y943) {
        return new ZendeskNetworkModule_ProvidePushInterceptorFactory(y94, y942, y943);
    }

    public static ZendeskPushInterceptor providePushInterceptor(Object obj, Object obj2, Object obj3) {
        return (ZendeskPushInterceptor) C51679xZ3.m5002e(ZendeskNetworkModule.providePushInterceptor((PushRegistrationProviderInternal) obj, (PushDeviceIdStorage) obj2, (IdentityStorage) obj3));
    }

    @Override // p000.Y94
    public ZendeskPushInterceptor get() {
        return providePushInterceptor(this.pushProvider.get(), this.pushDeviceIdStorageProvider.get(), this.identityStorageProvider.get());
    }
}
