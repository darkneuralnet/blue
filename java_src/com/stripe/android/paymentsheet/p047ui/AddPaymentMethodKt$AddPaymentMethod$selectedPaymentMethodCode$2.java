package com.stripe.android.paymentsheet.p047ui;

import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.paymentsheet.ui.AddPaymentMethodKt$AddPaymentMethod$selectedPaymentMethodCode$2 */
/* loaded from: classes7.dex */
public final class AddPaymentMethodKt$AddPaymentMethod$selectedPaymentMethodCode$2 extends Lambda implements Function0<EX2<String>> {
    final /* synthetic */ BaseSheetViewModel $sheetViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodKt$AddPaymentMethod$selectedPaymentMethodCode$2(BaseSheetViewModel baseSheetViewModel) {
        super(0);
        this.$sheetViewModel = baseSheetViewModel;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final EX2<String> invoke() {
        String initiallySelectedPaymentMethodType;
        EX2<String> m97025e;
        initiallySelectedPaymentMethodType = AddPaymentMethodKt.getInitiallySelectedPaymentMethodType(this.$sheetViewModel);
        m97025e = LM5.m97025e(initiallySelectedPaymentMethodType, null, 2, null);
        return m97025e;
    }
}
