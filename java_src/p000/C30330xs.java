package p000;

import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import java.io.IOException;
/* renamed from: xs */
/* loaded from: classes6.dex */
public final class C30330xs implements InterfaceC32990Fx0 {

    /* renamed from: a */
    public static final InterfaceC32990Fx0 f118264a = new C30330xs();

    /* renamed from: xs$a */
    /* loaded from: classes6.dex */
    public static final class C30331a implements InterfaceC34919Od3<BT2> {

        /* renamed from: a */
        public static final C30331a f118265a = new C30331a();

        /* renamed from: b */
        public static final C35916Sk1 f118266b = C35916Sk1.m84930a("projectNumber").m84925b(C26720np.m22341b().m22340c(1).m22342a()).m84926a();

        /* renamed from: c */
        public static final C35916Sk1 f118267c = C35916Sk1.m84930a("messageId").m84925b(C26720np.m22341b().m22340c(2).m22342a()).m84926a();

        /* renamed from: d */
        public static final C35916Sk1 f118268d = C35916Sk1.m84930a("instanceId").m84925b(C26720np.m22341b().m22340c(3).m22342a()).m84926a();

        /* renamed from: e */
        public static final C35916Sk1 f118269e = C35916Sk1.m84930a(ChallengeRequestData.FIELD_MESSAGE_TYPE).m84925b(C26720np.m22341b().m22340c(4).m22342a()).m84926a();

        /* renamed from: f */
        public static final C35916Sk1 f118270f = C35916Sk1.m84930a("sdkPlatform").m84925b(C26720np.m22341b().m22340c(5).m22342a()).m84926a();

        /* renamed from: g */
        public static final C35916Sk1 f118271g = C35916Sk1.m84930a("packageName").m84925b(C26720np.m22341b().m22340c(6).m22342a()).m84926a();

        /* renamed from: h */
        public static final C35916Sk1 f118272h = C35916Sk1.m84930a("collapseKey").m84925b(C26720np.m22341b().m22340c(7).m22342a()).m84926a();

        /* renamed from: i */
        public static final C35916Sk1 f118273i = C35916Sk1.m84930a("priority").m84925b(C26720np.m22341b().m22340c(8).m22342a()).m84926a();

        /* renamed from: j */
        public static final C35916Sk1 f118274j = C35916Sk1.m84930a("ttl").m84925b(C26720np.m22341b().m22340c(9).m22342a()).m84926a();

        /* renamed from: k */
        public static final C35916Sk1 f118275k = C35916Sk1.m84930a("topic").m84925b(C26720np.m22341b().m22340c(10).m22342a()).m84926a();

        /* renamed from: l */
        public static final C35916Sk1 f118276l = C35916Sk1.m84930a("bulkId").m84925b(C26720np.m22341b().m22340c(11).m22342a()).m84926a();

        /* renamed from: m */
        public static final C35916Sk1 f118277m = C35916Sk1.m84930a("event").m84925b(C26720np.m22341b().m22340c(12).m22342a()).m84926a();

        /* renamed from: n */
        public static final C35916Sk1 f118278n = C35916Sk1.m84930a("analyticsLabel").m84925b(C26720np.m22341b().m22340c(13).m22342a()).m84926a();

        /* renamed from: o */
        public static final C35916Sk1 f118279o = C35916Sk1.m84930a("campaignId").m84925b(C26720np.m22341b().m22340c(14).m22342a()).m84926a();

        /* renamed from: p */
        public static final C35916Sk1 f118280p = C35916Sk1.m84930a("composerLabel").m84925b(C26720np.m22341b().m22340c(15).m22342a()).m84926a();

        private C30331a() {
        }

        @Override // p000.InterfaceC45768nb1
        /* renamed from: a */
        public void encode(BT2 bt2, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
            interfaceC35153Pd3.mo23528e(f118266b, bt2.m113997l());
            interfaceC35153Pd3.mo23527f(f118267c, bt2.m114001h());
            interfaceC35153Pd3.mo23527f(f118268d, bt2.m114002g());
            interfaceC35153Pd3.mo23527f(f118269e, bt2.m114000i());
            interfaceC35153Pd3.mo23527f(f118270f, bt2.m113996m());
            interfaceC35153Pd3.mo23527f(f118271g, bt2.m113999j());
            interfaceC35153Pd3.mo23527f(f118272h, bt2.m114005d());
            interfaceC35153Pd3.mo23529d(f118273i, bt2.m113998k());
            interfaceC35153Pd3.mo23529d(f118274j, bt2.m113994o());
            interfaceC35153Pd3.mo23527f(f118275k, bt2.m113995n());
            interfaceC35153Pd3.mo23528e(f118276l, bt2.m114007b());
            interfaceC35153Pd3.mo23527f(f118277m, bt2.m114003f());
            interfaceC35153Pd3.mo23527f(f118278n, bt2.m114008a());
            interfaceC35153Pd3.mo23528e(f118279o, bt2.m114006c());
            interfaceC35153Pd3.mo23527f(f118280p, bt2.m114004e());
        }
    }

    /* renamed from: xs$b */
    /* loaded from: classes6.dex */
    public static final class C30332b implements InterfaceC34919Od3<CT2> {

        /* renamed from: a */
        public static final C30332b f118281a = new C30332b();

        /* renamed from: b */
        public static final C35916Sk1 f118282b = C35916Sk1.m84930a("messagingClientEvent").m84925b(C26720np.m22341b().m22340c(1).m22342a()).m84926a();

        private C30332b() {
        }

        @Override // p000.InterfaceC45768nb1
        /* renamed from: a */
        public void encode(CT2 ct2, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
            interfaceC35153Pd3.mo23527f(f118282b, ct2.m112205a());
        }
    }

    /* renamed from: xs$c */
    /* loaded from: classes6.dex */
    public static final class C30333c implements InterfaceC34919Od3<D94> {

        /* renamed from: a */
        public static final C30333c f118283a = new C30333c();

        /* renamed from: b */
        public static final C35916Sk1 f118284b = C35916Sk1.m84927d("messagingClientEventExtension");

        private C30333c() {
        }

        @Override // p000.InterfaceC45768nb1
        /* renamed from: a */
        public void encode(D94 d94, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
            interfaceC35153Pd3.mo23527f(f118284b, d94.m110838b());
        }
    }

    private C30330xs() {
    }

    @Override // p000.InterfaceC32990Fx0
    public void configure(InterfaceC49325tb1<?> interfaceC49325tb1) {
        interfaceC49325tb1.mo12026a(D94.class, C30333c.f118283a);
        interfaceC49325tb1.mo12026a(CT2.class, C30332b.f118281a);
        interfaceC49325tb1.mo12026a(BT2.class, C30331a.f118265a);
    }
}
