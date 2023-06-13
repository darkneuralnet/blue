package com.stripe.android.googlepaylauncher;

import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.view.AuthActivityStarterHost;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.googlepaylauncher.GooglePayLauncherActivity$onGooglePayResult$1", m28418f = "GooglePayLauncherActivity.kt", m28417i = {}, m28416l = {164}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class GooglePayLauncherActivity$onGooglePayResult$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ AuthActivityStarterHost $host;
    final /* synthetic */ PaymentMethodCreateParams $params;
    int label;
    final /* synthetic */ GooglePayLauncherActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayLauncherActivity$onGooglePayResult$1(GooglePayLauncherActivity googlePayLauncherActivity, AuthActivityStarterHost authActivityStarterHost, PaymentMethodCreateParams paymentMethodCreateParams, Continuation<? super GooglePayLauncherActivity$onGooglePayResult$1> continuation) {
        super(2, continuation);
        this.this$0 = googlePayLauncherActivity;
        this.$host = authActivityStarterHost;
        this.$params = paymentMethodCreateParams;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GooglePayLauncherActivity$onGooglePayResult$1(this.this$0, this.$host, this.$params, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((GooglePayLauncherActivity$onGooglePayResult$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        GooglePayLauncherViewModel viewModel;
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
            viewModel = this.this$0.getViewModel();
            AuthActivityStarterHost authActivityStarterHost = this.$host;
            PaymentMethodCreateParams paymentMethodCreateParams = this.$params;
            this.label = 1;
            if (viewModel.confirmStripeIntent(authActivityStarterHost, paymentMethodCreateParams, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}