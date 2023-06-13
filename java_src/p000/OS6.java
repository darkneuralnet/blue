package p000;
/* renamed from: OS6 */
/* loaded from: classes5.dex */
public final class OS6 extends AbstractC39234cb7 {
    private static final OS6 zbd;
    private int zbe;
    private Object zbg;
    private Object zbi;
    private AbstractC32088Ca7 zbl;
    private C36786Wc7 zbm;
    private int zbn;
    private boolean zbo;
    private int zbp;
    private AbstractC32088Ca7 zbq;
    private int zbf = 0;
    private int zbh = 0;
    private byte zbr = 2;
    private String zbj = "FaceAttributesClientBrainEmbedder";
    private String zbk = "";

    static {
        OS6 os6 = new OS6();
        zbd = os6;
        AbstractC41030fb7.m41135l(OS6.class, os6);
    }

    private OS6() {
        AbstractC32088Ca7 abstractC32088Ca7 = AbstractC32088Ca7.f4281c;
        this.zbl = abstractC32088Ca7;
        this.zbo = true;
        this.zbp = 1;
        this.zbq = abstractC32088Ca7;
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
                            this.zbr = b;
                            return null;
                        }
                        return zbd;
                    }
                    return new NS6(null);
                }
                return new OS6();
            }
            return AbstractC41030fb7.m41144c(zbd, "\u0001\f\u0002\u0001\u0002\u000f\f\u0000\u0000\u0001\u0002<\u0000\u0003;\u0000\u0004ဇ\u0005\u0005ဌ\u0006\u0007м\u0001\b;\u0001\tဈ\u0000\nဈ\u0001\fင\u0004\rဉ\u0003\u000eည\u0007\u000fည\u0002", new Object[]{"zbg", "zbf", "zbi", "zbh", "zbe", NR6.class, "zbo", "zbp", JS6.f17603a, C38567bT6.class, "zbj", "zbk", "zbn", "zbm", "zbq", "zbl"});
        }
        return Byte.valueOf(this.zbr);
    }
}
