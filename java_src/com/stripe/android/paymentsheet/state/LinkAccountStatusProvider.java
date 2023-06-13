package com.stripe.android.paymentsheet.state;

import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.link.model.AccountStatus;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bà\u0080\u0001\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦Bø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;", "", "invoke", "Lcom/stripe/android/link/model/AccountStatus;", "configuration", "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;", "(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public interface LinkAccountStatusProvider {
    Object invoke(LinkPaymentLauncher.Configuration configuration, Continuation<? super AccountStatus> continuation);
}
