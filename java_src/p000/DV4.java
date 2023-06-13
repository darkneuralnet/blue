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
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b)\u0010*JE\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\bHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0012\u001a\u0004\b\"\u0010\u0014R\"\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000e0#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0014¨\u0006+"}, m28432d2 = {"LDV4;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "linkCode", "", "errorCode", "errorMessage", C17296a.f69688o, "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getLinkCode", "e", "I", "getErrorCode", "()I", "f", "getErrorMessage", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ILjava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: DV4 */
/* loaded from: classes4.dex */
public final class DV4 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f5785a;

    /* renamed from: b */
    public final DateTime f5786b;

    /* renamed from: c */
    public final DateTime f5787c;

    /* renamed from: d */
    public final String f5788d;

    /* renamed from: e */
    public final int f5789e;

    /* renamed from: f */
    public final String f5790f;

    public DV4(String eventId, DateTime eventTime, DateTime clientTime, String linkCode, int i, String errorMessage) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(linkCode, "linkCode");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.f5785a = eventId;
        this.f5786b = eventTime;
        this.f5787c = clientTime;
        this.f5788d = linkCode;
        this.f5789e = i;
        this.f5790f = errorMessage;
    }

    public static /* synthetic */ DV4 copy$default(DV4 dv4, String str, DateTime dateTime, DateTime dateTime2, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dv4.f5785a;
        }
        if ((i2 & 2) != 0) {
            dateTime = dv4.f5786b;
        }
        DateTime dateTime3 = dateTime;
        if ((i2 & 4) != 0) {
            dateTime2 = dv4.f5787c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i2 & 8) != 0) {
            str2 = dv4.f5788d;
        }
        String str4 = str2;
        if ((i2 & 16) != 0) {
            i = dv4.f5789e;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            str3 = dv4.f5790f;
        }
        return dv4.m110350a(str, dateTime3, dateTime4, str4, i3, str3);
    }

    /* renamed from: a */
    public final DV4 m110350a(String eventId, DateTime eventTime, DateTime clientTime, String linkCode, int i, String errorMessage) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(linkCode, "linkCode");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        return new DV4(eventId, eventTime, clientTime, linkCode, i, errorMessage);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DV4) {
            DV4 dv4 = (DV4) obj;
            return Intrinsics.areEqual(this.f5785a, dv4.f5785a) && Intrinsics.areEqual(this.f5786b, dv4.f5786b) && Intrinsics.areEqual(this.f5787c, dv4.f5787c) && Intrinsics.areEqual(this.f5788d, dv4.f5788d) && this.f5789e == dv4.f5789e && Intrinsics.areEqual(this.f5790f, dv4.f5790f);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.RidePassPurchaseFailed";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f5785a), TuplesKt.m28425to("event_time", this.f5786b), TuplesKt.m28425to("client_time", this.f5787c), TuplesKt.m28425to("link_code", this.f5788d), TuplesKt.m28425to("error_code", Integer.valueOf(this.f5789e)), TuplesKt.m28425to("error_message", this.f5790f));
        return mapOf;
    }

    public int hashCode() {
        return (((((((((this.f5785a.hashCode() * 31) + this.f5786b.hashCode()) * 31) + this.f5787c.hashCode()) * 31) + this.f5788d.hashCode()) * 31) + Integer.hashCode(this.f5789e)) * 31) + this.f5790f.hashCode();
    }

    public String toString() {
        String str = this.f5785a;
        DateTime dateTime = this.f5786b;
        DateTime dateTime2 = this.f5787c;
        String str2 = this.f5788d;
        int i = this.f5789e;
        String str3 = this.f5790f;
        return "RidePassPurchaseFailed(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", linkCode=" + str2 + ", errorCode=" + i + ", errorMessage=" + str3 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ DV4(String str, DateTime dateTime, DateTime dateTime2, String str2, int i, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r2, dateTime2, str2, i, str3);
        if ((i2 & 1) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
        String str4 = str;
        if ((i2 & 2) != 0) {
            dateTime = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime, "now()");
        }
        DateTime dateTime3 = dateTime;
        if ((i2 & 4) != 0) {
            dateTime2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime2, "now()");
        }
    }
}
