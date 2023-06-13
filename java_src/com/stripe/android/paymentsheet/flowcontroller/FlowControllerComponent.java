package com.stripe.android.paymentsheet.flowcontroller;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.stripe.android.core.injection.InjectorKey;
import com.stripe.android.paymentsheet.PaymentOptionCallback;
import com.stripe.android.paymentsheet.PaymentSheetResultCallback;
import dagger.BindsInstance;
import dagger.Subcomponent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
@FlowControllerScope
@Subcomponent
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\nR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerComponent;", "", "flowController", "Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;", "getFlowController", "()Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;", "stateComponent", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;", "getStateComponent", "()Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;", "Builder", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public interface FlowControllerComponent {

    @Subcomponent.Builder
    @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H'J\u0018\u0010\t\u001a\u00020\u00002\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H'J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH'J\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH'J\u0012\u0010\u000f\u001a\u00020\u00002\b\b\u0001\u0010\u000f\u001a\u00020\u000eH'J\b\u0010\u0011\u001a\u00020\u0010H&¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerComponent$Builder;", "", "LLifecycleOwner;", "lifecycleOwner", "lifeCycleOwner", "Lu5;", "activityResultCaller", "Lkotlin/Function0;", "", "statusBarColor", "Lcom/stripe/android/paymentsheet/PaymentOptionCallback;", "paymentOptionCallback", "Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;", "paymentResultCallback", "", "injectorKey", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerComponent;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public interface Builder {
        @BindsInstance
        Builder activityResultCaller(InterfaceC29050u5 interfaceC29050u5);

        FlowControllerComponent build();

        @BindsInstance
        Builder injectorKey(@InjectorKey String str);

        @BindsInstance
        Builder lifeCycleOwner(LifecycleOwner lifecycleOwner);

        @BindsInstance
        Builder paymentOptionCallback(PaymentOptionCallback paymentOptionCallback);

        @BindsInstance
        Builder paymentResultCallback(PaymentSheetResultCallback paymentSheetResultCallback);

        @BindsInstance
        Builder statusBarColor(Function0<Integer> function0);
    }

    DefaultFlowController getFlowController();

    FlowControllerStateComponent getStateComponent();
}
