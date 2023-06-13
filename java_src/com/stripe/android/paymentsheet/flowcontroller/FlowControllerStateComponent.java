package com.stripe.android.paymentsheet.flowcontroller;

import android.content.Context;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.googlepaylauncher.injection.GooglePayLauncherModule;
import com.stripe.android.p049ui.core.forms.resources.injection.ResourceRepositoryModule;
import com.stripe.android.payments.core.injection.StripeRepositoryModule;
import com.stripe.android.paymentsheet.PaymentOptionsViewModel;
import com.stripe.android.paymentsheet.flowcontroller.FlowControllerComponent;
import com.stripe.android.paymentsheet.forms.FormViewModel;
import com.stripe.android.paymentsheet.injection.PaymentSheetCommonModule;
import dagger.BindsInstance;
import dagger.Component;
import kotlin.Metadata;
@Component(modules = {StripeRepositoryModule.class, PaymentSheetCommonModule.class, FlowControllerModule.class, GooglePayLauncherModule.class, CoroutineContextModule.class, CoreCommonModule.class, ResourceRepositoryModule.class})
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\fJ\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\r"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;", "", "flowControllerComponentBuilder", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerComponent$Builder;", "getFlowControllerComponentBuilder", "()Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerComponent$Builder;", "inject", "", "paymentOptionsViewModel", "Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$Factory;", "factory", "Lcom/stripe/android/paymentsheet/forms/FormViewModel$Factory;", "Builder", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public interface FlowControllerStateComponent {

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH'¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent$Builder;", "", "appContext", "Landroid/content/Context;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;", "flowControllerViewModel", "viewModel", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @Component.Builder
    /* loaded from: classes7.dex */
    public interface Builder {
        @BindsInstance
        Builder appContext(Context context);

        FlowControllerStateComponent build();

        @BindsInstance
        Builder flowControllerViewModel(FlowControllerViewModel flowControllerViewModel);
    }

    FlowControllerComponent.Builder getFlowControllerComponentBuilder();

    void inject(PaymentOptionsViewModel.Factory factory);

    void inject(FormViewModel.Factory factory);
}
