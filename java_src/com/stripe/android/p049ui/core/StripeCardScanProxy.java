package com.stripe.android.p049ui.core;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.stripe.android.stripecardscan.cardscan.CardScanSheet;
import com.stripe.android.stripecardscan.cardscan.CardScanSheetResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011J\b\u0010\u0003\u001a\u00020\u0002H&JE\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00020\nH&¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/ui/core/StripeCardScanProxy;", "", "", "present", "LLifecycleOwner;", "lifecycleOwner", "Landroidx/fragment/app/FragmentManager;", "supportFragmentManager", "", "fragmentContainer", "Lkotlin/Function1;", "Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;", "Lkotlin/ParameterName;", "name", "cardScanSheetResult", "onFinished", "attachCardScanFragment", "Companion", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.ui.core.StripeCardScanProxy */
/* loaded from: classes7.dex */
public interface StripeCardScanProxy {
    public static final Companion Companion = Companion.$$INSTANCE;

    void attachCardScanFragment(LifecycleOwner lifecycleOwner, FragmentManager fragmentManager, int i, Function1<? super CardScanSheetResult, Unit> function1);

    void present();

    @Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JS\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\n2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013JS\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\b2!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\n2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0012\u001a\u00020\u0013¨\u0006\u0019"}, m28432d2 = {"Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion;", "", "()V", "create", "Lcom/stripe/android/ui/core/StripeCardScanProxy;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "stripePublishableKey", "", "onFinished", "Lkotlin/Function1;", "Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;", "Lkotlin/ParameterName;", "name", "cardScanSheetResult", "", "provider", "Lkotlin/Function0;", "isStripeCardScanAvailable", "Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;", "fragment", "Landroidx/fragment/app/Fragment;", "removeCardScanFragment", "supportFragmentManager", "Landroidx/fragment/app/FragmentManager;", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.ui.core.StripeCardScanProxy$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ StripeCardScanProxy create$default(Companion companion, Fragment fragment, String str, Function1 function1, Function0 function0, IsStripeCardScanAvailable isStripeCardScanAvailable, int i, Object obj) {
            StripeCardScanProxy$Companion$create$1 stripeCardScanProxy$Companion$create$1 = function0;
            if ((i & 8) != 0) {
                stripeCardScanProxy$Companion$create$1 = new StripeCardScanProxy$Companion$create$1(fragment, str, function1);
            }
            Function0 function02 = stripeCardScanProxy$Companion$create$1;
            if ((i & 16) != 0) {
                isStripeCardScanAvailable = new DefaultIsStripeCardScanAvailable();
            }
            return companion.create(fragment, str, function1, function02, isStripeCardScanAvailable);
        }

        public static /* synthetic */ void removeCardScanFragment$default(Companion companion, FragmentManager fragmentManager, IsStripeCardScanAvailable isStripeCardScanAvailable, int i, Object obj) {
            if ((i & 2) != 0) {
                isStripeCardScanAvailable = new DefaultIsStripeCardScanAvailable();
            }
            companion.removeCardScanFragment(fragmentManager, isStripeCardScanAvailable);
        }

        public final StripeCardScanProxy create(Fragment fragment, String stripePublishableKey, Function1<? super CardScanSheetResult, Unit> onFinished, Function0<? extends StripeCardScanProxy> provider, IsStripeCardScanAvailable isStripeCardScanAvailable) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(stripePublishableKey, "stripePublishableKey");
            Intrinsics.checkNotNullParameter(onFinished, "onFinished");
            Intrinsics.checkNotNullParameter(provider, "provider");
            Intrinsics.checkNotNullParameter(isStripeCardScanAvailable, "isStripeCardScanAvailable");
            if (isStripeCardScanAvailable.invoke()) {
                return provider.invoke();
            }
            return new UnsupportedStripeCardScanProxy();
        }

        public final void removeCardScanFragment(FragmentManager supportFragmentManager, IsStripeCardScanAvailable isStripeCardScanAvailable) {
            Intrinsics.checkNotNullParameter(supportFragmentManager, "supportFragmentManager");
            Intrinsics.checkNotNullParameter(isStripeCardScanAvailable, "isStripeCardScanAvailable");
            if (isStripeCardScanAvailable.invoke()) {
                CardScanSheet.Companion.removeCardScanFragment(supportFragmentManager);
            }
        }

        public static /* synthetic */ StripeCardScanProxy create$default(Companion companion, AppCompatActivity appCompatActivity, String str, Function1 function1, Function0 function0, IsStripeCardScanAvailable isStripeCardScanAvailable, int i, Object obj) {
            StripeCardScanProxy$Companion$create$2 stripeCardScanProxy$Companion$create$2 = function0;
            if ((i & 8) != 0) {
                stripeCardScanProxy$Companion$create$2 = new StripeCardScanProxy$Companion$create$2(appCompatActivity, str, function1);
            }
            Function0 function02 = stripeCardScanProxy$Companion$create$2;
            if ((i & 16) != 0) {
                isStripeCardScanAvailable = new DefaultIsStripeCardScanAvailable();
            }
            return companion.create(appCompatActivity, str, function1, function02, isStripeCardScanAvailable);
        }

        public final StripeCardScanProxy create(AppCompatActivity activity, String stripePublishableKey, Function1<? super CardScanSheetResult, Unit> onFinished, Function0<? extends StripeCardScanProxy> provider, IsStripeCardScanAvailable isStripeCardScanAvailable) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(stripePublishableKey, "stripePublishableKey");
            Intrinsics.checkNotNullParameter(onFinished, "onFinished");
            Intrinsics.checkNotNullParameter(provider, "provider");
            Intrinsics.checkNotNullParameter(isStripeCardScanAvailable, "isStripeCardScanAvailable");
            if (isStripeCardScanAvailable.invoke()) {
                return provider.invoke();
            }
            return new UnsupportedStripeCardScanProxy();
        }
    }
}
