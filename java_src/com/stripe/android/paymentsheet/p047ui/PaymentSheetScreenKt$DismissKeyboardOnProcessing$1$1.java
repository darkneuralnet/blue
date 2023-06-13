package com.stripe.android.paymentsheet.p047ui;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.ui.PaymentSheetScreenKt$DismissKeyboardOnProcessing$1$1", m28418f = "PaymentSheetScreen.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* renamed from: com.stripe.android.paymentsheet.ui.PaymentSheetScreenKt$DismissKeyboardOnProcessing$1$1 */
/* loaded from: classes7.dex */
public final class PaymentSheetScreenKt$DismissKeyboardOnProcessing$1$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC45645nN5 $keyboardController;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSheetScreenKt$DismissKeyboardOnProcessing$1$1(InterfaceC45645nN5 interfaceC45645nN5, Continuation<? super PaymentSheetScreenKt$DismissKeyboardOnProcessing$1$1> continuation) {
        super(2, continuation);
        this.$keyboardController = interfaceC45645nN5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PaymentSheetScreenKt$DismissKeyboardOnProcessing$1$1(this.$keyboardController, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((PaymentSheetScreenKt$DismissKeyboardOnProcessing$1$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC45645nN5 interfaceC45645nN5 = this.$keyboardController;
            if (interfaceC45645nN5 != null) {
                interfaceC45645nN5.mo23924b();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
