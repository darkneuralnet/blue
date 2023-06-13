package co.bird.android.feature.servicecenter.batches.batchsearch;

import android.content.Context;
import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.servicecenter.batches.batchsearch.BatchSearchActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.servicecenter.batches.batchsearch.a */
/* loaded from: classes3.dex */
public final class C15580a {

    /* renamed from: co.bird.android.feature.servicecenter.batches.batchsearch.a$a */
    /* loaded from: classes3.dex */
    public static final class C15581a implements BatchSearchActivity.InterfaceC15577a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f65284a;

        /* renamed from: b */
        public final C15581a f65285b;

        /* renamed from: c */
        public Y94<BaseActivity> f65286c;

        /* renamed from: d */
        public Y94<C9603Y2> f65287d;

        /* renamed from: e */
        public Y94<C5519NF> f65288e;

        /* renamed from: f */
        public Y94<ScopeProvider> f65289f;

        /* renamed from: g */
        public Y94<InterfaceC40099e13> f65290g;

        /* renamed from: h */
        public Y94<Context> f65291h;

        /* renamed from: i */
        public Y94<C27561qF> f65292i;

        /* renamed from: j */
        public Y94<InterfaceC46473om3> f65293j;

        /* renamed from: k */
        public Y94<C3095HF> f65294k;

        /* renamed from: co.bird.android.feature.servicecenter.batches.batchsearch.a$a$a */
        /* loaded from: classes3.dex */
        public static final class C15582a implements Y94<Context> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65295a;

            public C15582a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65295a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public Context get() {
                return (Context) C51679xZ3.m5003d(this.f65295a.mo27552R1());
            }
        }

        /* renamed from: co.bird.android.feature.servicecenter.batches.batchsearch.a$a$b */
        /* loaded from: classes3.dex */
        public static final class C15583b implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65296a;

            public C15583b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65296a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f65296a.mo27461w2());
            }
        }

        /* renamed from: co.bird.android.feature.servicecenter.batches.batchsearch.a$a$c */
        /* loaded from: classes3.dex */
        public static final class C15584c implements Y94<InterfaceC46473om3> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65297a;

            public C15584c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65297a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC46473om3 get() {
                return (InterfaceC46473om3) C51679xZ3.m5003d(this.f65297a.mo27584F0());
            }
        }

        @Override // co.bird.android.feature.servicecenter.batches.batchsearch.BatchSearchActivity.InterfaceC15577a
        /* renamed from: a */
        public void mo56904a(BatchSearchActivity batchSearchActivity) {
            m56902c(batchSearchActivity);
        }

        /* renamed from: b */
        public final void m56903b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C9603Y2 c9603y2) {
            this.f65286c = C39546d52.m44621a(baseActivity);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(c9603y2);
            this.f65287d = m44621a;
            this.f65288e = V51.m80429b(C5931OF.m92592a(this.f65286c, m44621a));
            this.f65289f = C39546d52.m44621a(scopeProvider);
            this.f65290g = new C15583b(interfaceC44393lG2);
            C15582a c15582a = new C15582a(interfaceC44393lG2);
            this.f65291h = c15582a;
            this.f65292i = C27889rF.m16161a(c15582a);
            C15584c c15584c = new C15584c(interfaceC44393lG2);
            this.f65293j = c15584c;
            this.f65294k = V51.m80429b(C3455IF.m102678a(this.f65288e, this.f65289f, this.f65290g, this.f65292i, c15584c));
        }

        /* renamed from: c */
        public final BatchSearchActivity m56902c(BatchSearchActivity batchSearchActivity) {
            C5135Ly.m96068n(batchSearchActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65284a.mo27461w2()));
            C5135Ly.m96066p(batchSearchActivity, (C36207Tq4) C51679xZ3.m5003d(this.f65284a.mo27595B1()));
            C5135Ly.m96071k(batchSearchActivity, (Handler) C51679xZ3.m5003d(this.f65284a.mo27535X2()));
            C5135Ly.m96067o(batchSearchActivity, (C22454gl) C51679xZ3.m5003d(this.f65284a.mo27479r()));
            C5135Ly.m96080b(batchSearchActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f65284a.mo27519d0()));
            C5135Ly.m96075g(batchSearchActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f65284a.mo27453z2()));
            C5135Ly.m96064r(batchSearchActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65284a.mo27459x1()));
            C5135Ly.m96081a(batchSearchActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f65284a.mo27474s()));
            C5135Ly.m96073i(batchSearchActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f65284a.mo27558P0()));
            C5135Ly.m96074h(batchSearchActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f65284a.mo27598A0()));
            C5135Ly.m96077e(batchSearchActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f65284a.mo27507i0()));
            C5135Ly.m96070l(batchSearchActivity, (FO2) C51679xZ3.m5003d(this.f65284a.mo27456y2()));
            C5135Ly.m96065q(batchSearchActivity, (YR4) C51679xZ3.m5003d(this.f65284a.mo27525b0()));
            C5135Ly.m96079c(batchSearchActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f65284a.mo27460x()));
            C5135Ly.m96078d(batchSearchActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f65284a.mo27517d3()));
            C5135Ly.m96072j(batchSearchActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f65284a.mo27482q()));
            C5135Ly.m96076f(batchSearchActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f65284a.mo27483p3()));
            C24749jF.m30951b(batchSearchActivity, this.f65294k.get());
            return batchSearchActivity;
        }

        public C15581a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C9603Y2 c9603y2) {
            this.f65285b = this;
            this.f65284a = interfaceC44393lG2;
            m56903b(interfaceC44393lG2, baseActivity, scopeProvider, c9603y2);
        }
    }

    /* renamed from: co.bird.android.feature.servicecenter.batches.batchsearch.a$b */
    /* loaded from: classes3.dex */
    public static final class C15585b implements BatchSearchActivity.InterfaceC15577a.InterfaceC15578a {
        @Override // co.bird.android.feature.servicecenter.batches.batchsearch.BatchSearchActivity.InterfaceC15577a.InterfaceC15578a
        /* renamed from: a */
        public BatchSearchActivity.InterfaceC15577a mo56898a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C9603Y2 c9603y2) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c9603y2);
            return new C15581a(interfaceC44393lG2, baseActivity, scopeProvider, c9603y2);
        }

        private C15585b() {
        }
    }

    private C15580a() {
    }

    /* renamed from: a */
    public static BatchSearchActivity.InterfaceC15577a.InterfaceC15578a m56905a() {
        return new C15585b();
    }
}
