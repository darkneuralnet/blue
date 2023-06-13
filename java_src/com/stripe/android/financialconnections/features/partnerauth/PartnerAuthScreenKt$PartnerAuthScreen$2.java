package com.stripe.android.financialconnections.features.partnerauth;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthScreenKt$PartnerAuthScreen$2", m28418f = "PartnerAuthScreen.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class PartnerAuthScreenKt$PartnerAuthScreen$2 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ PartnerAuthViewModel $viewModel;
    final /* synthetic */ InterfaceC48627sP5<AbstractC19862dp<String>> $webAuthFlow;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PartnerAuthScreenKt$PartnerAuthScreen$2(PartnerAuthViewModel partnerAuthViewModel, InterfaceC48627sP5<? extends AbstractC19862dp<String>> interfaceC48627sP5, Continuation<? super PartnerAuthScreenKt$PartnerAuthScreen$2> continuation) {
        super(2, continuation);
        this.$viewModel = partnerAuthViewModel;
        this.$webAuthFlow = interfaceC48627sP5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PartnerAuthScreenKt$PartnerAuthScreen$2(this.$viewModel, this.$webAuthFlow, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((PartnerAuthScreenKt$PartnerAuthScreen$2) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.$viewModel.onWebAuthFlowFinished(this.$webAuthFlow.getValue());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
