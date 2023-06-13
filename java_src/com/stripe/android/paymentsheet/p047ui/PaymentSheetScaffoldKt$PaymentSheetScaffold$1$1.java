package com.stripe.android.paymentsheet.p047ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.paymentsheet.ui.PaymentSheetScaffoldKt$PaymentSheetScaffold$1$1 */
/* loaded from: classes7.dex */
public final class PaymentSheetScaffoldKt$PaymentSheetScaffold$1$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> $topBar;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PaymentSheetScaffoldKt$PaymentSheetScaffold$1$1(Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, int i) {
        super(2);
        this.$topBar = function2;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(583402386, i, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScaffold.<anonymous>.<anonymous> (PaymentSheetScaffold.kt:38)");
        }
        this.$topBar.invoke(interfaceC32720Et0, Integer.valueOf(this.$$dirty & 14));
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
