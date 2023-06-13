package p000;

import java.io.IOException;
import p000.C35916Sk1;
/* renamed from: yf8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C52336yf8 implements InterfaceC34919Od3 {

    /* renamed from: a */
    public static final C52336yf8 f119957a = new C52336yf8();

    /* renamed from: b */
    public static final C35916Sk1 f119958b;

    /* renamed from: c */
    public static final C35916Sk1 f119959c;

    /* renamed from: d */
    public static final C35916Sk1 f119960d;

    /* renamed from: e */
    public static final C35916Sk1 f119961e;

    /* renamed from: f */
    public static final C35916Sk1 f119962f;

    /* renamed from: g */
    public static final C35916Sk1 f119963g;

    static {
        C35916Sk1.C7526b m84930a = C35916Sk1.m84930a("landmarkMode");
        C46258oP7 c46258oP7 = new C46258oP7();
        c46258oP7.m21095a(1);
        f119958b = m84930a.m84925b(c46258oP7.m21094b()).m84926a();
        C35916Sk1.C7526b m84930a2 = C35916Sk1.m84930a("classificationMode");
        C46258oP7 c46258oP72 = new C46258oP7();
        c46258oP72.m21095a(2);
        f119959c = m84930a2.m84925b(c46258oP72.m21094b()).m84926a();
        C35916Sk1.C7526b m84930a3 = C35916Sk1.m84930a("performanceMode");
        C46258oP7 c46258oP73 = new C46258oP7();
        c46258oP73.m21095a(3);
        f119960d = m84930a3.m84925b(c46258oP73.m21094b()).m84926a();
        C35916Sk1.C7526b m84930a4 = C35916Sk1.m84930a("contourMode");
        C46258oP7 c46258oP74 = new C46258oP7();
        c46258oP74.m21095a(4);
        f119961e = m84930a4.m84925b(c46258oP74.m21094b()).m84926a();
        C35916Sk1.C7526b m84930a5 = C35916Sk1.m84930a("isTrackingEnabled");
        C46258oP7 c46258oP75 = new C46258oP7();
        c46258oP75.m21095a(5);
        f119962f = m84930a5.m84925b(c46258oP75.m21094b()).m84926a();
        C35916Sk1.C7526b m84930a6 = C35916Sk1.m84930a("minFaceSize");
        C46258oP7 c46258oP76 = new C46258oP7();
        c46258oP76.m21095a(6);
        f119963g = m84930a6.m84925b(c46258oP76.m21094b()).m84926a();
    }

    private C52336yf8() {
    }

    @Override // p000.InterfaceC45768nb1
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
        BE8 be8 = (BE8) obj;
        InterfaceC35153Pd3 interfaceC35153Pd32 = interfaceC35153Pd3;
        interfaceC35153Pd32.mo23527f(f119958b, be8.m114193c());
        interfaceC35153Pd32.mo23527f(f119959c, be8.m114195a());
        interfaceC35153Pd32.mo23527f(f119960d, be8.m114192d());
        interfaceC35153Pd32.mo23527f(f119961e, be8.m114194b());
        interfaceC35153Pd32.mo23527f(f119962f, be8.m114191e());
        interfaceC35153Pd32.mo23527f(f119963g, be8.m114190f());
    }
}
