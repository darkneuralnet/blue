package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.model.ClientSecret;
import com.stripe.android.paymentsheet.model.PaymentIntentClientSecret;
import com.stripe.android.paymentsheet.model.SetupIntentClientSecret;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/paymentsheet/model/ClientSecret;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class USBankAccountFormFragment$clientSecret$2 extends Lambda implements Function0<ClientSecret> {
    final /* synthetic */ USBankAccountFormFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USBankAccountFormFragment$clientSecret$2(USBankAccountFormFragment uSBankAccountFormFragment) {
        super(0);
        this.this$0 = uSBankAccountFormFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ClientSecret invoke() {
        BaseSheetViewModel sheetViewModel;
        InterfaceC49220tP5<StripeIntent> stripeIntent$paymentsheet_release;
        sheetViewModel = this.this$0.getSheetViewModel();
        StripeIntent value = (sheetViewModel == null || (stripeIntent$paymentsheet_release = sheetViewModel.getStripeIntent$paymentsheet_release()) == null) ? null : stripeIntent$paymentsheet_release.getValue();
        if (value instanceof PaymentIntent) {
            String clientSecret = ((PaymentIntent) value).getClientSecret();
            Intrinsics.checkNotNull(clientSecret);
            return new PaymentIntentClientSecret(clientSecret);
        } else if (value instanceof SetupIntent) {
            String clientSecret2 = ((SetupIntent) value).getClientSecret();
            Intrinsics.checkNotNull(clientSecret2);
            return new SetupIntentClientSecret(clientSecret2);
        } else {
            return null;
        }
    }
}
