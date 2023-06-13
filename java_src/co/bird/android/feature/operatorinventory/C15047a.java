package co.bird.android.feature.operatorinventory;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.operatorinventory.InventoryPartDetailsActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.operatorinventory.a */
/* loaded from: classes3.dex */
public final class C15047a {

    /* renamed from: co.bird.android.feature.operatorinventory.a$a */
    /* loaded from: classes3.dex */
    public static final class C15048a implements InventoryPartDetailsActivity.InterfaceC15043a.InterfaceC15044a {
        @Override // co.bird.android.feature.operatorinventory.InventoryPartDetailsActivity.InterfaceC15043a.InterfaceC15044a
        /* renamed from: a */
        public InventoryPartDetailsActivity.InterfaceC15043a mo57839a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C9290X3 c9290x3) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c9290x3);
            return new C15049b(interfaceC44393lG2, baseActivity, scopeProvider, c9290x3);
        }

        private C15048a() {
        }
    }

    /* renamed from: co.bird.android.feature.operatorinventory.a$b */
    /* loaded from: classes3.dex */
    public static final class C15049b implements InventoryPartDetailsActivity.InterfaceC15043a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f64323a;

        /* renamed from: b */
        public final ScopeProvider f64324b;

        /* renamed from: c */
        public final BaseActivity f64325c;

        /* renamed from: d */
        public final C9290X3 f64326d;

        /* renamed from: e */
        public final C15049b f64327e;

        @Override // co.bird.android.feature.operatorinventory.InventoryPartDetailsActivity.InterfaceC15043a
        /* renamed from: a */
        public void mo57838a(InventoryPartDetailsActivity inventoryPartDetailsActivity) {
            m57837b(inventoryPartDetailsActivity);
        }

        /* renamed from: b */
        public final InventoryPartDetailsActivity m57837b(InventoryPartDetailsActivity inventoryPartDetailsActivity) {
            C5135Ly.m96068n(inventoryPartDetailsActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64323a.mo27461w2()));
            C5135Ly.m96066p(inventoryPartDetailsActivity, (C36207Tq4) C51679xZ3.m5003d(this.f64323a.mo27595B1()));
            C5135Ly.m96071k(inventoryPartDetailsActivity, (Handler) C51679xZ3.m5003d(this.f64323a.mo27535X2()));
            C5135Ly.m96067o(inventoryPartDetailsActivity, (C22454gl) C51679xZ3.m5003d(this.f64323a.mo27479r()));
            C5135Ly.m96080b(inventoryPartDetailsActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64323a.mo27519d0()));
            C5135Ly.m96075g(inventoryPartDetailsActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f64323a.mo27453z2()));
            C5135Ly.m96064r(inventoryPartDetailsActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f64323a.mo27459x1()));
            C5135Ly.m96081a(inventoryPartDetailsActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f64323a.mo27474s()));
            C5135Ly.m96073i(inventoryPartDetailsActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f64323a.mo27558P0()));
            C5135Ly.m96074h(inventoryPartDetailsActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f64323a.mo27598A0()));
            C5135Ly.m96077e(inventoryPartDetailsActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f64323a.mo27507i0()));
            C5135Ly.m96070l(inventoryPartDetailsActivity, (FO2) C51679xZ3.m5003d(this.f64323a.mo27456y2()));
            C5135Ly.m96065q(inventoryPartDetailsActivity, (YR4) C51679xZ3.m5003d(this.f64323a.mo27525b0()));
            C5135Ly.m96079c(inventoryPartDetailsActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f64323a.mo27460x()));
            C5135Ly.m96078d(inventoryPartDetailsActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f64323a.mo27517d3()));
            C5135Ly.m96072j(inventoryPartDetailsActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f64323a.mo27482q()));
            C5135Ly.m96076f(inventoryPartDetailsActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f64323a.mo27483p3()));
            M82.m95688b(inventoryPartDetailsActivity, m57836c());
            return inventoryPartDetailsActivity;
        }

        /* renamed from: c */
        public final X82 m57836c() {
            return new X82((InterfaceC37097Xl3) C51679xZ3.m5003d(this.f64323a.mo27542V2()), this.f64324b, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64323a.mo27461w2()), m57835d(), new C39058cI3());
        }

        /* renamed from: d */
        public final Y82 m57835d() {
            return new Y82(this.f64325c, this.f64326d);
        }

        public C15049b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C9290X3 c9290x3) {
            this.f64327e = this;
            this.f64323a = interfaceC44393lG2;
            this.f64324b = scopeProvider;
            this.f64325c = baseActivity;
            this.f64326d = c9290x3;
        }
    }

    private C15047a() {
    }

    /* renamed from: a */
    public static InventoryPartDetailsActivity.InterfaceC15043a.InterfaceC15044a m57840a() {
        return new C15048a();
    }
}
