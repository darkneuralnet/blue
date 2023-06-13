package com.stripe.android.financialconnections.features.consent;

import com.stripe.android.financialconnections.features.consent.ConsentState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.features.consent.ConsentScreenKt$ConsentScreen$2$1", m28418f = "ConsentScreen.kt", m28417i = {}, m28416l = {101}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class ConsentScreenKt$ConsentScreen$2$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ GU2 $bottomSheetState;
    final /* synthetic */ InterfaceC32366Df6 $uriHandler;
    final /* synthetic */ ConsentState.ViewEffect $viewEffect;
    final /* synthetic */ ConsentViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsentScreenKt$ConsentScreen$2$1(ConsentState.ViewEffect viewEffect, InterfaceC32366Df6 interfaceC32366Df6, GU2 gu2, ConsentViewModel consentViewModel, Continuation<? super ConsentScreenKt$ConsentScreen$2$1> continuation) {
        super(2, continuation);
        this.$viewEffect = viewEffect;
        this.$uriHandler = interfaceC32366Df6;
        this.$bottomSheetState = gu2;
        this.$viewModel = consentViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConsentScreenKt$ConsentScreen$2$1(this.$viewEffect, this.$uriHandler, this.$bottomSheetState, this.$viewModel, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((ConsentScreenKt$ConsentScreen$2$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            ConsentState.ViewEffect viewEffect = this.$viewEffect;
            if (viewEffect instanceof ConsentState.ViewEffect.OpenUrl) {
                this.$uriHandler.openUri(((ConsentState.ViewEffect.OpenUrl) viewEffect).getUrl());
            } else if (viewEffect instanceof ConsentState.ViewEffect.OpenBottomSheet) {
                GU2 gu2 = this.$bottomSheetState;
                this.label = 1;
                if (gu2.m105057m(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        this.$viewModel.onViewEffectLaunched();
        return Unit.INSTANCE;
    }
}
