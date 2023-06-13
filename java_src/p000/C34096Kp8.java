package p000;
/* renamed from: Kp8 */
/* loaded from: classes5.dex */
public final class C34096Kp8 extends AbstractC46897pU8 implements A19 {
    private static final C34096Kp8 zza;
    private int zzd;
    private long zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        C34096Kp8 c34096Kp8 = new C34096Kp8();
        zza = c34096Kp8;
        AbstractC46897pU8.m19196w(C34096Kp8.class, c34096Kp8);
    }

    private C34096Kp8() {
    }

    /* renamed from: E */
    public static C52436yp8 m98256E() {
        return (C52436yp8) zza.m19209i();
    }

    /* renamed from: I */
    public static /* synthetic */ void m98252I(C34096Kp8 c34096Kp8, long j) {
        c34096Kp8.zzd |= 1;
        c34096Kp8.zze = j;
    }

    /* renamed from: J */
    public static /* synthetic */ void m98251J(C34096Kp8 c34096Kp8, String str) {
        str.getClass();
        c34096Kp8.zzd |= 2;
        c34096Kp8.zzf = str;
    }

    /* renamed from: K */
    public static /* synthetic */ void m98250K(C34096Kp8 c34096Kp8, String str) {
        str.getClass();
        c34096Kp8.zzd |= 4;
        c34096Kp8.zzg = str;
    }

    /* renamed from: M */
    public static /* synthetic */ void m98249M(C34096Kp8 c34096Kp8) {
        c34096Kp8.zzd &= -5;
        c34096Kp8.zzg = zza.zzg;
    }

    /* renamed from: N */
    public static /* synthetic */ void m98248N(C34096Kp8 c34096Kp8, long j) {
        c34096Kp8.zzd |= 8;
        c34096Kp8.zzh = j;
    }

    /* renamed from: O */
    public static /* synthetic */ void m98247O(C34096Kp8 c34096Kp8) {
        c34096Kp8.zzd &= -9;
        c34096Kp8.zzh = 0L;
    }

    /* renamed from: P */
    public static /* synthetic */ void m98246P(C34096Kp8 c34096Kp8, double d) {
        c34096Kp8.zzd |= 32;
        c34096Kp8.zzj = d;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m98245Q(C34096Kp8 c34096Kp8) {
        c34096Kp8.zzd &= -33;
        c34096Kp8.zzj = 0.0d;
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
                    return new C52436yp8(null);
                }
                return new C34096Kp8();
            }
            return AbstractC46897pU8.m19199t(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }

    /* renamed from: B */
    public final double m98259B() {
        return this.zzj;
    }

    /* renamed from: C */
    public final long m98258C() {
        return this.zzh;
    }

    /* renamed from: D */
    public final long m98257D() {
        return this.zze;
    }

    /* renamed from: G */
    public final String m98254G() {
        return this.zzf;
    }

    /* renamed from: H */
    public final String m98253H() {
        return this.zzg;
    }

    /* renamed from: R */
    public final boolean m98244R() {
        return (this.zzd & 32) != 0;
    }

    /* renamed from: S */
    public final boolean m98243S() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: T */
    public final boolean m98242T() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: U */
    public final boolean m98241U() {
        return (this.zzd & 4) != 0;
    }
}
