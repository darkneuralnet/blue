package p000;
/* renamed from: aH8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37868aH8 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C37868aH8 zzb;
    private int zze;
    private int zzf;
    private Y08 zzg;

    static {
        C37868aH8 c37868aH8 = new C37868aH8();
        zzb = c37868aH8;
        AbstractC40627eu7.m42395x(C37868aH8.class, c37868aH8);
    }

    private C37868aH8() {
    }

    /* renamed from: D */
    public static C50273vA8 m71702D() {
        return (C50273vA8) zzb.m42408f();
    }

    /* renamed from: F */
    public static /* synthetic */ void m71700F(C37868aH8 c37868aH8, int i) {
        c37868aH8.zzf = 1;
        c37868aH8.zze = 1 | c37868aH8.zze;
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
                    return new C50273vA8(null);
                }
                return new C37868aH8();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", R49.f31484a, "zzg"});
        }
        return (byte) 1;
    }
}
