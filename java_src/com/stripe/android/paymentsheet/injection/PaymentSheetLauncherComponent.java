package com.stripe.android.paymentsheet.injection;

import android.app.Application;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.core.injection.Injectable;
import com.stripe.android.core.injection.InjectorKey;
import com.stripe.android.core.injection.NonFallbackInjector;
import com.stripe.android.googlepaylauncher.injection.GooglePayLauncherModule;
import com.stripe.android.p049ui.core.forms.resources.injection.ResourceRepositoryModule;
import com.stripe.android.payments.core.injection.StripeRepositoryModule;
import com.stripe.android.paymentsheet.PaymentSheetViewModel;
import com.stripe.android.paymentsheet.forms.FormViewModel;
import dagger.BindsInstance;
import dagger.Component;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Component(modules = {StripeRepositoryModule.class, PaymentSheetCommonModule.class, PaymentSheetLauncherModule.class, GooglePayLauncherModule.class, CoroutineContextModule.class, CoreCommonModule.class, ResourceRepositoryModule.class})
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u00002\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\tH&¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherComponent;", "Lcom/stripe/android/core/injection/NonFallbackInjector;", "()V", "inject", "", "injectable", "Lcom/stripe/android/core/injection/Injectable;", "factory", "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$Factory;", "Lcom/stripe/android/paymentsheet/forms/FormViewModel$Factory;", "Builder", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public abstract class PaymentSheetLauncherComponent implements NonFallbackInjector {

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00002\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherComponent$Builder;", "", "application", "Landroid/app/Application;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherComponent;", "injectorKey", "", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @Component.Builder
    /* loaded from: classes7.dex */
    public interface Builder {
        @BindsInstance
        Builder application(Application application);

        PaymentSheetLauncherComponent build();

        @BindsInstance
        Builder injectorKey(@InjectorKey String str);
    }

    @Override // com.stripe.android.core.injection.Injector
    public void inject(Injectable<?> injectable) {
        Intrinsics.checkNotNullParameter(injectable, "injectable");
        if (injectable instanceof PaymentSheetViewModel.Factory) {
            inject((PaymentSheetViewModel.Factory) injectable);
        } else if (injectable instanceof FormViewModel.Factory) {
            inject((FormViewModel.Factory) injectable);
        } else {
            throw new IllegalArgumentException("invalid Injectable " + injectable + " requested in " + this);
        }
    }

    public abstract void inject(PaymentSheetViewModel.Factory factory);

    public abstract void inject(FormViewModel.Factory factory);
}
