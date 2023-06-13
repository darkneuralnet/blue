package com.stripe.android.paymentsheet.state;

import com.stripe.android.core.Logger;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.state.PaymentSheetLoader;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.state.DefaultPaymentSheetLoader$load$2", m28418f = "PaymentSheetLoader.kt", m28417i = {0, 1}, m28416l = {72, 75, 81}, m28415m = "invokeSuspend", m28414n = {"$this$withContext", "isGooglePayReady"}, m28413s = {"L$0", "Z$0"})
/* loaded from: classes7.dex */
public final class DefaultPaymentSheetLoader$load$2 extends SuspendLambda implements Function2<ZC0, Continuation<? super PaymentSheetLoader.Result>, Object> {
    final /* synthetic */ PaymentSheet.InitializationMode $initializationMode;
    final /* synthetic */ PaymentSheet.Configuration $paymentSheetConfiguration;
    private /* synthetic */ Object L$0;
    boolean Z$0;
    int label;
    final /* synthetic */ DefaultPaymentSheetLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultPaymentSheetLoader$load$2(DefaultPaymentSheetLoader defaultPaymentSheetLoader, PaymentSheet.Configuration configuration, PaymentSheet.InitializationMode initializationMode, Continuation<? super DefaultPaymentSheetLoader$load$2> continuation) {
        super(2, continuation);
        this.this$0 = defaultPaymentSheetLoader;
        this.$paymentSheetConfiguration = configuration;
        this.$initializationMode = initializationMode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DefaultPaymentSheetLoader$load$2 defaultPaymentSheetLoader$load$2 = new DefaultPaymentSheetLoader$load$2(this.this$0, this.$paymentSheetConfiguration, this.$initializationMode, continuation);
        defaultPaymentSheetLoader$load$2.L$0 = obj;
        return defaultPaymentSheetLoader$load$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super PaymentSheetLoader.Result> continuation) {
        return ((DefaultPaymentSheetLoader$load$2) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        Object m116783constructorimpl;
        int i;
        Throwable m116786exceptionOrNullimpl;
        Logger logger;
        PaymentSheet.CustomerConfiguration customerConfiguration;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
            i = i2;
        }
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        ResultKt.throwOnFailure(obj);
                        return (PaymentSheetLoader.Result) obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z = this.Z$0;
                ResultKt.throwOnFailure(obj);
                i2 = z;
                m116783constructorimpl = Result.m116783constructorimpl((StripeIntent) obj);
                i = i2;
                boolean z2 = i;
                DefaultPaymentSheetLoader defaultPaymentSheetLoader = this.this$0;
                PaymentSheet.Configuration configuration = this.$paymentSheetConfiguration;
                m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                if (m116786exceptionOrNullimpl != null) {
                    StripeIntent stripeIntent = (StripeIntent) m116783constructorimpl;
                    if (configuration != null) {
                        customerConfiguration = configuration.getCustomer();
                    } else {
                        customerConfiguration = null;
                    }
                    this.L$0 = null;
                    this.label = 3;
                    obj = defaultPaymentSheetLoader.create(stripeIntent, customerConfiguration, configuration, z2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return (PaymentSheetLoader.Result) obj;
                }
                logger = defaultPaymentSheetLoader.logger;
                logger.error("Failure initializing FlowController", m116786exceptionOrNullimpl);
                return new PaymentSheetLoader.Result.Failure(m116786exceptionOrNullimpl);
            }
            ZC0 zc0 = (ZC0) this.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            DefaultPaymentSheetLoader defaultPaymentSheetLoader2 = this.this$0;
            PaymentSheet.Configuration configuration2 = this.$paymentSheetConfiguration;
            this.L$0 = (ZC0) this.L$0;
            this.label = 1;
            obj = defaultPaymentSheetLoader2.isGooglePayReady(configuration2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        DefaultPaymentSheetLoader defaultPaymentSheetLoader3 = this.this$0;
        PaymentSheet.InitializationMode initializationMode = this.$initializationMode;
        PaymentSheet.Configuration configuration3 = this.$paymentSheetConfiguration;
        Result.Companion companion2 = Result.Companion;
        this.L$0 = null;
        this.Z$0 = booleanValue;
        this.label = 2;
        obj = defaultPaymentSheetLoader3.retrieveElementsSession(initializationMode, configuration3, this);
        i2 = booleanValue;
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        m116783constructorimpl = Result.m116783constructorimpl((StripeIntent) obj);
        i = i2;
        boolean z22 = i;
        DefaultPaymentSheetLoader defaultPaymentSheetLoader4 = this.this$0;
        PaymentSheet.Configuration configuration4 = this.$paymentSheetConfiguration;
        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
        if (m116786exceptionOrNullimpl != null) {
        }
    }
}
