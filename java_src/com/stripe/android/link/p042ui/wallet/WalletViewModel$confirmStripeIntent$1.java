package com.stripe.android.link.p042ui.wallet;

import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.payments.paymentlauncher.PaymentResult;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lkotlin/Result;", "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;", "invoke", "(Ljava/lang/Object;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.wallet.WalletViewModel$confirmStripeIntent$1 */
/* loaded from: classes7.dex */
public final class WalletViewModel$confirmStripeIntent$1 extends Lambda implements Function1<Result<? extends PaymentResult>, Unit> {
    final /* synthetic */ WalletViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletViewModel$confirmStripeIntent$1(WalletViewModel walletViewModel) {
        super(1);
        this.this$0 = walletViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Result<? extends PaymentResult> result) {
        m116574invoke(result.m116792unboximpl());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: collision with other method in class */
    public final void m116574invoke(Object obj) {
        WalletViewModel walletViewModel = this.this$0;
        Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(obj);
        if (m116786exceptionOrNullimpl != null) {
            walletViewModel.onError(m116786exceptionOrNullimpl);
        } else {
            walletViewModel.handleConfirmPaymentSuccess((PaymentResult) obj);
        }
    }
}
