package p000;
/* renamed from: FV7 */
/* loaded from: classes6.dex */
public final class FV7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final FV7 zzb;
    private InterfaceC45964nu7 zze = AbstractC40627eu7.m42399s();

    static {
        FV7 fv7 = new FV7();
        zzb = fv7;
        AbstractC40627eu7.m42395x(FV7.class, fv7);
    }

    private FV7() {
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
                    return new C48091rV7(null);
                }
                return new FV7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", C39790dV7.class});
        }
        return (byte) 1;
    }
}
