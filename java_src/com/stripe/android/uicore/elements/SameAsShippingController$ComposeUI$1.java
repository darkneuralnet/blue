package com.stripe.android.uicore.elements;

import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class SameAsShippingController$ComposeUI$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ SectionFieldElement $field;
    final /* synthetic */ Set<IdentifierSpec> $hiddenIdentifiers;
    final /* synthetic */ IdentifierSpec $lastTextFieldIdentifier;
    final /* synthetic */ InterfaceC41563gV2 $modifier;
    final /* synthetic */ int $nextFocusDirection;
    final /* synthetic */ int $previousFocusDirection;
    final /* synthetic */ SameAsShippingController $tmp0_rcvr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SameAsShippingController$ComposeUI$1(SameAsShippingController sameAsShippingController, boolean z, SectionFieldElement sectionFieldElement, InterfaceC41563gV2 interfaceC41563gV2, Set<IdentifierSpec> set, IdentifierSpec identifierSpec, int i, int i2, int i3) {
        super(2);
        this.$tmp0_rcvr = sameAsShippingController;
        this.$enabled = z;
        this.$field = sectionFieldElement;
        this.$modifier = interfaceC41563gV2;
        this.$hiddenIdentifiers = set;
        this.$lastTextFieldIdentifier = identifierSpec;
        this.$nextFocusDirection = i;
        this.$previousFocusDirection = i2;
        this.$$changed = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        this.$tmp0_rcvr.mo116658ComposeUIMxjM1cc(this.$enabled, this.$field, this.$modifier, this.$hiddenIdentifiers, this.$lastTextFieldIdentifier, this.$nextFocusDirection, this.$previousFocusDirection, interfaceC32720Et0, this.$$changed | 1);
    }
}
