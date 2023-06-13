package p000;
/* renamed from: ed9 */
/* loaded from: classes5.dex */
public final class C40459ed9 extends AbstractC49926ub9 implements InterfaceC51161wg9 {
    private static final C40459ed9 zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;
    private long zzk;
    private String zzl = "";

    static {
        C40459ed9 c40459ed9 = new C40459ed9();
        zzb = c40459ed9;
        AbstractC49926ub9.m9987k(C40459ed9.class, c40459ed9);
    }

    private C40459ed9() {
    }

    /* renamed from: A */
    public static /* synthetic */ void m42683A(C40459ed9 c40459ed9, int i) {
        c40459ed9.zzi = i - 1;
        c40459ed9.zze |= 8;
    }

    /* renamed from: u */
    public static C39593d99 m42682u() {
        return (C39593d99) zzb.m9984o();
    }

    /* renamed from: w */
    public static /* synthetic */ void m42680w(C40459ed9 c40459ed9, int i) {
        c40459ed9.zze |= 1;
        c40459ed9.zzf = i;
    }

    /* renamed from: x */
    public static /* synthetic */ void m42679x(C40459ed9 c40459ed9, long j) {
        c40459ed9.zze |= 32;
        c40459ed9.zzk = j;
    }

    /* renamed from: y */
    public static /* synthetic */ void m42678y(C40459ed9 c40459ed9, int i) {
        c40459ed9.zze |= 2;
        c40459ed9.zzg = i;
    }

    /* renamed from: z */
    public static /* synthetic */ void m42677z(C40459ed9 c40459ed9, int i) {
        c40459ed9.zzh = i - 1;
        c40459ed9.zze |= 4;
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
                    return new C39593d99(null);
                }
                return new C40459ed9();
            }
            return AbstractC49926ub9.m9988j(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဇ\u0004\u0006ဂ\u0005\u0007ဈ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", C41605gZ8.f82428a, "zzi", C52357yh9.f120025a, "zzj", "zzk", "zzl"});
        }
        return (byte) 1;
    }
}
