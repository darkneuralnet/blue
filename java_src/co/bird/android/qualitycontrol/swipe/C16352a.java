package co.bird.android.qualitycontrol.swipe;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.qualitycontrol.swipe.SwipeQualityControlActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.qualitycontrol.swipe.a */
/* loaded from: classes4.dex */
public final class C16352a {

    /* renamed from: co.bird.android.qualitycontrol.swipe.a$a */
    /* loaded from: classes4.dex */
    public static final class C16353a implements SwipeQualityControlActivity.InterfaceC16349a.InterfaceC16350a {
        @Override // co.bird.android.qualitycontrol.swipe.SwipeQualityControlActivity.InterfaceC16349a.InterfaceC16350a
        /* renamed from: a */
        public SwipeQualityControlActivity.InterfaceC16349a mo54987a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C10110Z4 c10110z4) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c10110z4);
            return new C16354b(interfaceC44393lG2, baseActivity, scopeProvider, c10110z4);
        }

        private C16353a() {
        }
    }

    /* renamed from: co.bird.android.qualitycontrol.swipe.a$b */
    /* loaded from: classes4.dex */
    public static final class C16354b implements SwipeQualityControlActivity.InterfaceC16349a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f66946a;

        /* renamed from: b */
        public final C16354b f66947b;

        /* renamed from: c */
        public Y94<InterfaceC37857aG6> f66948c;

        /* renamed from: d */
        public Y94<InterfaceC31626Ab4> f66949d;

        /* renamed from: e */
        public Y94<InterfaceC48923su2> f66950e;

        /* renamed from: f */
        public Y94<InterfaceC40099e13> f66951f;

        /* renamed from: g */
        public Y94<ScopeProvider> f66952g;

        /* renamed from: h */
        public Y94<C36207Tq4> f66953h;

        /* renamed from: i */
        public Y94<BaseActivity> f66954i;

        /* renamed from: j */
        public Y94<C10110Z4> f66955j;

        /* renamed from: k */
        public Y94<IW5> f66956k;

        /* renamed from: l */
        public Y94<C43956kX5> f66957l;

        /* renamed from: m */
        public Y94<LW5> f66958m;

        /* renamed from: n */
        public Y94<C40991fX5> f66959n;

        /* renamed from: co.bird.android.qualitycontrol.swipe.a$b$a */
        /* loaded from: classes4.dex */
        public static final class C16355a implements Y94<InterfaceC48923su2> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f66960a;

            public C16355a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f66960a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC48923su2 get() {
                return (InterfaceC48923su2) C51679xZ3.m5003d(this.f66960a.mo27505j0());
            }
        }

        /* renamed from: co.bird.android.qualitycontrol.swipe.a$b$b */
        /* loaded from: classes4.dex */
        public static final class C16356b implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f66961a;

            public C16356b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f66961a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f66961a.mo27461w2());
            }
        }

        /* renamed from: co.bird.android.qualitycontrol.swipe.a$b$c */
        /* loaded from: classes4.dex */
        public static final class C16357c implements Y94<InterfaceC31626Ab4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f66962a;

            public C16357c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f66962a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC31626Ab4 get() {
                return (InterfaceC31626Ab4) C51679xZ3.m5003d(this.f66962a.mo27557P1());
            }
        }

        /* renamed from: co.bird.android.qualitycontrol.swipe.a$b$d */
        /* loaded from: classes4.dex */
        public static final class C16358d implements Y94<C36207Tq4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f66963a;

            public C16358d(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f66963a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C36207Tq4 get() {
                return (C36207Tq4) C51679xZ3.m5003d(this.f66963a.mo27595B1());
            }
        }

        /* renamed from: co.bird.android.qualitycontrol.swipe.a$b$e */
        /* loaded from: classes4.dex */
        public static final class C16359e implements Y94<InterfaceC37857aG6> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f66964a;

            public C16359e(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f66964a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC37857aG6 get() {
                return (InterfaceC37857aG6) C51679xZ3.m5003d(this.f66964a.mo27549T2());
            }
        }

        @Override // co.bird.android.qualitycontrol.swipe.SwipeQualityControlActivity.InterfaceC16349a
        /* renamed from: a */
        public void mo54986a(SwipeQualityControlActivity swipeQualityControlActivity) {
            m54984c(swipeQualityControlActivity);
        }

        /* renamed from: b */
        public final void m54985b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C10110Z4 c10110z4) {
            this.f66948c = new C16359e(interfaceC44393lG2);
            this.f66949d = new C16357c(interfaceC44393lG2);
            this.f66950e = new C16355a(interfaceC44393lG2);
            this.f66951f = new C16356b(interfaceC44393lG2);
            this.f66952g = C39546d52.m44621a(scopeProvider);
            this.f66953h = new C16358d(interfaceC44393lG2);
            this.f66954i = C39546d52.m44621a(baseActivity);
            this.f66955j = C39546d52.m44621a(c10110z4);
            KW5 m98802a = KW5.m98802a(this.f66950e);
            this.f66956k = m98802a;
            this.f66957l = V51.m80429b(C44549lX5.m27173a(this.f66954i, this.f66955j, m98802a));
            Y94<LW5> m80429b = V51.m80429b(OW5.m92107a());
            this.f66958m = m80429b;
            this.f66959n = V51.m80429b(C41584gX5.m39186a(this.f66948c, this.f66949d, this.f66950e, this.f66951f, this.f66952g, this.f66953h, this.f66957l, m80429b));
        }

        /* renamed from: c */
        public final SwipeQualityControlActivity m54984c(SwipeQualityControlActivity swipeQualityControlActivity) {
            C5135Ly.m96068n(swipeQualityControlActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f66946a.mo27461w2()));
            C5135Ly.m96066p(swipeQualityControlActivity, (C36207Tq4) C51679xZ3.m5003d(this.f66946a.mo27595B1()));
            C5135Ly.m96071k(swipeQualityControlActivity, (Handler) C51679xZ3.m5003d(this.f66946a.mo27535X2()));
            C5135Ly.m96067o(swipeQualityControlActivity, (C22454gl) C51679xZ3.m5003d(this.f66946a.mo27479r()));
            C5135Ly.m96080b(swipeQualityControlActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f66946a.mo27519d0()));
            C5135Ly.m96075g(swipeQualityControlActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f66946a.mo27453z2()));
            C5135Ly.m96064r(swipeQualityControlActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f66946a.mo27459x1()));
            C5135Ly.m96081a(swipeQualityControlActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f66946a.mo27474s()));
            C5135Ly.m96073i(swipeQualityControlActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f66946a.mo27558P0()));
            C5135Ly.m96074h(swipeQualityControlActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f66946a.mo27598A0()));
            C5135Ly.m96077e(swipeQualityControlActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f66946a.mo27507i0()));
            C5135Ly.m96070l(swipeQualityControlActivity, (FO2) C51679xZ3.m5003d(this.f66946a.mo27456y2()));
            C5135Ly.m96065q(swipeQualityControlActivity, (YR4) C51679xZ3.m5003d(this.f66946a.mo27525b0()));
            C5135Ly.m96079c(swipeQualityControlActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f66946a.mo27460x()));
            C5135Ly.m96078d(swipeQualityControlActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f66946a.mo27517d3()));
            C5135Ly.m96072j(swipeQualityControlActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f66946a.mo27482q()));
            C5135Ly.m96076f(swipeQualityControlActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f66946a.mo27483p3()));
            EW5.m108872b(swipeQualityControlActivity, this.f66959n.get());
            return swipeQualityControlActivity;
        }

        public C16354b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C10110Z4 c10110z4) {
            this.f66947b = this;
            this.f66946a = interfaceC44393lG2;
            m54985b(interfaceC44393lG2, baseActivity, scopeProvider, c10110z4);
        }
    }

    private C16352a() {
    }

    /* renamed from: a */
    public static SwipeQualityControlActivity.InterfaceC16349a.InterfaceC16350a m54988a() {
        return new C16353a();
    }
}
