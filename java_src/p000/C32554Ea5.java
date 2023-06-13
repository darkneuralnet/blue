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
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b(\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\bI\u0010JJº\u0001\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0018\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\r\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\b5\u00101R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b6\u0010/\u001a\u0004\b7\u00101R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b8\u0010/\u001a\u0004\b9\u00101R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b:\u0010/\u001a\u0004\b;\u00101R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b\u0015\u0010BR\"\u0010F\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001a0C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010H\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010\u001f¨\u0006K"}, m28432d2 = {"LEa5;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "scanButtonShape", "", "areaIds", "", "timeInAreas", "clientLastTrackLatitude", "clientLastTrackLongitude", "clientLastTrackHeading", "clientLastTrackSpeed", "clientLastTrackAltitude", "clientLastTrackAccuracy", "", "clientLastTrackMaxSpeedResponse", "", "isInRegistration", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;)LEa5;", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getScanButtonShape", "e", "Ljava/util/List;", "getAreaIds", "()Ljava/util/List;", "f", "getTimeInAreas", "g", "Ljava/lang/Double;", "getClientLastTrackLatitude", "()Ljava/lang/Double;", "h", "getClientLastTrackLongitude", "i", "getClientLastTrackHeading", "j", "getClientLastTrackSpeed", "k", "getClientLastTrackAltitude", "l", "getClientLastTrackAccuracy", "m", "Ljava/lang/Integer;", "getClientLastTrackMaxSpeedResponse", "()Ljava/lang/Integer;", "n", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ea5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C32554Ea5 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f7739a;

    /* renamed from: b */
    public final DateTime f7740b;

    /* renamed from: c */
    public final DateTime f7741c;

    /* renamed from: d */
    public final String f7742d;

    /* renamed from: e */
    public final List<String> f7743e;

    /* renamed from: f */
    public final List<Double> f7744f;

    /* renamed from: g */
    public final Double f7745g;

    /* renamed from: h */
    public final Double f7746h;

    /* renamed from: i */
    public final Double f7747i;

    /* renamed from: j */
    public final Double f7748j;

    /* renamed from: k */
    public final Double f7749k;

    /* renamed from: l */
    public final Double f7750l;

    /* renamed from: m */
    public final Integer f7751m;

    /* renamed from: n */
    public final Boolean f7752n;

    public C32554Ea5(String eventId, DateTime eventTime, DateTime clientTime, String scanButtonShape, List<String> areaIds, List<Double> list, Double d, Double d2, Double d3, Double d4, Double d5, Double d6, Integer num, Boolean bool) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(scanButtonShape, "scanButtonShape");
        Intrinsics.checkNotNullParameter(areaIds, "areaIds");
        this.f7739a = eventId;
        this.f7740b = eventTime;
        this.f7741c = clientTime;
        this.f7742d = scanButtonShape;
        this.f7743e = areaIds;
        this.f7744f = list;
        this.f7745g = d;
        this.f7746h = d2;
        this.f7747i = d3;
        this.f7748j = d4;
        this.f7749k = d5;
        this.f7750l = d6;
        this.f7751m = num;
        this.f7752n = bool;
    }

    /* renamed from: a */
    public final C32554Ea5 m108745a(String eventId, DateTime eventTime, DateTime clientTime, String scanButtonShape, List<String> areaIds, List<Double> list, Double d, Double d2, Double d3, Double d4, Double d5, Double d6, Integer num, Boolean bool) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(scanButtonShape, "scanButtonShape");
        Intrinsics.checkNotNullParameter(areaIds, "areaIds");
        return new C32554Ea5(eventId, eventTime, clientTime, scanButtonShape, areaIds, list, d, d2, d3, d4, d5, d6, num, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C32554Ea5) {
            C32554Ea5 c32554Ea5 = (C32554Ea5) obj;
            return Intrinsics.areEqual(this.f7739a, c32554Ea5.f7739a) && Intrinsics.areEqual(this.f7740b, c32554Ea5.f7740b) && Intrinsics.areEqual(this.f7741c, c32554Ea5.f7741c) && Intrinsics.areEqual(this.f7742d, c32554Ea5.f7742d) && Intrinsics.areEqual(this.f7743e, c32554Ea5.f7743e) && Intrinsics.areEqual(this.f7744f, c32554Ea5.f7744f) && Intrinsics.areEqual((Object) this.f7745g, (Object) c32554Ea5.f7745g) && Intrinsics.areEqual((Object) this.f7746h, (Object) c32554Ea5.f7746h) && Intrinsics.areEqual((Object) this.f7747i, (Object) c32554Ea5.f7747i) && Intrinsics.areEqual((Object) this.f7748j, (Object) c32554Ea5.f7748j) && Intrinsics.areEqual((Object) this.f7749k, (Object) c32554Ea5.f7749k) && Intrinsics.areEqual((Object) this.f7750l, (Object) c32554Ea5.f7750l) && Intrinsics.areEqual(this.f7751m, c32554Ea5.f7751m) && Intrinsics.areEqual(this.f7752n, c32554Ea5.f7752n);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.RiderTappedGroupRideButton";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f7739a), TuplesKt.m28425to("event_time", this.f7740b), TuplesKt.m28425to("client_time", this.f7741c), TuplesKt.m28425to("scan_button_shape", this.f7742d), TuplesKt.m28425to("area_ids", this.f7743e), TuplesKt.m28425to("time_in_areas", this.f7744f), TuplesKt.m28425to("client_last_track_latitude", this.f7745g), TuplesKt.m28425to("client_last_track_longitude", this.f7746h), TuplesKt.m28425to("client_last_track_heading", this.f7747i), TuplesKt.m28425to("client_last_track_speed", this.f7748j), TuplesKt.m28425to("client_last_track_altitude", this.f7749k), TuplesKt.m28425to("client_last_track_accuracy", this.f7750l), TuplesKt.m28425to("client_last_track_max_speed_response", this.f7751m), TuplesKt.m28425to("is_in_registration", this.f7752n));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f7739a.hashCode() * 31) + this.f7740b.hashCode()) * 31) + this.f7741c.hashCode()) * 31) + this.f7742d.hashCode()) * 31) + this.f7743e.hashCode()) * 31;
        List<Double> list = this.f7744f;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Double d = this.f7745g;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f7746h;
        int hashCode4 = (hashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.f7747i;
        int hashCode5 = (hashCode4 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.f7748j;
        int hashCode6 = (hashCode5 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.f7749k;
        int hashCode7 = (hashCode6 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.f7750l;
        int hashCode8 = (hashCode7 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Integer num = this.f7751m;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.f7752n;
        return hashCode9 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        String str = this.f7739a;
        DateTime dateTime = this.f7740b;
        DateTime dateTime2 = this.f7741c;
        String str2 = this.f7742d;
        List<String> list = this.f7743e;
        List<Double> list2 = this.f7744f;
        Double d = this.f7745g;
        Double d2 = this.f7746h;
        Double d3 = this.f7747i;
        Double d4 = this.f7748j;
        Double d5 = this.f7749k;
        Double d6 = this.f7750l;
        Integer num = this.f7751m;
        Boolean bool = this.f7752n;
        return "RiderTappedGroupRideButton(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", scanButtonShape=" + str2 + ", areaIds=" + list + ", timeInAreas=" + list2 + ", clientLastTrackLatitude=" + d + ", clientLastTrackLongitude=" + d2 + ", clientLastTrackHeading=" + d3 + ", clientLastTrackSpeed=" + d4 + ", clientLastTrackAltitude=" + d5 + ", clientLastTrackAccuracy=" + d6 + ", clientLastTrackMaxSpeedResponse=" + num + ", isInRegistration=" + bool + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C32554Ea5(String str, DateTime dateTime, DateTime dateTime2, String str2, List list, List list2, Double d, Double d2, Double d3, Double d4, Double d5, Double d6, Integer num, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, str2, list, (i & 32) != 0 ? null : list2, (i & 64) != 0 ? null : d, (i & 128) != 0 ? null : d2, (i & 256) != 0 ? null : d3, (i & 512) != 0 ? null : d4, (i & 1024) != 0 ? null : d5, (i & 2048) != 0 ? null : d6, (i & 4096) != 0 ? null : num, (i & 8192) != 0 ? null : bool);
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
