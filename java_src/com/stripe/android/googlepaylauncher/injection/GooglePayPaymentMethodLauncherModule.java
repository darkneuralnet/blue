package com.stripe.android.googlepaylauncher.injection;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.googlepaylauncher.DefaultGooglePayRepository;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import com.stripe.android.googlepaylauncher.GooglePayRepository;
import com.stripe.android.googlepaylauncher.PaymentsClientFactory;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H'¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherModule;", "", "()V", "bindsGooglePayRepository", "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;", "defaultGooglePayRepository", "Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@Module(subcomponents = {GooglePayPaymentMethodLauncherViewModelSubcomponent.class})
/* loaded from: classes7.dex */
public abstract class GooglePayPaymentMethodLauncherModule {
    public static final Companion Companion = new Companion(null);

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherModule$Companion;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;", "googlePayConfig", "Lcom/stripe/android/googlepaylauncher/PaymentsClientFactory;", "paymentsClientFactory", "LEP3;", "providePaymentsClient", "<init>", "()V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Provides
        public final EP3 providePaymentsClient(Context context, GooglePayPaymentMethodLauncher.Config googlePayConfig, PaymentsClientFactory paymentsClientFactory) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(googlePayConfig, "googlePayConfig");
            Intrinsics.checkNotNullParameter(paymentsClientFactory, "paymentsClientFactory");
            return paymentsClientFactory.create(googlePayConfig.getEnvironment());
        }

        private Companion() {
        }
    }

    @Binds
    public abstract GooglePayRepository bindsGooglePayRepository(DefaultGooglePayRepository defaultGooglePayRepository);
}
