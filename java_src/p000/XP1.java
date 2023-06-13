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
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b-\u0010.J]\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0014\u001a\u0004\b$\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0014\u001a\u0004\b&\u0010\u0016R\"\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00100'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0016¨\u0006/"}, m28432d2 = {"LXP1;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "idStatus", "rejectionReason", "ingestionFailure", "defaultCountryCode", "defaultDocumentType", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getIdStatus", "e", "getRejectionReason", "f", "getIngestionFailure", "g", "getDefaultCountryCode", "h", "getDefaultDocumentType", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: XP1 */
/* loaded from: classes4.dex */
public final class XP1 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f43134a;

    /* renamed from: b */
    public final DateTime f43135b;

    /* renamed from: c */
    public final DateTime f43136c;

    /* renamed from: d */
    public final String f43137d;

    /* renamed from: e */
    public final String f43138e;

    /* renamed from: f */
    public final String f43139f;

    /* renamed from: g */
    public final String f43140g;

    /* renamed from: h */
    public final String f43141h;

    public XP1(String eventId, DateTime eventTime, DateTime clientTime, String idStatus, String str, String str2, String defaultCountryCode, String defaultDocumentType) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(idStatus, "idStatus");
        Intrinsics.checkNotNullParameter(defaultCountryCode, "defaultCountryCode");
        Intrinsics.checkNotNullParameter(defaultDocumentType, "defaultDocumentType");
        this.f43134a = eventId;
        this.f43135b = eventTime;
        this.f43136c = clientTime;
        this.f43137d = idStatus;
        this.f43138e = str;
        this.f43139f = str2;
        this.f43140g = defaultCountryCode;
        this.f43141h = defaultDocumentType;
    }

    /* renamed from: a */
    public final XP1 m77021a(String eventId, DateTime eventTime, DateTime clientTime, String idStatus, String str, String str2, String defaultCountryCode, String defaultDocumentType) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(idStatus, "idStatus");
        Intrinsics.checkNotNullParameter(defaultCountryCode, "defaultCountryCode");
        Intrinsics.checkNotNullParameter(defaultDocumentType, "defaultDocumentType");
        return new XP1(eventId, eventTime, clientTime, idStatus, str, str2, defaultCountryCode, defaultDocumentType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof XP1) {
            XP1 xp1 = (XP1) obj;
            return Intrinsics.areEqual(this.f43134a, xp1.f43134a) && Intrinsics.areEqual(this.f43135b, xp1.f43135b) && Intrinsics.areEqual(this.f43136c, xp1.f43136c) && Intrinsics.areEqual(this.f43137d, xp1.f43137d) && Intrinsics.areEqual(this.f43138e, xp1.f43138e) && Intrinsics.areEqual(this.f43139f, xp1.f43139f) && Intrinsics.areEqual(this.f43140g, xp1.f43140g) && Intrinsics.areEqual(this.f43141h, xp1.f43141h);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.IdSelectionScreenDisplayed";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f43134a), TuplesKt.m28425to("event_time", this.f43135b), TuplesKt.m28425to("client_time", this.f43136c), TuplesKt.m28425to("id_status", this.f43137d), TuplesKt.m28425to("rejection_reason", this.f43138e), TuplesKt.m28425to("ingestion_failure", this.f43139f), TuplesKt.m28425to("default_country_code", this.f43140g), TuplesKt.m28425to("default_document_type", this.f43141h));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((this.f43134a.hashCode() * 31) + this.f43135b.hashCode()) * 31) + this.f43136c.hashCode()) * 31) + this.f43137d.hashCode()) * 31;
        String str = this.f43138e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f43139f;
        return ((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f43140g.hashCode()) * 31) + this.f43141h.hashCode();
    }

    public String toString() {
        String str = this.f43134a;
        DateTime dateTime = this.f43135b;
        DateTime dateTime2 = this.f43136c;
        String str2 = this.f43137d;
        String str3 = this.f43138e;
        String str4 = this.f43139f;
        String str5 = this.f43140g;
        String str6 = this.f43141h;
        return "IdSelectionScreenDisplayed(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", idStatus=" + str2 + ", rejectionReason=" + str3 + ", ingestionFailure=" + str4 + ", defaultCountryCode=" + str5 + ", defaultDocumentType=" + str6 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ XP1(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, str5, str6);
        String str7;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str7 = uuid;
        } else {
            str7 = str;
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
