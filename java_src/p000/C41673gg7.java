package p000;

import java.io.IOException;
import p000.C35916Sk1;
/* renamed from: gg7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41673gg7 implements InterfaceC34919Od3 {

    /* renamed from: a */
    public static final C41673gg7 f84013a = new C41673gg7();

    /* renamed from: b */
    public static final C35916Sk1 f84014b;

    /* renamed from: c */
    public static final C35916Sk1 f84015c;

    /* renamed from: d */
    public static final C35916Sk1 f84016d;

    /* renamed from: e */
    public static final C35916Sk1 f84017e;

    /* renamed from: f */
    public static final C35916Sk1 f84018f;

    /* renamed from: g */
    public static final C35916Sk1 f84019g;

    /* renamed from: h */
    public static final C35916Sk1 f84020h;

    static {
        C35916Sk1.C7526b m84930a = C35916Sk1.m84930a("durationMs");
        F19 f19 = new F19();
        f19.m108098a(1);
        f84014b = m84930a.m84925b(f19.m108097b()).m84926a();
        C35916Sk1.C7526b m84930a2 = C35916Sk1.m84930a("handledErrors");
        F19 f192 = new F19();
        f192.m108098a(2);
        f84015c = m84930a2.m84925b(f192.m108097b()).m84926a();
        C35916Sk1.C7526b m84930a3 = C35916Sk1.m84930a("partiallyHandledErrors");
        F19 f193 = new F19();
        f193.m108098a(3);
        f84016d = m84930a3.m84925b(f193.m108097b()).m84926a();
        C35916Sk1.C7526b m84930a4 = C35916Sk1.m84930a("unhandledErrors");
        F19 f194 = new F19();
        f194.m108098a(4);
        f84017e = m84930a4.m84925b(f194.m108097b()).m84926a();
        C35916Sk1.C7526b m84930a5 = C35916Sk1.m84930a("modelNamespace");
        F19 f195 = new F19();
        f195.m108098a(5);
        f84018f = m84930a5.m84925b(f195.m108097b()).m84926a();
        C35916Sk1.C7526b m84930a6 = C35916Sk1.m84930a("delegateFilter");
        F19 f196 = new F19();
        f196.m108098a(6);
        f84019g = m84930a6.m84925b(f196.m108097b()).m84926a();
        C35916Sk1.C7526b m84930a7 = C35916Sk1.m84930a("httpResponseCode");
        F19 f197 = new F19();
        f197.m108098a(7);
        f84020h = m84930a7.m84925b(f197.m108097b()).m84926a();
    }

    private C41673gg7() {
    }

    @Override // p000.InterfaceC45768nb1
    public final /* synthetic */ void encode(Object obj, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
        dz9 dz9Var = (dz9) obj;
        InterfaceC35153Pd3 interfaceC35153Pd32 = interfaceC35153Pd3;
        interfaceC35153Pd32.mo23527f(f84014b, dz9Var.m43418e());
        interfaceC35153Pd32.mo23527f(f84015c, dz9Var.m43422a());
        interfaceC35153Pd32.mo23527f(f84016d, dz9Var.m43421b());
        interfaceC35153Pd32.mo23527f(f84017e, dz9Var.m43420c());
        interfaceC35153Pd32.mo23527f(f84018f, dz9Var.m43417f());
        interfaceC35153Pd32.mo23527f(f84019g, dz9Var.m43419d());
        interfaceC35153Pd32.mo23527f(f84020h, null);
    }
}
