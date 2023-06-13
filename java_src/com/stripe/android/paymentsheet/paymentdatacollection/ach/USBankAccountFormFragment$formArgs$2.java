package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import androidx.fragment.app.FragmentActivity;
import com.stripe.android.paymentsheet.p047ui.BaseSheetActivity;
import com.stripe.android.paymentsheet.paymentdatacollection.FormArguments;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class USBankAccountFormFragment$formArgs$2 extends Lambda implements Function0<FormArguments> {
    final /* synthetic */ USBankAccountFormFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USBankAccountFormFragment$formArgs$2(USBankAccountFormFragment uSBankAccountFormFragment) {
        super(0);
        this.this$0 = uSBankAccountFormFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final FormArguments invoke() {
        FragmentActivity requireActivity = this.this$0.requireActivity();
        Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type com.stripe.android.paymentsheet.ui.BaseSheetActivity<*>");
        FormArguments formArgs = ((BaseSheetActivity) requireActivity).getFormArgs();
        if (formArgs != null) {
            return formArgs;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
