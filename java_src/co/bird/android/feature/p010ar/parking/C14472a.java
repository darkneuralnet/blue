package co.bird.android.feature.p010ar.parking;

import android.content.Context;
import android.hardware.SensorManager;
import android.os.Handler;
import co.bird.android.app.feature.map.p008ui.renderer.MapPolygonableRenderer;
import co.bird.android.app.feature.map.p008ui.renderer.ParkingNestRenderer;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.p010ar.parking.VpsParkingActivity;
import co.bird.android.model.wire.WireRide;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.ar.parking.a */
/* loaded from: classes3.dex */
public final class C14472a {

    /* renamed from: co.bird.android.feature.ar.parking.a$a */
    /* loaded from: classes3.dex */
    public static final class C14473a implements VpsParkingActivity.InterfaceC14467a.InterfaceC14468a {
        @Override // co.bird.android.feature.p010ar.parking.VpsParkingActivity.InterfaceC14467a.InterfaceC14468a
        /* renamed from: a */
        public VpsParkingActivity.InterfaceC14467a mo58938a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C28178s6 c28178s6, C39011cD1 c39011cD1, DQ3 dq3, WireRide wireRide, MapPolygonableRenderer mapPolygonableRenderer, ParkingNestRenderer parkingNestRenderer) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c28178s6);
            C51679xZ3.m5005b(c39011cD1);
            C51679xZ3.m5005b(dq3);
            C51679xZ3.m5005b(wireRide);
            C51679xZ3.m5005b(mapPolygonableRenderer);
            C51679xZ3.m5005b(parkingNestRenderer);
            return new C14474b(interfaceC44393lG2, baseActivity, scopeProvider, c28178s6, c39011cD1, dq3, wireRide, mapPolygonableRenderer, parkingNestRenderer);
        }

        private C14473a() {
        }
    }

    /* renamed from: co.bird.android.feature.ar.parking.a$b */
    /* loaded from: classes3.dex */
    public static final class C14474b implements VpsParkingActivity.InterfaceC14467a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f63152a;

        /* renamed from: b */
        public final C14474b f63153b;

        /* renamed from: c */
        public Y94<Context> f63154c;

        /* renamed from: d */
        public Y94<Handler> f63155d;

        /* renamed from: e */
        public Y94<ScopeProvider> f63156e;

        /* renamed from: f */
        public Y94<BaseActivity> f63157f;

        /* renamed from: g */
        public Y94<C28178s6> f63158g;

        /* renamed from: h */
        public Y94<C48345rv6> f63159h;

        /* renamed from: i */
        public Y94<InterfaceC40099e13> f63160i;

        /* renamed from: j */
        public Y94<C22454gl> f63161j;

        /* renamed from: k */
        public Y94<C36207Tq4> f63162k;

        /* renamed from: l */
        public Y94<InterfaceC40001dr4> f63163l;

        /* renamed from: m */
        public Y94<SensorManager> f63164m;

        /* renamed from: n */
        public Y94<InterfaceC1880Ea> f63165n;

        /* renamed from: o */
        public Y94<DQ3> f63166o;

        /* renamed from: p */
        public Y94<YR4> f63167p;

        /* renamed from: q */
        public Y94<InterfaceC46164oF3> f63168q;

        /* renamed from: r */
        public Y94<InterfaceC28816tm> f63169r;

        /* renamed from: s */
        public Y94<InterfaceC12495bn> f63170s;

        /* renamed from: t */
        public Y94<C39011cD1> f63171t;

        /* renamed from: u */
        public Y94<WireRide> f63172u;

        /* renamed from: v */
        public Y94<MapPolygonableRenderer> f63173v;

        /* renamed from: w */
        public Y94<ParkingNestRenderer> f63174w;

        /* renamed from: x */
        public C47752qv6 f63175x;

        /* renamed from: y */
        public Y94<InterfaceC45973nv6> f63176y;

        /* renamed from: co.bird.android.feature.ar.parking.a$b$a */
        /* loaded from: classes3.dex */
        public static final class C14475a implements Y94<InterfaceC1880Ea> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f63177a;

            public C14475a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f63177a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC1880Ea get() {
                return (InterfaceC1880Ea) C51679xZ3.m5003d(this.f63177a.mo27519d0());
            }
        }

        /* renamed from: co.bird.android.feature.ar.parking.a$b$b */
        /* loaded from: classes3.dex */
        public static final class C14476b implements Y94<SensorManager> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f63178a;

            public C14476b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f63178a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public SensorManager get() {
                return (SensorManager) C51679xZ3.m5003d(this.f63178a.mo27499k2());
            }
        }

        /* renamed from: co.bird.android.feature.ar.parking.a$b$c */
        /* loaded from: classes3.dex */
        public static final class C14477c implements Y94<C22454gl> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f63179a;

            public C14477c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f63179a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C22454gl get() {
                return (C22454gl) C51679xZ3.m5003d(this.f63179a.mo27479r());
            }
        }

        /* renamed from: co.bird.android.feature.ar.parking.a$b$d */
        /* loaded from: classes3.dex */
        public static final class C14478d implements Y94<Context> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f63180a;

            public C14478d(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f63180a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public Context get() {
                return (Context) C51679xZ3.m5003d(this.f63180a.mo27552R1());
            }
        }

        /* renamed from: co.bird.android.feature.ar.parking.a$b$e */
        /* loaded from: classes3.dex */
        public static final class C14479e implements Y94<InterfaceC12495bn> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f63181a;

            public C14479e(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f63181a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC12495bn get() {
                return (InterfaceC12495bn) C51679xZ3.m5003d(this.f63181a.mo27516e0());
            }
        }

        /* renamed from: co.bird.android.feature.ar.parking.a$b$f */
        /* loaded from: classes3.dex */
        public static final class C14480f implements Y94<InterfaceC28816tm> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f63182a;

            public C14480f(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f63182a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC28816tm get() {
                return (InterfaceC28816tm) C51679xZ3.m5003d(this.f63182a.mo27599A());
            }
        }

        /* renamed from: co.bird.android.feature.ar.parking.a$b$g */
        /* loaded from: classes3.dex */
        public static final class C14481g implements Y94<InterfaceC46164oF3> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f63183a;

            public C14481g(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f63183a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC46164oF3 get() {
                return (InterfaceC46164oF3) C51679xZ3.m5003d(this.f63183a.mo27587D2());
            }
        }

        /* renamed from: co.bird.android.feature.ar.parking.a$b$h */
        /* loaded from: classes3.dex */
        public static final class C14482h implements Y94<YR4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f63184a;

            public C14482h(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f63184a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public YR4 get() {
                return (YR4) C51679xZ3.m5003d(this.f63184a.mo27525b0());
            }
        }

        /* renamed from: co.bird.android.feature.ar.parking.a$b$i */
        /* loaded from: classes3.dex */
        public static final class C14483i implements Y94<Handler> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f63185a;

            public C14483i(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f63185a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public Handler get() {
                return (Handler) C51679xZ3.m5003d(this.f63185a.mo27535X2());
            }
        }

        /* renamed from: co.bird.android.feature.ar.parking.a$b$j */
        /* loaded from: classes3.dex */
        public static final class C14484j implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f63186a;

            public C14484j(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f63186a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f63186a.mo27461w2());
            }
        }

        /* renamed from: co.bird.android.feature.ar.parking.a$b$k */
        /* loaded from: classes3.dex */
        public static final class C14485k implements Y94<C36207Tq4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f63187a;

            public C14485k(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f63187a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C36207Tq4 get() {
                return (C36207Tq4) C51679xZ3.m5003d(this.f63187a.mo27595B1());
            }
        }

        /* renamed from: co.bird.android.feature.ar.parking.a$b$l */
        /* loaded from: classes3.dex */
        public static final class C14486l implements Y94<InterfaceC40001dr4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f63188a;

            public C14486l(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f63188a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40001dr4 get() {
                return (InterfaceC40001dr4) C51679xZ3.m5003d(this.f63188a.mo27482q());
            }
        }

        @Override // co.bird.android.feature.p010ar.parking.VpsParkingActivity.InterfaceC14467a
        /* renamed from: a */
        public void mo58937a(VpsParkingActivity vpsParkingActivity) {
            m58935c(vpsParkingActivity);
        }

        /* renamed from: b */
        public final void m58936b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C28178s6 c28178s6, C39011cD1 c39011cD1, DQ3 dq3, WireRide wireRide, MapPolygonableRenderer mapPolygonableRenderer, ParkingNestRenderer parkingNestRenderer) {
            this.f63154c = new C14478d(interfaceC44393lG2);
            this.f63155d = new C14483i(interfaceC44393lG2);
            this.f63156e = C39546d52.m44621a(scopeProvider);
            this.f63157f = C39546d52.m44621a(baseActivity);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(c28178s6);
            this.f63158g = m44621a;
            this.f63159h = C48937sv6.m13385a(this.f63157f, m44621a);
            this.f63160i = new C14484j(interfaceC44393lG2);
            this.f63161j = new C14477c(interfaceC44393lG2);
            this.f63162k = new C14485k(interfaceC44393lG2);
            this.f63163l = new C14486l(interfaceC44393lG2);
            this.f63164m = new C14476b(interfaceC44393lG2);
            this.f63165n = new C14475a(interfaceC44393lG2);
            this.f63166o = C39546d52.m44621a(dq3);
            this.f63167p = new C14482h(interfaceC44393lG2);
            this.f63168q = new C14481g(interfaceC44393lG2);
            this.f63169r = new C14480f(interfaceC44393lG2);
            this.f63170s = new C14479e(interfaceC44393lG2);
            this.f63171t = C39546d52.m44621a(c39011cD1);
            this.f63172u = C39546d52.m44621a(wireRide);
            this.f63173v = C39546d52.m44621a(mapPolygonableRenderer);
            InterfaceC48812sj1 m44621a2 = C39546d52.m44621a(parkingNestRenderer);
            this.f63174w = m44621a2;
            C47752qv6 m16782a = C47752qv6.m16782a(this.f63154c, this.f63155d, this.f63156e, this.f63159h, this.f63160i, this.f63161j, this.f63162k, this.f63163l, this.f63164m, this.f63165n, this.f63166o, this.f63167p, this.f63168q, this.f63169r, this.f63170s, this.f63171t, this.f63172u, this.f63173v, m44621a2);
            this.f63175x = m16782a;
            this.f63176y = C46566ov6.m20274a(m16782a);
        }

        /* renamed from: c */
        public final VpsParkingActivity m58935c(VpsParkingActivity vpsParkingActivity) {
            C5135Ly.m96068n(vpsParkingActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f63152a.mo27461w2()));
            C5135Ly.m96066p(vpsParkingActivity, (C36207Tq4) C51679xZ3.m5003d(this.f63152a.mo27595B1()));
            C5135Ly.m96071k(vpsParkingActivity, (Handler) C51679xZ3.m5003d(this.f63152a.mo27535X2()));
            C5135Ly.m96067o(vpsParkingActivity, (C22454gl) C51679xZ3.m5003d(this.f63152a.mo27479r()));
            C5135Ly.m96080b(vpsParkingActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f63152a.mo27519d0()));
            C5135Ly.m96075g(vpsParkingActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f63152a.mo27453z2()));
            C5135Ly.m96064r(vpsParkingActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f63152a.mo27459x1()));
            C5135Ly.m96081a(vpsParkingActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f63152a.mo27474s()));
            C5135Ly.m96073i(vpsParkingActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f63152a.mo27558P0()));
            C5135Ly.m96074h(vpsParkingActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f63152a.mo27598A0()));
            C5135Ly.m96077e(vpsParkingActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f63152a.mo27507i0()));
            C5135Ly.m96070l(vpsParkingActivity, (FO2) C51679xZ3.m5003d(this.f63152a.mo27456y2()));
            C5135Ly.m96065q(vpsParkingActivity, (YR4) C51679xZ3.m5003d(this.f63152a.mo27525b0()));
            C5135Ly.m96079c(vpsParkingActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f63152a.mo27460x()));
            C5135Ly.m96078d(vpsParkingActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f63152a.mo27517d3()));
            C5135Ly.m96072j(vpsParkingActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f63152a.mo27482q()));
            C5135Ly.m96076f(vpsParkingActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f63152a.mo27483p3()));
            C35309Pu6.m89447b(vpsParkingActivity, this.f63176y.get());
            return vpsParkingActivity;
        }

        public C14474b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C28178s6 c28178s6, C39011cD1 c39011cD1, DQ3 dq3, WireRide wireRide, MapPolygonableRenderer mapPolygonableRenderer, ParkingNestRenderer parkingNestRenderer) {
            this.f63153b = this;
            this.f63152a = interfaceC44393lG2;
            m58936b(interfaceC44393lG2, baseActivity, scopeProvider, c28178s6, c39011cD1, dq3, wireRide, mapPolygonableRenderer, parkingNestRenderer);
        }
    }

    private C14472a() {
    }

    /* renamed from: a */
    public static VpsParkingActivity.InterfaceC14467a.InterfaceC14468a m58939a() {
        return new C14473a();
    }
}
