package com.stripe.android.p049ui.core;

import androidx.activity.result.ActivityResultRegistry;
import androidx.fragment.app.Fragment;
import com.stripe.android.stripecardscan.cardscan.CardScanSheet;
import com.stripe.android.stripecardscan.cardscan.CardScanSheetResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/ui/core/DefaultStripeCardScanProxy;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.StripeCardScanProxy$Companion$create$1 */
/* loaded from: classes7.dex */
public final class StripeCardScanProxy$Companion$create$1 extends Lambda implements Function0<DefaultStripeCardScanProxy> {
    final /* synthetic */ Fragment $fragment;
    final /* synthetic */ Function1<CardScanSheetResult, Unit> $onFinished;
    final /* synthetic */ String $stripePublishableKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeCardScanProxy$Companion$create$1(Fragment fragment, String str, Function1<? super CardScanSheetResult, Unit> function1) {
        super(0);
        this.$fragment = fragment;
        this.$stripePublishableKey = str;
        this.$onFinished = function1;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final DefaultStripeCardScanProxy invoke() {
        return new DefaultStripeCardScanProxy(CardScanSheet.Companion.create$default(CardScanSheet.Companion, this.$fragment, this.$stripePublishableKey, new C19374xbe288604(this.$onFinished), (ActivityResultRegistry) null, 8, (Object) null));
    }
}
