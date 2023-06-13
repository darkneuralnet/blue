package com.stripe.android.view;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C11759u;
import com.stripe.android.view.FpxViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/view/FpxViewModel;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class AddPaymentMethodFpxView$viewModel$2 extends Lambda implements Function0<FpxViewModel> {
    final /* synthetic */ FragmentActivity $activity;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodFpxView$viewModel$2(FragmentActivity fragmentActivity) {
        super(0);
        this.$activity = fragmentActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final FpxViewModel invoke() {
        FragmentActivity fragmentActivity = this.$activity;
        Application application = this.$activity.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "activity.application");
        return (FpxViewModel) new C11759u(fragmentActivity, new FpxViewModel.Factory(application)).m66922a(FpxViewModel.class);
    }
}
