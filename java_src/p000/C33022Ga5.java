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
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b&\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B±\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\bH\u0010IJ¼\u0001\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0017\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b)\u0010\u001fR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b5\u00103R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b7\u00103R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b8\u00101\u001a\u0004\b9\u00103R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b:\u00101\u001a\u0004\b;\u00103R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b<\u00101\u001a\u0004\b=\u00103R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\"\u0010E\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00190B8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0014\u0010G\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010\u001f¨\u0006J"}, m28432d2 = {"LGa5;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "endRideAttemptId", "rideId", "", "areaIds", "", "timeInAreas", "clientLastTrackLatitude", "clientLastTrackLongitude", "clientLastTrackHeading", "clientLastTrackSpeed", "clientLastTrackAltitude", "clientLastTrackAccuracy", "", "clientLastTrackMaxSpeedResponse", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;)LGa5;", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getEndRideAttemptId", "e", "getRideId", "f", "Ljava/util/List;", "getAreaIds", "()Ljava/util/List;", "g", "getTimeInAreas", "h", "Ljava/lang/Double;", "getClientLastTrackLatitude", "()Ljava/lang/Double;", "i", "getClientLastTrackLongitude", "j", "getClientLastTrackHeading", "k", "getClientLastTrackSpeed", "l", "getClientLastTrackAltitude", "m", "getClientLastTrackAccuracy", "n", "Ljava/lang/Integer;", "getClientLastTrackMaxSpeedResponse", "()Ljava/lang/Integer;", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ga5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C33022Ga5 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f12103a;

    /* renamed from: b */
    public final DateTime f12104b;

    /* renamed from: c */
    public final DateTime f12105c;

    /* renamed from: d */
    public final String f12106d;

    /* renamed from: e */
    public final String f12107e;

    /* renamed from: f */
    public final List<String> f12108f;

    /* renamed from: g */
    public final List<Double> f12109g;

    /* renamed from: h */
    public final Double f12110h;

    /* renamed from: i */
    public final Double f12111i;

    /* renamed from: j */
    public final Double f12112j;

    /* renamed from: k */
    public final Double f12113k;

    /* renamed from: l */
    public final Double f12114l;

    /* renamed from: m */
    public final Double f12115m;

    /* renamed from: n */
    public final Integer f12116n;

    public C33022Ga5(String eventId, DateTime eventTime, DateTime clientTime, String str, String str2, List<String> areaIds, List<Double> list, Double d, Double d2, Double d3, Double d4, Double d5, Double d6, Integer num) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(areaIds, "areaIds");
        this.f12103a = eventId;
        this.f12104b = eventTime;
        this.f12105c = clientTime;
        this.f12106d = str;
        this.f12107e = str2;
        this.f12108f = areaIds;
        this.f12109g = list;
        this.f12110h = d;
        this.f12111i = d2;
        this.f12112j = d3;
        this.f12113k = d4;
        this.f12114l = d5;
        this.f12115m = d6;
        this.f12116n = num;
    }

    /* renamed from: a */
    public final C33022Ga5 m104998a(String eventId, DateTime eventTime, DateTime clientTime, String str, String str2, List<String> areaIds, List<Double> list, Double d, Double d2, Double d3, Double d4, Double d5, Double d6, Integer num) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(areaIds, "areaIds");
        return new C33022Ga5(eventId, eventTime, clientTime, str, str2, areaIds, list, d, d2, d3, d4, d5, d6, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C33022Ga5) {
            C33022Ga5 c33022Ga5 = (C33022Ga5) obj;
            return Intrinsics.areEqual(this.f12103a, c33022Ga5.f12103a) && Intrinsics.areEqual(this.f12104b, c33022Ga5.f12104b) && Intrinsics.areEqual(this.f12105c, c33022Ga5.f12105c) && Intrinsics.areEqual(this.f12106d, c33022Ga5.f12106d) && Intrinsics.areEqual(this.f12107e, c33022Ga5.f12107e) && Intrinsics.areEqual(this.f12108f, c33022Ga5.f12108f) && Intrinsics.areEqual(this.f12109g, c33022Ga5.f12109g) && Intrinsics.areEqual((Object) this.f12110h, (Object) c33022Ga5.f12110h) && Intrinsics.areEqual((Object) this.f12111i, (Object) c33022Ga5.f12111i) && Intrinsics.areEqual((Object) this.f12112j, (Object) c33022Ga5.f12112j) && Intrinsics.areEqual((Object) this.f12113k, (Object) c33022Ga5.f12113k) && Intrinsics.areEqual((Object) this.f12114l, (Object) c33022Ga5.f12114l) && Intrinsics.areEqual((Object) this.f12115m, (Object) c33022Ga5.f12115m) && Intrinsics.areEqual(this.f12116n, c33022Ga5.f12116n);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.RiderTappedRideEndButton";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f12103a), TuplesKt.m28425to("event_time", this.f12104b), TuplesKt.m28425to("client_time", this.f12105c), TuplesKt.m28425to("end_ride_attempt_id", this.f12106d), TuplesKt.m28425to("ride_id", this.f12107e), TuplesKt.m28425to("area_ids", this.f12108f), TuplesKt.m28425to("time_in_areas", this.f12109g), TuplesKt.m28425to("client_last_track_latitude", this.f12110h), TuplesKt.m28425to("client_last_track_longitude", this.f12111i), TuplesKt.m28425to("client_last_track_heading", this.f12112j), TuplesKt.m28425to("client_last_track_speed", this.f12113k), TuplesKt.m28425to("client_last_track_altitude", this.f12114l), TuplesKt.m28425to("client_last_track_accuracy", this.f12115m), TuplesKt.m28425to("client_last_track_max_speed_response", this.f12116n));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((this.f12103a.hashCode() * 31) + this.f12104b.hashCode()) * 31) + this.f12105c.hashCode()) * 31;
        String str = this.f12106d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f12107e;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f12108f.hashCode()) * 31;
        List<Double> list = this.f12109g;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Double d = this.f12110h;
        int hashCode5 = (hashCode4 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f12111i;
        int hashCode6 = (hashCode5 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.f12112j;
        int hashCode7 = (hashCode6 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.f12113k;
        int hashCode8 = (hashCode7 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.f12114l;
        int hashCode9 = (hashCode8 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.f12115m;
        int hashCode10 = (hashCode9 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Integer num = this.f12116n;
        return hashCode10 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        String str = this.f12103a;
        DateTime dateTime = this.f12104b;
        DateTime dateTime2 = this.f12105c;
        String str2 = this.f12106d;
        String str3 = this.f12107e;
        List<String> list = this.f12108f;
        List<Double> list2 = this.f12109g;
        Double d = this.f12110h;
        Double d2 = this.f12111i;
        Double d3 = this.f12112j;
        Double d4 = this.f12113k;
        Double d5 = this.f12114l;
        Double d6 = this.f12115m;
        Integer num = this.f12116n;
        return "RiderTappedRideEndButton(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", endRideAttemptId=" + str2 + ", rideId=" + str3 + ", areaIds=" + list + ", timeInAreas=" + list2 + ", clientLastTrackLatitude=" + d + ", clientLastTrackLongitude=" + d2 + ", clientLastTrackHeading=" + d3 + ", clientLastTrackSpeed=" + d4 + ", clientLastTrackAltitude=" + d5 + ", clientLastTrackAccuracy=" + d6 + ", clientLastTrackMaxSpeedResponse=" + num + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C33022Ga5(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, List list, List list2, Double d, Double d2, Double d3, Double d4, Double d5, Double d6, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, list, (i & 64) != 0 ? null : list2, (i & 128) != 0 ? null : d, (i & 256) != 0 ? null : d2, (i & 512) != 0 ? null : d3, (i & 1024) != 0 ? null : d4, (i & 2048) != 0 ? null : d5, (i & 4096) != 0 ? null : d6, (i & 8192) != 0 ? null : num);
        String str4;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str4 = uuid;
        } else {
            str4 = str;
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
