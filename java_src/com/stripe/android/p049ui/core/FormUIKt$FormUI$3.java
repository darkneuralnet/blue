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
/* renamed from: com.stripe.android.ui.core.FormUIKt$FormUI$3 */
/* loaded from: classes7.dex */
public final class FormUIKt$FormUI$3 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ List<FormElement> $elements;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Set<IdentifierSpec> $hiddenIdentifiers;
    final /* synthetic */ IdentifierSpec $lastTextFieldIdentifier;
    final /* synthetic */ InterfaceC41563gV2 $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FormUIKt$FormUI$3(Set<IdentifierSpec> set, boolean z, List<? extends FormElement> list, IdentifierSpec identifierSpec, InterfaceC41563gV2 interfaceC41563gV2, int i, int i2) {
        super(2);
        this.$hiddenIdentifiers = set;
        this.$enabled = z;
        this.$elements = list;
        this.$lastTextFieldIdentifier = identifierSpec;
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
        FormUIKt.FormUI(this.$hiddenIdentifiers, this.$enabled, this.$elements, this.$lastTextFieldIdentifier, this.$modifier, interfaceC32720Et0, this.$$changed | 1, this.$$default);
    }
}
