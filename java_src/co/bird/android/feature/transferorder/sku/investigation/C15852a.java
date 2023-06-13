package co.bird.android.feature.transferorder.sku.investigation;

import android.content.Context;
import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.transferorder.sku.investigation.SkuInvestigationActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.transferorder.sku.investigation.a */
/* loaded from: classes3.dex */
public final class C15852a {

    /* renamed from: co.bird.android.feature.transferorder.sku.investigation.a$a */
    /* loaded from: classes3.dex */
    public static final class C15853a implements SkuInvestigationActivity.InterfaceC15850a.InterfaceC15851a {
        @Override // co.bird.android.feature.transferorder.sku.investigation.SkuInvestigationActivity.InterfaceC15850a.InterfaceC15851a
        /* renamed from: a */
        public SkuInvestigationActivity.InterfaceC15850a mo56386a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C19674d6 c19674d6, String str) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c19674d6);
            C51679xZ3.m5005b(str);
            return new C15854b(interfaceC44393lG2, baseActivity, scopeProvider, c19674d6, str);
        }

        private C15853a() {
        }
    }

    /* renamed from: co.bird.android.feature.transferorder.sku.investigation.a$b */
    /* loaded from: classes3.dex */
    public static final class C15854b implements SkuInvestigationActivity.InterfaceC15850a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f65803a;

        /* renamed from: b */
        public final BaseActivity f65804b;

        /* renamed from: c */
        public final C19674d6 f65805c;

        /* renamed from: d */
        public final ScopeProvider f65806d;

        /* renamed from: e */
        public final String f65807e;

        /* renamed from: f */
        public final C15854b f65808f;

        @Override // co.bird.android.feature.transferorder.sku.investigation.SkuInvestigationActivity.InterfaceC15850a
        /* renamed from: a */
        public void mo56385a(SkuInvestigationActivity skuInvestigationActivity) {
            m56384b(skuInvestigationActivity);
        }

        /* renamed from: b */
        public final SkuInvestigationActivity m56384b(SkuInvestigationActivity skuInvestigationActivity) {
            C5135Ly.m96068n(skuInvestigationActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65803a.mo27461w2()));
            C5135Ly.m96066p(skuInvestigationActivity, (C36207Tq4) C51679xZ3.m5003d(this.f65803a.mo27595B1()));
            C5135Ly.m96071k(skuInvestigationActivity, (Handler) C51679xZ3.m5003d(this.f65803a.mo27535X2()));
            C5135Ly.m96067o(skuInvestigationActivity, (C22454gl) C51679xZ3.m5003d(this.f65803a.mo27479r()));
            C5135Ly.m96080b(skuInvestigationActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f65803a.mo27519d0()));
            C5135Ly.m96075g(skuInvestigationActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f65803a.mo27453z2()));
            C5135Ly.m96064r(skuInvestigationActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65803a.mo27459x1()));
            C5135Ly.m96081a(skuInvestigationActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f65803a.mo27474s()));
            C5135Ly.m96073i(skuInvestigationActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f65803a.mo27558P0()));
            C5135Ly.m96074h(skuInvestigationActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f65803a.mo27598A0()));
            C5135Ly.m96077e(skuInvestigationActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f65803a.mo27507i0()));
            C5135Ly.m96070l(skuInvestigationActivity, (FO2) C51679xZ3.m5003d(this.f65803a.mo27456y2()));
            C5135Ly.m96065q(skuInvestigationActivity, (YR4) C51679xZ3.m5003d(this.f65803a.mo27525b0()));
            C5135Ly.m96079c(skuInvestigationActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f65803a.mo27460x()));
            C5135Ly.m96078d(skuInvestigationActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f65803a.mo27517d3()));
            C5135Ly.m96072j(skuInvestigationActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f65803a.mo27482q()));
            C5135Ly.m96076f(skuInvestigationActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f65803a.mo27483p3()));
            PB5.m90601b(skuInvestigationActivity, m56382d());
            return skuInvestigationActivity;
        }

        /* renamed from: c */
        public final VB5 m56383c() {
            return new VB5((Context) C51679xZ3.m5003d(this.f65803a.mo27552R1()));
        }

        /* renamed from: d */
        public final C40209eC5 m56382d() {
            return new C40209eC5(m56381e(), m56383c(), (InterfaceC40099e13) C51679xZ3.m5003d(this.f65803a.mo27461w2()), this.f65806d, (O86) C51679xZ3.m5003d(this.f65803a.mo27485p()), this.f65807e);
        }

        /* renamed from: e */
        public final C41395gC5 m56381e() {
            return new C41395gC5(this.f65804b, this.f65805c);
        }

        public C15854b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C19674d6 c19674d6, String str) {
            this.f65808f = this;
            this.f65803a = interfaceC44393lG2;
            this.f65804b = baseActivity;
            this.f65805c = c19674d6;
            this.f65806d = scopeProvider;
            this.f65807e = str;
        }
    }

    private C15852a() {
    }

    /* renamed from: a */
    public static SkuInvestigationActivity.InterfaceC15850a.InterfaceC15851a m56387a() {
        return new C15853a();
    }
}
