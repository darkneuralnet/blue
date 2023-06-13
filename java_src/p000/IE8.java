package p000;

import java.io.IOException;
import p000.C35916Sk1;
/* renamed from: IE8 */
/* loaded from: classes5.dex */
public final class IE8 implements InterfaceC34919Od3 {

    /* renamed from: a */
    public static final IE8 f14926a = new IE8();

    /* renamed from: b */
    public static final C35916Sk1 f14927b;

    /* renamed from: c */
    public static final C35916Sk1 f14928c;

    /* renamed from: d */
    public static final C35916Sk1 f14929d;

    /* renamed from: e */
    public static final C35916Sk1 f14930e;

    /* renamed from: f */
    public static final C35916Sk1 f14931f;

    static {
        C35916Sk1.C7526b m84930a = C35916Sk1.m84930a("inferenceCommonLogEvent");
        C52545z08 c52545z08 = new C52545z08();
        c52545z08.m2111a(1);
        f14927b = m84930a.m84925b(c52545z08.m2110b()).m84926a();
        C35916Sk1.C7526b m84930a2 = C35916Sk1.m84930a("options");
        C52545z08 c52545z082 = new C52545z08();
        c52545z082.m2111a(2);
        f14928c = m84930a2.m84925b(c52545z082.m2110b()).m84926a();
        C35916Sk1.C7526b m84930a3 = C35916Sk1.m84930a("detectedBarcodeFormats");
        C52545z08 c52545z083 = new C52545z08();
        c52545z083.m2111a(3);
        f14929d = m84930a3.m84925b(c52545z083.m2110b()).m84926a();
        C35916Sk1.C7526b m84930a4 = C35916Sk1.m84930a("detectedBarcodeValueTypes");
        C52545z08 c52545z084 = new C52545z08();
        c52545z084.m2111a(4);
        f14930e = m84930a4.m84925b(c52545z084.m2110b()).m84926a();
        C35916Sk1.C7526b m84930a5 = C35916Sk1.m84930a("imageInfo");
        C52545z08 c52545z085 = new C52545z08();
        c52545z085.m2111a(5);
        f14931f = m84930a5.m84925b(c52545z085.m2110b()).m84926a();
    }

    private IE8() {
    }

    @Override // p000.InterfaceC45768nb1
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
        Y79 y79 = (Y79) obj;
        InterfaceC35153Pd3 interfaceC35153Pd32 = interfaceC35153Pd3;
        interfaceC35153Pd32.mo23527f(f14927b, y79.m75559d());
        interfaceC35153Pd32.mo23527f(f14928c, y79.m75558e());
        interfaceC35153Pd32.mo23527f(f14929d, y79.m75562a());
        interfaceC35153Pd32.mo23527f(f14930e, y79.m75561b());
        interfaceC35153Pd32.mo23527f(f14931f, y79.m75560c());
    }
}
