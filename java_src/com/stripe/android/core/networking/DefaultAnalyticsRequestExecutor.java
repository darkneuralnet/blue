package com.stripe.android.core.networking;

import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.IOContext;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "()V", "logger", "Lcom/stripe/android/core/Logger;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;)V", "stripeNetworkClient", "Lcom/stripe/android/core/networking/StripeNetworkClient;", "(Lcom/stripe/android/core/networking/StripeNetworkClient;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/Logger;)V", "executeAsync", "", "request", "Lcom/stripe/android/core/networking/AnalyticsRequest;", "Companion", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public final class DefaultAnalyticsRequestExecutor implements AnalyticsRequestExecutor {
    public static final Companion Companion = new Companion(null);
    public static final String FIELD_EVENT = "event";
    private final Logger logger;
    private final StripeNetworkClient stripeNetworkClient;
    private final CoroutineContext workContext;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor$Companion;", "", "()V", "FIELD_EVENT", "", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public DefaultAnalyticsRequestExecutor(StripeNetworkClient stripeNetworkClient, @IOContext CoroutineContext workContext, Logger logger) {
        Intrinsics.checkNotNullParameter(stripeNetworkClient, "stripeNetworkClient");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.stripeNetworkClient = stripeNetworkClient;
        this.workContext = workContext;
        this.logger = logger;
    }

    @Override // com.stripe.android.core.networking.AnalyticsRequestExecutor
    public void executeAsync(AnalyticsRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Logger logger = this.logger;
        Object obj = request.getParams().get("event");
        logger.info("Event: " + obj);
        X30.m77507d(C37824aD0.m71790a(this.workContext), null, null, new DefaultAnalyticsRequestExecutor$executeAsync$1(this, request, null), 3, null);
    }

    public DefaultAnalyticsRequestExecutor() {
        this(Logger.Companion.noop(), T41.m84377b());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultAnalyticsRequestExecutor(Logger logger, @IOContext CoroutineContext workContext) {
        this(new DefaultStripeNetworkClient(workContext, null, null, 0, logger, 14, null), workContext, logger);
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
    }
}
