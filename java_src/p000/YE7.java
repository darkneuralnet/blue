package p000;
/* renamed from: YE7 */
/* loaded from: classes5.dex */
public final class YE7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final YE7 zzb;
    private int zze;
    private float zzf = 0.01f;

    static {
        YE7 ye7 = new YE7();
        zzb = ye7;
        AbstractC40627eu7.m42395x(YE7.class, ye7);
    }

    private YE7() {
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
                    return new XE7(null);
                }
                return new YE7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }
}
