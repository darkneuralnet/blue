package com.stripe.android.view;

import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.model.Customer;
import com.stripe.android.model.ShippingMethod;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lkotlin/Result;", "Lcom/stripe/android/model/Customer;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PaymentFlowActivity$onShippingInfoValidated$1$1 extends Lambda implements Function1<Result<? extends Customer>, Unit> {
    final /* synthetic */ List<ShippingMethod> $shippingMethods;
    final /* synthetic */ PaymentFlowActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentFlowActivity$onShippingInfoValidated$1$1(PaymentFlowActivity paymentFlowActivity, List<ShippingMethod> list) {
        super(1);
        this.this$0 = paymentFlowActivity;
        this.$shippingMethods = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Result<? extends Customer> result) {
        invoke2(result);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Result<? extends Customer> result) {
        Intrinsics.checkNotNullExpressionValue(result, "result");
        Object m116792unboximpl = result.m116792unboximpl();
        PaymentFlowActivity paymentFlowActivity = this.this$0;
        List<ShippingMethod> list = this.$shippingMethods;
        Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116792unboximpl);
        if (m116786exceptionOrNullimpl == null) {
            paymentFlowActivity.onShippingInfoSaved$payments_core_release(((Customer) m116792unboximpl).getShippingInformation(), list);
            return;
        }
        String message = m116786exceptionOrNullimpl.getMessage();
        if (message == null) {
            message = "";
        }
        paymentFlowActivity.showError(message);
    }
}
