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
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b9\u0010:Jo\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\"\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u0018\u001a\u0004\b,\u0010\u001aR\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\u0018\u001a\u0004\b0\u0010\u001aR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b1\u0010\u0018\u001a\u0004\b2\u0010\u001aR\"\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0014038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u00108\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u001a¨\u0006;"}, m28432d2 = {"LQH3;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "rideId", "", "rideDistance", "", "rideCost", "rideCurrency", "parkingIncentiveValue", "parkingIncentiveCurrency", "parkingNestId", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getRideId", "e", "D", "getRideDistance", "()D", "f", "J", "getRideCost", "()J", "g", "getRideCurrency", "h", "getParkingIncentiveValue", "i", "getParkingIncentiveCurrency", "j", "getParkingNestId", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;DJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: QH3 */
/* loaded from: classes4.dex */
public final class QH3 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f30168a;

    /* renamed from: b */
    public final DateTime f30169b;

    /* renamed from: c */
    public final DateTime f30170c;

    /* renamed from: d */
    public final String f30171d;

    /* renamed from: e */
    public final double f30172e;

    /* renamed from: f */
    public final long f30173f;

    /* renamed from: g */
    public final String f30174g;

    /* renamed from: h */
    public final long f30175h;

    /* renamed from: i */
    public final String f30176i;

    /* renamed from: j */
    public final String f30177j;

    public QH3(String eventId, DateTime eventTime, DateTime clientTime, String rideId, double d, long j, String rideCurrency, long j2, String parkingIncentiveCurrency, String str) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        Intrinsics.checkNotNullParameter(rideCurrency, "rideCurrency");
        Intrinsics.checkNotNullParameter(parkingIncentiveCurrency, "parkingIncentiveCurrency");
        this.f30168a = eventId;
        this.f30169b = eventTime;
        this.f30170c = clientTime;
        this.f30171d = rideId;
        this.f30172e = d;
        this.f30173f = j;
        this.f30174g = rideCurrency;
        this.f30175h = j2;
        this.f30176i = parkingIncentiveCurrency;
        this.f30177j = str;
    }

    /* renamed from: a */
    public final QH3 m88667a(String eventId, DateTime eventTime, DateTime clientTime, String rideId, double d, long j, String rideCurrency, long j2, String parkingIncentiveCurrency, String str) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        Intrinsics.checkNotNullParameter(rideCurrency, "rideCurrency");
        Intrinsics.checkNotNullParameter(parkingIncentiveCurrency, "parkingIncentiveCurrency");
        return new QH3(eventId, eventTime, clientTime, rideId, d, j, rideCurrency, j2, parkingIncentiveCurrency, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QH3) {
            QH3 qh3 = (QH3) obj;
            return Intrinsics.areEqual(this.f30168a, qh3.f30168a) && Intrinsics.areEqual(this.f30169b, qh3.f30169b) && Intrinsics.areEqual(this.f30170c, qh3.f30170c) && Intrinsics.areEqual(this.f30171d, qh3.f30171d) && Double.compare(this.f30172e, qh3.f30172e) == 0 && this.f30173f == qh3.f30173f && Intrinsics.areEqual(this.f30174g, qh3.f30174g) && this.f30175h == qh3.f30175h && Intrinsics.areEqual(this.f30176i, qh3.f30176i) && Intrinsics.areEqual(this.f30177j, qh3.f30177j);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.ParkingSummaryViewed";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f30168a), TuplesKt.m28425to("event_time", this.f30169b), TuplesKt.m28425to("client_time", this.f30170c), TuplesKt.m28425to("ride_id", this.f30171d), TuplesKt.m28425to("ride_distance", Double.valueOf(this.f30172e)), TuplesKt.m28425to("ride_cost", Long.valueOf(this.f30173f)), TuplesKt.m28425to("ride_currency", this.f30174g), TuplesKt.m28425to("parking_incentive_value", Long.valueOf(this.f30175h)), TuplesKt.m28425to("parking_incentive_currency", this.f30176i), TuplesKt.m28425to("parking_nest_id", this.f30177j));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((this.f30168a.hashCode() * 31) + this.f30169b.hashCode()) * 31) + this.f30170c.hashCode()) * 31) + this.f30171d.hashCode()) * 31) + Double.hashCode(this.f30172e)) * 31) + Long.hashCode(this.f30173f)) * 31) + this.f30174g.hashCode()) * 31) + Long.hashCode(this.f30175h)) * 31) + this.f30176i.hashCode()) * 31;
        String str = this.f30177j;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f30168a;
        DateTime dateTime = this.f30169b;
        DateTime dateTime2 = this.f30170c;
        String str2 = this.f30171d;
        double d = this.f30172e;
        long j = this.f30173f;
        String str3 = this.f30174g;
        long j2 = this.f30175h;
        String str4 = this.f30176i;
        String str5 = this.f30177j;
        return "ParkingSummaryViewed(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", rideId=" + str2 + ", rideDistance=" + d + ", rideCost=" + j + ", rideCurrency=" + str3 + ", parkingIncentiveValue=" + j2 + ", parkingIncentiveCurrency=" + str4 + ", parkingNestId=" + str5 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ QH3(String str, DateTime dateTime, DateTime dateTime2, String str2, double d, long j, String str3, long j2, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, str2, d, j, str3, j2, str4, (i & 512) != 0 ? null : str5);
        String str6;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str6 = uuid;
        } else {
            str6 = str;
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
