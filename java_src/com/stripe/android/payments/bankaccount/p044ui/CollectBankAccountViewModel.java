package com.stripe.android.payments.bankaccount.p044ui;

import androidx.lifecycle.C11747p;
import androidx.lifecycle.C11750q;
import androidx.lifecycle.C11759u;
import com.amazonaws.services.p026s3.model.InstructionFileId;
import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.FinancialConnectionsSheetResult;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.payments.bankaccount.CollectBankAccountConfiguration;
import com.stripe.android.payments.bankaccount.domain.AttachFinancialConnectionsSession;
import com.stripe.android.payments.bankaccount.domain.CreateFinancialConnectionsSession;
import com.stripe.android.payments.bankaccount.domain.RetrieveStripeIntent;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResult;
import com.stripe.android.payments.bankaccount.p043di.DaggerCollectBankAccountComponent;
import com.stripe.android.payments.bankaccount.p044ui.CollectBankAccountViewEffect;
import com.stripe.android.utils.CreationExtrasKtxKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u0000 62\u00020\u0001:\u000267BG\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b4\u00105J\u0013\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u001b\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0011R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00170(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R$\u00103\u001a\u00020-2\u0006\u0010.\u001a\u00020-8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102\u0082\u0002\u0004\n\u0002\b\u0019¨\u00068"}, m28432d2 = {"Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;", "LOr6;", "", "createFinancialConnectionsSession", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "finishWithResult", "(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "financialConnectionsSession", "finishWithFinancialConnectionsSession", "attachFinancialConnectionsSessionToIntent", "", "throwable", "finishWithError", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;", "onConnectionsResult", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;", "args", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;", "LBX2;", "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect;", "_viewEffect", "LBX2;", "Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;", "Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;", "Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;", "attachFinancialConnectionsSession", "Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;", "Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;", "retrieveStripeIntent", "Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;", "Landroidx/lifecycle/p;", "savedStateHandle", "Landroidx/lifecycle/p;", "Lcom/stripe/android/core/Logger;", "logger", "Lcom/stripe/android/core/Logger;", "LTy5;", "viewEffect", "LTy5;", "getViewEffect", "()LTy5;", "", "value", "getHasLaunched", "()Z", "setHasLaunched", "(Z)V", "hasLaunched", "<init>", "(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;LBX2;Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;Landroidx/lifecycle/p;Lcom/stripe/android/core/Logger;)V", "Companion", "Factory", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCollectBankAccountViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectBankAccountViewModel.kt\ncom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,193:1\n1#2:194\n*E\n"})
/* renamed from: com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel */
/* loaded from: classes7.dex */
public final class CollectBankAccountViewModel extends AbstractC35048Or6 {
    public static final Companion Companion = new Companion(null);
    private static final String KEY_HAS_LAUNCHED = "key_has_launched";
    private final BX2<CollectBankAccountViewEffect> _viewEffect;
    private final CollectBankAccountContract.Args args;
    private final AttachFinancialConnectionsSession attachFinancialConnectionsSession;
    private final CreateFinancialConnectionsSession createFinancialConnectionsSession;
    private final Logger logger;
    private final RetrieveStripeIntent retrieveStripeIntent;
    private final C11747p savedStateHandle;
    private final InterfaceC36280Ty5<CollectBankAccountViewEffect> viewEffect;

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$1", m28418f = "CollectBankAccountViewModel.kt", m28417i = {}, m28416l = {53}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$1 */
    /* loaded from: classes7.dex */
    public static final class C191091 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
        int label;

        public C191091(Continuation<? super C191091> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C191091(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C191091) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                CollectBankAccountViewModel collectBankAccountViewModel = CollectBankAccountViewModel.this;
                this.label = 1;
                if (collectBankAccountViewModel.createFinancialConnectionsSession(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$Companion;", "", "()V", "KEY_HAS_LAUNCHED", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$Factory;", "Landroidx/lifecycle/u$b;", "LOr6;", "T", "Ljava/lang/Class;", "modelClass", "LFE0;", "extras", "create", "(Ljava/lang/Class;LFE0;)LOr6;", "Lkotlin/Function0;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;", "argsSupplier", "Lkotlin/jvm/functions/Function0;", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$Factory */
    /* loaded from: classes7.dex */
    public static final class Factory implements C11759u.InterfaceC11763b {
        public static final int $stable = 0;
        private final Function0<CollectBankAccountContract.Args> argsSupplier;

        /* JADX WARN: Multi-variable type inference failed */
        public Factory(Function0<? extends CollectBankAccountContract.Args> argsSupplier) {
            Intrinsics.checkNotNullParameter(argsSupplier, "argsSupplier");
            this.argsSupplier = argsSupplier;
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public /* bridge */ /* synthetic */ AbstractC35048Or6 create(Class cls) {
            return super.create(cls);
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public <T extends AbstractC35048Or6> T create(Class<T> modelClass, FE0 extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            CollectBankAccountViewModel viewModel = DaggerCollectBankAccountComponent.builder().savedStateHandle(C11750q.m66936a(extras)).application(CreationExtrasKtxKt.requireApplication(extras)).viewEffect(C36748Vy5.m79031b(0, 0, null, 7, null)).configuration(this.argsSupplier.invoke()).build().getViewModel();
            Intrinsics.checkNotNull(viewModel, "null cannot be cast to non-null type T of com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel.Factory.create");
            return viewModel;
        }
    }

    public CollectBankAccountViewModel(CollectBankAccountContract.Args args, BX2<CollectBankAccountViewEffect> _viewEffect, CreateFinancialConnectionsSession createFinancialConnectionsSession, AttachFinancialConnectionsSession attachFinancialConnectionsSession, RetrieveStripeIntent retrieveStripeIntent, C11747p savedStateHandle, Logger logger) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(_viewEffect, "_viewEffect");
        Intrinsics.checkNotNullParameter(createFinancialConnectionsSession, "createFinancialConnectionsSession");
        Intrinsics.checkNotNullParameter(attachFinancialConnectionsSession, "attachFinancialConnectionsSession");
        Intrinsics.checkNotNullParameter(retrieveStripeIntent, "retrieveStripeIntent");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.args = args;
        this._viewEffect = _viewEffect;
        this.createFinancialConnectionsSession = createFinancialConnectionsSession;
        this.attachFinancialConnectionsSession = attachFinancialConnectionsSession;
        this.retrieveStripeIntent = retrieveStripeIntent;
        this.savedStateHandle = savedStateHandle;
        this.logger = logger;
        this.viewEffect = _viewEffect;
        if (!getHasLaunched()) {
            Z30.m73800d(C36218Tr6.m82333a(this), null, null, new C191091(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void attachFinancialConnectionsSessionToIntent(FinancialConnectionsSession financialConnectionsSession) {
        Z30.m73800d(C36218Tr6.m82333a(this), null, null, new C19110x58884842(this, financialConnectionsSession, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createFinancialConnectionsSession(Continuation<? super Unit> continuation) {
        CollectBankAccountViewModel$createFinancialConnectionsSession$1 collectBankAccountViewModel$createFinancialConnectionsSession$1;
        Object coroutine_suspended;
        int i;
        Object m116583forSetupIntenthUnOzRk;
        CollectBankAccountViewModel collectBankAccountViewModel;
        CollectBankAccountViewModel collectBankAccountViewModel2;
        String clientSecret;
        Object m116783constructorimpl;
        Object obj;
        Throwable m116786exceptionOrNullimpl;
        if (continuation instanceof CollectBankAccountViewModel$createFinancialConnectionsSession$1) {
            collectBankAccountViewModel$createFinancialConnectionsSession$1 = (CollectBankAccountViewModel$createFinancialConnectionsSession$1) continuation;
            int i2 = collectBankAccountViewModel$createFinancialConnectionsSession$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                collectBankAccountViewModel$createFinancialConnectionsSession$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = collectBankAccountViewModel$createFinancialConnectionsSession$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = collectBankAccountViewModel$createFinancialConnectionsSession$1.label;
                if (i == 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                ResultKt.throwOnFailure(obj2);
                                return Unit.INSTANCE;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj = collectBankAccountViewModel$createFinancialConnectionsSession$1.L$1;
                        collectBankAccountViewModel2 = (CollectBankAccountViewModel) collectBankAccountViewModel$createFinancialConnectionsSession$1.L$0;
                        ResultKt.throwOnFailure(obj2);
                    } else {
                        collectBankAccountViewModel = (CollectBankAccountViewModel) collectBankAccountViewModel$createFinancialConnectionsSession$1.L$0;
                        ResultKt.throwOnFailure(obj2);
                        m116583forSetupIntenthUnOzRk = ((Result) obj2).m116792unboximpl();
                        collectBankAccountViewModel2 = collectBankAccountViewModel;
                        if (Result.m116790isSuccessimpl(m116583forSetupIntenthUnOzRk)) {
                            try {
                                clientSecret = ((com.stripe.android.model.FinancialConnectionsSession) m116583forSetupIntenthUnOzRk).getClientSecret();
                            } catch (Throwable th) {
                                Result.Companion companion = Result.Companion;
                                m116583forSetupIntenthUnOzRk = ResultKt.createFailure(th);
                            }
                            if (clientSecret != null) {
                                m116783constructorimpl = Result.m116783constructorimpl(clientSecret);
                                obj = m116783constructorimpl;
                                if (Result.m116790isSuccessimpl(obj)) {
                                    String str = (String) obj;
                                    Logger logger = collectBankAccountViewModel2.logger;
                                    logger.debug("Bank account session created! " + str + InstructionFileId.DOT);
                                    collectBankAccountViewModel2.setHasLaunched(true);
                                    BX2<CollectBankAccountViewEffect> bx2 = collectBankAccountViewModel2._viewEffect;
                                    CollectBankAccountViewEffect.OpenConnectionsFlow openConnectionsFlow = new CollectBankAccountViewEffect.OpenConnectionsFlow(collectBankAccountViewModel2.args.getPublishableKey(), str, collectBankAccountViewModel2.args.getStripeAccountId());
                                    collectBankAccountViewModel$createFinancialConnectionsSession$1.L$0 = collectBankAccountViewModel2;
                                    collectBankAccountViewModel$createFinancialConnectionsSession$1.L$1 = obj;
                                    collectBankAccountViewModel$createFinancialConnectionsSession$1.label = 3;
                                    if (bx2.emit(openConnectionsFlow, collectBankAccountViewModel$createFinancialConnectionsSession$1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                        }
                        m116783constructorimpl = Result.m116783constructorimpl(m116583forSetupIntenthUnOzRk);
                        obj = m116783constructorimpl;
                        if (Result.m116790isSuccessimpl(obj)) {
                        }
                    }
                } else {
                    ResultKt.throwOnFailure(obj2);
                    CollectBankAccountConfiguration configuration = this.args.getConfiguration();
                    if (configuration instanceof CollectBankAccountConfiguration.USBankAccount) {
                        CollectBankAccountContract.Args args = this.args;
                        if (args instanceof CollectBankAccountContract.Args.ForPaymentIntent) {
                            CreateFinancialConnectionsSession createFinancialConnectionsSession = this.createFinancialConnectionsSession;
                            String publishableKey = args.getPublishableKey();
                            String stripeAccountId = this.args.getStripeAccountId();
                            String clientSecret2 = this.args.getClientSecret();
                            CollectBankAccountConfiguration.USBankAccount uSBankAccount = (CollectBankAccountConfiguration.USBankAccount) configuration;
                            String name = uSBankAccount.getName();
                            String email = uSBankAccount.getEmail();
                            collectBankAccountViewModel$createFinancialConnectionsSession$1.L$0 = this;
                            collectBankAccountViewModel$createFinancialConnectionsSession$1.label = 1;
                            m116583forSetupIntenthUnOzRk = createFinancialConnectionsSession.m116582forPaymentIntenthUnOzRk(publishableKey, clientSecret2, name, email, stripeAccountId, collectBankAccountViewModel$createFinancialConnectionsSession$1);
                            if (m116583forSetupIntenthUnOzRk == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else if (args instanceof CollectBankAccountContract.Args.ForSetupIntent) {
                            CreateFinancialConnectionsSession createFinancialConnectionsSession2 = this.createFinancialConnectionsSession;
                            String publishableKey2 = args.getPublishableKey();
                            String stripeAccountId2 = this.args.getStripeAccountId();
                            String clientSecret3 = this.args.getClientSecret();
                            CollectBankAccountConfiguration.USBankAccount uSBankAccount2 = (CollectBankAccountConfiguration.USBankAccount) configuration;
                            String name2 = uSBankAccount2.getName();
                            String email2 = uSBankAccount2.getEmail();
                            collectBankAccountViewModel$createFinancialConnectionsSession$1.L$0 = this;
                            collectBankAccountViewModel$createFinancialConnectionsSession$1.label = 2;
                            m116583forSetupIntenthUnOzRk = createFinancialConnectionsSession2.m116583forSetupIntenthUnOzRk(publishableKey2, clientSecret3, name2, email2, stripeAccountId2, collectBankAccountViewModel$createFinancialConnectionsSession$1);
                            if (m116583forSetupIntenthUnOzRk == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        collectBankAccountViewModel = this;
                        collectBankAccountViewModel2 = collectBankAccountViewModel;
                        if (Result.m116790isSuccessimpl(m116583forSetupIntenthUnOzRk)) {
                        }
                        m116783constructorimpl = Result.m116783constructorimpl(m116583forSetupIntenthUnOzRk);
                        obj = m116783constructorimpl;
                        if (Result.m116790isSuccessimpl(obj)) {
                        }
                    }
                    return Unit.INSTANCE;
                }
                m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(obj);
                if (m116786exceptionOrNullimpl != null) {
                    collectBankAccountViewModel$createFinancialConnectionsSession$1.L$0 = obj;
                    collectBankAccountViewModel$createFinancialConnectionsSession$1.L$1 = null;
                    collectBankAccountViewModel$createFinancialConnectionsSession$1.label = 4;
                    if (collectBankAccountViewModel2.finishWithError(m116786exceptionOrNullimpl, collectBankAccountViewModel$createFinancialConnectionsSession$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        collectBankAccountViewModel$createFinancialConnectionsSession$1 = new CollectBankAccountViewModel$createFinancialConnectionsSession$1(this, continuation);
        Object obj22 = collectBankAccountViewModel$createFinancialConnectionsSession$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = collectBankAccountViewModel$createFinancialConnectionsSession$1.label;
        if (i == 0) {
        }
        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(obj);
        if (m116786exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object finishWithError(Throwable th, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        this.logger.error("Error", new Exception(th));
        Object finishWithResult = finishWithResult(new CollectBankAccountResult.Failed(th), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (finishWithResult == coroutine_suspended) {
            return finishWithResult;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithFinancialConnectionsSession(FinancialConnectionsSession financialConnectionsSession) {
        Z30.m73800d(C36218Tr6.m82333a(this), null, null, new C19111x6a79a937(this, financialConnectionsSession, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object finishWithResult(CollectBankAccountResult collectBankAccountResult, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object emit = this._viewEffect.emit(new CollectBankAccountViewEffect.FinishWithResult(collectBankAccountResult), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return emit == coroutine_suspended ? emit : Unit.INSTANCE;
    }

    private final boolean getHasLaunched() {
        return Intrinsics.areEqual(this.savedStateHandle.m66947f(KEY_HAS_LAUNCHED), Boolean.TRUE);
    }

    private final void setHasLaunched(boolean z) {
        this.savedStateHandle.m66940m(KEY_HAS_LAUNCHED, Boolean.valueOf(z));
    }

    public final InterfaceC36280Ty5<CollectBankAccountViewEffect> getViewEffect() {
        return this.viewEffect;
    }

    public final void onConnectionsResult(FinancialConnectionsSheetResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        setHasLaunched(false);
        Z30.m73800d(C36218Tr6.m82333a(this), null, null, new CollectBankAccountViewModel$onConnectionsResult$1(result, this, null), 3, null);
    }
}
