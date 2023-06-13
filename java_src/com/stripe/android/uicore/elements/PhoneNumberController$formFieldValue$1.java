package com.stripe.android.uicore.elements;

import com.stripe.android.uicore.forms.FormFieldEntry;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, m28432d2 = {"", "fieldValue", "", "isComplete", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.uicore.elements.PhoneNumberController$formFieldValue$1", m28418f = "PhoneNumberController.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class PhoneNumberController$formFieldValue$1 extends SuspendLambda implements Function3<String, Boolean, Continuation<? super FormFieldEntry>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    public PhoneNumberController$formFieldValue$1(Continuation<? super PhoneNumberController$formFieldValue$1> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(String str, Boolean bool, Continuation<? super FormFieldEntry> continuation) {
        return invoke(str, bool.booleanValue(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            return new FormFieldEntry((String) this.L$0, this.Z$0);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(String str, boolean z, Continuation<? super FormFieldEntry> continuation) {
        PhoneNumberController$formFieldValue$1 phoneNumberController$formFieldValue$1 = new PhoneNumberController$formFieldValue$1(continuation);
        phoneNumberController$formFieldValue$1.L$0 = str;
        phoneNumberController$formFieldValue$1.Z$0 = z;
        return phoneNumberController$formFieldValue$1.invokeSuspend(Unit.INSTANCE);
    }
}
