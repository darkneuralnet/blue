package co.bird.android.qualitycontrol.result;

import android.content.Context;
import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.qualitycontrol.result.QualityControlResultActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.qualitycontrol.result.a */
/* loaded from: classes4.dex */
public final class C16341a {

    /* renamed from: co.bird.android.qualitycontrol.result.a$a */
    /* loaded from: classes4.dex */
    public static final class C16342a implements QualityControlResultActivity.InterfaceC16338a.InterfaceC16339a {
        @Override // co.bird.android.qualitycontrol.result.QualityControlResultActivity.InterfaceC16338a.InterfaceC16339a
        /* renamed from: a */
        public QualityControlResultActivity.InterfaceC16338a mo55001a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C9607Y4 c9607y4) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c9607y4);
            return new C16343b(interfaceC44393lG2, baseActivity, scopeProvider, c9607y4);
        }

        private C16342a() {
        }
    }

    /* renamed from: co.bird.android.qualitycontrol.result.a$b */
    /* loaded from: classes4.dex */
    public static final class C16343b implements QualityControlResultActivity.InterfaceC16338a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f66923a;

        /* renamed from: b */
        public final C16343b f66924b;

        /* renamed from: c */
        public Y94<BaseActivity> f66925c;

        /* renamed from: d */
        public Y94<C9607Y4> f66926d;

        /* renamed from: e */
        public Y94<C34443Mc4> f66927e;

        /* renamed from: f */
        public Y94<InterfaceC34209Lc4> f66928f;

        /* renamed from: g */
        public Y94<ScopeProvider> f66929g;

        /* renamed from: h */
        public Y94<InterfaceC39241cc4> f66930h;

        /* renamed from: i */
        public Y94<Context> f66931i;

        /* renamed from: j */
        public Y94<C33741Jc4> f66932j;

        /* renamed from: k */
        public Y94<InterfaceC33039Gc4> f66933k;

        /* renamed from: l */
        public Y94<InterfaceC37857aG6> f66934l;

        /* renamed from: m */
        public Y94<InterfaceC40099e13> f66935m;

        /* renamed from: n */
        public Y94<C36207Tq4> f66936n;

        /* renamed from: o */
        public Y94<InterfaceC31626Ab4> f66937o;

        /* renamed from: p */
        public Y94<C32103Cc4> f66938p;

        /* renamed from: q */
        public Y94<InterfaceC42816ic4> f66939q;

        /* renamed from: co.bird.android.qualitycontrol.result.a$b$a */
        /* loaded from: classes4.dex */
        public static final class C16344a implements Y94<Context> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f66940a;

            public C16344a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f66940a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public Context get() {
                return (Context) C51679xZ3.m5003d(this.f66940a.mo27552R1());
            }
        }

        /* renamed from: co.bird.android.qualitycontrol.result.a$b$b */
        /* loaded from: classes4.dex */
        public static final class C16345b implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f66941a;

            public C16345b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f66941a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f66941a.mo27461w2());
            }
        }

        /* renamed from: co.bird.android.qualitycontrol.result.a$b$c */
        /* loaded from: classes4.dex */
        public static final class C16346c implements Y94<InterfaceC31626Ab4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f66942a;

            public C16346c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f66942a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC31626Ab4 get() {
                return (InterfaceC31626Ab4) C51679xZ3.m5003d(this.f66942a.mo27557P1());
            }
        }

        /* renamed from: co.bird.android.qualitycontrol.result.a$b$d */
        /* loaded from: classes4.dex */
        public static final class C16347d implements Y94<C36207Tq4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f66943a;

            public C16347d(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f66943a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C36207Tq4 get() {
                return (C36207Tq4) C51679xZ3.m5003d(this.f66943a.mo27595B1());
            }
        }

        /* renamed from: co.bird.android.qualitycontrol.result.a$b$e */
        /* loaded from: classes4.dex */
        public static final class C16348e implements Y94<InterfaceC37857aG6> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f66944a;

            public C16348e(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f66944a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC37857aG6 get() {
                return (InterfaceC37857aG6) C51679xZ3.m5003d(this.f66944a.mo27549T2());
            }
        }

        @Override // co.bird.android.qualitycontrol.result.QualityControlResultActivity.InterfaceC16338a
        /* renamed from: a */
        public void mo55000a(QualityControlResultActivity qualityControlResultActivity) {
            m54998c(qualityControlResultActivity);
        }

        /* renamed from: b */
        public final void m54999b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C9607Y4 c9607y4) {
            this.f66925c = C39546d52.m44621a(baseActivity);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(c9607y4);
            this.f66926d = m44621a;
            C34677Nc4 m93703a = C34677Nc4.m93703a(this.f66925c, m44621a);
            this.f66927e = m93703a;
            this.f66928f = V51.m80429b(m93703a);
            this.f66929g = C39546d52.m44621a(scopeProvider);
            this.f66930h = V51.m80429b(C41037fc4.m41115a());
            C16344a c16344a = new C16344a(interfaceC44393lG2);
            this.f66931i = c16344a;
            C33975Kc4 m98663a = C33975Kc4.m98663a(c16344a);
            this.f66932j = m98663a;
            this.f66933k = V51.m80429b(m98663a);
            this.f66934l = new C16348e(interfaceC44393lG2);
            this.f66935m = new C16345b(interfaceC44393lG2);
            this.f66936n = new C16347d(interfaceC44393lG2);
            C16346c c16346c = new C16346c(interfaceC44393lG2);
            this.f66937o = c16346c;
            C32805Fc4 m106906a = C32805Fc4.m106906a(this.f66928f, this.f66929g, this.f66930h, this.f66933k, this.f66934l, this.f66935m, this.f66936n, c16346c);
            this.f66938p = m106906a;
            this.f66939q = V51.m80429b(m106906a);
        }

        /* renamed from: c */
        public final QualityControlResultActivity m54998c(QualityControlResultActivity qualityControlResultActivity) {
            C5135Ly.m96068n(qualityControlResultActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f66923a.mo27461w2()));
            C5135Ly.m96066p(qualityControlResultActivity, (C36207Tq4) C51679xZ3.m5003d(this.f66923a.mo27595B1()));
            C5135Ly.m96071k(qualityControlResultActivity, (Handler) C51679xZ3.m5003d(this.f66923a.mo27535X2()));
            C5135Ly.m96067o(qualityControlResultActivity, (C22454gl) C51679xZ3.m5003d(this.f66923a.mo27479r()));
            C5135Ly.m96080b(qualityControlResultActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f66923a.mo27519d0()));
            C5135Ly.m96075g(qualityControlResultActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f66923a.mo27453z2()));
            C5135Ly.m96064r(qualityControlResultActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f66923a.mo27459x1()));
            C5135Ly.m96081a(qualityControlResultActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f66923a.mo27474s()));
            C5135Ly.m96073i(qualityControlResultActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f66923a.mo27558P0()));
            C5135Ly.m96074h(qualityControlResultActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f66923a.mo27598A0()));
            C5135Ly.m96077e(qualityControlResultActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f66923a.mo27507i0()));
            C5135Ly.m96070l(qualityControlResultActivity, (FO2) C51679xZ3.m5003d(this.f66923a.mo27456y2()));
            C5135Ly.m96065q(qualityControlResultActivity, (YR4) C51679xZ3.m5003d(this.f66923a.mo27525b0()));
            C5135Ly.m96079c(qualityControlResultActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f66923a.mo27460x()));
            C5135Ly.m96078d(qualityControlResultActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f66923a.mo27517d3()));
            C5135Ly.m96072j(qualityControlResultActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f66923a.mo27482q()));
            C5135Ly.m96076f(qualityControlResultActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f66923a.mo27483p3()));
            C36072Tb4.m83357b(qualityControlResultActivity, this.f66939q.get());
            return qualityControlResultActivity;
        }

        public C16343b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C9607Y4 c9607y4) {
            this.f66924b = this;
            this.f66923a = interfaceC44393lG2;
            m54999b(interfaceC44393lG2, baseActivity, scopeProvider, c9607y4);
        }
    }

    private C16341a() {
    }

    /* renamed from: a */
    public static QualityControlResultActivity.InterfaceC16338a.InterfaceC16339a m55002a() {
        return new C16342a();
    }
}
