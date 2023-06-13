package com.stripe.android.p049ui.core;

import com.stripe.android.uicore.elements.FormElement;
import com.stripe.android.uicore.elements.IdentifierSpec;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.FormUIKt$FormUI$1 */
/* loaded from: classes7.dex */
public final class FormUIKt$FormUI$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC32730Eu1<List<FormElement>> $elementsFlow;
    final /* synthetic */ InterfaceC32730Eu1<Boolean> $enabledFlow;
    final /* synthetic */ InterfaceC32730Eu1<Set<IdentifierSpec>> $hiddenIdentifiersFlow;
    final /* synthetic */ InterfaceC32730Eu1<IdentifierSpec> $lastTextFieldIdentifierFlow;
    final /* synthetic */ InterfaceC41563gV2 $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FormUIKt$FormUI$1(InterfaceC32730Eu1<? extends Set<IdentifierSpec>> interfaceC32730Eu1, InterfaceC32730Eu1<Boolean> interfaceC32730Eu12, InterfaceC32730Eu1<? extends List<? extends FormElement>> interfaceC32730Eu13, InterfaceC32730Eu1<IdentifierSpec> interfaceC32730Eu14, InterfaceC41563gV2 interfaceC41563gV2, int i, int i2) {
        super(2);
        this.$hiddenIdentifiersFlow = interfaceC32730Eu1;
        this.$enabledFlow = interfaceC32730Eu12;
        this.$elementsFlow = interfaceC32730Eu13;
        this.$lastTextFieldIdentifierFlow = interfaceC32730Eu14;
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
        FormUIKt.FormUI(this.$hiddenIdentifiersFlow, this.$enabledFlow, this.$elementsFlow, this.$lastTextFieldIdentifierFlow, this.$modifier, interfaceC32720Et0, this.$$changed | 1, this.$$default);
    }
}
