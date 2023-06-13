package p000;
/* renamed from: nx8 */
/* loaded from: classes5.dex */
public final class C45995nx8 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C45995nx8 zzb;
    private int zze;
    private int zzf;
    private long zzg;
    private long zzh;

    static {
        C45995nx8 c45995nx8 = new C45995nx8();
        zzb = c45995nx8;
        AbstractC40627eu7.m42395x(C45995nx8.class, c45995nx8);
    }

    private C45995nx8() {
    }

    /* renamed from: G */
    public static C39473cx8 m22100G() {
        return (C39473cx8) zzb.m42408f();
    }

    /* renamed from: I */
    public static /* synthetic */ void m22098I(C45995nx8 c45995nx8, int i) {
        c45995nx8.zze |= 1;
        c45995nx8.zzf = i;
    }

    /* renamed from: J */
    public static /* synthetic */ void m22097J(C45995nx8 c45995nx8, long j) {
        c45995nx8.zze |= 2;
        c45995nx8.zzg = j;
    }

    /* renamed from: K */
    public static /* synthetic */ void m22096K(C45995nx8 c45995nx8, long j) {
        c45995nx8.zze |= 4;
        c45995nx8.zzh = j;
    }

    @Override // p000.AbstractC40627eu7
    /* renamed from: B */
    public final Object mo5B(int i, Object obj, Object obj2) {
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
                    return new C39473cx8(null);
                }
                return new C45995nx8();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    /* renamed from: D */
    public final int m22103D() {
        return this.zzf;
    }

    /* renamed from: E */
    public final long m22102E() {
        return this.zzg;
    }

    /* renamed from: F */
    public final long m22101F() {
        return this.zzh;
    }
}
