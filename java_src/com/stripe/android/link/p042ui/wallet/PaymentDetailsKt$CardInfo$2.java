package com.stripe.android.link.p042ui.wallet;

import com.stripe.android.model.ConsumerPaymentDetails;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.wallet.PaymentDetailsKt$CardInfo$2 */
/* loaded from: classes7.dex */
public final class PaymentDetailsKt$CardInfo$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ ConsumerPaymentDetails.Card $card;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ InterfaceC37486Zc5 $this_CardInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentDetailsKt$CardInfo$2(InterfaceC37486Zc5 interfaceC37486Zc5, ConsumerPaymentDetails.Card card, boolean z, int i) {
        super(2);
        this.$this_CardInfo = interfaceC37486Zc5;
        this.$card = card;
        this.$enabled = z;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        PaymentDetailsKt.CardInfo(this.$this_CardInfo, this.$card, this.$enabled, interfaceC32720Et0, this.$$changed | 1);
    }
}