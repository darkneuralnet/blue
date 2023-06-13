package p000;
/* renamed from: vc8 */
/* loaded from: classes5.dex */
public final class C50527vc8 extends AbstractC46897pU8 implements A19 {
    private static final C50527vc8 zza;
    private int zzd;
    private int zze;
    private String zzf = "";
    private C32323Da8 zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        C50527vc8 c50527vc8 = new C50527vc8();
        zza = c50527vc8;
        AbstractC46897pU8.m19196w(C50527vc8.class, c50527vc8);
    }

    private C50527vc8() {
    }

    /* renamed from: D */
    public static C41634gc8 m8347D() {
        return (C41634gc8) zza.m19209i();
    }

    /* renamed from: G */
    public static /* synthetic */ void m8344G(C50527vc8 c50527vc8, String str) {
        c50527vc8.zzd |= 2;
        c50527vc8.zzf = str;
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
                    return new C41634gc8(null);
                }
                return new C50527vc8();
            }
            return AbstractC46897pU8.m19199t(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }

    /* renamed from: B */
    public final int m8349B() {
        return this.zze;
    }

    /* renamed from: C */
    public final C32323Da8 m8348C() {
        C32323Da8 c32323Da8 = this.zzg;
        return c32323Da8 == null ? C32323Da8.m110144C() : c32323Da8;
    }

    /* renamed from: F */
    public final String m8345F() {
        return this.zzf;
    }

    /* renamed from: H */
    public final boolean m8343H() {
        return this.zzh;
    }

    /* renamed from: I */
    public final boolean m8342I() {
        return this.zzi;
    }

    /* renamed from: J */
    public final boolean m8341J() {
        return this.zzj;
    }

    /* renamed from: K */
    public final boolean m8340K() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: M */
    public final boolean m8339M() {
        return (this.zzd & 32) != 0;
    }
}
