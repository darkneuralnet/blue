package com.stripe.android.link.p042ui.wallet;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.link.ui.wallet.WalletScreenKt$WalletBody$13", m28418f = "WalletScreen.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* renamed from: com.stripe.android.link.ui.wallet.WalletScreenKt$WalletBody$13 */
/* loaded from: classes7.dex */
public final class WalletScreenKt$WalletBody$13 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC32037Bv1 $focusManager;
    final /* synthetic */ WalletUiState $uiState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletScreenKt$WalletBody$13(WalletUiState walletUiState, InterfaceC32037Bv1 interfaceC32037Bv1, Continuation<? super WalletScreenKt$WalletBody$13> continuation) {
        super(2, continuation);
        this.$uiState = walletUiState;
        this.$focusManager = interfaceC32037Bv1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletScreenKt$WalletBody$13(this.$uiState, this.$focusManager, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((WalletScreenKt$WalletBody$13) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$uiState.isProcessing()) {
                InterfaceC32037Bv1.m113331e(this.$focusManager, false, 1, null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}