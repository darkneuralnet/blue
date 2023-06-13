package com.stripe.android.paymentsheet.flowcontroller;

import com.stripe.android.model.ElementsSessionParams;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.state.PaymentSheetLoader;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.flowcontroller.FlowControllerConfigurationHandler$dispatchResult$2", m28418f = "FlowControllerConfigurationHandler.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class FlowControllerConfigurationHandler$dispatchResult$2 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ PaymentSheet.FlowController.ConfigCallback $callback;
    final /* synthetic */ ElementsSessionParams $elementsSessionParams;
    final /* synthetic */ PaymentSheetLoader.Result $result;
    int label;
    final /* synthetic */ FlowControllerConfigurationHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowControllerConfigurationHandler$dispatchResult$2(PaymentSheetLoader.Result result, FlowControllerConfigurationHandler flowControllerConfigurationHandler, ElementsSessionParams elementsSessionParams, PaymentSheet.FlowController.ConfigCallback configCallback, Continuation<? super FlowControllerConfigurationHandler$dispatchResult$2> continuation) {
        super(2, continuation);
        this.$result = result;
        this.this$0 = flowControllerConfigurationHandler;
        this.$elementsSessionParams = elementsSessionParams;
        this.$callback = configCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FlowControllerConfigurationHandler$dispatchResult$2(this.$result, this.this$0, this.$elementsSessionParams, this.$callback, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((FlowControllerConfigurationHandler$dispatchResult$2) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowControllerViewModel flowControllerViewModel;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            PaymentSheetLoader.Result result = this.$result;
            if (result instanceof PaymentSheetLoader.Result.Success) {
                flowControllerViewModel = this.this$0.viewModel;
                flowControllerViewModel.setPreviousElementsSessionParams(this.$elementsSessionParams);
                this.this$0.onInitSuccess(((PaymentSheetLoader.Result.Success) this.$result).getState(), this.$callback);
            } else if (result instanceof PaymentSheetLoader.Result.Failure) {
                this.$callback.onConfigured(false, ((PaymentSheetLoader.Result.Failure) result).getThrowable());
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
