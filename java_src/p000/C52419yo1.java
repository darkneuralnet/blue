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
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b'\u0010(JE\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0012\u001a\u0004\b \u0010\u0014R\"\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000e0!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0014¨\u0006)"}, m28432d2 = {"Lyo1;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "vehicleId", "fleetId", "substate", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getVehicleId", "e", "getFleetId", "f", "getSubstate", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: yo1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C52419yo1 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f120205a;

    /* renamed from: b */
    public final DateTime f120206b;

    /* renamed from: c */
    public final DateTime f120207c;

    /* renamed from: d */
    public final String f120208d;

    /* renamed from: e */
    public final String f120209e;

    /* renamed from: f */
    public final String f120210f;

    public C52419yo1(String eventId, DateTime eventTime, DateTime clientTime, String vehicleId, String fleetId, String substate) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(vehicleId, "vehicleId");
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        Intrinsics.checkNotNullParameter(substate, "substate");
        this.f120205a = eventId;
        this.f120206b = eventTime;
        this.f120207c = clientTime;
        this.f120208d = vehicleId;
        this.f120209e = fleetId;
        this.f120210f = substate;
    }

    public static /* synthetic */ C52419yo1 copy$default(C52419yo1 c52419yo1, String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c52419yo1.f120205a;
        }
        if ((i & 2) != 0) {
            dateTime = c52419yo1.f120206b;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = c52419yo1.f120207c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 8) != 0) {
            str2 = c52419yo1.f120208d;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = c52419yo1.f120209e;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            str4 = c52419yo1.f120210f;
        }
        return c52419yo1.m2568a(str, dateTime3, dateTime4, str5, str6, str4);
    }

    /* renamed from: a */
    public final C52419yo1 m2568a(String eventId, DateTime eventTime, DateTime clientTime, String vehicleId, String fleetId, String substate) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(vehicleId, "vehicleId");
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        Intrinsics.checkNotNullParameter(substate, "substate");
        return new C52419yo1(eventId, eventTime, clientTime, vehicleId, fleetId, substate);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C52419yo1) {
            C52419yo1 c52419yo1 = (C52419yo1) obj;
            return Intrinsics.areEqual(this.f120205a, c52419yo1.f120205a) && Intrinsics.areEqual(this.f120206b, c52419yo1.f120206b) && Intrinsics.areEqual(this.f120207c, c52419yo1.f120207c) && Intrinsics.areEqual(this.f120208d, c52419yo1.f120208d) && Intrinsics.areEqual(this.f120209e, c52419yo1.f120209e) && Intrinsics.areEqual(this.f120210f, c52419yo1.f120210f);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.FleetListFlightSheetViewed";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f120205a), TuplesKt.m28425to("event_time", this.f120206b), TuplesKt.m28425to("client_time", this.f120207c), TuplesKt.m28425to("vehicle_id", this.f120208d), TuplesKt.m28425to("fleet_id", this.f120209e), TuplesKt.m28425to("substate", this.f120210f));
        return mapOf;
    }

    public int hashCode() {
        return (((((((((this.f120205a.hashCode() * 31) + this.f120206b.hashCode()) * 31) + this.f120207c.hashCode()) * 31) + this.f120208d.hashCode()) * 31) + this.f120209e.hashCode()) * 31) + this.f120210f.hashCode();
    }

    public String toString() {
        String str = this.f120205a;
        DateTime dateTime = this.f120206b;
        DateTime dateTime2 = this.f120207c;
        String str2 = this.f120208d;
        String str3 = this.f120209e;
        String str4 = this.f120210f;
        return "FleetListFlightSheetViewed(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", vehicleId=" + str2 + ", fleetId=" + str3 + ", substate=" + str4 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C52419yo1(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r2, dateTime2, str2, str3, str4);
        if ((i & 1) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
        String str5 = str;
        if ((i & 2) != 0) {
            dateTime = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime, "now()");
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime2, "now()");
        }
    }
}
