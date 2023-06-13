package com.stripe.android.financialconnections.p041ui.components;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.financialconnections.ui.components.TextFieldKt$FinancialConnectionsOutlinedTextField$1 */
/* loaded from: classes7.dex */
public final class TextFieldKt$FinancialConnectionsOutlinedTextField$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ C38736bl2 $keyboardOptions;
    final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> $label;
    final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> $leadingIcon;
    final /* synthetic */ InterfaceC41563gV2 $modifier;
    final /* synthetic */ Function1<F16, Unit> $onValueChange;
    final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> $placeholder;
    final /* synthetic */ boolean $readOnly;
    final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> $trailingIcon;
    final /* synthetic */ F16 $value;
    final /* synthetic */ InterfaceC32735Eu6 $visualTransformation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldKt$FinancialConnectionsOutlinedTextField$1(F16 f16, InterfaceC41563gV2 interfaceC41563gV2, Function1<? super F16, Unit> function1, boolean z, boolean z2, C38736bl2 c38736bl2, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, InterfaceC32735Eu6 interfaceC32735Eu6, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function22, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function23, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function24, int i, int i2, int i3) {
        super(2);
        this.$value = f16;
        this.$modifier = interfaceC41563gV2;
        this.$onValueChange = function1;
        this.$readOnly = z;
        this.$isError = z2;
        this.$keyboardOptions = c38736bl2;
        this.$placeholder = function2;
        this.$visualTransformation = interfaceC32735Eu6;
        this.$trailingIcon = function22;
        this.$leadingIcon = function23;
        this.$label = function24;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        TextFieldKt.FinancialConnectionsOutlinedTextField(this.$value, this.$modifier, this.$onValueChange, this.$readOnly, this.$isError, this.$keyboardOptions, this.$placeholder, this.$visualTransformation, this.$trailingIcon, this.$leadingIcon, this.$label, interfaceC32720Et0, this.$$changed | 1, this.$$changed1, this.$$default);
    }
}
