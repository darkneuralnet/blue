package co.bird.android.feature.servicecenter.inventorycount.excessinventory;

import android.os.Handler;
import android.widget.Button;
import android.widget.EditText;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.servicecenter.inventorycount.excessinventory.ExcessInventoryActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.servicecenter.inventorycount.excessinventory.a */
/* loaded from: classes3.dex */
public final class C15653a {

    /* renamed from: co.bird.android.feature.servicecenter.inventorycount.excessinventory.a$a */
    /* loaded from: classes3.dex */
    public static final class C15654a implements ExcessInventoryActivity.InterfaceC15650a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f65427a;

        /* renamed from: b */
        public final BaseActivity f65428b;

        /* renamed from: c */
        public final EditText f65429c;

        /* renamed from: d */
        public final Button f65430d;

        /* renamed from: e */
        public final ScopeProvider f65431e;

        /* renamed from: f */
        public final C15654a f65432f;

        @Override // co.bird.android.feature.servicecenter.inventorycount.excessinventory.ExcessInventoryActivity.InterfaceC15650a
        /* renamed from: a */
        public void mo56793a(ExcessInventoryActivity excessInventoryActivity) {
            m56790d(excessInventoryActivity);
        }

        /* renamed from: b */
        public final C47014ph1 m56792b() {
            return new C47014ph1((I82) C51679xZ3.m5003d(this.f65427a.mo27455z()), m56791c(), this.f65431e, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65427a.mo27461w2()));
        }

        /* renamed from: c */
        public final C48200rh1 m56791c() {
            return new C48200rh1(this.f65428b, this.f65429c, this.f65430d);
        }

        /* renamed from: d */
        public final ExcessInventoryActivity m56790d(ExcessInventoryActivity excessInventoryActivity) {
            C5135Ly.m96068n(excessInventoryActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65427a.mo27461w2()));
            C5135Ly.m96066p(excessInventoryActivity, (C36207Tq4) C51679xZ3.m5003d(this.f65427a.mo27595B1()));
            C5135Ly.m96071k(excessInventoryActivity, (Handler) C51679xZ3.m5003d(this.f65427a.mo27535X2()));
            C5135Ly.m96067o(excessInventoryActivity, (C22454gl) C51679xZ3.m5003d(this.f65427a.mo27479r()));
            C5135Ly.m96080b(excessInventoryActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f65427a.mo27519d0()));
            C5135Ly.m96075g(excessInventoryActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f65427a.mo27453z2()));
            C5135Ly.m96064r(excessInventoryActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65427a.mo27459x1()));
            C5135Ly.m96081a(excessInventoryActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f65427a.mo27474s()));
            C5135Ly.m96073i(excessInventoryActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f65427a.mo27558P0()));
            C5135Ly.m96074h(excessInventoryActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f65427a.mo27598A0()));
            C5135Ly.m96077e(excessInventoryActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f65427a.mo27507i0()));
            C5135Ly.m96070l(excessInventoryActivity, (FO2) C51679xZ3.m5003d(this.f65427a.mo27456y2()));
            C5135Ly.m96065q(excessInventoryActivity, (YR4) C51679xZ3.m5003d(this.f65427a.mo27525b0()));
            C5135Ly.m96079c(excessInventoryActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f65427a.mo27460x()));
            C5135Ly.m96078d(excessInventoryActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f65427a.mo27517d3()));
            C5135Ly.m96072j(excessInventoryActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f65427a.mo27482q()));
            C5135Ly.m96076f(excessInventoryActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f65427a.mo27483p3()));
            C43456jh1.m30104b(excessInventoryActivity, m56792b());
            return excessInventoryActivity;
        }

        public C15654a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, EditText editText, Button button) {
            this.f65432f = this;
            this.f65427a = interfaceC44393lG2;
            this.f65428b = baseActivity;
            this.f65429c = editText;
            this.f65430d = button;
            this.f65431e = scopeProvider;
        }
    }

    /* renamed from: co.bird.android.feature.servicecenter.inventorycount.excessinventory.a$b */
    /* loaded from: classes3.dex */
    public static final class C15655b implements ExcessInventoryActivity.InterfaceC15650a.InterfaceC15651a {
        @Override // co.bird.android.feature.servicecenter.inventorycount.excessinventory.ExcessInventoryActivity.InterfaceC15650a.InterfaceC15651a
        /* renamed from: a */
        public ExcessInventoryActivity.InterfaceC15650a mo56789a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, EditText editText, Button button) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(editText);
            C51679xZ3.m5005b(button);
            return new C15654a(interfaceC44393lG2, baseActivity, scopeProvider, editText, button);
        }

        private C15655b() {
        }
    }

    private C15653a() {
    }

    /* renamed from: a */
    public static ExcessInventoryActivity.InterfaceC15650a.InterfaceC15651a m56794a() {
        return new C15655b();
    }
}
