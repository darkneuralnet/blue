package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.analytics.AnalyticsEvent;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b0\u00101JO\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u0015\u001a\u0004\b)\u0010\u0017R\"\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00110*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0017¨\u00062"}, m28432d2 = {"LZX;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "", "intervalMs", "mainThreadMs", "", "mainThreadTimeRatio", Stripe3ds2AuthParams.FIELD_SOURCE, C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "J", "getIntervalMs", "()J", "e", "getMainThreadMs", "f", "D", "getMainThreadTimeRatio", "()D", "g", "getSource", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;JJDLjava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ZX */
/* loaded from: classes4.dex */
public final class C10286ZX implements AnalyticsEvent {

    /* renamed from: a */
    public final String f48706a;

    /* renamed from: b */
    public final DateTime f48707b;

    /* renamed from: c */
    public final DateTime f48708c;

    /* renamed from: d */
    public final long f48709d;

    /* renamed from: e */
    public final long f48710e;

    /* renamed from: f */
    public final double f48711f;

    /* renamed from: g */
    public final String f48712g;

    public C10286ZX(String eventId, DateTime eventTime, DateTime clientTime, long j, long j2, double d, String source) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f48706a = eventId;
        this.f48707b = eventTime;
        this.f48708c = clientTime;
        this.f48709d = j;
        this.f48710e = j2;
        this.f48711f = d;
        this.f48712g = source;
    }

    /* renamed from: a */
    public final C10286ZX m72988a(String eventId, DateTime eventTime, DateTime clientTime, long j, long j2, double d, String source) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(source, "source");
        return new C10286ZX(eventId, eventTime, clientTime, j, j2, d, source);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10286ZX) {
            C10286ZX c10286zx = (C10286ZX) obj;
            return Intrinsics.areEqual(this.f48706a, c10286zx.f48706a) && Intrinsics.areEqual(this.f48707b, c10286zx.f48707b) && Intrinsics.areEqual(this.f48708c, c10286zx.f48708c) && this.f48709d == c10286zx.f48709d && this.f48710e == c10286zx.f48710e && Double.compare(this.f48711f, c10286zx.f48711f) == 0 && Intrinsics.areEqual(this.f48712g, c10286zx.f48712g);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.BluetoothScanTimeOnMainThread";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f48706a), TuplesKt.m28425to("event_time", this.f48707b), TuplesKt.m28425to("client_time", this.f48708c), TuplesKt.m28425to("interval_ms", Long.valueOf(this.f48709d)), TuplesKt.m28425to("main_thread_ms", Long.valueOf(this.f48710e)), TuplesKt.m28425to("main_thread_time_ratio", Double.valueOf(this.f48711f)), TuplesKt.m28425to(Stripe3ds2AuthParams.FIELD_SOURCE, this.f48712g));
        return mapOf;
    }

    public int hashCode() {
        return (((((((((((this.f48706a.hashCode() * 31) + this.f48707b.hashCode()) * 31) + this.f48708c.hashCode()) * 31) + Long.hashCode(this.f48709d)) * 31) + Long.hashCode(this.f48710e)) * 31) + Double.hashCode(this.f48711f)) * 31) + this.f48712g.hashCode();
    }

    public String toString() {
        String str = this.f48706a;
        DateTime dateTime = this.f48707b;
        DateTime dateTime2 = this.f48708c;
        long j = this.f48709d;
        long j2 = this.f48710e;
        double d = this.f48711f;
        String str2 = this.f48712g;
        return "BluetoothScanTimeOnMainThread(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", intervalMs=" + j + ", mainThreadMs=" + j2 + ", mainThreadTimeRatio=" + d + ", source=" + str2 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C10286ZX(String str, DateTime dateTime, DateTime dateTime2, long j, long j2, double d, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, j, j2, d, str2);
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
