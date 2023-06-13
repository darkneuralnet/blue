package com.stripe.android.view;

import com.stripe.android.CustomerSession;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/CustomerSession;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PaymentFlowActivity$customerSession$2 extends Lambda implements Function0<CustomerSession> {
    public static final PaymentFlowActivity$customerSession$2 INSTANCE = new PaymentFlowActivity$customerSession$2();

    public PaymentFlowActivity$customerSession$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final CustomerSession invoke() {
        return CustomerSession.Companion.getInstance();
    }
}
