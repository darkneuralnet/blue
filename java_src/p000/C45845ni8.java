package p000;

import java.io.IOException;
import p000.C35916Sk1;
/* renamed from: ni8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C45845ni8 implements InterfaceC34919Od3 {

    /* renamed from: a */
    public static final C45845ni8 f100382a = new C45845ni8();

    /* renamed from: b */
    public static final C35916Sk1 f100383b;

    /* renamed from: c */
    public static final C35916Sk1 f100384c;

    /* renamed from: d */
    public static final C35916Sk1 f100385d;

    /* renamed from: e */
    public static final C35916Sk1 f100386e;

    /* renamed from: f */
    public static final C35916Sk1 f100387f;

    /* renamed from: g */
    public static final C35916Sk1 f100388g;

    /* renamed from: h */
    public static final C35916Sk1 f100389h;

    static {
        C35916Sk1.C7526b m84930a = C35916Sk1.m84930a("errorCode");
        C52545z08 c52545z08 = new C52545z08();
        c52545z08.m2111a(1);
        f100383b = m84930a.m84925b(c52545z08.m2110b()).m84926a();
        C35916Sk1.C7526b m84930a2 = C35916Sk1.m84930a("hasResult");
        C52545z08 c52545z082 = new C52545z08();
        c52545z082.m2111a(2);
        f100384c = m84930a2.m84925b(c52545z082.m2110b()).m84926a();
        C35916Sk1.C7526b m84930a3 = C35916Sk1.m84930a("isColdCall");
        C52545z08 c52545z083 = new C52545z08();
        c52545z083.m2111a(3);
        f100385d = m84930a3.m84925b(c52545z083.m2110b()).m84926a();
        C35916Sk1.C7526b m84930a4 = C35916Sk1.m84930a("imageInfo");
        C52545z08 c52545z084 = new C52545z08();
        c52545z084.m2111a(4);
        f100386e = m84930a4.m84925b(c52545z084.m2110b()).m84926a();
        C35916Sk1.C7526b m84930a5 = C35916Sk1.m84930a("options");
        C52545z08 c52545z085 = new C52545z08();
        c52545z085.m2111a(5);
        f100387f = m84930a5.m84925b(c52545z085.m2110b()).m84926a();
        C35916Sk1.C7526b m84930a6 = C35916Sk1.m84930a("detectedBarcodeFormats");
        C52545z08 c52545z086 = new C52545z08();
        c52545z086.m2111a(6);
        f100388g = m84930a6.m84925b(c52545z086.m2110b()).m84926a();
        C35916Sk1.C7526b m84930a7 = C35916Sk1.m84930a("detectedBarcodeValueTypes");
        C52545z08 c52545z087 = new C52545z08();
        c52545z087.m2111a(7);
        f100389h = m84930a7.m84925b(c52545z087.m2110b()).m84926a();
    }

    private C45845ni8() {
    }

    @Override // p000.InterfaceC45768nb1
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
        P58 p58 = (P58) obj;
        InterfaceC35153Pd3 interfaceC35153Pd32 = interfaceC35153Pd3;
        interfaceC35153Pd32.mo23527f(f100383b, p58.m90854c());
        interfaceC35153Pd32.mo23527f(f100384c, null);
        interfaceC35153Pd32.mo23527f(f100385d, p58.m90852e());
        interfaceC35153Pd32.mo23527f(f100386e, null);
        interfaceC35153Pd32.mo23527f(f100387f, p58.m90853d());
        interfaceC35153Pd32.mo23527f(f100388g, p58.m90856a());
        interfaceC35153Pd32.mo23527f(f100389h, p58.m90855b());
    }
}
