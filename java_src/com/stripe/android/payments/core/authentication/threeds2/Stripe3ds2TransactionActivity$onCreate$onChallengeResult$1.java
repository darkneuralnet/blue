package com.stripe.android.payments.core.authentication.threeds2;

import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.stripe3ds2.transaction.ChallengeResult;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;", "challengeResult", "Lzh2;", "invoke", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;)Lzh2;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class Stripe3ds2TransactionActivity$onCreate$onChallengeResult$1 extends Lambda implements Function1<ChallengeResult, InterfaceC52943zh2> {
    final /* synthetic */ Lazy<Stripe3ds2TransactionViewModel> $viewModel$delegate;
    final /* synthetic */ Stripe3ds2TransactionActivity this$0;

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity$onCreate$onChallengeResult$1$1", m28418f = "Stripe3ds2TransactionActivity.kt", m28417i = {}, m28416l = {83}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity$onCreate$onChallengeResult$1$1 */
    /* loaded from: classes7.dex */
    public static final class C191171 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
        final /* synthetic */ ChallengeResult $challengeResult;
        final /* synthetic */ Lazy<Stripe3ds2TransactionViewModel> $viewModel$delegate;
        Object L$0;
        int label;
        final /* synthetic */ Stripe3ds2TransactionActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C191171(Stripe3ds2TransactionActivity stripe3ds2TransactionActivity, ChallengeResult challengeResult, Lazy<Stripe3ds2TransactionViewModel> lazy, Continuation<? super C191171> continuation) {
            super(2, continuation);
            this.this$0 = stripe3ds2TransactionActivity;
            this.$challengeResult = challengeResult;
            this.$viewModel$delegate = lazy;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C191171(this.this$0, this.$challengeResult, this.$viewModel$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C191171) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            Stripe3ds2TransactionViewModel onCreate$lambda$6;
            Stripe3ds2TransactionActivity stripe3ds2TransactionActivity;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    stripe3ds2TransactionActivity = (Stripe3ds2TransactionActivity) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Stripe3ds2TransactionActivity stripe3ds2TransactionActivity2 = this.this$0;
                onCreate$lambda$6 = Stripe3ds2TransactionActivity.onCreate$lambda$6(this.$viewModel$delegate);
                ChallengeResult challengeResult = this.$challengeResult;
                this.L$0 = stripe3ds2TransactionActivity2;
                this.label = 1;
                Object processChallengeResult = onCreate$lambda$6.processChallengeResult(challengeResult, this);
                if (processChallengeResult == coroutine_suspended) {
                    return coroutine_suspended;
                }
                stripe3ds2TransactionActivity = stripe3ds2TransactionActivity2;
                obj = processChallengeResult;
            }
            stripe3ds2TransactionActivity.finishWithResult((PaymentFlowResult.Unvalidated) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Stripe3ds2TransactionActivity$onCreate$onChallengeResult$1(Stripe3ds2TransactionActivity stripe3ds2TransactionActivity, Lazy<Stripe3ds2TransactionViewModel> lazy) {
        super(1);
        this.this$0 = stripe3ds2TransactionActivity;
        this.$viewModel$delegate = lazy;
    }

    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC52943zh2 invoke(ChallengeResult challengeResult) {
        InterfaceC52943zh2 m73800d;
        Intrinsics.checkNotNullParameter(challengeResult, "challengeResult");
        m73800d = Z30.m73800d(C33163Gq2.m104689a(this.this$0), null, null, new C191171(this.this$0, challengeResult, this.$viewModel$delegate, null), 3, null);
        return m73800d;
    }
}
