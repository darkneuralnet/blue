package com.stripe.android.payments;

import androidx.lifecycle.C11759u;
import com.stripe.android.payments.StripeBrowserLauncherViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Landroidx/lifecycle/u$b;", "invoke", "()Landroidx/lifecycle/u$b;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class StripeBrowserLauncherActivity$viewModel$2 extends Lambda implements Function0<C11759u.InterfaceC11763b> {
    public static final StripeBrowserLauncherActivity$viewModel$2 INSTANCE = new StripeBrowserLauncherActivity$viewModel$2();

    public StripeBrowserLauncherActivity$viewModel$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C11759u.InterfaceC11763b invoke() {
        return new StripeBrowserLauncherViewModel.Factory();
    }
}
