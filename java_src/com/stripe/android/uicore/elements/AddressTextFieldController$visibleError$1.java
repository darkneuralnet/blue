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
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/TextFieldState;", "fieldState", "", "hasFocus", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.uicore.elements.AddressTextFieldController$visibleError$1", m28418f = "AddressTextFieldController.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class AddressTextFieldController$visibleError$1 extends SuspendLambda implements Function3<TextFieldState, Boolean, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    public AddressTextFieldController$visibleError$1(Continuation<? super AddressTextFieldController$visibleError$1> continuation) {
        super(3, continuation);
    }

    public final Object invoke(TextFieldState textFieldState, boolean z, Continuation<? super Boolean> continuation) {
        AddressTextFieldController$visibleError$1 addressTextFieldController$visibleError$1 = new AddressTextFieldController$visibleError$1(continuation);
        addressTextFieldController$visibleError$1.L$0 = textFieldState;
        addressTextFieldController$visibleError$1.Z$0 = z;
        return addressTextFieldController$visibleError$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(((TextFieldState) this.L$0).shouldShowError(this.Z$0));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(TextFieldState textFieldState, Boolean bool, Continuation<? super Boolean> continuation) {
        return invoke(textFieldState, bool.booleanValue(), continuation);
    }
}
