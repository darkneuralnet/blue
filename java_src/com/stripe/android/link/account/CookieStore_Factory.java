package com.stripe.android.link.account;
/* loaded from: classes7.dex */
public final class CookieStore_Factory implements InterfaceC48812sj1<CookieStore> {
    private final Y94<EncryptedStore> storeProvider;

    public CookieStore_Factory(Y94<EncryptedStore> y94) {
        this.storeProvider = y94;
    }

    public static CookieStore_Factory create(Y94<EncryptedStore> y94) {
        return new CookieStore_Factory(y94);
    }

    public static CookieStore newInstance(EncryptedStore encryptedStore) {
        return new CookieStore(encryptedStore);
    }

    @Override // p000.Y94
    public CookieStore get() {
        return newInstance(this.storeProvider.get());
    }
}
