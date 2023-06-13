package com.stripe.android.uicore.elements;

import com.stripe.android.uicore.StripeThemeKt;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nSectionElementUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SectionElementUI.kt\ncom/stripe/android/uicore/elements/SectionElementUIKt$SectionElementUI$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,88:1\n1864#2,2:89\n1866#2:93\n174#3:91\n174#3:92\n*S KotlinDebug\n*F\n+ 1 SectionElementUI.kt\ncom/stripe/android/uicore/elements/SectionElementUIKt$SectionElementUI$2\n*L\n65#1:89,2\n65#1:93\n77#1:91\n79#1:92\n*E\n"})
/* loaded from: classes7.dex */
public final class SectionElementUIKt$SectionElementUI$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ List<SectionFieldElement> $elementsInsideCard;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Set<IdentifierSpec> $hiddenIdentifiers;
    final /* synthetic */ IdentifierSpec $lastTextFieldIdentifier;
    final /* synthetic */ int $nextFocusDirection;
    final /* synthetic */ int $previousFocusDirection;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SectionElementUIKt$SectionElementUI$2(List<? extends SectionFieldElement> list, boolean z, Set<IdentifierSpec> set, IdentifierSpec identifierSpec, int i, int i2, int i3) {
        super(2);
        this.$elementsInsideCard = list;
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
        int lastIndex;
        char c;
        if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(520003850, i, -1, "com.stripe.android.uicore.elements.SectionElementUI.<anonymous> (SectionElementUI.kt:63)");
        }
        List<SectionFieldElement> list = this.$elementsInsideCard;
        boolean z = this.$enabled;
        Set<IdentifierSpec> set = this.$hiddenIdentifiers;
        IdentifierSpec identifierSpec = this.$lastTextFieldIdentifier;
        int i2 = this.$nextFocusDirection;
        int i3 = this.$previousFocusDirection;
        int i4 = this.$$dirty;
        int i5 = 0;
        for (Object obj : list) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            int i7 = i4 << 3;
            int i8 = i5;
            int i9 = i4;
            int i10 = i3;
            int i11 = i2;
            IdentifierSpec identifierSpec2 = identifierSpec;
            SectionFieldElementUIKt.m116747SectionFieldElementUI0uKR9Ig(z, (SectionFieldElement) obj, null, set, identifierSpec, i2, i3, interfaceC32720Et0, (i4 & 14) | 4096 | (57344 & i7) | (458752 & i7) | (i7 & 3670016), 4);
            lastIndex = CollectionsKt__CollectionsKt.getLastIndex(list);
            if (i8 != lastIndex) {
                TM2 tm2 = TM2.f35372a;
                int i12 = TM2.f35373b;
                c = 2;
                L51.m97795a(ND3.m94182k(InterfaceC41563gV2.f82354b0, C43705k61.m29303g(StripeThemeKt.getStripeShapes(tm2, interfaceC32720Et0, i12).getBorderStrokeWidth()), 0.0f, 2, null), StripeThemeKt.getStripeColors(tm2, interfaceC32720Et0, i12).m116697getComponentDivider0d7_KjU(), C43705k61.m29303g(StripeThemeKt.getStripeShapes(tm2, interfaceC32720Et0, i12).getBorderStrokeWidth()), 0.0f, interfaceC32720Et0, 0, 8);
            } else {
                c = 2;
            }
            i5 = i6;
            identifierSpec = identifierSpec2;
            i4 = i9;
            i3 = i10;
            i2 = i11;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
