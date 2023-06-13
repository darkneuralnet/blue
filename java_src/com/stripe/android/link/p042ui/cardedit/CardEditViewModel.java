package com.stripe.android.link.p042ui.cardedit;

import androidx.lifecycle.C11759u;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.Injector;
import com.stripe.android.core.injection.NonFallbackInjectable;
import com.stripe.android.core.injection.NonFallbackInjector;
import com.stripe.android.core.model.CountryCode;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.link.LinkActivityContract;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.injection.SignedInViewModelSubcomponent;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.model.Navigator;
import com.stripe.android.link.p042ui.ErrorMessage;
import com.stripe.android.link.p042ui.ErrorMessageKt;
import com.stripe.android.link.p042ui.wallet.PaymentDetailsResult;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.p049ui.core.FieldValuesToParamsMapConverter;
import com.stripe.android.p049ui.core.FormController;
import com.stripe.android.p049ui.core.injection.FormControllerSubcomponent;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0001OB?\b\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010'\u001a\u00020&\u0012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)¢\u0006\u0004\bM\u0010NJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b*\u00020\u0007H\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\nH\u0007J\u000e\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eJ\u001a\u0010\u0013\u001a\u00020\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\bJ\u0016\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000eR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\"\u0010.\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001b\u00106\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u000e088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001d\u0010<\u001a\b\u0012\u0004\u0012\u00020\u000e0;8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b<\u0010>R\u001d\u0010@\u001a\b\u0012\u0004\u0012\u00020\u000e0?8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b@\u0010BR\u001f\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010C088\u0006¢\u0006\f\n\u0004\bD\u0010:\u001a\u0004\bE\u0010FR\u001c\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010G088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010:R\u001f\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010G0;8\u0006¢\u0006\f\n\u0004\bI\u0010=\u001a\u0004\bJ\u0010>R\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020\u000e088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010:R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0;8\u0006¢\u0006\f\n\u0004\b\u0010\u0010=\u001a\u0004\bL\u0010>¨\u0006P"}, m28432d2 = {"Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;", "LOr6;", "", "clearError", "", "error", "onError", "Lcom/stripe/android/model/ConsumerPaymentDetails$Card;", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "", "buildInitialFormValues", "paymentDetailsId", "initWithPaymentDetailsId", "", "checked", "setAsDefault", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "formValues", "updateCard", "Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "userInitiated", "dismiss", "Lcom/stripe/android/link/model/LinkAccount;", "linkAccount", "Lcom/stripe/android/link/model/LinkAccount;", "getLinkAccount", "()Lcom/stripe/android/link/model/LinkAccount;", "Lcom/stripe/android/link/account/LinkAccountManager;", "linkAccountManager", "Lcom/stripe/android/link/account/LinkAccountManager;", "Lcom/stripe/android/link/model/Navigator;", "navigator", "Lcom/stripe/android/link/model/Navigator;", "Lcom/stripe/android/core/Logger;", "logger", "Lcom/stripe/android/core/Logger;", "Lcom/stripe/android/link/LinkActivityContract$Args;", "args", "Lcom/stripe/android/link/LinkActivityContract$Args;", "LY94;", "Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;", "formControllerProvider", "LY94;", "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "paymentDetails", "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "getPaymentDetails", "()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "setPaymentDetails", "(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)V", "isDefault$delegate", "Lkotlin/Lazy;", "isDefault", "()Z", "LGX2;", "_isProcessing", "LGX2;", "LtP5;", "isProcessing", "LtP5;", "()LtP5;", "LEu1;", "isEnabled", "LEu1;", "()LEu1;", "Lcom/stripe/android/ui/core/FormController;", "formController", "getFormController", "()LGX2;", "Lcom/stripe/android/link/ui/ErrorMessage;", "_errorMessage", "errorMessage", "getErrorMessage", "_setAsDefault", "getSetAsDefault", "<init>", "(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/model/Navigator;Lcom/stripe/android/core/Logger;Lcom/stripe/android/link/LinkActivityContract$Args;LY94;)V", "Factory", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCardEditViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardEditViewModel.kt\ncom/stripe/android/link/ui/cardedit/CardEditViewModel\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,175:1\n47#2:176\n49#2:180\n50#3:177\n55#3:179\n106#4:178\n1#5:181\n*S KotlinDebug\n*F\n+ 1 CardEditViewModel.kt\ncom/stripe/android/link/ui/cardedit/CardEditViewModel\n*L\n49#1:176\n49#1:180\n49#1:177\n49#1:179\n49#1:178\n*E\n"})
/* renamed from: com.stripe.android.link.ui.cardedit.CardEditViewModel */
/* loaded from: classes7.dex */
public final class CardEditViewModel extends AbstractC35048Or6 {
    private final GX2<ErrorMessage> _errorMessage;
    private final GX2<Boolean> _isProcessing;
    private final GX2<Boolean> _setAsDefault;
    private final LinkActivityContract.Args args;
    private final InterfaceC49220tP5<ErrorMessage> errorMessage;
    private final GX2<FormController> formController;
    private final Y94<FormControllerSubcomponent.Builder> formControllerProvider;
    private final Lazy isDefault$delegate;
    private final InterfaceC32730Eu1<Boolean> isEnabled;
    private final InterfaceC49220tP5<Boolean> isProcessing;
    private final LinkAccount linkAccount;
    private final LinkAccountManager linkAccountManager;
    private final Logger logger;
    private final Navigator navigator;
    public ConsumerPaymentDetails.PaymentDetails paymentDetails;
    private final InterfaceC49220tP5<Boolean> setAsDefault;

    @Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, m28432d2 = {"Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$Factory;", "Landroidx/lifecycle/u$b;", "Lcom/stripe/android/core/injection/NonFallbackInjectable;", "LOr6;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)LOr6;", "Lcom/stripe/android/link/model/LinkAccount;", "linkAccount", "Lcom/stripe/android/link/model/LinkAccount;", "Lcom/stripe/android/core/injection/NonFallbackInjector;", "injector", "Lcom/stripe/android/core/injection/NonFallbackInjector;", "", "paymentDetailsId", "Ljava/lang/String;", "LY94;", "Lcom/stripe/android/link/injection/SignedInViewModelSubcomponent$Builder;", "subComponentBuilderProvider", "LY94;", "getSubComponentBuilderProvider", "()LY94;", "setSubComponentBuilderProvider", "(LY94;)V", "<init>", "(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/core/injection/NonFallbackInjector;Ljava/lang/String;)V", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: com.stripe.android.link.ui.cardedit.CardEditViewModel$Factory */
    /* loaded from: classes7.dex */
    public static final class Factory implements C11759u.InterfaceC11763b, NonFallbackInjectable {
        private final NonFallbackInjector injector;
        private final LinkAccount linkAccount;
        private final String paymentDetailsId;
        public Y94<SignedInViewModelSubcomponent.Builder> subComponentBuilderProvider;

        public Factory(LinkAccount linkAccount, NonFallbackInjector injector, String paymentDetailsId) {
            Intrinsics.checkNotNullParameter(linkAccount, "linkAccount");
            Intrinsics.checkNotNullParameter(injector, "injector");
            Intrinsics.checkNotNullParameter(paymentDetailsId, "paymentDetailsId");
            this.linkAccount = linkAccount;
            this.injector = injector;
            this.paymentDetailsId = paymentDetailsId;
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
            CardEditViewModel cardEditViewModel = getSubComponentBuilderProvider().get().linkAccount(this.linkAccount).build().getCardEditViewModel();
            cardEditViewModel.initWithPaymentDetailsId(this.paymentDetailsId);
            Intrinsics.checkNotNull(cardEditViewModel, "null cannot be cast to non-null type T of com.stripe.android.link.ui.cardedit.CardEditViewModel.Factory.create");
            return cardEditViewModel;
        }

        @Override // com.stripe.android.core.injection.NonFallbackInjectable
        /* renamed from: fallbackInitialize  reason: avoid collision after fix types in other method */
        public Void fallbackInitialize2(Unit unit) {
            return NonFallbackInjectable.DefaultImpls.fallbackInitialize(this, unit);
        }
    }

    public CardEditViewModel(LinkAccount linkAccount, LinkAccountManager linkAccountManager, Navigator navigator, Logger logger, LinkActivityContract.Args args, Y94<FormControllerSubcomponent.Builder> formControllerProvider) {
        Lazy lazy;
        Intrinsics.checkNotNullParameter(linkAccount, "linkAccount");
        Intrinsics.checkNotNullParameter(linkAccountManager, "linkAccountManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(formControllerProvider, "formControllerProvider");
        this.linkAccount = linkAccount;
        this.linkAccountManager = linkAccountManager;
        this.navigator = navigator;
        this.logger = logger;
        this.args = args;
        this.formControllerProvider = formControllerProvider;
        lazy = LazyKt__LazyJVMKt.lazy(new CardEditViewModel$isDefault$2(this));
        this.isDefault$delegate = lazy;
        Boolean bool = Boolean.FALSE;
        final GX2<Boolean> m8742a = C50405vP5.m8742a(bool);
        this._isProcessing = m8742a;
        this.isProcessing = m8742a;
        this.isEnabled = new InterfaceC32730Eu1<Boolean>() { // from class: com.stripe.android.link.ui.cardedit.CardEditViewModel$special$$inlined$map$1

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CardEditViewModel.kt\ncom/stripe/android/link/ui/cardedit/CardEditViewModel\n*L\n1#1,222:1\n48#2:223\n49#3:224\n*E\n"})
            /* renamed from: com.stripe.android.link.ui.cardedit.CardEditViewModel$special$$inlined$map$1$2 */
            /* loaded from: classes7.dex */
            public static final class C190092<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.link.ui.cardedit.CardEditViewModel$special$$inlined$map$1$2", m28418f = "CardEditViewModel.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.link.ui.cardedit.CardEditViewModel$special$$inlined$map$1$2$1 */
                /* loaded from: classes7.dex */
                public static final class C190101 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C190101(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C190092.this.emit(null, this);
                    }
                }

                public C190092(InterfaceC33198Gu1 interfaceC33198Gu1) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C190101 c190101;
                    Object coroutine_suspended;
                    int i;
                    if (continuation instanceof C190101) {
                        c190101 = (C190101) continuation;
                        int i2 = c190101.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c190101.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c190101.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c190101.label;
                            if (i == 0) {
                                if (i == 1) {
                                    ResultKt.throwOnFailure(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                Boolean boxBoolean = Boxing.boxBoolean(!((Boolean) obj).booleanValue());
                                c190101.label = 1;
                                if (interfaceC33198Gu1.emit(boxBoolean, c190101) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c190101 = new C190101(continuation);
                    Object obj22 = c190101.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c190101.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super Boolean> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C190092(interfaceC33198Gu1), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
        this.formController = C50405vP5.m8742a(null);
        GX2<ErrorMessage> m8742a2 = C50405vP5.m8742a(null);
        this._errorMessage = m8742a2;
        this.errorMessage = m8742a2;
        GX2<Boolean> m8742a3 = C50405vP5.m8742a(bool);
        this._setAsDefault = m8742a3;
        this.setAsDefault = m8742a3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009c, code lost:
        r7 = kotlin.collections.MapsKt__MapsJVMKt.mapOf(kotlin.TuplesKt.m28425to(r1.getPostalCode(), r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x007a, code lost:
        r2 = kotlin.collections.MapsKt__MapsJVMKt.mapOf(kotlin.TuplesKt.m28425to(r1.getCountry(), r2));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map<IdentifierSpec, String> buildInitialFormValues(ConsumerPaymentDetails.Card card) {
        String padStart;
        Map mapOf;
        Map emptyMap;
        Map plus;
        Map emptyMap2;
        Map<IdentifierSpec, String> plus2;
        CountryCode countryCode;
        IdentifierSpec.Companion companion = IdentifierSpec.Companion;
        IdentifierSpec cardNumber = companion.getCardNumber();
        String last4 = card.getLast4();
        IdentifierSpec cardExpMonth = companion.getCardExpMonth();
        padStart = StringsKt__StringsKt.padStart(String.valueOf(card.getExpiryMonth()), 2, '0');
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(cardNumber, "•••• " + last4), TuplesKt.m28425to(companion.getCardBrand(), card.getBrand().getCode()), TuplesKt.m28425to(cardExpMonth, padStart), TuplesKt.m28425to(companion.getCardExpYear(), String.valueOf(card.getExpiryYear())));
        ConsumerPaymentDetails.BillingAddress billingAddress = card.getBillingAddress();
        if (billingAddress == null || (countryCode = billingAddress.getCountryCode()) == null || (r2 = countryCode.getValue()) == null || emptyMap == null) {
            emptyMap = MapsKt__MapsKt.emptyMap();
        }
        plus = MapsKt__MapsKt.plus(mapOf, emptyMap);
        ConsumerPaymentDetails.BillingAddress billingAddress2 = card.getBillingAddress();
        if (billingAddress2 == null || (r7 = billingAddress2.getPostalCode()) == null || emptyMap2 == null) {
            emptyMap2 = MapsKt__MapsKt.emptyMap();
        }
        plus2 = MapsKt__MapsKt.plus(plus, emptyMap2);
        return plus2;
    }

    private final void clearError() {
        this._errorMessage.setValue(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onError(Throwable th) {
        ErrorMessage errorMessage = ErrorMessageKt.getErrorMessage(th);
        this.logger.error("Error: ", th);
        this._isProcessing.setValue(Boolean.FALSE);
        this._errorMessage.setValue(errorMessage);
    }

    public final void dismiss(PaymentDetailsResult result, boolean z) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.navigator.setResult(PaymentDetailsResult.KEY, result);
        this.navigator.onBack(z);
    }

    public final InterfaceC49220tP5<ErrorMessage> getErrorMessage() {
        return this.errorMessage;
    }

    public final GX2<FormController> getFormController() {
        return this.formController;
    }

    public final LinkAccount getLinkAccount() {
        return this.linkAccount;
    }

    public final ConsumerPaymentDetails.PaymentDetails getPaymentDetails() {
        ConsumerPaymentDetails.PaymentDetails paymentDetails = this.paymentDetails;
        if (paymentDetails != null) {
            return paymentDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("paymentDetails");
        return null;
    }

    public final InterfaceC49220tP5<Boolean> getSetAsDefault() {
        return this.setAsDefault;
    }

    public final void initWithPaymentDetailsId(String paymentDetailsId) {
        Intrinsics.checkNotNullParameter(paymentDetailsId, "paymentDetailsId");
        Z30.m73800d(C36218Tr6.m82333a(this), null, null, new CardEditViewModel$initWithPaymentDetailsId$1(this, paymentDetailsId, null), 3, null);
    }

    public final boolean isDefault() {
        return ((Boolean) this.isDefault$delegate.getValue()).booleanValue();
    }

    public final InterfaceC32730Eu1<Boolean> isEnabled() {
        return this.isEnabled;
    }

    public final InterfaceC49220tP5<Boolean> isProcessing() {
        return this.isProcessing;
    }

    public final void setAsDefault(boolean z) {
        this._setAsDefault.setValue(Boolean.valueOf(z));
    }

    public final void setPaymentDetails(ConsumerPaymentDetails.PaymentDetails paymentDetails) {
        Intrinsics.checkNotNullParameter(paymentDetails, "<set-?>");
        this.paymentDetails = paymentDetails;
    }

    public final void updateCard(Map<IdentifierSpec, FormFieldEntry> formValues) {
        Intrinsics.checkNotNullParameter(formValues, "formValues");
        clearError();
        this._isProcessing.setValue(Boolean.TRUE);
        Z30.m73800d(C36218Tr6.m82333a(this), null, null, new CardEditViewModel$updateCard$1(this, FieldValuesToParamsMapConverter.Companion.transformToPaymentMethodCreateParams(formValues, PaymentMethod.Type.Card.code, false), null), 3, null);
    }
}
