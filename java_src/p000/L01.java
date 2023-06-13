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
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0018\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b1\u00102Jh\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u000b\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b\f\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b\r\u0010(R\"\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00120+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0017¨\u00063"}, m28432d2 = {"LL01;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "", "mapDragCount", "destinationAreaMaxSpeed", "", "isDestinationAreaNoRide", "isDestinationAreaNoParking", "isDestinationAreaOperational", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ILjava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)LL01;", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "I", "getMapDragCount", "()I", "e", "Ljava/lang/Integer;", "getDestinationAreaMaxSpeed", "()Ljava/lang/Integer;", "f", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "g", "h", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ILjava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: L01 */
/* loaded from: classes4.dex */
public final class L01 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f20569a;

    /* renamed from: b */
    public final DateTime f20570b;

    /* renamed from: c */
    public final DateTime f20571c;

    /* renamed from: d */
    public final int f20572d;

    /* renamed from: e */
    public final Integer f20573e;

    /* renamed from: f */
    public final Boolean f20574f;

    /* renamed from: g */
    public final Boolean f20575g;

    /* renamed from: h */
    public final Boolean f20576h;

    public L01(String eventId, DateTime eventTime, DateTime clientTime, int i, Integer num, Boolean bool, Boolean bool2, Boolean bool3) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        this.f20569a = eventId;
        this.f20570b = eventTime;
        this.f20571c = clientTime;
        this.f20572d = i;
        this.f20573e = num;
        this.f20574f = bool;
        this.f20575g = bool2;
        this.f20576h = bool3;
    }

    /* renamed from: a */
    public final L01 m97940a(String eventId, DateTime eventTime, DateTime clientTime, int i, Integer num, Boolean bool, Boolean bool2, Boolean bool3) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        return new L01(eventId, eventTime, clientTime, i, num, bool, bool2, bool3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof L01) {
            L01 l01 = (L01) obj;
            return Intrinsics.areEqual(this.f20569a, l01.f20569a) && Intrinsics.areEqual(this.f20570b, l01.f20570b) && Intrinsics.areEqual(this.f20571c, l01.f20571c) && this.f20572d == l01.f20572d && Intrinsics.areEqual(this.f20573e, l01.f20573e) && Intrinsics.areEqual(this.f20574f, l01.f20574f) && Intrinsics.areEqual(this.f20575g, l01.f20575g) && Intrinsics.areEqual(this.f20576h, l01.f20576h);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.DestinationInfoBarCancelButtonTapped";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f20569a), TuplesKt.m28425to("event_time", this.f20570b), TuplesKt.m28425to("client_time", this.f20571c), TuplesKt.m28425to("map_drag_count", Integer.valueOf(this.f20572d)), TuplesKt.m28425to("destination_area_max_speed", this.f20573e), TuplesKt.m28425to("is_destination_area_no_ride", this.f20574f), TuplesKt.m28425to("is_destination_area_no_parking", this.f20575g), TuplesKt.m28425to("is_destination_area_operational", this.f20576h));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((this.f20569a.hashCode() * 31) + this.f20570b.hashCode()) * 31) + this.f20571c.hashCode()) * 31) + Integer.hashCode(this.f20572d)) * 31;
        Integer num = this.f20573e;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.f20574f;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f20575g;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f20576h;
        return hashCode4 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public String toString() {
        String str = this.f20569a;
        DateTime dateTime = this.f20570b;
        DateTime dateTime2 = this.f20571c;
        int i = this.f20572d;
        Integer num = this.f20573e;
        Boolean bool = this.f20574f;
        Boolean bool2 = this.f20575g;
        Boolean bool3 = this.f20576h;
        return "DestinationInfoBarCancelButtonTapped(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", mapDragCount=" + i + ", destinationAreaMaxSpeed=" + num + ", isDestinationAreaNoRide=" + bool + ", isDestinationAreaNoParking=" + bool2 + ", isDestinationAreaOperational=" + bool3 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ L01(String str, DateTime dateTime, DateTime dateTime2, int i, Integer num, Boolean bool, Boolean bool2, Boolean bool3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
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
