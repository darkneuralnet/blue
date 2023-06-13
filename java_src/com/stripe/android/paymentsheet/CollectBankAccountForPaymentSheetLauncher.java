package com.stripe.android.paymentsheet;

import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.payments.bankaccount.CollectBankAccountConfiguration;
import com.stripe.android.payments.bankaccount.CollectBankAccountLauncher;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResult;
import com.stripe.android.paymentsheet.CollectBankAccountForPaymentSheetLauncher;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0015\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J*\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/CollectBankAccountForPaymentSheetLauncher;", "Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;", "", "publishableKey", NamedConstantsKt.STRIPE_ACCOUNT_ID, "clientSecret", "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;", "configuration", "", "presentWithPaymentIntent", "presentWithSetupIntent", "LB5;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;", "hostActivityLauncher", "LB5;", "<init>", "(LB5;)V", "Companion", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class CollectBankAccountForPaymentSheetLauncher implements CollectBankAccountLauncher {
    public static final Companion Companion = new Companion(null);
    private final AbstractC0407B5<CollectBankAccountContract.Args> hostActivityLauncher;

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bJ\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¨\u0006\r"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/CollectBankAccountForPaymentSheetLauncher$Companion;", "", "()V", "create", "Lcom/stripe/android/paymentsheet/CollectBankAccountForPaymentSheetLauncher;", "activity", "Landroidx/activity/ComponentActivity;", "callback", "Lkotlin/Function1;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;", "", "fragment", "Landroidx/fragment/app/Fragment;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
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

        public final CollectBankAccountForPaymentSheetLauncher create(ComponentActivity activity, final Function1<? super CollectBankAccountResult, Unit> callback) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(callback, "callback");
            AbstractC0407B5 registerForActivityResult = activity.registerForActivityResult(new CollectBankAccountContract(), new InterfaceC28515t5() { // from class: Zl0
                @Override // p000.InterfaceC28515t5
                /* renamed from: a */
                public final void mo1514a(Object obj) {
                    CollectBankAccountForPaymentSheetLauncher.Companion.create$lambda$0(Function1.this, (CollectBankAccountResult) obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "activity.registerForActi…ack(it)\n                }");
            return new CollectBankAccountForPaymentSheetLauncher(registerForActivityResult);
        }

        private Companion() {
        }

        public final CollectBankAccountForPaymentSheetLauncher create(Fragment fragment, final Function1<? super CollectBankAccountResult, Unit> callback) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(callback, "callback");
            AbstractC0407B5 registerForActivityResult = fragment.registerForActivityResult(new CollectBankAccountContract(), new InterfaceC28515t5() { // from class: am0
                @Override // p000.InterfaceC28515t5
                /* renamed from: a */
                public final void mo1514a(Object obj) {
                    CollectBankAccountForPaymentSheetLauncher.Companion.create$lambda$1(Function1.this, (CollectBankAccountResult) obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "fragment.registerForActi…ack(it)\n                }");
            return new CollectBankAccountForPaymentSheetLauncher(registerForActivityResult);
        }
    }

    public CollectBankAccountForPaymentSheetLauncher(AbstractC0407B5<CollectBankAccountContract.Args> hostActivityLauncher) {
        Intrinsics.checkNotNullParameter(hostActivityLauncher, "hostActivityLauncher");
        this.hostActivityLauncher = hostActivityLauncher;
    }

    @Override // com.stripe.android.payments.bankaccount.CollectBankAccountLauncher
    public void presentWithPaymentIntent(String publishableKey, String str, String clientSecret, CollectBankAccountConfiguration configuration) {
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.hostActivityLauncher.m114705a(new CollectBankAccountContract.Args.ForPaymentIntent(publishableKey, str, clientSecret, configuration, false));
    }

    @Override // com.stripe.android.payments.bankaccount.CollectBankAccountLauncher
    public void presentWithSetupIntent(String publishableKey, String str, String clientSecret, CollectBankAccountConfiguration configuration) {
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.hostActivityLauncher.m114705a(new CollectBankAccountContract.Args.ForSetupIntent(publishableKey, str, clientSecret, configuration, false));
    }
}
