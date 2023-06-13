package com.stripe.android.uicore.elements;

import com.stripe.android.uicore.elements.TextFieldStateConstants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.uicore.elements.TextFieldUIKt$TextField$2", m28418f = "TextFieldUI.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class TextFieldUIKt$TextField$2 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC48627sP5<TextFieldState> $fieldState$delegate;
    final /* synthetic */ InterfaceC32037Bv1 $focusManager;
    final /* synthetic */ EX2<Boolean> $hasFocus$delegate;
    final /* synthetic */ int $nextFocusDirection;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldUIKt$TextField$2(InterfaceC32037Bv1 interfaceC32037Bv1, int i, InterfaceC48627sP5<? extends TextFieldState> interfaceC48627sP5, EX2<Boolean> ex2, Continuation<? super TextFieldUIKt$TextField$2> continuation) {
        super(2, continuation);
        this.$focusManager = interfaceC32037Bv1;
        this.$nextFocusDirection = i;
        this.$fieldState$delegate = interfaceC48627sP5;
        this.$hasFocus$delegate = ex2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TextFieldUIKt$TextField$2(this.$focusManager, this.$nextFocusDirection, this.$fieldState$delegate, this.$hasFocus$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((TextFieldUIKt$TextField$2) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TextFieldState TextField_ndPIYpw$lambda$11;
        boolean TextField_ndPIYpw$lambda$9;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            TextField_ndPIYpw$lambda$11 = TextFieldUIKt.TextField_ndPIYpw$lambda$11(this.$fieldState$delegate);
            if (Intrinsics.areEqual(TextField_ndPIYpw$lambda$11, TextFieldStateConstants.Valid.Full.INSTANCE)) {
                TextField_ndPIYpw$lambda$9 = TextFieldUIKt.TextField_ndPIYpw$lambda$9(this.$hasFocus$delegate);
                if (TextField_ndPIYpw$lambda$9) {
                    this.$focusManager.mo68851i(this.$nextFocusDirection);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
