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
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b&\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B¥\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\bF\u0010GJ°\u0001\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0017\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b2\u0010.R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b3\u0010,\u001a\u0004\b4\u0010.R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b5\u0010,\u001a\u0004\b6\u0010.R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b7\u0010,\u001a\u0004\b8\u0010.R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b\u0014\u0010?R\"\u0010C\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00190@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\u001e¨\u0006H"}, m28432d2 = {"LHa5;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "", "areaIds", "", "timeInAreas", "clientLastTrackLatitude", "clientLastTrackLongitude", "clientLastTrackHeading", "clientLastTrackSpeed", "clientLastTrackAltitude", "clientLastTrackAccuracy", "", "clientLastTrackMaxSpeedResponse", "", "isInRegistration", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;)LHa5;", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "getAreaIds", "()Ljava/util/List;", "e", "getTimeInAreas", "f", "Ljava/lang/Double;", "getClientLastTrackLatitude", "()Ljava/lang/Double;", "g", "getClientLastTrackLongitude", "h", "getClientLastTrackHeading", "i", "getClientLastTrackSpeed", "j", "getClientLastTrackAltitude", "k", "getClientLastTrackAccuracy", "l", "Ljava/lang/Integer;", "getClientLastTrackMaxSpeedResponse", "()Ljava/lang/Integer;", "m", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ha5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C33256Ha5 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f13568a;

    /* renamed from: b */
    public final DateTime f13569b;

    /* renamed from: c */
    public final DateTime f13570c;

    /* renamed from: d */
    public final List<String> f13571d;

    /* renamed from: e */
    public final List<Double> f13572e;

    /* renamed from: f */
    public final Double f13573f;

    /* renamed from: g */
    public final Double f13574g;

    /* renamed from: h */
    public final Double f13575h;

    /* renamed from: i */
    public final Double f13576i;

    /* renamed from: j */
    public final Double f13577j;

    /* renamed from: k */
    public final Double f13578k;

    /* renamed from: l */
    public final Integer f13579l;

    /* renamed from: m */
    public final Boolean f13580m;

    public C33256Ha5(String eventId, DateTime eventTime, DateTime clientTime, List<String> areaIds, List<Double> list, Double d, Double d2, Double d3, Double d4, Double d5, Double d6, Integer num, Boolean bool) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(areaIds, "areaIds");
        this.f13568a = eventId;
        this.f13569b = eventTime;
        this.f13570c = clientTime;
        this.f13571d = areaIds;
        this.f13572e = list;
        this.f13573f = d;
        this.f13574g = d2;
        this.f13575h = d3;
        this.f13576i = d4;
        this.f13577j = d5;
        this.f13578k = d6;
        this.f13579l = num;
        this.f13580m = bool;
    }

    /* renamed from: a */
    public final C33256Ha5 m103697a(String eventId, DateTime eventTime, DateTime clientTime, List<String> areaIds, List<Double> list, Double d, Double d2, Double d3, Double d4, Double d5, Double d6, Integer num, Boolean bool) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(areaIds, "areaIds");
        return new C33256Ha5(eventId, eventTime, clientTime, areaIds, list, d, d2, d3, d4, d5, d6, num, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C33256Ha5) {
            C33256Ha5 c33256Ha5 = (C33256Ha5) obj;
            return Intrinsics.areEqual(this.f13568a, c33256Ha5.f13568a) && Intrinsics.areEqual(this.f13569b, c33256Ha5.f13569b) && Intrinsics.areEqual(this.f13570c, c33256Ha5.f13570c) && Intrinsics.areEqual(this.f13571d, c33256Ha5.f13571d) && Intrinsics.areEqual(this.f13572e, c33256Ha5.f13572e) && Intrinsics.areEqual((Object) this.f13573f, (Object) c33256Ha5.f13573f) && Intrinsics.areEqual((Object) this.f13574g, (Object) c33256Ha5.f13574g) && Intrinsics.areEqual((Object) this.f13575h, (Object) c33256Ha5.f13575h) && Intrinsics.areEqual((Object) this.f13576i, (Object) c33256Ha5.f13576i) && Intrinsics.areEqual((Object) this.f13577j, (Object) c33256Ha5.f13577j) && Intrinsics.areEqual((Object) this.f13578k, (Object) c33256Ha5.f13578k) && Intrinsics.areEqual(this.f13579l, c33256Ha5.f13579l) && Intrinsics.areEqual(this.f13580m, c33256Ha5.f13580m);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.RiderTappedRideStartButton";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f13568a), TuplesKt.m28425to("event_time", this.f13569b), TuplesKt.m28425to("client_time", this.f13570c), TuplesKt.m28425to("area_ids", this.f13571d), TuplesKt.m28425to("time_in_areas", this.f13572e), TuplesKt.m28425to("client_last_track_latitude", this.f13573f), TuplesKt.m28425to("client_last_track_longitude", this.f13574g), TuplesKt.m28425to("client_last_track_heading", this.f13575h), TuplesKt.m28425to("client_last_track_speed", this.f13576i), TuplesKt.m28425to("client_last_track_altitude", this.f13577j), TuplesKt.m28425to("client_last_track_accuracy", this.f13578k), TuplesKt.m28425to("client_last_track_max_speed_response", this.f13579l), TuplesKt.m28425to("is_in_registration", this.f13580m));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((this.f13568a.hashCode() * 31) + this.f13569b.hashCode()) * 31) + this.f13570c.hashCode()) * 31) + this.f13571d.hashCode()) * 31;
        List<Double> list = this.f13572e;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Double d = this.f13573f;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f13574g;
        int hashCode4 = (hashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.f13575h;
        int hashCode5 = (hashCode4 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.f13576i;
        int hashCode6 = (hashCode5 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.f13577j;
        int hashCode7 = (hashCode6 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.f13578k;
        int hashCode8 = (hashCode7 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Integer num = this.f13579l;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.f13580m;
        return hashCode9 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        String str = this.f13568a;
        DateTime dateTime = this.f13569b;
        DateTime dateTime2 = this.f13570c;
        List<String> list = this.f13571d;
        List<Double> list2 = this.f13572e;
        Double d = this.f13573f;
        Double d2 = this.f13574g;
        Double d3 = this.f13575h;
        Double d4 = this.f13576i;
        Double d5 = this.f13577j;
        Double d6 = this.f13578k;
        Integer num = this.f13579l;
        Boolean bool = this.f13580m;
        return "RiderTappedRideStartButton(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", areaIds=" + list + ", timeInAreas=" + list2 + ", clientLastTrackLatitude=" + d + ", clientLastTrackLongitude=" + d2 + ", clientLastTrackHeading=" + d3 + ", clientLastTrackSpeed=" + d4 + ", clientLastTrackAltitude=" + d5 + ", clientLastTrackAccuracy=" + d6 + ", clientLastTrackMaxSpeedResponse=" + num + ", isInRegistration=" + bool + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C33256Ha5(String str, DateTime dateTime, DateTime dateTime2, List list, List list2, Double d, Double d2, Double d3, Double d4, Double d5, Double d6, Integer num, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, list, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : d, (i & 64) != 0 ? null : d2, (i & 128) != 0 ? null : d3, (i & 256) != 0 ? null : d4, (i & 512) != 0 ? null : d5, (i & 1024) != 0 ? null : d6, (i & 2048) != 0 ? null : num, (i & 4096) != 0 ? null : bool);
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
