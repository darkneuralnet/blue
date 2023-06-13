package com.stripe.android;

import com.stripe.android.PaymentSession;
import com.stripe.android.PaymentSessionViewModel;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/PaymentSessionViewModel$FetchCustomerResult;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public final class PaymentSession$fetchCustomer$1 extends Lambda implements Function1<PaymentSessionViewModel.FetchCustomerResult, Unit> {
    final /* synthetic */ PaymentSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSession$fetchCustomer$1(PaymentSession paymentSession) {
        super(1);
        this.this$0 = paymentSession;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PaymentSessionViewModel.FetchCustomerResult fetchCustomerResult) {
        invoke2(fetchCustomerResult);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(PaymentSessionViewModel.FetchCustomerResult fetchCustomerResult) {
        PaymentSession.PaymentSessionListener listener$payments_core_release;
        if (!(fetchCustomerResult instanceof PaymentSessionViewModel.FetchCustomerResult.Error) || (listener$payments_core_release = this.this$0.getListener$payments_core_release()) == null) {
            return;
        }
        PaymentSessionViewModel.FetchCustomerResult.Error error = (PaymentSessionViewModel.FetchCustomerResult.Error) fetchCustomerResult;
        listener$payments_core_release.onError(error.getErrorCode(), error.getErrorMessage());
    }
}
