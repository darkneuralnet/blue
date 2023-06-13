package com.stripe.android.p049ui.core.forms;

import com.stripe.android.p049ui.core.elements.CardBillingSpec;
import com.stripe.android.p049ui.core.elements.CardDetailsSectionSpec;
import com.stripe.android.p049ui.core.elements.FormItemSpec;
import com.stripe.android.p049ui.core.elements.LayoutSpec;
import com.stripe.android.uicore.elements.BillingSpecKt;
import com.stripe.android.uicore.elements.IdentifierSpec;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0016\u0010\u0000\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"LinkCardForm", "Lcom/stripe/android/ui/core/elements/LayoutSpec;", "getLinkCardForm", "()Lcom/stripe/android/ui/core/elements/LayoutSpec;", "payments-ui-core_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.forms.LinkCardFormKt */
/* loaded from: classes7.dex */
public final class LinkCardFormKt {
    private static final LayoutSpec LinkCardForm;

    static {
        List listOf;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FormItemSpec[]{new CardDetailsSectionSpec(IdentifierSpec.Companion.Generic("card_details_section")), new CardBillingSpec((IdentifierSpec) null, BillingSpecKt.getSupportedBillingCountries(), 1, (DefaultConstructorMarker) null)});
        LinkCardForm = new LayoutSpec(listOf);
    }

    public static final LayoutSpec getLinkCardForm() {
        return LinkCardForm;
    }
}
