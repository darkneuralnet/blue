package p000;
/* renamed from: kl7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C44095kl7 extends V78 implements InterfaceC48227rj8 {
    private static final C44095kl7 zza;
    private int zzd;
    private byte zzg = 2;
    private String zze = "";
    private String zzf = "";

    static {
        C44095kl7 c44095kl7 = new C44095kl7();
        zza = c44095kl7;
        V78.m80336w(C44095kl7.class, c44095kl7);
    }

    private C44095kl7() {
    }

    /* renamed from: I */
    public static C44095kl7 m28486I() {
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
                    return new C47050pk7(null);
                }
                return new C44095kl7();
            }
            return V78.m80339t(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᔈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return Byte.valueOf(this.zzg);
    }

    /* renamed from: J */
    public final String m28485J() {
        return this.zze;
    }

    /* renamed from: K */
    public final String m28484K() {
        return this.zzf;
    }
}
