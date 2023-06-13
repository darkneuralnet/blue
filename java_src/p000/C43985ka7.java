package p000;
/* renamed from: ka7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43985ka7 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C43985ka7 zbb;
    private String zbd = "";
    private AbstractC32088Ca7 zbe = AbstractC32088Ca7.f4281c;

    static {
        C43985ka7 c43985ka7 = new C43985ka7();
        zbb = c43985ka7;
        AbstractC41030fb7.m41135l(C43985ka7.class, c43985ka7);
    }

    private C43985ka7() {
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
                    return new C43392ja7(null);
                }
                return new C43985ka7();
            }
            return new C42226hc7(zbb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"zbd", "zbe"});
        }
        return (byte) 1;
    }
}
