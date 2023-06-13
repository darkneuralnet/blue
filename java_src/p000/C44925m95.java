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
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b3\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0081\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b^\u0010_J\u009a\u0002\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÆ\u0001¢\u0006\u0004\b \u0010!J\t\u0010\"\u001a\u00020\u0002HÖ\u0001J\t\u0010#\u001a\u00020\rHÖ\u0001J\u0013\u0010&\u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010'\u001a\u0004\b*\u0010)R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010'\u001a\u0004\b2\u0010)R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b2\u0010'\u001a\u0004\b3\u0010)R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b4\u0010'\u001a\u0004\b5\u0010)R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b\f\u00108R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b.\u0010;R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b<\u00107\u001a\u0004\b\u000f\u00108R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b=\u00107\u001a\u0004\b6\u00108R\u0017\u0010\u0011\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b>\u00107\u001a\u0004\b\u0011\u00108R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u0010'\u001a\u0004\b1\u0010)R\u0017\u0010\u0013\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b@\u00107\u001a\u0004\b\u0013\u00108R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bA\u0010'\u001a\u0004\b4\u0010)R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bF\u0010C\u001a\u0004\bG\u0010ER\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bH\u0010C\u001a\u0004\bI\u0010ER\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bJ\u0010C\u001a\u0004\bK\u0010ER\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bL\u0010C\u001a\u0004\bM\u0010ER\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bN\u0010C\u001a\u0004\bO\u0010ER\u0019\u0010\u001c\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\bP\u0010:\u001a\u0004\bQ\u0010;R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\b9\u0010TR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\b0\u0010WR\"\u0010[\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010$0X8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0014\u0010]\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010)¨\u0006`"}, m28432d2 = {"Lm95;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "areaId", "rideId", "label", "title", "", "isAreasMerged", "", "areaMaxSpeed", "isNoParking", "isNoRide", "isOperational", "partnerId", "isPreferredParking", "zoneId", "", "clientLastTrackLatitude", "clientLastTrackLongitude", "clientLastTrackHeading", "clientLastTrackSpeed", "clientLastTrackAltitude", "clientLastTrackAccuracy", "clientLastTrackMaxSpeedResponse", "isPrimaryRide", "", "concurrentRideCount", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;ZZZLjava/lang/String;ZLjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Long;)Lm95;", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "e", "f", "getLabel", "g", "getTitle", "h", "Z", "()Z", "i", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "j", "k", "l", "m", "n", "o", "p", "Ljava/lang/Double;", "getClientLastTrackLatitude", "()Ljava/lang/Double;", "q", "getClientLastTrackLongitude", "r", "getClientLastTrackHeading", "s", "getClientLastTrackSpeed", "t", "getClientLastTrackAltitude", "u", "getClientLastTrackAccuracy", "v", "getClientLastTrackMaxSpeedResponse", "w", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "x", "Ljava/lang/Long;", "()Ljava/lang/Long;", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;ZZZLjava/lang/String;ZLjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Long;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: m95  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44925m95 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f97427a;

    /* renamed from: b */
    public final DateTime f97428b;

    /* renamed from: c */
    public final DateTime f97429c;

    /* renamed from: d */
    public final String f97430d;

    /* renamed from: e */
    public final String f97431e;

    /* renamed from: f */
    public final String f97432f;

    /* renamed from: g */
    public final String f97433g;

    /* renamed from: h */
    public final boolean f97434h;

    /* renamed from: i */
    public final Integer f97435i;

    /* renamed from: j */
    public final boolean f97436j;

    /* renamed from: k */
    public final boolean f97437k;

    /* renamed from: l */
    public final boolean f97438l;

    /* renamed from: m */
    public final String f97439m;

    /* renamed from: n */
    public final boolean f97440n;

    /* renamed from: o */
    public final String f97441o;

    /* renamed from: p */
    public final Double f97442p;

    /* renamed from: q */
    public final Double f97443q;

    /* renamed from: r */
    public final Double f97444r;

    /* renamed from: s */
    public final Double f97445s;

    /* renamed from: t */
    public final Double f97446t;

    /* renamed from: u */
    public final Double f97447u;

    /* renamed from: v */
    public final Integer f97448v;

    /* renamed from: w */
    public final Boolean f97449w;

    /* renamed from: x */
    public final Long f97450x;

    public C44925m95(String eventId, DateTime eventTime, DateTime clientTime, String areaId, String rideId, String str, String str2, boolean z, Integer num, boolean z2, boolean z3, boolean z4, String partnerId, boolean z5, String str3, Double d, Double d2, Double d3, Double d4, Double d5, Double d6, Integer num2, Boolean bool, Long l) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(areaId, "areaId");
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        Intrinsics.checkNotNullParameter(partnerId, "partnerId");
        this.f97427a = eventId;
        this.f97428b = eventTime;
        this.f97429c = clientTime;
        this.f97430d = areaId;
        this.f97431e = rideId;
        this.f97432f = str;
        this.f97433g = str2;
        this.f97434h = z;
        this.f97435i = num;
        this.f97436j = z2;
        this.f97437k = z3;
        this.f97438l = z4;
        this.f97439m = partnerId;
        this.f97440n = z5;
        this.f97441o = str3;
        this.f97442p = d;
        this.f97443q = d2;
        this.f97444r = d3;
        this.f97445s = d4;
        this.f97446t = d5;
        this.f97447u = d6;
        this.f97448v = num2;
        this.f97449w = bool;
        this.f97450x = l;
    }

    /* renamed from: a */
    public final C44925m95 m26246a(String eventId, DateTime eventTime, DateTime clientTime, String areaId, String rideId, String str, String str2, boolean z, Integer num, boolean z2, boolean z3, boolean z4, String partnerId, boolean z5, String str3, Double d, Double d2, Double d3, Double d4, Double d5, Double d6, Integer num2, Boolean bool, Long l) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(areaId, "areaId");
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        Intrinsics.checkNotNullParameter(partnerId, "partnerId");
        return new C44925m95(eventId, eventTime, clientTime, areaId, rideId, str, str2, z, num, z2, z3, z4, partnerId, z5, str3, d, d2, d3, d4, d5, d6, num2, bool, l);
    }

    /* renamed from: b */
    public final String m26245b() {
        return this.f97430d;
    }

    /* renamed from: c */
    public final Integer m26244c() {
        return this.f97435i;
    }

    /* renamed from: d */
    public final Long m26243d() {
        return this.f97450x;
    }

    /* renamed from: e */
    public final String m26242e() {
        return this.f97439m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C44925m95) {
            C44925m95 c44925m95 = (C44925m95) obj;
            return Intrinsics.areEqual(this.f97427a, c44925m95.f97427a) && Intrinsics.areEqual(this.f97428b, c44925m95.f97428b) && Intrinsics.areEqual(this.f97429c, c44925m95.f97429c) && Intrinsics.areEqual(this.f97430d, c44925m95.f97430d) && Intrinsics.areEqual(this.f97431e, c44925m95.f97431e) && Intrinsics.areEqual(this.f97432f, c44925m95.f97432f) && Intrinsics.areEqual(this.f97433g, c44925m95.f97433g) && this.f97434h == c44925m95.f97434h && Intrinsics.areEqual(this.f97435i, c44925m95.f97435i) && this.f97436j == c44925m95.f97436j && this.f97437k == c44925m95.f97437k && this.f97438l == c44925m95.f97438l && Intrinsics.areEqual(this.f97439m, c44925m95.f97439m) && this.f97440n == c44925m95.f97440n && Intrinsics.areEqual(this.f97441o, c44925m95.f97441o) && Intrinsics.areEqual((Object) this.f97442p, (Object) c44925m95.f97442p) && Intrinsics.areEqual((Object) this.f97443q, (Object) c44925m95.f97443q) && Intrinsics.areEqual((Object) this.f97444r, (Object) c44925m95.f97444r) && Intrinsics.areEqual((Object) this.f97445s, (Object) c44925m95.f97445s) && Intrinsics.areEqual((Object) this.f97446t, (Object) c44925m95.f97446t) && Intrinsics.areEqual((Object) this.f97447u, (Object) c44925m95.f97447u) && Intrinsics.areEqual(this.f97448v, c44925m95.f97448v) && Intrinsics.areEqual(this.f97449w, c44925m95.f97449w) && Intrinsics.areEqual(this.f97450x, c44925m95.f97450x);
        }
        return false;
    }

    /* renamed from: f */
    public final String m26241f() {
        return this.f97431e;
    }

    /* renamed from: g */
    public final String m26240g() {
        return this.f97441o;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.RiderEnteredArea";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f97427a), TuplesKt.m28425to("event_time", this.f97428b), TuplesKt.m28425to("client_time", this.f97429c), TuplesKt.m28425to("area_id", this.f97430d), TuplesKt.m28425to("ride_id", this.f97431e), TuplesKt.m28425to("label", this.f97432f), TuplesKt.m28425to("title", this.f97433g), TuplesKt.m28425to("is_areas_merged", Boolean.valueOf(this.f97434h)), TuplesKt.m28425to("area_max_speed", this.f97435i), TuplesKt.m28425to("is_no_parking", Boolean.valueOf(this.f97436j)), TuplesKt.m28425to("is_no_ride", Boolean.valueOf(this.f97437k)), TuplesKt.m28425to("is_operational", Boolean.valueOf(this.f97438l)), TuplesKt.m28425to("partner_id", this.f97439m), TuplesKt.m28425to("is_preferred_parking", Boolean.valueOf(this.f97440n)), TuplesKt.m28425to("zone_id", this.f97441o), TuplesKt.m28425to("client_last_track_latitude", this.f97442p), TuplesKt.m28425to("client_last_track_longitude", this.f97443q), TuplesKt.m28425to("client_last_track_heading", this.f97444r), TuplesKt.m28425to("client_last_track_speed", this.f97445s), TuplesKt.m28425to("client_last_track_altitude", this.f97446t), TuplesKt.m28425to("client_last_track_accuracy", this.f97447u), TuplesKt.m28425to("client_last_track_max_speed_response", this.f97448v), TuplesKt.m28425to("is_primary_ride", this.f97449w), TuplesKt.m28425to("concurrent_ride_count", this.f97450x));
        return mapOf;
    }

    /* renamed from: h */
    public final boolean m26239h() {
        return this.f97437k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((this.f97427a.hashCode() * 31) + this.f97428b.hashCode()) * 31) + this.f97429c.hashCode()) * 31) + this.f97430d.hashCode()) * 31) + this.f97431e.hashCode()) * 31;
        String str = this.f97432f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f97433g;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z = this.f97434h;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode3 + i) * 31;
        Integer num = this.f97435i;
        int hashCode4 = (i2 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z2 = this.f97436j;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (hashCode4 + i3) * 31;
        boolean z3 = this.f97437k;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z4 = this.f97438l;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        int hashCode5 = (((i6 + i7) * 31) + this.f97439m.hashCode()) * 31;
        boolean z5 = this.f97440n;
        int i8 = (hashCode5 + (z5 ? 1 : z5 ? 1 : 0)) * 31;
        String str3 = this.f97441o;
        int hashCode6 = (i8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d = this.f97442p;
        int hashCode7 = (hashCode6 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f97443q;
        int hashCode8 = (hashCode7 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.f97444r;
        int hashCode9 = (hashCode8 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.f97445s;
        int hashCode10 = (hashCode9 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.f97446t;
        int hashCode11 = (hashCode10 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.f97447u;
        int hashCode12 = (hashCode11 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Integer num2 = this.f97448v;
        int hashCode13 = (hashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.f97449w;
        int hashCode14 = (hashCode13 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.f97450x;
        return hashCode14 + (l != null ? l.hashCode() : 0);
    }

    /* renamed from: i */
    public final Boolean m26238i() {
        return this.f97449w;
    }

    public String toString() {
        String str = this.f97427a;
        DateTime dateTime = this.f97428b;
        DateTime dateTime2 = this.f97429c;
        String str2 = this.f97430d;
        String str3 = this.f97431e;
        String str4 = this.f97432f;
        String str5 = this.f97433g;
        boolean z = this.f97434h;
        Integer num = this.f97435i;
        boolean z2 = this.f97436j;
        boolean z3 = this.f97437k;
        boolean z4 = this.f97438l;
        String str6 = this.f97439m;
        boolean z5 = this.f97440n;
        String str7 = this.f97441o;
        Double d = this.f97442p;
        Double d2 = this.f97443q;
        Double d3 = this.f97444r;
        Double d4 = this.f97445s;
        Double d5 = this.f97446t;
        Double d6 = this.f97447u;
        Integer num2 = this.f97448v;
        Boolean bool = this.f97449w;
        Long l = this.f97450x;
        return "RiderEnteredArea(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", areaId=" + str2 + ", rideId=" + str3 + ", label=" + str4 + ", title=" + str5 + ", isAreasMerged=" + z + ", areaMaxSpeed=" + num + ", isNoParking=" + z2 + ", isNoRide=" + z3 + ", isOperational=" + z4 + ", partnerId=" + str6 + ", isPreferredParking=" + z5 + ", zoneId=" + str7 + ", clientLastTrackLatitude=" + d + ", clientLastTrackLongitude=" + d2 + ", clientLastTrackHeading=" + d3 + ", clientLastTrackSpeed=" + d4 + ", clientLastTrackAltitude=" + d5 + ", clientLastTrackAccuracy=" + d6 + ", clientLastTrackMaxSpeedResponse=" + num2 + ", isPrimaryRide=" + bool + ", concurrentRideCount=" + l + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C44925m95(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, String str5, boolean z, Integer num, boolean z2, boolean z3, boolean z4, String str6, boolean z5, String str7, Double d, Double d2, Double d3, Double d4, Double d5, Double d6, Integer num2, Boolean bool, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, str2, str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, z, (i & 256) != 0 ? null : num, z2, z3, z4, str6, z5, (i & 16384) != 0 ? null : str7, (32768 & i) != 0 ? null : d, (65536 & i) != 0 ? null : d2, (131072 & i) != 0 ? null : d3, (262144 & i) != 0 ? null : d4, (524288 & i) != 0 ? null : d5, (1048576 & i) != 0 ? null : d6, (2097152 & i) != 0 ? null : num2, (4194304 & i) != 0 ? null : bool, (i & 8388608) != 0 ? null : l);
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
