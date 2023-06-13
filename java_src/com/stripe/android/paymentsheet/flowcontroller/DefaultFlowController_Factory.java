package com.stripe.android.paymentsheet.flowcontroller;

import com.stripe.android.IntentConfirmationInterceptor;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherFactory;
import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncherAssistedFactory;
import com.stripe.android.paymentsheet.PaymentOptionCallback;
import com.stripe.android.paymentsheet.PaymentSheetResultCallback;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.model.PaymentOptionFactory;
import java.util.Set;
import kotlin.jvm.functions.Function0;
/* loaded from: classes7.dex */
public final class DefaultFlowController_Factory implements InterfaceC48812sj1<DefaultFlowController> {
    private final Y94<InterfaceC29050u5> activityResultCallerProvider;
    private final Y94<FlowControllerConfigurationHandler> configurationHandlerProvider;
    private final Y94<Boolean> enableLoggingProvider;
    private final Y94<EventReporter> eventReporterProvider;
    private final Y94<GooglePayPaymentMethodLauncherFactory> googlePayPaymentMethodLauncherFactoryProvider;
    private final Y94<String> injectorKeyProvider;
    private final Y94<IntentConfirmationInterceptor> intentConfirmationInterceptorProvider;
    private final Y94<PaymentConfiguration> lazyPaymentConfigurationProvider;
    private final Y94<LifecycleOwner> lifecycleOwnerProvider;
    private final Y94<ZC0> lifecycleScopeProvider;
    private final Y94<LinkPaymentLauncher> linkLauncherProvider;
    private final Y94<StripePaymentLauncherAssistedFactory> paymentLauncherFactoryProvider;
    private final Y94<PaymentOptionCallback> paymentOptionCallbackProvider;
    private final Y94<PaymentOptionFactory> paymentOptionFactoryProvider;
    private final Y94<PaymentSheetResultCallback> paymentResultCallbackProvider;
    private final Y94<Set<String>> productUsageProvider;
    private final Y94<Function0<Integer>> statusBarColorProvider;
    private final Y94<FlowControllerViewModel> viewModelProvider;

    public DefaultFlowController_Factory(Y94<ZC0> y94, Y94<LifecycleOwner> y942, Y94<Function0<Integer>> y943, Y94<PaymentOptionFactory> y944, Y94<PaymentOptionCallback> y945, Y94<PaymentSheetResultCallback> y946, Y94<InterfaceC29050u5> y947, Y94<String> y948, Y94<EventReporter> y949, Y94<FlowControllerViewModel> y9410, Y94<StripePaymentLauncherAssistedFactory> y9411, Y94<PaymentConfiguration> y9412, Y94<Boolean> y9413, Y94<Set<String>> y9414, Y94<GooglePayPaymentMethodLauncherFactory> y9415, Y94<LinkPaymentLauncher> y9416, Y94<FlowControllerConfigurationHandler> y9417, Y94<IntentConfirmationInterceptor> y9418) {
        this.lifecycleScopeProvider = y94;
        this.lifecycleOwnerProvider = y942;
        this.statusBarColorProvider = y943;
        this.paymentOptionFactoryProvider = y944;
        this.paymentOptionCallbackProvider = y945;
        this.paymentResultCallbackProvider = y946;
        this.activityResultCallerProvider = y947;
        this.injectorKeyProvider = y948;
        this.eventReporterProvider = y949;
        this.viewModelProvider = y9410;
        this.paymentLauncherFactoryProvider = y9411;
        this.lazyPaymentConfigurationProvider = y9412;
        this.enableLoggingProvider = y9413;
        this.productUsageProvider = y9414;
        this.googlePayPaymentMethodLauncherFactoryProvider = y9415;
        this.linkLauncherProvider = y9416;
        this.configurationHandlerProvider = y9417;
        this.intentConfirmationInterceptorProvider = y9418;
    }

    public static DefaultFlowController_Factory create(Y94<ZC0> y94, Y94<LifecycleOwner> y942, Y94<Function0<Integer>> y943, Y94<PaymentOptionFactory> y944, Y94<PaymentOptionCallback> y945, Y94<PaymentSheetResultCallback> y946, Y94<InterfaceC29050u5> y947, Y94<String> y948, Y94<EventReporter> y949, Y94<FlowControllerViewModel> y9410, Y94<StripePaymentLauncherAssistedFactory> y9411, Y94<PaymentConfiguration> y9412, Y94<Boolean> y9413, Y94<Set<String>> y9414, Y94<GooglePayPaymentMethodLauncherFactory> y9415, Y94<LinkPaymentLauncher> y9416, Y94<FlowControllerConfigurationHandler> y9417, Y94<IntentConfirmationInterceptor> y9418) {
        return new DefaultFlowController_Factory(y94, y942, y943, y944, y945, y946, y947, y948, y949, y9410, y9411, y9412, y9413, y9414, y9415, y9416, y9417, y9418);
    }

    public static DefaultFlowController newInstance(ZC0 zc0, LifecycleOwner lifecycleOwner, Function0<Integer> function0, PaymentOptionFactory paymentOptionFactory, PaymentOptionCallback paymentOptionCallback, PaymentSheetResultCallback paymentSheetResultCallback, InterfaceC29050u5 interfaceC29050u5, String str, EventReporter eventReporter, FlowControllerViewModel flowControllerViewModel, StripePaymentLauncherAssistedFactory stripePaymentLauncherAssistedFactory, Y94<PaymentConfiguration> y94, boolean z, Set<String> set, GooglePayPaymentMethodLauncherFactory googlePayPaymentMethodLauncherFactory, LinkPaymentLauncher linkPaymentLauncher, FlowControllerConfigurationHandler flowControllerConfigurationHandler, IntentConfirmationInterceptor intentConfirmationInterceptor) {
        return new DefaultFlowController(zc0, lifecycleOwner, function0, paymentOptionFactory, paymentOptionCallback, paymentSheetResultCallback, interfaceC29050u5, str, eventReporter, flowControllerViewModel, stripePaymentLauncherAssistedFactory, y94, z, set, googlePayPaymentMethodLauncherFactory, linkPaymentLauncher, flowControllerConfigurationHandler, intentConfirmationInterceptor);
    }

    @Override // p000.Y94
    public DefaultFlowController get() {
        return newInstance(this.lifecycleScopeProvider.get(), this.lifecycleOwnerProvider.get(), this.statusBarColorProvider.get(), this.paymentOptionFactoryProvider.get(), this.paymentOptionCallbackProvider.get(), this.paymentResultCallbackProvider.get(), this.activityResultCallerProvider.get(), this.injectorKeyProvider.get(), this.eventReporterProvider.get(), this.viewModelProvider.get(), this.paymentLauncherFactoryProvider.get(), this.lazyPaymentConfigurationProvider, this.enableLoggingProvider.get().booleanValue(), this.productUsageProvider.get(), this.googlePayPaymentMethodLauncherFactoryProvider.get(), this.linkLauncherProvider.get(), this.configurationHandlerProvider.get(), this.intentConfirmationInterceptorProvider.get());
    }
}
