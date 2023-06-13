package com.stripe.android.payments.bankaccount;

import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.payments.bankaccount.CollectBankAccountLauncher;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ,\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J,\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;", "", "presentWithPaymentIntent", "", "publishableKey", "", NamedConstantsKt.STRIPE_ACCOUNT_ID, "clientSecret", "configuration", "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;", "presentWithSetupIntent", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public interface CollectBankAccountLauncher {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void presentWithPaymentIntent$default(CollectBankAccountLauncher collectBankAccountLauncher, String str, String str2, String str3, CollectBankAccountConfiguration collectBankAccountConfiguration, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: presentWithPaymentIntent");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            collectBankAccountLauncher.presentWithPaymentIntent(str, str2, str3, collectBankAccountConfiguration);
        }

        public static /* synthetic */ void presentWithSetupIntent$default(CollectBankAccountLauncher collectBankAccountLauncher, String str, String str2, String str3, CollectBankAccountConfiguration collectBankAccountConfiguration, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: presentWithSetupIntent");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            collectBankAccountLauncher.presentWithSetupIntent(str, str2, str3, collectBankAccountConfiguration);
        }
    }

    void presentWithPaymentIntent(String str, String str2, String str3, CollectBankAccountConfiguration collectBankAccountConfiguration);

    void presentWithSetupIntent(String str, String str2, String str3, CollectBankAccountConfiguration collectBankAccountConfiguration);

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bJ\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¨\u0006\r"}, m28432d2 = {"Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher$Companion;", "", "()V", "create", "Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;", "activity", "Landroidx/activity/ComponentActivity;", "callback", "Lkotlin/Function1;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;", "", "fragment", "Landroidx/fragment/app/Fragment;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void create$lambda$0(Function1 callback, CollectBankAccountResult it) {
            Intrinsics.checkNotNullParameter(callback, "$callback");
            Intrinsics.checkNotNullExpressionValue(it, "it");
            callback.invoke(it);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void create$lambda$1(Function1 callback, CollectBankAccountResult it) {
            Intrinsics.checkNotNullParameter(callback, "$callback");
            Intrinsics.checkNotNullExpressionValue(it, "it");
            callback.invoke(it);
        }

        public final CollectBankAccountLauncher create(ComponentActivity activity, final Function1<? super CollectBankAccountResult, Unit> callback) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(callback, "callback");
            AbstractC0407B5 registerForActivityResult = activity.registerForActivityResult(new CollectBankAccountContract(), new InterfaceC28515t5() { // from class: bm0
                @Override // p000.InterfaceC28515t5
                /* renamed from: a */
                public final void mo1514a(Object obj) {
                    CollectBankAccountLauncher.Companion.create$lambda$0(Function1.this, (CollectBankAccountResult) obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "activity.registerForActi…ack(it)\n                }");
            return new StripeCollectBankAccountLauncher(registerForActivityResult);
        }

        public final CollectBankAccountLauncher create(Fragment fragment, final Function1<? super CollectBankAccountResult, Unit> callback) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(callback, "callback");
            AbstractC0407B5 registerForActivityResult = fragment.registerForActivityResult(new CollectBankAccountContract(), new InterfaceC28515t5() { // from class: cm0
                @Override // p000.InterfaceC28515t5
                /* renamed from: a */
                public final void mo1514a(Object obj) {
                    CollectBankAccountLauncher.Companion.create$lambda$1(Function1.this, (CollectBankAccountResult) obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "fragment.registerForActi…ack(it)\n                }");
            return new StripeCollectBankAccountLauncher(registerForActivityResult);
        }
    }
}
