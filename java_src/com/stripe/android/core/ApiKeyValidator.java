package com.stripe.android.core;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/core/ApiKeyValidator;", "", "()V", "requireValid", "", "apiKey", "Companion", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public final class ApiKeyValidator {
    public static final Companion Companion = new Companion(null);
    private static final ApiKeyValidator DEFAULT = new ApiKeyValidator();

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/core/ApiKeyValidator$Companion;", "", "()V", "DEFAULT", "Lcom/stripe/android/core/ApiKeyValidator;", "get", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final ApiKeyValidator get() {
            return ApiKeyValidator.DEFAULT;
        }

        private Companion() {
        }
    }

    @JvmStatic
    public static final ApiKeyValidator get() {
        return Companion.get();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0011  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String requireValid(String str) {
        boolean z;
        boolean startsWith$default;
        boolean isBlank;
        if (str != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(str);
            if (!isBlank) {
                z = false;
                if (!(!z)) {
                    startsWith$default = StringsKt__StringsJVMKt.startsWith$default(str, "sk_", false, 2, null);
                    if (!startsWith$default) {
                        return str;
                    }
                    throw new IllegalArgumentException("Invalid Publishable Key: You are using a secret key instead of a publishable one. For more info, see https://stripe.com/docs/keys".toString());
                }
                throw new IllegalArgumentException("Invalid Publishable Key: You must use a valid Stripe API key to make a Stripe API request. For more info, see https://stripe.com/docs/keys".toString());
            }
        }
        z = true;
        if (!(!z)) {
        }
    }
}
