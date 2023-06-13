package p000;
/* renamed from: Rn7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35715Rn7 extends V78 implements InterfaceC48227rj8 {
    private static final C35715Rn7 zza;
    private int zzd;
    private byte zzg = 2;
    private String zze = "";
    private String zzf = "";

    static {
        C35715Rn7 c35715Rn7 = new C35715Rn7();
        zza = c35715Rn7;
        V78.m80336w(C35715Rn7.class, c35715Rn7);
    }

    private C35715Rn7() {
    }

    /* renamed from: I */
    public static C35715Rn7 m86292I() {
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
                            this.zzg = b;
                            return null;
                        }
                        return zza;
                    }
                    return new C37578Zm7(null);
                }
                return new C35715Rn7();
            }
            return V78.m80339t(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᔈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return Byte.valueOf(this.zzg);
    }

    /* renamed from: J */
    public final String m86291J() {
        return this.zze;
    }

    /* renamed from: K */
    public final String m86290K() {
        return this.zzf;
    }
}
