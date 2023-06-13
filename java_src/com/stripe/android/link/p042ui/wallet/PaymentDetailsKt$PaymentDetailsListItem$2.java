package com.stripe.android.link.p042ui.wallet;

import com.stripe.android.model.ConsumerPaymentDetails;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.wallet.PaymentDetailsKt$PaymentDetailsListItem$2 */
/* loaded from: classes7.dex */
public final class PaymentDetailsKt$PaymentDetailsListItem$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ boolean $isSelected;
    final /* synthetic */ boolean $isSupported;
    final /* synthetic */ boolean $isUpdating;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ Function0<Unit> $onMenuButtonClick;
    final /* synthetic */ ConsumerPaymentDetails.PaymentDetails $paymentDetails;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentDetailsKt$PaymentDetailsListItem$2(ConsumerPaymentDetails.PaymentDetails paymentDetails, boolean z, boolean z2, boolean z3, boolean z4, Function0<Unit> function0, Function0<Unit> function02, int i) {
        super(2);
        this.$paymentDetails = paymentDetails;
        this.$enabled = z;
        this.$isSupported = z2;
        this.$isSelected = z3;
        this.$isUpdating = z4;
        this.$onClick = function0;
        this.$onMenuButtonClick = function02;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        PaymentDetailsKt.PaymentDetailsListItem(this.$paymentDetails, this.$enabled, this.$isSupported, this.$isSelected, this.$isUpdating, this.$onClick, this.$onMenuButtonClick, interfaceC32720Et0, this.$$changed | 1);
    }
}
