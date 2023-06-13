package p000;

import java.util.List;
/* renamed from: pl8 */
/* loaded from: classes5.dex */
public final class C47061pl8 extends AbstractC46897pU8 implements A19 {
    private static final C47061pl8 zza;
    private int zzd;
    private long zzg;
    private float zzh;
    private double zzi;
    private String zze = "";
    private String zzf = "";
    private NV8 zzj = AbstractC46897pU8.m19202q();

    static {
        C47061pl8 c47061pl8 = new C47061pl8();
        zza = c47061pl8;
        AbstractC46897pU8.m19196w(C47061pl8.class, c47061pl8);
    }

    private C47061pl8() {
    }

    /* renamed from: F */
    public static C39946dl8 m18782F() {
        return (C39946dl8) zza.m19209i();
    }

    /* renamed from: K */
    public static /* synthetic */ void m18777K(C47061pl8 c47061pl8, String str) {
        str.getClass();
        c47061pl8.zzd |= 1;
        c47061pl8.zze = str;
    }

    /* renamed from: M */
    public static /* synthetic */ void m18776M(C47061pl8 c47061pl8, String str) {
        str.getClass();
        c47061pl8.zzd |= 2;
        c47061pl8.zzf = str;
    }

    /* renamed from: N */
    public static /* synthetic */ void m18775N(C47061pl8 c47061pl8) {
        c47061pl8.zzd &= -3;
        c47061pl8.zzf = zza.zzf;
    }

    /* renamed from: O */
    public static /* synthetic */ void m18774O(C47061pl8 c47061pl8, long j) {
        c47061pl8.zzd |= 4;
        c47061pl8.zzg = j;
    }

    /* renamed from: P */
    public static /* synthetic */ void m18773P(C47061pl8 c47061pl8) {
        c47061pl8.zzd &= -5;
        c47061pl8.zzg = 0L;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m18772Q(C47061pl8 c47061pl8, double d) {
        c47061pl8.zzd |= 16;
        c47061pl8.zzi = d;
    }

    /* renamed from: R */
    public static /* synthetic */ void m18771R(C47061pl8 c47061pl8) {
        c47061pl8.zzd &= -17;
        c47061pl8.zzi = 0.0d;
    }

    /* renamed from: S */
    public static /* synthetic */ void m18770S(C47061pl8 c47061pl8, C47061pl8 c47061pl82) {
        c47061pl82.getClass();
        c47061pl8.m18762a0();
        c47061pl8.zzj.add(c47061pl82);
    }

    /* renamed from: T */
    public static /* synthetic */ void m18769T(C47061pl8 c47061pl8, Iterable iterable) {
        c47061pl8.m18762a0();
        QJ8.m88654b(iterable, c47061pl8.zzj);
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
                    return new C39946dl8(null);
                }
                return new C47061pl8();
            }
            return AbstractC46897pU8.m19199t(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", C47061pl8.class});
        }
        return (byte) 1;
    }

    /* renamed from: B */
    public final double m18786B() {
        return this.zzi;
    }

    /* renamed from: C */
    public final float m18785C() {
        return this.zzh;
    }

    /* renamed from: D */
    public final int m18784D() {
        return this.zzj.size();
    }

    /* renamed from: E */
    public final long m18783E() {
        return this.zzg;
    }

    /* renamed from: H */
    public final String m18780H() {
        return this.zze;
    }

    /* renamed from: I */
    public final String m18779I() {
        return this.zzf;
    }

    /* renamed from: J */
    public final List m18778J() {
        return this.zzj;
    }

    /* renamed from: V */
    public final boolean m18767V() {
        return (this.zzd & 16) != 0;
    }

    /* renamed from: W */
    public final boolean m18766W() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: X */
    public final boolean m18765X() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: Y */
    public final boolean m18764Y() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: Z */
    public final boolean m18763Z() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: a0 */
    public final void m18762a0() {
        NV8 nv8 = this.zzj;
        if (!nv8.zzc()) {
            this.zzj = AbstractC46897pU8.m19201r(nv8);
        }
    }
}
