package co.bird.android.feature.servicecenter.status.single.update;

import android.content.Context;
import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.servicecenter.status.single.update.ServiceProgressUpdateActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.servicecenter.status.single.update.a */
/* loaded from: classes3.dex */
public final class C15734a {

    /* renamed from: co.bird.android.feature.servicecenter.status.single.update.a$a */
    /* loaded from: classes3.dex */
    public static final class C15735a implements ServiceProgressUpdateActivity.InterfaceC15731a.InterfaceC15732a {
        @Override // co.bird.android.feature.servicecenter.status.single.update.ServiceProgressUpdateActivity.InterfaceC15731a.InterfaceC15732a
        /* renamed from: a */
        public ServiceProgressUpdateActivity.InterfaceC15731a mo56685a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C12291b6 c12291b6) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c12291b6);
            return new C15736b(interfaceC44393lG2, baseActivity, scopeProvider, c12291b6);
        }

        private C15735a() {
        }
    }

    /* renamed from: co.bird.android.feature.servicecenter.status.single.update.a$b */
    /* loaded from: classes3.dex */
    public static final class C15736b implements ServiceProgressUpdateActivity.InterfaceC15731a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f65579a;

        /* renamed from: b */
        public final C15736b f65580b;

        /* renamed from: c */
        public Y94<InterfaceC10636aM> f65581c;

        /* renamed from: d */
        public Y94<InterfaceC33193Gt5> f65582d;

        /* renamed from: e */
        public Y94<InterfaceC44647lh6> f65583e;

        /* renamed from: f */
        public Y94<C36207Tq4> f65584f;

        /* renamed from: g */
        public Y94<ScopeProvider> f65585g;

        /* renamed from: h */
        public Y94<BaseActivity> f65586h;

        /* renamed from: i */
        public Y94<C12291b6> f65587i;

        /* renamed from: j */
        public Y94<C39450cv5> f65588j;

        /* renamed from: k */
        public Y94<InterfaceC40099e13> f65589k;

        /* renamed from: l */
        public Y94<Context> f65590l;

        /* renamed from: m */
        public Y94<C51297wu5> f65591m;

        /* renamed from: n */
        public Y94<InterfaceC50112uu5> f65592n;

        /* renamed from: o */
        public Y94<C37648Zu5> f65593o;

        /* renamed from: p */
        public Y94<InterfaceC36712Vu5> f65594p;

        /* renamed from: q */
        public Y94<C35542Qu5> f65595q;

        /* renamed from: r */
        public Y94<InterfaceC52483yu5> f65596r;

        /* renamed from: co.bird.android.feature.servicecenter.status.single.update.a$b$a */
        /* loaded from: classes3.dex */
        public static final class C15737a implements Y94<Context> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65597a;

            public C15737a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65597a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public Context get() {
                return (Context) C51679xZ3.m5003d(this.f65597a.mo27552R1());
            }
        }

        /* renamed from: co.bird.android.feature.servicecenter.status.single.update.a$b$b */
        /* loaded from: classes3.dex */
        public static final class C15738b implements Y94<InterfaceC10636aM> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65598a;

            public C15738b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65598a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC10636aM get() {
                return (InterfaceC10636aM) C51679xZ3.m5003d(this.f65598a.mo27460x());
            }
        }

        /* renamed from: co.bird.android.feature.servicecenter.status.single.update.a$b$c */
        /* loaded from: classes3.dex */
        public static final class C15739c implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65599a;

            public C15739c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65599a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f65599a.mo27461w2());
            }
        }

        /* renamed from: co.bird.android.feature.servicecenter.status.single.update.a$b$d */
        /* loaded from: classes3.dex */
        public static final class C15740d implements Y94<C36207Tq4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65600a;

            public C15740d(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65600a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C36207Tq4 get() {
                return (C36207Tq4) C51679xZ3.m5003d(this.f65600a.mo27595B1());
            }
        }

        /* renamed from: co.bird.android.feature.servicecenter.status.single.update.a$b$e */
        /* loaded from: classes3.dex */
        public static final class C15741e implements Y94<InterfaceC33193Gt5> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65601a;

            public C15741e(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65601a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC33193Gt5 get() {
                return (InterfaceC33193Gt5) C51679xZ3.m5003d(this.f65601a.mo27534Y());
            }
        }

        /* renamed from: co.bird.android.feature.servicecenter.status.single.update.a$b$f */
        /* loaded from: classes3.dex */
        public static final class C15742f implements Y94<InterfaceC44647lh6> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65602a;

            public C15742f(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65602a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC44647lh6 get() {
                return (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65602a.mo27459x1());
            }
        }

        @Override // co.bird.android.feature.servicecenter.status.single.update.ServiceProgressUpdateActivity.InterfaceC15731a
        /* renamed from: a */
        public void mo56684a(ServiceProgressUpdateActivity serviceProgressUpdateActivity) {
            m56682c(serviceProgressUpdateActivity);
        }

        /* renamed from: b */
        public final void m56683b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C12291b6 c12291b6) {
            this.f65581c = new C15738b(interfaceC44393lG2);
            this.f65582d = new C15741e(interfaceC44393lG2);
            this.f65583e = new C15742f(interfaceC44393lG2);
            this.f65584f = new C15740d(interfaceC44393lG2);
            this.f65585g = C39546d52.m44621a(scopeProvider);
            this.f65586h = C39546d52.m44621a(baseActivity);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(c12291b6);
            this.f65587i = m44621a;
            this.f65588j = V51.m80429b(C40042dv5.m43501a(this.f65586h, m44621a));
            this.f65589k = new C15739c(interfaceC44393lG2);
            C15737a c15737a = new C15737a(interfaceC44393lG2);
            this.f65590l = c15737a;
            C51890xu5 m4477a = C51890xu5.m4477a(c15737a);
            this.f65591m = m4477a;
            this.f65592n = V51.m80429b(m4477a);
            C38246av5 m65253a = C38246av5.m65253a(this.f65590l);
            this.f65593o = m65253a;
            Y94<InterfaceC36712Vu5> m80429b = V51.m80429b(m65253a);
            this.f65594p = m80429b;
            C36478Uu5 m80638a = C36478Uu5.m80638a(this.f65581c, this.f65582d, this.f65583e, this.f65584f, this.f65585g, this.f65588j, this.f65589k, this.f65592n, m80429b);
            this.f65595q = m80638a;
            this.f65596r = V51.m80429b(m80638a);
        }

        /* renamed from: c */
        public final ServiceProgressUpdateActivity m56682c(ServiceProgressUpdateActivity serviceProgressUpdateActivity) {
            C5135Ly.m96068n(serviceProgressUpdateActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65579a.mo27461w2()));
            C5135Ly.m96066p(serviceProgressUpdateActivity, (C36207Tq4) C51679xZ3.m5003d(this.f65579a.mo27595B1()));
            C5135Ly.m96071k(serviceProgressUpdateActivity, (Handler) C51679xZ3.m5003d(this.f65579a.mo27535X2()));
            C5135Ly.m96067o(serviceProgressUpdateActivity, (C22454gl) C51679xZ3.m5003d(this.f65579a.mo27479r()));
            C5135Ly.m96080b(serviceProgressUpdateActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f65579a.mo27519d0()));
            C5135Ly.m96075g(serviceProgressUpdateActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f65579a.mo27453z2()));
            C5135Ly.m96064r(serviceProgressUpdateActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65579a.mo27459x1()));
            C5135Ly.m96081a(serviceProgressUpdateActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f65579a.mo27474s()));
            C5135Ly.m96073i(serviceProgressUpdateActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f65579a.mo27558P0()));
            C5135Ly.m96074h(serviceProgressUpdateActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f65579a.mo27598A0()));
            C5135Ly.m96077e(serviceProgressUpdateActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f65579a.mo27507i0()));
            C5135Ly.m96070l(serviceProgressUpdateActivity, (FO2) C51679xZ3.m5003d(this.f65579a.mo27456y2()));
            C5135Ly.m96065q(serviceProgressUpdateActivity, (YR4) C51679xZ3.m5003d(this.f65579a.mo27525b0()));
            C5135Ly.m96079c(serviceProgressUpdateActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f65579a.mo27460x()));
            C5135Ly.m96078d(serviceProgressUpdateActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f65579a.mo27517d3()));
            C5135Ly.m96072j(serviceProgressUpdateActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f65579a.mo27482q()));
            C5135Ly.m96076f(serviceProgressUpdateActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f65579a.mo27483p3()));
            C48926su5.m13415b(serviceProgressUpdateActivity, this.f65596r.get());
            return serviceProgressUpdateActivity;
        }

        public C15736b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C12291b6 c12291b6) {
            this.f65580b = this;
            this.f65579a = interfaceC44393lG2;
            m56683b(interfaceC44393lG2, baseActivity, scopeProvider, c12291b6);
        }
    }

    private C15734a() {
    }

    /* renamed from: a */
    public static ServiceProgressUpdateActivity.InterfaceC15731a.InterfaceC15732a m56686a() {
        return new C15735a();
    }
}
