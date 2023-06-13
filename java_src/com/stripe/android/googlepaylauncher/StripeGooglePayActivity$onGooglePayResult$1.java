package com.stripe.android.googlepaylauncher;

import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.googlepaylauncher.GooglePayLauncherResult;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.ShippingInformation;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lkotlin/Result;", "Lcom/stripe/android/model/PaymentMethod;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class StripeGooglePayActivity$onGooglePayResult$1 extends Lambda implements Function1<Result<? extends PaymentMethod>, Unit> {
    final /* synthetic */ ShippingInformation $shippingInformation;
    final /* synthetic */ StripeGooglePayActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeGooglePayActivity$onGooglePayResult$1(StripeGooglePayActivity stripeGooglePayActivity, ShippingInformation shippingInformation) {
        super(1);
        this.this$0 = stripeGooglePayActivity;
        this.$shippingInformation = shippingInformation;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Result<? extends PaymentMethod> result) {
        invoke2(result);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Result<? extends PaymentMethod> result) {
        StripeGooglePayViewModel viewModel;
        StripeGooglePayViewModel viewModel2;
        if (result != null) {
            Object m116792unboximpl = result.m116792unboximpl();
            StripeGooglePayActivity stripeGooglePayActivity = this.this$0;
            ShippingInformation shippingInformation = this.$shippingInformation;
            Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116792unboximpl);
            if (m116786exceptionOrNullimpl == null) {
                stripeGooglePayActivity.onPaymentMethodCreated((PaymentMethod) m116792unboximpl, shippingInformation);
                return;
            }
            viewModel = stripeGooglePayActivity.getViewModel();
            viewModel.setPaymentMethod(null);
            viewModel2 = stripeGooglePayActivity.getViewModel();
            viewModel2.updateGooglePayResult(new GooglePayLauncherResult.Error(m116786exceptionOrNullimpl, null, null, null, 14, null));
        }
    }
}
