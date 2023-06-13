package p000;
/* renamed from: Zy7 */
/* loaded from: classes5.dex */
public final class C37686Zy7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C37686Zy7 zzb;
    private int zze;
    private C37218Xy7 zzf;
    private C37218Xy7 zzg;
    private boolean zzh;

    static {
        C37686Zy7 c37686Zy7 = new C37686Zy7();
        zzb = c37686Zy7;
        AbstractC40627eu7.m42395x(C37686Zy7.class, c37686Zy7);
    }

    private C37686Zy7() {
    }

    /* renamed from: F */
    public static C37686Zy7 m72161F() {
        return zzb;
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
                    return new C37452Yy7(null);
                }
                return new C37686Zy7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    /* renamed from: D */
    public final C37218Xy7 m72163D() {
        C37218Xy7 c37218Xy7 = this.zzf;
        return c37218Xy7 == null ? C37218Xy7.m75934E() : c37218Xy7;
    }

    /* renamed from: G */
    public final boolean m72160G() {
        return this.zzh;
    }

    /* renamed from: H */
    public final boolean m72159H() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: I */
    public final boolean m72158I() {
        return (this.zze & 1) != 0;
    }
}
