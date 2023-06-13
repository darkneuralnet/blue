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
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b/\u00100JO\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u0014\u001a\u0004\b(\u0010\u0016R\"\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00100)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0016¨\u00061"}, m28432d2 = {"LOe4;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "screen", "", "displayLatency", "", "bestVehicleBattery", "bestVehicleModel", C17296a.f69688o, "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getScreen", "e", "D", "getDisplayLatency", "()D", "f", "I", "getBestVehicleBattery", "()I", "g", "getBestVehicleModel", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;DILjava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Oe4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C34929Oe4 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f26978a;

    /* renamed from: b */
    public final DateTime f26979b;

    /* renamed from: c */
    public final DateTime f26980c;

    /* renamed from: d */
    public final String f26981d;

    /* renamed from: e */
    public final double f26982e;

    /* renamed from: f */
    public final int f26983f;

    /* renamed from: g */
    public final String f26984g;

    public C34929Oe4(String eventId, DateTime eventTime, DateTime clientTime, String screen, double d, int i, String bestVehicleModel) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(bestVehicleModel, "bestVehicleModel");
        this.f26978a = eventId;
        this.f26979b = eventTime;
        this.f26980c = clientTime;
        this.f26981d = screen;
        this.f26982e = d;
        this.f26983f = i;
        this.f26984g = bestVehicleModel;
    }

    /* renamed from: a */
    public final C34929Oe4 m91749a(String eventId, DateTime eventTime, DateTime clientTime, String screen, double d, int i, String bestVehicleModel) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(bestVehicleModel, "bestVehicleModel");
        return new C34929Oe4(eventId, eventTime, clientTime, screen, d, i, bestVehicleModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C34929Oe4) {
            C34929Oe4 c34929Oe4 = (C34929Oe4) obj;
            return Intrinsics.areEqual(this.f26978a, c34929Oe4.f26978a) && Intrinsics.areEqual(this.f26979b, c34929Oe4.f26979b) && Intrinsics.areEqual(this.f26980c, c34929Oe4.f26980c) && Intrinsics.areEqual(this.f26981d, c34929Oe4.f26981d) && Double.compare(this.f26982e, c34929Oe4.f26982e) == 0 && this.f26983f == c34929Oe4.f26983f && Intrinsics.areEqual(this.f26984g, c34929Oe4.f26984g);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.QuickstartBannerShown";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f26978a), TuplesKt.m28425to("event_time", this.f26979b), TuplesKt.m28425to("client_time", this.f26980c), TuplesKt.m28425to("screen", this.f26981d), TuplesKt.m28425to("display_latency", Double.valueOf(this.f26982e)), TuplesKt.m28425to("best_vehicle_battery", Integer.valueOf(this.f26983f)), TuplesKt.m28425to("best_vehicle_model", this.f26984g));
        return mapOf;
    }

    public int hashCode() {
        return (((((((((((this.f26978a.hashCode() * 31) + this.f26979b.hashCode()) * 31) + this.f26980c.hashCode()) * 31) + this.f26981d.hashCode()) * 31) + Double.hashCode(this.f26982e)) * 31) + Integer.hashCode(this.f26983f)) * 31) + this.f26984g.hashCode();
    }

    public String toString() {
        String str = this.f26978a;
        DateTime dateTime = this.f26979b;
        DateTime dateTime2 = this.f26980c;
        String str2 = this.f26981d;
        double d = this.f26982e;
        int i = this.f26983f;
        String str3 = this.f26984g;
        return "QuickstartBannerShown(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", screen=" + str2 + ", displayLatency=" + d + ", bestVehicleBattery=" + i + ", bestVehicleModel=" + str3 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C34929Oe4(String str, DateTime dateTime, DateTime dateTime2, String str2, double d, int i, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, str2, d, i, str3);
        String str4;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i2 & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str4 = uuid;
        } else {
            str4 = str;
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
