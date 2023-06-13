package p000;

import java.io.IOException;
import p000.C35916Sk1;
/* renamed from: Hk8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C33349Hk8 implements InterfaceC34919Od3 {

    /* renamed from: a */
    public static final C33349Hk8 f13834a = new C33349Hk8();

    /* renamed from: b */
    public static final C35916Sk1 f13835b;

    /* renamed from: c */
    public static final C35916Sk1 f13836c;

    /* renamed from: d */
    public static final C35916Sk1 f13837d;

    /* renamed from: e */
    public static final C35916Sk1 f13838e;

    /* renamed from: f */
    public static final C35916Sk1 f13839f;

    /* renamed from: g */
    public static final C35916Sk1 f13840g;

    static {
        C35916Sk1.C7526b m84930a = C35916Sk1.m84930a("maxMs");
        C43347jV7 c43347jV7 = new C43347jV7();
        c43347jV7.m30420a(1);
        f13835b = m84930a.m84925b(c43347jV7.m30419b()).m84926a();
        C35916Sk1.C7526b m84930a2 = C35916Sk1.m84930a("minMs");
        C43347jV7 c43347jV72 = new C43347jV7();
        c43347jV72.m30420a(2);
        f13836c = m84930a2.m84925b(c43347jV72.m30419b()).m84926a();
        C35916Sk1.C7526b m84930a3 = C35916Sk1.m84930a("avgMs");
        C43347jV7 c43347jV73 = new C43347jV7();
        c43347jV73.m30420a(3);
        f13837d = m84930a3.m84925b(c43347jV73.m30419b()).m84926a();
        C35916Sk1.C7526b m84930a4 = C35916Sk1.m84930a("firstQuartileMs");
        C43347jV7 c43347jV74 = new C43347jV7();
        c43347jV74.m30420a(4);
        f13838e = m84930a4.m84925b(c43347jV74.m30419b()).m84926a();
        C35916Sk1.C7526b m84930a5 = C35916Sk1.m84930a("medianMs");
        C43347jV7 c43347jV75 = new C43347jV7();
        c43347jV75.m30420a(5);
        f13839f = m84930a5.m84925b(c43347jV75.m30419b()).m84926a();
        C35916Sk1.C7526b m84930a6 = C35916Sk1.m84930a("thirdQuartileMs");
        C43347jV7 c43347jV76 = new C43347jV7();
        c43347jV76.m30420a(6);
        f13840g = m84930a6.m84925b(c43347jV76.m30419b()).m84926a();
    }

    private C33349Hk8() {
    }

    @Override // p000.InterfaceC45768nb1
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
        C40859fI8 c40859fI8 = (C40859fI8) obj;
        InterfaceC35153Pd3 interfaceC35153Pd32 = interfaceC35153Pd3;
        interfaceC35153Pd32.mo23527f(f13835b, c40859fI8.m41596c());
        interfaceC35153Pd32.mo23527f(f13836c, c40859fI8.m41594e());
        interfaceC35153Pd32.mo23527f(f13837d, c40859fI8.m41598a());
        interfaceC35153Pd32.mo23527f(f13838e, c40859fI8.m41597b());
        interfaceC35153Pd32.mo23527f(f13839f, c40859fI8.m41595d());
        interfaceC35153Pd32.mo23527f(f13840g, c40859fI8.m41593f());
    }
}
