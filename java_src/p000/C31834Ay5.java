package p000;
/* renamed from: Ay5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C31834Ay5 implements InterfaceC52637zA0 {

    /* renamed from: a */
    public final String f1482a;

    /* renamed from: b */
    public final EnumC0364a f1483b;

    /* renamed from: c */
    public final C27640qe f1484c;

    /* renamed from: d */
    public final C27640qe f1485d;

    /* renamed from: e */
    public final C27640qe f1486e;

    /* renamed from: f */
    public final boolean f1487f;

    /* renamed from: Ay5$a */
    /* loaded from: classes2.dex */
    public enum EnumC0364a {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        /* renamed from: b */
        public static EnumC0364a m114807b(int i) {
            if (i != 1) {
                if (i == 2) {
                    return INDIVIDUALLY;
                }
                throw new IllegalArgumentException("Unknown trim path type " + i);
            }
            return SIMULTANEOUSLY;
        }
    }

    public C31834Ay5(String str, EnumC0364a enumC0364a, C27640qe c27640qe, C27640qe c27640qe2, C27640qe c27640qe3, boolean z) {
        this.f1482a = str;
        this.f1483b = enumC0364a;
        this.f1484c = c27640qe;
        this.f1485d = c27640qe2;
        this.f1486e = c27640qe3;
        this.f1487f = z;
    }

    @Override // p000.InterfaceC52637zA0
    /* renamed from: a */
    public InterfaceC36752Vz0 mo483a(RD2 rd2, C47924rD2 c47924rD2, AbstractC27525qB abstractC27525qB) {
        return new C51691xa6(abstractC27525qB, this);
    }

    /* renamed from: b */
    public C27640qe m114814b() {
        return this.f1485d;
    }

    /* renamed from: c */
    public String m114813c() {
        return this.f1482a;
    }

    /* renamed from: d */
    public C27640qe m114812d() {
        return this.f1486e;
    }

    /* renamed from: e */
    public C27640qe m114811e() {
        return this.f1484c;
    }

    /* renamed from: f */
    public EnumC0364a m114810f() {
        return this.f1483b;
    }

    /* renamed from: g */
    public boolean m114809g() {
        return this.f1487f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f1484c + ", end: " + this.f1485d + ", offset: " + this.f1486e + "}";
    }
}
