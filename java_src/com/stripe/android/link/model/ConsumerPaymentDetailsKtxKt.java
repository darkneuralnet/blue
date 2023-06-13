package com.stripe.android.link.model;

import com.stripe.android.link.C18975R;
import com.stripe.android.model.ConsumerPaymentDetails;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0018\u0010\t\u001a\u00020\u0001*\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, m28432d2 = {"icon", "", "Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;", "getIcon", "(Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;)I", "removeConfirmation", "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "getRemoveConfirmation", "(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)I", "removeLabel", "getRemoveLabel", "link_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ConsumerPaymentDetailsKtxKt {
    public static final int getIcon(ConsumerPaymentDetails.BankAccount bankAccount) {
        Intrinsics.checkNotNullParameter(bankAccount, "<this>");
        return C18975R.C18976drawable.ic_link_bank;
    }

    public static final int getRemoveConfirmation(ConsumerPaymentDetails.PaymentDetails paymentDetails) {
        Intrinsics.checkNotNullParameter(paymentDetails, "<this>");
        if (paymentDetails instanceof ConsumerPaymentDetails.Card) {
            return C18975R.string.wallet_remove_card_confirmation;
        }
        if (paymentDetails instanceof ConsumerPaymentDetails.BankAccount) {
            return C18975R.string.wallet_remove_account_confirmation;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int getRemoveLabel(ConsumerPaymentDetails.PaymentDetails paymentDetails) {
        Intrinsics.checkNotNullParameter(paymentDetails, "<this>");
        if (paymentDetails instanceof ConsumerPaymentDetails.Card) {
            return C18975R.string.wallet_remove_card;
        }
        if (paymentDetails instanceof ConsumerPaymentDetails.BankAccount) {
            return C18975R.string.wallet_remove_linked_account;
        }
        throw new NoWhenBranchMatchedException();
    }
}
