package co.bird.android.feature.servicecenter.batches.vehiclesinbatch;

import android.content.Context;
import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.servicecenter.batches.vehiclesinbatch.VehiclesInBatchActivity;
import co.bird.android.model.wire.WireBatch;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.servicecenter.batches.vehiclesinbatch.a */
/* loaded from: classes3.dex */
public final class C15603a {

    /* renamed from: co.bird.android.feature.servicecenter.batches.vehiclesinbatch.a$a */
    /* loaded from: classes3.dex */
    public static final class C15604a implements VehiclesInBatchActivity.InterfaceC15600a.InterfaceC15601a {
        @Override // co.bird.android.feature.servicecenter.batches.vehiclesinbatch.VehiclesInBatchActivity.InterfaceC15600a.InterfaceC15601a
        /* renamed from: a */
        public VehiclesInBatchActivity.InterfaceC15600a mo56873a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C27489q6 c27489q6, WireBatch wireBatch) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c27489q6);
            C51679xZ3.m5005b(wireBatch);
            return new C15605b(interfaceC44393lG2, baseActivity, scopeProvider, c27489q6, wireBatch);
        }

        private C15604a() {
        }
    }

    /* renamed from: co.bird.android.feature.servicecenter.batches.vehiclesinbatch.a$b */
    /* loaded from: classes3.dex */
    public static final class C15605b implements VehiclesInBatchActivity.InterfaceC15600a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f65317a;

        /* renamed from: b */
        public final BaseActivity f65318b;

        /* renamed from: c */
        public final C27489q6 f65319c;

        /* renamed from: d */
        public final ScopeProvider f65320d;

        /* renamed from: e */
        public final WireBatch f65321e;

        /* renamed from: f */
        public final C15605b f65322f;

        @Override // co.bird.android.feature.servicecenter.batches.vehiclesinbatch.VehiclesInBatchActivity.InterfaceC15600a
        /* renamed from: a */
        public void mo56872a(VehiclesInBatchActivity vehiclesInBatchActivity) {
            m56871b(vehiclesInBatchActivity);
        }

        /* renamed from: b */
        public final VehiclesInBatchActivity m56871b(VehiclesInBatchActivity vehiclesInBatchActivity) {
            C5135Ly.m96068n(vehiclesInBatchActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65317a.mo27461w2()));
            C5135Ly.m96066p(vehiclesInBatchActivity, (C36207Tq4) C51679xZ3.m5003d(this.f65317a.mo27595B1()));
            C5135Ly.m96071k(vehiclesInBatchActivity, (Handler) C51679xZ3.m5003d(this.f65317a.mo27535X2()));
            C5135Ly.m96067o(vehiclesInBatchActivity, (C22454gl) C51679xZ3.m5003d(this.f65317a.mo27479r()));
            C5135Ly.m96080b(vehiclesInBatchActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f65317a.mo27519d0()));
            C5135Ly.m96075g(vehiclesInBatchActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f65317a.mo27453z2()));
            C5135Ly.m96064r(vehiclesInBatchActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65317a.mo27459x1()));
            C5135Ly.m96081a(vehiclesInBatchActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f65317a.mo27474s()));
            C5135Ly.m96073i(vehiclesInBatchActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f65317a.mo27558P0()));
            C5135Ly.m96074h(vehiclesInBatchActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f65317a.mo27598A0()));
            C5135Ly.m96077e(vehiclesInBatchActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f65317a.mo27507i0()));
            C5135Ly.m96070l(vehiclesInBatchActivity, (FO2) C51679xZ3.m5003d(this.f65317a.mo27456y2()));
            C5135Ly.m96065q(vehiclesInBatchActivity, (YR4) C51679xZ3.m5003d(this.f65317a.mo27525b0()));
            C5135Ly.m96079c(vehiclesInBatchActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f65317a.mo27460x()));
            C5135Ly.m96078d(vehiclesInBatchActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f65317a.mo27517d3()));
            C5135Ly.m96072j(vehiclesInBatchActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f65317a.mo27482q()));
            C5135Ly.m96076f(vehiclesInBatchActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f65317a.mo27483p3()));
            C35012On6.m91395b(vehiclesInBatchActivity, m56869d());
            return vehiclesInBatchActivity;
        }

        /* renamed from: c */
        public final C36650Vn6 m56870c() {
            return new C36650Vn6((Context) C51679xZ3.m5003d(this.f65317a.mo27552R1()));
        }

        /* renamed from: d */
        public final C45310mo6 m56869d() {
            return new C45310mo6(m56868e(), this.f65320d, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65317a.mo27461w2()), m56870c(), this.f65321e, (InterfaceC20340fF) C51679xZ3.m5003d(this.f65317a.mo27591C1()), (InterfaceC46473om3) C51679xZ3.m5003d(this.f65317a.mo27584F0()));
        }

        /* renamed from: e */
        public final C47682qo6 m56868e() {
            return new C47682qo6(this.f65318b, this.f65319c);
        }

        public C15605b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C27489q6 c27489q6, WireBatch wireBatch) {
            this.f65322f = this;
            this.f65317a = interfaceC44393lG2;
            this.f65318b = baseActivity;
            this.f65319c = c27489q6;
            this.f65320d = scopeProvider;
            this.f65321e = wireBatch;
        }
    }

    private C15603a() {
    }

    /* renamed from: a */
    public static VehiclesInBatchActivity.InterfaceC15600a.InterfaceC15601a m56874a() {
        return new C15604a();
    }
}
