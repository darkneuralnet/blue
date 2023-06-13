package com.stripe.android.paymentsheet.p047ui;

import com.stripe.android.paymentsheet.LinkHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.paymentsheet.ui.PaymentOptionsScreenKt$PaymentOptionsScreenContent$1$1 */
/* loaded from: classes7.dex */
public /* synthetic */ class PaymentOptionsScreenKt$PaymentOptionsScreenContent$1$1 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    public PaymentOptionsScreenKt$PaymentOptionsScreenContent$1$1(Object obj) {
        super(1, obj, LinkHandler.class, "handleLinkVerificationResult", "handleLinkVerificationResult(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        ((LinkHandler) this.receiver).handleLinkVerificationResult(z);
    }
}
