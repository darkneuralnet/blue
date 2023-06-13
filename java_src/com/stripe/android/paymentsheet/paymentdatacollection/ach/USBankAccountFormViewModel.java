package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import android.app.Application;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C11747p;
import androidx.lifecycle.C11750q;
import androidx.lifecycle.C11759u;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.injection.InjectWithFallbackKt;
import com.stripe.android.core.injection.Injectable;
import com.stripe.android.core.injection.Injector;
import com.stripe.android.core.injection.InjectorKey;
import com.stripe.android.core.injection.InjectorKt;
import com.stripe.android.financialconnections.model.BankAccount;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import com.stripe.android.financialconnections.model.PaymentAccount;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.p049ui.core.Amount;
import com.stripe.android.p049ui.core.elements.SaveForFutureUseElement;
import com.stripe.android.p049ui.core.elements.SaveForFutureUseSpec;
import com.stripe.android.payments.bankaccount.CollectBankAccountConfiguration;
import com.stripe.android.payments.bankaccount.CollectBankAccountLauncher;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResult;
import com.stripe.android.paymentsheet.C19159R;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.addresselement.AddressDetails;
import com.stripe.android.paymentsheet.model.ClientSecret;
import com.stripe.android.paymentsheet.model.PaymentIntentClientSecret;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.SetupIntentClientSecret;
import com.stripe.android.paymentsheet.paymentdatacollection.FormArguments;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormScreenState;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.p045di.DaggerUSBankAccountFormComponent;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.p045di.USBankAccountFormViewModelSubcomponent;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.uicore.elements.EmailConfig;
import com.stripe.android.uicore.elements.FormElement;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.NameConfig;
import com.stripe.android.uicore.elements.SimpleTextFieldController;
import com.stripe.android.uicore.elements.TextFieldController;
import com.stripe.android.uicore.forms.FormFieldEntry;
import com.stripe.android.utils.CreationExtrasKtxKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC43640jz5;
@Metadata(m28433d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u0000 c2\u00020\u0001:\u0003dceB7\b\u0001\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010*\u001a\u00020)\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,\u0012\u0006\u00101\u001a\u000200¢\u0006\u0004\ba\u0010bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J4\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0002J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\u0006H\u0002J\b\u0010\u0010\u001a\u00020\u0006H\u0002J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0007J\u000e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017J\u0019\u0010\u001c\u001a\u00020\u00042\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0006\u0010\u001e\u001a\u00020\u0004J\u0006\u0010\u001f\u001a\u00020\u0006J\u000e\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0017\u00104\u001a\u0002038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001d\u00109\u001a\b\u0012\u0004\u0012\u00020\u0006088\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010=\u001a\u0002038\u0006¢\u0006\f\n\u0004\b=\u00105\u001a\u0004\b>\u00107R\u001f\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0006088\u0006¢\u0006\f\n\u0004\b?\u0010:\u001a\u0004\b@\u0010<R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00170A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0017\u0010E\u001a\u00020D8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u001d\u0010I\u001a\b\u0012\u0004\u0012\u00020 088\u0006¢\u0006\f\n\u0004\bI\u0010:\u001a\u0004\bJ\u0010<R\u001d\u0010K\u001a\b\u0012\u0004\u0012\u00020 088\u0006¢\u0006\f\n\u0004\bK\u0010:\u001a\u0004\bL\u0010<R\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020 0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010CR*\u0010O\u001a\u0004\u0018\u00010N8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bO\u0010P\u0012\u0004\bU\u0010V\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR$\u0010\\\u001a\u00020 2\u0006\u0010W\u001a\u00020 8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u0017\u0010^\u001a\b\u0012\u0004\u0012\u00020\u0017088F¢\u0006\u0006\u001a\u0004\b]\u0010<R\u0017\u0010`\u001a\b\u0012\u0004\u0012\u00020 088F¢\u0006\u0006\u001a\u0004\b_\u0010<¨\u0006f"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;", "LOr6;", "Lcom/stripe/android/paymentsheet/model/ClientSecret;", "clientSecret", "", "collectBankAccount", "", "intentId", "linkAccountId", "bankName", "last4", "attachFinancialAccountToIntent", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;", "paymentSelection", "confirm", "buildPrimaryButtonText", "buildMandateText", "Landroidx/fragment/app/Fragment;", "fragment", "registerFragment", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "handleCollectBankAccountResult", "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState;", "screenState", "handlePrimaryButtonClick", "", "error", "reset", "(Ljava/lang/Integer;)V", "onDestroy", "formattedMerchantName", "", "enabled", "setProcessing", "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;", "args", "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;", "Landroid/app/Application;", "application", "Landroid/app/Application;", "Lcom/stripe/android/networking/StripeRepository;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "LY94;", "Lcom/stripe/android/PaymentConfiguration;", "lazyPaymentConfig", "LY94;", "Landroidx/lifecycle/p;", "savedStateHandle", "Landroidx/lifecycle/p;", "Lcom/stripe/android/uicore/elements/TextFieldController;", "nameController", "Lcom/stripe/android/uicore/elements/TextFieldController;", "getNameController", "()Lcom/stripe/android/uicore/elements/TextFieldController;", "LtP5;", "name", "LtP5;", "getName", "()LtP5;", "emailController", "getEmailController", "email", "getEmail", "LGX2;", "_currentScreenState", "LGX2;", "Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;", "saveForFutureUseElement", "Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;", "getSaveForFutureUseElement", "()Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;", "saveForFutureUse", "getSaveForFutureUse", "requiredFields", "getRequiredFields", "_processing", "Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;", "collectBankAccountLauncher", "Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;", "getCollectBankAccountLauncher", "()Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;", "setCollectBankAccountLauncher", "(Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;)V", "getCollectBankAccountLauncher$annotations", "()V", "value", "getHasLaunched", "()Z", "setHasLaunched", "(Z)V", "hasLaunched", "getCurrentScreenState", "currentScreenState", "getProcessing", BaseSheetViewModel.SAVE_PROCESSING, "<init>", "(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;Landroid/app/Application;Lcom/stripe/android/networking/StripeRepository;LY94;Landroidx/lifecycle/p;)V", "Companion", "Args", "Factory", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nUSBankAccountFormViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 USBankAccountFormViewModel.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 6 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,508:1\n47#2:509\n49#2:513\n47#2:514\n49#2:518\n47#2:519\n49#2:523\n47#2:524\n49#2:528\n50#3:510\n55#3:512\n50#3:515\n55#3:517\n50#3:520\n55#3:522\n50#3:525\n55#3:527\n106#4:511\n106#4:516\n106#4:521\n106#4:526\n230#5,5:529\n230#5,5:534\n230#5,5:539\n230#5,5:544\n230#5,5:549\n230#5,5:560\n141#6:554\n130#6,5:555\n*S KotlinDebug\n*F\n+ 1 USBankAccountFormViewModel.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel\n*L\n69#1:509\n69#1:513\n76#1:514\n76#1:518\n101#1:519\n101#1:523\n104#1:524\n104#1:528\n69#1:510\n69#1:512\n76#1:515\n76#1:517\n101#1:520\n101#1:522\n104#1:525\n104#1:527\n69#1:511\n76#1:516\n101#1:521\n104#1:526\n124#1:529,5\n162#1:534,5\n179#1:539,5\n259#1:544,5\n273#1:549,5\n289#1:560,5\n285#1:554\n285#1:555,5\n*E\n"})
/* loaded from: classes7.dex */
public final class USBankAccountFormViewModel extends AbstractC35048Or6 {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String HAS_LAUNCHED_KEY = "has_launched";
    private final GX2<USBankAccountFormScreenState> _currentScreenState;
    private final GX2<Boolean> _processing;
    private final Application application;
    private final Args args;
    private CollectBankAccountLauncher collectBankAccountLauncher;
    private final InterfaceC49220tP5<String> email;
    private final TextFieldController emailController;
    private final Y94<PaymentConfiguration> lazyPaymentConfig;
    private final InterfaceC49220tP5<String> name;
    private final TextFieldController nameController;
    private final InterfaceC49220tP5<Boolean> requiredFields;
    private final InterfaceC49220tP5<Boolean> saveForFutureUse;
    private final SaveForFutureUseElement saveForFutureUseElement;
    private final C11747p savedStateHandle;
    private final StripeRepository stripeRepository;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Companion;", "", "()V", "HAS_LAUNCHED_KEY", "", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001dB\u0015\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u0003H\u0016R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R(\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Factory;", "Landroidx/lifecycle/u$b;", "Lcom/stripe/android/core/injection/Injectable;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Factory$FallbackInitializeParam;", "LOr6;", "T", "Ljava/lang/Class;", "modelClass", "LFE0;", "extras", "create", "(Ljava/lang/Class;LFE0;)LOr6;", "arg", "Lcom/stripe/android/core/injection/Injector;", "fallbackInitialize", "Lkotlin/Function0;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;", "argsSupplier", "Lkotlin/jvm/functions/Function0;", "LY94;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/di/USBankAccountFormViewModelSubcomponent$Builder;", "subComponentBuilderProvider", "LY94;", "getSubComponentBuilderProvider", "()LY94;", "setSubComponentBuilderProvider", "(LY94;)V", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "FallbackInitializeParam", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Factory implements C11759u.InterfaceC11763b, Injectable<FallbackInitializeParam> {
        private final Function0<Args> argsSupplier;
        public Y94<USBankAccountFormViewModelSubcomponent.Builder> subComponentBuilderProvider;

        @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Factory$FallbackInitializeParam;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "getApplication", "()Landroid/app/Application;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
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

        public Factory(Function0<Args> argsSupplier) {
            Intrinsics.checkNotNullParameter(argsSupplier, "argsSupplier");
            this.argsSupplier = argsSupplier;
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public /* bridge */ /* synthetic */ AbstractC35048Or6 create(Class cls) {
            return super.create(cls);
        }

        public final Y94<USBankAccountFormViewModelSubcomponent.Builder> getSubComponentBuilderProvider() {
            Y94<USBankAccountFormViewModelSubcomponent.Builder> y94 = this.subComponentBuilderProvider;
            if (y94 != null) {
                return y94;
            }
            Intrinsics.throwUninitializedPropertyAccessException("subComponentBuilderProvider");
            return null;
        }

        public final void setSubComponentBuilderProvider(Y94<USBankAccountFormViewModelSubcomponent.Builder> y94) {
            Intrinsics.checkNotNullParameter(y94, "<set-?>");
            this.subComponentBuilderProvider = y94;
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public <T extends AbstractC35048Or6> T create(Class<T> modelClass, FE0 extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            Args invoke = this.argsSupplier.invoke();
            Application requireApplication = CreationExtrasKtxKt.requireApplication(extras);
            C11747p m66936a = C11750q.m66936a(extras);
            InjectWithFallbackKt.injectWithFallback(this, invoke.getInjectorKey$paymentsheet_release(), new FallbackInitializeParam(requireApplication));
            USBankAccountFormViewModel viewModel = getSubComponentBuilderProvider().get().configuration(invoke).savedStateHandle(m66936a).build().getViewModel();
            Intrinsics.checkNotNull(viewModel, "null cannot be cast to non-null type T of com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel.Factory.create");
            return viewModel;
        }

        @Override // com.stripe.android.core.injection.Injectable
        public Injector fallbackInitialize(FallbackInitializeParam arg) {
            Intrinsics.checkNotNullParameter(arg, "arg");
            DaggerUSBankAccountFormComponent.builder().application(arg.getApplication()).injectorKey(InjectorKt.DUMMY_INJECTOR_KEY).build().inject(this);
            return null;
        }
    }

    public USBankAccountFormViewModel(Args args, Application application, StripeRepository stripeRepository, Y94<PaymentConfiguration> lazyPaymentConfig, C11747p savedStateHandle) {
        String str;
        String str2;
        PaymentMethodCreateParams paymentMethodCreateParams;
        USBankAccountFormScreenState value;
        String value2;
        String value3;
        PaymentMethod.BillingDetails billingDetails;
        String value4;
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(lazyPaymentConfig, "lazyPaymentConfig");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.args = args;
        this.application = application;
        this.stripeRepository = stripeRepository;
        this.lazyPaymentConfig = lazyPaymentConfig;
        this.savedStateHandle = savedStateHandle;
        NameConfig.Companion companion = NameConfig.Companion;
        PaymentSheet.BillingDetails billingDetails2 = args.getFormArgs().getBillingDetails();
        if (billingDetails2 != null) {
            str = billingDetails2.getName();
        } else {
            str = null;
        }
        SimpleTextFieldController createController = companion.createController(str);
        this.nameController = createController;
        final InterfaceC32730Eu1<FormFieldEntry> formFieldValue = createController.getFormFieldValue();
        InterfaceC32730Eu1<String> interfaceC32730Eu1 = new InterfaceC32730Eu1<String>() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$1

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 USBankAccountFormViewModel.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,222:1\n48#2:223\n70#3:224\n1#4:225\n*E\n"})
            /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$1$2 */
            /* loaded from: classes7.dex */
            public static final class C192652<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$1$2", m28418f = "USBankAccountFormViewModel.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$1$2$1 */
                /* loaded from: classes7.dex */
                public static final class C192661 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C192661(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C192652.this.emit(null, this);
                    }
                }

                public C192652(InterfaceC33198Gu1 interfaceC33198Gu1) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C192661 c192661;
                    Object coroutine_suspended;
                    int i;
                    if (continuation instanceof C192661) {
                        c192661 = (C192661) continuation;
                        int i2 = c192661.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c192661.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c192661.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c192661.label;
                            if (i == 0) {
                                if (i == 1) {
                                    ResultKt.throwOnFailure(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                FormFieldEntry formFieldEntry = (FormFieldEntry) obj;
                                if (!formFieldEntry.isComplete()) {
                                    formFieldEntry = null;
                                }
                                String str = (formFieldEntry == null || (str = formFieldEntry.getValue()) == null) ? "" : "";
                                c192661.label = 1;
                                if (interfaceC33198Gu1.emit(str, c192661) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c192661 = new C192661(continuation);
                    Object obj22 = c192661.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c192661.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super String> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C192652(interfaceC33198Gu1), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
        ZC0 m82333a = C36218Tr6.m82333a(this);
        InterfaceC43640jz5.C25067a c25067a = InterfaceC43640jz5.f93705a;
        InterfaceC49220tP5<String> m79273O = C36708Vu1.m79273O(interfaceC32730Eu1, m82333a, c25067a.m29521c(), "");
        this.name = m79273O;
        EmailConfig.Companion companion2 = EmailConfig.Companion;
        PaymentSheet.BillingDetails billingDetails3 = args.getFormArgs().getBillingDetails();
        if (billingDetails3 != null) {
            str2 = billingDetails3.getEmail();
        } else {
            str2 = null;
        }
        SimpleTextFieldController createController2 = companion2.createController(str2);
        this.emailController = createController2;
        final InterfaceC32730Eu1<FormFieldEntry> formFieldValue2 = createController2.getFormFieldValue();
        InterfaceC49220tP5<String> m79273O2 = C36708Vu1.m79273O(new InterfaceC32730Eu1<String>() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$2

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 USBankAccountFormViewModel.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,222:1\n48#2:223\n77#3:224\n1#4:225\n*E\n"})
            /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$2$2 */
            /* loaded from: classes7.dex */
            public static final class C192672<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$2$2", m28418f = "USBankAccountFormViewModel.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$2$2$1 */
                /* loaded from: classes7.dex */
                public static final class C192681 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C192681(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C192672.this.emit(null, this);
                    }
                }

                public C192672(InterfaceC33198Gu1 interfaceC33198Gu1) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C192681 c192681;
                    Object coroutine_suspended;
                    int i;
                    if (continuation instanceof C192681) {
                        c192681 = (C192681) continuation;
                        int i2 = c192681.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c192681.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c192681.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c192681.label;
                            if (i == 0) {
                                if (i == 1) {
                                    ResultKt.throwOnFailure(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                FormFieldEntry formFieldEntry = (FormFieldEntry) obj;
                                String str = null;
                                if (!formFieldEntry.isComplete()) {
                                    formFieldEntry = null;
                                }
                                if (formFieldEntry != null) {
                                    str = formFieldEntry.getValue();
                                }
                                c192681.label = 1;
                                if (interfaceC33198Gu1.emit(str, c192681) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c192681 = new C192681(continuation);
                    Object obj22 = c192681.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c192681.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super String> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C192672(interfaceC33198Gu1), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        }, C36218Tr6.m82333a(this), c25067a.m29521c(), null);
        this.email = m79273O2;
        String value5 = m79273O.getValue();
        String value6 = m79273O2.getValue();
        String string = application.getString(C19159R.string.stripe_continue_button_label);
        Intrinsics.checkNotNullExpressionValue(string, "application.getString(\n …n_label\n                )");
        GX2<USBankAccountFormScreenState> m8742a = C50405vP5.m8742a(new USBankAccountFormScreenState.NameAndEmailCollection(null, value5, value6, string, 1, null));
        this._currentScreenState = m8742a;
        FormElement transform = new SaveForFutureUseSpec((IdentifierSpec) null, 1, (DefaultConstructorMarker) null).transform(args.getFormArgs().getShowCheckbox(), args.getFormArgs().getMerchantName());
        Intrinsics.checkNotNull(transform, "null cannot be cast to non-null type com.stripe.android.ui.core.elements.SaveForFutureUseElement");
        SaveForFutureUseElement saveForFutureUseElement = (SaveForFutureUseElement) transform;
        this.saveForFutureUseElement = saveForFutureUseElement;
        this.saveForFutureUse = C36708Vu1.m79273O(saveForFutureUseElement.getController().getSaveForFutureUse(), C36218Tr6.m82333a(this), c25067a.m29520d(), Boolean.valueOf(args.getFormArgs().getShowCheckbox()));
        final InterfaceC32730Eu1<FormFieldEntry> formFieldValue3 = createController.getFormFieldValue();
        InterfaceC32730Eu1<Boolean> interfaceC32730Eu12 = new InterfaceC32730Eu1<Boolean>() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$3

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 USBankAccountFormViewModel.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel\n*L\n1#1,222:1\n48#2:223\n102#3:224\n*E\n"})
            /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$3$2 */
            /* loaded from: classes7.dex */
            public static final class C192692<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$3$2", m28418f = "USBankAccountFormViewModel.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$3$2$1 */
                /* loaded from: classes7.dex */
                public static final class C192701 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C192701(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C192692.this.emit(null, this);
                    }
                }

                public C192692(InterfaceC33198Gu1 interfaceC33198Gu1) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C192701 c192701;
                    Object coroutine_suspended;
                    int i;
                    if (continuation instanceof C192701) {
                        c192701 = (C192701) continuation;
                        int i2 = c192701.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c192701.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c192701.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c192701.label;
                            if (i == 0) {
                                if (i == 1) {
                                    ResultKt.throwOnFailure(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                Boolean boxBoolean = Boxing.boxBoolean(((FormFieldEntry) obj).isComplete());
                                c192701.label = 1;
                                if (interfaceC33198Gu1.emit(boxBoolean, c192701) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c192701 = new C192701(continuation);
                    Object obj22 = c192701.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c192701.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super Boolean> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C192692(interfaceC33198Gu1), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
        final InterfaceC32730Eu1<FormFieldEntry> formFieldValue4 = createController2.getFormFieldValue();
        InterfaceC32730Eu1 m79257n = C36708Vu1.m79257n(interfaceC32730Eu12, new InterfaceC32730Eu1<Boolean>() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$4

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 USBankAccountFormViewModel.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel\n*L\n1#1,222:1\n48#2:223\n105#3:224\n*E\n"})
            /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$4$2 */
            /* loaded from: classes7.dex */
            public static final class C192712<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$4$2", m28418f = "USBankAccountFormViewModel.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$4$2$1 */
                /* loaded from: classes7.dex */
                public static final class C192721 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C192721(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C192712.this.emit(null, this);
                    }
                }

                public C192712(InterfaceC33198Gu1 interfaceC33198Gu1) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C192721 c192721;
                    Object coroutine_suspended;
                    int i;
                    if (continuation instanceof C192721) {
                        c192721 = (C192721) continuation;
                        int i2 = c192721.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c192721.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c192721.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c192721.label;
                            if (i == 0) {
                                if (i == 1) {
                                    ResultKt.throwOnFailure(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                Boolean boxBoolean = Boxing.boxBoolean(((FormFieldEntry) obj).isComplete());
                                c192721.label = 1;
                                if (interfaceC33198Gu1.emit(boxBoolean, c192721) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c192721 = new C192721(continuation);
                    Object obj22 = c192721.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c192721.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super Boolean> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C192712(interfaceC33198Gu1), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        }, new USBankAccountFormViewModel$requiredFields$3(null));
        ZC0 m82333a2 = C36218Tr6.m82333a(this);
        InterfaceC43640jz5 m29522b = InterfaceC43640jz5.C25067a.m29522b(c25067a, 0L, 0L, 3, null);
        Boolean bool = Boolean.FALSE;
        this.requiredFields = C36708Vu1.m79273O(m79257n, m82333a2, m29522b, bool);
        this._processing = C50405vP5.m8742a(bool);
        PaymentSelection.New.USBankAccount savedPaymentMethod = args.getSavedPaymentMethod();
        if (savedPaymentMethod != null && (paymentMethodCreateParams = savedPaymentMethod.getPaymentMethodCreateParams()) != null) {
            do {
                value = m8742a.getValue();
                PaymentMethod.BillingDetails billingDetails4 = paymentMethodCreateParams.getBillingDetails();
                value3 = (billingDetails4 == null || (value2 = billingDetails4.name) == null) ? this.name.getValue() : value2;
                billingDetails = paymentMethodCreateParams.getBillingDetails();
            } while (!m8742a.compareAndSet(value, new USBankAccountFormScreenState.SavedAccount(value3, (billingDetails == null || (value4 = billingDetails.email) == null) ? this.email.getValue() : value4, this.args.getSavedPaymentMethod().getFinancialConnectionsSessionId(), this.args.getSavedPaymentMethod().getIntentId(), this.args.getSavedPaymentMethod().getBankName(), this.args.getSavedPaymentMethod().getLast4(), buildPrimaryButtonText(), buildMandateText(), this.args.getFormArgs().getShowCheckbox())));
        }
    }

    private final void attachFinancialAccountToIntent(ClientSecret clientSecret, String str, String str2, String str3, String str4) {
        if (str3 == null || str4 == null) {
            return;
        }
        Z30.m73800d(C36218Tr6.m82333a(this), null, null, new USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1(clientSecret, this, str, str2, str4, str3, null), 3, null);
    }

    private final String buildMandateText() {
        if (this.saveForFutureUse.getValue().booleanValue()) {
            String string = this.application.getString(C19159R.string.stripe_paymentsheet_ach_save_mandate, formattedMerchantName());
            Intrinsics.checkNotNullExpressionValue(string, "{\n            applicatio…)\n            )\n        }");
            return string;
        }
        return ACHText.INSTANCE.getContinueMandateText(this.application);
    }

    private final String buildPrimaryButtonText() {
        if (this.args.isCompleteFlow()) {
            if (this.args.getClientSecret() instanceof PaymentIntentClientSecret) {
                Amount amount = this.args.getFormArgs().getAmount();
                Intrinsics.checkNotNull(amount);
                Resources resources = this.application.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "application.resources");
                return amount.buildPayButtonLabel(resources);
            }
            String string = this.application.getString(C19159R.string.stripe_setup_button_label);
            Intrinsics.checkNotNullExpressionValue(string, "{\n                    ap…      )\n                }");
            return string;
        }
        String string2 = this.application.getString(C19159R.string.stripe_continue_button_label);
        Intrinsics.checkNotNullExpressionValue(string2, "application.getString(\n …utton_label\n            )");
        return string2;
    }

    private final void collectBankAccount(ClientSecret clientSecret) {
        CollectBankAccountLauncher collectBankAccountLauncher;
        if (getHasLaunched()) {
            return;
        }
        setHasLaunched(true);
        if (clientSecret instanceof PaymentIntentClientSecret) {
            CollectBankAccountLauncher collectBankAccountLauncher2 = this.collectBankAccountLauncher;
            if (collectBankAccountLauncher2 != null) {
                collectBankAccountLauncher2.presentWithPaymentIntent(this.lazyPaymentConfig.get().getPublishableKey(), this.lazyPaymentConfig.get().getStripeAccountId(), clientSecret.getValue(), new CollectBankAccountConfiguration.USBankAccount(this.name.getValue(), this.email.getValue()));
            }
        } else if ((clientSecret instanceof SetupIntentClientSecret) && (collectBankAccountLauncher = this.collectBankAccountLauncher) != null) {
            collectBankAccountLauncher.presentWithSetupIntent(this.lazyPaymentConfig.get().getPublishableKey(), this.lazyPaymentConfig.get().getStripeAccountId(), clientSecret.getValue(), new CollectBankAccountConfiguration.USBankAccount(this.name.getValue(), this.email.getValue()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void confirm(ClientSecret clientSecret, PaymentSelection.New r8) {
        Z30.m73800d(C36218Tr6.m82333a(this), null, null, new USBankAccountFormViewModel$confirm$1(clientSecret, this, r8, null), 3, null);
    }

    public static /* synthetic */ void getCollectBankAccountLauncher$annotations() {
    }

    private final boolean getHasLaunched() {
        return Intrinsics.areEqual(this.savedStateHandle.m66947f("has_launched"), Boolean.TRUE);
    }

    public static /* synthetic */ void reset$default(USBankAccountFormViewModel uSBankAccountFormViewModel, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        uSBankAccountFormViewModel.reset(num);
    }

    private final void setHasLaunched(boolean z) {
        this.savedStateHandle.m66940m("has_launched", Boolean.valueOf(z));
    }

    public final String formattedMerchantName() {
        CharSequence charSequence;
        boolean z;
        String merchantName = this.args.getFormArgs().getMerchantName();
        int length = merchantName.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (merchantName.charAt(length) == '.') {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    charSequence = merchantName.subSequence(0, length + 1);
                    break;
                } else if (i < 0) {
                    break;
                } else {
                    length = i;
                }
            }
        }
        charSequence = "";
        return charSequence.toString();
    }

    public final CollectBankAccountLauncher getCollectBankAccountLauncher() {
        return this.collectBankAccountLauncher;
    }

    public final InterfaceC49220tP5<USBankAccountFormScreenState> getCurrentScreenState() {
        return this._currentScreenState;
    }

    public final InterfaceC49220tP5<String> getEmail() {
        return this.email;
    }

    public final TextFieldController getEmailController() {
        return this.emailController;
    }

    public final InterfaceC49220tP5<String> getName() {
        return this.name;
    }

    public final TextFieldController getNameController() {
        return this.nameController;
    }

    public final InterfaceC49220tP5<Boolean> getProcessing() {
        return this._processing;
    }

    public final InterfaceC49220tP5<Boolean> getRequiredFields() {
        return this.requiredFields;
    }

    public final InterfaceC49220tP5<Boolean> getSaveForFutureUse() {
        return this.saveForFutureUse;
    }

    public final SaveForFutureUseElement getSaveForFutureUseElement() {
        return this.saveForFutureUseElement;
    }

    public final void handleCollectBankAccountResult(CollectBankAccountResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        setHasLaunched(false);
        if (result instanceof CollectBankAccountResult.Completed) {
            CollectBankAccountResult.Completed completed = (CollectBankAccountResult.Completed) result;
            PaymentAccount paymentAccount = completed.getResponse().getFinancialConnectionsSession().getPaymentAccount();
            if (paymentAccount instanceof BankAccount) {
                String id = completed.getResponse().getIntent().getId();
                if (id != null) {
                    GX2<USBankAccountFormScreenState> gx2 = this._currentScreenState;
                    do {
                    } while (!gx2.compareAndSet(gx2.getValue(), new USBankAccountFormScreenState.VerifyWithMicrodeposits(this.name.getValue(), this.email.getValue(), (BankAccount) paymentAccount, completed.getResponse().getFinancialConnectionsSession().getId(), id, buildPrimaryButtonText(), buildMandateText(), this.saveForFutureUse.getValue().booleanValue())));
                }
            } else if (paymentAccount instanceof FinancialConnectionsAccount) {
                String id2 = completed.getResponse().getIntent().getId();
                if (id2 != null) {
                    GX2<USBankAccountFormScreenState> gx22 = this._currentScreenState;
                    do {
                    } while (!gx22.compareAndSet(gx22.getValue(), new USBankAccountFormScreenState.MandateCollection(this.name.getValue(), this.email.getValue(), (FinancialConnectionsAccount) paymentAccount, completed.getResponse().getFinancialConnectionsSession().getId(), id2, buildPrimaryButtonText(), buildMandateText(), this.saveForFutureUse.getValue().booleanValue())));
                }
            } else if (paymentAccount == null) {
                reset(Integer.valueOf(C19159R.string.stripe_paymentsheet_ach_something_went_wrong));
            }
        } else if (result instanceof CollectBankAccountResult.Failed) {
            reset(Integer.valueOf(C19159R.string.stripe_paymentsheet_ach_something_went_wrong));
        } else if (result instanceof CollectBankAccountResult.Cancelled) {
            reset$default(this, null, 1, null);
        }
    }

    public final void handlePrimaryButtonClick(USBankAccountFormScreenState screenState) {
        ClientSecret clientSecret;
        USBankAccountFormScreenState.SavedAccount savedAccount;
        String financialConnectionsSessionId;
        Intrinsics.checkNotNullParameter(screenState, "screenState");
        GX2<USBankAccountFormScreenState> gx2 = this._currentScreenState;
        gx2.setValue(gx2.getValue().updateInputs(this.name.getValue(), this.email.getValue(), this.saveForFutureUse.getValue().booleanValue()));
        if (screenState instanceof USBankAccountFormScreenState.NameAndEmailCollection) {
            ClientSecret clientSecret2 = this.args.getClientSecret();
            if (clientSecret2 != null) {
                collectBankAccount(clientSecret2);
            }
        } else if (screenState instanceof USBankAccountFormScreenState.MandateCollection) {
            ClientSecret clientSecret3 = this.args.getClientSecret();
            if (clientSecret3 != null) {
                USBankAccountFormScreenState.MandateCollection mandateCollection = (USBankAccountFormScreenState.MandateCollection) screenState;
                attachFinancialAccountToIntent(clientSecret3, mandateCollection.getIntentId(), mandateCollection.getFinancialConnectionsSessionId(), mandateCollection.getPaymentAccount().getInstitutionName(), mandateCollection.getPaymentAccount().getLast4());
            }
        } else if (screenState instanceof USBankAccountFormScreenState.VerifyWithMicrodeposits) {
            ClientSecret clientSecret4 = this.args.getClientSecret();
            if (clientSecret4 != null) {
                USBankAccountFormScreenState.VerifyWithMicrodeposits verifyWithMicrodeposits = (USBankAccountFormScreenState.VerifyWithMicrodeposits) screenState;
                attachFinancialAccountToIntent(clientSecret4, verifyWithMicrodeposits.getIntentId(), verifyWithMicrodeposits.getFinancialConnectionsSessionId(), verifyWithMicrodeposits.getPaymentAccount().getBankName(), verifyWithMicrodeposits.getPaymentAccount().getLast4());
            }
        } else if ((screenState instanceof USBankAccountFormScreenState.SavedAccount) && (clientSecret = this.args.getClientSecret()) != null && (financialConnectionsSessionId = (savedAccount = (USBankAccountFormScreenState.SavedAccount) screenState).getFinancialConnectionsSessionId()) != null) {
            attachFinancialAccountToIntent(clientSecret, savedAccount.getIntentId(), financialConnectionsSessionId, savedAccount.getBankName(), savedAccount.getLast4());
        }
    }

    public final void onDestroy() {
        USBankAccountFormScreenState value;
        GX2<USBankAccountFormScreenState> gx2 = this._currentScreenState;
        do {
            value = gx2.getValue();
        } while (!gx2.compareAndSet(value, value.updateInputs(this.name.getValue(), this.email.getValue(), this.saveForFutureUse.getValue().booleanValue())));
        this.collectBankAccountLauncher = null;
    }

    public final void registerFragment(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.collectBankAccountLauncher = CollectBankAccountLauncher.Companion.create(fragment, new USBankAccountFormViewModel$registerFragment$1(this));
    }

    public final void reset(Integer num) {
        USBankAccountFormScreenState value;
        String string;
        setHasLaunched(false);
        this.saveForFutureUseElement.getController().onValueChange(true);
        GX2<USBankAccountFormScreenState> gx2 = this._currentScreenState;
        do {
            value = gx2.getValue();
            string = this.application.getString(C19159R.string.stripe_continue_button_label);
            Intrinsics.checkNotNullExpressionValue(string, "application.getString(\n …n_label\n                )");
        } while (!gx2.compareAndSet(value, new USBankAccountFormScreenState.NameAndEmailCollection(num, this.name.getValue(), this.email.getValue(), string)));
    }

    public final void setCollectBankAccountLauncher(CollectBankAccountLauncher collectBankAccountLauncher) {
        this.collectBankAccountLauncher = collectBankAccountLauncher;
    }

    public final void setProcessing(boolean z) {
        Boolean value;
        GX2<Boolean> gx2 = this._processing;
        do {
            value = gx2.getValue();
            value.booleanValue();
        } while (!gx2.compareAndSet(value, Boolean.valueOf(z)));
    }

    @Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\r\u0012\b\b\u0003\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0015\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rHÆ\u0003J\u0015\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\rHÆ\u0003J\u000e\u0010*\u001a\u00020\u0013HÀ\u0003¢\u0006\u0002\b+Jw\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\r2\b\b\u0003\u0010\u0012\u001a\u00020\u0013HÆ\u0001J\u0013\u0010-\u001a\u00020\u00052\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0012\u001a\u00020\u0013X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u001bR\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00062"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;", "", "formArgs", "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;", "isCompleteFlow", "", "clientSecret", "Lcom/stripe/android/paymentsheet/model/ClientSecret;", "savedPaymentMethod", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;", "shippingDetails", "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "onConfirmStripeIntent", "Lkotlin/Function1;", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "", "onUpdateSelectionAndFinish", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "injectorKey", "", "(Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;ZLcom/stripe/android/paymentsheet/model/ClientSecret;Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V", "getClientSecret", "()Lcom/stripe/android/paymentsheet/model/ClientSecret;", "getFormArgs", "()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;", "getInjectorKey$paymentsheet_release", "()Ljava/lang/String;", "()Z", "getOnConfirmStripeIntent", "()Lkotlin/jvm/functions/Function1;", "getOnUpdateSelectionAndFinish", "getSavedPaymentMethod", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;", "getShippingDetails", "()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component8$paymentsheet_release", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Args {
        public static final int $stable;
        private final ClientSecret clientSecret;
        private final FormArguments formArgs;
        private final String injectorKey;
        private final boolean isCompleteFlow;
        private final Function1<ConfirmStripeIntentParams, Unit> onConfirmStripeIntent;
        private final Function1<PaymentSelection, Unit> onUpdateSelectionAndFinish;
        private final PaymentSelection.New.USBankAccount savedPaymentMethod;
        private final AddressDetails shippingDetails;

        static {
            int i = PaymentMethodCreateParams.$stable;
            $stable = i | i | Amount.$stable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Args(FormArguments formArgs, boolean z, ClientSecret clientSecret, PaymentSelection.New.USBankAccount uSBankAccount, AddressDetails addressDetails, Function1<? super ConfirmStripeIntentParams, Unit> onConfirmStripeIntent, Function1<? super PaymentSelection, Unit> onUpdateSelectionAndFinish, @InjectorKey String injectorKey) {
            Intrinsics.checkNotNullParameter(formArgs, "formArgs");
            Intrinsics.checkNotNullParameter(onConfirmStripeIntent, "onConfirmStripeIntent");
            Intrinsics.checkNotNullParameter(onUpdateSelectionAndFinish, "onUpdateSelectionAndFinish");
            Intrinsics.checkNotNullParameter(injectorKey, "injectorKey");
            this.formArgs = formArgs;
            this.isCompleteFlow = z;
            this.clientSecret = clientSecret;
            this.savedPaymentMethod = uSBankAccount;
            this.shippingDetails = addressDetails;
            this.onConfirmStripeIntent = onConfirmStripeIntent;
            this.onUpdateSelectionAndFinish = onUpdateSelectionAndFinish;
            this.injectorKey = injectorKey;
        }

        public final FormArguments component1() {
            return this.formArgs;
        }

        public final boolean component2() {
            return this.isCompleteFlow;
        }

        public final ClientSecret component3() {
            return this.clientSecret;
        }

        public final PaymentSelection.New.USBankAccount component4() {
            return this.savedPaymentMethod;
        }

        public final AddressDetails component5() {
            return this.shippingDetails;
        }

        public final Function1<ConfirmStripeIntentParams, Unit> component6() {
            return this.onConfirmStripeIntent;
        }

        public final Function1<PaymentSelection, Unit> component7() {
            return this.onUpdateSelectionAndFinish;
        }

        public final String component8$paymentsheet_release() {
            return this.injectorKey;
        }

        public final Args copy(FormArguments formArgs, boolean z, ClientSecret clientSecret, PaymentSelection.New.USBankAccount uSBankAccount, AddressDetails addressDetails, Function1<? super ConfirmStripeIntentParams, Unit> onConfirmStripeIntent, Function1<? super PaymentSelection, Unit> onUpdateSelectionAndFinish, @InjectorKey String injectorKey) {
            Intrinsics.checkNotNullParameter(formArgs, "formArgs");
            Intrinsics.checkNotNullParameter(onConfirmStripeIntent, "onConfirmStripeIntent");
            Intrinsics.checkNotNullParameter(onUpdateSelectionAndFinish, "onUpdateSelectionAndFinish");
            Intrinsics.checkNotNullParameter(injectorKey, "injectorKey");
            return new Args(formArgs, z, clientSecret, uSBankAccount, addressDetails, onConfirmStripeIntent, onUpdateSelectionAndFinish, injectorKey);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Args) {
                Args args = (Args) obj;
                return Intrinsics.areEqual(this.formArgs, args.formArgs) && this.isCompleteFlow == args.isCompleteFlow && Intrinsics.areEqual(this.clientSecret, args.clientSecret) && Intrinsics.areEqual(this.savedPaymentMethod, args.savedPaymentMethod) && Intrinsics.areEqual(this.shippingDetails, args.shippingDetails) && Intrinsics.areEqual(this.onConfirmStripeIntent, args.onConfirmStripeIntent) && Intrinsics.areEqual(this.onUpdateSelectionAndFinish, args.onUpdateSelectionAndFinish) && Intrinsics.areEqual(this.injectorKey, args.injectorKey);
            }
            return false;
        }

        public final ClientSecret getClientSecret() {
            return this.clientSecret;
        }

        public final FormArguments getFormArgs() {
            return this.formArgs;
        }

        public final String getInjectorKey$paymentsheet_release() {
            return this.injectorKey;
        }

        public final Function1<ConfirmStripeIntentParams, Unit> getOnConfirmStripeIntent() {
            return this.onConfirmStripeIntent;
        }

        public final Function1<PaymentSelection, Unit> getOnUpdateSelectionAndFinish() {
            return this.onUpdateSelectionAndFinish;
        }

        public final PaymentSelection.New.USBankAccount getSavedPaymentMethod() {
            return this.savedPaymentMethod;
        }

        public final AddressDetails getShippingDetails() {
            return this.shippingDetails;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.formArgs.hashCode() * 31;
            boolean z = this.isCompleteFlow;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int i2 = (hashCode + i) * 31;
            ClientSecret clientSecret = this.clientSecret;
            int hashCode2 = (i2 + (clientSecret == null ? 0 : clientSecret.hashCode())) * 31;
            PaymentSelection.New.USBankAccount uSBankAccount = this.savedPaymentMethod;
            int hashCode3 = (hashCode2 + (uSBankAccount == null ? 0 : uSBankAccount.hashCode())) * 31;
            AddressDetails addressDetails = this.shippingDetails;
            return ((((((hashCode3 + (addressDetails != null ? addressDetails.hashCode() : 0)) * 31) + this.onConfirmStripeIntent.hashCode()) * 31) + this.onUpdateSelectionAndFinish.hashCode()) * 31) + this.injectorKey.hashCode();
        }

        public final boolean isCompleteFlow() {
            return this.isCompleteFlow;
        }

        public String toString() {
            FormArguments formArguments = this.formArgs;
            boolean z = this.isCompleteFlow;
            ClientSecret clientSecret = this.clientSecret;
            PaymentSelection.New.USBankAccount uSBankAccount = this.savedPaymentMethod;
            AddressDetails addressDetails = this.shippingDetails;
            Function1<ConfirmStripeIntentParams, Unit> function1 = this.onConfirmStripeIntent;
            Function1<PaymentSelection, Unit> function12 = this.onUpdateSelectionAndFinish;
            String str = this.injectorKey;
            return "Args(formArgs=" + formArguments + ", isCompleteFlow=" + z + ", clientSecret=" + clientSecret + ", savedPaymentMethod=" + uSBankAccount + ", shippingDetails=" + addressDetails + ", onConfirmStripeIntent=" + function1 + ", onUpdateSelectionAndFinish=" + function12 + ", injectorKey=" + str + ")";
        }

        public /* synthetic */ Args(FormArguments formArguments, boolean z, ClientSecret clientSecret, PaymentSelection.New.USBankAccount uSBankAccount, AddressDetails addressDetails, Function1 function1, Function1 function12, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(formArguments, z, clientSecret, uSBankAccount, addressDetails, function1, function12, (i & 128) != 0 ? InjectorKt.DUMMY_INJECTOR_KEY : str);
        }
    }
}
