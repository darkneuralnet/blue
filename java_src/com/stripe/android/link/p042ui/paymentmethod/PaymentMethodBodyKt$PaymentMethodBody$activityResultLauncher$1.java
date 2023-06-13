package com.stripe.android.link.p042ui.paymentmethod;

import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetLinkResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.paymentmethod.PaymentMethodBodyKt$PaymentMethodBody$activityResultLauncher$1 */
/* loaded from: classes7.dex */
public /* synthetic */ class PaymentMethodBodyKt$PaymentMethodBody$activityResultLauncher$1 extends FunctionReferenceImpl implements Function1<FinancialConnectionsSheetLinkResult, Unit> {
    public PaymentMethodBodyKt$PaymentMethodBody$activityResultLauncher$1(Object obj) {
        super(1, obj, PaymentMethodViewModel.class, "onFinancialConnectionsAccountLinked", "onFinancialConnectionsAccountLinked(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLinkResult;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FinancialConnectionsSheetLinkResult financialConnectionsSheetLinkResult) {
        invoke2(financialConnectionsSheetLinkResult);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(FinancialConnectionsSheetLinkResult p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((PaymentMethodViewModel) this.receiver).onFinancialConnectionsAccountLinked(p0);
    }
}
