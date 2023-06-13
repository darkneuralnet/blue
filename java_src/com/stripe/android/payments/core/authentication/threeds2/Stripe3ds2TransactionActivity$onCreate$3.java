package com.stripe.android.payments.core.authentication.threeds2;

import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.payments.core.authentication.threeds2.NextStep;
import com.stripe.android.stripe3ds2.transaction.ChallengeResult;
import com.stripe.android.stripe3ds2.transaction.InitChallengeArgs;
import com.stripe.android.stripe3ds2.transaction.InitChallengeResult;
import com.stripe.android.stripe3ds2.views.ChallengeViewArgs;
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
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity$onCreate$3", m28418f = "Stripe3ds2TransactionActivity.kt", m28417i = {}, m28416l = {103, 107}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class Stripe3ds2TransactionActivity$onCreate$3 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractC0407B5<PaymentBrowserAuthContract.Args> $browserLauncher;
    final /* synthetic */ AbstractC0407B5<ChallengeViewArgs> $challengeLauncher;
    final /* synthetic */ Function1<ChallengeResult, InterfaceC52943zh2> $onChallengeResult;
    final /* synthetic */ Lazy<Stripe3ds2TransactionViewModel> $viewModel$delegate;
    int label;
    final /* synthetic */ Stripe3ds2TransactionActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Stripe3ds2TransactionActivity$onCreate$3(Stripe3ds2TransactionActivity stripe3ds2TransactionActivity, AbstractC0407B5<ChallengeViewArgs> abstractC0407B5, Function1<? super ChallengeResult, ? extends InterfaceC52943zh2> function1, AbstractC0407B5<PaymentBrowserAuthContract.Args> abstractC0407B52, Lazy<Stripe3ds2TransactionViewModel> lazy, Continuation<? super Stripe3ds2TransactionActivity$onCreate$3> continuation) {
        super(2, continuation);
        this.this$0 = stripe3ds2TransactionActivity;
        this.$challengeLauncher = abstractC0407B5;
        this.$onChallengeResult = function1;
        this.$browserLauncher = abstractC0407B52;
        this.$viewModel$delegate = lazy;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Stripe3ds2TransactionActivity$onCreate$3(this.this$0, this.$challengeLauncher, this.$onChallengeResult, this.$browserLauncher, this.$viewModel$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((Stripe3ds2TransactionActivity$onCreate$3) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        Stripe3ds2TransactionViewModel onCreate$lambda$6;
        Stripe3ds2TransactionViewModel onCreate$lambda$62;
        InitChallengeResult initChallengeResult;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    initChallengeResult = (InitChallengeResult) obj;
                    if (!(initChallengeResult instanceof InitChallengeResult.Start)) {
                        this.$challengeLauncher.m114705a(((InitChallengeResult.Start) initChallengeResult).getChallengeViewArgs());
                    } else if (initChallengeResult instanceof InitChallengeResult.End) {
                        this.$onChallengeResult.invoke(((InitChallengeResult.End) initChallengeResult).getChallengeResult());
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            if (!this.this$0.isFinishing()) {
                onCreate$lambda$6 = Stripe3ds2TransactionActivity.onCreate$lambda$6(this.$viewModel$delegate);
                this.label = 1;
                obj = onCreate$lambda$6.start3ds2Flow(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        NextStep nextStep = (NextStep) obj;
        if (nextStep instanceof NextStep.StartChallenge) {
            onCreate$lambda$62 = Stripe3ds2TransactionActivity.onCreate$lambda$6(this.$viewModel$delegate);
            InitChallengeArgs args = ((NextStep.StartChallenge) nextStep).getArgs();
            this.label = 2;
            obj = onCreate$lambda$62.initChallenge(args, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            initChallengeResult = (InitChallengeResult) obj;
            if (!(initChallengeResult instanceof InitChallengeResult.Start)) {
            }
            return Unit.INSTANCE;
        }
        if (nextStep instanceof NextStep.StartFallback) {
            this.$browserLauncher.m114705a(((NextStep.StartFallback) nextStep).getArgs());
        } else if (nextStep instanceof NextStep.Complete) {
            this.this$0.finishWithResult(((NextStep.Complete) nextStep).getResult());
        }
        return Unit.INSTANCE;
    }
}
