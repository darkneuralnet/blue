package co.bird.android.app.feature.merchant;

import android.os.Handler;
import co.bird.android.app.feature.map.presenter.LocationSelectionPresenterImplFactory;
import co.bird.android.app.feature.map.presenter.LocationSelectionPresenterImplFactory_Impl;
import co.bird.android.app.feature.map.presenter.LocationSelectionPresenterImpl_Factory;
import co.bird.android.app.feature.merchant.InterfaceC13905b;
import co.bird.android.core.mvp.BaseActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.app.feature.merchant.a */
/* loaded from: classes2.dex */
public final class C13900a {

    /* renamed from: co.bird.android.app.feature.merchant.a$a */
    /* loaded from: classes2.dex */
    public static final class C13901a implements InterfaceC13905b.InterfaceC13906a {
        @Override // co.bird.android.app.feature.merchant.InterfaceC13905b.InterfaceC13906a
        /* renamed from: a */
        public InterfaceC13905b mo60345a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            return new C13902b(interfaceC44393lG2, baseActivity);
        }

        private C13901a() {
        }
    }

    /* renamed from: co.bird.android.app.feature.merchant.a$b */
    /* loaded from: classes2.dex */
    public static final class C13902b implements InterfaceC13905b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f61643a;

        /* renamed from: b */
        public final C13902b f61644b;

        /* renamed from: c */
        public Y94<InterfaceC37961aS2> f61645c;

        /* renamed from: d */
        public Y94<InterfaceC40001dr4> f61646d;

        /* renamed from: e */
        public LocationSelectionPresenterImpl_Factory f61647e;

        /* renamed from: f */
        public Y94<LocationSelectionPresenterImplFactory> f61648f;

        /* renamed from: g */
        public Y94<BaseActivity> f61649g;

        /* renamed from: h */
        public Y94<ScopeProvider> f61650h;

        /* renamed from: i */
        public Y94<C50420vR2> f61651i;

        /* renamed from: j */
        public Y94<C42120hR2> f61652j;

        /* renamed from: co.bird.android.app.feature.merchant.a$b$a */
        /* loaded from: classes2.dex */
        public static final class C13903a implements Y94<InterfaceC37961aS2> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61653a;

            public C13903a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61653a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC37961aS2 get() {
                return (InterfaceC37961aS2) C51679xZ3.m5003d(this.f61653a.mo27550S1());
            }
        }

        /* renamed from: co.bird.android.app.feature.merchant.a$b$b */
        /* loaded from: classes2.dex */
        public static final class C13904b implements Y94<InterfaceC40001dr4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61654a;

            public C13904b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61654a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40001dr4 get() {
                return (InterfaceC40001dr4) C51679xZ3.m5003d(this.f61654a.mo27482q());
            }
        }

        @Override // co.bird.android.app.feature.merchant.InterfaceC13905b
        /* renamed from: a */
        public void mo60346a(MerchantLocationEditActivity merchantLocationEditActivity) {
            m60349c(merchantLocationEditActivity);
        }

        /* renamed from: b */
        public final void m60350b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity) {
            this.f61645c = new C13903a(interfaceC44393lG2);
            C13904b c13904b = new C13904b(interfaceC44393lG2);
            this.f61646d = c13904b;
            LocationSelectionPresenterImpl_Factory create = LocationSelectionPresenterImpl_Factory.create(c13904b);
            this.f61647e = create;
            this.f61648f = LocationSelectionPresenterImplFactory_Impl.create(create);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(baseActivity);
            this.f61649g = m44621a;
            this.f61650h = V51.m80429b(m44621a);
            Y94<C50420vR2> m80429b = V51.m80429b(C51013wR2.m6839a(this.f61649g, this.f61646d));
            this.f61651i = m80429b;
            this.f61652j = V51.m80429b(C42713iR2.m33929a(this.f61645c, this.f61648f, this.f61650h, m80429b));
        }

        /* renamed from: c */
        public final MerchantLocationEditActivity m60349c(MerchantLocationEditActivity merchantLocationEditActivity) {
            C5135Ly.m96068n(merchantLocationEditActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f61643a.mo27461w2()));
            C5135Ly.m96066p(merchantLocationEditActivity, (C36207Tq4) C51679xZ3.m5003d(this.f61643a.mo27595B1()));
            C5135Ly.m96071k(merchantLocationEditActivity, (Handler) C51679xZ3.m5003d(this.f61643a.mo27535X2()));
            C5135Ly.m96067o(merchantLocationEditActivity, (C22454gl) C51679xZ3.m5003d(this.f61643a.mo27479r()));
            C5135Ly.m96080b(merchantLocationEditActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f61643a.mo27519d0()));
            C5135Ly.m96075g(merchantLocationEditActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f61643a.mo27453z2()));
            C5135Ly.m96064r(merchantLocationEditActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f61643a.mo27459x1()));
            C5135Ly.m96081a(merchantLocationEditActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f61643a.mo27474s()));
            C5135Ly.m96073i(merchantLocationEditActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f61643a.mo27558P0()));
            C5135Ly.m96074h(merchantLocationEditActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f61643a.mo27598A0()));
            C5135Ly.m96077e(merchantLocationEditActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f61643a.mo27507i0()));
            C5135Ly.m96070l(merchantLocationEditActivity, (FO2) C51679xZ3.m5003d(this.f61643a.mo27456y2()));
            C5135Ly.m96065q(merchantLocationEditActivity, (YR4) C51679xZ3.m5003d(this.f61643a.mo27525b0()));
            C5135Ly.m96079c(merchantLocationEditActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f61643a.mo27460x()));
            C5135Ly.m96078d(merchantLocationEditActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f61643a.mo27517d3()));
            C5135Ly.m96072j(merchantLocationEditActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f61643a.mo27482q()));
            C5135Ly.m96076f(merchantLocationEditActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f61643a.mo27483p3()));
            SQ2.m85480a(merchantLocationEditActivity, this.f61652j.get());
            return merchantLocationEditActivity;
        }

        public C13902b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity) {
            this.f61644b = this;
            this.f61643a = interfaceC44393lG2;
            m60350b(interfaceC44393lG2, baseActivity);
        }
    }

    private C13900a() {
    }

    /* renamed from: a */
    public static InterfaceC13905b.InterfaceC13906a m60351a() {
        return new C13901a();
    }
}
