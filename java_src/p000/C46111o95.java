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
import okhttp3.internal.http2.Http2Connection;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b=\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\bi\u0010jJ¤\u0002\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001fHÆ\u0001¢\u0006\u0004\b!\u0010\"J\t\u0010#\u001a\u00020\u0002HÖ\u0001J\t\u0010$\u001a\u00020\rHÖ\u0001J\u0013\u0010'\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010(\u001a\u0004\b2\u0010*R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010(\u001a\u0004\b4\u0010*R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b5\u0010(\u001a\u0004\b6\u0010*R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b7\u0010(\u001a\u0004\b8\u0010*R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b\f\u0010;R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b@\u0010:\u001a\u0004\b\u000f\u0010;R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bA\u0010:\u001a\u0004\b\u0010\u0010;R\u0017\u0010\u0011\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bB\u0010:\u001a\u0004\b\u0011\u0010;R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bC\u0010(\u001a\u0004\bD\u0010*R\u0017\u0010\u0013\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bE\u0010:\u001a\u0004\b\u0013\u0010;R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bF\u0010(\u001a\u0004\bG\u0010*R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bP\u0010M\u001a\u0004\bQ\u0010OR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bR\u0010M\u001a\u0004\bS\u0010OR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bT\u0010M\u001a\u0004\bU\u0010OR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bV\u0010M\u001a\u0004\bW\u0010OR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bX\u0010M\u001a\u0004\bY\u0010OR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\bZ\u0010=\u001a\u0004\b[\u0010?R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b\u001e\u0010^R\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\"\u0010f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010%0c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0014\u0010h\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bg\u0010*¨\u0006k"}, m28432d2 = {"Lo95;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "areaId", "rideId", "label", "title", "", "isAreasMerged", "", "areaMaxSpeed", "isNoParking", "isNoRide", "isOperational", "partnerId", "isPreferredParking", "zoneId", "", "timeInArea", "clientLastTrackLatitude", "clientLastTrackLongitude", "clientLastTrackHeading", "clientLastTrackSpeed", "clientLastTrackAltitude", "clientLastTrackAccuracy", "clientLastTrackMaxSpeedResponse", "isPrimaryRide", "", "concurrentRideCount", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;ZZZLjava/lang/String;ZLjava/lang/String;DLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Long;)Lo95;", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getAreaId", "e", "getRideId", "f", "getLabel", "g", "getTitle", "h", "Z", "()Z", "i", "Ljava/lang/Integer;", "getAreaMaxSpeed", "()Ljava/lang/Integer;", "j", "k", "l", "m", "getPartnerId", "n", "o", "getZoneId", "p", "D", "getTimeInArea", "()D", "q", "Ljava/lang/Double;", "getClientLastTrackLatitude", "()Ljava/lang/Double;", "r", "getClientLastTrackLongitude", "s", "getClientLastTrackHeading", "t", "getClientLastTrackSpeed", "u", "getClientLastTrackAltitude", "v", "getClientLastTrackAccuracy", "w", "getClientLastTrackMaxSpeedResponse", "x", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "y", "Ljava/lang/Long;", "getConcurrentRideCount", "()Ljava/lang/Long;", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;ZZZLjava/lang/String;ZLjava/lang/String;DLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Long;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: o95  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C46111o95 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f101501a;

    /* renamed from: b */
    public final DateTime f101502b;

    /* renamed from: c */
    public final DateTime f101503c;

    /* renamed from: d */
    public final String f101504d;

    /* renamed from: e */
    public final String f101505e;

    /* renamed from: f */
    public final String f101506f;

    /* renamed from: g */
    public final String f101507g;

    /* renamed from: h */
    public final boolean f101508h;

    /* renamed from: i */
    public final Integer f101509i;

    /* renamed from: j */
    public final boolean f101510j;

    /* renamed from: k */
    public final boolean f101511k;

    /* renamed from: l */
    public final boolean f101512l;

    /* renamed from: m */
    public final String f101513m;

    /* renamed from: n */
    public final boolean f101514n;

    /* renamed from: o */
    public final String f101515o;

    /* renamed from: p */
    public final double f101516p;

    /* renamed from: q */
    public final Double f101517q;

    /* renamed from: r */
    public final Double f101518r;

    /* renamed from: s */
    public final Double f101519s;

    /* renamed from: t */
    public final Double f101520t;

    /* renamed from: u */
    public final Double f101521u;

    /* renamed from: v */
    public final Double f101522v;

    /* renamed from: w */
    public final Integer f101523w;

    /* renamed from: x */
    public final Boolean f101524x;

    /* renamed from: y */
    public final Long f101525y;

    public C46111o95(String eventId, DateTime eventTime, DateTime clientTime, String areaId, String rideId, String str, String str2, boolean z, Integer num, boolean z2, boolean z3, boolean z4, String partnerId, boolean z5, String str3, double d, Double d2, Double d3, Double d4, Double d5, Double d6, Double d7, Integer num2, Boolean bool, Long l) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(areaId, "areaId");
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        Intrinsics.checkNotNullParameter(partnerId, "partnerId");
        this.f101501a = eventId;
        this.f101502b = eventTime;
        this.f101503c = clientTime;
        this.f101504d = areaId;
        this.f101505e = rideId;
        this.f101506f = str;
        this.f101507g = str2;
        this.f101508h = z;
        this.f101509i = num;
        this.f101510j = z2;
        this.f101511k = z3;
        this.f101512l = z4;
        this.f101513m = partnerId;
        this.f101514n = z5;
        this.f101515o = str3;
        this.f101516p = d;
        this.f101517q = d2;
        this.f101518r = d3;
        this.f101519s = d4;
        this.f101520t = d5;
        this.f101521u = d6;
        this.f101522v = d7;
        this.f101523w = num2;
        this.f101524x = bool;
        this.f101525y = l;
    }

    /* renamed from: a */
    public final C46111o95 m21709a(String eventId, DateTime eventTime, DateTime clientTime, String areaId, String rideId, String str, String str2, boolean z, Integer num, boolean z2, boolean z3, boolean z4, String partnerId, boolean z5, String str3, double d, Double d2, Double d3, Double d4, Double d5, Double d6, Double d7, Integer num2, Boolean bool, Long l) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(areaId, "areaId");
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        Intrinsics.checkNotNullParameter(partnerId, "partnerId");
        return new C46111o95(eventId, eventTime, clientTime, areaId, rideId, str, str2, z, num, z2, z3, z4, partnerId, z5, str3, d, d2, d3, d4, d5, d6, d7, num2, bool, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C46111o95) {
            C46111o95 c46111o95 = (C46111o95) obj;
            return Intrinsics.areEqual(this.f101501a, c46111o95.f101501a) && Intrinsics.areEqual(this.f101502b, c46111o95.f101502b) && Intrinsics.areEqual(this.f101503c, c46111o95.f101503c) && Intrinsics.areEqual(this.f101504d, c46111o95.f101504d) && Intrinsics.areEqual(this.f101505e, c46111o95.f101505e) && Intrinsics.areEqual(this.f101506f, c46111o95.f101506f) && Intrinsics.areEqual(this.f101507g, c46111o95.f101507g) && this.f101508h == c46111o95.f101508h && Intrinsics.areEqual(this.f101509i, c46111o95.f101509i) && this.f101510j == c46111o95.f101510j && this.f101511k == c46111o95.f101511k && this.f101512l == c46111o95.f101512l && Intrinsics.areEqual(this.f101513m, c46111o95.f101513m) && this.f101514n == c46111o95.f101514n && Intrinsics.areEqual(this.f101515o, c46111o95.f101515o) && Double.compare(this.f101516p, c46111o95.f101516p) == 0 && Intrinsics.areEqual((Object) this.f101517q, (Object) c46111o95.f101517q) && Intrinsics.areEqual((Object) this.f101518r, (Object) c46111o95.f101518r) && Intrinsics.areEqual((Object) this.f101519s, (Object) c46111o95.f101519s) && Intrinsics.areEqual((Object) this.f101520t, (Object) c46111o95.f101520t) && Intrinsics.areEqual((Object) this.f101521u, (Object) c46111o95.f101521u) && Intrinsics.areEqual((Object) this.f101522v, (Object) c46111o95.f101522v) && Intrinsics.areEqual(this.f101523w, c46111o95.f101523w) && Intrinsics.areEqual(this.f101524x, c46111o95.f101524x) && Intrinsics.areEqual(this.f101525y, c46111o95.f101525y);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.RiderExitedArea";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f101501a), TuplesKt.m28425to("event_time", this.f101502b), TuplesKt.m28425to("client_time", this.f101503c), TuplesKt.m28425to("area_id", this.f101504d), TuplesKt.m28425to("ride_id", this.f101505e), TuplesKt.m28425to("label", this.f101506f), TuplesKt.m28425to("title", this.f101507g), TuplesKt.m28425to("is_areas_merged", Boolean.valueOf(this.f101508h)), TuplesKt.m28425to("area_max_speed", this.f101509i), TuplesKt.m28425to("is_no_parking", Boolean.valueOf(this.f101510j)), TuplesKt.m28425to("is_no_ride", Boolean.valueOf(this.f101511k)), TuplesKt.m28425to("is_operational", Boolean.valueOf(this.f101512l)), TuplesKt.m28425to("partner_id", this.f101513m), TuplesKt.m28425to("is_preferred_parking", Boolean.valueOf(this.f101514n)), TuplesKt.m28425to("zone_id", this.f101515o), TuplesKt.m28425to("time_in_area", Double.valueOf(this.f101516p)), TuplesKt.m28425to("client_last_track_latitude", this.f101517q), TuplesKt.m28425to("client_last_track_longitude", this.f101518r), TuplesKt.m28425to("client_last_track_heading", this.f101519s), TuplesKt.m28425to("client_last_track_speed", this.f101520t), TuplesKt.m28425to("client_last_track_altitude", this.f101521u), TuplesKt.m28425to("client_last_track_accuracy", this.f101522v), TuplesKt.m28425to("client_last_track_max_speed_response", this.f101523w), TuplesKt.m28425to("is_primary_ride", this.f101524x), TuplesKt.m28425to("concurrent_ride_count", this.f101525y));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((this.f101501a.hashCode() * 31) + this.f101502b.hashCode()) * 31) + this.f101503c.hashCode()) * 31) + this.f101504d.hashCode()) * 31) + this.f101505e.hashCode()) * 31;
        String str = this.f101506f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f101507g;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z = this.f101508h;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode3 + i) * 31;
        Integer num = this.f101509i;
        int hashCode4 = (i2 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z2 = this.f101510j;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (hashCode4 + i3) * 31;
        boolean z3 = this.f101511k;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z4 = this.f101512l;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        int hashCode5 = (((i6 + i7) * 31) + this.f101513m.hashCode()) * 31;
        boolean z5 = this.f101514n;
        int i8 = (hashCode5 + (z5 ? 1 : z5 ? 1 : 0)) * 31;
        String str3 = this.f101515o;
        int hashCode6 = (((i8 + (str3 == null ? 0 : str3.hashCode())) * 31) + Double.hashCode(this.f101516p)) * 31;
        Double d = this.f101517q;
        int hashCode7 = (hashCode6 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f101518r;
        int hashCode8 = (hashCode7 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.f101519s;
        int hashCode9 = (hashCode8 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.f101520t;
        int hashCode10 = (hashCode9 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.f101521u;
        int hashCode11 = (hashCode10 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.f101522v;
        int hashCode12 = (hashCode11 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Integer num2 = this.f101523w;
        int hashCode13 = (hashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.f101524x;
        int hashCode14 = (hashCode13 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.f101525y;
        return hashCode14 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        String str = this.f101501a;
        DateTime dateTime = this.f101502b;
        DateTime dateTime2 = this.f101503c;
        String str2 = this.f101504d;
        String str3 = this.f101505e;
        String str4 = this.f101506f;
        String str5 = this.f101507g;
        boolean z = this.f101508h;
        Integer num = this.f101509i;
        boolean z2 = this.f101510j;
        boolean z3 = this.f101511k;
        boolean z4 = this.f101512l;
        String str6 = this.f101513m;
        boolean z5 = this.f101514n;
        String str7 = this.f101515o;
        double d = this.f101516p;
        Double d2 = this.f101517q;
        Double d3 = this.f101518r;
        Double d4 = this.f101519s;
        Double d5 = this.f101520t;
        Double d6 = this.f101521u;
        Double d7 = this.f101522v;
        Integer num2 = this.f101523w;
        Boolean bool = this.f101524x;
        Long l = this.f101525y;
        return "RiderExitedArea(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", areaId=" + str2 + ", rideId=" + str3 + ", label=" + str4 + ", title=" + str5 + ", isAreasMerged=" + z + ", areaMaxSpeed=" + num + ", isNoParking=" + z2 + ", isNoRide=" + z3 + ", isOperational=" + z4 + ", partnerId=" + str6 + ", isPreferredParking=" + z5 + ", zoneId=" + str7 + ", timeInArea=" + d + ", clientLastTrackLatitude=" + d2 + ", clientLastTrackLongitude=" + d3 + ", clientLastTrackHeading=" + d4 + ", clientLastTrackSpeed=" + d5 + ", clientLastTrackAltitude=" + d6 + ", clientLastTrackAccuracy=" + d7 + ", clientLastTrackMaxSpeedResponse=" + num2 + ", isPrimaryRide=" + bool + ", concurrentRideCount=" + l + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C46111o95(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, String str5, boolean z, Integer num, boolean z2, boolean z3, boolean z4, String str6, boolean z5, String str7, double d, Double d2, Double d3, Double d4, Double d5, Double d6, Double d7, Integer num2, Boolean bool, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, str2, str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, z, (i & 256) != 0 ? null : num, z2, z3, z4, str6, z5, (i & 16384) != 0 ? null : str7, d, (65536 & i) != 0 ? null : d2, (131072 & i) != 0 ? null : d3, (262144 & i) != 0 ? null : d4, (524288 & i) != 0 ? null : d5, (1048576 & i) != 0 ? null : d6, (2097152 & i) != 0 ? null : d7, (4194304 & i) != 0 ? null : num2, (8388608 & i) != 0 ? null : bool, (i & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : l);
        String str8;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str8 = uuid;
        } else {
            str8 = str;
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
