package com.stripe.android.link.p042ui.wallet;

import androidx.lifecycle.C11759u;
import com.google.android.gms.location.places.Place;
import com.stripe.android.IntentConfirmationInterceptor;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.Injector;
import com.stripe.android.core.injection.NonFallbackInjectable;
import com.stripe.android.core.injection.NonFallbackInjector;
import com.stripe.android.link.LinkActivityContract;
import com.stripe.android.link.LinkActivityResult;
import com.stripe.android.link.LinkScreen;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.confirmation.ConfirmationManager;
import com.stripe.android.link.injection.SignedInViewModelSubcomponent;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.model.Navigator;
import com.stripe.android.link.model.SupportedPaymentMethodTypesKt;
import com.stripe.android.link.p042ui.ErrorMessage;
import com.stripe.android.link.p042ui.ErrorMessageKt;
import com.stripe.android.link.p042ui.wallet.PaymentDetailsResult;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.ConsumerPaymentDetailsUpdateParams;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.p049ui.core.address.AddressUtilKt;
import com.stripe.android.p049ui.core.elements.CvcController;
import com.stripe.android.payments.paymentlauncher.PaymentResult;
import com.stripe.android.uicore.elements.DateConfig;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.SimpleTextFieldController;
import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001]B9\b\u0007\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u0010:\u001a\u000209\u0012\u0006\u0010=\u001a\u00020<\u0012\u0006\u0010@\u001a\u00020?\u0012\u0006\u0010C\u001a\u00020B¢\u0006\u0004\b[\u0010\\J#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002J*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u001e\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010\u001d\u001a\u00020\u0006H\u0002J\u0010\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eH\u0002J\u0010\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020!H\u0002J\u0010\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u001eH\u0002J\u0006\u0010$\u001a\u00020\u0006J\u000e\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0019J\u0006\u0010'\u001a\u00020\u0006J\u0010\u0010)\u001a\u00020\u00062\b\b\u0002\u0010(\u001a\u00020\u0019J\u000e\u0010+\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0002J\u000e\u0010,\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0002J\u000e\u0010-\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0002J\u000e\u0010/\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u0002J\u0006\u00100\u001a\u00020\u0006R\u0017\u00102\u001a\u0002018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020I0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001d\u0010M\u001a\b\u0012\u0004\u0012\u00020I0L8\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u0017\u0010R\u001a\u00020Q8\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0017\u0010W\u001a\u00020V8\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006^"}, m28432d2 = {"Lcom/stripe/android/link/ui/wallet/WalletViewModel;", "LOr6;", "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "selectedPaymentDetails", "Lcom/stripe/android/link/model/LinkAccount;", "linkAccount", "", "performPaymentConfirmation", "(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lcom/stripe/android/link/model/LinkAccount;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "confirmParams", "confirmStripeIntent", "", "clientSecret", "handleNextAction", "Lkotlin/Result;", "Lcom/stripe/android/model/ConsumerPaymentDetails;", "performPaymentDetailsUpdate-gIAlu-s", "(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "performPaymentDetailsUpdate", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "createPaymentMethodCreateParams", "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;", "paymentResult", "handleConfirmPaymentSuccess", "", "initialSetup", "selectedItem", "loadPaymentDetails", "clearError", "", "error", "onError", "Lcom/stripe/android/link/ui/ErrorMessage;", "fatalError", "onFatal", "onConfirmPayment", "expanded", "setExpanded", "payAnotherWay", "clearBackStack", "addNewPaymentMethod", "paymentDetails", "editPaymentMethod", "setDefault", "deletePaymentMethod", "item", "onItemSelected", "onAlertDismissed", "Lcom/stripe/android/link/LinkActivityContract$Args;", "args", "Lcom/stripe/android/link/LinkActivityContract$Args;", "getArgs", "()Lcom/stripe/android/link/LinkActivityContract$Args;", "Lcom/stripe/android/link/account/LinkAccountManager;", "linkAccountManager", "Lcom/stripe/android/link/account/LinkAccountManager;", "Lcom/stripe/android/link/model/Navigator;", "navigator", "Lcom/stripe/android/link/model/Navigator;", "Lcom/stripe/android/link/confirmation/ConfirmationManager;", "confirmationManager", "Lcom/stripe/android/link/confirmation/ConfirmationManager;", "Lcom/stripe/android/core/Logger;", "logger", "Lcom/stripe/android/core/Logger;", "Lcom/stripe/android/IntentConfirmationInterceptor;", "intentConfirmationInterceptor", "Lcom/stripe/android/IntentConfirmationInterceptor;", "Lcom/stripe/android/model/StripeIntent;", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "LGX2;", "Lcom/stripe/android/link/ui/wallet/WalletUiState;", "_uiState", "LGX2;", "LtP5;", "uiState", "LtP5;", "getUiState", "()LtP5;", "Lcom/stripe/android/uicore/elements/SimpleTextFieldController;", "expiryDateController", "Lcom/stripe/android/uicore/elements/SimpleTextFieldController;", "getExpiryDateController", "()Lcom/stripe/android/uicore/elements/SimpleTextFieldController;", "Lcom/stripe/android/ui/core/elements/CvcController;", "cvcController", "Lcom/stripe/android/ui/core/elements/CvcController;", "getCvcController", "()Lcom/stripe/android/ui/core/elements/CvcController;", "<init>", "(Lcom/stripe/android/link/LinkActivityContract$Args;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/model/Navigator;Lcom/stripe/android/link/confirmation/ConfirmationManager;Lcom/stripe/android/core/Logger;Lcom/stripe/android/IntentConfirmationInterceptor;)V", "Factory", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWalletViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WalletViewModel.kt\ncom/stripe/android/link/ui/wallet/WalletViewModel\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,418:1\n47#2:419\n49#2:423\n50#3:420\n55#3:422\n106#4:421\n230#5,5:424\n230#5,5:441\n230#5,5:447\n230#5,5:452\n230#5,5:457\n230#5,5:462\n230#5,5:467\n230#5,5:472\n230#5,5:477\n230#5,5:482\n230#5,5:487\n618#6,12:429\n1#7:446\n*S KotlinDebug\n*F\n+ 1 WalletViewModel.kt\ncom/stripe/android/link/ui/wallet/WalletViewModel\n*L\n72#1:419\n72#1:423\n72#1:420\n72#1:422\n72#1:421\n118#1:424,5\n144#1:441,5\n233#1:447,5\n252#1:452,5\n271#1:457,5\n300#1:462,5\n324#1:467,5\n330#1:472,5\n339#1:477,5\n370#1:482,5\n381#1:487,5\n137#1:429,12\n*E\n"})
/* renamed from: com.stripe.android.link.ui.wallet.WalletViewModel */
/* loaded from: classes7.dex */
public final class WalletViewModel extends AbstractC35048Or6 {
    private final GX2<WalletUiState> _uiState;
    private final LinkActivityContract.Args args;
    private final ConfirmationManager confirmationManager;
    private final CvcController cvcController;
    private final SimpleTextFieldController expiryDateController;
    private final IntentConfirmationInterceptor intentConfirmationInterceptor;
    private final LinkAccountManager linkAccountManager;
    private final Logger logger;
    private final Navigator navigator;
    private final StripeIntent stripeIntent;
    private final InterfaceC49220tP5<WalletUiState> uiState;

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.stripe.android.link.ui.wallet.WalletViewModel$1", m28418f = "WalletViewModel.kt", m28417i = {}, m28416l = {81}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.stripe.android.link.ui.wallet.WalletViewModel$1 */
    /* loaded from: classes7.dex */
    public static final class C190811 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
        int label;

        public C190811(Continuation<? super C190811> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C190811(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C190811) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                GX2 gx2 = WalletViewModel.this._uiState;
                final WalletViewModel walletViewModel = WalletViewModel.this;
                InterfaceC33198Gu1<WalletUiState> interfaceC33198Gu1 = new InterfaceC33198Gu1<WalletUiState>() { // from class: com.stripe.android.link.ui.wallet.WalletViewModel.1.1
                    @Override // p000.InterfaceC33198Gu1
                    public /* bridge */ /* synthetic */ Object emit(WalletUiState walletUiState, Continuation continuation) {
                        return emit2(walletUiState, (Continuation<? super Unit>) continuation);
                    }

                    /* renamed from: emit  reason: avoid collision after fix types in other method */
                    public final Object emit2(WalletUiState walletUiState, Continuation<? super Unit> continuation) {
                        WalletViewModel.this.navigator.setUserNavigationEnabled(!walletUiState.getPrimaryButtonState().isBlocking());
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (gx2.collect(interfaceC33198Gu1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.stripe.android.link.ui.wallet.WalletViewModel$2", m28418f = "WalletViewModel.kt", m28417i = {}, m28416l = {87}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.stripe.android.link.ui.wallet.WalletViewModel$2 */
    /* loaded from: classes7.dex */
    public static final class C190832 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
        int label;

        public C190832(Continuation<? super C190832> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C190832(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C190832) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC32730Eu1<FormFieldEntry> formFieldValue = WalletViewModel.this.getExpiryDateController().getFormFieldValue();
                final WalletViewModel walletViewModel = WalletViewModel.this;
                InterfaceC33198Gu1<FormFieldEntry> interfaceC33198Gu1 = new InterfaceC33198Gu1<FormFieldEntry>() { // from class: com.stripe.android.link.ui.wallet.WalletViewModel.2.1
                    @Override // p000.InterfaceC33198Gu1
                    public /* bridge */ /* synthetic */ Object emit(FormFieldEntry formFieldEntry, Continuation continuation) {
                        return emit2(formFieldEntry, (Continuation<? super Unit>) continuation);
                    }

                    /* renamed from: emit  reason: avoid collision after fix types in other method */
                    public final Object emit2(FormFieldEntry formFieldEntry, Continuation<? super Unit> continuation) {
                        Object value;
                        GX2 gx2 = WalletViewModel.this._uiState;
                        do {
                            value = gx2.getValue();
                        } while (!gx2.compareAndSet(value, WalletUiState.copy$default((WalletUiState) value, null, null, null, false, false, false, null, formFieldEntry, null, null, null, 1919, null)));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (formFieldValue.collect(interfaceC33198Gu1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.stripe.android.link.ui.wallet.WalletViewModel$3", m28418f = "WalletViewModel.kt", m28417i = {}, m28416l = {95}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.stripe.android.link.ui.wallet.WalletViewModel$3 */
    /* loaded from: classes7.dex */
    public static final class C190853 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
        int label;

        public C190853(Continuation<? super C190853> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C190853(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C190853) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC32730Eu1<FormFieldEntry> formFieldValue = WalletViewModel.this.getCvcController().getFormFieldValue();
                final WalletViewModel walletViewModel = WalletViewModel.this;
                InterfaceC33198Gu1<FormFieldEntry> interfaceC33198Gu1 = new InterfaceC33198Gu1<FormFieldEntry>() { // from class: com.stripe.android.link.ui.wallet.WalletViewModel.3.1
                    @Override // p000.InterfaceC33198Gu1
                    public /* bridge */ /* synthetic */ Object emit(FormFieldEntry formFieldEntry, Continuation continuation) {
                        return emit2(formFieldEntry, (Continuation<? super Unit>) continuation);
                    }

                    /* renamed from: emit  reason: avoid collision after fix types in other method */
                    public final Object emit2(FormFieldEntry formFieldEntry, Continuation<? super Unit> continuation) {
                        Object value;
                        GX2 gx2 = WalletViewModel.this._uiState;
                        do {
                            value = gx2.getValue();
                        } while (!gx2.compareAndSet(value, WalletUiState.copy$default((WalletUiState) value, null, null, null, false, false, false, null, null, formFieldEntry, null, null, 1791, null)));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (formFieldValue.collect(interfaceC33198Gu1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.stripe.android.link.ui.wallet.WalletViewModel$4", m28418f = "WalletViewModel.kt", m28417i = {}, m28416l = {103}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.stripe.android.link.ui.wallet.WalletViewModel$4 */
    /* loaded from: classes7.dex */
    public static final class C190874 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
        int label;

        public C190874(Continuation<? super C190874> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C190874(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C190874) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC32730Eu1 resultFlow = WalletViewModel.this.navigator.getResultFlow(PaymentDetailsResult.KEY);
                if (resultFlow != null) {
                    final WalletViewModel walletViewModel = WalletViewModel.this;
                    InterfaceC33198Gu1<PaymentDetailsResult> interfaceC33198Gu1 = new InterfaceC33198Gu1<PaymentDetailsResult>() { // from class: com.stripe.android.link.ui.wallet.WalletViewModel.4.1
                        @Override // p000.InterfaceC33198Gu1
                        public /* bridge */ /* synthetic */ Object emit(PaymentDetailsResult paymentDetailsResult, Continuation continuation) {
                            return emit2(paymentDetailsResult, (Continuation<? super Unit>) continuation);
                        }

                        /* renamed from: emit  reason: avoid collision after fix types in other method */
                        public final Object emit2(PaymentDetailsResult paymentDetailsResult, Continuation<? super Unit> continuation) {
                            if (paymentDetailsResult instanceof PaymentDetailsResult.Success) {
                                WalletViewModel.loadPaymentDetails$default(WalletViewModel.this, false, ((PaymentDetailsResult.Success) paymentDetailsResult).getItemId(), 1, null);
                            } else if (!Intrinsics.areEqual(paymentDetailsResult, PaymentDetailsResult.Cancelled.INSTANCE) && (paymentDetailsResult instanceof PaymentDetailsResult.Failure)) {
                                WalletViewModel.this.onError(((PaymentDetailsResult.Failure) paymentDetailsResult).getError());
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (resultFlow.collect(interfaceC33198Gu1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR(\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, m28432d2 = {"Lcom/stripe/android/link/ui/wallet/WalletViewModel$Factory;", "Landroidx/lifecycle/u$b;", "Lcom/stripe/android/core/injection/NonFallbackInjectable;", "LOr6;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)LOr6;", "Lcom/stripe/android/link/model/LinkAccount;", "linkAccount", "Lcom/stripe/android/link/model/LinkAccount;", "Lcom/stripe/android/core/injection/NonFallbackInjector;", "injector", "Lcom/stripe/android/core/injection/NonFallbackInjector;", "LY94;", "Lcom/stripe/android/link/injection/SignedInViewModelSubcomponent$Builder;", "subComponentBuilderProvider", "LY94;", "getSubComponentBuilderProvider", "()LY94;", "setSubComponentBuilderProvider", "(LY94;)V", "<init>", "(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/core/injection/NonFallbackInjector;)V", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: com.stripe.android.link.ui.wallet.WalletViewModel$Factory */
    /* loaded from: classes7.dex */
    public static final class Factory implements C11759u.InterfaceC11763b, NonFallbackInjectable {
        private final NonFallbackInjector injector;
        private final LinkAccount linkAccount;
        public Y94<SignedInViewModelSubcomponent.Builder> subComponentBuilderProvider;

        public Factory(LinkAccount linkAccount, NonFallbackInjector injector) {
            Intrinsics.checkNotNullParameter(linkAccount, "linkAccount");
            Intrinsics.checkNotNullParameter(injector, "injector");
            this.linkAccount = linkAccount;
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
            WalletViewModel walletViewModel = getSubComponentBuilderProvider().get().linkAccount(this.linkAccount).build().getWalletViewModel();
            Intrinsics.checkNotNull(walletViewModel, "null cannot be cast to non-null type T of com.stripe.android.link.ui.wallet.WalletViewModel.Factory.create");
            return walletViewModel;
        }

        @Override // com.stripe.android.core.injection.NonFallbackInjectable
        /* renamed from: fallbackInitialize  reason: avoid collision after fix types in other method */
        public Void fallbackInitialize2(Unit unit) {
            return NonFallbackInjectable.DefaultImpls.fallbackInitialize(this, unit);
        }
    }

    public WalletViewModel(LinkActivityContract.Args args, LinkAccountManager linkAccountManager, Navigator navigator, ConfirmationManager confirmationManager, Logger logger, IntentConfirmationInterceptor intentConfirmationInterceptor) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(linkAccountManager, "linkAccountManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(confirmationManager, "confirmationManager");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(intentConfirmationInterceptor, "intentConfirmationInterceptor");
        this.args = args;
        this.linkAccountManager = linkAccountManager;
        this.navigator = navigator;
        this.confirmationManager = confirmationManager;
        this.logger = logger;
        this.intentConfirmationInterceptor = intentConfirmationInterceptor;
        this.stripeIntent = args.getStripeIntent$link_release();
        StripeIntent stripeIntent$link_release = args.getStripeIntent$link_release();
        LinkAccount value = linkAccountManager.getLinkAccount().getValue();
        if (value != null) {
            final GX2<WalletUiState> m8742a = C50405vP5.m8742a(new WalletUiState(SupportedPaymentMethodTypesKt.supportedPaymentMethodTypes(stripeIntent$link_release, value), null, null, false, false, false, null, null, null, null, null, 2046, null));
            this._uiState = m8742a;
            this.uiState = m8742a;
            this.expiryDateController = new SimpleTextFieldController(new DateConfig(), false, null, 2, null);
            this.cvcController = new CvcController(null, new InterfaceC32730Eu1<CardBrand>() { // from class: com.stripe.android.link.ui.wallet.WalletViewModel$special$$inlined$map$1

                @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 WalletViewModel.kt\ncom/stripe/android/link/ui/wallet/WalletViewModel\n*L\n1#1,222:1\n48#2:223\n73#3:224\n*E\n"})
                /* renamed from: com.stripe.android.link.ui.wallet.WalletViewModel$special$$inlined$map$1$2 */
                /* loaded from: classes7.dex */
                public static final class C190892<T> implements InterfaceC33198Gu1 {
                    final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;

                    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                    @DebugMetadata(m28419c = "com.stripe.android.link.ui.wallet.WalletViewModel$special$$inlined$map$1$2", m28418f = "WalletViewModel.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                    /* renamed from: com.stripe.android.link.ui.wallet.WalletViewModel$special$$inlined$map$1$2$1 */
                    /* loaded from: classes7.dex */
                    public static final class C190901 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public C190901(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C190892.this.emit(null, this);
                        }
                    }

                    public C190892(InterfaceC33198Gu1 interfaceC33198Gu1) {
                        this.$this_unsafeFlow = interfaceC33198Gu1;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                    @Override // p000.InterfaceC33198Gu1
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        C190901 c190901;
                        Object coroutine_suspended;
                        int i;
                        ConsumerPaymentDetails.Card card;
                        CardBrand cardBrand;
                        if (continuation instanceof C190901) {
                            c190901 = (C190901) continuation;
                            int i2 = c190901.label;
                            if ((i2 & Integer.MIN_VALUE) != 0) {
                                c190901.label = i2 - Integer.MIN_VALUE;
                                Object obj2 = c190901.result;
                                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = c190901.label;
                                if (i == 0) {
                                    if (i == 1) {
                                        ResultKt.throwOnFailure(obj2);
                                    } else {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                } else {
                                    ResultKt.throwOnFailure(obj2);
                                    InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                    ConsumerPaymentDetails.PaymentDetails selectedItem = ((WalletUiState) obj).getSelectedItem();
                                    if (selectedItem instanceof ConsumerPaymentDetails.Card) {
                                        card = (ConsumerPaymentDetails.Card) selectedItem;
                                    } else {
                                        card = null;
                                    }
                                    if (card == null || (cardBrand = card.getBrand()) == null) {
                                        cardBrand = CardBrand.Unknown;
                                    }
                                    c190901.label = 1;
                                    if (interfaceC33198Gu1.emit(cardBrand, c190901) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                        }
                        c190901 = new C190901(continuation);
                        Object obj22 = c190901.result;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c190901.label;
                        if (i == 0) {
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // p000.InterfaceC32730Eu1
                public Object collect(InterfaceC33198Gu1<? super CardBrand> interfaceC33198Gu1, Continuation continuation) {
                    Object coroutine_suspended;
                    Object collect = InterfaceC32730Eu1.this.collect(new C190892(interfaceC33198Gu1), continuation);
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (collect == coroutine_suspended) {
                        return collect;
                    }
                    return Unit.INSTANCE;
                }
            }, null, false, 13, null);
            loadPaymentDetails$default(this, true, null, 2, null);
            Z30.m73800d(C36218Tr6.m82333a(this), null, null, new C190811(null), 3, null);
            Z30.m73800d(C36218Tr6.m82333a(this), null, null, new C190832(null), 3, null);
            Z30.m73800d(C36218Tr6.m82333a(this), null, null, new C190853(null), 3, null);
            Z30.m73800d(C36218Tr6.m82333a(this), null, null, new C190874(null), 3, null);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static /* synthetic */ void addNewPaymentMethod$default(WalletViewModel walletViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        walletViewModel.addNewPaymentMethod(z);
    }

    private final void clearError() {
        WalletUiState value;
        GX2<WalletUiState> gx2 = this._uiState;
        do {
            value = gx2.getValue();
        } while (!gx2.compareAndSet(value, WalletUiState.copy$default(value, null, null, null, false, false, false, null, null, null, null, null, 1983, null)));
    }

    private final void confirmStripeIntent(ConfirmStripeIntentParams confirmStripeIntentParams) {
        this.confirmationManager.confirmStripeIntent(confirmStripeIntentParams, new WalletViewModel$confirmStripeIntent$1(this));
    }

    private final PaymentMethodCreateParams createPaymentMethodCreateParams(ConsumerPaymentDetails.PaymentDetails paymentDetails, LinkAccount linkAccount) {
        String str;
        Map mapOf;
        FormFieldEntry cvcInput = this.uiState.getValue().getCvcInput();
        Map<String, ? extends Object> map = null;
        if (!cvcInput.isComplete()) {
            cvcInput = null;
        }
        if (cvcInput != null) {
            str = cvcInput.getValue();
        } else {
            str = null;
        }
        if (str != null) {
            mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("cvc", str));
            map = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("card", mapOf));
        }
        return PaymentMethodCreateParams.Companion.createLink(paymentDetails.getId(), linkAccount.getClientSecret(), map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleConfirmPaymentSuccess(PaymentResult paymentResult) {
        WalletUiState value;
        GX2<WalletUiState> gx2 = this._uiState;
        do {
            value = gx2.getValue();
        } while (!gx2.compareAndSet(value, value.updateWithPaymentResult(paymentResult)));
        if (!(paymentResult instanceof PaymentResult.Canceled)) {
            if (paymentResult instanceof PaymentResult.Failed) {
                this.logger.error("Error: ", ((PaymentResult.Failed) paymentResult).getThrowable());
            } else if (paymentResult instanceof PaymentResult.Completed) {
                Z30.m73800d(C36218Tr6.m82333a(this), null, null, new WalletViewModel$handleConfirmPaymentSuccess$2(this, null), 3, null);
            }
        }
    }

    private final void handleNextAction(String str) {
        this.confirmationManager.handleNextAction(str, this.stripeIntent, new WalletViewModel$handleNextAction$1(this));
    }

    private final void loadPaymentDetails(boolean z, String str) {
        WalletUiState value;
        GX2<WalletUiState> gx2 = this._uiState;
        do {
            value = gx2.getValue();
        } while (!gx2.compareAndSet(value, value.setProcessing()));
        Z30.m73800d(C36218Tr6.m82333a(this), null, null, new WalletViewModel$loadPaymentDetails$2(this, z, str, null), 3, null);
    }

    public static /* synthetic */ void loadPaymentDetails$default(WalletViewModel walletViewModel, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        walletViewModel.loadPaymentDetails(z, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onError(Throwable th) {
        this.logger.error("Error: ", th);
        onError(ErrorMessageKt.getErrorMessage(th));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFatal(Throwable th) {
        this.logger.error("Fatal error: ", th);
        this.navigator.dismiss(new LinkActivityResult.Failed(th));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object performPaymentConfirmation(ConsumerPaymentDetails.PaymentDetails paymentDetails, LinkAccount linkAccount, Continuation<? super Unit> continuation) {
        WalletViewModel$performPaymentConfirmation$1 walletViewModel$performPaymentConfirmation$1;
        Object coroutine_suspended;
        int i;
        WalletViewModel walletViewModel;
        LinkAccount linkAccount2;
        Object m116573performPaymentDetailsUpdategIAlus;
        WalletViewModel walletViewModel2;
        Throwable m116786exceptionOrNullimpl;
        WalletUiState value;
        IntentConfirmationInterceptor.NextStep nextStep;
        ConsumerPaymentDetails.PaymentDetails paymentDetails2 = paymentDetails;
        if (continuation instanceof WalletViewModel$performPaymentConfirmation$1) {
            walletViewModel$performPaymentConfirmation$1 = (WalletViewModel$performPaymentConfirmation$1) continuation;
            int i2 = walletViewModel$performPaymentConfirmation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walletViewModel$performPaymentConfirmation$1.label = i2 - Integer.MIN_VALUE;
                WalletViewModel$performPaymentConfirmation$1 walletViewModel$performPaymentConfirmation$12 = walletViewModel$performPaymentConfirmation$1;
                Object obj = walletViewModel$performPaymentConfirmation$12.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = walletViewModel$performPaymentConfirmation$12.label;
                boolean z = false;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ConsumerPaymentDetails.Card card = paymentDetails2 instanceof ConsumerPaymentDetails.Card ? (ConsumerPaymentDetails.Card) paymentDetails2 : null;
                    if (card != null && card.isExpired()) {
                        walletViewModel$performPaymentConfirmation$12.L$0 = this;
                        walletViewModel$performPaymentConfirmation$12.L$1 = paymentDetails2;
                        linkAccount2 = linkAccount;
                        walletViewModel$performPaymentConfirmation$12.L$2 = linkAccount2;
                        walletViewModel$performPaymentConfirmation$12.label = 1;
                        m116573performPaymentDetailsUpdategIAlus = m116573performPaymentDetailsUpdategIAlus(paymentDetails2, walletViewModel$performPaymentConfirmation$12);
                        if (m116573performPaymentDetailsUpdategIAlus == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        walletViewModel2 = this;
                        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116573performPaymentDetailsUpdategIAlus);
                        if (m116786exceptionOrNullimpl != null) {
                        }
                    } else {
                        PaymentMethodCreateParams createPaymentMethodCreateParams = createPaymentMethodCreateParams(paymentDetails, linkAccount);
                        IntentConfirmationInterceptor intentConfirmationInterceptor = this.intentConfirmationInterceptor;
                        String clientSecret = this.stripeIntent.getClientSecret();
                        Map<IdentifierSpec, String> shippingValues$link_release = this.args.getShippingValues$link_release();
                        ConfirmPaymentIntentParams.Shipping confirmPaymentIntentShipping = shippingValues$link_release != null ? AddressUtilKt.toConfirmPaymentIntentShipping(shippingValues$link_release) : null;
                        walletViewModel$performPaymentConfirmation$12.L$0 = this;
                        walletViewModel$performPaymentConfirmation$12.label = 3;
                        obj = intentConfirmationInterceptor.intercept(clientSecret, createPaymentMethodCreateParams, confirmPaymentIntentShipping, (ConfirmPaymentIntentParams.SetupFutureUsage) null, walletViewModel$performPaymentConfirmation$12);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        walletViewModel = this;
                        nextStep = (IntentConfirmationInterceptor.NextStep) obj;
                        if (!(nextStep instanceof IntentConfirmationInterceptor.NextStep.Confirm)) {
                        }
                    }
                } else if (i == 1) {
                    walletViewModel2 = (WalletViewModel) walletViewModel$performPaymentConfirmation$12.L$0;
                    ResultKt.throwOnFailure(obj);
                    Object m116792unboximpl = ((Result) obj).m116792unboximpl();
                    linkAccount2 = (LinkAccount) walletViewModel$performPaymentConfirmation$12.L$2;
                    paymentDetails2 = (ConsumerPaymentDetails.PaymentDetails) walletViewModel$performPaymentConfirmation$12.L$1;
                    m116573performPaymentDetailsUpdategIAlus = m116792unboximpl;
                    m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116573performPaymentDetailsUpdategIAlus);
                    if (m116786exceptionOrNullimpl != null) {
                        Object obj2 = null;
                        for (Object obj3 : ((ConsumerPaymentDetails) m116573performPaymentDetailsUpdategIAlus).getPaymentDetails()) {
                            if (Intrinsics.areEqual(((ConsumerPaymentDetails.PaymentDetails) obj3).getId(), paymentDetails2.getId())) {
                                if (z) {
                                    throw new IllegalArgumentException("Collection contains more than one matching element.");
                                }
                                z = true;
                                obj2 = obj3;
                            }
                        }
                        if (z) {
                            walletViewModel$performPaymentConfirmation$12.L$0 = null;
                            walletViewModel$performPaymentConfirmation$12.L$1 = null;
                            walletViewModel$performPaymentConfirmation$12.L$2 = null;
                            walletViewModel$performPaymentConfirmation$12.label = 2;
                            if (walletViewModel2.performPaymentConfirmation((ConsumerPaymentDetails.PaymentDetails) obj2, linkAccount2, walletViewModel$performPaymentConfirmation$12) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    } else {
                        GX2<WalletUiState> gx2 = walletViewModel2._uiState;
                        do {
                            value = gx2.getValue();
                        } while (!gx2.compareAndSet(value, WalletUiState.copy$default(value, null, null, null, false, false, false, null, null, null, ErrorMessageKt.getErrorMessage(m116786exceptionOrNullimpl), null, 1519, null)));
                    }
                } else if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                } else if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    walletViewModel = (WalletViewModel) walletViewModel$performPaymentConfirmation$12.L$0;
                    ResultKt.throwOnFailure(obj);
                    nextStep = (IntentConfirmationInterceptor.NextStep) obj;
                    if (!(nextStep instanceof IntentConfirmationInterceptor.NextStep.Confirm)) {
                        walletViewModel.confirmStripeIntent(((IntentConfirmationInterceptor.NextStep.Confirm) nextStep).getConfirmParams());
                    } else if (nextStep instanceof IntentConfirmationInterceptor.NextStep.HandleNextAction) {
                        walletViewModel.handleNextAction(((IntentConfirmationInterceptor.NextStep.HandleNextAction) nextStep).getClientSecret());
                    } else if (nextStep instanceof IntentConfirmationInterceptor.NextStep.Fail) {
                        walletViewModel.onError(new ErrorMessage.Raw(((IntentConfirmationInterceptor.NextStep.Fail) nextStep).getMessage()));
                    } else if (nextStep instanceof IntentConfirmationInterceptor.NextStep.Complete) {
                        walletViewModel.handleConfirmPaymentSuccess(PaymentResult.Completed.INSTANCE);
                    }
                }
                return Unit.INSTANCE;
            }
        }
        walletViewModel$performPaymentConfirmation$1 = new WalletViewModel$performPaymentConfirmation$1(this, continuation);
        WalletViewModel$performPaymentConfirmation$1 walletViewModel$performPaymentConfirmation$122 = walletViewModel$performPaymentConfirmation$1;
        Object obj4 = walletViewModel$performPaymentConfirmation$122.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = walletViewModel$performPaymentConfirmation$122.label;
        boolean z2 = false;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* renamed from: performPaymentDetailsUpdate-gIAlu-s  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m116573performPaymentDetailsUpdategIAlus(ConsumerPaymentDetails.PaymentDetails paymentDetails, Continuation<? super Result<ConsumerPaymentDetails>> continuation) {
        WalletViewModel$performPaymentDetailsUpdate$1 walletViewModel$performPaymentDetailsUpdate$1;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof WalletViewModel$performPaymentDetailsUpdate$1) {
            walletViewModel$performPaymentDetailsUpdate$1 = (WalletViewModel$performPaymentDetailsUpdate$1) continuation;
            int i2 = walletViewModel$performPaymentDetailsUpdate$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walletViewModel$performPaymentDetailsUpdate$1.label = i2 - Integer.MIN_VALUE;
                Object obj = walletViewModel$performPaymentDetailsUpdate$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = walletViewModel$performPaymentDetailsUpdate$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                        return ((Result) obj).m116792unboximpl();
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ConsumerPaymentDetailsUpdateParams consumerPaymentDetailsUpdateParams = new ConsumerPaymentDetailsUpdateParams(paymentDetails.getId(), Boxing.boxBoolean(paymentDetails.isDefault()), WalletViewModelKt.access$toPaymentMethodCreateParams(this.uiState.getValue()));
                LinkAccountManager linkAccountManager = this.linkAccountManager;
                walletViewModel$performPaymentDetailsUpdate$1.label = 1;
                Object m116499updatePaymentDetailsgIAlus = linkAccountManager.m116499updatePaymentDetailsgIAlus(consumerPaymentDetailsUpdateParams, walletViewModel$performPaymentDetailsUpdate$1);
                if (m116499updatePaymentDetailsgIAlus == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return m116499updatePaymentDetailsgIAlus;
            }
        }
        walletViewModel$performPaymentDetailsUpdate$1 = new WalletViewModel$performPaymentDetailsUpdate$1(this, continuation);
        Object obj2 = walletViewModel$performPaymentDetailsUpdate$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = walletViewModel$performPaymentDetailsUpdate$1.label;
        if (i == 0) {
        }
    }

    public final void addNewPaymentMethod(boolean z) {
        this.navigator.navigateTo(new LinkScreen.PaymentMethod(false, 1, null), z);
    }

    public final void deletePaymentMethod(ConsumerPaymentDetails.PaymentDetails paymentDetails) {
        WalletUiState value;
        Intrinsics.checkNotNullParameter(paymentDetails, "paymentDetails");
        GX2<WalletUiState> gx2 = this._uiState;
        do {
            value = gx2.getValue();
        } while (!gx2.compareAndSet(value, value.setProcessing()));
        Z30.m73800d(C36218Tr6.m82333a(this), null, null, new WalletViewModel$deletePaymentMethod$2(this, paymentDetails, null), 3, null);
    }

    public final void editPaymentMethod(ConsumerPaymentDetails.PaymentDetails paymentDetails) {
        Intrinsics.checkNotNullParameter(paymentDetails, "paymentDetails");
        clearError();
        Navigator.navigateTo$default(this.navigator, new LinkScreen.CardEdit(paymentDetails.getId()), false, 2, null);
    }

    public final LinkActivityContract.Args getArgs() {
        return this.args;
    }

    public final CvcController getCvcController() {
        return this.cvcController;
    }

    public final SimpleTextFieldController getExpiryDateController() {
        return this.expiryDateController;
    }

    public final InterfaceC49220tP5<WalletUiState> getUiState() {
        return this.uiState;
    }

    public final void onAlertDismissed() {
        WalletUiState value;
        GX2<WalletUiState> gx2 = this._uiState;
        do {
            value = gx2.getValue();
        } while (!gx2.compareAndSet(value, WalletUiState.copy$default(value, null, null, null, false, false, false, null, null, null, null, null, 1535, null)));
    }

    public final void onConfirmPayment() {
        LinkAccount value;
        WalletUiState value2;
        ConsumerPaymentDetails.PaymentDetails selectedItem = this.uiState.getValue().getSelectedItem();
        if (selectedItem == null || (value = this.linkAccountManager.getLinkAccount().getValue()) == null) {
            return;
        }
        GX2<WalletUiState> gx2 = this._uiState;
        do {
            value2 = gx2.getValue();
        } while (!gx2.compareAndSet(value2, value2.setProcessing()));
        Z30.m73800d(C36218Tr6.m82333a(this), null, null, new WalletViewModel$onConfirmPayment$2(this, selectedItem, value, null), 3, null);
    }

    public final void onItemSelected(ConsumerPaymentDetails.PaymentDetails item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (Intrinsics.areEqual(item, this.uiState.getValue().getSelectedItem())) {
            return;
        }
        this.expiryDateController.onRawValueChange("");
        this.cvcController.onRawValueChange("");
        GX2<WalletUiState> gx2 = this._uiState;
        while (true) {
            WalletUiState value = gx2.getValue();
            GX2<WalletUiState> gx22 = gx2;
            if (gx22.compareAndSet(value, WalletUiState.copy$default(value, null, null, item, false, false, false, null, null, null, null, null, 2043, null))) {
                return;
            }
            gx2 = gx22;
        }
    }

    public final void payAnotherWay() {
        this.navigator.cancel(LinkActivityResult.Canceled.Reason.PayAnotherWay);
    }

    public final void setDefault(ConsumerPaymentDetails.PaymentDetails paymentDetails) {
        WalletUiState value;
        Intrinsics.checkNotNullParameter(paymentDetails, "paymentDetails");
        GX2<WalletUiState> gx2 = this._uiState;
        do {
            value = gx2.getValue();
        } while (!gx2.compareAndSet(value, WalletUiState.copy$default(value, null, null, null, false, false, false, null, null, null, null, paymentDetails.getId(), Place.TYPE_SUBLOCALITY_LEVEL_1, null)));
        Z30.m73800d(C36218Tr6.m82333a(this), null, null, new WalletViewModel$setDefault$2(paymentDetails, this, null), 3, null);
    }

    public final void setExpanded(boolean z) {
        WalletUiState value;
        GX2<WalletUiState> gx2 = this._uiState;
        do {
            value = gx2.getValue();
        } while (!gx2.compareAndSet(value, WalletUiState.copy$default(value, null, null, null, z, false, false, null, null, null, null, null, 2039, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onError(ErrorMessage errorMessage) {
        WalletUiState value;
        GX2<WalletUiState> gx2 = this._uiState;
        do {
            value = gx2.getValue();
        } while (!gx2.compareAndSet(value, value.updateWithError(errorMessage)));
    }
}
