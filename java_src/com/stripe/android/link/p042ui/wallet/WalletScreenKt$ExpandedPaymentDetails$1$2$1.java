package com.stripe.android.link.p042ui.wallet;

import com.stripe.android.model.ConsumerPaymentDetails;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.wallet.WalletScreenKt$ExpandedPaymentDetails$1$2$1 */
/* loaded from: classes7.dex */
public final class WalletScreenKt$ExpandedPaymentDetails$1$2$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ ConsumerPaymentDetails.PaymentDetails $item;
    final /* synthetic */ Function1<ConsumerPaymentDetails.PaymentDetails, Unit> $onItemSelected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WalletScreenKt$ExpandedPaymentDetails$1$2$1(Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> function1, ConsumerPaymentDetails.PaymentDetails paymentDetails) {
        super(0);
        this.$onItemSelected = function1;
        this.$item = paymentDetails;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onItemSelected.invoke(this.$item);
    }
}
