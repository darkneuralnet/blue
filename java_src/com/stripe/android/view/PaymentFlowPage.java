package com.stripe.android.view;

import com.stripe.android.C18606R;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/view/PaymentFlowPage;", "", "titleResId", "", "(Ljava/lang/String;II)V", "getTitleResId", "()I", "ShippingInfo", "ShippingMethod", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public enum PaymentFlowPage {
    ShippingInfo(C18606R.string.title_add_an_address),
    ShippingMethod(C18606R.string.title_select_shipping_method);
    
    private final int titleResId;

    PaymentFlowPage(int i) {
        this.titleResId = i;
    }

    public final int getTitleResId() {
        return this.titleResId;
    }
}
