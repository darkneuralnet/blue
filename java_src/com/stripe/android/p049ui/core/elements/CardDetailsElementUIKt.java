package com.stripe.android.p049ui.core.elements;

import androidx.compose.p003ui.focus.C11299c;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.SectionFieldElement;
import com.stripe.android.uicore.elements.SectionFieldElementUIKt;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a7\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m28432d2 = {"", "enabled", "Lcom/stripe/android/ui/core/elements/CardDetailsController;", "controller", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "hiddenIdentifiers", "lastTextFieldIdentifier", "", "CardDetailsElementUI", "(ZLcom/stripe/android/ui/core/elements/CardDetailsController;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;LEt0;I)V", "payments-ui-core_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCardDetailsElementUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardDetailsElementUI.kt\ncom/stripe/android/ui/core/elements/CardDetailsElementUIKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,51:1\n1864#2,2:52\n1866#2:56\n174#3:54\n174#3:55\n*S KotlinDebug\n*F\n+ 1 CardDetailsElementUI.kt\ncom/stripe/android/ui/core/elements/CardDetailsElementUIKt\n*L\n22#1:52,2\n22#1:56\n43#1:54\n45#1:55\n*E\n"})
/* renamed from: com.stripe.android.ui.core.elements.CardDetailsElementUIKt */
/* loaded from: classes7.dex */
public final class CardDetailsElementUIKt {
    public static final void CardDetailsElementUI(boolean z, CardDetailsController controller, Set<IdentifierSpec> hiddenIdentifiers, IdentifierSpec identifierSpec, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int m68807a;
        int lastIndex;
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(hiddenIdentifiers, "hiddenIdentifiers");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1519035641);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1519035641, i, -1, "com.stripe.android.ui.core.elements.CardDetailsElementUI (CardDetailsElementUI.kt:15)");
        }
        int i2 = 0;
        for (Object obj : controller.getFields()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            SectionFieldElement sectionFieldElement = (SectionFieldElement) obj;
            if (Intrinsics.areEqual(sectionFieldElement.getIdentifier(), IdentifierSpec.Companion.getCardNumber())) {
                m68807a = C11299c.f52961b.m68803e();
            } else {
                m68807a = C11299c.f52961b.m68807a();
            }
            SectionFieldElementUIKt.m116747SectionFieldElementUI0uKR9Ig(z, sectionFieldElement, null, hiddenIdentifiers, identifierSpec, m68807a, 0, mo89518u, (i & 14) | 4160 | (IdentifierSpec.$stable << 12) | ((i << 3) & 57344), 68);
            lastIndex = CollectionsKt__CollectionsKt.getLastIndex(controller.getFields());
            if (i2 != lastIndex) {
                TM2 tm2 = TM2.f35372a;
                int i4 = TM2.f35373b;
                L51.m97795a(ND3.m94182k(InterfaceC41563gV2.f82354b0, C43705k61.m29303g(StripeThemeKt.getStripeShapes(tm2, mo89518u, i4).getBorderStrokeWidth()), 0.0f, 2, null), StripeThemeKt.getStripeColors(tm2, mo89518u, i4).m116697getComponentDivider0d7_KjU(), C43705k61.m29303g(StripeThemeKt.getStripeShapes(tm2, mo89518u, i4).getBorderStrokeWidth()), 0.0f, mo89518u, 0, 8);
            }
            i2 = i3;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new CardDetailsElementUIKt$CardDetailsElementUI$2(z, controller, hiddenIdentifiers, identifierSpec, i));
        }
    }
}
