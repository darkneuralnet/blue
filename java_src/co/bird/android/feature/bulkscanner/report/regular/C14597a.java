package co.bird.android.feature.bulkscanner.report.regular;

import android.content.Context;
import android.os.Handler;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC11719f;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.bulkscanner.report.regular.BulkStatusReportActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.bulkscanner.report.regular.a */
/* loaded from: classes3.dex */
public final class C14597a {

    /* renamed from: co.bird.android.feature.bulkscanner.report.regular.a$a */
    /* loaded from: classes3.dex */
    public static final class C14598a implements BulkStatusReportActivity.InterfaceC14595b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f63408a;

        /* renamed from: b */
        public final ScopeProvider f63409b;

        /* renamed from: c */
        public final C14598a f63410c;

        /* renamed from: d */
        public Y94<BaseActivity> f63411d;

        /* renamed from: e */
        public Y94<C20179f3> f63412e;

        /* renamed from: f */
        public Y94<InterfaceC36187To2> f63413f;

        /* renamed from: g */
        public Y94<C4176Jf> f63414g;

        /* renamed from: h */
        public Y94<Context> f63415h;

        /* renamed from: i */
        public Y94<C12470bg> f63416i;

        /* renamed from: j */
        public Y94<C52379yk1> f63417j;

        /* renamed from: k */
        public Y94<I60> f63418k;

        /* renamed from: l */
        public Y94<InterfaceC27649qg> f63419l;

        /* renamed from: m */
        public Y94<C36207Tq4> f63420m;

        /* renamed from: n */
        public Y94<InterfaceC1880Ea> f63421n;

        /* renamed from: o */
        public Y94<C22454gl> f63422o;

        /* renamed from: p */
        public Y94<YR4> f63423p;

        /* renamed from: q */
        public Y94<InterfaceC46893pU4> f63424q;

        /* renamed from: r */
        public Y94<InterfaceC36149Tk0> f63425r;

        /* renamed from: s */
        public Y94<ScopeProvider> f63426s;

        /* renamed from: t */
        public Y94<InterfaceC40099e13> f63427t;

        /* renamed from: u */
        public C51193wk1 f63428u;

        /* renamed from: v */
        public Y94<InterfaceC50008uk1> f63429v;

        /* renamed from: co.bird.android.feature.bulkscanner.report.regular.a$a$a */
        /* loaded from: classes3.dex */
        public static final class C14599a implements Y94<InterfaceC1880Ea> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f63430a;

            public C14599a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f63430a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC1880Ea get() {
                return (InterfaceC1880Ea) C51679xZ3.m5003d(this.f63430a.mo27519d0());
            }
        }

        /* renamed from: co.bird.android.feature.bulkscanner.report.regular.a$a$b */
        /* loaded from: classes3.dex */
        public static final class C14600b implements Y94<C22454gl> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f63431a;

            public C14600b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f63431a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C22454gl get() {
                return (C22454gl) C51679xZ3.m5003d(this.f63431a.mo27479r());
            }
        }

        /* renamed from: co.bird.android.feature.bulkscanner.report.regular.a$a$c */
        /* loaded from: classes3.dex */
        public static final class C14601c implements Y94<Context> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f63432a;

            public C14601c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f63432a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public Context get() {
                return (Context) C51679xZ3.m5003d(this.f63432a.mo27552R1());
            }
        }

        /* renamed from: co.bird.android.feature.bulkscanner.report.regular.a$a$d */
        /* loaded from: classes3.dex */
        public static final class C14602d implements Y94<InterfaceC27649qg> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f63433a;

            public C14602d(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f63433a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC27649qg get() {
                return (InterfaceC27649qg) C51679xZ3.m5003d(this.f63433a.mo27476r2());
            }
        }

        /* renamed from: co.bird.android.feature.bulkscanner.report.regular.a$a$e */
        /* loaded from: classes3.dex */
        public static final class C14603e implements Y94<InterfaceC36187To2> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f63434a;

            public C14603e(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f63434a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC36187To2 get() {
                return (InterfaceC36187To2) C51679xZ3.m5003d(this.f63434a.mo27527a1());
            }
        }

        /* renamed from: co.bird.android.feature.bulkscanner.report.regular.a$a$f */
        /* loaded from: classes3.dex */
        public static final class C14604f implements Y94<InterfaceC36149Tk0> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f63435a;

            public C14604f(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f63435a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC36149Tk0 get() {
                return (InterfaceC36149Tk0) C51679xZ3.m5003d(this.f63435a.mo27490n());
            }
        }

        /* renamed from: co.bird.android.feature.bulkscanner.report.regular.a$a$g */
        /* loaded from: classes3.dex */
        public static final class C14605g implements Y94<YR4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f63436a;

            public C14605g(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f63436a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public YR4 get() {
                return (YR4) C51679xZ3.m5003d(this.f63436a.mo27525b0());
            }
        }

        /* renamed from: co.bird.android.feature.bulkscanner.report.regular.a$a$h */
        /* loaded from: classes3.dex */
        public static final class C14606h implements Y94<InterfaceC46893pU4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f63437a;

            public C14606h(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f63437a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC46893pU4 get() {
                return (InterfaceC46893pU4) C51679xZ3.m5003d(this.f63437a.mo27566M0());
            }
        }

        /* renamed from: co.bird.android.feature.bulkscanner.report.regular.a$a$i */
        /* loaded from: classes3.dex */
        public static final class C14607i implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f63438a;

            public C14607i(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f63438a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f63438a.mo27461w2());
            }
        }

        /* renamed from: co.bird.android.feature.bulkscanner.report.regular.a$a$j */
        /* loaded from: classes3.dex */
        public static final class C14608j implements Y94<C36207Tq4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f63439a;

            public C14608j(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f63439a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C36207Tq4 get() {
                return (C36207Tq4) C51679xZ3.m5003d(this.f63439a.mo27595B1());
            }
        }

        @Override // co.bird.android.feature.bulkscanner.report.regular.BulkStatusReportActivity.InterfaceC14595b
        /* renamed from: a */
        public void mo58644a(BulkStatusReportActivity bulkStatusReportActivity) {
            m58640e(bulkStatusReportActivity);
        }

        /* renamed from: b */
        public final H50 m58643b() {
            return new H50((Context) C51679xZ3.m5003d(this.f63408a.mo27552R1()));
        }

        /* renamed from: c */
        public final C45483n60 m58642c() {
            return new C45483n60((InterfaceC46473om3) C51679xZ3.m5003d(this.f63408a.mo27584F0()), (InterfaceC48164rd5) C51679xZ3.m5003d(this.f63408a.mo27463w()), (InterfaceC20340fF) C51679xZ3.m5003d(this.f63408a.mo27591C1()), (InterfaceC1880Ea) C51679xZ3.m5003d(this.f63408a.mo27519d0()), (C36207Tq4) C51679xZ3.m5003d(this.f63408a.mo27595B1()), this.f63409b, (InterfaceC40099e13) C51679xZ3.m5003d(this.f63408a.mo27461w2()), this.f63418k.get(), (Handler) C51679xZ3.m5003d(this.f63408a.mo27535X2()), m58643b());
        }

        /* renamed from: d */
        public final void m58641d(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C20179f3 c20179f3, FragmentManager fragmentManager, AbstractC11719f abstractC11719f) {
            this.f63411d = C39546d52.m44621a(baseActivity);
            this.f63412e = C39546d52.m44621a(c20179f3);
            C14603e c14603e = new C14603e(interfaceC44393lG2);
            this.f63413f = c14603e;
            this.f63414g = C4518Kf.m98626a(c14603e);
            C14601c c14601c = new C14601c(interfaceC44393lG2);
            this.f63415h = c14601c;
            C13613cg m61075a = C13613cg.m61075a(c14601c);
            this.f63416i = m61075a;
            C52972zk1 m459a = C52972zk1.m459a(this.f63413f, this.f63411d, this.f63414g, m61075a);
            this.f63417j = m459a;
            this.f63418k = V51.m80429b(J60.m101149a(this.f63411d, this.f63412e, m459a));
            this.f63419l = new C14602d(interfaceC44393lG2);
            this.f63420m = new C14608j(interfaceC44393lG2);
            this.f63421n = new C14599a(interfaceC44393lG2);
            this.f63422o = new C14600b(interfaceC44393lG2);
            this.f63423p = new C14605g(interfaceC44393lG2);
            this.f63424q = new C14606h(interfaceC44393lG2);
            this.f63425r = new C14604f(interfaceC44393lG2);
            this.f63426s = C39546d52.m44621a(scopeProvider);
            C14607i c14607i = new C14607i(interfaceC44393lG2);
            this.f63427t = c14607i;
            C51193wk1 m6423a = C51193wk1.m6423a(this.f63419l, this.f63420m, this.f63421n, this.f63422o, this.f63423p, this.f63424q, this.f63425r, this.f63418k, this.f63426s, c14607i);
            this.f63428u = m6423a;
            this.f63429v = C50600vk1.m8209b(m6423a);
        }

        /* renamed from: e */
        public final BulkStatusReportActivity m58640e(BulkStatusReportActivity bulkStatusReportActivity) {
            C5135Ly.m96068n(bulkStatusReportActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f63408a.mo27461w2()));
            C5135Ly.m96066p(bulkStatusReportActivity, (C36207Tq4) C51679xZ3.m5003d(this.f63408a.mo27595B1()));
            C5135Ly.m96071k(bulkStatusReportActivity, (Handler) C51679xZ3.m5003d(this.f63408a.mo27535X2()));
            C5135Ly.m96067o(bulkStatusReportActivity, (C22454gl) C51679xZ3.m5003d(this.f63408a.mo27479r()));
            C5135Ly.m96080b(bulkStatusReportActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f63408a.mo27519d0()));
            C5135Ly.m96075g(bulkStatusReportActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f63408a.mo27453z2()));
            C5135Ly.m96064r(bulkStatusReportActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f63408a.mo27459x1()));
            C5135Ly.m96081a(bulkStatusReportActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f63408a.mo27474s()));
            C5135Ly.m96073i(bulkStatusReportActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f63408a.mo27558P0()));
            C5135Ly.m96074h(bulkStatusReportActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f63408a.mo27598A0()));
            C5135Ly.m96077e(bulkStatusReportActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f63408a.mo27507i0()));
            C5135Ly.m96070l(bulkStatusReportActivity, (FO2) C51679xZ3.m5003d(this.f63408a.mo27456y2()));
            C5135Ly.m96065q(bulkStatusReportActivity, (YR4) C51679xZ3.m5003d(this.f63408a.mo27525b0()));
            C5135Ly.m96079c(bulkStatusReportActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f63408a.mo27460x()));
            C5135Ly.m96078d(bulkStatusReportActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f63408a.mo27517d3()));
            C5135Ly.m96072j(bulkStatusReportActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f63408a.mo27482q()));
            C5135Ly.m96076f(bulkStatusReportActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f63408a.mo27483p3()));
            J50.m101190c(bulkStatusReportActivity, m58642c());
            J50.m101192a(bulkStatusReportActivity, this.f63429v.get());
            J50.m101189d(bulkStatusReportActivity, (InterfaceC35660Rh6) C51679xZ3.m5003d(this.f63408a.mo27500k1()));
            return bulkStatusReportActivity;
        }

        public C14598a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C20179f3 c20179f3, FragmentManager fragmentManager, AbstractC11719f abstractC11719f) {
            this.f63410c = this;
            this.f63408a = interfaceC44393lG2;
            this.f63409b = scopeProvider;
            m58641d(interfaceC44393lG2, baseActivity, scopeProvider, c20179f3, fragmentManager, abstractC11719f);
        }
    }

    /* renamed from: co.bird.android.feature.bulkscanner.report.regular.a$b */
    /* loaded from: classes3.dex */
    public static final class C14609b implements BulkStatusReportActivity.InterfaceC14595b.InterfaceC14596a {
        @Override // co.bird.android.feature.bulkscanner.report.regular.BulkStatusReportActivity.InterfaceC14595b.InterfaceC14596a
        /* renamed from: a */
        public BulkStatusReportActivity.InterfaceC14595b mo58629a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C20179f3 c20179f3, FragmentManager fragmentManager, AbstractC11719f abstractC11719f) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c20179f3);
            C51679xZ3.m5005b(fragmentManager);
            C51679xZ3.m5005b(abstractC11719f);
            return new C14598a(interfaceC44393lG2, baseActivity, scopeProvider, c20179f3, fragmentManager, abstractC11719f);
        }

        private C14609b() {
        }
    }

    private C14597a() {
    }

    /* renamed from: a */
    public static BulkStatusReportActivity.InterfaceC14595b.InterfaceC14596a m58645a() {
        return new C14609b();
    }
}
