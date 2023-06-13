package co.bird.android.feature.servicecenter.batches.landing;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.servicecenter.batches.landing.BatchLandingActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.servicecenter.batches.landing.a */
/* loaded from: classes3.dex */
public final class C15597a {

    /* renamed from: co.bird.android.feature.servicecenter.batches.landing.a$a */
    /* loaded from: classes3.dex */
    public static final class C15598a implements BatchLandingActivity.InterfaceC15594a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f65311a;

        /* renamed from: b */
        public final BaseActivity f65312b;

        /* renamed from: c */
        public final C9285X2 f65313c;

        /* renamed from: d */
        public final ScopeProvider f65314d;

        /* renamed from: e */
        public final C15598a f65315e;

        @Override // co.bird.android.feature.servicecenter.batches.landing.BatchLandingActivity.InterfaceC15594a
        /* renamed from: a */
        public void mo56884a(BatchLandingActivity batchLandingActivity) {
            m56881d(batchLandingActivity);
        }

        /* renamed from: b */
        public final C13476cF m56883b() {
            return new C13476cF((C36207Tq4) C51679xZ3.m5003d(this.f65311a.mo27595B1()), m56882c(), this.f65314d, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65311a.mo27461w2()), m56880e());
        }

        /* renamed from: c */
        public final C19996eF m56882c() {
            return new C19996eF(this.f65312b, this.f65313c);
        }

        /* renamed from: d */
        public final BatchLandingActivity m56881d(BatchLandingActivity batchLandingActivity) {
            C5135Ly.m96068n(batchLandingActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65311a.mo27461w2()));
            C5135Ly.m96066p(batchLandingActivity, (C36207Tq4) C51679xZ3.m5003d(this.f65311a.mo27595B1()));
            C5135Ly.m96071k(batchLandingActivity, (Handler) C51679xZ3.m5003d(this.f65311a.mo27535X2()));
            C5135Ly.m96067o(batchLandingActivity, (C22454gl) C51679xZ3.m5003d(this.f65311a.mo27479r()));
            C5135Ly.m96080b(batchLandingActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f65311a.mo27519d0()));
            C5135Ly.m96075g(batchLandingActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f65311a.mo27453z2()));
            C5135Ly.m96064r(batchLandingActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65311a.mo27459x1()));
            C5135Ly.m96081a(batchLandingActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f65311a.mo27474s()));
            C5135Ly.m96073i(batchLandingActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f65311a.mo27558P0()));
            C5135Ly.m96074h(batchLandingActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f65311a.mo27598A0()));
            C5135Ly.m96077e(batchLandingActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f65311a.mo27507i0()));
            C5135Ly.m96070l(batchLandingActivity, (FO2) C51679xZ3.m5003d(this.f65311a.mo27456y2()));
            C5135Ly.m96065q(batchLandingActivity, (YR4) C51679xZ3.m5003d(this.f65311a.mo27525b0()));
            C5135Ly.m96079c(batchLandingActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f65311a.mo27460x()));
            C5135Ly.m96078d(batchLandingActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f65311a.mo27517d3()));
            C5135Ly.m96072j(batchLandingActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f65311a.mo27482q()));
            C5135Ly.m96076f(batchLandingActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f65311a.mo27483p3()));
            C8959WE.m78691b(batchLandingActivity, m56883b());
            return batchLandingActivity;
        }

        /* renamed from: e */
        public final C43038iy6 m56880e() {
            return new C43038iy6((InterfaceC44647lh6) C51679xZ3.m5003d(this.f65311a.mo27459x1()), (InterfaceC36047Sy6) C51679xZ3.m5003d(this.f65311a.mo27571K2()), (C36207Tq4) C51679xZ3.m5003d(this.f65311a.mo27595B1()), this.f65314d, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65311a.mo27461w2()));
        }

        public C15598a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C9285X2 c9285x2) {
            this.f65315e = this;
            this.f65311a = interfaceC44393lG2;
            this.f65312b = baseActivity;
            this.f65313c = c9285x2;
            this.f65314d = scopeProvider;
        }
    }

    /* renamed from: co.bird.android.feature.servicecenter.batches.landing.a$b */
    /* loaded from: classes3.dex */
    public static final class C15599b implements BatchLandingActivity.InterfaceC15594a.InterfaceC15595a {
        @Override // co.bird.android.feature.servicecenter.batches.landing.BatchLandingActivity.InterfaceC15594a.InterfaceC15595a
        /* renamed from: a */
        public BatchLandingActivity.InterfaceC15594a mo56879a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C9285X2 c9285x2) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c9285x2);
            return new C15598a(interfaceC44393lG2, baseActivity, scopeProvider, c9285x2);
        }

        private C15599b() {
        }
    }

    private C15597a() {
    }

    /* renamed from: a */
    public static BatchLandingActivity.InterfaceC15594a.InterfaceC15595a m56885a() {
        return new C15599b();
    }
}
