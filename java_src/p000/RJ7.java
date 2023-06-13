package p000;
/* renamed from: RJ7 */
/* loaded from: classes5.dex */
public final class RJ7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final RJ7 zzb;
    private UJ7 zze;
    private OJ7 zzf;
    private String zzg = "";

    static {
        RJ7 rj7 = new RJ7();
        zzb = rj7;
        AbstractC40627eu7.m42395x(RJ7.class, rj7);
    }

    private RJ7() {
    }

    /* renamed from: E */
    public static QJ7 m86963E() {
        return (QJ7) zzb.m42408f();
    }

    /* renamed from: I */
    public static /* synthetic */ void m86959I(RJ7 rj7, UJ7 uj7) {
        uj7.getClass();
        rj7.zze = uj7;
    }

    /* renamed from: J */
    public static /* synthetic */ void m86958J(RJ7 rj7, OJ7 oj7) {
        oj7.getClass();
        rj7.zzf = oj7;
    }

    /* renamed from: K */
    public static /* synthetic */ void m86957K(RJ7 rj7, String str) {
        str.getClass();
        rj7.zzg = str;
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
                    return new QJ7(null);
                }
                return new RJ7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003Ȉ", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    /* renamed from: D */
    public final OJ7 m86964D() {
        OJ7 oj7 = this.zzf;
        return oj7 == null ? OJ7.m92411G() : oj7;
    }

    /* renamed from: G */
    public final UJ7 m86961G() {
        UJ7 uj7 = this.zze;
        return uj7 == null ? UJ7.m81633F() : uj7;
    }

    /* renamed from: H */
    public final String m86960H() {
        return this.zzg;
    }
}
