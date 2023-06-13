package p000;
/* renamed from: SE7 */
/* loaded from: classes5.dex */
public final class SE7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final SE7 zzb;
    private InterfaceC45964nu7 zze = AbstractC40627eu7.m42399s();

    static {
        SE7 se7 = new SE7();
        zzb = se7;
        AbstractC40627eu7.m42395x(SE7.class, se7);
    }

    private SE7() {
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
                    return new RE7(null);
                }
                return new SE7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", PE7.class});
        }
        return (byte) 1;
    }
}
