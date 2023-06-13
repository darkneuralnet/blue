package com.stripe.android.payments.core.authentication;

import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.model.Source;
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
@DebugMetadata(m28419c = "com.stripe.android.payments.core.authentication.SourceAuthenticator$bypassAuth$2", m28418f = "SourceAuthenticator.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class SourceAuthenticator$bypassAuth$2 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ AuthActivityStarterHost $host;
    final /* synthetic */ Source $source;
    final /* synthetic */ String $stripeAccountId;
    int label;
    final /* synthetic */ SourceAuthenticator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourceAuthenticator$bypassAuth$2(SourceAuthenticator sourceAuthenticator, AuthActivityStarterHost authActivityStarterHost, Source source, String str, Continuation<SourceAuthenticator$bypassAuth$2> continuation) {
        super(2, continuation);
        this.this$0 = sourceAuthenticator;
        this.$host = authActivityStarterHost;
        this.$source = source;
        this.$stripeAccountId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SourceAuthenticator$bypassAuth$2(this.this$0, this.$host, this.$source, this.$stripeAccountId, continuation);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(ZC0 zc0, Continuation<Unit> continuation) {
        return ((SourceAuthenticator$bypassAuth$2) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Function1 function1;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            function1 = this.this$0.paymentRelayStarterFactory;
            ((PaymentRelayStarter) function1.invoke(this.$host)).start(new PaymentRelayStarter.Args.SourceArgs(this.$source, this.$stripeAccountId));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return invoke2(zc0, (Continuation<Unit>) continuation);
    }
}
