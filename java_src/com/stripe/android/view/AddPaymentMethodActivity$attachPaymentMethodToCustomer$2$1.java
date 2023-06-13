package com.stripe.android.view;

import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.model.PaymentMethod;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lkotlin/Result;", "Lcom/stripe/android/model/PaymentMethod;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class AddPaymentMethodActivity$attachPaymentMethodToCustomer$2$1 extends Lambda implements Function1<Result<? extends PaymentMethod>, Unit> {
    final /* synthetic */ AddPaymentMethodActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodActivity$attachPaymentMethodToCustomer$2$1(AddPaymentMethodActivity addPaymentMethodActivity) {
        super(1);
        this.this$0 = addPaymentMethodActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Result<? extends PaymentMethod> result) {
        invoke2(result);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Result<? extends PaymentMethod> result) {
        Intrinsics.checkNotNullExpressionValue(result, "result");
        Object m116792unboximpl = result.m116792unboximpl();
        AddPaymentMethodActivity addPaymentMethodActivity = this.this$0;
        Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116792unboximpl);
        if (m116786exceptionOrNullimpl == null) {
            addPaymentMethodActivity.finishWithPaymentMethod((PaymentMethod) m116792unboximpl);
            return;
        }
        addPaymentMethodActivity.setProgressBarVisible(false);
        String message = m116786exceptionOrNullimpl.getMessage();
        if (message == null) {
            message = "";
        }
        addPaymentMethodActivity.showError(message);
    }
}
