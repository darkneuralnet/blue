package p000;
/* renamed from: rj7 */
/* loaded from: classes6.dex */
public final class C48226rj7 extends V78 implements InterfaceC48227rj8 {
    private static final C48226rj7 zza;
    private int zzd;
    private int zze;
    private int zzf;
    private byte zzg = 2;

    static {
        C48226rj7 c48226rj7 = new C48226rj7();
        zza = c48226rj7;
        V78.m80336w(C48226rj7.class, c48226rj7);
    }

    private C48226rj7() {
    }

    /* renamed from: J */
    public static C52958zi7 m15538J() {
        return (C52958zi7) zza.m80351f();
    }

    /* renamed from: L */
    public static /* synthetic */ void m15536L(C48226rj7 c48226rj7, int i) {
        c48226rj7.zzd |= 1;
        c48226rj7.zze = i;
    }

    /* renamed from: M */
    public static /* synthetic */ void m15535M(C48226rj7 c48226rj7, int i) {
        c48226rj7.zzd |= 2;
        c48226rj7.zzf = i;
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
                    return new C52958zi7(null);
                }
                return new C48226rj7();
            }
            return V78.m80339t(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return Byte.valueOf(this.zzg);
    }

    /* renamed from: H */
    public final int m15540H() {
        return this.zze;
    }

    /* renamed from: I */
    public final int m15539I() {
        return this.zzf;
    }
}
