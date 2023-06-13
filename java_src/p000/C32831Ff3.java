package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.analytics.AnalyticsEvent;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b*\u0010+JD\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\"\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000f0$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0015¨\u0006,"}, m28432d2 = {"LFf3;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "", "deliveryTimeSeconds", "nearestBirdDistanceMeters", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;JLjava/lang/Long;)LFf3;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "J", "getDeliveryTimeSeconds", "()J", "e", "Ljava/lang/Long;", "getNearestBirdDistanceMeters", "()Ljava/lang/Long;", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;JLjava/lang/Long;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ff3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C32831Ff3 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f9930a;

    /* renamed from: b */
    public final DateTime f9931b;

    /* renamed from: c */
    public final DateTime f9932c;

    /* renamed from: d */
    public final long f9933d;

    /* renamed from: e */
    public final Long f9934e;

    public C32831Ff3(String eventId, DateTime eventTime, DateTime clientTime, long j, Long l) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        this.f9930a = eventId;
        this.f9931b = eventTime;
        this.f9932c = clientTime;
        this.f9933d = j;
        this.f9934e = l;
    }

    public static /* synthetic */ C32831Ff3 copy$default(C32831Ff3 c32831Ff3, String str, DateTime dateTime, DateTime dateTime2, long j, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c32831Ff3.f9930a;
        }
        if ((i & 2) != 0) {
            dateTime = c32831Ff3.f9931b;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = c32831Ff3.f9932c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 8) != 0) {
            j = c32831Ff3.f9933d;
        }
        long j2 = j;
        if ((i & 16) != 0) {
            l = c32831Ff3.f9934e;
        }
        return c32831Ff3.m106762a(str, dateTime3, dateTime4, j2, l);
    }

    /* renamed from: a */
    public final C32831Ff3 m106762a(String eventId, DateTime eventTime, DateTime clientTime, long j, Long l) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        return new C32831Ff3(eventId, eventTime, clientTime, j, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C32831Ff3) {
            C32831Ff3 c32831Ff3 = (C32831Ff3) obj;
            return Intrinsics.areEqual(this.f9930a, c32831Ff3.f9930a) && Intrinsics.areEqual(this.f9931b, c32831Ff3.f9931b) && Intrinsics.areEqual(this.f9932c, c32831Ff3.f9932c) && this.f9933d == c32831Ff3.f9933d && Intrinsics.areEqual(this.f9934e, c32831Ff3.f9934e);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.OnDemandPillClick";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f9930a), TuplesKt.m28425to("event_time", this.f9931b), TuplesKt.m28425to("client_time", this.f9932c), TuplesKt.m28425to("delivery_time_seconds", Long.valueOf(this.f9933d)), TuplesKt.m28425to("nearest_bird_distance_meters", this.f9934e));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((this.f9930a.hashCode() * 31) + this.f9931b.hashCode()) * 31) + this.f9932c.hashCode()) * 31) + Long.hashCode(this.f9933d)) * 31;
        Long l = this.f9934e;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        String str = this.f9930a;
        DateTime dateTime = this.f9931b;
        DateTime dateTime2 = this.f9932c;
        long j = this.f9933d;
        Long l = this.f9934e;
        return "OnDemandPillClick(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", deliveryTimeSeconds=" + j + ", nearestBirdDistanceMeters=" + l + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C32831Ff3(String str, DateTime dateTime, DateTime dateTime2, long j, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r2, dateTime2, j, (i & 16) != 0 ? null : l);
        if ((i & 1) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
        String str2 = str;
        if ((i & 2) != 0) {
            dateTime = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime, "now()");
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime2, "now()");
        }
    }
}
