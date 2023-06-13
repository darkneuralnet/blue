package co.bird.android.feature.operator.ridedetail;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.operator.ridedetail.OperatorRideDetailActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.operator.ridedetail.a */
/* loaded from: classes3.dex */
public final class C15025a {

    /* renamed from: co.bird.android.feature.operator.ridedetail.a$a */
    /* loaded from: classes3.dex */
    public static final class C15026a implements OperatorRideDetailActivity.InterfaceC15023a.InterfaceC15024a {
        @Override // co.bird.android.feature.operator.ridedetail.OperatorRideDetailActivity.InterfaceC15023a.InterfaceC15024a
        /* renamed from: a */
        public OperatorRideDetailActivity.InterfaceC15023a mo57871a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C30900z4 c30900z4) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c30900z4);
            return new C15027b(interfaceC44393lG2, baseActivity, scopeProvider, c30900z4);
        }

        private C15026a() {
        }
    }

    /* renamed from: co.bird.android.feature.operator.ridedetail.a$b */
    /* loaded from: classes3.dex */
    public static final class C15027b implements OperatorRideDetailActivity.InterfaceC15023a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f64290a;

        /* renamed from: b */
        public final ScopeProvider f64291b;

        /* renamed from: c */
        public final C30900z4 f64292c;

        /* renamed from: d */
        public final C15027b f64293d;

        @Override // co.bird.android.feature.operator.ridedetail.OperatorRideDetailActivity.InterfaceC15023a
        /* renamed from: a */
        public void mo57870a(OperatorRideDetailActivity operatorRideDetailActivity) {
            m57869b(operatorRideDetailActivity);
        }

        /* renamed from: b */
        public final OperatorRideDetailActivity m57869b(OperatorRideDetailActivity operatorRideDetailActivity) {
            C5135Ly.m96068n(operatorRideDetailActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64290a.mo27461w2()));
            C5135Ly.m96066p(operatorRideDetailActivity, (C36207Tq4) C51679xZ3.m5003d(this.f64290a.mo27595B1()));
            C5135Ly.m96071k(operatorRideDetailActivity, (Handler) C51679xZ3.m5003d(this.f64290a.mo27535X2()));
            C5135Ly.m96067o(operatorRideDetailActivity, (C22454gl) C51679xZ3.m5003d(this.f64290a.mo27479r()));
            C5135Ly.m96080b(operatorRideDetailActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64290a.mo27519d0()));
            C5135Ly.m96075g(operatorRideDetailActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f64290a.mo27453z2()));
            C5135Ly.m96064r(operatorRideDetailActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f64290a.mo27459x1()));
            C5135Ly.m96081a(operatorRideDetailActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f64290a.mo27474s()));
            C5135Ly.m96073i(operatorRideDetailActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f64290a.mo27558P0()));
            C5135Ly.m96074h(operatorRideDetailActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f64290a.mo27598A0()));
            C5135Ly.m96077e(operatorRideDetailActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f64290a.mo27507i0()));
            C5135Ly.m96070l(operatorRideDetailActivity, (FO2) C51679xZ3.m5003d(this.f64290a.mo27456y2()));
            C5135Ly.m96065q(operatorRideDetailActivity, (YR4) C51679xZ3.m5003d(this.f64290a.mo27525b0()));
            C5135Ly.m96079c(operatorRideDetailActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f64290a.mo27460x()));
            C5135Ly.m96078d(operatorRideDetailActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f64290a.mo27517d3()));
            C5135Ly.m96072j(operatorRideDetailActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f64290a.mo27482q()));
            C5135Ly.m96076f(operatorRideDetailActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f64290a.mo27483p3()));
            C37160Xs3.m76182b(operatorRideDetailActivity, m57868c());
            return operatorRideDetailActivity;
        }

        /* renamed from: c */
        public final C37628Zs3 m57868c() {
            return new C37628Zs3((InterfaceC40001dr4) C51679xZ3.m5003d(this.f64290a.mo27482q()), (InterfaceC46473om3) C51679xZ3.m5003d(this.f64290a.mo27584F0()), (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64290a.mo27519d0()), this.f64291b, m57867d());
        }

        /* renamed from: d */
        public final C38817bt3 m57867d() {
            return new C38817bt3(this.f64292c);
        }

        public C15027b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C30900z4 c30900z4) {
            this.f64293d = this;
            this.f64290a = interfaceC44393lG2;
            this.f64291b = scopeProvider;
            this.f64292c = c30900z4;
        }
    }

    private C15025a() {
    }

    /* renamed from: a */
    public static OperatorRideDetailActivity.InterfaceC15023a.InterfaceC15024a m57872a() {
        return new C15026a();
    }
}
