package co.bird.android.feature.servicecenter.status.single.landing;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.servicecenter.status.single.landing.ServiceProgressLandingActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.servicecenter.status.single.landing.a */
/* loaded from: classes3.dex */
public final class C15724a {

    /* renamed from: co.bird.android.feature.servicecenter.status.single.landing.a$a */
    /* loaded from: classes3.dex */
    public static final class C15725a implements ServiceProgressLandingActivity.InterfaceC15721a.InterfaceC15722a {
        @Override // co.bird.android.feature.servicecenter.status.single.landing.ServiceProgressLandingActivity.InterfaceC15721a.InterfaceC15722a
        /* renamed from: a */
        public ServiceProgressLandingActivity.InterfaceC15721a mo56699a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C10570a6 c10570a6, DQ3 dq3) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c10570a6);
            C51679xZ3.m5005b(dq3);
            return new C15726b(interfaceC44393lG2, baseActivity, scopeProvider, c10570a6, dq3);
        }

        private C15725a() {
        }
    }

    /* renamed from: co.bird.android.feature.servicecenter.status.single.landing.a$b */
    /* loaded from: classes3.dex */
    public static final class C15726b implements ServiceProgressLandingActivity.InterfaceC15721a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f65559a;

        /* renamed from: b */
        public final C15726b f65560b;

        /* renamed from: c */
        public Y94<InterfaceC44647lh6> f65561c;

        /* renamed from: d */
        public Y94<InterfaceC36047Sy6> f65562d;

        /* renamed from: e */
        public Y94<C36207Tq4> f65563e;

        /* renamed from: f */
        public Y94<ScopeProvider> f65564f;

        /* renamed from: g */
        public Y94<InterfaceC40099e13> f65565g;

        /* renamed from: h */
        public Y94<C43038iy6> f65566h;

        /* renamed from: i */
        public Y94<BaseActivity> f65567i;

        /* renamed from: j */
        public Y94<C10570a6> f65568j;

        /* renamed from: k */
        public Y94<C45962nu5> f65569k;

        /* renamed from: l */
        public Y94<InterfaceC45369mu5> f65570l;

        /* renamed from: m */
        public Y94<DQ3> f65571m;

        /* renamed from: n */
        public Y94<C44183ku5> f65572n;

        /* renamed from: o */
        public Y94<InterfaceC41811gu5> f65573o;

        /* renamed from: co.bird.android.feature.servicecenter.status.single.landing.a$b$a */
        /* loaded from: classes3.dex */
        public static final class C15727a implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65574a;

            public C15727a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65574a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f65574a.mo27461w2());
            }
        }

        /* renamed from: co.bird.android.feature.servicecenter.status.single.landing.a$b$b */
        /* loaded from: classes3.dex */
        public static final class C15728b implements Y94<C36207Tq4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65575a;

            public C15728b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65575a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C36207Tq4 get() {
                return (C36207Tq4) C51679xZ3.m5003d(this.f65575a.mo27595B1());
            }
        }

        /* renamed from: co.bird.android.feature.servicecenter.status.single.landing.a$b$c */
        /* loaded from: classes3.dex */
        public static final class C15729c implements Y94<InterfaceC44647lh6> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65576a;

            public C15729c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65576a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC44647lh6 get() {
                return (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65576a.mo27459x1());
            }
        }

        /* renamed from: co.bird.android.feature.servicecenter.status.single.landing.a$b$d */
        /* loaded from: classes3.dex */
        public static final class C15730d implements Y94<InterfaceC36047Sy6> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65577a;

            public C15730d(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65577a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC36047Sy6 get() {
                return (InterfaceC36047Sy6) C51679xZ3.m5003d(this.f65577a.mo27571K2());
            }
        }

        @Override // co.bird.android.feature.servicecenter.status.single.landing.ServiceProgressLandingActivity.InterfaceC15721a
        /* renamed from: a */
        public void mo56698a(ServiceProgressLandingActivity serviceProgressLandingActivity) {
            m56696c(serviceProgressLandingActivity);
        }

        /* renamed from: b */
        public final void m56697b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C10570a6 c10570a6, DQ3 dq3) {
            this.f65561c = new C15729c(interfaceC44393lG2);
            this.f65562d = new C15730d(interfaceC44393lG2);
            this.f65563e = new C15728b(interfaceC44393lG2);
            this.f65564f = C39546d52.m44621a(scopeProvider);
            C15727a c15727a = new C15727a(interfaceC44393lG2);
            this.f65565g = c15727a;
            this.f65566h = C32303Cy6.m111187a(this.f65561c, this.f65562d, this.f65563e, this.f65564f, c15727a);
            this.f65567i = C39546d52.m44621a(baseActivity);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(c10570a6);
            this.f65568j = m44621a;
            C46555ou5 m20300a = C46555ou5.m20300a(this.f65567i, m44621a);
            this.f65569k = m20300a;
            this.f65570l = V51.m80429b(m20300a);
            InterfaceC48812sj1 m44621a2 = C39546d52.m44621a(dq3);
            this.f65571m = m44621a2;
            C44776lu5 m26695a = C44776lu5.m26695a(this.f65566h, this.f65570l, this.f65564f, this.f65565g, m44621a2);
            this.f65572n = m26695a;
            this.f65573o = V51.m80429b(m26695a);
        }

        /* renamed from: c */
        public final ServiceProgressLandingActivity m56696c(ServiceProgressLandingActivity serviceProgressLandingActivity) {
            C5135Ly.m96068n(serviceProgressLandingActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65559a.mo27461w2()));
            C5135Ly.m96066p(serviceProgressLandingActivity, (C36207Tq4) C51679xZ3.m5003d(this.f65559a.mo27595B1()));
            C5135Ly.m96071k(serviceProgressLandingActivity, (Handler) C51679xZ3.m5003d(this.f65559a.mo27535X2()));
            C5135Ly.m96067o(serviceProgressLandingActivity, (C22454gl) C51679xZ3.m5003d(this.f65559a.mo27479r()));
            C5135Ly.m96080b(serviceProgressLandingActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f65559a.mo27519d0()));
            C5135Ly.m96075g(serviceProgressLandingActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f65559a.mo27453z2()));
            C5135Ly.m96064r(serviceProgressLandingActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65559a.mo27459x1()));
            C5135Ly.m96081a(serviceProgressLandingActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f65559a.mo27474s()));
            C5135Ly.m96073i(serviceProgressLandingActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f65559a.mo27558P0()));
            C5135Ly.m96074h(serviceProgressLandingActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f65559a.mo27598A0()));
            C5135Ly.m96077e(serviceProgressLandingActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f65559a.mo27507i0()));
            C5135Ly.m96070l(serviceProgressLandingActivity, (FO2) C51679xZ3.m5003d(this.f65559a.mo27456y2()));
            C5135Ly.m96065q(serviceProgressLandingActivity, (YR4) C51679xZ3.m5003d(this.f65559a.mo27525b0()));
            C5135Ly.m96079c(serviceProgressLandingActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f65559a.mo27460x()));
            C5135Ly.m96078d(serviceProgressLandingActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f65559a.mo27517d3()));
            C5135Ly.m96072j(serviceProgressLandingActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f65559a.mo27482q()));
            C5135Ly.m96076f(serviceProgressLandingActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f65559a.mo27483p3()));
            C41218fu5.m40575b(serviceProgressLandingActivity, this.f65573o.get());
            return serviceProgressLandingActivity;
        }

        public C15726b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C10570a6 c10570a6, DQ3 dq3) {
            this.f65560b = this;
            this.f65559a = interfaceC44393lG2;
            m56697b(interfaceC44393lG2, baseActivity, scopeProvider, c10570a6, dq3);
        }
    }

    private C15724a() {
    }

    /* renamed from: a */
    public static ServiceProgressLandingActivity.InterfaceC15721a.InterfaceC15722a m56700a() {
        return new C15725a();
    }
}
