package com.stripe.android;

import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.StripeBrowserLauncherActivity;
import com.stripe.android.view.AuthActivityStarter;
import com.stripe.android.view.AuthActivityStarterHost;
import com.stripe.android.view.PaymentAuthWebViewActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/PaymentBrowserAuthStarter;", "Lcom/stripe/android/view/AuthActivityStarter;", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "Legacy", "Modern", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public interface PaymentBrowserAuthStarter extends AuthActivityStarter<PaymentBrowserAuthContract.Args> {

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/PaymentBrowserAuthStarter$Legacy;", "Lcom/stripe/android/PaymentBrowserAuthStarter;", "host", "Lcom/stripe/android/view/AuthActivityStarterHost;", "defaultReturnUrl", "Lcom/stripe/android/payments/DefaultReturnUrl;", "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/payments/DefaultReturnUrl;)V", "start", "", "args", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Legacy implements PaymentBrowserAuthStarter {
        public static final int $stable = 0;
        private final DefaultReturnUrl defaultReturnUrl;
        private final AuthActivityStarterHost host;

        public Legacy(AuthActivityStarterHost host, DefaultReturnUrl defaultReturnUrl) {
            Intrinsics.checkNotNullParameter(host, "host");
            Intrinsics.checkNotNullParameter(defaultReturnUrl, "defaultReturnUrl");
            this.host = host;
            this.defaultReturnUrl = defaultReturnUrl;
        }

        @Override // com.stripe.android.view.AuthActivityStarter
        public void start(PaymentBrowserAuthContract.Args args) {
            Intrinsics.checkNotNullParameter(args, "args");
            this.host.startActivityForResult((args.hasDefaultReturnUrl$payments_core_release(this.defaultReturnUrl) || args.isInstantApp()) ? StripeBrowserLauncherActivity.class : PaymentAuthWebViewActivity.class, PaymentBrowserAuthContract.Args.copy$default(args, null, 0, null, null, null, false, null, null, false, false, this.host.getStatusBarColor(), null, false, 7167, null).toBundle(), args.getRequestCode());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/PaymentBrowserAuthStarter$Modern;", "Lcom/stripe/android/PaymentBrowserAuthStarter;", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "args", "", "start", "LB5;", "launcher", "LB5;", "<init>", "(LB5;)V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes6.dex */
    public static final class Modern implements PaymentBrowserAuthStarter {
        public static final int $stable = 8;
        private final AbstractC0407B5<PaymentBrowserAuthContract.Args> launcher;

        public Modern(AbstractC0407B5<PaymentBrowserAuthContract.Args> launcher) {
            Intrinsics.checkNotNullParameter(launcher, "launcher");
            this.launcher = launcher;
        }

        @Override // com.stripe.android.view.AuthActivityStarter
        public void start(PaymentBrowserAuthContract.Args args) {
            Intrinsics.checkNotNullParameter(args, "args");
            this.launcher.m114705a(args);
        }
    }
}
