package com.stripe.android.p049ui.core.elements;

import com.stripe.android.uicore.forms.FormFieldEntry;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, m28432d2 = {"", "complete", "", "value", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.ui.core.elements.CardNumberEditableController$formFieldValue$1", m28418f = "CardNumberController.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* renamed from: com.stripe.android.ui.core.elements.CardNumberEditableController$formFieldValue$1 */
/* loaded from: classes7.dex */
public final class CardNumberEditableController$formFieldValue$1 extends SuspendLambda implements Function3<Boolean, String, Continuation<? super FormFieldEntry>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    public CardNumberEditableController$formFieldValue$1(Continuation<? super CardNumberEditableController$formFieldValue$1> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, String str, Continuation<? super FormFieldEntry> continuation) {
        return invoke(bool.booleanValue(), str, continuation);
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

    public final Object invoke(boolean z, String str, Continuation<? super FormFieldEntry> continuation) {
        CardNumberEditableController$formFieldValue$1 cardNumberEditableController$formFieldValue$1 = new CardNumberEditableController$formFieldValue$1(continuation);
        cardNumberEditableController$formFieldValue$1.Z$0 = z;
        cardNumberEditableController$formFieldValue$1.L$0 = str;
        return cardNumberEditableController$formFieldValue$1.invokeSuspend(Unit.INSTANCE);
    }
}
