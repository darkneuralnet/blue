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
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0017\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b/\u00100JX\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\bHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\"\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00110)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0016¨\u00061"}, m28432d2 = {"LIm3;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "viewportWkt", "", "vehicleCount", "areaCount", "", "fancyMultiselectEnabled", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;IILjava/lang/Boolean;)LIm3;", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getViewportWkt", "e", "I", "getVehicleCount", "()I", "f", "getAreaCount", "g", "Ljava/lang/Boolean;", "getFancyMultiselectEnabled", "()Ljava/lang/Boolean;", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;IILjava/lang/Boolean;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Im3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C33596Im3 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f16177a;

    /* renamed from: b */
    public final DateTime f16178b;

    /* renamed from: c */
    public final DateTime f16179c;

    /* renamed from: d */
    public final String f16180d;

    /* renamed from: e */
    public final int f16181e;

    /* renamed from: f */
    public final int f16182f;

    /* renamed from: g */
    public final Boolean f16183g;

    public C33596Im3(String eventId, DateTime eventTime, DateTime clientTime, String viewportWkt, int i, int i2, Boolean bool) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(viewportWkt, "viewportWkt");
        this.f16177a = eventId;
        this.f16178b = eventTime;
        this.f16179c = clientTime;
        this.f16180d = viewportWkt;
        this.f16181e = i;
        this.f16182f = i2;
        this.f16183g = bool;
    }

    public static /* synthetic */ C33596Im3 copy$default(C33596Im3 c33596Im3, String str, DateTime dateTime, DateTime dateTime2, String str2, int i, int i2, Boolean bool, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = c33596Im3.f16177a;
        }
        if ((i3 & 2) != 0) {
            dateTime = c33596Im3.f16178b;
        }
        DateTime dateTime3 = dateTime;
        if ((i3 & 4) != 0) {
            dateTime2 = c33596Im3.f16179c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i3 & 8) != 0) {
            str2 = c33596Im3.f16180d;
        }
        String str3 = str2;
        if ((i3 & 16) != 0) {
            i = c33596Im3.f16181e;
        }
        int i4 = i;
        if ((i3 & 32) != 0) {
            i2 = c33596Im3.f16182f;
        }
        int i5 = i2;
        if ((i3 & 64) != 0) {
            bool = c33596Im3.f16183g;
        }
        return c33596Im3.m101727a(str, dateTime3, dateTime4, str3, i4, i5, bool);
    }

    /* renamed from: a */
    public final C33596Im3 m101727a(String eventId, DateTime eventTime, DateTime clientTime, String viewportWkt, int i, int i2, Boolean bool) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(viewportWkt, "viewportWkt");
        return new C33596Im3(eventId, eventTime, clientTime, viewportWkt, i, i2, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C33596Im3) {
            C33596Im3 c33596Im3 = (C33596Im3) obj;
            return Intrinsics.areEqual(this.f16177a, c33596Im3.f16177a) && Intrinsics.areEqual(this.f16178b, c33596Im3.f16178b) && Intrinsics.areEqual(this.f16179c, c33596Im3.f16179c) && Intrinsics.areEqual(this.f16180d, c33596Im3.f16180d) && this.f16181e == c33596Im3.f16181e && this.f16182f == c33596Im3.f16182f && Intrinsics.areEqual(this.f16183g, c33596Im3.f16183g);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.OperatorMapFilterScreenViewed";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f16177a), TuplesKt.m28425to("event_time", this.f16178b), TuplesKt.m28425to("client_time", this.f16179c), TuplesKt.m28425to("viewport_wkt", this.f16180d), TuplesKt.m28425to("vehicle_count", Integer.valueOf(this.f16181e)), TuplesKt.m28425to("area_count", Integer.valueOf(this.f16182f)), TuplesKt.m28425to("fancy_multiselect_enabled", this.f16183g));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f16177a.hashCode() * 31) + this.f16178b.hashCode()) * 31) + this.f16179c.hashCode()) * 31) + this.f16180d.hashCode()) * 31) + Integer.hashCode(this.f16181e)) * 31) + Integer.hashCode(this.f16182f)) * 31;
        Boolean bool = this.f16183g;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        String str = this.f16177a;
        DateTime dateTime = this.f16178b;
        DateTime dateTime2 = this.f16179c;
        String str2 = this.f16180d;
        int i = this.f16181e;
        int i2 = this.f16182f;
        Boolean bool = this.f16183g;
        return "OperatorMapFilterScreenViewed(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", viewportWkt=" + str2 + ", vehicleCount=" + i + ", areaCount=" + i2 + ", fancyMultiselectEnabled=" + bool + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C33596Im3(String str, DateTime dateTime, DateTime dateTime2, String str2, int i, int i2, Boolean bool, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, str2, i, i2, (i3 & 64) != 0 ? null : bool);
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
