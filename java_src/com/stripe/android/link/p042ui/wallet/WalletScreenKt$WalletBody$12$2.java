package com.stripe.android.link.p042ui.wallet;

import com.stripe.android.model.ConsumerPaymentDetails;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.wallet.WalletScreenKt$WalletBody$12$2 */
/* loaded from: classes7.dex */
public final class WalletScreenKt$WalletBody$12$2 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ ConsumerPaymentDetails.PaymentDetails $it;
    final /* synthetic */ EX2<ConsumerPaymentDetails.PaymentDetails> $itemBeingRemoved$delegate;
    final /* synthetic */ Function1<ConsumerPaymentDetails.PaymentDetails, Unit> $onDeletePaymentMethod;
    final /* synthetic */ EX2<Boolean> $openDialog$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WalletScreenKt$WalletBody$12$2(Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> function1, ConsumerPaymentDetails.PaymentDetails paymentDetails, EX2<Boolean> ex2, EX2<ConsumerPaymentDetails.PaymentDetails> ex22) {
        super(1);
        this.$onDeletePaymentMethod = function1;
        this.$it = paymentDetails;
        this.$openDialog$delegate = ex2;
        this.$itemBeingRemoved$delegate = ex22;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        if (z) {
            this.$onDeletePaymentMethod.invoke(this.$it);
        }
        WalletScreenKt.WalletBody$lambda$8(this.$openDialog$delegate, false);
        this.$itemBeingRemoved$delegate.setValue(null);
    }
}
