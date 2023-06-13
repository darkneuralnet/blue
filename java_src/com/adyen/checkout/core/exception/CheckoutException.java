package com.adyen.checkout.core.exception;
/* loaded from: classes.dex */
public class CheckoutException extends RuntimeException {
    private static final long serialVersionUID = -2465223452079546925L;

    public CheckoutException(String str) {
        this(str, null);
    }

    public CheckoutException(String str, Throwable th) {
        super(str, th);
    }
}
