package zendesk.core;
/* loaded from: classes8.dex */
public final class ZendeskApplicationModule_ProvideGsonFactory implements InterfaceC48812sj1<C46153oE1> {

    /* loaded from: classes8.dex */
    public static final class InstanceHolder {
        private static final ZendeskApplicationModule_ProvideGsonFactory INSTANCE = new ZendeskApplicationModule_ProvideGsonFactory();

        private InstanceHolder() {
        }
    }

    public static ZendeskApplicationModule_ProvideGsonFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static C46153oE1 provideGson() {
        return (C46153oE1) C51679xZ3.m5002e(ZendeskApplicationModule.provideGson());
    }

    @Override // p000.Y94
    public C46153oE1 get() {
        return provideGson();
    }
}
