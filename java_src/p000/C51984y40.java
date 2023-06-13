package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.analytics.AnalyticsEvent;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.AnalyticsFields;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b-\u0010.J]\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010\u0016R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010\u001eR\"\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00100'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0016¨\u0006/"}, m28432d2 = {"Ly40;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "birdId", "sessionId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "scanMethod", "scanTime", "populationTime", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "getBirdId", "c", "getSessionId", DateTokenConverter.CONVERTER_KEY, "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "e", "getClientTime", "f", "getScanMethod", "g", "getScanTime", "h", "getPopulationTime", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: y40  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C51984y40 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f118688a;

    /* renamed from: b */
    public final String f118689b;

    /* renamed from: c */
    public final String f118690c;

    /* renamed from: d */
    public final DateTime f118691d;

    /* renamed from: e */
    public final DateTime f118692e;

    /* renamed from: f */
    public final String f118693f;

    /* renamed from: g */
    public final DateTime f118694g;

    /* renamed from: h */
    public final DateTime f118695h;

    public C51984y40(String eventId, String birdId, String sessionId, DateTime eventTime, DateTime clientTime, String scanMethod, DateTime dateTime, DateTime dateTime2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(scanMethod, "scanMethod");
        this.f118688a = eventId;
        this.f118689b = birdId;
        this.f118690c = sessionId;
        this.f118691d = eventTime;
        this.f118692e = clientTime;
        this.f118693f = scanMethod;
        this.f118694g = dateTime;
        this.f118695h = dateTime2;
    }

    /* renamed from: a */
    public final C51984y40 m4206a(String eventId, String birdId, String sessionId, DateTime eventTime, DateTime clientTime, String scanMethod, DateTime dateTime, DateTime dateTime2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(scanMethod, "scanMethod");
        return new C51984y40(eventId, birdId, sessionId, eventTime, clientTime, scanMethod, dateTime, dateTime2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C51984y40) {
            C51984y40 c51984y40 = (C51984y40) obj;
            return Intrinsics.areEqual(this.f118688a, c51984y40.f118688a) && Intrinsics.areEqual(this.f118689b, c51984y40.f118689b) && Intrinsics.areEqual(this.f118690c, c51984y40.f118690c) && Intrinsics.areEqual(this.f118691d, c51984y40.f118691d) && Intrinsics.areEqual(this.f118692e, c51984y40.f118692e) && Intrinsics.areEqual(this.f118693f, c51984y40.f118693f) && Intrinsics.areEqual(this.f118694g, c51984y40.f118694g) && Intrinsics.areEqual(this.f118695h, c51984y40.f118695h);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.BulkScannerVehiceScanned";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f118688a), TuplesKt.m28425to("bird_id", this.f118689b), TuplesKt.m28425to(AnalyticsFields.SESSION_ID, this.f118690c), TuplesKt.m28425to("event_time", this.f118691d), TuplesKt.m28425to("client_time", this.f118692e), TuplesKt.m28425to("scan_method", this.f118693f), TuplesKt.m28425to("scan_time", this.f118694g), TuplesKt.m28425to("population_time", this.f118695h));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f118688a.hashCode() * 31) + this.f118689b.hashCode()) * 31) + this.f118690c.hashCode()) * 31) + this.f118691d.hashCode()) * 31) + this.f118692e.hashCode()) * 31) + this.f118693f.hashCode()) * 31;
        DateTime dateTime = this.f118694g;
        int hashCode2 = (hashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.f118695h;
        return hashCode2 + (dateTime2 != null ? dateTime2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f118688a;
        String str2 = this.f118689b;
        String str3 = this.f118690c;
        DateTime dateTime = this.f118691d;
        DateTime dateTime2 = this.f118692e;
        String str4 = this.f118693f;
        DateTime dateTime3 = this.f118694g;
        DateTime dateTime4 = this.f118695h;
        return "BulkScannerVehiceScanned(eventId=" + str + ", birdId=" + str2 + ", sessionId=" + str3 + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", scanMethod=" + str4 + ", scanTime=" + dateTime3 + ", populationTime=" + dateTime4 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C51984y40(String str, String str2, String str3, DateTime dateTime, DateTime dateTime2, String str4, DateTime dateTime3, DateTime dateTime4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, str2, str3, r7, r8, str4, (i & 64) != 0 ? null : dateTime3, (i & 128) != 0 ? null : dateTime4);
        String str5;
        DateTime dateTime5;
        DateTime dateTime6;
        if ((i & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str5 = uuid;
        } else {
            str5 = str;
        }
        if ((i & 8) != 0) {
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            dateTime5 = now;
        } else {
            dateTime5 = dateTime;
        }
        if ((i & 16) != 0) {
            DateTime now2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now2, "now()");
            dateTime6 = now2;
        } else {
            dateTime6 = dateTime2;
        }
    }
}
