package com.stripe.android.paymentsheet.p047ui;

import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.paymentsheet.ui.PaymentSheetTopBarKt$PaymentSheetTopBar$3 */
/* loaded from: classes7.dex */
public final class PaymentSheetTopBarKt$PaymentSheetTopBar$3 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ float $elevation;
    final /* synthetic */ BaseSheetViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSheetTopBarKt$PaymentSheetTopBar$3(BaseSheetViewModel baseSheetViewModel, float f, int i, int i2) {
        super(2);
        this.$viewModel = baseSheetViewModel;
        this.$elevation = f;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        PaymentSheetTopBarKt.m116653PaymentSheetTopBarrAjV9yQ(this.$viewModel, this.$elevation, interfaceC32720Et0, this.$$changed | 1, this.$$default);
    }
}
