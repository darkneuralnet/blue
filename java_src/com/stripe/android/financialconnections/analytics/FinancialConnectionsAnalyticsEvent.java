package com.stripe.android.financialconnections.analytics;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.networking.AnalyticsEvent;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0019B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m28432d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;", "Lcom/stripe/android/core/networking/AnalyticsEvent;", "eventCode", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;", "additionalParams", "", "", "(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;Ljava/util/Map;)V", "getAdditionalParams", "()Ljava/util/Map;", "getEventCode", "()Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;", "eventName", "getEventName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "Code", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class FinancialConnectionsAnalyticsEvent implements AnalyticsEvent {
    private final Map<String, String> additionalParams;
    private final Code eventCode;
    private final String eventName;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$financial_connections_release", "()Ljava/lang/String;", "toString", "SheetPresented", "SheetClosed", "SheetFailed", "Companion", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public enum Code {
        SheetPresented("sheet.presented"),
        SheetClosed("sheet.closed"),
        SheetFailed("sheet.failed");
        
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String PREFIX = "stripe_android.connections";
        private final String code;

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code$Companion;", "", "()V", "PREFIX", "", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        Code(String str) {
            this.code = str;
        }

        public final String getCode$financial_connections_release() {
            return this.code;
        }

        @Override // java.lang.Enum
        public String toString() {
            String str = this.code;
            return "stripe_android.connections." + str;
        }
    }

    public FinancialConnectionsAnalyticsEvent(Code eventCode, Map<String, String> additionalParams) {
        Intrinsics.checkNotNullParameter(eventCode, "eventCode");
        Intrinsics.checkNotNullParameter(additionalParams, "additionalParams");
        this.eventCode = eventCode;
        this.additionalParams = additionalParams;
        this.eventName = eventCode.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FinancialConnectionsAnalyticsEvent copy$default(FinancialConnectionsAnalyticsEvent financialConnectionsAnalyticsEvent, Code code, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            code = financialConnectionsAnalyticsEvent.eventCode;
        }
        if ((i & 2) != 0) {
            map = financialConnectionsAnalyticsEvent.additionalParams;
        }
        return financialConnectionsAnalyticsEvent.copy(code, map);
    }

    public final Code component1() {
        return this.eventCode;
    }

    public final Map<String, String> component2() {
        return this.additionalParams;
    }

    public final FinancialConnectionsAnalyticsEvent copy(Code eventCode, Map<String, String> additionalParams) {
        Intrinsics.checkNotNullParameter(eventCode, "eventCode");
        Intrinsics.checkNotNullParameter(additionalParams, "additionalParams");
        return new FinancialConnectionsAnalyticsEvent(eventCode, additionalParams);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FinancialConnectionsAnalyticsEvent) {
            FinancialConnectionsAnalyticsEvent financialConnectionsAnalyticsEvent = (FinancialConnectionsAnalyticsEvent) obj;
            return this.eventCode == financialConnectionsAnalyticsEvent.eventCode && Intrinsics.areEqual(this.additionalParams, financialConnectionsAnalyticsEvent.additionalParams);
        }
        return false;
    }

    public final Map<String, String> getAdditionalParams() {
        return this.additionalParams;
    }

    public final Code getEventCode() {
        return this.eventCode;
    }

    @Override // com.stripe.android.core.networking.AnalyticsEvent
    public String getEventName() {
        return this.eventName;
    }

    public int hashCode() {
        return (this.eventCode.hashCode() * 31) + this.additionalParams.hashCode();
    }

    public String toString() {
        Code code = this.eventCode;
        Map<String, String> map = this.additionalParams;
        return "FinancialConnectionsAnalyticsEvent(eventCode=" + code + ", additionalParams=" + map + ")";
    }

    public /* synthetic */ FinancialConnectionsAnalyticsEvent(Code code, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(code, (i & 2) != 0 ? MapsKt__MapsKt.emptyMap() : map);
    }
}
