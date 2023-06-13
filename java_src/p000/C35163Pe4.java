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
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b)\u0010*JE\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\bHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0012\u001a\u0004\b\"\u0010\u0014R\"\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000e0#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0014¨\u0006+"}, m28432d2 = {"LPe4;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "screen", "", "bestVehicleBattery", "bestVehicleModel", C17296a.f69688o, "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getScreen", "e", "I", "getBestVehicleBattery", "()I", "f", "getBestVehicleModel", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ILjava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Pe4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35163Pe4 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f28793a;

    /* renamed from: b */
    public final DateTime f28794b;

    /* renamed from: c */
    public final DateTime f28795c;

    /* renamed from: d */
    public final String f28796d;

    /* renamed from: e */
    public final int f28797e;

    /* renamed from: f */
    public final String f28798f;

    public C35163Pe4(String eventId, DateTime eventTime, DateTime clientTime, String screen, int i, String bestVehicleModel) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(bestVehicleModel, "bestVehicleModel");
        this.f28793a = eventId;
        this.f28794b = eventTime;
        this.f28795c = clientTime;
        this.f28796d = screen;
        this.f28797e = i;
        this.f28798f = bestVehicleModel;
    }

    public static /* synthetic */ C35163Pe4 copy$default(C35163Pe4 c35163Pe4, String str, DateTime dateTime, DateTime dateTime2, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = c35163Pe4.f28793a;
        }
        if ((i2 & 2) != 0) {
            dateTime = c35163Pe4.f28794b;
        }
        DateTime dateTime3 = dateTime;
        if ((i2 & 4) != 0) {
            dateTime2 = c35163Pe4.f28795c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i2 & 8) != 0) {
            str2 = c35163Pe4.f28796d;
        }
        String str4 = str2;
        if ((i2 & 16) != 0) {
            i = c35163Pe4.f28797e;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            str3 = c35163Pe4.f28798f;
        }
        return c35163Pe4.m90040a(str, dateTime3, dateTime4, str4, i3, str3);
    }

    /* renamed from: a */
    public final C35163Pe4 m90040a(String eventId, DateTime eventTime, DateTime clientTime, String screen, int i, String bestVehicleModel) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(bestVehicleModel, "bestVehicleModel");
        return new C35163Pe4(eventId, eventTime, clientTime, screen, i, bestVehicleModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C35163Pe4) {
            C35163Pe4 c35163Pe4 = (C35163Pe4) obj;
            return Intrinsics.areEqual(this.f28793a, c35163Pe4.f28793a) && Intrinsics.areEqual(this.f28794b, c35163Pe4.f28794b) && Intrinsics.areEqual(this.f28795c, c35163Pe4.f28795c) && Intrinsics.areEqual(this.f28796d, c35163Pe4.f28796d) && this.f28797e == c35163Pe4.f28797e && Intrinsics.areEqual(this.f28798f, c35163Pe4.f28798f);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.QuickstartStartButtonTapped";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f28793a), TuplesKt.m28425to("event_time", this.f28794b), TuplesKt.m28425to("client_time", this.f28795c), TuplesKt.m28425to("screen", this.f28796d), TuplesKt.m28425to("best_vehicle_battery", Integer.valueOf(this.f28797e)), TuplesKt.m28425to("best_vehicle_model", this.f28798f));
        return mapOf;
    }

    public int hashCode() {
        return (((((((((this.f28793a.hashCode() * 31) + this.f28794b.hashCode()) * 31) + this.f28795c.hashCode()) * 31) + this.f28796d.hashCode()) * 31) + Integer.hashCode(this.f28797e)) * 31) + this.f28798f.hashCode();
    }

    public String toString() {
        String str = this.f28793a;
        DateTime dateTime = this.f28794b;
        DateTime dateTime2 = this.f28795c;
        String str2 = this.f28796d;
        int i = this.f28797e;
        String str3 = this.f28798f;
        return "QuickstartStartButtonTapped(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", screen=" + str2 + ", bestVehicleBattery=" + i + ", bestVehicleModel=" + str3 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C35163Pe4(String str, DateTime dateTime, DateTime dateTime2, String str2, int i, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r2, dateTime2, str2, i, str3);
        if ((i2 & 1) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
        String str4 = str;
        if ((i2 & 2) != 0) {
            dateTime = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime, "now()");
        }
        DateTime dateTime3 = dateTime;
        if ((i2 & 4) != 0) {
            dateTime2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime2, "now()");
        }
    }
}
