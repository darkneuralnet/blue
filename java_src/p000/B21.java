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
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b,\u0010-JN\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\"\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00100&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0015¨\u0006."}, m28432d2 = {"LB21;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "deviceCheckMethod", "", "successful", "", "httpStatusCode", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZLjava/lang/Integer;)LB21;", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getDeviceCheckMethod", "e", "Z", "getSuccessful", "()Z", "f", "Ljava/lang/Integer;", "getHttpStatusCode", "()Ljava/lang/Integer;", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZLjava/lang/Integer;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: B21 */
/* loaded from: classes4.dex */
public final class B21 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f1552a;

    /* renamed from: b */
    public final DateTime f1553b;

    /* renamed from: c */
    public final DateTime f1554c;

    /* renamed from: d */
    public final String f1555d;

    /* renamed from: e */
    public final boolean f1556e;

    /* renamed from: f */
    public final Integer f1557f;

    public B21(String eventId, DateTime eventTime, DateTime clientTime, String deviceCheckMethod, boolean z, Integer num) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(deviceCheckMethod, "deviceCheckMethod");
        this.f1552a = eventId;
        this.f1553b = eventTime;
        this.f1554c = clientTime;
        this.f1555d = deviceCheckMethod;
        this.f1556e = z;
        this.f1557f = num;
    }

    public static /* synthetic */ B21 copy$default(B21 b21, String str, DateTime dateTime, DateTime dateTime2, String str2, boolean z, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = b21.f1552a;
        }
        if ((i & 2) != 0) {
            dateTime = b21.f1553b;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = b21.f1554c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 8) != 0) {
            str2 = b21.f1555d;
        }
        String str3 = str2;
        if ((i & 16) != 0) {
            z = b21.f1556e;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            num = b21.f1557f;
        }
        return b21.m114778a(str, dateTime3, dateTime4, str3, z2, num);
    }

    /* renamed from: a */
    public final B21 m114778a(String eventId, DateTime eventTime, DateTime clientTime, String deviceCheckMethod, boolean z, Integer num) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(deviceCheckMethod, "deviceCheckMethod");
        return new B21(eventId, eventTime, clientTime, deviceCheckMethod, z, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof B21) {
            B21 b21 = (B21) obj;
            return Intrinsics.areEqual(this.f1552a, b21.f1552a) && Intrinsics.areEqual(this.f1553b, b21.f1553b) && Intrinsics.areEqual(this.f1554c, b21.f1554c) && Intrinsics.areEqual(this.f1555d, b21.f1555d) && this.f1556e == b21.f1556e && Intrinsics.areEqual(this.f1557f, b21.f1557f);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.DeviceCheckSent";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f1552a), TuplesKt.m28425to("event_time", this.f1553b), TuplesKt.m28425to("client_time", this.f1554c), TuplesKt.m28425to("device_check_method", this.f1555d), TuplesKt.m28425to("successful", Boolean.valueOf(this.f1556e)), TuplesKt.m28425to("http_status_code", this.f1557f));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.f1552a.hashCode() * 31) + this.f1553b.hashCode()) * 31) + this.f1554c.hashCode()) * 31) + this.f1555d.hashCode()) * 31;
        boolean z = this.f1556e;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        Integer num = this.f1557f;
        return i2 + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        String str = this.f1552a;
        DateTime dateTime = this.f1553b;
        DateTime dateTime2 = this.f1554c;
        String str2 = this.f1555d;
        boolean z = this.f1556e;
        Integer num = this.f1557f;
        return "DeviceCheckSent(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", deviceCheckMethod=" + str2 + ", successful=" + z + ", httpStatusCode=" + num + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ B21(String str, DateTime dateTime, DateTime dateTime2, String str2, boolean z, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r2, dateTime2, str2, z, (i & 32) != 0 ? null : num);
        if ((i & 1) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
        String str3 = str;
        if ((i & 2) != 0) {
            dateTime = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime, "now()");
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime2, "now()");
        }
    }
}
