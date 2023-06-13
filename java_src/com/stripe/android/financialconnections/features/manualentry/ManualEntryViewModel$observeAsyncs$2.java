package com.stripe.android.financialconnections.features.manualentry;

import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.features.manualentry.ManualEntryState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState$Payload;", "payload", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel$observeAsyncs$2", m28418f = "ManualEntryViewModel.kt", m28417i = {}, m28416l = {88}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class ManualEntryViewModel$observeAsyncs$2 extends SuspendLambda implements Function2<ManualEntryState.Payload, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ManualEntryViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManualEntryViewModel$observeAsyncs$2(ManualEntryViewModel manualEntryViewModel, Continuation<? super ManualEntryViewModel$observeAsyncs$2> continuation) {
        super(2, continuation);
        this.this$0 = manualEntryViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ManualEntryViewModel$observeAsyncs$2 manualEntryViewModel$observeAsyncs$2 = new ManualEntryViewModel$observeAsyncs$2(this.this$0, continuation);
        manualEntryViewModel$observeAsyncs$2.L$0 = obj;
        return manualEntryViewModel$observeAsyncs$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ManualEntryState.Payload payload, Continuation<? super Unit> continuation) {
        return ((ManualEntryViewModel$observeAsyncs$2) create(payload, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        NativeAuthFlowCoordinator nativeAuthFlowCoordinator;
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
            if (((ManualEntryState.Payload) this.L$0).getCustomManualEntry()) {
                nativeAuthFlowCoordinator = this.this$0.nativeAuthFlowCoordinator;
                BX2<NativeAuthFlowCoordinator.Message> invoke = nativeAuthFlowCoordinator.invoke();
                NativeAuthFlowCoordinator.Message.Terminate terminate = new NativeAuthFlowCoordinator.Message.Terminate(NativeAuthFlowCoordinator.Message.Terminate.EarlyTerminationCause.USER_INITIATED_WITH_CUSTOM_MANUAL_ENTRY);
                this.label = 1;
                if (invoke.emit(terminate, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
