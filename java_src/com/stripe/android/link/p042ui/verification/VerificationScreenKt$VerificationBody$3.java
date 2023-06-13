package com.stripe.android.link.p042ui.verification;

import androidx.compose.p003ui.focus.C11309h;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.link.ui.verification.VerificationScreenKt$VerificationBody$3", m28418f = "VerificationScreen.kt", m28417i = {}, m28416l = {132}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* renamed from: com.stripe.android.link.ui.verification.VerificationScreenKt$VerificationBody$3 */
/* loaded from: classes7.dex */
public final class VerificationScreenKt$VerificationBody$3 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ C11309h $focusRequester;
    final /* synthetic */ InterfaceC45645nN5 $keyboardController;
    final /* synthetic */ VerificationViewModel $viewModel;
    final /* synthetic */ InterfaceC48627sP5<VerificationViewState> $viewState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationScreenKt$VerificationBody$3(C11309h c11309h, InterfaceC45645nN5 interfaceC45645nN5, VerificationViewModel verificationViewModel, InterfaceC48627sP5<VerificationViewState> interfaceC48627sP5, Continuation<? super VerificationScreenKt$VerificationBody$3> continuation) {
        super(2, continuation);
        this.$focusRequester = c11309h;
        this.$keyboardController = interfaceC45645nN5;
        this.$viewModel = verificationViewModel;
        this.$viewState$delegate = interfaceC48627sP5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VerificationScreenKt$VerificationBody$3(this.$focusRequester, this.$keyboardController, this.$viewModel, this.$viewState$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((VerificationScreenKt$VerificationBody$3) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        VerificationViewState VerificationBody$lambda$0;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            VerificationBody$lambda$0 = VerificationScreenKt.VerificationBody$lambda$0(this.$viewState$delegate);
            if (VerificationBody$lambda$0.getRequestFocus()) {
                this.label = 1;
                if (C48120rZ0.m15768a(200L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        this.$focusRequester.m68779e();
        InterfaceC45645nN5 interfaceC45645nN5 = this.$keyboardController;
        if (interfaceC45645nN5 != null) {
            interfaceC45645nN5.mo23925a();
        }
        this.$viewModel.onFocusRequested();
        return Unit.INSTANCE;
    }
}
