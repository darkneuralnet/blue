package com.stripe.android.link.analytics;

import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\u0012\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fH&J\u0012\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fH&J\b\u0010\u000e\u001a\u00020\u0003H&J\u0012\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fH&¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/link/analytics/LinkEventsReporter;", "", "on2FACancel", "", "on2FAComplete", "on2FAFailure", "on2FAStart", "on2FAStartFailure", "onAccountLookupFailure", "onInlineSignupCheckboxChecked", "onSignupCompleted", "isInline", "", "onSignupFailure", "onSignupFlowPresented", "onSignupStarted", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public interface LinkEventsReporter {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void onSignupCompleted$default(LinkEventsReporter linkEventsReporter, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSignupCompleted");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            linkEventsReporter.onSignupCompleted(z);
        }

        public static /* synthetic */ void onSignupFailure$default(LinkEventsReporter linkEventsReporter, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSignupFailure");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            linkEventsReporter.onSignupFailure(z);
        }

        public static /* synthetic */ void onSignupStarted$default(LinkEventsReporter linkEventsReporter, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSignupStarted");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            linkEventsReporter.onSignupStarted(z);
        }
    }

    void on2FACancel();

    void on2FAComplete();

    void on2FAFailure();

    void on2FAStart();

    void on2FAStartFailure();

    void onAccountLookupFailure();

    void onInlineSignupCheckboxChecked();

    void onSignupCompleted(boolean z);

    void onSignupFailure(boolean z);

    void onSignupFlowPresented();

    void onSignupStarted(boolean z);
}
