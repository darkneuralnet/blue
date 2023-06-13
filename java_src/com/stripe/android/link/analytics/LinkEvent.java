package com.stripe.android.link.analytics;

import com.stripe.android.core.networking.AnalyticsEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u000b\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u000b\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, m28432d2 = {"Lcom/stripe/android/link/analytics/LinkEvent;", "Lcom/stripe/android/core/networking/AnalyticsEvent;", "()V", "AccountLookupFailure", "SignUpCheckboxChecked", "SignUpComplete", "SignUpFailure", "SignUpFlowPresented", "SignUpStart", "TwoFACancel", "TwoFAComplete", "TwoFAFailure", "TwoFAStart", "TwoFAStartFailure", "Lcom/stripe/android/link/analytics/LinkEvent$AccountLookupFailure;", "Lcom/stripe/android/link/analytics/LinkEvent$SignUpCheckboxChecked;", "Lcom/stripe/android/link/analytics/LinkEvent$SignUpComplete;", "Lcom/stripe/android/link/analytics/LinkEvent$SignUpFailure;", "Lcom/stripe/android/link/analytics/LinkEvent$SignUpFlowPresented;", "Lcom/stripe/android/link/analytics/LinkEvent$SignUpStart;", "Lcom/stripe/android/link/analytics/LinkEvent$TwoFACancel;", "Lcom/stripe/android/link/analytics/LinkEvent$TwoFAComplete;", "Lcom/stripe/android/link/analytics/LinkEvent$TwoFAFailure;", "Lcom/stripe/android/link/analytics/LinkEvent$TwoFAStart;", "Lcom/stripe/android/link/analytics/LinkEvent$TwoFAStartFailure;", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public abstract class LinkEvent implements AnalyticsEvent {

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/link/analytics/LinkEvent$AccountLookupFailure;", "Lcom/stripe/android/link/analytics/LinkEvent;", "()V", "eventName", "", "getEventName", "()Ljava/lang/String;", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class AccountLookupFailure extends LinkEvent {
        public static final int $stable = 0;
        public static final AccountLookupFailure INSTANCE = new AccountLookupFailure();
        private static final String eventName = "link.account_lookup.failure";

        private AccountLookupFailure() {
            super(null);
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return eventName;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/link/analytics/LinkEvent$SignUpCheckboxChecked;", "Lcom/stripe/android/link/analytics/LinkEvent;", "()V", "eventName", "", "getEventName", "()Ljava/lang/String;", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class SignUpCheckboxChecked extends LinkEvent {
        public static final int $stable = 0;
        public static final SignUpCheckboxChecked INSTANCE = new SignUpCheckboxChecked();
        private static final String eventName = "link.signup.checkbox_checked";

        private SignUpCheckboxChecked() {
            super(null);
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return eventName;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/link/analytics/LinkEvent$SignUpComplete;", "Lcom/stripe/android/link/analytics/LinkEvent;", "()V", "eventName", "", "getEventName", "()Ljava/lang/String;", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class SignUpComplete extends LinkEvent {
        public static final int $stable = 0;
        public static final SignUpComplete INSTANCE = new SignUpComplete();
        private static final String eventName = "link.signup.complete";

        private SignUpComplete() {
            super(null);
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return eventName;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/link/analytics/LinkEvent$SignUpFailure;", "Lcom/stripe/android/link/analytics/LinkEvent;", "()V", "eventName", "", "getEventName", "()Ljava/lang/String;", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class SignUpFailure extends LinkEvent {
        public static final int $stable = 0;
        public static final SignUpFailure INSTANCE = new SignUpFailure();
        private static final String eventName = "link.signup.failure";

        private SignUpFailure() {
            super(null);
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return eventName;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/link/analytics/LinkEvent$SignUpFlowPresented;", "Lcom/stripe/android/link/analytics/LinkEvent;", "()V", "eventName", "", "getEventName", "()Ljava/lang/String;", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class SignUpFlowPresented extends LinkEvent {
        public static final int $stable = 0;
        public static final SignUpFlowPresented INSTANCE = new SignUpFlowPresented();
        private static final String eventName = "link.signup.flow_presented";

        private SignUpFlowPresented() {
            super(null);
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return eventName;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/link/analytics/LinkEvent$SignUpStart;", "Lcom/stripe/android/link/analytics/LinkEvent;", "()V", "eventName", "", "getEventName", "()Ljava/lang/String;", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class SignUpStart extends LinkEvent {
        public static final int $stable = 0;
        public static final SignUpStart INSTANCE = new SignUpStart();
        private static final String eventName = "link.signup.start";

        private SignUpStart() {
            super(null);
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return eventName;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/link/analytics/LinkEvent$TwoFACancel;", "Lcom/stripe/android/link/analytics/LinkEvent;", "()V", "eventName", "", "getEventName", "()Ljava/lang/String;", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class TwoFACancel extends LinkEvent {
        public static final int $stable = 0;
        public static final TwoFACancel INSTANCE = new TwoFACancel();
        private static final String eventName = "link.2fa.cancel";

        private TwoFACancel() {
            super(null);
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return eventName;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/link/analytics/LinkEvent$TwoFAComplete;", "Lcom/stripe/android/link/analytics/LinkEvent;", "()V", "eventName", "", "getEventName", "()Ljava/lang/String;", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class TwoFAComplete extends LinkEvent {
        public static final int $stable = 0;
        public static final TwoFAComplete INSTANCE = new TwoFAComplete();
        private static final String eventName = "link.2fa.complete";

        private TwoFAComplete() {
            super(null);
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return eventName;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/link/analytics/LinkEvent$TwoFAFailure;", "Lcom/stripe/android/link/analytics/LinkEvent;", "()V", "eventName", "", "getEventName", "()Ljava/lang/String;", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class TwoFAFailure extends LinkEvent {
        public static final int $stable = 0;
        public static final TwoFAFailure INSTANCE = new TwoFAFailure();
        private static final String eventName = "link.2fa.failure";

        private TwoFAFailure() {
            super(null);
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return eventName;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/link/analytics/LinkEvent$TwoFAStart;", "Lcom/stripe/android/link/analytics/LinkEvent;", "()V", "eventName", "", "getEventName", "()Ljava/lang/String;", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class TwoFAStart extends LinkEvent {
        public static final int $stable = 0;
        public static final TwoFAStart INSTANCE = new TwoFAStart();
        private static final String eventName = "link.2fa.start";

        private TwoFAStart() {
            super(null);
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return eventName;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/link/analytics/LinkEvent$TwoFAStartFailure;", "Lcom/stripe/android/link/analytics/LinkEvent;", "()V", "eventName", "", "getEventName", "()Ljava/lang/String;", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class TwoFAStartFailure extends LinkEvent {
        public static final int $stable = 0;
        public static final TwoFAStartFailure INSTANCE = new TwoFAStartFailure();
        private static final String eventName = "link.2fa.start_failure";

        private TwoFAStartFailure() {
            super(null);
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return eventName;
        }
    }

    public /* synthetic */ LinkEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private LinkEvent() {
    }
}
