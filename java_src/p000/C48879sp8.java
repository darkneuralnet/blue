package p000;
/* renamed from: sp8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48879sp8 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C48879sp8 zzb;
    private InterfaceC45964nu7 zze = AbstractC40627eu7.m42399s();

    static {
        C48879sp8 c48879sp8 = new C48879sp8();
        zzb = c48879sp8;
        AbstractC40627eu7.m42395x(C48879sp8.class, c48879sp8);
    }

    private C48879sp8() {
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
                    return new C41764gp8(null);
                }
                return new C48879sp8();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", C51230wn8.class});
        }
        return (byte) 1;
    }
}
