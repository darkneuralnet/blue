package com.stripe.android.uicore.elements;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, m28432d2 = {"", "value", "Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;", "formatter", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.uicore.elements.PhoneNumberController$rawFieldValue$1", m28418f = "PhoneNumberController.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class PhoneNumberController$rawFieldValue$1 extends SuspendLambda implements Function3<String, PhoneNumberFormatter, Continuation<? super String>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public PhoneNumberController$rawFieldValue$1(Continuation<? super PhoneNumberController$rawFieldValue$1> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            return ((PhoneNumberFormatter) this.L$1).toE164Format((String) this.L$0);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(String str, PhoneNumberFormatter phoneNumberFormatter, Continuation<? super String> continuation) {
        PhoneNumberController$rawFieldValue$1 phoneNumberController$rawFieldValue$1 = new PhoneNumberController$rawFieldValue$1(continuation);
        phoneNumberController$rawFieldValue$1.L$0 = str;
        phoneNumberController$rawFieldValue$1.L$1 = phoneNumberFormatter;
        return phoneNumberController$rawFieldValue$1.invokeSuspend(Unit.INSTANCE);
    }
}
