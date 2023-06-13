package zendesk.messaging;
/* loaded from: classes8.dex */
public final class BelvedereMediaHolder_Factory implements InterfaceC48812sj1<BelvedereMediaHolder> {

    /* loaded from: classes8.dex */
    public static final class InstanceHolder {
        private static final BelvedereMediaHolder_Factory INSTANCE = new BelvedereMediaHolder_Factory();

        private InstanceHolder() {
        }
    }

    public static BelvedereMediaHolder_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static BelvedereMediaHolder newInstance() {
        return new BelvedereMediaHolder();
    }

    @Override // p000.Y94
    public BelvedereMediaHolder get() {
        return newInstance();
    }
}
