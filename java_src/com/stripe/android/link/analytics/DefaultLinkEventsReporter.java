package com.stripe.android.link.analytics;

import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.link.analytics.LinkEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ%\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0002\u0010\u0013J(\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u000fH\u0002J\b\u0010\u001a\u001a\u00020\u0015H\u0016J\b\u0010\u001b\u001a\u00020\u0015H\u0016J\b\u0010\u001c\u001a\u00020\u0015H\u0016J\b\u0010\u001d\u001a\u00020\u0015H\u0016J\b\u0010\u001e\u001a\u00020\u0015H\u0016J\b\u0010\u001f\u001a\u00020\u0015H\u0016J\b\u0010 \u001a\u00020\u0015H\u0016J\u0010\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010%\u001a\u00020\u0015H\u0016J\u0010\u0010&\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, m28432d2 = {"Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;", "Lcom/stripe/android/link/analytics/LinkEventsReporter;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "logger", "Lcom/stripe/android/core/Logger;", "(Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/Logger;)V", "signupStartMillis", "", "Ljava/lang/Long;", "durationInSecondsFromStart", "", "", "", "start", "(Ljava/lang/Long;)Ljava/util/Map;", "fireEvent", "", "event", "Lcom/stripe/android/link/analytics/LinkEvent;", "additionalParams", "", "on2FACancel", "on2FAComplete", "on2FAFailure", "on2FAStart", "on2FAStartFailure", "onAccountLookupFailure", "onInlineSignupCheckboxChecked", "onSignupCompleted", "isInline", "", "onSignupFailure", "onSignupFlowPresented", "onSignupStarted", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nDefaultLinkEventsReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultLinkEventsReporter.kt\ncom/stripe/android/link/analytics/DefaultLinkEventsReporter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"})
/* loaded from: classes7.dex */
public final class DefaultLinkEventsReporter implements LinkEventsReporter {
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final Logger logger;
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    private Long signupStartMillis;
    private final CoroutineContext workContext;

    public DefaultLinkEventsReporter(AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, @IOContext CoroutineContext workContext, Logger logger) {
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.workContext = workContext;
        this.logger = logger;
    }

    private final Map<String, Float> durationInSecondsFromStart(Long l) {
        boolean z;
        Map<String, Float> mapOf;
        if (l == null) {
            return null;
        }
        Long valueOf = Long.valueOf(System.currentTimeMillis() - l.longValue());
        if (valueOf.longValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null) {
            mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("duration", Float.valueOf(((float) valueOf.longValue()) / 1000.0f)));
            return mapOf;
        }
        return null;
    }

    private final void fireEvent(LinkEvent linkEvent, Map<String, ? extends Object> map) {
        Logger logger = this.logger;
        String eventName = linkEvent.getEventName();
        logger.debug("Link event: " + eventName + " " + map);
        Z30.m73800d(C37824aD0.m71790a(this.workContext), null, null, new DefaultLinkEventsReporter$fireEvent$1(this, linkEvent, map, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void fireEvent$default(DefaultLinkEventsReporter defaultLinkEventsReporter, LinkEvent linkEvent, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        defaultLinkEventsReporter.fireEvent(linkEvent, map);
    }

    @Override // com.stripe.android.link.analytics.LinkEventsReporter
    public void on2FACancel() {
        fireEvent$default(this, LinkEvent.TwoFACancel.INSTANCE, null, 2, null);
    }

    @Override // com.stripe.android.link.analytics.LinkEventsReporter
    public void on2FAComplete() {
        fireEvent$default(this, LinkEvent.TwoFAComplete.INSTANCE, null, 2, null);
    }

    @Override // com.stripe.android.link.analytics.LinkEventsReporter
    public void on2FAFailure() {
        fireEvent$default(this, LinkEvent.TwoFAFailure.INSTANCE, null, 2, null);
    }

    @Override // com.stripe.android.link.analytics.LinkEventsReporter
    public void on2FAStart() {
        fireEvent$default(this, LinkEvent.TwoFAStart.INSTANCE, null, 2, null);
    }

    @Override // com.stripe.android.link.analytics.LinkEventsReporter
    public void on2FAStartFailure() {
        fireEvent$default(this, LinkEvent.TwoFAStartFailure.INSTANCE, null, 2, null);
    }

    @Override // com.stripe.android.link.analytics.LinkEventsReporter
    public void onAccountLookupFailure() {
        fireEvent$default(this, LinkEvent.AccountLookupFailure.INSTANCE, null, 2, null);
    }

    @Override // com.stripe.android.link.analytics.LinkEventsReporter
    public void onInlineSignupCheckboxChecked() {
        fireEvent$default(this, LinkEvent.SignUpCheckboxChecked.INSTANCE, null, 2, null);
    }

    @Override // com.stripe.android.link.analytics.LinkEventsReporter
    public void onSignupCompleted(boolean z) {
        fireEvent(LinkEvent.SignUpComplete.INSTANCE, durationInSecondsFromStart(this.signupStartMillis));
        this.signupStartMillis = null;
    }

    @Override // com.stripe.android.link.analytics.LinkEventsReporter
    public void onSignupFailure(boolean z) {
        fireEvent$default(this, LinkEvent.SignUpFailure.INSTANCE, null, 2, null);
    }

    @Override // com.stripe.android.link.analytics.LinkEventsReporter
    public void onSignupFlowPresented() {
        fireEvent$default(this, LinkEvent.SignUpFlowPresented.INSTANCE, null, 2, null);
    }

    @Override // com.stripe.android.link.analytics.LinkEventsReporter
    public void onSignupStarted(boolean z) {
        this.signupStartMillis = Long.valueOf(System.currentTimeMillis());
        fireEvent$default(this, LinkEvent.SignUpStart.INSTANCE, null, 2, null);
    }
}
