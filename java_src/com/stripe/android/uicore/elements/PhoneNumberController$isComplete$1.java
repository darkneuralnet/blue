package com.stripe.android.uicore.elements;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@"}, m28432d2 = {"", "value", "", "minLength", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.uicore.elements.PhoneNumberController$isComplete$1", m28418f = "PhoneNumberController.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class PhoneNumberController$isComplete$1 extends SuspendLambda implements Function3<String, Integer, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ PhoneNumberController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneNumberController$isComplete$1(PhoneNumberController phoneNumberController, Continuation<? super PhoneNumberController$isComplete$1> continuation) {
        super(3, continuation);
        this.this$0 = phoneNumberController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Integer num = (Integer) this.L$1;
            int length = ((String) this.L$0).length();
            boolean z = false;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            return Boxing.boxBoolean((length >= i || this.this$0.getShowOptionalLabel()) ? true : true);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(String str, Integer num, Continuation<? super Boolean> continuation) {
        PhoneNumberController$isComplete$1 phoneNumberController$isComplete$1 = new PhoneNumberController$isComplete$1(this.this$0, continuation);
        phoneNumberController$isComplete$1.L$0 = str;
        phoneNumberController$isComplete$1.L$1 = num;
        return phoneNumberController$isComplete$1.invokeSuspend(Unit.INSTANCE);
    }
}
