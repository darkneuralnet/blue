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
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u001f\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001By\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b;\u0010<J\u0088\u0001\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0010\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0013\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u0018\u001a\u0004\b(\u0010\u001aR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b\r\u0010/R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b0\u0010.\u001a\u0004\b\u000e\u0010/R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b\u000f\u0010/R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b\u0010\u00104R\"\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0015058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u0010:\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\u001a¨\u0006="}, m28432d2 = {"LI01;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "", "mapDragCount", "destinationSearchResultCount", "destinationSelectionType", "destinationAreaMaxSpeed", "", "isDestinationAreaNoRide", "isDestinationAreaNoParking", "isDestinationAreaOperational", "isDestinationAreaTooltipShown", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;IILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Z)LI01;", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "I", "getMapDragCount", "()I", "e", "getDestinationSearchResultCount", "f", "getDestinationSelectionType", "g", "Ljava/lang/Integer;", "getDestinationAreaMaxSpeed", "()Ljava/lang/Integer;", "h", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "i", "j", "k", "Z", "()Z", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;IILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Z)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: I01 */
/* loaded from: classes4.dex */
public final class I01 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f14309a;

    /* renamed from: b */
    public final DateTime f14310b;

    /* renamed from: c */
    public final DateTime f14311c;

    /* renamed from: d */
    public final int f14312d;

    /* renamed from: e */
    public final int f14313e;

    /* renamed from: f */
    public final String f14314f;

    /* renamed from: g */
    public final Integer f14315g;

    /* renamed from: h */
    public final Boolean f14316h;

    /* renamed from: i */
    public final Boolean f14317i;

    /* renamed from: j */
    public final Boolean f14318j;

    /* renamed from: k */
    public final boolean f14319k;

    public I01(String eventId, DateTime eventTime, DateTime clientTime, int i, int i2, String str, Integer num, Boolean bool, Boolean bool2, Boolean bool3, boolean z) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        this.f14309a = eventId;
        this.f14310b = eventTime;
        this.f14311c = clientTime;
        this.f14312d = i;
        this.f14313e = i2;
        this.f14314f = str;
        this.f14315g = num;
        this.f14316h = bool;
        this.f14317i = bool2;
        this.f14318j = bool3;
        this.f14319k = z;
    }

    /* renamed from: a */
    public final I01 m103081a(String eventId, DateTime eventTime, DateTime clientTime, int i, int i2, String str, Integer num, Boolean bool, Boolean bool2, Boolean bool3, boolean z) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        return new I01(eventId, eventTime, clientTime, i, i2, str, num, bool, bool2, bool3, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof I01) {
            I01 i01 = (I01) obj;
            return Intrinsics.areEqual(this.f14309a, i01.f14309a) && Intrinsics.areEqual(this.f14310b, i01.f14310b) && Intrinsics.areEqual(this.f14311c, i01.f14311c) && this.f14312d == i01.f14312d && this.f14313e == i01.f14313e && Intrinsics.areEqual(this.f14314f, i01.f14314f) && Intrinsics.areEqual(this.f14315g, i01.f14315g) && Intrinsics.areEqual(this.f14316h, i01.f14316h) && Intrinsics.areEqual(this.f14317i, i01.f14317i) && Intrinsics.areEqual(this.f14318j, i01.f14318j) && this.f14319k == i01.f14319k;
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.DestinationEditBarSetButtonTapped";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f14309a), TuplesKt.m28425to("event_time", this.f14310b), TuplesKt.m28425to("client_time", this.f14311c), TuplesKt.m28425to("map_drag_count", Integer.valueOf(this.f14312d)), TuplesKt.m28425to("destination_search_result_count", Integer.valueOf(this.f14313e)), TuplesKt.m28425to("destination_selection_type", this.f14314f), TuplesKt.m28425to("destination_area_max_speed", this.f14315g), TuplesKt.m28425to("is_destination_area_no_ride", this.f14316h), TuplesKt.m28425to("is_destination_area_no_parking", this.f14317i), TuplesKt.m28425to("is_destination_area_operational", this.f14318j), TuplesKt.m28425to("is_destination_area_tooltip_shown", Boolean.valueOf(this.f14319k)));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((this.f14309a.hashCode() * 31) + this.f14310b.hashCode()) * 31) + this.f14311c.hashCode()) * 31) + Integer.hashCode(this.f14312d)) * 31) + Integer.hashCode(this.f14313e)) * 31;
        String str = this.f14314f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f14315g;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.f14316h;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f14317i;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f14318j;
        int hashCode6 = (hashCode5 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        boolean z = this.f14319k;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode6 + i;
    }

    public String toString() {
        String str = this.f14309a;
        DateTime dateTime = this.f14310b;
        DateTime dateTime2 = this.f14311c;
        int i = this.f14312d;
        int i2 = this.f14313e;
        String str2 = this.f14314f;
        Integer num = this.f14315g;
        Boolean bool = this.f14316h;
        Boolean bool2 = this.f14317i;
        Boolean bool3 = this.f14318j;
        boolean z = this.f14319k;
        return "DestinationEditBarSetButtonTapped(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", mapDragCount=" + i + ", destinationSearchResultCount=" + i2 + ", destinationSelectionType=" + str2 + ", destinationAreaMaxSpeed=" + num + ", isDestinationAreaNoRide=" + bool + ", isDestinationAreaNoParking=" + bool2 + ", isDestinationAreaOperational=" + bool3 + ", isDestinationAreaTooltipShown=" + z + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ I01(String str, DateTime dateTime, DateTime dateTime2, int i, int i2, String str2, Integer num, Boolean bool, Boolean bool2, Boolean bool3, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, i, i2, (i3 & 32) != 0 ? null : str2, (i3 & 64) != 0 ? null : num, (i3 & 128) != 0 ? null : bool, (i3 & 256) != 0 ? null : bool2, (i3 & 512) != 0 ? null : bool3, z);
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
