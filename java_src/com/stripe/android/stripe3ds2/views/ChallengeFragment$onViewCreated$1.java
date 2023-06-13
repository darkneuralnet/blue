package com.stripe.android.stripe3ds2.views;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "challengeText", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ChallengeFragment$onViewCreated$1 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ ChallengeFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeFragment$onViewCreated$1(ChallengeFragment challengeFragment) {
        super(1);
        this.this$0 = challengeFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String challengeText) {
        ChallengeZoneTextView challengeZoneTextView$3ds2sdk_release = this.this$0.getChallengeZoneTextView$3ds2sdk_release();
        if (challengeZoneTextView$3ds2sdk_release != null) {
            Intrinsics.checkNotNullExpressionValue(challengeText, "challengeText");
            challengeZoneTextView$3ds2sdk_release.setText(challengeText);
        }
    }
}
