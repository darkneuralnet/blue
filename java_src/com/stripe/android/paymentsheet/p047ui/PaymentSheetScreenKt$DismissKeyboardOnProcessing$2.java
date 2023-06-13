package com.stripe.android.paymentsheet.p047ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.paymentsheet.ui.PaymentSheetScreenKt$DismissKeyboardOnProcessing$2 */
/* loaded from: classes7.dex */
public final class PaymentSheetScreenKt$DismissKeyboardOnProcessing$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $processing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSheetScreenKt$DismissKeyboardOnProcessing$2(boolean z, int i) {
        super(2);
        this.$processing = z;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        PaymentSheetScreenKt.DismissKeyboardOnProcessing(this.$processing, interfaceC32720Et0, this.$$changed | 1);
    }
}
