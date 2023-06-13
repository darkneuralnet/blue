package com.stripe.android.stripe3ds2.views;

import android.app.Dialog;
import com.stripe.android.stripe3ds2.transaction.ChallengeAction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "challengeAction", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ChallengeActivity$onCreate$2 extends Lambda implements Function1<ChallengeAction, Unit> {
    final /* synthetic */ ChallengeActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeActivity$onCreate$2(ChallengeActivity challengeActivity) {
        super(1);
        this.this$0 = challengeActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ChallengeAction challengeAction) {
        invoke2(challengeAction);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ChallengeAction challengeAction) {
        ChallengeSubmitDialogFactory progressDialogFactory;
        if (this.this$0.isFinishing()) {
            return;
        }
        this.this$0.dismissKeyboard();
        ChallengeActivity challengeActivity = this.this$0;
        progressDialogFactory = challengeActivity.getProgressDialogFactory();
        Dialog create = progressDialogFactory.create();
        create.show();
        challengeActivity.progressDialog = create;
        ChallengeActivityViewModel viewModel$3ds2sdk_release = this.this$0.getViewModel$3ds2sdk_release();
        Intrinsics.checkNotNullExpressionValue(challengeAction, "challengeAction");
        viewModel$3ds2sdk_release.submit(challengeAction);
    }
}
