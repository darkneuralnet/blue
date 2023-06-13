package p000;
/* renamed from: Qj8 */
/* loaded from: classes5.dex */
public final class C35446Qj8 extends AbstractC46897pU8 implements A19 {
    private static final C35446Qj8 zza;
    private int zzd;
    private int zze;
    private long zzf;

    static {
        C35446Qj8 c35446Qj8 = new C35446Qj8();
        zza = c35446Qj8;
        AbstractC46897pU8.m19196w(C35446Qj8.class, c35446Qj8);
    }

    private C35446Qj8() {
    }

    /* renamed from: D */
    public static C32170Cj8 m88115D() {
        return (C32170Cj8) zza.m19209i();
    }

    /* renamed from: F */
    public static /* synthetic */ void m88113F(C35446Qj8 c35446Qj8, int i) {
        c35446Qj8.zzd |= 1;
        c35446Qj8.zze = i;
    }

    /* renamed from: G */
    public static /* synthetic */ void m88112G(C35446Qj8 c35446Qj8, long j) {
        c35446Qj8.zzd |= 2;
        c35446Qj8.zzf = j;
    }

    @Override // p000.AbstractC46897pU8
    /* renamed from: A */
    public final Object mo8350A(int i, Object obj, Object obj2) {
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
                    return new C32170Cj8(null);
                }
                return new C35446Qj8();
            }
            return AbstractC46897pU8.m19199t(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    /* renamed from: B */
    public final int m88117B() {
        return this.zze;
    }

    /* renamed from: C */
    public final long m88116C() {
        return this.zzf;
    }

    /* renamed from: H */
    public final boolean m88111H() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: I */
    public final boolean m88110I() {
        return (this.zzd & 1) != 0;
    }
}
