package co.bird.android.qualitycontrol.list;

import android.content.Context;
import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.qualitycontrol.list.ListQualityControlActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.qualitycontrol.list.a */
/* loaded from: classes4.dex */
public final class C16329a {

    /* renamed from: co.bird.android.qualitycontrol.list.a$a */
    /* loaded from: classes4.dex */
    public static final class C16330a implements ListQualityControlActivity.InterfaceC16326a.InterfaceC16327a {
        @Override // co.bird.android.qualitycontrol.list.ListQualityControlActivity.InterfaceC16326a.InterfaceC16327a
        /* renamed from: a */
        public ListQualityControlActivity.InterfaceC16326a mo55017a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C9293X4 c9293x4) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c9293x4);
            return new C16331b(interfaceC44393lG2, baseActivity, scopeProvider, c9293x4);
        }

        private C16330a() {
        }
    }

    /* renamed from: co.bird.android.qualitycontrol.list.a$b */
    /* loaded from: classes4.dex */
    public static final class C16331b implements ListQualityControlActivity.InterfaceC16326a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f66900a;

        /* renamed from: b */
        public final C16331b f66901b;

        /* renamed from: c */
        public Y94<InterfaceC37857aG6> f66902c;

        /* renamed from: d */
        public Y94<InterfaceC31626Ab4> f66903d;

        /* renamed from: e */
        public Y94<InterfaceC48923su2> f66904e;

        /* renamed from: f */
        public Y94<InterfaceC40099e13> f66905f;

        /* renamed from: g */
        public Y94<ScopeProvider> f66906g;

        /* renamed from: h */
        public Y94<C36207Tq4> f66907h;

        /* renamed from: i */
        public Y94<BaseActivity> f66908i;

        /* renamed from: j */
        public Y94<C9293X4> f66909j;

        /* renamed from: k */
        public Y94<C42381hs2> f66910k;

        /* renamed from: l */
        public Y94<C52460ys2> f66911l;

        /* renamed from: m */
        public Y94<Context> f66912m;

        /* renamed from: n */
        public Y94<C44753ls2> f66913n;

        /* renamed from: o */
        public Y94<InterfaceC43567js2> f66914o;

        /* renamed from: p */
        public Y94<C50681vs2> f66915p;

        /* renamed from: co.bird.android.qualitycontrol.list.a$b$a */
        /* loaded from: classes4.dex */
        public static final class C16332a implements Y94<Context> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f66916a;

            public C16332a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f66916a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public Context get() {
                return (Context) C51679xZ3.m5003d(this.f66916a.mo27552R1());
            }
        }

        /* renamed from: co.bird.android.qualitycontrol.list.a$b$b */
        /* loaded from: classes4.dex */
        public static final class C16333b implements Y94<InterfaceC48923su2> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f66917a;

            public C16333b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f66917a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC48923su2 get() {
                return (InterfaceC48923su2) C51679xZ3.m5003d(this.f66917a.mo27505j0());
            }
        }

        /* renamed from: co.bird.android.qualitycontrol.list.a$b$c */
        /* loaded from: classes4.dex */
        public static final class C16334c implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f66918a;

            public C16334c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f66918a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f66918a.mo27461w2());
            }
        }

        /* renamed from: co.bird.android.qualitycontrol.list.a$b$d */
        /* loaded from: classes4.dex */
        public static final class C16335d implements Y94<InterfaceC31626Ab4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f66919a;

            public C16335d(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f66919a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC31626Ab4 get() {
                return (InterfaceC31626Ab4) C51679xZ3.m5003d(this.f66919a.mo27557P1());
            }
        }

        /* renamed from: co.bird.android.qualitycontrol.list.a$b$e */
        /* loaded from: classes4.dex */
        public static final class C16336e implements Y94<C36207Tq4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f66920a;

            public C16336e(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f66920a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C36207Tq4 get() {
                return (C36207Tq4) C51679xZ3.m5003d(this.f66920a.mo27595B1());
            }
        }

        /* renamed from: co.bird.android.qualitycontrol.list.a$b$f */
        /* loaded from: classes4.dex */
        public static final class C16337f implements Y94<InterfaceC37857aG6> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f66921a;

            public C16337f(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f66921a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC37857aG6 get() {
                return (InterfaceC37857aG6) C51679xZ3.m5003d(this.f66921a.mo27549T2());
            }
        }

        @Override // co.bird.android.qualitycontrol.list.ListQualityControlActivity.InterfaceC16326a
        /* renamed from: a */
        public void mo55016a(ListQualityControlActivity listQualityControlActivity) {
            m55014c(listQualityControlActivity);
        }

        /* renamed from: b */
        public final void m55015b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C9293X4 c9293x4) {
            this.f66902c = new C16337f(interfaceC44393lG2);
            this.f66903d = new C16335d(interfaceC44393lG2);
            this.f66904e = new C16333b(interfaceC44393lG2);
            this.f66905f = new C16334c(interfaceC44393lG2);
            this.f66906g = C39546d52.m44621a(scopeProvider);
            this.f66907h = new C16336e(interfaceC44393lG2);
            this.f66908i = C39546d52.m44621a(baseActivity);
            this.f66909j = C39546d52.m44621a(c9293x4);
            C42974is2 m31744a = C42974is2.m31744a(this.f66904e);
            this.f66910k = m31744a;
            this.f66911l = V51.m80429b(C53053zs2.m201a(this.f66908i, this.f66909j, m31744a));
            C16332a c16332a = new C16332a(interfaceC44393lG2);
            this.f66912m = c16332a;
            C45346ms2 m24837a = C45346ms2.m24837a(c16332a);
            this.f66913n = m24837a;
            Y94<InterfaceC43567js2> m80429b = V51.m80429b(m24837a);
            this.f66914o = m80429b;
            this.f66915p = V51.m80429b(C51274ws2.m6200a(this.f66902c, this.f66903d, this.f66904e, this.f66905f, this.f66906g, this.f66907h, this.f66911l, m80429b));
        }

        /* renamed from: c */
        public final ListQualityControlActivity m55014c(ListQualityControlActivity listQualityControlActivity) {
            C5135Ly.m96068n(listQualityControlActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f66900a.mo27461w2()));
            C5135Ly.m96066p(listQualityControlActivity, (C36207Tq4) C51679xZ3.m5003d(this.f66900a.mo27595B1()));
            C5135Ly.m96071k(listQualityControlActivity, (Handler) C51679xZ3.m5003d(this.f66900a.mo27535X2()));
            C5135Ly.m96067o(listQualityControlActivity, (C22454gl) C51679xZ3.m5003d(this.f66900a.mo27479r()));
            C5135Ly.m96080b(listQualityControlActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f66900a.mo27519d0()));
            C5135Ly.m96075g(listQualityControlActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f66900a.mo27453z2()));
            C5135Ly.m96064r(listQualityControlActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f66900a.mo27459x1()));
            C5135Ly.m96081a(listQualityControlActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f66900a.mo27474s()));
            C5135Ly.m96073i(listQualityControlActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f66900a.mo27558P0()));
            C5135Ly.m96074h(listQualityControlActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f66900a.mo27598A0()));
            C5135Ly.m96077e(listQualityControlActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f66900a.mo27507i0()));
            C5135Ly.m96070l(listQualityControlActivity, (FO2) C51679xZ3.m5003d(this.f66900a.mo27456y2()));
            C5135Ly.m96065q(listQualityControlActivity, (YR4) C51679xZ3.m5003d(this.f66900a.mo27525b0()));
            C5135Ly.m96079c(listQualityControlActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f66900a.mo27460x()));
            C5135Ly.m96078d(listQualityControlActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f66900a.mo27517d3()));
            C5135Ly.m96072j(listQualityControlActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f66900a.mo27482q()));
            C5135Ly.m96076f(listQualityControlActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f66900a.mo27483p3()));
            C30930zC.m1673b(listQualityControlActivity, this.f66915p.get());
            return listQualityControlActivity;
        }

        public C16331b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C9293X4 c9293x4) {
            this.f66901b = this;
            this.f66900a = interfaceC44393lG2;
            m55015b(interfaceC44393lG2, baseActivity, scopeProvider, c9293x4);
        }
    }

    private C16329a() {
    }

    /* renamed from: a */
    public static ListQualityControlActivity.InterfaceC16326a.InterfaceC16327a m55018a() {
        return new C16330a();
    }
}
