package com.stripe.android.googlepaylauncher;

import com.google.android.gms.tasks.Task;
import com.stripe.android.googlepaylauncher.GooglePayLauncher;
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
@DebugMetadata(m28419c = "com.stripe.android.googlepaylauncher.GooglePayLauncherActivity$onCreate$4", m28418f = "GooglePayLauncherActivity.kt", m28417i = {}, m28416l = {71}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class GooglePayLauncherActivity$onCreate$4 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GooglePayLauncherActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayLauncherActivity$onCreate$4(GooglePayLauncherActivity googlePayLauncherActivity, Continuation<? super GooglePayLauncherActivity$onCreate$4> continuation) {
        super(2, continuation);
        this.this$0 = googlePayLauncherActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GooglePayLauncherActivity$onCreate$4 googlePayLauncherActivity$onCreate$4 = new GooglePayLauncherActivity$onCreate$4(this.this$0, continuation);
        googlePayLauncherActivity$onCreate$4.L$0 = obj;
        return googlePayLauncherActivity$onCreate$4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((GooglePayLauncherActivity$onCreate$4) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        Object m116783constructorimpl;
        GooglePayLauncherViewModel viewModel;
        GooglePayLauncherViewModel viewModel2;
        GooglePayLauncherViewModel viewModel3;
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
                GooglePayLauncherActivity googlePayLauncherActivity = this.this$0;
                Result.Companion companion = Result.Companion;
                viewModel3 = googlePayLauncherActivity.getViewModel();
                this.label = 1;
                obj = viewModel3.createLoadPaymentDataTask(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            m116783constructorimpl = Result.m116783constructorimpl((Task) obj);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        GooglePayLauncherActivity googlePayLauncherActivity2 = this.this$0;
        Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
        if (m116786exceptionOrNullimpl == null) {
            googlePayLauncherActivity2.payWithGoogle((Task) m116783constructorimpl);
            viewModel2 = googlePayLauncherActivity2.getViewModel();
            viewModel2.setHasLaunched(true);
        } else {
            viewModel = googlePayLauncherActivity2.getViewModel();
            viewModel.updateResult(new GooglePayLauncher.Result.Failed(m116786exceptionOrNullimpl));
        }
        return Unit.INSTANCE;
    }
}
