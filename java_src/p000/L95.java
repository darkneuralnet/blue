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
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b#\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\bB\u0010CJ\u009e\u0001\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0015\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001e\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b2\u0010.R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b3\u0010\u001b\u001a\u0004\b4\u0010\u001dR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b\u0010\u00107R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\"\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00180<8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010A\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\u001d¨\u0006D"}, m28432d2 = {"LL95;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "", "distanceToClosestBird", "distanceToNearestRebalanceBird", "", "birdIdsVisibleOnMap", "rebalanceBirdIdsVisibleOnMap", "currentAreaIdsForUser", "rideId", "", "isInRegistration", "", "concurrentRideCount", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;DLjava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;)LL95;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "D", "()D", "e", "Ljava/lang/Double;", "getDistanceToNearestRebalanceBird", "()Ljava/lang/Double;", "f", "Ljava/util/List;", "getBirdIdsVisibleOnMap", "()Ljava/util/List;", "g", "getRebalanceBirdIdsVisibleOnMap", "h", "getCurrentAreaIdsForUser", "i", "getRideId", "j", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "k", "Ljava/lang/Long;", "getConcurrentRideCount", "()Ljava/lang/Long;", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;DLjava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: L95 */
/* loaded from: classes4.dex */
public final class L95 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f20816a;

    /* renamed from: b */
    public final DateTime f20817b;

    /* renamed from: c */
    public final DateTime f20818c;

    /* renamed from: d */
    public final double f20819d;

    /* renamed from: e */
    public final Double f20820e;

    /* renamed from: f */
    public final List<String> f20821f;

    /* renamed from: g */
    public final List<String> f20822g;

    /* renamed from: h */
    public final List<String> f20823h;

    /* renamed from: i */
    public final String f20824i;

    /* renamed from: j */
    public final Boolean f20825j;

    /* renamed from: k */
    public final Long f20826k;

    public L95(String eventId, DateTime eventTime, DateTime clientTime, double d, Double d2, List<String> list, List<String> list2, List<String> list3, String str, Boolean bool, Long l) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        this.f20816a = eventId;
        this.f20817b = eventTime;
        this.f20818c = clientTime;
        this.f20819d = d;
        this.f20820e = d2;
        this.f20821f = list;
        this.f20822g = list2;
        this.f20823h = list3;
        this.f20824i = str;
        this.f20825j = bool;
        this.f20826k = l;
    }

    /* renamed from: a */
    public final L95 m97645a(String eventId, DateTime eventTime, DateTime clientTime, double d, Double d2, List<String> list, List<String> list2, List<String> list3, String str, Boolean bool, Long l) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        return new L95(eventId, eventTime, clientTime, d, d2, list, list2, list3, str, bool, l);
    }

    /* renamed from: b */
    public final double m97644b() {
        return this.f20819d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof L95) {
            L95 l95 = (L95) obj;
            return Intrinsics.areEqual(this.f20816a, l95.f20816a) && Intrinsics.areEqual(this.f20817b, l95.f20817b) && Intrinsics.areEqual(this.f20818c, l95.f20818c) && Double.compare(this.f20819d, l95.f20819d) == 0 && Intrinsics.areEqual((Object) this.f20820e, (Object) l95.f20820e) && Intrinsics.areEqual(this.f20821f, l95.f20821f) && Intrinsics.areEqual(this.f20822g, l95.f20822g) && Intrinsics.areEqual(this.f20823h, l95.f20823h) && Intrinsics.areEqual(this.f20824i, l95.f20824i) && Intrinsics.areEqual(this.f20825j, l95.f20825j) && Intrinsics.areEqual(this.f20826k, l95.f20826k);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.RiderMapViewedWithNearestBird";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f20816a), TuplesKt.m28425to("event_time", this.f20817b), TuplesKt.m28425to("client_time", this.f20818c), TuplesKt.m28425to("distance_to_closest_bird", Double.valueOf(this.f20819d)), TuplesKt.m28425to("distance_to_nearest_rebalance_bird", this.f20820e), TuplesKt.m28425to("bird_ids_visible_on_map", this.f20821f), TuplesKt.m28425to("rebalance_bird_ids_visible_on_map", this.f20822g), TuplesKt.m28425to("current_area_ids_for_user", this.f20823h), TuplesKt.m28425to("ride_id", this.f20824i), TuplesKt.m28425to("is_in_registration", this.f20825j), TuplesKt.m28425to("concurrent_ride_count", this.f20826k));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((this.f20816a.hashCode() * 31) + this.f20817b.hashCode()) * 31) + this.f20818c.hashCode()) * 31) + Double.hashCode(this.f20819d)) * 31;
        Double d = this.f20820e;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        List<String> list = this.f20821f;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.f20822g;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.f20823h;
        int hashCode5 = (hashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str = this.f20824i;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f20825j;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.f20826k;
        return hashCode7 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        String str = this.f20816a;
        DateTime dateTime = this.f20817b;
        DateTime dateTime2 = this.f20818c;
        double d = this.f20819d;
        Double d2 = this.f20820e;
        List<String> list = this.f20821f;
        List<String> list2 = this.f20822g;
        List<String> list3 = this.f20823h;
        String str2 = this.f20824i;
        Boolean bool = this.f20825j;
        Long l = this.f20826k;
        return "RiderMapViewedWithNearestBird(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", distanceToClosestBird=" + d + ", distanceToNearestRebalanceBird=" + d2 + ", birdIdsVisibleOnMap=" + list + ", rebalanceBirdIdsVisibleOnMap=" + list2 + ", currentAreaIdsForUser=" + list3 + ", rideId=" + str2 + ", isInRegistration=" + bool + ", concurrentRideCount=" + l + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ L95(String str, DateTime dateTime, DateTime dateTime2, double d, Double d2, List list, List list2, List list3, String str2, Boolean bool, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, d, (i & 16) != 0 ? null : d2, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : list2, (i & 128) != 0 ? null : list3, (i & 256) != 0 ? null : str2, (i & 512) != 0 ? null : bool, (i & 1024) != 0 ? null : l);
        String str3;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str3 = uuid;
        } else {
            str3 = str;
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
