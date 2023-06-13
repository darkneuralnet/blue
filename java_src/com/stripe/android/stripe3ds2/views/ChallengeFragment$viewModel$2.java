package com.stripe.android.stripe3ds2.views;

import androidx.lifecycle.C11759u;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler;
import com.stripe.android.stripe3ds2.transaction.TransactionTimer;
import com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Landroidx/lifecycle/u$b;", "invoke", "()Landroidx/lifecycle/u$b;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
/* loaded from: classes7.dex */
public final class ChallengeFragment$viewModel$2 extends Lambda implements Function0<C11759u.InterfaceC11763b> {
    final /* synthetic */ ChallengeFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeFragment$viewModel$2(ChallengeFragment challengeFragment) {
        super(0);
        this.this$0 = challengeFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C11759u.InterfaceC11763b invoke() {
        ChallengeActionHandler challengeActionHandler;
        TransactionTimer transactionTimer;
        ErrorReporter errorReporter;
        CoroutineContext coroutineContext;
        challengeActionHandler = this.this$0.challengeActionHandler;
        transactionTimer = this.this$0.transactionTimer;
        errorReporter = this.this$0.errorReporter;
        coroutineContext = this.this$0.workContext;
        return new ChallengeActivityViewModel.Factory(challengeActionHandler, transactionTimer, errorReporter, coroutineContext);
    }
}
