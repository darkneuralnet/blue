package com.stripe.android.link.p042ui.wallet;

import com.stripe.android.model.ConsumerPaymentDetails;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.wallet.WalletScreenKt$WalletBody$4 */
/* loaded from: classes7.dex */
public /* synthetic */ class WalletScreenKt$WalletBody$4 extends FunctionReferenceImpl implements Function1<ConsumerPaymentDetails.PaymentDetails, Unit> {
    public WalletScreenKt$WalletBody$4(Object obj) {
        super(1, obj, WalletViewModel.class, "onItemSelected", "onItemSelected(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConsumerPaymentDetails.PaymentDetails paymentDetails) {
        invoke2(paymentDetails);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ConsumerPaymentDetails.PaymentDetails p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((WalletViewModel) this.receiver).onItemSelected(p0);
    }
}
