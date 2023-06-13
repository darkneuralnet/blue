package com.stripe.android.paymentsheet.p047ui;

import com.stripe.android.paymentsheet.paymentdatacollection.FormArguments;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.ui.AddPaymentMethodKt$AddPaymentMethod$1", m28418f = "AddPaymentMethod.kt", m28417i = {}, m28416l = {68}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* renamed from: com.stripe.android.paymentsheet.ui.AddPaymentMethodKt$AddPaymentMethod$1 */
/* loaded from: classes7.dex */
public final class AddPaymentMethodKt$AddPaymentMethod$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ FormArguments $arguments;
    final /* synthetic */ GX2<Boolean> $showCheckboxFlow;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodKt$AddPaymentMethod$1(GX2<Boolean> gx2, FormArguments formArguments, Continuation<? super AddPaymentMethodKt$AddPaymentMethod$1> continuation) {
        super(2, continuation);
        this.$showCheckboxFlow = gx2;
        this.$arguments = formArguments;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddPaymentMethodKt$AddPaymentMethod$1(this.$showCheckboxFlow, this.$arguments, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((AddPaymentMethodKt$AddPaymentMethod$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            GX2<Boolean> gx2 = this.$showCheckboxFlow;
            Boolean boxBoolean = Boxing.boxBoolean(this.$arguments.getShowCheckbox());
            this.label = 1;
            if (gx2.emit(boxBoolean, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
