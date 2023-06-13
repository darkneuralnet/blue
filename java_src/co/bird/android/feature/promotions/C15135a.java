package co.bird.android.feature.promotions;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.promotions.PromotionsCenterActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.promotions.a */
/* loaded from: classes3.dex */
public final class C15135a {

    /* renamed from: co.bird.android.feature.promotions.a$a */
    /* loaded from: classes3.dex */
    public static final class C15136a implements PromotionsCenterActivity.InterfaceC15133a.InterfaceC15134a {
        @Override // co.bird.android.feature.promotions.PromotionsCenterActivity.InterfaceC15133a.InterfaceC15134a
        /* renamed from: a */
        public PromotionsCenterActivity.InterfaceC15133a mo57673a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C7645T4 c7645t4) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c7645t4);
            return new C15137b(interfaceC44393lG2, baseActivity, scopeProvider, c7645t4);
        }

        private C15136a() {
        }
    }

    /* renamed from: co.bird.android.feature.promotions.a$b */
    /* loaded from: classes3.dex */
    public static final class C15137b implements PromotionsCenterActivity.InterfaceC15133a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f64510a;

        /* renamed from: b */
        public final C15137b f64511b;

        /* renamed from: c */
        public Y94<V74> f64512c;

        /* renamed from: d */
        public Y94<BaseActivity> f64513d;

        /* renamed from: e */
        public Y94<C7645T4> f64514e;

        /* renamed from: f */
        public Y94<C36207Tq4> f64515f;

        /* renamed from: g */
        public Y94<InterfaceC1880Ea> f64516g;

        /* renamed from: h */
        public C52028y84 f64517h;

        /* renamed from: i */
        public Y94<InterfaceC50842w84> f64518i;

        /* renamed from: j */
        public Y94<C46693p84> f64519j;

        /* renamed from: k */
        public Y94<P84> f64520k;

        /* renamed from: l */
        public Y94<ScopeProvider> f64521l;

        /* renamed from: m */
        public Y94<I84> f64522m;

        /* renamed from: co.bird.android.feature.promotions.a$b$a */
        /* loaded from: classes3.dex */
        public static final class C15138a implements Y94<InterfaceC1880Ea> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64523a;

            public C15138a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64523a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC1880Ea get() {
                return (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64523a.mo27519d0());
            }
        }

        /* renamed from: co.bird.android.feature.promotions.a$b$b */
        /* loaded from: classes3.dex */
        public static final class C15139b implements Y94<V74> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64524a;

            public C15139b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64524a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public V74 get() {
                return (V74) C51679xZ3.m5003d(this.f64524a.mo27548U());
            }
        }

        /* renamed from: co.bird.android.feature.promotions.a$b$c */
        /* loaded from: classes3.dex */
        public static final class C15140c implements Y94<C36207Tq4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64525a;

            public C15140c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64525a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C36207Tq4 get() {
                return (C36207Tq4) C51679xZ3.m5003d(this.f64525a.mo27595B1());
            }
        }

        @Override // co.bird.android.feature.promotions.PromotionsCenterActivity.InterfaceC15133a
        /* renamed from: a */
        public void mo57672a(PromotionsCenterActivity promotionsCenterActivity) {
            m57670c(promotionsCenterActivity);
        }

        /* renamed from: b */
        public final void m57671b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C7645T4 c7645t4) {
            this.f64512c = new C15139b(interfaceC44393lG2);
            this.f64513d = C39546d52.m44621a(baseActivity);
            this.f64514e = C39546d52.m44621a(c7645t4);
            this.f64515f = new C15140c(interfaceC44393lG2);
            C15138a c15138a = new C15138a(interfaceC44393lG2);
            this.f64516g = c15138a;
            C52028y84 m4078a = C52028y84.m4078a(this.f64513d, this.f64515f, this.f64512c, c15138a);
            this.f64517h = m4078a;
            Y94<InterfaceC50842w84> m5816b = C51435x84.m5816b(m4078a);
            this.f64518i = m5816b;
            Y94<C46693p84> m80429b = V51.m80429b(C47879r84.m16442a(m5816b));
            this.f64519j = m80429b;
            this.f64520k = V51.m80429b(R84.m87240a(this.f64513d, this.f64514e, m80429b));
            this.f64521l = C39546d52.m44621a(scopeProvider);
            this.f64522m = V51.m80429b(O84.m92847a(this.f64512c, C49064t84.m13012a(), this.f64520k, this.f64521l, this.f64515f));
        }

        /* renamed from: c */
        public final PromotionsCenterActivity m57670c(PromotionsCenterActivity promotionsCenterActivity) {
            C5135Ly.m96068n(promotionsCenterActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64510a.mo27461w2()));
            C5135Ly.m96066p(promotionsCenterActivity, (C36207Tq4) C51679xZ3.m5003d(this.f64510a.mo27595B1()));
            C5135Ly.m96071k(promotionsCenterActivity, (Handler) C51679xZ3.m5003d(this.f64510a.mo27535X2()));
            C5135Ly.m96067o(promotionsCenterActivity, (C22454gl) C51679xZ3.m5003d(this.f64510a.mo27479r()));
            C5135Ly.m96080b(promotionsCenterActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64510a.mo27519d0()));
            C5135Ly.m96075g(promotionsCenterActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f64510a.mo27453z2()));
            C5135Ly.m96064r(promotionsCenterActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f64510a.mo27459x1()));
            C5135Ly.m96081a(promotionsCenterActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f64510a.mo27474s()));
            C5135Ly.m96073i(promotionsCenterActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f64510a.mo27558P0()));
            C5135Ly.m96074h(promotionsCenterActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f64510a.mo27598A0()));
            C5135Ly.m96077e(promotionsCenterActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f64510a.mo27507i0()));
            C5135Ly.m96070l(promotionsCenterActivity, (FO2) C51679xZ3.m5003d(this.f64510a.mo27456y2()));
            C5135Ly.m96065q(promotionsCenterActivity, (YR4) C51679xZ3.m5003d(this.f64510a.mo27525b0()));
            C5135Ly.m96079c(promotionsCenterActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f64510a.mo27460x()));
            C5135Ly.m96078d(promotionsCenterActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f64510a.mo27517d3()));
            C5135Ly.m96072j(promotionsCenterActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f64510a.mo27482q()));
            C5135Ly.m96076f(promotionsCenterActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f64510a.mo27483p3()));
            C45507n84.m24282b(promotionsCenterActivity, this.f64522m.get());
            return promotionsCenterActivity;
        }

        public C15137b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C7645T4 c7645t4) {
            this.f64511b = this;
            this.f64510a = interfaceC44393lG2;
            m57671b(interfaceC44393lG2, baseActivity, scopeProvider, c7645t4);
        }
    }

    private C15135a() {
    }

    /* renamed from: a */
    public static PromotionsCenterActivity.InterfaceC15133a.InterfaceC15134a m57674a() {
        return new C15136a();
    }
}
