package com.stripe.android.googlepaylauncher.injection;

import androidx.lifecycle.C11747p;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel;
import dagger.BindsInstance;
import dagger.Subcomponent;
import kotlin.Metadata;
@Subcomponent
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherViewModelSubcomponent;", "", "viewModel", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherViewModel;", "getViewModel", "()Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherViewModel;", "Builder", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public interface GooglePayPaymentMethodLauncherViewModelSubcomponent {

    @Subcomponent.Builder
    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H'J\b\u0010\u0007\u001a\u00020\u0006H&¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherViewModelSubcomponent$Builder;", "", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args;", "args", "Landroidx/lifecycle/p;", "savedStateHandle", "Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherViewModelSubcomponent;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public interface Builder {
        @BindsInstance
        Builder args(GooglePayPaymentMethodLauncherContract.Args args);

        GooglePayPaymentMethodLauncherViewModelSubcomponent build();

        @BindsInstance
        Builder savedStateHandle(C11747p c11747p);
    }

    GooglePayPaymentMethodLauncherViewModel getViewModel();
}
