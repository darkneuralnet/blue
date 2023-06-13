package com.stripe.android.link.p042ui.paymentmethod;

import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetLinkResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.link.ui.paymentmethod.PaymentMethodBodyKt$PaymentMethodBody$1$1", m28418f = "PaymentMethodBody.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* renamed from: com.stripe.android.link.ui.paymentmethod.PaymentMethodBodyKt$PaymentMethodBody$1$1 */
/* loaded from: classes7.dex */
public final class PaymentMethodBodyKt$PaymentMethodBody$1$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ TH2<FinancialConnectionsSheetActivityArgs.ForLink, FinancialConnectionsSheetLinkResult> $activityResultLauncher;
    final /* synthetic */ String $secret;
    final /* synthetic */ PaymentMethodViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodBodyKt$PaymentMethodBody$1$1(TH2<FinancialConnectionsSheetActivityArgs.ForLink, FinancialConnectionsSheetLinkResult> th2, String str, PaymentMethodViewModel paymentMethodViewModel, Continuation<? super PaymentMethodBodyKt$PaymentMethodBody$1$1> continuation) {
        super(2, continuation);
        this.$activityResultLauncher = th2;
        this.$secret = str;
        this.$viewModel = paymentMethodViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PaymentMethodBodyKt$PaymentMethodBody$1$1(this.$activityResultLauncher, this.$secret, this.$viewModel, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((PaymentMethodBodyKt$PaymentMethodBody$1$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.$activityResultLauncher.m114705a(new FinancialConnectionsSheetActivityArgs.ForLink(new FinancialConnectionsSheet.Configuration(this.$secret, this.$viewModel.getPublishableKey(), null, 4, null)));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
