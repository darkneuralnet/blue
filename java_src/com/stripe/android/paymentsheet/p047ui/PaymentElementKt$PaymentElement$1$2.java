package com.stripe.android.paymentsheet.p047ui;

import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.paymentsheet.ui.PaymentElementKt$PaymentElement$1$2 */
/* loaded from: classes7.dex */
public final class PaymentElementKt$PaymentElement$1$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ BaseSheetViewModel $sheetViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentElementKt$PaymentElement$1$2(BaseSheetViewModel baseSheetViewModel) {
        super(0);
        this.$sheetViewModel = baseSheetViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$sheetViewModel.getLinkHandler().getLinkInlineSelection().setValue(null);
    }
}
