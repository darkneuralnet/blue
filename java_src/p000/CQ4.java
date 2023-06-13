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
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b0\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001Bù\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\bX\u0010YJ\u0084\u0002\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u001e\u001a\u00020\u0002HÖ\u0001J\t\u0010 \u001a\u00020\u001fHÖ\u0001J\u0013\u0010#\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010$\u001a\u0004\b.\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b.\u0010$\u001a\u0004\b+\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b/\u0010$\u001a\u0004\b-\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b\u000b\u00102R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b7\u0010$\u001a\u0004\b'\u0010&R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b<\u00109\u001a\u0004\b=\u0010;R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b>\u00109\u001a\u0004\b?\u0010;R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b@\u00101\u001a\u0004\bA\u00102R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\bB\u00109\u001a\u0004\bC\u0010;R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\bD\u00109\u001a\u0004\bE\u0010;R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\bF\u00109\u001a\u0004\bG\u0010;R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bH\u00101\u001a\u0004\bI\u00102R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\bJ\u00109\u001a\u0004\bK\u0010;R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\bL\u00109\u001a\u0004\bM\u0010;R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\bN\u00109\u001a\u0004\bO\u0010;R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bP\u00101\u001a\u0004\bQ\u00102R\"\u0010U\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010!0R8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0014\u0010W\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010&¨\u0006Z"}, m28432d2 = {"LCQ4;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "rideId", "lastVisitedStep", "reason", "", "isPrimaryRide", "", "concurrentRideCount", "endRideAttemptId", "", "arLatitude", "arLongitude", "arAccuracy", "arLocationMocked", "birdLatitude", "birdLongitude", "birdAccuracy", "birdLocationMocked", "gpsLatitude", "gpsLongitude", "gpsAccuracy", "gpsLocationMocked", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;)LCQ4;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "h", "Ljava/lang/Long;", "getConcurrentRideCount", "()Ljava/lang/Long;", "i", "j", "Ljava/lang/Double;", "getArLatitude", "()Ljava/lang/Double;", "k", "getArLongitude", "l", "getArAccuracy", "m", "getArLocationMocked", "n", "getBirdLatitude", "o", "getBirdLongitude", "p", "getBirdAccuracy", "q", "getBirdLocationMocked", "r", "getGpsLatitude", "s", "getGpsLongitude", "t", "getGpsAccuracy", "u", "getGpsLocationMocked", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: CQ4 */
/* loaded from: classes4.dex */
public final class CQ4 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f4056a;

    /* renamed from: b */
    public final DateTime f4057b;

    /* renamed from: c */
    public final DateTime f4058c;

    /* renamed from: d */
    public final String f4059d;

    /* renamed from: e */
    public final String f4060e;

    /* renamed from: f */
    public final String f4061f;

    /* renamed from: g */
    public final Boolean f4062g;

    /* renamed from: h */
    public final Long f4063h;

    /* renamed from: i */
    public final String f4064i;

    /* renamed from: j */
    public final Double f4065j;

    /* renamed from: k */
    public final Double f4066k;

    /* renamed from: l */
    public final Double f4067l;

    /* renamed from: m */
    public final Boolean f4068m;

    /* renamed from: n */
    public final Double f4069n;

    /* renamed from: o */
    public final Double f4070o;

    /* renamed from: p */
    public final Double f4071p;

    /* renamed from: q */
    public final Boolean f4072q;

    /* renamed from: r */
    public final Double f4073r;

    /* renamed from: s */
    public final Double f4074s;

    /* renamed from: t */
    public final Double f4075t;

    /* renamed from: u */
    public final Boolean f4076u;

    public CQ4(String eventId, DateTime eventTime, DateTime clientTime, String rideId, String str, String str2, Boolean bool, Long l, String str3, Double d, Double d2, Double d3, Boolean bool2, Double d4, Double d5, Double d6, Boolean bool3, Double d7, Double d8, Double d9, Boolean bool4) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        this.f4056a = eventId;
        this.f4057b = eventTime;
        this.f4058c = clientTime;
        this.f4059d = rideId;
        this.f4060e = str;
        this.f4061f = str2;
        this.f4062g = bool;
        this.f4063h = l;
        this.f4064i = str3;
        this.f4065j = d;
        this.f4066k = d2;
        this.f4067l = d3;
        this.f4068m = bool2;
        this.f4069n = d4;
        this.f4070o = d5;
        this.f4071p = d6;
        this.f4072q = bool3;
        this.f4073r = d7;
        this.f4074s = d8;
        this.f4075t = d9;
        this.f4076u = bool4;
    }

    /* renamed from: a */
    public final CQ4 m112241a(String eventId, DateTime eventTime, DateTime clientTime, String rideId, String str, String str2, Boolean bool, Long l, String str3, Double d, Double d2, Double d3, Boolean bool2, Double d4, Double d5, Double d6, Boolean bool3, Double d7, Double d8, Double d9, Boolean bool4) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        return new CQ4(eventId, eventTime, clientTime, rideId, str, str2, bool, l, str3, d, d2, d3, bool2, d4, d5, d6, bool3, d7, d8, d9, bool4);
    }

    /* renamed from: b */
    public final String m112240b() {
        return this.f4064i;
    }

    /* renamed from: c */
    public final String m112239c() {
        return this.f4060e;
    }

    /* renamed from: d */
    public final String m112238d() {
        return this.f4061f;
    }

    /* renamed from: e */
    public final String m112237e() {
        return this.f4059d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CQ4) {
            CQ4 cq4 = (CQ4) obj;
            return Intrinsics.areEqual(this.f4056a, cq4.f4056a) && Intrinsics.areEqual(this.f4057b, cq4.f4057b) && Intrinsics.areEqual(this.f4058c, cq4.f4058c) && Intrinsics.areEqual(this.f4059d, cq4.f4059d) && Intrinsics.areEqual(this.f4060e, cq4.f4060e) && Intrinsics.areEqual(this.f4061f, cq4.f4061f) && Intrinsics.areEqual(this.f4062g, cq4.f4062g) && Intrinsics.areEqual(this.f4063h, cq4.f4063h) && Intrinsics.areEqual(this.f4064i, cq4.f4064i) && Intrinsics.areEqual((Object) this.f4065j, (Object) cq4.f4065j) && Intrinsics.areEqual((Object) this.f4066k, (Object) cq4.f4066k) && Intrinsics.areEqual((Object) this.f4067l, (Object) cq4.f4067l) && Intrinsics.areEqual(this.f4068m, cq4.f4068m) && Intrinsics.areEqual((Object) this.f4069n, (Object) cq4.f4069n) && Intrinsics.areEqual((Object) this.f4070o, (Object) cq4.f4070o) && Intrinsics.areEqual((Object) this.f4071p, (Object) cq4.f4071p) && Intrinsics.areEqual(this.f4072q, cq4.f4072q) && Intrinsics.areEqual((Object) this.f4073r, (Object) cq4.f4073r) && Intrinsics.areEqual((Object) this.f4074s, (Object) cq4.f4074s) && Intrinsics.areEqual((Object) this.f4075t, (Object) cq4.f4075t) && Intrinsics.areEqual(this.f4076u, cq4.f4076u);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.RideEndFlowStopped";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f4056a), TuplesKt.m28425to("event_time", this.f4057b), TuplesKt.m28425to("client_time", this.f4058c), TuplesKt.m28425to("ride_id", this.f4059d), TuplesKt.m28425to("last_visited_step", this.f4060e), TuplesKt.m28425to("reason", this.f4061f), TuplesKt.m28425to("is_primary_ride", this.f4062g), TuplesKt.m28425to("concurrent_ride_count", this.f4063h), TuplesKt.m28425to("end_ride_attempt_id", this.f4064i), TuplesKt.m28425to("ar_latitude", this.f4065j), TuplesKt.m28425to("ar_longitude", this.f4066k), TuplesKt.m28425to("ar_accuracy", this.f4067l), TuplesKt.m28425to("ar_location_mocked", this.f4068m), TuplesKt.m28425to("bird_latitude", this.f4069n), TuplesKt.m28425to("bird_longitude", this.f4070o), TuplesKt.m28425to("bird_accuracy", this.f4071p), TuplesKt.m28425to("bird_location_mocked", this.f4072q), TuplesKt.m28425to("gps_latitude", this.f4073r), TuplesKt.m28425to("gps_longitude", this.f4074s), TuplesKt.m28425to("gps_accuracy", this.f4075t), TuplesKt.m28425to("gps_location_mocked", this.f4076u));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((this.f4056a.hashCode() * 31) + this.f4057b.hashCode()) * 31) + this.f4058c.hashCode()) * 31) + this.f4059d.hashCode()) * 31;
        String str = this.f4060e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f4061f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f4062g;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.f4063h;
        int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.f4064i;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d = this.f4065j;
        int hashCode7 = (hashCode6 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f4066k;
        int hashCode8 = (hashCode7 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.f4067l;
        int hashCode9 = (hashCode8 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Boolean bool2 = this.f4068m;
        int hashCode10 = (hashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Double d4 = this.f4069n;
        int hashCode11 = (hashCode10 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.f4070o;
        int hashCode12 = (hashCode11 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.f4071p;
        int hashCode13 = (hashCode12 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Boolean bool3 = this.f4072q;
        int hashCode14 = (hashCode13 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Double d7 = this.f4073r;
        int hashCode15 = (hashCode14 + (d7 == null ? 0 : d7.hashCode())) * 31;
        Double d8 = this.f4074s;
        int hashCode16 = (hashCode15 + (d8 == null ? 0 : d8.hashCode())) * 31;
        Double d9 = this.f4075t;
        int hashCode17 = (hashCode16 + (d9 == null ? 0 : d9.hashCode())) * 31;
        Boolean bool4 = this.f4076u;
        return hashCode17 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public String toString() {
        String str = this.f4056a;
        DateTime dateTime = this.f4057b;
        DateTime dateTime2 = this.f4058c;
        String str2 = this.f4059d;
        String str3 = this.f4060e;
        String str4 = this.f4061f;
        Boolean bool = this.f4062g;
        Long l = this.f4063h;
        String str5 = this.f4064i;
        Double d = this.f4065j;
        Double d2 = this.f4066k;
        Double d3 = this.f4067l;
        Boolean bool2 = this.f4068m;
        Double d4 = this.f4069n;
        Double d5 = this.f4070o;
        Double d6 = this.f4071p;
        Boolean bool3 = this.f4072q;
        Double d7 = this.f4073r;
        Double d8 = this.f4074s;
        Double d9 = this.f4075t;
        Boolean bool4 = this.f4076u;
        return "RideEndFlowStopped(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", rideId=" + str2 + ", lastVisitedStep=" + str3 + ", reason=" + str4 + ", isPrimaryRide=" + bool + ", concurrentRideCount=" + l + ", endRideAttemptId=" + str5 + ", arLatitude=" + d + ", arLongitude=" + d2 + ", arAccuracy=" + d3 + ", arLocationMocked=" + bool2 + ", birdLatitude=" + d4 + ", birdLongitude=" + d5 + ", birdAccuracy=" + d6 + ", birdLocationMocked=" + bool3 + ", gpsLatitude=" + d7 + ", gpsLongitude=" + d8 + ", gpsAccuracy=" + d9 + ", gpsLocationMocked=" + bool4 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CQ4(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, Boolean bool, Long l, String str5, Double d, Double d2, Double d3, Boolean bool2, Double d4, Double d5, Double d6, Boolean bool3, Double d7, Double d8, Double d9, Boolean bool4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : l, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : d, (i & 1024) != 0 ? null : d2, (i & 2048) != 0 ? null : d3, (i & 4096) != 0 ? null : bool2, (i & 8192) != 0 ? null : d4, (i & 16384) != 0 ? null : d5, (32768 & i) != 0 ? null : d6, (65536 & i) != 0 ? null : bool3, (131072 & i) != 0 ? null : d7, (262144 & i) != 0 ? null : d8, (524288 & i) != 0 ? null : d9, (i & 1048576) != 0 ? null : bool4);
        String str6;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str6 = uuid;
        } else {
            str6 = str;
        }
        if ((i & 2) != 0) {
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            dateTime3 = now;
        } else {
            dateTime3 = dateTime;
        }
        if ((i & 4) != 0) {
            DateTime now2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now2, "now()");
            dateTime4 = now2;
        } else {
            dateTime4 = dateTime2;
        }
    }
}
