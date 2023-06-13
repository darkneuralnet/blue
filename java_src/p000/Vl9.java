package p000;
/* renamed from: Vl9 */
/* loaded from: classes6.dex */
public final class Vl9 implements Ip9 {

    /* renamed from: a */
    public static final Vl9 f39733a = new Vl9();

    private Vl9() {
    }

    /* renamed from: a */
    public static Vl9 m79433a() {
        return f39733a;
    }

    @Override // p000.Ip9
    public final Fp9 zzb(Class<?> cls) {
        String str;
        String str2;
        if (!Em9.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            if (name.length() != 0) {
                str2 = "Unsupported message type: ".concat(name);
            } else {
                str2 = new String("Unsupported message type: ");
            }
            throw new IllegalArgumentException(str2);
        }
        try {
            return (Fp9) Em9.m108368r(cls.asSubclass(Em9.class)).mo1998n(3, null, null);
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

    @Override // p000.Ip9
    public final boolean zzc(Class<?> cls) {
        return Em9.class.isAssignableFrom(cls);
    }
}
