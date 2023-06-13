package p000;
/* renamed from: Za7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C37470Za7 implements InterfaceC35607Rb7 {

    /* renamed from: a */
    public static final C37470Za7 f48793a = new C37470Za7();

    private C37470Za7() {
    }

    /* renamed from: c */
    public static C37470Za7 m72910c() {
        return f48793a;
    }

    @Override // p000.InterfaceC35607Rb7
    /* renamed from: a */
    public final InterfaceC35373Qb7 mo72912a(Class cls) {
        if (AbstractC41030fb7.class.isAssignableFrom(cls)) {
            try {
                return (InterfaceC35373Qb7) AbstractC41030fb7.m41126w(cls.asSubclass(AbstractC41030fb7.class)).mo1009p(3, null, null);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // p000.InterfaceC35607Rb7
    /* renamed from: b */
    public final boolean mo72911b(Class cls) {
        return AbstractC41030fb7.class.isAssignableFrom(cls);
    }
}
