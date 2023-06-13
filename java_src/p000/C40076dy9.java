package p000;
/* renamed from: dy9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40076dy9 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C40076dy9 zzb;
    private InterfaceC45964nu7 zze = AbstractC40627eu7.m42399s();

    static {
        C40076dy9 c40076dy9 = new C40076dy9();
        zzb = c40076dy9;
        AbstractC40627eu7.m42395x(C40076dy9.class, c40076dy9);
    }

    private C40076dy9() {
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
                    return new C39484cy9(null);
                }
                return new C40076dy9();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", C38280ay9.class});
        }
        return (byte) 1;
    }
}
