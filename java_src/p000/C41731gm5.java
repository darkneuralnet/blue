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
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b,\u0010-JR\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\b\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0014\u001a\u0004\b%\u0010\u0016R\"\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00110&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0016¨\u0006."}, m28432d2 = {"Lgm5;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "", "isInRegistration", "", "opticalBrightness", "pricingUiSetting", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/String;)Lgm5;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "e", "Ljava/lang/Double;", "getOpticalBrightness", "()Ljava/lang/Double;", "f", "getPricingUiSetting", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: gm5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C41731gm5 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f84222a;

    /* renamed from: b */
    public final DateTime f84223b;

    /* renamed from: c */
    public final DateTime f84224c;

    /* renamed from: d */
    public final Boolean f84225d;

    /* renamed from: e */
    public final Double f84226e;

    /* renamed from: f */
    public final String f84227f;

    public C41731gm5() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ C41731gm5 copy$default(C41731gm5 c41731gm5, String str, DateTime dateTime, DateTime dateTime2, Boolean bool, Double d, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c41731gm5.f84222a;
        }
        if ((i & 2) != 0) {
            dateTime = c41731gm5.f84223b;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = c41731gm5.f84224c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 8) != 0) {
            bool = c41731gm5.f84225d;
        }
        Boolean bool2 = bool;
        if ((i & 16) != 0) {
            d = c41731gm5.f84226e;
        }
        Double d2 = d;
        if ((i & 32) != 0) {
            str2 = c41731gm5.f84227f;
        }
        return c41731gm5.m37490a(str, dateTime3, dateTime4, bool2, d2, str2);
    }

    /* renamed from: a */
    public final C41731gm5 m37490a(String eventId, DateTime eventTime, DateTime clientTime, Boolean bool, Double d, String str) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        return new C41731gm5(eventId, eventTime, clientTime, bool, d, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C41731gm5) {
            C41731gm5 c41731gm5 = (C41731gm5) obj;
            return Intrinsics.areEqual(this.f84222a, c41731gm5.f84222a) && Intrinsics.areEqual(this.f84223b, c41731gm5.f84223b) && Intrinsics.areEqual(this.f84224c, c41731gm5.f84224c) && Intrinsics.areEqual(this.f84225d, c41731gm5.f84225d) && Intrinsics.areEqual((Object) this.f84226e, (Object) c41731gm5.f84226e) && Intrinsics.areEqual(this.f84227f, c41731gm5.f84227f);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.ScannerScreenViewed";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f84222a), TuplesKt.m28425to("event_time", this.f84223b), TuplesKt.m28425to("client_time", this.f84224c), TuplesKt.m28425to("is_in_registration", this.f84225d), TuplesKt.m28425to("optical_brightness", this.f84226e), TuplesKt.m28425to("pricing_ui_setting", this.f84227f));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((this.f84222a.hashCode() * 31) + this.f84223b.hashCode()) * 31) + this.f84224c.hashCode()) * 31;
        Boolean bool = this.f84225d;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Double d = this.f84226e;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.f84227f;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.f84222a;
        DateTime dateTime = this.f84223b;
        DateTime dateTime2 = this.f84224c;
        Boolean bool = this.f84225d;
        Double d = this.f84226e;
        String str2 = this.f84227f;
        return "ScannerScreenViewed(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", isInRegistration=" + bool + ", opticalBrightness=" + d + ", pricingUiSetting=" + str2 + ")";
    }

    public C41731gm5(String eventId, DateTime eventTime, DateTime clientTime, Boolean bool, Double d, String str) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        this.f84222a = eventId;
        this.f84223b = eventTime;
        this.f84224c = clientTime;
        this.f84225d = bool;
        this.f84226e = d;
        this.f84227f = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C41731gm5(String str, DateTime dateTime, DateTime dateTime2, Boolean bool, Double d, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r2, dateTime2, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : d, (i & 32) != 0 ? null : str2);
        if ((i & 1) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
        String str3 = str;
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
