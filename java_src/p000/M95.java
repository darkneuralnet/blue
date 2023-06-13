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
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0018\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b2\u00103JZ\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\r\u0010+R\"\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00130,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u0018¨\u00064"}, m28432d2 = {"LM95;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "", "distanceToClosestMerchant", "closestMerchantId", "", "totalMerchantsOnMap", "", "isInRegistration", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;DLjava/lang/String;JLjava/lang/Boolean;)LM95;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "D", "getDistanceToClosestMerchant", "()D", "e", "getClosestMerchantId", "f", "J", "getTotalMerchantsOnMap", "()J", "g", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;DLjava/lang/String;JLjava/lang/Boolean;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: M95 */
/* loaded from: classes4.dex */
public final class M95 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f22746a;

    /* renamed from: b */
    public final DateTime f22747b;

    /* renamed from: c */
    public final DateTime f22748c;

    /* renamed from: d */
    public final double f22749d;

    /* renamed from: e */
    public final String f22750e;

    /* renamed from: f */
    public final long f22751f;

    /* renamed from: g */
    public final Boolean f22752g;

    public M95(String eventId, DateTime eventTime, DateTime clientTime, double d, String str, long j, Boolean bool) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        this.f22746a = eventId;
        this.f22747b = eventTime;
        this.f22748c = clientTime;
        this.f22749d = d;
        this.f22750e = str;
        this.f22751f = j;
        this.f22752g = bool;
    }

    /* renamed from: a */
    public final M95 m95650a(String eventId, DateTime eventTime, DateTime clientTime, double d, String str, long j, Boolean bool) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        return new M95(eventId, eventTime, clientTime, d, str, j, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof M95) {
            M95 m95 = (M95) obj;
            return Intrinsics.areEqual(this.f22746a, m95.f22746a) && Intrinsics.areEqual(this.f22747b, m95.f22747b) && Intrinsics.areEqual(this.f22748c, m95.f22748c) && Double.compare(this.f22749d, m95.f22749d) == 0 && Intrinsics.areEqual(this.f22750e, m95.f22750e) && this.f22751f == m95.f22751f && Intrinsics.areEqual(this.f22752g, m95.f22752g);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.RiderMapViewedWithNearestMerchant";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f22746a), TuplesKt.m28425to("event_time", this.f22747b), TuplesKt.m28425to("client_time", this.f22748c), TuplesKt.m28425to("distance_to_closest_merchant", Double.valueOf(this.f22749d)), TuplesKt.m28425to("closest_merchant_id", this.f22750e), TuplesKt.m28425to("total_merchants_on_map", Long.valueOf(this.f22751f)), TuplesKt.m28425to("is_in_registration", this.f22752g));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((this.f22746a.hashCode() * 31) + this.f22747b.hashCode()) * 31) + this.f22748c.hashCode()) * 31) + Double.hashCode(this.f22749d)) * 31;
        String str = this.f22750e;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.f22751f)) * 31;
        Boolean bool = this.f22752g;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        String str = this.f22746a;
        DateTime dateTime = this.f22747b;
        DateTime dateTime2 = this.f22748c;
        double d = this.f22749d;
        String str2 = this.f22750e;
        long j = this.f22751f;
        Boolean bool = this.f22752g;
        return "RiderMapViewedWithNearestMerchant(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", distanceToClosestMerchant=" + d + ", closestMerchantId=" + str2 + ", totalMerchantsOnMap=" + j + ", isInRegistration=" + bool + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ M95(String str, DateTime dateTime, DateTime dateTime2, double d, String str2, long j, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, d, (i & 16) != 0 ? null : str2, j, (i & 64) != 0 ? null : bool);
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
