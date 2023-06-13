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
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001f\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b:\u0010;J{\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0013\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010\u0019R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u0017\u001a\u0004\b)\u0010\u0019R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-R\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b1\u0010-R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\u0017\u001a\u0004\b3\u0010\u0019R\"\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0014048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u00109\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u0019¨\u0006<"}, m28432d2 = {"LiJ1;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "leaseId", CoreConstants.CONTEXT_SCOPE_VALUE, "", "helmetRequired", "currency", "", "initialChargeAmount", "returnRefundAmount", "delinquentFeeAmount", "endRideAttemptId", C17296a.f69688o, "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getLeaseId", "e", "getContext", "f", "Z", "getHelmetRequired", "()Z", "g", "getCurrency", "h", "I", "getInitialChargeAmount", "()I", "i", "getReturnRefundAmount", "j", "getDelinquentFeeAmount", "k", "getEndRideAttemptId", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;IIILjava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: iJ1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C42640iJ1 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f87093a;

    /* renamed from: b */
    public final DateTime f87094b;

    /* renamed from: c */
    public final DateTime f87095c;

    /* renamed from: d */
    public final String f87096d;

    /* renamed from: e */
    public final String f87097e;

    /* renamed from: f */
    public final boolean f87098f;

    /* renamed from: g */
    public final String f87099g;

    /* renamed from: h */
    public final int f87100h;

    /* renamed from: i */
    public final int f87101i;

    /* renamed from: j */
    public final int f87102j;

    /* renamed from: k */
    public final String f87103k;

    public C42640iJ1(String eventId, DateTime eventTime, DateTime clientTime, String str, String context, boolean z, String currency, int i, int i2, int i3, String str2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f87093a = eventId;
        this.f87094b = eventTime;
        this.f87095c = clientTime;
        this.f87096d = str;
        this.f87097e = context;
        this.f87098f = z;
        this.f87099g = currency;
        this.f87100h = i;
        this.f87101i = i2;
        this.f87102j = i3;
        this.f87103k = str2;
    }

    /* renamed from: a */
    public final C42640iJ1 m34235a(String eventId, DateTime eventTime, DateTime clientTime, String str, String context, boolean z, String currency, int i, int i2, int i3, String str2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new C42640iJ1(eventId, eventTime, clientTime, str, context, z, currency, i, i2, i3, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C42640iJ1) {
            C42640iJ1 c42640iJ1 = (C42640iJ1) obj;
            return Intrinsics.areEqual(this.f87093a, c42640iJ1.f87093a) && Intrinsics.areEqual(this.f87094b, c42640iJ1.f87094b) && Intrinsics.areEqual(this.f87095c, c42640iJ1.f87095c) && Intrinsics.areEqual(this.f87096d, c42640iJ1.f87096d) && Intrinsics.areEqual(this.f87097e, c42640iJ1.f87097e) && this.f87098f == c42640iJ1.f87098f && Intrinsics.areEqual(this.f87099g, c42640iJ1.f87099g) && this.f87100h == c42640iJ1.f87100h && this.f87101i == c42640iJ1.f87101i && this.f87102j == c42640iJ1.f87102j && Intrinsics.areEqual(this.f87103k, c42640iJ1.f87103k);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.HelmetLeaseReturnPhotoScreenShown";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f87093a), TuplesKt.m28425to("event_time", this.f87094b), TuplesKt.m28425to("client_time", this.f87095c), TuplesKt.m28425to("lease_id", this.f87096d), TuplesKt.m28425to(CoreConstants.CONTEXT_SCOPE_VALUE, this.f87097e), TuplesKt.m28425to("helmet_required", Boolean.valueOf(this.f87098f)), TuplesKt.m28425to("currency", this.f87099g), TuplesKt.m28425to("initial_charge_amount", Integer.valueOf(this.f87100h)), TuplesKt.m28425to("return_refund_amount", Integer.valueOf(this.f87101i)), TuplesKt.m28425to("delinquent_fee_amount", Integer.valueOf(this.f87102j)), TuplesKt.m28425to("end_ride_attempt_id", this.f87103k));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f87093a.hashCode() * 31) + this.f87094b.hashCode()) * 31) + this.f87095c.hashCode()) * 31;
        String str = this.f87096d;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f87097e.hashCode()) * 31;
        boolean z = this.f87098f;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode3 = (((((((((hashCode2 + i) * 31) + this.f87099g.hashCode()) * 31) + Integer.hashCode(this.f87100h)) * 31) + Integer.hashCode(this.f87101i)) * 31) + Integer.hashCode(this.f87102j)) * 31;
        String str2 = this.f87103k;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f87093a;
        DateTime dateTime = this.f87094b;
        DateTime dateTime2 = this.f87095c;
        String str2 = this.f87096d;
        String str3 = this.f87097e;
        boolean z = this.f87098f;
        String str4 = this.f87099g;
        int i = this.f87100h;
        int i2 = this.f87101i;
        int i3 = this.f87102j;
        String str5 = this.f87103k;
        return "HelmetLeaseReturnPhotoScreenShown(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", leaseId=" + str2 + ", context=" + str3 + ", helmetRequired=" + z + ", currency=" + str4 + ", initialChargeAmount=" + i + ", returnRefundAmount=" + i2 + ", delinquentFeeAmount=" + i3 + ", endRideAttemptId=" + str5 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C42640iJ1(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, boolean z, String str4, int i, int i2, int i3, String str5, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, (i4 & 8) != 0 ? null : str2, str3, z, str4, i, i2, i3, (i4 & 1024) != 0 ? null : str5);
        String str6;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i4 & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str6 = uuid;
        } else {
            str6 = str;
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
