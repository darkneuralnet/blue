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
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\bF\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B¥\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0018\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u001f\u001a\u00020\u0007\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bu\u0010vJÄ\u0002\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00182\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u001d\u001a\u00020\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u001f\u001a\u00020\u00072\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b#\u0010$J\t\u0010%\u001a\u00020\u0002HÖ\u0001J\t\u0010'\u001a\u00020&HÖ\u0001J\u0013\u0010*\u001a\u00020\u00072\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b8\u00105\u001a\u0004\b9\u00107R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b:\u0010+\u001a\u0004\b;\u0010-R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b<\u0010+\u001a\u0004\b=\u0010-R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bF\u0010?\u001a\u0004\bG\u0010AR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bH\u0010?\u001a\u0004\bI\u0010AR\u0017\u0010\u0012\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bJ\u0010?\u001a\u0004\bK\u0010AR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bL\u0010+\u001a\u0004\bM\u0010-R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bN\u0010+\u001a\u0004\bO\u0010-R\u0017\u0010\u0015\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bP\u00105\u001a\u0004\bQ\u00107R\u0017\u0010\u0016\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bR\u0010?\u001a\u0004\bS\u0010AR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bT\u0010/\u001a\u0004\bU\u00101R\u001f\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u001f\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bZ\u0010W\u001a\u0004\b[\u0010YR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b\u001b\u0010^R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bc\u0010+\u001a\u0004\bd\u0010-R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\be\u0010`\u001a\u0004\bf\u0010bR\u0017\u0010\u001f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bg\u00105\u001a\u0004\bh\u00107R\u0019\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bi\u0010+\u001a\u0004\bj\u0010-R\u0019\u0010!\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bk\u0010C\u001a\u0004\bl\u0010ER\u0019\u0010\"\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bm\u0010C\u001a\u0004\bn\u0010ER\"\u0010r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010(0o8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010qR\u0014\u0010t\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bs\u0010-¨\u0006w"}, m28432d2 = {"LzQ4;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "", "birdIsBluetooth", "birdIsCellular", "birdModel", "currency", "", "distanceInMeters", "", "durationInSeconds", "minimumRidePrice", "minutePrice", "minutesIncluded", "partnerId", "rideId", "hasSalesTax", "startPrice", "startTime", "", "areaIds", "timeInAreas", "isPrimaryRide", "concurrentRideCount", "warningType", "parkingFineAmount", "endRideAllowed", "endRideAttemptId", "accuracyLimit", "nestAdditionalBufferMeters", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZZLjava/lang/String;Ljava/lang/String;JLjava/lang/Double;JJJLjava/lang/String;Ljava/lang/String;ZJLorg/joda/time/DateTime;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;ZLjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)LzQ4;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "Z", "getBirdIsBluetooth", "()Z", "e", "getBirdIsCellular", "f", "getBirdModel", "g", "getCurrency", "h", "J", "getDistanceInMeters", "()J", "i", "Ljava/lang/Double;", "getDurationInSeconds", "()Ljava/lang/Double;", "j", "getMinimumRidePrice", "k", "getMinutePrice", "l", "getMinutesIncluded", "m", "getPartnerId", "n", "getRideId", "o", "getHasSalesTax", "p", "getStartPrice", "q", "getStartTime", "r", "Ljava/util/List;", "getAreaIds", "()Ljava/util/List;", "s", "getTimeInAreas", "t", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "u", "Ljava/lang/Long;", "getConcurrentRideCount", "()Ljava/lang/Long;", "v", "getWarningType", "w", "getParkingFineAmount", "x", "getEndRideAllowed", "y", "getEndRideAttemptId", "z", "getAccuracyLimit", "A", "getNestAdditionalBufferMeters", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZZLjava/lang/String;Ljava/lang/String;JLjava/lang/Double;JJJLjava/lang/String;Ljava/lang/String;ZJLorg/joda/time/DateTime;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;ZLjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: zQ4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C52785zQ4 implements AnalyticsEvent {

    /* renamed from: A */
    public final Double f121324A;

    /* renamed from: a */
    public final String f121325a;

    /* renamed from: b */
    public final DateTime f121326b;

    /* renamed from: c */
    public final DateTime f121327c;

    /* renamed from: d */
    public final boolean f121328d;

    /* renamed from: e */
    public final boolean f121329e;

    /* renamed from: f */
    public final String f121330f;

    /* renamed from: g */
    public final String f121331g;

    /* renamed from: h */
    public final long f121332h;

    /* renamed from: i */
    public final Double f121333i;

    /* renamed from: j */
    public final long f121334j;

    /* renamed from: k */
    public final long f121335k;

    /* renamed from: l */
    public final long f121336l;

    /* renamed from: m */
    public final String f121337m;

    /* renamed from: n */
    public final String f121338n;

    /* renamed from: o */
    public final boolean f121339o;

    /* renamed from: p */
    public final long f121340p;

    /* renamed from: q */
    public final DateTime f121341q;

    /* renamed from: r */
    public final List<String> f121342r;

    /* renamed from: s */
    public final List<Double> f121343s;

    /* renamed from: t */
    public final Boolean f121344t;

    /* renamed from: u */
    public final Long f121345u;

    /* renamed from: v */
    public final String f121346v;

    /* renamed from: w */
    public final Long f121347w;

    /* renamed from: x */
    public final boolean f121348x;

    /* renamed from: y */
    public final String f121349y;

    /* renamed from: z */
    public final Double f121350z;

    public C52785zQ4(String eventId, DateTime eventTime, DateTime clientTime, boolean z, boolean z2, String str, String currency, long j, Double d, long j2, long j3, long j4, String str2, String str3, boolean z3, long j5, DateTime dateTime, List<String> list, List<Double> list2, Boolean bool, Long l, String warningType, Long l2, boolean z4, String str4, Double d2, Double d3) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(warningType, "warningType");
        this.f121325a = eventId;
        this.f121326b = eventTime;
        this.f121327c = clientTime;
        this.f121328d = z;
        this.f121329e = z2;
        this.f121330f = str;
        this.f121331g = currency;
        this.f121332h = j;
        this.f121333i = d;
        this.f121334j = j2;
        this.f121335k = j3;
        this.f121336l = j4;
        this.f121337m = str2;
        this.f121338n = str3;
        this.f121339o = z3;
        this.f121340p = j5;
        this.f121341q = dateTime;
        this.f121342r = list;
        this.f121343s = list2;
        this.f121344t = bool;
        this.f121345u = l;
        this.f121346v = warningType;
        this.f121347w = l2;
        this.f121348x = z4;
        this.f121349y = str4;
        this.f121350z = d2;
        this.f121324A = d3;
    }

    /* renamed from: a */
    public final C52785zQ4 m1387a(String eventId, DateTime eventTime, DateTime clientTime, boolean z, boolean z2, String str, String currency, long j, Double d, long j2, long j3, long j4, String str2, String str3, boolean z3, long j5, DateTime dateTime, List<String> list, List<Double> list2, Boolean bool, Long l, String warningType, Long l2, boolean z4, String str4, Double d2, Double d3) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(warningType, "warningType");
        return new C52785zQ4(eventId, eventTime, clientTime, z, z2, str, currency, j, d, j2, j3, j4, str2, str3, z3, j5, dateTime, list, list2, bool, l, warningType, l2, z4, str4, d2, d3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C52785zQ4) {
            C52785zQ4 c52785zQ4 = (C52785zQ4) obj;
            return Intrinsics.areEqual(this.f121325a, c52785zQ4.f121325a) && Intrinsics.areEqual(this.f121326b, c52785zQ4.f121326b) && Intrinsics.areEqual(this.f121327c, c52785zQ4.f121327c) && this.f121328d == c52785zQ4.f121328d && this.f121329e == c52785zQ4.f121329e && Intrinsics.areEqual(this.f121330f, c52785zQ4.f121330f) && Intrinsics.areEqual(this.f121331g, c52785zQ4.f121331g) && this.f121332h == c52785zQ4.f121332h && Intrinsics.areEqual((Object) this.f121333i, (Object) c52785zQ4.f121333i) && this.f121334j == c52785zQ4.f121334j && this.f121335k == c52785zQ4.f121335k && this.f121336l == c52785zQ4.f121336l && Intrinsics.areEqual(this.f121337m, c52785zQ4.f121337m) && Intrinsics.areEqual(this.f121338n, c52785zQ4.f121338n) && this.f121339o == c52785zQ4.f121339o && this.f121340p == c52785zQ4.f121340p && Intrinsics.areEqual(this.f121341q, c52785zQ4.f121341q) && Intrinsics.areEqual(this.f121342r, c52785zQ4.f121342r) && Intrinsics.areEqual(this.f121343s, c52785zQ4.f121343s) && Intrinsics.areEqual(this.f121344t, c52785zQ4.f121344t) && Intrinsics.areEqual(this.f121345u, c52785zQ4.f121345u) && Intrinsics.areEqual(this.f121346v, c52785zQ4.f121346v) && Intrinsics.areEqual(this.f121347w, c52785zQ4.f121347w) && this.f121348x == c52785zQ4.f121348x && Intrinsics.areEqual(this.f121349y, c52785zQ4.f121349y) && Intrinsics.areEqual((Object) this.f121350z, (Object) c52785zQ4.f121350z) && Intrinsics.areEqual((Object) this.f121324A, (Object) c52785zQ4.f121324A);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.RideEndClientIssueDisplayed";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f121325a), TuplesKt.m28425to("event_time", this.f121326b), TuplesKt.m28425to("client_time", this.f121327c), TuplesKt.m28425to("bird_is_bluetooth", Boolean.valueOf(this.f121328d)), TuplesKt.m28425to("bird_is_cellular", Boolean.valueOf(this.f121329e)), TuplesKt.m28425to("bird_model", this.f121330f), TuplesKt.m28425to("currency", this.f121331g), TuplesKt.m28425to("distance_in_meters", Long.valueOf(this.f121332h)), TuplesKt.m28425to("duration_in_seconds", this.f121333i), TuplesKt.m28425to("minimum_ride_price", Long.valueOf(this.f121334j)), TuplesKt.m28425to("minute_price", Long.valueOf(this.f121335k)), TuplesKt.m28425to("minutes_included", Long.valueOf(this.f121336l)), TuplesKt.m28425to("partner_id", this.f121337m), TuplesKt.m28425to("ride_id", this.f121338n), TuplesKt.m28425to("has_sales_tax", Boolean.valueOf(this.f121339o)), TuplesKt.m28425to("start_price", Long.valueOf(this.f121340p)), TuplesKt.m28425to("start_time", this.f121341q), TuplesKt.m28425to("area_ids", this.f121342r), TuplesKt.m28425to("time_in_areas", this.f121343s), TuplesKt.m28425to("is_primary_ride", this.f121344t), TuplesKt.m28425to("concurrent_ride_count", this.f121345u), TuplesKt.m28425to("warning_type", this.f121346v), TuplesKt.m28425to("parking_fine_amount", this.f121347w), TuplesKt.m28425to("end_ride_allowed", Boolean.valueOf(this.f121348x)), TuplesKt.m28425to("end_ride_attempt_id", this.f121349y), TuplesKt.m28425to("accuracy_limit", this.f121350z), TuplesKt.m28425to("nest_additional_buffer_meters", this.f121324A));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f121325a.hashCode() * 31) + this.f121326b.hashCode()) * 31) + this.f121327c.hashCode()) * 31;
        boolean z = this.f121328d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.f121329e;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        String str = this.f121330f;
        int hashCode2 = (((((i4 + (str == null ? 0 : str.hashCode())) * 31) + this.f121331g.hashCode()) * 31) + Long.hashCode(this.f121332h)) * 31;
        Double d = this.f121333i;
        int hashCode3 = (((((((hashCode2 + (d == null ? 0 : d.hashCode())) * 31) + Long.hashCode(this.f121334j)) * 31) + Long.hashCode(this.f121335k)) * 31) + Long.hashCode(this.f121336l)) * 31;
        String str2 = this.f121337m;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f121338n;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z3 = this.f121339o;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int hashCode6 = (((hashCode5 + i5) * 31) + Long.hashCode(this.f121340p)) * 31;
        DateTime dateTime = this.f121341q;
        int hashCode7 = (hashCode6 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        List<String> list = this.f121342r;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        List<Double> list2 = this.f121343s;
        int hashCode9 = (hashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.f121344t;
        int hashCode10 = (hashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.f121345u;
        int hashCode11 = (((hashCode10 + (l == null ? 0 : l.hashCode())) * 31) + this.f121346v.hashCode()) * 31;
        Long l2 = this.f121347w;
        int hashCode12 = (hashCode11 + (l2 == null ? 0 : l2.hashCode())) * 31;
        boolean z4 = this.f121348x;
        int i6 = (hashCode12 + (z4 ? 1 : z4 ? 1 : 0)) * 31;
        String str4 = this.f121349y;
        int hashCode13 = (i6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d2 = this.f121350z;
        int hashCode14 = (hashCode13 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.f121324A;
        return hashCode14 + (d3 != null ? d3.hashCode() : 0);
    }

    public String toString() {
        String str = this.f121325a;
        DateTime dateTime = this.f121326b;
        DateTime dateTime2 = this.f121327c;
        boolean z = this.f121328d;
        boolean z2 = this.f121329e;
        String str2 = this.f121330f;
        String str3 = this.f121331g;
        long j = this.f121332h;
        Double d = this.f121333i;
        long j2 = this.f121334j;
        long j3 = this.f121335k;
        long j4 = this.f121336l;
        String str4 = this.f121337m;
        String str5 = this.f121338n;
        boolean z3 = this.f121339o;
        long j5 = this.f121340p;
        DateTime dateTime3 = this.f121341q;
        List<String> list = this.f121342r;
        List<Double> list2 = this.f121343s;
        Boolean bool = this.f121344t;
        Long l = this.f121345u;
        String str6 = this.f121346v;
        Long l2 = this.f121347w;
        boolean z4 = this.f121348x;
        String str7 = this.f121349y;
        Double d2 = this.f121350z;
        Double d3 = this.f121324A;
        return "RideEndClientIssueDisplayed(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", birdIsBluetooth=" + z + ", birdIsCellular=" + z2 + ", birdModel=" + str2 + ", currency=" + str3 + ", distanceInMeters=" + j + ", durationInSeconds=" + d + ", minimumRidePrice=" + j2 + ", minutePrice=" + j3 + ", minutesIncluded=" + j4 + ", partnerId=" + str4 + ", rideId=" + str5 + ", hasSalesTax=" + z3 + ", startPrice=" + j5 + ", startTime=" + dateTime3 + ", areaIds=" + list + ", timeInAreas=" + list2 + ", isPrimaryRide=" + bool + ", concurrentRideCount=" + l + ", warningType=" + str6 + ", parkingFineAmount=" + l2 + ", endRideAllowed=" + z4 + ", endRideAttemptId=" + str7 + ", accuracyLimit=" + d2 + ", nestAdditionalBufferMeters=" + d3 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C52785zQ4(String str, DateTime dateTime, DateTime dateTime2, boolean z, boolean z2, String str2, String str3, long j, Double d, long j2, long j3, long j4, String str4, String str5, boolean z3, long j5, DateTime dateTime3, List list, List list2, Boolean bool, Long l, String str6, Long l2, boolean z4, String str7, Double d2, Double d3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, z, z2, (i & 32) != 0 ? null : str2, str3, j, (i & 256) != 0 ? null : d, j2, j3, j4, (i & 4096) != 0 ? null : str4, (i & 8192) != 0 ? null : str5, z3, j5, (65536 & i) != 0 ? null : dateTime3, (131072 & i) != 0 ? null : list, (262144 & i) != 0 ? null : list2, (524288 & i) != 0 ? null : bool, (1048576 & i) != 0 ? null : l, str6, (4194304 & i) != 0 ? null : l2, z4, (16777216 & i) != 0 ? null : str7, (33554432 & i) != 0 ? null : d2, (i & 67108864) != 0 ? null : d3);
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
