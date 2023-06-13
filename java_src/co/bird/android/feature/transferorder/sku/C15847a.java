package co.bird.android.feature.transferorder.sku;

import android.content.Context;
import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.transferorder.sku.SkuDetailsActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.transferorder.sku.a */
/* loaded from: classes3.dex */
public final class C15847a {

    /* renamed from: co.bird.android.feature.transferorder.sku.a$a */
    /* loaded from: classes3.dex */
    public static final class C15848a implements SkuDetailsActivity.InterfaceC15845a.InterfaceC15846a {
        @Override // co.bird.android.feature.transferorder.sku.SkuDetailsActivity.InterfaceC15845a.InterfaceC15846a
        /* renamed from: a */
        public SkuDetailsActivity.InterfaceC15845a mo56394a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C19961e6 c19961e6, String str) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c19961e6);
            C51679xZ3.m5005b(str);
            return new C15849b(interfaceC44393lG2, baseActivity, scopeProvider, c19961e6, str);
        }

        private C15848a() {
        }
    }

    /* renamed from: co.bird.android.feature.transferorder.sku.a$b */
    /* loaded from: classes3.dex */
    public static final class C15849b implements SkuDetailsActivity.InterfaceC15845a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f65796a;

        /* renamed from: b */
        public final C19961e6 f65797b;

        /* renamed from: c */
        public final BaseActivity f65798c;

        /* renamed from: d */
        public final ScopeProvider f65799d;

        /* renamed from: e */
        public final String f65800e;

        /* renamed from: f */
        public final C15849b f65801f;

        @Override // co.bird.android.feature.transferorder.sku.SkuDetailsActivity.InterfaceC15845a
        /* renamed from: a */
        public void mo56393a(SkuDetailsActivity skuDetailsActivity) {
            m56392b(skuDetailsActivity);
        }

        /* renamed from: b */
        public final SkuDetailsActivity m56392b(SkuDetailsActivity skuDetailsActivity) {
            C5135Ly.m96068n(skuDetailsActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65796a.mo27461w2()));
            C5135Ly.m96066p(skuDetailsActivity, (C36207Tq4) C51679xZ3.m5003d(this.f65796a.mo27595B1()));
            C5135Ly.m96071k(skuDetailsActivity, (Handler) C51679xZ3.m5003d(this.f65796a.mo27535X2()));
            C5135Ly.m96067o(skuDetailsActivity, (C22454gl) C51679xZ3.m5003d(this.f65796a.mo27479r()));
            C5135Ly.m96080b(skuDetailsActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f65796a.mo27519d0()));
            C5135Ly.m96075g(skuDetailsActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f65796a.mo27453z2()));
            C5135Ly.m96064r(skuDetailsActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65796a.mo27459x1()));
            C5135Ly.m96081a(skuDetailsActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f65796a.mo27474s()));
            C5135Ly.m96073i(skuDetailsActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f65796a.mo27558P0()));
            C5135Ly.m96074h(skuDetailsActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f65796a.mo27598A0()));
            C5135Ly.m96077e(skuDetailsActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f65796a.mo27507i0()));
            C5135Ly.m96070l(skuDetailsActivity, (FO2) C51679xZ3.m5003d(this.f65796a.mo27456y2()));
            C5135Ly.m96065q(skuDetailsActivity, (YR4) C51679xZ3.m5003d(this.f65796a.mo27525b0()));
            C5135Ly.m96079c(skuDetailsActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f65796a.mo27460x()));
            C5135Ly.m96078d(skuDetailsActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f65796a.mo27517d3()));
            C5135Ly.m96072j(skuDetailsActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f65796a.mo27482q()));
            C5135Ly.m96076f(skuDetailsActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f65796a.mo27483p3()));
            OB5.m92636b(skuDetailsActivity, m56390d());
            return skuDetailsActivity;
        }

        /* renamed from: c */
        public final C44360lC5 m56391c() {
            return new C44360lC5((Context) C51679xZ3.m5003d(this.f65796a.mo27552R1()));
        }

        /* renamed from: d */
        public final C52660zC5 m56390d() {
            return new C52660zC5(m56389e(), m56391c(), (InterfaceC40099e13) C51679xZ3.m5003d(this.f65796a.mo27461w2()), this.f65799d, (O86) C51679xZ3.m5003d(this.f65796a.mo27485p()), this.f65800e);
        }

        /* renamed from: e */
        public final CC5 m56389e() {
            return new CC5(this.f65797b, this.f65798c);
        }

        public C15849b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C19961e6 c19961e6, String str) {
            this.f65801f = this;
            this.f65796a = interfaceC44393lG2;
            this.f65797b = c19961e6;
            this.f65798c = baseActivity;
            this.f65799d = scopeProvider;
            this.f65800e = str;
        }
    }

    private C15847a() {
    }

    /* renamed from: a */
    public static SkuDetailsActivity.InterfaceC15845a.InterfaceC15846a m56395a() {
        return new C15848a();
    }
}
