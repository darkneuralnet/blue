package com.stripe.android.view;

import com.stripe.android.PaymentSessionConfig;
import com.stripe.android.model.ShippingMethod;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/view/PaymentFlowPagerAdapter;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PaymentFlowActivity$paymentFlowPagerAdapter$2 extends Lambda implements Function0<PaymentFlowPagerAdapter> {
    final /* synthetic */ PaymentFlowActivity this$0;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Lcom/stripe/android/model/ShippingMethod;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.view.PaymentFlowActivity$paymentFlowPagerAdapter$2$1 */
    /* loaded from: classes7.dex */
    public static final class C195181 extends Lambda implements Function1<ShippingMethod, Unit> {
        final /* synthetic */ PaymentFlowActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C195181(PaymentFlowActivity paymentFlowActivity) {
            super(1);
            this.this$0 = paymentFlowActivity;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ShippingMethod shippingMethod) {
            invoke2(shippingMethod);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(ShippingMethod it) {
            PaymentFlowViewModel viewModel;
            Intrinsics.checkNotNullParameter(it, "it");
            viewModel = this.this$0.getViewModel();
            viewModel.setSelectedShippingMethod$payments_core_release(it);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentFlowActivity$paymentFlowPagerAdapter$2(PaymentFlowActivity paymentFlowActivity) {
        super(0);
        this.this$0 = paymentFlowActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final PaymentFlowPagerAdapter invoke() {
        PaymentSessionConfig paymentSessionConfig;
        PaymentSessionConfig paymentSessionConfig2;
        PaymentFlowActivity paymentFlowActivity = this.this$0;
        paymentSessionConfig = paymentFlowActivity.getPaymentSessionConfig();
        paymentSessionConfig2 = this.this$0.getPaymentSessionConfig();
        return new PaymentFlowPagerAdapter(paymentFlowActivity, paymentSessionConfig, paymentSessionConfig2.getAllowedShippingCountryCodes(), new C195181(this.this$0));
    }
}
