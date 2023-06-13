package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.transaction.ChallengeAction;
import com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
@DebugMetadata(m28419c = "com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler$Default$submit$2", m28418f = "ChallengeActionHandler.kt", m28417i = {}, m28416l = {72}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class ChallengeActionHandler$Default$submit$2 extends SuspendLambda implements Function2<ZC0, Continuation<? super ChallengeRequestResult>, Object> {
    final /* synthetic */ ChallengeAction $action;
    int label;
    final /* synthetic */ ChallengeActionHandler.Default this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeActionHandler$Default$submit$2(ChallengeActionHandler.Default r1, ChallengeAction challengeAction, Continuation<? super ChallengeActionHandler$Default$submit$2> continuation) {
        super(2, continuation);
        this.this$0 = r1;
        this.$action = challengeAction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChallengeActionHandler$Default$submit$2(this.this$0, this.$action, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super ChallengeRequestResult> continuation) {
        return ((ChallengeActionHandler$Default$submit$2) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        ChallengeRequestData challengeRequestData;
        ChallengeRequestData challengeRequestData2;
        ChallengeRequestData challengeRequestData3;
        ChallengeRequestData challengeRequestData4;
        ChallengeRequestData challengeRequestData5;
        ChallengeRequestData copy$default;
        Object executeChallengeRequest;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        challengeRequestData = this.this$0.creqData;
        String messageVersion = challengeRequestData.getMessageVersion();
        challengeRequestData2 = this.this$0.creqData;
        String threeDsServerTransId = challengeRequestData2.getThreeDsServerTransId();
        challengeRequestData3 = this.this$0.creqData;
        String acsTransId = challengeRequestData3.getAcsTransId();
        challengeRequestData4 = this.this$0.creqData;
        SdkTransactionId sdkTransId = challengeRequestData4.getSdkTransId();
        challengeRequestData5 = this.this$0.creqData;
        ChallengeRequestData challengeRequestData6 = new ChallengeRequestData(messageVersion, threeDsServerTransId, acsTransId, sdkTransId, null, null, null, challengeRequestData5.getMessageExtensions(), null, null, 880, null);
        ChallengeAction challengeAction = this.$action;
        if (challengeAction instanceof ChallengeAction.NativeForm) {
            copy$default = ChallengeRequestData.copy$default(challengeRequestData6, null, null, null, null, ((ChallengeAction.NativeForm) challengeAction).getUserEntry$3ds2sdk_release(), null, null, null, null, null, 1007, null);
        } else if (challengeAction instanceof ChallengeAction.HtmlForm) {
            copy$default = ChallengeRequestData.copy$default(challengeRequestData6, null, null, null, null, null, null, ((ChallengeAction.HtmlForm) challengeAction).getUserEntry$3ds2sdk_release(), null, null, null, 959, null);
        } else if (challengeAction instanceof ChallengeAction.Oob) {
            copy$default = ChallengeRequestData.copy$default(challengeRequestData6, null, null, null, null, null, null, null, null, Boxing.boxBoolean(true), null, 767, null);
        } else if (challengeAction instanceof ChallengeAction.Resend) {
            copy$default = ChallengeRequestData.copy$default(challengeRequestData6, null, null, null, null, null, null, null, null, null, Boxing.boxBoolean(true), 511, null);
        } else if (challengeAction instanceof ChallengeAction.Cancel) {
            copy$default = ChallengeRequestData.copy$default(challengeRequestData6, null, null, null, null, null, ChallengeRequestData.CancelReason.UserSelected, null, null, null, null, 991, null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        ChallengeActionHandler.Default r4 = this.this$0;
        this.label = 1;
        executeChallengeRequest = r4.executeChallengeRequest(copy$default, this);
        if (executeChallengeRequest == coroutine_suspended) {
            return coroutine_suspended;
        }
        return executeChallengeRequest;
    }
}
