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
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b8\u00109J|\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0012\u001a\u00020\nHÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0017\u001a\u0004\b%\u0010\u0019R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\u0017\u001a\u0004\b1\u0010\u0019R\"\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0013028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00107\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u0019¨\u0006:"}, m28432d2 = {"LPI6;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "zoneId", "icon", "count", "", "annotationColor", "overlayColor", "overlayBorderColor", "flightSheetTitle", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;IILjava/lang/String;)LPI6;", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getZoneId", "e", "getIcon", "f", "getCount", "g", "Ljava/lang/Integer;", "getAnnotationColor", "()Ljava/lang/Integer;", "h", "I", "getOverlayColor", "()I", "i", "getOverlayBorderColor", "j", "getFlightSheetTitle", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;IILjava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: PI6 */
/* loaded from: classes4.dex */
public final class PI6 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f28238a;

    /* renamed from: b */
    public final DateTime f28239b;

    /* renamed from: c */
    public final DateTime f28240c;

    /* renamed from: d */
    public final String f28241d;

    /* renamed from: e */
    public final String f28242e;

    /* renamed from: f */
    public final String f28243f;

    /* renamed from: g */
    public final Integer f28244g;

    /* renamed from: h */
    public final int f28245h;

    /* renamed from: i */
    public final int f28246i;

    /* renamed from: j */
    public final String f28247j;

    public PI6(String eventId, DateTime eventTime, DateTime clientTime, String zoneId, String str, String str2, Integer num, int i, int i2, String str3) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        this.f28238a = eventId;
        this.f28239b = eventTime;
        this.f28240c = clientTime;
        this.f28241d = zoneId;
        this.f28242e = str;
        this.f28243f = str2;
        this.f28244g = num;
        this.f28245h = i;
        this.f28246i = i2;
        this.f28247j = str3;
    }

    /* renamed from: a */
    public final PI6 m90487a(String eventId, DateTime eventTime, DateTime clientTime, String zoneId, String str, String str2, Integer num, int i, int i2, String str3) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        return new PI6(eventId, eventTime, clientTime, zoneId, str, str2, num, i, i2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PI6) {
            PI6 pi6 = (PI6) obj;
            return Intrinsics.areEqual(this.f28238a, pi6.f28238a) && Intrinsics.areEqual(this.f28239b, pi6.f28239b) && Intrinsics.areEqual(this.f28240c, pi6.f28240c) && Intrinsics.areEqual(this.f28241d, pi6.f28241d) && Intrinsics.areEqual(this.f28242e, pi6.f28242e) && Intrinsics.areEqual(this.f28243f, pi6.f28243f) && Intrinsics.areEqual(this.f28244g, pi6.f28244g) && this.f28245h == pi6.f28245h && this.f28246i == pi6.f28246i && Intrinsics.areEqual(this.f28247j, pi6.f28247j);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.ZoneFlightSheetViewed";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f28238a), TuplesKt.m28425to("event_time", this.f28239b), TuplesKt.m28425to("client_time", this.f28240c), TuplesKt.m28425to("zone_id", this.f28241d), TuplesKt.m28425to("icon", this.f28242e), TuplesKt.m28425to("count", this.f28243f), TuplesKt.m28425to("annotation_color", this.f28244g), TuplesKt.m28425to("overlay_color", Integer.valueOf(this.f28245h)), TuplesKt.m28425to("overlay_border_color", Integer.valueOf(this.f28246i)), TuplesKt.m28425to("flight_sheet_title", this.f28247j));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((this.f28238a.hashCode() * 31) + this.f28239b.hashCode()) * 31) + this.f28240c.hashCode()) * 31) + this.f28241d.hashCode()) * 31;
        String str = this.f28242e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f28243f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f28244g;
        int hashCode4 = (((((hashCode3 + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.f28245h)) * 31) + Integer.hashCode(this.f28246i)) * 31;
        String str3 = this.f28247j;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.f28238a;
        DateTime dateTime = this.f28239b;
        DateTime dateTime2 = this.f28240c;
        String str2 = this.f28241d;
        String str3 = this.f28242e;
        String str4 = this.f28243f;
        Integer num = this.f28244g;
        int i = this.f28245h;
        int i2 = this.f28246i;
        String str5 = this.f28247j;
        return "ZoneFlightSheetViewed(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", zoneId=" + str2 + ", icon=" + str3 + ", count=" + str4 + ", annotationColor=" + num + ", overlayColor=" + i + ", overlayBorderColor=" + i2 + ", flightSheetTitle=" + str5 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ PI6(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, Integer num, int i, int i2, String str5, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, str2, (i3 & 16) != 0 ? null : str3, (i3 & 32) != 0 ? null : str4, (i3 & 64) != 0 ? null : num, i, i2, (i3 & 512) != 0 ? null : str5);
        String str6;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i3 & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str6 = uuid;
        } else {
            str6 = str;
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
