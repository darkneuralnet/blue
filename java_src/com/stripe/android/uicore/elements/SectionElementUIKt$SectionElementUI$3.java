package com.stripe.android.uicore.elements;

import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class SectionElementUIKt$SectionElementUI$3 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ SectionElement $element;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Set<IdentifierSpec> $hiddenIdentifiers;
    final /* synthetic */ IdentifierSpec $lastTextFieldIdentifier;
    final /* synthetic */ int $nextFocusDirection;
    final /* synthetic */ int $previousFocusDirection;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SectionElementUIKt$SectionElementUI$3(boolean z, SectionElement sectionElement, Set<IdentifierSpec> set, IdentifierSpec identifierSpec, int i, int i2, int i3, int i4) {
        super(2);
        this.$enabled = z;
        this.$element = sectionElement;
        this.$hiddenIdentifiers = set;
        this.$lastTextFieldIdentifier = identifierSpec;
        this.$nextFocusDirection = i;
        this.$previousFocusDirection = i2;
        this.$$changed = i3;
        this.$$default = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        SectionElementUIKt.m116746SectionElementUIrgidl0k(this.$enabled, this.$element, this.$hiddenIdentifiers, this.$lastTextFieldIdentifier, this.$nextFocusDirection, this.$previousFocusDirection, interfaceC32720Et0, this.$$changed | 1, this.$$default);
    }
}
