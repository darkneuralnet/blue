package com.stripe.android.view;

import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.view.StripeEditText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/view/ErrorListener;", "Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", "textInputLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "(Lcom/google/android/material/textfield/TextInputLayout;)V", "displayErrorMessage", "", "message", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ErrorListener implements StripeEditText.ErrorMessageListener {
    private final TextInputLayout textInputLayout;

    public ErrorListener(TextInputLayout textInputLayout) {
        Intrinsics.checkNotNullParameter(textInputLayout, "textInputLayout");
        this.textInputLayout = textInputLayout;
    }

    @Override // com.stripe.android.view.StripeEditText.ErrorMessageListener
    public void displayErrorMessage(String str) {
        if (str == null) {
            this.textInputLayout.setError(null);
            this.textInputLayout.setErrorEnabled(false);
            return;
        }
        this.textInputLayout.setError(str);
    }
}
