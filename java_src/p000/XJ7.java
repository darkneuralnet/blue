package p000;
/* renamed from: XJ7 */
/* loaded from: classes5.dex */
public final class XJ7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final XJ7 zzb;
    private String zze = "";
    private String zzf = "";
    private int zzg;

    static {
        XJ7 xj7 = new XJ7();
        zzb = xj7;
        AbstractC40627eu7.m42395x(XJ7.class, xj7);
    }

    private XJ7() {
    }

    /* renamed from: E */
    public static WJ7 m77132E() {
        return (WJ7) zzb.m42408f();
    }

    /* renamed from: I */
    public static /* synthetic */ void m77128I(XJ7 xj7, String str) {
        str.getClass();
        xj7.zze = str;
    }

    /* renamed from: J */
    public static /* synthetic */ void m77127J(XJ7 xj7, String str) {
        str.getClass();
        xj7.zzf = str;
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
                    return new WJ7(null);
                }
                return new XJ7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    /* renamed from: D */
    public final int m77133D() {
        return this.zzg;
    }

    /* renamed from: G */
    public final String m77130G() {
        return this.zze;
    }

    /* renamed from: H */
    public final String m77129H() {
        return this.zzf;
    }
}
