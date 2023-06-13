package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.analytics.AnalyticsEvent;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b?\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0085\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0018\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u001d\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bk\u0010lJ¢\u0002\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00182\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u001d\u001a\u00020\u00072\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\t\u0010\"\u001a\u00020\u0002HÖ\u0001J\t\u0010$\u001a\u00020#HÖ\u0001J\u0013\u0010'\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b6\u00104R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b7\u0010(\u001a\u0004\b8\u0010*R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u0010(\u001a\u0004\b:\u0010*R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bC\u0010<\u001a\u0004\bD\u0010>R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bE\u0010<\u001a\u0004\bF\u0010>R\u0017\u0010\u0012\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bG\u0010<\u001a\u0004\bH\u0010>R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bI\u0010(\u001a\u0004\bJ\u0010*R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bK\u0010(\u001a\u0004\bL\u0010*R\u0017\u0010\u0015\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bM\u00102\u001a\u0004\bN\u00104R\u0017\u0010\u0016\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bO\u0010<\u001a\u0004\bP\u0010>R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bQ\u0010,\u001a\u0004\bR\u0010.R\u001f\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u001f\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bW\u0010T\u001a\u0004\bX\u0010VR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b\u001b\u0010[R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u0017\u0010\u001d\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b`\u00102\u001a\u0004\b\u001d\u00104R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\ba\u0010(\u001a\u0004\bb\u0010*R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bc\u0010(\u001a\u0004\bd\u0010*R\"\u0010h\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010%0e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0014\u0010j\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bi\u0010*¨\u0006m"}, m28432d2 = {"LBQ4;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "", "birdIsBluetooth", "birdIsCellular", "birdModel", "currency", "", "distanceInMeters", "", "durationInSeconds", "minimumRidePrice", "minutePrice", "minutesIncluded", "partnerId", "rideId", "hasSalesTax", "startPrice", "startTime", "", "areaIds", "timeInAreas", "isPrimaryRide", "concurrentRideCount", "isPhotoRequired", "endRideAttemptId", "insideNestId", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZZLjava/lang/String;Ljava/lang/String;JLjava/lang/Double;JJJLjava/lang/String;Ljava/lang/String;ZJLorg/joda/time/DateTime;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Long;ZLjava/lang/String;Ljava/lang/String;)LBQ4;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "Z", "getBirdIsBluetooth", "()Z", "e", "getBirdIsCellular", "f", "getBirdModel", "g", "getCurrency", "h", "J", "getDistanceInMeters", "()J", "i", "Ljava/lang/Double;", "getDurationInSeconds", "()Ljava/lang/Double;", "j", "getMinimumRidePrice", "k", "getMinutePrice", "l", "getMinutesIncluded", "m", "getPartnerId", "n", "getRideId", "o", "getHasSalesTax", "p", "getStartPrice", "q", "getStartTime", "r", "Ljava/util/List;", "getAreaIds", "()Ljava/util/List;", "s", "getTimeInAreas", "t", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "u", "Ljava/lang/Long;", "getConcurrentRideCount", "()Ljava/lang/Long;", "v", "w", "getEndRideAttemptId", "x", "getInsideNestId", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZZLjava/lang/String;Ljava/lang/String;JLjava/lang/Double;JJJLjava/lang/String;Ljava/lang/String;ZJLorg/joda/time/DateTime;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Long;ZLjava/lang/String;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: BQ4 */
/* loaded from: classes4.dex */
public final class BQ4 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f2282a;

    /* renamed from: b */
    public final DateTime f2283b;

    /* renamed from: c */
    public final DateTime f2284c;

    /* renamed from: d */
    public final boolean f2285d;

    /* renamed from: e */
    public final boolean f2286e;

    /* renamed from: f */
    public final String f2287f;

    /* renamed from: g */
    public final String f2288g;

    /* renamed from: h */
    public final long f2289h;

    /* renamed from: i */
    public final Double f2290i;

    /* renamed from: j */
    public final long f2291j;

    /* renamed from: k */
    public final long f2292k;

    /* renamed from: l */
    public final long f2293l;

    /* renamed from: m */
    public final String f2294m;

    /* renamed from: n */
    public final String f2295n;

    /* renamed from: o */
    public final boolean f2296o;

    /* renamed from: p */
    public final long f2297p;

    /* renamed from: q */
    public final DateTime f2298q;

    /* renamed from: r */
    public final List<String> f2299r;

    /* renamed from: s */
    public final List<Double> f2300s;

    /* renamed from: t */
    public final Boolean f2301t;

    /* renamed from: u */
    public final Long f2302u;

    /* renamed from: v */
    public final boolean f2303v;

    /* renamed from: w */
    public final String f2304w;

    /* renamed from: x */
    public final String f2305x;

    public BQ4(String eventId, DateTime eventTime, DateTime clientTime, boolean z, boolean z2, String str, String currency, long j, Double d, long j2, long j3, long j4, String str2, String str3, boolean z3, long j5, DateTime dateTime, List<String> list, List<Double> list2, Boolean bool, Long l, boolean z4, String str4, String str5) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f2282a = eventId;
        this.f2283b = eventTime;
        this.f2284c = clientTime;
        this.f2285d = z;
        this.f2286e = z2;
        this.f2287f = str;
        this.f2288g = currency;
        this.f2289h = j;
        this.f2290i = d;
        this.f2291j = j2;
        this.f2292k = j3;
        this.f2293l = j4;
        this.f2294m = str2;
        this.f2295n = str3;
        this.f2296o = z3;
        this.f2297p = j5;
        this.f2298q = dateTime;
        this.f2299r = list;
        this.f2300s = list2;
        this.f2301t = bool;
        this.f2302u = l;
        this.f2303v = z4;
        this.f2304w = str4;
        this.f2305x = str5;
    }

    /* renamed from: a */
    public final BQ4 m114044a(String eventId, DateTime eventTime, DateTime clientTime, boolean z, boolean z2, String str, String currency, long j, Double d, long j2, long j3, long j4, String str2, String str3, boolean z3, long j5, DateTime dateTime, List<String> list, List<Double> list2, Boolean bool, Long l, boolean z4, String str4, String str5) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new BQ4(eventId, eventTime, clientTime, z, z2, str, currency, j, d, j2, j3, j4, str2, str3, z3, j5, dateTime, list, list2, bool, l, z4, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BQ4) {
            BQ4 bq4 = (BQ4) obj;
            return Intrinsics.areEqual(this.f2282a, bq4.f2282a) && Intrinsics.areEqual(this.f2283b, bq4.f2283b) && Intrinsics.areEqual(this.f2284c, bq4.f2284c) && this.f2285d == bq4.f2285d && this.f2286e == bq4.f2286e && Intrinsics.areEqual(this.f2287f, bq4.f2287f) && Intrinsics.areEqual(this.f2288g, bq4.f2288g) && this.f2289h == bq4.f2289h && Intrinsics.areEqual((Object) this.f2290i, (Object) bq4.f2290i) && this.f2291j == bq4.f2291j && this.f2292k == bq4.f2292k && this.f2293l == bq4.f2293l && Intrinsics.areEqual(this.f2294m, bq4.f2294m) && Intrinsics.areEqual(this.f2295n, bq4.f2295n) && this.f2296o == bq4.f2296o && this.f2297p == bq4.f2297p && Intrinsics.areEqual(this.f2298q, bq4.f2298q) && Intrinsics.areEqual(this.f2299r, bq4.f2299r) && Intrinsics.areEqual(this.f2300s, bq4.f2300s) && Intrinsics.areEqual(this.f2301t, bq4.f2301t) && Intrinsics.areEqual(this.f2302u, bq4.f2302u) && this.f2303v == bq4.f2303v && Intrinsics.areEqual(this.f2304w, bq4.f2304w) && Intrinsics.areEqual(this.f2305x, bq4.f2305x);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.RideEndFlowStarted";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f2282a), TuplesKt.m28425to("event_time", this.f2283b), TuplesKt.m28425to("client_time", this.f2284c), TuplesKt.m28425to("bird_is_bluetooth", Boolean.valueOf(this.f2285d)), TuplesKt.m28425to("bird_is_cellular", Boolean.valueOf(this.f2286e)), TuplesKt.m28425to("bird_model", this.f2287f), TuplesKt.m28425to("currency", this.f2288g), TuplesKt.m28425to("distance_in_meters", Long.valueOf(this.f2289h)), TuplesKt.m28425to("duration_in_seconds", this.f2290i), TuplesKt.m28425to("minimum_ride_price", Long.valueOf(this.f2291j)), TuplesKt.m28425to("minute_price", Long.valueOf(this.f2292k)), TuplesKt.m28425to("minutes_included", Long.valueOf(this.f2293l)), TuplesKt.m28425to("partner_id", this.f2294m), TuplesKt.m28425to("ride_id", this.f2295n), TuplesKt.m28425to("has_sales_tax", Boolean.valueOf(this.f2296o)), TuplesKt.m28425to("start_price", Long.valueOf(this.f2297p)), TuplesKt.m28425to("start_time", this.f2298q), TuplesKt.m28425to("area_ids", this.f2299r), TuplesKt.m28425to("time_in_areas", this.f2300s), TuplesKt.m28425to("is_primary_ride", this.f2301t), TuplesKt.m28425to("concurrent_ride_count", this.f2302u), TuplesKt.m28425to("is_photo_required", Boolean.valueOf(this.f2303v)), TuplesKt.m28425to("end_ride_attempt_id", this.f2304w), TuplesKt.m28425to("inside_nest_id", this.f2305x));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f2282a.hashCode() * 31) + this.f2283b.hashCode()) * 31) + this.f2284c.hashCode()) * 31;
        boolean z = this.f2285d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.f2286e;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        String str = this.f2287f;
        int hashCode2 = (((((i4 + (str == null ? 0 : str.hashCode())) * 31) + this.f2288g.hashCode()) * 31) + Long.hashCode(this.f2289h)) * 31;
        Double d = this.f2290i;
        int hashCode3 = (((((((hashCode2 + (d == null ? 0 : d.hashCode())) * 31) + Long.hashCode(this.f2291j)) * 31) + Long.hashCode(this.f2292k)) * 31) + Long.hashCode(this.f2293l)) * 31;
        String str2 = this.f2294m;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f2295n;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z3 = this.f2296o;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int hashCode6 = (((hashCode5 + i5) * 31) + Long.hashCode(this.f2297p)) * 31;
        DateTime dateTime = this.f2298q;
        int hashCode7 = (hashCode6 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        List<String> list = this.f2299r;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        List<Double> list2 = this.f2300s;
        int hashCode9 = (hashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.f2301t;
        int hashCode10 = (hashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.f2302u;
        int hashCode11 = (hashCode10 + (l == null ? 0 : l.hashCode())) * 31;
        boolean z4 = this.f2303v;
        int i6 = (hashCode11 + (z4 ? 1 : z4 ? 1 : 0)) * 31;
        String str4 = this.f2304w;
        int hashCode12 = (i6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f2305x;
        return hashCode12 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.f2282a;
        DateTime dateTime = this.f2283b;
        DateTime dateTime2 = this.f2284c;
        boolean z = this.f2285d;
        boolean z2 = this.f2286e;
        String str2 = this.f2287f;
        String str3 = this.f2288g;
        long j = this.f2289h;
        Double d = this.f2290i;
        long j2 = this.f2291j;
        long j3 = this.f2292k;
        long j4 = this.f2293l;
        String str4 = this.f2294m;
        String str5 = this.f2295n;
        boolean z3 = this.f2296o;
        long j5 = this.f2297p;
        DateTime dateTime3 = this.f2298q;
        List<String> list = this.f2299r;
        List<Double> list2 = this.f2300s;
        Boolean bool = this.f2301t;
        Long l = this.f2302u;
        boolean z4 = this.f2303v;
        String str6 = this.f2304w;
        String str7 = this.f2305x;
        return "RideEndFlowStarted(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", birdIsBluetooth=" + z + ", birdIsCellular=" + z2 + ", birdModel=" + str2 + ", currency=" + str3 + ", distanceInMeters=" + j + ", durationInSeconds=" + d + ", minimumRidePrice=" + j2 + ", minutePrice=" + j3 + ", minutesIncluded=" + j4 + ", partnerId=" + str4 + ", rideId=" + str5 + ", hasSalesTax=" + z3 + ", startPrice=" + j5 + ", startTime=" + dateTime3 + ", areaIds=" + list + ", timeInAreas=" + list2 + ", isPrimaryRide=" + bool + ", concurrentRideCount=" + l + ", isPhotoRequired=" + z4 + ", endRideAttemptId=" + str6 + ", insideNestId=" + str7 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ BQ4(String str, DateTime dateTime, DateTime dateTime2, boolean z, boolean z2, String str2, String str3, long j, Double d, long j2, long j3, long j4, String str4, String str5, boolean z3, long j5, DateTime dateTime3, List list, List list2, Boolean bool, Long l, boolean z4, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, z, z2, (i & 32) != 0 ? null : str2, str3, j, (i & 256) != 0 ? null : d, j2, j3, j4, (i & 4096) != 0 ? null : str4, (i & 8192) != 0 ? null : str5, z3, j5, (65536 & i) != 0 ? null : dateTime3, (131072 & i) != 0 ? null : list, (262144 & i) != 0 ? null : list2, (524288 & i) != 0 ? null : bool, (1048576 & i) != 0 ? null : l, z4, (4194304 & i) != 0 ? null : str6, (i & 8388608) != 0 ? null : str7);
        String str8;
        DateTime dateTime4;
        DateTime dateTime5;
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
            dateTime4 = now;
        } else {
            dateTime4 = dateTime;
        }
        if ((i & 4) != 0) {
            DateTime now2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now2, "now()");
            dateTime5 = now2;
        } else {
            dateTime5 = dateTime2;
        }
    }
}
