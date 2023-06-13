package com.stripe.android.stripe3ds2.views;

import com.stripe.android.stripe3ds2.transaction.ChallengeResult;
import com.stripe.android.stripe3ds2.transactions.UiType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "isTimeout", "", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ChallengeActivity$onCreate$5 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ Ref.ObjectRef<String> $uiTypeCode;
    final /* synthetic */ ChallengeActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeActivity$onCreate$5(ChallengeActivity challengeActivity, Ref.ObjectRef<String> objectRef) {
        super(1);
        this.this$0 = challengeActivity;
        this.$uiTypeCode = objectRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke2(bool);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Boolean bool) {
        ChallengeViewArgs viewArgs;
        ChallengeViewArgs viewArgs2;
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            ChallengeActivityViewModel viewModel$3ds2sdk_release = this.this$0.getViewModel$3ds2sdk_release();
            viewArgs = this.this$0.getViewArgs();
            UiType uiType = viewArgs.getCresData$3ds2sdk_release().getUiType();
            viewArgs2 = this.this$0.getViewArgs();
            viewModel$3ds2sdk_release.onFinish(new ChallengeResult.Timeout(this.$uiTypeCode.element, uiType, viewArgs2.getIntentData$3ds2sdk_release()));
        }
    }
}
