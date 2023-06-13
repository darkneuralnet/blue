package p000;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuw;
/* renamed from: o07 */
/* loaded from: classes6.dex */
public final class C46023o07 extends AbstractC39234cb7 {
    private static final C46023o07 zbd;
    private C32583Ed7 zbA;
    private C43701k57 zbC;
    private H47 zbD;
    private R47 zbE;
    private PQ6 zbF;
    private JR6 zbG;
    private C48728sa7 zbH;
    private C49650u77 zbJ;
    private J87 zbK;
    private C46311oV6 zbL;
    private C46311oV6 zbM;
    private C46311oV6 zbN;
    private int zbe;
    private int zbf;
    private long zbg;
    private C50795w37 zbh;
    private C43701k57 zbi;
    private H47 zbj;
    private C50212v47 zbk;
    private int zbl;
    private C45691nS6 zbm;
    private G97 zbn;
    private ES6 zbo;
    private C38347b57 zbp;
    private C40706f27 zbq;
    private C45430n07 zbr;
    private RZ6 zbs;
    private PV6 zbt;
    private C41289g17 zbu;
    private boolean zbv;
    private RX6 zbw;
    private C48673sU6 zbx;
    private C50442vT6 zby;
    private MY6 zbz;
    private byte zbO = 2;
    private InterfaceC46367ob7 zbB = AbstractC41030fb7.m41147C();
    private String zbI = "";

    static {
        C46023o07 c46023o07 = new C46023o07();
        zbd = c46023o07;
        AbstractC41030fb7.m41135l(C46023o07.class, c46023o07);
    }

    private C46023o07() {
    }

    /* renamed from: G */
    public static C46023o07 m21998G() {
        return zbd;
    }

    /* renamed from: H */
    public static C46023o07 m21997H(byte[] bArr, C34896Oa7 c34896Oa7) throws zbuw {
        return (C46023o07) AbstractC41030fb7.m41124y(zbd, bArr, c34896Oa7);
    }

    /* renamed from: I */
    public final JR6 m21996I() {
        JR6 jr6 = this.zbG;
        return jr6 == null ? JR6.m100459G() : jr6;
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
                            this.zbO = b;
                            return null;
                        }
                        return zbd;
                    }
                    return new C44837m07(null);
                }
                return new C46023o07();
            }
            return AbstractC41030fb7.m41144c(zbd, "\u0001\"\u0000\u0002\u0001'\"\u0000\u0001\t\u0001ဂ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဌ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\nဉ\t\u000bᐉ\n\fဉ\u000e\rဉ\u000b\u000eဉ\r\u0010ဇ\u000f\u0011ဉ\u0010\u0012ဉ\f\u0013ᐉ\u0011\u0014ဉ\u0012\u0015ᐉ\u0013\u0016ဉ\u0014\u0018\u001b\u0019ဉ\u0017\u001aဉ\u0018\u001bᐉ\u0015\u001eဉ\u0016\u001fᐉ\u0019!ဉ\u001a\"ဈ\u001b#ဉ\u001c$ဉ\u001d%ဉ\u001e&ဉ\u001f'ဉ ", new Object[]{"zbe", "zbf", "zbg", "zbh", "zbi", "zbj", "zbk", "zbl", F17.m108099a(), "zbm", "zbn", "zbo", "zbp", "zbq", "zbu", "zbr", "zbt", "zbv", "zbw", "zbs", "zbx", "zby", "zbz", "zbA", "zbB", G07.class, "zbE", "zbF", "zbC", "zbD", "zbG", "zbH", "zbI", "zbJ", "zbK", "zbL", "zbM", "zbN"});
        }
        return Byte.valueOf(this.zbO);
    }
}
