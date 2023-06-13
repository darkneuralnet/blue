package p000;

import java.io.IOException;
import p000.C35916Sk1;
/* renamed from: kR8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43905kR8 implements InterfaceC34919Od3 {

    /* renamed from: a */
    public static final C43905kR8 f94381a = new C43905kR8();

    /* renamed from: b */
    public static final C35916Sk1 f94382b;

    /* renamed from: c */
    public static final C35916Sk1 f94383c;

    /* renamed from: d */
    public static final C35916Sk1 f94384d;

    /* renamed from: e */
    public static final C35916Sk1 f94385e;

    /* renamed from: f */
    public static final C35916Sk1 f94386f;

    /* renamed from: g */
    public static final C35916Sk1 f94387g;

    /* renamed from: h */
    public static final C35916Sk1 f94388h;

    /* renamed from: i */
    public static final C35916Sk1 f94389i;

    /* renamed from: j */
    public static final C35916Sk1 f94390j;

    /* renamed from: k */
    public static final C35916Sk1 f94391k;

    /* renamed from: l */
    public static final C35916Sk1 f94392l;

    /* renamed from: m */
    public static final C35916Sk1 f94393m;

    /* renamed from: n */
    public static final C35916Sk1 f94394n;

    /* renamed from: o */
    public static final C35916Sk1 f94395o;

    static {
        C35916Sk1.C7526b m84930a = C35916Sk1.m84930a("appId");
        QW7 qw7 = new QW7();
        qw7.m88440a(1);
        f94382b = m84930a.m84925b(qw7.m88439b()).m84926a();
        C35916Sk1.C7526b m84930a2 = C35916Sk1.m84930a("appVersion");
        QW7 qw72 = new QW7();
        qw72.m88440a(2);
        f94383c = m84930a2.m84925b(qw72.m88439b()).m84926a();
        C35916Sk1.C7526b m84930a3 = C35916Sk1.m84930a("firebaseProjectId");
        QW7 qw73 = new QW7();
        qw73.m88440a(3);
        f94384d = m84930a3.m84925b(qw73.m88439b()).m84926a();
        C35916Sk1.C7526b m84930a4 = C35916Sk1.m84930a("mlSdkVersion");
        QW7 qw74 = new QW7();
        qw74.m88440a(4);
        f94385e = m84930a4.m84925b(qw74.m88439b()).m84926a();
        C35916Sk1.C7526b m84930a5 = C35916Sk1.m84930a("tfliteSchemaVersion");
        QW7 qw75 = new QW7();
        qw75.m88440a(5);
        f94386f = m84930a5.m84925b(qw75.m88439b()).m84926a();
        C35916Sk1.C7526b m84930a6 = C35916Sk1.m84930a("gcmSenderId");
        QW7 qw76 = new QW7();
        qw76.m88440a(6);
        f94387g = m84930a6.m84925b(qw76.m88439b()).m84926a();
        C35916Sk1.C7526b m84930a7 = C35916Sk1.m84930a("apiKey");
        QW7 qw77 = new QW7();
        qw77.m88440a(7);
        f94388h = m84930a7.m84925b(qw77.m88439b()).m84926a();
        C35916Sk1.C7526b m84930a8 = C35916Sk1.m84930a("languages");
        QW7 qw78 = new QW7();
        qw78.m88440a(8);
        f94389i = m84930a8.m84925b(qw78.m88439b()).m84926a();
        C35916Sk1.C7526b m84930a9 = C35916Sk1.m84930a("mlSdkInstanceId");
        QW7 qw79 = new QW7();
        qw79.m88440a(9);
        f94390j = m84930a9.m84925b(qw79.m88439b()).m84926a();
        C35916Sk1.C7526b m84930a10 = C35916Sk1.m84930a("isClearcutClient");
        QW7 qw710 = new QW7();
        qw710.m88440a(10);
        f94391k = m84930a10.m84925b(qw710.m88439b()).m84926a();
        C35916Sk1.C7526b m84930a11 = C35916Sk1.m84930a("isStandaloneMlkit");
        QW7 qw711 = new QW7();
        qw711.m88440a(11);
        f94392l = m84930a11.m84925b(qw711.m88439b()).m84926a();
        C35916Sk1.C7526b m84930a12 = C35916Sk1.m84930a("isJsonLogging");
        QW7 qw712 = new QW7();
        qw712.m88440a(12);
        f94393m = m84930a12.m84925b(qw712.m88439b()).m84926a();
        C35916Sk1.C7526b m84930a13 = C35916Sk1.m84930a("buildLevel");
        QW7 qw713 = new QW7();
        qw713.m88440a(13);
        f94394n = m84930a13.m84925b(qw713.m88439b()).m84926a();
        C35916Sk1.C7526b m84930a14 = C35916Sk1.m84930a("optionalModuleVersion");
        QW7 qw714 = new QW7();
        qw714.m88440a(14);
        f94395o = m84930a14.m84925b(qw714.m88439b()).m84926a();
    }

    private C43905kR8() {
    }

    @Override // p000.InterfaceC45768nb1
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
        Gg9 gg9 = (Gg9) obj;
        InterfaceC35153Pd3 interfaceC35153Pd32 = interfaceC35153Pd3;
        interfaceC35153Pd32.mo23527f(f94382b, gg9.m104886g());
        interfaceC35153Pd32.mo23527f(f94383c, gg9.m104885h());
        interfaceC35153Pd32.mo23527f(f94384d, null);
        interfaceC35153Pd32.mo23527f(f94385e, gg9.m104883j());
        interfaceC35153Pd32.mo23527f(f94386f, gg9.m104882k());
        interfaceC35153Pd32.mo23527f(f94387g, null);
        interfaceC35153Pd32.mo23527f(f94388h, null);
        interfaceC35153Pd32.mo23527f(f94389i, gg9.m104892a());
        interfaceC35153Pd32.mo23527f(f94390j, gg9.m104884i());
        interfaceC35153Pd32.mo23527f(f94391k, gg9.m104891b());
        interfaceC35153Pd32.mo23527f(f94392l, gg9.m104889d());
        interfaceC35153Pd32.mo23527f(f94393m, gg9.m104890c());
        interfaceC35153Pd32.mo23527f(f94394n, gg9.m104888e());
        interfaceC35153Pd32.mo23527f(f94395o, gg9.m104887f());
    }
}
