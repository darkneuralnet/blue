package com.stripe.android.uicore.elements;

import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nSectionElementUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SectionElementUI.kt\ncom/stripe/android/uicore/elements/SectionElementUIKt$SectionElementUI$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,88:1\n1855#2,2:89\n*S KotlinDebug\n*F\n+ 1 SectionElementUI.kt\ncom/stripe/android/uicore/elements/SectionElementUIKt$SectionElementUI$1\n*L\n53#1:89,2\n*E\n"})
/* loaded from: classes7.dex */
public final class SectionElementUIKt$SectionElementUI$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ List<SectionFieldElement> $elementsOutsideCard;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Set<IdentifierSpec> $hiddenIdentifiers;
    final /* synthetic */ IdentifierSpec $lastTextFieldIdentifier;
    final /* synthetic */ int $nextFocusDirection;
    final /* synthetic */ int $previousFocusDirection;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SectionElementUIKt$SectionElementUI$1(List<? extends SectionFieldElement> list, boolean z, Set<IdentifierSpec> set, IdentifierSpec identifierSpec, int i, int i2, int i3) {
        super(2);
        this.$elementsOutsideCard = list;
        this.$enabled = z;
        this.$hiddenIdentifiers = set;
        this.$lastTextFieldIdentifier = identifierSpec;
        this.$nextFocusDirection = i;
        this.$previousFocusDirection = i2;
        this.$$dirty = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1503495701, i, -1, "com.stripe.android.uicore.elements.SectionElementUI.<anonymous> (SectionElementUI.kt:51)");
        }
        boolean z = this.$enabled;
        Set<IdentifierSpec> set = this.$hiddenIdentifiers;
        IdentifierSpec identifierSpec = this.$lastTextFieldIdentifier;
        int i2 = this.$nextFocusDirection;
        int i3 = this.$previousFocusDirection;
        int i4 = this.$$dirty;
        for (SectionFieldElement sectionFieldElement : this.$elementsOutsideCard) {
            int i5 = i4 << 3;
            SectionFieldElementUIKt.m116747SectionFieldElementUI0uKR9Ig(z, sectionFieldElement, null, set, identifierSpec, i2, i3, interfaceC32720Et0, (i4 & 14) | 4096 | (57344 & i5) | (458752 & i5) | (i5 & 3670016), 4);
            i3 = i3;
            i4 = i4;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
