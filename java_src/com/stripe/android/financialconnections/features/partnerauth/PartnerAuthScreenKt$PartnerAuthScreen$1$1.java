package com.stripe.android.financialconnections.features.partnerauth;

import com.stripe.android.financialconnections.features.partnerauth.PartnerAuthState;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthScreenKt$PartnerAuthScreen$1$1", m28418f = "PartnerAuthScreen.kt", m28417i = {}, m28416l = {118}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class PartnerAuthScreenKt$PartnerAuthScreen$1$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ FinancialConnectionsSheetNativeViewModel $activityViewModel;
    final /* synthetic */ GU2 $bottomSheetState;
    final /* synthetic */ InterfaceC32366Df6 $uriHandler;
    final /* synthetic */ PartnerAuthState.ViewEffect $viewEffect;
    final /* synthetic */ PartnerAuthViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerAuthScreenKt$PartnerAuthScreen$1$1(PartnerAuthState.ViewEffect viewEffect, GU2 gu2, InterfaceC32366Df6 interfaceC32366Df6, FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel, PartnerAuthViewModel partnerAuthViewModel, Continuation<? super PartnerAuthScreenKt$PartnerAuthScreen$1$1> continuation) {
        super(2, continuation);
        this.$viewEffect = viewEffect;
        this.$bottomSheetState = gu2;
        this.$uriHandler = interfaceC32366Df6;
        this.$activityViewModel = financialConnectionsSheetNativeViewModel;
        this.$viewModel = partnerAuthViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PartnerAuthScreenKt$PartnerAuthScreen$1$1(this.$viewEffect, this.$bottomSheetState, this.$uriHandler, this.$activityViewModel, this.$viewModel, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((PartnerAuthScreenKt$PartnerAuthScreen$1$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
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
            PartnerAuthState.ViewEffect viewEffect = this.$viewEffect;
            if (viewEffect instanceof PartnerAuthState.ViewEffect.OpenBottomSheet) {
                GU2 gu2 = this.$bottomSheetState;
                this.label = 1;
                if (gu2.m105057m(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (viewEffect instanceof PartnerAuthState.ViewEffect.OpenUrl) {
                this.$uriHandler.openUri(((PartnerAuthState.ViewEffect.OpenUrl) viewEffect).getUrl());
            } else if (viewEffect instanceof PartnerAuthState.ViewEffect.OpenPartnerAuth) {
                this.$activityViewModel.openPartnerAuthFlowInBrowser(((PartnerAuthState.ViewEffect.OpenPartnerAuth) viewEffect).getUrl());
                this.$viewModel.onViewEffectLaunched();
            }
        }
        return Unit.INSTANCE;
    }
}
