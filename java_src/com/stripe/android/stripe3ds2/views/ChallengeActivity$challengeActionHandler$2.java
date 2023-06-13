package com.stripe.android.stripe3ds2.views;

import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default;", "invoke"}, m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ChallengeActivity$challengeActionHandler$2 extends Lambda implements Function0<ChallengeActionHandler.Default> {
    final /* synthetic */ ChallengeActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeActivity$challengeActionHandler$2(ChallengeActivity challengeActivity) {
        super(0);
        this.this$0 = challengeActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ChallengeActionHandler.Default invoke() {
        ChallengeViewArgs viewArgs;
        ErrorReporter errorReporter;
        ChallengeViewArgs viewArgs2;
        SC0 sc0;
        viewArgs = this.this$0.getViewArgs();
        ChallengeRequestData creqData$3ds2sdk_release = viewArgs.getCreqData$3ds2sdk_release();
        errorReporter = this.this$0.getErrorReporter();
        viewArgs2 = this.this$0.getViewArgs();
        ChallengeRequestExecutor.Factory creqExecutorFactory$3ds2sdk_release = viewArgs2.getCreqExecutorFactory$3ds2sdk_release();
        sc0 = ChallengeActivity.WORK_CONTEXT;
        return new ChallengeActionHandler.Default(creqData$3ds2sdk_release, errorReporter, creqExecutorFactory$3ds2sdk_release, sc0);
    }
}
