package com.stripe.android.payments;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.StripeIntentResult;
import com.stripe.android.core.Logger;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.core.exception.MaxRetryReachedException;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.RetryDelaySupplier;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.StripeIntentKtxKt;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.PaymentFlowResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 C*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0010\b\u0001\u0010\u0004 \u0001*\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0005:\u0001CBA\b\u0004\u0012\u0006\u0010@\u001a\u00020?\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00120+\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u00107\u001a\u000206\u0012\b\b\u0002\u0010:\u001a\u000209¢\u0006\u0004\bA\u0010BJ\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\nH\u0002J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0001H\u0002J+\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0001H\u0002J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0001H\u0002J\u001b\u0010\u001c\u001a\u00028\u00012\u0006\u0010\u001b\u001a\u00020\u001aH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ3\u0010 \u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120\u001eH¤@ø\u0001\u0000¢\u0006\u0004\b \u0010!J3\u0010\"\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120\u001eH¤@ø\u0001\u0000¢\u0006\u0004\b\"\u0010!J-\u0010%\u001a\u0004\u0018\u00018\u00002\u0006\u0010#\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u0012H¤@ø\u0001\u0000¢\u0006\u0004\b%\u0010&J)\u0010)\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010'\u001a\u00020\n2\b\u0010(\u001a\u0004\u0018\u00010\u0012H$¢\u0006\u0004\b)\u0010*R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00120+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u0010/\u001a\u00020.8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>\u0082\u0001\u0002DE\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006F"}, m28432d2 = {"Lcom/stripe/android/payments/PaymentFlowResultProcessor;", "Lcom/stripe/android/model/StripeIntent;", "T", "Lcom/stripe/android/StripeIntentResult;", "S", "", "stripeIntent", "", "shouldCancelSource", "shouldCancelIntentSource", "", "flowOutcome", "shouldRefreshIntent", "intent", "originalFlowOutcome", "determineFlowOutcome", "shouldCallRefreshIntent", "originalIntent", "", "clientSecret", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "requestOptions", "refreshStripeIntentUntilTerminalState", "(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldRetry", "shouldThrowException", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "unvalidatedResult", "processResult", "(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "expandFields", "retrieveStripeIntent", "(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshStripeIntent", "stripeIntentId", "sourceId", "cancelStripeIntentSource", "(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "outcomeFromFlow", "failureMessage", "createStripeIntentResult", "(Lcom/stripe/android/model/StripeIntent;ILjava/lang/String;)Lcom/stripe/android/StripeIntentResult;", "LY94;", "publishableKeyProvider", "LY94;", "Lcom/stripe/android/networking/StripeRepository;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "getStripeRepository", "()Lcom/stripe/android/networking/StripeRepository;", "Lcom/stripe/android/core/Logger;", "logger", "Lcom/stripe/android/core/Logger;", "Lkotlin/coroutines/CoroutineContext;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "Lcom/stripe/android/core/networking/RetryDelaySupplier;", "retryDelaySupplier", "Lcom/stripe/android/core/networking/RetryDelaySupplier;", "Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;", "failureMessageFactory", "Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;LY94;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/RetryDelaySupplier;)V", "Companion", "Lcom/stripe/android/payments/PaymentIntentFlowResultProcessor;", "Lcom/stripe/android/payments/SetupIntentFlowResultProcessor;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public abstract class PaymentFlowResultProcessor<T extends StripeIntent, S extends StripeIntentResult<? extends T>> {
    public static final Companion Companion = new Companion(null);
    private static final List<String> EXPAND_PAYMENT_METHOD;
    public static final int MAX_RETRIES = 3;
    private final PaymentFlowFailureMessageFactory failureMessageFactory;
    private final Logger logger;
    private final Y94<String> publishableKeyProvider;
    private final RetryDelaySupplier retryDelaySupplier;
    private final StripeRepository stripeRepository;
    private final CoroutineContext workContext;

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/payments/PaymentFlowResultProcessor$Companion;", "", "()V", "EXPAND_PAYMENT_METHOD", "", "", "getEXPAND_PAYMENT_METHOD", "()Ljava/util/List;", "MAX_RETRIES", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<String> getEXPAND_PAYMENT_METHOD() {
            return PaymentFlowResultProcessor.EXPAND_PAYMENT_METHOD;
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StripeIntent.Status.values().length];
            try {
                iArr[StripeIntent.Status.Succeeded.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StripeIntent.Status.RequiresCapture.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        List<String> listOf;
        listOf = CollectionsKt__CollectionsJVMKt.listOf("payment_method");
        EXPAND_PAYMENT_METHOD = listOf;
    }

    public /* synthetic */ PaymentFlowResultProcessor(Context context, Y94 y94, StripeRepository stripeRepository, Logger logger, CoroutineContext coroutineContext, RetryDelaySupplier retryDelaySupplier, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, y94, stripeRepository, logger, coroutineContext, retryDelaySupplier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int determineFlowOutcome(StripeIntent stripeIntent, int i) {
        StripeIntent.Status status = stripeIntent.getStatus();
        int i2 = status == null ? -1 : WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i2 == 1 || i2 == 2) {
            return 1;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0112 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0192  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x014f -> B:48:0x0151). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0169 -> B:52:0x016c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object refreshStripeIntentUntilTerminalState(StripeIntent stripeIntent, String str, ApiRequest.Options options, Continuation<? super T> continuation) throws MaxRetryReachedException, InvalidRequestException {
        C19098x95b5fde5 c19098x95b5fde5;
        Object coroutine_suspended;
        int i;
        PaymentFlowResultProcessor<T, S> paymentFlowResultProcessor;
        Object obj;
        int i2;
        Object obj2;
        StripeIntent stripeIntent2;
        StripeIntent stripeIntent3;
        String str2;
        ApiRequest.Options options2;
        int i3;
        StripeIntent stripeIntent4;
        StripeIntent stripeIntent5 = stripeIntent;
        String str3 = str;
        ApiRequest.Options options3 = options;
        if (continuation instanceof C19098x95b5fde5) {
            c19098x95b5fde5 = (C19098x95b5fde5) continuation;
            int i4 = c19098x95b5fde5.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c19098x95b5fde5.label = i4 - Integer.MIN_VALUE;
                Object obj3 = c19098x95b5fde5.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c19098x95b5fde5.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    if (i == 5) {
                                        i3 = c19098x95b5fde5.I$0;
                                        options2 = (ApiRequest.Options) c19098x95b5fde5.L$3;
                                        str2 = (String) c19098x95b5fde5.L$2;
                                        stripeIntent3 = (StripeIntent) c19098x95b5fde5.L$1;
                                        paymentFlowResultProcessor = (PaymentFlowResultProcessor) c19098x95b5fde5.L$0;
                                        ResultKt.throwOnFailure(obj3);
                                        stripeIntent4 = (StripeIntent) obj3;
                                        String str4 = str2;
                                        options3 = options2;
                                        str3 = str4;
                                        if (stripeIntent4 == null) {
                                            StripeIntent stripeIntent6 = stripeIntent4;
                                            i2 = i3 - 1;
                                            stripeIntent5 = stripeIntent3;
                                            stripeIntent2 = stripeIntent6;
                                            if (!paymentFlowResultProcessor.shouldRetry(stripeIntent2) && i2 > 1) {
                                                long delayMillis = paymentFlowResultProcessor.retryDelaySupplier.getDelayMillis(3, i2);
                                                c19098x95b5fde5.L$0 = paymentFlowResultProcessor;
                                                c19098x95b5fde5.L$1 = stripeIntent5;
                                                c19098x95b5fde5.L$2 = str3;
                                                c19098x95b5fde5.L$3 = options3;
                                                c19098x95b5fde5.I$0 = i2;
                                                c19098x95b5fde5.label = 3;
                                                if (C48120rZ0.m15768a(delayMillis, c19098x95b5fde5) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                stripeIntent3 = stripeIntent5;
                                                i3 = i2;
                                                ApiRequest.Options options4 = options3;
                                                str2 = str3;
                                                options2 = options4;
                                                if (!paymentFlowResultProcessor.shouldCallRefreshIntent(stripeIntent3)) {
                                                    List<String> list = EXPAND_PAYMENT_METHOD;
                                                    c19098x95b5fde5.L$0 = paymentFlowResultProcessor;
                                                    c19098x95b5fde5.L$1 = stripeIntent3;
                                                    c19098x95b5fde5.L$2 = str2;
                                                    c19098x95b5fde5.L$3 = options2;
                                                    c19098x95b5fde5.I$0 = i3;
                                                    c19098x95b5fde5.label = 4;
                                                    obj3 = paymentFlowResultProcessor.refreshStripeIntent(str2, options2, list, c19098x95b5fde5);
                                                    if (obj3 == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    stripeIntent4 = (StripeIntent) obj3;
                                                    String str42 = str2;
                                                    options3 = options2;
                                                    str3 = str42;
                                                    if (stripeIntent4 == null) {
                                                        throw new IllegalArgumentException("Required value was null.".toString());
                                                    }
                                                } else {
                                                    List<String> list2 = EXPAND_PAYMENT_METHOD;
                                                    c19098x95b5fde5.L$0 = paymentFlowResultProcessor;
                                                    c19098x95b5fde5.L$1 = stripeIntent3;
                                                    c19098x95b5fde5.L$2 = str2;
                                                    c19098x95b5fde5.L$3 = options2;
                                                    c19098x95b5fde5.I$0 = i3;
                                                    c19098x95b5fde5.label = 5;
                                                    obj3 = paymentFlowResultProcessor.retrieveStripeIntent(str2, options2, list2, c19098x95b5fde5);
                                                    if (obj3 == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    stripeIntent4 = (StripeIntent) obj3;
                                                    String str422 = str2;
                                                    options3 = options2;
                                                    str3 = str422;
                                                    if (stripeIntent4 == null) {
                                                    }
                                                }
                                            } else if (!paymentFlowResultProcessor.shouldThrowException(stripeIntent2)) {
                                                return stripeIntent2;
                                            } else {
                                                throw new MaxRetryReachedException(null, 1, null);
                                            }
                                        }
                                    } else {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                } else {
                                    i3 = c19098x95b5fde5.I$0;
                                    options2 = (ApiRequest.Options) c19098x95b5fde5.L$3;
                                    str2 = (String) c19098x95b5fde5.L$2;
                                    stripeIntent3 = (StripeIntent) c19098x95b5fde5.L$1;
                                    paymentFlowResultProcessor = (PaymentFlowResultProcessor) c19098x95b5fde5.L$0;
                                    ResultKt.throwOnFailure(obj3);
                                    stripeIntent4 = (StripeIntent) obj3;
                                    String str4222 = str2;
                                    options3 = options2;
                                    str3 = str4222;
                                    if (stripeIntent4 == null) {
                                    }
                                }
                            } else {
                                i3 = c19098x95b5fde5.I$0;
                                options2 = (ApiRequest.Options) c19098x95b5fde5.L$3;
                                str2 = (String) c19098x95b5fde5.L$2;
                                stripeIntent3 = (StripeIntent) c19098x95b5fde5.L$1;
                                paymentFlowResultProcessor = (PaymentFlowResultProcessor) c19098x95b5fde5.L$0;
                                ResultKt.throwOnFailure(obj3);
                                if (!paymentFlowResultProcessor.shouldCallRefreshIntent(stripeIntent3)) {
                                }
                            }
                        } else {
                            int i5 = c19098x95b5fde5.I$0;
                            String str5 = (String) c19098x95b5fde5.L$2;
                            paymentFlowResultProcessor = (PaymentFlowResultProcessor) c19098x95b5fde5.L$0;
                            ResultKt.throwOnFailure(obj3);
                            i2 = i5;
                            stripeIntent5 = (StripeIntent) c19098x95b5fde5.L$1;
                            obj = obj3;
                            options3 = (ApiRequest.Options) c19098x95b5fde5.L$3;
                            str3 = str5;
                            stripeIntent2 = (StripeIntent) obj;
                        }
                    } else {
                        int i6 = c19098x95b5fde5.I$0;
                        String str6 = (String) c19098x95b5fde5.L$2;
                        paymentFlowResultProcessor = (PaymentFlowResultProcessor) c19098x95b5fde5.L$0;
                        ResultKt.throwOnFailure(obj3);
                        i2 = i6;
                        stripeIntent5 = (StripeIntent) c19098x95b5fde5.L$1;
                        obj2 = obj3;
                        options3 = (ApiRequest.Options) c19098x95b5fde5.L$3;
                        str3 = str6;
                        stripeIntent2 = (StripeIntent) obj2;
                    }
                } else {
                    ResultKt.throwOnFailure(obj3);
                    if (shouldCallRefreshIntent(stripeIntent)) {
                        List<String> list3 = EXPAND_PAYMENT_METHOD;
                        c19098x95b5fde5.L$0 = this;
                        c19098x95b5fde5.L$1 = stripeIntent5;
                        c19098x95b5fde5.L$2 = str3;
                        c19098x95b5fde5.L$3 = options3;
                        c19098x95b5fde5.I$0 = 3;
                        c19098x95b5fde5.label = 1;
                        Object refreshStripeIntent = refreshStripeIntent(str3, options3, list3, c19098x95b5fde5);
                        if (refreshStripeIntent == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        paymentFlowResultProcessor = this;
                        obj2 = refreshStripeIntent;
                        i2 = 3;
                        stripeIntent2 = (StripeIntent) obj2;
                    } else {
                        List<String> list4 = EXPAND_PAYMENT_METHOD;
                        c19098x95b5fde5.L$0 = this;
                        c19098x95b5fde5.L$1 = stripeIntent5;
                        c19098x95b5fde5.L$2 = str3;
                        c19098x95b5fde5.L$3 = options3;
                        c19098x95b5fde5.I$0 = 3;
                        c19098x95b5fde5.label = 2;
                        Object retrieveStripeIntent = retrieveStripeIntent(str3, options3, list4, c19098x95b5fde5);
                        if (retrieveStripeIntent == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        paymentFlowResultProcessor = this;
                        obj = retrieveStripeIntent;
                        i2 = 3;
                        stripeIntent2 = (StripeIntent) obj;
                    }
                }
                if (stripeIntent2 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                if (!paymentFlowResultProcessor.shouldRetry(stripeIntent2)) {
                }
                if (!paymentFlowResultProcessor.shouldThrowException(stripeIntent2)) {
                }
            }
        }
        c19098x95b5fde5 = new C19098x95b5fde5(this, continuation);
        Object obj32 = c19098x95b5fde5.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c19098x95b5fde5.label;
        if (i == 0) {
        }
        if (stripeIntent2 == null) {
        }
        if (!paymentFlowResultProcessor.shouldRetry(stripeIntent2)) {
        }
        if (!paymentFlowResultProcessor.shouldThrowException(stripeIntent2)) {
        }
    }

    private final boolean shouldCallRefreshIntent(StripeIntent stripeIntent) {
        PaymentMethod.Type type;
        PaymentMethod paymentMethod = stripeIntent.getPaymentMethod();
        PaymentMethod.Type type2 = null;
        if (paymentMethod != null) {
            type = paymentMethod.type;
        } else {
            type = null;
        }
        if (type != PaymentMethod.Type.WeChatPay) {
            PaymentMethod paymentMethod2 = stripeIntent.getPaymentMethod();
            if (paymentMethod2 != null) {
                type2 = paymentMethod2.type;
            }
            if (type2 != PaymentMethod.Type.Upi) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldCancelIntentSource(StripeIntent stripeIntent, boolean z) {
        return z && stripeIntent.requiresAction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004d A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean shouldRefreshIntent(StripeIntent stripeIntent, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        PaymentMethod paymentMethod;
        PaymentMethod.Type type;
        if (i == 1 && StripeIntentKtxKt.shouldRefresh(stripeIntent)) {
            z = true;
        } else {
            z = false;
        }
        PaymentMethod.Type type2 = null;
        if (i == 3 && stripeIntent.getStatus() == StripeIntent.Status.Processing) {
            PaymentMethod paymentMethod2 = stripeIntent.getPaymentMethod();
            if (paymentMethod2 != null) {
                type = paymentMethod2.type;
            } else {
                type = null;
            }
            if (type == PaymentMethod.Type.Card) {
                z2 = true;
                if (i == 3 && stripeIntent.getStatus() == StripeIntent.Status.RequiresAction) {
                    paymentMethod = stripeIntent.getPaymentMethod();
                    if (paymentMethod != null) {
                        type2 = paymentMethod.type;
                    }
                    if (type2 == PaymentMethod.Type.Card && stripeIntent.getNextActionType() == StripeIntent.NextActionType.UseStripeSdk) {
                        z3 = true;
                        if (z && !z2 && !z3) {
                            return false;
                        }
                        return true;
                    }
                }
                z3 = false;
                if (z) {
                }
                return true;
            }
        }
        z2 = false;
        if (i == 3) {
            paymentMethod = stripeIntent.getPaymentMethod();
            if (paymentMethod != null) {
            }
            if (type2 == PaymentMethod.Type.Card) {
                z3 = true;
                if (z) {
                }
                return true;
            }
        }
        z3 = false;
        if (z) {
        }
        return true;
    }

    private final boolean shouldRetry(StripeIntent stripeIntent) {
        boolean z;
        PaymentMethod.Type type;
        boolean requiresAction = stripeIntent.requiresAction();
        if (stripeIntent.getStatus() == StripeIntent.Status.Processing) {
            PaymentMethod paymentMethod = stripeIntent.getPaymentMethod();
            if (paymentMethod != null) {
                type = paymentMethod.type;
            } else {
                type = null;
            }
            if (type == PaymentMethod.Type.Card) {
                z = true;
                if (requiresAction && !z) {
                    return false;
                }
            }
        }
        z = false;
        return requiresAction ? true : true;
    }

    private final boolean shouldThrowException(StripeIntent stripeIntent) {
        boolean requiresAction = stripeIntent.requiresAction();
        boolean z = stripeIntent.getNextActionData() instanceof StripeIntent.NextActionData.SdkData.Use3DS2;
        if (requiresAction && !z) {
            return true;
        }
        return false;
    }

    public abstract Object cancelStripeIntentSource(String str, ApiRequest.Options options, String str2, Continuation<? super T> continuation);

    public abstract S createStripeIntentResult(T t, int i, String str);

    public final StripeRepository getStripeRepository() {
        return this.stripeRepository;
    }

    public final Object processResult(PaymentFlowResult.Unvalidated unvalidated, Continuation<? super S> continuation) {
        return X30.m77504g(this.workContext, new PaymentFlowResultProcessor$processResult$2(unvalidated, this, null), continuation);
    }

    public abstract Object refreshStripeIntent(String str, ApiRequest.Options options, List<String> list, Continuation<? super T> continuation);

    public abstract Object retrieveStripeIntent(String str, ApiRequest.Options options, List<String> list, Continuation<? super T> continuation);

    private PaymentFlowResultProcessor(Context context, Y94<String> y94, StripeRepository stripeRepository, Logger logger, CoroutineContext coroutineContext, RetryDelaySupplier retryDelaySupplier) {
        this.publishableKeyProvider = y94;
        this.stripeRepository = stripeRepository;
        this.logger = logger;
        this.workContext = coroutineContext;
        this.retryDelaySupplier = retryDelaySupplier;
        this.failureMessageFactory = new PaymentFlowFailureMessageFactory(context);
    }

    public /* synthetic */ PaymentFlowResultProcessor(Context context, Y94 y94, StripeRepository stripeRepository, Logger logger, CoroutineContext coroutineContext, RetryDelaySupplier retryDelaySupplier, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, y94, stripeRepository, logger, coroutineContext, (i & 32) != 0 ? new RetryDelaySupplier() : retryDelaySupplier, null);
    }
}
