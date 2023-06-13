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
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b/\u00100JZ\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\b\u0010 R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0015\u001a\u0004\b\"\u0010\u0017R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0015\u001a\u0004\b$\u0010\u0017R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\"\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00120)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0017¨\u00061"}, m28432d2 = {"LlG3;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "", "isDuringRide", "nestId", "rideId", "", "distanceFromNest", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Double;)LlG3;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "Z", "()Z", "e", "getNestId", "f", "getRideId", "g", "Ljava/lang/Double;", "getDistanceFromNest", "()Ljava/lang/Double;", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: lG3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44394lG3 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f95802a;

    /* renamed from: b */
    public final DateTime f95803b;

    /* renamed from: c */
    public final DateTime f95804c;

    /* renamed from: d */
    public final boolean f95805d;

    /* renamed from: e */
    public final String f95806e;

    /* renamed from: f */
    public final String f95807f;

    /* renamed from: g */
    public final Double f95808g;

    public C44394lG3(String eventId, DateTime eventTime, DateTime clientTime, boolean z, String nestId, String str, Double d) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(nestId, "nestId");
        this.f95802a = eventId;
        this.f95803b = eventTime;
        this.f95804c = clientTime;
        this.f95805d = z;
        this.f95806e = nestId;
        this.f95807f = str;
        this.f95808g = d;
    }

    public static /* synthetic */ C44394lG3 copy$default(C44394lG3 c44394lG3, String str, DateTime dateTime, DateTime dateTime2, boolean z, String str2, String str3, Double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c44394lG3.f95802a;
        }
        if ((i & 2) != 0) {
            dateTime = c44394lG3.f95803b;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = c44394lG3.f95804c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 8) != 0) {
            z = c44394lG3.f95805d;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str2 = c44394lG3.f95806e;
        }
        String str4 = str2;
        if ((i & 32) != 0) {
            str3 = c44394lG3.f95807f;
        }
        String str5 = str3;
        if ((i & 64) != 0) {
            d = c44394lG3.f95808g;
        }
        return c44394lG3.m27452a(str, dateTime3, dateTime4, z2, str4, str5, d);
    }

    /* renamed from: a */
    public final C44394lG3 m27452a(String eventId, DateTime eventTime, DateTime clientTime, boolean z, String nestId, String str, Double d) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(nestId, "nestId");
        return new C44394lG3(eventId, eventTime, clientTime, z, nestId, str, d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C44394lG3) {
            C44394lG3 c44394lG3 = (C44394lG3) obj;
            return Intrinsics.areEqual(this.f95802a, c44394lG3.f95802a) && Intrinsics.areEqual(this.f95803b, c44394lG3.f95803b) && Intrinsics.areEqual(this.f95804c, c44394lG3.f95804c) && this.f95805d == c44394lG3.f95805d && Intrinsics.areEqual(this.f95806e, c44394lG3.f95806e) && Intrinsics.areEqual(this.f95807f, c44394lG3.f95807f) && Intrinsics.areEqual((Object) this.f95808g, (Object) c44394lG3.f95808g);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.ParkingNestPinTapped";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f95802a), TuplesKt.m28425to("event_time", this.f95803b), TuplesKt.m28425to("client_time", this.f95804c), TuplesKt.m28425to("is_during_ride", Boolean.valueOf(this.f95805d)), TuplesKt.m28425to("nest_id", this.f95806e), TuplesKt.m28425to("ride_id", this.f95807f), TuplesKt.m28425to("distance_from_nest", this.f95808g));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f95802a.hashCode() * 31) + this.f95803b.hashCode()) * 31) + this.f95804c.hashCode()) * 31;
        boolean z = this.f95805d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (((hashCode + i) * 31) + this.f95806e.hashCode()) * 31;
        String str = this.f95807f;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.f95808g;
        return hashCode3 + (d != null ? d.hashCode() : 0);
    }

    public String toString() {
        String str = this.f95802a;
        DateTime dateTime = this.f95803b;
        DateTime dateTime2 = this.f95804c;
        boolean z = this.f95805d;
        String str2 = this.f95806e;
        String str3 = this.f95807f;
        Double d = this.f95808g;
        return "ParkingNestPinTapped(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", isDuringRide=" + z + ", nestId=" + str2 + ", rideId=" + str3 + ", distanceFromNest=" + d + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C44394lG3(String str, DateTime dateTime, DateTime dateTime2, boolean z, String str2, String str3, Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, z, str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : d);
        String str4;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str4 = uuid;
        } else {
            str4 = str;
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
