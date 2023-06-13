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
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b)\u0010*JF\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\b\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\"\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00100#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0015¨\u0006+"}, m28432d2 = {"Lcm5;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "", "isInRegistration", "", "opticalBrightness", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/Double;)Lcm5;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "e", "Ljava/lang/Double;", "getOpticalBrightness", "()Ljava/lang/Double;", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/Double;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: cm5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C39342cm5 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f61222a;

    /* renamed from: b */
    public final DateTime f61223b;

    /* renamed from: c */
    public final DateTime f61224c;

    /* renamed from: d */
    public final Boolean f61225d;

    /* renamed from: e */
    public final Double f61226e;

    public C39342cm5() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ C39342cm5 copy$default(C39342cm5 c39342cm5, String str, DateTime dateTime, DateTime dateTime2, Boolean bool, Double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c39342cm5.f61222a;
        }
        if ((i & 2) != 0) {
            dateTime = c39342cm5.f61223b;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = c39342cm5.f61224c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 8) != 0) {
            bool = c39342cm5.f61225d;
        }
        Boolean bool2 = bool;
        if ((i & 16) != 0) {
            d = c39342cm5.f61226e;
        }
        return c39342cm5.m60883a(str, dateTime3, dateTime4, bool2, d);
    }

    /* renamed from: a */
    public final C39342cm5 m60883a(String eventId, DateTime eventTime, DateTime clientTime, Boolean bool, Double d) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        return new C39342cm5(eventId, eventTime, clientTime, bool, d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C39342cm5) {
            C39342cm5 c39342cm5 = (C39342cm5) obj;
            return Intrinsics.areEqual(this.f61222a, c39342cm5.f61222a) && Intrinsics.areEqual(this.f61223b, c39342cm5.f61223b) && Intrinsics.areEqual(this.f61224c, c39342cm5.f61224c) && Intrinsics.areEqual(this.f61225d, c39342cm5.f61225d) && Intrinsics.areEqual((Object) this.f61226e, (Object) c39342cm5.f61226e);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.ScannerManualCodeEntryScreenViewed";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f61222a), TuplesKt.m28425to("event_time", this.f61223b), TuplesKt.m28425to("client_time", this.f61224c), TuplesKt.m28425to("is_in_registration", this.f61225d), TuplesKt.m28425to("optical_brightness", this.f61226e));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((this.f61222a.hashCode() * 31) + this.f61223b.hashCode()) * 31) + this.f61224c.hashCode()) * 31;
        Boolean bool = this.f61225d;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Double d = this.f61226e;
        return hashCode2 + (d != null ? d.hashCode() : 0);
    }

    public String toString() {
        String str = this.f61222a;
        DateTime dateTime = this.f61223b;
        DateTime dateTime2 = this.f61224c;
        Boolean bool = this.f61225d;
        Double d = this.f61226e;
        return "ScannerManualCodeEntryScreenViewed(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", isInRegistration=" + bool + ", opticalBrightness=" + d + ")";
    }

    public C39342cm5(String eventId, DateTime eventTime, DateTime clientTime, Boolean bool, Double d) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        this.f61222a = eventId;
        this.f61223b = eventTime;
        this.f61224c = clientTime;
        this.f61225d = bool;
        this.f61226e = d;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C39342cm5(String str, DateTime dateTime, DateTime dateTime2, Boolean bool, Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r2, dateTime2, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : d);
        if ((i & 1) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
        String str2 = str;
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
