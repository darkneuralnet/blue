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
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u001f\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b:\u0010;J{\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\rHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0013\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0017\u001a\u0004\b%\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u0017\u001a\u0004\b+\u0010\u0019R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/R\u0017\u0010\u0010\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u0010/R\"\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0014048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u00109\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u0019¨\u0006<"}, m28432d2 = {"LGI1;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "resolution", "birdId", "leaseId", "", "helmetRequired", "currency", "", "initialChargeAmount", "returnRefundAmount", "delinquentFeeAmount", C17296a.f69688o, "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getResolution", "e", "getBirdId", "f", "getLeaseId", "g", "Z", "getHelmetRequired", "()Z", "h", "getCurrency", "i", "I", "getInitialChargeAmount", "()I", "j", "getReturnRefundAmount", "k", "getDelinquentFeeAmount", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;III)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: GI1 */
/* loaded from: classes4.dex */
public final class GI1 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f11492a;

    /* renamed from: b */
    public final DateTime f11493b;

    /* renamed from: c */
    public final DateTime f11494c;

    /* renamed from: d */
    public final String f11495d;

    /* renamed from: e */
    public final String f11496e;

    /* renamed from: f */
    public final String f11497f;

    /* renamed from: g */
    public final boolean f11498g;

    /* renamed from: h */
    public final String f11499h;

    /* renamed from: i */
    public final int f11500i;

    /* renamed from: j */
    public final int f11501j;

    /* renamed from: k */
    public final int f11502k;

    public GI1(String eventId, DateTime eventTime, DateTime clientTime, String resolution, String str, String str2, boolean z, String currency, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(resolution, "resolution");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f11492a = eventId;
        this.f11493b = eventTime;
        this.f11494c = clientTime;
        this.f11495d = resolution;
        this.f11496e = str;
        this.f11497f = str2;
        this.f11498g = z;
        this.f11499h = currency;
        this.f11500i = i;
        this.f11501j = i2;
        this.f11502k = i3;
    }

    /* renamed from: a */
    public final GI1 m105526a(String eventId, DateTime eventTime, DateTime clientTime, String resolution, String str, String str2, boolean z, String currency, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(resolution, "resolution");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new GI1(eventId, eventTime, clientTime, resolution, str, str2, z, currency, i, i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GI1) {
            GI1 gi1 = (GI1) obj;
            return Intrinsics.areEqual(this.f11492a, gi1.f11492a) && Intrinsics.areEqual(this.f11493b, gi1.f11493b) && Intrinsics.areEqual(this.f11494c, gi1.f11494c) && Intrinsics.areEqual(this.f11495d, gi1.f11495d) && Intrinsics.areEqual(this.f11496e, gi1.f11496e) && Intrinsics.areEqual(this.f11497f, gi1.f11497f) && this.f11498g == gi1.f11498g && Intrinsics.areEqual(this.f11499h, gi1.f11499h) && this.f11500i == gi1.f11500i && this.f11501j == gi1.f11501j && this.f11502k == gi1.f11502k;
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.HelmetLeaseConfirmUnlockScreenResolved";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f11492a), TuplesKt.m28425to("event_time", this.f11493b), TuplesKt.m28425to("client_time", this.f11494c), TuplesKt.m28425to("resolution", this.f11495d), TuplesKt.m28425to("bird_id", this.f11496e), TuplesKt.m28425to("lease_id", this.f11497f), TuplesKt.m28425to("helmet_required", Boolean.valueOf(this.f11498g)), TuplesKt.m28425to("currency", this.f11499h), TuplesKt.m28425to("initial_charge_amount", Integer.valueOf(this.f11500i)), TuplesKt.m28425to("return_refund_amount", Integer.valueOf(this.f11501j)), TuplesKt.m28425to("delinquent_fee_amount", Integer.valueOf(this.f11502k)));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.f11492a.hashCode() * 31) + this.f11493b.hashCode()) * 31) + this.f11494c.hashCode()) * 31) + this.f11495d.hashCode()) * 31;
        String str = this.f11496e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f11497f;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.f11498g;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((((((hashCode3 + i) * 31) + this.f11499h.hashCode()) * 31) + Integer.hashCode(this.f11500i)) * 31) + Integer.hashCode(this.f11501j)) * 31) + Integer.hashCode(this.f11502k);
    }

    public String toString() {
        String str = this.f11492a;
        DateTime dateTime = this.f11493b;
        DateTime dateTime2 = this.f11494c;
        String str2 = this.f11495d;
        String str3 = this.f11496e;
        String str4 = this.f11497f;
        boolean z = this.f11498g;
        String str5 = this.f11499h;
        int i = this.f11500i;
        int i2 = this.f11501j;
        int i3 = this.f11502k;
        return "HelmetLeaseConfirmUnlockScreenResolved(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", resolution=" + str2 + ", birdId=" + str3 + ", leaseId=" + str4 + ", helmetRequired=" + z + ", currency=" + str5 + ", initialChargeAmount=" + i + ", returnRefundAmount=" + i2 + ", delinquentFeeAmount=" + i3 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ GI1(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, boolean z, String str5, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, str2, (i4 & 16) != 0 ? null : str3, (i4 & 32) != 0 ? null : str4, z, str5, i, i2, i3);
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
