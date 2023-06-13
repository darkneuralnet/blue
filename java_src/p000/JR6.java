package p000;

import java.util.List;
/* renamed from: JR6 */
/* loaded from: classes5.dex */
public final class JR6 extends AbstractC39234cb7 {
    private static final JR6 zbd;
    private int zbe;
    private int zbf;
    private int zbg;
    private C46275oR6 zbh;
    private int zbj;
    private int zbk;
    private C48646sR6 zbm;
    private long zbp;
    private byte zbq = 2;
    private String zbi = "";
    private InterfaceC46367ob7 zbl = AbstractC41030fb7.m41147C();
    private String zbn = "";
    private InterfaceC46367ob7 zbo = AbstractC41030fb7.m41147C();

    static {
        JR6 jr6 = new JR6();
        zbd = jr6;
        AbstractC41030fb7.m41135l(JR6.class, jr6);
    }

    private JR6() {
    }

    /* renamed from: G */
    public static JR6 m100459G() {
        return zbd;
    }

    /* renamed from: H */
    public final List m100458H() {
        return this.zbl;
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
                            this.zbq = b;
                            return null;
                        }
                        return zbd;
                    }
                    return new IR6(null);
                }
                return new JR6();
            }
            return AbstractC41030fb7.m41144c(zbd, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0002\u0003\u0001င\u0000\u0002င\u0001\u0003ᐉ\u0002\u0004ဈ\u0003\u0005င\u0004\u0006င\u0005\u0007Л\bᐉ\u0006\tဈ\u0007\n\u001a\u000bဂ\b", new Object[]{"zbe", "zbf", "zbg", "zbh", "zbi", "zbj", "zbk", "zbl", HR6.class, "zbm", "zbn", "zbo", "zbp"});
        }
        return Byte.valueOf(this.zbq);
    }
}
