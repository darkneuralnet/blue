package com.stripe.android.core.networking;

import com.stripe.android.core.networking.ApiRequest;
import kotlin.jvm.functions.Function0;
/* loaded from: classes6.dex */
public final class ApiRequest_Options_Factory implements InterfaceC48812sj1<ApiRequest.Options> {
    private final Y94<Function0<String>> publishableKeyProvider;
    private final Y94<Function0<String>> stripeAccountIdProvider;

    public ApiRequest_Options_Factory(Y94<Function0<String>> y94, Y94<Function0<String>> y942) {
        this.publishableKeyProvider = y94;
        this.stripeAccountIdProvider = y942;
    }

    public static ApiRequest_Options_Factory create(Y94<Function0<String>> y94, Y94<Function0<String>> y942) {
        return new ApiRequest_Options_Factory(y94, y942);
    }

    public static ApiRequest.Options newInstance(Function0<String> function0, Function0<String> function02) {
        return new ApiRequest.Options(function0, function02);
    }

    @Override // p000.Y94
    public ApiRequest.Options get() {
        return newInstance(this.publishableKeyProvider.get(), this.stripeAccountIdProvider.get());
    }
}
