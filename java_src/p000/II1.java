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
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u001d\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b7\u00108Jo\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\fHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0012\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010\u0018R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u0016\u001a\u0004\b(\u0010\u0018R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,R\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b0\u0010,R\"\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0013018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00106\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0018¨\u00069"}, m28432d2 = {"LII1;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "resolution", "birdId", "", "helmetRequired", "currency", "", "initialChargeAmount", "returnRefundAmount", "delinquentFeeAmount", C17296a.f69688o, "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getResolution", "e", "getBirdId", "f", "Z", "getHelmetRequired", "()Z", "g", "getCurrency", "h", "I", "getInitialChargeAmount", "()I", "i", "getReturnRefundAmount", "j", "getDelinquentFeeAmount", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;III)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: II1 */
/* loaded from: classes4.dex */
public final class II1 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f15262a;

    /* renamed from: b */
    public final DateTime f15263b;

    /* renamed from: c */
    public final DateTime f15264c;

    /* renamed from: d */
    public final String f15265d;

    /* renamed from: e */
    public final String f15266e;

    /* renamed from: f */
    public final boolean f15267f;

    /* renamed from: g */
    public final String f15268g;

    /* renamed from: h */
    public final int f15269h;

    /* renamed from: i */
    public final int f15270i;

    /* renamed from: j */
    public final int f15271j;

    public II1(String eventId, DateTime eventTime, DateTime clientTime, String resolution, String str, boolean z, String currency, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(resolution, "resolution");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f15262a = eventId;
        this.f15263b = eventTime;
        this.f15264c = clientTime;
        this.f15265d = resolution;
        this.f15266e = str;
        this.f15267f = z;
        this.f15268g = currency;
        this.f15269h = i;
        this.f15270i = i2;
        this.f15271j = i3;
    }

    /* renamed from: a */
    public final II1 m102555a(String eventId, DateTime eventTime, DateTime clientTime, String resolution, String str, boolean z, String currency, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(resolution, "resolution");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new II1(eventId, eventTime, clientTime, resolution, str, z, currency, i, i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof II1) {
            II1 ii1 = (II1) obj;
            return Intrinsics.areEqual(this.f15262a, ii1.f15262a) && Intrinsics.areEqual(this.f15263b, ii1.f15263b) && Intrinsics.areEqual(this.f15264c, ii1.f15264c) && Intrinsics.areEqual(this.f15265d, ii1.f15265d) && Intrinsics.areEqual(this.f15266e, ii1.f15266e) && this.f15267f == ii1.f15267f && Intrinsics.areEqual(this.f15268g, ii1.f15268g) && this.f15269h == ii1.f15269h && this.f15270i == ii1.f15270i && this.f15271j == ii1.f15271j;
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.HelmetLeaseOfferScreenResolved";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f15262a), TuplesKt.m28425to("event_time", this.f15263b), TuplesKt.m28425to("client_time", this.f15264c), TuplesKt.m28425to("resolution", this.f15265d), TuplesKt.m28425to("bird_id", this.f15266e), TuplesKt.m28425to("helmet_required", Boolean.valueOf(this.f15267f)), TuplesKt.m28425to("currency", this.f15268g), TuplesKt.m28425to("initial_charge_amount", Integer.valueOf(this.f15269h)), TuplesKt.m28425to("return_refund_amount", Integer.valueOf(this.f15270i)), TuplesKt.m28425to("delinquent_fee_amount", Integer.valueOf(this.f15271j)));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.f15262a.hashCode() * 31) + this.f15263b.hashCode()) * 31) + this.f15264c.hashCode()) * 31) + this.f15265d.hashCode()) * 31;
        String str = this.f15266e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.f15267f;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((((((hashCode2 + i) * 31) + this.f15268g.hashCode()) * 31) + Integer.hashCode(this.f15269h)) * 31) + Integer.hashCode(this.f15270i)) * 31) + Integer.hashCode(this.f15271j);
    }

    public String toString() {
        String str = this.f15262a;
        DateTime dateTime = this.f15263b;
        DateTime dateTime2 = this.f15264c;
        String str2 = this.f15265d;
        String str3 = this.f15266e;
        boolean z = this.f15267f;
        String str4 = this.f15268g;
        int i = this.f15269h;
        int i2 = this.f15270i;
        int i3 = this.f15271j;
        return "HelmetLeaseOfferScreenResolved(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", resolution=" + str2 + ", birdId=" + str3 + ", helmetRequired=" + z + ", currency=" + str4 + ", initialChargeAmount=" + i + ", returnRefundAmount=" + i2 + ", delinquentFeeAmount=" + i3 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ II1(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, boolean z, String str4, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, str2, (i4 & 16) != 0 ? null : str3, z, str4, i, i2, i3);
        String str5;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i4 & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str5 = uuid;
        } else {
            str5 = str;
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
