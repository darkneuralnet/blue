package com.stripe.android.p049ui.core.elements;

import android.content.Intent;
import com.stripe.android.p049ui.core.cardscan.CardScanActivity;
import com.stripe.android.stripecardscan.cardscan.CardScanSheetResult;
import com.stripe.android.stripecardscan.cardscan.exception.UnknownScanException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.elements.CardDetailsSectionElementUIKt$CardDetailsSectionElementUI$1$2 */
/* loaded from: classes7.dex */
public final class CardDetailsSectionElementUIKt$CardDetailsSectionElementUI$1$2 extends Lambda implements Function1<Intent, Unit> {
    final /* synthetic */ CardDetailsSectionController $controller;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardDetailsSectionElementUIKt$CardDetailsSectionElementUI$1$2(CardDetailsSectionController cardDetailsSectionController) {
        super(1);
        this.$controller = cardDetailsSectionController;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Intent intent) {
        invoke2(intent);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Intent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        CardNumberController controller = this.$controller.getCardDetailsElement$payments_ui_core_release().getController().getNumberElement().getController();
        CardScanSheetResult cardScanSheetResult = (CardScanSheetResult) it.getParcelableExtra(CardScanActivity.CARD_SCAN_PARCELABLE_NAME);
        if (cardScanSheetResult == null) {
            cardScanSheetResult = (CardScanSheetResult) new CardScanSheetResult.Failed(new UnknownScanException("No data in the result intent"));
        }
        controller.onCardScanResult(cardScanSheetResult);
    }
}
