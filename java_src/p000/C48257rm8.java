package p000;
/* renamed from: rm8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C48257rm8 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C48257rm8 zzb;
    private int zze;
    private boolean zzf;
    private String zzg = "";

    static {
        C48257rm8 c48257rm8 = new C48257rm8();
        zzb = c48257rm8;
        AbstractC40627eu7.m42395x(C48257rm8.class, c48257rm8);
    }

    private C48257rm8() {
    }

    /* renamed from: D */
    public static C32593Ee8 m15398D() {
        return (C32593Ee8) zzb.m42408f();
    }

    /* renamed from: F */
    public static /* synthetic */ void m15396F(C48257rm8 c48257rm8, boolean z) {
        c48257rm8.zze |= 1;
        c48257rm8.zzf = true;
    }

    /* renamed from: G */
    public static /* synthetic */ void m15395G(C48257rm8 c48257rm8, String str) {
        str.getClass();
        c48257rm8.zze |= 2;
        c48257rm8.zzg = str;
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
                    return new C32593Ee8(null);
                }
                return new C48257rm8();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
