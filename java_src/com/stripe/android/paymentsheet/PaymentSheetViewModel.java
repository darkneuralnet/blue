package com.stripe.android.paymentsheet;

import android.app.Application;
import androidx.lifecycle.C11747p;
import androidx.lifecycle.C11750q;
import androidx.lifecycle.C11759u;
import co.bird.android.model.LegacyRepairType;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.IntentConfirmationInterceptor;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.injection.InjectWithFallbackKt;
import com.stripe.android.core.injection.Injectable;
import com.stripe.android.core.injection.Injector;
import com.stripe.android.core.injection.InjectorKt;
import com.stripe.android.core.injection.NonFallbackInjector;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.googlepaylauncher.GooglePayEnvironment;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract;
import com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherFactory;
import com.stripe.android.link.LinkPaymentDetails;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.p049ui.core.forms.resources.LpmRepository;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherContract;
import com.stripe.android.payments.paymentlauncher.PaymentResult;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncher;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncherAssistedFactory;
import com.stripe.android.paymentsheet.LinkHandler;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PaymentSheetContractV2;
import com.stripe.android.paymentsheet.PaymentSheetResult;
import com.stripe.android.paymentsheet.PaymentSheetViewModel;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.extensions.StripePaymentLauncherKtxKt;
import com.stripe.android.paymentsheet.injection.DaggerPaymentSheetLauncherComponent;
import com.stripe.android.paymentsheet.injection.PaymentSheetLauncherComponent;
import com.stripe.android.paymentsheet.injection.PaymentSheetViewModelModule;
import com.stripe.android.paymentsheet.injection.PaymentSheetViewModelSubcomponent;
import com.stripe.android.paymentsheet.model.IntentKt;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.PaymentSheetViewState;
import com.stripe.android.paymentsheet.model.StripeIntentValidator;
import com.stripe.android.paymentsheet.navigation.PaymentSheetScreen;
import com.stripe.android.paymentsheet.p047ui.HeaderTextFactory;
import com.stripe.android.paymentsheet.p047ui.PrimaryButton;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import com.stripe.android.paymentsheet.repositories.ElementsSessionRepository;
import com.stripe.android.paymentsheet.state.GooglePayState;
import com.stripe.android.paymentsheet.state.PaymentSheetLoader;
import com.stripe.android.paymentsheet.state.PaymentSheetState;
import com.stripe.android.paymentsheet.state.WalletsContainerState;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.paymentsheet.viewmodels.PrimaryButtonUiStateMapper;
import com.stripe.android.utils.CreationExtrasKtxKt;
import dagger.Lazy;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC43640jz5;
@Metadata(m28433d1 = {"\u0000è\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0004±\u0001²\u0001B\u00ad\u0001\b\u0001\u0012\b\u0010\u009e\u0001\u001a\u00030\u009d\u0001\u0012\u0006\u0010@\u001a\u00020?\u0012\b\u0010 \u0001\u001a\u00030\u009f\u0001\u0012\f\u0010F\u001a\b\u0012\u0004\u0012\u00020E0D\u0012\u0006\u0010I\u001a\u00020H\u0012\u0006\u0010L\u001a\u00020K\u0012\u0006\u0010O\u001a\u00020N\u0012\b\u0010¢\u0001\u001a\u00030¡\u0001\u0012\b\u0010¤\u0001\u001a\u00030£\u0001\u0012\b\u0010¦\u0001\u001a\u00030¥\u0001\u0012\u0006\u0010R\u001a\u00020Q\u0012\u0006\u0010U\u001a\u00020T\u0012\b\u0010¨\u0001\u001a\u00030§\u0001\u0012\n\b\u0001\u0010ª\u0001\u001a\u00030©\u0001\u0012\b\u0010¬\u0001\u001a\u00030«\u0001\u0012\b\u0010®\u0001\u001a\u00030\u00ad\u0001\u0012\u0006\u0010X\u001a\u00020W¢\u0006\u0006\b¯\u0001\u0010°\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0013\u0010\u0006\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J\u0014\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u000eH\u0002J\u0018\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0012\u0010\u0019\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002J\u0018\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0006\u0010\u001d\u001a\u00020\u0004J\u001c\u0010#\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 J\u0006\u0010\u0014\u001a\u00020\u0004J\u0006\u0010$\u001a\u00020\u0004J\u000e\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%J\u0012\u0010)\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010*\u001a\u00020\u0004H\u0016J\u000e\u0010-\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+J\u0006\u0010.\u001a\u00020\u0004J\u0010\u0010/\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0017\u00104\u001a\u00020\u00042\u0006\u00101\u001a\u000200H\u0000¢\u0006\u0004\b2\u00103J\u0010\u00107\u001a\u00020\u00042\u0006\u00106\u001a\u000205H\u0016J\b\u00108\u001a\u00020\u0004H\u0016J\b\u00109\u001a\u00020\u0004H\u0016J\u001b\u0010<\u001a\u00020\u00042\n\b\u0001\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\b<\u0010=J\u0012\u0010<\u001a\u00020\u00042\b\u0010;\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010>\u001a\u00020\u0004H\u0016R\u001a\u0010@\u001a\u00020?8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020E0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010X\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010[\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020^0]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R \u0010b\u001a\b\u0012\u0004\u0012\u00020^0a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR(\u0010h\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010g0f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bh\u0010i\u0012\u0004\bl\u0010m\u001a\u0004\bj\u0010kR\"\u0010\u000f\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\u001f\u0010t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010g0s8\u0006¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010wR\u001f\u0010x\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010g0s8\u0006¢\u0006\f\n\u0004\bx\u0010u\u001a\u0004\by\u0010wR%\u0010{\u001a\u0004\u0018\u00010z8\u0016@\u0016X\u0096\u000e¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R\u001c\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R)\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0000X\u0081\u0004¢\u0006\u0017\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u0012\u0005\b\u0089\u0001\u0010m\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R)\u0010\u008c\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u008b\u00010\u008a\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R$\u0010\u0091\u0001\u001a\t\u0012\u0005\u0012\u00030\u0090\u00010s8\u0000X\u0080\u0004¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010u\u001a\u0005\b\u0092\u0001\u0010wR\u001c\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0093\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R \u0010\u0097\u0001\u001a\u00030\u0096\u00018\u0016X\u0096D¢\u0006\u0010\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0018\u0010\u009c\u0001\u001a\u00030\u0096\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u009b\u0001\u0010\u009a\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006³\u0001"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState;", "processingState", "", "handleLinkProcessingState", "loadPaymentSheetState", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;", TransferTable.COLUMN_STATE, "handlePaymentSheetStateLoaded", "", "userErrorMessage", "resetViewState", "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;", "checkoutIdentifier", "startProcessing", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "paymentSelection", "identifier", "checkout", "clientSecret", "Lcom/stripe/android/model/StripeIntent;", "stripeIntent", "handleNextAction", "confirmPaymentSelection", "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;", "paymentResult", "processPayment", "handleLinkPressed", "LZC0;", "lifecycleScope", "LB5;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args;", "activityResultLauncher", "setupGooglePay", "checkoutWithGooglePay", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "confirmStripeIntentParams", "confirmStripeIntent", BaseSheetViewModel.SAVE_SELECTION, "handlePaymentMethodSelected", "clearErrorMessages", "Lu5;", "activityResultCaller", "registerFromActivity", "unregisterFromActivity", "onPaymentResult", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "onGooglePayResult$paymentsheet_release", "(Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result;)V", "onGooglePayResult", "", "throwable", "onFatal", "onUserCancel", "onFinish", "", "error", "onError", "(Ljava/lang/Integer;)V", "transitionToFirstScreen", "Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;", "args", "Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;", "getArgs$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;", "Ldagger/Lazy;", "Lcom/stripe/android/PaymentConfiguration;", "lazyPaymentConfig", "Ldagger/Lazy;", "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;", "elementsSessionRepository", "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;", "Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;", "stripeIntentValidator", "Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;", "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader;", "paymentSheetLoader", "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader;", "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;", "paymentLauncherFactory", "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;", "Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherFactory;", "googlePayPaymentMethodLauncherFactory", "Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherFactory;", "Lcom/stripe/android/IntentConfirmationInterceptor;", "intentConfirmationInterceptor", "Lcom/stripe/android/IntentConfirmationInterceptor;", "Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;", "primaryButtonUiStateMapper", "Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;", "LBX2;", "Lcom/stripe/android/paymentsheet/PaymentSheetResult;", "_paymentSheetResult", "LBX2;", "LTy5;", "paymentSheetResult", "LTy5;", "getPaymentSheetResult$paymentsheet_release", "()LTy5;", "LGX2;", "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;", "viewState", "LGX2;", "getViewState$paymentsheet_release", "()LGX2;", "getViewState$paymentsheet_release$annotations", "()V", "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;", "getCheckoutIdentifier$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;", "setCheckoutIdentifier$paymentsheet_release", "(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;)V", "LEu1;", "googlePayButtonState", "LEu1;", "getGooglePayButtonState", "()LEu1;", "buyButtonState", "getBuyButtonState", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;", "newPaymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;", "getNewPaymentSelection", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;", "setNewPaymentSelection", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;)V", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher;", "googlePayPaymentMethodLauncher", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;", "googlePayLauncherConfig", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;", "getGooglePayLauncherConfig$paymentsheet_release", "()Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;", "getGooglePayLauncherConfig$paymentsheet_release$annotations", "LtP5;", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;", "primaryButtonUiState", "LtP5;", "getPrimaryButtonUiState", "()LtP5;", "Lcom/stripe/android/paymentsheet/state/WalletsContainerState;", "walletsContainerState", "getWalletsContainerState$paymentsheet_release", "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;", "paymentLauncher", "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;", "", "shouldCompleteLinkFlowInline", "Z", "getShouldCompleteLinkFlowInline", "()Z", "isProcessingPaymentIntent$paymentsheet_release", "isProcessingPaymentIntent", "Landroid/app/Application;", "application", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "eventReporter", "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;", "customerRepository", "Lcom/stripe/android/paymentsheet/PrefsRepository;", "prefsRepository", "Lcom/stripe/android/ui/core/forms/resources/LpmRepository;", "lpmRepository", "Lcom/stripe/android/core/Logger;", "logger", "Lkotlin/coroutines/CoroutineContext;", "workContext", "Landroidx/lifecycle/p;", "savedStateHandle", "Lcom/stripe/android/paymentsheet/LinkHandler;", "linkHandler", "<init>", "(Landroid/app/Application;Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Ldagger/Lazy;Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lcom/stripe/android/paymentsheet/PrefsRepository;Lcom/stripe/android/ui/core/forms/resources/LpmRepository;Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherFactory;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Landroidx/lifecycle/p;Lcom/stripe/android/paymentsheet/LinkHandler;Lcom/stripe/android/IntentConfirmationInterceptor;)V", "CheckoutIdentifier", "Factory", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPaymentSheetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentSheetViewModel.kt\ncom/stripe/android/paymentsheet/PaymentSheetViewModel\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,643:1\n20#2:644\n22#2:648\n20#2:649\n22#2:653\n50#3:645\n55#3:647\n50#3:650\n55#3:652\n106#4:646\n106#4:651\n1#5:654\n*S KotlinDebug\n*F\n+ 1 PaymentSheetViewModel.kt\ncom/stripe/android/paymentsheet/PaymentSheetViewModel\n*L\n132#1:644\n132#1:648\n136#1:649\n136#1:653\n132#1:645\n132#1:647\n136#1:650\n136#1:652\n132#1:646\n136#1:651\n*E\n"})
/* loaded from: classes7.dex */
public final class PaymentSheetViewModel extends BaseSheetViewModel {
    private final BX2<PaymentSheetResult> _paymentSheetResult;
    private final PaymentSheetContractV2.Args args;
    private final InterfaceC32730Eu1<PaymentSheetViewState> buyButtonState;
    private CheckoutIdentifier checkoutIdentifier;
    private final ElementsSessionRepository elementsSessionRepository;
    private final InterfaceC32730Eu1<PaymentSheetViewState> googlePayButtonState;
    private final GooglePayPaymentMethodLauncher.Config googlePayLauncherConfig;
    private GooglePayPaymentMethodLauncher googlePayPaymentMethodLauncher;
    private final GooglePayPaymentMethodLauncherFactory googlePayPaymentMethodLauncherFactory;
    private final IntentConfirmationInterceptor intentConfirmationInterceptor;
    private final Lazy<PaymentConfiguration> lazyPaymentConfig;
    private PaymentSelection.New newPaymentSelection;
    private StripePaymentLauncher paymentLauncher;
    private final StripePaymentLauncherAssistedFactory paymentLauncherFactory;
    private final PaymentSheetLoader paymentSheetLoader;
    private final InterfaceC36280Ty5<PaymentSheetResult> paymentSheetResult;
    private final InterfaceC49220tP5<PrimaryButton.UIState> primaryButtonUiState;
    private final PrimaryButtonUiStateMapper primaryButtonUiStateMapper;
    private final boolean shouldCompleteLinkFlowInline;
    private final StripeIntentValidator stripeIntentValidator;
    private final GX2<PaymentSheetViewState> viewState;
    private final InterfaceC32730Eu1<WalletsContainerState> walletsContainerState;

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.stripe.android.paymentsheet.PaymentSheetViewModel$1", m28418f = "PaymentSheetViewModel.kt", m28417i = {}, m28416l = {196}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.stripe.android.paymentsheet.PaymentSheetViewModel$1 */
    /* loaded from: classes7.dex */
    public static final class C191521 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
        final /* synthetic */ LinkHandler $linkHandler;
        int label;
        final /* synthetic */ PaymentSheetViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C191521(LinkHandler linkHandler, PaymentSheetViewModel paymentSheetViewModel, Continuation<? super C191521> continuation) {
            super(2, continuation);
            this.$linkHandler = linkHandler;
            this.this$0 = paymentSheetViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C191521(this.$linkHandler, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C191521) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC32730Eu1<LinkHandler.ProcessingState> processingState = this.$linkHandler.getProcessingState();
                final PaymentSheetViewModel paymentSheetViewModel = this.this$0;
                InterfaceC33198Gu1<LinkHandler.ProcessingState> interfaceC33198Gu1 = new InterfaceC33198Gu1<LinkHandler.ProcessingState>() { // from class: com.stripe.android.paymentsheet.PaymentSheetViewModel.1.1
                    @Override // p000.InterfaceC33198Gu1
                    public /* bridge */ /* synthetic */ Object emit(LinkHandler.ProcessingState processingState2, Continuation continuation) {
                        return emit2(processingState2, (Continuation<? super Unit>) continuation);
                    }

                    /* renamed from: emit  reason: avoid collision after fix types in other method */
                    public final Object emit2(LinkHandler.ProcessingState processingState2, Continuation<? super Unit> continuation) {
                        PaymentSheetViewModel.this.handleLinkProcessingState(processingState2);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (processingState.collect(interfaceC33198Gu1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.stripe.android.paymentsheet.PaymentSheetViewModel$2", m28418f = "PaymentSheetViewModel.kt", m28417i = {}, m28416l = {204}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.stripe.android.paymentsheet.PaymentSheetViewModel$2 */
    /* loaded from: classes7.dex */
    public static final class C191542 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
        int label;

        public C191542(Continuation<? super C191542> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C191542(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C191542) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                PaymentSheetViewModel paymentSheetViewModel = PaymentSheetViewModel.this;
                this.label = 1;
                if (paymentSheetViewModel.loadPaymentSheetState(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;", "", "(Ljava/lang/String;I)V", "SheetTopGooglePay", "SheetBottomBuy", "None", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public enum CheckoutIdentifier {
        SheetTopGooglePay,
        SheetBottomBuy,
        None
    }

    @Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001dB\u0015\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0003H\u0016R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R(\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$Factory;", "Landroidx/lifecycle/u$b;", "Lcom/stripe/android/core/injection/Injectable;", "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$Factory$FallbackInitializeParam;", "LOr6;", "T", "Ljava/lang/Class;", "modelClass", "LFE0;", "extras", "create", "(Ljava/lang/Class;LFE0;)LOr6;", "arg", "Lcom/stripe/android/core/injection/Injector;", "fallbackInitialize", "Lkotlin/Function0;", "Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;", "starterArgsSupplier", "Lkotlin/jvm/functions/Function0;", "LY94;", "Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelSubcomponent$Builder;", "subComponentBuilderProvider", "LY94;", "getSubComponentBuilderProvider", "()LY94;", "setSubComponentBuilderProvider", "(LY94;)V", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "FallbackInitializeParam", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Factory implements C11759u.InterfaceC11763b, Injectable<FallbackInitializeParam> {
        private final Function0<PaymentSheetContractV2.Args> starterArgsSupplier;
        public Y94<PaymentSheetViewModelSubcomponent.Builder> subComponentBuilderProvider;

        @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$Factory$FallbackInitializeParam;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "getApplication", "()Landroid/app/Application;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class FallbackInitializeParam {
            private final Application application;

            public FallbackInitializeParam(Application application) {
                Intrinsics.checkNotNullParameter(application, "application");
                this.application = application;
            }

            public static /* synthetic */ FallbackInitializeParam copy$default(FallbackInitializeParam fallbackInitializeParam, Application application, int i, Object obj) {
                if ((i & 1) != 0) {
                    application = fallbackInitializeParam.application;
                }
                return fallbackInitializeParam.copy(application);
            }

            public final Application component1() {
                return this.application;
            }

            public final FallbackInitializeParam copy(Application application) {
                Intrinsics.checkNotNullParameter(application, "application");
                return new FallbackInitializeParam(application);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FallbackInitializeParam) && Intrinsics.areEqual(this.application, ((FallbackInitializeParam) obj).application);
            }

            public final Application getApplication() {
                return this.application;
            }

            public int hashCode() {
                return this.application.hashCode();
            }

            public String toString() {
                Application application = this.application;
                return "FallbackInitializeParam(application=" + application + ")";
            }
        }

        public Factory(Function0<PaymentSheetContractV2.Args> starterArgsSupplier) {
            Intrinsics.checkNotNullParameter(starterArgsSupplier, "starterArgsSupplier");
            this.starterArgsSupplier = starterArgsSupplier;
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public /* bridge */ /* synthetic */ AbstractC35048Or6 create(Class cls) {
            return super.create(cls);
        }

        public final Y94<PaymentSheetViewModelSubcomponent.Builder> getSubComponentBuilderProvider() {
            Y94<PaymentSheetViewModelSubcomponent.Builder> y94 = this.subComponentBuilderProvider;
            if (y94 != null) {
                return y94;
            }
            Intrinsics.throwUninitializedPropertyAccessException("subComponentBuilderProvider");
            return null;
        }

        public final void setSubComponentBuilderProvider(Y94<PaymentSheetViewModelSubcomponent.Builder> y94) {
            Intrinsics.checkNotNullParameter(y94, "<set-?>");
            this.subComponentBuilderProvider = y94;
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public <T extends AbstractC35048Or6> T create(Class<T> modelClass, FE0 extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            PaymentSheetContractV2.Args invoke = this.starterArgsSupplier.invoke();
            Application requireApplication = CreationExtrasKtxKt.requireApplication(extras);
            C11747p m66936a = C11750q.m66936a(extras);
            Injector injectWithFallback = InjectWithFallbackKt.injectWithFallback(this, invoke.getInjectorKey$paymentsheet_release(), new FallbackInitializeParam(requireApplication));
            PaymentSheetViewModel viewModel = getSubComponentBuilderProvider().get().paymentSheetViewModelModule(new PaymentSheetViewModelModule(invoke)).savedStateHandle(m66936a).build().getViewModel();
            Intrinsics.checkNotNull(injectWithFallback, "null cannot be cast to non-null type com.stripe.android.core.injection.NonFallbackInjector");
            viewModel.setInjector((NonFallbackInjector) injectWithFallback);
            Intrinsics.checkNotNull(viewModel, "null cannot be cast to non-null type T of com.stripe.android.paymentsheet.PaymentSheetViewModel.Factory.create");
            return viewModel;
        }

        @Override // com.stripe.android.core.injection.Injectable
        public Injector fallbackInitialize(FallbackInitializeParam arg) {
            Intrinsics.checkNotNullParameter(arg, "arg");
            PaymentSheetLauncherComponent build = DaggerPaymentSheetLauncherComponent.builder().application(arg.getApplication()).injectorKey(InjectorKt.DUMMY_INJECTOR_KEY).build();
            build.inject(this);
            return build;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentSheet.GooglePayConfiguration.Environment.values().length];
            try {
                iArr[PaymentSheet.GooglePayConfiguration.Environment.Production.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSheetViewModel(Application application, PaymentSheetContractV2.Args args, EventReporter eventReporter, Lazy<PaymentConfiguration> lazyPaymentConfig, ElementsSessionRepository elementsSessionRepository, StripeIntentValidator stripeIntentValidator, PaymentSheetLoader paymentSheetLoader, CustomerRepository customerRepository, PrefsRepository prefsRepository, LpmRepository lpmRepository, StripePaymentLauncherAssistedFactory paymentLauncherFactory, GooglePayPaymentMethodLauncherFactory googlePayPaymentMethodLauncherFactory, Logger logger, @IOContext CoroutineContext workContext, C11747p savedStateHandle, LinkHandler linkHandler, IntentConfirmationInterceptor intentConfirmationInterceptor) {
        super(application, args.getConfig$paymentsheet_release(), eventReporter, customerRepository, prefsRepository, workContext, logger, lpmRepository, savedStateHandle, linkHandler, new HeaderTextFactory(true));
        boolean z;
        GooglePayPaymentMethodLauncher.Config config;
        GooglePayEnvironment googlePayEnvironment;
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(eventReporter, "eventReporter");
        Intrinsics.checkNotNullParameter(lazyPaymentConfig, "lazyPaymentConfig");
        Intrinsics.checkNotNullParameter(elementsSessionRepository, "elementsSessionRepository");
        Intrinsics.checkNotNullParameter(stripeIntentValidator, "stripeIntentValidator");
        Intrinsics.checkNotNullParameter(paymentSheetLoader, "paymentSheetLoader");
        Intrinsics.checkNotNullParameter(customerRepository, "customerRepository");
        Intrinsics.checkNotNullParameter(prefsRepository, "prefsRepository");
        Intrinsics.checkNotNullParameter(lpmRepository, "lpmRepository");
        Intrinsics.checkNotNullParameter(paymentLauncherFactory, "paymentLauncherFactory");
        Intrinsics.checkNotNullParameter(googlePayPaymentMethodLauncherFactory, "googlePayPaymentMethodLauncherFactory");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(linkHandler, "linkHandler");
        Intrinsics.checkNotNullParameter(intentConfirmationInterceptor, "intentConfirmationInterceptor");
        this.args = args;
        this.lazyPaymentConfig = lazyPaymentConfig;
        this.elementsSessionRepository = elementsSessionRepository;
        this.stripeIntentValidator = stripeIntentValidator;
        this.paymentSheetLoader = paymentSheetLoader;
        this.paymentLauncherFactory = paymentLauncherFactory;
        this.googlePayPaymentMethodLauncherFactory = googlePayPaymentMethodLauncherFactory;
        this.intentConfirmationInterceptor = intentConfirmationInterceptor;
        Application application2 = getApplication();
        Intrinsics.checkNotNullExpressionValue(application2, "getApplication()");
        PrimaryButtonUiStateMapper primaryButtonUiStateMapper = new PrimaryButtonUiStateMapper(application2, getConfig$paymentsheet_release(), isProcessingPaymentIntent$paymentsheet_release(), getCurrentScreen(), getButtonsEnabled(), getAmount$paymentsheet_release(), getSelection$paymentsheet_release(), getCustomPrimaryButtonUiState(), new PaymentSheetViewModel$primaryButtonUiStateMapper$1(this));
        this.primaryButtonUiStateMapper = primaryButtonUiStateMapper;
        BX2<PaymentSheetResult> m79031b = C36748Vy5.m79031b(1, 0, null, 6, null);
        this._paymentSheetResult = m79031b;
        this.paymentSheetResult = m79031b;
        final GX2<PaymentSheetViewState> m8742a = C50405vP5.m8742a(null);
        this.viewState = m8742a;
        this.checkoutIdentifier = CheckoutIdentifier.SheetBottomBuy;
        this.googlePayButtonState = new InterfaceC32730Eu1<PaymentSheetViewState>() { // from class: com.stripe.android.paymentsheet.PaymentSheetViewModel$special$$inlined$filter$1

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 PaymentSheetViewModel.kt\ncom/stripe/android/paymentsheet/PaymentSheetViewModel\n*L\n1#1,222:1\n21#2:223\n22#2:225\n133#3:224\n*E\n"})
            /* renamed from: com.stripe.android.paymentsheet.PaymentSheetViewModel$special$$inlined$filter$1$2 */
            /* loaded from: classes7.dex */
            public static final class C191552<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;
                final /* synthetic */ PaymentSheetViewModel this$0;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.paymentsheet.PaymentSheetViewModel$special$$inlined$filter$1$2", m28418f = "PaymentSheetViewModel.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.paymentsheet.PaymentSheetViewModel$special$$inlined$filter$1$2$1 */
                /* loaded from: classes7.dex */
                public static final class C191561 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public C191561(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C191552.this.emit(null, this);
                    }
                }

                public C191552(InterfaceC33198Gu1 interfaceC33198Gu1, PaymentSheetViewModel paymentSheetViewModel) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                    this.this$0 = paymentSheetViewModel;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C191561 c191561;
                    Object coroutine_suspended;
                    int i;
                    boolean z;
                    if (continuation instanceof C191561) {
                        c191561 = (C191561) continuation;
                        int i2 = c191561.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c191561.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c191561.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c191561.label;
                            if (i == 0) {
                                if (i == 1) {
                                    ResultKt.throwOnFailure(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                PaymentSheetViewState paymentSheetViewState = (PaymentSheetViewState) obj;
                                if (this.this$0.getCheckoutIdentifier$paymentsheet_release() == PaymentSheetViewModel.CheckoutIdentifier.SheetTopGooglePay) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    c191561.label = 1;
                                    if (interfaceC33198Gu1.emit(obj, c191561) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c191561 = new C191561(continuation);
                    Object obj22 = c191561.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c191561.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super PaymentSheetViewState> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C191552(interfaceC33198Gu1, this), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
        this.buyButtonState = new InterfaceC32730Eu1<PaymentSheetViewState>() { // from class: com.stripe.android.paymentsheet.PaymentSheetViewModel$special$$inlined$filter$2

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 PaymentSheetViewModel.kt\ncom/stripe/android/paymentsheet/PaymentSheetViewModel\n*L\n1#1,222:1\n21#2:223\n22#2:225\n137#3:224\n*E\n"})
            /* renamed from: com.stripe.android.paymentsheet.PaymentSheetViewModel$special$$inlined$filter$2$2 */
            /* loaded from: classes7.dex */
            public static final class C191572<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;
                final /* synthetic */ PaymentSheetViewModel this$0;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.paymentsheet.PaymentSheetViewModel$special$$inlined$filter$2$2", m28418f = "PaymentSheetViewModel.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.paymentsheet.PaymentSheetViewModel$special$$inlined$filter$2$2$1 */
                /* loaded from: classes7.dex */
                public static final class C191581 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public C191581(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C191572.this.emit(null, this);
                    }
                }

                public C191572(InterfaceC33198Gu1 interfaceC33198Gu1, PaymentSheetViewModel paymentSheetViewModel) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                    this.this$0 = paymentSheetViewModel;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C191581 c191581;
                    Object coroutine_suspended;
                    int i;
                    boolean z;
                    if (continuation instanceof C191581) {
                        c191581 = (C191581) continuation;
                        int i2 = c191581.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c191581.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c191581.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c191581.label;
                            if (i == 0) {
                                if (i == 1) {
                                    ResultKt.throwOnFailure(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                PaymentSheetViewState paymentSheetViewState = (PaymentSheetViewState) obj;
                                if (this.this$0.getCheckoutIdentifier$paymentsheet_release() == PaymentSheetViewModel.CheckoutIdentifier.SheetBottomBuy) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    c191581.label = 1;
                                    if (interfaceC33198Gu1.emit(obj, c191581) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c191581 = new C191581(continuation);
                    Object obj22 = c191581.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c191581.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super PaymentSheetViewState> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C191572(interfaceC33198Gu1, this), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
        PaymentSheet.GooglePayConfiguration googlePayConfig = args.getGooglePayConfig();
        if (googlePayConfig == null) {
            z = true;
            config = null;
        } else if (googlePayConfig.getCurrencyCode() == null && !isProcessingPaymentIntent$paymentsheet_release()) {
            logger.warning("GooglePayConfiguration.currencyCode is required in order to use Google Pay when processing a Setup Intent");
            config = null;
            z = true;
        } else {
            z = true;
            if (WhenMappings.$EnumSwitchMapping$0[googlePayConfig.getEnvironment().ordinal()] == 1) {
                googlePayEnvironment = GooglePayEnvironment.Production;
            } else {
                googlePayEnvironment = GooglePayEnvironment.Test;
            }
            config = new GooglePayPaymentMethodLauncher.Config(googlePayEnvironment, googlePayConfig.getCountryCode(), getMerchantName$paymentsheet_release(), false, null, false, false, 120, null);
        }
        this.googlePayLauncherConfig = config;
        this.primaryButtonUiState = C36708Vu1.m79273O(primaryButtonUiStateMapper.forCompleteFlow(), C36218Tr6.m82333a(this), InterfaceC43640jz5.C25067a.m29522b(InterfaceC43640jz5.f93705a, 0L, 0L, 3, null), null);
        this.walletsContainerState = C36708Vu1.m79258m(linkHandler.isLinkEnabled(), getGooglePayState$paymentsheet_release(), getSupportedPaymentMethodsFlow(), new PaymentSheetViewModel$walletsContainerState$1(null));
        Z30.m73800d(C36218Tr6.m82333a(this), null, null, new C191521(linkHandler, this, null), 3, null);
        eventReporter.onInit(getConfig$paymentsheet_release());
        Z30.m73800d(C36218Tr6.m82333a(this), null, null, new C191542(null), 3, null);
        this.shouldCompleteLinkFlowInline = z;
    }

    private final void confirmPaymentSelection(PaymentSelection paymentSelection) {
        Z30.m73800d(C36218Tr6.m82333a(this), null, null, new PaymentSheetViewModel$confirmPaymentSelection$1(this, paymentSelection, null), 3, null);
    }

    public static /* synthetic */ void getGooglePayLauncherConfig$paymentsheet_release$annotations() {
    }

    public static /* synthetic */ void getViewState$paymentsheet_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleLinkProcessingState(LinkHandler.ProcessingState processingState) {
        if (Intrinsics.areEqual(processingState, LinkHandler.ProcessingState.Cancelled.INSTANCE)) {
            this._paymentSheetResult.mo10357b(PaymentSheetResult.Canceled.INSTANCE);
            return;
        }
        Unit unit = null;
        String str = null;
        if (Intrinsics.areEqual(processingState, LinkHandler.ProcessingState.Completed.INSTANCE)) {
            EventReporter eventReporter$paymentsheet_release = getEventReporter$paymentsheet_release();
            PaymentSelection.Link link = PaymentSelection.Link.INSTANCE;
            StripeIntent value = getStripeIntent$paymentsheet_release().getValue();
            if (value != null) {
                str = IntentKt.getCurrency(value);
            }
            eventReporter$paymentsheet_release.onPaymentSuccess(link, str);
            getPrefsRepository().savePaymentSelection(link);
            this._paymentSheetResult.mo10357b(PaymentSheetResult.Completed.INSTANCE);
        } else if (processingState instanceof LinkHandler.ProcessingState.CompletedWithPaymentResult) {
            setContentVisible(true);
            onPaymentResult(((LinkHandler.ProcessingState.CompletedWithPaymentResult) processingState).getResult());
        } else if (processingState instanceof LinkHandler.ProcessingState.Error) {
            onError(((LinkHandler.ProcessingState.Error) processingState).getMessage());
        } else if (Intrinsics.areEqual(processingState, LinkHandler.ProcessingState.Launched.INSTANCE)) {
            setContentVisible(false);
            startProcessing(CheckoutIdentifier.SheetBottomBuy);
        } else if (processingState instanceof LinkHandler.ProcessingState.PaymentDetailsCollected) {
            LinkPaymentDetails.New details = ((LinkHandler.ProcessingState.PaymentDetailsCollected) processingState).getDetails();
            if (details != null) {
                updateSelection(new PaymentSelection.New.LinkInline(details));
                checkout(getSelection$paymentsheet_release().getValue(), CheckoutIdentifier.SheetBottomBuy);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                checkout(getSelection$paymentsheet_release().getValue(), CheckoutIdentifier.SheetBottomBuy);
            }
        } else if (Intrinsics.areEqual(processingState, LinkHandler.ProcessingState.Ready.INSTANCE)) {
            updatePrimaryButtonState(PrimaryButton.State.Ready.INSTANCE);
        } else if (Intrinsics.areEqual(processingState, LinkHandler.ProcessingState.Started.INSTANCE)) {
            updatePrimaryButtonState(PrimaryButton.State.StartProcessing.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleNextAction(String str, StripeIntent stripeIntent) {
        Object m116783constructorimpl;
        StripePaymentLauncher stripePaymentLauncher;
        try {
            Result.Companion companion = Result.Companion;
            stripePaymentLauncher = this.paymentLauncher;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        if (stripePaymentLauncher != null) {
            m116783constructorimpl = Result.m116783constructorimpl(stripePaymentLauncher);
            Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
            if (m116786exceptionOrNullimpl == null) {
                StripePaymentLauncher stripePaymentLauncher2 = (StripePaymentLauncher) m116783constructorimpl;
                if (stripeIntent instanceof PaymentIntent) {
                    stripePaymentLauncher2.handleNextActionForPaymentIntent(str);
                    return;
                } else if (stripeIntent instanceof SetupIntent) {
                    stripePaymentLauncher2.handleNextActionForSetupIntent(str);
                    return;
                } else {
                    return;
                }
            }
            onFatal(m116786exceptionOrNullimpl);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    private final void handlePaymentSheetStateLoaded(PaymentSheetState.Full full) {
        GooglePayState googlePayState;
        setLpmServerSpec$paymentsheet_release(getLpmRepository().getServerSpecLoadingState().getServerLpmSpecs());
        getSavedStateHandle().m66940m(BaseSheetViewModel.SAVE_PAYMENT_METHODS, full.getCustomerPaymentMethods());
        getSavedStateHandle().m66940m(BaseSheetViewModel.SAVE_SAVED_SELECTION, full.getSavedSelection());
        C11747p savedStateHandle = getSavedStateHandle();
        if (full.isGooglePayReady()) {
            googlePayState = GooglePayState.Available.INSTANCE;
        } else {
            googlePayState = GooglePayState.NotAvailable.INSTANCE;
        }
        savedStateHandle.m66940m(BaseSheetViewModel.SAVE_GOOGLE_PAY_STATE, googlePayState);
        setStripeIntent(full.getStripeIntent());
        getLinkHandler().setupLinkLaunchingEagerly(C36218Tr6.m82333a(this), full.getLinkState());
        resetViewState$default(this, null, 1, null);
        transitionToFirstScreen();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadPaymentSheetState(Continuation<? super Unit> continuation) {
        PaymentSheetViewModel$loadPaymentSheetState$1 paymentSheetViewModel$loadPaymentSheetState$1;
        Object coroutine_suspended;
        int i;
        PaymentSheetViewModel paymentSheetViewModel;
        PaymentSheetLoader.Result result;
        if (continuation instanceof PaymentSheetViewModel$loadPaymentSheetState$1) {
            paymentSheetViewModel$loadPaymentSheetState$1 = (PaymentSheetViewModel$loadPaymentSheetState$1) continuation;
            int i2 = paymentSheetViewModel$loadPaymentSheetState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentSheetViewModel$loadPaymentSheetState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentSheetViewModel$loadPaymentSheetState$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = paymentSheetViewModel$loadPaymentSheetState$1.label;
                if (i == 0) {
                    if (i == 1) {
                        paymentSheetViewModel = (PaymentSheetViewModel) paymentSheetViewModel$loadPaymentSheetState$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    CoroutineContext workContext = getWorkContext();
                    PaymentSheetViewModel$loadPaymentSheetState$result$1 paymentSheetViewModel$loadPaymentSheetState$result$1 = new PaymentSheetViewModel$loadPaymentSheetState$result$1(this, null);
                    paymentSheetViewModel$loadPaymentSheetState$1.L$0 = this;
                    paymentSheetViewModel$loadPaymentSheetState$1.label = 1;
                    obj = X30.m77504g(workContext, paymentSheetViewModel$loadPaymentSheetState$result$1, paymentSheetViewModel$loadPaymentSheetState$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    paymentSheetViewModel = this;
                }
                result = (PaymentSheetLoader.Result) obj;
                if (!(result instanceof PaymentSheetLoader.Result.Success)) {
                    paymentSheetViewModel.handlePaymentSheetStateLoaded(((PaymentSheetLoader.Result.Success) result).getState());
                } else if (result instanceof PaymentSheetLoader.Result.Failure) {
                    paymentSheetViewModel.setStripeIntent(null);
                    paymentSheetViewModel.onFatal(((PaymentSheetLoader.Result.Failure) result).getThrowable());
                }
                return Unit.INSTANCE;
            }
        }
        paymentSheetViewModel$loadPaymentSheetState$1 = new PaymentSheetViewModel$loadPaymentSheetState$1(this, continuation);
        Object obj2 = paymentSheetViewModel$loadPaymentSheetState$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = paymentSheetViewModel$loadPaymentSheetState$1.label;
        if (i == 0) {
        }
        result = (PaymentSheetLoader.Result) obj2;
        if (!(result instanceof PaymentSheetLoader.Result.Success)) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v7, types: [com.stripe.android.paymentsheet.model.PaymentSelection$Saved] */
    public final void processPayment(StripeIntent stripeIntent, PaymentResult paymentResult) {
        Object m116783constructorimpl;
        PaymentSelection value;
        String str = null;
        if (paymentResult instanceof PaymentResult.Completed) {
            getEventReporter$paymentsheet_release().onPaymentSuccess(getSelection$paymentsheet_release().getValue(), IntentKt.getCurrency(stripeIntent));
            PaymentSelection value2 = getSelection$paymentsheet_release().getValue();
            if (value2 instanceof PaymentSelection.New.LinkInline) {
                value = PaymentSelection.Link.INSTANCE;
            } else if (value2 instanceof PaymentSelection.New) {
                PaymentMethod paymentMethod = stripeIntent.getPaymentMethod();
                if (paymentMethod != null) {
                    str = new PaymentSelection.Saved(paymentMethod, false, 2, null);
                }
                value = str;
            } else {
                value = getSelection$paymentsheet_release().getValue();
            }
            if (value != null) {
                getPrefsRepository().savePaymentSelection(value);
            }
            this.viewState.setValue(new PaymentSheetViewState.FinishProcessing(new PaymentSheetViewModel$processPayment$3(this)));
            return;
        }
        boolean z = paymentResult instanceof PaymentResult.Failed;
        if (z) {
            getEventReporter$paymentsheet_release().onPaymentFailure(getSelection$paymentsheet_release().getValue(), IntentKt.getCurrency(stripeIntent));
        }
        try {
            Result.Companion companion = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(this.stripeIntentValidator.requireValid(stripeIntent));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
        if (m116786exceptionOrNullimpl == null) {
            StripeIntent stripeIntent2 = (StripeIntent) m116783constructorimpl;
            if (z) {
                str = ((PaymentResult.Failed) paymentResult).getThrowable().getLocalizedMessage();
            }
            resetViewState(str);
            return;
        }
        onFatal(m116786exceptionOrNullimpl);
    }

    private final void resetViewState(String str) {
        BaseSheetViewModel.UserErrorMessage userErrorMessage;
        GX2<PaymentSheetViewState> gx2 = this.viewState;
        if (str != null) {
            userErrorMessage = new BaseSheetViewModel.UserErrorMessage(str);
        } else {
            userErrorMessage = null;
        }
        gx2.setValue(new PaymentSheetViewState.Reset(userErrorMessage));
        getSavedStateHandle().m66940m(BaseSheetViewModel.SAVE_PROCESSING, Boolean.FALSE);
    }

    public static /* synthetic */ void resetViewState$default(PaymentSheetViewModel paymentSheetViewModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        paymentSheetViewModel.resetViewState(str);
    }

    private final void startProcessing(CheckoutIdentifier checkoutIdentifier) {
        if (this.checkoutIdentifier != checkoutIdentifier) {
            this.viewState.setValue(new PaymentSheetViewState.Reset(null, 1, null));
        }
        this.checkoutIdentifier = checkoutIdentifier;
        getSavedStateHandle().m66940m(BaseSheetViewModel.SAVE_PROCESSING, Boolean.TRUE);
        this.viewState.setValue(PaymentSheetViewState.StartProcessing.INSTANCE);
    }

    public final void checkout() {
        checkout(getSelection$paymentsheet_release().getValue(), CheckoutIdentifier.SheetBottomBuy);
    }

    public final void checkoutWithGooglePay() {
        setContentVisible(false);
        checkout(PaymentSelection.GooglePay.INSTANCE, CheckoutIdentifier.SheetTopGooglePay);
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void clearErrorMessages() {
        if (this.viewState.getValue() instanceof PaymentSheetViewState.Reset) {
            this.viewState.setValue(new PaymentSheetViewState.Reset(null));
        }
    }

    public final void confirmStripeIntent(ConfirmStripeIntentParams confirmStripeIntentParams) {
        Object m116783constructorimpl;
        StripePaymentLauncher stripePaymentLauncher;
        Intrinsics.checkNotNullParameter(confirmStripeIntentParams, "confirmStripeIntentParams");
        try {
            Result.Companion companion = Result.Companion;
            stripePaymentLauncher = this.paymentLauncher;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        if (stripePaymentLauncher != null) {
            m116783constructorimpl = Result.m116783constructorimpl(stripePaymentLauncher);
            Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
            if (m116786exceptionOrNullimpl == null) {
                StripePaymentLauncher stripePaymentLauncher2 = (StripePaymentLauncher) m116783constructorimpl;
                if (confirmStripeIntentParams instanceof ConfirmPaymentIntentParams) {
                    stripePaymentLauncher2.confirm((ConfirmPaymentIntentParams) confirmStripeIntentParams);
                    return;
                } else if (confirmStripeIntentParams instanceof ConfirmSetupIntentParams) {
                    stripePaymentLauncher2.confirm((ConfirmSetupIntentParams) confirmStripeIntentParams);
                    return;
                } else {
                    return;
                }
            }
            onFatal(m116786exceptionOrNullimpl);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final PaymentSheetContractV2.Args getArgs$paymentsheet_release() {
        return this.args;
    }

    public final InterfaceC32730Eu1<PaymentSheetViewState> getBuyButtonState() {
        return this.buyButtonState;
    }

    public final CheckoutIdentifier getCheckoutIdentifier$paymentsheet_release() {
        return this.checkoutIdentifier;
    }

    public final InterfaceC32730Eu1<PaymentSheetViewState> getGooglePayButtonState() {
        return this.googlePayButtonState;
    }

    public final GooglePayPaymentMethodLauncher.Config getGooglePayLauncherConfig$paymentsheet_release() {
        return this.googlePayLauncherConfig;
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public PaymentSelection.New getNewPaymentSelection() {
        return this.newPaymentSelection;
    }

    public final InterfaceC36280Ty5<PaymentSheetResult> getPaymentSheetResult$paymentsheet_release() {
        return this.paymentSheetResult;
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public InterfaceC49220tP5<PrimaryButton.UIState> getPrimaryButtonUiState() {
        return this.primaryButtonUiState;
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public boolean getShouldCompleteLinkFlowInline() {
        return this.shouldCompleteLinkFlowInline;
    }

    public final GX2<PaymentSheetViewState> getViewState$paymentsheet_release() {
        return this.viewState;
    }

    public final InterfaceC32730Eu1<WalletsContainerState> getWalletsContainerState$paymentsheet_release() {
        return this.walletsContainerState;
    }

    public final void handleLinkPressed() {
        getLinkHandler().launchLink();
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void handlePaymentMethodSelected(PaymentSelection paymentSelection) {
        if (!getEditing$paymentsheet_release().getValue().booleanValue() && !Intrinsics.areEqual(paymentSelection, getSelection$paymentsheet_release().getValue())) {
            updateSelection(paymentSelection);
        }
    }

    public final boolean isProcessingPaymentIntent$paymentsheet_release() {
        boolean isProcessingPayment;
        isProcessingPayment = PaymentSheetViewModelKt.isProcessingPayment(this.args.getInitializationMode$paymentsheet_release());
        return isProcessingPayment;
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void onError(Integer num) {
        String str;
        if (num != null) {
            str = getApplication().getResources().getString(num.intValue());
        } else {
            str = null;
        }
        onError(str);
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void onFatal(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        getLogger().error("Payment Sheet error", throwable);
        setMostRecentError(throwable);
        this._paymentSheetResult.mo10357b(new PaymentSheetResult.Failed(throwable));
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void onFinish() {
        this._paymentSheetResult.mo10357b(PaymentSheetResult.Completed.INSTANCE);
    }

    public final void onGooglePayResult$paymentsheet_release(GooglePayPaymentMethodLauncher.Result result) {
        int i;
        Intrinsics.checkNotNullParameter(result, "result");
        setContentVisible(true);
        if (result instanceof GooglePayPaymentMethodLauncher.Result.Completed) {
            PaymentSelection.Saved saved = new PaymentSelection.Saved(((GooglePayPaymentMethodLauncher.Result.Completed) result).getPaymentMethod(), true);
            getSavedStateHandle().m66940m(BaseSheetViewModel.SAVE_SELECTION, saved);
            confirmPaymentSelection(saved);
            return;
        }
        String str = null;
        if (result instanceof GooglePayPaymentMethodLauncher.Result.Failed) {
            GooglePayPaymentMethodLauncher.Result.Failed failed = (GooglePayPaymentMethodLauncher.Result.Failed) result;
            getLogger().error("Error processing Google Pay payment", failed.getError());
            EventReporter eventReporter$paymentsheet_release = getEventReporter$paymentsheet_release();
            PaymentSelection.GooglePay googlePay = PaymentSelection.GooglePay.INSTANCE;
            StripeIntent value = getStripeIntent$paymentsheet_release().getValue();
            if (value != null) {
                str = IntentKt.getCurrency(value);
            }
            eventReporter$paymentsheet_release.onPaymentFailure(googlePay, str);
            if (failed.getErrorCode() == 3) {
                i = C19159R.string.stripe_failure_connection_error;
            } else {
                i = C19159R.string.stripe_internal_error;
            }
            onError(Integer.valueOf(i));
        } else if (result instanceof GooglePayPaymentMethodLauncher.Result.Canceled) {
            resetViewState$default(this, null, 1, null);
        }
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void onPaymentResult(PaymentResult paymentResult) {
        Intrinsics.checkNotNullParameter(paymentResult, "paymentResult");
        Z30.m73800d(C36218Tr6.m82333a(this), null, null, new PaymentSheetViewModel$onPaymentResult$1(this, paymentResult, null), 3, null);
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void onUserCancel() {
        this._paymentSheetResult.mo10357b(PaymentSheetResult.Canceled.INSTANCE);
    }

    public final void registerFromActivity(InterfaceC29050u5 activityResultCaller) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
        getLinkHandler().registerFromActivity(activityResultCaller);
        StripePaymentLauncherAssistedFactory stripePaymentLauncherAssistedFactory = this.paymentLauncherFactory;
        PaymentSheetViewModel$registerFromActivity$1 paymentSheetViewModel$registerFromActivity$1 = new PaymentSheetViewModel$registerFromActivity$1(this);
        PaymentSheetViewModel$registerFromActivity$2 paymentSheetViewModel$registerFromActivity$2 = new PaymentSheetViewModel$registerFromActivity$2(this);
        AbstractC0407B5<PaymentLauncherContract.Args> registerForActivityResult = activityResultCaller.registerForActivityResult(new PaymentLauncherContract(), new InterfaceC28515t5() { // from class: BP3
            @Override // p000.InterfaceC28515t5
            /* renamed from: a */
            public final void mo1514a(Object obj) {
                PaymentSheetViewModel.this.onPaymentResult((PaymentResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "activityResultCaller.reg…ymentResult\n            )");
        StripePaymentLauncher create = stripePaymentLauncherAssistedFactory.create(paymentSheetViewModel$registerFromActivity$1, paymentSheetViewModel$registerFromActivity$2, registerForActivityResult);
        StripePaymentLauncherKtxKt.registerPollingAuthenticator(create);
        this.paymentLauncher = create;
    }

    public final void setCheckoutIdentifier$paymentsheet_release(CheckoutIdentifier checkoutIdentifier) {
        Intrinsics.checkNotNullParameter(checkoutIdentifier, "<set-?>");
        this.checkoutIdentifier = checkoutIdentifier;
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void setNewPaymentSelection(PaymentSelection.New r1) {
        this.newPaymentSelection = r1;
    }

    public final void setupGooglePay(ZC0 lifecycleScope, AbstractC0407B5<GooglePayPaymentMethodLauncherContract.Args> activityResultLauncher) {
        Intrinsics.checkNotNullParameter(lifecycleScope, "lifecycleScope");
        Intrinsics.checkNotNullParameter(activityResultLauncher, "activityResultLauncher");
        GooglePayPaymentMethodLauncher.Config config = this.googlePayLauncherConfig;
        if (config != null) {
            this.googlePayPaymentMethodLauncher = GooglePayPaymentMethodLauncherFactory.DefaultImpls.create$default(this.googlePayPaymentMethodLauncherFactory, lifecycleScope, config, PaymentSheetViewModel$setupGooglePay$1$1.INSTANCE, activityResultLauncher, false, 16, null);
        }
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void transitionToFirstScreen() {
        boolean z;
        PaymentSheetScreen paymentSheetScreen;
        List<PaymentMethod> value = getPaymentMethods$paymentsheet_release().getValue();
        if (value != null && !value.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            paymentSheetScreen = PaymentSheetScreen.AddFirstPaymentMethod.INSTANCE;
        } else {
            paymentSheetScreen = PaymentSheetScreen.SelectSavedPaymentMethods.INSTANCE;
        }
        transitionTo(paymentSheetScreen);
    }

    public final void unregisterFromActivity() {
        StripePaymentLauncher stripePaymentLauncher = this.paymentLauncher;
        if (stripePaymentLauncher != null) {
            StripePaymentLauncherKtxKt.unregisterPollingAuthenticator(stripePaymentLauncher);
        }
        this.paymentLauncher = null;
        getLinkHandler().unregisterFromActivity();
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void onError(String str) {
        resetViewState(str);
    }

    private final void checkout(PaymentSelection paymentSelection, CheckoutIdentifier checkoutIdentifier) {
        GooglePayPaymentMethodLauncher googlePayPaymentMethodLauncher;
        String currencyCode;
        Long amount;
        startProcessing(checkoutIdentifier);
        if (paymentSelection instanceof PaymentSelection.GooglePay) {
            StripeIntent value = getStripeIntent$paymentsheet_release().getValue();
            if (value == null || (googlePayPaymentMethodLauncher = this.googlePayPaymentMethodLauncher) == null) {
                return;
            }
            boolean z = value instanceof PaymentIntent;
            PaymentIntent paymentIntent = z ? (PaymentIntent) value : null;
            if (paymentIntent == null || (currencyCode = paymentIntent.getCurrency()) == null) {
                PaymentSheet.GooglePayConfiguration googlePayConfig = this.args.getGooglePayConfig();
                currencyCode = googlePayConfig != null ? googlePayConfig.getCurrencyCode() : null;
                if (currencyCode == null) {
                    currencyCode = "";
                }
            }
            PaymentIntent paymentIntent2 = z ? (PaymentIntent) value : null;
            googlePayPaymentMethodLauncher.present(currencyCode, (paymentIntent2 == null || (amount = paymentIntent2.getAmount()) == null) ? 0 : (int) amount.longValue(), value.getId());
            return;
        }
        confirmPaymentSelection(paymentSelection);
    }
}
