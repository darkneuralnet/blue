package com.stripe.android.paymentsheet.p047ui;

import com.stripe.android.core.injection.NonFallbackInjector;
import com.stripe.android.paymentsheet.forms.FormFieldValues;
import com.stripe.android.paymentsheet.paymentdatacollection.FormArguments;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.paymentsheet.ui.PaymentMethodFormKt$PaymentMethodForm$1 */
/* loaded from: classes7.dex */
public final class PaymentMethodFormKt$PaymentMethodForm$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ FormArguments $args;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ NonFallbackInjector $injector;
    final /* synthetic */ InterfaceC41563gV2 $modifier;
    final /* synthetic */ Function1<FormFieldValues, Unit> $onFormFieldValuesChanged;
    final /* synthetic */ InterfaceC32730Eu1<Boolean> $showCheckboxFlow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PaymentMethodFormKt$PaymentMethodForm$1(FormArguments formArguments, boolean z, Function1<? super FormFieldValues, Unit> function1, InterfaceC32730Eu1<Boolean> interfaceC32730Eu1, NonFallbackInjector nonFallbackInjector, InterfaceC41563gV2 interfaceC41563gV2, int i, int i2) {
        super(2);
        this.$args = formArguments;
        this.$enabled = z;
        this.$onFormFieldValuesChanged = function1;
        this.$showCheckboxFlow = interfaceC32730Eu1;
        this.$injector = nonFallbackInjector;
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
        PaymentMethodFormKt.PaymentMethodForm(this.$args, this.$enabled, this.$onFormFieldValuesChanged, this.$showCheckboxFlow, this.$injector, this.$modifier, interfaceC32720Et0, this.$$changed | 1, this.$$default);
    }
}
