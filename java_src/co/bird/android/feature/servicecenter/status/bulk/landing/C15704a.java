package co.bird.android.feature.servicecenter.status.bulk.landing;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.servicecenter.status.bulk.landing.BulkServiceProgressLandingActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.servicecenter.status.bulk.landing.a */
/* loaded from: classes3.dex */
public final class C15704a {

    /* renamed from: co.bird.android.feature.servicecenter.status.bulk.landing.a$a */
    /* loaded from: classes3.dex */
    public static final class C15705a implements BulkServiceProgressLandingActivity.InterfaceC15701a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f65520a;

        /* renamed from: b */
        public final C15705a f65521b;

        /* renamed from: c */
        public Y94<InterfaceC44647lh6> f65522c;

        /* renamed from: d */
        public Y94<InterfaceC36047Sy6> f65523d;

        /* renamed from: e */
        public Y94<C36207Tq4> f65524e;

        /* renamed from: f */
        public Y94<ScopeProvider> f65525f;

        /* renamed from: g */
        public Y94<InterfaceC40099e13> f65526g;

        /* renamed from: h */
        public Y94<C43038iy6> f65527h;

        /* renamed from: i */
        public Y94<BaseActivity> f65528i;

        /* renamed from: j */
        public Y94<C10570a6> f65529j;

        /* renamed from: k */
        public Y94<C45962nu5> f65530k;

        /* renamed from: l */
        public Y94<InterfaceC45369mu5> f65531l;

        /* renamed from: m */
        public Y94<DQ3> f65532m;

        /* renamed from: n */
        public Y94<C37747a50> f65533n;

        /* renamed from: o */
        public Y94<InterfaceC41811gu5> f65534o;

        /* renamed from: co.bird.android.feature.servicecenter.status.bulk.landing.a$a$a */
        /* loaded from: classes3.dex */
        public static final class C15706a implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65535a;

            public C15706a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65535a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f65535a.mo27461w2());
            }
        }

        /* renamed from: co.bird.android.feature.servicecenter.status.bulk.landing.a$a$b */
        /* loaded from: classes3.dex */
        public static final class C15707b implements Y94<C36207Tq4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65536a;

            public C15707b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65536a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C36207Tq4 get() {
                return (C36207Tq4) C51679xZ3.m5003d(this.f65536a.mo27595B1());
            }
        }

        /* renamed from: co.bird.android.feature.servicecenter.status.bulk.landing.a$a$c */
        /* loaded from: classes3.dex */
        public static final class C15708c implements Y94<InterfaceC44647lh6> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65537a;

            public C15708c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65537a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC44647lh6 get() {
                return (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65537a.mo27459x1());
            }
        }

        /* renamed from: co.bird.android.feature.servicecenter.status.bulk.landing.a$a$d */
        /* loaded from: classes3.dex */
        public static final class C15709d implements Y94<InterfaceC36047Sy6> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65538a;

            public C15709d(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65538a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC36047Sy6 get() {
                return (InterfaceC36047Sy6) C51679xZ3.m5003d(this.f65538a.mo27571K2());
            }
        }

        @Override // co.bird.android.feature.servicecenter.status.bulk.landing.BulkServiceProgressLandingActivity.InterfaceC15701a
        /* renamed from: a */
        public void mo56724a(BulkServiceProgressLandingActivity bulkServiceProgressLandingActivity) {
            m56722c(bulkServiceProgressLandingActivity);
        }

        /* renamed from: b */
        public final void m56723b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C10570a6 c10570a6, DQ3 dq3) {
            this.f65522c = new C15708c(interfaceC44393lG2);
            this.f65523d = new C15709d(interfaceC44393lG2);
            this.f65524e = new C15707b(interfaceC44393lG2);
            this.f65525f = C39546d52.m44621a(scopeProvider);
            C15706a c15706a = new C15706a(interfaceC44393lG2);
            this.f65526g = c15706a;
            this.f65527h = C32303Cy6.m111187a(this.f65522c, this.f65523d, this.f65524e, this.f65525f, c15706a);
            this.f65528i = C39546d52.m44621a(baseActivity);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(c10570a6);
            this.f65529j = m44621a;
            C46555ou5 m20300a = C46555ou5.m20300a(this.f65528i, m44621a);
            this.f65530k = m20300a;
            this.f65531l = V51.m80429b(m20300a);
            InterfaceC48812sj1 m44621a2 = C39546d52.m44621a(dq3);
            this.f65532m = m44621a2;
            C38340b50 m64992a = C38340b50.m64992a(this.f65527h, this.f65531l, this.f65525f, m44621a2, this.f65526g);
            this.f65533n = m64992a;
            this.f65534o = V51.m80429b(m64992a);
        }

        /* renamed from: c */
        public final BulkServiceProgressLandingActivity m56722c(BulkServiceProgressLandingActivity bulkServiceProgressLandingActivity) {
            C5135Ly.m96068n(bulkServiceProgressLandingActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65520a.mo27461w2()));
            C5135Ly.m96066p(bulkServiceProgressLandingActivity, (C36207Tq4) C51679xZ3.m5003d(this.f65520a.mo27595B1()));
            C5135Ly.m96071k(bulkServiceProgressLandingActivity, (Handler) C51679xZ3.m5003d(this.f65520a.mo27535X2()));
            C5135Ly.m96067o(bulkServiceProgressLandingActivity, (C22454gl) C51679xZ3.m5003d(this.f65520a.mo27479r()));
            C5135Ly.m96080b(bulkServiceProgressLandingActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f65520a.mo27519d0()));
            C5135Ly.m96075g(bulkServiceProgressLandingActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f65520a.mo27453z2()));
            C5135Ly.m96064r(bulkServiceProgressLandingActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65520a.mo27459x1()));
            C5135Ly.m96081a(bulkServiceProgressLandingActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f65520a.mo27474s()));
            C5135Ly.m96073i(bulkServiceProgressLandingActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f65520a.mo27558P0()));
            C5135Ly.m96074h(bulkServiceProgressLandingActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f65520a.mo27598A0()));
            C5135Ly.m96077e(bulkServiceProgressLandingActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f65520a.mo27507i0()));
            C5135Ly.m96070l(bulkServiceProgressLandingActivity, (FO2) C51679xZ3.m5003d(this.f65520a.mo27456y2()));
            C5135Ly.m96065q(bulkServiceProgressLandingActivity, (YR4) C51679xZ3.m5003d(this.f65520a.mo27525b0()));
            C5135Ly.m96079c(bulkServiceProgressLandingActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f65520a.mo27460x()));
            C5135Ly.m96078d(bulkServiceProgressLandingActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f65520a.mo27517d3()));
            C5135Ly.m96072j(bulkServiceProgressLandingActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f65520a.mo27482q()));
            C5135Ly.m96076f(bulkServiceProgressLandingActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f65520a.mo27483p3()));
            X40.m77441b(bulkServiceProgressLandingActivity, this.f65534o.get());
            return bulkServiceProgressLandingActivity;
        }

        public C15705a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C10570a6 c10570a6, DQ3 dq3) {
            this.f65521b = this;
            this.f65520a = interfaceC44393lG2;
            m56723b(interfaceC44393lG2, baseActivity, scopeProvider, c10570a6, dq3);
        }
    }

    /* renamed from: co.bird.android.feature.servicecenter.status.bulk.landing.a$b */
    /* loaded from: classes3.dex */
    public static final class C15710b implements BulkServiceProgressLandingActivity.InterfaceC15701a.InterfaceC15702a {
        @Override // co.bird.android.feature.servicecenter.status.bulk.landing.BulkServiceProgressLandingActivity.InterfaceC15701a.InterfaceC15702a
        /* renamed from: a */
        public BulkServiceProgressLandingActivity.InterfaceC15701a mo56717a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C10570a6 c10570a6, DQ3 dq3) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c10570a6);
            C51679xZ3.m5005b(dq3);
            return new C15705a(interfaceC44393lG2, baseActivity, scopeProvider, c10570a6, dq3);
        }

        private C15710b() {
        }
    }

    private C15704a() {
    }

    /* renamed from: a */
    public static BulkServiceProgressLandingActivity.InterfaceC15701a.InterfaceC15702a m56725a() {
        return new C15710b();
    }
}
