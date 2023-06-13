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
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u001d\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b8\u00109Ju\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0017\u001a\u0004\b%\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u0017\u001a\u0004\b'\u0010\u0019R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\"\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0014028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00107\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u0019¨\u0006:"}, m28432d2 = {"LOP1;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "documentType", "countryCode", "documentEntryMethod", "selfieEntryMethod", "", "autoScanEnabled", "wasAutoScanned", "", "timeToCapture", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getDocumentType", "e", "getCountryCode", "f", "getDocumentEntryMethod", "g", "getSelfieEntryMethod", "h", "Z", "getAutoScanEnabled", "()Z", "i", "getWasAutoScanned", "j", "D", "getTimeToCapture", "()D", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZD)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: OP1 */
/* loaded from: classes4.dex */
public final class OP1 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f26467a;

    /* renamed from: b */
    public final DateTime f26468b;

    /* renamed from: c */
    public final DateTime f26469c;

    /* renamed from: d */
    public final String f26470d;

    /* renamed from: e */
    public final String f26471e;

    /* renamed from: f */
    public final String f26472f;

    /* renamed from: g */
    public final String f26473g;

    /* renamed from: h */
    public final boolean f26474h;

    /* renamed from: i */
    public final boolean f26475i;

    /* renamed from: j */
    public final double f26476j;

    public OP1(String eventId, DateTime eventTime, DateTime clientTime, String str, String str2, String str3, String str4, boolean z, boolean z2, double d) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        this.f26467a = eventId;
        this.f26468b = eventTime;
        this.f26469c = clientTime;
        this.f26470d = str;
        this.f26471e = str2;
        this.f26472f = str3;
        this.f26473g = str4;
        this.f26474h = z;
        this.f26475i = z2;
        this.f26476j = d;
    }

    /* renamed from: a */
    public final OP1 m92350a(String eventId, DateTime eventTime, DateTime clientTime, String str, String str2, String str3, String str4, boolean z, boolean z2, double d) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        return new OP1(eventId, eventTime, clientTime, str, str2, str3, str4, z, z2, d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OP1) {
            OP1 op1 = (OP1) obj;
            return Intrinsics.areEqual(this.f26467a, op1.f26467a) && Intrinsics.areEqual(this.f26468b, op1.f26468b) && Intrinsics.areEqual(this.f26469c, op1.f26469c) && Intrinsics.areEqual(this.f26470d, op1.f26470d) && Intrinsics.areEqual(this.f26471e, op1.f26471e) && Intrinsics.areEqual(this.f26472f, op1.f26472f) && Intrinsics.areEqual(this.f26473g, op1.f26473g) && this.f26474h == op1.f26474h && this.f26475i == op1.f26475i && Double.compare(this.f26476j, op1.f26476j) == 0;
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.IdDocumentScannerResultCaptured";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f26467a), TuplesKt.m28425to("event_time", this.f26468b), TuplesKt.m28425to("client_time", this.f26469c), TuplesKt.m28425to("document_type", this.f26470d), TuplesKt.m28425to("country_code", this.f26471e), TuplesKt.m28425to("document_entry_method", this.f26472f), TuplesKt.m28425to("selfie_entry_method", this.f26473g), TuplesKt.m28425to("auto_scan_enabled", Boolean.valueOf(this.f26474h)), TuplesKt.m28425to("was_auto_scanned", Boolean.valueOf(this.f26475i)), TuplesKt.m28425to("time_to_capture", Double.valueOf(this.f26476j)));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f26467a.hashCode() * 31) + this.f26468b.hashCode()) * 31) + this.f26469c.hashCode()) * 31;
        String str = this.f26470d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f26471e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f26472f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f26473g;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z = this.f26474h;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode5 + i) * 31;
        boolean z2 = this.f26475i;
        return ((i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + Double.hashCode(this.f26476j);
    }

    public String toString() {
        String str = this.f26467a;
        DateTime dateTime = this.f26468b;
        DateTime dateTime2 = this.f26469c;
        String str2 = this.f26470d;
        String str3 = this.f26471e;
        String str4 = this.f26472f;
        String str5 = this.f26473g;
        boolean z = this.f26474h;
        boolean z2 = this.f26475i;
        double d = this.f26476j;
        return "IdDocumentScannerResultCaptured(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", documentType=" + str2 + ", countryCode=" + str3 + ", documentEntryMethod=" + str4 + ", selfieEntryMethod=" + str5 + ", autoScanEnabled=" + z + ", wasAutoScanned=" + z2 + ", timeToCapture=" + d + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ OP1(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, String str5, boolean z, boolean z2, double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, z, z2, d);
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
