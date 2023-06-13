package com.stripe.android.paymentsheet;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.PaymentMethodsUIKt$PaymentMethodsUI$1$1", m28418f = "PaymentMethodsUI.kt", m28417i = {}, m28416l = {69, 71}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class PaymentMethodsUIKt$PaymentMethodsUI$1$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $inspectionMode;
    final /* synthetic */ int $selectedIndex;
    final /* synthetic */ C32209Co2 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsUIKt$PaymentMethodsUI$1$1(boolean z, C32209Co2 c32209Co2, int i, Continuation<? super PaymentMethodsUIKt$PaymentMethodsUI$1$1> continuation) {
        super(2, continuation);
        this.$inspectionMode = z;
        this.$state = c32209Co2;
        this.$selectedIndex = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PaymentMethodsUIKt$PaymentMethodsUI$1$1(this.$inspectionMode, this.$state, this.$selectedIndex, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((PaymentMethodsUIKt$PaymentMethodsUI$1$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            if (this.$inspectionMode) {
                C32209Co2 c32209Co2 = this.$state;
                int i2 = this.$selectedIndex;
                this.label = 1;
                if (C32209Co2.m111555C(c32209Co2, i2, 0, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                C32209Co2 c32209Co22 = this.$state;
                int i3 = this.$selectedIndex;
                this.label = 2;
                if (C32209Co2.m111543j(c32209Co22, i3, 0, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
