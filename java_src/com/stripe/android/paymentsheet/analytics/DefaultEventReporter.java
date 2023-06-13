package com.stripe.android.paymentsheet.analytics;

import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.link.injection.NamedConstantsKt;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.analytics.PaymentSheetEvent;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B1\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0014H\u0016J\u0012\u0010\u001b\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0014H\u0016J\u001c\u0010\u001f\u001a\u00020\u00142\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010\u0019H\u0016J\u001c\u0010#\u001a\u00020\u00142\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010$\u001a\u00020\u00142\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0019H\u0016J\"\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'2\b\u0010\"\u001a\u0004\u0018\u00010\u0019H\u0016J\"\u0010)\u001a\u00020\u00142\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'2\b\u0010\"\u001a\u0004\u0018\u00010\u0019H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "mode", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "eventTimeProvider", "Lcom/stripe/android/paymentsheet/analytics/EventTimeProvider;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/paymentsheet/analytics/EventTimeProvider;Lkotlin/coroutines/CoroutineContext;)V", "paymentSheetShownMillis", "", "Ljava/lang/Long;", "durationMillisFrom", "start", "(Ljava/lang/Long;)Ljava/lang/Long;", "fireEvent", "", "event", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "onAutofill", "type", "", "onDismiss", "onInit", "configuration", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "onLpmSpecFailure", "onPaymentFailure", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "currency", "onPaymentSuccess", "onSelectPaymentOption", "onShowExistingPaymentOptions", NamedConstantsKt.LINK_ENABLED, "", "activeLinkSession", "onShowNewPaymentOptionForm", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nDefaultEventReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultEventReporter.kt\ncom/stripe/android/paymentsheet/analytics/DefaultEventReporter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n1#2:154\n*E\n"})
/* loaded from: classes7.dex */
public final class DefaultEventReporter implements EventReporter {
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final EventTimeProvider eventTimeProvider;
    private final EventReporter.Mode mode;
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    private Long paymentSheetShownMillis;
    private final CoroutineContext workContext;

    public DefaultEventReporter(EventReporter.Mode mode, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, EventTimeProvider eventTimeProvider, @IOContext CoroutineContext workContext) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        Intrinsics.checkNotNullParameter(eventTimeProvider, "eventTimeProvider");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.mode = mode;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.eventTimeProvider = eventTimeProvider;
        this.workContext = workContext;
    }

    private final Long durationMillisFrom(Long l) {
        boolean z;
        if (l == null) {
            return null;
        }
        Long valueOf = Long.valueOf(this.eventTimeProvider.currentTimeMillis() - l.longValue());
        if (valueOf.longValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        return valueOf;
    }

    private final void fireEvent(PaymentSheetEvent paymentSheetEvent) {
        Z30.m73800d(C37824aD0.m71790a(this.workContext), null, null, new DefaultEventReporter$fireEvent$1(this, paymentSheetEvent, null), 3, null);
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onAutofill(String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        fireEvent(new PaymentSheetEvent.AutofillEvent(type));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onDismiss() {
        fireEvent(new PaymentSheetEvent.Dismiss(this.mode));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onInit(PaymentSheet.Configuration configuration) {
        fireEvent(new PaymentSheetEvent.Init(this.mode, configuration));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onLpmSpecFailure() {
        fireEvent(new PaymentSheetEvent.LpmSerializeFailureEvent());
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onPaymentFailure(PaymentSelection paymentSelection, String str) {
        fireEvent(new PaymentSheetEvent.Payment(this.mode, PaymentSheetEvent.Payment.Result.Failure, durationMillisFrom(this.paymentSheetShownMillis), paymentSelection, str));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onPaymentSuccess(PaymentSelection paymentSelection, String str) {
        PaymentSelection.Saved saved;
        if (paymentSelection instanceof PaymentSelection.Saved) {
            saved = (PaymentSelection.Saved) paymentSelection;
        } else {
            saved = null;
        }
        boolean z = false;
        if (saved != null && saved.isGooglePay$paymentsheet_release()) {
            z = true;
        }
        if (z) {
            paymentSelection = PaymentSelection.GooglePay.INSTANCE;
        }
        fireEvent(new PaymentSheetEvent.Payment(this.mode, PaymentSheetEvent.Payment.Result.Success, durationMillisFrom(this.paymentSheetShownMillis), paymentSelection, str));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onSelectPaymentOption(PaymentSelection paymentSelection, String str) {
        Intrinsics.checkNotNullParameter(paymentSelection, "paymentSelection");
        fireEvent(new PaymentSheetEvent.SelectPaymentOption(this.mode, paymentSelection, str));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onShowExistingPaymentOptions(boolean z, boolean z2, String str) {
        this.paymentSheetShownMillis = Long.valueOf(this.eventTimeProvider.currentTimeMillis());
        fireEvent(new PaymentSheetEvent.ShowExistingPaymentOptions(this.mode, z, z2, str));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onShowNewPaymentOptionForm(boolean z, boolean z2, String str) {
        this.paymentSheetShownMillis = Long.valueOf(this.eventTimeProvider.currentTimeMillis());
        fireEvent(new PaymentSheetEvent.ShowNewPaymentOptionForm(this.mode, z, z2, str));
    }
}
