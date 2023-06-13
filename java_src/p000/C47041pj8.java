package p000;
/* renamed from: pj8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47041pj8 extends AbstractC46897pU8 implements A19 {
    private static final C47041pj8 zza;
    private int zzd;
    private int zze;
    private C34789No8 zzf;
    private C34789No8 zzg;
    private boolean zzh;

    static {
        C47041pj8 c47041pj8 = new C47041pj8();
        zza = c47041pj8;
        AbstractC46897pU8.m19196w(C47041pj8.class, c47041pj8);
    }

    private C47041pj8() {
    }

    /* renamed from: C */
    public static C38722bj8 m18889C() {
        return (C38722bj8) zza.m19209i();
    }

    /* renamed from: G */
    public static /* synthetic */ void m18885G(C47041pj8 c47041pj8, int i) {
        c47041pj8.zzd |= 1;
        c47041pj8.zze = i;
    }

    /* renamed from: H */
    public static /* synthetic */ void m18884H(C47041pj8 c47041pj8, C34789No8 c34789No8) {
        c34789No8.getClass();
        c47041pj8.zzf = c34789No8;
        c47041pj8.zzd |= 2;
    }

    /* renamed from: I */
    public static /* synthetic */ void m18883I(C47041pj8 c47041pj8, C34789No8 c34789No8) {
        c47041pj8.zzg = c34789No8;
        c47041pj8.zzd |= 4;
    }

    /* renamed from: J */
    public static /* synthetic */ void m18882J(C47041pj8 c47041pj8, boolean z) {
        c47041pj8.zzd |= 8;
        c47041pj8.zzh = z;
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
                    return new C38722bj8(null);
                }
                return new C47041pj8();
            }
            return AbstractC46897pU8.m19199t(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    /* renamed from: B */
    public final int m18890B() {
        return this.zze;
    }

    /* renamed from: E */
    public final C34789No8 m18887E() {
        C34789No8 c34789No8 = this.zzf;
        return c34789No8 == null ? C34789No8.m93380H() : c34789No8;
    }

    /* renamed from: F */
    public final C34789No8 m18886F() {
        C34789No8 c34789No8 = this.zzg;
        return c34789No8 == null ? C34789No8.m93380H() : c34789No8;
    }

    /* renamed from: K */
    public final boolean m18881K() {
        return this.zzh;
    }

    /* renamed from: M */
    public final boolean m18880M() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: N */
    public final boolean m18879N() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: O */
    public final boolean m18878O() {
        return (this.zzd & 4) != 0;
    }
}
