package com.stripe.android.googlepaylauncher;

import android.content.Intent;
import com.stripe.android.googlepaylauncher.GooglePayLauncher;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel$onConfirmResult$1", m28418f = "GooglePayLauncherViewModel.kt", m28417i = {}, m28416l = {197}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class GooglePayLauncherViewModel$onConfirmResult$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Intent $data;
    final /* synthetic */ int $requestCode;
    int label;
    final /* synthetic */ GooglePayLauncherViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayLauncherViewModel$onConfirmResult$1(GooglePayLauncherViewModel googlePayLauncherViewModel, int i, Intent intent, Continuation<? super GooglePayLauncherViewModel$onConfirmResult$1> continuation) {
        super(2, continuation);
        this.this$0 = googlePayLauncherViewModel;
        this.$requestCode = i;
        this.$data = intent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GooglePayLauncherViewModel$onConfirmResult$1(this.this$0, this.$requestCode, this.$data, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((GooglePayLauncherViewModel$onConfirmResult$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        C49882uX2 c49882uX2;
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
            GooglePayLauncherViewModel googlePayLauncherViewModel = this.this$0;
            int i2 = this.$requestCode;
            Intent intent = this.$data;
            this.label = 1;
            obj = googlePayLauncherViewModel.getResultFromConfirmation$payments_core_release(i2, intent, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        c49882uX2 = this.this$0._googleResult;
        c49882uX2.postValue((GooglePayLauncher.Result) obj);
        return Unit.INSTANCE;
    }
}
