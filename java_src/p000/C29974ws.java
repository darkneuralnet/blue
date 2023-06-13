package p000;

import java.io.IOException;
/* renamed from: ws */
/* loaded from: classes5.dex */
public final class C29974ws implements InterfaceC32990Fx0 {

    /* renamed from: a */
    public static final InterfaceC32990Fx0 f116663a = new C29974ws();

    /* renamed from: ws$a */
    /* loaded from: classes5.dex */
    public static final class C29975a implements InterfaceC34919Od3<C33809Jk0> {

        /* renamed from: a */
        public static final C29975a f116664a = new C29975a();

        /* renamed from: b */
        public static final C35916Sk1 f116665b = C35916Sk1.m84930a("window").m84925b(C26720np.m22341b().m22340c(1).m22342a()).m84926a();

        /* renamed from: c */
        public static final C35916Sk1 f116666c = C35916Sk1.m84930a("logSourceMetrics").m84925b(C26720np.m22341b().m22340c(2).m22342a()).m84926a();

        /* renamed from: d */
        public static final C35916Sk1 f116667d = C35916Sk1.m84930a("globalMetrics").m84925b(C26720np.m22341b().m22340c(3).m22342a()).m84926a();

        /* renamed from: e */
        public static final C35916Sk1 f116668e = C35916Sk1.m84930a("appNamespace").m84925b(C26720np.m22341b().m22340c(4).m22342a()).m84926a();

        private C29975a() {
        }

        @Override // p000.InterfaceC45768nb1
        /* renamed from: a */
        public void encode(C33809Jk0 c33809Jk0, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
            interfaceC35153Pd3.mo23527f(f116665b, c33809Jk0.m99897d());
            interfaceC35153Pd3.mo23527f(f116666c, c33809Jk0.m99898c());
            interfaceC35153Pd3.mo23527f(f116667d, c33809Jk0.m99899b());
            interfaceC35153Pd3.mo23527f(f116668e, c33809Jk0.m99900a());
        }
    }

    /* renamed from: ws$b */
    /* loaded from: classes5.dex */
    public static final class C29976b implements InterfaceC34919Od3<SC1> {

        /* renamed from: a */
        public static final C29976b f116669a = new C29976b();

        /* renamed from: b */
        public static final C35916Sk1 f116670b = C35916Sk1.m84930a("storageMetrics").m84925b(C26720np.m22341b().m22340c(1).m22342a()).m84926a();

        private C29976b() {
        }

        @Override // p000.InterfaceC45768nb1
        /* renamed from: a */
        public void encode(SC1 sc1, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
            interfaceC35153Pd3.mo23527f(f116670b, sc1.m85851a());
        }
    }

    /* renamed from: ws$c */
    /* loaded from: classes5.dex */
    public static final class C29977c implements InterfaceC34919Od3<C46582ox2> {

        /* renamed from: a */
        public static final C29977c f116671a = new C29977c();

        /* renamed from: b */
        public static final C35916Sk1 f116672b = C35916Sk1.m84930a("eventsDroppedCount").m84925b(C26720np.m22341b().m22340c(1).m22342a()).m84926a();

        /* renamed from: c */
        public static final C35916Sk1 f116673c = C35916Sk1.m84930a("reason").m84925b(C26720np.m22341b().m22340c(3).m22342a()).m84926a();

        private C29977c() {
        }

        @Override // p000.InterfaceC45768nb1
        /* renamed from: a */
        public void encode(C46582ox2 c46582ox2, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
            interfaceC35153Pd3.mo23528e(f116672b, c46582ox2.m20243a());
            interfaceC35153Pd3.mo23527f(f116673c, c46582ox2.m20242b());
        }
    }

    /* renamed from: ws$d */
    /* loaded from: classes5.dex */
    public static final class C29978d implements InterfaceC34919Od3<C48953sx2> {

        /* renamed from: a */
        public static final C29978d f116674a = new C29978d();

        /* renamed from: b */
        public static final C35916Sk1 f116675b = C35916Sk1.m84930a("logSource").m84925b(C26720np.m22341b().m22340c(1).m22342a()).m84926a();

        /* renamed from: c */
        public static final C35916Sk1 f116676c = C35916Sk1.m84930a("logEventDropped").m84925b(C26720np.m22341b().m22340c(2).m22342a()).m84926a();

        private C29978d() {
        }

        @Override // p000.InterfaceC45768nb1
        /* renamed from: a */
        public void encode(C48953sx2 c48953sx2, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
            interfaceC35153Pd3.mo23527f(f116675b, c48953sx2.m13367b());
            interfaceC35153Pd3.mo23527f(f116676c, c48953sx2.m13368a());
        }
    }

    /* renamed from: ws$e */
    /* loaded from: classes5.dex */
    public static final class C29979e implements InterfaceC34919Od3<E94> {

        /* renamed from: a */
        public static final C29979e f116677a = new C29979e();

        /* renamed from: b */
        public static final C35916Sk1 f116678b = C35916Sk1.m84927d("clientMetrics");

        private C29979e() {
        }

        @Override // p000.InterfaceC45768nb1
        /* renamed from: a */
        public void encode(E94 e94, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
            interfaceC35153Pd3.mo23527f(f116678b, e94.m109339b());
        }
    }

    /* renamed from: ws$f */
    /* loaded from: classes5.dex */
    public static final class C29980f implements InterfaceC34919Od3<C39752dR5> {

        /* renamed from: a */
        public static final C29980f f116679a = new C29980f();

        /* renamed from: b */
        public static final C35916Sk1 f116680b = C35916Sk1.m84930a("currentCacheSizeBytes").m84925b(C26720np.m22341b().m22340c(1).m22342a()).m84926a();

        /* renamed from: c */
        public static final C35916Sk1 f116681c = C35916Sk1.m84930a("maxCacheSizeBytes").m84925b(C26720np.m22341b().m22340c(2).m22342a()).m84926a();

        private C29980f() {
        }

        @Override // p000.InterfaceC45768nb1
        /* renamed from: a */
        public void encode(C39752dR5 c39752dR5, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
            interfaceC35153Pd3.mo23528e(f116680b, c39752dR5.m44264a());
            interfaceC35153Pd3.mo23528e(f116681c, c39752dR5.m44263b());
        }
    }

    /* renamed from: ws$g */
    /* loaded from: classes5.dex */
    public static final class C29981g implements InterfaceC34919Od3<C47248q46> {

        /* renamed from: a */
        public static final C29981g f116682a = new C29981g();

        /* renamed from: b */
        public static final C35916Sk1 f116683b = C35916Sk1.m84930a("startMs").m84925b(C26720np.m22341b().m22340c(1).m22342a()).m84926a();

        /* renamed from: c */
        public static final C35916Sk1 f116684c = C35916Sk1.m84930a("endMs").m84925b(C26720np.m22341b().m22340c(2).m22342a()).m84926a();

        private C29981g() {
        }

        @Override // p000.InterfaceC45768nb1
        /* renamed from: a */
        public void encode(C47248q46 c47248q46, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
            interfaceC35153Pd3.mo23528e(f116683b, c47248q46.m18238b());
            interfaceC35153Pd3.mo23528e(f116684c, c47248q46.m18239a());
        }
    }

    private C29974ws() {
    }

    @Override // p000.InterfaceC32990Fx0
    public void configure(InterfaceC49325tb1<?> interfaceC49325tb1) {
        interfaceC49325tb1.mo12026a(E94.class, C29979e.f116677a);
        interfaceC49325tb1.mo12026a(C33809Jk0.class, C29975a.f116664a);
        interfaceC49325tb1.mo12026a(C47248q46.class, C29981g.f116682a);
        interfaceC49325tb1.mo12026a(C48953sx2.class, C29978d.f116674a);
        interfaceC49325tb1.mo12026a(C46582ox2.class, C29977c.f116671a);
        interfaceC49325tb1.mo12026a(SC1.class, C29976b.f116669a);
        interfaceC49325tb1.mo12026a(C39752dR5.class, C29980f.f116679a);
    }
}
