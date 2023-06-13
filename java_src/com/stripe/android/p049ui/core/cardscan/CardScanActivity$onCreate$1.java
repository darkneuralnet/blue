package com.stripe.android.p049ui.core.cardscan;

import com.stripe.android.stripecardscan.cardscan.CardScanSheetResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.cardscan.CardScanActivity$onCreate$1 */
/* loaded from: classes7.dex */
public /* synthetic */ class CardScanActivity$onCreate$1 extends FunctionReferenceImpl implements Function1<CardScanSheetResult, Unit> {
    public CardScanActivity$onCreate$1(Object obj) {
        super(1, obj, CardScanActivity.class, "onScanFinished", "onScanFinished(Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CardScanSheetResult cardScanSheetResult) {
        invoke2(cardScanSheetResult);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(CardScanSheetResult p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((CardScanActivity) this.receiver).onScanFinished(p0);
    }
}
