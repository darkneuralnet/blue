package p000;

import java.io.IOException;
import p000.C35916Sk1;
/* renamed from: LS8 */
/* loaded from: classes5.dex */
public final class LS8 implements InterfaceC34919Od3 {

    /* renamed from: a */
    public static final LS8 f21449a = new LS8();

    /* renamed from: b */
    public static final C35916Sk1 f21450b;

    /* renamed from: c */
    public static final C35916Sk1 f21451c;

    /* renamed from: d */
    public static final C35916Sk1 f21452d;

    /* renamed from: e */
    public static final C35916Sk1 f21453e;

    /* renamed from: f */
    public static final C35916Sk1 f21454f;

    /* renamed from: g */
    public static final C35916Sk1 f21455g;

    /* renamed from: h */
    public static final C35916Sk1 f21456h;

    /* renamed from: i */
    public static final C35916Sk1 f21457i;

    /* renamed from: j */
    public static final C35916Sk1 f21458j;

    /* renamed from: k */
    public static final C35916Sk1 f21459k;

    /* renamed from: l */
    public static final C35916Sk1 f21460l;

    /* renamed from: m */
    public static final C35916Sk1 f21461m;

    /* renamed from: n */
    public static final C35916Sk1 f21462n;

    /* renamed from: o */
    public static final C35916Sk1 f21463o;

    static {
        C35916Sk1.C7526b m84930a = C35916Sk1.m84930a("appId");
        C52545z08 c52545z08 = new C52545z08();
        c52545z08.m2111a(1);
        f21450b = m84930a.m84925b(c52545z08.m2110b()).m84926a();
        C35916Sk1.C7526b m84930a2 = C35916Sk1.m84930a("appVersion");
        C52545z08 c52545z082 = new C52545z08();
        c52545z082.m2111a(2);
        f21451c = m84930a2.m84925b(c52545z082.m2110b()).m84926a();
        C35916Sk1.C7526b m84930a3 = C35916Sk1.m84930a("firebaseProjectId");
        C52545z08 c52545z083 = new C52545z08();
        c52545z083.m2111a(3);
        f21452d = m84930a3.m84925b(c52545z083.m2110b()).m84926a();
        C35916Sk1.C7526b m84930a4 = C35916Sk1.m84930a("mlSdkVersion");
        C52545z08 c52545z084 = new C52545z08();
        c52545z084.m2111a(4);
        f21453e = m84930a4.m84925b(c52545z084.m2110b()).m84926a();
        C35916Sk1.C7526b m84930a5 = C35916Sk1.m84930a("tfliteSchemaVersion");
        C52545z08 c52545z085 = new C52545z08();
        c52545z085.m2111a(5);
        f21454f = m84930a5.m84925b(c52545z085.m2110b()).m84926a();
        C35916Sk1.C7526b m84930a6 = C35916Sk1.m84930a("gcmSenderId");
        C52545z08 c52545z086 = new C52545z08();
        c52545z086.m2111a(6);
        f21455g = m84930a6.m84925b(c52545z086.m2110b()).m84926a();
        C35916Sk1.C7526b m84930a7 = C35916Sk1.m84930a("apiKey");
        C52545z08 c52545z087 = new C52545z08();
        c52545z087.m2111a(7);
        f21456h = m84930a7.m84925b(c52545z087.m2110b()).m84926a();
        C35916Sk1.C7526b m84930a8 = C35916Sk1.m84930a("languages");
        C52545z08 c52545z088 = new C52545z08();
        c52545z088.m2111a(8);
        f21457i = m84930a8.m84925b(c52545z088.m2110b()).m84926a();
        C35916Sk1.C7526b m84930a9 = C35916Sk1.m84930a("mlSdkInstanceId");
        C52545z08 c52545z089 = new C52545z08();
        c52545z089.m2111a(9);
        f21458j = m84930a9.m84925b(c52545z089.m2110b()).m84926a();
        C35916Sk1.C7526b m84930a10 = C35916Sk1.m84930a("isClearcutClient");
        C52545z08 c52545z0810 = new C52545z08();
        c52545z0810.m2111a(10);
        f21459k = m84930a10.m84925b(c52545z0810.m2110b()).m84926a();
        C35916Sk1.C7526b m84930a11 = C35916Sk1.m84930a("isStandaloneMlkit");
        C52545z08 c52545z0811 = new C52545z08();
        c52545z0811.m2111a(11);
        f21460l = m84930a11.m84925b(c52545z0811.m2110b()).m84926a();
        C35916Sk1.C7526b m84930a12 = C35916Sk1.m84930a("isJsonLogging");
        C52545z08 c52545z0812 = new C52545z08();
        c52545z0812.m2111a(12);
        f21461m = m84930a12.m84925b(c52545z0812.m2110b()).m84926a();
        C35916Sk1.C7526b m84930a13 = C35916Sk1.m84930a("buildLevel");
        C52545z08 c52545z0813 = new C52545z08();
        c52545z0813.m2111a(13);
        f21462n = m84930a13.m84925b(c52545z0813.m2110b()).m84926a();
        C35916Sk1.C7526b m84930a14 = C35916Sk1.m84930a("optionalModuleVersion");
        C52545z08 c52545z0814 = new C52545z08();
        c52545z0814.m2111a(14);
        f21463o = m84930a14.m84925b(c52545z0814.m2110b()).m84926a();
    }

    private LS8() {
    }

    @Override // p000.InterfaceC45768nb1
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
        C47615qh9 c47615qh9 = (C47615qh9) obj;
        InterfaceC35153Pd3 interfaceC35153Pd32 = interfaceC35153Pd3;
        interfaceC35153Pd32.mo23527f(f21450b, c47615qh9.m17239g());
        interfaceC35153Pd32.mo23527f(f21451c, c47615qh9.m17238h());
        interfaceC35153Pd32.mo23527f(f21452d, null);
        interfaceC35153Pd32.mo23527f(f21453e, c47615qh9.m17236j());
        interfaceC35153Pd32.mo23527f(f21454f, c47615qh9.m17235k());
        interfaceC35153Pd32.mo23527f(f21455g, null);
        interfaceC35153Pd32.mo23527f(f21456h, null);
        interfaceC35153Pd32.mo23527f(f21457i, c47615qh9.m17245a());
        interfaceC35153Pd32.mo23527f(f21458j, c47615qh9.m17237i());
        interfaceC35153Pd32.mo23527f(f21459k, c47615qh9.m17244b());
        interfaceC35153Pd32.mo23527f(f21460l, c47615qh9.m17242d());
        interfaceC35153Pd32.mo23527f(f21461m, c47615qh9.m17243c());
        interfaceC35153Pd32.mo23527f(f21462n, c47615qh9.m17241e());
        interfaceC35153Pd32.mo23527f(f21463o, c47615qh9.m17240f());
    }
}
