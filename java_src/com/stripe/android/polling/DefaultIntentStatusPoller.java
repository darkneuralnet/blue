package com.stripe.android.polling;

import ch.qos.logback.core.joran.action.Action;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.polling.IntentStatusPoller;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC52943zh2;
@Metadata(m28433d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b*\u0010+J\u001d\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0015\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\tJ\b\u0010\u000e\u001a\u00020\u0004H\u0016R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\"\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, m28432d2 = {"Lcom/stripe/android/polling/DefaultIntentStatusPoller;", "Lcom/stripe/android/polling/IntentStatusPoller;", "", "force", "", "performPoll", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/StripeIntent$Status;", "fetchIntentStatus", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LZC0;", Action.SCOPE_ATTRIBUTE, "startPolling", "forcePoll", "stopPolling", "Lcom/stripe/android/networking/StripeRepository;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "LY94;", "Lcom/stripe/android/PaymentConfiguration;", "paymentConfigProvider", "LY94;", "Lcom/stripe/android/polling/IntentStatusPoller$Config;", "config", "Lcom/stripe/android/polling/IntentStatusPoller$Config;", "LSC0;", "dispatcher", "LSC0;", "", "attempts", "I", "Lzh2;", "pollingJob", "Lzh2;", "LGX2;", "_state", "LGX2;", "LtP5;", TransferTable.COLUMN_STATE, "LtP5;", "getState", "()LtP5;", "<init>", "(Lcom/stripe/android/networking/StripeRepository;LY94;Lcom/stripe/android/polling/IntentStatusPoller$Config;LSC0;)V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class DefaultIntentStatusPoller implements IntentStatusPoller {
    public static final int $stable = 8;
    private final GX2<StripeIntent.Status> _state;
    private int attempts;
    private final IntentStatusPoller.Config config;
    private final SC0 dispatcher;
    private final Y94<PaymentConfiguration> paymentConfigProvider;
    private InterfaceC52943zh2 pollingJob;
    private final InterfaceC49220tP5<StripeIntent.Status> state;
    private final StripeRepository stripeRepository;

    public DefaultIntentStatusPoller(StripeRepository stripeRepository, Y94<PaymentConfiguration> paymentConfigProvider, IntentStatusPoller.Config config, SC0 dispatcher) {
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(paymentConfigProvider, "paymentConfigProvider");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.stripeRepository = stripeRepository;
        this.paymentConfigProvider = paymentConfigProvider;
        this.config = config;
        this.dispatcher = dispatcher;
        GX2<StripeIntent.Status> m8742a = C50405vP5.m8742a(null);
        this._state = m8742a;
        this.state = m8742a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:10)(2:22|23))(3:24|25|(1:27))|11|12|(1:14)|15|(2:17|18)(1:20)))|30|6|7|(0)(0)|11|12|(0)|15|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
        r0 = kotlin.Result.Companion;
        r9 = kotlin.Result.m116783constructorimpl(kotlin.ResultKt.createFailure(r9));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchIntentStatus(Continuation<? super StripeIntent.Status> continuation) {
        DefaultIntentStatusPoller$fetchIntentStatus$1 defaultIntentStatusPoller$fetchIntentStatus$1;
        Object coroutine_suspended;
        int i;
        Object m116783constructorimpl;
        PaymentIntent paymentIntent;
        if (continuation instanceof DefaultIntentStatusPoller$fetchIntentStatus$1) {
            defaultIntentStatusPoller$fetchIntentStatus$1 = (DefaultIntentStatusPoller$fetchIntentStatus$1) continuation;
            int i2 = defaultIntentStatusPoller$fetchIntentStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                defaultIntentStatusPoller$fetchIntentStatus$1.label = i2 - Integer.MIN_VALUE;
                DefaultIntentStatusPoller$fetchIntentStatus$1 defaultIntentStatusPoller$fetchIntentStatus$12 = defaultIntentStatusPoller$fetchIntentStatus$1;
                Object obj = defaultIntentStatusPoller$fetchIntentStatus$12.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = defaultIntentStatusPoller$fetchIntentStatus$12.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    PaymentConfiguration paymentConfiguration = this.paymentConfigProvider.get();
                    Result.Companion companion = Result.Companion;
                    StripeRepository stripeRepository = this.stripeRepository;
                    String clientSecret = this.config.getClientSecret();
                    ApiRequest.Options options = new ApiRequest.Options(new DefaultIntentStatusPoller$fetchIntentStatus$paymentIntent$1$1(paymentConfiguration), new DefaultIntentStatusPoller$fetchIntentStatus$paymentIntent$1$2(paymentConfiguration));
                    defaultIntentStatusPoller$fetchIntentStatus$12.label = 1;
                    obj = StripeRepository.retrievePaymentIntent$default(stripeRepository, clientSecret, options, null, defaultIntentStatusPoller$fetchIntentStatus$12, 4, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                m116783constructorimpl = Result.m116783constructorimpl((PaymentIntent) obj);
                if (Result.m116789isFailureimpl(m116783constructorimpl)) {
                    m116783constructorimpl = null;
                }
                paymentIntent = (PaymentIntent) m116783constructorimpl;
                if (paymentIntent != null) {
                    return null;
                }
                return paymentIntent.getStatus();
            }
        }
        defaultIntentStatusPoller$fetchIntentStatus$1 = new DefaultIntentStatusPoller$fetchIntentStatus$1(this, continuation);
        DefaultIntentStatusPoller$fetchIntentStatus$1 defaultIntentStatusPoller$fetchIntentStatus$122 = defaultIntentStatusPoller$fetchIntentStatus$1;
        Object obj2 = defaultIntentStatusPoller$fetchIntentStatus$122.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = defaultIntentStatusPoller$fetchIntentStatus$122.label;
        if (i == 0) {
        }
        m116783constructorimpl = Result.m116783constructorimpl((PaymentIntent) obj2);
        if (Result.m116789isFailureimpl(m116783constructorimpl)) {
        }
        paymentIntent = (PaymentIntent) m116783constructorimpl;
        if (paymentIntent != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object performPoll(boolean z, Continuation<? super Unit> continuation) {
        DefaultIntentStatusPoller$performPoll$1 defaultIntentStatusPoller$performPoll$1;
        Object coroutine_suspended;
        int i;
        GX2 gx2;
        DefaultIntentStatusPoller defaultIntentStatusPoller;
        boolean z2;
        DefaultIntentStatusPoller defaultIntentStatusPoller2;
        if (continuation instanceof DefaultIntentStatusPoller$performPoll$1) {
            defaultIntentStatusPoller$performPoll$1 = (DefaultIntentStatusPoller$performPoll$1) continuation;
            int i2 = defaultIntentStatusPoller$performPoll$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                defaultIntentStatusPoller$performPoll$1.label = i2 - Integer.MIN_VALUE;
                Object obj = defaultIntentStatusPoller$performPoll$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = defaultIntentStatusPoller$performPoll$1.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                ResultKt.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        defaultIntentStatusPoller2 = (DefaultIntentStatusPoller) defaultIntentStatusPoller$performPoll$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        defaultIntentStatusPoller$performPoll$1.L$0 = null;
                        defaultIntentStatusPoller$performPoll$1.label = 3;
                        if (performPoll$default(defaultIntentStatusPoller2, false, defaultIntentStatusPoller$performPoll$1, 1, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    gx2 = (GX2) defaultIntentStatusPoller$performPoll$1.L$1;
                    defaultIntentStatusPoller = (DefaultIntentStatusPoller) defaultIntentStatusPoller$performPoll$1.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    if (z || this.attempts < this.config.getMaxAttempts()) {
                        this.attempts++;
                        gx2 = this._state;
                        defaultIntentStatusPoller$performPoll$1.L$0 = this;
                        defaultIntentStatusPoller$performPoll$1.L$1 = gx2;
                        defaultIntentStatusPoller$performPoll$1.label = 1;
                        obj = fetchIntentStatus(defaultIntentStatusPoller$performPoll$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultIntentStatusPoller = this;
                    }
                    return Unit.INSTANCE;
                }
                gx2.setValue(obj);
                if (defaultIntentStatusPoller.attempts >= defaultIntentStatusPoller.config.getMaxAttempts()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    long calculateDelay = DefaultIntentStatusPollerKt.calculateDelay(defaultIntentStatusPoller.attempts);
                    defaultIntentStatusPoller$performPoll$1.L$0 = defaultIntentStatusPoller;
                    defaultIntentStatusPoller$performPoll$1.L$1 = null;
                    defaultIntentStatusPoller$performPoll$1.label = 2;
                    if (C48120rZ0.m15767b(calculateDelay, defaultIntentStatusPoller$performPoll$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    defaultIntentStatusPoller2 = defaultIntentStatusPoller;
                    defaultIntentStatusPoller$performPoll$1.L$0 = null;
                    defaultIntentStatusPoller$performPoll$1.label = 3;
                    if (performPoll$default(defaultIntentStatusPoller2, false, defaultIntentStatusPoller$performPoll$1, 1, null) == coroutine_suspended) {
                    }
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
        }
        defaultIntentStatusPoller$performPoll$1 = new DefaultIntentStatusPoller$performPoll$1(this, continuation);
        Object obj2 = defaultIntentStatusPoller$performPoll$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = defaultIntentStatusPoller$performPoll$1.label;
        if (i == 0) {
        }
        gx2.setValue(obj2);
        if (defaultIntentStatusPoller.attempts >= defaultIntentStatusPoller.config.getMaxAttempts()) {
        }
        if (z2) {
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object performPoll$default(DefaultIntentStatusPoller defaultIntentStatusPoller, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return defaultIntentStatusPoller.performPoll(z, continuation);
    }

    @Override // com.stripe.android.polling.IntentStatusPoller
    public Object forcePoll(Continuation<? super StripeIntent.Status> continuation) {
        return fetchIntentStatus(continuation);
    }

    @Override // com.stripe.android.polling.IntentStatusPoller
    public InterfaceC49220tP5<StripeIntent.Status> getState() {
        return this.state;
    }

    @Override // com.stripe.android.polling.IntentStatusPoller
    public void startPolling(ZC0 scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.pollingJob = X30.m77507d(scope, this.dispatcher, null, new DefaultIntentStatusPoller$startPolling$1(this, null), 2, null);
    }

    @Override // com.stripe.android.polling.IntentStatusPoller
    public void stopPolling() {
        InterfaceC52943zh2 interfaceC52943zh2 = this.pollingJob;
        if (interfaceC52943zh2 != null) {
            InterfaceC52943zh2.C31478a.m550a(interfaceC52943zh2, null, 1, null);
        }
        this.pollingJob = null;
    }
}
