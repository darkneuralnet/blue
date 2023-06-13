package co.bird.android.feature.merchant.activity;

import co.bird.android.feature.merchant.activity.MerchantHistoryDetailsActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.merchant.activity.e */
/* loaded from: classes3.dex */
public final class C14988e implements InterfaceC48812sj1<ScopeProvider> {

    /* renamed from: a */
    public final MerchantHistoryDetailsActivity.C14955b f64229a;

    public C14988e(MerchantHistoryDetailsActivity.C14955b c14955b) {
        this.f64229a = c14955b;
    }

    /* renamed from: a */
    public static C14988e m57930a(MerchantHistoryDetailsActivity.C14955b c14955b) {
        return new C14988e(c14955b);
    }

    /* renamed from: c */
    public static ScopeProvider m57928c(MerchantHistoryDetailsActivity.C14955b c14955b) {
        return (ScopeProvider) C51679xZ3.m5002e(c14955b.m57978c());
    }

    @Override // p000.Y94
    /* renamed from: b */
    public ScopeProvider get() {
        return m57928c(this.f64229a);
    }
}
