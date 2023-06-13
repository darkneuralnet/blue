package p000;
/* renamed from: Vb8 */
/* loaded from: classes5.dex */
public final class C36544Vb8 extends AbstractC46897pU8 implements A19 {
    private static final C36544Vb8 zza;
    private int zzd;
    private int zze;
    private boolean zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        C36544Vb8 c36544Vb8 = new C36544Vb8();
        zza = c36544Vb8;
        AbstractC46897pU8.m19196w(C36544Vb8.class, c36544Vb8);
    }

    private C36544Vb8() {
    }

    /* renamed from: C */
    public static C36544Vb8 m79677C() {
        return zza;
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
                    return new C35599Ra8(null);
                }
                return new C36544Vb8();
            }
            return AbstractC46897pU8.m19199t(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzd", "zze", C49332tb8.f110784a, "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    /* renamed from: D */
    public final String m79676D() {
        return this.zzg;
    }

    /* renamed from: E */
    public final String m79675E() {
        return this.zzi;
    }

    /* renamed from: F */
    public final String m79674F() {
        return this.zzh;
    }

    /* renamed from: G */
    public final boolean m79673G() {
        return this.zzf;
    }

    /* renamed from: H */
    public final boolean m79672H() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: I */
    public final boolean m79671I() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: J */
    public final boolean m79670J() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: K */
    public final boolean m79669K() {
        return (this.zzd & 16) != 0;
    }

    /* renamed from: M */
    public final boolean m79668M() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: N */
    public final int m79667N() {
        int m103659a = C33268Hb8.m103659a(this.zze);
        if (m103659a == 0) {
            return 1;
        }
        return m103659a;
    }
}
