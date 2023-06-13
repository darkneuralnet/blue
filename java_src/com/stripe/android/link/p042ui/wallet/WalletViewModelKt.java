package com.stripe.android.link.p042ui.wallet;

import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.p049ui.core.FieldValuesToParamsMapConverter;
import com.stripe.android.p049ui.core.elements.CardDetailsElementKt;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, m28432d2 = {"toPaymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "Lcom/stripe/android/link/ui/wallet/WalletUiState;", "link_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.wallet.WalletViewModelKt */
/* loaded from: classes7.dex */
public final class WalletViewModelKt {
    public static final PaymentMethodCreateParams toPaymentMethodCreateParams(WalletUiState walletUiState) {
        return FieldValuesToParamsMapConverter.Companion.transformToPaymentMethodCreateParams(CardDetailsElementKt.createExpiryDateFormFieldValues(walletUiState.getExpiryDateInput()), PaymentMethod.Type.Card.code, false);
    }
}
