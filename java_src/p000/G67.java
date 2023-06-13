package p000;
/* renamed from: G67 */
/* loaded from: classes5.dex */
public final class G67 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final G67 zbb;
    private String zbd = "";
    private boolean zbe;

    static {
        G67 g67 = new G67();
        zbb = g67;
        AbstractC41030fb7.m41135l(G67.class, g67);
    }

    private G67() {
    }

    @Override // p000.AbstractC41030fb7
    /* renamed from: p */
    public final Object mo1009p(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zbb;
                    }
                    return new B67(null);
                }
                return new G67();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"zbd", "zbe"});
        }
        return (byte) 1;
    }
}
