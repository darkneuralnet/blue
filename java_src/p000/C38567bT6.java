package p000;
/* renamed from: bT6 */
/* loaded from: classes5.dex */
public final class C38567bT6 extends AbstractC39234cb7 {
    private static final C38567bT6 zbd;
    private byte zbf = 2;
    private InterfaceC46367ob7 zbe = AbstractC41030fb7.m41147C();

    static {
        C38567bT6 c38567bT6 = new C38567bT6();
        zbd = c38567bT6;
        AbstractC41030fb7.m41135l(C38567bT6.class, c38567bT6);
    }

    private C38567bT6() {
    }

    /* renamed from: G */
    public static C38567bT6 m64511G() {
        return zbd;
    }

    @Override // p000.AbstractC41030fb7
    /* renamed from: p */
    public final Object mo1009p(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (obj == null) {
                                b = 0;
                            }
                            this.zbf = b;
                            return null;
                        }
                        return zbd;
                    }
                    return new YS6(null);
                }
                return new C38567bT6();
            }
            return AbstractC41030fb7.m41144c(zbd, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u001b", new Object[]{"zbe", C37974aT6.class});
        }
        return Byte.valueOf(this.zbf);
    }
}
