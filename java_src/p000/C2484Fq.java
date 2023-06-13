package p000;

import com.stripe.android.core.networking.RequestHeadersFactory;
import java.io.IOException;
/* renamed from: Fq */
/* loaded from: classes5.dex */
public final class C2484Fq implements InterfaceC32990Fx0 {

    /* renamed from: a */
    public static final InterfaceC32990Fx0 f10284a = new C2484Fq();

    /* renamed from: Fq$a */
    /* loaded from: classes5.dex */
    public static final class C2485a implements InterfaceC34919Od3<AbstractC13605cc> {

        /* renamed from: a */
        public static final C2485a f10285a = new C2485a();

        /* renamed from: b */
        public static final C35916Sk1 f10286b = C35916Sk1.m84927d("sdkVersion");

        /* renamed from: c */
        public static final C35916Sk1 f10287c = C35916Sk1.m84927d(RequestHeadersFactory.MODEL);

        /* renamed from: d */
        public static final C35916Sk1 f10288d = C35916Sk1.m84927d("hardware");

        /* renamed from: e */
        public static final C35916Sk1 f10289e = C35916Sk1.m84927d("device");

        /* renamed from: f */
        public static final C35916Sk1 f10290f = C35916Sk1.m84927d("product");

        /* renamed from: g */
        public static final C35916Sk1 f10291g = C35916Sk1.m84927d("osBuild");

        /* renamed from: h */
        public static final C35916Sk1 f10292h = C35916Sk1.m84927d("manufacturer");

        /* renamed from: i */
        public static final C35916Sk1 f10293i = C35916Sk1.m84927d("fingerprint");

        /* renamed from: j */
        public static final C35916Sk1 f10294j = C35916Sk1.m84927d("locale");

        /* renamed from: k */
        public static final C35916Sk1 f10295k = C35916Sk1.m84927d("country");

        /* renamed from: l */
        public static final C35916Sk1 f10296l = C35916Sk1.m84927d("mccMnc");

        /* renamed from: m */
        public static final C35916Sk1 f10297m = C35916Sk1.m84927d("applicationBuild");

        private C2485a() {
        }

        @Override // p000.InterfaceC45768nb1
        /* renamed from: a */
        public void encode(AbstractC13605cc abstractC13605cc, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
            interfaceC35153Pd3.mo23527f(f10286b, abstractC13605cc.mo44915m());
            interfaceC35153Pd3.mo23527f(f10287c, abstractC13605cc.mo44918j());
            interfaceC35153Pd3.mo23527f(f10288d, abstractC13605cc.mo44922f());
            interfaceC35153Pd3.mo23527f(f10289e, abstractC13605cc.mo44924d());
            interfaceC35153Pd3.mo23527f(f10290f, abstractC13605cc.mo44916l());
            interfaceC35153Pd3.mo23527f(f10291g, abstractC13605cc.mo44917k());
            interfaceC35153Pd3.mo23527f(f10292h, abstractC13605cc.mo44920h());
            interfaceC35153Pd3.mo23527f(f10293i, abstractC13605cc.mo44923e());
            interfaceC35153Pd3.mo23527f(f10294j, abstractC13605cc.mo44921g());
            interfaceC35153Pd3.mo23527f(f10295k, abstractC13605cc.mo44925c());
            interfaceC35153Pd3.mo23527f(f10296l, abstractC13605cc.mo44919i());
            interfaceC35153Pd3.mo23527f(f10297m, abstractC13605cc.mo44926b());
        }
    }

    /* renamed from: Fq$b */
    /* loaded from: classes5.dex */
    public static final class C2486b implements InterfaceC34919Od3<AbstractC6301PF> {

        /* renamed from: a */
        public static final C2486b f10298a = new C2486b();

        /* renamed from: b */
        public static final C35916Sk1 f10299b = C35916Sk1.m84927d("logRequest");

        private C2486b() {
        }

        @Override // p000.InterfaceC45768nb1
        /* renamed from: a */
        public void encode(AbstractC6301PF abstractC6301PF, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
            interfaceC35153Pd3.mo23527f(f10299b, abstractC6301PF.mo28243c());
        }
    }

    /* renamed from: Fq$c */
    /* loaded from: classes5.dex */
    public static final class C2487c implements InterfaceC34919Od3<AbstractC33575Ik0> {

        /* renamed from: a */
        public static final C2487c f10300a = new C2487c();

        /* renamed from: b */
        public static final C35916Sk1 f10301b = C35916Sk1.m84927d("clientType");

        /* renamed from: c */
        public static final C35916Sk1 f10302c = C35916Sk1.m84927d("androidClientInfo");

        private C2487c() {
        }

        @Override // p000.InterfaceC45768nb1
        /* renamed from: a */
        public void encode(AbstractC33575Ik0 abstractC33575Ik0, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
            interfaceC35153Pd3.mo23527f(f10301b, abstractC33575Ik0.mo13554c());
            interfaceC35153Pd3.mo23527f(f10302c, abstractC33575Ik0.mo13555b());
        }
    }

    /* renamed from: Fq$d */
    /* loaded from: classes5.dex */
    public static final class C2488d implements InterfaceC34919Od3<AbstractC45989nx2> {

        /* renamed from: a */
        public static final C2488d f10303a = new C2488d();

        /* renamed from: b */
        public static final C35916Sk1 f10304b = C35916Sk1.m84927d("eventTimeMs");

        /* renamed from: c */
        public static final C35916Sk1 f10305c = C35916Sk1.m84927d("eventCode");

        /* renamed from: d */
        public static final C35916Sk1 f10306d = C35916Sk1.m84927d("eventUptimeMs");

        /* renamed from: e */
        public static final C35916Sk1 f10307e = C35916Sk1.m84927d("sourceExtension");

        /* renamed from: f */
        public static final C35916Sk1 f10308f = C35916Sk1.m84927d("sourceExtensionJsonProto3");

        /* renamed from: g */
        public static final C35916Sk1 f10309g = C35916Sk1.m84927d("timezoneOffsetSeconds");

        /* renamed from: h */
        public static final C35916Sk1 f10310h = C35916Sk1.m84927d("networkConnectionInfo");

        private C2488d() {
        }

        @Override // p000.InterfaceC45768nb1
        /* renamed from: a */
        public void encode(AbstractC45989nx2 abstractC45989nx2, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
            interfaceC35153Pd3.mo23528e(f10304b, abstractC45989nx2.mo22153c());
            interfaceC35153Pd3.mo23527f(f10305c, abstractC45989nx2.mo22154b());
            interfaceC35153Pd3.mo23528e(f10306d, abstractC45989nx2.mo22152d());
            interfaceC35153Pd3.mo23527f(f10307e, abstractC45989nx2.mo22150f());
            interfaceC35153Pd3.mo23527f(f10308f, abstractC45989nx2.mo22149g());
            interfaceC35153Pd3.mo23528e(f10309g, abstractC45989nx2.mo22148h());
            interfaceC35153Pd3.mo23527f(f10310h, abstractC45989nx2.mo22151e());
        }
    }

    /* renamed from: Fq$e */
    /* loaded from: classes5.dex */
    public static final class C2489e implements InterfaceC34919Od3<AbstractC47768qx2> {

        /* renamed from: a */
        public static final C2489e f10311a = new C2489e();

        /* renamed from: b */
        public static final C35916Sk1 f10312b = C35916Sk1.m84927d("requestTimeMs");

        /* renamed from: c */
        public static final C35916Sk1 f10313c = C35916Sk1.m84927d("requestUptimeMs");

        /* renamed from: d */
        public static final C35916Sk1 f10314d = C35916Sk1.m84927d("clientInfo");

        /* renamed from: e */
        public static final C35916Sk1 f10315e = C35916Sk1.m84927d("logSource");

        /* renamed from: f */
        public static final C35916Sk1 f10316f = C35916Sk1.m84927d("logSourceName");

        /* renamed from: g */
        public static final C35916Sk1 f10317g = C35916Sk1.m84927d("logEvent");

        /* renamed from: h */
        public static final C35916Sk1 f10318h = C35916Sk1.m84927d("qosTier");

        private C2489e() {
        }

        @Override // p000.InterfaceC45768nb1
        /* renamed from: a */
        public void encode(AbstractC47768qx2 abstractC47768qx2, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
            interfaceC35153Pd3.mo23528e(f10312b, abstractC47768qx2.mo16742g());
            interfaceC35153Pd3.mo23528e(f10313c, abstractC47768qx2.mo16741h());
            interfaceC35153Pd3.mo23527f(f10314d, abstractC47768qx2.mo16747b());
            interfaceC35153Pd3.mo23527f(f10315e, abstractC47768qx2.mo16745d());
            interfaceC35153Pd3.mo23527f(f10316f, abstractC47768qx2.mo16744e());
            interfaceC35153Pd3.mo23527f(f10317g, abstractC47768qx2.mo16746c());
            interfaceC35153Pd3.mo23527f(f10318h, abstractC47768qx2.mo16743f());
        }
    }

    /* renamed from: Fq$f */
    /* loaded from: classes5.dex */
    public static final class C2490f implements InterfaceC34919Od3<B73> {

        /* renamed from: a */
        public static final C2490f f10319a = new C2490f();

        /* renamed from: b */
        public static final C35916Sk1 f10320b = C35916Sk1.m84927d("networkType");

        /* renamed from: c */
        public static final C35916Sk1 f10321c = C35916Sk1.m84927d("mobileSubtype");

        private C2490f() {
        }

        @Override // p000.InterfaceC45768nb1
        /* renamed from: a */
        public void encode(B73 b73, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
            interfaceC35153Pd3.mo23527f(f10320b, b73.mo87845c());
            interfaceC35153Pd3.mo23527f(f10321c, b73.mo87846b());
        }
    }

    private C2484Fq() {
    }

    @Override // p000.InterfaceC32990Fx0
    public void configure(InterfaceC49325tb1<?> interfaceC49325tb1) {
        C2486b c2486b = C2486b.f10298a;
        interfaceC49325tb1.mo12026a(AbstractC6301PF.class, c2486b);
        interfaceC49325tb1.mo12026a(C25542kt.class, c2486b);
        C2489e c2489e = C2489e.f10311a;
        interfaceC49325tb1.mo12026a(AbstractC47768qx2.class, c2489e);
        interfaceC49325tb1.mo12026a(C5407Mt.class, c2489e);
        C2487c c2487c = C2487c.f10300a;
        interfaceC49325tb1.mo12026a(AbstractC33575Ik0.class, c2487c);
        interfaceC49325tb1.mo12026a(C28418st.class, c2487c);
        C2485a c2485a = C2485a.f10285a;
        interfaceC49325tb1.mo12026a(AbstractC13605cc.class, c2485a);
        interfaceC49325tb1.mo12026a(C19630ct.class, c2485a);
        C2488d c2488d = C2488d.f10303a;
        interfaceC49325tb1.mo12026a(AbstractC45989nx2.class, c2488d);
        interfaceC49325tb1.mo12026a(C5107Lt.class, c2488d);
        C2490f c2490f = C2490f.f10319a;
        interfaceC49325tb1.mo12026a(B73.class, c2490f);
        interfaceC49325tb1.mo12026a(C6922Qt.class, c2490f);
    }
}
