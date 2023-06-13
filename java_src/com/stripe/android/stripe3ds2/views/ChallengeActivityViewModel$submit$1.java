package com.stripe.android.stripe3ds2.views;

import com.stripe.android.stripe3ds2.transaction.ChallengeAction;
import com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler;
import com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
@DebugMetadata(m28419c = "com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel$submit$1", m28418f = "ChallengeActivityViewModel.kt", m28417i = {}, m28416l = {78}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class ChallengeActivityViewModel$submit$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChallengeAction $action;
    Object L$0;
    int label;
    final /* synthetic */ ChallengeActivityViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeActivityViewModel$submit$1(ChallengeActivityViewModel challengeActivityViewModel, ChallengeAction challengeAction, Continuation<? super ChallengeActivityViewModel$submit$1> continuation) {
        super(2, continuation);
        this.this$0 = challengeActivityViewModel;
        this.$action = challengeAction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChallengeActivityViewModel$submit$1(this.this$0, this.$action, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((ChallengeActivityViewModel$submit$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        ChallengeActivityViewModel.OnInactiveAwareMutableLiveData onInactiveAwareMutableLiveData;
        ChallengeActionHandler challengeActionHandler;
        ChallengeActivityViewModel.OnInactiveAwareMutableLiveData onInactiveAwareMutableLiveData2;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                onInactiveAwareMutableLiveData2 = (ChallengeActivityViewModel.OnInactiveAwareMutableLiveData) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            onInactiveAwareMutableLiveData = this.this$0._challengeRequestResult;
            challengeActionHandler = this.this$0.challengeActionHandler;
            ChallengeAction challengeAction = this.$action;
            this.L$0 = onInactiveAwareMutableLiveData;
            this.label = 1;
            Object submit = challengeActionHandler.submit(challengeAction, this);
            if (submit == coroutine_suspended) {
                return coroutine_suspended;
            }
            onInactiveAwareMutableLiveData2 = onInactiveAwareMutableLiveData;
            obj = submit;
        }
        onInactiveAwareMutableLiveData2.postValue(obj);
        return Unit.INSTANCE;
    }
}
