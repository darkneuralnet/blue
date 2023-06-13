package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import com.stripe.android.stripe3ds2.observability.DefaultErrorReporter;
import com.stripe.android.stripe3ds2.observability.Stripe3ds2ErrorReporterConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/stripe3ds2/observability/DefaultErrorReporter;", "invoke"}, m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ChallengeActivity$errorReporter$2 extends Lambda implements Function0<DefaultErrorReporter> {
    final /* synthetic */ ChallengeActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeActivity$errorReporter$2(ChallengeActivity challengeActivity) {
        super(0);
        this.this$0 = challengeActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final DefaultErrorReporter invoke() {
        ChallengeViewArgs viewArgs;
        Context applicationContext = this.this$0.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        viewArgs = this.this$0.getViewArgs();
        return new DefaultErrorReporter(applicationContext, new Stripe3ds2ErrorReporterConfig(viewArgs.getSdkTransactionId$3ds2sdk_release()), null, null, null, null, null, 0, 252, null);
    }
}
