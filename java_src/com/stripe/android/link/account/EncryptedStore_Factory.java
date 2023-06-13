package com.stripe.android.link.account;

import android.content.Context;
/* loaded from: classes7.dex */
public final class EncryptedStore_Factory implements InterfaceC48812sj1<EncryptedStore> {
    private final Y94<Context> contextProvider;

    public EncryptedStore_Factory(Y94<Context> y94) {
        this.contextProvider = y94;
    }

    public static EncryptedStore_Factory create(Y94<Context> y94) {
        return new EncryptedStore_Factory(y94);
    }

    public static EncryptedStore newInstance(Context context) {
        return new EncryptedStore(context);
    }

    @Override // p000.Y94
    public EncryptedStore get() {
        return newInstance(this.contextProvider.get());
    }
}
