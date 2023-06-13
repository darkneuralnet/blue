package p000;
/* renamed from: Eh7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32619Eh7 extends V78 implements InterfaceC48227rj8 {
    private static final C32619Eh7 zza;
    private int zzd;
    private double zze;
    private double zzf;
    private byte zzg = 2;

    static {
        C32619Eh7 c32619Eh7 = new C32619Eh7();
        zza = c32619Eh7;
        V78.m80336w(C32619Eh7.class, c32619Eh7);
    }

    private C32619Eh7() {
    }

    /* renamed from: K */
    public static C32619Eh7 m108571K() {
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
                    return new C33780Jg7(null);
                }
                return new C32619Eh7();
            }
            return V78.m80339t(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔀ\u0000\u0002ᔀ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return Byte.valueOf(this.zzg);
    }

    /* renamed from: H */
    public final double m108574H() {
        return this.zze;
    }

    /* renamed from: I */
    public final double m108573I() {
        return this.zzf;
    }
}
