package p000;
/* renamed from: JS8 */
/* loaded from: classes5.dex */
public final class JS8 implements Y09 {

    /* renamed from: a */
    public static final JS8 f17604a = new JS8();

    private JS8() {
    }

    /* renamed from: a */
    public static JS8 m100427a() {
        return f17604a;
    }

    @Override // p000.Y09
    public final O09 zzb(Class cls) {
        if (AbstractC46897pU8.class.isAssignableFrom(cls)) {
            try {
                return (O09) AbstractC46897pU8.m19207k(cls.asSubclass(AbstractC46897pU8.class)).mo8350A(3, null, null);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // p000.Y09
    public final boolean zzc(Class cls) {
        return AbstractC46897pU8.class.isAssignableFrom(cls);
    }
}
