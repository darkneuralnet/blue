package com.stripe.android;

import com.stripe.android.IssuingCardPinService;
import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.InvalidRequestException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.IssuingCardPinService$onRetrievePinError$2", m28418f = "IssuingCardPinService.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes6.dex */
public final class IssuingCardPinService$onRetrievePinError$2 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ IssuingCardPinService.IssuingCardPinRetrievalListener $listener;
    final /* synthetic */ Throwable $throwable;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IssuingCardPinService$onRetrievePinError$2(Throwable th, IssuingCardPinService.IssuingCardPinRetrievalListener issuingCardPinRetrievalListener, Continuation<? super IssuingCardPinService$onRetrievePinError$2> continuation) {
        super(2, continuation);
        this.$throwable = th;
        this.$listener = issuingCardPinRetrievalListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IssuingCardPinService$onRetrievePinError$2(this.$throwable, this.$listener, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((IssuingCardPinService$onRetrievePinError$2) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Throwable th = this.$throwable;
            if (th instanceof InvalidRequestException) {
                StripeError stripeError = ((InvalidRequestException) th).getStripeError();
                if (stripeError != null) {
                    str = stripeError.getCode();
                } else {
                    str = null;
                }
                if (str != null) {
                    switch (str.hashCode()) {
                        case -1309235419:
                            if (str.equals("expired")) {
                                this.$listener.onError(IssuingCardPinService.CardPinActionError.ONE_TIME_CODE_EXPIRED, "The one-time code has expired", null);
                                break;
                            }
                            break;
                        case -1266028985:
                            if (str.equals("incorrect_code")) {
                                this.$listener.onError(IssuingCardPinService.CardPinActionError.ONE_TIME_CODE_INCORRECT, "The one-time code was incorrect.", null);
                                break;
                            }
                            break;
                        case 830217595:
                            if (str.equals("too_many_attempts")) {
                                this.$listener.onError(IssuingCardPinService.CardPinActionError.ONE_TIME_CODE_TOO_MANY_ATTEMPTS, "The verification challenge was attempted too many times.", null);
                                break;
                            }
                            break;
                        case 1888170818:
                            if (str.equals("already_redeemed")) {
                                this.$listener.onError(IssuingCardPinService.CardPinActionError.ONE_TIME_CODE_ALREADY_REDEEMED, "The verification challenge was already redeemed.", null);
                                break;
                            }
                            break;
                    }
                }
                this.$listener.onError(IssuingCardPinService.CardPinActionError.UNKNOWN_ERROR, "The call to retrieve the PIN failed, possibly an error with the verification.", this.$throwable);
            } else {
                this.$listener.onError(IssuingCardPinService.CardPinActionError.UNKNOWN_ERROR, "An error occurred while retrieving the PIN.", th);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
