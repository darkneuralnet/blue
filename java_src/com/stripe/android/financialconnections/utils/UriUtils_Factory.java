package com.stripe.android.financialconnections.utils;

import com.stripe.android.core.Logger;
/* loaded from: classes7.dex */
public final class UriUtils_Factory implements InterfaceC48812sj1<UriUtils> {
    private final Y94<Logger> loggerProvider;

    public UriUtils_Factory(Y94<Logger> y94) {
        this.loggerProvider = y94;
    }

    public static UriUtils_Factory create(Y94<Logger> y94) {
        return new UriUtils_Factory(y94);
    }

    public static UriUtils newInstance(Logger logger) {
        return new UriUtils(logger);
    }

    @Override // p000.Y94
    public UriUtils get() {
        return newInstance(this.loggerProvider.get());
    }
}
