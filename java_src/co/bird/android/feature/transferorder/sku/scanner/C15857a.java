package co.bird.android.feature.transferorder.sku.scanner;

import android.content.Context;
import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.transferorder.sku.scanner.SkuScannerActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.transferorder.sku.scanner.a */
/* loaded from: classes3.dex */
public final class C15857a {

    /* renamed from: co.bird.android.feature.transferorder.sku.scanner.a$a */
    /* loaded from: classes3.dex */
    public static final class C15858a implements SkuScannerActivity.InterfaceC15855a.InterfaceC15856a {
        @Override // co.bird.android.feature.transferorder.sku.scanner.SkuScannerActivity.InterfaceC15855a.InterfaceC15856a
        /* renamed from: a */
        public SkuScannerActivity.InterfaceC15855a mo56378a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C20742g6 c20742g6, boolean z, String str) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c20742g6);
            C51679xZ3.m5005b(Boolean.valueOf(z));
            C51679xZ3.m5005b(str);
            return new C15859b(interfaceC44393lG2, baseActivity, scopeProvider, c20742g6, Boolean.valueOf(z), str);
        }

        private C15858a() {
        }
    }

    /* renamed from: co.bird.android.feature.transferorder.sku.scanner.a$b */
    /* loaded from: classes3.dex */
    public static final class C15859b implements SkuScannerActivity.InterfaceC15855a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f65810a;

        /* renamed from: b */
        public final BaseActivity f65811b;

        /* renamed from: c */
        public final C20742g6 f65812c;

        /* renamed from: d */
        public final ScopeProvider f65813d;

        /* renamed from: e */
        public final Boolean f65814e;

        /* renamed from: f */
        public final String f65815f;

        /* renamed from: g */
        public final C15859b f65816g;

        /* renamed from: h */
        public Y94<BaseActivity> f65817h;

        /* renamed from: i */
        public Y94<M92> f65818i;

        /* renamed from: j */
        public Y94<N92> f65819j;

        @Override // co.bird.android.feature.transferorder.sku.scanner.SkuScannerActivity.InterfaceC15855a
        /* renamed from: a */
        public void mo56377a(SkuScannerActivity skuScannerActivity) {
            m56375c(skuScannerActivity);
        }

        /* renamed from: b */
        public final void m56376b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C20742g6 c20742g6, Boolean bool, String str) {
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(baseActivity);
            this.f65817h = m44621a;
            P92 m90630a = P92.m90630a(m44621a);
            this.f65818i = m90630a;
            this.f65819j = V51.m80429b(O92.m92712a(this.f65817h, m90630a));
        }

        /* renamed from: c */
        public final SkuScannerActivity m56375c(SkuScannerActivity skuScannerActivity) {
            C5135Ly.m96068n(skuScannerActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65810a.mo27461w2()));
            C5135Ly.m96066p(skuScannerActivity, (C36207Tq4) C51679xZ3.m5003d(this.f65810a.mo27595B1()));
            C5135Ly.m96071k(skuScannerActivity, (Handler) C51679xZ3.m5003d(this.f65810a.mo27535X2()));
            C5135Ly.m96067o(skuScannerActivity, (C22454gl) C51679xZ3.m5003d(this.f65810a.mo27479r()));
            C5135Ly.m96080b(skuScannerActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f65810a.mo27519d0()));
            C5135Ly.m96075g(skuScannerActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f65810a.mo27453z2()));
            C5135Ly.m96064r(skuScannerActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65810a.mo27459x1()));
            C5135Ly.m96081a(skuScannerActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f65810a.mo27474s()));
            C5135Ly.m96073i(skuScannerActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f65810a.mo27558P0()));
            C5135Ly.m96074h(skuScannerActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f65810a.mo27598A0()));
            C5135Ly.m96077e(skuScannerActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f65810a.mo27507i0()));
            C5135Ly.m96070l(skuScannerActivity, (FO2) C51679xZ3.m5003d(this.f65810a.mo27456y2()));
            C5135Ly.m96065q(skuScannerActivity, (YR4) C51679xZ3.m5003d(this.f65810a.mo27525b0()));
            C5135Ly.m96079c(skuScannerActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f65810a.mo27460x()));
            C5135Ly.m96078d(skuScannerActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f65810a.mo27517d3()));
            C5135Ly.m96072j(skuScannerActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f65810a.mo27482q()));
            C5135Ly.m96076f(skuScannerActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f65810a.mo27483p3()));
            UC5.m81825b(skuScannerActivity, m56373e());
            return skuScannerActivity;
        }

        /* renamed from: d */
        public final WC5 m56374d() {
            return new WC5((Context) C51679xZ3.m5003d(this.f65810a.mo27552R1()));
        }

        /* renamed from: e */
        public final MD5 m56373e() {
            return new MD5((O86) C51679xZ3.m5003d(this.f65810a.mo27485p()), m56374d(), (InterfaceC40099e13) C51679xZ3.m5003d(this.f65810a.mo27461w2()), (C36207Tq4) C51679xZ3.m5003d(this.f65810a.mo27595B1()), m56372f(), this.f65813d, this.f65819j.get(), this.f65814e.booleanValue(), this.f65815f);
        }

        /* renamed from: f */
        public final VD5 m56372f() {
            return new VD5(this.f65811b, this.f65812c);
        }

        public C15859b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C20742g6 c20742g6, Boolean bool, String str) {
            this.f65816g = this;
            this.f65810a = interfaceC44393lG2;
            this.f65811b = baseActivity;
            this.f65812c = c20742g6;
            this.f65813d = scopeProvider;
            this.f65814e = bool;
            this.f65815f = str;
            m56376b(interfaceC44393lG2, baseActivity, scopeProvider, c20742g6, bool, str);
        }
    }

    private C15857a() {
    }

    /* renamed from: a */
    public static SkuScannerActivity.InterfaceC15855a.InterfaceC15856a m56379a() {
        return new C15858a();
    }
}
