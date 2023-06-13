.class public final Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;
.super Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;,
        Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$WhenMappings;,
        Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$Factory;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00e8\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0003\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001:\u0004\u00b1\u0001\u00b2\u0001B\u00ad\u0001\u0008\u0001\u0012\u0008\u0010\u009e\u0001\u001a\u00030\u009d\u0001\u0012\u0006\u0010@\u001a\u00020?\u0012\u0008\u0010\u00a0\u0001\u001a\u00030\u009f\u0001\u0012\u000c\u0010F\u001a\u0008\u0012\u0004\u0012\u00020E0D\u0012\u0006\u0010I\u001a\u00020H\u0012\u0006\u0010L\u001a\u00020K\u0012\u0006\u0010O\u001a\u00020N\u0012\u0008\u0010\u00a2\u0001\u001a\u00030\u00a1\u0001\u0012\u0008\u0010\u00a4\u0001\u001a\u00030\u00a3\u0001\u0012\u0008\u0010\u00a6\u0001\u001a\u00030\u00a5\u0001\u0012\u0006\u0010R\u001a\u00020Q\u0012\u0006\u0010U\u001a\u00020T\u0012\u0008\u0010\u00a8\u0001\u001a\u00030\u00a7\u0001\u0012\n\u0008\u0001\u0010\u00aa\u0001\u001a\u00030\u00a9\u0001\u0012\u0008\u0010\u00ac\u0001\u001a\u00030\u00ab\u0001\u0012\u0008\u0010\u00ae\u0001\u001a\u00030\u00ad\u0001\u0012\u0006\u0010X\u001a\u00020W\u00a2\u0006\u0006\u0008\u00af\u0001\u0010\u00b0\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0013\u0010\u0006\u001a\u00020\u0004H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0008H\u0002J\u0014\u0010\r\u001a\u00020\u00042\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u001a\u0010\u0014\u001a\u00020\u00042\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u000eH\u0002J\u0018\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0012\u0010\u0019\u001a\u00020\u00042\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002J\u0018\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0006\u0010\u001d\u001a\u00020\u0004J\u001c\u0010#\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001e2\u000c\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020!0 J\u0006\u0010\u0014\u001a\u00020\u0004J\u0006\u0010$\u001a\u00020\u0004J\u000e\u0010\'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%J\u0012\u0010)\u001a\u00020\u00042\u0008\u0010(\u001a\u0004\u0018\u00010\u0011H\u0016J\u0008\u0010*\u001a\u00020\u0004H\u0016J\u000e\u0010-\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+J\u0006\u0010.\u001a\u00020\u0004J\u0010\u0010/\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0017\u00104\u001a\u00020\u00042\u0006\u00101\u001a\u000200H\u0000\u00a2\u0006\u0004\u00082\u00103J\u0010\u00107\u001a\u00020\u00042\u0006\u00106\u001a\u000205H\u0016J\u0008\u00108\u001a\u00020\u0004H\u0016J\u0008\u00109\u001a\u00020\u0004H\u0016J\u001b\u0010<\u001a\u00020\u00042\n\u0008\u0001\u0010;\u001a\u0004\u0018\u00010:H\u0016\u00a2\u0006\u0004\u0008<\u0010=J\u0012\u0010<\u001a\u00020\u00042\u0008\u0010;\u001a\u0004\u0018\u00010\u000bH\u0016J\u0008\u0010>\u001a\u00020\u0004H\u0016R\u001a\u0010@\u001a\u00020?8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008@\u0010A\u001a\u0004\u0008B\u0010CR\u001a\u0010F\u001a\u0008\u0012\u0004\u0012\u00020E0D8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008F\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008I\u0010JR\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008L\u0010MR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008O\u0010PR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008R\u0010SR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008U\u0010VR\u0014\u0010X\u001a\u00020W8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008X\u0010YR\u0014\u0010[\u001a\u00020Z8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008[\u0010\\R\u001a\u0010_\u001a\u0008\u0012\u0004\u0012\u00020^0]8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008_\u0010`R \u0010b\u001a\u0008\u0012\u0004\u0012\u00020^0a8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008b\u0010c\u001a\u0004\u0008d\u0010eR(\u0010h\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010g0f8\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008h\u0010i\u0012\u0004\u0008l\u0010m\u001a\u0004\u0008j\u0010kR\"\u0010\u000f\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010n\u001a\u0004\u0008o\u0010p\"\u0004\u0008q\u0010rR\u001f\u0010t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010g0s8\u0006\u00a2\u0006\u000c\n\u0004\u0008t\u0010u\u001a\u0004\u0008v\u0010wR\u001f\u0010x\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010g0s8\u0006\u00a2\u0006\u000c\n\u0004\u0008x\u0010u\u001a\u0004\u0008y\u0010wR%\u0010{\u001a\u0004\u0018\u00010z8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0013\n\u0004\u0008{\u0010|\u001a\u0004\u0008}\u0010~\"\u0005\u0008\u007f\u0010\u0080\u0001R\u001c\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0082\u0001\u0010\u0083\u0001R)\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0000X\u0081\u0004\u00a2\u0006\u0017\n\u0006\u0008\u0085\u0001\u0010\u0086\u0001\u0012\u0005\u0008\u0089\u0001\u0010m\u001a\u0006\u0008\u0087\u0001\u0010\u0088\u0001R)\u0010\u008c\u0001\u001a\u000c\u0012\u0007\u0012\u0005\u0018\u00010\u008b\u00010\u008a\u00018\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u008c\u0001\u0010\u008d\u0001\u001a\u0006\u0008\u008e\u0001\u0010\u008f\u0001R$\u0010\u0091\u0001\u001a\t\u0012\u0005\u0012\u00030\u0090\u00010s8\u0000X\u0080\u0004\u00a2\u0006\u000e\n\u0005\u0008\u0091\u0001\u0010u\u001a\u0005\u0008\u0092\u0001\u0010wR\u001c\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0093\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0094\u0001\u0010\u0095\u0001R \u0010\u0097\u0001\u001a\u00030\u0096\u00018\u0016X\u0096D\u00a2\u0006\u0010\n\u0006\u0008\u0097\u0001\u0010\u0098\u0001\u001a\u0006\u0008\u0099\u0001\u0010\u009a\u0001R\u0018\u0010\u009c\u0001\u001a\u00030\u0096\u00018@X\u0080\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u009b\u0001\u0010\u009a\u0001\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u00b3\u0001"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;",
        "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;",
        "Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState;",
        "processingState",
        "",
        "handleLinkProcessingState",
        "loadPaymentSheetState",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;",
        "state",
        "handlePaymentSheetStateLoaded",
        "",
        "userErrorMessage",
        "resetViewState",
        "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;",
        "checkoutIdentifier",
        "startProcessing",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "paymentSelection",
        "identifier",
        "checkout",
        "clientSecret",
        "Lcom/stripe/android/model/StripeIntent;",
        "stripeIntent",
        "handleNextAction",
        "confirmPaymentSelection",
        "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;",
        "paymentResult",
        "processPayment",
        "handleLinkPressed",
        "LZC0;",
        "lifecycleScope",
        "LB5;",
        "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args;",
        "activityResultLauncher",
        "setupGooglePay",
        "checkoutWithGooglePay",
        "Lcom/stripe/android/model/ConfirmStripeIntentParams;",
        "confirmStripeIntentParams",
        "confirmStripeIntent",
        "selection",
        "handlePaymentMethodSelected",
        "clearErrorMessages",
        "Lu5;",
        "activityResultCaller",
        "registerFromActivity",
        "unregisterFromActivity",
        "onPaymentResult",
        "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result;",
        "result",
        "onGooglePayResult$paymentsheet_release",
        "(Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result;)V",
        "onGooglePayResult",
        "",
        "throwable",
        "onFatal",
        "onUserCancel",
        "onFinish",
        "",
        "error",
        "onError",
        "(Ljava/lang/Integer;)V",
        "transitionToFirstScreen",
        "Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;",
        "args",
        "Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;",
        "getArgs$paymentsheet_release",
        "()Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;",
        "Ldagger/Lazy;",
        "Lcom/stripe/android/PaymentConfiguration;",
        "lazyPaymentConfig",
        "Ldagger/Lazy;",
        "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;",
        "elementsSessionRepository",
        "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;",
        "Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;",
        "stripeIntentValidator",
        "Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;",
        "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader;",
        "paymentSheetLoader",
        "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader;",
        "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;",
        "paymentLauncherFactory",
        "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;",
        "Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherFactory;",
        "googlePayPaymentMethodLauncherFactory",
        "Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherFactory;",
        "Lcom/stripe/android/IntentConfirmationInterceptor;",
        "intentConfirmationInterceptor",
        "Lcom/stripe/android/IntentConfirmationInterceptor;",
        "Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;",
        "primaryButtonUiStateMapper",
        "Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;",
        "LBX2;",
        "Lcom/stripe/android/paymentsheet/PaymentSheetResult;",
        "_paymentSheetResult",
        "LBX2;",
        "LTy5;",
        "paymentSheetResult",
        "LTy5;",
        "getPaymentSheetResult$paymentsheet_release",
        "()LTy5;",
        "LGX2;",
        "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;",
        "viewState",
        "LGX2;",
        "getViewState$paymentsheet_release",
        "()LGX2;",
        "getViewState$paymentsheet_release$annotations",
        "()V",
        "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;",
        "getCheckoutIdentifier$paymentsheet_release",
        "()Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;",
        "setCheckoutIdentifier$paymentsheet_release",
        "(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;)V",
        "LEu1;",
        "googlePayButtonState",
        "LEu1;",
        "getGooglePayButtonState",
        "()LEu1;",
        "buyButtonState",
        "getBuyButtonState",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;",
        "newPaymentSelection",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;",
        "getNewPaymentSelection",
        "()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;",
        "setNewPaymentSelection",
        "(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;)V",
        "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher;",
        "googlePayPaymentMethodLauncher",
        "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher;",
        "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;",
        "googlePayLauncherConfig",
        "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;",
        "getGooglePayLauncherConfig$paymentsheet_release",
        "()Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;",
        "getGooglePayLauncherConfig$paymentsheet_release$annotations",
        "LtP5;",
        "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;",
        "primaryButtonUiState",
        "LtP5;",
        "getPrimaryButtonUiState",
        "()LtP5;",
        "Lcom/stripe/android/paymentsheet/state/WalletsContainerState;",
        "walletsContainerState",
        "getWalletsContainerState$paymentsheet_release",
        "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;",
        "paymentLauncher",
        "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;",
        "",
        "shouldCompleteLinkFlowInline",
        "Z",
        "getShouldCompleteLinkFlowInline",
        "()Z",
        "isProcessingPaymentIntent$paymentsheet_release",
        "isProcessingPaymentIntent",
        "Landroid/app/Application;",
        "application",
        "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
        "eventReporter",
        "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;",
        "customerRepository",
        "Lcom/stripe/android/paymentsheet/PrefsRepository;",
        "prefsRepository",
        "Lcom/stripe/android/ui/core/forms/resources/LpmRepository;",
        "lpmRepository",
        "Lcom/stripe/android/core/Logger;",
        "logger",
        "Lkotlin/coroutines/CoroutineContext;",
        "workContext",
        "Landroidx/lifecycle/p;",
        "savedStateHandle",
        "Lcom/stripe/android/paymentsheet/LinkHandler;",
        "linkHandler",
        "<init>",
        "(Landroid/app/Application;Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Ldagger/Lazy;Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lcom/stripe/android/paymentsheet/PrefsRepository;Lcom/stripe/android/ui/core/forms/resources/LpmRepository;Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherFactory;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Landroidx/lifecycle/p;Lcom/stripe/android/paymentsheet/LinkHandler;Lcom/stripe/android/IntentConfirmationInterceptor;)V",
        "CheckoutIdentifier",
        "Factory",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPaymentSheetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentSheetViewModel.kt\ncom/stripe/android/paymentsheet/PaymentSheetViewModel\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,643:1\n20#2:644\n22#2:648\n20#2:649\n22#2:653\n50#3:645\n55#3:647\n50#3:650\n55#3:652\n106#4:646\n106#4:651\n1#5:654\n*S KotlinDebug\n*F\n+ 1 PaymentSheetViewModel.kt\ncom/stripe/android/paymentsheet/PaymentSheetViewModel\n*L\n132#1:644\n132#1:648\n136#1:649\n136#1:653\n132#1:645\n132#1:647\n136#1:650\n136#1:652\n132#1:646\n136#1:651\n*E\n"
    }
.end annotation


# instance fields
.field private final _paymentSheetResult:LBX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LBX2<",
            "Lcom/stripe/android/paymentsheet/PaymentSheetResult;",
            ">;"
        }
    .end annotation
.end field

.field private final args:Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;

.field private final buyButtonState:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;",
            ">;"
        }
    .end annotation
.end field

.field private checkoutIdentifier:Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;

.field private final elementsSessionRepository:Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;

.field private final googlePayButtonState:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;",
            ">;"
        }
    .end annotation
.end field

.field private final googlePayLauncherConfig:Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;

.field private googlePayPaymentMethodLauncher:Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher;

.field private final googlePayPaymentMethodLauncherFactory:Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherFactory;

.field private final intentConfirmationInterceptor:Lcom/stripe/android/IntentConfirmationInterceptor;

.field private final lazyPaymentConfig:Ldagger/Lazy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/Lazy<",
            "Lcom/stripe/android/PaymentConfiguration;",
            ">;"
        }
    .end annotation
.end field

.field private newPaymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

.field private paymentLauncher:Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;

.field private final paymentLauncherFactory:Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;

.field private final paymentSheetLoader:Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader;

.field private final paymentSheetResult:LTy5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LTy5<",
            "Lcom/stripe/android/paymentsheet/PaymentSheetResult;",
            ">;"
        }
    .end annotation
.end field

.field private final primaryButtonUiState:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;",
            ">;"
        }
    .end annotation
.end field

.field private final primaryButtonUiStateMapper:Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;

.field private final shouldCompleteLinkFlowInline:Z

.field private final stripeIntentValidator:Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;

.field private final viewState:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;",
            ">;"
        }
    .end annotation
.end field

.field private final walletsContainerState:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Lcom/stripe/android/paymentsheet/state/WalletsContainerState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/app/Application;Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Ldagger/Lazy;Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lcom/stripe/android/paymentsheet/PrefsRepository;Lcom/stripe/android/ui/core/forms/resources/LpmRepository;Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherFactory;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Landroidx/lifecycle/p;Lcom/stripe/android/paymentsheet/LinkHandler;Lcom/stripe/android/IntentConfirmationInterceptor;)V
    .locals 18
    .param p14    # Lkotlin/coroutines/CoroutineContext;
        .annotation runtime Lcom/stripe/android/core/injection/IOContext;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Application;",
            "Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
            "Ldagger/Lazy<",
            "Lcom/stripe/android/PaymentConfiguration;",
            ">;",
            "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;",
            "Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;",
            "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader;",
            "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;",
            "Lcom/stripe/android/paymentsheet/PrefsRepository;",
            "Lcom/stripe/android/ui/core/forms/resources/LpmRepository;",
            "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;",
            "Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherFactory;",
            "Lcom/stripe/android/core/Logger;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Landroidx/lifecycle/p;",
            "Lcom/stripe/android/paymentsheet/LinkHandler;",
            "Lcom/stripe/android/IntentConfirmationInterceptor;",
            ")V"
        }
    .end annotation

    move-object/from16 v12, p0

    move-object/from16 v13, p2

    move-object/from16 v14, p3

    move-object/from16 v15, p4

    move-object/from16 v11, p5

    move-object/from16 v10, p6

    move-object/from16 v9, p7

    move-object/from16 v8, p11

    move-object/from16 v7, p12

    move-object/from16 v6, p13

    move-object/from16 v5, p16

    move-object/from16 v4, p17

    const-string v0, "application"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "args"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventReporter"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lazyPaymentConfig"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "elementsSessionRepository"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeIntentValidator"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentSheetLoader"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customerRepository"

    move-object/from16 v3, p8

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "prefsRepository"

    move-object/from16 v2, p9

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lpmRepository"

    move-object/from16 v9, p10

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentLauncherFactory"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "googlePayPaymentMethodLauncherFactory"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    move-object/from16 v6, p14

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savedStateHandle"

    move-object/from16 v9, p15

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkHandler"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intentConfirmationInterceptor"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;->getConfig$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    move-result-object v16

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/HeaderTextFactory;

    const/4 v14, 0x1

    invoke-direct {v0, v14}, Lcom/stripe/android/paymentsheet/ui/HeaderTextFactory;-><init>(Z)V

    move-object/from16 v17, v0

    move-object/from16 v0, p0

    move-object/from16 v2, v16

    move-object/from16 v3, p3

    move-object v14, v4

    move-object/from16 v4, p8

    move-object/from16 v5, p9

    move-object v14, v7

    move-object/from16 v7, p13

    move-object v14, v8

    move-object/from16 v8, p10

    move-object/from16 v14, p7

    move-object v14, v10

    move-object/from16 v10, p16

    move-object v14, v11

    move-object/from16 v11, v17

    invoke-direct/range {v0 .. v11}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;-><init>(Landroid/app/Application;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lcom/stripe/android/paymentsheet/PrefsRepository;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/Logger;Lcom/stripe/android/ui/core/forms/resources/LpmRepository;Landroidx/lifecycle/p;Lcom/stripe/android/paymentsheet/LinkHandler;Lcom/stripe/android/paymentsheet/ui/HeaderTextFactory;)V

    iput-object v13, v12, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->args:Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;

    iput-object v15, v12, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->lazyPaymentConfig:Ldagger/Lazy;

    iput-object v14, v12, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->elementsSessionRepository:Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;

    move-object/from16 v0, p6

    iput-object v0, v12, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->stripeIntentValidator:Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;

    move-object/from16 v0, p7

    iput-object v0, v12, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->paymentSheetLoader:Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader;

    move-object/from16 v0, p11

    iput-object v0, v12, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->paymentLauncherFactory:Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;

    move-object/from16 v0, p12

    iput-object v0, v12, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->googlePayPaymentMethodLauncherFactory:Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherFactory;

    move-object/from16 v0, p17

    iput-object v0, v12, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->intentConfirmationInterceptor:Lcom/stripe/android/IntentConfirmationInterceptor;

    new-instance v10, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;

    invoke-virtual/range {p0 .. p0}, Lie;->getApplication()Landroid/app/Application;

    move-result-object v1

    const-string v0, "getApplication()"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getConfig$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->isProcessingPaymentIntent$paymentsheet_release()Z

    move-result v3

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getCurrentScreen()LtP5;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getButtonsEnabled()LEu1;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getAmount$paymentsheet_release()LtP5;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getSelection$paymentsheet_release()LtP5;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getCustomPrimaryButtonUiState()LGX2;

    move-result-object v8

    new-instance v9, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$primaryButtonUiStateMapper$1;

    invoke-direct {v9, v12}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$primaryButtonUiStateMapper$1;-><init>(Ljava/lang/Object;)V

    move-object v0, v10

    invoke-direct/range {v0 .. v9}, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;-><init>(Landroid/content/Context;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;ZLEu1;LEu1;LEu1;LEu1;LEu1;Lkotlin/jvm/functions/Function0;)V

    iput-object v10, v12, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->primaryButtonUiStateMapper:Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;

    const/4 v0, 0x6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v3, v1, v2, v0, v2}, LVy5;->b(IILk30;ILjava/lang/Object;)LBX2;

    move-result-object v0

    iput-object v0, v12, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->_paymentSheetResult:LBX2;

    iput-object v0, v12, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->paymentSheetResult:LTy5;

    invoke-static {v2}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object v0

    iput-object v0, v12, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->viewState:LGX2;

    sget-object v1, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;->SheetBottomBuy:Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;

    iput-object v1, v12, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->checkoutIdentifier:Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;

    new-instance v1, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$special$$inlined$filter$1;

    invoke-direct {v1, v0, v12}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$special$$inlined$filter$1;-><init>(LEu1;Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;)V

    iput-object v1, v12, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->googlePayButtonState:LEu1;

    new-instance v1, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$special$$inlined$filter$2;

    invoke-direct {v1, v0, v12}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$special$$inlined$filter$2;-><init>(LEu1;Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;)V

    iput-object v1, v12, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->buyButtonState:LEu1;

    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;->getGooglePayConfig()Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;->getCurrencyCode()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->isProcessingPaymentIntent$paymentsheet_release()Z

    move-result v1

    if-nez v1, :cond_0

    const-string v0, "GooglePayConfiguration.currencyCode is required in order to use Google Pay when processing a Setup Intent"

    move-object/from16 v1, p13

    invoke-interface {v1, v0}, Lcom/stripe/android/core/Logger;->warning(Ljava/lang/String;)V

    move-object v1, v2

    const/4 v4, 0x1

    goto :goto_1

    :cond_0
    new-instance v1, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;->getEnvironment()Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$Environment;

    move-result-object v3

    sget-object v4, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v4, v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_1

    sget-object v3, Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;->Production:Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;

    goto :goto_0

    :cond_1
    sget-object v3, Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;->Test:Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;

    :goto_0
    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;->getCountryCode()Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getMerchantName$paymentsheet_release()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v11, 0x78

    const/4 v13, 0x0

    move-object/from16 p4, v1

    move-object/from16 p5, v3

    move-object/from16 p6, v0

    move-object/from16 p7, v5

    move/from16 p8, v6

    move-object/from16 p9, v7

    move/from16 p10, v8

    move/from16 p11, v9

    move/from16 p12, v11

    move-object/from16 p13, v13

    invoke-direct/range {p4 .. p13}, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;-><init>(Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$BillingAddressConfig;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_2
    const/4 v4, 0x1

    move-object v1, v2

    :goto_1
    iput-object v1, v12, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->googlePayLauncherConfig:Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;

    invoke-virtual {v10}, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->forCompleteFlow()LEu1;

    move-result-object v0

    invoke-static/range {p0 .. p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v1

    sget-object v3, Ljz5;->a:Ljz5$a;

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x3

    const/4 v10, 0x0

    move-object/from16 p4, v3

    move-wide/from16 p5, v5

    move-wide/from16 p7, v7

    move/from16 p9, v9

    move-object/from16 p10, v10

    invoke-static/range {p4 .. p10}, Ljz5$a;->b(Ljz5$a;JJILjava/lang/Object;)Ljz5;

    move-result-object v3

    invoke-static {v0, v1, v3, v2}, LVu1;->O(LEu1;LZC0;Ljz5;Ljava/lang/Object;)LtP5;

    move-result-object v0

    iput-object v0, v12, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->primaryButtonUiState:LtP5;

    invoke-virtual/range {p16 .. p16}, Lcom/stripe/android/paymentsheet/LinkHandler;->isLinkEnabled()LtP5;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getGooglePayState$paymentsheet_release()LtP5;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getSupportedPaymentMethodsFlow()LtP5;

    move-result-object v3

    new-instance v5, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$walletsContainerState$1;

    invoke-direct {v5, v2}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$walletsContainerState$1;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, v1, v3, v5}, LVu1;->m(LEu1;LEu1;LEu1;Lkotlin/jvm/functions/Function4;)LEu1;

    move-result-object v0

    iput-object v0, v12, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->walletsContainerState:LEu1;

    invoke-static/range {p0 .. p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v3, 0x0

    new-instance v5, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$1;

    move-object/from16 v6, p16

    invoke-direct {v5, v6, v12, v2}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$1;-><init>(Lcom/stripe/android/paymentsheet/LinkHandler;Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    move-object/from16 p4, v0

    move-object/from16 p5, v1

    move-object/from16 p6, v3

    move-object/from16 p7, v5

    move/from16 p8, v6

    move-object/from16 p9, v7

    invoke-static/range {p4 .. p9}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getConfig$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    move-result-object v0

    move-object/from16 v1, p3

    move v3, v4

    invoke-interface {v1, v0}, Lcom/stripe/android/paymentsheet/analytics/EventReporter;->onInit(Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)V

    invoke-static/range {p0 .. p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v4, 0x0

    new-instance v5, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$2;

    invoke-direct {v5, v12, v2}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$2;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v2, 0x3

    const/4 v6, 0x0

    move-object/from16 p1, v0

    move-object/from16 p2, v1

    move-object/from16 p3, v4

    move-object/from16 p4, v5

    move/from16 p5, v2

    move-object/from16 p6, v6

    invoke-static/range {p1 .. p6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    iput-boolean v3, v12, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->shouldCompleteLinkFlowInline:Z

    return-void
.end method

.method public static final synthetic access$getElementsSessionRepository$p(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;)Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->elementsSessionRepository:Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;

    return-object p0
.end method

.method public static final synthetic access$getIntentConfirmationInterceptor$p(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;)Lcom/stripe/android/IntentConfirmationInterceptor;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->intentConfirmationInterceptor:Lcom/stripe/android/IntentConfirmationInterceptor;

    return-object p0
.end method

.method public static final synthetic access$getLazyPaymentConfig$p(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;)Ldagger/Lazy;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->lazyPaymentConfig:Ldagger/Lazy;

    return-object p0
.end method

.method public static final synthetic access$getPaymentSheetLoader$p(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;)Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->paymentSheetLoader:Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader;

    return-object p0
.end method

.method public static final synthetic access$get_paymentSheetResult$p(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;)LBX2;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->_paymentSheetResult:LBX2;

    return-object p0
.end method

.method public static final synthetic access$handleLinkProcessingState(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->handleLinkProcessingState(Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState;)V

    return-void
.end method

.method public static final synthetic access$handleNextAction(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->handleNextAction(Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;)V

    return-void
.end method

.method public static final synthetic access$loadPaymentSheetState(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->loadPaymentSheetState(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$processPayment(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->processPayment(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V

    return-void
.end method

.method private final checkout(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;)V
    .locals 3

    invoke-direct {p0, p2}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->startProcessing(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;)V

    instance-of p2, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;

    if-eqz p2, :cond_6

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getStripeIntent$paymentsheet_release()LtP5;

    move-result-object p1

    invoke-interface {p1}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/model/StripeIntent;

    if-eqz p1, :cond_7

    iget-object p2, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->googlePayPaymentMethodLauncher:Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher;

    if-eqz p2, :cond_7

    instance-of v0, p1, Lcom/stripe/android/model/PaymentIntent;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v2, p1

    check-cast v2, Lcom/stripe/android/model/PaymentIntent;

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lcom/stripe/android/model/PaymentIntent;->getCurrency()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_3

    :cond_1
    iget-object v2, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->args:Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;->getGooglePayConfig()Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;->getCurrencyCode()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_2
    move-object v2, v1

    :goto_1
    if-nez v2, :cond_3

    const-string v2, ""

    :cond_3
    if-eqz v0, :cond_4

    move-object v1, p1

    check-cast v1, Lcom/stripe/android/model/PaymentIntent;

    :cond_4
    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lcom/stripe/android/model/PaymentIntent;->getAmount()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    long-to-int v0, v0

    goto :goto_2

    :cond_5
    const/4 v0, 0x0

    :goto_2
    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v2, v0, p1}, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher;->present(Ljava/lang/String;ILjava/lang/String;)V

    goto :goto_3

    :cond_6
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->confirmPaymentSelection(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V

    :cond_7
    :goto_3
    return-void
.end method

.method private final confirmPaymentSelection(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V
    .locals 6

    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$confirmPaymentSelection$1;

    const/4 v4, 0x0

    invoke-direct {v3, p0, p1, v4}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$confirmPaymentSelection$1;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public static synthetic getGooglePayLauncherConfig$paymentsheet_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getViewState$paymentsheet_release$annotations()V
    .locals 0

    return-void
.end method

.method private final handleLinkProcessingState(Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState;)V
    .locals 3

    sget-object v0, Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Cancelled;->INSTANCE:Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Cancelled;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->_paymentSheetResult:LBX2;

    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheetResult$Canceled;->INSTANCE:Lcom/stripe/android/paymentsheet/PaymentSheetResult$Canceled;

    invoke-interface {p1, v0}, LBX2;->b(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_0
    sget-object v0, Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Completed;->INSTANCE:Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Completed;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getEventReporter$paymentsheet_release()Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    move-result-object p1

    sget-object v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;->INSTANCE:Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getStripeIntent$paymentsheet_release()LtP5;

    move-result-object v2

    invoke-interface {v2}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/model/StripeIntent;

    if-eqz v2, :cond_1

    invoke-static {v2}, Lcom/stripe/android/paymentsheet/model/IntentKt;->getCurrency(Lcom/stripe/android/model/StripeIntent;)Ljava/lang/String;

    move-result-object v1

    :cond_1
    invoke-interface {p1, v0, v1}, Lcom/stripe/android/paymentsheet/analytics/EventReporter;->onPaymentSuccess(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getPrefsRepository()Lcom/stripe/android/paymentsheet/PrefsRepository;

    move-result-object p1

    invoke-interface {p1, v0}, Lcom/stripe/android/paymentsheet/PrefsRepository;->savePaymentSelection(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->_paymentSheetResult:LBX2;

    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheetResult$Completed;->INSTANCE:Lcom/stripe/android/paymentsheet/PaymentSheetResult$Completed;

    invoke-interface {p1, v0}, LBX2;->b(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_2
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$CompletedWithPaymentResult;

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->setContentVisible(Z)V

    check-cast p1, Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$CompletedWithPaymentResult;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$CompletedWithPaymentResult;->getResult()Lcom/stripe/android/payments/paymentlauncher/PaymentResult;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->onPaymentResult(Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V

    goto/16 :goto_0

    :cond_3
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Error;

    if-eqz v0, :cond_4

    check-cast p1, Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Error;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Error;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->onError(Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    sget-object v0, Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Launched;->INSTANCE:Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Launched;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->setContentVisible(Z)V

    sget-object p1, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;->SheetBottomBuy:Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->startProcessing(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;)V

    goto :goto_0

    :cond_5
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$PaymentDetailsCollected;

    if-eqz v0, :cond_7

    check-cast p1, Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$PaymentDetailsCollected;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$PaymentDetailsCollected;->getDetails()Lcom/stripe/android/link/LinkPaymentDetails$New;

    move-result-object p1

    if-eqz p1, :cond_6

    new-instance v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;

    invoke-direct {v0, p1}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;-><init>(Lcom/stripe/android/link/LinkPaymentDetails$New;)V

    invoke-virtual {p0, v0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->updateSelection(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getSelection$paymentsheet_release()LtP5;

    move-result-object p1

    invoke-interface {p1}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;->SheetBottomBuy:Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;

    invoke-direct {p0, p1, v0}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->checkout(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;)V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_6
    if-nez v1, :cond_9

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getSelection$paymentsheet_release()LtP5;

    move-result-object p1

    invoke-interface {p1}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;->SheetBottomBuy:Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;

    invoke-direct {p0, p1, v0}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->checkout(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;)V

    goto :goto_0

    :cond_7
    sget-object v0, Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Ready;->INSTANCE:Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Ready;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    sget-object p1, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$Ready;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$Ready;

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->updatePrimaryButtonState(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;)V

    goto :goto_0

    :cond_8
    sget-object v0, Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Started;->INSTANCE:Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Started;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    sget-object p1, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$StartProcessing;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$StartProcessing;

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->updatePrimaryButtonState(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;)V

    :cond_9
    :goto_0
    return-void
.end method

.method private final handleNextAction(Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;)V
    .locals 2

    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->paymentLauncher:Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "Required value was null."

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_2

    check-cast v0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;

    instance-of v1, p2, Lcom/stripe/android/model/PaymentIntent;

    if-eqz v1, :cond_1

    invoke-virtual {v0, p1}, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->handleNextActionForPaymentIntent(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    instance-of p2, p2, Lcom/stripe/android/model/SetupIntent;

    if-eqz p2, :cond_3

    invoke-virtual {v0, p1}, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->handleNextActionForSetupIntent(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    invoke-virtual {p0, v1}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->onFatal(Ljava/lang/Throwable;)V

    :cond_3
    :goto_1
    return-void
.end method

.method private final handlePaymentSheetStateLoaded(Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;)V
    .locals 3

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getLpmRepository()Lcom/stripe/android/ui/core/forms/resources/LpmRepository;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->getServerSpecLoadingState()Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState;->getServerLpmSpecs()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->setLpmServerSpec$paymentsheet_release(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getSavedStateHandle()Landroidx/lifecycle/p;

    move-result-object v0

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->getCustomerPaymentMethods()Ljava/util/List;

    move-result-object v1

    const-string v2, "customer_payment_methods"

    invoke-virtual {v0, v2, v1}, Landroidx/lifecycle/p;->m(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getSavedStateHandle()Landroidx/lifecycle/p;

    move-result-object v0

    const-string v1, "saved_selection"

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->getSavedSelection()Lcom/stripe/android/paymentsheet/model/SavedSelection;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroidx/lifecycle/p;->m(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getSavedStateHandle()Landroidx/lifecycle/p;

    move-result-object v0

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->isGooglePayReady()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/stripe/android/paymentsheet/state/GooglePayState$Available;->INSTANCE:Lcom/stripe/android/paymentsheet/state/GooglePayState$Available;

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/stripe/android/paymentsheet/state/GooglePayState$NotAvailable;->INSTANCE:Lcom/stripe/android/paymentsheet/state/GooglePayState$NotAvailable;

    :goto_0
    const-string v2, "google_pay_state"

    invoke-virtual {v0, v2, v1}, Landroidx/lifecycle/p;->m(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->setStripeIntent(Lcom/stripe/android/model/StripeIntent;)V

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->getLinkState()Lcom/stripe/android/paymentsheet/state/LinkState;

    move-result-object p1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getLinkHandler()Lcom/stripe/android/paymentsheet/LinkHandler;

    move-result-object v0

    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/stripe/android/paymentsheet/LinkHandler;->setupLinkLaunchingEagerly(LZC0;Lcom/stripe/android/paymentsheet/state/LinkState;)V

    const/4 p1, 0x1

    const/4 v0, 0x0

    invoke-static {p0, v0, p1, v0}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->resetViewState$default(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->transitionToFirstScreen()V

    return-void
.end method

.method private final loadPaymentSheetState(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$loadPaymentSheetState$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$loadPaymentSheetState$1;

    iget v1, v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$loadPaymentSheetState$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$loadPaymentSheetState$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$loadPaymentSheetState$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$loadPaymentSheetState$1;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$loadPaymentSheetState$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$loadPaymentSheetState$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v0, v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$loadPaymentSheetState$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getWorkContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object p1

    new-instance v2, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$loadPaymentSheetState$result$1;

    invoke-direct {v2, p0, v3}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$loadPaymentSheetState$result$1;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;Lkotlin/coroutines/Continuation;)V

    iput-object p0, v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$loadPaymentSheetState$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$loadPaymentSheetState$1;->label:I

    invoke-static {p1, v2, v0}, LX30;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    check-cast p1, Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result;

    instance-of v1, p1, Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result$Success;

    if-eqz v1, :cond_4

    check-cast p1, Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result$Success;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result$Success;->getState()Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->handlePaymentSheetStateLoaded(Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;)V

    goto :goto_2

    :cond_4
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result$Failure;

    if-eqz v1, :cond_5

    invoke-virtual {v0, v3}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->setStripeIntent(Lcom/stripe/android/model/StripeIntent;)V

    check-cast p1, Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result$Failure;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result$Failure;->getThrowable()Ljava/lang/Throwable;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->onFatal(Ljava/lang/Throwable;)V

    :cond_5
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method private final processPayment(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V
    .locals 5

    instance-of v0, p2, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Completed;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getEventReporter$paymentsheet_release()Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    move-result-object p2

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getSelection$paymentsheet_release()LtP5;

    move-result-object v0

    invoke-interface {v0}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    invoke-static {p1}, Lcom/stripe/android/paymentsheet/model/IntentKt;->getCurrency(Lcom/stripe/android/model/StripeIntent;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2, v0, v2}, Lcom/stripe/android/paymentsheet/analytics/EventReporter;->onPaymentSuccess(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getSelection$paymentsheet_release()LtP5;

    move-result-object p2

    invoke-interface {p2}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    instance-of v0, p2, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;

    if-eqz v0, :cond_0

    sget-object p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;->INSTANCE:Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;

    goto :goto_0

    :cond_0
    instance-of p2, p2, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    if-eqz p2, :cond_2

    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object p1

    if-eqz p1, :cond_1

    new-instance p2, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    const/4 v0, 0x0

    const/4 v2, 0x2

    invoke-direct {p2, p1, v0, v2, v1}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;-><init>(Lcom/stripe/android/model/PaymentMethod;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, p2

    :cond_1
    move-object p1, v1

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getSelection$paymentsheet_release()LtP5;

    move-result-object p1

    invoke-interface {p1}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    :goto_0
    if-eqz p1, :cond_3

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getPrefsRepository()Lcom/stripe/android/paymentsheet/PrefsRepository;

    move-result-object p2

    invoke-interface {p2, p1}, Lcom/stripe/android/paymentsheet/PrefsRepository;->savePaymentSelection(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V

    :cond_3
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->viewState:LGX2;

    new-instance p2, Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$FinishProcessing;

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$processPayment$3;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$processPayment$3;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;)V

    invoke-direct {p2, v0}, Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$FinishProcessing;-><init>(Lkotlin/jvm/functions/Function0;)V

    invoke-interface {p1, p2}, LGX2;->setValue(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    instance-of v0, p2, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Failed;

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getEventReporter$paymentsheet_release()Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    move-result-object v2

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getSelection$paymentsheet_release()LtP5;

    move-result-object v3

    invoke-interface {v3}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    invoke-static {p1}, Lcom/stripe/android/paymentsheet/model/IntentKt;->getCurrency(Lcom/stripe/android/model/StripeIntent;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Lcom/stripe/android/paymentsheet/analytics/EventReporter;->onPaymentFailure(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljava/lang/String;)V

    :cond_5
    :try_start_0
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->stripeIntentValidator:Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;

    invoke-virtual {v2, p1}, Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;->requireValid(Lcom/stripe/android/model/StripeIntent;)Lcom/stripe/android/model/StripeIntent;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_1
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_7

    check-cast p1, Lcom/stripe/android/model/StripeIntent;

    if-eqz v0, :cond_6

    check-cast p2, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Failed;

    invoke-virtual {p2}, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Failed;->getThrowable()Ljava/lang/Throwable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v1

    :cond_6
    invoke-direct {p0, v1}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->resetViewState(Ljava/lang/String;)V

    goto :goto_2

    :cond_7
    invoke-virtual {p0, v2}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->onFatal(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method

.method private final resetViewState(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->viewState:LGX2;

    if-eqz p1, :cond_0

    new-instance v1, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$UserErrorMessage;

    invoke-direct {v1, p1}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$UserErrorMessage;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    new-instance p1, Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$Reset;

    invoke-direct {p1, v1}, Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$Reset;-><init>(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$UserErrorMessage;)V

    invoke-interface {v0, p1}, LGX2;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getSavedStateHandle()Landroidx/lifecycle/p;

    move-result-object p1

    const-string v0, "processing"

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0, v1}, Landroidx/lifecycle/p;->m(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic resetViewState$default(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->resetViewState(Ljava/lang/String;)V

    return-void
.end method

.method private final startProcessing(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;)V
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->checkoutIdentifier:Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;

    if-eq v0, p1, :cond_0

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->viewState:LGX2;

    new-instance v1, Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$Reset;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v1, v3, v2, v3}, Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$Reset;-><init>(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$UserErrorMessage;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, LGX2;->setValue(Ljava/lang/Object;)V

    :cond_0
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->checkoutIdentifier:Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getSavedStateHandle()Landroidx/lifecycle/p;

    move-result-object p1

    const-string v0, "processing"

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0, v1}, Landroidx/lifecycle/p;->m(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->viewState:LGX2;

    sget-object v0, Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$StartProcessing;->INSTANCE:Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$StartProcessing;

    invoke-interface {p1, v0}, LGX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final checkout()V
    .locals 2

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getSelection$paymentsheet_release()LtP5;

    move-result-object v0

    invoke-interface {v0}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    sget-object v1, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;->SheetBottomBuy:Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;

    invoke-direct {p0, v0, v1}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->checkout(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;)V

    return-void
.end method

.method public final checkoutWithGooglePay()V
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->setContentVisible(Z)V

    sget-object v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;->INSTANCE:Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;

    sget-object v1, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;->SheetTopGooglePay:Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;

    invoke-direct {p0, v0, v1}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->checkout(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;)V

    return-void
.end method

.method public clearErrorMessages()V
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->viewState:LGX2;

    invoke-interface {v0}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$Reset;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->viewState:LGX2;

    new-instance v1, Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$Reset;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$Reset;-><init>(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$UserErrorMessage;)V

    invoke-interface {v0, v1}, LGX2;->setValue(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final confirmStripeIntent(Lcom/stripe/android/model/ConfirmStripeIntentParams;)V
    .locals 2

    const-string v0, "confirmStripeIntentParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->paymentLauncher:Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "Required value was null."

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_2

    check-cast v0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;

    instance-of v1, p1, Lcom/stripe/android/model/ConfirmPaymentIntentParams;

    if-eqz v1, :cond_1

    check-cast p1, Lcom/stripe/android/model/ConfirmPaymentIntentParams;

    invoke-virtual {v0, p1}, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->confirm(Lcom/stripe/android/model/ConfirmPaymentIntentParams;)V

    goto :goto_1

    :cond_1
    instance-of v1, p1, Lcom/stripe/android/model/ConfirmSetupIntentParams;

    if-eqz v1, :cond_3

    check-cast p1, Lcom/stripe/android/model/ConfirmSetupIntentParams;

    invoke-virtual {v0, p1}, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->confirm(Lcom/stripe/android/model/ConfirmSetupIntentParams;)V

    goto :goto_1

    :cond_2
    invoke-virtual {p0, v1}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->onFatal(Ljava/lang/Throwable;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public final getArgs$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->args:Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;

    return-object v0
.end method

.method public final getBuyButtonState()LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->buyButtonState:LEu1;

    return-object v0
.end method

.method public final getCheckoutIdentifier$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->checkoutIdentifier:Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;

    return-object v0
.end method

.method public final getGooglePayButtonState()LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->googlePayButtonState:LEu1;

    return-object v0
.end method

.method public final getGooglePayLauncherConfig$paymentsheet_release()Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->googlePayLauncherConfig:Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;

    return-object v0
.end method

.method public getNewPaymentSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->newPaymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    return-object v0
.end method

.method public final getPaymentSheetResult$paymentsheet_release()LTy5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LTy5<",
            "Lcom/stripe/android/paymentsheet/PaymentSheetResult;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->paymentSheetResult:LTy5;

    return-object v0
.end method

.method public getPrimaryButtonUiState()LtP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->primaryButtonUiState:LtP5;

    return-object v0
.end method

.method public getShouldCompleteLinkFlowInline()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->shouldCompleteLinkFlowInline:Z

    return v0
.end method

.method public final getViewState$paymentsheet_release()LGX2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LGX2<",
            "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->viewState:LGX2;

    return-object v0
.end method

.method public final getWalletsContainerState$paymentsheet_release()LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Lcom/stripe/android/paymentsheet/state/WalletsContainerState;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->walletsContainerState:LEu1;

    return-object v0
.end method

.method public final handleLinkPressed()V
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getLinkHandler()Lcom/stripe/android/paymentsheet/LinkHandler;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/LinkHandler;->launchLink()V

    return-void
.end method

.method public handlePaymentMethodSelected(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getEditing$paymentsheet_release()LtP5;

    move-result-object v0

    invoke-interface {v0}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getSelection$paymentsheet_release()LtP5;

    move-result-object v0

    invoke-interface {v0}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->updateSelection(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V

    :cond_0
    return-void
.end method

.method public final isProcessingPaymentIntent$paymentsheet_release()Z
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->args:Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;->getInitializationMode$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModelKt;->access$isProcessingPayment(Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;)Z

    move-result v0

    return v0
.end method

.method public onError(Ljava/lang/Integer;)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0}, Lie;->getApplication()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->onError(Ljava/lang/String;)V

    return-void
.end method

.method public onError(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->resetViewState(Ljava/lang/String;)V

    return-void
.end method

.method public onFatal(Ljava/lang/Throwable;)V
    .locals 2

    const-string v0, "throwable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getLogger()Lcom/stripe/android/core/Logger;

    move-result-object v0

    const-string v1, "Payment Sheet error"

    invoke-interface {v0, v1, p1}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->setMostRecentError(Ljava/lang/Throwable;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->_paymentSheetResult:LBX2;

    new-instance v1, Lcom/stripe/android/paymentsheet/PaymentSheetResult$Failed;

    invoke-direct {v1, p1}, Lcom/stripe/android/paymentsheet/PaymentSheetResult$Failed;-><init>(Ljava/lang/Throwable;)V

    invoke-interface {v0, v1}, LBX2;->b(Ljava/lang/Object;)Z

    return-void
.end method

.method public onFinish()V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->_paymentSheetResult:LBX2;

    sget-object v1, Lcom/stripe/android/paymentsheet/PaymentSheetResult$Completed;->INSTANCE:Lcom/stripe/android/paymentsheet/PaymentSheetResult$Completed;

    invoke-interface {v0, v1}, LBX2;->b(Ljava/lang/Object;)Z

    return-void
.end method

.method public final onGooglePayResult$paymentsheet_release(Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result;)V
    .locals 4

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->setContentVisible(Z)V

    instance-of v1, p1, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result$Completed;

    if-eqz v1, :cond_0

    new-instance v1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    check-cast p1, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result$Completed;

    invoke-virtual {p1}, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result$Completed;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;-><init>(Lcom/stripe/android/model/PaymentMethod;Z)V

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getSavedStateHandle()Landroidx/lifecycle/p;

    move-result-object p1

    const-string v0, "selection"

    invoke-virtual {p1, v0, v1}, Landroidx/lifecycle/p;->m(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0, v1}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->confirmPaymentSelection(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V

    goto :goto_1

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result$Failed;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getLogger()Lcom/stripe/android/core/Logger;

    move-result-object v0

    check-cast p1, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result$Failed;

    invoke-virtual {p1}, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result$Failed;->getError()Ljava/lang/Throwable;

    move-result-object v1

    const-string v3, "Error processing Google Pay payment"

    invoke-interface {v0, v3, v1}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getEventReporter$paymentsheet_release()Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    move-result-object v0

    sget-object v1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;->INSTANCE:Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getStripeIntent$paymentsheet_release()LtP5;

    move-result-object v3

    invoke-interface {v3}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/model/StripeIntent;

    if-eqz v3, :cond_1

    invoke-static {v3}, Lcom/stripe/android/paymentsheet/model/IntentKt;->getCurrency(Lcom/stripe/android/model/StripeIntent;)Ljava/lang/String;

    move-result-object v2

    :cond_1
    invoke-interface {v0, v1, v2}, Lcom/stripe/android/paymentsheet/analytics/EventReporter;->onPaymentFailure(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result$Failed;->getErrorCode()I

    move-result p1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_2

    sget p1, Lcom/stripe/android/paymentsheet/R$string;->stripe_failure_connection_error:I

    goto :goto_0

    :cond_2
    sget p1, Lcom/stripe/android/paymentsheet/R$string;->stripe_internal_error:I

    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->onError(Ljava/lang/Integer;)V

    goto :goto_1

    :cond_3
    instance-of p1, p1, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result$Canceled;

    if-eqz p1, :cond_4

    invoke-static {p0, v2, v0, v2}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->resetViewState$default(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_4
    :goto_1
    return-void
.end method

.method public onPaymentResult(Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V
    .locals 7

    const-string v0, "paymentResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$onPaymentResult$1;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$onPaymentResult$1;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;Lcom/stripe/android/payments/paymentlauncher/PaymentResult;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public onUserCancel()V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->_paymentSheetResult:LBX2;

    sget-object v1, Lcom/stripe/android/paymentsheet/PaymentSheetResult$Canceled;->INSTANCE:Lcom/stripe/android/paymentsheet/PaymentSheetResult$Canceled;

    invoke-interface {v0, v1}, LBX2;->b(Ljava/lang/Object;)Z

    return-void
.end method

.method public final registerFromActivity(Lu5;)V
    .locals 5

    const-string v0, "activityResultCaller"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getLinkHandler()Lcom/stripe/android/paymentsheet/LinkHandler;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/stripe/android/paymentsheet/LinkHandler;->registerFromActivity(Lu5;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->paymentLauncherFactory:Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;

    new-instance v1, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$registerFromActivity$1;

    invoke-direct {v1, p0}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$registerFromActivity$1;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;)V

    new-instance v2, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$registerFromActivity$2;

    invoke-direct {v2, p0}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$registerFromActivity$2;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;)V

    new-instance v3, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract;

    invoke-direct {v3}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract;-><init>()V

    new-instance v4, LBP3;

    invoke-direct {v4, p0}, LBP3;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;)V

    invoke-interface {p1, v3, v4}, Lu5;->registerForActivityResult(Lv5;Lt5;)LB5;

    move-result-object p1

    const-string v3, "activityResultCaller.reg\u2026ymentResult\n            )"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1, v2, p1}, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;->create(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LB5;)Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;

    move-result-object p1

    invoke-static {p1}, Lcom/stripe/android/paymentsheet/extensions/StripePaymentLauncherKtxKt;->registerPollingAuthenticator(Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;)V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->paymentLauncher:Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;

    return-void
.end method

.method public final setCheckoutIdentifier$paymentsheet_release(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->checkoutIdentifier:Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;

    return-void
.end method

.method public setNewPaymentSelection(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->newPaymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    return-void
.end method

.method public final setupGooglePay(LZC0;LB5;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZC0;",
            "LB5<",
            "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args;",
            ">;)V"
        }
    .end annotation

    const-string v0, "lifecycleScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityResultLauncher"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->googlePayLauncherConfig:Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;

    if-eqz v3, :cond_0

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->googlePayPaymentMethodLauncherFactory:Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherFactory;

    sget-object v4, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$setupGooglePay$1$1;->INSTANCE:Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$setupGooglePay$1$1;

    const/4 v6, 0x0

    const/16 v7, 0x10

    const/4 v8, 0x0

    move-object v2, p1

    move-object v5, p2

    invoke-static/range {v1 .. v8}, Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherFactory$DefaultImpls;->create$default(Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherFactory;LZC0;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ReadyCallback;LB5;ZILjava/lang/Object;)Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->googlePayPaymentMethodLauncher:Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher;

    :cond_0
    return-void
.end method

.method public transitionToFirstScreen()V
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getPaymentMethods$paymentsheet_release()LtP5;

    move-result-object v0

    invoke-interface {v0}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_2

    sget-object v0, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$AddFirstPaymentMethod;->INSTANCE:Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$AddFirstPaymentMethod;

    goto :goto_2

    :cond_2
    sget-object v0, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$SelectSavedPaymentMethods;->INSTANCE:Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$SelectSavedPaymentMethods;

    :goto_2
    invoke-virtual {p0, v0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->transitionTo(Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;)V

    return-void
.end method

.method public final unregisterFromActivity()V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->paymentLauncher:Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/stripe/android/paymentsheet/extensions/StripePaymentLauncherKtxKt;->unregisterPollingAuthenticator(Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->paymentLauncher:Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getLinkHandler()Lcom/stripe/android/paymentsheet/LinkHandler;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/LinkHandler;->unregisterFromActivity()V

    return-void
.end method
