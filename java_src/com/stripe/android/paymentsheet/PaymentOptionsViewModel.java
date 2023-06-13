package com.stripe.android.paymentsheet;

import android.app.Application;
import androidx.lifecycle.C11747p;
import androidx.lifecycle.C11750q;
import androidx.lifecycle.C11759u;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.injection.InjectWithFallbackKt;
import com.stripe.android.core.injection.Injectable;
import com.stripe.android.core.injection.Injector;
import com.stripe.android.core.injection.NonFallbackInjector;
import com.stripe.android.link.LinkPaymentDetails;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.p049ui.core.forms.resources.LpmRepository;
import com.stripe.android.payments.core.injection.NamedConstantsKt;
import com.stripe.android.payments.paymentlauncher.PaymentResult;
import com.stripe.android.paymentsheet.LinkHandler;
import com.stripe.android.paymentsheet.PaymentOptionContract;
import com.stripe.android.paymentsheet.PaymentOptionResult;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.injection.DaggerPaymentOptionsViewModelFactoryComponent;
import com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelFactoryComponent;
import com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelSubcomponent;
import com.stripe.android.paymentsheet.model.IntentKt;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.navigation.PaymentSheetScreen;
import com.stripe.android.paymentsheet.p047ui.HeaderTextFactory;
import com.stripe.android.paymentsheet.p047ui.PrimaryButton;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import com.stripe.android.paymentsheet.state.GooglePayState;
import com.stripe.android.paymentsheet.state.LinkState;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.paymentsheet.viewmodels.PrimaryButtonUiStateMapper;
import com.stripe.android.utils.CreationExtrasKtxKt;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmSuppressWildcards;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC43640jz5;
@Metadata(m28433d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001WBi\b\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0014\u0010D\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010B\u0012\u0004\u0012\u00020C0A\u0012\u0006\u0010F\u001a\u00020E\u0012\u0006\u0010H\u001a\u00020G\u0012\b\b\u0001\u0010J\u001a\u00020I\u0012\u0006\u0010L\u001a\u00020K\u0012\u0006\u0010N\u001a\u00020M\u0012\u0006\u0010P\u001a\u00020O\u0012\u0006\u0010R\u001a\u00020Q\u0012\u0006\u0010T\u001a\u00020S¢\u0006\u0004\bU\u0010VJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\u001b\u0010\u0011\u001a\u00020\u00042\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0013H\u0016J\u0006\u0010\u0014\u001a\u00020\u0004J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0012\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R \u0010'\u001a\b\u0012\u0004\u0012\u00020#0&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\"\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130.8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b0\u00101R$\u00103\u001a\u0004\u0018\u0001028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001090.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010/\u001a\u0004\b;\u00101R\u001a\u0010=\u001a\u00020<8\u0016X\u0096D¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@¨\u0006X"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState;", "processingState", "", "handleLinkProcessingState", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "paymentSelection", "processExistingPaymentMethod", "processNewPaymentMethod", "", "throwable", "onFatal", "onUserCancel", "onFinish", "", "error", "onError", "(Ljava/lang/Integer;)V", "", "onUserSelection", "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;", "paymentResult", "onPaymentResult", BaseSheetViewModel.SAVE_SELECTION, "handlePaymentMethodSelected", "clearErrorMessages", "transitionToFirstScreen", "Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;", "args", "Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;", "Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;", "primaryButtonUiStateMapper", "Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;", "LBX2;", "Lcom/stripe/android/paymentsheet/PaymentOptionResult;", "_paymentOptionResult", "LBX2;", "LTy5;", "paymentOptionResult", "LTy5;", "getPaymentOptionResult$paymentsheet_release", "()LTy5;", "LGX2;", "_error", "LGX2;", "LtP5;", "LtP5;", "getError$paymentsheet_release", "()LtP5;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;", "newPaymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;", "getNewPaymentSelection", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;", "setNewPaymentSelection", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;)V", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;", "primaryButtonUiState", "getPrimaryButtonUiState", "", "shouldCompleteLinkFlowInline", "Z", "getShouldCompleteLinkFlowInline", "()Z", "Lkotlin/Function1;", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "Lcom/stripe/android/paymentsheet/PrefsRepository;", "prefsRepositoryFactory", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "eventReporter", "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;", "customerRepository", "Lkotlin/coroutines/CoroutineContext;", "workContext", "Landroid/app/Application;", "application", "Lcom/stripe/android/core/Logger;", "logger", "Lcom/stripe/android/ui/core/forms/resources/LpmRepository;", "lpmRepository", "Landroidx/lifecycle/p;", "savedStateHandle", "Lcom/stripe/android/paymentsheet/LinkHandler;", "linkHandler", "<init>", "(Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lkotlin/coroutines/CoroutineContext;Landroid/app/Application;Lcom/stripe/android/core/Logger;Lcom/stripe/android/ui/core/forms/resources/LpmRepository;Landroidx/lifecycle/p;Lcom/stripe/android/paymentsheet/LinkHandler;)V", "Factory", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@JvmSuppressWildcards
@SourceDebugExtension({"SMAP\nPaymentOptionsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentOptionsViewModel.kt\ncom/stripe/android/paymentsheet/PaymentOptionsViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,329:1\n1#2:330\n*E\n"})
/* loaded from: classes7.dex */
public final class PaymentOptionsViewModel extends BaseSheetViewModel {
    private final GX2<String> _error;
    private final BX2<PaymentOptionResult> _paymentOptionResult;
    private final PaymentOptionContract.Args args;
    private final InterfaceC49220tP5<String> error;
    private PaymentSelection.New newPaymentSelection;
    private final InterfaceC36280Ty5<PaymentOptionResult> paymentOptionResult;
    private final InterfaceC49220tP5<PrimaryButton.UIState> primaryButtonUiState;
    private final PrimaryButtonUiStateMapper primaryButtonUiStateMapper;
    private final boolean shouldCompleteLinkFlowInline;

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.stripe.android.paymentsheet.PaymentOptionsViewModel$1", m28418f = "PaymentOptionsViewModel.kt", m28417i = {}, m28416l = {110}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.stripe.android.paymentsheet.PaymentOptionsViewModel$1 */
    /* loaded from: classes7.dex */
    public static final class C191461 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
        final /* synthetic */ LinkHandler $linkHandler;
        int label;
        final /* synthetic */ PaymentOptionsViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C191461(LinkHandler linkHandler, PaymentOptionsViewModel paymentOptionsViewModel, Continuation<C191461> continuation) {
            super(2, continuation);
            this.$linkHandler = linkHandler;
            this.this$0 = paymentOptionsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C191461(this.$linkHandler, this.this$0, continuation);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(ZC0 zc0, Continuation<Unit> continuation) {
            return ((C191461) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                final PaymentOptionsViewModel paymentOptionsViewModel = this.this$0;
                InterfaceC33198Gu1<LinkHandler.ProcessingState> interfaceC33198Gu1 = new InterfaceC33198Gu1<LinkHandler.ProcessingState>() { // from class: com.stripe.android.paymentsheet.PaymentOptionsViewModel.1.1
                    @Override // p000.InterfaceC33198Gu1
                    public /* bridge */ /* synthetic */ Object emit(LinkHandler.ProcessingState processingState2, Continuation continuation) {
                        return emit2(processingState2, (Continuation<Unit>) continuation);
                    }

                    /* renamed from: emit  reason: avoid collision after fix types in other method */
                    public final Object emit2(LinkHandler.ProcessingState processingState2, Continuation<Unit> continuation) {
                        PaymentOptionsViewModel.this.handleLinkProcessingState(processingState2);
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

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return invoke2(zc0, (Continuation<Unit>) continuation);
        }
    }

    @Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001dB\u0015\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0003H\u0016R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R(\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$Factory;", "Landroidx/lifecycle/u$b;", "Lcom/stripe/android/core/injection/Injectable;", "Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$Factory$FallbackInitializeParam;", "LOr6;", "T", "Ljava/lang/Class;", "modelClass", "LFE0;", "extras", "create", "(Ljava/lang/Class;LFE0;)LOr6;", "arg", "Lcom/stripe/android/core/injection/Injector;", "fallbackInitialize", "Lkotlin/Function0;", "Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;", "starterArgsSupplier", "Lkotlin/jvm/functions/Function0;", "LY94;", "Lcom/stripe/android/paymentsheet/injection/PaymentOptionsViewModelSubcomponent$Builder;", "subComponentBuilderProvider", "LY94;", "getSubComponentBuilderProvider", "()LY94;", "setSubComponentBuilderProvider", "(LY94;)V", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "FallbackInitializeParam", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Factory implements C11759u.InterfaceC11763b, Injectable<FallbackInitializeParam> {
        private final Function0<PaymentOptionContract.Args> starterArgsSupplier;
        public Y94<PaymentOptionsViewModelSubcomponent.Builder> subComponentBuilderProvider;

        @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$Factory$FallbackInitializeParam;", "", "application", "Landroid/app/Application;", NamedConstantsKt.PRODUCT_USAGE, "", "", "(Landroid/app/Application;Ljava/util/Set;)V", "getApplication", "()Landroid/app/Application;", "getProductUsage", "()Ljava/util/Set;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class FallbackInitializeParam {
            private final Application application;
            private final Set<String> productUsage;

            public FallbackInitializeParam(Application application, Set<String> productUsage) {
                Intrinsics.checkNotNullParameter(application, "application");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                this.application = application;
                this.productUsage = productUsage;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ FallbackInitializeParam copy$default(FallbackInitializeParam fallbackInitializeParam, Application application, Set set, int i, Object obj) {
                if ((i & 1) != 0) {
                    application = fallbackInitializeParam.application;
                }
                if ((i & 2) != 0) {
                    set = fallbackInitializeParam.productUsage;
                }
                return fallbackInitializeParam.copy(application, set);
            }

            public final Application component1() {
                return this.application;
            }

            public final Set<String> component2() {
                return this.productUsage;
            }

            public final FallbackInitializeParam copy(Application application, Set<String> productUsage) {
                Intrinsics.checkNotNullParameter(application, "application");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                return new FallbackInitializeParam(application, productUsage);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof FallbackInitializeParam) {
                    FallbackInitializeParam fallbackInitializeParam = (FallbackInitializeParam) obj;
                    return Intrinsics.areEqual(this.application, fallbackInitializeParam.application) && Intrinsics.areEqual(this.productUsage, fallbackInitializeParam.productUsage);
                }
                return false;
            }

            public final Application getApplication() {
                return this.application;
            }

            public final Set<String> getProductUsage() {
                return this.productUsage;
            }

            public int hashCode() {
                return (this.application.hashCode() * 31) + this.productUsage.hashCode();
            }

            public String toString() {
                Application application = this.application;
                Set<String> set = this.productUsage;
                return "FallbackInitializeParam(application=" + application + ", productUsage=" + set + ")";
            }
        }

        public Factory(Function0<PaymentOptionContract.Args> starterArgsSupplier) {
            Intrinsics.checkNotNullParameter(starterArgsSupplier, "starterArgsSupplier");
            this.starterArgsSupplier = starterArgsSupplier;
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public /* bridge */ /* synthetic */ AbstractC35048Or6 create(Class cls) {
            return super.create(cls);
        }

        public final Y94<PaymentOptionsViewModelSubcomponent.Builder> getSubComponentBuilderProvider() {
            Y94<PaymentOptionsViewModelSubcomponent.Builder> y94 = this.subComponentBuilderProvider;
            if (y94 != null) {
                return y94;
            }
            Intrinsics.throwUninitializedPropertyAccessException("subComponentBuilderProvider");
            return null;
        }

        public final void setSubComponentBuilderProvider(Y94<PaymentOptionsViewModelSubcomponent.Builder> y94) {
            Intrinsics.checkNotNullParameter(y94, "<set-?>");
            this.subComponentBuilderProvider = y94;
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public <T extends AbstractC35048Or6> T create(Class<T> modelClass, FE0 extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            Application requireApplication = CreationExtrasKtxKt.requireApplication(extras);
            C11747p m66936a = C11750q.m66936a(extras);
            PaymentOptionContract.Args invoke = this.starterArgsSupplier.invoke();
            Injector injectWithFallback = InjectWithFallbackKt.injectWithFallback(this, invoke.getInjectorKey(), new FallbackInitializeParam(requireApplication, invoke.getProductUsage()));
            PaymentOptionsViewModel viewModel = getSubComponentBuilderProvider().get().application(requireApplication).args(invoke).savedStateHandle(m66936a).build().getViewModel();
            Intrinsics.checkNotNull(injectWithFallback, "null cannot be cast to non-null type com.stripe.android.core.injection.NonFallbackInjector");
            viewModel.setInjector((NonFallbackInjector) injectWithFallback);
            Intrinsics.checkNotNull(viewModel, "null cannot be cast to non-null type T of com.stripe.android.paymentsheet.PaymentOptionsViewModel.Factory.create");
            return viewModel;
        }

        @Override // com.stripe.android.core.injection.Injectable
        public Injector fallbackInitialize(FallbackInitializeParam arg) {
            Intrinsics.checkNotNullParameter(arg, "arg");
            PaymentOptionsViewModelFactoryComponent build = DaggerPaymentOptionsViewModelFactoryComponent.builder().context(arg.getApplication()).productUsage(arg.getProductUsage()).build();
            build.inject(this);
            return build;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PaymentOptionsViewModel(PaymentOptionContract.Args args, Function1<PaymentSheet.CustomerConfiguration, PrefsRepository> prefsRepositoryFactory, EventReporter eventReporter, CustomerRepository customerRepository, @IOContext CoroutineContext workContext, Application application, Logger logger, LpmRepository lpmRepository, C11747p savedStateHandle, LinkHandler linkHandler) {
        super(application, r5, eventReporter, customerRepository, prefsRepositoryFactory.invoke(r1), workContext, logger, lpmRepository, savedStateHandle, linkHandler, new HeaderTextFactory(false));
        PaymentSheet.CustomerConfiguration customerConfiguration;
        GooglePayState googlePayState;
        PaymentSelection.New.LinkInline linkInline;
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(prefsRepositoryFactory, "prefsRepositoryFactory");
        Intrinsics.checkNotNullParameter(eventReporter, "eventReporter");
        Intrinsics.checkNotNullParameter(customerRepository, "customerRepository");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(lpmRepository, "lpmRepository");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(linkHandler, "linkHandler");
        PaymentSheet.Configuration config = args.getState().getConfig();
        PaymentSheet.Configuration config2 = args.getState().getConfig();
        if (config2 != null) {
            customerConfiguration = config2.getCustomer();
        } else {
            customerConfiguration = null;
        }
        this.args = args;
        Application application2 = getApplication();
        Intrinsics.checkNotNullExpressionValue(application2, "getApplication()");
        PrimaryButtonUiStateMapper primaryButtonUiStateMapper = new PrimaryButtonUiStateMapper(application2, getConfig$paymentsheet_release(), args.getState().getStripeIntent() instanceof PaymentIntent, getCurrentScreen(), getButtonsEnabled(), getAmount$paymentsheet_release(), getSelection$paymentsheet_release(), getCustomPrimaryButtonUiState(), new PaymentOptionsViewModel$primaryButtonUiStateMapper$1(this));
        this.primaryButtonUiStateMapper = primaryButtonUiStateMapper;
        BX2<PaymentOptionResult> m79031b = C36748Vy5.m79031b(1, 0, null, 6, null);
        this._paymentOptionResult = m79031b;
        this.paymentOptionResult = m79031b;
        GX2<String> m8742a = C50405vP5.m8742a(null);
        this._error = m8742a;
        this.error = m8742a;
        this.newPaymentSelection = args.getState().getNewPaymentSelection();
        this.primaryButtonUiState = C36708Vu1.m79273O(primaryButtonUiStateMapper.forCustomFlow(), C36218Tr6.m82333a(this), InterfaceC43640jz5.C25067a.m29522b(InterfaceC43640jz5.f93705a, 0L, 0L, 3, null), null);
        if (args.getState().isGooglePayReady()) {
            googlePayState = GooglePayState.Available.INSTANCE;
        } else {
            googlePayState = GooglePayState.NotAvailable.INSTANCE;
        }
        savedStateHandle.m66940m(BaseSheetViewModel.SAVE_GOOGLE_PAY_STATE, googlePayState);
        LinkState linkState = args.getState().getLinkState();
        Z30.m73800d(C36218Tr6.m82333a(this), null, null, new C191461(linkHandler, this, null), 3, null);
        GX2<PaymentSelection.New.LinkInline> linkInlineSelection = linkHandler.getLinkInlineSelection();
        PaymentSelection.New newPaymentSelection = args.getState().getNewPaymentSelection();
        if (newPaymentSelection instanceof PaymentSelection.New.LinkInline) {
            linkInline = (PaymentSelection.New.LinkInline) newPaymentSelection;
        } else {
            linkInline = null;
        }
        linkInlineSelection.setValue(linkInline);
        linkHandler.prepareLink(linkState);
        if (getStripeIntent$paymentsheet_release().getValue() == null) {
            setStripeIntent(args.getState().getStripeIntent());
        }
        savedStateHandle.m66940m(BaseSheetViewModel.SAVE_PAYMENT_METHODS, args.getState().getCustomerPaymentMethods());
        savedStateHandle.m66940m(BaseSheetViewModel.SAVE_SAVED_SELECTION, args.getState().getSavedSelection());
        savedStateHandle.m66940m(BaseSheetViewModel.SAVE_PROCESSING, Boolean.FALSE);
        setLpmServerSpec$paymentsheet_release(lpmRepository.getServerSpecLoadingState().getServerLpmSpecs());
        transitionToFirstScreen();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleLinkProcessingState(LinkHandler.ProcessingState processingState) {
        if (Intrinsics.areEqual(processingState, LinkHandler.ProcessingState.Cancelled.INSTANCE)) {
            onPaymentResult(PaymentResult.Canceled.INSTANCE);
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
            onPaymentResult(PaymentResult.Completed.INSTANCE);
        } else if (processingState instanceof LinkHandler.ProcessingState.CompletedWithPaymentResult) {
            setContentVisible(true);
            onPaymentResult(((LinkHandler.ProcessingState.CompletedWithPaymentResult) processingState).getResult());
        } else if (processingState instanceof LinkHandler.ProcessingState.Error) {
            onError(((LinkHandler.ProcessingState.Error) processingState).getMessage());
        } else if (Intrinsics.areEqual(processingState, LinkHandler.ProcessingState.Launched.INSTANCE)) {
            setContentVisible(false);
        } else if (processingState instanceof LinkHandler.ProcessingState.PaymentDetailsCollected) {
            LinkPaymentDetails.New details = ((LinkHandler.ProcessingState.PaymentDetailsCollected) processingState).getDetails();
            if (details != null) {
                updateSelection(new PaymentSelection.New.LinkInline(details));
                onUserSelection();
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                onUserSelection();
            }
        } else if (Intrinsics.areEqual(processingState, LinkHandler.ProcessingState.Ready.INSTANCE)) {
            updatePrimaryButtonState(PrimaryButton.State.Ready.INSTANCE);
        } else if (Intrinsics.areEqual(processingState, LinkHandler.ProcessingState.Started.INSTANCE)) {
            updatePrimaryButtonState(PrimaryButton.State.StartProcessing.INSTANCE);
        }
    }

    private final void processExistingPaymentMethod(PaymentSelection paymentSelection) {
        getPrefsRepository().savePaymentSelection(paymentSelection);
        this._paymentOptionResult.mo10357b(new PaymentOptionResult.Succeeded(paymentSelection, getPaymentMethods$paymentsheet_release().getValue()));
    }

    private final void processNewPaymentMethod(PaymentSelection paymentSelection) {
        getPrefsRepository().savePaymentSelection(paymentSelection);
        this._paymentOptionResult.mo10357b(new PaymentOptionResult.Succeeded(paymentSelection, getPaymentMethods$paymentsheet_release().getValue()));
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void clearErrorMessages() {
        this._error.setValue(null);
    }

    public final InterfaceC49220tP5<String> getError$paymentsheet_release() {
        return this.error;
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public PaymentSelection.New getNewPaymentSelection() {
        return this.newPaymentSelection;
    }

    public final InterfaceC36280Ty5<PaymentOptionResult> getPaymentOptionResult$paymentsheet_release() {
        return this.paymentOptionResult;
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public InterfaceC49220tP5<PrimaryButton.UIState> getPrimaryButtonUiState() {
        return this.primaryButtonUiState;
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public boolean getShouldCompleteLinkFlowInline() {
        return this.shouldCompleteLinkFlowInline;
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void handlePaymentMethodSelected(PaymentSelection paymentSelection) {
        if (!getEditing$paymentsheet_release().getValue().booleanValue()) {
            updateSelection(paymentSelection);
            boolean z = false;
            if (paymentSelection != null && paymentSelection.getRequiresConfirmation()) {
                z = true;
            }
            if (!z) {
                onUserSelection();
            }
        }
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void onError(Integer num) {
        String str;
        if (num != null) {
            str = getApplication().getString(num.intValue());
        } else {
            str = null;
        }
        onError(str);
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void onFatal(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        setMostRecentError(throwable);
        this._paymentOptionResult.mo10357b(new PaymentOptionResult.Failed(throwable, getPaymentMethods$paymentsheet_release().getValue()));
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void onFinish() {
        onUserSelection();
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void onPaymentResult(PaymentResult paymentResult) {
        Intrinsics.checkNotNullParameter(paymentResult, "paymentResult");
        getSavedStateHandle().m66940m(BaseSheetViewModel.SAVE_PROCESSING, Boolean.FALSE);
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void onUserCancel() {
        this._paymentOptionResult.mo10357b(new PaymentOptionResult.Canceled(getMostRecentError(), getSelection$paymentsheet_release().getValue(), getPaymentMethods$paymentsheet_release().getValue()));
    }

    public final void onUserSelection() {
        String str;
        boolean z;
        clearErrorMessages();
        PaymentSelection value = getSelection$paymentsheet_release().getValue();
        if (value != null) {
            EventReporter eventReporter$paymentsheet_release = getEventReporter$paymentsheet_release();
            StripeIntent value2 = getStripeIntent$paymentsheet_release().getValue();
            if (value2 != null) {
                str = IntentKt.getCurrency(value2);
            } else {
                str = null;
            }
            eventReporter$paymentsheet_release.onSelectPaymentOption(value, str);
            boolean z2 = true;
            if (value instanceof PaymentSelection.Saved) {
                z = true;
            } else {
                z = value instanceof PaymentSelection.GooglePay;
            }
            if (!z) {
                z2 = value instanceof PaymentSelection.Link;
            }
            if (z2) {
                processExistingPaymentMethod(value);
            } else if (value instanceof PaymentSelection.New) {
                processNewPaymentMethod(value);
            }
        }
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void setNewPaymentSelection(PaymentSelection.New r1) {
        this.newPaymentSelection = r1;
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void transitionToFirstScreen() {
        PaymentSheetScreen paymentSheetScreen;
        List createListBuilder;
        List<PaymentSheetScreen> build;
        Object last;
        if (this.args.getState().getHasPaymentOptions()) {
            paymentSheetScreen = PaymentSheetScreen.SelectSavedPaymentMethods.INSTANCE;
        } else {
            paymentSheetScreen = PaymentSheetScreen.AddFirstPaymentMethod.INSTANCE;
        }
        createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        createListBuilder.add(paymentSheetScreen);
        if ((paymentSheetScreen instanceof PaymentSheetScreen.SelectSavedPaymentMethods) && getNewPaymentSelection() != null) {
            createListBuilder.add(PaymentSheetScreen.AddAnotherPaymentMethod.INSTANCE);
        }
        build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
        getBackStack().setValue(build);
        last = CollectionsKt___CollectionsKt.last((List<? extends Object>) build);
        reportNavigationEvent((PaymentSheetScreen) last);
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void onError(String str) {
        this._error.setValue(str);
    }
}
