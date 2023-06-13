package co.bird.android.feature.ownedbirds;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.ownedbirds.OwnedBirdsActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.ownedbirds.b */
/* loaded from: classes3.dex */
public final class C15076b {

    /* renamed from: co.bird.android.feature.ownedbirds.b$a */
    /* loaded from: classes3.dex */
    public static final class C15077a implements OwnedBirdsActivity.InterfaceC15056a.InterfaceC15057a {
        @Override // co.bird.android.feature.ownedbirds.OwnedBirdsActivity.InterfaceC15056a.InterfaceC15057a
        /* renamed from: a */
        public OwnedBirdsActivity.InterfaceC15056a mo57803a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C2624G4 c2624g4) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c2624g4);
            return new C15078b(interfaceC44393lG2, baseActivity, scopeProvider, c2624g4);
        }

        private C15077a() {
        }
    }

    /* renamed from: co.bird.android.feature.ownedbirds.b$b */
    /* loaded from: classes3.dex */
    public static final class C15078b implements OwnedBirdsActivity.InterfaceC15056a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f64376a;

        /* renamed from: b */
        public final C15078b f64377b;

        /* renamed from: c */
        public Y94<WX2> f64378c;

        /* renamed from: d */
        public Y94<InterfaceC40099e13> f64379d;

        /* renamed from: e */
        public Y94<ScopeProvider> f64380e;

        /* renamed from: f */
        public Y94<BaseActivity> f64381f;

        /* renamed from: g */
        public Y94<C2624G4> f64382g;

        /* renamed from: h */
        public Y94<C41402gD3> f64383h;

        /* renamed from: i */
        public Y94<InterfaceC40809fD3> f64384i;

        /* renamed from: j */
        public Y94<C39624dD3> f64385j;

        /* renamed from: k */
        public Y94<YC3> f64386k;

        /* renamed from: co.bird.android.feature.ownedbirds.b$b$a */
        /* loaded from: classes3.dex */
        public static final class C15079a implements Y94<WX2> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64387a;

            public C15079a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64387a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public WX2 get() {
                return (WX2) C51679xZ3.m5003d(this.f64387a.mo27579H0());
            }
        }

        /* renamed from: co.bird.android.feature.ownedbirds.b$b$b */
        /* loaded from: classes3.dex */
        public static final class C15080b implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64388a;

            public C15080b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64388a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f64388a.mo27461w2());
            }
        }

        @Override // co.bird.android.feature.ownedbirds.OwnedBirdsActivity.InterfaceC15056a
        /* renamed from: a */
        public void mo57802a(OwnedBirdsActivity ownedBirdsActivity) {
            m57800c(ownedBirdsActivity);
        }

        /* renamed from: b */
        public final void m57801b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C2624G4 c2624g4) {
            this.f64378c = new C15079a(interfaceC44393lG2);
            this.f64379d = new C15080b(interfaceC44393lG2);
            this.f64380e = C39546d52.m44621a(scopeProvider);
            this.f64381f = C39546d52.m44621a(baseActivity);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(c2624g4);
            this.f64382g = m44621a;
            C41995hD3 m36601a = C41995hD3.m36601a(this.f64381f, m44621a);
            this.f64383h = m36601a;
            Y94<InterfaceC40809fD3> m80429b = V51.m80429b(m36601a);
            this.f64384i = m80429b;
            C40216eD3 m43096a = C40216eD3.m43096a(this.f64378c, this.f64379d, this.f64380e, m80429b);
            this.f64385j = m43096a;
            this.f64386k = V51.m80429b(m43096a);
        }

        /* renamed from: c */
        public final OwnedBirdsActivity m57800c(OwnedBirdsActivity ownedBirdsActivity) {
            C5135Ly.m96068n(ownedBirdsActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64376a.mo27461w2()));
            C5135Ly.m96066p(ownedBirdsActivity, (C36207Tq4) C51679xZ3.m5003d(this.f64376a.mo27595B1()));
            C5135Ly.m96071k(ownedBirdsActivity, (Handler) C51679xZ3.m5003d(this.f64376a.mo27535X2()));
            C5135Ly.m96067o(ownedBirdsActivity, (C22454gl) C51679xZ3.m5003d(this.f64376a.mo27479r()));
            C5135Ly.m96080b(ownedBirdsActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64376a.mo27519d0()));
            C5135Ly.m96075g(ownedBirdsActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f64376a.mo27453z2()));
            C5135Ly.m96064r(ownedBirdsActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f64376a.mo27459x1()));
            C5135Ly.m96081a(ownedBirdsActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f64376a.mo27474s()));
            C5135Ly.m96073i(ownedBirdsActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f64376a.mo27558P0()));
            C5135Ly.m96074h(ownedBirdsActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f64376a.mo27598A0()));
            C5135Ly.m96077e(ownedBirdsActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f64376a.mo27507i0()));
            C5135Ly.m96070l(ownedBirdsActivity, (FO2) C51679xZ3.m5003d(this.f64376a.mo27456y2()));
            C5135Ly.m96065q(ownedBirdsActivity, (YR4) C51679xZ3.m5003d(this.f64376a.mo27525b0()));
            C5135Ly.m96079c(ownedBirdsActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f64376a.mo27460x()));
            C5135Ly.m96078d(ownedBirdsActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f64376a.mo27517d3()));
            C5135Ly.m96072j(ownedBirdsActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f64376a.mo27482q()));
            C5135Ly.m96076f(ownedBirdsActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f64376a.mo27483p3()));
            WC3.m78728b(ownedBirdsActivity, this.f64386k.get());
            return ownedBirdsActivity;
        }

        public C15078b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C2624G4 c2624g4) {
            this.f64377b = this;
            this.f64376a = interfaceC44393lG2;
            m57801b(interfaceC44393lG2, baseActivity, scopeProvider, c2624g4);
        }
    }

    private C15076b() {
    }

    /* renamed from: a */
    public static OwnedBirdsActivity.InterfaceC15056a.InterfaceC15057a m57804a() {
        return new C15077a();
    }
}
