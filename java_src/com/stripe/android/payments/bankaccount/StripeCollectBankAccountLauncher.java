package com.stripe.android.payments.bankaccount;

import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J*\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/payments/bankaccount/StripeCollectBankAccountLauncher;", "Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;", "", "publishableKey", NamedConstantsKt.STRIPE_ACCOUNT_ID, "clientSecret", "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;", "configuration", "", "presentWithPaymentIntent", "presentWithSetupIntent", "LB5;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;", "hostActivityLauncher", "LB5;", "<init>", "(LB5;)V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class StripeCollectBankAccountLauncher implements CollectBankAccountLauncher {
    private final AbstractC0407B5<CollectBankAccountContract.Args> hostActivityLauncher;

    public StripeCollectBankAccountLauncher(AbstractC0407B5<CollectBankAccountContract.Args> hostActivityLauncher) {
        Intrinsics.checkNotNullParameter(hostActivityLauncher, "hostActivityLauncher");
        this.hostActivityLauncher = hostActivityLauncher;
    }

    @Override // com.stripe.android.payments.bankaccount.CollectBankAccountLauncher
    public void presentWithPaymentIntent(String publishableKey, String str, String clientSecret, CollectBankAccountConfiguration configuration) {
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.hostActivityLauncher.m114705a(new CollectBankAccountContract.Args.ForPaymentIntent(publishableKey, str, clientSecret, configuration, true));
    }

    @Override // com.stripe.android.payments.bankaccount.CollectBankAccountLauncher
    public void presentWithSetupIntent(String publishableKey, String str, String clientSecret, CollectBankAccountConfiguration configuration) {
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.hostActivityLauncher.m114705a(new CollectBankAccountContract.Args.ForSetupIntent(publishableKey, str, clientSecret, configuration, true));
    }
}
