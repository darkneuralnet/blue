package p000;
/* renamed from: UJ7 */
/* loaded from: classes5.dex */
public final class UJ7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final UJ7 zzb;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        UJ7 uj7 = new UJ7();
        zzb = uj7;
        AbstractC40627eu7.m42395x(UJ7.class, uj7);
    }

    private UJ7() {
    }

    /* renamed from: D */
    public static TJ7 m81635D() {
        return (TJ7) zzb.m42408f();
    }

    /* renamed from: F */
    public static UJ7 m81633F() {
        return zzb;
    }

    /* renamed from: L */
    public static /* synthetic */ void m81627L(UJ7 uj7, String str) {
        str.getClass();
        uj7.zze = str;
    }

    /* renamed from: M */
    public static /* synthetic */ void m81626M(UJ7 uj7, String str) {
        str.getClass();
        uj7.zzh = str;
    }

    /* renamed from: N */
    public static /* synthetic */ void m81625N(UJ7 uj7, String str) {
        str.getClass();
        uj7.zzi = str;
    }

    /* renamed from: O */
    public static /* synthetic */ void m81624O(UJ7 uj7, String str) {
        str.getClass();
        uj7.zzf = str;
    }

    /* renamed from: P */
    public static /* synthetic */ void m81623P(UJ7 uj7, String str) {
        str.getClass();
        uj7.zzg = str;
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
                    return new TJ7(null);
                }
                return new UJ7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    /* renamed from: G */
    public final String m81632G() {
        return this.zzi;
    }

    /* renamed from: H */
    public final String m81631H() {
        return this.zze;
    }

    /* renamed from: I */
    public final String m81630I() {
        return this.zzh;
    }

    /* renamed from: J */
    public final String m81629J() {
        return this.zzg;
    }

    /* renamed from: K */
    public final String m81628K() {
        return this.zzf;
    }
}
