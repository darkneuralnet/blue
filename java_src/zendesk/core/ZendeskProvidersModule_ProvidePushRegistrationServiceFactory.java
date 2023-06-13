package zendesk.core;
/* loaded from: classes8.dex */
public final class ZendeskProvidersModule_ProvidePushRegistrationServiceFactory implements InterfaceC48812sj1<PushRegistrationService> {
    private final Y94<MN4> retrofitProvider;

    public ZendeskProvidersModule_ProvidePushRegistrationServiceFactory(Y94<MN4> y94) {
        this.retrofitProvider = y94;
    }

    public static ZendeskProvidersModule_ProvidePushRegistrationServiceFactory create(Y94<MN4> y94) {
        return new ZendeskProvidersModule_ProvidePushRegistrationServiceFactory(y94);
    }

    public static PushRegistrationService providePushRegistrationService(MN4 mn4) {
        return (PushRegistrationService) C51679xZ3.m5002e(ZendeskProvidersModule.providePushRegistrationService(mn4));
    }

    @Override // p000.Y94
    public PushRegistrationService get() {
        return providePushRegistrationService(this.retrofitProvider.get());
    }
}
