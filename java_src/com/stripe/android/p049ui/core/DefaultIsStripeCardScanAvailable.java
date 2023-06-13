package com.stripe.android.p049ui.core;

import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u0096\u0002¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/ui/core/DefaultIsStripeCardScanAvailable;", "Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;", "()V", "invoke", "", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.DefaultIsStripeCardScanAvailable */
/* loaded from: classes7.dex */
public final class DefaultIsStripeCardScanAvailable implements IsStripeCardScanAvailable {
    @Override // com.stripe.android.p049ui.core.IsStripeCardScanAvailable
    public boolean invoke() {
        try {
            Class.forName("com.stripe.android.stripecardscan.cardscan.CardScanSheet");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
