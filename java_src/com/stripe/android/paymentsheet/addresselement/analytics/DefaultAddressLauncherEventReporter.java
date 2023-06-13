package com.stripe.android.paymentsheet.addresselement.analytics;

import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import com.stripe.android.paymentsheet.addresselement.analytics.AddressLauncherEvent;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B!\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J'\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/addresselement/analytics/DefaultAddressLauncherEventReporter;", "Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "analyticsRequestFactory", "Lcom/stripe/android/core/networking/AnalyticsRequestFactory;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/networking/AnalyticsRequestFactory;Lkotlin/coroutines/CoroutineContext;)V", "fireEvent", "", "event", "Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEvent;", "onCompleted", "country", "", "autocompleteResultSelected", "", "editDistance", "", "(Ljava/lang/String;ZLjava/lang/Integer;)V", "onShow", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class DefaultAddressLauncherEventReporter implements AddressLauncherEventReporter {
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final AnalyticsRequestFactory analyticsRequestFactory;
    private final CoroutineContext workContext;

    public DefaultAddressLauncherEventReporter(AnalyticsRequestExecutor analyticsRequestExecutor, AnalyticsRequestFactory analyticsRequestFactory, @IOContext CoroutineContext workContext) {
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(analyticsRequestFactory, "analyticsRequestFactory");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.analyticsRequestFactory = analyticsRequestFactory;
        this.workContext = workContext;
    }

    private final void fireEvent(AddressLauncherEvent addressLauncherEvent) {
        X30.m77507d(C37824aD0.m71790a(this.workContext), null, null, new DefaultAddressLauncherEventReporter$fireEvent$1(this, addressLauncherEvent, null), 3, null);
    }

    @Override // com.stripe.android.paymentsheet.addresselement.analytics.AddressLauncherEventReporter
    public void onCompleted(String country, boolean z, Integer num) {
        Intrinsics.checkNotNullParameter(country, "country");
        fireEvent(new AddressLauncherEvent.Completed(country, z, num));
    }

    @Override // com.stripe.android.paymentsheet.addresselement.analytics.AddressLauncherEventReporter
    public void onShow(String country) {
        Intrinsics.checkNotNullParameter(country, "country");
        fireEvent(new AddressLauncherEvent.Show(country));
    }
}
