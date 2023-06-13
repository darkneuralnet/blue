package com.stripe.android.link.p042ui.paymentmethod;

import com.stripe.android.link.p042ui.ErrorMessage;
import com.stripe.android.link.p042ui.PrimaryButtonState;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.paymentmethod.PaymentMethodBodyKt$PaymentMethodBody$6 */
/* loaded from: classes7.dex */
public final class PaymentMethodBodyKt$PaymentMethodBody$6 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ ErrorMessage $errorMessage;
    final /* synthetic */ Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit> $formContent;
    final /* synthetic */ Function1<SupportedPaymentMethod, Unit> $onPaymentMethodSelected;
    final /* synthetic */ Function0<Unit> $onPrimaryButtonClick;
    final /* synthetic */ Function0<Unit> $onSecondaryButtonClick;
    final /* synthetic */ String $primaryButtonLabel;
    final /* synthetic */ PrimaryButtonState $primaryButtonState;
    final /* synthetic */ String $secondaryButtonLabel;
    final /* synthetic */ SupportedPaymentMethod $selectedPaymentMethod;
    final /* synthetic */ List<SupportedPaymentMethod> $supportedPaymentMethods;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PaymentMethodBodyKt$PaymentMethodBody$6(List<? extends SupportedPaymentMethod> list, SupportedPaymentMethod supportedPaymentMethod, String str, PrimaryButtonState primaryButtonState, String str2, ErrorMessage errorMessage, Function1<? super SupportedPaymentMethod, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, int i) {
        super(2);
        this.$supportedPaymentMethods = list;
        this.$selectedPaymentMethod = supportedPaymentMethod;
        this.$primaryButtonLabel = str;
        this.$primaryButtonState = primaryButtonState;
        this.$secondaryButtonLabel = str2;
        this.$errorMessage = errorMessage;
        this.$onPaymentMethodSelected = function1;
        this.$onPrimaryButtonClick = function0;
        this.$onSecondaryButtonClick = function02;
        this.$formContent = function3;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        PaymentMethodBodyKt.PaymentMethodBody(this.$supportedPaymentMethods, this.$selectedPaymentMethod, this.$primaryButtonLabel, this.$primaryButtonState, this.$secondaryButtonLabel, this.$errorMessage, this.$onPaymentMethodSelected, this.$onPrimaryButtonClick, this.$onSecondaryButtonClick, this.$formContent, interfaceC32720Et0, this.$$changed | 1);
    }
}
