package com.stripe.android.paymentsheet.viewmodels;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u008a@"}, m28432d2 = {"", "isProcessing", "isEditing", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$buttonsEnabled$1", m28418f = "BaseSheetViewModel.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class BaseSheetViewModel$buttonsEnabled$1 extends SuspendLambda implements Function3<Boolean, Boolean, Continuation<? super Boolean>, Object> {
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    int label;

    public BaseSheetViewModel$buttonsEnabled$1(Continuation<? super BaseSheetViewModel$buttonsEnabled$1> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, Continuation<? super Boolean> continuation) {
        return invoke(bool.booleanValue(), bool2.booleanValue(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            boolean z2 = this.Z$0;
            boolean z3 = this.Z$1;
            if (!z2 && !z3) {
                z = true;
            } else {
                z = false;
            }
            return Boxing.boxBoolean(z);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(boolean z, boolean z2, Continuation<? super Boolean> continuation) {
        BaseSheetViewModel$buttonsEnabled$1 baseSheetViewModel$buttonsEnabled$1 = new BaseSheetViewModel$buttonsEnabled$1(continuation);
        baseSheetViewModel$buttonsEnabled$1.Z$0 = z;
        baseSheetViewModel$buttonsEnabled$1.Z$1 = z2;
        return baseSheetViewModel$buttonsEnabled$1.invokeSuspend(Unit.INSTANCE);
    }
}
