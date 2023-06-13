package com.stripe.android.core.injection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/core/injection/NonFallbackInjectable;", "Lcom/stripe/android/core/injection/Injectable;", "", "fallbackInitialize", "", "arg", "(Lkotlin/Unit;)Ljava/lang/Void;", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public interface NonFallbackInjectable extends Injectable<Unit> {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static Void fallbackInitialize(NonFallbackInjectable nonFallbackInjectable, Unit arg) {
            Intrinsics.checkNotNullParameter(arg, "arg");
            String canonicalName = nonFallbackInjectable.getClass().getCanonicalName();
            throw new IllegalStateException(canonicalName + " does not support injection fallback");
        }
    }

    Void fallbackInitialize(Unit unit);
}
