package p000;
/* renamed from: OJ7 */
/* loaded from: classes5.dex */
public final class OJ7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final OJ7 zzb;
    private int zzg;
    private String zze = "";
    private String zzf = "";
    private String zzh = "";

    static {
        OJ7 oj7 = new OJ7();
        zzb = oj7;
        AbstractC40627eu7.m42395x(OJ7.class, oj7);
    }

    private OJ7() {
    }

    /* renamed from: E */
    public static NJ7 m92413E() {
        return (NJ7) zzb.m42408f();
    }

    /* renamed from: G */
    public static OJ7 m92411G() {
        return zzb;
    }

    /* renamed from: K */
    public static /* synthetic */ void m92407K(OJ7 oj7, String str) {
        str.getClass();
        oj7.zze = str;
    }

    /* renamed from: L */
    public static /* synthetic */ void m92406L(OJ7 oj7, String str) {
        str.getClass();
        oj7.zzf = str;
    }

    /* renamed from: N */
    public static /* synthetic */ void m92404N(OJ7 oj7, String str) {
        str.getClass();
        oj7.zzh = str;
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
                    return new NJ7(null);
                }
                return new OJ7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    /* renamed from: D */
    public final int m92414D() {
        return this.zzg;
    }

    /* renamed from: H */
    public final String m92410H() {
        return this.zzh;
    }

    /* renamed from: I */
    public final String m92409I() {
        return this.zzf;
    }

    /* renamed from: J */
    public final String m92408J() {
        return this.zze;
    }
}
