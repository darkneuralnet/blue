package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import com.stripe.android.paymentsheet.PaymentSheetViewModel;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class USBankAccountFormFragment$completePayment$2 extends Lambda implements Function0<Boolean> {
    final /* synthetic */ USBankAccountFormFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USBankAccountFormFragment$completePayment$2(USBankAccountFormFragment uSBankAccountFormFragment) {
        super(0);
        this.this$0 = uSBankAccountFormFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        BaseSheetViewModel sheetViewModel;
        sheetViewModel = this.this$0.getSheetViewModel();
        return Boolean.valueOf(sheetViewModel instanceof PaymentSheetViewModel);
    }
}