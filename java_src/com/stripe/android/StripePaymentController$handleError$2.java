package com.stripe.android;

import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.view.AuthActivityStarterHost;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.StripePaymentController$handleError$2", m28418f = "StripePaymentController.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes6.dex */
public final class StripePaymentController$handleError$2 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ AuthActivityStarterHost $host;
    final /* synthetic */ int $requestCode;
    final /* synthetic */ Throwable $throwable;
    int label;
    final /* synthetic */ StripePaymentController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripePaymentController$handleError$2(StripePaymentController stripePaymentController, AuthActivityStarterHost authActivityStarterHost, Throwable th, int i, Continuation<? super StripePaymentController$handleError$2> continuation) {
        super(2, continuation);
        this.this$0 = stripePaymentController;
        this.$host = authActivityStarterHost;
        this.$throwable = th;
        this.$requestCode = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StripePaymentController$handleError$2(this.this$0, this.$host, this.$throwable, this.$requestCode, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((StripePaymentController$handleError$2) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Function1 function1;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            function1 = this.this$0.paymentRelayStarterFactory;
            ((PaymentRelayStarter) function1.invoke(this.$host)).start(new PaymentRelayStarter.Args.ErrorArgs(StripeException.Companion.create(this.$throwable), this.$requestCode));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
