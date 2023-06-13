package co.bird.android.app.feature.operator.activity;

import android.content.Context;
import android.hardware.SensorManager;
import android.os.Handler;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC11719f;
import co.bird.android.app.feature.map.cluster.birdmarker.BirdMarkerClusterManagerFactory;
import co.bird.android.app.feature.map.cluster.birdmarker.BirdMarkerClusterManagerFactory_Impl;
import co.bird.android.app.feature.map.cluster.birdmarker.BirdMarkerClusterManager_Factory;
import co.bird.android.app.feature.map.cluster.bountymarker.BountyMarkerClusterManagerFactory;
import co.bird.android.app.feature.map.cluster.bountymarker.BountyMarkerClusterManagerFactory_Impl;
import co.bird.android.app.feature.map.cluster.bountymarker.BountyMarkerClusterManager_Factory;
import co.bird.android.app.feature.map.cluster.nestmarker.NestMarkerClusterManagerFactory;
import co.bird.android.app.feature.map.cluster.nestmarker.NestMarkerClusterManagerFactory_Impl;
import co.bird.android.app.feature.map.cluster.nestmarker.NestMarkerClusterManager_Factory;
import co.bird.android.app.feature.map.cluster.warehousemarker.WarehouseMarkerClusterManagerFactory;
import co.bird.android.app.feature.map.cluster.warehousemarker.WarehouseMarkerClusterManagerFactory_Impl;
import co.bird.android.app.feature.map.cluster.warehousemarker.WarehouseMarkerClusterManager_Factory;
import co.bird.android.app.feature.map.cluster.zonemarker.ZoneMarkerClusterManagerFactory;
import co.bird.android.app.feature.map.cluster.zonemarker.ZoneMarkerClusterManagerFactory_Impl;
import co.bird.android.app.feature.map.cluster.zonemarker.ZoneMarkerClusterManager_Factory;
import co.bird.android.app.feature.map.presenter.MapPresenterImplFactory;
import co.bird.android.app.feature.map.presenter.MapPresenterImplFactory_Impl;
import co.bird.android.app.feature.map.presenter.MapPresenterImpl_Factory;
import co.bird.android.app.feature.map.renderer.BirdMarkerClusterItemOptionProvider;
import co.bird.android.app.feature.map.renderer.BirdMarkerClusterItemOptionProvider_Factory;
import co.bird.android.app.feature.map.renderer.BountyMarkerClusterRendererFactory;
import co.bird.android.app.feature.map.renderer.BountyMarkerClusterRendererFactory_Impl;
import co.bird.android.app.feature.map.renderer.BountyMarkerClusterRenderer_Factory;
import co.bird.android.app.feature.map.renderer.BountyMarkerWithTimerOptionProvider;
import co.bird.android.app.feature.map.renderer.BountyMarkerWithTimerOptionProvider_Factory;
import co.bird.android.app.feature.map.renderer.FleetMarkerOptionProvider;
import co.bird.android.app.feature.map.renderer.FleetMarkerOptionProvider_Factory;
import co.bird.android.app.feature.map.renderer.OperatorBirdMarkerClusterRendererFactory;
import co.bird.android.app.feature.map.renderer.OperatorBirdMarkerClusterRendererFactory_Impl;
import co.bird.android.app.feature.map.renderer.OperatorBirdMarkerClusterRenderer_Factory;
import co.bird.android.app.feature.map.renderer.WarehouseMarkerClusterRendererFactory;
import co.bird.android.app.feature.map.renderer.WarehouseMarkerClusterRendererFactory_Impl;
import co.bird.android.app.feature.map.renderer.WarehouseMarkerClusterRenderer_Factory;
import co.bird.android.app.feature.map.renderer.ZoneMarkerClusterRendererFactory;
import co.bird.android.app.feature.map.renderer.ZoneMarkerClusterRendererFactory_Impl;
import co.bird.android.app.feature.map.renderer.ZoneMarkerClusterRenderer_Factory;
import co.bird.android.app.feature.map.renderer.nestmarker.NestMarkerClusterRendererFactory;
import co.bird.android.app.feature.map.renderer.nestmarker.NestMarkerClusterRendererFactory_Impl;
import co.bird.android.app.feature.map.renderer.nestmarker.NestMarkerClusterRenderer_Factory;
import co.bird.android.app.feature.operator.activity.OperatorActivity;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.constant.FlightSheetContext;
import com.guness.widget.NavigationView;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: co.bird.android.app.feature.operator.activity.a */
/* loaded from: classes2.dex */
public final class C13928a {

    /* renamed from: co.bird.android.app.feature.operator.activity.a$a */
    /* loaded from: classes2.dex */
    public static final class C13929a implements OperatorActivity.InterfaceC13918b.InterfaceC13919a {
        @Override // co.bird.android.app.feature.operator.activity.OperatorActivity.InterfaceC13918b.InterfaceC13919a
        /* renamed from: a */
        public OperatorActivity.InterfaceC13918b mo60287a(InterfaceC44393lG2 interfaceC44393lG2, OperatorActivity.C13921c c13921c, BaseActivity baseActivity, ScopeProvider scopeProvider, AndroidLifecycleScopeProvider androidLifecycleScopeProvider, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, NavigationView navigationView, FlightSheetContext flightSheetContext, boolean z, C29040u4 c29040u4, C32258Ct6 c32258Ct6, FragmentManager fragmentManager, AbstractC11719f abstractC11719f, DQ3 dq3) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(androidLifecycleScopeProvider);
            C51679xZ3.m5005b(lifecycleScopeProvider);
            C51679xZ3.m5005b(flightSheetContext);
            C51679xZ3.m5005b(Boolean.valueOf(z));
            C51679xZ3.m5005b(c29040u4);
            C51679xZ3.m5005b(c32258Ct6);
            C51679xZ3.m5005b(fragmentManager);
            C51679xZ3.m5005b(abstractC11719f);
            C51679xZ3.m5005b(dq3);
            return new C13930b(interfaceC44393lG2, baseActivity, scopeProvider, androidLifecycleScopeProvider, lifecycleScopeProvider, navigationView, flightSheetContext, Boolean.valueOf(z), c29040u4, c32258Ct6, fragmentManager, abstractC11719f, dq3);
        }

        private C13929a() {
        }
    }

    /* renamed from: co.bird.android.app.feature.operator.activity.a$b */
    /* loaded from: classes2.dex */
    public static final class C13930b implements OperatorActivity.InterfaceC13918b {

        /* renamed from: A */
        public OperatorBirdMarkerClusterRenderer_Factory f61726A;

        /* renamed from: A0 */
        public Y94<C12470bg> f61727A0;

        /* renamed from: B */
        public Y94<OperatorBirdMarkerClusterRendererFactory> f61728B;

        /* renamed from: B0 */
        public Y94<C32258Ct6> f61729B0;

        /* renamed from: C */
        public BirdMarkerClusterManager_Factory f61730C;

        /* renamed from: C0 */
        public Y94<C36386Uk3> f61731C0;

        /* renamed from: D */
        public Y94<BirdMarkerClusterManagerFactory> f61732D;

        /* renamed from: D0 */
        public Y94<ScopeProvider> f61733D0;

        /* renamed from: E */
        public Y94<FleetMarkerOptionProvider> f61734E;

        /* renamed from: E0 */
        public Y94<InterfaceC40099e13> f61735E0;

        /* renamed from: F */
        public Y94<BountyMarkerWithTimerOptionProvider> f61736F;

        /* renamed from: F0 */
        public C51193wk1 f61737F0;

        /* renamed from: G */
        public BountyMarkerClusterRenderer_Factory f61738G;

        /* renamed from: G0 */
        public Y94<InterfaceC50008uk1> f61739G0;

        /* renamed from: H */
        public Y94<BountyMarkerClusterRendererFactory> f61740H;

        /* renamed from: H0 */
        public Y94<InterfaceC42996iu4> f61741H0;

        /* renamed from: I */
        public BountyMarkerClusterManager_Factory f61742I;

        /* renamed from: I0 */
        public Y94<C35990Ss3> f61743I0;

        /* renamed from: J */
        public Y94<BountyMarkerClusterManagerFactory> f61744J;

        /* renamed from: J0 */
        public Y94<InterfaceC35223Pl1> f61745J0;

        /* renamed from: K */
        public NestMarkerClusterRenderer_Factory f61746K;

        /* renamed from: K0 */
        public C31994Bq3 f61747K0;

        /* renamed from: L */
        public Y94<NestMarkerClusterRendererFactory> f61748L;

        /* renamed from: L0 */
        public Y94<InterfaceC53034zq3> f61749L0;

        /* renamed from: M */
        public NestMarkerClusterManager_Factory f61750M;

        /* renamed from: M0 */
        public Y94<C7540Sm> f61751M0;

        /* renamed from: N */
        public Y94<NestMarkerClusterManagerFactory> f61752N;

        /* renamed from: N0 */
        public C33335Hj3 f61753N0;

        /* renamed from: O */
        public WarehouseMarkerClusterRenderer_Factory f61754O;

        /* renamed from: O0 */
        public Y94<InterfaceC32633Ej3> f61755O0;

        /* renamed from: P */
        public Y94<WarehouseMarkerClusterRendererFactory> f61756P;

        /* renamed from: P0 */
        public C34982Ok3 f61757P0;

        /* renamed from: Q */
        public WarehouseMarkerClusterManager_Factory f61758Q;

        /* renamed from: Q0 */
        public Y94<InterfaceC34514Mk3> f61759Q0;

        /* renamed from: R */
        public Y94<WarehouseMarkerClusterManagerFactory> f61760R;

        /* renamed from: R0 */
        public Y94<InterfaceC48430s43> f61761R0;

        /* renamed from: S */
        public ZoneMarkerClusterRenderer_Factory f61762S;

        /* renamed from: S0 */
        public Y94<InterfaceC41315g43> f61763S0;

        /* renamed from: T */
        public Y94<ZoneMarkerClusterRendererFactory> f61764T;

        /* renamed from: T0 */
        public Y94<LifecycleScopeProvider<EnumC7097RE>> f61765T0;

        /* renamed from: U */
        public ZoneMarkerClusterManager_Factory f61766U;

        /* renamed from: U0 */
        public C46493oo3 f61767U0;

        /* renamed from: V */
        public Y94<ZoneMarkerClusterManagerFactory> f61768V;

        /* renamed from: V0 */
        public Y94<InterfaceC35936Sm3> f61769V0;

        /* renamed from: W */
        public Y94<InterfaceC40001dr4> f61770W;

        /* renamed from: W0 */
        public Y94<InterfaceC37451Yy6> f61771W0;

        /* renamed from: X */
        public C35702Rm3 f61772X;

        /* renamed from: X0 */
        public C47176px3 f61773X0;

        /* renamed from: Y */
        public Y94<InterfaceC35234Pm3> f61774Y;

        /* renamed from: Y0 */
        public Y94<InterfaceC45990nx3> f61775Y0;

        /* renamed from: Z */
        public Y94<InterfaceC12495bn> f61776Z;

        /* renamed from: Z0 */
        public Y94<QI6> f61777Z0;

        /* renamed from: a */
        public final InterfaceC44393lG2 f61778a;

        /* renamed from: a0 */
        public Y94<InterfaceC33117Gl1> f61779a0;

        /* renamed from: a1 */
        public Y94<C49751uI6> f61780a1;

        /* renamed from: b */
        public final ScopeProvider f61781b;

        /* renamed from: b0 */
        public Y94<SensorManager> f61782b0;

        /* renamed from: b1 */
        public C40663ey3 f61783b1;

        /* renamed from: c */
        public final FlightSheetContext f61784c;

        /* renamed from: c0 */
        public Y94<InterfaceC46893pU4> f61785c0;

        /* renamed from: c1 */
        public Y94<InterfaceC39478cy3> f61786c1;

        /* renamed from: d */
        public final C13930b f61787d;

        /* renamed from: d0 */
        public Y94<InterfaceC42163hW0> f61788d0;

        /* renamed from: e */
        public Y94<BaseActivity> f61789e;

        /* renamed from: e0 */
        public Y94<InterfaceC10636aM> f61790e0;

        /* renamed from: f */
        public Y94<C29040u4> f61791f;

        /* renamed from: f0 */
        public Y94<InterfaceC47297q95> f61792f0;

        /* renamed from: g */
        public Y94<Context> f61793g;

        /* renamed from: g0 */
        public Y94<YR4> f61794g0;

        /* renamed from: h */
        public Y94<G33> f61795h;

        /* renamed from: h0 */
        public MapPresenterImpl_Factory f61796h0;

        /* renamed from: i */
        public Y94<C35324Pw3> f61797i;

        /* renamed from: i0 */
        public Y94<MapPresenterImplFactory> f61798i0;

        /* renamed from: j */
        public Y94<C22454gl> f61799j;

        /* renamed from: j0 */
        public Y94<InterfaceC44637lg6> f61800j0;

        /* renamed from: k */
        public Y94<C36207Tq4> f61801k;

        /* renamed from: k0 */
        public Y94<InterfaceC27246pJ> f61802k0;

        /* renamed from: l */
        public Y94<GI3> f61803l;

        /* renamed from: l0 */
        public Y94<InterfaceC44647lh6> f61804l0;

        /* renamed from: m */
        public Y94<InterfaceC46473om3> f61805m;

        /* renamed from: m0 */
        public Y94<InterfaceC46545ot5> f61806m0;

        /* renamed from: n */
        public Y94<InterfaceC1880Ea> f61807n;

        /* renamed from: n0 */
        public Y94<InterfaceC30556yL> f61808n0;

        /* renamed from: o */
        public Y94<InterfaceC6097Oh> f61809o;

        /* renamed from: o0 */
        public Y94<InterfaceC49820uQ3> f61810o0;

        /* renamed from: p */
        public Y94<Z85> f61811p;

        /* renamed from: p0 */
        public Y94<InterfaceC36161Tl3> f61812p0;

        /* renamed from: q */
        public Y94<InterfaceC37961aS2> f61813q;

        /* renamed from: q0 */
        public Y94<InterfaceC37857aG6> f61814q0;

        /* renamed from: r */
        public Y94<InterfaceC48265rn6> f61815r;

        /* renamed from: r0 */
        public Y94<InterfaceC48923su2> f61816r0;

        /* renamed from: s */
        public Y94<InterfaceC31844Az6> f61817s;

        /* renamed from: s0 */
        public Y94<InterfaceC49310tZ5> f61818s0;

        /* renamed from: t */
        public Y94<O86> f61819t;

        /* renamed from: t0 */
        public Y94<DQ3> f61820t0;

        /* renamed from: u */
        public Y94<InterfaceC35660Rh6> f61821u;

        /* renamed from: u0 */
        public C33884Js3 f61822u0;

        /* renamed from: v */
        public Y94<InterfaceC6098Oi> f61823v;

        /* renamed from: v0 */
        public Y94<InterfaceC33416Hs3> f61824v0;

        /* renamed from: w */
        public L03 f61825w;

        /* renamed from: w0 */
        public Y94<InterfaceC27649qg> f61826w0;

        /* renamed from: x */
        public Y94<G03> f61827x;

        /* renamed from: x0 */
        public Y94<InterfaceC36149Tk0> f61828x0;

        /* renamed from: y */
        public Y94<InterfaceC42524i66> f61829y;

        /* renamed from: y0 */
        public Y94<InterfaceC36187To2> f61830y0;

        /* renamed from: z */
        public Y94<BirdMarkerClusterItemOptionProvider> f61831z;

        /* renamed from: z0 */
        public Y94<C4176Jf> f61832z0;

        /* renamed from: co.bird.android.app.feature.operator.activity.a$b$A */
        /* loaded from: classes2.dex */
        public static final class C13931A implements Y94<InterfaceC46545ot5> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61833a;

            public C13931A(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61833a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC46545ot5 get() {
                return (InterfaceC46545ot5) C51679xZ3.m5003d(this.f61833a.mo27501k0());
            }
        }

        /* renamed from: co.bird.android.app.feature.operator.activity.a$b$B */
        /* loaded from: classes2.dex */
        public static final class C13932B implements Y94<InterfaceC42524i66> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61834a;

            public C13932B(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61834a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC42524i66 get() {
                return (InterfaceC42524i66) C51679xZ3.m5003d(this.f61834a.mo27562N1());
            }
        }

        /* renamed from: co.bird.android.app.feature.operator.activity.a$b$C */
        /* loaded from: classes2.dex */
        public static final class C13933C implements Y94<InterfaceC35660Rh6> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61835a;

            public C13933C(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61835a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC35660Rh6 get() {
                return (InterfaceC35660Rh6) C51679xZ3.m5003d(this.f61835a.mo27500k1());
            }
        }

        /* renamed from: co.bird.android.app.feature.operator.activity.a$b$D */
        /* loaded from: classes2.dex */
        public static final class C13934D implements Y94<InterfaceC37451Yy6> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61836a;

            public C13934D(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61836a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC37451Yy6 get() {
                return (InterfaceC37451Yy6) C51679xZ3.m5003d(this.f61836a.mo27526a3());
            }
        }

        /* renamed from: co.bird.android.app.feature.operator.activity.a$b$E */
        /* loaded from: classes2.dex */
        public static final class C13935E implements Y94<QI6> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61837a;

            public C13935E(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61837a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public QI6 get() {
                return (QI6) C51679xZ3.m5003d(this.f61837a.mo27538X());
            }
        }

        /* renamed from: co.bird.android.app.feature.operator.activity.a$b$F */
        /* loaded from: classes2.dex */
        public static final class C13936F implements Y94<InterfaceC48923su2> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61838a;

            public C13936F(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61838a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC48923su2 get() {
                return (InterfaceC48923su2) C51679xZ3.m5003d(this.f61838a.mo27505j0());
            }
        }

        /* renamed from: co.bird.android.app.feature.operator.activity.a$b$G */
        /* loaded from: classes2.dex */
        public static final class C13937G implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61839a;

            public C13937G(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61839a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f61839a.mo27461w2());
            }
        }

        /* renamed from: co.bird.android.app.feature.operator.activity.a$b$H */
        /* loaded from: classes2.dex */
        public static final class C13938H implements Y94<InterfaceC46473om3> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61840a;

            public C13938H(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61840a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC46473om3 get() {
                return (InterfaceC46473om3) C51679xZ3.m5003d(this.f61840a.mo27584F0());
            }
        }

        /* renamed from: co.bird.android.app.feature.operator.activity.a$b$I */
        /* loaded from: classes2.dex */
        public static final class C13939I implements Y94<C36207Tq4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61841a;

            public C13939I(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61841a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C36207Tq4 get() {
                return (C36207Tq4) C51679xZ3.m5003d(this.f61841a.mo27595B1());
            }
        }

        /* renamed from: co.bird.android.app.feature.operator.activity.a$b$J */
        /* loaded from: classes2.dex */
        public static final class C13940J implements Y94<InterfaceC40001dr4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61842a;

            public C13940J(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61842a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40001dr4 get() {
                return (InterfaceC40001dr4) C51679xZ3.m5003d(this.f61842a.mo27482q());
            }
        }

        /* renamed from: co.bird.android.app.feature.operator.activity.a$b$K */
        /* loaded from: classes2.dex */
        public static final class C13941K implements Y94<Z85> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61843a;

            public C13941K(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61843a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public Z85 get() {
                return (Z85) C51679xZ3.m5003d(this.f61843a.mo27497l0());
            }
        }

        /* renamed from: co.bird.android.app.feature.operator.activity.a$b$L */
        /* loaded from: classes2.dex */
        public static final class C13942L implements Y94<InterfaceC49310tZ5> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61844a;

            public C13942L(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61844a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC49310tZ5 get() {
                return (InterfaceC49310tZ5) C51679xZ3.m5003d(this.f61844a.mo27596B());
            }
        }

        /* renamed from: co.bird.android.app.feature.operator.activity.a$b$M */
        /* loaded from: classes2.dex */
        public static final class C13943M implements Y94<O86> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61845a;

            public C13943M(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61845a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public O86 get() {
                return (O86) C51679xZ3.m5003d(this.f61845a.mo27485p());
            }
        }

        /* renamed from: co.bird.android.app.feature.operator.activity.a$b$N */
        /* loaded from: classes2.dex */
        public static final class C13944N implements Y94<InterfaceC44637lg6> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61846a;

            public C13944N(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61846a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC44637lg6 get() {
                return (InterfaceC44637lg6) C51679xZ3.m5003d(this.f61846a.mo27474s());
            }
        }

        /* renamed from: co.bird.android.app.feature.operator.activity.a$b$O */
        /* loaded from: classes2.dex */
        public static final class C13945O implements Y94<InterfaceC44647lh6> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61847a;

            public C13945O(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61847a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC44647lh6 get() {
                return (InterfaceC44647lh6) C51679xZ3.m5003d(this.f61847a.mo27459x1());
            }
        }

        /* renamed from: co.bird.android.app.feature.operator.activity.a$b$P */
        /* loaded from: classes2.dex */
        public static final class C13946P implements Y94<InterfaceC48265rn6> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61848a;

            public C13946P(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61848a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC48265rn6 get() {
                return (InterfaceC48265rn6) C51679xZ3.m5003d(this.f61848a.mo27515e3());
            }
        }

        /* renamed from: co.bird.android.app.feature.operator.activity.a$b$Q */
        /* loaded from: classes2.dex */
        public static final class C13947Q implements Y94<InterfaceC31844Az6> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61849a;

            public C13947Q(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61849a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC31844Az6 get() {
                return (InterfaceC31844Az6) C51679xZ3.m5003d(this.f61849a.mo27466u2());
            }
        }

        /* renamed from: co.bird.android.app.feature.operator.activity.a$b$R */
        /* loaded from: classes2.dex */
        public static final class C13948R implements Y94<InterfaceC37857aG6> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61850a;

            public C13948R(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61850a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC37857aG6 get() {
                return (InterfaceC37857aG6) C51679xZ3.m5003d(this.f61850a.mo27549T2());
            }
        }

        /* renamed from: co.bird.android.app.feature.operator.activity.a$b$a */
        /* loaded from: classes2.dex */
        public static final class C13949a implements Y94<InterfaceC1880Ea> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61851a;

            public C13949a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61851a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC1880Ea get() {
                return (InterfaceC1880Ea) C51679xZ3.m5003d(this.f61851a.mo27519d0());
            }
        }

        /* renamed from: co.bird.android.app.feature.operator.activity.a$b$b */
        /* loaded from: classes2.dex */
        public static final class C13950b implements Y94<SensorManager> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61852a;

            public C13950b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61852a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public SensorManager get() {
                return (SensorManager) C51679xZ3.m5003d(this.f61852a.mo27499k2());
            }
        }

        /* renamed from: co.bird.android.app.feature.operator.activity.a$b$c */
        /* loaded from: classes2.dex */
        public static final class C13951c implements Y94<InterfaceC6097Oh> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61853a;

            public C13951c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61853a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC6097Oh get() {
                return (InterfaceC6097Oh) C51679xZ3.m5003d(this.f61853a.mo27470t0());
            }
        }

        /* renamed from: co.bird.android.app.feature.operator.activity.a$b$d */
        /* loaded from: classes2.dex */
        public static final class C13952d implements Y94<InterfaceC6098Oi> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61854a;

            public C13952d(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61854a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC6098Oi get() {
                return (InterfaceC6098Oi) C51679xZ3.m5003d(this.f61854a.mo27488n3());
            }
        }

        /* renamed from: co.bird.android.app.feature.operator.activity.a$b$e */
        /* loaded from: classes2.dex */
        public static final class C13953e implements Y94<C22454gl> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61855a;

            public C13953e(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61855a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C22454gl get() {
                return (C22454gl) C51679xZ3.m5003d(this.f61855a.mo27479r());
            }
        }

        /* renamed from: co.bird.android.app.feature.operator.activity.a$b$f */
        /* loaded from: classes2.dex */
        public static final class C13954f implements Y94<Context> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61856a;

            public C13954f(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61856a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public Context get() {
                return (Context) C51679xZ3.m5003d(this.f61856a.mo27552R1());
            }
        }

        /* renamed from: co.bird.android.app.feature.operator.activity.a$b$g */
        /* loaded from: classes2.dex */
        public static final class C13955g implements Y94<InterfaceC12495bn> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61857a;

            public C13955g(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61857a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC12495bn get() {
                return (InterfaceC12495bn) C51679xZ3.m5003d(this.f61857a.mo27516e0());
            }
        }

        /* renamed from: co.bird.android.app.feature.operator.activity.a$b$h */
        /* loaded from: classes2.dex */
        public static final class C13956h implements Y94<InterfaceC27246pJ> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61858a;

            public C13956h(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61858a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC27246pJ get() {
                return (InterfaceC27246pJ) C51679xZ3.m5003d(this.f61858a.mo27517d3());
            }
        }

        /* renamed from: co.bird.android.app.feature.operator.activity.a$b$i */
        /* loaded from: classes2.dex */
        public static final class C13957i implements Y94<InterfaceC30556yL> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61859a;

            public C13957i(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61859a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC30556yL get() {
                return (InterfaceC30556yL) C51679xZ3.m5003d(this.f61859a.mo27509g3());
            }
        }

        /* renamed from: co.bird.android.app.feature.operator.activity.a$b$j */
        /* loaded from: classes2.dex */
        public static final class C13958j implements Y94<InterfaceC10636aM> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61860a;

            public C13958j(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61860a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC10636aM get() {
                return (InterfaceC10636aM) C51679xZ3.m5003d(this.f61860a.mo27460x());
            }
        }

        /* renamed from: co.bird.android.app.feature.operator.activity.a$b$k */
        /* loaded from: classes2.dex */
        public static final class C13959k implements Y94<InterfaceC33117Gl1> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61861a;

            public C13959k(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61861a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC33117Gl1 get() {
                return (InterfaceC33117Gl1) C51679xZ3.m5003d(this.f61861a.mo27480q3());
            }
        }

        /* renamed from: co.bird.android.app.feature.operator.activity.a$b$l */
        /* loaded from: classes2.dex */
        public static final class C13960l implements Y94<InterfaceC27649qg> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61862a;

            public C13960l(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61862a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC27649qg get() {
                return (InterfaceC27649qg) C51679xZ3.m5003d(this.f61862a.mo27476r2());
            }
        }

        /* renamed from: co.bird.android.app.feature.operator.activity.a$b$m */
        /* loaded from: classes2.dex */
        public static final class C13961m implements Y94<InterfaceC36187To2> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61863a;

            public C13961m(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61863a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC36187To2 get() {
                return (InterfaceC36187To2) C51679xZ3.m5003d(this.f61863a.mo27527a1());
            }
        }

        /* renamed from: co.bird.android.app.feature.operator.activity.a$b$n */
        /* loaded from: classes2.dex */
        public static final class C13962n implements Y94<InterfaceC36149Tk0> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61864a;

            public C13962n(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61864a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC36149Tk0 get() {
                return (InterfaceC36149Tk0) C51679xZ3.m5003d(this.f61864a.mo27490n());
            }
        }

        /* renamed from: co.bird.android.app.feature.operator.activity.a$b$o */
        /* loaded from: classes2.dex */
        public static final class C13963o implements Y94<InterfaceC42163hW0> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61865a;

            public C13963o(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61865a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC42163hW0 get() {
                return (InterfaceC42163hW0) C51679xZ3.m5003d(this.f61865a.mo27588D1());
            }
        }

        /* renamed from: co.bird.android.app.feature.operator.activity.a$b$p */
        /* loaded from: classes2.dex */
        public static final class C13964p implements Y94<InterfaceC35223Pl1> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61866a;

            public C13964p(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61866a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC35223Pl1 get() {
                return (InterfaceC35223Pl1) C51679xZ3.m5003d(this.f61866a.mo27493m1());
            }
        }

        /* renamed from: co.bird.android.app.feature.operator.activity.a$b$q */
        /* loaded from: classes2.dex */
        public static final class C13965q implements Y94<InterfaceC37961aS2> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61867a;

            public C13965q(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61867a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC37961aS2 get() {
                return (InterfaceC37961aS2) C51679xZ3.m5003d(this.f61867a.mo27550S1());
            }
        }

        /* renamed from: co.bird.android.app.feature.operator.activity.a$b$r */
        /* loaded from: classes2.dex */
        public static final class C13966r implements Y94<InterfaceC41315g43> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61868a;

            public C13966r(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61868a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC41315g43 get() {
                return (InterfaceC41315g43) C51679xZ3.m5003d(this.f61868a.mo27546U1());
            }
        }

        /* renamed from: co.bird.android.app.feature.operator.activity.a$b$s */
        /* loaded from: classes2.dex */
        public static final class C13967s implements Y94<InterfaceC48430s43> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61869a;

            public C13967s(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61869a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC48430s43 get() {
                return (InterfaceC48430s43) C51679xZ3.m5003d(this.f61869a.mo27465v1());
            }
        }

        /* renamed from: co.bird.android.app.feature.operator.activity.a$b$t */
        /* loaded from: classes2.dex */
        public static final class C13968t implements Y94<InterfaceC36161Tl3> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61870a;

            public C13968t(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61870a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC36161Tl3 get() {
                return (InterfaceC36161Tl3) C51679xZ3.m5003d(this.f61870a.mo27561N2());
            }
        }

        /* renamed from: co.bird.android.app.feature.operator.activity.a$b$u */
        /* loaded from: classes2.dex */
        public static final class C13969u implements Y94<GI3> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61871a;

            public C13969u(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61871a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public GI3 get() {
                return (GI3) C51679xZ3.m5003d(this.f61871a.mo27565M2());
            }
        }

        /* renamed from: co.bird.android.app.feature.operator.activity.a$b$v */
        /* loaded from: classes2.dex */
        public static final class C13970v implements Y94<InterfaceC49820uQ3> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61872a;

            public C13970v(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61872a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC49820uQ3 get() {
                return (InterfaceC49820uQ3) C51679xZ3.m5003d(this.f61872a.mo27567M());
            }
        }

        /* renamed from: co.bird.android.app.feature.operator.activity.a$b$w */
        /* loaded from: classes2.dex */
        public static final class C13971w implements Y94<InterfaceC42996iu4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61873a;

            public C13971w(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61873a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC42996iu4 get() {
                return (InterfaceC42996iu4) C51679xZ3.m5003d(this.f61873a.mo27521c0());
            }
        }

        /* renamed from: co.bird.android.app.feature.operator.activity.a$b$x */
        /* loaded from: classes2.dex */
        public static final class C13972x implements Y94<YR4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61874a;

            public C13972x(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61874a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public YR4 get() {
                return (YR4) C51679xZ3.m5003d(this.f61874a.mo27525b0());
            }
        }

        /* renamed from: co.bird.android.app.feature.operator.activity.a$b$y */
        /* loaded from: classes2.dex */
        public static final class C13973y implements Y94<InterfaceC46893pU4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61875a;

            public C13973y(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61875a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC46893pU4 get() {
                return (InterfaceC46893pU4) C51679xZ3.m5003d(this.f61875a.mo27566M0());
            }
        }

        /* renamed from: co.bird.android.app.feature.operator.activity.a$b$z */
        /* loaded from: classes2.dex */
        public static final class C13974z implements Y94<InterfaceC47297q95> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61876a;

            public C13974z(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61876a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC47297q95 get() {
                return (InterfaceC47297q95) C51679xZ3.m5003d(this.f61876a.mo27495l3());
            }
        }

        @Override // co.bird.android.app.feature.operator.activity.OperatorActivity.InterfaceC13918b
        /* renamed from: a */
        public void mo60286a(OperatorActivity operatorActivity) {
            m60280g(operatorActivity);
        }

        /* renamed from: b */
        public final C31739Ao0 m60285b() {
            return new C31739Ao0((InterfaceC36185To0) C51679xZ3.m5003d(this.f61778a.mo27481q2()), (InterfaceC46473om3) C51679xZ3.m5003d(this.f61778a.mo27584F0()), (InterfaceC48164rd5) C51679xZ3.m5003d(this.f61778a.mo27463w()), this.f61781b, this.f61797i.get());
        }

        /* renamed from: c */
        public final C42390ht1 m60284c() {
            return new C42390ht1((Context) C51679xZ3.m5003d(this.f61778a.mo27552R1()));
        }

        /* renamed from: d */
        public final C35529Qt1 m60283d() {
            return new C35529Qt1((InterfaceC46473om3) C51679xZ3.m5003d(this.f61778a.mo27584F0()), (InterfaceC30556yL) C51679xZ3.m5003d(this.f61778a.mo27509g3()), (InterfaceC48265rn6) C51679xZ3.m5003d(this.f61778a.mo27515e3()), (InterfaceC1880Ea) C51679xZ3.m5003d(this.f61778a.mo27519d0()), m60279h(), this.f61797i.get(), (InterfaceC40099e13) C51679xZ3.m5003d(this.f61778a.mo27461w2()), (C36207Tq4) C51679xZ3.m5003d(this.f61778a.mo27595B1()), this.f61781b, (C22454gl) C51679xZ3.m5003d(this.f61778a.mo27479r()), m60285b(), this.f61784c, m60284c());
        }

        /* renamed from: e */
        public final void m60282e(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, AndroidLifecycleScopeProvider androidLifecycleScopeProvider, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, NavigationView navigationView, FlightSheetContext flightSheetContext, Boolean bool, C29040u4 c29040u4, C32258Ct6 c32258Ct6, FragmentManager fragmentManager, AbstractC11719f abstractC11719f, DQ3 dq3) {
            this.f61789e = C39546d52.m44621a(baseActivity);
            this.f61791f = C39546d52.m44621a(c29040u4);
            C13954f c13954f = new C13954f(interfaceC44393lG2);
            this.f61793g = c13954f;
            H33 m104469a = H33.m104469a(c13954f);
            this.f61795h = m104469a;
            this.f61797i = V51.m80429b(C35558Qw3.m87567a(this.f61789e, this.f61791f, m104469a));
            this.f61799j = new C13953e(interfaceC44393lG2);
            this.f61801k = new C13939I(interfaceC44393lG2);
            this.f61803l = new C13969u(interfaceC44393lG2);
            this.f61805m = new C13938H(interfaceC44393lG2);
            this.f61807n = new C13949a(interfaceC44393lG2);
            this.f61809o = new C13951c(interfaceC44393lG2);
            this.f61811p = new C13941K(interfaceC44393lG2);
            this.f61813q = new C13965q(interfaceC44393lG2);
            this.f61815r = new C13946P(interfaceC44393lG2);
            this.f61817s = new C13947Q(interfaceC44393lG2);
            this.f61819t = new C13943M(interfaceC44393lG2);
            this.f61821u = new C13933C(interfaceC44393lG2);
            C13952d c13952d = new C13952d(interfaceC44393lG2);
            this.f61823v = c13952d;
            L03 m97939a = L03.m97939a(this.f61799j, this.f61801k, this.f61803l, this.f61805m, this.f61807n, this.f61809o, this.f61811p, this.f61813q, this.f61815r, this.f61817s, this.f61819t, this.f61821u, c13952d);
            this.f61825w = m97939a;
            this.f61827x = I03.m103079b(m97939a);
            this.f61829y = new C13932B(interfaceC44393lG2);
            this.f61831z = BirdMarkerClusterItemOptionProvider_Factory.create(this.f61793g);
            OperatorBirdMarkerClusterRenderer_Factory create = OperatorBirdMarkerClusterRenderer_Factory.create(this.f61793g, this.f61801k);
            this.f61726A = create;
            Y94<OperatorBirdMarkerClusterRendererFactory> create2 = OperatorBirdMarkerClusterRendererFactory_Impl.create(create);
            this.f61728B = create2;
            BirdMarkerClusterManager_Factory create3 = BirdMarkerClusterManager_Factory.create(this.f61801k, this.f61831z, create2);
            this.f61730C = create3;
            this.f61732D = BirdMarkerClusterManagerFactory_Impl.create(create3);
            this.f61734E = FleetMarkerOptionProvider_Factory.create(this.f61793g);
            BountyMarkerWithTimerOptionProvider_Factory create4 = BountyMarkerWithTimerOptionProvider_Factory.create(this.f61793g);
            this.f61736F = create4;
            BountyMarkerClusterRenderer_Factory create5 = BountyMarkerClusterRenderer_Factory.create(this.f61793g, this.f61734E, create4);
            this.f61738G = create5;
            Y94<BountyMarkerClusterRendererFactory> create6 = BountyMarkerClusterRendererFactory_Impl.create(create5);
            this.f61740H = create6;
            BountyMarkerClusterManager_Factory create7 = BountyMarkerClusterManager_Factory.create(create6);
            this.f61742I = create7;
            this.f61744J = BountyMarkerClusterManagerFactory_Impl.create(create7);
            NestMarkerClusterRenderer_Factory create8 = NestMarkerClusterRenderer_Factory.create(this.f61793g, this.f61801k);
            this.f61746K = create8;
            Y94<NestMarkerClusterRendererFactory> create9 = NestMarkerClusterRendererFactory_Impl.create(create8);
            this.f61748L = create9;
            NestMarkerClusterManager_Factory create10 = NestMarkerClusterManager_Factory.create(this.f61801k, create9);
            this.f61750M = create10;
            this.f61752N = NestMarkerClusterManagerFactory_Impl.create(create10);
            WarehouseMarkerClusterRenderer_Factory create11 = WarehouseMarkerClusterRenderer_Factory.create(this.f61793g);
            this.f61754O = create11;
            Y94<WarehouseMarkerClusterRendererFactory> create12 = WarehouseMarkerClusterRendererFactory_Impl.create(create11);
            this.f61756P = create12;
            WarehouseMarkerClusterManager_Factory create13 = WarehouseMarkerClusterManager_Factory.create(create12);
            this.f61758Q = create13;
            this.f61760R = WarehouseMarkerClusterManagerFactory_Impl.create(create13);
            ZoneMarkerClusterRenderer_Factory create14 = ZoneMarkerClusterRenderer_Factory.create(this.f61793g);
            this.f61762S = create14;
            Y94<ZoneMarkerClusterRendererFactory> create15 = ZoneMarkerClusterRendererFactory_Impl.create(create14);
            this.f61764T = create15;
            ZoneMarkerClusterManager_Factory create16 = ZoneMarkerClusterManager_Factory.create(create15);
            this.f61766U = create16;
            this.f61768V = ZoneMarkerClusterManagerFactory_Impl.create(create16);
            C13940J c13940j = new C13940J(interfaceC44393lG2);
            this.f61770W = c13940j;
            C35702Rm3 m86323a = C35702Rm3.m86323a(this.f61829y, this.f61801k, this.f61809o, this.f61732D, this.f61744J, this.f61752N, this.f61760R, this.f61768V, c13940j);
            this.f61772X = m86323a;
            this.f61774Y = C35468Qm3.m87947b(m86323a);
            this.f61776Z = new C13955g(interfaceC44393lG2);
            this.f61779a0 = new C13959k(interfaceC44393lG2);
            this.f61782b0 = new C13950b(interfaceC44393lG2);
            this.f61785c0 = new C13973y(interfaceC44393lG2);
            this.f61788d0 = new C13963o(interfaceC44393lG2);
            this.f61790e0 = new C13958j(interfaceC44393lG2);
            this.f61792f0 = new C13974z(interfaceC44393lG2);
            C13972x c13972x = new C13972x(interfaceC44393lG2);
            this.f61794g0 = c13972x;
            MapPresenterImpl_Factory create17 = MapPresenterImpl_Factory.create(this.f61770W, this.f61801k, this.f61776Z, this.f61779a0, this.f61782b0, this.f61785c0, this.f61799j, this.f61788d0, this.f61790e0, this.f61792f0, c13972x);
            this.f61796h0 = create17;
            this.f61798i0 = MapPresenterImplFactory_Impl.create(create17);
            this.f61800j0 = new C13944N(interfaceC44393lG2);
            this.f61802k0 = new C13956h(interfaceC44393lG2);
            this.f61804l0 = new C13945O(interfaceC44393lG2);
            this.f61806m0 = new C13931A(interfaceC44393lG2);
            this.f61808n0 = new C13957i(interfaceC44393lG2);
            this.f61810o0 = new C13970v(interfaceC44393lG2);
            this.f61812p0 = new C13968t(interfaceC44393lG2);
            this.f61814q0 = new C13948R(interfaceC44393lG2);
            this.f61816r0 = new C13936F(interfaceC44393lG2);
            this.f61818s0 = new C13942L(interfaceC44393lG2);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(dq3);
            this.f61820t0 = m44621a;
            C33884Js3 m99615a = C33884Js3.m99615a(this.f61800j0, this.f61790e0, this.f61802k0, this.f61804l0, this.f61801k, this.f61806m0, this.f61808n0, this.f61799j, this.f61810o0, this.f61807n, this.f61812p0, this.f61770W, this.f61814q0, this.f61816r0, this.f61805m, this.f61818s0, m44621a);
            this.f61822u0 = m99615a;
            this.f61824v0 = C33650Is3.m101575b(m99615a);
            this.f61826w0 = new C13960l(interfaceC44393lG2);
            this.f61828x0 = new C13962n(interfaceC44393lG2);
            C13961m c13961m = new C13961m(interfaceC44393lG2);
            this.f61830y0 = c13961m;
            this.f61832z0 = C4518Kf.m98626a(c13961m);
            this.f61727A0 = C13613cg.m61075a(this.f61793g);
            InterfaceC48812sj1 m44621a2 = C39546d52.m44621a(c32258Ct6);
            this.f61729B0 = m44621a2;
            this.f61731C0 = V51.m80429b(C36620Vk3.m79485a(this.f61830y0, this.f61789e, this.f61832z0, this.f61727A0, m44621a2));
            this.f61733D0 = C39546d52.m44621a(scopeProvider);
            C13937G c13937g = new C13937G(interfaceC44393lG2);
            this.f61735E0 = c13937g;
            C51193wk1 m6423a = C51193wk1.m6423a(this.f61826w0, this.f61801k, this.f61807n, this.f61799j, this.f61794g0, this.f61785c0, this.f61828x0, this.f61731C0, this.f61733D0, c13937g);
            this.f61737F0 = m6423a;
            this.f61739G0 = C50600vk1.m8209b(m6423a);
            C13971w c13971w = new C13971w(interfaceC44393lG2);
            this.f61741H0 = c13971w;
            this.f61743I0 = V51.m80429b(C36692Vs3.m79326a(this.f61776Z, c13971w, this.f61807n, this.f61820t0, this.f61801k, this.f61799j, this.f61797i, this.f61735E0));
            C13964p c13964p = new C13964p(interfaceC44393lG2);
            this.f61745J0 = c13964p;
            C31994Bq3 m113447a = C31994Bq3.m113447a(this.f61801k, this.f61770W, this.f61776Z, this.f61807n, c13964p, this.f61735E0);
            this.f61747K0 = m113447a;
            this.f61749L0 = C31760Aq3.m115118b(m113447a);
            C7921Tm m82991a = C7921Tm.m82991a(this.f61801k, this.f61793g, this.f61770W, this.f61776Z);
            this.f61751M0 = m82991a;
            C33335Hj3 m103490a = C33335Hj3.m103490a(this.f61776Z, this.f61805m, this.f61806m0, this.f61801k, this.f61797i, m82991a, this.f61735E0);
            this.f61753N0 = m103490a;
            this.f61755O0 = C32867Fj3.m106639b(m103490a);
            C34982Ok3 m91589a = C34982Ok3.m91589a(this.f61828x0, this.f61805m, this.f61806m0, I00.m103085a(), this.f61735E0, this.f61799j);
            this.f61757P0 = m91589a;
            this.f61759Q0 = C34748Nk3.m93498b(m91589a);
            this.f61761R0 = new C13967s(interfaceC44393lG2);
            this.f61763S0 = new C13966r(interfaceC44393lG2);
            InterfaceC48812sj1 m44621a3 = C39546d52.m44621a(lifecycleScopeProvider);
            this.f61765T0 = m44621a3;
            C46493oo3 m20479a = C46493oo3.m20479a(this.f61797i, this.f61761R0, this.f61763S0, this.f61805m, this.f61820t0, this.f61806m0, m44621a3, this.f61801k, this.f61735E0);
            this.f61767U0 = m20479a;
            this.f61769V0 = C36170Tm3.m82978b(m20479a);
            C13934D c13934d = new C13934D(interfaceC44393lG2);
            this.f61771W0 = c13934d;
            C47176px3 m18398a = C47176px3.m18398a(this.f61797i, this.f61805m, this.f61820t0, c13934d, this.f61801k, this.f61735E0, this.f61765T0);
            this.f61773X0 = m18398a;
            this.f61775Y0 = C46583ox3.m20236b(m18398a);
            this.f61777Z0 = new C13935E(interfaceC44393lG2);
        }

        /* renamed from: f */
        public final void m60281f(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, AndroidLifecycleScopeProvider androidLifecycleScopeProvider, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, NavigationView navigationView, FlightSheetContext flightSheetContext, Boolean bool, C29040u4 c29040u4, C32258Ct6 c32258Ct6, FragmentManager fragmentManager, AbstractC11719f abstractC11719f, DQ3 dq3) {
            C50343vI6 m8919a = C50343vI6.m8919a(this.f61807n);
            this.f61780a1 = m8919a;
            Y94<C35324Pw3> y94 = this.f61797i;
            C40663ey3 m42336a = C40663ey3.m42336a(y94, y94, this.f61777Z0, this.f61806m0, m8919a, this.f61801k, this.f61765T0);
            this.f61783b1 = m42336a;
            this.f61786c1 = C40070dy3.m43456b(m42336a);
        }

        /* renamed from: g */
        public final OperatorActivity m60280g(OperatorActivity operatorActivity) {
            C5135Ly.m96068n(operatorActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f61778a.mo27461w2()));
            C5135Ly.m96066p(operatorActivity, (C36207Tq4) C51679xZ3.m5003d(this.f61778a.mo27595B1()));
            C5135Ly.m96071k(operatorActivity, (Handler) C51679xZ3.m5003d(this.f61778a.mo27535X2()));
            C5135Ly.m96067o(operatorActivity, (C22454gl) C51679xZ3.m5003d(this.f61778a.mo27479r()));
            C5135Ly.m96080b(operatorActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f61778a.mo27519d0()));
            C5135Ly.m96075g(operatorActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f61778a.mo27453z2()));
            C5135Ly.m96064r(operatorActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f61778a.mo27459x1()));
            C5135Ly.m96081a(operatorActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f61778a.mo27474s()));
            C5135Ly.m96073i(operatorActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f61778a.mo27558P0()));
            C5135Ly.m96074h(operatorActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f61778a.mo27598A0()));
            C5135Ly.m96077e(operatorActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f61778a.mo27507i0()));
            C5135Ly.m96070l(operatorActivity, (FO2) C51679xZ3.m5003d(this.f61778a.mo27456y2()));
            C5135Ly.m96065q(operatorActivity, (YR4) C51679xZ3.m5003d(this.f61778a.mo27525b0()));
            C5135Ly.m96079c(operatorActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f61778a.mo27460x()));
            C5135Ly.m96078d(operatorActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f61778a.mo27517d3()));
            C5135Ly.m96072j(operatorActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f61778a.mo27482q()));
            C5135Ly.m96076f(operatorActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f61778a.mo27483p3()));
            C46433oi3.m20583d(operatorActivity, (BK2) C51679xZ3.m5003d(this.f61778a.mo24043m()));
            C46433oi3.m20572o(operatorActivity, this.f61797i.get());
            C46433oi3.m20579h(operatorActivity, this.f61827x.get());
            C46433oi3.m20581f(operatorActivity, this.f61774Y.get());
            C46433oi3.m20582e(operatorActivity, this.f61798i0.get());
            C46433oi3.m20574m(operatorActivity, this.f61824v0.get());
            C46433oi3.m20584c(operatorActivity, (Handler) C51679xZ3.m5003d(this.f61778a.mo27535X2()));
            C46433oi3.m20568s(operatorActivity, (InterfaceC49820uQ3) C51679xZ3.m5003d(this.f61778a.mo27567M()));
            C46433oi3.m20567t(operatorActivity, (InterfaceC35660Rh6) C51679xZ3.m5003d(this.f61778a.mo27500k1()));
            C46433oi3.m20585b(operatorActivity, m60283d());
            C46433oi3.m20586a(operatorActivity, this.f61739G0.get());
            C46433oi3.m20578i(operatorActivity, this.f61739G0.get());
            C46433oi3.m20573n(operatorActivity, this.f61743I0.get());
            C46433oi3.m20569r(operatorActivity, this.f61749L0.get());
            C46433oi3.m20577j(operatorActivity, this.f61755O0.get());
            C46433oi3.m20576k(operatorActivity, this.f61759Q0.get());
            C46433oi3.m20575l(operatorActivity, this.f61769V0.get());
            C46433oi3.m20571p(operatorActivity, this.f61775Y0.get());
            C46433oi3.m20570q(operatorActivity, this.f61786c1.get());
            return operatorActivity;
        }

        /* renamed from: h */
        public final C42826id4 m60279h() {
            return new C42826id4((InterfaceC1880Ea) C51679xZ3.m5003d(this.f61778a.mo27519d0()));
        }

        public C13930b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, AndroidLifecycleScopeProvider androidLifecycleScopeProvider, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, NavigationView navigationView, FlightSheetContext flightSheetContext, Boolean bool, C29040u4 c29040u4, C32258Ct6 c32258Ct6, FragmentManager fragmentManager, AbstractC11719f abstractC11719f, DQ3 dq3) {
            this.f61787d = this;
            this.f61778a = interfaceC44393lG2;
            this.f61781b = scopeProvider;
            this.f61784c = flightSheetContext;
            m60282e(interfaceC44393lG2, baseActivity, scopeProvider, androidLifecycleScopeProvider, lifecycleScopeProvider, navigationView, flightSheetContext, bool, c29040u4, c32258Ct6, fragmentManager, abstractC11719f, dq3);
            m60281f(interfaceC44393lG2, baseActivity, scopeProvider, androidLifecycleScopeProvider, lifecycleScopeProvider, navigationView, flightSheetContext, bool, c29040u4, c32258Ct6, fragmentManager, abstractC11719f, dq3);
        }
    }

    private C13928a() {
    }

    /* renamed from: a */
    public static OperatorActivity.InterfaceC13918b.InterfaceC13919a m60288a() {
        return new C13929a();
    }
}
