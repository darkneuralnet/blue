package com.stripe.android.stripe3ds2.views;

import com.stripe.android.stripe3ds2.init.p048ui.StripeUiCustomization;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import com.stripe.android.stripe3ds2.transactions.UiType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/stripe3ds2/views/ChallengeZoneTextView;", "invoke"}, m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ChallengeFragment$challengeZoneTextView$2 extends Lambda implements Function0<ChallengeZoneTextView> {
    final /* synthetic */ ChallengeFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeFragment$challengeZoneTextView$2(ChallengeFragment challengeFragment) {
        super(0);
        this.this$0 = challengeFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ChallengeZoneTextView invoke() {
        ChallengeResponseData challengeResponseData;
        ChallengeEntryViewFactory challengeEntryViewFactory;
        ChallengeResponseData challengeResponseData2;
        StripeUiCustomization stripeUiCustomization;
        challengeResponseData = this.this$0.cresData;
        ChallengeResponseData challengeResponseData3 = null;
        if (challengeResponseData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
            challengeResponseData = null;
        }
        if (challengeResponseData.getUiType() == UiType.Text) {
            challengeEntryViewFactory = this.this$0.getChallengeEntryViewFactory();
            challengeResponseData2 = this.this$0.cresData;
            if (challengeResponseData2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cresData");
            } else {
                challengeResponseData3 = challengeResponseData2;
            }
            stripeUiCustomization = this.this$0.uiCustomization;
            return challengeEntryViewFactory.createChallengeEntryTextView(challengeResponseData3, stripeUiCustomization);
        }
        return null;
    }
}
