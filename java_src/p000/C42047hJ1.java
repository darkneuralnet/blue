package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.analytics.AnalyticsEvent;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b)\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bI\u0010JJ¨\u0001\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0017\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001c\u001a\u0004\b(\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010\u001c\u001a\u0004\b2\u0010\u001eR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u0010\u001c\u001a\u0004\b8\u0010\u001eR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b=\u0010:\u001a\u0004\b>\u0010<R\u0017\u0010\u0013\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b?\u0010:\u001a\u0004\b@\u0010<R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bA\u0010\u001c\u001a\u0004\bB\u0010\u001eR\"\u0010F\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00190C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010H\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010\u001e¨\u0006K"}, m28432d2 = {"LhJ1;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "resolution", "leaseId", "", "autoScanned", "", "autoScannedCodes", CoreConstants.CONTEXT_SCOPE_VALUE, "helmetRequired", "currency", "", "initialChargeAmount", "returnRefundAmount", "delinquentFeeAmount", "endRideAttemptId", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;IIILjava/lang/String;)LhJ1;", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getResolution", "e", "getLeaseId", "f", "Ljava/lang/Boolean;", "getAutoScanned", "()Ljava/lang/Boolean;", "g", "Ljava/util/List;", "getAutoScannedCodes", "()Ljava/util/List;", "h", "getContext", "i", "Z", "getHelmetRequired", "()Z", "j", "getCurrency", "k", "I", "getInitialChargeAmount", "()I", "l", "getReturnRefundAmount", "m", "getDelinquentFeeAmount", "n", "getEndRideAttemptId", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;IIILjava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: hJ1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C42047hJ1 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f84978a;

    /* renamed from: b */
    public final DateTime f84979b;

    /* renamed from: c */
    public final DateTime f84980c;

    /* renamed from: d */
    public final String f84981d;

    /* renamed from: e */
    public final String f84982e;

    /* renamed from: f */
    public final Boolean f84983f;

    /* renamed from: g */
    public final List<String> f84984g;

    /* renamed from: h */
    public final String f84985h;

    /* renamed from: i */
    public final boolean f84986i;

    /* renamed from: j */
    public final String f84987j;

    /* renamed from: k */
    public final int f84988k;

    /* renamed from: l */
    public final int f84989l;

    /* renamed from: m */
    public final int f84990m;

    /* renamed from: n */
    public final String f84991n;

    public C42047hJ1(String eventId, DateTime eventTime, DateTime clientTime, String resolution, String str, Boolean bool, List<String> autoScannedCodes, String context, boolean z, String currency, int i, int i2, int i3, String str2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(resolution, "resolution");
        Intrinsics.checkNotNullParameter(autoScannedCodes, "autoScannedCodes");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f84978a = eventId;
        this.f84979b = eventTime;
        this.f84980c = clientTime;
        this.f84981d = resolution;
        this.f84982e = str;
        this.f84983f = bool;
        this.f84984g = autoScannedCodes;
        this.f84985h = context;
        this.f84986i = z;
        this.f84987j = currency;
        this.f84988k = i;
        this.f84989l = i2;
        this.f84990m = i3;
        this.f84991n = str2;
    }

    /* renamed from: a */
    public final C42047hJ1 m36544a(String eventId, DateTime eventTime, DateTime clientTime, String resolution, String str, Boolean bool, List<String> autoScannedCodes, String context, boolean z, String currency, int i, int i2, int i3, String str2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(resolution, "resolution");
        Intrinsics.checkNotNullParameter(autoScannedCodes, "autoScannedCodes");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new C42047hJ1(eventId, eventTime, clientTime, resolution, str, bool, autoScannedCodes, context, z, currency, i, i2, i3, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C42047hJ1) {
            C42047hJ1 c42047hJ1 = (C42047hJ1) obj;
            return Intrinsics.areEqual(this.f84978a, c42047hJ1.f84978a) && Intrinsics.areEqual(this.f84979b, c42047hJ1.f84979b) && Intrinsics.areEqual(this.f84980c, c42047hJ1.f84980c) && Intrinsics.areEqual(this.f84981d, c42047hJ1.f84981d) && Intrinsics.areEqual(this.f84982e, c42047hJ1.f84982e) && Intrinsics.areEqual(this.f84983f, c42047hJ1.f84983f) && Intrinsics.areEqual(this.f84984g, c42047hJ1.f84984g) && Intrinsics.areEqual(this.f84985h, c42047hJ1.f84985h) && this.f84986i == c42047hJ1.f84986i && Intrinsics.areEqual(this.f84987j, c42047hJ1.f84987j) && this.f84988k == c42047hJ1.f84988k && this.f84989l == c42047hJ1.f84989l && this.f84990m == c42047hJ1.f84990m && Intrinsics.areEqual(this.f84991n, c42047hJ1.f84991n);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.HelmetLeaseReturnPhotoScreenResolved";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f84978a), TuplesKt.m28425to("event_time", this.f84979b), TuplesKt.m28425to("client_time", this.f84980c), TuplesKt.m28425to("resolution", this.f84981d), TuplesKt.m28425to("lease_id", this.f84982e), TuplesKt.m28425to("auto_scanned", this.f84983f), TuplesKt.m28425to("auto_scanned_codes", this.f84984g), TuplesKt.m28425to(CoreConstants.CONTEXT_SCOPE_VALUE, this.f84985h), TuplesKt.m28425to("helmet_required", Boolean.valueOf(this.f84986i)), TuplesKt.m28425to("currency", this.f84987j), TuplesKt.m28425to("initial_charge_amount", Integer.valueOf(this.f84988k)), TuplesKt.m28425to("return_refund_amount", Integer.valueOf(this.f84989l)), TuplesKt.m28425to("delinquent_fee_amount", Integer.valueOf(this.f84990m)), TuplesKt.m28425to("end_ride_attempt_id", this.f84991n));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.f84978a.hashCode() * 31) + this.f84979b.hashCode()) * 31) + this.f84980c.hashCode()) * 31) + this.f84981d.hashCode()) * 31;
        String str = this.f84982e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f84983f;
        int hashCode3 = (((((hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31) + this.f84984g.hashCode()) * 31) + this.f84985h.hashCode()) * 31;
        boolean z = this.f84986i;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode4 = (((((((((hashCode3 + i) * 31) + this.f84987j.hashCode()) * 31) + Integer.hashCode(this.f84988k)) * 31) + Integer.hashCode(this.f84989l)) * 31) + Integer.hashCode(this.f84990m)) * 31;
        String str2 = this.f84991n;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f84978a;
        DateTime dateTime = this.f84979b;
        DateTime dateTime2 = this.f84980c;
        String str2 = this.f84981d;
        String str3 = this.f84982e;
        Boolean bool = this.f84983f;
        List<String> list = this.f84984g;
        String str4 = this.f84985h;
        boolean z = this.f84986i;
        String str5 = this.f84987j;
        int i = this.f84988k;
        int i2 = this.f84989l;
        int i3 = this.f84990m;
        String str6 = this.f84991n;
        return "HelmetLeaseReturnPhotoScreenResolved(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", resolution=" + str2 + ", leaseId=" + str3 + ", autoScanned=" + bool + ", autoScannedCodes=" + list + ", context=" + str4 + ", helmetRequired=" + z + ", currency=" + str5 + ", initialChargeAmount=" + i + ", returnRefundAmount=" + i2 + ", delinquentFeeAmount=" + i3 + ", endRideAttemptId=" + str6 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C42047hJ1(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, Boolean bool, List list, String str4, boolean z, String str5, int i, int i2, int i3, String str6, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, str2, (i4 & 16) != 0 ? null : str3, (i4 & 32) != 0 ? null : bool, list, str4, z, str5, i, i2, i3, (i4 & 8192) != 0 ? null : str6);
        String str7;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i4 & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str7 = uuid;
        } else {
            str7 = str;
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
