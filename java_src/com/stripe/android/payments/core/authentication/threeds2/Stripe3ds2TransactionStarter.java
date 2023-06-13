package com.stripe.android.payments.core.authentication.threeds2;

import com.stripe.android.StripePaymentController;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.view.AuthActivityStarter;
import com.stripe.android.view.AuthActivityStarterHost;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionStarter;", "Lcom/stripe/android/view/AuthActivityStarter;", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "Legacy", "Modern", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public interface Stripe3ds2TransactionStarter extends AuthActivityStarter<Stripe3ds2TransactionContract.Args> {

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionStarter$Legacy;", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionStarter;", "host", "Lcom/stripe/android/view/AuthActivityStarterHost;", "(Lcom/stripe/android/view/AuthActivityStarterHost;)V", "start", "", "args", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Legacy implements Stripe3ds2TransactionStarter {
        public static final int $stable = 0;
        private final AuthActivityStarterHost host;

        public Legacy(AuthActivityStarterHost host) {
            Intrinsics.checkNotNullParameter(host, "host");
            this.host = host;
        }

        @Override // com.stripe.android.view.AuthActivityStarter
        public void start(Stripe3ds2TransactionContract.Args args) {
            Intrinsics.checkNotNullParameter(args, "args");
            this.host.startActivityForResult(Stripe3ds2TransactionActivity.class, args.toBundle(), StripePaymentController.Companion.getRequestCode$payments_core_release(args.getStripeIntent()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionStarter$Modern;", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionStarter;", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "args", "", "start", "LB5;", "launcher", "LB5;", "<init>", "(LB5;)V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Modern implements Stripe3ds2TransactionStarter {
        public static final int $stable = 8;
        private final AbstractC0407B5<Stripe3ds2TransactionContract.Args> launcher;

        public Modern(AbstractC0407B5<Stripe3ds2TransactionContract.Args> launcher) {
            Intrinsics.checkNotNullParameter(launcher, "launcher");
            this.launcher = launcher;
        }

        @Override // com.stripe.android.view.AuthActivityStarter
        public void start(Stripe3ds2TransactionContract.Args args) {
            Intrinsics.checkNotNullParameter(args, "args");
            this.launcher.m114705a(args);
        }
    }
}
