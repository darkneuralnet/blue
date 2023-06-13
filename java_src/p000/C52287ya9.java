package p000;
/* renamed from: ya9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C52287ya9 implements InterfaceC38100ag9 {

    /* renamed from: a */
    public static final C52287ya9 f119789a = new C52287ya9();

    private C52287ya9() {
    }

    /* renamed from: a */
    public static C52287ya9 m3214a() {
        return f119789a;
    }

    @Override // p000.InterfaceC38100ag9
    public final Tf9 zzb(Class cls) {
        String str;
        String str2;
        if (!AbstractC49926ub9.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            if (name.length() != 0) {
                str2 = "Unsupported message type: ".concat(name);
            } else {
                str2 = new String("Unsupported message type: ");
            }
            throw new IllegalArgumentException(str2);
        }
        try {
            return (Tf9) AbstractC49926ub9.m9980s(cls.asSubclass(AbstractC49926ub9.class)).mo9690n(3, null, null);
        } catch (Exception e) {
            String name2 = cls.getName();
            if (name2.length() != 0) {
                str = "Unable to get message info for ".concat(name2);
            } else {
                str = new String("Unable to get message info for ");
            }
            throw new RuntimeException(str, e);
        }
    }

    @Override // p000.InterfaceC38100ag9
    public final boolean zzc(Class cls) {
        return AbstractC49926ub9.class.isAssignableFrom(cls);
    }
}
