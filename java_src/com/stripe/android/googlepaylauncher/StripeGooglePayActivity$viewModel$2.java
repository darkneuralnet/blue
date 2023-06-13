package com.stripe.android.googlepaylauncher;

import android.app.Application;
import androidx.lifecycle.C11759u;
import com.stripe.android.googlepaylauncher.StripeGooglePayContract;
import com.stripe.android.googlepaylauncher.StripeGooglePayViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Landroidx/lifecycle/u$b;", "invoke", "()Landroidx/lifecycle/u$b;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class StripeGooglePayActivity$viewModel$2 extends Lambda implements Function0<C11759u.InterfaceC11763b> {
    final /* synthetic */ StripeGooglePayActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeGooglePayActivity$viewModel$2(StripeGooglePayActivity stripeGooglePayActivity) {
        super(0);
        this.this$0 = stripeGooglePayActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C11759u.InterfaceC11763b invoke() {
        String publishableKey;
        String stripeAccountId;
        StripeGooglePayContract.Args args;
        Application application = this.this$0.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        publishableKey = this.this$0.getPublishableKey();
        stripeAccountId = this.this$0.getStripeAccountId();
        args = this.this$0.args;
        if (args == null) {
            Intrinsics.throwUninitializedPropertyAccessException("args");
            args = null;
        }
        return new StripeGooglePayViewModel.Factory(application, publishableKey, stripeAccountId, args);
    }
}
