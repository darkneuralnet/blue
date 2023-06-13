package com.stripe.android.stripe3ds2.transaction;

import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.stripe3ds2.views.ChallengeActivity;
import com.stripe.android.stripe3ds2.views.ChallengeViewArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u001a\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeContract;", "Lv5;", "Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "input", "Landroid/content/Intent;", "createIntent", "", "resultCode", "intent", "parseResult", "<init>", "()V", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* loaded from: classes7.dex */
public final class ChallengeContract extends AbstractC29414v5<ChallengeViewArgs, ChallengeResult> {
    @Override // p000.AbstractC29414v5
    public Intent createIntent(Context context, ChallengeViewArgs input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent putExtras = new Intent(context, ChallengeActivity.class).putExtras(input.toBundle());
        Intrinsics.checkNotNullExpressionValue(putExtras, "Intent(context, Challeng…tExtras(input.toBundle())");
        return putExtras;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.AbstractC29414v5
    public ChallengeResult parseResult(int i, Intent intent) {
        return ChallengeResult.Companion.fromIntent(intent);
    }
}
