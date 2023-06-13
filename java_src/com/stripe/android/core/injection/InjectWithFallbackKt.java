package com.stripe.android.core.injection;

import com.stripe.android.core.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a3\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u0002H\u0002H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m28432d2 = {"injectWithFallback", "Lcom/stripe/android/core/injection/Injector;", "FallbackInitializeParam", "Lcom/stripe/android/core/injection/Injectable;", "injectorKey", "", "fallbackInitializeParam", "(Lcom/stripe/android/core/injection/Injectable;Ljava/lang/String;Ljava/lang/Object;)Lcom/stripe/android/core/injection/Injector;", "stripe-core_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public final class InjectWithFallbackKt {
    public static final <FallbackInitializeParam> Injector injectWithFallback(Injectable<FallbackInitializeParam> injectable, @InjectorKey String str, FallbackInitializeParam fallbackinitializeparam) {
        Injector retrieve;
        Intrinsics.checkNotNullParameter(injectable, "<this>");
        Logger companion = Logger.Companion.getInstance(false);
        if (str != null && (retrieve = WeakMapInjectorRegistry.INSTANCE.retrieve(str)) != null) {
            String canonicalName = injectable.getClass().getCanonicalName();
            companion.info("Injector available, injecting dependencies into " + canonicalName);
            retrieve.inject(injectable);
            return retrieve;
        }
        String canonicalName2 = injectable.getClass().getCanonicalName();
        companion.info("Injector unavailable, initializing dependencies of " + canonicalName2);
        return injectable.fallbackInitialize(fallbackinitializeparam);
    }
}
