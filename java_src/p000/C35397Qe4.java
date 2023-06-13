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
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b5\u00106Jh\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u0016\u001a\u0004\b.\u0010\u0018R\"\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00120/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u0018¨\u00067"}, m28432d2 = {"LQe4;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "", "nearbyVehicleCount", "", "bestVehicleScore", "bestVehicleRssi", "bestVehicleBattery", "bestVehicleModel", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ILjava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)LQe4;", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "I", "getNearbyVehicleCount", "()I", "e", "Ljava/lang/Double;", "getBestVehicleScore", "()Ljava/lang/Double;", "f", "Ljava/lang/Integer;", "getBestVehicleRssi", "()Ljava/lang/Integer;", "g", "getBestVehicleBattery", "h", "getBestVehicleModel", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ILjava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Qe4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35397Qe4 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f30685a;

    /* renamed from: b */
    public final DateTime f30686b;

    /* renamed from: c */
    public final DateTime f30687c;

    /* renamed from: d */
    public final int f30688d;

    /* renamed from: e */
    public final Double f30689e;

    /* renamed from: f */
    public final Integer f30690f;

    /* renamed from: g */
    public final Integer f30691g;

    /* renamed from: h */
    public final String f30692h;

    public C35397Qe4(String eventId, DateTime eventTime, DateTime clientTime, int i, Double d, Integer num, Integer num2, String str) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        this.f30685a = eventId;
        this.f30686b = eventTime;
        this.f30687c = clientTime;
        this.f30688d = i;
        this.f30689e = d;
        this.f30690f = num;
        this.f30691g = num2;
        this.f30692h = str;
    }

    /* renamed from: a */
    public final C35397Qe4 m88275a(String eventId, DateTime eventTime, DateTime clientTime, int i, Double d, Integer num, Integer num2, String str) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        return new C35397Qe4(eventId, eventTime, clientTime, i, d, num, num2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C35397Qe4) {
            C35397Qe4 c35397Qe4 = (C35397Qe4) obj;
            return Intrinsics.areEqual(this.f30685a, c35397Qe4.f30685a) && Intrinsics.areEqual(this.f30686b, c35397Qe4.f30686b) && Intrinsics.areEqual(this.f30687c, c35397Qe4.f30687c) && this.f30688d == c35397Qe4.f30688d && Intrinsics.areEqual((Object) this.f30689e, (Object) c35397Qe4.f30689e) && Intrinsics.areEqual(this.f30690f, c35397Qe4.f30690f) && Intrinsics.areEqual(this.f30691g, c35397Qe4.f30691g) && Intrinsics.areEqual(this.f30692h, c35397Qe4.f30692h);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.QuickstartVehicleScanCompleted";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f30685a), TuplesKt.m28425to("event_time", this.f30686b), TuplesKt.m28425to("client_time", this.f30687c), TuplesKt.m28425to("nearby_vehicle_count", Integer.valueOf(this.f30688d)), TuplesKt.m28425to("best_vehicle_score", this.f30689e), TuplesKt.m28425to("best_vehicle_rssi", this.f30690f), TuplesKt.m28425to("best_vehicle_battery", this.f30691g), TuplesKt.m28425to("best_vehicle_model", this.f30692h));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((this.f30685a.hashCode() * 31) + this.f30686b.hashCode()) * 31) + this.f30687c.hashCode()) * 31) + Integer.hashCode(this.f30688d)) * 31;
        Double d = this.f30689e;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.f30690f;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f30691g;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f30692h;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.f30685a;
        DateTime dateTime = this.f30686b;
        DateTime dateTime2 = this.f30687c;
        int i = this.f30688d;
        Double d = this.f30689e;
        Integer num = this.f30690f;
        Integer num2 = this.f30691g;
        String str2 = this.f30692h;
        return "QuickstartVehicleScanCompleted(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", nearbyVehicleCount=" + i + ", bestVehicleScore=" + d + ", bestVehicleRssi=" + num + ", bestVehicleBattery=" + num2 + ", bestVehicleModel=" + str2 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C35397Qe4(String str, DateTime dateTime, DateTime dateTime2, int i, Double d, Integer num, Integer num2, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, i, (i2 & 16) != 0 ? null : d, (i2 & 32) != 0 ? null : num, (i2 & 64) != 0 ? null : num2, (i2 & 128) != 0 ? null : str2);
        String str3;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i2 & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str3 = uuid;
        } else {
            str3 = str;
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