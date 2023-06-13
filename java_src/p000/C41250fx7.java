package p000;
/* renamed from: fx7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41250fx7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C41250fx7 zzb;
    private InterfaceC45964nu7 zze = AbstractC40627eu7.m42399s();

    static {
        C41250fx7 c41250fx7 = new C41250fx7();
        zzb = c41250fx7;
        AbstractC40627eu7.m42395x(C41250fx7.class, c41250fx7);
    }

    private C41250fx7() {
    }

    /* renamed from: E */
    public static C41250fx7 m40413E() {
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
                    return new C35094Ow7(null);
                }
                return new C41250fx7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", C42436hx7.class});
        }
        return (byte) 1;
    }
}
