package com.stripe.android.payments.core.authentication.threeds2;

import androidx.lifecycle.C11747p;
import com.stripe.android.StripePaymentController;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.model.Stripe3ds2Fingerprint;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.payments.core.authentication.threeds2.NextStep;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.payments.core.injection.NamedConstantsKt;
import com.stripe.android.stripe3ds2.service.StripeThreeDs2Service;
import com.stripe.android.stripe3ds2.transaction.ChallengeResult;
import com.stripe.android.stripe3ds2.transaction.InitChallengeArgs;
import com.stripe.android.stripe3ds2.transaction.InitChallengeRepository;
import com.stripe.android.stripe3ds2.transaction.InitChallengeResult;
import com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry;
import com.stripe.android.stripe3ds2.transaction.Transaction;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0000\u0018\u0000 W2\u00020\u0001:\u0001WBe\b\u0007\u0012\u0006\u0010!\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u00108\u001a\u000207\u0012\u0006\u0010;\u001a\u00020:\u0012\u0006\u0010>\u001a\u00020=\u0012\u0006\u0010A\u001a\u00020@\u0012\b\b\u0001\u0010D\u001a\u00020C\u0012\u0006\u0010G\u001a\u00020F\u0012\b\b\u0001\u0010J\u001a\u00020I¢\u0006\u0004\bU\u0010VJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u0004H\u0002J\u001b\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0081@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0086@ø\u0001\u0000¢\u0006\u0004\b#\u0010$J3\u0010+\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u000bH\u0081@ø\u0001\u0000¢\u0006\u0004\b)\u0010*R\u0014\u0010!\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\"\u0010L\u001a\u00020I8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010K\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0017\u0010Q\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006X"}, m28432d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel;", "LOr6;", "Lcom/stripe/android/model/Stripe3ds2Fingerprint;", "stripe3ds2Fingerprint", "Lcom/stripe/android/payments/core/authentication/threeds2/NextStep;", "begin3ds2Auth", "(Lcom/stripe/android/model/Stripe3ds2Fingerprint;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/stripe3ds2/transaction/Transaction;", "transaction", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "requestOptions", "", "timeout", "Lcom/stripe/android/model/Stripe3ds2AuthResult;", "perform3ds2AuthenticationRequest", "(Lcom/stripe/android/stripe3ds2/transaction/Transaction;Lcom/stripe/android/model/Stripe3ds2Fingerprint;Lcom/stripe/android/core/networking/ApiRequest$Options;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "fallbackRedirectUrl", "on3ds2AuthFallback", "startFrictionlessFlow", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;", "challengeResult", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "processChallengeResult", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "start3ds2Flow", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "sourceId", "on3ds2AuthSuccess$payments_core_release", "(Lcom/stripe/android/model/Stripe3ds2AuthResult;Lcom/stripe/android/stripe3ds2/transaction/Transaction;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "on3ds2AuthSuccess", "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;", "args", "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult;", "initChallenge", "(Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;", "ares", "maxTimeout", "Lcom/stripe/android/payments/core/authentication/threeds2/NextStep$StartChallenge;", "startChallengeFlow$payments_core_release", "(Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;Lcom/stripe/android/stripe3ds2/transaction/Transaction;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startChallengeFlow", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "Lcom/stripe/android/networking/StripeRepository;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "Lcom/stripe/android/stripe3ds2/service/StripeThreeDs2Service;", "threeDs2Service", "Lcom/stripe/android/stripe3ds2/service/StripeThreeDs2Service;", "Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;", "messageVersionRegistry", "Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2ChallengeResultProcessor;", "challengeResultProcessor", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2ChallengeResultProcessor;", "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepository;", "initChallengeRepository", "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepository;", "Lkotlin/coroutines/CoroutineContext;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "Landroidx/lifecycle/p;", "savedStateHandle", "Landroidx/lifecycle/p;", "", NamedConstantsKt.IS_INSTANT_APP, "Z", "hasCompleted", "getHasCompleted", "()Z", "setHasCompleted", "(Z)V", "threeDS2RequestOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "getThreeDS2RequestOptions", "()Lcom/stripe/android/core/networking/ApiRequest$Options;", "<init>", "(Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/stripe3ds2/service/StripeThreeDs2Service;Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2ChallengeResultProcessor;Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepository;Lkotlin/coroutines/CoroutineContext;Landroidx/lifecycle/p;Z)V", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStripe3ds2TransactionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Stripe3ds2TransactionViewModel.kt\ncom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,363:1\n1#2:364\n*E\n"})
/* loaded from: classes7.dex */
public final class Stripe3ds2TransactionViewModel extends AbstractC35048Or6 {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String KEY_HAS_COMPLETED = "key_next_step";
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final Stripe3ds2TransactionContract.Args args;
    private final Stripe3ds2ChallengeResultProcessor challengeResultProcessor;
    private boolean hasCompleted;
    private final InitChallengeRepository initChallengeRepository;
    private final boolean isInstantApp;
    private final MessageVersionRegistry messageVersionRegistry;
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    private final C11747p savedStateHandle;
    private final StripeRepository stripeRepository;
    private final ApiRequest.Options threeDS2RequestOptions;
    private final StripeThreeDs2Service threeDs2Service;
    private final CoroutineContext workContext;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel$Companion;", "", "()V", "KEY_HAS_COMPLETED", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public Stripe3ds2TransactionViewModel(Stripe3ds2TransactionContract.Args args, StripeRepository stripeRepository, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, StripeThreeDs2Service threeDs2Service, MessageVersionRegistry messageVersionRegistry, Stripe3ds2ChallengeResultProcessor challengeResultProcessor, InitChallengeRepository initChallengeRepository, @IOContext CoroutineContext workContext, C11747p savedStateHandle, boolean z) {
        ApiRequest.Options requestOptions;
        boolean z2;
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        Intrinsics.checkNotNullParameter(threeDs2Service, "threeDs2Service");
        Intrinsics.checkNotNullParameter(messageVersionRegistry, "messageVersionRegistry");
        Intrinsics.checkNotNullParameter(challengeResultProcessor, "challengeResultProcessor");
        Intrinsics.checkNotNullParameter(initChallengeRepository, "initChallengeRepository");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.args = args;
        this.stripeRepository = stripeRepository;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.threeDs2Service = threeDs2Service;
        this.messageVersionRegistry = messageVersionRegistry;
        this.challengeResultProcessor = challengeResultProcessor;
        this.initChallengeRepository = initChallengeRepository;
        this.workContext = workContext;
        this.savedStateHandle = savedStateHandle;
        this.isInstantApp = z;
        this.hasCompleted = savedStateHandle.m66948e(KEY_HAS_COMPLETED);
        String publishableKey = args.getNextActionData().getPublishableKey();
        if (publishableKey != null) {
            if (publishableKey.length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            String str = z2 ? publishableKey : null;
            if (str != null) {
                requestOptions = new ApiRequest.Options(str, null, null, 6, null);
                this.threeDS2RequestOptions = requestOptions;
            }
        }
        requestOptions = args.getRequestOptions();
        this.threeDS2RequestOptions = requestOptions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object begin3ds2Auth(Stripe3ds2Fingerprint stripe3ds2Fingerprint, Continuation<? super NextStep> continuation) {
        Stripe3ds2TransactionViewModel$begin3ds2Auth$1 stripe3ds2TransactionViewModel$begin3ds2Auth$1;
        Object coroutine_suspended;
        int i;
        Stripe3ds2Fingerprint stripe3ds2Fingerprint2;
        Stripe3ds2TransactionViewModel stripe3ds2TransactionViewModel;
        Transaction transaction;
        int i2;
        Stripe3ds2Fingerprint stripe3ds2Fingerprint3;
        int i3;
        Transaction transaction2;
        Object obj;
        Throwable m116786exceptionOrNullimpl;
        if (continuation instanceof Stripe3ds2TransactionViewModel$begin3ds2Auth$1) {
            stripe3ds2TransactionViewModel$begin3ds2Auth$1 = (Stripe3ds2TransactionViewModel$begin3ds2Auth$1) continuation;
            int i4 = stripe3ds2TransactionViewModel$begin3ds2Auth$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                stripe3ds2TransactionViewModel$begin3ds2Auth$1.label = i4 - Integer.MIN_VALUE;
                Stripe3ds2TransactionViewModel$begin3ds2Auth$1 stripe3ds2TransactionViewModel$begin3ds2Auth$12 = stripe3ds2TransactionViewModel$begin3ds2Auth$1;
                Object obj2 = stripe3ds2TransactionViewModel$begin3ds2Auth$12.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stripe3ds2TransactionViewModel$begin3ds2Auth$12.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj2);
                            return (NextStep) obj2;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = stripe3ds2TransactionViewModel$begin3ds2Auth$12.I$0;
                    transaction = (Transaction) stripe3ds2TransactionViewModel$begin3ds2Auth$12.L$2;
                    stripe3ds2Fingerprint3 = (Stripe3ds2Fingerprint) stripe3ds2TransactionViewModel$begin3ds2Auth$12.L$1;
                    stripe3ds2TransactionViewModel = (Stripe3ds2TransactionViewModel) stripe3ds2TransactionViewModel$begin3ds2Auth$12.L$0;
                    try {
                        ResultKt.throwOnFailure(obj2);
                    } catch (Throwable th) {
                        th = th;
                        stripe3ds2Fingerprint2 = stripe3ds2Fingerprint3;
                        Result.Companion companion = Result.Companion;
                        i3 = i2;
                        transaction2 = transaction;
                        stripe3ds2Fingerprint3 = stripe3ds2Fingerprint2;
                        obj = Result.m116783constructorimpl(ResultKt.createFailure(th));
                        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(obj);
                        if (m116786exceptionOrNullimpl != null) {
                        }
                    }
                } else {
                    ResultKt.throwOnFailure(obj2);
                    Transaction createTransaction = this.threeDs2Service.createTransaction(this.args.getSdkTransactionId(), stripe3ds2Fingerprint.getDirectoryServerEncryption().getDirectoryServerId(), this.messageVersionRegistry.getCurrent(), this.args.getStripeIntent().isLiveMode(), stripe3ds2Fingerprint.getDirectoryServerName(), stripe3ds2Fingerprint.getDirectoryServerEncryption().getRootCerts(), stripe3ds2Fingerprint.getDirectoryServerEncryption().getDirectoryServerPublicKey(), stripe3ds2Fingerprint.getDirectoryServerEncryption().getKeyId(), this.args.getConfig().getUiCustomization$payments_core_release().getUiCustomization());
                    int timeout$payments_core_release = this.args.getConfig().getTimeout$payments_core_release();
                    try {
                        Result.Companion companion2 = Result.Companion;
                        ApiRequest.Options options = this.threeDS2RequestOptions;
                        stripe3ds2TransactionViewModel$begin3ds2Auth$12.L$0 = this;
                        stripe3ds2Fingerprint2 = stripe3ds2Fingerprint;
                        try {
                            stripe3ds2TransactionViewModel$begin3ds2Auth$12.L$1 = stripe3ds2Fingerprint2;
                            stripe3ds2TransactionViewModel$begin3ds2Auth$12.L$2 = createTransaction;
                            stripe3ds2TransactionViewModel$begin3ds2Auth$12.I$0 = timeout$payments_core_release;
                            stripe3ds2TransactionViewModel$begin3ds2Auth$12.label = 1;
                            obj2 = perform3ds2AuthenticationRequest(createTransaction, stripe3ds2Fingerprint, options, timeout$payments_core_release, stripe3ds2TransactionViewModel$begin3ds2Auth$12);
                            if (obj2 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            stripe3ds2TransactionViewModel = this;
                            transaction = createTransaction;
                            i2 = timeout$payments_core_release;
                            stripe3ds2Fingerprint3 = stripe3ds2Fingerprint2;
                        } catch (Throwable th2) {
                            th = th2;
                            stripe3ds2TransactionViewModel = this;
                            transaction = createTransaction;
                            i2 = timeout$payments_core_release;
                            Result.Companion companion3 = Result.Companion;
                            i3 = i2;
                            transaction2 = transaction;
                            stripe3ds2Fingerprint3 = stripe3ds2Fingerprint2;
                            obj = Result.m116783constructorimpl(ResultKt.createFailure(th));
                            m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(obj);
                            if (m116786exceptionOrNullimpl != null) {
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        stripe3ds2Fingerprint2 = stripe3ds2Fingerprint;
                    }
                }
                i3 = i2;
                transaction2 = transaction;
                obj = Result.m116783constructorimpl((Stripe3ds2AuthResult) obj2);
                m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(obj);
                if (m116786exceptionOrNullimpl != null) {
                    String source = stripe3ds2Fingerprint3.getSource();
                    stripe3ds2TransactionViewModel$begin3ds2Auth$12.L$0 = null;
                    stripe3ds2TransactionViewModel$begin3ds2Auth$12.L$1 = null;
                    stripe3ds2TransactionViewModel$begin3ds2Auth$12.L$2 = null;
                    stripe3ds2TransactionViewModel$begin3ds2Auth$12.label = 2;
                    obj2 = stripe3ds2TransactionViewModel.on3ds2AuthSuccess$payments_core_release((Stripe3ds2AuthResult) obj, transaction2, source, i3, stripe3ds2TransactionViewModel$begin3ds2Auth$12);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return (NextStep) obj2;
                }
                return new NextStep.Complete(new PaymentFlowResult.Unvalidated(null, 0, StripeException.Companion.create(m116786exceptionOrNullimpl), false, null, null, null, 123, null));
            }
        }
        stripe3ds2TransactionViewModel$begin3ds2Auth$1 = new Stripe3ds2TransactionViewModel$begin3ds2Auth$1(this, continuation);
        Stripe3ds2TransactionViewModel$begin3ds2Auth$1 stripe3ds2TransactionViewModel$begin3ds2Auth$122 = stripe3ds2TransactionViewModel$begin3ds2Auth$1;
        Object obj22 = stripe3ds2TransactionViewModel$begin3ds2Auth$122.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stripe3ds2TransactionViewModel$begin3ds2Auth$122.label;
        if (i == 0) {
        }
        i3 = i2;
        transaction2 = transaction;
        obj = Result.m116783constructorimpl((Stripe3ds2AuthResult) obj22);
        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(obj);
        if (m116786exceptionOrNullimpl != null) {
        }
    }

    private final NextStep on3ds2AuthFallback(String str) {
        String str2;
        String str3;
        this.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds2Fallback, null, null, null, null, 30, null));
        String id = this.args.getStripeIntent().getId();
        if (id == null) {
            str2 = "";
        } else {
            str2 = id;
        }
        int requestCode$payments_core_release = StripePaymentController.Companion.getRequestCode$payments_core_release(this.args.getStripeIntent());
        String clientSecret = this.args.getStripeIntent().getClientSecret();
        if (clientSecret == null) {
            str3 = "";
        } else {
            str3 = clientSecret;
        }
        return new NextStep.StartFallback(new PaymentBrowserAuthContract.Args(str2, requestCode$payments_core_release, str3, str, null, this.args.getEnableLogging(), null, this.args.getRequestOptions().getStripeAccount(), true, false, null, this.threeDS2RequestOptions.getApiKey(), this.isInstantApp, 1600, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object perform3ds2AuthenticationRequest(Transaction transaction, Stripe3ds2Fingerprint stripe3ds2Fingerprint, ApiRequest.Options options, int i, Continuation<? super Stripe3ds2AuthResult> continuation) {
        return X30.m77504g(this.workContext, new C19118xd40f3935(transaction, stripe3ds2Fingerprint, i, this, options, null), continuation);
    }

    private final NextStep startFrictionlessFlow() {
        this.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds2Frictionless, null, null, null, null, 30, null));
        return new NextStep.Complete(new PaymentFlowResult.Unvalidated(this.args.getStripeIntent().getClientSecret(), 0, null, false, null, null, this.args.getRequestOptions().getStripeAccount(), 62, null));
    }

    public final boolean getHasCompleted() {
        return this.hasCompleted;
    }

    public final ApiRequest.Options getThreeDS2RequestOptions() {
        return this.threeDS2RequestOptions;
    }

    public final Object initChallenge(InitChallengeArgs initChallengeArgs, Continuation<? super InitChallengeResult> continuation) {
        return this.initChallengeRepository.startChallenge(initChallengeArgs, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b4, code lost:
        if (r11 == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object on3ds2AuthSuccess$payments_core_release(Stripe3ds2AuthResult stripe3ds2AuthResult, Transaction transaction, String str, int i, Continuation<? super NextStep> continuation) {
        String str2;
        List listOf;
        Object coroutine_suspended;
        Stripe3ds2AuthResult.Ares ares = stripe3ds2AuthResult.getAres();
        if (ares != null) {
            if (ares.isChallenge()) {
                Object startChallengeFlow$payments_core_release = startChallengeFlow$payments_core_release(ares, transaction, str, i, continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (startChallengeFlow$payments_core_release == coroutine_suspended) {
                    return startChallengeFlow$payments_core_release;
                }
                return (NextStep) startChallengeFlow$payments_core_release;
            }
            return startFrictionlessFlow();
        } else if (stripe3ds2AuthResult.getFallbackRedirectUrl() != null) {
            return on3ds2AuthFallback(stripe3ds2AuthResult.getFallbackRedirectUrl());
        } else {
            Stripe3ds2AuthResult.ThreeDS2Error error = stripe3ds2AuthResult.getError();
            if (error != null) {
                String errorCode = error.getErrorCode();
                String errorDetail = error.getErrorDetail();
                String errorDescription = error.getErrorDescription();
                String errorComponent = error.getErrorComponent();
                listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"Code: " + errorCode, "Detail: " + errorDetail, "Description: " + errorDescription, "Component: " + errorComponent});
                str2 = CollectionsKt___CollectionsKt.joinToString$default(listOf, ", ", null, null, 0, null, null, 62, null);
            }
            str2 = "Invalid 3DS2 authentication response";
            StripeException.Companion companion = StripeException.Companion;
            return new NextStep.Complete(new PaymentFlowResult.Unvalidated(null, 0, companion.create(new RuntimeException("Error encountered during 3DS2 authentication request. " + str2)), false, null, null, null, 123, null));
        }
    }

    public final Object processChallengeResult(ChallengeResult challengeResult, Continuation<? super PaymentFlowResult.Unvalidated> continuation) {
        return this.challengeResultProcessor.process(challengeResult, continuation);
    }

    public final void setHasCompleted(boolean z) {
        this.hasCompleted = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object start3ds2Flow(Continuation<? super NextStep> continuation) {
        Stripe3ds2TransactionViewModel$start3ds2Flow$1 stripe3ds2TransactionViewModel$start3ds2Flow$1;
        Object coroutine_suspended;
        int i;
        Stripe3ds2TransactionViewModel stripe3ds2TransactionViewModel;
        Object m116783constructorimpl;
        Throwable m116786exceptionOrNullimpl;
        if (continuation instanceof Stripe3ds2TransactionViewModel$start3ds2Flow$1) {
            stripe3ds2TransactionViewModel$start3ds2Flow$1 = (Stripe3ds2TransactionViewModel$start3ds2Flow$1) continuation;
            int i2 = stripe3ds2TransactionViewModel$start3ds2Flow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stripe3ds2TransactionViewModel$start3ds2Flow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = stripe3ds2TransactionViewModel$start3ds2Flow$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stripe3ds2TransactionViewModel$start3ds2Flow$1.label;
                if (i == 0) {
                    if (i == 1) {
                        stripe3ds2TransactionViewModel = (Stripe3ds2TransactionViewModel) stripe3ds2TransactionViewModel$start3ds2Flow$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (Throwable th) {
                            th = th;
                            Result.Companion companion = Result.Companion;
                            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                            m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                            if (m116786exceptionOrNullimpl != null) {
                            }
                            NextStep nextStep = (NextStep) m116783constructorimpl;
                            stripe3ds2TransactionViewModel.savedStateHandle.m66940m(KEY_HAS_COMPLETED, Boxing.boxBoolean(true));
                            stripe3ds2TransactionViewModel.hasCompleted = true;
                            return m116783constructorimpl;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    this.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds2Fingerprint, null, null, null, null, 30, null));
                    try {
                        Result.Companion companion2 = Result.Companion;
                        Stripe3ds2Fingerprint stripe3ds2Fingerprint = new Stripe3ds2Fingerprint(this.args.getNextActionData());
                        stripe3ds2TransactionViewModel$start3ds2Flow$1.L$0 = this;
                        stripe3ds2TransactionViewModel$start3ds2Flow$1.label = 1;
                        obj = begin3ds2Auth(stripe3ds2Fingerprint, stripe3ds2TransactionViewModel$start3ds2Flow$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        stripe3ds2TransactionViewModel = this;
                    } catch (Throwable th2) {
                        th = th2;
                        stripe3ds2TransactionViewModel = this;
                        Result.Companion companion3 = Result.Companion;
                        m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                        if (m116786exceptionOrNullimpl != null) {
                        }
                        NextStep nextStep2 = (NextStep) m116783constructorimpl;
                        stripe3ds2TransactionViewModel.savedStateHandle.m66940m(KEY_HAS_COMPLETED, Boxing.boxBoolean(true));
                        stripe3ds2TransactionViewModel.hasCompleted = true;
                        return m116783constructorimpl;
                    }
                }
                m116783constructorimpl = Result.m116783constructorimpl((NextStep) obj);
                m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                if (m116786exceptionOrNullimpl != null) {
                    stripe3ds2TransactionViewModel.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(stripe3ds2TransactionViewModel.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds2RequestParamsFailed, null, null, null, null, 30, null));
                    m116783constructorimpl = new NextStep.Complete(new PaymentFlowResult.Unvalidated(null, 0, StripeException.Companion.create(m116786exceptionOrNullimpl), false, null, null, null, 123, null));
                }
                NextStep nextStep22 = (NextStep) m116783constructorimpl;
                stripe3ds2TransactionViewModel.savedStateHandle.m66940m(KEY_HAS_COMPLETED, Boxing.boxBoolean(true));
                stripe3ds2TransactionViewModel.hasCompleted = true;
                return m116783constructorimpl;
            }
        }
        stripe3ds2TransactionViewModel$start3ds2Flow$1 = new Stripe3ds2TransactionViewModel$start3ds2Flow$1(this, continuation);
        Object obj2 = stripe3ds2TransactionViewModel$start3ds2Flow$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stripe3ds2TransactionViewModel$start3ds2Flow$1.label;
        if (i == 0) {
        }
        m116783constructorimpl = Result.m116783constructorimpl((NextStep) obj2);
        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
        if (m116786exceptionOrNullimpl != null) {
        }
        NextStep nextStep222 = (NextStep) m116783constructorimpl;
        stripe3ds2TransactionViewModel.savedStateHandle.m66940m(KEY_HAS_COMPLETED, Boxing.boxBoolean(true));
        stripe3ds2TransactionViewModel.hasCompleted = true;
        return m116783constructorimpl;
    }

    public final Object startChallengeFlow$payments_core_release(Stripe3ds2AuthResult.Ares ares, Transaction transaction, String str, int i, Continuation<? super NextStep.StartChallenge> continuation) {
        return X30.m77504g(this.workContext, new Stripe3ds2TransactionViewModel$startChallengeFlow$2(ares, transaction, i, this, str, null), continuation);
    }
}
