package co.bird.android.vehiclescanner.servicecenter.code;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.vehiclescanner.servicecenter.code.EnterCodeActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.vehiclescanner.servicecenter.code.a */
/* loaded from: classes4.dex */
public final class C16434a {

    /* renamed from: co.bird.android.vehiclescanner.servicecenter.code.a$a */
    /* loaded from: classes4.dex */
    public static final class C16435a implements EnterCodeActivity.InterfaceC16431b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f67085a;

        /* renamed from: b */
        public final C16435a f67086b;

        /* renamed from: c */
        public Y94<InterfaceC46473om3> f67087c;

        /* renamed from: d */
        public Y94<InterfaceC7381SM> f67088d;

        /* renamed from: e */
        public Y94<NQ5> f67089e;

        /* renamed from: f */
        public Y94<ScopeProvider> f67090f;

        /* renamed from: g */
        public Y94<BaseActivity> f67091g;

        /* renamed from: h */
        public Y94<C30410y3> f67092h;

        /* renamed from: i */
        public Y94<C36564Ve1> f67093i;

        /* renamed from: j */
        public Y94<InterfaceC40099e13> f67094j;

        /* renamed from: k */
        public Y94<C34692Ne1> f67095k;

        /* renamed from: co.bird.android.vehiclescanner.servicecenter.code.a$a$a */
        /* loaded from: classes4.dex */
        public static final class C16436a implements Y94<InterfaceC7381SM> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f67096a;

            public C16436a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f67096a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC7381SM get() {
                return (InterfaceC7381SM) C51679xZ3.m5003d(this.f67096a.mo27592C0());
            }
        }

        /* renamed from: co.bird.android.vehiclescanner.servicecenter.code.a$a$b */
        /* loaded from: classes4.dex */
        public static final class C16437b implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f67097a;

            public C16437b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f67097a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f67097a.mo27461w2());
            }
        }

        /* renamed from: co.bird.android.vehiclescanner.servicecenter.code.a$a$c */
        /* loaded from: classes4.dex */
        public static final class C16438c implements Y94<InterfaceC46473om3> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f67098a;

            public C16438c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f67098a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC46473om3 get() {
                return (InterfaceC46473om3) C51679xZ3.m5003d(this.f67098a.mo27584F0());
            }
        }

        /* renamed from: co.bird.android.vehiclescanner.servicecenter.code.a$a$d */
        /* loaded from: classes4.dex */
        public static final class C16439d implements Y94<NQ5> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f67099a;

            public C16439d(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f67099a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public NQ5 get() {
                return (NQ5) C51679xZ3.m5003d(this.f67099a.mo27533Y0());
            }
        }

        @Override // co.bird.android.vehiclescanner.servicecenter.code.EnterCodeActivity.InterfaceC16431b
        /* renamed from: a */
        public void mo54808a(EnterCodeActivity enterCodeActivity) {
            m54806c(enterCodeActivity);
        }

        /* renamed from: b */
        public final void m54807b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C30410y3 c30410y3) {
            this.f67087c = new C16438c(interfaceC44393lG2);
            this.f67088d = new C16436a(interfaceC44393lG2);
            this.f67089e = new C16439d(interfaceC44393lG2);
            this.f67090f = C39546d52.m44621a(scopeProvider);
            this.f67091g = C39546d52.m44621a(baseActivity);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(c30410y3);
            this.f67092h = m44621a;
            this.f67093i = V51.m80429b(C36798We1.m78059a(this.f67091g, m44621a));
            C16437b c16437b = new C16437b(interfaceC44393lG2);
            this.f67094j = c16437b;
            this.f67095k = V51.m80429b(C35628Re1.m86508a(this.f67087c, this.f67088d, this.f67089e, this.f67090f, this.f67093i, c16437b));
        }

        /* renamed from: c */
        public final EnterCodeActivity m54806c(EnterCodeActivity enterCodeActivity) {
            C5135Ly.m96068n(enterCodeActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f67085a.mo27461w2()));
            C5135Ly.m96066p(enterCodeActivity, (C36207Tq4) C51679xZ3.m5003d(this.f67085a.mo27595B1()));
            C5135Ly.m96071k(enterCodeActivity, (Handler) C51679xZ3.m5003d(this.f67085a.mo27535X2()));
            C5135Ly.m96067o(enterCodeActivity, (C22454gl) C51679xZ3.m5003d(this.f67085a.mo27479r()));
            C5135Ly.m96080b(enterCodeActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f67085a.mo27519d0()));
            C5135Ly.m96075g(enterCodeActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f67085a.mo27453z2()));
            C5135Ly.m96064r(enterCodeActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f67085a.mo27459x1()));
            C5135Ly.m96081a(enterCodeActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f67085a.mo27474s()));
            C5135Ly.m96073i(enterCodeActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f67085a.mo27558P0()));
            C5135Ly.m96074h(enterCodeActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f67085a.mo27598A0()));
            C5135Ly.m96077e(enterCodeActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f67085a.mo27507i0()));
            C5135Ly.m96070l(enterCodeActivity, (FO2) C51679xZ3.m5003d(this.f67085a.mo27456y2()));
            C5135Ly.m96065q(enterCodeActivity, (YR4) C51679xZ3.m5003d(this.f67085a.mo27525b0()));
            C5135Ly.m96079c(enterCodeActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f67085a.mo27460x()));
            C5135Ly.m96078d(enterCodeActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f67085a.mo27517d3()));
            C5135Ly.m96072j(enterCodeActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f67085a.mo27482q()));
            C5135Ly.m96076f(enterCodeActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f67085a.mo27483p3()));
            C48170re1.m15654b(enterCodeActivity, this.f67095k.get());
            return enterCodeActivity;
        }

        public C16435a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C30410y3 c30410y3) {
            this.f67086b = this;
            this.f67085a = interfaceC44393lG2;
            m54807b(interfaceC44393lG2, baseActivity, scopeProvider, c30410y3);
        }
    }

    /* renamed from: co.bird.android.vehiclescanner.servicecenter.code.a$b */
    /* loaded from: classes4.dex */
    public static final class C16440b implements EnterCodeActivity.InterfaceC16431b.InterfaceC16432a {
        @Override // co.bird.android.vehiclescanner.servicecenter.code.EnterCodeActivity.InterfaceC16431b.InterfaceC16432a
        /* renamed from: a */
        public EnterCodeActivity.InterfaceC16431b mo54801a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C30410y3 c30410y3) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c30410y3);
            return new C16435a(interfaceC44393lG2, baseActivity, scopeProvider, c30410y3);
        }

        private C16440b() {
        }
    }

    private C16434a() {
    }

    /* renamed from: a */
    public static EnterCodeActivity.InterfaceC16431b.InterfaceC16432a m54809a() {
        return new C16440b();
    }
}
