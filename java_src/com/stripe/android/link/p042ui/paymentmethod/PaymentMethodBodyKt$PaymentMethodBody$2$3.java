package com.stripe.android.link.p042ui.paymentmethod;

import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.paymentmethod.PaymentMethodBodyKt$PaymentMethodBody$2$3 */
/* loaded from: classes7.dex */
public final class PaymentMethodBodyKt$PaymentMethodBody$2$3 extends Lambda implements Function0<Unit> {
    final /* synthetic */ InterfaceC48627sP5<Map<IdentifierSpec, FormFieldEntry>> $formValues$delegate;
    final /* synthetic */ PaymentMethodViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PaymentMethodBodyKt$PaymentMethodBody$2$3(InterfaceC48627sP5<? extends Map<IdentifierSpec, FormFieldEntry>> interfaceC48627sP5, PaymentMethodViewModel paymentMethodViewModel) {
        super(0);
        this.$formValues$delegate = interfaceC48627sP5;
        this.$viewModel = paymentMethodViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Map<IdentifierSpec, FormFieldEntry> PaymentMethodBody$lambda$8$lambda$3;
        PaymentMethodBody$lambda$8$lambda$3 = PaymentMethodBodyKt.PaymentMethodBody$lambda$8$lambda$3(this.$formValues$delegate);
        if (PaymentMethodBody$lambda$8$lambda$3 != null) {
            this.$viewModel.startPayment(PaymentMethodBody$lambda$8$lambda$3);
        }
    }
}
