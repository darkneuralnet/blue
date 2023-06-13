package p000;
/* renamed from: sU6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48673sU6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C48673sU6 zbb;
    private int zbd;
    private long zbe;
    private int zbh;
    private int zbi;
    private C43930kU6 zbl;
    private AbstractC32088Ca7 zbm;
    private HU6 zbn;
    private String zbo;
    private InterfaceC46367ob7 zbp;
    private InterfaceC46367ob7 zbq;
    private AbstractC32088Ca7 zbr;
    private String zbs;
    private byte zbt = 2;
    private String zbf = "";
    private String zbg = "";
    private InterfaceC46367ob7 zbj = AbstractC41030fb7.m41147C();
    private String zbk = "";

    static {
        C48673sU6 c48673sU6 = new C48673sU6();
        zbb = c48673sU6;
        AbstractC41030fb7.m41135l(C48673sU6.class, c48673sU6);
    }

    private C48673sU6() {
        AbstractC32088Ca7 abstractC32088Ca7 = AbstractC32088Ca7.f4281c;
        this.zbm = abstractC32088Ca7;
        this.zbo = "";
        this.zbp = AbstractC41030fb7.m41147C();
        this.zbq = AbstractC41030fb7.m41147C();
        this.zbr = abstractC32088Ca7;
        this.zbs = "";
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
                            this.zbt = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new C46895pU6(null);
                }
                return new C48673sU6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u000f\u0000\u0001\u0001\u001c\u000f\u0000\u0003\u0004\u0001ᔂ\u0000\u0002б\u0010ဈ\u0001\u0011ဈ\u0002\u0012င\u0003\u0013င\u0004\u0014\u001a\u0015ဈ\u0005\u0016ည\u0007\u0017ᐉ\b\u0018ᐉ\u0006\u0019ည\n\u001aဈ\t\u001bဈ\u000b\u001c\u001b", new Object[]{"zbd", "zbe", "zbp", C48081rU6.class, "zbf", "zbg", "zbh", "zbi", "zbj", "zbk", "zbm", "zbn", "zbl", "zbr", "zbo", "zbs", "zbq", C45709nU6.class});
        }
        return Byte.valueOf(this.zbt);
    }
}
