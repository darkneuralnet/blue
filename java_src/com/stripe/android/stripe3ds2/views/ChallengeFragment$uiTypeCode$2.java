package com.stripe.android.stripe3ds2.views;

import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import com.stripe.android.stripe3ds2.transactions.UiType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ChallengeFragment$uiTypeCode$2 extends Lambda implements Function0<String> {
    final /* synthetic */ ChallengeFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeFragment$uiTypeCode$2(ChallengeFragment challengeFragment) {
        super(0);
        this.this$0 = challengeFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        ChallengeResponseData challengeResponseData;
        challengeResponseData = this.this$0.cresData;
        if (challengeResponseData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
            challengeResponseData = null;
        }
        UiType uiType = challengeResponseData.getUiType();
        String code = uiType != null ? uiType.getCode() : null;
        return code == null ? "" : code;
    }
}
