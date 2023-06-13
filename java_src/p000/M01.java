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
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0018\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b1\u00102Jh\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u000b\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b\f\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b\r\u0010(R\"\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00120+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0017¨\u00063"}, m28432d2 = {"LM01;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "", "mapDragCount", "destinationAreaMaxSpeed", "", "isDestinationAreaNoRide", "isDestinationAreaNoParking", "isDestinationAreaOperational", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ILjava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)LM01;", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "I", "getMapDragCount", "()I", "e", "Ljava/lang/Integer;", "getDestinationAreaMaxSpeed", "()Ljava/lang/Integer;", "f", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "g", "h", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ILjava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: M01 */
/* loaded from: classes4.dex */
public final class M01 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f22420a;

    /* renamed from: b */
    public final DateTime f22421b;

    /* renamed from: c */
    public final DateTime f22422c;

    /* renamed from: d */
    public final int f22423d;

    /* renamed from: e */
    public final Integer f22424e;

    /* renamed from: f */
    public final Boolean f22425f;

    /* renamed from: g */
    public final Boolean f22426g;

    /* renamed from: h */
    public final Boolean f22427h;

    public M01(String eventId, DateTime eventTime, DateTime clientTime, int i, Integer num, Boolean bool, Boolean bool2, Boolean bool3) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        this.f22420a = eventId;
        this.f22421b = eventTime;
        this.f22422c = clientTime;
        this.f22423d = i;
        this.f22424e = num;
        this.f22425f = bool;
        this.f22426g = bool2;
        this.f22427h = bool3;
    }

    /* renamed from: a */
    public final M01 m96016a(String eventId, DateTime eventTime, DateTime clientTime, int i, Integer num, Boolean bool, Boolean bool2, Boolean bool3) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        return new M01(eventId, eventTime, clientTime, i, num, bool, bool2, bool3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof M01) {
            M01 m01 = (M01) obj;
            return Intrinsics.areEqual(this.f22420a, m01.f22420a) && Intrinsics.areEqual(this.f22421b, m01.f22421b) && Intrinsics.areEqual(this.f22422c, m01.f22422c) && this.f22423d == m01.f22423d && Intrinsics.areEqual(this.f22424e, m01.f22424e) && Intrinsics.areEqual(this.f22425f, m01.f22425f) && Intrinsics.areEqual(this.f22426g, m01.f22426g) && Intrinsics.areEqual(this.f22427h, m01.f22427h);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.DestinationInfoBarEditButtonTapped";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f22420a), TuplesKt.m28425to("event_time", this.f22421b), TuplesKt.m28425to("client_time", this.f22422c), TuplesKt.m28425to("map_drag_count", Integer.valueOf(this.f22423d)), TuplesKt.m28425to("destination_area_max_speed", this.f22424e), TuplesKt.m28425to("is_destination_area_no_ride", this.f22425f), TuplesKt.m28425to("is_destination_area_no_parking", this.f22426g), TuplesKt.m28425to("is_destination_area_operational", this.f22427h));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((this.f22420a.hashCode() * 31) + this.f22421b.hashCode()) * 31) + this.f22422c.hashCode()) * 31) + Integer.hashCode(this.f22423d)) * 31;
        Integer num = this.f22424e;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.f22425f;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f22426g;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f22427h;
        return hashCode4 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public String toString() {
        String str = this.f22420a;
        DateTime dateTime = this.f22421b;
        DateTime dateTime2 = this.f22422c;
        int i = this.f22423d;
        Integer num = this.f22424e;
        Boolean bool = this.f22425f;
        Boolean bool2 = this.f22426g;
        Boolean bool3 = this.f22427h;
        return "DestinationInfoBarEditButtonTapped(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", mapDragCount=" + i + ", destinationAreaMaxSpeed=" + num + ", isDestinationAreaNoRide=" + bool + ", isDestinationAreaNoParking=" + bool2 + ", isDestinationAreaOperational=" + bool3 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ M01(String str, DateTime dateTime, DateTime dateTime2, int i, Integer num, Boolean bool, Boolean bool2, Boolean bool3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, i, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : bool, (i2 & 64) != 0 ? null : bool2, (i2 & 128) != 0 ? null : bool3);
        String str2;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i2 & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str2 = uuid;
        } else {
            str2 = str;
        }
        if ((i2 & 2) != 0) {
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            dateTime3 = now;
        } else {
            dateTime3 = dateTime;
        }
        if ((i2 & 4) != 0) {
            DateTime now2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now2, "now()");
            dateTime4 = now2;
        } else {
            dateTime4 = dateTime2;
        }
    }
}
