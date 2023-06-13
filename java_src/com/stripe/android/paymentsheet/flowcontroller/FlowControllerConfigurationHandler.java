package com.stripe.android.paymentsheet.flowcontroller;

import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.core.injection.UIContext;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.model.ElementsSessionParams;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PaymentSheetConfigurationKtxKt;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.repositories.ElementsSessionRepositoryKt;
import com.stripe.android.paymentsheet.state.PaymentSheetLoader;
import com.stripe.android.paymentsheet.state.PaymentSheetState;
import java.security.InvalidParameterException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ+\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J)\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;", "", "paymentSheetLoader", "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader;", "uiContext", "Lkotlin/coroutines/CoroutineContext;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "viewModel", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;", "(Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;)V", "configure", "", "initializationMode", "Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;", "configuration", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "callback", "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;", "(Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchResult", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result;", "elementsSessionParams", "Lcom/stripe/android/model/ElementsSessionParams;", "(Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result;Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;Lcom/stripe/android/model/ElementsSessionParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onInitSuccess", TransferTable.COLUMN_STATE, "Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nFlowControllerConfigurationHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowControllerConfigurationHandler.kt\ncom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,83:1\n329#2:84\n*S KotlinDebug\n*F\n+ 1 FlowControllerConfigurationHandler.kt\ncom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler\n*L\n47#1:84\n*E\n"})
/* loaded from: classes7.dex */
public final class FlowControllerConfigurationHandler {
    private final EventReporter eventReporter;
    private final PaymentSheetLoader paymentSheetLoader;
    private final CoroutineContext uiContext;
    private final FlowControllerViewModel viewModel;

    public FlowControllerConfigurationHandler(PaymentSheetLoader paymentSheetLoader, @UIContext CoroutineContext uiContext, EventReporter eventReporter, FlowControllerViewModel viewModel) {
        Intrinsics.checkNotNullParameter(paymentSheetLoader, "paymentSheetLoader");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(eventReporter, "eventReporter");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.paymentSheetLoader = paymentSheetLoader;
        this.uiContext = uiContext;
        this.eventReporter = eventReporter;
        this.viewModel = viewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object dispatchResult(PaymentSheetLoader.Result result, PaymentSheet.FlowController.ConfigCallback configCallback, ElementsSessionParams elementsSessionParams, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object m77504g = X30.m77504g(this.uiContext, new FlowControllerConfigurationHandler$dispatchResult$2(result, this, elementsSessionParams, configCallback, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m77504g == coroutine_suspended ? m77504g : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onInitSuccess(PaymentSheetState.Full full, PaymentSheet.FlowController.ConfigCallback configCallback) {
        this.eventReporter.onInit(full.getConfig());
        this.viewModel.setPaymentSelection(full.getInitialPaymentSelection());
        this.viewModel.setState(full);
        configCallback.onConfigured(true, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object configure(PaymentSheet.InitializationMode initializationMode, PaymentSheet.Configuration configuration, PaymentSheet.FlowController.ConfigCallback configCallback, Continuation<? super Unit> continuation) {
        FlowControllerConfigurationHandler$configure$1 flowControllerConfigurationHandler$configure$1;
        Object coroutine_suspended;
        int i;
        ElementsSessionParams elementsSessionParams;
        Object load;
        FlowControllerConfigurationHandler flowControllerConfigurationHandler;
        if (continuation instanceof FlowControllerConfigurationHandler$configure$1) {
            flowControllerConfigurationHandler$configure$1 = (FlowControllerConfigurationHandler$configure$1) continuation;
            int i2 = flowControllerConfigurationHandler$configure$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowControllerConfigurationHandler$configure$1.label = i2 - Integer.MIN_VALUE;
                Object obj = flowControllerConfigurationHandler$configure$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowControllerConfigurationHandler$configure$1.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    configCallback = (PaymentSheet.FlowController.ConfigCallback) flowControllerConfigurationHandler$configure$1.L$2;
                    flowControllerConfigurationHandler = (FlowControllerConfigurationHandler) flowControllerConfigurationHandler$configure$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    elementsSessionParams = (ElementsSessionParams) flowControllerConfigurationHandler$configure$1.L$3;
                    initializationMode = (PaymentSheet.InitializationMode) flowControllerConfigurationHandler$configure$1.L$1;
                    load = obj;
                } else {
                    ResultKt.throwOnFailure(obj);
                    try {
                        initializationMode.validate$paymentsheet_release();
                        if (configuration != null) {
                            PaymentSheetConfigurationKtxKt.validate(configuration);
                        }
                        elementsSessionParams = ElementsSessionRepositoryKt.toElementsSessionParams(initializationMode, configuration);
                        if (Intrinsics.areEqual(elementsSessionParams, this.viewModel.getPreviousElementsSessionParams())) {
                            configCallback.onConfigured(true, null);
                            return Unit.INSTANCE;
                        }
                        PaymentSheetLoader paymentSheetLoader = this.paymentSheetLoader;
                        flowControllerConfigurationHandler$configure$1.L$0 = this;
                        flowControllerConfigurationHandler$configure$1.L$1 = initializationMode;
                        flowControllerConfigurationHandler$configure$1.L$2 = configCallback;
                        flowControllerConfigurationHandler$configure$1.L$3 = elementsSessionParams;
                        flowControllerConfigurationHandler$configure$1.label = 1;
                        load = paymentSheetLoader.load(initializationMode, configuration, flowControllerConfigurationHandler$configure$1);
                        if (load == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        flowControllerConfigurationHandler = this;
                    } catch (InvalidParameterException e) {
                        configCallback.onConfigured(false, e);
                        return Unit.INSTANCE;
                    }
                }
                PaymentSheetLoader.Result result = (PaymentSheetLoader.Result) load;
                if (!C34018Kh2.m98497o(flowControllerConfigurationHandler$configure$1.getContext())) {
                    flowControllerConfigurationHandler.viewModel.setInitializationMode(initializationMode);
                    flowControllerConfigurationHandler$configure$1.L$0 = null;
                    flowControllerConfigurationHandler$configure$1.L$1 = null;
                    flowControllerConfigurationHandler$configure$1.L$2 = null;
                    flowControllerConfigurationHandler$configure$1.L$3 = null;
                    flowControllerConfigurationHandler$configure$1.label = 2;
                    if (flowControllerConfigurationHandler.dispatchResult(result, configCallback, elementsSessionParams, flowControllerConfigurationHandler$configure$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                configCallback.onConfigured(false, null);
                return Unit.INSTANCE;
            }
        }
        flowControllerConfigurationHandler$configure$1 = new FlowControllerConfigurationHandler$configure$1(this, continuation);
        Object obj2 = flowControllerConfigurationHandler$configure$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowControllerConfigurationHandler$configure$1.label;
        if (i == 0) {
        }
        PaymentSheetLoader.Result result2 = (PaymentSheetLoader.Result) load;
        if (!C34018Kh2.m98497o(flowControllerConfigurationHandler$configure$1.getContext())) {
        }
    }
}
