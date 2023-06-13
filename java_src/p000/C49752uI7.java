package p000;
/* renamed from: uI7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49752uI7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C49752uI7 zzb;
    private InterfaceC45371mu7 zze = AbstractC40627eu7.m42400r();

    static {
        C49752uI7 c49752uI7 = new C49752uI7();
        zzb = c49752uI7;
        AbstractC40627eu7.m42395x(C49752uI7.class, c49752uI7);
    }

    private C49752uI7() {
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
                    return new C49159tI7(null);
                }
                return new C49752uI7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001%", new Object[]{"zze"});
        }
        return (byte) 1;
    }
}
