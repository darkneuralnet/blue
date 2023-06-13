package com.stripe.android.googlepaylauncher;

import com.google.android.gms.wallet.PaymentData;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity$onGooglePayResult$2$1", m28418f = "GooglePayPaymentMethodLauncherActivity.kt", m28417i = {}, m28416l = {148}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class GooglePayPaymentMethodLauncherActivity$onGooglePayResult$2$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ PaymentData $paymentData;
    Object L$0;
    int label;
    final /* synthetic */ GooglePayPaymentMethodLauncherActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayPaymentMethodLauncherActivity$onGooglePayResult$2$1(GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity, PaymentData paymentData, Continuation<? super GooglePayPaymentMethodLauncherActivity$onGooglePayResult$2$1> continuation) {
        super(2, continuation);
        this.this$0 = googlePayPaymentMethodLauncherActivity;
        this.$paymentData = paymentData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GooglePayPaymentMethodLauncherActivity$onGooglePayResult$2$1(this.this$0, this.$paymentData, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((GooglePayPaymentMethodLauncherActivity$onGooglePayResult$2$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        GooglePayPaymentMethodLauncherViewModel viewModel;
        GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                googlePayPaymentMethodLauncherActivity = (GooglePayPaymentMethodLauncherActivity) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity2 = this.this$0;
            viewModel = googlePayPaymentMethodLauncherActivity2.getViewModel();
            PaymentData paymentData = this.$paymentData;
            Intrinsics.checkNotNullExpressionValue(paymentData, "paymentData");
            this.L$0 = googlePayPaymentMethodLauncherActivity2;
            this.label = 1;
            Object createPaymentMethod = viewModel.createPaymentMethod(paymentData, this);
            if (createPaymentMethod == coroutine_suspended) {
                return coroutine_suspended;
            }
            googlePayPaymentMethodLauncherActivity = googlePayPaymentMethodLauncherActivity2;
            obj = createPaymentMethod;
        }
        googlePayPaymentMethodLauncherActivity.finishWithResult((GooglePayPaymentMethodLauncher.Result) obj);
        return Unit.INSTANCE;
    }
}
