package p000;
/* renamed from: mu8 */
/* loaded from: classes5.dex */
public final class C45372mu8 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C45372mu8 zzb;
    private int zze;
    private String zzf = "";
    private float zzg;

    static {
        C45372mu8 c45372mu8 = new C45372mu8();
        zzb = c45372mu8;
        AbstractC40627eu7.m42395x(C45372mu8.class, c45372mu8);
    }

    private C45372mu8() {
    }

    /* renamed from: D */
    public static C37174Xt8 m24718D() {
        return (C37174Xt8) zzb.m42408f();
    }

    /* renamed from: F */
    public static /* synthetic */ void m24716F(C45372mu8 c45372mu8, String str) {
        c45372mu8.zze |= 1;
        c45372mu8.zzf = "/m/0bl9f";
    }

    /* renamed from: G */
    public static /* synthetic */ void m24715G(C45372mu8 c45372mu8, float f) {
        c45372mu8.zze |= 2;
        c45372mu8.zzg = 0.46f;
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
                    return new C37174Xt8(null);
                }
                return new C45372mu8();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
