package com.stripe.android.link.p042ui.wallet;

import com.stripe.android.model.ConsumerPaymentDetails;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.wallet.WalletScreenKt$CollapsedPaymentDetails$2 */
/* loaded from: classes7.dex */
public final class WalletScreenKt$CollapsedPaymentDetails$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ ConsumerPaymentDetails.PaymentDetails $selectedPaymentMethod;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletScreenKt$CollapsedPaymentDetails$2(ConsumerPaymentDetails.PaymentDetails paymentDetails, boolean z, Function0<Unit> function0, int i) {
        super(2);
        this.$selectedPaymentMethod = paymentDetails;
        this.$enabled = z;
        this.$onClick = function0;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        WalletScreenKt.CollapsedPaymentDetails(this.$selectedPaymentMethod, this.$enabled, this.$onClick, interfaceC32720Et0, this.$$changed | 1);
    }
}
