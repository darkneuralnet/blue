package zendesk.core;
/* renamed from: zendesk.core.ZendeskProvidersModule_ProvidePushRegistrationProviderInternalFactory */
/* loaded from: classes8.dex */
public final class C31161xb2419e95 implements InterfaceC48812sj1<PushRegistrationProviderInternal> {
    private final Y94<PushRegistrationProvider> pushRegistrationProvider;

    public C31161xb2419e95(Y94<PushRegistrationProvider> y94) {
        this.pushRegistrationProvider = y94;
    }

    public static C31161xb2419e95 create(Y94<PushRegistrationProvider> y94) {
        return new C31161xb2419e95(y94);
    }

    public static PushRegistrationProviderInternal providePushRegistrationProviderInternal(PushRegistrationProvider pushRegistrationProvider) {
        return (PushRegistrationProviderInternal) C51679xZ3.m5002e(ZendeskProvidersModule.providePushRegistrationProviderInternal(pushRegistrationProvider));
    }

    @Override // p000.Y94
    public PushRegistrationProviderInternal get() {
        return providePushRegistrationProviderInternal(this.pushRegistrationProvider.get());
    }
}
