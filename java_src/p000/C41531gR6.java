package p000;
/* renamed from: gR6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41531gR6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C41531gR6 zbb;
    private Object zbe;
    private int zbd = 0;
    private byte zbf = 2;

    static {
        C41531gR6 c41531gR6 = new C41531gR6();
        zbb = c41531gR6;
        AbstractC41030fb7.m41135l(C41531gR6.class, c41531gR6);
    }

    private C41531gR6() {
    }

    /* renamed from: J */
    public static C41531gR6 m39461J() {
        return zbb;
    }

    /* renamed from: E */
    public final boolean m39466E() {
        return this.zbd == 1;
    }

    /* renamed from: F */
    public final C40766f87 m39465F() {
        if (this.zbd == 3) {
            return (C40766f87) this.zbe;
        }
        return C40766f87.m41954F();
    }

    /* renamed from: G */
    public final C44917m87 m39464G() {
        if (this.zbd == 2) {
            return (C44917m87) this.zbe;
        }
        return C44917m87.m26284K();
    }

    /* renamed from: H */
    public final C40938fR6 m39463H() {
        if (this.zbd == 1) {
            return (C40938fR6) this.zbe;
        }
        return C40938fR6.m41363G();
    }

    /* renamed from: K */
    public final boolean m39460K() {
        return this.zbd == 3;
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
                        return zbb;
                    }
                    return new YQ6(null);
                }
                return new C41531gR6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0003\u0001м\u0000\u0002м\u0000\u0003м\u0000", new Object[]{"zbe", "zbd", C40938fR6.class, C44917m87.class, C40766f87.class});
        }
        return Byte.valueOf(this.zbf);
    }
}
