package com.braintreepayments.api.exceptions;

import java.io.IOException;
/* loaded from: classes2.dex */
public class BraintreeException extends IOException {
    public BraintreeException(String str, Throwable th) {
        super(str, th);
    }

    public BraintreeException(String str) {
        super(str);
    }

    public BraintreeException() {
    }
}
