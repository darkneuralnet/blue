package com.stripe.android.p049ui.core;

import com.stripe.android.stripecardscan.cardscan.CardScanSheet;
import com.stripe.android.stripecardscan.cardscan.CardScanSheetResult;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.StripeCardScanProxy$sam$com_stripe_android_stripecardscan_cardscan_CardScanSheet_CardScanResultCallback$0 */
/* loaded from: classes7.dex */
public final class C19374xbe288604 implements CardScanSheet.CardScanResultCallback, FunctionAdapter {
    private final /* synthetic */ Function1 function;

    public C19374xbe288604(Function1 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.function = function;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof CardScanSheet.CardScanResultCallback) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function<?> getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    public final /* synthetic */ void onCardScanSheetResult(CardScanSheetResult cardScanSheetResult) {
        this.function.invoke(cardScanSheetResult);
    }
}
