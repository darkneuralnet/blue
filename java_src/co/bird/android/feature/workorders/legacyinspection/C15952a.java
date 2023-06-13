package co.bird.android.feature.workorders.legacyinspection;

import android.content.Context;
import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.workorders.legacyinspection.LegacyWorkOrderInspectionActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.workorders.legacyinspection.a */
/* loaded from: classes3.dex */
public final class C15952a {

    /* renamed from: co.bird.android.feature.workorders.legacyinspection.a$a */
    /* loaded from: classes3.dex */
    public static final class C15953a implements LegacyWorkOrderInspectionActivity.InterfaceC15949a.InterfaceC15950a {
        @Override // co.bird.android.feature.workorders.legacyinspection.LegacyWorkOrderInspectionActivity.InterfaceC15949a.InterfaceC15950a
        /* renamed from: a */
        public LegacyWorkOrderInspectionActivity.InterfaceC15949a mo56222a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C13383c4 c13383c4) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c13383c4);
            return new C15954b(interfaceC44393lG2, baseActivity, scopeProvider, c13383c4);
        }

        private C15953a() {
        }
    }

    /* renamed from: co.bird.android.feature.workorders.legacyinspection.a$b */
    /* loaded from: classes3.dex */
    public static final class C15954b implements LegacyWorkOrderInspectionActivity.InterfaceC15949a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f65962a;

        /* renamed from: b */
        public final C15954b f65963b;

        /* renamed from: c */
        public Y94<InterfaceC44647lh6> f65964c;

        /* renamed from: d */
        public Y94<InterfaceC1880Ea> f65965d;

        /* renamed from: e */
        public Y94<InterfaceC40099e13> f65966e;

        /* renamed from: f */
        public Y94<ScopeProvider> f65967f;

        /* renamed from: g */
        public Y94<InterfaceC10636aM> f65968g;

        /* renamed from: h */
        public Y94<GI3> f65969h;

        /* renamed from: i */
        public Y94<InterfaceC37857aG6> f65970i;

        /* renamed from: j */
        public Y94<BaseActivity> f65971j;

        /* renamed from: k */
        public Y94<C13383c4> f65972k;

        /* renamed from: l */
        public Y94<C39397cq2> f65973l;

        /* renamed from: m */
        public Y94<InterfaceC38786bq2> f65974m;

        /* renamed from: n */
        public Y94<Context> f65975n;

        /* renamed from: o */
        public Y94<C43786kE6> f65976o;

        /* renamed from: p */
        public Y94<InterfaceC40821fE6> f65977p;

        /* renamed from: q */
        public Y94<C47285q83> f65978q;

        /* renamed from: r */
        public Y94<InterfaceC46692p83> f65979r;

        /* renamed from: s */
        public Y94<C37132Xp2> f65980s;

        /* renamed from: t */
        public Y94<InterfaceC31750Ap2> f65981t;

        /* renamed from: co.bird.android.feature.workorders.legacyinspection.a$b$a */
        /* loaded from: classes3.dex */
        public static final class C15955a implements Y94<InterfaceC1880Ea> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65982a;

            public C15955a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65982a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC1880Ea get() {
                return (InterfaceC1880Ea) C51679xZ3.m5003d(this.f65982a.mo27519d0());
            }
        }

        /* renamed from: co.bird.android.feature.workorders.legacyinspection.a$b$b */
        /* loaded from: classes3.dex */
        public static final class C15956b implements Y94<Context> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65983a;

            public C15956b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65983a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public Context get() {
                return (Context) C51679xZ3.m5003d(this.f65983a.mo27552R1());
            }
        }

        /* renamed from: co.bird.android.feature.workorders.legacyinspection.a$b$c */
        /* loaded from: classes3.dex */
        public static final class C15957c implements Y94<InterfaceC10636aM> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65984a;

            public C15957c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65984a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC10636aM get() {
                return (InterfaceC10636aM) C51679xZ3.m5003d(this.f65984a.mo27460x());
            }
        }

        /* renamed from: co.bird.android.feature.workorders.legacyinspection.a$b$d */
        /* loaded from: classes3.dex */
        public static final class C15958d implements Y94<GI3> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65985a;

            public C15958d(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65985a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public GI3 get() {
                return (GI3) C51679xZ3.m5003d(this.f65985a.mo27565M2());
            }
        }

        /* renamed from: co.bird.android.feature.workorders.legacyinspection.a$b$e */
        /* loaded from: classes3.dex */
        public static final class C15959e implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65986a;

            public C15959e(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65986a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f65986a.mo27461w2());
            }
        }

        /* renamed from: co.bird.android.feature.workorders.legacyinspection.a$b$f */
        /* loaded from: classes3.dex */
        public static final class C15960f implements Y94<InterfaceC44647lh6> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65987a;

            public C15960f(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65987a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC44647lh6 get() {
                return (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65987a.mo27459x1());
            }
        }

        /* renamed from: co.bird.android.feature.workorders.legacyinspection.a$b$g */
        /* loaded from: classes3.dex */
        public static final class C15961g implements Y94<InterfaceC37857aG6> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65988a;

            public C15961g(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65988a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC37857aG6 get() {
                return (InterfaceC37857aG6) C51679xZ3.m5003d(this.f65988a.mo27549T2());
            }
        }

        @Override // co.bird.android.feature.workorders.legacyinspection.LegacyWorkOrderInspectionActivity.InterfaceC15949a
        /* renamed from: a */
        public void mo56221a(LegacyWorkOrderInspectionActivity legacyWorkOrderInspectionActivity) {
            m56219c(legacyWorkOrderInspectionActivity);
        }

        /* renamed from: b */
        public final void m56220b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C13383c4 c13383c4) {
            this.f65964c = new C15960f(interfaceC44393lG2);
            this.f65965d = new C15955a(interfaceC44393lG2);
            this.f65966e = new C15959e(interfaceC44393lG2);
            this.f65967f = C39546d52.m44621a(scopeProvider);
            this.f65968g = new C15957c(interfaceC44393lG2);
            this.f65969h = new C15958d(interfaceC44393lG2);
            this.f65970i = new C15961g(interfaceC44393lG2);
            this.f65971j = C39546d52.m44621a(baseActivity);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(c13383c4);
            this.f65972k = m44621a;
            C39989dq2 m43670a = C39989dq2.m43670a(this.f65971j, m44621a);
            this.f65973l = m43670a;
            this.f65974m = V51.m80429b(m43670a);
            C15956b c15956b = new C15956b(interfaceC44393lG2);
            this.f65975n = c15956b;
            C44379lE6 m27639a = C44379lE6.m27639a(c15956b);
            this.f65976o = m27639a;
            this.f65977p = V51.m80429b(m27639a);
            C47878r83 m16445a = C47878r83.m16445a(this.f65975n);
            this.f65978q = m16445a;
            Y94<InterfaceC46692p83> m80429b = V51.m80429b(m16445a);
            this.f65979r = m80429b;
            C38193aq2 m65396a = C38193aq2.m65396a(this.f65964c, this.f65965d, this.f65966e, this.f65967f, this.f65968g, this.f65969h, this.f65970i, this.f65974m, this.f65977p, m80429b);
            this.f65980s = m65396a;
            this.f65981t = V51.m80429b(m65396a);
        }

        /* renamed from: c */
        public final LegacyWorkOrderInspectionActivity m56219c(LegacyWorkOrderInspectionActivity legacyWorkOrderInspectionActivity) {
            C5135Ly.m96068n(legacyWorkOrderInspectionActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65962a.mo27461w2()));
            C5135Ly.m96066p(legacyWorkOrderInspectionActivity, (C36207Tq4) C51679xZ3.m5003d(this.f65962a.mo27595B1()));
            C5135Ly.m96071k(legacyWorkOrderInspectionActivity, (Handler) C51679xZ3.m5003d(this.f65962a.mo27535X2()));
            C5135Ly.m96067o(legacyWorkOrderInspectionActivity, (C22454gl) C51679xZ3.m5003d(this.f65962a.mo27479r()));
            C5135Ly.m96080b(legacyWorkOrderInspectionActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f65962a.mo27519d0()));
            C5135Ly.m96075g(legacyWorkOrderInspectionActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f65962a.mo27453z2()));
            C5135Ly.m96064r(legacyWorkOrderInspectionActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65962a.mo27459x1()));
            C5135Ly.m96081a(legacyWorkOrderInspectionActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f65962a.mo27474s()));
            C5135Ly.m96073i(legacyWorkOrderInspectionActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f65962a.mo27558P0()));
            C5135Ly.m96074h(legacyWorkOrderInspectionActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f65962a.mo27598A0()));
            C5135Ly.m96077e(legacyWorkOrderInspectionActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f65962a.mo27507i0()));
            C5135Ly.m96070l(legacyWorkOrderInspectionActivity, (FO2) C51679xZ3.m5003d(this.f65962a.mo27456y2()));
            C5135Ly.m96065q(legacyWorkOrderInspectionActivity, (YR4) C51679xZ3.m5003d(this.f65962a.mo27525b0()));
            C5135Ly.m96079c(legacyWorkOrderInspectionActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f65962a.mo27460x()));
            C5135Ly.m96078d(legacyWorkOrderInspectionActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f65962a.mo27517d3()));
            C5135Ly.m96072j(legacyWorkOrderInspectionActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f65962a.mo27482q()));
            C5135Ly.m96076f(legacyWorkOrderInspectionActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f65962a.mo27483p3()));
            C50059up2.m9693b(legacyWorkOrderInspectionActivity, this.f65981t.get());
            return legacyWorkOrderInspectionActivity;
        }

        public C15954b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C13383c4 c13383c4) {
            this.f65963b = this;
            this.f65962a = interfaceC44393lG2;
            m56220b(interfaceC44393lG2, baseActivity, scopeProvider, c13383c4);
        }
    }

    private C15952a() {
    }

    /* renamed from: a */
    public static LegacyWorkOrderInspectionActivity.InterfaceC15949a.InterfaceC15950a m56223a() {
        return new C15953a();
    }
}
