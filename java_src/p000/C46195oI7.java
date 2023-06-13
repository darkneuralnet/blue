package p000;
/* renamed from: oI7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C46195oI7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C46195oI7 zzb;
    private InterfaceC43592ju7 zze = AbstractC40627eu7.m42402p();

    static {
        C46195oI7 c46195oI7 = new C46195oI7();
        zzb = c46195oI7;
        AbstractC40627eu7.m42395x(C46195oI7.class, c46195oI7);
    }

    private C46195oI7() {
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
                    return new C45602nI7(null);
                }
                return new C46195oI7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001$", new Object[]{"zze"});
        }
        return (byte) 1;
    }
}
