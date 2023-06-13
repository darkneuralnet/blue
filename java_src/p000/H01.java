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
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001c\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b7\u00108J~\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u0017\u001a\u0004\b'\u0010\u0019R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b\r\u0010.R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b/\u0010-\u001a\u0004\b\u000e\u0010.R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b\u000f\u0010.R\"\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0014018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00106\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0019¨\u00069"}, m28432d2 = {"LH01;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "", "mapDragCount", "destinationSearchResultCount", "destinationSelectionType", "destinationAreaMaxSpeed", "", "isDestinationAreaNoRide", "isDestinationAreaNoParking", "isDestinationAreaOperational", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;IILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)LH01;", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "I", "getMapDragCount", "()I", "e", "getDestinationSearchResultCount", "f", "getDestinationSelectionType", "g", "Ljava/lang/Integer;", "getDestinationAreaMaxSpeed", "()Ljava/lang/Integer;", "h", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "i", "j", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;IILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: H01 */
/* loaded from: classes4.dex */
public final class H01 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f12707a;

    /* renamed from: b */
    public final DateTime f12708b;

    /* renamed from: c */
    public final DateTime f12709c;

    /* renamed from: d */
    public final int f12710d;

    /* renamed from: e */
    public final int f12711e;

    /* renamed from: f */
    public final String f12712f;

    /* renamed from: g */
    public final Integer f12713g;

    /* renamed from: h */
    public final Boolean f12714h;

    /* renamed from: i */
    public final Boolean f12715i;

    /* renamed from: j */
    public final Boolean f12716j;

    public H01(String eventId, DateTime eventTime, DateTime clientTime, int i, int i2, String str, Integer num, Boolean bool, Boolean bool2, Boolean bool3) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        this.f12707a = eventId;
        this.f12708b = eventTime;
        this.f12709c = clientTime;
        this.f12710d = i;
        this.f12711e = i2;
        this.f12712f = str;
        this.f12713g = num;
        this.f12714h = bool;
        this.f12715i = bool2;
        this.f12716j = bool3;
    }

    /* renamed from: a */
    public final H01 m104508a(String eventId, DateTime eventTime, DateTime clientTime, int i, int i2, String str, Integer num, Boolean bool, Boolean bool2, Boolean bool3) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        return new H01(eventId, eventTime, clientTime, i, i2, str, num, bool, bool2, bool3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof H01) {
            H01 h01 = (H01) obj;
            return Intrinsics.areEqual(this.f12707a, h01.f12707a) && Intrinsics.areEqual(this.f12708b, h01.f12708b) && Intrinsics.areEqual(this.f12709c, h01.f12709c) && this.f12710d == h01.f12710d && this.f12711e == h01.f12711e && Intrinsics.areEqual(this.f12712f, h01.f12712f) && Intrinsics.areEqual(this.f12713g, h01.f12713g) && Intrinsics.areEqual(this.f12714h, h01.f12714h) && Intrinsics.areEqual(this.f12715i, h01.f12715i) && Intrinsics.areEqual(this.f12716j, h01.f12716j);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.DestinationEditBarRemoveButtonTapped";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f12707a), TuplesKt.m28425to("event_time", this.f12708b), TuplesKt.m28425to("client_time", this.f12709c), TuplesKt.m28425to("map_drag_count", Integer.valueOf(this.f12710d)), TuplesKt.m28425to("destination_search_result_count", Integer.valueOf(this.f12711e)), TuplesKt.m28425to("destination_selection_type", this.f12712f), TuplesKt.m28425to("destination_area_max_speed", this.f12713g), TuplesKt.m28425to("is_destination_area_no_ride", this.f12714h), TuplesKt.m28425to("is_destination_area_no_parking", this.f12715i), TuplesKt.m28425to("is_destination_area_operational", this.f12716j));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f12707a.hashCode() * 31) + this.f12708b.hashCode()) * 31) + this.f12709c.hashCode()) * 31) + Integer.hashCode(this.f12710d)) * 31) + Integer.hashCode(this.f12711e)) * 31;
        String str = this.f12712f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f12713g;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.f12714h;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f12715i;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f12716j;
        return hashCode5 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public String toString() {
        String str = this.f12707a;
        DateTime dateTime = this.f12708b;
        DateTime dateTime2 = this.f12709c;
        int i = this.f12710d;
        int i2 = this.f12711e;
        String str2 = this.f12712f;
        Integer num = this.f12713g;
        Boolean bool = this.f12714h;
        Boolean bool2 = this.f12715i;
        Boolean bool3 = this.f12716j;
        return "DestinationEditBarRemoveButtonTapped(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", mapDragCount=" + i + ", destinationSearchResultCount=" + i2 + ", destinationSelectionType=" + str2 + ", destinationAreaMaxSpeed=" + num + ", isDestinationAreaNoRide=" + bool + ", isDestinationAreaNoParking=" + bool2 + ", isDestinationAreaOperational=" + bool3 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ H01(String str, DateTime dateTime, DateTime dateTime2, int i, int i2, String str2, Integer num, Boolean bool, Boolean bool2, Boolean bool3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, i, i2, (i3 & 32) != 0 ? null : str2, (i3 & 64) != 0 ? null : num, (i3 & 128) != 0 ? null : bool, (i3 & 256) != 0 ? null : bool2, (i3 & 512) != 0 ? null : bool3);
        String str3;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i3 & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str3 = uuid;
        } else {
            str3 = str;
        }
        if ((i3 & 2) != 0) {
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            dateTime3 = now;
        } else {
            dateTime3 = dateTime;
        }
        if ((i3 & 4) != 0) {
            DateTime now2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now2, "now()");
            dateTime4 = now2;
        } else {
            dateTime4 = dateTime2;
        }
    }
}
