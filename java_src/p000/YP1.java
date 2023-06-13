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
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b>\u0010?J£\u0001\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0011HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b\"\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001b\u001a\u0004\b$\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001b\u001a\u0004\b(\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001b\u001a\u0004\b*\u0010\u001dR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u001b\u001a\u0004\b,\u0010\u001dR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u001b\u001a\u0004\b.\u0010\u001dR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\u001b\u001a\u0004\b%\u0010\u001dR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\u001b\u001a\u0004\b1\u0010\u001dR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\u001b\u001a\u0004\b3\u0010\u001dR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\"\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0017088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010=\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u001d¨\u0006@"}, m28432d2 = {"LYP1;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "documentType", "documentEntryMethod", "selfieEntryMethod", "stateCode", "countryCode", "regionCode", "identificationId", "status", "rejectionReason", "ingestionFailure", "", "pendingDuration", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "getStateCode", "h", "getCountryCode", "i", "getRegionCode", "j", "getIdentificationId", "k", "l", "getRejectionReason", "m", "getIngestionFailure", "n", "D", "getPendingDuration", "()D", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: YP1 */
/* loaded from: classes4.dex */
public final class YP1 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f45835a;

    /* renamed from: b */
    public final DateTime f45836b;

    /* renamed from: c */
    public final DateTime f45837c;

    /* renamed from: d */
    public final String f45838d;

    /* renamed from: e */
    public final String f45839e;

    /* renamed from: f */
    public final String f45840f;

    /* renamed from: g */
    public final String f45841g;

    /* renamed from: h */
    public final String f45842h;

    /* renamed from: i */
    public final String f45843i;

    /* renamed from: j */
    public final String f45844j;

    /* renamed from: k */
    public final String f45845k;

    /* renamed from: l */
    public final String f45846l;

    /* renamed from: m */
    public final String f45847m;

    /* renamed from: n */
    public final double f45848n;

    public YP1(String eventId, DateTime eventTime, DateTime clientTime, String documentType, String documentEntryMethod, String str, String str2, String str3, String str4, String str5, String status, String str6, String str7, double d) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(documentEntryMethod, "documentEntryMethod");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f45835a = eventId;
        this.f45836b = eventTime;
        this.f45837c = clientTime;
        this.f45838d = documentType;
        this.f45839e = documentEntryMethod;
        this.f45840f = str;
        this.f45841g = str2;
        this.f45842h = str3;
        this.f45843i = str4;
        this.f45844j = str5;
        this.f45845k = status;
        this.f45846l = str6;
        this.f45847m = str7;
        this.f45848n = d;
    }

    /* renamed from: a */
    public final YP1 m75113a(String eventId, DateTime eventTime, DateTime clientTime, String documentType, String documentEntryMethod, String str, String str2, String str3, String str4, String str5, String status, String str6, String str7, double d) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(documentEntryMethod, "documentEntryMethod");
        Intrinsics.checkNotNullParameter(status, "status");
        return new YP1(eventId, eventTime, clientTime, documentType, documentEntryMethod, str, str2, str3, str4, str5, status, str6, str7, d);
    }

    /* renamed from: b */
    public final String m75112b() {
        return this.f45839e;
    }

    /* renamed from: c */
    public final String m75111c() {
        return this.f45838d;
    }

    /* renamed from: d */
    public final String m75110d() {
        return this.f45840f;
    }

    /* renamed from: e */
    public final String m75109e() {
        return this.f45845k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YP1) {
            YP1 yp1 = (YP1) obj;
            return Intrinsics.areEqual(this.f45835a, yp1.f45835a) && Intrinsics.areEqual(this.f45836b, yp1.f45836b) && Intrinsics.areEqual(this.f45837c, yp1.f45837c) && Intrinsics.areEqual(this.f45838d, yp1.f45838d) && Intrinsics.areEqual(this.f45839e, yp1.f45839e) && Intrinsics.areEqual(this.f45840f, yp1.f45840f) && Intrinsics.areEqual(this.f45841g, yp1.f45841g) && Intrinsics.areEqual(this.f45842h, yp1.f45842h) && Intrinsics.areEqual(this.f45843i, yp1.f45843i) && Intrinsics.areEqual(this.f45844j, yp1.f45844j) && Intrinsics.areEqual(this.f45845k, yp1.f45845k) && Intrinsics.areEqual(this.f45846l, yp1.f45846l) && Intrinsics.areEqual(this.f45847m, yp1.f45847m) && Double.compare(this.f45848n, yp1.f45848n) == 0;
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.IdSubmissionResultReturned";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f45835a), TuplesKt.m28425to("event_time", this.f45836b), TuplesKt.m28425to("client_time", this.f45837c), TuplesKt.m28425to("document_type", this.f45838d), TuplesKt.m28425to("document_entry_method", this.f45839e), TuplesKt.m28425to("selfie_entry_method", this.f45840f), TuplesKt.m28425to("state_code", this.f45841g), TuplesKt.m28425to("country_code", this.f45842h), TuplesKt.m28425to("region_code", this.f45843i), TuplesKt.m28425to("identification_id", this.f45844j), TuplesKt.m28425to("status", this.f45845k), TuplesKt.m28425to("rejection_reason", this.f45846l), TuplesKt.m28425to("ingestion_failure", this.f45847m), TuplesKt.m28425to("pending_duration", Double.valueOf(this.f45848n)));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f45835a.hashCode() * 31) + this.f45836b.hashCode()) * 31) + this.f45837c.hashCode()) * 31) + this.f45838d.hashCode()) * 31) + this.f45839e.hashCode()) * 31;
        String str = this.f45840f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f45841g;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f45842h;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f45843i;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f45844j;
        int hashCode6 = (((hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f45845k.hashCode()) * 31;
        String str6 = this.f45846l;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f45847m;
        return ((hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31) + Double.hashCode(this.f45848n);
    }

    public String toString() {
        String str = this.f45835a;
        DateTime dateTime = this.f45836b;
        DateTime dateTime2 = this.f45837c;
        String str2 = this.f45838d;
        String str3 = this.f45839e;
        String str4 = this.f45840f;
        String str5 = this.f45841g;
        String str6 = this.f45842h;
        String str7 = this.f45843i;
        String str8 = this.f45844j;
        String str9 = this.f45845k;
        String str10 = this.f45846l;
        String str11 = this.f45847m;
        double d = this.f45848n;
        return "IdSubmissionResultReturned(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", documentType=" + str2 + ", documentEntryMethod=" + str3 + ", selfieEntryMethod=" + str4 + ", stateCode=" + str5 + ", countryCode=" + str6 + ", regionCode=" + str7 + ", identificationId=" + str8 + ", status=" + str9 + ", rejectionReason=" + str10 + ", ingestionFailure=" + str11 + ", pendingDuration=" + d + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ YP1(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, str2, str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, str9, (i & 2048) != 0 ? null : str10, (i & 4096) != 0 ? null : str11, d);
        String str12;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str12 = uuid;
        } else {
            str12 = str;
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
