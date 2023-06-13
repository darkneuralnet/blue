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
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0019\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b2\u00103JX\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\nHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\"\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00120,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u0017¨\u00064"}, m28432d2 = {"Lk21;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "deviceCheckMethod", "", "successful", "", "httpStatusCode", "", "operationTime", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZLjava/lang/Integer;D)Lk21;", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getDeviceCheckMethod", "e", "Z", "getSuccessful", "()Z", "f", "Ljava/lang/Integer;", "getHttpStatusCode", "()Ljava/lang/Integer;", "g", "D", "getOperationTime", "()D", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZLjava/lang/Integer;D)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: k21  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43665k21 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f93799a;

    /* renamed from: b */
    public final DateTime f93800b;

    /* renamed from: c */
    public final DateTime f93801c;

    /* renamed from: d */
    public final String f93802d;

    /* renamed from: e */
    public final boolean f93803e;

    /* renamed from: f */
    public final Integer f93804f;

    /* renamed from: g */
    public final double f93805g;

    public C43665k21(String eventId, DateTime eventTime, DateTime clientTime, String deviceCheckMethod, boolean z, Integer num, double d) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(deviceCheckMethod, "deviceCheckMethod");
        this.f93799a = eventId;
        this.f93800b = eventTime;
        this.f93801c = clientTime;
        this.f93802d = deviceCheckMethod;
        this.f93803e = z;
        this.f93804f = num;
        this.f93805g = d;
    }

    /* renamed from: a */
    public final C43665k21 m29415a(String eventId, DateTime eventTime, DateTime clientTime, String deviceCheckMethod, boolean z, Integer num, double d) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(deviceCheckMethod, "deviceCheckMethod");
        return new C43665k21(eventId, eventTime, clientTime, deviceCheckMethod, z, num, d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C43665k21) {
            C43665k21 c43665k21 = (C43665k21) obj;
            return Intrinsics.areEqual(this.f93799a, c43665k21.f93799a) && Intrinsics.areEqual(this.f93800b, c43665k21.f93800b) && Intrinsics.areEqual(this.f93801c, c43665k21.f93801c) && Intrinsics.areEqual(this.f93802d, c43665k21.f93802d) && this.f93803e == c43665k21.f93803e && Intrinsics.areEqual(this.f93804f, c43665k21.f93804f) && Double.compare(this.f93805g, c43665k21.f93805g) == 0;
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.DeviceCheckConfirmed";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f93799a), TuplesKt.m28425to("event_time", this.f93800b), TuplesKt.m28425to("client_time", this.f93801c), TuplesKt.m28425to("device_check_method", this.f93802d), TuplesKt.m28425to("successful", Boolean.valueOf(this.f93803e)), TuplesKt.m28425to("http_status_code", this.f93804f), TuplesKt.m28425to("operation_time", Double.valueOf(this.f93805g)));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.f93799a.hashCode() * 31) + this.f93800b.hashCode()) * 31) + this.f93801c.hashCode()) * 31) + this.f93802d.hashCode()) * 31;
        boolean z = this.f93803e;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        Integer num = this.f93804f;
        return ((i2 + (num == null ? 0 : num.hashCode())) * 31) + Double.hashCode(this.f93805g);
    }

    public String toString() {
        String str = this.f93799a;
        DateTime dateTime = this.f93800b;
        DateTime dateTime2 = this.f93801c;
        String str2 = this.f93802d;
        boolean z = this.f93803e;
        Integer num = this.f93804f;
        double d = this.f93805g;
        return "DeviceCheckConfirmed(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", deviceCheckMethod=" + str2 + ", successful=" + z + ", httpStatusCode=" + num + ", operationTime=" + d + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C43665k21(String str, DateTime dateTime, DateTime dateTime2, String str2, boolean z, Integer num, double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, str2, z, (i & 32) != 0 ? null : num, d);
        String str3;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str3 = uuid;
        } else {
            str3 = str;
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
