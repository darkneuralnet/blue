package com.stripe.android.paymentsheet.flowcontroller;

import com.stripe.android.paymentsheet.PaymentSheet;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController$configure$1", m28418f = "DefaultFlowController.kt", m28417i = {}, m28416l = {211}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class DefaultFlowController$configure$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ PaymentSheet.FlowController.ConfigCallback $callback;
    final /* synthetic */ PaymentSheet.Configuration $configuration;
    final /* synthetic */ PaymentSheet.InitializationMode $mode;
    int label;
    final /* synthetic */ DefaultFlowController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFlowController$configure$1(DefaultFlowController defaultFlowController, PaymentSheet.InitializationMode initializationMode, PaymentSheet.Configuration configuration, PaymentSheet.FlowController.ConfigCallback configCallback, Continuation<? super DefaultFlowController$configure$1> continuation) {
        super(2, continuation);
        this.this$0 = defaultFlowController;
        this.$mode = initializationMode;
        this.$configuration = configuration;
        this.$callback = configCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefaultFlowController$configure$1(this.this$0, this.$mode, this.$configuration, this.$callback, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((DefaultFlowController$configure$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        FlowControllerConfigurationHandler flowControllerConfigurationHandler;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            flowControllerConfigurationHandler = this.this$0.configurationHandler;
            PaymentSheet.InitializationMode initializationMode = this.$mode;
            PaymentSheet.Configuration configuration = this.$configuration;
            PaymentSheet.FlowController.ConfigCallback configCallback = this.$callback;
            this.label = 1;
            if (flowControllerConfigurationHandler.configure(initializationMode, configuration, configCallback, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
