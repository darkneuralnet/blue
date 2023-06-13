package com.stripe.android.link.p042ui.verification;

import androidx.lifecycle.C11759u;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.Injector;
import com.stripe.android.core.injection.NonFallbackInjectable;
import com.stripe.android.core.injection.NonFallbackInjector;
import com.stripe.android.link.LinkScreen;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.analytics.LinkEventsReporter;
import com.stripe.android.link.model.AccountStatus;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.model.Navigator;
import com.stripe.android.link.p042ui.ErrorMessage;
import com.stripe.android.link.p042ui.ErrorMessageKt;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.p049ui.core.elements.OTPSpec;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.OTPElement;
import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0001@B)\b\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b>\u0010?J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001c\u0010\n\u001a\u00020\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0013\u001a\u00020\u0002J\u0006\u0010\u0014\u001a\u00020\u0002J\u0006\u0010\u0015\u001a\u00020\u0002J\u0006\u0010\u0016\u001a\u00020\u0002J\u0006\u0010\u0017\u001a\u00020\u0002J\u0006\u0010\u0018\u001a\u00020\u0002R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010\u000eR\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020\b0,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R(\u00102\u001a\b\u0012\u0004\u0012\u00020\u0002018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0017\u00109\u001a\u0002088\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001c\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010.¨\u0006A"}, m28432d2 = {"Lcom/stripe/android/link/ui/verification/VerificationViewModel;", "LOr6;", "", "clearError", "", "error", "onError", "Lkotlin/Function1;", "Lcom/stripe/android/link/ui/verification/VerificationViewState;", "block", "updateViewState", "Lcom/stripe/android/link/model/LinkAccount;", "linkAccount", "init$link_release", "(Lcom/stripe/android/link/model/LinkAccount;)V", "init", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "onVerificationCodeEntered", "startVerification", "resendCode", "didShowCodeSentNotification", "onBack", "onChangeEmailClicked", "onFocusRequested", "Lcom/stripe/android/link/account/LinkAccountManager;", "linkAccountManager", "Lcom/stripe/android/link/account/LinkAccountManager;", "Lcom/stripe/android/link/analytics/LinkEventsReporter;", "linkEventsReporter", "Lcom/stripe/android/link/analytics/LinkEventsReporter;", "Lcom/stripe/android/link/model/Navigator;", "navigator", "Lcom/stripe/android/link/model/Navigator;", "Lcom/stripe/android/core/Logger;", "logger", "Lcom/stripe/android/core/Logger;", "Lcom/stripe/android/link/model/LinkAccount;", "getLinkAccount", "()Lcom/stripe/android/link/model/LinkAccount;", "setLinkAccount", "LGX2;", "_viewState", "LGX2;", "LtP5;", "viewState", "LtP5;", "getViewState", "()LtP5;", "Lkotlin/Function0;", "onVerificationCompleted", "Lkotlin/jvm/functions/Function0;", "getOnVerificationCompleted", "()Lkotlin/jvm/functions/Function0;", "setOnVerificationCompleted", "(Lkotlin/jvm/functions/Function0;)V", "Lcom/stripe/android/uicore/elements/OTPElement;", "otpElement", "Lcom/stripe/android/uicore/elements/OTPElement;", "getOtpElement", "()Lcom/stripe/android/uicore/elements/OTPElement;", "otpCode", "<init>", "(Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/analytics/LinkEventsReporter;Lcom/stripe/android/link/model/Navigator;Lcom/stripe/android/core/Logger;)V", "Factory", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVerificationViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VerificationViewModel.kt\ncom/stripe/android/link/ui/verification/VerificationViewModel\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,200:1\n47#2:201\n49#2:205\n50#3:202\n55#3:204\n106#4:203\n230#5,5:206\n*S KotlinDebug\n*F\n+ 1 VerificationViewModel.kt\ncom/stripe/android/link/ui/verification/VerificationViewModel\n*L\n62#1:201\n62#1:205\n62#1:202\n62#1:204\n62#1:203\n180#1:206,5\n*E\n"})
/* renamed from: com.stripe.android.link.ui.verification.VerificationViewModel */
/* loaded from: classes7.dex */
public final class VerificationViewModel extends AbstractC35048Or6 {
    private final GX2<VerificationViewState> _viewState;
    public LinkAccount linkAccount;
    private final LinkAccountManager linkAccountManager;
    private final LinkEventsReporter linkEventsReporter;
    private final Logger logger;
    private final Navigator navigator;
    private Function0<Unit> onVerificationCompleted;
    private final InterfaceC49220tP5<String> otpCode;
    private final OTPElement otpElement;
    private final InterfaceC49220tP5<VerificationViewState> viewState;

    @Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m28432d2 = {"Lcom/stripe/android/link/ui/verification/VerificationViewModel$Factory;", "Landroidx/lifecycle/u$b;", "Lcom/stripe/android/core/injection/NonFallbackInjectable;", "LOr6;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)LOr6;", "Lcom/stripe/android/link/model/LinkAccount;", "account", "Lcom/stripe/android/link/model/LinkAccount;", "Lcom/stripe/android/core/injection/NonFallbackInjector;", "injector", "Lcom/stripe/android/core/injection/NonFallbackInjector;", "Lcom/stripe/android/link/ui/verification/VerificationViewModel;", "viewModel", "Lcom/stripe/android/link/ui/verification/VerificationViewModel;", "getViewModel", "()Lcom/stripe/android/link/ui/verification/VerificationViewModel;", "setViewModel", "(Lcom/stripe/android/link/ui/verification/VerificationViewModel;)V", "<init>", "(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/core/injection/NonFallbackInjector;)V", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: com.stripe.android.link.ui.verification.VerificationViewModel$Factory */
    /* loaded from: classes7.dex */
    public static final class Factory implements C11759u.InterfaceC11763b, NonFallbackInjectable {
        private final LinkAccount account;
        private final NonFallbackInjector injector;
        public VerificationViewModel viewModel;

        public Factory(LinkAccount account, NonFallbackInjector injector) {
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(injector, "injector");
            this.account = account;
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

        public final VerificationViewModel getViewModel() {
            VerificationViewModel verificationViewModel = this.viewModel;
            if (verificationViewModel != null) {
                return verificationViewModel;
            }
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            return null;
        }

        public final void setViewModel(VerificationViewModel verificationViewModel) {
            Intrinsics.checkNotNullParameter(verificationViewModel, "<set-?>");
            this.viewModel = verificationViewModel;
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public <T extends AbstractC35048Or6> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            this.injector.inject(this);
            VerificationViewModel viewModel = getViewModel();
            viewModel.init$link_release(this.account);
            Intrinsics.checkNotNull(viewModel, "null cannot be cast to non-null type T of com.stripe.android.link.ui.verification.VerificationViewModel.Factory.create");
            return viewModel;
        }

        @Override // com.stripe.android.core.injection.NonFallbackInjectable
        /* renamed from: fallbackInitialize  reason: avoid collision after fix types in other method */
        public Void fallbackInitialize2(Unit unit) {
            return NonFallbackInjectable.DefaultImpls.fallbackInitialize(this, unit);
        }
    }

    public VerificationViewModel(LinkAccountManager linkAccountManager, LinkEventsReporter linkEventsReporter, Navigator navigator, Logger logger) {
        Intrinsics.checkNotNullParameter(linkAccountManager, "linkAccountManager");
        Intrinsics.checkNotNullParameter(linkEventsReporter, "linkEventsReporter");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.linkAccountManager = linkAccountManager;
        this.linkEventsReporter = linkEventsReporter;
        this.navigator = navigator;
        this.logger = logger;
        GX2<VerificationViewState> m8742a = C50405vP5.m8742a(new VerificationViewState(false, false, null, false, false, 31, null));
        this._viewState = m8742a;
        this.viewState = m8742a;
        this.onVerificationCompleted = new VerificationViewModel$onVerificationCompleted$1(this);
        OTPElement transform = OTPSpec.INSTANCE.transform();
        this.otpElement = transform;
        final InterfaceC32730Eu1<List<Pair<IdentifierSpec, FormFieldEntry>>> formFieldValueFlow = transform.getFormFieldValueFlow();
        this.otpCode = C36708Vu1.m79273O(new InterfaceC32730Eu1<String>() { // from class: com.stripe.android.link.ui.verification.VerificationViewModel$special$$inlined$map$1

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 VerificationViewModel.kt\ncom/stripe/android/link/ui/verification/VerificationViewModel\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,222:1\n48#2:223\n65#3:224\n1#4:225\n*E\n"})
            /* renamed from: com.stripe.android.link.ui.verification.VerificationViewModel$special$$inlined$map$1$2 */
            /* loaded from: classes7.dex */
            public static final class C190612<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.link.ui.verification.VerificationViewModel$special$$inlined$map$1$2", m28418f = "VerificationViewModel.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.link.ui.verification.VerificationViewModel$special$$inlined$map$1$2$1 */
                /* loaded from: classes7.dex */
                public static final class C190621 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C190621(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C190612.this.emit(null, this);
                    }
                }

                public C190612(InterfaceC33198Gu1 interfaceC33198Gu1) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C190621 c190621;
                    Object coroutine_suspended;
                    int i;
                    Object firstOrNull;
                    FormFieldEntry formFieldEntry;
                    if (continuation instanceof C190621) {
                        c190621 = (C190621) continuation;
                        int i2 = c190621.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c190621.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c190621.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c190621.label;
                            if (i == 0) {
                                if (i == 1) {
                                    ResultKt.throwOnFailure(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) obj);
                                Pair pair = (Pair) firstOrNull;
                                String str = null;
                                if (pair != null && (formFieldEntry = (FormFieldEntry) pair.getSecond()) != null) {
                                    if (!formFieldEntry.isComplete()) {
                                        formFieldEntry = null;
                                    }
                                    if (formFieldEntry != null) {
                                        str = formFieldEntry.getValue();
                                    }
                                }
                                c190621.label = 1;
                                if (interfaceC33198Gu1.emit(str, c190621) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c190621 = new C190621(continuation);
                    Object obj22 = c190621.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c190621.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super String> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C190612(interfaceC33198Gu1), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        }, C36218Tr6.m82333a(this), InterfaceC43640jz5.f93705a.m29520d(), null);
    }

    private final void clearError() {
        updateViewState(VerificationViewModel$clearError$1.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onError(Throwable th) {
        ErrorMessage errorMessage = ErrorMessageKt.getErrorMessage(th);
        this.logger.error("Error: ", th);
        updateViewState(new VerificationViewModel$onError$1$1(errorMessage));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateViewState(Function1<? super VerificationViewState, VerificationViewState> function1) {
        VerificationViewState value;
        GX2<VerificationViewState> gx2 = this._viewState;
        do {
            value = gx2.getValue();
        } while (!gx2.compareAndSet(value, function1.invoke(value)));
    }

    public final void didShowCodeSentNotification() {
        updateViewState(VerificationViewModel$didShowCodeSentNotification$1.INSTANCE);
    }

    public final LinkAccount getLinkAccount() {
        LinkAccount linkAccount = this.linkAccount;
        if (linkAccount != null) {
            return linkAccount;
        }
        Intrinsics.throwUninitializedPropertyAccessException("linkAccount");
        return null;
    }

    public final Function0<Unit> getOnVerificationCompleted() {
        return this.onVerificationCompleted;
    }

    public final OTPElement getOtpElement() {
        return this.otpElement;
    }

    public final InterfaceC49220tP5<VerificationViewState> getViewState() {
        return this.viewState;
    }

    public final void init$link_release(LinkAccount linkAccount) {
        Intrinsics.checkNotNullParameter(linkAccount, "linkAccount");
        setLinkAccount(linkAccount);
        if (linkAccount.getAccountStatus() != AccountStatus.VerificationStarted) {
            startVerification();
        }
        this.linkEventsReporter.on2FAStart();
        Z30.m73800d(C36218Tr6.m82333a(this), null, null, new VerificationViewModel$init$1(this, null), 3, null);
    }

    public final void onBack() {
        clearError();
        this.navigator.onBack(true);
        this.linkEventsReporter.on2FACancel();
        this.linkAccountManager.logout();
    }

    public final void onChangeEmailClicked() {
        clearError();
        this.navigator.navigateTo(LinkScreen.SignUp.INSTANCE, true);
        this.linkAccountManager.logout();
    }

    public final void onFocusRequested() {
        updateViewState(VerificationViewModel$onFocusRequested$1.INSTANCE);
    }

    public final void onVerificationCodeEntered(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        updateViewState(VerificationViewModel$onVerificationCodeEntered$1.INSTANCE);
        Z30.m73800d(C36218Tr6.m82333a(this), null, null, new VerificationViewModel$onVerificationCodeEntered$2(this, code, null), 3, null);
    }

    public final void resendCode() {
        updateViewState(VerificationViewModel$resendCode$1.INSTANCE);
        startVerification();
    }

    public final void setLinkAccount(LinkAccount linkAccount) {
        Intrinsics.checkNotNullParameter(linkAccount, "<set-?>");
        this.linkAccount = linkAccount;
    }

    public final void setOnVerificationCompleted(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onVerificationCompleted = function0;
    }

    public final void startVerification() {
        updateViewState(VerificationViewModel$startVerification$1.INSTANCE);
        Z30.m73800d(C36218Tr6.m82333a(this), null, null, new VerificationViewModel$startVerification$2(this, null), 3, null);
    }
}
