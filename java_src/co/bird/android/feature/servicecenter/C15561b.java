package co.bird.android.feature.servicecenter;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.servicecenter.SelectServiceCenterActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.servicecenter.b */
/* loaded from: classes3.dex */
public final class C15561b {

    /* renamed from: co.bird.android.feature.servicecenter.b$a */
    /* loaded from: classes3.dex */
    public static final class C15562a implements SelectServiceCenterActivity.InterfaceC15554a.InterfaceC15555a {
        @Override // co.bird.android.feature.servicecenter.SelectServiceCenterActivity.InterfaceC15554a.InterfaceC15555a
        /* renamed from: a */
        public SelectServiceCenterActivity.InterfaceC15554a mo56928a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C10113Z5 c10113z5) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c10113z5);
            return new C15563b(interfaceC44393lG2, baseActivity, scopeProvider, c10113z5);
        }

        private C15562a() {
        }
    }

    /* renamed from: co.bird.android.feature.servicecenter.b$b */
    /* loaded from: classes3.dex */
    public static final class C15563b implements SelectServiceCenterActivity.InterfaceC15554a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f65251a;

        /* renamed from: b */
        public final C15563b f65252b;

        /* renamed from: c */
        public Y94<InterfaceC33193Gt5> f65253c;

        /* renamed from: d */
        public Y94<InterfaceC40001dr4> f65254d;

        /* renamed from: e */
        public Y94<ScopeProvider> f65255e;

        /* renamed from: f */
        public Y94<BaseActivity> f65256f;

        /* renamed from: g */
        public Y94<C10113Z5> f65257g;

        /* renamed from: h */
        public Y94<C32473Dr5> f65258h;

        /* renamed from: i */
        public Y94<InterfaceC32239Cr5> f65259i;

        /* renamed from: j */
        public Y94<InterfaceC40099e13> f65260j;

        /* renamed from: k */
        public Y94<C31771Ar5> f65261k;

        /* renamed from: l */
        public Y94<InterfaceC50674vr5> f65262l;

        /* renamed from: co.bird.android.feature.servicecenter.b$b$a */
        /* loaded from: classes3.dex */
        public static final class C15564a implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65263a;

            public C15564a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65263a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f65263a.mo27461w2());
            }
        }

        /* renamed from: co.bird.android.feature.servicecenter.b$b$b */
        /* loaded from: classes3.dex */
        public static final class C15565b implements Y94<InterfaceC40001dr4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65264a;

            public C15565b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65264a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40001dr4 get() {
                return (InterfaceC40001dr4) C51679xZ3.m5003d(this.f65264a.mo27482q());
            }
        }

        /* renamed from: co.bird.android.feature.servicecenter.b$b$c */
        /* loaded from: classes3.dex */
        public static final class C15566c implements Y94<InterfaceC33193Gt5> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65265a;

            public C15566c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65265a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC33193Gt5 get() {
                return (InterfaceC33193Gt5) C51679xZ3.m5003d(this.f65265a.mo27534Y());
            }
        }

        @Override // co.bird.android.feature.servicecenter.SelectServiceCenterActivity.InterfaceC15554a
        /* renamed from: a */
        public void mo56927a(SelectServiceCenterActivity selectServiceCenterActivity) {
            m56925c(selectServiceCenterActivity);
        }

        /* renamed from: b */
        public final void m56926b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C10113Z5 c10113z5) {
            this.f65253c = new C15566c(interfaceC44393lG2);
            this.f65254d = new C15565b(interfaceC44393lG2);
            this.f65255e = C39546d52.m44621a(scopeProvider);
            this.f65256f = C39546d52.m44621a(baseActivity);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(c10113z5);
            this.f65257g = m44621a;
            C32707Er5 m108323a = C32707Er5.m108323a(this.f65256f, m44621a);
            this.f65258h = m108323a;
            this.f65259i = V51.m80429b(m108323a);
            C15564a c15564a = new C15564a(interfaceC44393lG2);
            this.f65260j = c15564a;
            C32005Br5 m113435a = C32005Br5.m113435a(this.f65253c, this.f65254d, this.f65255e, this.f65259i, c15564a);
            this.f65261k = m113435a;
            this.f65262l = V51.m80429b(m113435a);
        }

        /* renamed from: c */
        public final SelectServiceCenterActivity m56925c(SelectServiceCenterActivity selectServiceCenterActivity) {
            C5135Ly.m96068n(selectServiceCenterActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65251a.mo27461w2()));
            C5135Ly.m96066p(selectServiceCenterActivity, (C36207Tq4) C51679xZ3.m5003d(this.f65251a.mo27595B1()));
            C5135Ly.m96071k(selectServiceCenterActivity, (Handler) C51679xZ3.m5003d(this.f65251a.mo27535X2()));
            C5135Ly.m96067o(selectServiceCenterActivity, (C22454gl) C51679xZ3.m5003d(this.f65251a.mo27479r()));
            C5135Ly.m96080b(selectServiceCenterActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f65251a.mo27519d0()));
            C5135Ly.m96075g(selectServiceCenterActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f65251a.mo27453z2()));
            C5135Ly.m96064r(selectServiceCenterActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65251a.mo27459x1()));
            C5135Ly.m96081a(selectServiceCenterActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f65251a.mo27474s()));
            C5135Ly.m96073i(selectServiceCenterActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f65251a.mo27558P0()));
            C5135Ly.m96074h(selectServiceCenterActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f65251a.mo27598A0()));
            C5135Ly.m96077e(selectServiceCenterActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f65251a.mo27507i0()));
            C5135Ly.m96070l(selectServiceCenterActivity, (FO2) C51679xZ3.m5003d(this.f65251a.mo27456y2()));
            C5135Ly.m96065q(selectServiceCenterActivity, (YR4) C51679xZ3.m5003d(this.f65251a.mo27525b0()));
            C5135Ly.m96079c(selectServiceCenterActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f65251a.mo27460x()));
            C5135Ly.m96078d(selectServiceCenterActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f65251a.mo27517d3()));
            C5135Ly.m96072j(selectServiceCenterActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f65251a.mo27482q()));
            C5135Ly.m96076f(selectServiceCenterActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f65251a.mo27483p3()));
            C50082ur5.m9650b(selectServiceCenterActivity, this.f65262l.get());
            return selectServiceCenterActivity;
        }

        public C15563b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C10113Z5 c10113z5) {
            this.f65252b = this;
            this.f65251a = interfaceC44393lG2;
            m56926b(interfaceC44393lG2, baseActivity, scopeProvider, c10113z5);
        }
    }

    private C15561b() {
    }

    /* renamed from: a */
    public static SelectServiceCenterActivity.InterfaceC15554a.InterfaceC15555a m56929a() {
        return new C15562a();
    }
}
