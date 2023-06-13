package co.bird.android.feature.merchant.activity;

import android.os.Handler;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.merchant.activity.MerchantLocationActivity;
import com.guness.widget.NavigationView;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: co.bird.android.feature.merchant.activity.c */
/* loaded from: classes3.dex */
public final class C14976c {

    /* renamed from: co.bird.android.feature.merchant.activity.c$a */
    /* loaded from: classes3.dex */
    public static final class C14977a implements MerchantLocationActivity.InterfaceC14958b.InterfaceC14959a {
        @Override // co.bird.android.feature.merchant.activity.MerchantLocationActivity.InterfaceC14958b.InterfaceC14959a
        /* renamed from: a */
        public MerchantLocationActivity.InterfaceC14958b mo57945a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, C25902m4 c25902m4, DrawerLayout drawerLayout, Toolbar toolbar, NavigationView navigationView) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(lifecycleScopeProvider);
            C51679xZ3.m5005b(c25902m4);
            C51679xZ3.m5005b(drawerLayout);
            C51679xZ3.m5005b(toolbar);
            C51679xZ3.m5005b(navigationView);
            return new C14978b(interfaceC44393lG2, baseActivity, scopeProvider, lifecycleScopeProvider, c25902m4, drawerLayout, toolbar, navigationView);
        }

        private C14977a() {
        }
    }

    /* renamed from: co.bird.android.feature.merchant.activity.c$b */
    /* loaded from: classes3.dex */
    public static final class C14978b implements MerchantLocationActivity.InterfaceC14958b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f64199a;

        /* renamed from: b */
        public final C14978b f64200b;

        /* renamed from: c */
        public Y94<C22454gl> f64201c;

        /* renamed from: d */
        public Y94<C36207Tq4> f64202d;

        /* renamed from: e */
        public Y94<InterfaceC1880Ea> f64203e;

        /* renamed from: f */
        public Y94<InterfaceC6097Oh> f64204f;

        /* renamed from: g */
        public Y94<Z85> f64205g;

        /* renamed from: h */
        public Y94<InterfaceC37961aS2> f64206h;

        /* renamed from: i */
        public Y94<BaseActivity> f64207i;

        /* renamed from: j */
        public Y94<DrawerLayout> f64208j;

        /* renamed from: k */
        public Y94<Toolbar> f64209k;

        /* renamed from: l */
        public Y94<NavigationView> f64210l;

        /* renamed from: m */
        public Y94<JS2> f64211m;

        /* renamed from: n */
        public Y94<InterfaceC40099e13> f64212n;

        /* renamed from: o */
        public Y94<LifecycleScopeProvider<EnumC7097RE>> f64213o;

        /* renamed from: p */
        public Y94<InterfaceC35660Rh6> f64214p;

        /* renamed from: q */
        public Y94<ES2> f64215q;

        /* renamed from: r */
        public Y94<ScopeProvider> f64216r;

        /* renamed from: s */
        public Y94<C25902m4> f64217s;

        /* renamed from: t */
        public Y94<YR2> f64218t;

        /* renamed from: u */
        public Y94<TR2> f64219u;

        /* renamed from: co.bird.android.feature.merchant.activity.c$b$a */
        /* loaded from: classes3.dex */
        public static final class C14979a implements Y94<InterfaceC1880Ea> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64220a;

            public C14979a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64220a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC1880Ea get() {
                return (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64220a.mo27519d0());
            }
        }

        /* renamed from: co.bird.android.feature.merchant.activity.c$b$b */
        /* loaded from: classes3.dex */
        public static final class C14980b implements Y94<InterfaceC6097Oh> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64221a;

            public C14980b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64221a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC6097Oh get() {
                return (InterfaceC6097Oh) C51679xZ3.m5003d(this.f64221a.mo27470t0());
            }
        }

        /* renamed from: co.bird.android.feature.merchant.activity.c$b$c */
        /* loaded from: classes3.dex */
        public static final class C14981c implements Y94<C22454gl> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64222a;

            public C14981c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64222a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C22454gl get() {
                return (C22454gl) C51679xZ3.m5003d(this.f64222a.mo27479r());
            }
        }

        /* renamed from: co.bird.android.feature.merchant.activity.c$b$d */
        /* loaded from: classes3.dex */
        public static final class C14982d implements Y94<InterfaceC37961aS2> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64223a;

            public C14982d(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64223a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC37961aS2 get() {
                return (InterfaceC37961aS2) C51679xZ3.m5003d(this.f64223a.mo27550S1());
            }
        }

        /* renamed from: co.bird.android.feature.merchant.activity.c$b$e */
        /* loaded from: classes3.dex */
        public static final class C14983e implements Y94<InterfaceC35660Rh6> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64224a;

            public C14983e(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64224a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC35660Rh6 get() {
                return (InterfaceC35660Rh6) C51679xZ3.m5003d(this.f64224a.mo27500k1());
            }
        }

        /* renamed from: co.bird.android.feature.merchant.activity.c$b$f */
        /* loaded from: classes3.dex */
        public static final class C14984f implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64225a;

            public C14984f(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64225a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f64225a.mo27461w2());
            }
        }

        /* renamed from: co.bird.android.feature.merchant.activity.c$b$g */
        /* loaded from: classes3.dex */
        public static final class C14985g implements Y94<C36207Tq4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64226a;

            public C14985g(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64226a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C36207Tq4 get() {
                return (C36207Tq4) C51679xZ3.m5003d(this.f64226a.mo27595B1());
            }
        }

        /* renamed from: co.bird.android.feature.merchant.activity.c$b$h */
        /* loaded from: classes3.dex */
        public static final class C14986h implements Y94<Z85> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64227a;

            public C14986h(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64227a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public Z85 get() {
                return (Z85) C51679xZ3.m5003d(this.f64227a.mo27497l0());
            }
        }

        @Override // co.bird.android.feature.merchant.activity.MerchantLocationActivity.InterfaceC14958b
        /* renamed from: a */
        public void mo57944a(MerchantLocationActivity merchantLocationActivity) {
            m57942c(merchantLocationActivity);
        }

        /* renamed from: b */
        public final void m57943b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, C25902m4 c25902m4, DrawerLayout drawerLayout, Toolbar toolbar, NavigationView navigationView) {
            this.f64201c = new C14981c(interfaceC44393lG2);
            this.f64202d = new C14985g(interfaceC44393lG2);
            this.f64203e = new C14979a(interfaceC44393lG2);
            this.f64204f = new C14980b(interfaceC44393lG2);
            this.f64205g = new C14986h(interfaceC44393lG2);
            this.f64206h = new C14982d(interfaceC44393lG2);
            this.f64207i = C39546d52.m44621a(baseActivity);
            this.f64208j = C39546d52.m44621a(drawerLayout);
            this.f64209k = C39546d52.m44621a(toolbar);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(navigationView);
            this.f64210l = m44621a;
            this.f64211m = V51.m80429b(KS2.m98867a(this.f64207i, this.f64208j, this.f64209k, m44621a, this.f64201c, this.f64202d));
            this.f64212n = new C14984f(interfaceC44393lG2);
            this.f64213o = C39546d52.m44621a(lifecycleScopeProvider);
            C14983e c14983e = new C14983e(interfaceC44393lG2);
            this.f64214p = c14983e;
            this.f64215q = V51.m80429b(FS2.m107136a(this.f64201c, this.f64202d, this.f64203e, this.f64204f, this.f64205g, this.f64206h, this.f64211m, this.f64212n, this.f64213o, c14983e));
            this.f64216r = C39546d52.m44621a(scopeProvider);
            InterfaceC48812sj1 m44621a2 = C39546d52.m44621a(c25902m4);
            this.f64217s = m44621a2;
            Y94<YR2> m80429b = V51.m80429b(ZR2.m73109a(this.f64207i, m44621a2));
            this.f64218t = m80429b;
            this.f64219u = V51.m80429b(WR2.m78463a(this.f64216r, m80429b, this.f64206h, this.f64212n));
        }

        /* renamed from: c */
        public final MerchantLocationActivity m57942c(MerchantLocationActivity merchantLocationActivity) {
            C5135Ly.m96068n(merchantLocationActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64199a.mo27461w2()));
            C5135Ly.m96066p(merchantLocationActivity, (C36207Tq4) C51679xZ3.m5003d(this.f64199a.mo27595B1()));
            C5135Ly.m96071k(merchantLocationActivity, (Handler) C51679xZ3.m5003d(this.f64199a.mo27535X2()));
            C5135Ly.m96067o(merchantLocationActivity, (C22454gl) C51679xZ3.m5003d(this.f64199a.mo27479r()));
            C5135Ly.m96080b(merchantLocationActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64199a.mo27519d0()));
            C5135Ly.m96075g(merchantLocationActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f64199a.mo27453z2()));
            C5135Ly.m96064r(merchantLocationActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f64199a.mo27459x1()));
            C5135Ly.m96081a(merchantLocationActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f64199a.mo27474s()));
            C5135Ly.m96073i(merchantLocationActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f64199a.mo27558P0()));
            C5135Ly.m96074h(merchantLocationActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f64199a.mo27598A0()));
            C5135Ly.m96077e(merchantLocationActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f64199a.mo27507i0()));
            C5135Ly.m96070l(merchantLocationActivity, (FO2) C51679xZ3.m5003d(this.f64199a.mo27456y2()));
            C5135Ly.m96065q(merchantLocationActivity, (YR4) C51679xZ3.m5003d(this.f64199a.mo27525b0()));
            C5135Ly.m96079c(merchantLocationActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f64199a.mo27460x()));
            C5135Ly.m96078d(merchantLocationActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f64199a.mo27517d3()));
            C5135Ly.m96072j(merchantLocationActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f64199a.mo27482q()));
            C5135Ly.m96076f(merchantLocationActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f64199a.mo27483p3()));
            QQ2.m88507c(merchantLocationActivity, this.f64215q.get());
            QQ2.m88509a(merchantLocationActivity, this.f64219u.get());
            return merchantLocationActivity;
        }

        public C14978b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, C25902m4 c25902m4, DrawerLayout drawerLayout, Toolbar toolbar, NavigationView navigationView) {
            this.f64200b = this;
            this.f64199a = interfaceC44393lG2;
            m57943b(interfaceC44393lG2, baseActivity, scopeProvider, lifecycleScopeProvider, c25902m4, drawerLayout, toolbar, navigationView);
        }
    }

    private C14976c() {
    }

    /* renamed from: a */
    public static MerchantLocationActivity.InterfaceC14958b.InterfaceC14959a m57946a() {
        return new C14977a();
    }
}
