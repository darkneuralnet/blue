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
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b+\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B±\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\bM\u0010NJ¼\u0001\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0019\u001a\u00020\u0002HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b4\u00100R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b5\u0010.\u001a\u0004\b6\u00100R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b7\u0010.\u001a\u0004\b8\u00100R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b9\u0010.\u001a\u0004\b:\u00100R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\"\u0010J\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001b0G8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010L\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010 ¨\u0006O"}, m28432d2 = {"LDa5;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "", "areaIds", "", "timeInAreas", "clientLastTrackLatitude", "clientLastTrackLongitude", "clientLastTrackHeading", "clientLastTrackSpeed", "clientLastTrackAltitude", "clientLastTrackAccuracy", "", "clientLastTrackMaxSpeedResponse", "", "hasPrimaryRide", "", "concurrentRideCount", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Long;)LDa5;", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "getAreaIds", "()Ljava/util/List;", "e", "getTimeInAreas", "f", "Ljava/lang/Double;", "getClientLastTrackLatitude", "()Ljava/lang/Double;", "g", "getClientLastTrackLongitude", "h", "getClientLastTrackHeading", "i", "getClientLastTrackSpeed", "j", "getClientLastTrackAltitude", "k", "getClientLastTrackAccuracy", "l", "Ljava/lang/Integer;", "getClientLastTrackMaxSpeedResponse", "()Ljava/lang/Integer;", "m", "Ljava/lang/Boolean;", "getHasPrimaryRide", "()Ljava/lang/Boolean;", "n", "Ljava/lang/Long;", "getConcurrentRideCount", "()Ljava/lang/Long;", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Long;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Da5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C32320Da5 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f5983a;

    /* renamed from: b */
    public final DateTime f5984b;

    /* renamed from: c */
    public final DateTime f5985c;

    /* renamed from: d */
    public final List<String> f5986d;

    /* renamed from: e */
    public final List<Double> f5987e;

    /* renamed from: f */
    public final Double f5988f;

    /* renamed from: g */
    public final Double f5989g;

    /* renamed from: h */
    public final Double f5990h;

    /* renamed from: i */
    public final Double f5991i;

    /* renamed from: j */
    public final Double f5992j;

    /* renamed from: k */
    public final Double f5993k;

    /* renamed from: l */
    public final Integer f5994l;

    /* renamed from: m */
    public final Boolean f5995m;

    /* renamed from: n */
    public final Long f5996n;

    public C32320Da5(String eventId, DateTime eventTime, DateTime clientTime, List<String> areaIds, List<Double> list, Double d, Double d2, Double d3, Double d4, Double d5, Double d6, Integer num, Boolean bool, Long l) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(areaIds, "areaIds");
        this.f5983a = eventId;
        this.f5984b = eventTime;
        this.f5985c = clientTime;
        this.f5986d = areaIds;
        this.f5987e = list;
        this.f5988f = d;
        this.f5989g = d2;
        this.f5990h = d3;
        this.f5991i = d4;
        this.f5992j = d5;
        this.f5993k = d6;
        this.f5994l = num;
        this.f5995m = bool;
        this.f5996n = l;
    }

    /* renamed from: a */
    public final C32320Da5 m110148a(String eventId, DateTime eventTime, DateTime clientTime, List<String> areaIds, List<Double> list, Double d, Double d2, Double d3, Double d4, Double d5, Double d6, Integer num, Boolean bool, Long l) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(areaIds, "areaIds");
        return new C32320Da5(eventId, eventTime, clientTime, areaIds, list, d, d2, d3, d4, d5, d6, num, bool, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C32320Da5) {
            C32320Da5 c32320Da5 = (C32320Da5) obj;
            return Intrinsics.areEqual(this.f5983a, c32320Da5.f5983a) && Intrinsics.areEqual(this.f5984b, c32320Da5.f5984b) && Intrinsics.areEqual(this.f5985c, c32320Da5.f5985c) && Intrinsics.areEqual(this.f5986d, c32320Da5.f5986d) && Intrinsics.areEqual(this.f5987e, c32320Da5.f5987e) && Intrinsics.areEqual((Object) this.f5988f, (Object) c32320Da5.f5988f) && Intrinsics.areEqual((Object) this.f5989g, (Object) c32320Da5.f5989g) && Intrinsics.areEqual((Object) this.f5990h, (Object) c32320Da5.f5990h) && Intrinsics.areEqual((Object) this.f5991i, (Object) c32320Da5.f5991i) && Intrinsics.areEqual((Object) this.f5992j, (Object) c32320Da5.f5992j) && Intrinsics.areEqual((Object) this.f5993k, (Object) c32320Da5.f5993k) && Intrinsics.areEqual(this.f5994l, c32320Da5.f5994l) && Intrinsics.areEqual(this.f5995m, c32320Da5.f5995m) && Intrinsics.areEqual(this.f5996n, c32320Da5.f5996n);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.RiderTappedAddRideButton";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f5983a), TuplesKt.m28425to("event_time", this.f5984b), TuplesKt.m28425to("client_time", this.f5985c), TuplesKt.m28425to("area_ids", this.f5986d), TuplesKt.m28425to("time_in_areas", this.f5987e), TuplesKt.m28425to("client_last_track_latitude", this.f5988f), TuplesKt.m28425to("client_last_track_longitude", this.f5989g), TuplesKt.m28425to("client_last_track_heading", this.f5990h), TuplesKt.m28425to("client_last_track_speed", this.f5991i), TuplesKt.m28425to("client_last_track_altitude", this.f5992j), TuplesKt.m28425to("client_last_track_accuracy", this.f5993k), TuplesKt.m28425to("client_last_track_max_speed_response", this.f5994l), TuplesKt.m28425to("has_primary_ride", this.f5995m), TuplesKt.m28425to("concurrent_ride_count", this.f5996n));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((this.f5983a.hashCode() * 31) + this.f5984b.hashCode()) * 31) + this.f5985c.hashCode()) * 31) + this.f5986d.hashCode()) * 31;
        List<Double> list = this.f5987e;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Double d = this.f5988f;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f5989g;
        int hashCode4 = (hashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.f5990h;
        int hashCode5 = (hashCode4 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.f5991i;
        int hashCode6 = (hashCode5 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.f5992j;
        int hashCode7 = (hashCode6 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.f5993k;
        int hashCode8 = (hashCode7 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Integer num = this.f5994l;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.f5995m;
        int hashCode10 = (hashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.f5996n;
        return hashCode10 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        String str = this.f5983a;
        DateTime dateTime = this.f5984b;
        DateTime dateTime2 = this.f5985c;
        List<String> list = this.f5986d;
        List<Double> list2 = this.f5987e;
        Double d = this.f5988f;
        Double d2 = this.f5989g;
        Double d3 = this.f5990h;
        Double d4 = this.f5991i;
        Double d5 = this.f5992j;
        Double d6 = this.f5993k;
        Integer num = this.f5994l;
        Boolean bool = this.f5995m;
        Long l = this.f5996n;
        return "RiderTappedAddRideButton(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", areaIds=" + list + ", timeInAreas=" + list2 + ", clientLastTrackLatitude=" + d + ", clientLastTrackLongitude=" + d2 + ", clientLastTrackHeading=" + d3 + ", clientLastTrackSpeed=" + d4 + ", clientLastTrackAltitude=" + d5 + ", clientLastTrackAccuracy=" + d6 + ", clientLastTrackMaxSpeedResponse=" + num + ", hasPrimaryRide=" + bool + ", concurrentRideCount=" + l + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C32320Da5(String str, DateTime dateTime, DateTime dateTime2, List list, List list2, Double d, Double d2, Double d3, Double d4, Double d5, Double d6, Integer num, Boolean bool, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, list, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : d, (i & 64) != 0 ? null : d2, (i & 128) != 0 ? null : d3, (i & 256) != 0 ? null : d4, (i & 512) != 0 ? null : d5, (i & 1024) != 0 ? null : d6, (i & 2048) != 0 ? null : num, (i & 4096) != 0 ? null : bool, (i & 8192) != 0 ? null : l);
        String str2;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str2 = uuid;
        } else {
            str2 = str;
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
