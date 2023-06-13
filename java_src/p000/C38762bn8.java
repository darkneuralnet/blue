package p000;

import java.io.IOException;
import p000.C35916Sk1;
/* renamed from: bn8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38762bn8 implements InterfaceC34919Od3 {

    /* renamed from: a */
    public static final C38762bn8 f58187a = new C38762bn8();

    /* renamed from: b */
    public static final C35916Sk1 f58188b;

    /* renamed from: c */
    public static final C35916Sk1 f58189c;

    /* renamed from: d */
    public static final C35916Sk1 f58190d;

    /* renamed from: e */
    public static final C35916Sk1 f58191e;

    /* renamed from: f */
    public static final C35916Sk1 f58192f;

    static {
        C35916Sk1.C7526b m84930a = C35916Sk1.m84930a("errorCode");
        QW7 qw7 = new QW7();
        qw7.m88440a(1);
        f58188b = m84930a.m84925b(qw7.m88439b()).m84926a();
        C35916Sk1.C7526b m84930a2 = C35916Sk1.m84930a("hasResult");
        QW7 qw72 = new QW7();
        qw72.m88440a(2);
        f58189c = m84930a2.m84925b(qw72.m88439b()).m84926a();
        C35916Sk1.C7526b m84930a3 = C35916Sk1.m84930a("isColdCall");
        QW7 qw73 = new QW7();
        qw73.m88440a(3);
        f58190d = m84930a3.m84925b(qw73.m88439b()).m84926a();
        C35916Sk1.C7526b m84930a4 = C35916Sk1.m84930a("imageInfo");
        QW7 qw74 = new QW7();
        qw74.m88440a(4);
        f58191e = m84930a4.m84925b(qw74.m88439b()).m84926a();
        C35916Sk1.C7526b m84930a5 = C35916Sk1.m84930a("recognizerOptions");
        QW7 qw75 = new QW7();
        qw75.m88440a(5);
        f58192f = m84930a5.m84925b(qw75.m88439b()).m84926a();
    }

    private C38762bn8() {
    }

    @Override // p000.InterfaceC45768nb1
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
        C46368ob8 c46368ob8 = (C46368ob8) obj;
        InterfaceC35153Pd3 interfaceC35153Pd32 = interfaceC35153Pd3;
        interfaceC35153Pd32.mo23527f(f58188b, c46368ob8.m20800a());
        interfaceC35153Pd32.mo23527f(f58189c, null);
        interfaceC35153Pd32.mo23527f(f58190d, c46368ob8.m20798c());
        interfaceC35153Pd32.mo23527f(f58191e, null);
        interfaceC35153Pd32.mo23527f(f58192f, c46368ob8.m20799b());
    }
}
