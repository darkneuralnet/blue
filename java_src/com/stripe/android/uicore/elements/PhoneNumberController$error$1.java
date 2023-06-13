package com.stripe.android.uicore.elements;

import com.stripe.android.uicore.C19423R;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u008a@"}, m28432d2 = {"", "value", "", "complete", "hasFocus", "Lcom/stripe/android/uicore/elements/FieldError;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.uicore.elements.PhoneNumberController$error$1", m28418f = "PhoneNumberController.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class PhoneNumberController$error$1 extends SuspendLambda implements Function4<String, Boolean, Boolean, Continuation<? super FieldError>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    int label;

    public PhoneNumberController$error$1(Continuation<? super PhoneNumberController$error$1> continuation) {
        super(4, continuation);
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Object invoke(String str, Boolean bool, Boolean bool2, Continuation<? super FieldError> continuation) {
        return invoke(str, bool.booleanValue(), bool2.booleanValue(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean isBlank;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            boolean z = this.Z$0;
            boolean z2 = this.Z$1;
            isBlank = StringsKt__StringsJVMKt.isBlank((String) this.L$0);
            if (!(!isBlank) || z || z2) {
                return null;
            }
            return new FieldError(C19423R.string.incomplete_phone_number, null, 2, null);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(String str, boolean z, boolean z2, Continuation<? super FieldError> continuation) {
        PhoneNumberController$error$1 phoneNumberController$error$1 = new PhoneNumberController$error$1(continuation);
        phoneNumberController$error$1.L$0 = str;
        phoneNumberController$error$1.Z$0 = z;
        phoneNumberController$error$1.Z$1 = z2;
        return phoneNumberController$error$1.invokeSuspend(Unit.INSTANCE);
    }
}
