package com.stripe.android.payments.core.injection;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.PaymentBrowserAuthStarter;
import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.core.authentication.DefaultPaymentAuthenticatorRegistry;
import com.stripe.android.payments.core.authentication.OxxoAuthenticator;
import com.stripe.android.payments.core.authentication.PaymentAuthenticator;
import com.stripe.android.payments.core.authentication.WebIntentAuthenticator;
import com.stripe.android.view.AuthActivityStarterHost;
import dagger.Binds;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\fH'J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H'¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/payments/core/injection/AuthenticationModule;", "", "()V", "binds3DS1Authenticator", "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;", "Lcom/stripe/android/model/StripeIntent;", "webIntentAuthenticator", "Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator;", "bindsAlipayRedirectAuthenticator", "bindsCashAppRedirectAuthenticator", "bindsOxxoAuthenticator", "oxxoAuthenticator", "Lcom/stripe/android/payments/core/authentication/OxxoAuthenticator;", "bindsRedirectAuthenticator", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@Module
/* loaded from: classes7.dex */
public abstract class AuthenticationModule {
    public static final Companion Companion = new Companion(null);

    @Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J*\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0007J\"\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00100\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/payments/core/injection/AuthenticationModule$Companion;", "", "()V", "provideDefaultReturnUrl", "Lcom/stripe/android/payments/DefaultReturnUrl;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "providePaymentBrowserAuthStarterFactory", "Lkotlin/Function1;", "Lcom/stripe/android/view/AuthActivityStarterHost;", "Lcom/stripe/android/PaymentBrowserAuthStarter;", "lazyRegistry", "Ldagger/Lazy;", "Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;", "defaultReturnUrl", "providePaymentRelayStarterFactory", "Lcom/stripe/android/PaymentRelayStarter;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Provides
        public final DefaultReturnUrl provideDefaultReturnUrl(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return DefaultReturnUrl.Companion.create(context);
        }

        @Provides
        public final Function1<AuthActivityStarterHost, PaymentBrowserAuthStarter> providePaymentBrowserAuthStarterFactory(Lazy<DefaultPaymentAuthenticatorRegistry> lazyRegistry, DefaultReturnUrl defaultReturnUrl) {
            Intrinsics.checkNotNullParameter(lazyRegistry, "lazyRegistry");
            Intrinsics.checkNotNullParameter(defaultReturnUrl, "defaultReturnUrl");
            return new C19119x8d06bbb(lazyRegistry, defaultReturnUrl);
        }

        @Provides
        public final Function1<AuthActivityStarterHost, PaymentRelayStarter> providePaymentRelayStarterFactory(Lazy<DefaultPaymentAuthenticatorRegistry> lazyRegistry) {
            Intrinsics.checkNotNullParameter(lazyRegistry, "lazyRegistry");
            return new C19120xe33b699c(lazyRegistry);
        }

        private Companion() {
        }
    }

    @IntentAuthenticatorMap
    @Binds
    @IntentAuthenticatorKey(StripeIntent.NextActionData.SdkData.Use3DS1.class)
    public abstract PaymentAuthenticator<StripeIntent> binds3DS1Authenticator(WebIntentAuthenticator webIntentAuthenticator);

    @IntentAuthenticatorMap
    @Binds
    @IntentAuthenticatorKey(StripeIntent.NextActionData.AlipayRedirect.class)
    public abstract PaymentAuthenticator<StripeIntent> bindsAlipayRedirectAuthenticator(WebIntentAuthenticator webIntentAuthenticator);

    @IntentAuthenticatorMap
    @Binds
    @IntentAuthenticatorKey(StripeIntent.NextActionData.CashAppRedirect.class)
    public abstract PaymentAuthenticator<StripeIntent> bindsCashAppRedirectAuthenticator(WebIntentAuthenticator webIntentAuthenticator);

    @IntentAuthenticatorMap
    @Binds
    @IntentAuthenticatorKey(StripeIntent.NextActionData.DisplayOxxoDetails.class)
    public abstract PaymentAuthenticator<StripeIntent> bindsOxxoAuthenticator(OxxoAuthenticator oxxoAuthenticator);

    @IntentAuthenticatorMap
    @Binds
    @IntentAuthenticatorKey(StripeIntent.NextActionData.RedirectToUrl.class)
    public abstract PaymentAuthenticator<StripeIntent> bindsRedirectAuthenticator(WebIntentAuthenticator webIntentAuthenticator);
}
