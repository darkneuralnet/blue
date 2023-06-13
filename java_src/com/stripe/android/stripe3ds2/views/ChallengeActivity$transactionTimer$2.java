package com.stripe.android.stripe3ds2.views;

import com.stripe.android.stripe3ds2.transaction.DefaultTransactionTimer;
import com.stripe.android.stripe3ds2.transaction.ErrorRequestExecutor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/stripe3ds2/transaction/DefaultTransactionTimer;", "invoke"}, m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ChallengeActivity$transactionTimer$2 extends Lambda implements Function0<DefaultTransactionTimer> {
    final /* synthetic */ ChallengeActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeActivity$transactionTimer$2(ChallengeActivity challengeActivity) {
        super(0);
        this.this$0 = challengeActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final DefaultTransactionTimer invoke() {
        ChallengeViewArgs viewArgs;
        ErrorRequestExecutor errorRequestExecutor;
        ChallengeViewArgs viewArgs2;
        viewArgs = this.this$0.getViewArgs();
        int timeoutMins$3ds2sdk_release = viewArgs.getTimeoutMins$3ds2sdk_release();
        errorRequestExecutor = this.this$0.getErrorRequestExecutor();
        viewArgs2 = this.this$0.getViewArgs();
        return new DefaultTransactionTimer(timeoutMins$3ds2sdk_release, errorRequestExecutor, viewArgs2.getCreqData$3ds2sdk_release());
    }
}
