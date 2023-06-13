package com.stripe.android.link.p042ui.inline;

import androidx.lifecycle.C11759u;
import com.stripe.android.core.Logger;
import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.injection.Injector;
import com.stripe.android.core.injection.NonFallbackInjectable;
import com.stripe.android.core.injection.NonFallbackInjector;
import com.stripe.android.core.model.CountryCode;
import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.analytics.LinkEventsReporter;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.p042ui.ErrorMessage;
import com.stripe.android.link.p042ui.ErrorMessageKt;
import com.stripe.android.link.p042ui.inline.UserInput;
import com.stripe.android.link.p042ui.signup.SignUpState;
import com.stripe.android.link.p042ui.signup.SignUpViewModel;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.uicore.elements.EmailConfig;
import com.stripe.android.uicore.elements.NameConfig;
import com.stripe.android.uicore.elements.PhoneNumberController;
import com.stripe.android.uicore.elements.SimpleTextFieldController;
import com.stripe.android.uicore.forms.FormFieldEntry;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.InterfaceC43640jz5;
@Metadata(m28433d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0001OB)\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\bM\u0010NJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002J\u001b\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0002J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0006\u0010\u0010\u001a\u00020\u0002J\u0006\u0010\u0011\u001a\u00020\u0002R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0016\u0010$\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0017\u0010&\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010+\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010/\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b/\u0010'\u001a\u0004\b0\u0010)R\u001c\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001c\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00103R\u001c\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00103R\u001a\u00108\u001a\b\u0012\u0004\u0012\u000207068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001d\u0010:\u001a\b\u0012\u0004\u0012\u000207018\u0006¢\u0006\f\n\u0004\b:\u00103\u001a\u0004\b;\u0010<R\u001c\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010=068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00109R\u001f\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010=018\u0006¢\u0006\f\n\u0004\b?\u00103\u001a\u0004\b@\u0010<R\u001f\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040A8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010 R\u0016\u0010H\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0011\u0010L\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\bJ\u0010K\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006P"}, m28432d2 = {"Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;", "LOr6;", "", "watchUserInput", "", "email", "phoneNumber", "name", "Lcom/stripe/android/link/ui/inline/UserInput;", "mapToUserInput", "lookupConsumerEmail", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearError", "", "error", "onError", "toggleExpanded", "logout", "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;", "config", "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;", "Lcom/stripe/android/link/account/LinkAccountManager;", "linkAccountManager", "Lcom/stripe/android/link/account/LinkAccountManager;", "Lcom/stripe/android/link/analytics/LinkEventsReporter;", "linkEventsReporter", "Lcom/stripe/android/link/analytics/LinkEventsReporter;", "Lcom/stripe/android/core/Logger;", "logger", "Lcom/stripe/android/core/Logger;", "", "isLoggedOut", "Z", "prefilledEmail", "Ljava/lang/String;", "prefilledPhone", "prefilledName", "Lcom/stripe/android/uicore/elements/SimpleTextFieldController;", "emailController", "Lcom/stripe/android/uicore/elements/SimpleTextFieldController;", "getEmailController", "()Lcom/stripe/android/uicore/elements/SimpleTextFieldController;", "Lcom/stripe/android/uicore/elements/PhoneNumberController;", "phoneController", "Lcom/stripe/android/uicore/elements/PhoneNumberController;", "getPhoneController", "()Lcom/stripe/android/uicore/elements/PhoneNumberController;", "nameController", "getNameController", "LtP5;", "consumerEmail", "LtP5;", "consumerPhoneNumber", "consumerName", "LGX2;", "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;", "_viewState", "LGX2;", "viewState", "getViewState", "()LtP5;", "Lcom/stripe/android/link/ui/ErrorMessage;", "_errorMessage", "errorMessage", "getErrorMessage", "LEu1;", "accountEmail", "LEu1;", "getAccountEmail", "()LEu1;", "hasExpanded", "Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer;", "debouncer", "Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer;", "getRequiresNameCollection", "()Z", "requiresNameCollection", "<init>", "(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/analytics/LinkEventsReporter;Lcom/stripe/android/core/Logger;)V", "Factory", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInlineSignupViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineSignupViewModel.kt\ncom/stripe/android/link/ui/inline/InlineSignupViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 6 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,245:1\n1#2:246\n47#3:247\n49#3:251\n47#3:252\n49#3:256\n47#3:257\n49#3:261\n47#3:262\n49#3:266\n50#4:248\n55#4:250\n50#4:253\n55#4:255\n50#4:258\n55#4:260\n50#4:263\n55#4:265\n106#5:249\n106#5:254\n106#5:259\n106#5:264\n230#6,5:267\n230#6,5:272\n230#6,5:277\n230#6,5:282\n*S KotlinDebug\n*F\n+ 1 InlineSignupViewModel.kt\ncom/stripe/android/link/ui/inline/InlineSignupViewModel\n*L\n59#1:247\n59#1:251\n66#1:252\n66#1:256\n73#1:257\n73#1:261\n91#1:262\n91#1:266\n59#1:248\n59#1:250\n66#1:253\n66#1:255\n73#1:258\n73#1:260\n91#1:263\n91#1:265\n59#1:249\n66#1:254\n73#1:259\n91#1:264\n107#1:267,5\n189#1:272,5\n197#1:277,5\n208#1:282,5\n*E\n"})
/* renamed from: com.stripe.android.link.ui.inline.InlineSignupViewModel */
/* loaded from: classes7.dex */
public final class InlineSignupViewModel extends AbstractC35048Or6 {
    private final GX2<ErrorMessage> _errorMessage;
    private final GX2<InlineSignupViewState> _viewState;
    private final InterfaceC32730Eu1<String> accountEmail;
    private final LinkPaymentLauncher.Configuration config;
    private final InterfaceC49220tP5<String> consumerEmail;
    private final InterfaceC49220tP5<String> consumerName;
    private final InterfaceC49220tP5<String> consumerPhoneNumber;
    private SignUpViewModel.Debouncer debouncer;
    private final SimpleTextFieldController emailController;
    private final InterfaceC49220tP5<ErrorMessage> errorMessage;
    private boolean hasExpanded;
    private final boolean isLoggedOut;
    private final LinkAccountManager linkAccountManager;
    private final LinkEventsReporter linkEventsReporter;
    private final Logger logger;
    private final SimpleTextFieldController nameController;
    private final PhoneNumberController phoneController;
    private final String prefilledEmail;
    private final String prefilledName;
    private final String prefilledPhone;
    private final InterfaceC49220tP5<InlineSignupViewState> viewState;

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m28432d2 = {"Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$Factory;", "Landroidx/lifecycle/u$b;", "Lcom/stripe/android/core/injection/NonFallbackInjectable;", "LOr6;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)LOr6;", "Lcom/stripe/android/core/injection/NonFallbackInjector;", "injector", "Lcom/stripe/android/core/injection/NonFallbackInjector;", "Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;", "viewModel", "Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;", "getViewModel", "()Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;", "setViewModel", "(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;)V", "<init>", "(Lcom/stripe/android/core/injection/NonFallbackInjector;)V", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: com.stripe.android.link.ui.inline.InlineSignupViewModel$Factory */
    /* loaded from: classes7.dex */
    public static final class Factory implements C11759u.InterfaceC11763b, NonFallbackInjectable {
        private final NonFallbackInjector injector;
        public InlineSignupViewModel viewModel;

        public Factory(NonFallbackInjector injector) {
            Intrinsics.checkNotNullParameter(injector, "injector");
            this.injector = injector;
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public /* bridge */ /* synthetic */ AbstractC35048Or6 create(Class cls, FE0 fe0) {
            return super.create(cls, fe0);
        }

        @Override // com.stripe.android.core.injection.Injectable
        public /* bridge */ /* synthetic */ Injector fallbackInitialize(Unit unit) {
            return (Injector) fallbackInitialize2(unit);
        }

        public final InlineSignupViewModel getViewModel() {
            InlineSignupViewModel inlineSignupViewModel = this.viewModel;
            if (inlineSignupViewModel != null) {
                return inlineSignupViewModel;
            }
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            return null;
        }

        public final void setViewModel(InlineSignupViewModel inlineSignupViewModel) {
            Intrinsics.checkNotNullParameter(inlineSignupViewModel, "<set-?>");
            this.viewModel = inlineSignupViewModel;
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public <T extends AbstractC35048Or6> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            this.injector.inject(this);
            InlineSignupViewModel viewModel = getViewModel();
            Intrinsics.checkNotNull(viewModel, "null cannot be cast to non-null type T of com.stripe.android.link.ui.inline.InlineSignupViewModel.Factory.create");
            return viewModel;
        }

        @Override // com.stripe.android.core.injection.NonFallbackInjectable
        /* renamed from: fallbackInitialize  reason: avoid collision after fix types in other method */
        public Void fallbackInitialize2(Unit unit) {
            return NonFallbackInjectable.DefaultImpls.fallbackInitialize(this, unit);
        }
    }

    public InlineSignupViewModel(LinkPaymentLauncher.Configuration config, LinkAccountManager linkAccountManager, LinkEventsReporter linkEventsReporter, Logger logger) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(linkAccountManager, "linkAccountManager");
        Intrinsics.checkNotNullParameter(linkEventsReporter, "linkEventsReporter");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.config = config;
        this.linkAccountManager = linkAccountManager;
        this.linkEventsReporter = linkEventsReporter;
        this.logger = logger;
        boolean hasUserLoggedOut = linkAccountManager.hasUserLoggedOut(config.getCustomerEmail());
        this.isLoggedOut = hasUserLoggedOut;
        String customerEmail = hasUserLoggedOut ? null : config.getCustomerEmail();
        this.prefilledEmail = customerEmail;
        String str = (config.getCustomerPhone() == null || hasUserLoggedOut) ? null : str;
        str = str == null ? "" : str;
        this.prefilledPhone = str;
        String str2 = (config.getCustomerName() == null || hasUserLoggedOut) ? null : str2;
        this.prefilledName = str2;
        SimpleTextFieldController createController = EmailConfig.Companion.createController(customerEmail);
        this.emailController = createController;
        PhoneNumberController createPhoneNumberController = PhoneNumberController.Companion.createPhoneNumberController(str, config.getCustomerBillingCountryCode());
        this.phoneController = createPhoneNumberController;
        SimpleTextFieldController createController2 = NameConfig.Companion.createController(str2);
        this.nameController = createController2;
        final InterfaceC32730Eu1<FormFieldEntry> formFieldValue = createController.getFormFieldValue();
        InterfaceC32730Eu1<String> interfaceC32730Eu1 = new InterfaceC32730Eu1<String>() { // from class: com.stripe.android.link.ui.inline.InlineSignupViewModel$special$$inlined$map$1

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 InlineSignupViewModel.kt\ncom/stripe/android/link/ui/inline/InlineSignupViewModel\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,222:1\n48#2:223\n59#3:224\n1#4:225\n*E\n"})
            /* renamed from: com.stripe.android.link.ui.inline.InlineSignupViewModel$special$$inlined$map$1$2 */
            /* loaded from: classes7.dex */
            public static final class C190152<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.link.ui.inline.InlineSignupViewModel$special$$inlined$map$1$2", m28418f = "InlineSignupViewModel.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.link.ui.inline.InlineSignupViewModel$special$$inlined$map$1$2$1 */
                /* loaded from: classes7.dex */
                public static final class C190161 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C190161(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C190152.this.emit(null, this);
                    }
                }

                public C190152(InterfaceC33198Gu1 interfaceC33198Gu1) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C190161 c190161;
                    Object coroutine_suspended;
                    int i;
                    if (continuation instanceof C190161) {
                        c190161 = (C190161) continuation;
                        int i2 = c190161.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c190161.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c190161.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c190161.label;
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
                                c190161.label = 1;
                                if (interfaceC33198Gu1.emit(str, c190161) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c190161 = new C190161(continuation);
                    Object obj22 = c190161.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c190161.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super String> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C190152(interfaceC33198Gu1), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
        ZC0 m82333a = C36218Tr6.m82333a(this);
        InterfaceC43640jz5.C25067a c25067a = InterfaceC43640jz5.f93705a;
        this.consumerEmail = C36708Vu1.m79273O(interfaceC32730Eu1, m82333a, c25067a.m29520d(), customerEmail);
        final InterfaceC32730Eu1<FormFieldEntry> formFieldValue2 = createPhoneNumberController.getFormFieldValue();
        this.consumerPhoneNumber = C36708Vu1.m79273O(new InterfaceC32730Eu1<String>() { // from class: com.stripe.android.link.ui.inline.InlineSignupViewModel$special$$inlined$map$2

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 InlineSignupViewModel.kt\ncom/stripe/android/link/ui/inline/InlineSignupViewModel\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,222:1\n48#2:223\n66#3:224\n1#4:225\n*E\n"})
            /* renamed from: com.stripe.android.link.ui.inline.InlineSignupViewModel$special$$inlined$map$2$2 */
            /* loaded from: classes7.dex */
            public static final class C190172<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.link.ui.inline.InlineSignupViewModel$special$$inlined$map$2$2", m28418f = "InlineSignupViewModel.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.link.ui.inline.InlineSignupViewModel$special$$inlined$map$2$2$1 */
                /* loaded from: classes7.dex */
                public static final class C190181 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C190181(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C190172.this.emit(null, this);
                    }
                }

                public C190172(InterfaceC33198Gu1 interfaceC33198Gu1) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C190181 c190181;
                    Object coroutine_suspended;
                    int i;
                    if (continuation instanceof C190181) {
                        c190181 = (C190181) continuation;
                        int i2 = c190181.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c190181.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c190181.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c190181.label;
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
                                c190181.label = 1;
                                if (interfaceC33198Gu1.emit(str, c190181) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c190181 = new C190181(continuation);
                    Object obj22 = c190181.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c190181.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super String> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C190172(interfaceC33198Gu1), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        }, C36218Tr6.m82333a(this), c25067a.m29520d(), null);
        final InterfaceC32730Eu1<FormFieldEntry> formFieldValue3 = createController2.getFormFieldValue();
        this.consumerName = C36708Vu1.m79273O(new InterfaceC32730Eu1<String>() { // from class: com.stripe.android.link.ui.inline.InlineSignupViewModel$special$$inlined$map$3

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 InlineSignupViewModel.kt\ncom/stripe/android/link/ui/inline/InlineSignupViewModel\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,222:1\n48#2:223\n73#3:224\n1#4:225\n*E\n"})
            /* renamed from: com.stripe.android.link.ui.inline.InlineSignupViewModel$special$$inlined$map$3$2 */
            /* loaded from: classes7.dex */
            public static final class C190192<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.link.ui.inline.InlineSignupViewModel$special$$inlined$map$3$2", m28418f = "InlineSignupViewModel.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.link.ui.inline.InlineSignupViewModel$special$$inlined$map$3$2$1 */
                /* loaded from: classes7.dex */
                public static final class C190201 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C190201(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C190192.this.emit(null, this);
                    }
                }

                public C190192(InterfaceC33198Gu1 interfaceC33198Gu1) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C190201 c190201;
                    Object coroutine_suspended;
                    int i;
                    if (continuation instanceof C190201) {
                        c190201 = (C190201) continuation;
                        int i2 = c190201.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c190201.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c190201.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c190201.label;
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
                                c190201.label = 1;
                                if (interfaceC33198Gu1.emit(str, c190201) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c190201 = new C190201(continuation);
                    Object obj22 = c190201.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c190201.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super String> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C190192(interfaceC33198Gu1), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        }, C36218Tr6.m82333a(this), c25067a.m29520d(), null);
        GX2<InlineSignupViewState> m8742a = C50405vP5.m8742a(new InlineSignupViewState(null, config.getMerchantName(), false, false, SignUpState.InputtingEmail));
        this._viewState = m8742a;
        this.viewState = m8742a;
        GX2<ErrorMessage> m8742a2 = C50405vP5.m8742a(null);
        this._errorMessage = m8742a2;
        this.errorMessage = m8742a2;
        final InterfaceC49220tP5<LinkAccount> linkAccount = linkAccountManager.getLinkAccount();
        this.accountEmail = new InterfaceC32730Eu1<String>() { // from class: com.stripe.android.link.ui.inline.InlineSignupViewModel$special$$inlined$map$4

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 InlineSignupViewModel.kt\ncom/stripe/android/link/ui/inline/InlineSignupViewModel\n*L\n1#1,222:1\n48#2:223\n91#3:224\n*E\n"})
            /* renamed from: com.stripe.android.link.ui.inline.InlineSignupViewModel$special$$inlined$map$4$2 */
            /* loaded from: classes7.dex */
            public static final class C190212<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.link.ui.inline.InlineSignupViewModel$special$$inlined$map$4$2", m28418f = "InlineSignupViewModel.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.link.ui.inline.InlineSignupViewModel$special$$inlined$map$4$2$1 */
                /* loaded from: classes7.dex */
                public static final class C190221 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C190221(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C190212.this.emit(null, this);
                    }
                }

                public C190212(InterfaceC33198Gu1 interfaceC33198Gu1) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C190221 c190221;
                    Object coroutine_suspended;
                    int i;
                    String str;
                    if (continuation instanceof C190221) {
                        c190221 = (C190221) continuation;
                        int i2 = c190221.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c190221.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c190221.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c190221.label;
                            if (i == 0) {
                                if (i == 1) {
                                    ResultKt.throwOnFailure(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                LinkAccount linkAccount = (LinkAccount) obj;
                                if (linkAccount != null) {
                                    str = linkAccount.getEmail();
                                } else {
                                    str = null;
                                }
                                c190221.label = 1;
                                if (interfaceC33198Gu1.emit(str, c190221) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c190221 = new C190221(continuation);
                    Object obj22 = c190221.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c190221.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super String> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C190212(interfaceC33198Gu1), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
        this.debouncer = new SignUpViewModel.Debouncer(customerEmail);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearError() {
        this._errorMessage.setValue(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object lookupConsumerEmail(String str, Continuation<? super Unit> continuation) {
        InlineSignupViewModel$lookupConsumerEmail$1 inlineSignupViewModel$lookupConsumerEmail$1;
        Object coroutine_suspended;
        int i;
        Object m116495lookupConsumer0E7RQCE;
        InlineSignupViewModel inlineSignupViewModel;
        Throwable m116786exceptionOrNullimpl;
        InlineSignupViewState value;
        boolean z;
        InlineSignupViewState value2;
        InlineSignupViewState value3;
        if (continuation instanceof InlineSignupViewModel$lookupConsumerEmail$1) {
            inlineSignupViewModel$lookupConsumerEmail$1 = (InlineSignupViewModel$lookupConsumerEmail$1) continuation;
            int i2 = inlineSignupViewModel$lookupConsumerEmail$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                inlineSignupViewModel$lookupConsumerEmail$1.label = i2 - Integer.MIN_VALUE;
                Object obj = inlineSignupViewModel$lookupConsumerEmail$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = inlineSignupViewModel$lookupConsumerEmail$1.label;
                if (i == 0) {
                    if (i == 1) {
                        str = (String) inlineSignupViewModel$lookupConsumerEmail$1.L$1;
                        inlineSignupViewModel = (InlineSignupViewModel) inlineSignupViewModel$lookupConsumerEmail$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        m116495lookupConsumer0E7RQCE = ((Result) obj).m116792unboximpl();
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    clearError();
                    this.linkAccountManager.logout();
                    LinkAccountManager linkAccountManager = this.linkAccountManager;
                    inlineSignupViewModel$lookupConsumerEmail$1.L$0 = this;
                    inlineSignupViewModel$lookupConsumerEmail$1.L$1 = str;
                    inlineSignupViewModel$lookupConsumerEmail$1.label = 1;
                    m116495lookupConsumer0E7RQCE = linkAccountManager.m116495lookupConsumer0E7RQCE(str, false, inlineSignupViewModel$lookupConsumerEmail$1);
                    if (m116495lookupConsumer0E7RQCE == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    inlineSignupViewModel = this;
                }
                m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116495lookupConsumer0E7RQCE);
                if (m116786exceptionOrNullimpl != null) {
                    if (((LinkAccount) m116495lookupConsumer0E7RQCE) != null) {
                        GX2<InlineSignupViewState> gx2 = inlineSignupViewModel._viewState;
                        do {
                            value3 = gx2.getValue();
                        } while (!gx2.compareAndSet(value3, InlineSignupViewState.copy$default(value3, new UserInput.SignIn(str), null, false, false, SignUpState.InputtingEmail, 6, null)));
                    } else {
                        GX2<InlineSignupViewState> gx22 = inlineSignupViewModel._viewState;
                        do {
                            value2 = gx22.getValue();
                        } while (!gx22.compareAndSet(value2, InlineSignupViewState.copy$default(value2, null, null, false, false, SignUpState.InputtingPhoneOrName, 6, null)));
                        inlineSignupViewModel.linkEventsReporter.onSignupStarted(true);
                    }
                } else {
                    GX2<InlineSignupViewState> gx23 = inlineSignupViewModel._viewState;
                    do {
                        value = gx23.getValue();
                        z = m116786exceptionOrNullimpl instanceof APIConnectionException;
                    } while (!gx23.compareAndSet(value, InlineSignupViewState.copy$default(value, null, null, false, z, SignUpState.InputtingEmail, 6, null)));
                    if (!z) {
                        inlineSignupViewModel.onError(m116786exceptionOrNullimpl);
                    }
                }
                return Unit.INSTANCE;
            }
        }
        inlineSignupViewModel$lookupConsumerEmail$1 = new InlineSignupViewModel$lookupConsumerEmail$1(this, continuation);
        Object obj2 = inlineSignupViewModel$lookupConsumerEmail$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = inlineSignupViewModel$lookupConsumerEmail$1.label;
        if (i == 0) {
        }
        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116495lookupConsumer0E7RQCE);
        if (m116786exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final UserInput mapToUserInput(String str, String str2, String str3) {
        boolean z;
        boolean isBlank;
        if (str == null || str2 == null) {
            return null;
        }
        boolean z2 = true;
        if (getRequiresNameCollection()) {
            if (str3 != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(str3);
                if (!isBlank) {
                    z = false;
                    if (z) {
                        z2 = false;
                    }
                }
            }
            z = true;
            if (z) {
            }
        }
        UserInput.SignUp signUp = new UserInput.SignUp(str, this.phoneController.getE164PhoneNumber(str2), this.phoneController.getCountryCode(), str3);
        if (!z2) {
            return null;
        }
        return signUp;
    }

    private final void onError(Throwable th) {
        ErrorMessage errorMessage = ErrorMessageKt.getErrorMessage(th);
        this.logger.error("Error: ", th);
        this._errorMessage.setValue(errorMessage);
    }

    private final void watchUserInput() {
        this.debouncer.startWatching(C36218Tr6.m82333a(this), this.consumerEmail, new InlineSignupViewModel$watchUserInput$1(this), new InlineSignupViewModel$watchUserInput$2(this));
        Z30.m73800d(C36218Tr6.m82333a(this), null, null, new InlineSignupViewModel$watchUserInput$3(this, null), 3, null);
    }

    public final InterfaceC32730Eu1<String> getAccountEmail() {
        return this.accountEmail;
    }

    public final SimpleTextFieldController getEmailController() {
        return this.emailController;
    }

    public final InterfaceC49220tP5<ErrorMessage> getErrorMessage() {
        return this.errorMessage;
    }

    public final SimpleTextFieldController getNameController() {
        return this.nameController;
    }

    public final PhoneNumberController getPhoneController() {
        return this.phoneController;
    }

    public final boolean getRequiresNameCollection() {
        String countryCode;
        StripeIntent stripeIntent = this.config.getStripeIntent();
        if (stripeIntent instanceof PaymentIntent) {
            countryCode = ((PaymentIntent) stripeIntent).getCountryCode();
        } else if (stripeIntent instanceof SetupIntent) {
            countryCode = ((SetupIntent) stripeIntent).getCountryCode();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return !Intrinsics.areEqual(countryCode, CountryCode.Companion.getUS().getValue());
    }

    public final InterfaceC49220tP5<InlineSignupViewState> getViewState() {
        return this.viewState;
    }

    public final void logout() {
        Z30.m73800d(C36218Tr6.m82333a(this), null, null, new InlineSignupViewModel$logout$1(this, null), 3, null);
    }

    public final void toggleExpanded() {
        InlineSignupViewState value;
        InlineSignupViewState inlineSignupViewState;
        GX2<InlineSignupViewState> gx2 = this._viewState;
        do {
            value = gx2.getValue();
            inlineSignupViewState = value;
        } while (!gx2.compareAndSet(value, InlineSignupViewState.copy$default(inlineSignupViewState, null, null, !inlineSignupViewState.isExpanded$link_release(), false, null, 27, null)));
        if (this._viewState.getValue().isExpanded$link_release() && !this.hasExpanded) {
            this.hasExpanded = true;
            watchUserInput();
            this.linkEventsReporter.onInlineSignupCheckboxChecked();
        }
    }
}
