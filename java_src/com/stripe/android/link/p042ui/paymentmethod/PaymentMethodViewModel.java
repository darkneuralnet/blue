package com.stripe.android.link.p042ui.paymentmethod;

import androidx.lifecycle.C11759u;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.IntentConfirmationInterceptor;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.Injector;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.injection.NonFallbackInjectable;
import com.stripe.android.core.injection.NonFallbackInjector;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetLinkResult;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.link.C18975R;
import com.stripe.android.link.LinkActivityContract;
import com.stripe.android.link.LinkActivityResult;
import com.stripe.android.link.LinkPaymentDetails;
import com.stripe.android.link.LinkScreen;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.confirmation.ConfirmationManager;
import com.stripe.android.link.injection.SignedInViewModelSubcomponent;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.model.Navigator;
import com.stripe.android.link.model.SupportedPaymentMethodTypesKt;
import com.stripe.android.link.p042ui.ErrorMessage;
import com.stripe.android.link.p042ui.ErrorMessageKt;
import com.stripe.android.link.p042ui.PrimaryButtonState;
import com.stripe.android.link.p042ui.wallet.PaymentDetailsResult;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.p049ui.core.FieldValuesToParamsMapConverter;
import com.stripe.android.p049ui.core.FormController;
import com.stripe.android.p049ui.core.address.AddressUtilKt;
import com.stripe.android.p049ui.core.elements.LayoutSpec;
import com.stripe.android.p049ui.core.forms.ConvertToFormValuesMapKt;
import com.stripe.android.p049ui.core.injection.FormControllerSubcomponent;
import com.stripe.android.payments.paymentlauncher.PaymentResult;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001:\u0001{BO\b\u0007\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u0010:\u001a\u000209\u0012\u0006\u0010=\u001a\u00020<\u0012\u0006\u0010@\u001a\u00020?\u0012\u0006\u0010C\u001a\u00020B\u0012\f\u0010G\u001a\b\u0012\u0004\u0012\u00020F0E\u0012\u0006\u0010J\u001a\u00020I¢\u0006\u0004\by\u0010zJ \u0010\u0007\u001a\u00020\u00062\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0002J\u001b\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0004H\u0002J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0018\u001a\u00020\u0006H\u0002J\b\u0010\u0019\u001a\u00020\u0006H\u0002J\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\u0010\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0002J\u000e\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"J\u000e\u0010'\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%J\u001a\u0010*\u001a\u00020\u00062\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020(0\u0002J\u0006\u0010+\u001a\u00020\u0006J\u000e\u0010.\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,R\u0017\u00100\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u00105\u001a\u0002048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020F0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020\u001f0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001d\u0010S\u001a\b\u0012\u0004\u0012\u00020\u001f0R8\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u001d\u0010X\u001a\b\u0012\u0004\u0012\u00020\"0W8\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bX\u0010ZR\u001c\u0010[\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010QR\u001f\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0R8\u0006¢\u0006\f\n\u0004\b\u001e\u0010T\u001a\u0004\b\\\u0010VR\u0014\u0010]\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0017\u0010`\u001a\u00020_8\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u001d\u0010e\u001a\b\u0012\u0004\u0012\u00020%0d8\u0006¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020%0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010QR\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020%0R8\u0006¢\u0006\f\n\u0004\b&\u0010T\u001a\u0004\bj\u0010VR\u001f\u0010l\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010k0O8\u0006¢\u0006\f\n\u0004\bl\u0010Q\u001a\u0004\bm\u0010nR \u0010p\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020k0o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u001c\u0010r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010QR\u001f\u0010s\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040R8\u0006¢\u0006\f\n\u0004\bs\u0010T\u001a\u0004\bt\u0010VR\u0017\u0010u\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006|"}, m28432d2 = {"Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;", "LOr6;", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "", NamedConstantsKt.INITIAL_VALUES, "", "updateFormController", "Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;", "selectedAccount", "navigateToWallet", "payAnotherWay", "Lcom/stripe/android/link/LinkPaymentDetails;", "linkPaymentDetails", "completePayment", "(Lcom/stripe/android/link/LinkPaymentDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "confirmParams", "confirmStripeIntent", "clientSecret", "handleNextAction", "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;", "paymentResult", "handlePaymentResult", "handlePaymentSuccess", "clearError", "", "error", "onError", "Lcom/stripe/android/link/ui/ErrorMessage;", "errorMessage", "Lcom/stripe/android/link/ui/PrimaryButtonState;", TransferTable.COLUMN_STATE, "setState", "", LinkScreen.PaymentMethod.loadArg, "init", "Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;", "paymentMethod", "onPaymentMethodSelected", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "formValues", "startPayment", "onSecondaryButtonClick", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLinkResult;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "onFinancialConnectionsAccountLinked", "Lcom/stripe/android/link/LinkActivityContract$Args;", "args", "Lcom/stripe/android/link/LinkActivityContract$Args;", "getArgs", "()Lcom/stripe/android/link/LinkActivityContract$Args;", "Lcom/stripe/android/link/model/LinkAccount;", "linkAccount", "Lcom/stripe/android/link/model/LinkAccount;", "getLinkAccount", "()Lcom/stripe/android/link/model/LinkAccount;", "Lcom/stripe/android/link/account/LinkAccountManager;", "linkAccountManager", "Lcom/stripe/android/link/account/LinkAccountManager;", "Lcom/stripe/android/link/model/Navigator;", "navigator", "Lcom/stripe/android/link/model/Navigator;", "Lcom/stripe/android/link/confirmation/ConfirmationManager;", "confirmationManager", "Lcom/stripe/android/link/confirmation/ConfirmationManager;", "Lcom/stripe/android/core/Logger;", "logger", "Lcom/stripe/android/core/Logger;", "LY94;", "Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;", "formControllerProvider", "LY94;", "Lcom/stripe/android/IntentConfirmationInterceptor;", "intentConfirmationInterceptor", "Lcom/stripe/android/IntentConfirmationInterceptor;", "Lcom/stripe/android/model/StripeIntent;", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "LGX2;", "_primaryButtonState", "LGX2;", "LtP5;", "primaryButtonState", "LtP5;", "getPrimaryButtonState", "()LtP5;", "LEu1;", "isEnabled", "LEu1;", "()LEu1;", "_errorMessage", "getErrorMessage", "isRootScreen", "Z", "", "secondaryButtonLabel", "I", "getSecondaryButtonLabel", "()I", "", "supportedTypes", "Ljava/util/List;", "getSupportedTypes", "()Ljava/util/List;", "_paymentMethod", "getPaymentMethod", "Lcom/stripe/android/ui/core/FormController;", "formController", "getFormController", "()LGX2;", "", "formControllersCache", "Ljava/util/Map;", "_financialConnectionsSessionClientSecret", "financialConnectionsSessionClientSecret", "getFinancialConnectionsSessionClientSecret", "publishableKey", "Ljava/lang/String;", "getPublishableKey", "()Ljava/lang/String;", "<init>", "(Lcom/stripe/android/link/LinkActivityContract$Args;Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/model/Navigator;Lcom/stripe/android/link/confirmation/ConfirmationManager;Lcom/stripe/android/core/Logger;LY94;Lcom/stripe/android/IntentConfirmationInterceptor;)V", "Factory", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPaymentMethodViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodViewModel.kt\ncom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,312:1\n47#2:313\n49#2:317\n50#3:314\n55#3:316\n106#4:315\n3792#5:318\n4307#5,2:319\n1#6:321\n*S KotlinDebug\n*F\n+ 1 PaymentMethodViewModel.kt\ncom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel\n*L\n66#1:313\n66#1:317\n66#1:314\n66#1:316\n66#1:315\n81#1:318\n81#1:319,2\n*E\n"})
/* renamed from: com.stripe.android.link.ui.paymentmethod.PaymentMethodViewModel */
/* loaded from: classes7.dex */
public final class PaymentMethodViewModel extends AbstractC35048Or6 {
    private final GX2<ErrorMessage> _errorMessage;
    private final GX2<String> _financialConnectionsSessionClientSecret;
    private final GX2<SupportedPaymentMethod> _paymentMethod;
    private final GX2<PrimaryButtonState> _primaryButtonState;
    private final LinkActivityContract.Args args;
    private final ConfirmationManager confirmationManager;
    private final InterfaceC49220tP5<ErrorMessage> errorMessage;
    private final InterfaceC49220tP5<String> financialConnectionsSessionClientSecret;
    private final GX2<FormController> formController;
    private final Y94<FormControllerSubcomponent.Builder> formControllerProvider;
    private final Map<SupportedPaymentMethod, FormController> formControllersCache;
    private final IntentConfirmationInterceptor intentConfirmationInterceptor;
    private final InterfaceC32730Eu1<Boolean> isEnabled;
    private final boolean isRootScreen;
    private final LinkAccount linkAccount;
    private final LinkAccountManager linkAccountManager;
    private final Logger logger;
    private final Navigator navigator;
    private final InterfaceC49220tP5<SupportedPaymentMethod> paymentMethod;
    private final InterfaceC49220tP5<PrimaryButtonState> primaryButtonState;
    private final String publishableKey;
    private final int secondaryButtonLabel;
    private final StripeIntent stripeIntent;
    private final List<SupportedPaymentMethod> supportedTypes;

    @Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, m28432d2 = {"Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$Factory;", "Landroidx/lifecycle/u$b;", "Lcom/stripe/android/core/injection/NonFallbackInjectable;", "LOr6;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)LOr6;", "Lcom/stripe/android/link/model/LinkAccount;", "linkAccount", "Lcom/stripe/android/link/model/LinkAccount;", "Lcom/stripe/android/core/injection/NonFallbackInjector;", "injector", "Lcom/stripe/android/core/injection/NonFallbackInjector;", "", LinkScreen.PaymentMethod.loadArg, "Z", "LY94;", "Lcom/stripe/android/link/injection/SignedInViewModelSubcomponent$Builder;", "subComponentBuilderProvider", "LY94;", "getSubComponentBuilderProvider", "()LY94;", "setSubComponentBuilderProvider", "(LY94;)V", "<init>", "(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/core/injection/NonFallbackInjector;Z)V", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: com.stripe.android.link.ui.paymentmethod.PaymentMethodViewModel$Factory */
    /* loaded from: classes7.dex */
    public static final class Factory implements C11759u.InterfaceC11763b, NonFallbackInjectable {
        private final NonFallbackInjector injector;
        private final LinkAccount linkAccount;
        private final boolean loadFromArgs;
        public Y94<SignedInViewModelSubcomponent.Builder> subComponentBuilderProvider;

        public Factory(LinkAccount linkAccount, NonFallbackInjector injector, boolean z) {
            Intrinsics.checkNotNullParameter(linkAccount, "linkAccount");
            Intrinsics.checkNotNullParameter(injector, "injector");
            this.linkAccount = linkAccount;
            this.injector = injector;
            this.loadFromArgs = z;
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public /* bridge */ /* synthetic */ AbstractC35048Or6 create(Class cls, FE0 fe0) {
            return super.create(cls, fe0);
        }

        @Override // com.stripe.android.core.injection.Injectable
        public /* bridge */ /* synthetic */ Injector fallbackInitialize(Unit unit) {
            return (Injector) fallbackInitialize2(unit);
        }

        public final Y94<SignedInViewModelSubcomponent.Builder> getSubComponentBuilderProvider() {
            Y94<SignedInViewModelSubcomponent.Builder> y94 = this.subComponentBuilderProvider;
            if (y94 != null) {
                return y94;
            }
            Intrinsics.throwUninitializedPropertyAccessException("subComponentBuilderProvider");
            return null;
        }

        public final void setSubComponentBuilderProvider(Y94<SignedInViewModelSubcomponent.Builder> y94) {
            Intrinsics.checkNotNullParameter(y94, "<set-?>");
            this.subComponentBuilderProvider = y94;
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public <T extends AbstractC35048Or6> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            this.injector.inject(this);
            PaymentMethodViewModel paymentMethodViewModel = getSubComponentBuilderProvider().get().linkAccount(this.linkAccount).build().getPaymentMethodViewModel();
            paymentMethodViewModel.init(this.loadFromArgs);
            Intrinsics.checkNotNull(paymentMethodViewModel, "null cannot be cast to non-null type T of com.stripe.android.link.ui.paymentmethod.PaymentMethodViewModel.Factory.create");
            return paymentMethodViewModel;
        }

        @Override // com.stripe.android.core.injection.NonFallbackInjectable
        /* renamed from: fallbackInitialize  reason: avoid collision after fix types in other method */
        public Void fallbackInitialize2(Unit unit) {
            return NonFallbackInjectable.DefaultImpls.fallbackInitialize(this, unit);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.link.ui.paymentmethod.PaymentMethodViewModel$WhenMappings */
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SupportedPaymentMethod.values().length];
            try {
                iArr[SupportedPaymentMethod.Card.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SupportedPaymentMethod.BankAccount.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PaymentMethodViewModel(LinkActivityContract.Args args, LinkAccount linkAccount, LinkAccountManager linkAccountManager, Navigator navigator, ConfirmationManager confirmationManager, Logger logger, Y94<FormControllerSubcomponent.Builder> formControllerProvider, IntentConfirmationInterceptor intentConfirmationInterceptor) {
        int i;
        Object first;
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(linkAccount, "linkAccount");
        Intrinsics.checkNotNullParameter(linkAccountManager, "linkAccountManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(confirmationManager, "confirmationManager");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(formControllerProvider, "formControllerProvider");
        Intrinsics.checkNotNullParameter(intentConfirmationInterceptor, "intentConfirmationInterceptor");
        this.args = args;
        this.linkAccount = linkAccount;
        this.linkAccountManager = linkAccountManager;
        this.navigator = navigator;
        this.confirmationManager = confirmationManager;
        this.logger = logger;
        this.formControllerProvider = formControllerProvider;
        this.intentConfirmationInterceptor = intentConfirmationInterceptor;
        this.stripeIntent = args.getStripeIntent$link_release();
        final GX2<PrimaryButtonState> m8742a = C50405vP5.m8742a(PrimaryButtonState.Enabled);
        this._primaryButtonState = m8742a;
        this.primaryButtonState = m8742a;
        this.isEnabled = new InterfaceC32730Eu1<Boolean>() { // from class: com.stripe.android.link.ui.paymentmethod.PaymentMethodViewModel$special$$inlined$map$1

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 PaymentMethodViewModel.kt\ncom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel\n*L\n1#1,222:1\n48#2:223\n66#3:224\n*E\n"})
            /* renamed from: com.stripe.android.link.ui.paymentmethod.PaymentMethodViewModel$special$$inlined$map$1$2 */
            /* loaded from: classes7.dex */
            public static final class C190342<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.link.ui.paymentmethod.PaymentMethodViewModel$special$$inlined$map$1$2", m28418f = "PaymentMethodViewModel.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.link.ui.paymentmethod.PaymentMethodViewModel$special$$inlined$map$1$2$1 */
                /* loaded from: classes7.dex */
                public static final class C190351 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C190351(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C190342.this.emit(null, this);
                    }
                }

                public C190342(InterfaceC33198Gu1 interfaceC33198Gu1) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C190351 c190351;
                    Object coroutine_suspended;
                    int i;
                    if (continuation instanceof C190351) {
                        c190351 = (C190351) continuation;
                        int i2 = c190351.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c190351.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c190351.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c190351.label;
                            if (i == 0) {
                                if (i == 1) {
                                    ResultKt.throwOnFailure(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                Boolean boxBoolean = Boxing.boxBoolean(!((PrimaryButtonState) obj).isBlocking());
                                c190351.label = 1;
                                if (interfaceC33198Gu1.emit(boxBoolean, c190351) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c190351 = new C190351(continuation);
                    Object obj22 = c190351.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c190351.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super Boolean> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C190342(interfaceC33198Gu1), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
        GX2<ErrorMessage> m8742a2 = C50405vP5.m8742a(null);
        this._errorMessage = m8742a2;
        this.errorMessage = m8742a2;
        boolean areEqual = Intrinsics.areEqual(navigator.isOnRootScreen(), Boolean.TRUE);
        this.isRootScreen = areEqual;
        if (areEqual) {
            i = C18975R.string.wallet_pay_another_way;
        } else {
            i = C18975R.string.cancel;
        }
        this.secondaryButtonLabel = i;
        Set<String> supportedPaymentMethodTypes = SupportedPaymentMethodTypesKt.supportedPaymentMethodTypes(args.getStripeIntent$link_release(), linkAccount);
        SupportedPaymentMethod[] values = SupportedPaymentMethod.values();
        ArrayList arrayList = new ArrayList();
        for (SupportedPaymentMethod supportedPaymentMethod : values) {
            if (supportedPaymentMethodTypes.contains(supportedPaymentMethod.getType())) {
                arrayList.add(supportedPaymentMethod);
            }
        }
        this.supportedTypes = arrayList;
        first = CollectionsKt___CollectionsKt.first((List<? extends Object>) arrayList);
        GX2<SupportedPaymentMethod> m8742a3 = C50405vP5.m8742a(first);
        this._paymentMethod = m8742a3;
        this.paymentMethod = m8742a3;
        this.formController = C50405vP5.m8742a(null);
        this.formControllersCache = new LinkedHashMap();
        GX2<String> m8742a4 = C50405vP5.m8742a(null);
        this._financialConnectionsSessionClientSecret = m8742a4;
        this.financialConnectionsSessionClientSecret = m8742a4;
        String consumerPublishableKey = this.linkAccountManager.getConsumerPublishableKey();
        if (consumerPublishableKey != null) {
            this.publishableKey = consumerPublishableKey;
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    private final void clearError() {
        this._errorMessage.setValue(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object completePayment(LinkPaymentDetails linkPaymentDetails, Continuation<? super Unit> continuation) {
        PaymentMethodViewModel$completePayment$1 paymentMethodViewModel$completePayment$1;
        Object coroutine_suspended;
        int i;
        ConfirmPaymentIntentParams.Shipping shipping;
        PaymentMethodViewModel paymentMethodViewModel;
        IntentConfirmationInterceptor.NextStep nextStep;
        if (continuation instanceof PaymentMethodViewModel$completePayment$1) {
            paymentMethodViewModel$completePayment$1 = (PaymentMethodViewModel$completePayment$1) continuation;
            int i2 = paymentMethodViewModel$completePayment$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodViewModel$completePayment$1.label = i2 - Integer.MIN_VALUE;
                PaymentMethodViewModel$completePayment$1 paymentMethodViewModel$completePayment$12 = paymentMethodViewModel$completePayment$1;
                Object obj = paymentMethodViewModel$completePayment$12.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = paymentMethodViewModel$completePayment$12.label;
                if (i == 0) {
                    if (i == 1) {
                        paymentMethodViewModel = (PaymentMethodViewModel) paymentMethodViewModel$completePayment$12.L$0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    IntentConfirmationInterceptor intentConfirmationInterceptor = this.intentConfirmationInterceptor;
                    String clientSecret = this.stripeIntent.getClientSecret();
                    PaymentMethodCreateParams paymentMethodCreateParams = linkPaymentDetails.getPaymentMethodCreateParams();
                    Map<IdentifierSpec, String> shippingValues$link_release = this.args.getShippingValues$link_release();
                    if (shippingValues$link_release != null) {
                        shipping = AddressUtilKt.toConfirmPaymentIntentShipping(shippingValues$link_release);
                    } else {
                        shipping = null;
                    }
                    paymentMethodViewModel$completePayment$12.L$0 = this;
                    paymentMethodViewModel$completePayment$12.label = 1;
                    obj = intentConfirmationInterceptor.intercept(clientSecret, paymentMethodCreateParams, shipping, (ConfirmPaymentIntentParams.SetupFutureUsage) null, paymentMethodViewModel$completePayment$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    paymentMethodViewModel = this;
                }
                nextStep = (IntentConfirmationInterceptor.NextStep) obj;
                if (!(nextStep instanceof IntentConfirmationInterceptor.NextStep.Confirm)) {
                    paymentMethodViewModel.confirmStripeIntent(((IntentConfirmationInterceptor.NextStep.Confirm) nextStep).getConfirmParams());
                } else if (nextStep instanceof IntentConfirmationInterceptor.NextStep.HandleNextAction) {
                    paymentMethodViewModel.handleNextAction(((IntentConfirmationInterceptor.NextStep.HandleNextAction) nextStep).getClientSecret());
                } else if (nextStep instanceof IntentConfirmationInterceptor.NextStep.Fail) {
                    paymentMethodViewModel.onError(new ErrorMessage.Raw(((IntentConfirmationInterceptor.NextStep.Fail) nextStep).getMessage()));
                } else if (nextStep instanceof IntentConfirmationInterceptor.NextStep.Complete) {
                    paymentMethodViewModel.handlePaymentSuccess();
                }
                return Unit.INSTANCE;
            }
        }
        paymentMethodViewModel$completePayment$1 = new PaymentMethodViewModel$completePayment$1(this, continuation);
        PaymentMethodViewModel$completePayment$1 paymentMethodViewModel$completePayment$122 = paymentMethodViewModel$completePayment$1;
        Object obj2 = paymentMethodViewModel$completePayment$122.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = paymentMethodViewModel$completePayment$122.label;
        if (i == 0) {
        }
        nextStep = (IntentConfirmationInterceptor.NextStep) obj2;
        if (!(nextStep instanceof IntentConfirmationInterceptor.NextStep.Confirm)) {
        }
        return Unit.INSTANCE;
    }

    private final void confirmStripeIntent(ConfirmStripeIntentParams confirmStripeIntentParams) {
        this.confirmationManager.confirmStripeIntent(confirmStripeIntentParams, new PaymentMethodViewModel$confirmStripeIntent$1(this));
    }

    private final void handleNextAction(String str) {
        this.confirmationManager.handleNextAction(str, this.stripeIntent, new PaymentMethodViewModel$handleNextAction$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePaymentResult(PaymentResult paymentResult) {
        if (paymentResult instanceof PaymentResult.Canceled) {
            setState(PrimaryButtonState.Enabled);
        } else if (paymentResult instanceof PaymentResult.Failed) {
            onError(((PaymentResult.Failed) paymentResult).getThrowable());
        } else if (paymentResult instanceof PaymentResult.Completed) {
            handlePaymentSuccess();
        }
    }

    private final void handlePaymentSuccess() {
        setState(PrimaryButtonState.Completed);
        Z30.m73800d(C36218Tr6.m82333a(this), null, null, new PaymentMethodViewModel$handlePaymentSuccess$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void navigateToWallet(ConsumerPaymentDetails.BankAccount bankAccount) {
        if (Intrinsics.areEqual(this.navigator.isOnRootScreen(), Boolean.FALSE)) {
            this.navigator.setResult(PaymentDetailsResult.KEY, new PaymentDetailsResult.Success(bankAccount.getId()));
            this.navigator.onBack(false);
            return;
        }
        this.navigator.navigateTo(LinkScreen.Wallet.INSTANCE, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onError(Throwable th) {
        this.logger.error("Error: ", th);
        onError(ErrorMessageKt.getErrorMessage(th));
    }

    private final void payAnotherWay() {
        clearError();
        this.navigator.cancel(LinkActivityResult.Canceled.Reason.PayAnotherWay);
    }

    private final void setState(PrimaryButtonState primaryButtonState) {
        this._primaryButtonState.setValue(primaryButtonState);
        this.navigator.setUserNavigationEnabled(!primaryButtonState.isBlocking());
    }

    private final void updateFormController(Map<IdentifierSpec, String> map) {
        Set<IdentifierSpec> emptySet;
        GX2<FormController> gx2 = this.formController;
        FormController formController = this.formControllersCache.get(this.paymentMethod.getValue());
        if (formController == null) {
            FormControllerSubcomponent.Builder formSpec = this.formControllerProvider.get().formSpec(new LayoutSpec(this.paymentMethod.getValue().getFormSpec()));
            emptySet = SetsKt__SetsKt.emptySet();
            formController = formSpec.viewOnlyFields(emptySet).viewModelScope(C36218Tr6.m82333a(this)).initialValues(map).stripeIntent(this.args.getStripeIntent$link_release()).merchantName(this.args.getMerchantName$link_release()).shippingValues(this.args.getShippingValues$link_release()).build().getFormController();
            this.formControllersCache.put(this.paymentMethod.getValue(), formController);
        }
        gx2.setValue(formController);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateFormController$default(PaymentMethodViewModel paymentMethodViewModel, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = MapsKt__MapsKt.emptyMap();
        }
        paymentMethodViewModel.updateFormController(map);
    }

    public final LinkActivityContract.Args getArgs() {
        return this.args;
    }

    public final InterfaceC49220tP5<ErrorMessage> getErrorMessage() {
        return this.errorMessage;
    }

    public final InterfaceC49220tP5<String> getFinancialConnectionsSessionClientSecret() {
        return this.financialConnectionsSessionClientSecret;
    }

    public final GX2<FormController> getFormController() {
        return this.formController;
    }

    public final LinkAccount getLinkAccount() {
        return this.linkAccount;
    }

    public final InterfaceC49220tP5<SupportedPaymentMethod> getPaymentMethod() {
        return this.paymentMethod;
    }

    public final InterfaceC49220tP5<PrimaryButtonState> getPrimaryButtonState() {
        return this.primaryButtonState;
    }

    public final String getPublishableKey() {
        return this.publishableKey;
    }

    public final int getSecondaryButtonLabel() {
        return this.secondaryButtonLabel;
    }

    public final List<SupportedPaymentMethod> getSupportedTypes() {
        return this.supportedTypes;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
        if (r2 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void init(boolean z) {
        Map<IdentifierSpec, String> emptyMap;
        Map<String, Object> paramMap;
        PaymentMethodCreateParams prefilledCardParams$link_release = this.args.getPrefilledCardParams$link_release();
        if (prefilledCardParams$link_release != null && (paramMap = prefilledCardParams$link_release.toParamMap()) != null) {
            if (!z) {
                paramMap = null;
            }
            if (paramMap != null) {
                emptyMap = ConvertToFormValuesMapKt.convertToFormValuesMap(paramMap);
            }
        }
        emptyMap = MapsKt__MapsKt.emptyMap();
        updateFormController(emptyMap);
    }

    public final InterfaceC32730Eu1<Boolean> isEnabled() {
        return this.isEnabled;
    }

    public final void onFinancialConnectionsAccountLinked(FinancialConnectionsSheetLinkResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof FinancialConnectionsSheetLinkResult.Canceled) {
            setState(PrimaryButtonState.Enabled);
        } else if (result instanceof FinancialConnectionsSheetLinkResult.Failed) {
            onError(((FinancialConnectionsSheetLinkResult.Failed) result).getError());
        } else if (result instanceof FinancialConnectionsSheetLinkResult.Completed) {
            Z30.m73800d(C36218Tr6.m82333a(this), null, null, new PaymentMethodViewModel$onFinancialConnectionsAccountLinked$1(this, result, null), 3, null);
        }
    }

    public final void onPaymentMethodSelected(SupportedPaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        this._paymentMethod.setValue(paymentMethod);
        updateFormController$default(this, null, 1, null);
    }

    public final void onSecondaryButtonClick() {
        if (this.isRootScreen) {
            payAnotherWay();
        } else {
            this.navigator.onBack(true);
        }
    }

    public final void startPayment(Map<IdentifierSpec, FormFieldEntry> formValues) {
        Intrinsics.checkNotNullParameter(formValues, "formValues");
        clearError();
        setState(PrimaryButtonState.Processing);
        int i = WhenMappings.$EnumSwitchMapping$0[this.paymentMethod.getValue().ordinal()];
        if (i != 1) {
            if (i == 2) {
                Z30.m73800d(C36218Tr6.m82333a(this), null, null, new PaymentMethodViewModel$startPayment$2(this, null), 3, null);
                return;
            }
            return;
        }
        Z30.m73800d(C36218Tr6.m82333a(this), null, null, new PaymentMethodViewModel$startPayment$1(this, FieldValuesToParamsMapConverter.Companion.transformToPaymentMethodCreateParams(formValues, this.paymentMethod.getValue().getType(), false), null), 3, null);
    }

    private final void onError(ErrorMessage errorMessage) {
        setState(PrimaryButtonState.Enabled);
        this._errorMessage.setValue(errorMessage);
    }
}
