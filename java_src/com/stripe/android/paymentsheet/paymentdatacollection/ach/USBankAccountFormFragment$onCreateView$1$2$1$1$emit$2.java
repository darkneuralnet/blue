package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import com.stripe.android.paymentsheet.p047ui.PrimaryButton;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;", "it", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class USBankAccountFormFragment$onCreateView$1$2$1$1$emit$2 extends Lambda implements Function1<PrimaryButton.UIState, PrimaryButton.UIState> {
    final /* synthetic */ boolean $hasRequiredFields;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USBankAccountFormFragment$onCreateView$1$2$1$1$emit$2(boolean z) {
        super(1);
        this.$hasRequiredFields = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final PrimaryButton.UIState invoke(PrimaryButton.UIState uIState) {
        if (uIState != null) {
            return PrimaryButton.UIState.copy$default(uIState, null, null, this.$hasRequiredFields, false, 11, null);
        }
        return null;
    }
}
