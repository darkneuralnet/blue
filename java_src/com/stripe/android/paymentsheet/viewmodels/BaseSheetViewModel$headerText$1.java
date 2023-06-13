package com.stripe.android.paymentsheet.viewmodels;

import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.navigation.PaymentSheetScreen;
import com.stripe.android.paymentsheet.state.GooglePayState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function5;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u008a@"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;", "screen", "", "isLinkAvailable", "Lcom/stripe/android/paymentsheet/state/GooglePayState;", "googlePay", "Lcom/stripe/android/model/StripeIntent;", "intent", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$headerText$1", m28418f = "BaseSheetViewModel.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class BaseSheetViewModel$headerText$1 extends SuspendLambda implements Function5<PaymentSheetScreen, Boolean, GooglePayState, StripeIntent, Continuation<? super Integer>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ BaseSheetViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSheetViewModel$headerText$1(BaseSheetViewModel baseSheetViewModel, Continuation<? super BaseSheetViewModel$headerText$1> continuation) {
        super(5, continuation);
        this.this$0 = baseSheetViewModel;
    }

    public final Object invoke(PaymentSheetScreen paymentSheetScreen, boolean z, GooglePayState googlePayState, StripeIntent stripeIntent, Continuation<? super Integer> continuation) {
        BaseSheetViewModel$headerText$1 baseSheetViewModel$headerText$1 = new BaseSheetViewModel$headerText$1(this.this$0, continuation);
        baseSheetViewModel$headerText$1.L$0 = paymentSheetScreen;
        baseSheetViewModel$headerText$1.Z$0 = z;
        baseSheetViewModel$headerText$1.L$1 = googlePayState;
        baseSheetViewModel$headerText$1.L$2 = stripeIntent;
        return baseSheetViewModel$headerText$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Integer mapToHeaderTextResource;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            mapToHeaderTextResource = this.this$0.mapToHeaderTextResource((PaymentSheetScreen) this.L$0, this.Z$0, (GooglePayState) this.L$1, (StripeIntent) this.L$2);
            return mapToHeaderTextResource;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function5
    public /* bridge */ /* synthetic */ Object invoke(PaymentSheetScreen paymentSheetScreen, Boolean bool, GooglePayState googlePayState, StripeIntent stripeIntent, Continuation<? super Integer> continuation) {
        return invoke(paymentSheetScreen, bool.booleanValue(), googlePayState, stripeIntent, continuation);
    }
}
