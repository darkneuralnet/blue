package co.bird.android.app.feature.freeride;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import co.bird.android.app.feature.freeride.InterfaceC13751b;
import co.bird.android.core.mvp.BaseActivity;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: co.bird.android.app.feature.freeride.a */
/* loaded from: classes2.dex */
public final class C13744a {

    /* renamed from: co.bird.android.app.feature.freeride.a$a */
    /* loaded from: classes2.dex */
    public static final class C13745a implements InterfaceC13751b.InterfaceC13752a {
        @Override // co.bird.android.app.feature.freeride.InterfaceC13751b.InterfaceC13752a
        /* renamed from: a */
        public InterfaceC13751b mo60640a(InterfaceC44393lG2 interfaceC44393lG2, C42450hz1 c42450hz1, BaseActivity baseActivity, ScopeProvider scopeProvider, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, View view) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(c42450hz1);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(lifecycleScopeProvider);
            C51679xZ3.m5005b(view);
            return new C13746b(c42450hz1, interfaceC44393lG2, baseActivity, scopeProvider, lifecycleScopeProvider, view);
        }

        private C13745a() {
        }
    }

    /* renamed from: co.bird.android.app.feature.freeride.a$b */
    /* loaded from: classes2.dex */
    public static final class C13746b implements InterfaceC13751b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f61452a;

        /* renamed from: b */
        public final C13746b f61453b;

        /* renamed from: c */
        public Y94<ScopeProvider> f61454c;

        /* renamed from: d */
        public Y94<LifecycleScopeProvider<EnumC7097RE>> f61455d;

        /* renamed from: e */
        public Y94<Context> f61456e;

        /* renamed from: f */
        public Y94<C36207Tq4> f61457f;

        /* renamed from: g */
        public Y94<V74> f61458g;

        /* renamed from: h */
        public Y94<InterfaceC1880Ea> f61459h;

        /* renamed from: i */
        public Y94<BaseActivity> f61460i;

        /* renamed from: j */
        public Y94<View> f61461j;

        /* renamed from: k */
        public Y94<InterfaceC43636jz1> f61462k;

        /* renamed from: co.bird.android.app.feature.freeride.a$b$a */
        /* loaded from: classes2.dex */
        public static final class C13747a implements Y94<InterfaceC1880Ea> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61463a;

            public C13747a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61463a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC1880Ea get() {
                return (InterfaceC1880Ea) C51679xZ3.m5003d(this.f61463a.mo27519d0());
            }
        }

        /* renamed from: co.bird.android.app.feature.freeride.a$b$b */
        /* loaded from: classes2.dex */
        public static final class C13748b implements Y94<Context> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61464a;

            public C13748b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61464a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public Context get() {
                return (Context) C51679xZ3.m5003d(this.f61464a.mo27552R1());
            }
        }

        /* renamed from: co.bird.android.app.feature.freeride.a$b$c */
        /* loaded from: classes2.dex */
        public static final class C13749c implements Y94<V74> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61465a;

            public C13749c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61465a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public V74 get() {
                return (V74) C51679xZ3.m5003d(this.f61465a.mo27548U());
            }
        }

        /* renamed from: co.bird.android.app.feature.freeride.a$b$d */
        /* loaded from: classes2.dex */
        public static final class C13750d implements Y94<C36207Tq4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61466a;

            public C13750d(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61466a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C36207Tq4 get() {
                return (C36207Tq4) C51679xZ3.m5003d(this.f61466a.mo27595B1());
            }
        }

        @Override // co.bird.android.app.feature.freeride.InterfaceC13751b
        /* renamed from: a */
        public void mo60641a(FreeRideActivity freeRideActivity) {
            m60646c(freeRideActivity);
        }

        /* renamed from: b */
        public final void m60647b(C42450hz1 c42450hz1, InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, View view) {
            this.f61454c = C39546d52.m44621a(scopeProvider);
            this.f61455d = C39546d52.m44621a(lifecycleScopeProvider);
            this.f61456e = new C13748b(interfaceC44393lG2);
            this.f61457f = new C13750d(interfaceC44393lG2);
            this.f61458g = new C13749c(interfaceC44393lG2);
            this.f61459h = new C13747a(interfaceC44393lG2);
            this.f61460i = C39546d52.m44621a(baseActivity);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(view);
            this.f61461j = m44621a;
            this.f61462k = V51.m80429b(C43043iz1.m31326a(c42450hz1, this.f61454c, this.f61455d, this.f61456e, this.f61457f, this.f61458g, this.f61459h, this.f61460i, m44621a));
        }

        /* renamed from: c */
        public final FreeRideActivity m60646c(FreeRideActivity freeRideActivity) {
            C5135Ly.m96068n(freeRideActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f61452a.mo27461w2()));
            C5135Ly.m96066p(freeRideActivity, (C36207Tq4) C51679xZ3.m5003d(this.f61452a.mo27595B1()));
            C5135Ly.m96071k(freeRideActivity, (Handler) C51679xZ3.m5003d(this.f61452a.mo27535X2()));
            C5135Ly.m96067o(freeRideActivity, (C22454gl) C51679xZ3.m5003d(this.f61452a.mo27479r()));
            C5135Ly.m96080b(freeRideActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f61452a.mo27519d0()));
            C5135Ly.m96075g(freeRideActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f61452a.mo27453z2()));
            C5135Ly.m96064r(freeRideActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f61452a.mo27459x1()));
            C5135Ly.m96081a(freeRideActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f61452a.mo27474s()));
            C5135Ly.m96073i(freeRideActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f61452a.mo27558P0()));
            C5135Ly.m96074h(freeRideActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f61452a.mo27598A0()));
            C5135Ly.m96077e(freeRideActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f61452a.mo27507i0()));
            C5135Ly.m96070l(freeRideActivity, (FO2) C51679xZ3.m5003d(this.f61452a.mo27456y2()));
            C5135Ly.m96065q(freeRideActivity, (YR4) C51679xZ3.m5003d(this.f61452a.mo27525b0()));
            C5135Ly.m96079c(freeRideActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f61452a.mo27460x()));
            C5135Ly.m96078d(freeRideActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f61452a.mo27517d3()));
            C5135Ly.m96072j(freeRideActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f61452a.mo27482q()));
            C5135Ly.m96076f(freeRideActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f61452a.mo27483p3()));
            C38282az1.m65177b(freeRideActivity, this.f61462k.get());
            return freeRideActivity;
        }

        public C13746b(C42450hz1 c42450hz1, InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, View view) {
            this.f61453b = this;
            this.f61452a = interfaceC44393lG2;
            m60647b(c42450hz1, interfaceC44393lG2, baseActivity, scopeProvider, lifecycleScopeProvider, view);
        }
    }

    private C13744a() {
    }

    /* renamed from: a */
    public static InterfaceC13751b.InterfaceC13752a m60648a() {
        return new C13745a();
    }
}
