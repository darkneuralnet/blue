package com.stripe.android.link.injection;

import com.stripe.android.DefaultIntentConfirmationInterceptor;
import com.stripe.android.IntentConfirmationInterceptor;
import com.stripe.android.Stripe;
import com.stripe.android.core.AppInfo;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.networking.DefaultStripeNetworkClient;
import com.stripe.android.link.analytics.DefaultLinkEventsReporter;
import com.stripe.android.link.analytics.LinkEventsReporter;
import com.stripe.android.link.repositories.LinkApiRepository;
import com.stripe.android.link.repositories.LinkRepository;
import com.stripe.android.repository.ConsumersApiService;
import com.stripe.android.repository.ConsumersApiServiceImpl;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH'¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/link/injection/LinkCommonModule;", "", "bindIntentConfirmationInterceptor", "Lcom/stripe/android/IntentConfirmationInterceptor;", "impl", "Lcom/stripe/android/DefaultIntentConfirmationInterceptor;", "bindLinkEventsReporter", "Lcom/stripe/android/link/analytics/LinkEventsReporter;", "linkEventsReporter", "Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;", "bindLinkRepository", "Lcom/stripe/android/link/repositories/LinkRepository;", "linkApiRepository", "Lcom/stripe/android/link/repositories/LinkApiRepository;", "Companion", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@Module
/* loaded from: classes7.dex */
public interface LinkCommonModule {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/link/injection/LinkCommonModule$Companion;", "", "()V", "provideConsumersApiService", "Lcom/stripe/android/repository/ConsumersApiService;", "logger", "Lcom/stripe/android/core/Logger;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Provides
        public final ConsumersApiService provideConsumersApiService(Logger logger, @IOContext CoroutineContext workContext) {
            Intrinsics.checkNotNullParameter(logger, "logger");
            Intrinsics.checkNotNullParameter(workContext, "workContext");
            AppInfo appInfo = Stripe.Companion.getAppInfo();
            return new ConsumersApiServiceImpl(new DefaultStripeNetworkClient(workContext, null, null, 0, logger, 14, null), Stripe.API_VERSION, "AndroidBindings/20.21.0", appInfo);
        }
    }

    @Binds
    IntentConfirmationInterceptor bindIntentConfirmationInterceptor(DefaultIntentConfirmationInterceptor defaultIntentConfirmationInterceptor);

    @Binds
    LinkEventsReporter bindLinkEventsReporter(DefaultLinkEventsReporter defaultLinkEventsReporter);

    @Binds
    LinkRepository bindLinkRepository(LinkApiRepository linkApiRepository);
}
