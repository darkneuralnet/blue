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
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b:\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001Bí\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bd\u0010eJ\u008a\u0002\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u000e2\b\b\u0002\u0010\u0018\u001a\u00020\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010 \u001a\u00020\u0002HÖ\u0001J\t\u0010\"\u001a\u00020!HÖ\u0001J\u0013\u0010%\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b\b\u00101R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b2\u00100\u001a\u0004\b3\u00101R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b\n\u00101R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b6\u00101R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u0010&\u001a\u0004\b8\u0010(R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u0010&\u001a\u0004\b:\u0010(R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b?\u0010<\u001a\u0004\b@\u0010>R\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bA\u0010<\u001a\u0004\bB\u0010>R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bG\u0010&\u001a\u0004\bH\u0010(R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bI\u0010&\u001a\u0004\bJ\u0010(R\u0017\u0010\u0016\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010\u0017\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bO\u0010<\u001a\u0004\bP\u0010>R\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bQ\u0010*\u001a\u0004\bR\u0010,R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bS\u00100\u001a\u0004\bT\u00101R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bU\u0010&\u001a\u0004\bV\u0010(R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bW\u0010&\u001a\u0004\bX\u0010(R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bY\u00100\u001a\u0004\b\u001c\u00101R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\"\u0010a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010#0^8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0014\u0010c\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010(¨\u0006f"}, m28432d2 = {"LXR4;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "", "isBluetoothBird", "birdIsBluetooth", "isCellularBird", "birdIsCellular", "birdModel", "currency", "", "minimumRidePrice", "minutePrice", "minutesIncluded", "", "operationTime", "partnerId", "rideId", "hasSalesTax", "startPrice", "startTime", "hadToParkInNest", "nearestNestId", "nestStatus", "isPrimaryRide", "concurrentRideCount", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;JJJDLjava/lang/String;Ljava/lang/String;ZJLorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;)LXR4;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "e", "getBirdIsBluetooth", "f", "g", "getBirdIsCellular", "h", "getBirdModel", "i", "getCurrency", "j", "J", "getMinimumRidePrice", "()J", "k", "getMinutePrice", "l", "getMinutesIncluded", "m", "D", "getOperationTime", "()D", "n", "getPartnerId", "o", "getRideId", "p", "Z", "getHasSalesTax", "()Z", "q", "getStartPrice", "r", "getStartTime", "s", "getHadToParkInNest", "t", "getNearestNestId", "u", "getNestStatus", "v", "w", "Ljava/lang/Long;", "getConcurrentRideCount", "()Ljava/lang/Long;", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;JJJDLjava/lang/String;Ljava/lang/String;ZJLorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: XR4 */
/* loaded from: classes4.dex */
public final class XR4 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f43225a;

    /* renamed from: b */
    public final DateTime f43226b;

    /* renamed from: c */
    public final DateTime f43227c;

    /* renamed from: d */
    public final Boolean f43228d;

    /* renamed from: e */
    public final Boolean f43229e;

    /* renamed from: f */
    public final Boolean f43230f;

    /* renamed from: g */
    public final Boolean f43231g;

    /* renamed from: h */
    public final String f43232h;

    /* renamed from: i */
    public final String f43233i;

    /* renamed from: j */
    public final long f43234j;

    /* renamed from: k */
    public final long f43235k;

    /* renamed from: l */
    public final long f43236l;

    /* renamed from: m */
    public final double f43237m;

    /* renamed from: n */
    public final String f43238n;

    /* renamed from: o */
    public final String f43239o;

    /* renamed from: p */
    public final boolean f43240p;

    /* renamed from: q */
    public final long f43241q;

    /* renamed from: r */
    public final DateTime f43242r;

    /* renamed from: s */
    public final Boolean f43243s;

    /* renamed from: t */
    public final String f43244t;

    /* renamed from: u */
    public final String f43245u;

    /* renamed from: v */
    public final Boolean f43246v;

    /* renamed from: w */
    public final Long f43247w;

    public XR4(String eventId, DateTime eventTime, DateTime clientTime, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String birdModel, String currency, long j, long j2, long j3, double d, String str, String rideId, boolean z, long j4, DateTime startTime, Boolean bool5, String str2, String str3, Boolean bool6, Long l) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(birdModel, "birdModel");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        this.f43225a = eventId;
        this.f43226b = eventTime;
        this.f43227c = clientTime;
        this.f43228d = bool;
        this.f43229e = bool2;
        this.f43230f = bool3;
        this.f43231g = bool4;
        this.f43232h = birdModel;
        this.f43233i = currency;
        this.f43234j = j;
        this.f43235k = j2;
        this.f43236l = j3;
        this.f43237m = d;
        this.f43238n = str;
        this.f43239o = rideId;
        this.f43240p = z;
        this.f43241q = j4;
        this.f43242r = startTime;
        this.f43243s = bool5;
        this.f43244t = str2;
        this.f43245u = str3;
        this.f43246v = bool6;
        this.f43247w = l;
    }

    /* renamed from: a */
    public final XR4 m77010a(String eventId, DateTime eventTime, DateTime clientTime, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String birdModel, String currency, long j, long j2, long j3, double d, String str, String rideId, boolean z, long j4, DateTime startTime, Boolean bool5, String str2, String str3, Boolean bool6, Long l) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(birdModel, "birdModel");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        return new XR4(eventId, eventTime, clientTime, bool, bool2, bool3, bool4, birdModel, currency, j, j2, j3, d, str, rideId, z, j4, startTime, bool5, str2, str3, bool6, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof XR4) {
            XR4 xr4 = (XR4) obj;
            return Intrinsics.areEqual(this.f43225a, xr4.f43225a) && Intrinsics.areEqual(this.f43226b, xr4.f43226b) && Intrinsics.areEqual(this.f43227c, xr4.f43227c) && Intrinsics.areEqual(this.f43228d, xr4.f43228d) && Intrinsics.areEqual(this.f43229e, xr4.f43229e) && Intrinsics.areEqual(this.f43230f, xr4.f43230f) && Intrinsics.areEqual(this.f43231g, xr4.f43231g) && Intrinsics.areEqual(this.f43232h, xr4.f43232h) && Intrinsics.areEqual(this.f43233i, xr4.f43233i) && this.f43234j == xr4.f43234j && this.f43235k == xr4.f43235k && this.f43236l == xr4.f43236l && Double.compare(this.f43237m, xr4.f43237m) == 0 && Intrinsics.areEqual(this.f43238n, xr4.f43238n) && Intrinsics.areEqual(this.f43239o, xr4.f43239o) && this.f43240p == xr4.f43240p && this.f43241q == xr4.f43241q && Intrinsics.areEqual(this.f43242r, xr4.f43242r) && Intrinsics.areEqual(this.f43243s, xr4.f43243s) && Intrinsics.areEqual(this.f43244t, xr4.f43244t) && Intrinsics.areEqual(this.f43245u, xr4.f43245u) && Intrinsics.areEqual(this.f43246v, xr4.f43246v) && Intrinsics.areEqual(this.f43247w, xr4.f43247w);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.RideLocked";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f43225a), TuplesKt.m28425to("event_time", this.f43226b), TuplesKt.m28425to("client_time", this.f43227c), TuplesKt.m28425to("is_bluetooth_bird", this.f43228d), TuplesKt.m28425to("bird_is_bluetooth", this.f43229e), TuplesKt.m28425to("is_cellular_bird", this.f43230f), TuplesKt.m28425to("bird_is_cellular", this.f43231g), TuplesKt.m28425to("bird_model", this.f43232h), TuplesKt.m28425to("currency", this.f43233i), TuplesKt.m28425to("minimum_ride_price", Long.valueOf(this.f43234j)), TuplesKt.m28425to("minute_price", Long.valueOf(this.f43235k)), TuplesKt.m28425to("minutes_included", Long.valueOf(this.f43236l)), TuplesKt.m28425to("operation_time", Double.valueOf(this.f43237m)), TuplesKt.m28425to("partner_id", this.f43238n), TuplesKt.m28425to("ride_id", this.f43239o), TuplesKt.m28425to("has_sales_tax", Boolean.valueOf(this.f43240p)), TuplesKt.m28425to("start_price", Long.valueOf(this.f43241q)), TuplesKt.m28425to("start_time", this.f43242r), TuplesKt.m28425to("had_to_park_in_nest", this.f43243s), TuplesKt.m28425to("nearest_nest_id", this.f43244t), TuplesKt.m28425to("nest_status", this.f43245u), TuplesKt.m28425to("is_primary_ride", this.f43246v), TuplesKt.m28425to("concurrent_ride_count", this.f43247w));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f43225a.hashCode() * 31) + this.f43226b.hashCode()) * 31) + this.f43227c.hashCode()) * 31;
        Boolean bool = this.f43228d;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f43229e;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f43230f;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f43231g;
        int hashCode5 = (((((((((((((hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31) + this.f43232h.hashCode()) * 31) + this.f43233i.hashCode()) * 31) + Long.hashCode(this.f43234j)) * 31) + Long.hashCode(this.f43235k)) * 31) + Long.hashCode(this.f43236l)) * 31) + Double.hashCode(this.f43237m)) * 31;
        String str = this.f43238n;
        int hashCode6 = (((hashCode5 + (str == null ? 0 : str.hashCode())) * 31) + this.f43239o.hashCode()) * 31;
        boolean z = this.f43240p;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode7 = (((((hashCode6 + i) * 31) + Long.hashCode(this.f43241q)) * 31) + this.f43242r.hashCode()) * 31;
        Boolean bool5 = this.f43243s;
        int hashCode8 = (hashCode7 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str2 = this.f43244t;
        int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f43245u;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool6 = this.f43246v;
        int hashCode11 = (hashCode10 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Long l = this.f43247w;
        return hashCode11 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        String str = this.f43225a;
        DateTime dateTime = this.f43226b;
        DateTime dateTime2 = this.f43227c;
        Boolean bool = this.f43228d;
        Boolean bool2 = this.f43229e;
        Boolean bool3 = this.f43230f;
        Boolean bool4 = this.f43231g;
        String str2 = this.f43232h;
        String str3 = this.f43233i;
        long j = this.f43234j;
        long j2 = this.f43235k;
        long j3 = this.f43236l;
        double d = this.f43237m;
        String str4 = this.f43238n;
        String str5 = this.f43239o;
        boolean z = this.f43240p;
        long j4 = this.f43241q;
        DateTime dateTime3 = this.f43242r;
        Boolean bool5 = this.f43243s;
        String str6 = this.f43244t;
        String str7 = this.f43245u;
        Boolean bool6 = this.f43246v;
        Long l = this.f43247w;
        return "RideLocked(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", isBluetoothBird=" + bool + ", birdIsBluetooth=" + bool2 + ", isCellularBird=" + bool3 + ", birdIsCellular=" + bool4 + ", birdModel=" + str2 + ", currency=" + str3 + ", minimumRidePrice=" + j + ", minutePrice=" + j2 + ", minutesIncluded=" + j3 + ", operationTime=" + d + ", partnerId=" + str4 + ", rideId=" + str5 + ", hasSalesTax=" + z + ", startPrice=" + j4 + ", startTime=" + dateTime3 + ", hadToParkInNest=" + bool5 + ", nearestNestId=" + str6 + ", nestStatus=" + str7 + ", isPrimaryRide=" + bool6 + ", concurrentRideCount=" + l + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ XR4(String str, DateTime dateTime, DateTime dateTime2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, String str3, long j, long j2, long j3, double d, String str4, String str5, boolean z, long j4, DateTime dateTime3, Boolean bool5, String str6, String str7, Boolean bool6, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : bool3, (i & 64) != 0 ? null : bool4, str2, str3, j, j2, j3, d, (i & 8192) != 0 ? null : str4, str5, z, j4, dateTime3, (262144 & i) != 0 ? null : bool5, (524288 & i) != 0 ? null : str6, (1048576 & i) != 0 ? null : str7, (2097152 & i) != 0 ? null : bool6, (i & 4194304) != 0 ? null : l);
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
