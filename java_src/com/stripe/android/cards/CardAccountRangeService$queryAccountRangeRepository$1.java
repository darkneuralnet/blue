package com.stripe.android.cards;

import com.stripe.android.cards.CardNumber;
import com.stripe.android.model.AccountRange;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.cards.CardAccountRangeService$queryAccountRangeRepository$1", m28418f = "CardAccountRangeService.kt", m28417i = {}, m28416l = {61, 66}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes6.dex */
public final class CardAccountRangeService$queryAccountRangeRepository$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ CardNumber.Unvalidated $cardNumber;
    int label;
    final /* synthetic */ CardAccountRangeService this$0;

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.stripe.android.cards.CardAccountRangeService$queryAccountRangeRepository$1$1", m28418f = "CardAccountRangeService.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.stripe.android.cards.CardAccountRangeService$queryAccountRangeRepository$1$1 */
    /* loaded from: classes6.dex */
    public static final class C186131 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
        final /* synthetic */ AccountRange $accountRange;
        int label;
        final /* synthetic */ CardAccountRangeService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C186131(CardAccountRangeService cardAccountRangeService, AccountRange accountRange, Continuation<? super C186131> continuation) {
            super(2, continuation);
            this.this$0 = cardAccountRangeService;
            this.$accountRange = accountRange;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C186131(this.this$0, this.$accountRange, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C186131) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.updateAccountRangeResult(this.$accountRange);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardAccountRangeService$queryAccountRangeRepository$1(CardNumber.Unvalidated unvalidated, CardAccountRangeService cardAccountRangeService, Continuation<? super CardAccountRangeService$queryAccountRangeRepository$1> continuation) {
        super(2, continuation);
        this.$cardNumber = unvalidated;
        this.this$0 = cardAccountRangeService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CardAccountRangeService$queryAccountRangeRepository$1(this.$cardNumber, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((CardAccountRangeService$queryAccountRangeRepository$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        AccountRange accountRange;
        CardAccountRangeRepository cardAccountRangeRepository;
        AbstractC46765pG2 m84376c;
        C186131 c186131;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            if (this.$cardNumber.getBin() != null) {
                cardAccountRangeRepository = this.this$0.cardAccountRangeRepository;
                CardNumber.Unvalidated unvalidated = this.$cardNumber;
                this.label = 1;
                obj = cardAccountRangeRepository.getAccountRange(unvalidated, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                accountRange = null;
                m84376c = T41.m84376c();
                c186131 = new C186131(this.this$0, accountRange, null);
                this.label = 2;
                if (X30.m77504g(m84376c, c186131, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        accountRange = (AccountRange) obj;
        m84376c = T41.m84376c();
        c186131 = new C186131(this.this$0, accountRange, null);
        this.label = 2;
        if (X30.m77504g(m84376c, c186131, this) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }
}
