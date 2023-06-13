package com.stripe.android.payments.core.authentication.threeds2;

import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionStarter;
import com.stripe.android.view.AuthActivityStarterHost;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionStarter;", "host", "Lcom/stripe/android/view/AuthActivityStarterHost;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class Stripe3DS2Authenticator$stripe3ds2CompletionStarterFactory$1 extends Lambda implements Function1<AuthActivityStarterHost, Stripe3ds2TransactionStarter> {
    final /* synthetic */ Stripe3DS2Authenticator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Stripe3DS2Authenticator$stripe3ds2CompletionStarterFactory$1(Stripe3DS2Authenticator stripe3DS2Authenticator) {
        super(1);
        this.this$0 = stripe3DS2Authenticator;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Stripe3ds2TransactionStarter invoke(AuthActivityStarterHost host) {
        Intrinsics.checkNotNullParameter(host, "host");
        AbstractC0407B5<Stripe3ds2TransactionContract.Args> stripe3ds2CompletionLauncher$payments_core_release = this.this$0.getStripe3ds2CompletionLauncher$payments_core_release();
        if (stripe3ds2CompletionLauncher$payments_core_release != null) {
            return new Stripe3ds2TransactionStarter.Modern(stripe3ds2CompletionLauncher$payments_core_release);
        }
        return new Stripe3ds2TransactionStarter.Legacy(host);
    }
}
