package com.stripe.android.view;

import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.model.ShippingMethod;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lkotlin/Result;", "", "Lcom/stripe/android/model/ShippingMethod;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PaymentFlowActivity$validateShippingInformation$1 extends Lambda implements Function1<Result<? extends List<? extends ShippingMethod>>, Unit> {
    final /* synthetic */ PaymentFlowActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentFlowActivity$validateShippingInformation$1(PaymentFlowActivity paymentFlowActivity) {
        super(1);
        this.this$0 = paymentFlowActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Result<? extends List<? extends ShippingMethod>> result) {
        invoke2(result);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Result<? extends List<? extends ShippingMethod>> result) {
        Intrinsics.checkNotNullExpressionValue(result, "result");
        Object m116792unboximpl = result.m116792unboximpl();
        PaymentFlowActivity paymentFlowActivity = this.this$0;
        Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116792unboximpl);
        if (m116786exceptionOrNullimpl == null) {
            paymentFlowActivity.onShippingInfoValidated((List) m116792unboximpl);
        } else {
            paymentFlowActivity.onShippingInfoError(m116786exceptionOrNullimpl);
        }
    }
}