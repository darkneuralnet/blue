package com.stripe.android.view;

import com.stripe.android.model.CardBrand;
import com.stripe.android.view.CardMultilineWidget;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, m28432d2 = {"Lcom/stripe/android/model/CardBrand;", "cardBrand", "Lcom/stripe/android/view/CardMultilineWidget$CardBrandIcon;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class CardMultilineWidget$Companion$DEFAULT_CARD_BRAND_ICON_SUPPLIER$1 implements CardMultilineWidget.CardBrandIconSupplier {
    public static final CardMultilineWidget$Companion$DEFAULT_CARD_BRAND_ICON_SUPPLIER$1 INSTANCE = new CardMultilineWidget$Companion$DEFAULT_CARD_BRAND_ICON_SUPPLIER$1();

    @Override // com.stripe.android.view.CardMultilineWidget.CardBrandIconSupplier
    public final CardMultilineWidget.CardBrandIcon get(CardBrand cardBrand) {
        Intrinsics.checkNotNullParameter(cardBrand, "cardBrand");
        return new CardMultilineWidget.CardBrandIcon(cardBrand.getIcon());
    }
}
