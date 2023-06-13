package co.bird.android.app.feature.ride.activity;

import android.content.Context;
import android.hardware.SensorManager;
import android.os.Handler;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC11719f;
import co.bird.android.app.feature.autopay.C13674a;
import co.bird.android.app.feature.autopay.C13681e;
import co.bird.android.app.feature.autopay.C13682f;
import co.bird.android.app.feature.autopay.InterfaceC13680d;
import co.bird.android.app.feature.map.cluster.bird.BirdClusterManagerFactory;
import co.bird.android.app.feature.map.cluster.bird.BirdClusterManagerFactory_Impl;
import co.bird.android.app.feature.map.cluster.bird.BirdClusterManager_Factory;
import co.bird.android.app.feature.map.presenter.MapPresenterImplFactory;
import co.bird.android.app.feature.map.presenter.MapPresenterImplFactory_Impl;
import co.bird.android.app.feature.map.presenter.MapPresenterImpl_Factory;
import co.bird.android.app.feature.map.renderer.BirdClusterRendererFactory;
import co.bird.android.app.feature.map.renderer.BirdClusterRendererFactory_Impl;
import co.bird.android.app.feature.map.renderer.BirdClusterRenderer_Factory;
import co.bird.android.app.feature.map.renderer.OperatorClusterRendererFactory;
import co.bird.android.app.feature.map.renderer.OperatorClusterRendererFactory_Impl;
import co.bird.android.app.feature.map.renderer.OperatorClusterRenderer_Factory;
import co.bird.android.app.feature.ride.activity.RideActivity;
import co.bird.android.core.mvp.BaseActivity;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: co.bird.android.app.feature.ride.activity.a */
/* loaded from: classes2.dex */
public final class C14229a {

    /* renamed from: co.bird.android.app.feature.ride.activity.a$a */
    /* loaded from: classes2.dex */
    public static final class C14230a implements RideActivity.InterfaceC14212c.InterfaceC14213a {
        @Override // co.bird.android.app.feature.ride.activity.RideActivity.InterfaceC14212c.InterfaceC14213a
        /* renamed from: a */
        public RideActivity.InterfaceC14212c mo59538a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, C2136F5 c2136f5, C32492Dt6 c32492Dt6, FragmentManager fragmentManager, AbstractC11719f abstractC11719f, DQ3 dq3) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(lifecycleScopeProvider);
            C51679xZ3.m5005b(c2136f5);
            C51679xZ3.m5005b(c32492Dt6);
            C51679xZ3.m5005b(fragmentManager);
            C51679xZ3.m5005b(abstractC11719f);
            C51679xZ3.m5005b(dq3);
            return new C14231b(interfaceC44393lG2, baseActivity, scopeProvider, lifecycleScopeProvider, c2136f5, c32492Dt6, fragmentManager, abstractC11719f, dq3);
        }

        private C14230a() {
        }
    }

    /* renamed from: co.bird.android.app.feature.ride.activity.a$b */
    /* loaded from: classes2.dex */
    public static final class C14231b implements RideActivity.InterfaceC14212c {

        /* renamed from: A */
        public Y94<InterfaceC6097Oh> f62437A;

        /* renamed from: A0 */
        public Y94<InterfaceC27246pJ> f62438A0;

        /* renamed from: A1 */
        public Y94<InterfaceC38968c85> f62439A1;

        /* renamed from: B */
        public Y94<InterfaceC44647lh6> f62440B;

        /* renamed from: B0 */
        public Y94<InterfaceC44573la2> f62441B0;

        /* renamed from: B1 */
        public Y94<InterfaceC23227iO> f62442B1;

        /* renamed from: C */
        public Y94<InterfaceC47617qi1> f62443C;

        /* renamed from: C0 */
        public Y94<MK4> f62444C0;

        /* renamed from: C1 */
        public OQ2 f62445C1;

        /* renamed from: D */
        public LU2 f62446D;

        /* renamed from: D0 */
        public Y94<InterfaceC52458ys0> f62447D0;

        /* renamed from: D1 */
        public Y94<MQ2> f62448D1;

        /* renamed from: E */
        public Y94<JU2> f62449E;

        /* renamed from: E0 */
        public Y94<AbstractC39873de5> f62450E0;

        /* renamed from: E1 */
        public C37762a65 f62451E1;

        /* renamed from: F */
        public C13682f f62452F;

        /* renamed from: F0 */
        public Y94<V74> f62453F0;

        /* renamed from: F1 */
        public Y94<Y55> f62454F1;

        /* renamed from: G */
        public Y94<InterfaceC13680d> f62455G;

        /* renamed from: G0 */
        public Y94<InterfaceC31893Bf1> f62456G0;

        /* renamed from: G1 */
        public LU4 f62457G1;

        /* renamed from: H */
        public Y94<InterfaceC32604Eg1> f62458H;

        /* renamed from: H0 */
        public Y94<Handler> f62459H0;

        /* renamed from: H1 */
        public Y94<JU4> f62460H1;

        /* renamed from: I */
        public C25032jr f62461I;

        /* renamed from: I0 */
        public Y94<InterfaceC46820pM3> f62462I0;

        /* renamed from: I1 */
        public C24814jP f62463I1;

        /* renamed from: J */
        public Y94<InterfaceC22771hr> f62464J;

        /* renamed from: J0 */
        public Y94<NP4> f62465J0;

        /* renamed from: J1 */
        public Y94<InterfaceC22636hP> f62466J1;

        /* renamed from: K */
        public Y94<C13674a> f62467K;

        /* renamed from: K0 */
        public Y94<XW2> f62468K0;

        /* renamed from: K1 */
        public C47215q13 f62469K1;

        /* renamed from: L */
        public Y94<C34192La5> f62470L;

        /* renamed from: L0 */
        public ZX4 f62471L0;

        /* renamed from: L1 */
        public Y94<InterfaceC46029o13> f62472L1;

        /* renamed from: M */
        public Y94<InterfaceC44791lw0> f62473M;

        /* renamed from: M0 */
        public Y94<XX4> f62474M0;

        /* renamed from: M1 */
        public C34695Ne4 f62475M1;

        /* renamed from: N */
        public C38629ba5 f62476N;

        /* renamed from: N0 */
        public Y94<InterfaceC52757zN3> f62477N0;

        /* renamed from: N1 */
        public Y94<InterfaceC34227Le4> f62478N1;

        /* renamed from: O */
        public Y94<Z95> f62479O;

        /* renamed from: O0 */
        public Y94<InterfaceC46164oF3> f62480O0;

        /* renamed from: O1 */
        public C49951ue4 f62481O1;

        /* renamed from: P */
        public Y94<InterfaceC25921m9> f62482P;

        /* renamed from: P0 */
        public Y94<InterfaceC31951Bl5> f62483P0;

        /* renamed from: P1 */
        public Y94<InterfaceC48765se4> f62484P1;

        /* renamed from: Q */
        public C0042A9 f62485Q;

        /* renamed from: Q0 */
        public Y94<InterfaceC36821Wg6> f62486Q0;

        /* renamed from: Q1 */
        public C34111Kr5 f62487Q1;

        /* renamed from: R */
        public Y94<InterfaceC30430y9> f62488R;

        /* renamed from: R0 */
        public Y94<InterfaceC7807TL> f62489R0;

        /* renamed from: R1 */
        public Y94<InterfaceC33643Ir5> f62490R1;

        /* renamed from: S */
        public Y94<InterfaceC32292Cx4> f62491S;

        /* renamed from: S0 */
        public Y94<InterfaceC34441Mc2> f62492S0;

        /* renamed from: S1 */
        public Y94<InterfaceC27649qg> f62493S1;

        /* renamed from: T */
        public Y94<InterfaceC40001dr4> f62494T;

        /* renamed from: T0 */
        public Y94<C51174wi2> f62495T0;

        /* renamed from: T1 */
        public Y94<NV0> f62496T1;

        /* renamed from: U */
        public Y94<GI3> f62497U;

        /* renamed from: U0 */
        public Y94<InterfaceC28816tm> f62498U0;

        /* renamed from: U1 */
        public C9436Xf f62499U1;

        /* renamed from: V */
        public Y94<InterfaceC47256q54> f62500V;

        /* renamed from: V0 */
        public N25 f62501V0;

        /* renamed from: V1 */
        public Y94<InterfaceC8716Vf> f62502V1;

        /* renamed from: W */
        public Y94<Z85> f62503W;

        /* renamed from: W0 */
        public Y94<L25> f62504W0;

        /* renamed from: W1 */
        public Y94<InterfaceC49950ue3> f62505W1;

        /* renamed from: X */
        public Y94<WX2> f62506X;

        /* renamed from: X0 */
        public Y94<J35> f62507X0;

        /* renamed from: X1 */
        public C43566js1 f62508X1;

        /* renamed from: Y */
        public Y94<InterfaceC37961aS2> f62509Y;

        /* renamed from: Y0 */
        public Y94<InterfaceC42586iD1> f62510Y0;

        /* renamed from: Y1 */
        public Y94<InterfaceC42380hs1> f62511Y1;

        /* renamed from: Z */
        public Y94<InterfaceC35583Qz1> f62512Z;

        /* renamed from: Z0 */
        public Y94<InterfaceC44637lg6> f62513Z0;

        /* renamed from: Z1 */
        public Y94<InterfaceC20792gH> f62514Z1;

        /* renamed from: a */
        public final InterfaceC44393lG2 f62515a;

        /* renamed from: a0 */
        public Y94<WU4> f62516a0;

        /* renamed from: a1 */
        public Y94<VM3> f62517a1;

        /* renamed from: a2 */
        public C43105j54 f62518a2;

        /* renamed from: b */
        public final C14231b f62519b;

        /* renamed from: b0 */
        public Y94<InterfaceC4077JQ> f62520b0;

        /* renamed from: b1 */
        public Y94<InterfaceC45102mT1> f62521b1;

        /* renamed from: b2 */
        public Y94<InterfaceC41919h54> f62522b2;

        /* renamed from: c */
        public Y94<YR4> f62523c;

        /* renamed from: c0 */
        public Y94<InterfaceC35660Rh6> f62524c0;

        /* renamed from: c1 */
        public YJ4 f62525c1;

        /* renamed from: c2 */
        public Y94<InterfaceC51545xK4> f62526c2;

        /* renamed from: d */
        public Y94<C22454gl> f62527d;

        /* renamed from: d0 */
        public Y94<DQ3> f62528d0;

        /* renamed from: d1 */
        public Y94<WJ4> f62529d1;

        /* renamed from: d2 */
        public C40289eL4 f62530d2;

        /* renamed from: e */
        public Y94<C36207Tq4> f62531e;

        /* renamed from: e0 */
        public K03 f62532e0;

        /* renamed from: e1 */
        public CL4 f62533e1;

        /* renamed from: e2 */
        public Y94<InterfaceC39086cL4> f62534e2;

        /* renamed from: f */
        public Y94<InterfaceC1880Ea> f62535f;

        /* renamed from: f0 */
        public Y94<F03> f62536f0;

        /* renamed from: f1 */
        public Y94<AL4> f62537f1;

        /* renamed from: f2 */
        public C5288MO f62538f2;

        /* renamed from: g */
        public Y94<Context> f62539g;

        /* renamed from: g0 */
        public C46300oU4 f62540g0;

        /* renamed from: g1 */
        public C41264fz1 f62541g1;

        /* renamed from: g2 */
        public Y94<InterfaceC4417KO> f62542g2;

        /* renamed from: h */
        public Y94<InterfaceC41018fa5> f62543h;

        /* renamed from: h0 */
        public Y94<InterfaceC45114mU4> f62544h0;

        /* renamed from: h1 */
        public Y94<InterfaceC40078dz1> f62545h1;

        /* renamed from: h2 */
        public C43116j65 f62546h2;

        /* renamed from: i */
        public C30948zG f62547i;

        /* renamed from: i0 */
        public Y94<InterfaceC42524i66> f62548i0;

        /* renamed from: i1 */
        public JP4 f62549i1;

        /* renamed from: i2 */
        public Y94<InterfaceC41930h65> f62550i2;

        /* renamed from: j */
        public Y94<InterfaceC30074xG> f62551j;

        /* renamed from: j0 */
        public BirdClusterRenderer_Factory f62552j0;

        /* renamed from: j1 */
        public Y94<HP4> f62553j1;

        /* renamed from: j2 */
        public C51690xa5 f62554j2;

        /* renamed from: k */
        public C29163uG f62555k;

        /* renamed from: k0 */
        public Y94<BirdClusterRendererFactory> f62556k0;

        /* renamed from: k1 */
        public C43217jH3 f62557k1;

        /* renamed from: k2 */
        public Y94<InterfaceC50504va5> f62558k2;

        /* renamed from: l */
        public Y94<InterfaceC28249sG> f62559l;

        /* renamed from: l0 */
        public OperatorClusterRenderer_Factory f62560l0;

        /* renamed from: l1 */
        public Y94<InterfaceC42031hH3> f62561l1;

        /* renamed from: l2 */
        public Y94<InterfaceC36149Tk0> f62562l2;

        /* renamed from: m */
        public C37000Xa5 f62563m;

        /* renamed from: m0 */
        public Y94<OperatorClusterRendererFactory> f62564m0;

        /* renamed from: m1 */
        public Y94<JT0> f62565m1;

        /* renamed from: m2 */
        public Y94<BaseActivity> f62566m2;

        /* renamed from: n */
        public Y94<InterfaceC36532Va5> f62567n;

        /* renamed from: n0 */
        public BirdClusterManager_Factory f62568n0;

        /* renamed from: n1 */
        public ET0 f62569n1;

        /* renamed from: n2 */
        public Y94<InterfaceC36187To2> f62570n2;

        /* renamed from: o */
        public C52009y65 f62571o;

        /* renamed from: o0 */
        public Y94<BirdClusterManagerFactory> f62572o0;

        /* renamed from: o1 */
        public Y94<CT0> f62573o1;

        /* renamed from: o2 */
        public Y94<C2136F5> f62574o2;

        /* renamed from: p */
        public Y94<InterfaceC50823w65> f62575p;

        /* renamed from: p0 */
        public K95 f62576p0;

        /* renamed from: p1 */
        public HD0 f62577p1;

        /* renamed from: p2 */
        public Y94<C32492Dt6> f62578p2;

        /* renamed from: q */
        public Y94<InterfaceC40099e13> f62579q;

        /* renamed from: q0 */
        public Y94<I95> f62580q0;

        /* renamed from: q1 */
        public Y94<FD0> f62581q1;

        /* renamed from: q2 */
        public Y94<C4176Jf> f62582q2;

        /* renamed from: r */
        public Y94<InterfaceC46193oI5> f62583r;

        /* renamed from: r0 */
        public Y94<InterfaceC12495bn> f62584r0;

        /* renamed from: r1 */
        public C46803pK4 f62585r1;

        /* renamed from: r2 */
        public Y94<C12470bg> f62586r2;

        /* renamed from: s */
        public Y94<InterfaceC37014Xc1> f62587s;

        /* renamed from: s0 */
        public Y94<InterfaceC33117Gl1> f62588s0;

        /* renamed from: s1 */
        public Y94<InterfaceC45617nK4> f62589s1;

        /* renamed from: s2 */
        public Y94<Y75> f62590s2;

        /* renamed from: t */
        public C39157cT3 f62591t;

        /* renamed from: t0 */
        public Y94<SensorManager> f62592t0;

        /* renamed from: t1 */
        public NH3 f62593t1;

        /* renamed from: t2 */
        public Y94<ScopeProvider> f62594t2;

        /* renamed from: u */
        public Y94<InterfaceC37971aT3> f62595u;

        /* renamed from: u0 */
        public Y94<InterfaceC46893pU4> f62596u0;

        /* renamed from: u1 */
        public Y94<LH3> f62597u1;

        /* renamed from: u2 */
        public C51193wk1 f62598u2;

        /* renamed from: v */
        public C47860r65 f62599v;

        /* renamed from: v0 */
        public Y94<InterfaceC42163hW0> f62600v0;

        /* renamed from: v1 */
        public C51165wh3 f62601v1;

        /* renamed from: v2 */
        public Y94<InterfaceC50008uk1> f62602v2;

        /* renamed from: w */
        public Y94<InterfaceC46674p65> f62603w;

        /* renamed from: w0 */
        public Y94<InterfaceC10636aM> f62604w0;

        /* renamed from: w1 */
        public Y94<InterfaceC49980uh3> f62605w1;

        /* renamed from: x */
        public Y94<C52602z65> f62606x;

        /* renamed from: x0 */
        public Y94<InterfaceC47297q95> f62607x0;

        /* renamed from: x1 */
        public ZF3 f62608x1;

        /* renamed from: y */
        public N65 f62609y;

        /* renamed from: y0 */
        public MapPresenterImpl_Factory f62610y0;

        /* renamed from: y1 */
        public Y94<XF3> f62611y1;

        /* renamed from: z */
        public Y94<L65> f62612z;

        /* renamed from: z0 */
        public Y94<MapPresenterImplFactory> f62613z0;

        /* renamed from: z1 */
        public C40171e85 f62614z1;

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$A */
        /* loaded from: classes2.dex */
        public static final class C14232A implements Y94<InterfaceC31893Bf1> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62615a;

            public C14232A(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62615a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC31893Bf1 get() {
                return (InterfaceC31893Bf1) C51679xZ3.m5003d(this.f62615a.mo27458y0());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$B */
        /* loaded from: classes2.dex */
        public static final class C14233B implements Y94<InterfaceC47617qi1> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62616a;

            public C14233B(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62616a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC47617qi1 get() {
                return (InterfaceC47617qi1) C51679xZ3.m5003d(this.f62616a.mo27558P0());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$C */
        /* loaded from: classes2.dex */
        public static final class C14234C implements Y94<InterfaceC35583Qz1> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62617a;

            public C14234C(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62617a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC35583Qz1 get() {
                return (InterfaceC35583Qz1) C51679xZ3.m5003d(this.f62617a.mo27544V());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$D */
        /* loaded from: classes2.dex */
        public static final class C14235D implements Y94<InterfaceC42586iD1> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62618a;

            public C14235D(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62618a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC42586iD1 get() {
                return (InterfaceC42586iD1) C51679xZ3.m5003d(this.f62618a.mo27539W2());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$E */
        /* loaded from: classes2.dex */
        public static final class C14236E implements Y94<InterfaceC44573la2> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62619a;

            public C14236E(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62619a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC44573la2 get() {
                return (InterfaceC44573la2) C51679xZ3.m5003d(this.f62619a.mo27532Y1());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$F */
        /* loaded from: classes2.dex */
        public static final class C14237F implements Y94<InterfaceC34441Mc2> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62620a;

            public C14237F(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62620a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC34441Mc2 get() {
                return (InterfaceC34441Mc2) C51679xZ3.m5003d(this.f62620a.mo27475r3());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$G */
        /* loaded from: classes2.dex */
        public static final class C14238G implements Y94<InterfaceC37961aS2> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62621a;

            public C14238G(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62621a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC37961aS2 get() {
                return (InterfaceC37961aS2) C51679xZ3.m5003d(this.f62621a.mo27550S1());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$H */
        /* loaded from: classes2.dex */
        public static final class C14239H implements Y94<XW2> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62622a;

            public C14239H(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62622a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public XW2 get() {
                return (XW2) C51679xZ3.m5003d(this.f62622a.mo27547U0());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$I */
        /* loaded from: classes2.dex */
        public static final class C14240I implements Y94<WX2> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62623a;

            public C14240I(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62623a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public WX2 get() {
                return (WX2) C51679xZ3.m5003d(this.f62623a.mo27579H0());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$J */
        /* loaded from: classes2.dex */
        public static final class C14241J implements Y94<InterfaceC46164oF3> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62624a;

            public C14241J(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62624a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC46164oF3 get() {
                return (InterfaceC46164oF3) C51679xZ3.m5003d(this.f62624a.mo27587D2());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$K */
        /* loaded from: classes2.dex */
        public static final class C14242K implements Y94<GI3> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62625a;

            public C14242K(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62625a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public GI3 get() {
                return (GI3) C51679xZ3.m5003d(this.f62625a.mo27565M2());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$L */
        /* loaded from: classes2.dex */
        public static final class C14243L implements Y94<InterfaceC46820pM3> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62626a;

            public C14243L(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62626a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC46820pM3 get() {
                return (InterfaceC46820pM3) C51679xZ3.m5003d(this.f62626a.mo27573K());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$M */
        /* loaded from: classes2.dex */
        public static final class C14244M implements Y94<VM3> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62627a;

            public C14244M(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62627a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public VM3 get() {
                return (VM3) C51679xZ3.m5003d(this.f62627a.mo27585F());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$N */
        /* loaded from: classes2.dex */
        public static final class C14245N implements Y94<InterfaceC52757zN3> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62628a;

            public C14245N(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62628a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC52757zN3 get() {
                return (InterfaceC52757zN3) C51679xZ3.m5003d(this.f62628a.mo27518d2());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$O */
        /* loaded from: classes2.dex */
        public static final class C14246O implements Y94<V74> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62629a;

            public C14246O(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62629a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public V74 get() {
                return (V74) C51679xZ3.m5003d(this.f62629a.mo27548U());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$P */
        /* loaded from: classes2.dex */
        public static final class C14247P implements Y94<InterfaceC32292Cx4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62630a;

            public C14247P(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62630a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC32292Cx4 get() {
                return (InterfaceC32292Cx4) C51679xZ3.m5003d(this.f62630a.mo27506i2());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$Q */
        /* loaded from: classes2.dex */
        public static final class C14248Q implements Y94<InterfaceC51545xK4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62631a;

            public C14248Q(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62631a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC51545xK4 get() {
                return (InterfaceC51545xK4) C51679xZ3.m5003d(this.f62631a.mo27494m0());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$R */
        /* loaded from: classes2.dex */
        public static final class C14249R implements Y94<MK4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62632a;

            public C14249R(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62632a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public MK4 get() {
                return (MK4) C51679xZ3.m5003d(this.f62632a.mo27577I0());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$S */
        /* loaded from: classes2.dex */
        public static final class C14250S implements Y94<NP4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62633a;

            public C14250S(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62633a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public NP4 get() {
                return (NP4) C51679xZ3.m5003d(this.f62633a.mo27530Z());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$T */
        /* loaded from: classes2.dex */
        public static final class C14251T implements Y94<YR4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62634a;

            public C14251T(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62634a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public YR4 get() {
                return (YR4) C51679xZ3.m5003d(this.f62634a.mo27525b0());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$U */
        /* loaded from: classes2.dex */
        public static final class C14252U implements Y94<InterfaceC46893pU4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62635a;

            public C14252U(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62635a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC46893pU4 get() {
                return (InterfaceC46893pU4) C51679xZ3.m5003d(this.f62635a.mo27566M0());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$V */
        /* loaded from: classes2.dex */
        public static final class C14253V implements Y94<WU4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62636a;

            public C14253V(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62636a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public WU4 get() {
                return (WU4) C51679xZ3.m5003d(this.f62636a.mo27457y1());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$W */
        /* loaded from: classes2.dex */
        public static final class C14254W implements Y94<J35> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62637a;

            public C14254W(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62637a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public J35 get() {
                return (J35) C51679xZ3.m5003d(this.f62637a.mo27555Q1());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$X */
        /* loaded from: classes2.dex */
        public static final class C14255X implements Y94<InterfaceC47297q95> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62638a;

            public C14255X(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62638a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC47297q95 get() {
                return (InterfaceC47297q95) C51679xZ3.m5003d(this.f62638a.mo27495l3());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$Y */
        /* loaded from: classes2.dex */
        public static final class C14256Y implements Y94<InterfaceC41018fa5> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62639a;

            public C14256Y(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62639a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC41018fa5 get() {
                return (InterfaceC41018fa5) C51679xZ3.m5003d(this.f62639a.mo27511g0());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$Z */
        /* loaded from: classes2.dex */
        public static final class C14257Z implements Y94<InterfaceC31951Bl5> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62640a;

            public C14257Z(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62640a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC31951Bl5 get() {
                return (InterfaceC31951Bl5) C51679xZ3.m5003d(this.f62640a.mo27564N());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$a */
        /* loaded from: classes2.dex */
        public static final class C14258a implements Y94<InterfaceC1880Ea> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62641a;

            public C14258a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62641a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC1880Ea get() {
                return (InterfaceC1880Ea) C51679xZ3.m5003d(this.f62641a.mo27519d0());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$a0 */
        /* loaded from: classes2.dex */
        public static final class C14259a0 implements Y94<InterfaceC46193oI5> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62642a;

            public C14259a0(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62642a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC46193oI5 get() {
                return (InterfaceC46193oI5) C51679xZ3.m5003d(this.f62642a.mo27454z1());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$b */
        /* loaded from: classes2.dex */
        public static final class C14260b implements Y94<SensorManager> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62643a;

            public C14260b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62643a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public SensorManager get() {
                return (SensorManager) C51679xZ3.m5003d(this.f62643a.mo27499k2());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$b0 */
        /* loaded from: classes2.dex */
        public static final class C14261b0 implements Y94<InterfaceC42524i66> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62644a;

            public C14261b0(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62644a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC42524i66 get() {
                return (InterfaceC42524i66) C51679xZ3.m5003d(this.f62644a.mo27562N1());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$c */
        /* loaded from: classes2.dex */
        public static final class C14262c implements Y94<InterfaceC6097Oh> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62645a;

            public C14262c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62645a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC6097Oh get() {
                return (InterfaceC6097Oh) C51679xZ3.m5003d(this.f62645a.mo27470t0());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$c0 */
        /* loaded from: classes2.dex */
        public static final class C14263c0 implements Y94<InterfaceC36821Wg6> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62646a;

            public C14263c0(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62646a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC36821Wg6 get() {
                return (InterfaceC36821Wg6) C51679xZ3.m5003d(this.f62646a.mo27580H());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$d */
        /* loaded from: classes2.dex */
        public static final class C14264d implements Y94<C22454gl> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62647a;

            public C14264d(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62647a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C22454gl get() {
                return (C22454gl) C51679xZ3.m5003d(this.f62647a.mo27479r());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$d0 */
        /* loaded from: classes2.dex */
        public static final class C14265d0 implements Y94<InterfaceC35660Rh6> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62648a;

            public C14265d0(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62648a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC35660Rh6 get() {
                return (InterfaceC35660Rh6) C51679xZ3.m5003d(this.f62648a.mo27500k1());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$e */
        /* loaded from: classes2.dex */
        public static final class C14266e implements Y94<Context> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62649a;

            public C14266e(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62649a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public Context get() {
                return (Context) C51679xZ3.m5003d(this.f62649a.mo27552R1());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$e0 */
        /* loaded from: classes2.dex */
        public static final class C14267e0 implements Y94<InterfaceC45102mT1> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62650a;

            public C14267e0(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62650a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC45102mT1 get() {
                return (InterfaceC45102mT1) C51679xZ3.m5003d(this.f62650a.mo27568L1());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$f */
        /* loaded from: classes2.dex */
        public static final class C14268f implements Y94<InterfaceC12495bn> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62651a;

            public C14268f(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62651a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC12495bn get() {
                return (InterfaceC12495bn) C51679xZ3.m5003d(this.f62651a.mo27516e0());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$f0 */
        /* loaded from: classes2.dex */
        public static final class C14269f0 implements Y94<Handler> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62652a;

            public C14269f0(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62652a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public Handler get() {
                return (Handler) C51679xZ3.m5003d(this.f62652a.mo27535X2());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$g */
        /* loaded from: classes2.dex */
        public static final class C14270g implements Y94<InterfaceC27246pJ> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62653a;

            public C14270g(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62653a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC27246pJ get() {
                return (InterfaceC27246pJ) C51679xZ3.m5003d(this.f62653a.mo27517d3());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$g0 */
        /* loaded from: classes2.dex */
        public static final class C14271g0 implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62654a;

            public C14271g0(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62654a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f62654a.mo27461w2());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$h */
        /* loaded from: classes2.dex */
        public static final class C14272h implements Y94<InterfaceC10636aM> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62655a;

            public C14272h(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62655a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC10636aM get() {
                return (InterfaceC10636aM) C51679xZ3.m5003d(this.f62655a.mo27460x());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$h0 */
        /* loaded from: classes2.dex */
        public static final class C14273h0 implements Y94<InterfaceC49950ue3> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62656a;

            public C14273h0(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62656a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC49950ue3 get() {
                return (InterfaceC49950ue3) C51679xZ3.m5003d(this.f62656a.mo27472s3());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$i */
        /* loaded from: classes2.dex */
        public static final class C14274i implements Y94<InterfaceC32604Eg1> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62657a;

            public C14274i(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62657a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC32604Eg1 get() {
                return (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f62657a.mo27453z2());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$i0 */
        /* loaded from: classes2.dex */
        public static final class C14275i0 implements Y94<InterfaceC47256q54> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62658a;

            public C14275i0(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62658a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC47256q54 get() {
                return (InterfaceC47256q54) C51679xZ3.m5003d(this.f62658a.mo27582F2());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$j */
        /* loaded from: classes2.dex */
        public static final class C14276j implements Y94<InterfaceC33117Gl1> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62659a;

            public C14276j(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62659a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC33117Gl1 get() {
                return (InterfaceC33117Gl1) C51679xZ3.m5003d(this.f62659a.mo27480q3());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$j0 */
        /* loaded from: classes2.dex */
        public static final class C14277j0 implements Y94<C36207Tq4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62660a;

            public C14277j0(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62660a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C36207Tq4 get() {
                return (C36207Tq4) C51679xZ3.m5003d(this.f62660a.mo27595B1());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$k */
        /* loaded from: classes2.dex */
        public static final class C14278k implements Y94<InterfaceC25921m9> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62661a;

            public C14278k(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62661a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC25921m9 get() {
                return (InterfaceC25921m9) C51679xZ3.m5003d(this.f62661a.mo27551S0());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$k0 */
        /* loaded from: classes2.dex */
        public static final class C14279k0 implements Y94<InterfaceC40001dr4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62662a;

            public C14279k0(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62662a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40001dr4 get() {
                return (InterfaceC40001dr4) C51679xZ3.m5003d(this.f62662a.mo27482q());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$l */
        /* loaded from: classes2.dex */
        public static final class C14280l implements Y94<InterfaceC27649qg> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62663a;

            public C14280l(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62663a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC27649qg get() {
                return (InterfaceC27649qg) C51679xZ3.m5003d(this.f62663a.mo27476r2());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$l0 */
        /* loaded from: classes2.dex */
        public static final class C14281l0 implements Y94<Z85> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62664a;

            public C14281l0(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62664a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public Z85 get() {
                return (Z85) C51679xZ3.m5003d(this.f62664a.mo27497l0());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$m */
        /* loaded from: classes2.dex */
        public static final class C14282m implements Y94<InterfaceC28816tm> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62665a;

            public C14282m(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62665a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC28816tm get() {
                return (InterfaceC28816tm) C51679xZ3.m5003d(this.f62665a.mo27599A());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$m0 */
        /* loaded from: classes2.dex */
        public static final class C14283m0 implements Y94<AbstractC39873de5> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62666a;

            public C14283m0(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62666a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public AbstractC39873de5 get() {
                return (AbstractC39873de5) C51679xZ3.m5003d(this.f62666a.mo27512g());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$n */
        /* loaded from: classes2.dex */
        public static final class C14284n implements Y94<InterfaceC36187To2> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62667a;

            public C14284n(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62667a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC36187To2 get() {
                return (InterfaceC36187To2) C51679xZ3.m5003d(this.f62667a.mo27527a1());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$n0 */
        /* loaded from: classes2.dex */
        public static final class C14285n0 implements Y94<InterfaceC44637lg6> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62668a;

            public C14285n0(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62668a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC44637lg6 get() {
                return (InterfaceC44637lg6) C51679xZ3.m5003d(this.f62668a.mo27474s());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$o */
        /* loaded from: classes2.dex */
        public static final class C14286o implements Y94<InterfaceC20792gH> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62669a;

            public C14286o(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62669a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC20792gH get() {
                return (InterfaceC20792gH) C51679xZ3.m5003d(this.f62669a.mo27502j3());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$o0 */
        /* loaded from: classes2.dex */
        public static final class C14287o0 implements Y94<InterfaceC44647lh6> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62670a;

            public C14287o0(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62670a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC44647lh6 get() {
                return (InterfaceC44647lh6) C51679xZ3.m5003d(this.f62670a.mo27459x1());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$p */
        /* loaded from: classes2.dex */
        public static final class C14288p implements Y94<InterfaceC7807TL> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62671a;

            public C14288p(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62671a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC7807TL get() {
                return (InterfaceC7807TL) C51679xZ3.m5003d(this.f62671a.mo27514f0());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$q */
        /* loaded from: classes2.dex */
        public static final class C14289q implements Y94<InterfaceC23227iO> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62672a;

            public C14289q(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62672a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC23227iO get() {
                return (InterfaceC23227iO) C51679xZ3.m5003d(this.f62672a.mo27536X1());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$r */
        /* loaded from: classes2.dex */
        public static final class C14290r implements Y94<InterfaceC4077JQ> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62673a;

            public C14290r(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62673a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC4077JQ get() {
                return (InterfaceC4077JQ) C51679xZ3.m5003d(this.f62673a.mo27570L());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$s */
        /* loaded from: classes2.dex */
        public static final class C14291s implements Y94<InterfaceC36149Tk0> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62674a;

            public C14291s(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62674a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC36149Tk0 get() {
                return (InterfaceC36149Tk0) C51679xZ3.m5003d(this.f62674a.mo27490n());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$t */
        /* loaded from: classes2.dex */
        public static final class C14292t implements Y94<InterfaceC52458ys0> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62675a;

            public C14292t(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62675a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC52458ys0 get() {
                return (InterfaceC52458ys0) C51679xZ3.m5003d(this.f62675a.mo27484p1());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$u */
        /* loaded from: classes2.dex */
        public static final class C14293u implements Y94<InterfaceC44791lw0> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62676a;

            public C14293u(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62676a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC44791lw0 get() {
                return (InterfaceC44791lw0) C51679xZ3.m5003d(this.f62676a.mo27487o2());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$v */
        /* loaded from: classes2.dex */
        public static final class C14294v implements Y94<JT0> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62677a;

            public C14294v(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62677a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public JT0 get() {
                return (JT0) C51679xZ3.m5003d(this.f62677a.mo27586E1());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$w */
        /* loaded from: classes2.dex */
        public static final class C14295w implements Y94<NV0> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62678a;

            public C14295w(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62678a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public NV0 get() {
                return (NV0) C51679xZ3.m5003d(this.f62678a.mo27491m3());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$x */
        /* loaded from: classes2.dex */
        public static final class C14296x implements Y94<InterfaceC42163hW0> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62679a;

            public C14296x(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62679a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC42163hW0 get() {
                return (InterfaceC42163hW0) C51679xZ3.m5003d(this.f62679a.mo27588D1());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$y */
        /* loaded from: classes2.dex */
        public static final class C14297y implements Y94<C51174wi2> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62680a;

            public C14297y(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62680a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C51174wi2 get() {
                return (C51174wi2) C51679xZ3.m5003d(this.f62680a.mo27492m2());
            }
        }

        /* renamed from: co.bird.android.app.feature.ride.activity.a$b$z */
        /* loaded from: classes2.dex */
        public static final class C14298z implements Y94<InterfaceC37014Xc1> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62681a;

            public C14298z(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62681a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC37014Xc1 get() {
                return (InterfaceC37014Xc1) C51679xZ3.m5003d(this.f62681a.mo27583F1());
            }
        }

        @Override // co.bird.android.app.feature.ride.activity.RideActivity.InterfaceC14212c
        /* renamed from: a */
        public void mo59537a(RideActivity rideActivity) {
            m59534d(rideActivity);
        }

        /* renamed from: b */
        public final void m59536b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, C2136F5 c2136f5, C32492Dt6 c32492Dt6, FragmentManager fragmentManager, AbstractC11719f abstractC11719f, DQ3 dq3) {
            this.f62523c = new C14251T(interfaceC44393lG2);
            this.f62527d = new C14264d(interfaceC44393lG2);
            this.f62531e = new C14277j0(interfaceC44393lG2);
            this.f62535f = new C14258a(interfaceC44393lG2);
            this.f62539g = new C14266e(interfaceC44393lG2);
            C14256Y c14256y = new C14256Y(interfaceC44393lG2);
            this.f62543h = c14256y;
            C30948zG m1591a = C30948zG.m1591a(c14256y);
            this.f62547i = m1591a;
            this.f62551j = C30539yG.m3736b(m1591a);
            C29163uG m10495a = C29163uG.m10495a(this.f62543h, this.f62539g);
            this.f62555k = m10495a;
            Y94<InterfaceC28249sG> m12549b = C28667tG.m12549b(m10495a);
            this.f62559l = m12549b;
            C37000Xa5 m76845a = C37000Xa5.m76845a(this.f62531e, this.f62535f, this.f62539g, this.f62543h, this.f62551j, m12549b);
            this.f62563m = m76845a;
            Y94<InterfaceC36532Va5> m78167b = C36766Wa5.m78167b(m76845a);
            this.f62567n = m78167b;
            C52009y65 m4137a = C52009y65.m4137a(m78167b);
            this.f62571o = m4137a;
            this.f62575p = C51416x65.m5840b(m4137a);
            this.f62579q = new C14271g0(interfaceC44393lG2);
            this.f62583r = new C14259a0(interfaceC44393lG2);
            C14298z c14298z = new C14298z(interfaceC44393lG2);
            this.f62587s = c14298z;
            C39157cT3 m61292a = C39157cT3.m61292a(this.f62527d, this.f62535f, this.f62579q, this.f62583r, this.f62523c, this.f62531e, c14298z);
            this.f62591t = m61292a;
            Y94<InterfaceC37971aT3> m64515b = C38564bT3.m64515b(m61292a);
            this.f62595u = m64515b;
            C47860r65 m16476a = C47860r65.m16476a(m64515b);
            this.f62599v = m16476a;
            Y94<InterfaceC46674p65> m18164b = C47267q65.m18164b(m16476a);
            this.f62603w = m18164b;
            O65 m92904a = O65.m92904a(this.f62527d, this.f62523c, this.f62575p, m18164b);
            this.f62606x = m92904a;
            N65 m94368a = N65.m94368a(this.f62523c, m92904a);
            this.f62609y = m94368a;
            this.f62612z = M65.m95816b(m94368a);
            this.f62437A = new C14262c(interfaceC44393lG2);
            this.f62440B = new C14287o0(interfaceC44393lG2);
            this.f62443C = new C14233B(interfaceC44393lG2);
            LU2 m96893a = LU2.m96893a();
            this.f62446D = m96893a;
            this.f62449E = KU2.m98837b(m96893a);
            C13682f m60807a = C13682f.m60807a();
            this.f62452F = m60807a;
            this.f62455G = C13681e.m60808b(m60807a);
            C14274i c14274i = new C14274i(interfaceC44393lG2);
            this.f62458H = c14274i;
            Y94<C22454gl> y94 = this.f62527d;
            C25032jr m29840a = C25032jr.m29840a(c14274i, y94, this.f62440B, this.f62443C, y94, this.f62531e);
            this.f62461I = m29840a;
            Y94<InterfaceC22771hr> m31757b = C24605ir.m31757b(m29840a);
            this.f62464J = m31757b;
            this.f62467K = C9529Xq.m76227a(this.f62437A, this.f62527d, this.f62531e, this.f62440B, this.f62443C, this.f62535f, this.f62449E, this.f62455G, m31757b);
            this.f62470L = C34426Ma5.m95157a(this.f62437A, this.f62567n, this.f62527d, this.f62535f, this.f62539g, this.f62531e);
            C14293u c14293u = new C14293u(interfaceC44393lG2);
            this.f62473M = c14293u;
            C38629ba5 m64341a = C38629ba5.m64341a(this.f62523c, this.f62467K, this.f62470L, this.f62531e, c14293u, this.f62579q);
            this.f62476N = m64341a;
            this.f62479O = C38036aa5.m71181b(m64341a);
            C14278k c14278k = new C14278k(interfaceC44393lG2);
            this.f62482P = c14278k;
            C0042A9 m116063a = C0042A9.m116063a(this.f62523c, c14278k, this.f62531e);
            this.f62485Q = m116063a;
            this.f62488R = C30921z9.m1763b(m116063a);
            this.f62491S = new C14247P(interfaceC44393lG2);
            this.f62494T = new C14279k0(interfaceC44393lG2);
            this.f62497U = new C14242K(interfaceC44393lG2);
            this.f62500V = new C14275i0(interfaceC44393lG2);
            this.f62503W = new C14281l0(interfaceC44393lG2);
            this.f62506X = new C14240I(interfaceC44393lG2);
            this.f62509Y = new C14238G(interfaceC44393lG2);
            this.f62512Z = new C14234C(interfaceC44393lG2);
            this.f62516a0 = new C14253V(interfaceC44393lG2);
            this.f62520b0 = new C14290r(interfaceC44393lG2);
            this.f62524c0 = new C14265d0(interfaceC44393lG2);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(dq3);
            this.f62528d0 = m44621a;
            K03 m99361a = K03.m99361a(this.f62491S, this.f62527d, this.f62531e, this.f62535f, this.f62494T, this.f62497U, this.f62500V, this.f62437A, this.f62503W, this.f62506X, this.f62509Y, this.f62512Z, this.f62516a0, this.f62520b0, this.f62579q, this.f62524c0, this.f62473M, m44621a);
            this.f62532e0 = m99361a;
            this.f62536f0 = H03.m104506b(m99361a);
            C46300oU4 m20990a = C46300oU4.m20990a(this.f62527d, this.f62531e);
            this.f62540g0 = m20990a;
            this.f62544h0 = C45707nU4.m23608b(m20990a);
            this.f62548i0 = new C14261b0(interfaceC44393lG2);
            BirdClusterRenderer_Factory create = BirdClusterRenderer_Factory.create();
            this.f62552j0 = create;
            this.f62556k0 = BirdClusterRendererFactory_Impl.create(create);
            OperatorClusterRenderer_Factory create2 = OperatorClusterRenderer_Factory.create();
            this.f62560l0 = create2;
            Y94<OperatorClusterRendererFactory> create3 = OperatorClusterRendererFactory_Impl.create(create2);
            this.f62564m0 = create3;
            BirdClusterManager_Factory create4 = BirdClusterManager_Factory.create(this.f62556k0, create3, this.f62531e, this.f62535f, this.f62437A);
            this.f62568n0 = create4;
            Y94<BirdClusterManagerFactory> create5 = BirdClusterManagerFactory_Impl.create(create4);
            this.f62572o0 = create5;
            K95 m99120a = K95.m99120a(this.f62548i0, this.f62531e, this.f62437A, create5, this.f62494T);
            this.f62576p0 = m99120a;
            this.f62580q0 = J95.m101076b(m99120a);
            this.f62584r0 = new C14268f(interfaceC44393lG2);
            this.f62588s0 = new C14276j(interfaceC44393lG2);
            this.f62592t0 = new C14260b(interfaceC44393lG2);
            this.f62596u0 = new C14252U(interfaceC44393lG2);
            this.f62600v0 = new C14296x(interfaceC44393lG2);
            this.f62604w0 = new C14272h(interfaceC44393lG2);
            C14255X c14255x = new C14255X(interfaceC44393lG2);
            this.f62607x0 = c14255x;
            MapPresenterImpl_Factory create6 = MapPresenterImpl_Factory.create(this.f62494T, this.f62531e, this.f62584r0, this.f62588s0, this.f62592t0, this.f62596u0, this.f62527d, this.f62600v0, this.f62604w0, c14255x, this.f62523c);
            this.f62610y0 = create6;
            this.f62613z0 = MapPresenterImplFactory_Impl.create(create6);
            this.f62438A0 = new C14270g(interfaceC44393lG2);
            this.f62441B0 = new C14236E(interfaceC44393lG2);
            this.f62444C0 = new C14249R(interfaceC44393lG2);
            this.f62447D0 = new C14292t(interfaceC44393lG2);
            this.f62450E0 = new C14283m0(interfaceC44393lG2);
            this.f62453F0 = new C14246O(interfaceC44393lG2);
            this.f62456G0 = new C14232A(interfaceC44393lG2);
            this.f62459H0 = new C14269f0(interfaceC44393lG2);
            this.f62462I0 = new C14243L(interfaceC44393lG2);
            this.f62465J0 = new C14250S(interfaceC44393lG2);
            C14239H c14239h = new C14239H(interfaceC44393lG2);
            this.f62468K0 = c14239h;
            ZX4 m72978a = ZX4.m72978a(this.f62465J0, c14239h, this.f62462I0);
            this.f62471L0 = m72978a;
            this.f62474M0 = YX4.m74929b(m72978a);
            this.f62477N0 = new C14245N(interfaceC44393lG2);
            this.f62480O0 = new C14241J(interfaceC44393lG2);
            this.f62483P0 = new C14257Z(interfaceC44393lG2);
            this.f62486Q0 = new C14263c0(interfaceC44393lG2);
            this.f62489R0 = new C14288p(interfaceC44393lG2);
            this.f62492S0 = new C14237F(interfaceC44393lG2);
            this.f62495T0 = new C14297y(interfaceC44393lG2);
            C14282m c14282m = new C14282m(interfaceC44393lG2);
            this.f62498U0 = c14282m;
            N25 m94422a = N25.m94422a(this.f62531e, this.f62584r0, this.f62438A0, this.f62523c, this.f62587s, this.f62604w0, this.f62500V, this.f62494T, this.f62497U, this.f62441B0, this.f62444C0, this.f62447D0, this.f62583r, this.f62450E0, this.f62453F0, this.f62456G0, this.f62588s0, this.f62458H, this.f62459H0, this.f62527d, this.f62440B, this.f62535f, this.f62462I0, this.f62474M0, this.f62477N0, this.f62506X, this.f62596u0, this.f62480O0, this.f62512Z, this.f62483P0, this.f62486Q0, this.f62489R0, this.f62516a0, this.f62492S0, this.f62495T0, this.f62473M, c14282m, this.f62600v0, this.f62607x0);
            this.f62501V0 = m94422a;
            this.f62504W0 = M25.m95980b(m94422a);
            this.f62507X0 = new C14254W(interfaceC44393lG2);
        }

        /* renamed from: c */
        public final void m59535c(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, C2136F5 c2136f5, C32492Dt6 c32492Dt6, FragmentManager fragmentManager, AbstractC11719f abstractC11719f, DQ3 dq3) {
            this.f62510Y0 = new C14235D(interfaceC44393lG2);
            this.f62513Z0 = new C14285n0(interfaceC44393lG2);
            this.f62517a1 = new C14244M(interfaceC44393lG2);
            C14267e0 c14267e0 = new C14267e0(interfaceC44393lG2);
            this.f62521b1 = c14267e0;
            YJ4 m75258a = YJ4.m75258a(this.f62507X0, this.f62527d, this.f62510Y0, this.f62458H, this.f62535f, this.f62531e, this.f62523c, this.f62437A, this.f62440B, this.f62596u0, this.f62513Z0, this.f62477N0, this.f62517a1, c14267e0, this.f62473M);
            this.f62525c1 = m75258a;
            this.f62529d1 = XJ4.m77134b(m75258a);
            CL4 m112333a = CL4.m112333a(this.f62527d, this.f62531e, this.f62444C0, this.f62523c, this.f62535f, this.f62456G0, this.f62596u0);
            this.f62533e1 = m112333a;
            this.f62537f1 = BL4.m114087b(m112333a);
            C41264fz1 m40395a = C41264fz1.m40395a(this.f62453F0);
            this.f62541g1 = m40395a;
            this.f62545h1 = C40671ez1.m42318b(m40395a);
            JP4 m100512a = JP4.m100512a(this.f62531e, this.f62527d, this.f62535f, this.f62453F0, this.f62456G0, this.f62523c, this.f62524c0, this.f62516a0, this.f62520b0);
            this.f62549i1 = m100512a;
            this.f62553j1 = IP4.m102416b(m100512a);
            C43217jH3 m30898a = C43217jH3.m30898a(this.f62584r0, this.f62494T, this.f62523c, this.f62527d, this.f62535f, this.f62440B, this.f62480O0, this.f62531e);
            this.f62557k1 = m30898a;
            this.f62561l1 = C42624iH3.m34244b(m30898a);
            C14294v c14294v = new C14294v(interfaceC44393lG2);
            this.f62565m1 = c14294v;
            ET0 m108947a = ET0.m108947a(c14294v, this.f62527d, this.f62535f);
            this.f62569n1 = m108947a;
            this.f62573o1 = DT0.m110414b(m108947a);
            HD0 m104176a = HD0.m104176a(this.f62453F0, this.f62579q, this.f62531e);
            this.f62577p1 = m104176a;
            this.f62581q1 = GD0.m105644b(m104176a);
            C46803pK4 m19468a = C46803pK4.m19468a(this.f62535f, this.f62531e, this.f62444C0, this.f62596u0, this.f62579q);
            this.f62585r1 = m19468a;
            this.f62589s1 = C46210oK4.m21340b(m19468a);
            NH3 m94106a = NH3.m94106a(this.f62531e);
            this.f62593t1 = m94106a;
            this.f62597u1 = MH3.m95451b(m94106a);
            C51165wh3 m6479a = C51165wh3.m6479a(this.f62535f, this.f62527d);
            this.f62601v1 = m6479a;
            this.f62605w1 = C50572vh3.m8251b(m6479a);
            ZF3 m73489a = ZF3.m73489a(this.f62494T, this.f62584r0, this.f62535f, this.f62523c);
            this.f62608x1 = m73489a;
            this.f62611y1 = YF3.m75294b(m73489a);
            C40171e85 m43191a = C40171e85.m43191a(this.f62584r0, this.f62531e, this.f62539g);
            this.f62614z1 = m43191a;
            this.f62439A1 = C39579d85.m44581b(m43191a);
            C14289q c14289q = new C14289q(interfaceC44393lG2);
            this.f62442B1 = c14289q;
            OQ2 m92321a = OQ2.m92321a(c14289q, this.f62494T);
            this.f62445C1 = m92321a;
            this.f62448D1 = NQ2.m93919b(m92321a);
            C37762a65 m71896a = C37762a65.m71896a(this.f62523c);
            this.f62451E1 = m71896a;
            this.f62454F1 = Z55.m73734b(m71896a);
            LU4 m96887a = LU4.m96887a(this.f62516a0, this.f62535f, this.f62531e);
            this.f62457G1 = m96887a;
            this.f62460H1 = KU4.m98835b(m96887a);
            C24814jP m30720a = C24814jP.m30720a(this.f62520b0, this.f62535f, this.f62531e);
            this.f62463I1 = m30720a;
            this.f62466J1 = C23229iP.m34024b(m30720a);
            C47215q13 m18307a = C47215q13.m18307a(this.f62480O0, this.f62539g, this.f62535f);
            this.f62469K1 = m18307a;
            this.f62472L1 = C46622p13.m20146b(m18307a);
            C34695Ne4 m93600a = C34695Ne4.m93600a(this.f62531e, this.f62604w0, this.f62535f, this.f62483P0, this.f62596u0, this.f62494T);
            this.f62475M1 = m93600a;
            this.f62478N1 = C34461Me4.m95088b(m93600a);
            C49951ue4 m9926a = C49951ue4.m9926a(this.f62531e, this.f62604w0, this.f62535f, this.f62483P0, this.f62596u0);
            this.f62481O1 = m9926a;
            this.f62484P1 = C49358te4.m11980b(m9926a);
            C34111Kr5 m98230a = C34111Kr5.m98230a(this.f62531e, this.f62535f, this.f62596u0);
            this.f62487Q1 = m98230a;
            this.f62490R1 = C33877Jr5.m99622b(m98230a);
            this.f62493S1 = new C14280l(interfaceC44393lG2);
            C14295w c14295w = new C14295w(interfaceC44393lG2);
            this.f62496T1 = c14295w;
            C9436Xf m76734a = C9436Xf.m76734a(this.f62493S1, c14295w);
            this.f62499U1 = m76734a;
            this.f62502V1 = C9136Wf.m78045b(m76734a);
            C14273h0 c14273h0 = new C14273h0(interfaceC44393lG2);
            this.f62505W1 = c14273h0;
            C43566js1 m29817a = C43566js1.m29817a(this.f62573o1, this.f62581q1, this.f62589s1, this.f62597u1, this.f62605w1, this.f62611y1, this.f62439A1, this.f62448D1, this.f62454F1, this.f62460H1, this.f62466J1, this.f62472L1, this.f62478N1, this.f62484P1, this.f62490R1, this.f62502V1, this.f62539g, this.f62531e, this.f62527d, c14273h0, this.f62535f);
            this.f62508X1 = m29817a;
            this.f62511Y1 = C42973is1.m31745b(m29817a);
            C14286o c14286o = new C14286o(interfaceC44393lG2);
            this.f62514Z1 = c14286o;
            C43105j54 m31142a = C43105j54.m31142a(this.f62535f, c14286o, this.f62438A0);
            this.f62518a2 = m31142a;
            this.f62522b2 = C42512i54.m34479b(m31142a);
            C14248Q c14248q = new C14248Q(interfaceC44393lG2);
            this.f62526c2 = c14248q;
            C40289eL4 m43019a = C40289eL4.m43019a(c14248q, this.f62462I0, this.f62535f);
            this.f62530d2 = m43019a;
            this.f62534e2 = C39697dL4.m44384b(m43019a);
            C5288MO m95322a = C5288MO.m95322a(this.f62535f, this.f62442B1, this.f62494T, this.f62505W1, this.f62579q);
            this.f62538f2 = m95322a;
            this.f62542g2 = C4905LO.m96972b(m95322a);
            C43116j65 m31111a = C43116j65.m31111a(this.f62523c);
            this.f62546h2 = m31111a;
            this.f62550i2 = C42523i65.m34442b(m31111a);
            C51690xa5 m4994a = C51690xa5.m4994a(this.f62531e, this.f62524c0, this.f62543h, this.f62523c);
            this.f62554j2 = m4994a;
            this.f62558k2 = C51097wa5.m6626b(m4994a);
            this.f62562l2 = new C14291s(interfaceC44393lG2);
            this.f62566m2 = C39546d52.m44621a(baseActivity);
            this.f62570n2 = new C14284n(interfaceC44393lG2);
            this.f62574o2 = C39546d52.m44621a(c2136f5);
            this.f62578p2 = C39546d52.m44621a(c32492Dt6);
            this.f62582q2 = C4518Kf.m98626a(this.f62570n2);
            C13613cg m61075a = C13613cg.m61075a(this.f62539g);
            this.f62586r2 = m61075a;
            this.f62590s2 = V51.m80429b(Z75.m73720a(this.f62566m2, this.f62570n2, this.f62574o2, this.f62578p2, this.f62531e, this.f62582q2, m61075a));
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(scopeProvider);
            this.f62594t2 = m44621a;
            C51193wk1 m6423a = C51193wk1.m6423a(this.f62493S1, this.f62531e, this.f62535f, this.f62527d, this.f62523c, this.f62596u0, this.f62562l2, this.f62590s2, m44621a, this.f62579q);
            this.f62598u2 = m6423a;
            this.f62602v2 = C50600vk1.m8209b(m6423a);
        }

        /* renamed from: d */
        public final RideActivity m59534d(RideActivity rideActivity) {
            C5135Ly.m96068n(rideActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f62515a.mo27461w2()));
            C5135Ly.m96066p(rideActivity, (C36207Tq4) C51679xZ3.m5003d(this.f62515a.mo27595B1()));
            C5135Ly.m96071k(rideActivity, (Handler) C51679xZ3.m5003d(this.f62515a.mo27535X2()));
            C5135Ly.m96067o(rideActivity, (C22454gl) C51679xZ3.m5003d(this.f62515a.mo27479r()));
            C5135Ly.m96080b(rideActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f62515a.mo27519d0()));
            C5135Ly.m96075g(rideActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f62515a.mo27453z2()));
            C5135Ly.m96064r(rideActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f62515a.mo27459x1()));
            C5135Ly.m96081a(rideActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f62515a.mo27474s()));
            C5135Ly.m96073i(rideActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f62515a.mo27558P0()));
            C5135Ly.m96074h(rideActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f62515a.mo27598A0()));
            C5135Ly.m96077e(rideActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f62515a.mo27507i0()));
            C5135Ly.m96070l(rideActivity, (FO2) C51679xZ3.m5003d(this.f62515a.mo27456y2()));
            C5135Ly.m96065q(rideActivity, (YR4) C51679xZ3.m5003d(this.f62515a.mo27525b0()));
            C5135Ly.m96079c(rideActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f62515a.mo27460x()));
            C5135Ly.m96078d(rideActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f62515a.mo27517d3()));
            C5135Ly.m96072j(rideActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f62515a.mo27482q()));
            C5135Ly.m96076f(rideActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f62515a.mo27483p3()));
            C40325eP4.m42919i(rideActivity, (BK2) C51679xZ3.m5003d(this.f62515a.mo24043m()));
            C40325eP4.m42933A(rideActivity, this.f62612z.get());
            C40325eP4.m42930D(rideActivity, this.f62479O.get());
            C40325eP4.m42927a(rideActivity, this.f62488R.get());
            C40325eP4.m42913o(rideActivity, this.f62536f0.get());
            C40325eP4.m42905w(rideActivity, this.f62544h0.get());
            C40325eP4.m42915m(rideActivity, this.f62580q0.get());
            C40325eP4.m42918j(rideActivity, this.f62613z0.get());
            C40325eP4.m42904x(rideActivity, this.f62504W0.get());
            C40325eP4.m42908t(rideActivity, this.f62529d1.get());
            C40325eP4.m42906v(rideActivity, this.f62537f1.get());
            C40325eP4.m42920h(rideActivity, this.f62545h1.get());
            C40325eP4.m42924d(rideActivity, this.f62553j1.get());
            C40325eP4.m42912p(rideActivity, this.f62561l1.get());
            C40325eP4.m42921g(rideActivity, this.f62511Y1.get());
            C40325eP4.m42910r(rideActivity, this.f62522b2.get());
            C40325eP4.m42907u(rideActivity, this.f62534e2.get());
            C40325eP4.m42923e(rideActivity, this.f62542g2.get());
            C40325eP4.m42903y(rideActivity, this.f62550i2.get());
            C40325eP4.m42929E(rideActivity, this.f62558k2.get());
            C40325eP4.m42931C(rideActivity, this.f62602v2.get());
            C40325eP4.m42902z(rideActivity, this.f62602v2.get());
            C40325eP4.m42911q(rideActivity, this.f62602v2.get());
            C40325eP4.m42928F(rideActivity, this.f62602v2.get());
            C40325eP4.m42925c(rideActivity, (InterfaceC12495bn) C51679xZ3.m5003d(this.f62515a.mo27516e0()));
            C40325eP4.m42926b(rideActivity, (C22454gl) C51679xZ3.m5003d(this.f62515a.mo27479r()));
            C40325eP4.m42922f(rideActivity, (O01) C51679xZ3.m5003d(this.f62515a.mo27563N0()));
            C40325eP4.m42917k(rideActivity, (InterfaceC46893pU4) C51679xZ3.m5003d(this.f62515a.mo27566M0()));
            C40325eP4.m42909s(rideActivity, (InterfaceC32292Cx4) C51679xZ3.m5003d(this.f62515a.mo27506i2()));
            C40325eP4.m42916l(rideActivity, (IL2) C51679xZ3.m5003d(this.f62515a.mo27478r0()));
            C40325eP4.m42932B(rideActivity, this.f62590s2.get());
            return rideActivity;
        }

        public C14231b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, C2136F5 c2136f5, C32492Dt6 c32492Dt6, FragmentManager fragmentManager, AbstractC11719f abstractC11719f, DQ3 dq3) {
            this.f62519b = this;
            this.f62515a = interfaceC44393lG2;
            m59536b(interfaceC44393lG2, baseActivity, scopeProvider, lifecycleScopeProvider, c2136f5, c32492Dt6, fragmentManager, abstractC11719f, dq3);
            m59535c(interfaceC44393lG2, baseActivity, scopeProvider, lifecycleScopeProvider, c2136f5, c32492Dt6, fragmentManager, abstractC11719f, dq3);
        }
    }

    private C14229a() {
    }

    /* renamed from: a */
    public static RideActivity.InterfaceC14212c.InterfaceC14213a m59539a() {
        return new C14230a();
    }
}
