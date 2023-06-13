package com.stripe.android.paymentsheet.p047ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.paymentsheet.ui.PaymentSheetTopBarKt$PaymentSheetTopBar$5$1$1 */
/* loaded from: classes7.dex */
public final class PaymentSheetTopBarKt$PaymentSheetTopBar$5$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ InterfaceC45645nN5 $keyboardController;
    final /* synthetic */ Function0<Unit> $onNavigationIconPressed;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSheetTopBarKt$PaymentSheetTopBar$5$1$1(InterfaceC45645nN5 interfaceC45645nN5, Function0<Unit> function0) {
        super(0);
        this.$keyboardController = interfaceC45645nN5;
        this.$onNavigationIconPressed = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        InterfaceC45645nN5 interfaceC45645nN5 = this.$keyboardController;
        if (interfaceC45645nN5 != null) {
            interfaceC45645nN5.mo23924b();
        }
        this.$onNavigationIconPressed.invoke();
    }
}
