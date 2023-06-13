package com.stripe.android.link.p042ui.verification;

import com.stripe.android.link.p042ui.ErrorMessage;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/link/ui/verification/VerificationViewState;", "it", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.verification.VerificationViewModel$onError$1$1 */
/* loaded from: classes7.dex */
public final class VerificationViewModel$onError$1$1 extends Lambda implements Function1<VerificationViewState, VerificationViewState> {
    final /* synthetic */ ErrorMessage $message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationViewModel$onError$1$1(ErrorMessage errorMessage) {
        super(1);
        this.$message = errorMessage;
    }

    @Override // kotlin.jvm.functions.Function1
    public final VerificationViewState invoke(VerificationViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return VerificationViewState.copy$default(it, false, false, this.$message, false, false, 26, null);
    }
}
