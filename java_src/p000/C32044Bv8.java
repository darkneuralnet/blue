package p000;

import java.io.IOException;
import p000.C35916Sk1;
/* renamed from: Bv8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C32044Bv8 implements InterfaceC34919Od3 {

    /* renamed from: a */
    public static final C32044Bv8 f3042a = new C32044Bv8();

    /* renamed from: b */
    public static final C35916Sk1 f3043b;

    /* renamed from: c */
    public static final C35916Sk1 f3044c;

    /* renamed from: d */
    public static final C35916Sk1 f3045d;

    /* renamed from: e */
    public static final C35916Sk1 f3046e;

    /* renamed from: f */
    public static final C35916Sk1 f3047f;

    /* renamed from: g */
    public static final C35916Sk1 f3048g;

    static {
        C35916Sk1.C7526b m84930a = C35916Sk1.m84930a("maxMs");
        QW7 qw7 = new QW7();
        qw7.m88440a(1);
        f3043b = m84930a.m84925b(qw7.m88439b()).m84926a();
        C35916Sk1.C7526b m84930a2 = C35916Sk1.m84930a("minMs");
        QW7 qw72 = new QW7();
        qw72.m88440a(2);
        f3044c = m84930a2.m84925b(qw72.m88439b()).m84926a();
        C35916Sk1.C7526b m84930a3 = C35916Sk1.m84930a("avgMs");
        QW7 qw73 = new QW7();
        qw73.m88440a(3);
        f3045d = m84930a3.m84925b(qw73.m88439b()).m84926a();
        C35916Sk1.C7526b m84930a4 = C35916Sk1.m84930a("firstQuartileMs");
        QW7 qw74 = new QW7();
        qw74.m88440a(4);
        f3046e = m84930a4.m84925b(qw74.m88439b()).m84926a();
        C35916Sk1.C7526b m84930a5 = C35916Sk1.m84930a("medianMs");
        QW7 qw75 = new QW7();
        qw75.m88440a(5);
        f3047f = m84930a5.m84925b(qw75.m88439b()).m84926a();
        C35916Sk1.C7526b m84930a6 = C35916Sk1.m84930a("thirdQuartileMs");
        QW7 qw76 = new QW7();
        qw76.m88440a(6);
        f3048g = m84930a6.m84925b(qw76.m88439b()).m84926a();
    }

    private C32044Bv8() {
    }

    @Override // p000.InterfaceC45768nb1
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
        C37706a09 c37706a09 = (C37706a09) obj;
        InterfaceC35153Pd3 interfaceC35153Pd32 = interfaceC35153Pd3;
        interfaceC35153Pd32.mo23527f(f3043b, c37706a09.m72076c());
        interfaceC35153Pd32.mo23527f(f3044c, c37706a09.m72074e());
        interfaceC35153Pd32.mo23527f(f3045d, c37706a09.m72078a());
        interfaceC35153Pd32.mo23527f(f3046e, c37706a09.m72077b());
        interfaceC35153Pd32.mo23527f(f3047f, c37706a09.m72075d());
        interfaceC35153Pd32.mo23527f(f3048g, c37706a09.m72073f());
    }
}
