package com.stripe.android.googlepaylauncher;

import com.google.android.gms.tasks.Task;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity$onCreate$2", m28418f = "GooglePayPaymentMethodLauncherActivity.kt", m28417i = {}, m28416l = {69}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class GooglePayPaymentMethodLauncherActivity$onCreate$2 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GooglePayPaymentMethodLauncherActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayPaymentMethodLauncherActivity$onCreate$2(GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity, Continuation<? super GooglePayPaymentMethodLauncherActivity$onCreate$2> continuation) {
        super(2, continuation);
        this.this$0 = googlePayPaymentMethodLauncherActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GooglePayPaymentMethodLauncherActivity$onCreate$2 googlePayPaymentMethodLauncherActivity$onCreate$2 = new GooglePayPaymentMethodLauncherActivity$onCreate$2(this.this$0, continuation);
        googlePayPaymentMethodLauncherActivity$onCreate$2.L$0 = obj;
        return googlePayPaymentMethodLauncherActivity$onCreate$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((GooglePayPaymentMethodLauncherActivity$onCreate$2) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        Object m116783constructorimpl;
        GooglePayPaymentMethodLauncherViewModel viewModel;
        GooglePayPaymentMethodLauncherViewModel viewModel2;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                ZC0 zc0 = (ZC0) this.L$0;
                GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity = this.this$0;
                Result.Companion companion = Result.Companion;
                viewModel2 = googlePayPaymentMethodLauncherActivity.getViewModel();
                this.label = 1;
                obj = viewModel2.createLoadPaymentDataTask(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            m116783constructorimpl = Result.m116783constructorimpl((Task) obj);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity2 = this.this$0;
        Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
        if (m116786exceptionOrNullimpl == null) {
            googlePayPaymentMethodLauncherActivity2.launchGooglePay((Task) m116783constructorimpl);
            viewModel = googlePayPaymentMethodLauncherActivity2.getViewModel();
            viewModel.setHasLaunched$payments_core_release(true);
        } else {
            googlePayPaymentMethodLauncherActivity2.updateResult(new GooglePayPaymentMethodLauncher.Result.Failed(m116786exceptionOrNullimpl, 1));
        }
        return Unit.INSTANCE;
    }
}
