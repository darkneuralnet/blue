package p000;

import ch.qos.logback.core.CoreConstants;
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
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b#\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B}\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b@\u0010AJ\u008f\u0001\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0015\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0019\u001a\u0004\b%\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u0019\u001a\u0004\b'\u0010\u001bR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u0019\u001a\u0004\b)\u0010\u001bR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\u0019\u001a\u0004\b/\u0010\u001bR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b5\u00103R\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b7\u00103R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b8\u0010\u0019\u001a\u0004\b9\u0010\u001bR\"\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00160:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\u001b¨\u0006B"}, m28432d2 = {"LgJ1;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "errorTitle", "errorMessage", "leaseId", CoreConstants.CONTEXT_SCOPE_VALUE, "", "helmetRequired", "currency", "", "initialChargeAmount", "returnRefundAmount", "delinquentFeeAmount", "endRideAttemptId", C17296a.f69688o, "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getErrorTitle", "e", "getErrorMessage", "f", "getLeaseId", "g", "getContext", "h", "Z", "getHelmetRequired", "()Z", "i", "getCurrency", "j", "I", "getInitialChargeAmount", "()I", "k", "getReturnRefundAmount", "l", "getDelinquentFeeAmount", "m", "getEndRideAttemptId", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;IIILjava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: gJ1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C41454gJ1 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f81948a;

    /* renamed from: b */
    public final DateTime f81949b;

    /* renamed from: c */
    public final DateTime f81950c;

    /* renamed from: d */
    public final String f81951d;

    /* renamed from: e */
    public final String f81952e;

    /* renamed from: f */
    public final String f81953f;

    /* renamed from: g */
    public final String f81954g;

    /* renamed from: h */
    public final boolean f81955h;

    /* renamed from: i */
    public final String f81956i;

    /* renamed from: j */
    public final int f81957j;

    /* renamed from: k */
    public final int f81958k;

    /* renamed from: l */
    public final int f81959l;

    /* renamed from: m */
    public final String f81960m;

    public C41454gJ1(String eventId, DateTime eventTime, DateTime clientTime, String errorTitle, String errorMessage, String str, String context, boolean z, String currency, int i, int i2, int i3, String str2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(errorTitle, "errorTitle");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f81948a = eventId;
        this.f81949b = eventTime;
        this.f81950c = clientTime;
        this.f81951d = errorTitle;
        this.f81952e = errorMessage;
        this.f81953f = str;
        this.f81954g = context;
        this.f81955h = z;
        this.f81956i = currency;
        this.f81957j = i;
        this.f81958k = i2;
        this.f81959l = i3;
        this.f81960m = str2;
    }

    /* renamed from: a */
    public final C41454gJ1 m39648a(String eventId, DateTime eventTime, DateTime clientTime, String errorTitle, String errorMessage, String str, String context, boolean z, String currency, int i, int i2, int i3, String str2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(errorTitle, "errorTitle");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new C41454gJ1(eventId, eventTime, clientTime, errorTitle, errorMessage, str, context, z, currency, i, i2, i3, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C41454gJ1) {
            C41454gJ1 c41454gJ1 = (C41454gJ1) obj;
            return Intrinsics.areEqual(this.f81948a, c41454gJ1.f81948a) && Intrinsics.areEqual(this.f81949b, c41454gJ1.f81949b) && Intrinsics.areEqual(this.f81950c, c41454gJ1.f81950c) && Intrinsics.areEqual(this.f81951d, c41454gJ1.f81951d) && Intrinsics.areEqual(this.f81952e, c41454gJ1.f81952e) && Intrinsics.areEqual(this.f81953f, c41454gJ1.f81953f) && Intrinsics.areEqual(this.f81954g, c41454gJ1.f81954g) && this.f81955h == c41454gJ1.f81955h && Intrinsics.areEqual(this.f81956i, c41454gJ1.f81956i) && this.f81957j == c41454gJ1.f81957j && this.f81958k == c41454gJ1.f81958k && this.f81959l == c41454gJ1.f81959l && Intrinsics.areEqual(this.f81960m, c41454gJ1.f81960m);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.HelmetLeaseReturnPhotoErrorOccurred";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f81948a), TuplesKt.m28425to("event_time", this.f81949b), TuplesKt.m28425to("client_time", this.f81950c), TuplesKt.m28425to("error_title", this.f81951d), TuplesKt.m28425to("error_message", this.f81952e), TuplesKt.m28425to("lease_id", this.f81953f), TuplesKt.m28425to(CoreConstants.CONTEXT_SCOPE_VALUE, this.f81954g), TuplesKt.m28425to("helmet_required", Boolean.valueOf(this.f81955h)), TuplesKt.m28425to("currency", this.f81956i), TuplesKt.m28425to("initial_charge_amount", Integer.valueOf(this.f81957j)), TuplesKt.m28425to("return_refund_amount", Integer.valueOf(this.f81958k)), TuplesKt.m28425to("delinquent_fee_amount", Integer.valueOf(this.f81959l)), TuplesKt.m28425to("end_ride_attempt_id", this.f81960m));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((this.f81948a.hashCode() * 31) + this.f81949b.hashCode()) * 31) + this.f81950c.hashCode()) * 31) + this.f81951d.hashCode()) * 31) + this.f81952e.hashCode()) * 31;
        String str = this.f81953f;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f81954g.hashCode()) * 31;
        boolean z = this.f81955h;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode3 = (((((((((hashCode2 + i) * 31) + this.f81956i.hashCode()) * 31) + Integer.hashCode(this.f81957j)) * 31) + Integer.hashCode(this.f81958k)) * 31) + Integer.hashCode(this.f81959l)) * 31;
        String str2 = this.f81960m;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f81948a;
        DateTime dateTime = this.f81949b;
        DateTime dateTime2 = this.f81950c;
        String str2 = this.f81951d;
        String str3 = this.f81952e;
        String str4 = this.f81953f;
        String str5 = this.f81954g;
        boolean z = this.f81955h;
        String str6 = this.f81956i;
        int i = this.f81957j;
        int i2 = this.f81958k;
        int i3 = this.f81959l;
        String str7 = this.f81960m;
        return "HelmetLeaseReturnPhotoErrorOccurred(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", errorTitle=" + str2 + ", errorMessage=" + str3 + ", leaseId=" + str4 + ", context=" + str5 + ", helmetRequired=" + z + ", currency=" + str6 + ", initialChargeAmount=" + i + ", returnRefundAmount=" + i2 + ", delinquentFeeAmount=" + i3 + ", endRideAttemptId=" + str7 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C41454gJ1(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, String str5, boolean z, String str6, int i, int i2, int i3, String str7, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, str2, str3, (i4 & 32) != 0 ? null : str4, str5, z, str6, i, i2, i3, (i4 & 4096) != 0 ? null : str7);
        String str8;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i4 & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str8 = uuid;
        } else {
            str8 = str;
        }
        if ((i4 & 2) != 0) {
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            dateTime3 = now;
        } else {
            dateTime3 = dateTime;
        }
        if ((i4 & 4) != 0) {
            DateTime now2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now2, "now()");
            dateTime4 = now2;
        } else {
            dateTime4 = dateTime2;
        }
    }
}
