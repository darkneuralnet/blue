package com.stripe.android.p049ui.core.cardscan;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.app.AppCompatActivity;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.p049ui.core.IsStripeCardScanAvailable;
import com.stripe.android.p049ui.core.StripeCardScanProxy;
import com.stripe.android.p049ui.core.databinding.ActivityCardScanBinding;
import com.stripe.android.stripecardscan.cardscan.CardScanSheetResult;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m28432d2 = {"Lcom/stripe/android/ui/core/cardscan/CardScanActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "stripeCardScanProxy", "Lcom/stripe/android/ui/core/StripeCardScanProxy;", "viewBinding", "Lcom/stripe/android/ui/core/databinding/ActivityCardScanBinding;", "getViewBinding", "()Lcom/stripe/android/ui/core/databinding/ActivityCardScanBinding;", "viewBinding$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onScanFinished", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;", "Companion", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.cardscan.CardScanActivity */
/* loaded from: classes7.dex */
public final class CardScanActivity extends AppCompatActivity {
    public static final String CARD_SCAN_PARCELABLE_NAME = "CardScanActivityResult";
    public static final Companion Companion = new Companion(null);
    private StripeCardScanProxy stripeCardScanProxy;
    private final Lazy viewBinding$delegate;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/ui/core/cardscan/CardScanActivity$Companion;", "", "()V", "CARD_SCAN_PARCELABLE_NAME", "", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.ui.core.cardscan.CardScanActivity$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public CardScanActivity() {
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new CardScanActivity$viewBinding$2(this));
        this.viewBinding$delegate = lazy;
    }

    private final ActivityCardScanBinding getViewBinding() {
        return (ActivityCardScanBinding) this.viewBinding$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onScanFinished(CardScanSheetResult cardScanSheetResult) {
        Intent putExtra = new Intent().putExtra(CARD_SCAN_PARCELABLE_NAME, (Parcelable) cardScanSheetResult);
        Intrinsics.checkNotNullExpressionValue(putExtra, "Intent()\n            .pu…     result\n            )");
        setResult(-1, putExtra);
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(getViewBinding().getRoot());
        StripeCardScanProxy create$default = StripeCardScanProxy.Companion.create$default(StripeCardScanProxy.Companion, this, PaymentConfiguration.Companion.getInstance(this).getPublishableKey(), new CardScanActivity$onCreate$1(this), (Function0) null, (IsStripeCardScanAvailable) null, 24, (Object) null);
        this.stripeCardScanProxy = create$default;
        if (create$default == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stripeCardScanProxy");
            create$default = null;
        }
        create$default.present();
    }
}
