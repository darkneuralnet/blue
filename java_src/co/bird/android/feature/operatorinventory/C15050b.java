package co.bird.android.feature.operatorinventory;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.operatorinventory.InventoryPartSelectionActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.operatorinventory.b */
/* loaded from: classes3.dex */
public final class C15050b {

    /* renamed from: co.bird.android.feature.operatorinventory.b$a */
    /* loaded from: classes3.dex */
    public static final class C15051a implements InventoryPartSelectionActivity.InterfaceC15045a.InterfaceC15046a {
        @Override // co.bird.android.feature.operatorinventory.InventoryPartSelectionActivity.InterfaceC15045a.InterfaceC15046a
        /* renamed from: a */
        public InventoryPartSelectionActivity.InterfaceC15045a mo57833a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C9606Y3 c9606y3, C36169Tm2 c36169Tm2) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c9606y3);
            C51679xZ3.m5005b(c36169Tm2);
            return new C15052b(interfaceC44393lG2, baseActivity, scopeProvider, c9606y3, c36169Tm2);
        }

        private C15051a() {
        }
    }

    /* renamed from: co.bird.android.feature.operatorinventory.b$b */
    /* loaded from: classes3.dex */
    public static final class C15052b implements InventoryPartSelectionActivity.InterfaceC15045a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f64328a;

        /* renamed from: b */
        public final ScopeProvider f64329b;

        /* renamed from: c */
        public final BaseActivity f64330c;

        /* renamed from: d */
        public final C9606Y3 f64331d;

        /* renamed from: e */
        public final C36169Tm2 f64332e;

        /* renamed from: f */
        public final C15052b f64333f;

        @Override // co.bird.android.feature.operatorinventory.InventoryPartSelectionActivity.InterfaceC15045a
        /* renamed from: a */
        public void mo57832a(InventoryPartSelectionActivity inventoryPartSelectionActivity) {
            m57831b(inventoryPartSelectionActivity);
        }

        /* renamed from: b */
        public final InventoryPartSelectionActivity m57831b(InventoryPartSelectionActivity inventoryPartSelectionActivity) {
            C5135Ly.m96068n(inventoryPartSelectionActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64328a.mo27461w2()));
            C5135Ly.m96066p(inventoryPartSelectionActivity, (C36207Tq4) C51679xZ3.m5003d(this.f64328a.mo27595B1()));
            C5135Ly.m96071k(inventoryPartSelectionActivity, (Handler) C51679xZ3.m5003d(this.f64328a.mo27535X2()));
            C5135Ly.m96067o(inventoryPartSelectionActivity, (C22454gl) C51679xZ3.m5003d(this.f64328a.mo27479r()));
            C5135Ly.m96080b(inventoryPartSelectionActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64328a.mo27519d0()));
            C5135Ly.m96075g(inventoryPartSelectionActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f64328a.mo27453z2()));
            C5135Ly.m96064r(inventoryPartSelectionActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f64328a.mo27459x1()));
            C5135Ly.m96081a(inventoryPartSelectionActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f64328a.mo27474s()));
            C5135Ly.m96073i(inventoryPartSelectionActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f64328a.mo27558P0()));
            C5135Ly.m96074h(inventoryPartSelectionActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f64328a.mo27598A0()));
            C5135Ly.m96077e(inventoryPartSelectionActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f64328a.mo27507i0()));
            C5135Ly.m96070l(inventoryPartSelectionActivity, (FO2) C51679xZ3.m5003d(this.f64328a.mo27456y2()));
            C5135Ly.m96065q(inventoryPartSelectionActivity, (YR4) C51679xZ3.m5003d(this.f64328a.mo27525b0()));
            C5135Ly.m96079c(inventoryPartSelectionActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f64328a.mo27460x()));
            C5135Ly.m96078d(inventoryPartSelectionActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f64328a.mo27517d3()));
            C5135Ly.m96072j(inventoryPartSelectionActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f64328a.mo27482q()));
            C5135Ly.m96076f(inventoryPartSelectionActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f64328a.mo27483p3()));
            Z82.m73667b(inventoryPartSelectionActivity, m57830c());
            return inventoryPartSelectionActivity;
        }

        /* renamed from: c */
        public final C50257v92 m57830c() {
            return new C50257v92((InterfaceC37097Xl3) C51679xZ3.m5003d(this.f64328a.mo27542V2()), this.f64329b, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64328a.mo27461w2()), m57829d(), new L82());
        }

        /* renamed from: d */
        public final C51443x92 m57829d() {
            return new C51443x92(this.f64330c, this.f64331d, this.f64332e);
        }

        public C15052b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C9606Y3 c9606y3, C36169Tm2 c36169Tm2) {
            this.f64333f = this;
            this.f64328a = interfaceC44393lG2;
            this.f64329b = scopeProvider;
            this.f64330c = baseActivity;
            this.f64331d = c9606y3;
            this.f64332e = c36169Tm2;
        }
    }

    private C15050b() {
    }

    /* renamed from: a */
    public static InventoryPartSelectionActivity.InterfaceC15045a.InterfaceC15046a m57834a() {
        return new C15051a();
    }
}
