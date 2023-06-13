package com.stripe.android.link.p042ui.signup;

import androidx.lifecycle.C11759u;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.Injector;
import com.stripe.android.core.injection.NonFallbackInjectable;
import com.stripe.android.core.injection.NonFallbackInjector;
import com.stripe.android.core.model.CountryCode;
import com.stripe.android.link.LinkActivityContract;
import com.stripe.android.link.LinkScreen;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.analytics.LinkEventsReporter;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.model.Navigator;
import com.stripe.android.link.p042ui.ErrorMessage;
import com.stripe.android.link.p042ui.ErrorMessageKt;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
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
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.InterfaceC43640jz5;
@Metadata(m28433d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 Q2\u00020\u0001:\u0003QRSB1\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\bO\u0010PJ&\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0002J\u001b\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\bH\u0002J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0006\u0010\u0012\u001a\u00020\bR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u0014\u0010'\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u0017\u0010(\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010*R\u0017\u0010,\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u00101\u001a\u0002008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u00105\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b5\u0010-\u001a\u0004\b6\u0010/R\u001c\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001c\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00109R\u001c\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00109R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00060<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020\u0006078\u0006¢\u0006\f\n\u0004\b?\u00109\u001a\u0004\b?\u0010@R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020A0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010>R\u001d\u0010C\u001a\b\u0012\u0004\u0012\u00020A078\u0006¢\u0006\f\n\u0004\bC\u00109\u001a\u0004\bD\u0010@R\u001c\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010E0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010>R\u001f\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010E078\u0006¢\u0006\f\n\u0004\bG\u00109\u001a\u0004\bH\u0010@R\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0011\u0010N\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bL\u0010M\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006T"}, m28432d2 = {"Lcom/stripe/android/link/ui/signup/SignUpViewModel;", "LOr6;", "", "email", PaymentMethod.BillingDetails.PARAM_PHONE, "name", "", "determineIsReadyToSignUp", "", "lookupConsumerEmail", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/link/model/LinkAccount;", "linkAccount", "onAccountFetched", "clearError", "", "error", "onError", "onSignUpClick", "Lcom/stripe/android/link/LinkActivityContract$Args;", "args", "Lcom/stripe/android/link/LinkActivityContract$Args;", "Lcom/stripe/android/link/account/LinkAccountManager;", "linkAccountManager", "Lcom/stripe/android/link/account/LinkAccountManager;", "Lcom/stripe/android/link/analytics/LinkEventsReporter;", "linkEventsReporter", "Lcom/stripe/android/link/analytics/LinkEventsReporter;", "Lcom/stripe/android/link/model/Navigator;", "navigator", "Lcom/stripe/android/link/model/Navigator;", "Lcom/stripe/android/core/Logger;", "logger", "Lcom/stripe/android/core/Logger;", "isLoggedOut", "Z", "prefilledEmail", "Ljava/lang/String;", "prefilledPhone", "prefilledName", "merchantName", "getMerchantName", "()Ljava/lang/String;", "Lcom/stripe/android/uicore/elements/SimpleTextFieldController;", "emailController", "Lcom/stripe/android/uicore/elements/SimpleTextFieldController;", "getEmailController", "()Lcom/stripe/android/uicore/elements/SimpleTextFieldController;", "Lcom/stripe/android/uicore/elements/PhoneNumberController;", "phoneController", "Lcom/stripe/android/uicore/elements/PhoneNumberController;", "getPhoneController", "()Lcom/stripe/android/uicore/elements/PhoneNumberController;", "nameController", "getNameController", "LtP5;", "consumerEmail", "LtP5;", "consumerPhoneNumber", "consumerName", "LGX2;", "_isReadyToSignUp", "LGX2;", "isReadyToSignUp", "()LtP5;", "Lcom/stripe/android/link/ui/signup/SignUpState;", "_signUpStatus", "signUpState", "getSignUpState", "Lcom/stripe/android/link/ui/ErrorMessage;", "_errorMessage", "errorMessage", "getErrorMessage", "Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer;", "debouncer", "Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer;", "getRequiresNameCollection", "()Z", "requiresNameCollection", "<init>", "(Lcom/stripe/android/link/LinkActivityContract$Args;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/analytics/LinkEventsReporter;Lcom/stripe/android/link/model/Navigator;Lcom/stripe/android/core/Logger;)V", "Companion", "Debouncer", "Factory", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSignUpViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignUpViewModel.kt\ncom/stripe/android/link/ui/signup/SignUpViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,272:1\n1#2:273\n47#3:274\n49#3:278\n47#3:279\n49#3:283\n47#3:284\n49#3:288\n50#4:275\n55#4:277\n50#4:280\n55#4:282\n50#4:285\n55#4:287\n106#5:276\n106#5:281\n106#5:286\n*S KotlinDebug\n*F\n+ 1 SignUpViewModel.kt\ncom/stripe/android/link/ui/signup/SignUpViewModel\n*L\n69#1:274\n69#1:278\n76#1:279\n76#1:283\n83#1:284\n83#1:288\n69#1:275\n69#1:277\n76#1:280\n76#1:282\n83#1:285\n83#1:287\n69#1:276\n76#1:281\n83#1:286\n*E\n"})
/* renamed from: com.stripe.android.link.ui.signup.SignUpViewModel */
/* loaded from: classes7.dex */
public final class SignUpViewModel extends AbstractC35048Or6 {
    public static final Companion Companion = new Companion(null);
    public static final long LOOKUP_DEBOUNCE_MS = 1000;
    private final GX2<ErrorMessage> _errorMessage;
    private final GX2<Boolean> _isReadyToSignUp;
    private final GX2<SignUpState> _signUpStatus;
    private final LinkActivityContract.Args args;
    private final InterfaceC49220tP5<String> consumerEmail;
    private final InterfaceC49220tP5<String> consumerName;
    private final InterfaceC49220tP5<String> consumerPhoneNumber;
    private final Debouncer debouncer;
    private final SimpleTextFieldController emailController;
    private final InterfaceC49220tP5<ErrorMessage> errorMessage;
    private final boolean isLoggedOut;
    private final InterfaceC49220tP5<Boolean> isReadyToSignUp;
    private final LinkAccountManager linkAccountManager;
    private final LinkEventsReporter linkEventsReporter;
    private final Logger logger;
    private final String merchantName;
    private final SimpleTextFieldController nameController;
    private final Navigator navigator;
    private final PhoneNumberController phoneController;
    private final String prefilledEmail;
    private final String prefilledName;
    private final String prefilledPhone;
    private final InterfaceC49220tP5<SignUpState> signUpState;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Lcom/stripe/android/link/ui/signup/SignUpState;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.link.ui.signup.SignUpViewModel$1 */
    /* loaded from: classes7.dex */
    public static final class C190401 extends Lambda implements Function1<SignUpState, Unit> {
        public C190401() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignUpState signUpState) {
            invoke2(signUpState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(SignUpState it) {
            Intrinsics.checkNotNullParameter(it, "it");
            SignUpViewModel.this.clearError();
            SignUpViewModel.this._signUpStatus.setValue(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.link.ui.signup.SignUpViewModel$2 */
    /* loaded from: classes7.dex */
    public static final class C190412 extends Lambda implements Function1<String, Unit> {

        @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @DebugMetadata(m28419c = "com.stripe.android.link.ui.signup.SignUpViewModel$2$1", m28418f = "SignUpViewModel.kt", m28417i = {}, m28416l = {116}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: com.stripe.android.link.ui.signup.SignUpViewModel$2$1 */
        /* loaded from: classes7.dex */
        public static final class C190421 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $it;
            int label;
            final /* synthetic */ SignUpViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C190421(SignUpViewModel signUpViewModel, String str, Continuation<? super C190421> continuation) {
                super(2, continuation);
                this.this$0 = signUpViewModel;
                this.$it = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C190421(this.this$0, this.$it, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                return ((C190421) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                    SignUpViewModel signUpViewModel = this.this$0;
                    String str = this.$it;
                    this.label = 1;
                    if (signUpViewModel.lookupConsumerEmail(str, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public C190412() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Z30.m73800d(C36218Tr6.m82333a(SignUpViewModel.this), null, null, new C190421(SignUpViewModel.this, it, null), 3, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.stripe.android.link.ui.signup.SignUpViewModel$3", m28418f = "SignUpViewModel.kt", m28417i = {}, m28416l = {127}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.stripe.android.link.ui.signup.SignUpViewModel$3 */
    /* loaded from: classes7.dex */
    public static final class C190433 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
        int label;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: com.stripe.android.link.ui.signup.SignUpViewModel$3$1 */
        /* loaded from: classes7.dex */
        public /* synthetic */ class C190441 extends AdaptedFunctionReference implements Function4<String, String, String, Continuation<? super Boolean>, Object>, SuspendFunction {
            public C190441(Object obj) {
                super(4, obj, SignUpViewModel.class, "determineIsReadyToSignUp", "determineIsReadyToSignUp(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z", 4);
            }

            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(String str, String str2, String str3, Continuation<? super Boolean> continuation) {
                return C190433.invokeSuspend$determineIsReadyToSignUp((SignUpViewModel) this.receiver, str, str2, str3, continuation);
            }
        }

        public C190433(Continuation<? super C190433> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$determineIsReadyToSignUp(SignUpViewModel signUpViewModel, String str, String str2, String str3, Continuation continuation) {
            return Boxing.boxBoolean(signUpViewModel.determineIsReadyToSignUp(str, str2, str3));
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C190433(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C190433) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC32730Eu1 m79258m = C36708Vu1.m79258m(SignUpViewModel.this.consumerEmail, SignUpViewModel.this.consumerPhoneNumber, SignUpViewModel.this.consumerName, new C190441(SignUpViewModel.this));
                final SignUpViewModel signUpViewModel = SignUpViewModel.this;
                InterfaceC33198Gu1<Boolean> interfaceC33198Gu1 = new InterfaceC33198Gu1<Boolean>() { // from class: com.stripe.android.link.ui.signup.SignUpViewModel.3.2
                    @Override // p000.InterfaceC33198Gu1
                    public /* bridge */ /* synthetic */ Object emit(Boolean bool, Continuation continuation) {
                        return emit(bool.booleanValue(), continuation);
                    }

                    public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                        SignUpViewModel.this._isReadyToSignUp.setValue(Boxing.boxBoolean(z));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (m79258m.collect(interfaceC33198Gu1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/link/ui/signup/SignUpViewModel$Companion;", "", "()V", "LOOKUP_DEBOUNCE_MS", "", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.link.ui.signup.SignUpViewModel$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0012\u0010\u0013JF\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0007R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m28432d2 = {"Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer;", "", "LZC0;", "coroutineScope", "LtP5;", "", "emailFlow", "Lkotlin/Function1;", "Lcom/stripe/android/link/ui/signup/SignUpState;", "", "onStateChanged", "onValidEmailEntered", "startWatching", "initialEmail", "Ljava/lang/String;", "Lzh2;", "lookupJob", "Lzh2;", "<init>", "(Ljava/lang/String;)V", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: com.stripe.android.link.ui.signup.SignUpViewModel$Debouncer */
    /* loaded from: classes7.dex */
    public static final class Debouncer {
        private final String initialEmail;
        private InterfaceC52943zh2 lookupJob;

        public Debouncer(String str) {
            this.initialEmail = str;
        }

        public final void startWatching(ZC0 coroutineScope, InterfaceC49220tP5<String> emailFlow, Function1<? super SignUpState, Unit> onStateChanged, Function1<? super String, Unit> onValidEmailEntered) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(emailFlow, "emailFlow");
            Intrinsics.checkNotNullParameter(onStateChanged, "onStateChanged");
            Intrinsics.checkNotNullParameter(onValidEmailEntered, "onValidEmailEntered");
            Z30.m73800d(coroutineScope, null, null, new SignUpViewModel$Debouncer$startWatching$1(emailFlow, this, onStateChanged, onValidEmailEntered, null), 3, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m28432d2 = {"Lcom/stripe/android/link/ui/signup/SignUpViewModel$Factory;", "Landroidx/lifecycle/u$b;", "Lcom/stripe/android/core/injection/NonFallbackInjectable;", "LOr6;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)LOr6;", "Lcom/stripe/android/core/injection/NonFallbackInjector;", "injector", "Lcom/stripe/android/core/injection/NonFallbackInjector;", "Lcom/stripe/android/link/ui/signup/SignUpViewModel;", "signUpViewModel", "Lcom/stripe/android/link/ui/signup/SignUpViewModel;", "getSignUpViewModel", "()Lcom/stripe/android/link/ui/signup/SignUpViewModel;", "setSignUpViewModel", "(Lcom/stripe/android/link/ui/signup/SignUpViewModel;)V", "<init>", "(Lcom/stripe/android/core/injection/NonFallbackInjector;)V", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: com.stripe.android.link.ui.signup.SignUpViewModel$Factory */
    /* loaded from: classes7.dex */
    public static final class Factory implements C11759u.InterfaceC11763b, NonFallbackInjectable {
        private final NonFallbackInjector injector;
        public SignUpViewModel signUpViewModel;

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

        public final SignUpViewModel getSignUpViewModel() {
            SignUpViewModel signUpViewModel = this.signUpViewModel;
            if (signUpViewModel != null) {
                return signUpViewModel;
            }
            Intrinsics.throwUninitializedPropertyAccessException("signUpViewModel");
            return null;
        }

        public final void setSignUpViewModel(SignUpViewModel signUpViewModel) {
            Intrinsics.checkNotNullParameter(signUpViewModel, "<set-?>");
            this.signUpViewModel = signUpViewModel;
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public <T extends AbstractC35048Or6> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            this.injector.inject(this);
            SignUpViewModel signUpViewModel = getSignUpViewModel();
            Intrinsics.checkNotNull(signUpViewModel, "null cannot be cast to non-null type T of com.stripe.android.link.ui.signup.SignUpViewModel.Factory.create");
            return signUpViewModel;
        }

        @Override // com.stripe.android.core.injection.NonFallbackInjectable
        /* renamed from: fallbackInitialize  reason: avoid collision after fix types in other method */
        public Void fallbackInitialize2(Unit unit) {
            return NonFallbackInjectable.DefaultImpls.fallbackInitialize(this, unit);
        }
    }

    public SignUpViewModel(LinkActivityContract.Args args, LinkAccountManager linkAccountManager, LinkEventsReporter linkEventsReporter, Navigator navigator, Logger logger) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(linkAccountManager, "linkAccountManager");
        Intrinsics.checkNotNullParameter(linkEventsReporter, "linkEventsReporter");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.args = args;
        this.linkAccountManager = linkAccountManager;
        this.linkEventsReporter = linkEventsReporter;
        this.navigator = navigator;
        this.logger = logger;
        boolean hasUserLoggedOut = linkAccountManager.hasUserLoggedOut(args.getCustomerEmail$link_release());
        this.isLoggedOut = hasUserLoggedOut;
        String customerEmail$link_release = hasUserLoggedOut ? null : args.getCustomerEmail$link_release();
        this.prefilledEmail = customerEmail$link_release;
        String str = (args.getCustomerPhone$link_release() == null || hasUserLoggedOut) ? null : str;
        str = str == null ? "" : str;
        this.prefilledPhone = str;
        String str2 = (args.getCustomerName$link_release() == null || hasUserLoggedOut) ? null : str2;
        String str3 = str2 != null ? str2 : "";
        this.prefilledName = str3;
        this.merchantName = args.getMerchantName$link_release();
        SimpleTextFieldController createController = EmailConfig.Companion.createController(customerEmail$link_release);
        this.emailController = createController;
        PhoneNumberController createPhoneNumberController = PhoneNumberController.Companion.createPhoneNumberController(str, args.getConfiguration$link_release().getCustomerBillingCountryCode());
        this.phoneController = createPhoneNumberController;
        SimpleTextFieldController createController2 = NameConfig.Companion.createController(str3);
        this.nameController = createController2;
        final InterfaceC32730Eu1<FormFieldEntry> formFieldValue = createController.getFormFieldValue();
        InterfaceC32730Eu1<String> interfaceC32730Eu1 = new InterfaceC32730Eu1<String>() { // from class: com.stripe.android.link.ui.signup.SignUpViewModel$special$$inlined$map$1

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SignUpViewModel.kt\ncom/stripe/android/link/ui/signup/SignUpViewModel\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,222:1\n48#2:223\n69#3:224\n1#4:225\n*E\n"})
            /* renamed from: com.stripe.android.link.ui.signup.SignUpViewModel$special$$inlined$map$1$2 */
            /* loaded from: classes7.dex */
            public static final class C190462<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.link.ui.signup.SignUpViewModel$special$$inlined$map$1$2", m28418f = "SignUpViewModel.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.link.ui.signup.SignUpViewModel$special$$inlined$map$1$2$1 */
                /* loaded from: classes7.dex */
                public static final class C190471 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C190471(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C190462.this.emit(null, this);
                    }
                }

                public C190462(InterfaceC33198Gu1 interfaceC33198Gu1) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C190471 c190471;
                    Object coroutine_suspended;
                    int i;
                    if (continuation instanceof C190471) {
                        c190471 = (C190471) continuation;
                        int i2 = c190471.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c190471.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c190471.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c190471.label;
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
                                c190471.label = 1;
                                if (interfaceC33198Gu1.emit(str, c190471) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c190471 = new C190471(continuation);
                    Object obj22 = c190471.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c190471.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super String> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C190462(interfaceC33198Gu1), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
        ZC0 m82333a = C36218Tr6.m82333a(this);
        InterfaceC43640jz5.C25067a c25067a = InterfaceC43640jz5.f93705a;
        InterfaceC49220tP5<String> m79273O = C36708Vu1.m79273O(interfaceC32730Eu1, m82333a, c25067a.m29521c(), customerEmail$link_release);
        this.consumerEmail = m79273O;
        final InterfaceC32730Eu1<FormFieldEntry> formFieldValue2 = createPhoneNumberController.getFormFieldValue();
        this.consumerPhoneNumber = C36708Vu1.m79273O(new InterfaceC32730Eu1<String>() { // from class: com.stripe.android.link.ui.signup.SignUpViewModel$special$$inlined$map$2

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SignUpViewModel.kt\ncom/stripe/android/link/ui/signup/SignUpViewModel\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,222:1\n48#2:223\n76#3:224\n1#4:225\n*E\n"})
            /* renamed from: com.stripe.android.link.ui.signup.SignUpViewModel$special$$inlined$map$2$2 */
            /* loaded from: classes7.dex */
            public static final class C190482<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.link.ui.signup.SignUpViewModel$special$$inlined$map$2$2", m28418f = "SignUpViewModel.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.link.ui.signup.SignUpViewModel$special$$inlined$map$2$2$1 */
                /* loaded from: classes7.dex */
                public static final class C190491 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C190491(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C190482.this.emit(null, this);
                    }
                }

                public C190482(InterfaceC33198Gu1 interfaceC33198Gu1) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C190491 c190491;
                    Object coroutine_suspended;
                    int i;
                    if (continuation instanceof C190491) {
                        c190491 = (C190491) continuation;
                        int i2 = c190491.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c190491.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c190491.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c190491.label;
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
                                c190491.label = 1;
                                if (interfaceC33198Gu1.emit(str, c190491) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c190491 = new C190491(continuation);
                    Object obj22 = c190491.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c190491.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super String> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C190482(interfaceC33198Gu1), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        }, C36218Tr6.m82333a(this), c25067a.m29521c(), null);
        final InterfaceC32730Eu1<FormFieldEntry> formFieldValue3 = createController2.getFormFieldValue();
        this.consumerName = C36708Vu1.m79273O(new InterfaceC32730Eu1<String>() { // from class: com.stripe.android.link.ui.signup.SignUpViewModel$special$$inlined$map$3

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SignUpViewModel.kt\ncom/stripe/android/link/ui/signup/SignUpViewModel\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,222:1\n48#2:223\n83#3:224\n1#4:225\n*E\n"})
            /* renamed from: com.stripe.android.link.ui.signup.SignUpViewModel$special$$inlined$map$3$2 */
            /* loaded from: classes7.dex */
            public static final class C190502<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.link.ui.signup.SignUpViewModel$special$$inlined$map$3$2", m28418f = "SignUpViewModel.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.link.ui.signup.SignUpViewModel$special$$inlined$map$3$2$1 */
                /* loaded from: classes7.dex */
                public static final class C190511 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C190511(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C190502.this.emit(null, this);
                    }
                }

                public C190502(InterfaceC33198Gu1 interfaceC33198Gu1) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C190511 c190511;
                    Object coroutine_suspended;
                    int i;
                    if (continuation instanceof C190511) {
                        c190511 = (C190511) continuation;
                        int i2 = c190511.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c190511.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c190511.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c190511.label;
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
                                c190511.label = 1;
                                if (interfaceC33198Gu1.emit(str, c190511) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c190511 = new C190511(continuation);
                    Object obj22 = c190511.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c190511.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super String> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C190502(interfaceC33198Gu1), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        }, C36218Tr6.m82333a(this), c25067a.m29521c(), null);
        GX2<Boolean> m8742a = C50405vP5.m8742a(Boolean.FALSE);
        this._isReadyToSignUp = m8742a;
        this.isReadyToSignUp = m8742a;
        GX2<SignUpState> m8742a2 = C50405vP5.m8742a(SignUpState.InputtingEmail);
        this._signUpStatus = m8742a2;
        this.signUpState = m8742a2;
        GX2<ErrorMessage> m8742a3 = C50405vP5.m8742a(null);
        this._errorMessage = m8742a3;
        this.errorMessage = m8742a3;
        Debouncer debouncer = new Debouncer(customerEmail$link_release);
        this.debouncer = debouncer;
        debouncer.startWatching(C36218Tr6.m82333a(this), m79273O, new C190401(), new C190412());
        Z30.m73800d(C36218Tr6.m82333a(this), null, null, new C190433(null), 3, null);
        linkEventsReporter.onSignupFlowPresented();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearError() {
        this._errorMessage.setValue(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean determineIsReadyToSignUp(String str, String str2, String str3) {
        boolean z;
        boolean isBlank;
        if (str == null || str2 == null) {
            return false;
        }
        if (getRequiresNameCollection()) {
            if (str3 != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(str3);
                if (!isBlank) {
                    z = false;
                    if (z) {
                        return false;
                    }
                }
            }
            z = true;
            if (z) {
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object lookupConsumerEmail(String str, Continuation<? super Unit> continuation) {
        SignUpViewModel$lookupConsumerEmail$1 signUpViewModel$lookupConsumerEmail$1;
        Object coroutine_suspended;
        int i;
        Object m116486lookupConsumer0E7RQCE$default;
        SignUpViewModel signUpViewModel;
        Throwable m116786exceptionOrNullimpl;
        if (continuation instanceof SignUpViewModel$lookupConsumerEmail$1) {
            signUpViewModel$lookupConsumerEmail$1 = (SignUpViewModel$lookupConsumerEmail$1) continuation;
            int i2 = signUpViewModel$lookupConsumerEmail$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                signUpViewModel$lookupConsumerEmail$1.label = i2 - Integer.MIN_VALUE;
                SignUpViewModel$lookupConsumerEmail$1 signUpViewModel$lookupConsumerEmail$12 = signUpViewModel$lookupConsumerEmail$1;
                Object obj = signUpViewModel$lookupConsumerEmail$12.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = signUpViewModel$lookupConsumerEmail$12.label;
                if (i == 0) {
                    if (i == 1) {
                        signUpViewModel = (SignUpViewModel) signUpViewModel$lookupConsumerEmail$12.L$0;
                        ResultKt.throwOnFailure(obj);
                        m116486lookupConsumer0E7RQCE$default = ((Result) obj).m116792unboximpl();
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    clearError();
                    LinkAccountManager linkAccountManager = this.linkAccountManager;
                    signUpViewModel$lookupConsumerEmail$12.L$0 = this;
                    signUpViewModel$lookupConsumerEmail$12.label = 1;
                    m116486lookupConsumer0E7RQCE$default = LinkAccountManager.m116486lookupConsumer0E7RQCE$default(linkAccountManager, str, false, signUpViewModel$lookupConsumerEmail$12, 2, null);
                    if (m116486lookupConsumer0E7RQCE$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    signUpViewModel = this;
                }
                m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116486lookupConsumer0E7RQCE$default);
                if (m116786exceptionOrNullimpl != null) {
                    LinkAccount linkAccount = (LinkAccount) m116486lookupConsumer0E7RQCE$default;
                    if (linkAccount != null) {
                        signUpViewModel.onAccountFetched(linkAccount);
                    } else {
                        signUpViewModel._signUpStatus.setValue(SignUpState.InputtingPhoneOrName);
                        LinkEventsReporter.DefaultImpls.onSignupStarted$default(signUpViewModel.linkEventsReporter, false, 1, null);
                    }
                } else {
                    signUpViewModel._signUpStatus.setValue(SignUpState.InputtingEmail);
                    signUpViewModel.onError(m116786exceptionOrNullimpl);
                }
                return Unit.INSTANCE;
            }
        }
        signUpViewModel$lookupConsumerEmail$1 = new SignUpViewModel$lookupConsumerEmail$1(this, continuation);
        SignUpViewModel$lookupConsumerEmail$1 signUpViewModel$lookupConsumerEmail$122 = signUpViewModel$lookupConsumerEmail$1;
        Object obj2 = signUpViewModel$lookupConsumerEmail$122.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = signUpViewModel$lookupConsumerEmail$122.label;
        if (i == 0) {
        }
        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116486lookupConsumer0E7RQCE$default);
        if (m116786exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAccountFetched(LinkAccount linkAccount) {
        if (linkAccount.isVerified()) {
            this.navigator.navigateTo(LinkScreen.Wallet.INSTANCE, true);
            return;
        }
        Navigator.navigateTo$default(this.navigator, LinkScreen.Verification.INSTANCE, false, 2, null);
        this.emailController.onRawValueChange("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onError(Throwable th) {
        ErrorMessage errorMessage = ErrorMessageKt.getErrorMessage(th);
        this.logger.error("Error: ", th);
        this._errorMessage.setValue(errorMessage);
    }

    public final SimpleTextFieldController getEmailController() {
        return this.emailController;
    }

    public final InterfaceC49220tP5<ErrorMessage> getErrorMessage() {
        return this.errorMessage;
    }

    public final String getMerchantName() {
        return this.merchantName;
    }

    public final SimpleTextFieldController getNameController() {
        return this.nameController;
    }

    public final PhoneNumberController getPhoneController() {
        return this.phoneController;
    }

    public final boolean getRequiresNameCollection() {
        String countryCode;
        StripeIntent stripeIntent$link_release = this.args.getStripeIntent$link_release();
        if (stripeIntent$link_release instanceof PaymentIntent) {
            countryCode = ((PaymentIntent) stripeIntent$link_release).getCountryCode();
        } else if (stripeIntent$link_release instanceof SetupIntent) {
            countryCode = ((SetupIntent) stripeIntent$link_release).getCountryCode();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return !Intrinsics.areEqual(countryCode, CountryCode.Companion.getUS().getValue());
    }

    public final InterfaceC49220tP5<SignUpState> getSignUpState() {
        return this.signUpState;
    }

    public final InterfaceC49220tP5<Boolean> isReadyToSignUp() {
        return this.isReadyToSignUp;
    }

    public final void onSignUpClick() {
        clearError();
        String value = this.consumerEmail.getValue();
        if (value != null) {
            String str = value;
            PhoneNumberController phoneNumberController = this.phoneController;
            String value2 = this.consumerPhoneNumber.getValue();
            if (value2 != null) {
                Z30.m73800d(C36218Tr6.m82333a(this), null, null, new SignUpViewModel$onSignUpClick$1(this, str, phoneNumberController.getE164PhoneNumber(value2), this.phoneController.getCountryCode(), this.consumerName.getValue(), null), 3, null);
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
