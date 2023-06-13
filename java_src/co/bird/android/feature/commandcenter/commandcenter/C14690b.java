package co.bird.android.feature.commandcenter.commandcenter;

import android.content.Context;
import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.commandcenter.commandcenter.LegacyCommandCenterActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.commandcenter.commandcenter.b */
/* loaded from: classes3.dex */
public final class C14690b {

    /* renamed from: co.bird.android.feature.commandcenter.commandcenter.b$a */
    /* loaded from: classes3.dex */
    public static final class C14691a implements LegacyCommandCenterActivity.InterfaceC14684a.InterfaceC14685a {
        @Override // co.bird.android.feature.commandcenter.commandcenter.LegacyCommandCenterActivity.InterfaceC14684a.InterfaceC14685a
        /* renamed from: a */
        public LegacyCommandCenterActivity.InterfaceC14684a mo58498a(InterfaceC44393lG2 interfaceC44393lG2, InterfaceC44108kn0 interfaceC44108kn0, BaseActivity baseActivity, ScopeProvider scopeProvider, C32532Dy1 c32532Dy1) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(interfaceC44108kn0);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c32532Dy1);
            return new C14692b(interfaceC44393lG2, interfaceC44108kn0, baseActivity, scopeProvider, c32532Dy1);
        }

        private C14691a() {
        }
    }

    /* renamed from: co.bird.android.feature.commandcenter.commandcenter.b$b */
    /* loaded from: classes3.dex */
    public static final class C14692b implements LegacyCommandCenterActivity.InterfaceC14684a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f63619a;

        /* renamed from: b */
        public final C14692b f63620b;

        /* renamed from: c */
        public Y94<InterfaceC10636aM> f63621c;

        /* renamed from: d */
        public Y94<GI3> f63622d;

        /* renamed from: e */
        public Y94<InterfaceC46473om3> f63623e;

        /* renamed from: f */
        public Y94<InterfaceC36176Tn0> f63624f;

        /* renamed from: g */
        public Y94<InterfaceC37857aG6> f63625g;

        /* renamed from: h */
        public Y94<InterfaceC27246pJ> f63626h;

        /* renamed from: i */
        public Y94<InterfaceC40565eo5> f63627i;

        /* renamed from: j */
        public Y94<InterfaceC1880Ea> f63628j;

        /* renamed from: k */
        public Y94<InterfaceC40550en0> f63629k;

        /* renamed from: l */
        public Y94<InterfaceC36185To0> f63630l;

        /* renamed from: m */
        public Y94<InterfaceC48164rd5> f63631m;

        /* renamed from: n */
        public Y94<ScopeProvider> f63632n;

        /* renamed from: o */
        public Y94<BaseActivity> f63633o;

        /* renamed from: p */
        public Y94<C32532Dy1> f63634p;

        /* renamed from: q */
        public Y94<C47652ql6> f63635q;

        /* renamed from: r */
        public Y94<C31739Ao0> f63636r;

        /* renamed from: s */
        public Y94<C36207Tq4> f63637s;

        /* renamed from: t */
        public Y94<InterfaceC40099e13> f63638t;

        /* renamed from: u */
        public Y94<Context> f63639u;

        /* renamed from: v */
        public Y94<C36623Vk6> f63640v;

        /* renamed from: w */
        public Y94<C45280ml6> f63641w;

        /* renamed from: co.bird.android.feature.commandcenter.commandcenter.b$b$a */
        /* loaded from: classes3.dex */
        public static final class C14693a implements Y94<InterfaceC1880Ea> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f63642a;

            public C14693a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f63642a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC1880Ea get() {
                return (InterfaceC1880Ea) C51679xZ3.m5003d(this.f63642a.mo27519d0());
            }
        }

        /* renamed from: co.bird.android.feature.commandcenter.commandcenter.b$b$b */
        /* loaded from: classes3.dex */
        public static final class C14694b implements Y94<Context> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f63643a;

            public C14694b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f63643a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public Context get() {
                return (Context) C51679xZ3.m5003d(this.f63643a.mo27552R1());
            }
        }

        /* renamed from: co.bird.android.feature.commandcenter.commandcenter.b$b$c */
        /* loaded from: classes3.dex */
        public static final class C14695c implements Y94<InterfaceC27246pJ> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f63644a;

            public C14695c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f63644a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC27246pJ get() {
                return (InterfaceC27246pJ) C51679xZ3.m5003d(this.f63644a.mo27517d3());
            }
        }

        /* renamed from: co.bird.android.feature.commandcenter.commandcenter.b$b$d */
        /* loaded from: classes3.dex */
        public static final class C14696d implements Y94<InterfaceC10636aM> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f63645a;

            public C14696d(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f63645a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC10636aM get() {
                return (InterfaceC10636aM) C51679xZ3.m5003d(this.f63645a.mo27460x());
            }
        }

        /* renamed from: co.bird.android.feature.commandcenter.commandcenter.b$b$e */
        /* loaded from: classes3.dex */
        public static final class C14697e implements Y94<InterfaceC40550en0> {

            /* renamed from: a */
            public final InterfaceC44108kn0 f63646a;

            public C14697e(InterfaceC44108kn0 interfaceC44108kn0) {
                this.f63646a = interfaceC44108kn0;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40550en0 get() {
                return (InterfaceC40550en0) C51679xZ3.m5003d(this.f63646a.mo28448a());
            }
        }

        /* renamed from: co.bird.android.feature.commandcenter.commandcenter.b$b$f */
        /* loaded from: classes3.dex */
        public static final class C14698f implements Y94<InterfaceC36176Tn0> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f63647a;

            public C14698f(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f63647a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC36176Tn0 get() {
                return (InterfaceC36176Tn0) C51679xZ3.m5003d(this.f63647a.mo27574J2());
            }
        }

        /* renamed from: co.bird.android.feature.commandcenter.commandcenter.b$b$g */
        /* loaded from: classes3.dex */
        public static final class C14699g implements Y94<InterfaceC36185To0> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f63648a;

            public C14699g(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f63648a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC36185To0 get() {
                return (InterfaceC36185To0) C51679xZ3.m5003d(this.f63648a.mo27481q2());
            }
        }

        /* renamed from: co.bird.android.feature.commandcenter.commandcenter.b$b$h */
        /* loaded from: classes3.dex */
        public static final class C14700h implements Y94<GI3> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f63649a;

            public C14700h(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f63649a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public GI3 get() {
                return (GI3) C51679xZ3.m5003d(this.f63649a.mo27565M2());
            }
        }

        /* renamed from: co.bird.android.feature.commandcenter.commandcenter.b$b$i */
        /* loaded from: classes3.dex */
        public static final class C14701i implements Y94<InterfaceC48164rd5> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f63650a;

            public C14701i(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f63650a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC48164rd5 get() {
                return (InterfaceC48164rd5) C51679xZ3.m5003d(this.f63650a.mo27463w());
            }
        }

        /* renamed from: co.bird.android.feature.commandcenter.commandcenter.b$b$j */
        /* loaded from: classes3.dex */
        public static final class C14702j implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f63651a;

            public C14702j(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f63651a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f63651a.mo27461w2());
            }
        }

        /* renamed from: co.bird.android.feature.commandcenter.commandcenter.b$b$k */
        /* loaded from: classes3.dex */
        public static final class C14703k implements Y94<InterfaceC46473om3> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f63652a;

            public C14703k(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f63652a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC46473om3 get() {
                return (InterfaceC46473om3) C51679xZ3.m5003d(this.f63652a.mo27584F0());
            }
        }

        /* renamed from: co.bird.android.feature.commandcenter.commandcenter.b$b$l */
        /* loaded from: classes3.dex */
        public static final class C14704l implements Y94<C36207Tq4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f63653a;

            public C14704l(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f63653a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C36207Tq4 get() {
                return (C36207Tq4) C51679xZ3.m5003d(this.f63653a.mo27595B1());
            }
        }

        /* renamed from: co.bird.android.feature.commandcenter.commandcenter.b$b$m */
        /* loaded from: classes3.dex */
        public static final class C14705m implements Y94<InterfaceC40565eo5> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f63654a;

            public C14705m(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f63654a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40565eo5 get() {
                return (InterfaceC40565eo5) C51679xZ3.m5003d(this.f63654a.mo27504j1());
            }
        }

        /* renamed from: co.bird.android.feature.commandcenter.commandcenter.b$b$n */
        /* loaded from: classes3.dex */
        public static final class C14706n implements Y94<InterfaceC37857aG6> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f63655a;

            public C14706n(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f63655a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC37857aG6 get() {
                return (InterfaceC37857aG6) C51679xZ3.m5003d(this.f63655a.mo27549T2());
            }
        }

        @Override // co.bird.android.feature.commandcenter.commandcenter.LegacyCommandCenterActivity.InterfaceC14684a
        /* renamed from: a */
        public void mo58497a(LegacyCommandCenterActivity legacyCommandCenterActivity) {
            m58495c(legacyCommandCenterActivity);
        }

        /* renamed from: b */
        public final void m58496b(InterfaceC44393lG2 interfaceC44393lG2, InterfaceC44108kn0 interfaceC44108kn0, BaseActivity baseActivity, ScopeProvider scopeProvider, C32532Dy1 c32532Dy1) {
            this.f63621c = new C14696d(interfaceC44393lG2);
            this.f63622d = new C14700h(interfaceC44393lG2);
            this.f63623e = new C14703k(interfaceC44393lG2);
            this.f63624f = new C14698f(interfaceC44393lG2);
            this.f63625g = new C14706n(interfaceC44393lG2);
            this.f63626h = new C14695c(interfaceC44393lG2);
            this.f63627i = new C14705m(interfaceC44393lG2);
            this.f63628j = new C14693a(interfaceC44393lG2);
            this.f63629k = new C14697e(interfaceC44108kn0);
            this.f63630l = new C14699g(interfaceC44393lG2);
            this.f63631m = new C14701i(interfaceC44393lG2);
            this.f63632n = C39546d52.m44621a(scopeProvider);
            this.f63633o = C39546d52.m44621a(baseActivity);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(c32532Dy1);
            this.f63634p = m44621a;
            Y94<C47652ql6> m80429b = V51.m80429b(C48245rl6.m15454a(this.f63633o, m44621a));
            this.f63635q = m80429b;
            this.f63636r = C33611Io0.m101706a(this.f63630l, this.f63623e, this.f63631m, this.f63632n, m80429b);
            this.f63637s = new C14704l(interfaceC44393lG2);
            this.f63638t = new C14702j(interfaceC44393lG2);
            C14694b c14694b = new C14694b(interfaceC44393lG2);
            this.f63639u = c14694b;
            Y94<C36623Vk6> m80429b2 = V51.m80429b(C36857Wk6.m77888a(this.f63637s, c14694b));
            this.f63640v = m80429b2;
            this.f63641w = V51.m80429b(C46466ol6.m20537a(this.f63621c, this.f63622d, this.f63623e, this.f63624f, this.f63625g, this.f63626h, this.f63627i, this.f63628j, this.f63629k, this.f63636r, this.f63637s, this.f63638t, this.f63635q, m80429b2, this.f63632n));
        }

        /* renamed from: c */
        public final LegacyCommandCenterActivity m58495c(LegacyCommandCenterActivity legacyCommandCenterActivity) {
            C5135Ly.m96068n(legacyCommandCenterActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f63619a.mo27461w2()));
            C5135Ly.m96066p(legacyCommandCenterActivity, (C36207Tq4) C51679xZ3.m5003d(this.f63619a.mo27595B1()));
            C5135Ly.m96071k(legacyCommandCenterActivity, (Handler) C51679xZ3.m5003d(this.f63619a.mo27535X2()));
            C5135Ly.m96067o(legacyCommandCenterActivity, (C22454gl) C51679xZ3.m5003d(this.f63619a.mo27479r()));
            C5135Ly.m96080b(legacyCommandCenterActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f63619a.mo27519d0()));
            C5135Ly.m96075g(legacyCommandCenterActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f63619a.mo27453z2()));
            C5135Ly.m96064r(legacyCommandCenterActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f63619a.mo27459x1()));
            C5135Ly.m96081a(legacyCommandCenterActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f63619a.mo27474s()));
            C5135Ly.m96073i(legacyCommandCenterActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f63619a.mo27558P0()));
            C5135Ly.m96074h(legacyCommandCenterActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f63619a.mo27598A0()));
            C5135Ly.m96077e(legacyCommandCenterActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f63619a.mo27507i0()));
            C5135Ly.m96070l(legacyCommandCenterActivity, (FO2) C51679xZ3.m5003d(this.f63619a.mo27456y2()));
            C5135Ly.m96065q(legacyCommandCenterActivity, (YR4) C51679xZ3.m5003d(this.f63619a.mo27525b0()));
            C5135Ly.m96079c(legacyCommandCenterActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f63619a.mo27460x()));
            C5135Ly.m96078d(legacyCommandCenterActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f63619a.mo27517d3()));
            C5135Ly.m96072j(legacyCommandCenterActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f63619a.mo27482q()));
            C5135Ly.m96076f(legacyCommandCenterActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f63619a.mo27483p3()));
            C38183ap2.m65447b(legacyCommandCenterActivity, this.f63641w.get());
            return legacyCommandCenterActivity;
        }

        public C14692b(InterfaceC44393lG2 interfaceC44393lG2, InterfaceC44108kn0 interfaceC44108kn0, BaseActivity baseActivity, ScopeProvider scopeProvider, C32532Dy1 c32532Dy1) {
            this.f63620b = this;
            this.f63619a = interfaceC44393lG2;
            m58496b(interfaceC44393lG2, interfaceC44108kn0, baseActivity, scopeProvider, c32532Dy1);
        }
    }

    private C14690b() {
    }

    /* renamed from: a */
    public static LegacyCommandCenterActivity.InterfaceC14684a.InterfaceC14685a m58499a() {
        return new C14691a();
    }
}
