package com.stripe.android.stripe3ds2.views;

import com.stripe.android.stripe3ds2.databinding.StripeChallengeSubmitDialogBinding;
import com.stripe.android.stripe3ds2.views.ChallengeSubmitDialogFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeSubmitDialogBinding;", "invoke"}, m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ChallengeSubmitDialogFactory$ChallengeSubmitDialog$viewBinding$2 extends Lambda implements Function0<StripeChallengeSubmitDialogBinding> {
    final /* synthetic */ ChallengeSubmitDialogFactory.ChallengeSubmitDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeSubmitDialogFactory$ChallengeSubmitDialog$viewBinding$2(ChallengeSubmitDialogFactory.ChallengeSubmitDialog challengeSubmitDialog) {
        super(0);
        this.this$0 = challengeSubmitDialog;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final StripeChallengeSubmitDialogBinding invoke() {
        StripeChallengeSubmitDialogBinding inflate = StripeChallengeSubmitDialogBinding.inflate(this.this$0.getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        return inflate;
    }
}
