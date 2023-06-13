package com.stripe.android.paymentsheet.injection;

import android.app.Application;
import android.content.Context;
import com.stripe.android.DefaultIntentConfirmationInterceptor;
import com.stripe.android.IntentConfirmationInterceptor;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PrefsRepository;
import com.stripe.android.paymentsheet.analytics.DefaultEventReporter;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.repositories.CustomerApiRepository;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import com.stripe.android.paymentsheet.repositories.ElementsSessionRepository;
import com.stripe.android.paymentsheet.state.DefaultLinkAccountStatusProvider;
import com.stripe.android.paymentsheet.state.DefaultPaymentSheetLoader;
import com.stripe.android.paymentsheet.state.LinkAccountStatusProvider;
import com.stripe.android.paymentsheet.state.PaymentSheetLoader;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH'J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0011H'J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u0014H'J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0017H'¨\u0006\u0019"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/injection/PaymentSheetCommonModule;", "", "()V", "bindsCustomerRepository", "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;", "repository", "Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;", "bindsEventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;", "bindsIntentConfirmationInterceptor", "Lcom/stripe/android/IntentConfirmationInterceptor;", "impl", "Lcom/stripe/android/DefaultIntentConfirmationInterceptor;", "bindsLinkAccountStatusProvider", "Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;", "Lcom/stripe/android/paymentsheet/state/DefaultLinkAccountStatusProvider;", "bindsPaymentSheetLoader", "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader;", "Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;", "bindsStripeIntentRepository", "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;", "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api;", "Companion", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@Module
/* loaded from: classes7.dex */
public abstract class PaymentSheetCommonModule {
    public static final Companion Companion = new Companion(null);

    @Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0007J\u001e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0007J\b\u0010\r\u001a\u00020\fH\u0007J(\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000eH\u0007J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0017"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/injection/PaymentSheetCommonModule$Companion;", "", "Landroid/content/Context;", "appContext", "Lcom/stripe/android/PaymentConfiguration;", "providePaymentConfiguration", "LY94;", "paymentConfiguration", "Lkotlin/Function0;", "", "providePublishableKey", "provideStripeAccountId", "", "provideEnabledLogging", "Lkotlin/coroutines/CoroutineContext;", "workContext", "Lkotlin/Function1;", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "Lcom/stripe/android/paymentsheet/PrefsRepository;", "providePrefsRepositoryFactory", "provideAppName", "<init>", "()V", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Provides
        public final String provideAppName(Context appContext) {
            Intrinsics.checkNotNullParameter(appContext, "appContext");
            Application application = (Application) appContext;
            return application.getApplicationInfo().loadLabel(application.getPackageManager()).toString();
        }

        @Provides
        public final boolean provideEnabledLogging() {
            return false;
        }

        @Provides
        public final PaymentConfiguration providePaymentConfiguration(Context appContext) {
            Intrinsics.checkNotNullParameter(appContext, "appContext");
            return PaymentConfiguration.Companion.getInstance(appContext);
        }

        @Provides
        public final Function1<PaymentSheet.CustomerConfiguration, PrefsRepository> providePrefsRepositoryFactory(Context appContext, @IOContext CoroutineContext workContext) {
            Intrinsics.checkNotNullParameter(appContext, "appContext");
            Intrinsics.checkNotNullParameter(workContext, "workContext");
            return new C19227xce022e72(appContext, workContext);
        }

        @Provides
        public final Function0<String> providePublishableKey(Y94<PaymentConfiguration> paymentConfiguration) {
            Intrinsics.checkNotNullParameter(paymentConfiguration, "paymentConfiguration");
            return new PaymentSheetCommonModule$Companion$providePublishableKey$1(paymentConfiguration);
        }

        @Provides
        public final Function0<String> provideStripeAccountId(Y94<PaymentConfiguration> paymentConfiguration) {
            Intrinsics.checkNotNullParameter(paymentConfiguration, "paymentConfiguration");
            return new PaymentSheetCommonModule$Companion$provideStripeAccountId$1(paymentConfiguration);
        }

        private Companion() {
        }
    }

    @Binds
    public abstract CustomerRepository bindsCustomerRepository(CustomerApiRepository customerApiRepository);

    @Binds
    public abstract EventReporter bindsEventReporter(DefaultEventReporter defaultEventReporter);

    @Binds
    public abstract IntentConfirmationInterceptor bindsIntentConfirmationInterceptor(DefaultIntentConfirmationInterceptor defaultIntentConfirmationInterceptor);

    @Binds
    public abstract LinkAccountStatusProvider bindsLinkAccountStatusProvider(DefaultLinkAccountStatusProvider defaultLinkAccountStatusProvider);

    @Binds
    public abstract PaymentSheetLoader bindsPaymentSheetLoader(DefaultPaymentSheetLoader defaultPaymentSheetLoader);

    @Binds
    public abstract ElementsSessionRepository bindsStripeIntentRepository(ElementsSessionRepository.Api api);
}
