package p000;
/* renamed from: Dx9 */
/* loaded from: classes6.dex */
public final class Dx9 extends V78 implements InterfaceC48227rj8 {
    private static final Dx9 zza;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        Dx9 dx9 = new Dx9();
        zza = dx9;
        V78.m80336w(Dx9.class, dx9);
    }

    private Dx9() {
    }

    /* renamed from: I */
    public static Dx9 m109582I() {
        return zza;
    }

    @Override // p000.V78
    /* renamed from: G */
    public final Object mo3770G(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new C49503ts9(null);
                }
                return new Dx9();
            }
            return V78.m80339t(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", C51311wv9.f116840a, "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    /* renamed from: J */
    public final String m109581J() {
        return this.zzf;
    }

    /* renamed from: K */
    public final String m109580K() {
        return this.zzh;
    }

    /* renamed from: L */
    public final String m109579L() {
        return this.zzg;
    }

    /* renamed from: M */
    public final int m109578M() {
        int m114829a = Aw9.m114829a(this.zze);
        if (m114829a == 0) {
            return 1;
        }
        return m114829a;
    }
}
