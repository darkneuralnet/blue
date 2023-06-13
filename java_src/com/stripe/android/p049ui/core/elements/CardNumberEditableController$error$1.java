package com.stripe.android.p049ui.core.elements;

import com.stripe.android.uicore.elements.FieldError;
import com.stripe.android.uicore.elements.TextFieldState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, m28432d2 = {"", "visibleError", "Lcom/stripe/android/uicore/elements/TextFieldState;", "fieldState", "Lcom/stripe/android/uicore/elements/FieldError;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.ui.core.elements.CardNumberEditableController$error$1", m28418f = "CardNumberController.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
@SourceDebugExtension({"SMAP\nCardNumberController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardNumberController.kt\ncom/stripe/android/ui/core/elements/CardNumberEditableController$error$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n1#2:186\n*E\n"})
/* renamed from: com.stripe.android.ui.core.elements.CardNumberEditableController$error$1 */
/* loaded from: classes7.dex */
public final class CardNumberEditableController$error$1 extends SuspendLambda implements Function3<Boolean, TextFieldState, Continuation<? super FieldError>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    public CardNumberEditableController$error$1(Continuation<? super CardNumberEditableController$error$1> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, TextFieldState textFieldState, Continuation<? super FieldError> continuation) {
        return invoke(bool.booleanValue(), textFieldState, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            boolean z = this.Z$0;
            FieldError error = ((TextFieldState) this.L$0).getError();
            if (error == null || !z) {
                return null;
            }
            return error;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(boolean z, TextFieldState textFieldState, Continuation<? super FieldError> continuation) {
        CardNumberEditableController$error$1 cardNumberEditableController$error$1 = new CardNumberEditableController$error$1(continuation);
        cardNumberEditableController$error$1.Z$0 = z;
        cardNumberEditableController$error$1.L$0 = textFieldState;
        return cardNumberEditableController$error$1.invokeSuspend(Unit.INSTANCE);
    }
}
