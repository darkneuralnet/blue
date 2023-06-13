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
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b1\u00102Jg\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0018R%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u001a\u001a\u0004\b&\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010\u001a\u001a\u0004\b(\u0010\u001cR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\"\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00120\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010$R\u0014\u00100\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0018¨\u00063"}, m28432d2 = {"LG74;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "key", "", "attributes", "startTime", "endTime", "", "durationMs", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getKey", "e", "Ljava/util/Map;", "getAttributes", "()Ljava/util/Map;", "f", "getStartTime", "g", "getEndTime", "h", "D", "getDurationMs", "()D", "getProperties", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/util/Map;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;D)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: G74 */
/* loaded from: classes4.dex */
public final class G74 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f11017a;

    /* renamed from: b */
    public final DateTime f11018b;

    /* renamed from: c */
    public final DateTime f11019c;

    /* renamed from: d */
    public final String f11020d;

    /* renamed from: e */
    public final Map<String, String> f11021e;

    /* renamed from: f */
    public final DateTime f11022f;

    /* renamed from: g */
    public final DateTime f11023g;

    /* renamed from: h */
    public final double f11024h;

    public G74(String eventId, DateTime eventTime, DateTime clientTime, String key, Map<String, String> map, DateTime startTime, DateTime endTime, double d) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(endTime, "endTime");
        this.f11017a = eventId;
        this.f11018b = eventTime;
        this.f11019c = clientTime;
        this.f11020d = key;
        this.f11021e = map;
        this.f11022f = startTime;
        this.f11023g = endTime;
        this.f11024h = d;
    }

    /* renamed from: a */
    public final G74 m105725a(String eventId, DateTime eventTime, DateTime clientTime, String key, Map<String, String> map, DateTime startTime, DateTime endTime, double d) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(endTime, "endTime");
        return new G74(eventId, eventTime, clientTime, key, map, startTime, endTime, d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof G74) {
            G74 g74 = (G74) obj;
            return Intrinsics.areEqual(this.f11017a, g74.f11017a) && Intrinsics.areEqual(this.f11018b, g74.f11018b) && Intrinsics.areEqual(this.f11019c, g74.f11019c) && Intrinsics.areEqual(this.f11020d, g74.f11020d) && Intrinsics.areEqual(this.f11021e, g74.f11021e) && Intrinsics.areEqual(this.f11022f, g74.f11022f) && Intrinsics.areEqual(this.f11023g, g74.f11023g) && Double.compare(this.f11024h, g74.f11024h) == 0;
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.ProfilingTrace";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f11017a), TuplesKt.m28425to("event_time", this.f11018b), TuplesKt.m28425to("client_time", this.f11019c), TuplesKt.m28425to("key", this.f11020d), TuplesKt.m28425to("attributes", this.f11021e), TuplesKt.m28425to("start_time", this.f11022f), TuplesKt.m28425to("end_time", this.f11023g), TuplesKt.m28425to("duration_ms", Double.valueOf(this.f11024h)));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((this.f11017a.hashCode() * 31) + this.f11018b.hashCode()) * 31) + this.f11019c.hashCode()) * 31) + this.f11020d.hashCode()) * 31;
        Map<String, String> map = this.f11021e;
        return ((((((hashCode + (map == null ? 0 : map.hashCode())) * 31) + this.f11022f.hashCode()) * 31) + this.f11023g.hashCode()) * 31) + Double.hashCode(this.f11024h);
    }

    public String toString() {
        String str = this.f11017a;
        DateTime dateTime = this.f11018b;
        DateTime dateTime2 = this.f11019c;
        String str2 = this.f11020d;
        Map<String, String> map = this.f11021e;
        DateTime dateTime3 = this.f11022f;
        DateTime dateTime4 = this.f11023g;
        double d = this.f11024h;
        return "ProfilingTrace(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", key=" + str2 + ", attributes=" + map + ", startTime=" + dateTime3 + ", endTime=" + dateTime4 + ", durationMs=" + d + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ G74(String str, DateTime dateTime, DateTime dateTime2, String str2, Map map, DateTime dateTime3, DateTime dateTime4, double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, str2, (i & 16) != 0 ? null : map, dateTime3, dateTime4, d);
        String str3;
        DateTime dateTime5;
        DateTime dateTime6;
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
            dateTime5 = now;
        } else {
            dateTime5 = dateTime;
        }
        if ((i & 4) != 0) {
            DateTime now2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now2, "now()");
            dateTime6 = now2;
        } else {
            dateTime6 = dateTime2;
        }
    }
}
