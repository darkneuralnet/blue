package com.stripe.android.paymentsheet.injection;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.core.injection.Injectable;
import com.stripe.android.core.injection.NonFallbackInjector;
import com.stripe.android.p049ui.core.forms.resources.injection.ResourceRepositoryModule;
import com.stripe.android.payments.core.injection.NamedConstantsKt;
import com.stripe.android.payments.core.injection.StripeRepositoryModule;
import com.stripe.android.paymentsheet.PaymentOptionsViewModel;
import com.stripe.android.paymentsheet.forms.FormViewModel;
import dagger.BindsInstance;
import dagger.Component;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Component(modules = {StripeRepositoryModule.class, PaymentSheetCommonModule.class, PaymentOptionsViewModelModule.class, CoroutineContextModule.class, CoreCommonModule.class, ResourceRepositoryModule.class})
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u00002\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\tH&¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/injection/PaymentOptionsViewModelFactoryComponent;", "Lcom/stripe/android/core/injection/NonFallbackInjector;", "()V", "inject", "", "injectable", "Lcom/stripe/android/core/injection/Injectable;", "factory", "Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$Factory;", "Lcom/stripe/android/paymentsheet/forms/FormViewModel$Factory;", "Builder", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public abstract class PaymentOptionsViewModelFactoryComponent implements NonFallbackInjector {

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0018\u0010\u0006\u001a\u00020\u00002\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H'¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/injection/PaymentOptionsViewModelFactoryComponent$Builder;", "", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/stripe/android/paymentsheet/injection/PaymentOptionsViewModelFactoryComponent;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", NamedConstantsKt.PRODUCT_USAGE, "", "", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @Component.Builder
    /* loaded from: classes7.dex */
    public interface Builder {
        PaymentOptionsViewModelFactoryComponent build();

        @BindsInstance
        Builder context(Context context);

        @BindsInstance
        Builder productUsage(Set<String> set);
    }

    @Override // com.stripe.android.core.injection.Injector
    public void inject(Injectable<?> injectable) {
        Intrinsics.checkNotNullParameter(injectable, "injectable");
        if (injectable instanceof PaymentOptionsViewModel.Factory) {
            inject((PaymentOptionsViewModel.Factory) injectable);
        } else if (injectable instanceof FormViewModel.Factory) {
            inject((FormViewModel.Factory) injectable);
        } else {
            throw new IllegalArgumentException("invalid Injectable " + injectable + " requested in " + this);
        }
    }

    public abstract void inject(PaymentOptionsViewModel.Factory factory);

    public abstract void inject(FormViewModel.Factory factory);
}
