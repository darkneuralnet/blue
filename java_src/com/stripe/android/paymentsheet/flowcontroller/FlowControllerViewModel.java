package com.stripe.android.paymentsheet.flowcontroller;

import android.app.Application;
import androidx.lifecycle.C11747p;
import com.stripe.android.model.ElementsSessionParams;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.state.PaymentSheetState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 *2\u00020\u0001:\u0001*B\u0017\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010%\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006+"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;", "Lie;", "Landroidx/lifecycle/p;", "handle", "Landroidx/lifecycle/p;", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;", "flowControllerStateComponent", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;", "getFlowControllerStateComponent", "()Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;", "Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;", "initializationMode", "Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;", "getInitializationMode", "()Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;", "setInitializationMode", "(Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;)V", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "getPaymentSelection", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "setPaymentSelection", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V", "Lcom/stripe/android/model/ElementsSessionParams;", "previousElementsSessionParams", "Lcom/stripe/android/model/ElementsSessionParams;", "getPreviousElementsSessionParams", "()Lcom/stripe/android/model/ElementsSessionParams;", "setPreviousElementsSessionParams", "(Lcom/stripe/android/model/ElementsSessionParams;)V", "Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;", "value", "getState", "()Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;", "setState", "(Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;)V", "state", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;Landroidx/lifecycle/p;)V", "Companion", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class FlowControllerViewModel extends C23294ie {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String STATE_KEY = "state";
    private final FlowControllerStateComponent flowControllerStateComponent;
    private final C11747p handle;
    private PaymentSheet.InitializationMode initializationMode;
    private PaymentSelection paymentSelection;
    private ElementsSessionParams previousElementsSessionParams;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel$Companion;", "", "()V", "STATE_KEY", "", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowControllerViewModel(Application application, C11747p handle) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(handle, "handle");
        this.handle = handle;
        this.flowControllerStateComponent = DaggerFlowControllerStateComponent.builder().appContext(application).flowControllerViewModel(this).build();
    }

    public final FlowControllerStateComponent getFlowControllerStateComponent() {
        return this.flowControllerStateComponent;
    }

    public final PaymentSheet.InitializationMode getInitializationMode() {
        return this.initializationMode;
    }

    public final PaymentSelection getPaymentSelection() {
        return this.paymentSelection;
    }

    public final ElementsSessionParams getPreviousElementsSessionParams() {
        return this.previousElementsSessionParams;
    }

    public final PaymentSheetState.Full getState() {
        return (PaymentSheetState.Full) this.handle.m66947f("state");
    }

    public final void setInitializationMode(PaymentSheet.InitializationMode initializationMode) {
        this.initializationMode = initializationMode;
    }

    public final void setPaymentSelection(PaymentSelection paymentSelection) {
        this.paymentSelection = paymentSelection;
    }

    public final void setPreviousElementsSessionParams(ElementsSessionParams elementsSessionParams) {
        this.previousElementsSessionParams = elementsSessionParams;
    }

    public final void setState(PaymentSheetState.Full full) {
        this.handle.m66940m("state", full);
    }
}
