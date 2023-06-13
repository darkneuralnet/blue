package p000;
/* renamed from: Vl7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36633Vl7 extends AbstractC49926ub9 implements InterfaceC51161wg9 {
    private static final C36633Vl7 zzb;
    private int zze;
    private boolean zzj;
    private boolean zzk;
    private boolean zzn;
    private C34077Kn7 zzo;
    private Aq9 zzp;
    private C44758ls7 zzq;
    private float zzf = 0.1f;
    private int zzg = 1;
    private int zzh = 1;
    private int zzi = 1;
    private float zzl = 45.0f;
    private float zzm = 0.5f;

    static {
        C36633Vl7 c36633Vl7 = new C36633Vl7();
        zzb = c36633Vl7;
        AbstractC49926ub9.m9987k(C36633Vl7.class, c36633Vl7);
    }

    private C36633Vl7() {
    }

    /* renamed from: A */
    public static /* synthetic */ void m79447A(C36633Vl7 c36633Vl7, Aq9 aq9) {
        aq9.getClass();
        c36633Vl7.zzp = aq9;
        c36633Vl7.zze |= 1024;
    }

    /* renamed from: B */
    public static /* synthetic */ void m79446B(C36633Vl7 c36633Vl7, C44758ls7 c44758ls7) {
        c44758ls7.getClass();
        c36633Vl7.zzq = c44758ls7;
        c36633Vl7.zze |= 2048;
    }

    /* renamed from: C */
    public static /* synthetic */ void m79445C(C36633Vl7 c36633Vl7, boolean z) {
        c36633Vl7.zze |= 16;
        c36633Vl7.zzj = z;
    }

    /* renamed from: F */
    public static /* synthetic */ void m79442F(C36633Vl7 c36633Vl7, int i) {
        c36633Vl7.zzg = i - 1;
        c36633Vl7.zze |= 2;
    }

    /* renamed from: G */
    public static /* synthetic */ void m79441G(C36633Vl7 c36633Vl7, int i) {
        c36633Vl7.zzh = i - 1;
        c36633Vl7.zze |= 4;
    }

    /* renamed from: H */
    public static /* synthetic */ void m79440H(C36633Vl7 c36633Vl7, int i) {
        c36633Vl7.zzi = i - 1;
        c36633Vl7.zze |= 8;
    }

    /* renamed from: u */
    public static C37560Zk7 m79439u() {
        return (C37560Zk7) zzb.m9984o();
    }

    /* renamed from: w */
    public static /* synthetic */ void m79437w(C36633Vl7 c36633Vl7, float f) {
        c36633Vl7.zze |= 1;
        c36633Vl7.zzf = f;
    }

    /* renamed from: x */
    public static /* synthetic */ void m79436x(C36633Vl7 c36633Vl7, boolean z) {
        c36633Vl7.zze |= 32;
        c36633Vl7.zzk = z;
    }

    /* renamed from: y */
    public static /* synthetic */ void m79435y(C36633Vl7 c36633Vl7, boolean z) {
        c36633Vl7.zze |= 256;
        c36633Vl7.zzn = true;
    }

    /* renamed from: z */
    public static /* synthetic */ void m79434z(C36633Vl7 c36633Vl7, C34077Kn7 c34077Kn7) {
        c34077Kn7.getClass();
        c36633Vl7.zzo = c34077Kn7;
        c36633Vl7.zze |= 512;
    }

    /* renamed from: D */
    public final int m79444D() {
        int m42379a = C40639ev9.m42379a(this.zzh);
        if (m42379a == 0) {
            return 2;
        }
        return m42379a;
    }

    /* renamed from: E */
    public final int m79443E() {
        int m106418a = C32934Fq7.m106418a(this.zzg);
        if (m106418a == 0) {
            return 2;
        }
        return m106418a;
    }

    @Override // p000.AbstractC49926ub9
    /* renamed from: n */
    public final Object mo9690n(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new C37560Zk7(null);
                }
                return new C36633Vl7();
            }
            return AbstractC49926ub9.m9988j(zzb, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ခ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ခ\u0006\bခ\u0007\tဇ\b\nဉ\t\u000bဉ\n\fဉ\u000b", new Object[]{"zze", "zzf", "zzg", C34329Lp7.f22096a, "zzh", It9.f16401a, "zzi", C39432ct7.f75793a, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq"});
        }
        return (byte) 1;
    }
}
