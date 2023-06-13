package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.SavedSelection;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PrefsRepository;", "", "getSavedSelection", "Lcom/stripe/android/paymentsheet/model/SavedSelection;", "isGooglePayAvailable", "", "isLinkAvailable", "(ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "savePaymentSelection", "", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public interface PrefsRepository {
    Object getSavedSelection(boolean z, boolean z2, Continuation<? super SavedSelection> continuation);

    void savePaymentSelection(PaymentSelection paymentSelection);
}
