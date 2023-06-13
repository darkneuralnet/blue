package com.stripe.android.p049ui.core;

import androidx.fragment.app.FragmentManager;
import com.stripe.android.stripecardscan.cardscan.CardScanSheetResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016JC\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00020\nH\u0016¨\u0006\u0013"}, m28432d2 = {"Lcom/stripe/android/ui/core/UnsupportedStripeCardScanProxy;", "Lcom/stripe/android/ui/core/StripeCardScanProxy;", "", "present", "LLifecycleOwner;", "lifecycleOwner", "Landroidx/fragment/app/FragmentManager;", "supportFragmentManager", "", "fragmentContainer", "Lkotlin/Function1;", "Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;", "Lkotlin/ParameterName;", "name", "cardScanSheetResult", "onFinished", "attachCardScanFragment", "<init>", "()V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.ui.core.UnsupportedStripeCardScanProxy */
/* loaded from: classes7.dex */
public final class UnsupportedStripeCardScanProxy implements StripeCardScanProxy {
    @Override // com.stripe.android.p049ui.core.StripeCardScanProxy
    public void attachCardScanFragment(LifecycleOwner lifecycleOwner, FragmentManager supportFragmentManager, int i, Function1<? super CardScanSheetResult, Unit> onFinished) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(supportFragmentManager, "supportFragmentManager");
        Intrinsics.checkNotNullParameter(onFinished, "onFinished");
    }

    @Override // com.stripe.android.p049ui.core.StripeCardScanProxy
    public void present() {
    }
}
