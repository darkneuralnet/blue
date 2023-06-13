package com.stripe.android.payments.core.authentication;
/* loaded from: classes7.dex */
public final class OxxoAuthenticator_Factory implements InterfaceC48812sj1<OxxoAuthenticator> {
    private final Y94<NoOpIntentAuthenticator> noOpIntentAuthenticatorProvider;
    private final Y94<WebIntentAuthenticator> webIntentAuthenticatorProvider;

    public OxxoAuthenticator_Factory(Y94<WebIntentAuthenticator> y94, Y94<NoOpIntentAuthenticator> y942) {
        this.webIntentAuthenticatorProvider = y94;
        this.noOpIntentAuthenticatorProvider = y942;
    }

    public static OxxoAuthenticator_Factory create(Y94<WebIntentAuthenticator> y94, Y94<NoOpIntentAuthenticator> y942) {
        return new OxxoAuthenticator_Factory(y94, y942);
    }

    public static OxxoAuthenticator newInstance(WebIntentAuthenticator webIntentAuthenticator, NoOpIntentAuthenticator noOpIntentAuthenticator) {
        return new OxxoAuthenticator(webIntentAuthenticator, noOpIntentAuthenticator);
    }

    @Override // p000.Y94
    public OxxoAuthenticator get() {
        return newInstance(this.webIntentAuthenticatorProvider.get(), this.noOpIntentAuthenticatorProvider.get());
    }
}
