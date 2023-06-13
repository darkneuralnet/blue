package com.stripe.android.financialconnections.analytics;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.stripe.android.financialconnections.utils.CollectionsKt;
import com.stripe.android.networking.FraudDetectionData;
import java.util.Date;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0007\u0010\u0011\u0012\u0013\u0014\u0015\u0016B-\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0007\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, m28432d2 = {"Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;", "", "name", "", FraudDetectionData.KEY_TIMESTAMP, "Ljava/util/Date;", "rawEventDetails", "", "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Map;)V", "getName", "()Ljava/lang/String;", "getRawEventDetails", "()Ljava/util/Map;", "getTimestamp", "()Ljava/util/Date;", "toMap", "Cancel", "Failure", "Launched", "Loaded", "OAuthLaunched", "Retry", "Success", "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Cancel;", "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Failure;", "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Launched;", "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Loaded;", "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$OAuthLaunched;", "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Retry;", "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Success;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public abstract class AuthSessionEvent {
    private final String name;
    private final Map<String, String> rawEventDetails;
    private final Date timestamp;

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Cancel;", "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;", FraudDetectionData.KEY_TIMESTAMP, "Ljava/util/Date;", "(Ljava/util/Date;)V", "getTimestamp", "()Ljava/util/Date;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Cancel extends AuthSessionEvent {
        public static final int $stable = 8;
        private final Date timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Cancel(Date timestamp) {
            super("cancel", timestamp, null, 4, null);
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            this.timestamp = timestamp;
        }

        public static /* synthetic */ Cancel copy$default(Cancel cancel, Date date, int i, Object obj) {
            if ((i & 1) != 0) {
                date = cancel.getTimestamp();
            }
            return cancel.copy(date);
        }

        public final Date component1() {
            return getTimestamp();
        }

        public final Cancel copy(Date timestamp) {
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            return new Cancel(timestamp);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Cancel) && Intrinsics.areEqual(getTimestamp(), ((Cancel) obj).getTimestamp());
        }

        @Override // com.stripe.android.financialconnections.analytics.AuthSessionEvent
        public Date getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return getTimestamp().hashCode();
        }

        public String toString() {
            Date timestamp = getTimestamp();
            return "Cancel(timestamp=" + timestamp + ")";
        }
    }

    @Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m28432d2 = {"Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Failure;", "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;", FraudDetectionData.KEY_TIMESTAMP, "Ljava/util/Date;", "error", "", "(Ljava/util/Date;Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "getTimestamp", "()Ljava/util/Date;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Failure extends AuthSessionEvent {
        public static final int $stable = 8;
        private final Throwable error;
        private final Date timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(Date timestamp, Throwable error) {
            super("failure", timestamp, CollectionsKt.filterNotNullValues(AnalyticsMappersKt.toEventParams(error)), null);
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            Intrinsics.checkNotNullParameter(error, "error");
            this.timestamp = timestamp;
            this.error = error;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, Date date, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                date = failure.getTimestamp();
            }
            if ((i & 2) != 0) {
                th = failure.error;
            }
            return failure.copy(date, th);
        }

        public final Date component1() {
            return getTimestamp();
        }

        public final Throwable component2() {
            return this.error;
        }

        public final Failure copy(Date timestamp, Throwable error) {
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            Intrinsics.checkNotNullParameter(error, "error");
            return new Failure(timestamp, error);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Failure) {
                Failure failure = (Failure) obj;
                return Intrinsics.areEqual(getTimestamp(), failure.getTimestamp()) && Intrinsics.areEqual(this.error, failure.error);
            }
            return false;
        }

        public final Throwable getError() {
            return this.error;
        }

        @Override // com.stripe.android.financialconnections.analytics.AuthSessionEvent
        public Date getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return (getTimestamp().hashCode() * 31) + this.error.hashCode();
        }

        public String toString() {
            Date timestamp = getTimestamp();
            Throwable th = this.error;
            return "Failure(timestamp=" + timestamp + ", error=" + th + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Launched;", "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;", FraudDetectionData.KEY_TIMESTAMP, "Ljava/util/Date;", "(Ljava/util/Date;)V", "getTimestamp", "()Ljava/util/Date;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Launched extends AuthSessionEvent {
        public static final int $stable = 8;
        private final Date timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Launched(Date timestamp) {
            super("launched", timestamp, null, 4, null);
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            this.timestamp = timestamp;
        }

        public static /* synthetic */ Launched copy$default(Launched launched, Date date, int i, Object obj) {
            if ((i & 1) != 0) {
                date = launched.getTimestamp();
            }
            return launched.copy(date);
        }

        public final Date component1() {
            return getTimestamp();
        }

        public final Launched copy(Date timestamp) {
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            return new Launched(timestamp);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Launched) && Intrinsics.areEqual(getTimestamp(), ((Launched) obj).getTimestamp());
        }

        @Override // com.stripe.android.financialconnections.analytics.AuthSessionEvent
        public Date getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return getTimestamp().hashCode();
        }

        public String toString() {
            Date timestamp = getTimestamp();
            return "Launched(timestamp=" + timestamp + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Loaded;", "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;", FraudDetectionData.KEY_TIMESTAMP, "Ljava/util/Date;", "(Ljava/util/Date;)V", "getTimestamp", "()Ljava/util/Date;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Loaded extends AuthSessionEvent {
        public static final int $stable = 8;
        private final Date timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(Date timestamp) {
            super("loaded", timestamp, null, 4, null);
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            this.timestamp = timestamp;
        }

        public static /* synthetic */ Loaded copy$default(Loaded loaded, Date date, int i, Object obj) {
            if ((i & 1) != 0) {
                date = loaded.getTimestamp();
            }
            return loaded.copy(date);
        }

        public final Date component1() {
            return getTimestamp();
        }

        public final Loaded copy(Date timestamp) {
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            return new Loaded(timestamp);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loaded) && Intrinsics.areEqual(getTimestamp(), ((Loaded) obj).getTimestamp());
        }

        @Override // com.stripe.android.financialconnections.analytics.AuthSessionEvent
        public Date getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return getTimestamp().hashCode();
        }

        public String toString() {
            Date timestamp = getTimestamp();
            return "Loaded(timestamp=" + timestamp + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$OAuthLaunched;", "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;", FraudDetectionData.KEY_TIMESTAMP, "Ljava/util/Date;", "(Ljava/util/Date;)V", "getTimestamp", "()Ljava/util/Date;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class OAuthLaunched extends AuthSessionEvent {
        public static final int $stable = 8;
        private final Date timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OAuthLaunched(Date timestamp) {
            super("oauth-launched", timestamp, null, 4, null);
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            this.timestamp = timestamp;
        }

        public static /* synthetic */ OAuthLaunched copy$default(OAuthLaunched oAuthLaunched, Date date, int i, Object obj) {
            if ((i & 1) != 0) {
                date = oAuthLaunched.getTimestamp();
            }
            return oAuthLaunched.copy(date);
        }

        public final Date component1() {
            return getTimestamp();
        }

        public final OAuthLaunched copy(Date timestamp) {
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            return new OAuthLaunched(timestamp);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OAuthLaunched) && Intrinsics.areEqual(getTimestamp(), ((OAuthLaunched) obj).getTimestamp());
        }

        @Override // com.stripe.android.financialconnections.analytics.AuthSessionEvent
        public Date getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return getTimestamp().hashCode();
        }

        public String toString() {
            Date timestamp = getTimestamp();
            return "OAuthLaunched(timestamp=" + timestamp + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Retry;", "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;", FraudDetectionData.KEY_TIMESTAMP, "Ljava/util/Date;", "(Ljava/util/Date;)V", "getTimestamp", "()Ljava/util/Date;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Retry extends AuthSessionEvent {
        public static final int $stable = 8;
        private final Date timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Retry(Date timestamp) {
            super("retry", timestamp, null, 4, null);
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            this.timestamp = timestamp;
        }

        public static /* synthetic */ Retry copy$default(Retry retry, Date date, int i, Object obj) {
            if ((i & 1) != 0) {
                date = retry.getTimestamp();
            }
            return retry.copy(date);
        }

        public final Date component1() {
            return getTimestamp();
        }

        public final Retry copy(Date timestamp) {
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            return new Retry(timestamp);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Retry) && Intrinsics.areEqual(getTimestamp(), ((Retry) obj).getTimestamp());
        }

        @Override // com.stripe.android.financialconnections.analytics.AuthSessionEvent
        public Date getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return getTimestamp().hashCode();
        }

        public String toString() {
            Date timestamp = getTimestamp();
            return "Retry(timestamp=" + timestamp + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Success;", "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;", FraudDetectionData.KEY_TIMESTAMP, "Ljava/util/Date;", "(Ljava/util/Date;)V", "getTimestamp", "()Ljava/util/Date;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Success extends AuthSessionEvent {
        public static final int $stable = 8;
        private final Date timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(Date timestamp) {
            super("success", timestamp, null, 4, null);
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            this.timestamp = timestamp;
        }

        public static /* synthetic */ Success copy$default(Success success, Date date, int i, Object obj) {
            if ((i & 1) != 0) {
                date = success.getTimestamp();
            }
            return success.copy(date);
        }

        public final Date component1() {
            return getTimestamp();
        }

        public final Success copy(Date timestamp) {
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            return new Success(timestamp);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(getTimestamp(), ((Success) obj).getTimestamp());
        }

        @Override // com.stripe.android.financialconnections.analytics.AuthSessionEvent
        public Date getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return getTimestamp().hashCode();
        }

        public String toString() {
            Date timestamp = getTimestamp();
            return "Success(timestamp=" + timestamp + ")";
        }
    }

    public /* synthetic */ AuthSessionEvent(String str, Date date, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, date, map);
    }

    public final String getName() {
        return this.name;
    }

    public Map<String, String> getRawEventDetails() {
        return this.rawEventDetails;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public final Map<String, Object> toMap() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("event_namespace", "partner-auth-lifecycle"), TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_NAME, this.name), TuplesKt.m28425to("client_timestamp", String.valueOf(getTimestamp().getTime())), TuplesKt.m28425to("raw_event_details", new JSONObject(getRawEventDetails()).toString()));
        return mapOf;
    }

    private AuthSessionEvent(String str, Date date, Map<String, String> map) {
        this.name = str;
        this.timestamp = date;
        this.rawEventDetails = map;
    }

    public /* synthetic */ AuthSessionEvent(String str, Date date, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, date, (i & 4) != 0 ? MapsKt__MapsKt.emptyMap() : map, null);
    }
}
