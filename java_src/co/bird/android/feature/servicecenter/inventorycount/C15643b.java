package co.bird.android.feature.servicecenter.inventorycount;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.servicecenter.inventorycount.InventoryScanProxyActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.servicecenter.inventorycount.b */
/* loaded from: classes3.dex */
public final class C15643b {

    /* renamed from: co.bird.android.feature.servicecenter.inventorycount.b$a */
    /* loaded from: classes3.dex */
    public static final class C15644a implements InventoryScanProxyActivity.InterfaceC15630a.InterfaceC15631a {
        @Override // co.bird.android.feature.servicecenter.inventorycount.InventoryScanProxyActivity.InterfaceC15630a.InterfaceC15631a
        /* renamed from: a */
        public InventoryScanProxyActivity.InterfaceC15630a mo56805a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C10107Z3 c10107z3) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c10107z3);
            return new C15645b(interfaceC44393lG2, baseActivity, scopeProvider, c10107z3);
        }

        private C15644a() {
        }
    }

    /* renamed from: co.bird.android.feature.servicecenter.inventorycount.b$b */
    /* loaded from: classes3.dex */
    public static final class C15645b implements InventoryScanProxyActivity.InterfaceC15630a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f65410a;

        /* renamed from: b */
        public final C15645b f65411b;

        /* renamed from: c */
        public Y94<BaseActivity> f65412c;

        /* renamed from: d */
        public Y94<C10107Z3> f65413d;

        /* renamed from: e */
        public Y94<E92> f65414e;

        /* renamed from: f */
        public Y94<InterfaceC40099e13> f65415f;

        /* renamed from: g */
        public Y94<InterfaceC44647lh6> f65416g;

        /* renamed from: h */
        public Y94<InterfaceC36047Sy6> f65417h;

        /* renamed from: i */
        public Y94<C36207Tq4> f65418i;

        /* renamed from: j */
        public Y94<ScopeProvider> f65419j;

        /* renamed from: k */
        public Y94<C43038iy6> f65420k;

        /* renamed from: l */
        public Y94<B92> f65421l;

        /* renamed from: co.bird.android.feature.servicecenter.inventorycount.b$b$a */
        /* loaded from: classes3.dex */
        public static final class C15646a implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65422a;

            public C15646a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65422a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f65422a.mo27461w2());
            }
        }

        /* renamed from: co.bird.android.feature.servicecenter.inventorycount.b$b$b */
        /* loaded from: classes3.dex */
        public static final class C15647b implements Y94<C36207Tq4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65423a;

            public C15647b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65423a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C36207Tq4 get() {
                return (C36207Tq4) C51679xZ3.m5003d(this.f65423a.mo27595B1());
            }
        }

        /* renamed from: co.bird.android.feature.servicecenter.inventorycount.b$b$c */
        /* loaded from: classes3.dex */
        public static final class C15648c implements Y94<InterfaceC44647lh6> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65424a;

            public C15648c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65424a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC44647lh6 get() {
                return (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65424a.mo27459x1());
            }
        }

        /* renamed from: co.bird.android.feature.servicecenter.inventorycount.b$b$d */
        /* loaded from: classes3.dex */
        public static final class C15649d implements Y94<InterfaceC36047Sy6> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65425a;

            public C15649d(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65425a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC36047Sy6 get() {
                return (InterfaceC36047Sy6) C51679xZ3.m5003d(this.f65425a.mo27571K2());
            }
        }

        @Override // co.bird.android.feature.servicecenter.inventorycount.InventoryScanProxyActivity.InterfaceC15630a
        /* renamed from: a */
        public void mo56804a(InventoryScanProxyActivity inventoryScanProxyActivity) {
            m56802c(inventoryScanProxyActivity);
        }

        /* renamed from: b */
        public final void m56803b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C10107Z3 c10107z3) {
            this.f65412c = C39546d52.m44621a(baseActivity);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(c10107z3);
            this.f65413d = m44621a;
            this.f65414e = V51.m80429b(F92.m107559a(this.f65412c, m44621a));
            this.f65415f = new C15646a(interfaceC44393lG2);
            this.f65416g = new C15648c(interfaceC44393lG2);
            this.f65417h = new C15649d(interfaceC44393lG2);
            this.f65418i = new C15647b(interfaceC44393lG2);
            InterfaceC48812sj1 m44621a2 = C39546d52.m44621a(scopeProvider);
            this.f65419j = m44621a2;
            C32303Cy6 m111187a = C32303Cy6.m111187a(this.f65416g, this.f65417h, this.f65418i, m44621a2, this.f65415f);
            this.f65420k = m111187a;
            this.f65421l = V51.m80429b(C92.m112733a(this.f65414e, this.f65415f, m111187a));
        }

        /* renamed from: c */
        public final InventoryScanProxyActivity m56802c(InventoryScanProxyActivity inventoryScanProxyActivity) {
            C5135Ly.m96068n(inventoryScanProxyActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65410a.mo27461w2()));
            C5135Ly.m96066p(inventoryScanProxyActivity, (C36207Tq4) C51679xZ3.m5003d(this.f65410a.mo27595B1()));
            C5135Ly.m96071k(inventoryScanProxyActivity, (Handler) C51679xZ3.m5003d(this.f65410a.mo27535X2()));
            C5135Ly.m96067o(inventoryScanProxyActivity, (C22454gl) C51679xZ3.m5003d(this.f65410a.mo27479r()));
            C5135Ly.m96080b(inventoryScanProxyActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f65410a.mo27519d0()));
            C5135Ly.m96075g(inventoryScanProxyActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f65410a.mo27453z2()));
            C5135Ly.m96064r(inventoryScanProxyActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65410a.mo27459x1()));
            C5135Ly.m96081a(inventoryScanProxyActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f65410a.mo27474s()));
            C5135Ly.m96073i(inventoryScanProxyActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f65410a.mo27558P0()));
            C5135Ly.m96074h(inventoryScanProxyActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f65410a.mo27598A0()));
            C5135Ly.m96077e(inventoryScanProxyActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f65410a.mo27507i0()));
            C5135Ly.m96070l(inventoryScanProxyActivity, (FO2) C51679xZ3.m5003d(this.f65410a.mo27456y2()));
            C5135Ly.m96065q(inventoryScanProxyActivity, (YR4) C51679xZ3.m5003d(this.f65410a.mo27525b0()));
            C5135Ly.m96079c(inventoryScanProxyActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f65410a.mo27460x()));
            C5135Ly.m96078d(inventoryScanProxyActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f65410a.mo27517d3()));
            C5135Ly.m96072j(inventoryScanProxyActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f65410a.mo27482q()));
            C5135Ly.m96076f(inventoryScanProxyActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f65410a.mo27483p3()));
            C52629z92.m1751b(inventoryScanProxyActivity, this.f65421l.get());
            return inventoryScanProxyActivity;
        }

        public C15645b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C10107Z3 c10107z3) {
            this.f65411b = this;
            this.f65410a = interfaceC44393lG2;
            m56803b(interfaceC44393lG2, baseActivity, scopeProvider, c10107z3);
        }
    }

    private C15643b() {
    }

    /* renamed from: a */
    public static InventoryScanProxyActivity.InterfaceC15630a.InterfaceC15631a m56806a() {
        return new C15644a();
    }
}
