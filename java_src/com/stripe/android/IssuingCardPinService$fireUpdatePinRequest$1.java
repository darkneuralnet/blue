package com.stripe.android;

import com.stripe.android.EphemeralOperation;
import com.stripe.android.IssuingCardPinService;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.networking.StripeRepository;
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
@DebugMetadata(m28419c = "com.stripe.android.IssuingCardPinService$fireUpdatePinRequest$1", m28418f = "IssuingCardPinService.kt", m28417i = {}, m28416l = {234, 246, 251}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes6.dex */
public final class IssuingCardPinService$fireUpdatePinRequest$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ EphemeralKey $ephemeralKey;
    final /* synthetic */ IssuingCardPinService.IssuingCardPinUpdateListener $listener;
    final /* synthetic */ EphemeralOperation.Issuing.UpdatePin $operation;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ IssuingCardPinService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IssuingCardPinService$fireUpdatePinRequest$1(IssuingCardPinService issuingCardPinService, EphemeralOperation.Issuing.UpdatePin updatePin, EphemeralKey ephemeralKey, IssuingCardPinService.IssuingCardPinUpdateListener issuingCardPinUpdateListener, Continuation<? super IssuingCardPinService$fireUpdatePinRequest$1> continuation) {
        super(2, continuation);
        this.this$0 = issuingCardPinService;
        this.$operation = updatePin;
        this.$ephemeralKey = ephemeralKey;
        this.$listener = issuingCardPinUpdateListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IssuingCardPinService$fireUpdatePinRequest$1 issuingCardPinService$fireUpdatePinRequest$1 = new IssuingCardPinService$fireUpdatePinRequest$1(this.this$0, this.$operation, this.$ephemeralKey, this.$listener, continuation);
        issuingCardPinService$fireUpdatePinRequest$1.L$0 = obj;
        return issuingCardPinService$fireUpdatePinRequest$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((IssuingCardPinService$fireUpdatePinRequest$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        Object m116783constructorimpl;
        Object onUpdatePinError;
        StripeRepository stripeRepository;
        String str;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            ZC0 zc0 = (ZC0) this.L$0;
            IssuingCardPinService issuingCardPinService = this.this$0;
            EphemeralOperation.Issuing.UpdatePin updatePin = this.$operation;
            EphemeralKey ephemeralKey = this.$ephemeralKey;
            Result.Companion companion2 = Result.Companion;
            stripeRepository = issuingCardPinService.stripeRepository;
            String cardId = updatePin.getCardId();
            String newPin = updatePin.getNewPin();
            String verificationId = updatePin.getVerificationId();
            String userOneTimeCode = updatePin.getUserOneTimeCode();
            String secret = ephemeralKey.getSecret();
            str = issuingCardPinService.stripeAccountId;
            ApiRequest.Options options = new ApiRequest.Options(secret, str, null, 4, null);
            this.label = 1;
            if (stripeRepository.updateIssuingCardPin$payments_core_release(cardId, newPin, verificationId, userOneTimeCode, options, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        m116783constructorimpl = Result.m116783constructorimpl(Unit.INSTANCE);
        IssuingCardPinService.IssuingCardPinUpdateListener issuingCardPinUpdateListener = this.$listener;
        IssuingCardPinService issuingCardPinService2 = this.this$0;
        Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
        if (m116786exceptionOrNullimpl == null) {
            Unit unit = (Unit) m116783constructorimpl;
            AbstractC46765pG2 m84376c = T41.m84376c();
            IssuingCardPinService$fireUpdatePinRequest$1$2$1 issuingCardPinService$fireUpdatePinRequest$1$2$1 = new IssuingCardPinService$fireUpdatePinRequest$1$2$1(issuingCardPinUpdateListener, null);
            this.label = 2;
            if (X30.m77504g(m84376c, issuingCardPinService$fireUpdatePinRequest$1$2$1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            this.label = 3;
            onUpdatePinError = issuingCardPinService2.onUpdatePinError(m116786exceptionOrNullimpl, issuingCardPinUpdateListener, this);
            if (onUpdatePinError == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
