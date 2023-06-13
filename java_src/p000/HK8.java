package p000;
/* renamed from: HK8 */
/* loaded from: classes5.dex */
public final class HK8 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final HK8 zzb;
    private InterfaceC45964nu7 zze = AbstractC40627eu7.m42399s();

    static {
        HK8 hk8 = new HK8();
        zzb = hk8;
        AbstractC40627eu7.m42395x(HK8.class, hk8);
    }

    private HK8() {
    }

    /* renamed from: G */
    public static HK8 m103985G() {
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
                    return new C50363vK8(null);
                }
                return new HK8();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", YJ8.class});
        }
        return (byte) 1;
    }

    /* renamed from: D */
    public final int m103988D() {
        return this.zze.size();
    }

    /* renamed from: E */
    public final YJ8 m103987E(int i) {
        return (YJ8) this.zze.get(i);
    }
}
