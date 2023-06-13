package zendesk.messaging.p061ui;
/* renamed from: zendesk.messaging.ui.AvatarStateFactory_Factory */
/* loaded from: classes8.dex */
public final class AvatarStateFactory_Factory implements InterfaceC48812sj1<AvatarStateFactory> {

    /* renamed from: zendesk.messaging.ui.AvatarStateFactory_Factory$InstanceHolder */
    /* loaded from: classes8.dex */
    public static final class InstanceHolder {
        private static final AvatarStateFactory_Factory INSTANCE = new AvatarStateFactory_Factory();

        private InstanceHolder() {
        }
    }

    public static AvatarStateFactory_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AvatarStateFactory newInstance() {
        return new AvatarStateFactory();
    }

    @Override // p000.Y94
    public AvatarStateFactory get() {
        return newInstance();
    }
}
