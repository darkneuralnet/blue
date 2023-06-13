package com.stripe.android.paymentsheet.state;

import ch.qos.logback.core.net.SyslogConstants;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.PaymentSheet;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "Lcom/stripe/android/paymentsheet/state/LinkState;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.state.DefaultPaymentSheetLoader$create$2$linkState$1", m28418f = "PaymentSheetLoader.kt", m28417i = {}, m28416l = {SyslogConstants.LOG_LOCAL2}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class DefaultPaymentSheetLoader$create$2$linkState$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super LinkState>, Object> {
    final /* synthetic */ PaymentSheet.Configuration $config;
    final /* synthetic */ boolean $isLinkAvailable;
    final /* synthetic */ StripeIntent $stripeIntent;
    int label;
    final /* synthetic */ DefaultPaymentSheetLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultPaymentSheetLoader$create$2$linkState$1(boolean z, DefaultPaymentSheetLoader defaultPaymentSheetLoader, PaymentSheet.Configuration configuration, StripeIntent stripeIntent, Continuation<? super DefaultPaymentSheetLoader$create$2$linkState$1> continuation) {
        super(2, continuation);
        this.$isLinkAvailable = z;
        this.this$0 = defaultPaymentSheetLoader;
        this.$config = configuration;
        this.$stripeIntent = stripeIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefaultPaymentSheetLoader$create$2$linkState$1(this.$isLinkAvailable, this.this$0, this.$config, this.$stripeIntent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super LinkState> continuation) {
        return ((DefaultPaymentSheetLoader$create$2$linkState$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            if (this.$isLinkAvailable) {
                DefaultPaymentSheetLoader defaultPaymentSheetLoader = this.this$0;
                PaymentSheet.Configuration configuration = this.$config;
                StripeIntent stripeIntent = this.$stripeIntent;
                this.label = 1;
                obj = defaultPaymentSheetLoader.loadLinkState(configuration, stripeIntent, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                return null;
            }
        }
        return (LinkState) obj;
    }
}
