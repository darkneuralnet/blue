package com.stripe.android.googlepaylauncher;

import androidx.lifecycle.C11759u;
import com.stripe.android.googlepaylauncher.GooglePayLauncherContract;
import com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Landroidx/lifecycle/u$b;", "invoke", "()Landroidx/lifecycle/u$b;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class GooglePayLauncherActivity$viewModel$2 extends Lambda implements Function0<C11759u.InterfaceC11763b> {
    final /* synthetic */ GooglePayLauncherActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayLauncherActivity$viewModel$2(GooglePayLauncherActivity googlePayLauncherActivity) {
        super(0);
        this.this$0 = googlePayLauncherActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C11759u.InterfaceC11763b invoke() {
        GooglePayLauncherContract.Args args;
        args = this.this$0.args;
        if (args == null) {
            Intrinsics.throwUninitializedPropertyAccessException("args");
            args = null;
        }
        return new GooglePayLauncherViewModel.Factory(args, false, null, 6, null);
    }
}
