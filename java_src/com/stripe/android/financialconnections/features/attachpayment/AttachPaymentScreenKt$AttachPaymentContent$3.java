package com.stripe.android.financialconnections.features.attachpayment;

import com.stripe.android.financialconnections.features.attachpayment.AttachPaymentState;
import com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class AttachPaymentScreenKt$AttachPaymentContent$3 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ AbstractC19862dp<LinkAccountSessionPaymentAccount> $attachPayment;
    final /* synthetic */ Function0<Unit> $onCloseClick;
    final /* synthetic */ Function1<Throwable, Unit> $onCloseFromErrorClick;
    final /* synthetic */ Function0<Unit> $onEnterDetailsManually;
    final /* synthetic */ Function0<Unit> $onSelectAnotherBank;
    final /* synthetic */ AbstractC19862dp<AttachPaymentState.Payload> $payload;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AttachPaymentScreenKt$AttachPaymentContent$3(AbstractC19862dp<AttachPaymentState.Payload> abstractC19862dp, AbstractC19862dp<LinkAccountSessionPaymentAccount> abstractC19862dp2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function1<? super Throwable, Unit> function1, int i) {
        super(2);
        this.$payload = abstractC19862dp;
        this.$attachPayment = abstractC19862dp2;
        this.$onSelectAnotherBank = function0;
        this.$onEnterDetailsManually = function02;
        this.$onCloseClick = function03;
        this.$onCloseFromErrorClick = function1;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        AttachPaymentScreenKt.AttachPaymentContent(this.$payload, this.$attachPayment, this.$onSelectAnotherBank, this.$onEnterDetailsManually, this.$onCloseClick, this.$onCloseFromErrorClick, interfaceC32720Et0, this.$$changed | 1);
    }
}
