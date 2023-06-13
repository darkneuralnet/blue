package p000;
/* renamed from: Da8 */
/* loaded from: classes5.dex */
public final class C32323Da8 extends AbstractC46897pU8 implements A19 {
    private static final C32323Da8 zza;
    private int zzd;
    private C33520Id8 zze;
    private C36544Vb8 zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        C32323Da8 c32323Da8 = new C32323Da8();
        zza = c32323Da8;
        AbstractC46897pU8.m19196w(C32323Da8.class, c32323Da8);
    }

    private C32323Da8() {
    }

    /* renamed from: C */
    public static C32323Da8 m110144C() {
        return zza;
    }

    /* renamed from: G */
    public static /* synthetic */ void m110140G(C32323Da8 c32323Da8, String str) {
        c32323Da8.zzd |= 8;
        c32323Da8.zzh = str;
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
                    return new C46358oa8(null);
                }
                return new C32323Da8();
            }
            return AbstractC46897pU8.m19199t(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    /* renamed from: D */
    public final C36544Vb8 m110143D() {
        C36544Vb8 c36544Vb8 = this.zzf;
        return c36544Vb8 == null ? C36544Vb8.m79677C() : c36544Vb8;
    }

    /* renamed from: E */
    public final C33520Id8 m110142E() {
        C33520Id8 c33520Id8 = this.zze;
        return c33520Id8 == null ? C33520Id8.m101861D() : c33520Id8;
    }

    /* renamed from: F */
    public final String m110141F() {
        return this.zzh;
    }

    /* renamed from: H */
    public final boolean m110139H() {
        return this.zzg;
    }

    /* renamed from: I */
    public final boolean m110138I() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: J */
    public final boolean m110137J() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: K */
    public final boolean m110136K() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: M */
    public final boolean m110135M() {
        return (this.zzd & 1) != 0;
    }
}
