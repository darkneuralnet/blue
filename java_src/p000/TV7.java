package p000;
/* renamed from: TV7 */
/* loaded from: classes6.dex */
public final class TV7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final TV7 zzb;
    private int zze;
    private Object zzg;
    private int zzf = 0;
    private String zzh = "";

    static {
        TV7 tv7 = new TV7();
        zzb = tv7;
        AbstractC40627eu7.m42395x(TV7.class, tv7);
    }

    private TV7() {
    }

    /* renamed from: D */
    public static CU7 m83508D() {
        return (CU7) zzb.m42408f();
    }

    /* renamed from: F */
    public static /* synthetic */ void m83506F(TV7 tv7, String str) {
        tv7.zze |= 1;
        tv7.zzh = "MobileObjectLocalizerV3_1TfLiteClient";
    }

    /* renamed from: G */
    public static /* synthetic */ void m83505G(TV7 tv7, long j) {
        tv7.zzf = 2;
        tv7.zzg = 300000L;
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
                    return new CU7(null);
                }
                return new TV7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဵ\u0000\u0003ြ\u0000", new Object[]{"zzg", "zzf", "zze", "zzh", FV7.class});
        }
        return (byte) 1;
    }
}
