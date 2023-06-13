package co.bird.android.feature.merchant.activity;

import android.os.Handler;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.merchant.activity.MerchantHistoryActivity;
import com.guness.widget.NavigationView;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: co.bird.android.feature.merchant.activity.a */
/* loaded from: classes3.dex */
public final class C14961a {

    /* renamed from: co.bird.android.feature.merchant.activity.a$a */
    /* loaded from: classes3.dex */
    public static final class C14962a implements MerchantHistoryActivity.InterfaceC14950b.InterfaceC14951a {
        @Override // co.bird.android.feature.merchant.activity.MerchantHistoryActivity.InterfaceC14950b.InterfaceC14951a
        /* renamed from: a */
        public MerchantHistoryActivity.InterfaceC14950b mo57968a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, ScopeProvider scopeProvider, C25594l4 c25594l4, DrawerLayout drawerLayout, Toolbar toolbar, NavigationView navigationView) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(lifecycleScopeProvider);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c25594l4);
            C51679xZ3.m5005b(drawerLayout);
            C51679xZ3.m5005b(toolbar);
            C51679xZ3.m5005b(navigationView);
            return new C14963b(interfaceC44393lG2, baseActivity, lifecycleScopeProvider, scopeProvider, c25594l4, drawerLayout, toolbar, navigationView);
        }

        private C14962a() {
        }
    }

    /* renamed from: co.bird.android.feature.merchant.activity.a$b */
    /* loaded from: classes3.dex */
    public static final class C14963b implements MerchantHistoryActivity.InterfaceC14950b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f64162a;

        /* renamed from: b */
        public final C14963b f64163b;

        /* renamed from: c */
        public Y94<C22454gl> f64164c;

        /* renamed from: d */
        public Y94<C36207Tq4> f64165d;

        /* renamed from: e */
        public Y94<InterfaceC1880Ea> f64166e;

        /* renamed from: f */
        public Y94<InterfaceC6097Oh> f64167f;

        /* renamed from: g */
        public Y94<Z85> f64168g;

        /* renamed from: h */
        public Y94<InterfaceC37961aS2> f64169h;

        /* renamed from: i */
        public Y94<BaseActivity> f64170i;

        /* renamed from: j */
        public Y94<DrawerLayout> f64171j;

        /* renamed from: k */
        public Y94<Toolbar> f64172k;

        /* renamed from: l */
        public Y94<NavigationView> f64173l;

        /* renamed from: m */
        public Y94<JS2> f64174m;

        /* renamed from: n */
        public Y94<InterfaceC40099e13> f64175n;

        /* renamed from: o */
        public Y94<LifecycleScopeProvider<EnumC7097RE>> f64176o;

        /* renamed from: p */
        public Y94<InterfaceC35660Rh6> f64177p;

        /* renamed from: q */
        public Y94<ES2> f64178q;

        /* renamed from: r */
        public Y94<ScopeProvider> f64179r;

        /* renamed from: s */
        public Y94<C25594l4> f64180s;

        /* renamed from: t */
        public Y94<C50241v76> f64181t;

        /* renamed from: u */
        public Y94<InterfaceC44637lg6> f64182u;

        /* renamed from: v */
        public Y94<C45499n76> f64183v;

        /* renamed from: co.bird.android.feature.merchant.activity.a$b$a */
        /* loaded from: classes3.dex */
        public static final class C14964a implements Y94<InterfaceC1880Ea> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64184a;

            public C14964a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64184a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC1880Ea get() {
                return (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64184a.mo27519d0());
            }
        }

        /* renamed from: co.bird.android.feature.merchant.activity.a$b$b */
        /* loaded from: classes3.dex */
        public static final class C14965b implements Y94<InterfaceC6097Oh> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64185a;

            public C14965b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64185a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC6097Oh get() {
                return (InterfaceC6097Oh) C51679xZ3.m5003d(this.f64185a.mo27470t0());
            }
        }

        /* renamed from: co.bird.android.feature.merchant.activity.a$b$c */
        /* loaded from: classes3.dex */
        public static final class C14966c implements Y94<C22454gl> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64186a;

            public C14966c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64186a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C22454gl get() {
                return (C22454gl) C51679xZ3.m5003d(this.f64186a.mo27479r());
            }
        }

        /* renamed from: co.bird.android.feature.merchant.activity.a$b$d */
        /* loaded from: classes3.dex */
        public static final class C14967d implements Y94<InterfaceC37961aS2> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64187a;

            public C14967d(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64187a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC37961aS2 get() {
                return (InterfaceC37961aS2) C51679xZ3.m5003d(this.f64187a.mo27550S1());
            }
        }

        /* renamed from: co.bird.android.feature.merchant.activity.a$b$e */
        /* loaded from: classes3.dex */
        public static final class C14968e implements Y94<InterfaceC35660Rh6> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64188a;

            public C14968e(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64188a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC35660Rh6 get() {
                return (InterfaceC35660Rh6) C51679xZ3.m5003d(this.f64188a.mo27500k1());
            }
        }

        /* renamed from: co.bird.android.feature.merchant.activity.a$b$f */
        /* loaded from: classes3.dex */
        public static final class C14969f implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64189a;

            public C14969f(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64189a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f64189a.mo27461w2());
            }
        }

        /* renamed from: co.bird.android.feature.merchant.activity.a$b$g */
        /* loaded from: classes3.dex */
        public static final class C14970g implements Y94<C36207Tq4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64190a;

            public C14970g(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64190a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C36207Tq4 get() {
                return (C36207Tq4) C51679xZ3.m5003d(this.f64190a.mo27595B1());
            }
        }

        /* renamed from: co.bird.android.feature.merchant.activity.a$b$h */
        /* loaded from: classes3.dex */
        public static final class C14971h implements Y94<Z85> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64191a;

            public C14971h(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64191a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public Z85 get() {
                return (Z85) C51679xZ3.m5003d(this.f64191a.mo27497l0());
            }
        }

        /* renamed from: co.bird.android.feature.merchant.activity.a$b$i */
        /* loaded from: classes3.dex */
        public static final class C14972i implements Y94<InterfaceC44637lg6> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64192a;

            public C14972i(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64192a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC44637lg6 get() {
                return (InterfaceC44637lg6) C51679xZ3.m5003d(this.f64192a.mo27474s());
            }
        }

        @Override // co.bird.android.feature.merchant.activity.MerchantHistoryActivity.InterfaceC14950b
        /* renamed from: a */
        public void mo57967a(MerchantHistoryActivity merchantHistoryActivity) {
            m57965c(merchantHistoryActivity);
        }

        /* renamed from: b */
        public final void m57966b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, ScopeProvider scopeProvider, C25594l4 c25594l4, DrawerLayout drawerLayout, Toolbar toolbar, NavigationView navigationView) {
            this.f64164c = new C14966c(interfaceC44393lG2);
            this.f64165d = new C14970g(interfaceC44393lG2);
            this.f64166e = new C14964a(interfaceC44393lG2);
            this.f64167f = new C14965b(interfaceC44393lG2);
            this.f64168g = new C14971h(interfaceC44393lG2);
            this.f64169h = new C14967d(interfaceC44393lG2);
            this.f64170i = C39546d52.m44621a(baseActivity);
            this.f64171j = C39546d52.m44621a(drawerLayout);
            this.f64172k = C39546d52.m44621a(toolbar);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(navigationView);
            this.f64173l = m44621a;
            this.f64174m = V51.m80429b(KS2.m98867a(this.f64170i, this.f64171j, this.f64172k, m44621a, this.f64164c, this.f64165d));
            this.f64175n = new C14969f(interfaceC44393lG2);
            this.f64176o = C39546d52.m44621a(lifecycleScopeProvider);
            C14968e c14968e = new C14968e(interfaceC44393lG2);
            this.f64177p = c14968e;
            this.f64178q = V51.m80429b(FS2.m107136a(this.f64164c, this.f64165d, this.f64166e, this.f64167f, this.f64168g, this.f64169h, this.f64174m, this.f64175n, this.f64176o, c14968e));
            this.f64179r = C39546d52.m44621a(scopeProvider);
            InterfaceC48812sj1 m44621a2 = C39546d52.m44621a(c25594l4);
            this.f64180s = m44621a2;
            this.f64181t = V51.m80429b(C50834w76.m7389a(this.f64170i, m44621a2));
            C14972i c14972i = new C14972i(interfaceC44393lG2);
            this.f64182u = c14972i;
            this.f64183v = V51.m80429b(C47871r76.m16462a(this.f64169h, this.f64179r, this.f64181t, this.f64175n, c14972i, this.f64165d));
        }

        /* renamed from: c */
        public final MerchantHistoryActivity m57965c(MerchantHistoryActivity merchantHistoryActivity) {
            C5135Ly.m96068n(merchantHistoryActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64162a.mo27461w2()));
            C5135Ly.m96066p(merchantHistoryActivity, (C36207Tq4) C51679xZ3.m5003d(this.f64162a.mo27595B1()));
            C5135Ly.m96071k(merchantHistoryActivity, (Handler) C51679xZ3.m5003d(this.f64162a.mo27535X2()));
            C5135Ly.m96067o(merchantHistoryActivity, (C22454gl) C51679xZ3.m5003d(this.f64162a.mo27479r()));
            C5135Ly.m96080b(merchantHistoryActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64162a.mo27519d0()));
            C5135Ly.m96075g(merchantHistoryActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f64162a.mo27453z2()));
            C5135Ly.m96064r(merchantHistoryActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f64162a.mo27459x1()));
            C5135Ly.m96081a(merchantHistoryActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f64162a.mo27474s()));
            C5135Ly.m96073i(merchantHistoryActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f64162a.mo27558P0()));
            C5135Ly.m96074h(merchantHistoryActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f64162a.mo27598A0()));
            C5135Ly.m96077e(merchantHistoryActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f64162a.mo27507i0()));
            C5135Ly.m96070l(merchantHistoryActivity, (FO2) C51679xZ3.m5003d(this.f64162a.mo27456y2()));
            C5135Ly.m96065q(merchantHistoryActivity, (YR4) C51679xZ3.m5003d(this.f64162a.mo27525b0()));
            C5135Ly.m96079c(merchantHistoryActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f64162a.mo27460x()));
            C5135Ly.m96078d(merchantHistoryActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f64162a.mo27517d3()));
            C5135Ly.m96072j(merchantHistoryActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f64162a.mo27482q()));
            C5135Ly.m96076f(merchantHistoryActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f64162a.mo27483p3()));
            EQ2.m109030b(merchantHistoryActivity, this.f64178q.get());
            EQ2.m109029c(merchantHistoryActivity, this.f64183v.get());
            return merchantHistoryActivity;
        }

        public C14963b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, ScopeProvider scopeProvider, C25594l4 c25594l4, DrawerLayout drawerLayout, Toolbar toolbar, NavigationView navigationView) {
            this.f64163b = this;
            this.f64162a = interfaceC44393lG2;
            m57966b(interfaceC44393lG2, baseActivity, lifecycleScopeProvider, scopeProvider, c25594l4, drawerLayout, toolbar, navigationView);
        }
    }

    private C14961a() {
    }

    /* renamed from: a */
    public static MerchantHistoryActivity.InterfaceC14950b.InterfaceC14951a m57969a() {
        return new C14962a();
    }
}
