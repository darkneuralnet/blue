package co.bird.android.feature.vehiclepricing;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.vehiclepricing.VehiclePricingActivity;
import co.bird.android.model.VehiclePricingDetails;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: co.bird.android.feature.vehiclepricing.a */
/* loaded from: classes3.dex */
public final class C15885a {

    /* renamed from: co.bird.android.feature.vehiclepricing.a$a */
    /* loaded from: classes3.dex */
    public static final class C15886a implements VehiclePricingActivity.InterfaceC15881a.InterfaceC15882a {

        /* renamed from: a */
        public VehiclePricingActivity.C15883b f65863a;

        /* renamed from: b */
        public InterfaceC44393lG2 f65864b;

        @Override // co.bird.android.feature.vehiclepricing.VehiclePricingActivity.InterfaceC15881a.InterfaceC15882a
        public VehiclePricingActivity.InterfaceC15881a build() {
            C51679xZ3.m5006a(this.f65863a, VehiclePricingActivity.C15883b.class);
            C51679xZ3.m5006a(this.f65864b, InterfaceC44393lG2.class);
            return new C15887b(this.f65863a, this.f65864b);
        }

        @Override // co.bird.android.feature.vehiclepricing.VehiclePricingActivity.InterfaceC15881a.InterfaceC15882a
        /* renamed from: c */
        public C15886a mo56332a(InterfaceC44393lG2 interfaceC44393lG2) {
            this.f65864b = (InterfaceC44393lG2) C51679xZ3.m5005b(interfaceC44393lG2);
            return this;
        }

        @Override // co.bird.android.feature.vehiclepricing.VehiclePricingActivity.InterfaceC15881a.InterfaceC15882a
        /* renamed from: d */
        public C15886a mo56331b(VehiclePricingActivity.C15883b c15883b) {
            this.f65863a = (VehiclePricingActivity.C15883b) C51679xZ3.m5005b(c15883b);
            return this;
        }

        private C15886a() {
        }
    }

    /* renamed from: co.bird.android.feature.vehiclepricing.a$b */
    /* loaded from: classes3.dex */
    public static final class C15887b implements VehiclePricingActivity.InterfaceC15881a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f65865a;

        /* renamed from: b */
        public final C15887b f65866b;

        /* renamed from: c */
        public Y94<InterfaceC49597u24> f65867c;

        /* renamed from: d */
        public Y94<InterfaceC40001dr4> f65868d;

        /* renamed from: e */
        public Y94<InterfaceC46893pU4> f65869e;

        /* renamed from: f */
        public Y94<LifecycleScopeProvider<EnumC7097RE>> f65870f;

        /* renamed from: g */
        public Y94<BaseActivity> f65871g;

        /* renamed from: h */
        public Y94<C45893nn6> f65872h;

        /* renamed from: i */
        public Y94<InterfaceC45300mn6> f65873i;

        /* renamed from: j */
        public Y94<InterfaceC40099e13> f65874j;

        /* renamed from: k */
        public Y94<C22454gl> f65875k;

        /* renamed from: l */
        public Y94<VehiclePricingDetails> f65876l;

        /* renamed from: m */
        public Y94<Boolean> f65877m;

        /* renamed from: n */
        public Y94<C43521jn6> f65878n;

        /* renamed from: o */
        public Y94<InterfaceC39353cn6> f65879o;

        /* renamed from: co.bird.android.feature.vehiclepricing.a$b$a */
        /* loaded from: classes3.dex */
        public static final class C15888a implements Y94<C22454gl> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65880a;

            public C15888a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65880a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C22454gl get() {
                return (C22454gl) C51679xZ3.m5003d(this.f65880a.mo27479r());
            }
        }

        /* renamed from: co.bird.android.feature.vehiclepricing.a$b$b */
        /* loaded from: classes3.dex */
        public static final class C15889b implements Y94<InterfaceC49597u24> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65881a;

            public C15889b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65881a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC49597u24 get() {
                return (InterfaceC49597u24) C51679xZ3.m5003d(this.f65881a.mo27581G2());
            }
        }

        /* renamed from: co.bird.android.feature.vehiclepricing.a$b$c */
        /* loaded from: classes3.dex */
        public static final class C15890c implements Y94<InterfaceC46893pU4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65882a;

            public C15890c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65882a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC46893pU4 get() {
                return (InterfaceC46893pU4) C51679xZ3.m5003d(this.f65882a.mo27566M0());
            }
        }

        /* renamed from: co.bird.android.feature.vehiclepricing.a$b$d */
        /* loaded from: classes3.dex */
        public static final class C15891d implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65883a;

            public C15891d(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65883a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f65883a.mo27461w2());
            }
        }

        /* renamed from: co.bird.android.feature.vehiclepricing.a$b$e */
        /* loaded from: classes3.dex */
        public static final class C15892e implements Y94<InterfaceC40001dr4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65884a;

            public C15892e(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65884a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40001dr4 get() {
                return (InterfaceC40001dr4) C51679xZ3.m5003d(this.f65884a.mo27482q());
            }
        }

        @Override // co.bird.android.feature.vehiclepricing.VehiclePricingActivity.InterfaceC15881a
        /* renamed from: a */
        public void mo56328a(VehiclePricingActivity vehiclePricingActivity) {
            m56326c(vehiclePricingActivity);
        }

        /* renamed from: b */
        public final void m56327b(VehiclePricingActivity.C15883b c15883b, InterfaceC44393lG2 interfaceC44393lG2) {
            this.f65867c = new C15889b(interfaceC44393lG2);
            this.f65868d = new C15892e(interfaceC44393lG2);
            this.f65869e = new C15890c(interfaceC44393lG2);
            this.f65870f = V51.m80429b(C15895d.m56314a(c15883b));
            Y94<BaseActivity> m80429b = V51.m80429b(C15893b.m56319b(c15883b));
            this.f65871g = m80429b;
            C46486on6 m20489a = C46486on6.m20489a(m80429b);
            this.f65872h = m20489a;
            this.f65873i = V51.m80429b(m20489a);
            this.f65874j = new C15891d(interfaceC44393lG2);
            this.f65875k = new C15888a(interfaceC44393lG2);
            this.f65876l = V51.m80429b(C15896e.m56311a(c15883b));
            Y94<Boolean> m80429b2 = V51.m80429b(C15894c.m56317a(c15883b));
            this.f65877m = m80429b2;
            C44707ln6 m26812a = C44707ln6.m26812a(this.f65867c, this.f65868d, this.f65869e, this.f65870f, this.f65873i, this.f65874j, this.f65875k, this.f65876l, m80429b2);
            this.f65878n = m26812a;
            this.f65879o = V51.m80429b(m26812a);
        }

        /* renamed from: c */
        public final VehiclePricingActivity m56326c(VehiclePricingActivity vehiclePricingActivity) {
            C5135Ly.m96068n(vehiclePricingActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65865a.mo27461w2()));
            C5135Ly.m96066p(vehiclePricingActivity, (C36207Tq4) C51679xZ3.m5003d(this.f65865a.mo27595B1()));
            C5135Ly.m96071k(vehiclePricingActivity, (Handler) C51679xZ3.m5003d(this.f65865a.mo27535X2()));
            C5135Ly.m96067o(vehiclePricingActivity, (C22454gl) C51679xZ3.m5003d(this.f65865a.mo27479r()));
            C5135Ly.m96080b(vehiclePricingActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f65865a.mo27519d0()));
            C5135Ly.m96075g(vehiclePricingActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f65865a.mo27453z2()));
            C5135Ly.m96064r(vehiclePricingActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65865a.mo27459x1()));
            C5135Ly.m96081a(vehiclePricingActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f65865a.mo27474s()));
            C5135Ly.m96073i(vehiclePricingActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f65865a.mo27558P0()));
            C5135Ly.m96074h(vehiclePricingActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f65865a.mo27598A0()));
            C5135Ly.m96077e(vehiclePricingActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f65865a.mo27507i0()));
            C5135Ly.m96070l(vehiclePricingActivity, (FO2) C51679xZ3.m5003d(this.f65865a.mo27456y2()));
            C5135Ly.m96065q(vehiclePricingActivity, (YR4) C51679xZ3.m5003d(this.f65865a.mo27525b0()));
            C5135Ly.m96079c(vehiclePricingActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f65865a.mo27460x()));
            C5135Ly.m96078d(vehiclePricingActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f65865a.mo27517d3()));
            C5135Ly.m96072j(vehiclePricingActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f65865a.mo27482q()));
            C5135Ly.m96076f(vehiclePricingActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f65865a.mo27483p3()));
            C38760bn6.m63973b(vehiclePricingActivity, this.f65879o.get());
            return vehiclePricingActivity;
        }

        public C15887b(VehiclePricingActivity.C15883b c15883b, InterfaceC44393lG2 interfaceC44393lG2) {
            this.f65866b = this;
            this.f65865a = interfaceC44393lG2;
            m56327b(c15883b, interfaceC44393lG2);
        }
    }

    private C15885a() {
    }

    /* renamed from: a */
    public static VehiclePricingActivity.InterfaceC15881a.InterfaceC15882a m56333a() {
        return new C15886a();
    }
}
