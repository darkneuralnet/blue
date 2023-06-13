package co.bird.android.feature.servicecenter.batches.createbatch;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.servicecenter.batches.createbatch.CreateBatchActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.servicecenter.batches.createbatch.a */
/* loaded from: classes3.dex */
public final class C15589a {

    /* renamed from: co.bird.android.feature.servicecenter.batches.createbatch.a$a */
    /* loaded from: classes3.dex */
    public static final class C15590a implements CreateBatchActivity.InterfaceC15586a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f65299a;

        /* renamed from: b */
        public final C15590a f65300b;

        /* renamed from: c */
        public Y94<InterfaceC20340fF> f65301c;

        /* renamed from: d */
        public Y94<InterfaceC40099e13> f65302d;

        /* renamed from: e */
        public Y94<ScopeProvider> f65303e;

        /* renamed from: f */
        public Y94<BaseActivity> f65304f;

        /* renamed from: g */
        public Y94<C28165s3> f65305g;

        /* renamed from: h */
        public Y94<C50894wE0> f65306h;

        /* renamed from: i */
        public Y94<C47338qE0> f65307i;

        /* renamed from: co.bird.android.feature.servicecenter.batches.createbatch.a$a$a */
        /* loaded from: classes3.dex */
        public static final class C15591a implements Y94<InterfaceC20340fF> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65308a;

            public C15591a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65308a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC20340fF get() {
                return (InterfaceC20340fF) C51679xZ3.m5003d(this.f65308a.mo27591C1());
            }
        }

        /* renamed from: co.bird.android.feature.servicecenter.batches.createbatch.a$a$b */
        /* loaded from: classes3.dex */
        public static final class C15592b implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65309a;

            public C15592b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65309a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f65309a.mo27461w2());
            }
        }

        @Override // co.bird.android.feature.servicecenter.batches.createbatch.CreateBatchActivity.InterfaceC15586a
        /* renamed from: a */
        public void mo56894a(CreateBatchActivity createBatchActivity) {
            m56892c(createBatchActivity);
        }

        /* renamed from: b */
        public final void m56893b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C28165s3 c28165s3) {
            this.f65301c = new C15591a(interfaceC44393lG2);
            this.f65302d = new C15592b(interfaceC44393lG2);
            this.f65303e = C39546d52.m44621a(scopeProvider);
            this.f65304f = C39546d52.m44621a(baseActivity);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(c28165s3);
            this.f65305g = m44621a;
            Y94<C50894wE0> m80429b = V51.m80429b(C51487xE0.m5652a(this.f65304f, m44621a));
            this.f65306h = m80429b;
            this.f65307i = V51.m80429b(C49709uE0.m10538a(this.f65301c, this.f65302d, this.f65303e, m80429b));
        }

        /* renamed from: c */
        public final CreateBatchActivity m56892c(CreateBatchActivity createBatchActivity) {
            C5135Ly.m96068n(createBatchActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65299a.mo27461w2()));
            C5135Ly.m96066p(createBatchActivity, (C36207Tq4) C51679xZ3.m5003d(this.f65299a.mo27595B1()));
            C5135Ly.m96071k(createBatchActivity, (Handler) C51679xZ3.m5003d(this.f65299a.mo27535X2()));
            C5135Ly.m96067o(createBatchActivity, (C22454gl) C51679xZ3.m5003d(this.f65299a.mo27479r()));
            C5135Ly.m96080b(createBatchActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f65299a.mo27519d0()));
            C5135Ly.m96075g(createBatchActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f65299a.mo27453z2()));
            C5135Ly.m96064r(createBatchActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65299a.mo27459x1()));
            C5135Ly.m96081a(createBatchActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f65299a.mo27474s()));
            C5135Ly.m96073i(createBatchActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f65299a.mo27558P0()));
            C5135Ly.m96074h(createBatchActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f65299a.mo27598A0()));
            C5135Ly.m96077e(createBatchActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f65299a.mo27507i0()));
            C5135Ly.m96070l(createBatchActivity, (FO2) C51679xZ3.m5003d(this.f65299a.mo27456y2()));
            C5135Ly.m96065q(createBatchActivity, (YR4) C51679xZ3.m5003d(this.f65299a.mo27525b0()));
            C5135Ly.m96079c(createBatchActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f65299a.mo27460x()));
            C5135Ly.m96078d(createBatchActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f65299a.mo27517d3()));
            C5135Ly.m96072j(createBatchActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f65299a.mo27482q()));
            C5135Ly.m96076f(createBatchActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f65299a.mo27483p3()));
            C42594iE0.m34304b(createBatchActivity, this.f65307i.get());
            return createBatchActivity;
        }

        public C15590a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C28165s3 c28165s3) {
            this.f65300b = this;
            this.f65299a = interfaceC44393lG2;
            m56893b(interfaceC44393lG2, baseActivity, scopeProvider, c28165s3);
        }
    }

    /* renamed from: co.bird.android.feature.servicecenter.batches.createbatch.a$b */
    /* loaded from: classes3.dex */
    public static final class C15593b implements CreateBatchActivity.InterfaceC15586a.InterfaceC15587a {
        @Override // co.bird.android.feature.servicecenter.batches.createbatch.CreateBatchActivity.InterfaceC15586a.InterfaceC15587a
        /* renamed from: a */
        public CreateBatchActivity.InterfaceC15586a mo56889a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C28165s3 c28165s3) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c28165s3);
            return new C15590a(interfaceC44393lG2, baseActivity, scopeProvider, c28165s3);
        }

        private C15593b() {
        }
    }

    private C15589a() {
    }

    /* renamed from: a */
    public static CreateBatchActivity.InterfaceC15586a.InterfaceC15587a m56895a() {
        return new C15593b();
    }
}
