package co.bird.android.feature.servicecenter.status.bulk.update;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.servicecenter.status.bulk.update.BulkServiceProgressUpdateActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.servicecenter.status.bulk.update.a */
/* loaded from: classes3.dex */
public final class C15714a {

    /* renamed from: co.bird.android.feature.servicecenter.status.bulk.update.a$a */
    /* loaded from: classes3.dex */
    public static final class C15715a implements BulkServiceProgressUpdateActivity.InterfaceC15711a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f65540a;

        /* renamed from: b */
        public final C15715a f65541b;

        /* renamed from: c */
        public Y94<InterfaceC46473om3> f65542c;

        /* renamed from: d */
        public Y94<InterfaceC33193Gt5> f65543d;

        /* renamed from: e */
        public Y94<ScopeProvider> f65544e;

        /* renamed from: f */
        public Y94<BaseActivity> f65545f;

        /* renamed from: g */
        public Y94<C12291b6> f65546g;

        /* renamed from: h */
        public Y94<C26017mE> f65547h;

        /* renamed from: i */
        public Y94<InterfaceC25660lE> f65548i;

        /* renamed from: j */
        public Y94<InterfaceC40099e13> f65549j;

        /* renamed from: k */
        public Y94<InterfaceC46066o50> f65550k;

        /* renamed from: l */
        public Y94<C36207Tq4> f65551l;

        /* renamed from: m */
        public Y94<D50> f65552m;

        /* renamed from: n */
        public Y94<InterfaceC48437s50> f65553n;

        /* renamed from: co.bird.android.feature.servicecenter.status.bulk.update.a$a$a */
        /* loaded from: classes3.dex */
        public static final class C15716a implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65554a;

            public C15716a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65554a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f65554a.mo27461w2());
            }
        }

        /* renamed from: co.bird.android.feature.servicecenter.status.bulk.update.a$a$b */
        /* loaded from: classes3.dex */
        public static final class C15717b implements Y94<InterfaceC46473om3> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65555a;

            public C15717b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65555a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC46473om3 get() {
                return (InterfaceC46473om3) C51679xZ3.m5003d(this.f65555a.mo27584F0());
            }
        }

        /* renamed from: co.bird.android.feature.servicecenter.status.bulk.update.a$a$c */
        /* loaded from: classes3.dex */
        public static final class C15718c implements Y94<C36207Tq4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65556a;

            public C15718c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65556a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C36207Tq4 get() {
                return (C36207Tq4) C51679xZ3.m5003d(this.f65556a.mo27595B1());
            }
        }

        /* renamed from: co.bird.android.feature.servicecenter.status.bulk.update.a$a$d */
        /* loaded from: classes3.dex */
        public static final class C15719d implements Y94<InterfaceC33193Gt5> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65557a;

            public C15719d(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65557a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC33193Gt5 get() {
                return (InterfaceC33193Gt5) C51679xZ3.m5003d(this.f65557a.mo27534Y());
            }
        }

        @Override // co.bird.android.feature.servicecenter.status.bulk.update.BulkServiceProgressUpdateActivity.InterfaceC15711a
        /* renamed from: a */
        public void mo56711a(BulkServiceProgressUpdateActivity bulkServiceProgressUpdateActivity) {
            m56709c(bulkServiceProgressUpdateActivity);
        }

        /* renamed from: b */
        public final void m56710b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C12291b6 c12291b6) {
            this.f65542c = new C15717b(interfaceC44393lG2);
            this.f65543d = new C15719d(interfaceC44393lG2);
            this.f65544e = C39546d52.m44621a(scopeProvider);
            this.f65545f = C39546d52.m44621a(baseActivity);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(c12291b6);
            this.f65546g = m44621a;
            C26447nE m24136a = C26447nE.m24136a(this.f65545f, m44621a);
            this.f65547h = m24136a;
            this.f65548i = V51.m80429b(m24136a);
            this.f65549j = new C15716a(interfaceC44393lG2);
            this.f65550k = V51.m80429b(C47845r50.m16511a());
            C15718c c15718c = new C15718c(interfaceC44393lG2);
            this.f65551l = c15718c;
            F50 m107807a = F50.m107807a(this.f65542c, this.f65543d, this.f65544e, this.f65548i, this.f65549j, this.f65550k, c15718c);
            this.f65552m = m107807a;
            this.f65553n = V51.m80429b(m107807a);
        }

        /* renamed from: c */
        public final BulkServiceProgressUpdateActivity m56709c(BulkServiceProgressUpdateActivity bulkServiceProgressUpdateActivity) {
            C5135Ly.m96068n(bulkServiceProgressUpdateActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65540a.mo27461w2()));
            C5135Ly.m96066p(bulkServiceProgressUpdateActivity, (C36207Tq4) C51679xZ3.m5003d(this.f65540a.mo27595B1()));
            C5135Ly.m96071k(bulkServiceProgressUpdateActivity, (Handler) C51679xZ3.m5003d(this.f65540a.mo27535X2()));
            C5135Ly.m96067o(bulkServiceProgressUpdateActivity, (C22454gl) C51679xZ3.m5003d(this.f65540a.mo27479r()));
            C5135Ly.m96080b(bulkServiceProgressUpdateActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f65540a.mo27519d0()));
            C5135Ly.m96075g(bulkServiceProgressUpdateActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f65540a.mo27453z2()));
            C5135Ly.m96064r(bulkServiceProgressUpdateActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65540a.mo27459x1()));
            C5135Ly.m96081a(bulkServiceProgressUpdateActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f65540a.mo27474s()));
            C5135Ly.m96073i(bulkServiceProgressUpdateActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f65540a.mo27558P0()));
            C5135Ly.m96074h(bulkServiceProgressUpdateActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f65540a.mo27598A0()));
            C5135Ly.m96077e(bulkServiceProgressUpdateActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f65540a.mo27507i0()));
            C5135Ly.m96070l(bulkServiceProgressUpdateActivity, (FO2) C51679xZ3.m5003d(this.f65540a.mo27456y2()));
            C5135Ly.m96065q(bulkServiceProgressUpdateActivity, (YR4) C51679xZ3.m5003d(this.f65540a.mo27525b0()));
            C5135Ly.m96079c(bulkServiceProgressUpdateActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f65540a.mo27460x()));
            C5135Ly.m96078d(bulkServiceProgressUpdateActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f65540a.mo27517d3()));
            C5135Ly.m96072j(bulkServiceProgressUpdateActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f65540a.mo27482q()));
            C5135Ly.m96076f(bulkServiceProgressUpdateActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f65540a.mo27483p3()));
            C45473n50.m24483b(bulkServiceProgressUpdateActivity, this.f65553n.get());
            return bulkServiceProgressUpdateActivity;
        }

        public C15715a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C12291b6 c12291b6) {
            this.f65541b = this;
            this.f65540a = interfaceC44393lG2;
            m56710b(interfaceC44393lG2, baseActivity, scopeProvider, c12291b6);
        }
    }

    /* renamed from: co.bird.android.feature.servicecenter.status.bulk.update.a$b */
    /* loaded from: classes3.dex */
    public static final class C15720b implements BulkServiceProgressUpdateActivity.InterfaceC15711a.InterfaceC15712a {
        @Override // co.bird.android.feature.servicecenter.status.bulk.update.BulkServiceProgressUpdateActivity.InterfaceC15711a.InterfaceC15712a
        /* renamed from: a */
        public BulkServiceProgressUpdateActivity.InterfaceC15711a mo56704a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C12291b6 c12291b6) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c12291b6);
            return new C15715a(interfaceC44393lG2, baseActivity, scopeProvider, c12291b6);
        }

        private C15720b() {
        }
    }

    private C15714a() {
    }

    /* renamed from: a */
    public static BulkServiceProgressUpdateActivity.InterfaceC15711a.InterfaceC15712a m56712a() {
        return new C15720b();
    }
}
