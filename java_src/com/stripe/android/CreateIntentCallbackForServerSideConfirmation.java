package com.stripe.android;

import com.stripe.android.CreateIntentCallback;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bç\u0080\u0001\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/CreateIntentCallbackForServerSideConfirmation;", "Lcom/stripe/android/AbsCreateIntentCallback;", "onCreateIntent", "Lcom/stripe/android/CreateIntentCallback$Result;", "paymentMethodId", "", "shouldSavePaymentMethod", "", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public interface CreateIntentCallbackForServerSideConfirmation extends AbsCreateIntentCallback {
    Object onCreateIntent(String str, boolean z, Continuation<? super CreateIntentCallback.Result> continuation);
}
