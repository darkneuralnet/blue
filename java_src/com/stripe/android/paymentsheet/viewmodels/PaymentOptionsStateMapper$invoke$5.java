package com.stripe.android.paymentsheet.viewmodels;

import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.PaymentOptionsState;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.SavedSelection;
import com.stripe.android.paymentsheet.state.GooglePayState;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u000b\u001a\u0004\u0018\u00010\n2$\u0010\u0005\u001a \u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00002\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u008a@"}, m28432d2 = {"Lkotlin/Triple;", "", "Lcom/stripe/android/model/PaymentMethod;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "Lcom/stripe/android/paymentsheet/model/SavedSelection;", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lcom/stripe/android/paymentsheet/state/GooglePayState;", "<name for destructuring parameter 1>", "Lcom/stripe/android/paymentsheet/PaymentOptionsState;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.viewmodels.PaymentOptionsStateMapper$invoke$5", m28418f = "PaymentOptionsStateMapper.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class PaymentOptionsStateMapper$invoke$5 extends SuspendLambda implements Function3<Triple<? extends List<? extends PaymentMethod>, ? extends PaymentSelection, ? extends SavedSelection>, Pair<? extends Boolean, ? extends GooglePayState>, Continuation<? super PaymentOptionsState>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ PaymentOptionsStateMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentOptionsStateMapper$invoke$5(PaymentOptionsStateMapper paymentOptionsStateMapper, Continuation<? super PaymentOptionsStateMapper$invoke$5> continuation) {
        super(3, continuation);
        this.this$0 = paymentOptionsStateMapper;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Triple<? extends List<? extends PaymentMethod>, ? extends PaymentSelection, ? extends SavedSelection> triple, Pair<? extends Boolean, ? extends GooglePayState> pair, Continuation<? super PaymentOptionsState> continuation) {
        return invoke2((Triple<? extends List<PaymentMethod>, ? extends PaymentSelection, ? extends SavedSelection>) triple, (Pair<Boolean, ? extends GooglePayState>) pair, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PaymentOptionsState createPaymentOptionsState;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Triple triple = (Triple) this.L$0;
            Pair pair = (Pair) this.L$1;
            createPaymentOptionsState = this.this$0.createPaymentOptionsState((List) triple.component1(), (PaymentSelection) triple.component2(), (SavedSelection) triple.component3(), (Boolean) pair.component1(), (GooglePayState) pair.component2());
            return createPaymentOptionsState;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(Triple<? extends List<PaymentMethod>, ? extends PaymentSelection, ? extends SavedSelection> triple, Pair<Boolean, ? extends GooglePayState> pair, Continuation<? super PaymentOptionsState> continuation) {
        PaymentOptionsStateMapper$invoke$5 paymentOptionsStateMapper$invoke$5 = new PaymentOptionsStateMapper$invoke$5(this.this$0, continuation);
        paymentOptionsStateMapper$invoke$5.L$0 = triple;
        paymentOptionsStateMapper$invoke$5.L$1 = pair;
        return paymentOptionsStateMapper$invoke$5.invokeSuspend(Unit.INSTANCE);
    }
}
