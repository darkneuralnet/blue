package com.stripe.android.link.p042ui.wallet;

import com.stripe.android.model.ConsumerPaymentDetails;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.wallet.WalletScreenKt$WalletBody$14$1$1$1 */
/* loaded from: classes7.dex */
public final class WalletScreenKt$WalletBody$14$1$1$1 extends Lambda implements Function1<ConsumerPaymentDetails.PaymentDetails, Unit> {
    final /* synthetic */ Function1<ConsumerPaymentDetails.PaymentDetails, Unit> $onItemSelected;
    final /* synthetic */ Function1<Boolean, Unit> $setExpanded;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WalletScreenKt$WalletBody$14$1$1$1(Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> function1, Function1<? super Boolean, Unit> function12) {
        super(1);
        this.$onItemSelected = function1;
        this.$setExpanded = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConsumerPaymentDetails.PaymentDetails paymentDetails) {
        invoke2(paymentDetails);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ConsumerPaymentDetails.PaymentDetails it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$onItemSelected.invoke(it);
        this.$setExpanded.invoke(Boolean.FALSE);
    }
}
