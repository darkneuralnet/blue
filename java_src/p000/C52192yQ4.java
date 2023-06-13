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
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\bD\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0095\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0018\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u001f\u001a\u00020\u0007\u0012\u0006\u0010 \u001a\u00020\u0007\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\br\u0010sJ¶\u0002\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00182\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u001d\u001a\u00020\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u001f\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u00072\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\t\u0010$\u001a\u00020\u0002HÖ\u0001J\t\u0010&\u001a\u00020%HÖ\u0001J\u0013\u0010)\u001a\u00020\u00072\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b7\u00104\u001a\u0004\b8\u00106R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b9\u0010*\u001a\u0004\b:\u0010,R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u0010*\u001a\u0004\b<\u0010,R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bE\u0010>\u001a\u0004\bF\u0010@R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bG\u0010>\u001a\u0004\bH\u0010@R\u0017\u0010\u0012\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bI\u0010>\u001a\u0004\bJ\u0010@R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bK\u0010*\u001a\u0004\bL\u0010,R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bM\u0010*\u001a\u0004\bN\u0010,R\u0017\u0010\u0015\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bO\u00104\u001a\u0004\bP\u00106R\u0017\u0010\u0016\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bQ\u0010>\u001a\u0004\bR\u0010@R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bS\u0010.\u001a\u0004\bT\u00100R\u001f\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u001f\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bY\u0010V\u001a\u0004\bZ\u0010XR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b\u001b\u0010]R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bb\u0010*\u001a\u0004\bc\u0010,R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bd\u0010_\u001a\u0004\be\u0010aR\u0017\u0010\u001f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bf\u00104\u001a\u0004\bg\u00106R\u0017\u0010 \u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bh\u00104\u001a\u0004\bi\u00106R\u0019\u0010!\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bj\u0010*\u001a\u0004\bk\u0010,R\"\u0010o\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010'0l8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0014\u0010q\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010,¨\u0006t"}, m28432d2 = {"LyQ4;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "", "birdIsBluetooth", "birdIsCellular", "birdModel", "currency", "", "distanceInMeters", "", "durationInSeconds", "minimumRidePrice", "minutePrice", "minutesIncluded", "partnerId", "rideId", "hasSalesTax", "startPrice", "startTime", "", "areaIds", "timeInAreas", "isPrimaryRide", "concurrentRideCount", "warningType", "parkingFineAmount", "endRideWasAllowed", "endRideChosen", "endRideAttemptId", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZZLjava/lang/String;Ljava/lang/String;JLjava/lang/Double;JJJLjava/lang/String;Ljava/lang/String;ZJLorg/joda/time/DateTime;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;ZZLjava/lang/String;)LyQ4;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "Z", "getBirdIsBluetooth", "()Z", "e", "getBirdIsCellular", "f", "getBirdModel", "g", "getCurrency", "h", "J", "getDistanceInMeters", "()J", "i", "Ljava/lang/Double;", "getDurationInSeconds", "()Ljava/lang/Double;", "j", "getMinimumRidePrice", "k", "getMinutePrice", "l", "getMinutesIncluded", "m", "getPartnerId", "n", "getRideId", "o", "getHasSalesTax", "p", "getStartPrice", "q", "getStartTime", "r", "Ljava/util/List;", "getAreaIds", "()Ljava/util/List;", "s", "getTimeInAreas", "t", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "u", "Ljava/lang/Long;", "getConcurrentRideCount", "()Ljava/lang/Long;", "v", "getWarningType", "w", "getParkingFineAmount", "x", "getEndRideWasAllowed", "y", "getEndRideChosen", "z", "getEndRideAttemptId", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZZLjava/lang/String;Ljava/lang/String;JLjava/lang/Double;JJJLjava/lang/String;Ljava/lang/String;ZJLorg/joda/time/DateTime;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;ZZLjava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: yQ4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C52192yQ4 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f119511a;

    /* renamed from: b */
    public final DateTime f119512b;

    /* renamed from: c */
    public final DateTime f119513c;

    /* renamed from: d */
    public final boolean f119514d;

    /* renamed from: e */
    public final boolean f119515e;

    /* renamed from: f */
    public final String f119516f;

    /* renamed from: g */
    public final String f119517g;

    /* renamed from: h */
    public final long f119518h;

    /* renamed from: i */
    public final Double f119519i;

    /* renamed from: j */
    public final long f119520j;

    /* renamed from: k */
    public final long f119521k;

    /* renamed from: l */
    public final long f119522l;

    /* renamed from: m */
    public final String f119523m;

    /* renamed from: n */
    public final String f119524n;

    /* renamed from: o */
    public final boolean f119525o;

    /* renamed from: p */
    public final long f119526p;

    /* renamed from: q */
    public final DateTime f119527q;

    /* renamed from: r */
    public final List<String> f119528r;

    /* renamed from: s */
    public final List<Double> f119529s;

    /* renamed from: t */
    public final Boolean f119530t;

    /* renamed from: u */
    public final Long f119531u;

    /* renamed from: v */
    public final String f119532v;

    /* renamed from: w */
    public final Long f119533w;

    /* renamed from: x */
    public final boolean f119534x;

    /* renamed from: y */
    public final boolean f119535y;

    /* renamed from: z */
    public final String f119536z;

    public C52192yQ4(String eventId, DateTime eventTime, DateTime clientTime, boolean z, boolean z2, String str, String currency, long j, Double d, long j2, long j3, long j4, String str2, String str3, boolean z3, long j5, DateTime dateTime, List<String> list, List<Double> list2, Boolean bool, Long l, String warningType, Long l2, boolean z4, boolean z5, String str4) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(warningType, "warningType");
        this.f119511a = eventId;
        this.f119512b = eventTime;
        this.f119513c = clientTime;
        this.f119514d = z;
        this.f119515e = z2;
        this.f119516f = str;
        this.f119517g = currency;
        this.f119518h = j;
        this.f119519i = d;
        this.f119520j = j2;
        this.f119521k = j3;
        this.f119522l = j4;
        this.f119523m = str2;
        this.f119524n = str3;
        this.f119525o = z3;
        this.f119526p = j5;
        this.f119527q = dateTime;
        this.f119528r = list;
        this.f119529s = list2;
        this.f119530t = bool;
        this.f119531u = l;
        this.f119532v = warningType;
        this.f119533w = l2;
        this.f119534x = z4;
        this.f119535y = z5;
        this.f119536z = str4;
    }

    /* renamed from: a */
    public final C52192yQ4 m3511a(String eventId, DateTime eventTime, DateTime clientTime, boolean z, boolean z2, String str, String currency, long j, Double d, long j2, long j3, long j4, String str2, String str3, boolean z3, long j5, DateTime dateTime, List<String> list, List<Double> list2, Boolean bool, Long l, String warningType, Long l2, boolean z4, boolean z5, String str4) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(warningType, "warningType");
        return new C52192yQ4(eventId, eventTime, clientTime, z, z2, str, currency, j, d, j2, j3, j4, str2, str3, z3, j5, dateTime, list, list2, bool, l, warningType, l2, z4, z5, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C52192yQ4) {
            C52192yQ4 c52192yQ4 = (C52192yQ4) obj;
            return Intrinsics.areEqual(this.f119511a, c52192yQ4.f119511a) && Intrinsics.areEqual(this.f119512b, c52192yQ4.f119512b) && Intrinsics.areEqual(this.f119513c, c52192yQ4.f119513c) && this.f119514d == c52192yQ4.f119514d && this.f119515e == c52192yQ4.f119515e && Intrinsics.areEqual(this.f119516f, c52192yQ4.f119516f) && Intrinsics.areEqual(this.f119517g, c52192yQ4.f119517g) && this.f119518h == c52192yQ4.f119518h && Intrinsics.areEqual((Object) this.f119519i, (Object) c52192yQ4.f119519i) && this.f119520j == c52192yQ4.f119520j && this.f119521k == c52192yQ4.f119521k && this.f119522l == c52192yQ4.f119522l && Intrinsics.areEqual(this.f119523m, c52192yQ4.f119523m) && Intrinsics.areEqual(this.f119524n, c52192yQ4.f119524n) && this.f119525o == c52192yQ4.f119525o && this.f119526p == c52192yQ4.f119526p && Intrinsics.areEqual(this.f119527q, c52192yQ4.f119527q) && Intrinsics.areEqual(this.f119528r, c52192yQ4.f119528r) && Intrinsics.areEqual(this.f119529s, c52192yQ4.f119529s) && Intrinsics.areEqual(this.f119530t, c52192yQ4.f119530t) && Intrinsics.areEqual(this.f119531u, c52192yQ4.f119531u) && Intrinsics.areEqual(this.f119532v, c52192yQ4.f119532v) && Intrinsics.areEqual(this.f119533w, c52192yQ4.f119533w) && this.f119534x == c52192yQ4.f119534x && this.f119535y == c52192yQ4.f119535y && Intrinsics.areEqual(this.f119536z, c52192yQ4.f119536z);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.RideEndClientIssueAcknowledged";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f119511a), TuplesKt.m28425to("event_time", this.f119512b), TuplesKt.m28425to("client_time", this.f119513c), TuplesKt.m28425to("bird_is_bluetooth", Boolean.valueOf(this.f119514d)), TuplesKt.m28425to("bird_is_cellular", Boolean.valueOf(this.f119515e)), TuplesKt.m28425to("bird_model", this.f119516f), TuplesKt.m28425to("currency", this.f119517g), TuplesKt.m28425to("distance_in_meters", Long.valueOf(this.f119518h)), TuplesKt.m28425to("duration_in_seconds", this.f119519i), TuplesKt.m28425to("minimum_ride_price", Long.valueOf(this.f119520j)), TuplesKt.m28425to("minute_price", Long.valueOf(this.f119521k)), TuplesKt.m28425to("minutes_included", Long.valueOf(this.f119522l)), TuplesKt.m28425to("partner_id", this.f119523m), TuplesKt.m28425to("ride_id", this.f119524n), TuplesKt.m28425to("has_sales_tax", Boolean.valueOf(this.f119525o)), TuplesKt.m28425to("start_price", Long.valueOf(this.f119526p)), TuplesKt.m28425to("start_time", this.f119527q), TuplesKt.m28425to("area_ids", this.f119528r), TuplesKt.m28425to("time_in_areas", this.f119529s), TuplesKt.m28425to("is_primary_ride", this.f119530t), TuplesKt.m28425to("concurrent_ride_count", this.f119531u), TuplesKt.m28425to("warning_type", this.f119532v), TuplesKt.m28425to("parking_fine_amount", this.f119533w), TuplesKt.m28425to("end_ride_was_allowed", Boolean.valueOf(this.f119534x)), TuplesKt.m28425to("end_ride_chosen", Boolean.valueOf(this.f119535y)), TuplesKt.m28425to("end_ride_attempt_id", this.f119536z));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f119511a.hashCode() * 31) + this.f119512b.hashCode()) * 31) + this.f119513c.hashCode()) * 31;
        boolean z = this.f119514d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.f119515e;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        String str = this.f119516f;
        int hashCode2 = (((((i4 + (str == null ? 0 : str.hashCode())) * 31) + this.f119517g.hashCode()) * 31) + Long.hashCode(this.f119518h)) * 31;
        Double d = this.f119519i;
        int hashCode3 = (((((((hashCode2 + (d == null ? 0 : d.hashCode())) * 31) + Long.hashCode(this.f119520j)) * 31) + Long.hashCode(this.f119521k)) * 31) + Long.hashCode(this.f119522l)) * 31;
        String str2 = this.f119523m;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f119524n;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z3 = this.f119525o;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int hashCode6 = (((hashCode5 + i5) * 31) + Long.hashCode(this.f119526p)) * 31;
        DateTime dateTime = this.f119527q;
        int hashCode7 = (hashCode6 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        List<String> list = this.f119528r;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        List<Double> list2 = this.f119529s;
        int hashCode9 = (hashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.f119530t;
        int hashCode10 = (hashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.f119531u;
        int hashCode11 = (((hashCode10 + (l == null ? 0 : l.hashCode())) * 31) + this.f119532v.hashCode()) * 31;
        Long l2 = this.f119533w;
        int hashCode12 = (hashCode11 + (l2 == null ? 0 : l2.hashCode())) * 31;
        boolean z4 = this.f119534x;
        int i6 = z4;
        if (z4 != 0) {
            i6 = 1;
        }
        int i7 = (hashCode12 + i6) * 31;
        boolean z5 = this.f119535y;
        int i8 = (i7 + (z5 ? 1 : z5 ? 1 : 0)) * 31;
        String str4 = this.f119536z;
        return i8 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.f119511a;
        DateTime dateTime = this.f119512b;
        DateTime dateTime2 = this.f119513c;
        boolean z = this.f119514d;
        boolean z2 = this.f119515e;
        String str2 = this.f119516f;
        String str3 = this.f119517g;
        long j = this.f119518h;
        Double d = this.f119519i;
        long j2 = this.f119520j;
        long j3 = this.f119521k;
        long j4 = this.f119522l;
        String str4 = this.f119523m;
        String str5 = this.f119524n;
        boolean z3 = this.f119525o;
        long j5 = this.f119526p;
        DateTime dateTime3 = this.f119527q;
        List<String> list = this.f119528r;
        List<Double> list2 = this.f119529s;
        Boolean bool = this.f119530t;
        Long l = this.f119531u;
        String str6 = this.f119532v;
        Long l2 = this.f119533w;
        boolean z4 = this.f119534x;
        boolean z5 = this.f119535y;
        String str7 = this.f119536z;
        return "RideEndClientIssueAcknowledged(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", birdIsBluetooth=" + z + ", birdIsCellular=" + z2 + ", birdModel=" + str2 + ", currency=" + str3 + ", distanceInMeters=" + j + ", durationInSeconds=" + d + ", minimumRidePrice=" + j2 + ", minutePrice=" + j3 + ", minutesIncluded=" + j4 + ", partnerId=" + str4 + ", rideId=" + str5 + ", hasSalesTax=" + z3 + ", startPrice=" + j5 + ", startTime=" + dateTime3 + ", areaIds=" + list + ", timeInAreas=" + list2 + ", isPrimaryRide=" + bool + ", concurrentRideCount=" + l + ", warningType=" + str6 + ", parkingFineAmount=" + l2 + ", endRideWasAllowed=" + z4 + ", endRideChosen=" + z5 + ", endRideAttemptId=" + str7 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C52192yQ4(String str, DateTime dateTime, DateTime dateTime2, boolean z, boolean z2, String str2, String str3, long j, Double d, long j2, long j3, long j4, String str4, String str5, boolean z3, long j5, DateTime dateTime3, List list, List list2, Boolean bool, Long l, String str6, Long l2, boolean z4, boolean z5, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, z, z2, (i & 32) != 0 ? null : str2, str3, j, (i & 256) != 0 ? null : d, j2, j3, j4, (i & 4096) != 0 ? null : str4, (i & 8192) != 0 ? null : str5, z3, j5, (65536 & i) != 0 ? null : dateTime3, (131072 & i) != 0 ? null : list, (262144 & i) != 0 ? null : list2, (524288 & i) != 0 ? null : bool, (1048576 & i) != 0 ? null : l, str6, (4194304 & i) != 0 ? null : l2, z4, z5, (i & 33554432) != 0 ? null : str7);
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
