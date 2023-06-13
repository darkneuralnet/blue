package p000;
/* renamed from: es7 */
/* loaded from: classes6.dex */
public final class C40607es7 extends V78 implements InterfaceC48227rj8 {
    private static final C40607es7 zza;
    private int zzd;
    private int zzf;
    private boolean zzh;
    private byte zzi = 2;
    private String zze = "";
    private String zzg = "";

    static {
        C40607es7 c40607es7 = new C40607es7();
        zza = c40607es7;
        V78.m80336w(C40607es7.class, c40607es7);
    }

    private C40607es7() {
    }

    /* renamed from: I */
    public static C40607es7 m42468I() {
        return zza;
    }

    @Override // p000.V78
    /* renamed from: G */
    public final Object mo3770G(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (obj == null) {
                                b = 0;
                            }
                            this.zzi = b;
                            return null;
                        }
                        return zza;
                    }
                    return new C35022Oo7(null);
                }
                return new C40607es7();
            }
            return V78.m80339t(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", C51259wq7.f116622a, "zzg", "zzh"});
        }
        return Byte.valueOf(this.zzi);
    }

    /* renamed from: J */
    public final String m42467J() {
        return this.zzg;
    }

    /* renamed from: K */
    public final String m42466K() {
        return this.zze;
    }

    /* renamed from: L */
    public final int m42465L() {
        int m22272a = C45934nr7.m22272a(this.zzf);
        if (m22272a == 0) {
            return 1;
        }
        return m22272a;
    }
}
