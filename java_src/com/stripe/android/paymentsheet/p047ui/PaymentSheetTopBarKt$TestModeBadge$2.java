package com.stripe.android.paymentsheet.p047ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.paymentsheet.ui.PaymentSheetTopBarKt$TestModeBadge$2 */
/* loaded from: classes7.dex */
public final class PaymentSheetTopBarKt$TestModeBadge$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSheetTopBarKt$TestModeBadge$2(int i) {
        super(2);
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        PaymentSheetTopBarKt.TestModeBadge(interfaceC32720Et0, this.$$changed | 1);
    }
}