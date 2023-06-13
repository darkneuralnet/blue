package com.stripe.android.paymentsheet.viewmodels;

import com.stripe.android.paymentsheet.state.GooglePayState;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public /* synthetic */ class PaymentOptionsStateMapper$invoke$4 extends AdaptedFunctionReference implements Function3<Boolean, GooglePayState, Continuation<? super Pair<? extends Boolean, ? extends GooglePayState>>, Object>, SuspendFunction {
    public static final PaymentOptionsStateMapper$invoke$4 INSTANCE = new PaymentOptionsStateMapper$invoke$4();

    public PaymentOptionsStateMapper$invoke$4() {
        super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(Boolean bool, GooglePayState googlePayState, Continuation<? super Pair<Boolean, ? extends GooglePayState>> continuation) {
        Object invoke$lambda$1;
        invoke$lambda$1 = PaymentOptionsStateMapper.invoke$lambda$1(bool, googlePayState, continuation);
        return invoke$lambda$1;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, GooglePayState googlePayState, Continuation<? super Pair<? extends Boolean, ? extends GooglePayState>> continuation) {
        return invoke2(bool, googlePayState, (Continuation<? super Pair<Boolean, ? extends GooglePayState>>) continuation);
    }
}
