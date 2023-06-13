package com.stripe.android.paymentsheet.flowcontroller;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.C11759u;
import co.bird.android.model.LegacyRepairType;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.IntentConfirmationInterceptor;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.injection.Injectable;
import com.stripe.android.core.injection.InjectorKey;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.injection.NonFallbackInjector;
import com.stripe.android.core.injection.WeakMapInjectorRegistry;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.googlepaylauncher.GooglePayEnvironment;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract;
import com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherFactory;
import com.stripe.android.link.LinkActivityResult;
import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherContract;
import com.stripe.android.payments.paymentlauncher.PaymentResult;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncher;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncherAssistedFactory;
import com.stripe.android.paymentsheet.PaymentOptionCallback;
import com.stripe.android.paymentsheet.PaymentOptionContract;
import com.stripe.android.paymentsheet.PaymentOptionResult;
import com.stripe.android.paymentsheet.PaymentOptionsViewModel;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PaymentSheetResult;
import com.stripe.android.paymentsheet.PaymentSheetResultCallback;
import com.stripe.android.paymentsheet.addresselement.AddressDetails;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.extensions.StripePaymentLauncherKtxKt;
import com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController;
import com.stripe.android.paymentsheet.forms.FormViewModel;
import com.stripe.android.paymentsheet.model.IntentKt;
import com.stripe.android.paymentsheet.model.PaymentOption;
import com.stripe.android.paymentsheet.model.PaymentOptionFactory;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.state.LinkState;
import com.stripe.android.paymentsheet.state.PaymentSheetState;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
@FlowControllerScope
@Metadata(m28433d1 = {"\u0000À\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u008c\u00012\u00020\u00012\u00020\u0002:\u0006\u008d\u0001\u008c\u0001\u008e\u0001B¹\u0001\b\u0001\u0012\u0006\u0010?\u001a\u00020>\u0012\b\u0010\u0087\u0001\u001a\u00030\u0086\u0001\u0012\u000e\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010B0A\u0012\u0006\u0010F\u001a\u00020E\u0012\u0006\u0010I\u001a\u00020H\u0012\u0006\u0010L\u001a\u00020K\u0012\b\u0010\u0089\u0001\u001a\u00030\u0088\u0001\u0012\b\b\u0001\u0010N\u001a\u00020\u000e\u0012\u0006\u0010Q\u001a\u00020P\u0012\u0006\u0010T\u001a\u00020S\u0012\u0006\u0010W\u001a\u00020V\u0012\f\u0010[\u001a\b\u0012\u0004\u0012\u00020Z0Y\u0012\b\b\u0001\u0010^\u001a\u00020]\u0012\u000e\b\u0001\u0010a\u001a\b\u0012\u0004\u0012\u00020\u000e0`\u0012\u0006\u0010d\u001a\u00020c\u0012\u0006\u0010g\u001a\u00020f\u0012\u0006\u0010j\u001a\u00020i\u0012\u0006\u0010m\u001a\u00020l¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\"\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0012\u0010\u0018\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002J\u0018\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\u0010\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\f\u0010 \u001a\u00020\u001f*\u00020\u0016H\u0002J\f\u0010!\u001a\u00020\u0016*\u00020\u0013H\u0002J\u0014\u0010$\u001a\u00020\t2\n\u0010#\u001a\u0006\u0012\u0002\b\u00030\"H\u0016J\"\u0010&\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\"\u0010(\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\"\u0010+\u001a\u00020\t2\u0006\u0010*\u001a\u00020)2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\n\u0010-\u001a\u0004\u0018\u00010,H\u0016J\b\u0010.\u001a\u00020\tH\u0016J\b\u0010/\u001a\u00020\tH\u0016J\u001a\u00100\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0007J\u0017\u00105\u001a\u00020\t2\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b3\u00104J\u0019\u0010:\u001a\u00020\t2\b\u00107\u001a\u0004\u0018\u000106H\u0000¢\u0006\u0004\b8\u00109J\u0017\u0010=\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001c\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010B0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010N\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020Z0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010^\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020\u000e0`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010d\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010g\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010j\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010m\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u001a\u0010q\u001a\b\u0012\u0004\u0012\u00020p0o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u001a\u0010t\u001a\b\u0012\u0004\u0012\u00020s0o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010rR\"\u0010v\u001a\u00020u8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R\u0018\u0010}\u001a\u0004\u0018\u00010|8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R.\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u007f2\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007f8V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001¨\u0006\u008f\u0001"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;", "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;", "Lcom/stripe/android/core/injection/NonFallbackInjector;", "Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;", "mode", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "configuration", "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;", "callback", "", "configure", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "confirmStripeIntentParams", "confirmStripeIntent", "", "clientSecret", "Lcom/stripe/android/model/StripeIntent;", "stripeIntent", "handleNextAction", "Lcom/stripe/android/link/LinkActivityResult;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "onLinkActivityResult", "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;", "paymentResult", "logPaymentResult", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "paymentSelection", "Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;", TransferTable.COLUMN_STATE, "confirmLink", "launchGooglePay", "Lcom/stripe/android/paymentsheet/PaymentSheetResult;", "convertToPaymentSheetResult", "convertToPaymentResult", "Lcom/stripe/android/core/injection/Injectable;", "injectable", "inject", "paymentIntentClientSecret", "configureWithPaymentIntent", "setupIntentClientSecret", "configureWithSetupIntent", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;", "intentConfiguration", "configureWithIntentConfiguration", "Lcom/stripe/android/paymentsheet/model/PaymentOption;", "getPaymentOption", "presentPaymentOptions", "confirm", "confirmPaymentSelection", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result;", "googlePayResult", "onGooglePayResult$paymentsheet_release", "(Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result;)V", "onGooglePayResult", "Lcom/stripe/android/paymentsheet/PaymentOptionResult;", "paymentOptionResult", "onPaymentOptionResult$paymentsheet_release", "(Lcom/stripe/android/paymentsheet/PaymentOptionResult;)V", "onPaymentOptionResult", "onPaymentResult$paymentsheet_release", "(Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V", "onPaymentResult", "LZC0;", "lifecycleScope", "LZC0;", "Lkotlin/Function0;", "", "statusBarColor", "Lkotlin/jvm/functions/Function0;", "Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;", "paymentOptionFactory", "Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;", "Lcom/stripe/android/paymentsheet/PaymentOptionCallback;", "paymentOptionCallback", "Lcom/stripe/android/paymentsheet/PaymentOptionCallback;", "Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;", "paymentResultCallback", "Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;", "injectorKey", "Ljava/lang/String;", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;", "viewModel", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;", "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;", "paymentLauncherFactory", "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;", "LY94;", "Lcom/stripe/android/PaymentConfiguration;", "lazyPaymentConfiguration", "LY94;", "", NamedConstantsKt.ENABLE_LOGGING, "Z", "", com.stripe.android.payments.core.injection.NamedConstantsKt.PRODUCT_USAGE, "Ljava/util/Set;", "Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherFactory;", "googlePayPaymentMethodLauncherFactory", "Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherFactory;", "Lcom/stripe/android/link/LinkPaymentLauncher;", "linkLauncher", "Lcom/stripe/android/link/LinkPaymentLauncher;", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;", "configurationHandler", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;", "Lcom/stripe/android/IntentConfirmationInterceptor;", "intentConfirmationInterceptor", "Lcom/stripe/android/IntentConfirmationInterceptor;", "LB5;", "Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;", "paymentOptionActivityLauncher", "LB5;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args;", "googlePayActivityLauncher", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerComponent;", "flowControllerComponent", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerComponent;", "getFlowControllerComponent", "()Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerComponent;", "setFlowControllerComponent", "(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerComponent;)V", "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;", "paymentLauncher", "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;", "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "value", "getShippingDetails", "()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "setShippingDetails", "(Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)V", "shippingDetails", "LLifecycleOwner;", "lifecycleOwner", "Lu5;", "activityResultCaller", "<init>", "(LZC0;LLifecycleOwner;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;Lcom/stripe/android/paymentsheet/PaymentOptionCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Lu5;Ljava/lang/String;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;LY94;ZLjava/util/Set;Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherFactory;Lcom/stripe/android/link/LinkPaymentLauncher;Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;Lcom/stripe/android/IntentConfirmationInterceptor;)V", "Companion", "Args", "GooglePayException", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDefaultFlowController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultFlowController.kt\ncom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,575:1\n1#2:576\n*E\n"})
/* loaded from: classes7.dex */
public final class DefaultFlowController implements PaymentSheet.FlowController, NonFallbackInjector {
    public static final Companion Companion = new Companion(null);
    private final FlowControllerConfigurationHandler configurationHandler;
    private final boolean enableLogging;
    private final EventReporter eventReporter;
    public FlowControllerComponent flowControllerComponent;
    private final AbstractC0407B5<GooglePayPaymentMethodLauncherContract.Args> googlePayActivityLauncher;
    private final GooglePayPaymentMethodLauncherFactory googlePayPaymentMethodLauncherFactory;
    private final String injectorKey;
    private final IntentConfirmationInterceptor intentConfirmationInterceptor;
    private final Y94<PaymentConfiguration> lazyPaymentConfiguration;
    private final ZC0 lifecycleScope;
    private final LinkPaymentLauncher linkLauncher;
    private StripePaymentLauncher paymentLauncher;
    private final StripePaymentLauncherAssistedFactory paymentLauncherFactory;
    private final AbstractC0407B5<PaymentOptionContract.Args> paymentOptionActivityLauncher;
    private final PaymentOptionCallback paymentOptionCallback;
    private final PaymentOptionFactory paymentOptionFactory;
    private final PaymentSheetResultCallback paymentResultCallback;
    private final Set<String> productUsage;
    private final Function0<Integer> statusBarColor;
    private final FlowControllerViewModel viewModel;

    @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$Args;", "Landroid/os/Parcelable;", "clientSecret", "", "config", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "(Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)V", "getClientSecret", "()Ljava/lang/String;", "getConfig", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String clientSecret;
        private final PaymentSheet.Configuration config;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), parcel.readInt() == 0 ? null : PaymentSheet.Configuration.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public Args(String clientSecret, PaymentSheet.Configuration configuration) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            this.config = configuration;
        }

        public static /* synthetic */ Args copy$default(Args args, String str, PaymentSheet.Configuration configuration, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.clientSecret;
            }
            if ((i & 2) != 0) {
                configuration = args.config;
            }
            return args.copy(str, configuration);
        }

        public final String component1() {
            return this.clientSecret;
        }

        public final PaymentSheet.Configuration component2() {
            return this.config;
        }

        public final Args copy(String clientSecret, PaymentSheet.Configuration configuration) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return new Args(clientSecret, configuration);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Args) {
                Args args = (Args) obj;
                return Intrinsics.areEqual(this.clientSecret, args.clientSecret) && Intrinsics.areEqual(this.config, args.config);
            }
            return false;
        }

        public final String getClientSecret() {
            return this.clientSecret;
        }

        public final PaymentSheet.Configuration getConfig() {
            return this.config;
        }

        public int hashCode() {
            int hashCode = this.clientSecret.hashCode() * 31;
            PaymentSheet.Configuration configuration = this.config;
            return hashCode + (configuration == null ? 0 : configuration.hashCode());
        }

        public String toString() {
            String str = this.clientSecret;
            PaymentSheet.Configuration configuration = this.config;
            return "Args(clientSecret=" + str + ", config=" + configuration + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.clientSecret);
            PaymentSheet.Configuration configuration = this.config;
            if (configuration == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            configuration.writeToParcel(out, i);
        }
    }

    @Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J>\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¨\u0006\u0013"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$Companion;", "", "LXr6;", "viewModelStoreOwner", "LLifecycleOwner;", "lifecycleOwner", "Lu5;", "activityResultCaller", "Lkotlin/Function0;", "", "statusBarColor", "Lcom/stripe/android/paymentsheet/PaymentOptionCallback;", "paymentOptionCallback", "Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;", "paymentResultCallback", "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;", "getInstance", "<init>", "()V", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PaymentSheet.FlowController getInstance(InterfaceC37154Xr6 viewModelStoreOwner, LifecycleOwner lifecycleOwner, InterfaceC29050u5 activityResultCaller, Function0<Integer> statusBarColor, PaymentOptionCallback paymentOptionCallback, PaymentSheetResultCallback paymentResultCallback) {
            Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
            Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
            Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
            Intrinsics.checkNotNullParameter(statusBarColor, "statusBarColor");
            Intrinsics.checkNotNullParameter(paymentOptionCallback, "paymentOptionCallback");
            Intrinsics.checkNotNullParameter(paymentResultCallback, "paymentResultCallback");
            WeakMapInjectorRegistry weakMapInjectorRegistry = WeakMapInjectorRegistry.INSTANCE;
            String simpleName = Reflection.getOrCreateKotlinClass(PaymentSheet.FlowController.class).getSimpleName();
            if (simpleName != null) {
                String nextKey = weakMapInjectorRegistry.nextKey(simpleName);
                FlowControllerComponent build = ((FlowControllerViewModel) new C11759u(viewModelStoreOwner).m66922a(FlowControllerViewModel.class)).getFlowControllerStateComponent().getFlowControllerComponentBuilder().lifeCycleOwner(lifecycleOwner).activityResultCaller(activityResultCaller).statusBarColor(statusBarColor).paymentOptionCallback(paymentOptionCallback).paymentResultCallback(paymentResultCallback).injectorKey(nextKey).build();
                DefaultFlowController flowController = build.getFlowController();
                flowController.setFlowControllerComponent(build);
                weakMapInjectorRegistry.register(flowController, nextKey);
                return flowController;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$GooglePayException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "throwable", "", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class GooglePayException extends Exception {
        public static final int $stable = 8;
        private final Throwable throwable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GooglePayException(Throwable throwable) {
            super(throwable);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
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

    public DefaultFlowController(ZC0 lifecycleScope, LifecycleOwner lifecycleOwner, Function0<Integer> statusBarColor, PaymentOptionFactory paymentOptionFactory, PaymentOptionCallback paymentOptionCallback, PaymentSheetResultCallback paymentResultCallback, final InterfaceC29050u5 activityResultCaller, @InjectorKey String injectorKey, EventReporter eventReporter, FlowControllerViewModel viewModel, StripePaymentLauncherAssistedFactory paymentLauncherFactory, Y94<PaymentConfiguration> lazyPaymentConfiguration, boolean z, Set<String> productUsage, GooglePayPaymentMethodLauncherFactory googlePayPaymentMethodLauncherFactory, LinkPaymentLauncher linkLauncher, FlowControllerConfigurationHandler configurationHandler, IntentConfirmationInterceptor intentConfirmationInterceptor) {
        Intrinsics.checkNotNullParameter(lifecycleScope, "lifecycleScope");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(statusBarColor, "statusBarColor");
        Intrinsics.checkNotNullParameter(paymentOptionFactory, "paymentOptionFactory");
        Intrinsics.checkNotNullParameter(paymentOptionCallback, "paymentOptionCallback");
        Intrinsics.checkNotNullParameter(paymentResultCallback, "paymentResultCallback");
        Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
        Intrinsics.checkNotNullParameter(injectorKey, "injectorKey");
        Intrinsics.checkNotNullParameter(eventReporter, "eventReporter");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(paymentLauncherFactory, "paymentLauncherFactory");
        Intrinsics.checkNotNullParameter(lazyPaymentConfiguration, "lazyPaymentConfiguration");
        Intrinsics.checkNotNullParameter(productUsage, "productUsage");
        Intrinsics.checkNotNullParameter(googlePayPaymentMethodLauncherFactory, "googlePayPaymentMethodLauncherFactory");
        Intrinsics.checkNotNullParameter(linkLauncher, "linkLauncher");
        Intrinsics.checkNotNullParameter(configurationHandler, "configurationHandler");
        Intrinsics.checkNotNullParameter(intentConfirmationInterceptor, "intentConfirmationInterceptor");
        this.lifecycleScope = lifecycleScope;
        this.statusBarColor = statusBarColor;
        this.paymentOptionFactory = paymentOptionFactory;
        this.paymentOptionCallback = paymentOptionCallback;
        this.paymentResultCallback = paymentResultCallback;
        this.injectorKey = injectorKey;
        this.eventReporter = eventReporter;
        this.viewModel = viewModel;
        this.paymentLauncherFactory = paymentLauncherFactory;
        this.lazyPaymentConfiguration = lazyPaymentConfiguration;
        this.enableLogging = z;
        this.productUsage = productUsage;
        this.googlePayPaymentMethodLauncherFactory = googlePayPaymentMethodLauncherFactory;
        this.linkLauncher = linkLauncher;
        this.configurationHandler = configurationHandler;
        this.intentConfirmationInterceptor = intentConfirmationInterceptor;
        lifecycleOwner.getLifecycle().mo67008a(new VX0() { // from class: com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController.1
            @Override // p000.VX0
            public void onCreate(LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                DefaultFlowController defaultFlowController = DefaultFlowController.this;
                StripePaymentLauncherAssistedFactory stripePaymentLauncherAssistedFactory = defaultFlowController.paymentLauncherFactory;
                DefaultFlowController$1$onCreate$1 defaultFlowController$1$onCreate$1 = new DefaultFlowController$1$onCreate$1(DefaultFlowController.this);
                DefaultFlowController$1$onCreate$2 defaultFlowController$1$onCreate$2 = new DefaultFlowController$1$onCreate$2(DefaultFlowController.this);
                InterfaceC29050u5 interfaceC29050u5 = activityResultCaller;
                PaymentLauncherContract paymentLauncherContract = new PaymentLauncherContract();
                final DefaultFlowController defaultFlowController2 = DefaultFlowController.this;
                AbstractC0407B5<PaymentLauncherContract.Args> registerForActivityResult = interfaceC29050u5.registerForActivityResult(paymentLauncherContract, new InterfaceC28515t5() { // from class: lX0
                    @Override // p000.InterfaceC28515t5
                    /* renamed from: a */
                    public final void mo1514a(Object obj) {
                        DefaultFlowController.this.onPaymentResult$paymentsheet_release((PaymentResult) obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "activityResultCaller.reg…                        )");
                StripePaymentLauncher create = stripePaymentLauncherAssistedFactory.create(defaultFlowController$1$onCreate$1, defaultFlowController$1$onCreate$2, registerForActivityResult);
                StripePaymentLauncherKtxKt.registerPollingAuthenticator(create);
                defaultFlowController.paymentLauncher = create;
                DefaultFlowController.this.linkLauncher.register(activityResultCaller, new DefaultFlowController$1$onCreate$5(DefaultFlowController.this));
            }

            @Override // p000.VX0
            public void onDestroy(LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                StripePaymentLauncher stripePaymentLauncher = DefaultFlowController.this.paymentLauncher;
                if (stripePaymentLauncher != null) {
                    StripePaymentLauncherKtxKt.unregisterPollingAuthenticator(stripePaymentLauncher);
                }
                DefaultFlowController.this.paymentLauncher = null;
                DefaultFlowController.this.linkLauncher.unregister();
            }

            @Override // p000.VX0
            public /* bridge */ /* synthetic */ void onPause(LifecycleOwner lifecycleOwner2) {
                super.onPause(lifecycleOwner2);
            }

            @Override // p000.VX0
            public /* bridge */ /* synthetic */ void onResume(LifecycleOwner lifecycleOwner2) {
                super.onResume(lifecycleOwner2);
            }

            @Override // p000.VX0
            public /* bridge */ /* synthetic */ void onStart(LifecycleOwner lifecycleOwner2) {
                super.onStart(lifecycleOwner2);
            }

            @Override // p000.VX0
            public /* bridge */ /* synthetic */ void onStop(LifecycleOwner lifecycleOwner2) {
                super.onStop(lifecycleOwner2);
            }
        });
        AbstractC0407B5<PaymentOptionContract.Args> registerForActivityResult = activityResultCaller.registerForActivityResult(new PaymentOptionContract(), new InterfaceC28515t5() { // from class: jX0
            @Override // p000.InterfaceC28515t5
            /* renamed from: a */
            public final void mo1514a(Object obj) {
                DefaultFlowController.this.onPaymentOptionResult$paymentsheet_release((PaymentOptionResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "activityResultCaller.reg…ptionResult\n            )");
        this.paymentOptionActivityLauncher = registerForActivityResult;
        AbstractC0407B5<GooglePayPaymentMethodLauncherContract.Args> registerForActivityResult2 = activityResultCaller.registerForActivityResult(new GooglePayPaymentMethodLauncherContract(), new InterfaceC28515t5() { // from class: kX0
            @Override // p000.InterfaceC28515t5
            /* renamed from: a */
            public final void mo1514a(Object obj) {
                DefaultFlowController.this.onGooglePayResult$paymentsheet_release((GooglePayPaymentMethodLauncher.Result) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult2, "activityResultCaller.reg…lePayResult\n            )");
        this.googlePayActivityLauncher = registerForActivityResult2;
    }

    private final void configure(PaymentSheet.InitializationMode initializationMode, PaymentSheet.Configuration configuration, PaymentSheet.FlowController.ConfigCallback configCallback) {
        Z30.m73800d(this.lifecycleScope, null, null, new DefaultFlowController$configure$1(this, initializationMode, configuration, configCallback, null), 3, null);
    }

    private final void confirmLink(PaymentSelection paymentSelection, PaymentSheetState.Full full) {
        LinkState linkState = full.getLinkState();
        if (linkState != null) {
            Z30.m73800d(this.lifecycleScope, null, null, new DefaultFlowController$confirmLink$1(this, linkState.getConfiguration(), paymentSelection, full, null), 3, null);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void confirmStripeIntent(ConfirmStripeIntentParams confirmStripeIntentParams) {
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
            throw new IllegalStateException(m116786exceptionOrNullimpl.toString());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    private final PaymentResult convertToPaymentResult(LinkActivityResult linkActivityResult) {
        if (linkActivityResult instanceof LinkActivityResult.Completed) {
            return PaymentResult.Completed.INSTANCE;
        }
        if (linkActivityResult instanceof LinkActivityResult.Canceled) {
            return PaymentResult.Canceled.INSTANCE;
        }
        if (linkActivityResult instanceof LinkActivityResult.Failed) {
            return new PaymentResult.Failed(((LinkActivityResult.Failed) linkActivityResult).getError());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentSheetResult convertToPaymentSheetResult(PaymentResult paymentResult) {
        if (paymentResult instanceof PaymentResult.Completed) {
            return PaymentSheetResult.Completed.INSTANCE;
        }
        if (paymentResult instanceof PaymentResult.Canceled) {
            return PaymentSheetResult.Canceled.INSTANCE;
        }
        if (paymentResult instanceof PaymentResult.Failed) {
            return new PaymentSheetResult.Failed(((PaymentResult.Failed) paymentResult).getThrowable());
        }
        throw new NoWhenBranchMatchedException();
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
            throw new IllegalStateException(m116786exceptionOrNullimpl.toString());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    private final void launchGooglePay(PaymentSheetState.Full full) {
        GooglePayEnvironment googlePayEnvironment;
        PaymentIntent paymentIntent;
        String currencyCode;
        int i;
        Long amount;
        PaymentSheet.Configuration config = full.getConfig();
        if (config != null) {
            PaymentSheet.GooglePayConfiguration googlePay = config.getGooglePay();
            if (googlePay != null) {
                if (WhenMappings.$EnumSwitchMapping$0[googlePay.getEnvironment().ordinal()] == 1) {
                    googlePayEnvironment = GooglePayEnvironment.Production;
                } else {
                    googlePayEnvironment = GooglePayEnvironment.Test;
                }
                GooglePayPaymentMethodLauncher create = this.googlePayPaymentMethodLauncherFactory.create(this.lifecycleScope, new GooglePayPaymentMethodLauncher.Config(googlePayEnvironment, googlePay.getCountryCode(), config.getMerchantDisplayName(), false, null, false, false, 120, null), DefaultFlowController$launchGooglePay$1.INSTANCE, this.googlePayActivityLauncher, true);
                StripeIntent stripeIntent = full.getStripeIntent();
                PaymentIntent paymentIntent2 = null;
                if (stripeIntent instanceof PaymentIntent) {
                    paymentIntent = (PaymentIntent) stripeIntent;
                } else {
                    paymentIntent = null;
                }
                if ((paymentIntent == null || (currencyCode = paymentIntent.getCurrency()) == null) && (currencyCode = googlePay.getCurrencyCode()) == null) {
                    currencyCode = "";
                }
                StripeIntent stripeIntent2 = full.getStripeIntent();
                if (stripeIntent2 instanceof PaymentIntent) {
                    paymentIntent2 = (PaymentIntent) stripeIntent2;
                }
                if (paymentIntent2 != null && (amount = paymentIntent2.getAmount()) != null) {
                    i = (int) amount.longValue();
                } else {
                    i = 0;
                }
                create.present(currencyCode, i, full.getStripeIntent().getId());
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    private final void logPaymentResult(PaymentResult paymentResult) {
        StripeIntent stripeIntent;
        StripeIntent stripeIntent2;
        String str = null;
        if (paymentResult instanceof PaymentResult.Completed) {
            EventReporter eventReporter = this.eventReporter;
            PaymentSelection paymentSelection = this.viewModel.getPaymentSelection();
            PaymentSheetState.Full state = this.viewModel.getState();
            if (state != null && (stripeIntent2 = state.getStripeIntent()) != null) {
                str = IntentKt.getCurrency(stripeIntent2);
            }
            eventReporter.onPaymentSuccess(paymentSelection, str);
        } else if (paymentResult instanceof PaymentResult.Failed) {
            EventReporter eventReporter2 = this.eventReporter;
            PaymentSelection paymentSelection2 = this.viewModel.getPaymentSelection();
            PaymentSheetState.Full state2 = this.viewModel.getState();
            if (state2 != null && (stripeIntent = state2.getStripeIntent()) != null) {
                str = IntentKt.getCurrency(stripeIntent);
            }
            eventReporter2.onPaymentFailure(paymentSelection2, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLinkActivityResult(LinkActivityResult linkActivityResult) {
        onPaymentResult$paymentsheet_release(convertToPaymentResult(linkActivityResult));
    }

    @Override // com.stripe.android.paymentsheet.PaymentSheet.FlowController
    public void configureWithIntentConfiguration(PaymentSheet.IntentConfiguration intentConfiguration, PaymentSheet.Configuration configuration, PaymentSheet.FlowController.ConfigCallback callback) {
        Intrinsics.checkNotNullParameter(intentConfiguration, "intentConfiguration");
        Intrinsics.checkNotNullParameter(callback, "callback");
        configure(new PaymentSheet.InitializationMode.DeferredIntent(intentConfiguration), configuration, callback);
    }

    @Override // com.stripe.android.paymentsheet.PaymentSheet.FlowController
    public void configureWithPaymentIntent(String paymentIntentClientSecret, PaymentSheet.Configuration configuration, PaymentSheet.FlowController.ConfigCallback callback) {
        Intrinsics.checkNotNullParameter(paymentIntentClientSecret, "paymentIntentClientSecret");
        Intrinsics.checkNotNullParameter(callback, "callback");
        configure(new PaymentSheet.InitializationMode.PaymentIntent(paymentIntentClientSecret), configuration, callback);
    }

    @Override // com.stripe.android.paymentsheet.PaymentSheet.FlowController
    public void configureWithSetupIntent(String setupIntentClientSecret, PaymentSheet.Configuration configuration, PaymentSheet.FlowController.ConfigCallback callback) {
        Intrinsics.checkNotNullParameter(setupIntentClientSecret, "setupIntentClientSecret");
        Intrinsics.checkNotNullParameter(callback, "callback");
        configure(new PaymentSheet.InitializationMode.SetupIntent(setupIntentClientSecret), configuration, callback);
    }

    @Override // com.stripe.android.paymentsheet.PaymentSheet.FlowController
    public void confirm() {
        Object m116783constructorimpl;
        boolean z;
        PaymentSheetState.Full state;
        try {
            Result.Companion companion = Result.Companion;
            state = this.viewModel.getState();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        if (state != null) {
            m116783constructorimpl = Result.m116783constructorimpl(state);
            if (Result.m116786exceptionOrNullimpl(m116783constructorimpl) == null) {
                PaymentSheetState.Full full = (PaymentSheetState.Full) m116783constructorimpl;
                PaymentSelection paymentSelection = this.viewModel.getPaymentSelection();
                if (Intrinsics.areEqual(paymentSelection, PaymentSelection.GooglePay.INSTANCE)) {
                    launchGooglePay(full);
                    return;
                }
                if (Intrinsics.areEqual(paymentSelection, PaymentSelection.Link.INSTANCE)) {
                    z = true;
                } else {
                    z = paymentSelection instanceof PaymentSelection.New.LinkInline;
                }
                if (z) {
                    confirmLink(paymentSelection, full);
                    return;
                } else {
                    confirmPaymentSelection(paymentSelection, full);
                    return;
                }
            }
            throw new IllegalStateException("FlowController must be successfully initialized using configureWithPaymentIntent() or configureWithSetupIntent() before calling confirm()".toString());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final void confirmPaymentSelection(PaymentSelection paymentSelection, PaymentSheetState.Full state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Z30.m73800d(this.lifecycleScope, null, null, new DefaultFlowController$confirmPaymentSelection$1(state, this, paymentSelection, null), 3, null);
    }

    public final FlowControllerComponent getFlowControllerComponent() {
        FlowControllerComponent flowControllerComponent = this.flowControllerComponent;
        if (flowControllerComponent != null) {
            return flowControllerComponent;
        }
        Intrinsics.throwUninitializedPropertyAccessException("flowControllerComponent");
        return null;
    }

    @Override // com.stripe.android.paymentsheet.PaymentSheet.FlowController
    public PaymentOption getPaymentOption() {
        PaymentSelection paymentSelection = this.viewModel.getPaymentSelection();
        if (paymentSelection != null) {
            return this.paymentOptionFactory.create(paymentSelection);
        }
        return null;
    }

    @Override // com.stripe.android.paymentsheet.PaymentSheet.FlowController
    public AddressDetails getShippingDetails() {
        PaymentSheet.Configuration config;
        PaymentSheetState.Full state = this.viewModel.getState();
        if (state == null || (config = state.getConfig()) == null) {
            return null;
        }
        return config.getShippingDetails();
    }

    @Override // com.stripe.android.core.injection.Injector
    public void inject(Injectable<?> injectable) {
        Intrinsics.checkNotNullParameter(injectable, "injectable");
        if (injectable instanceof PaymentOptionsViewModel.Factory) {
            getFlowControllerComponent().getStateComponent().inject((PaymentOptionsViewModel.Factory) injectable);
        } else if (injectable instanceof FormViewModel.Factory) {
            getFlowControllerComponent().getStateComponent().inject((FormViewModel.Factory) injectable);
        } else {
            throw new IllegalArgumentException("invalid Injectable " + injectable + " requested in " + this);
        }
    }

    public final void onGooglePayResult$paymentsheet_release(GooglePayPaymentMethodLauncher.Result googlePayResult) {
        Object m116783constructorimpl;
        StripeIntent stripeIntent;
        PaymentSheetState.Full state;
        StripeIntent stripeIntent2;
        Intrinsics.checkNotNullParameter(googlePayResult, "googlePayResult");
        String str = null;
        if (googlePayResult instanceof GooglePayPaymentMethodLauncher.Result.Completed) {
            try {
                Result.Companion companion = Result.Companion;
                state = this.viewModel.getState();
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
            }
            if (state != null) {
                m116783constructorimpl = Result.m116783constructorimpl(state);
                Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                if (m116786exceptionOrNullimpl == null) {
                    PaymentSelection.Saved saved = new PaymentSelection.Saved(((GooglePayPaymentMethodLauncher.Result.Completed) googlePayResult).getPaymentMethod(), true);
                    this.viewModel.setPaymentSelection(saved);
                    confirmPaymentSelection(saved, (PaymentSheetState.Full) m116783constructorimpl);
                    return;
                }
                EventReporter eventReporter = this.eventReporter;
                PaymentSelection.GooglePay googlePay = PaymentSelection.GooglePay.INSTANCE;
                PaymentSheetState.Full state2 = this.viewModel.getState();
                if (state2 != null && (stripeIntent = state2.getStripeIntent()) != null) {
                    str = IntentKt.getCurrency(stripeIntent);
                }
                eventReporter.onPaymentFailure(googlePay, str);
                this.paymentResultCallback.onPaymentSheetResult(new PaymentSheetResult.Failed(m116786exceptionOrNullimpl));
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        } else if (googlePayResult instanceof GooglePayPaymentMethodLauncher.Result.Failed) {
            EventReporter eventReporter2 = this.eventReporter;
            PaymentSelection.GooglePay googlePay2 = PaymentSelection.GooglePay.INSTANCE;
            PaymentSheetState.Full state3 = this.viewModel.getState();
            if (state3 != null && (stripeIntent2 = state3.getStripeIntent()) != null) {
                str = IntentKt.getCurrency(stripeIntent2);
            }
            eventReporter2.onPaymentFailure(googlePay2, str);
            this.paymentResultCallback.onPaymentSheetResult(new PaymentSheetResult.Failed(new GooglePayException(((GooglePayPaymentMethodLauncher.Result.Failed) googlePayResult).getError())));
        } else if (googlePayResult instanceof GooglePayPaymentMethodLauncher.Result.Canceled) {
            this.paymentResultCallback.onPaymentSheetResult(PaymentSheetResult.Canceled.INSTANCE);
        }
    }

    public final /* synthetic */ void onPaymentOptionResult$paymentsheet_release(PaymentOptionResult paymentOptionResult) {
        List<PaymentMethod> paymentMethods;
        PaymentSheetState.Full full;
        PaymentOption paymentOption = null;
        if (paymentOptionResult != null && (paymentMethods = paymentOptionResult.getPaymentMethods()) != null) {
            FlowControllerViewModel flowControllerViewModel = this.viewModel;
            PaymentSheetState.Full state = flowControllerViewModel.getState();
            if (state != null) {
                full = PaymentSheetState.Full.copy$default(state, null, null, paymentMethods, null, false, null, null, 123, null);
            } else {
                full = null;
            }
            flowControllerViewModel.setState(full);
        }
        if (paymentOptionResult instanceof PaymentOptionResult.Succeeded) {
            PaymentSelection paymentSelection = ((PaymentOptionResult.Succeeded) paymentOptionResult).getPaymentSelection();
            this.viewModel.setPaymentSelection(paymentSelection);
            this.paymentOptionCallback.onPaymentOption(this.paymentOptionFactory.create(paymentSelection));
        } else if (paymentOptionResult instanceof PaymentOptionResult.Failed) {
            PaymentOptionCallback paymentOptionCallback = this.paymentOptionCallback;
            PaymentSelection paymentSelection2 = this.viewModel.getPaymentSelection();
            if (paymentSelection2 != null) {
                paymentOption = this.paymentOptionFactory.create(paymentSelection2);
            }
            paymentOptionCallback.onPaymentOption(paymentOption);
        } else if (paymentOptionResult instanceof PaymentOptionResult.Canceled) {
            PaymentSelection paymentSelection3 = ((PaymentOptionResult.Canceled) paymentOptionResult).getPaymentSelection();
            this.viewModel.setPaymentSelection(paymentSelection3);
            if (paymentSelection3 != null) {
                paymentOption = this.paymentOptionFactory.create(paymentSelection3);
            }
            this.paymentOptionCallback.onPaymentOption(paymentOption);
        } else if (paymentOptionResult == null) {
            this.viewModel.setPaymentSelection(null);
            this.paymentOptionCallback.onPaymentOption(null);
        }
    }

    public final void onPaymentResult$paymentsheet_release(PaymentResult paymentResult) {
        Intrinsics.checkNotNullParameter(paymentResult, "paymentResult");
        logPaymentResult(paymentResult);
        Z30.m73800d(this.lifecycleScope, null, null, new DefaultFlowController$onPaymentResult$1(this, paymentResult, null), 3, null);
    }

    @Override // com.stripe.android.paymentsheet.PaymentSheet.FlowController
    public void presentPaymentOptions() {
        Object m116783constructorimpl;
        PaymentSelection.New r9;
        PaymentSheetState.Full state;
        try {
            Result.Companion companion = Result.Companion;
            state = this.viewModel.getState();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        if (state != null) {
            m116783constructorimpl = Result.m116783constructorimpl(state);
            if (Result.m116786exceptionOrNullimpl(m116783constructorimpl) == null) {
                PaymentSheetState.Full full = (PaymentSheetState.Full) m116783constructorimpl;
                AbstractC0407B5<PaymentOptionContract.Args> abstractC0407B5 = this.paymentOptionActivityLauncher;
                PaymentSelection paymentSelection = this.viewModel.getPaymentSelection();
                if (paymentSelection instanceof PaymentSelection.New) {
                    r9 = (PaymentSelection.New) paymentSelection;
                } else {
                    r9 = null;
                }
                abstractC0407B5.m114705a(new PaymentOptionContract.Args(PaymentSheetState.Full.copy$default(full, null, null, null, null, false, null, r9, 63, null), this.statusBarColor.invoke(), this.injectorKey, this.enableLogging, this.productUsage));
                return;
            }
            throw new IllegalStateException("FlowController must be successfully initialized using configureWithPaymentIntent() or configureWithSetupIntent() before calling presentPaymentOptions()".toString());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final void setFlowControllerComponent(FlowControllerComponent flowControllerComponent) {
        Intrinsics.checkNotNullParameter(flowControllerComponent, "<set-?>");
        this.flowControllerComponent = flowControllerComponent;
    }

    @Override // com.stripe.android.paymentsheet.PaymentSheet.FlowController
    public void setShippingDetails(AddressDetails addressDetails) {
        PaymentSheet.Configuration config;
        FlowControllerViewModel flowControllerViewModel = this.viewModel;
        PaymentSheetState.Full state = flowControllerViewModel.getState();
        PaymentSheetState.Full full = null;
        r3 = null;
        PaymentSheet.Configuration configuration = null;
        if (state != null) {
            PaymentSheetState.Full state2 = this.viewModel.getState();
            if (state2 != null && (config = state2.getConfig()) != null) {
                configuration = config.copy((r22 & 1) != 0 ? config.merchantDisplayName : null, (r22 & 2) != 0 ? config.customer : null, (r22 & 4) != 0 ? config.googlePay : null, (r22 & 8) != 0 ? config.primaryButtonColor : null, (r22 & 16) != 0 ? config.defaultBillingDetails : null, (r22 & 32) != 0 ? config.shippingDetails : addressDetails, (r22 & 64) != 0 ? config.allowsDelayedPaymentMethods : false, (r22 & 128) != 0 ? config.allowsPaymentMethodsRequiringShippingAddress : false, (r22 & 256) != 0 ? config.appearance : null, (r22 & 512) != 0 ? config.primaryButtonLabel : null);
            }
            full = PaymentSheetState.Full.copy$default(state, configuration, null, null, null, false, null, null, 126, null);
        }
        flowControllerViewModel.setState(full);
    }
}
