package com.stripe.android.paymentsheet.p047ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.paymentsheet.ui.PaymentSheetScaffoldKt$PaymentSheetScaffold$2 */
/* loaded from: classes7.dex */
public final class PaymentSheetScaffoldKt$PaymentSheetScaffold$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function3<InterfaceC41563gV2, InterfaceC32720Et0, Integer, Unit> $content;
    final /* synthetic */ InterfaceC41563gV2 $modifier;
    final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> $topBar;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PaymentSheetScaffoldKt$PaymentSheetScaffold$2(Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, Function3<? super InterfaceC41563gV2, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, InterfaceC41563gV2 interfaceC41563gV2, int i, int i2) {
        super(2);
        this.$topBar = function2;
        this.$content = function3;
        this.$modifier = interfaceC41563gV2;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        PaymentSheetScaffoldKt.PaymentSheetScaffold(this.$topBar, this.$content, this.$modifier, interfaceC32720Et0, this.$$changed | 1, this.$$default);
    }
}
