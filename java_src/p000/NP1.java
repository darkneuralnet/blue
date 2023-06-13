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
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u001b\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b5\u00106Jk\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010\u0018R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\"\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00130/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u0018¨\u00067"}, m28432d2 = {"LNP1;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "documentType", "countryCode", "documentEntryMethod", "selfieEntryMethod", "", "autoScanEnabled", "", "timeToAbort", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getDocumentType", "e", "getCountryCode", "f", "getDocumentEntryMethod", "g", "getSelfieEntryMethod", "h", "Z", "getAutoScanEnabled", "()Z", "i", "D", "getTimeToAbort", "()D", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZD)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: NP1 */
/* loaded from: classes4.dex */
public final class NP1 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f24540a;

    /* renamed from: b */
    public final DateTime f24541b;

    /* renamed from: c */
    public final DateTime f24542c;

    /* renamed from: d */
    public final String f24543d;

    /* renamed from: e */
    public final String f24544e;

    /* renamed from: f */
    public final String f24545f;

    /* renamed from: g */
    public final String f24546g;

    /* renamed from: h */
    public final boolean f24547h;

    /* renamed from: i */
    public final double f24548i;

    public NP1(String eventId, DateTime eventTime, DateTime clientTime, String str, String str2, String str3, String str4, boolean z, double d) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        this.f24540a = eventId;
        this.f24541b = eventTime;
        this.f24542c = clientTime;
        this.f24543d = str;
        this.f24544e = str2;
        this.f24545f = str3;
        this.f24546g = str4;
        this.f24547h = z;
        this.f24548i = d;
    }

    /* renamed from: a */
    public final NP1 m93938a(String eventId, DateTime eventTime, DateTime clientTime, String str, String str2, String str3, String str4, boolean z, double d) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        return new NP1(eventId, eventTime, clientTime, str, str2, str3, str4, z, d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NP1) {
            NP1 np1 = (NP1) obj;
            return Intrinsics.areEqual(this.f24540a, np1.f24540a) && Intrinsics.areEqual(this.f24541b, np1.f24541b) && Intrinsics.areEqual(this.f24542c, np1.f24542c) && Intrinsics.areEqual(this.f24543d, np1.f24543d) && Intrinsics.areEqual(this.f24544e, np1.f24544e) && Intrinsics.areEqual(this.f24545f, np1.f24545f) && Intrinsics.areEqual(this.f24546g, np1.f24546g) && this.f24547h == np1.f24547h && Double.compare(this.f24548i, np1.f24548i) == 0;
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.IdDocumentScannerAborted";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f24540a), TuplesKt.m28425to("event_time", this.f24541b), TuplesKt.m28425to("client_time", this.f24542c), TuplesKt.m28425to("document_type", this.f24543d), TuplesKt.m28425to("country_code", this.f24544e), TuplesKt.m28425to("document_entry_method", this.f24545f), TuplesKt.m28425to("selfie_entry_method", this.f24546g), TuplesKt.m28425to("auto_scan_enabled", Boolean.valueOf(this.f24547h)), TuplesKt.m28425to("time_to_abort", Double.valueOf(this.f24548i)));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f24540a.hashCode() * 31) + this.f24541b.hashCode()) * 31) + this.f24542c.hashCode()) * 31;
        String str = this.f24543d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f24544e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f24545f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f24546g;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z = this.f24547h;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode5 + i) * 31) + Double.hashCode(this.f24548i);
    }

    public String toString() {
        String str = this.f24540a;
        DateTime dateTime = this.f24541b;
        DateTime dateTime2 = this.f24542c;
        String str2 = this.f24543d;
        String str3 = this.f24544e;
        String str4 = this.f24545f;
        String str5 = this.f24546g;
        boolean z = this.f24547h;
        double d = this.f24548i;
        return "IdDocumentScannerAborted(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", documentType=" + str2 + ", countryCode=" + str3 + ", documentEntryMethod=" + str4 + ", selfieEntryMethod=" + str5 + ", autoScanEnabled=" + z + ", timeToAbort=" + d + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ NP1(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, String str5, boolean z, double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, z, d);
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
