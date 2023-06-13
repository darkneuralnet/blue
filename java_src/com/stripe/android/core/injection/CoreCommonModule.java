package com.stripe.android.core.injection;

import com.stripe.android.core.Logger;
import dagger.Module;
import dagger.Provides;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/core/injection/CoreCommonModule;", "", "()V", "provideLocale", "Ljava/util/Locale;", "provideLogger", "Lcom/stripe/android/core/Logger;", NamedConstantsKt.ENABLE_LOGGING, "", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@Module
@SourceDebugExtension({"SMAP\nCoreCommonModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreCommonModule.kt\ncom/stripe/android/core/injection/CoreCommonModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,24:1\n1#2:25\n*E\n"})
/* loaded from: classes6.dex */
public final class CoreCommonModule {
    @Provides
    public final Locale provideLocale() {
        C50711vv2 m7770d = C50711vv2.m7770d();
        if (m7770d.m7767g()) {
            m7770d = null;
        }
        if (m7770d != null) {
            return m7770d.m7771c(0);
        }
        return null;
    }

    @Provides
    public final Logger provideLogger(boolean z) {
        return Logger.Companion.getInstance(z);
    }
}
