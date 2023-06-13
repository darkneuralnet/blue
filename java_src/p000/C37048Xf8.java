package p000;
/* renamed from: Xf8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C37048Xf8 extends AbstractC46897pU8 implements A19 {
    private static final C37048Xf8 zza;
    private int zzd;
    private String zze = "";
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        C37048Xf8 c37048Xf8 = new C37048Xf8();
        zza = c37048Xf8;
        AbstractC46897pU8.m19196w(C37048Xf8.class, c37048Xf8);
    }

    private C37048Xf8() {
    }

    /* renamed from: E */
    public static /* synthetic */ void m76715E(C37048Xf8 c37048Xf8, String str) {
        str.getClass();
        c37048Xf8.zzd |= 1;
        c37048Xf8.zze = str;
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
                    return new C33304Hf8(null);
                }
                return new C37048Xf8();
            }
            return AbstractC46897pU8.m19199t(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    /* renamed from: B */
    public final int m76718B() {
        return this.zzh;
    }

    /* renamed from: D */
    public final String m76716D() {
        return this.zze;
    }

    /* renamed from: F */
    public final boolean m76714F() {
        return this.zzf;
    }

    /* renamed from: G */
    public final boolean m76713G() {
        return this.zzg;
    }

    /* renamed from: H */
    public final boolean m76712H() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: I */
    public final boolean m76711I() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: J */
    public final boolean m76710J() {
        return (this.zzd & 8) != 0;
    }
}
