package com.stripe.android.payments.core.injection;

import android.content.Context;
import com.stripe.android.payments.DefaultReturnUrl;
/* loaded from: classes7.dex */
public final class AuthenticationModule_Companion_ProvideDefaultReturnUrlFactory implements InterfaceC48812sj1<DefaultReturnUrl> {
    private final Y94<Context> contextProvider;

    public AuthenticationModule_Companion_ProvideDefaultReturnUrlFactory(Y94<Context> y94) {
        this.contextProvider = y94;
    }

    public static AuthenticationModule_Companion_ProvideDefaultReturnUrlFactory create(Y94<Context> y94) {
        return new AuthenticationModule_Companion_ProvideDefaultReturnUrlFactory(y94);
    }

    public static DefaultReturnUrl provideDefaultReturnUrl(Context context) {
        return (DefaultReturnUrl) C51679xZ3.m5002e(AuthenticationModule.Companion.provideDefaultReturnUrl(context));
    }

    @Override // p000.Y94
    public DefaultReturnUrl get() {
        return provideDefaultReturnUrl(this.contextProvider.get());
    }
}
