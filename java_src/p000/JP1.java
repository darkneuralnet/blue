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
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J1\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u001a\u0010\u0012R\"\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\f0\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0012¨\u0006#"}, m28432d2 = {"LJP1;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "scannerFlavor", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getScannerFlavor", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: JP1 */
/* loaded from: classes4.dex */
public final class JP1 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f17497a;

    /* renamed from: b */
    public final DateTime f17498b;

    /* renamed from: c */
    public final DateTime f17499c;

    /* renamed from: d */
    public final String f17500d;

    public JP1(String eventId, DateTime eventTime, DateTime clientTime, String scannerFlavor) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(scannerFlavor, "scannerFlavor");
        this.f17497a = eventId;
        this.f17498b = eventTime;
        this.f17499c = clientTime;
        this.f17500d = scannerFlavor;
    }

    public static /* synthetic */ JP1 copy$default(JP1 jp1, String str, DateTime dateTime, DateTime dateTime2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jp1.f17497a;
        }
        if ((i & 2) != 0) {
            dateTime = jp1.f17498b;
        }
        if ((i & 4) != 0) {
            dateTime2 = jp1.f17499c;
        }
        if ((i & 8) != 0) {
            str2 = jp1.f17500d;
        }
        return jp1.m100518a(str, dateTime, dateTime2, str2);
    }

    /* renamed from: a */
    public final JP1 m100518a(String eventId, DateTime eventTime, DateTime clientTime, String scannerFlavor) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(scannerFlavor, "scannerFlavor");
        return new JP1(eventId, eventTime, clientTime, scannerFlavor);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof JP1) {
            JP1 jp1 = (JP1) obj;
            return Intrinsics.areEqual(this.f17497a, jp1.f17497a) && Intrinsics.areEqual(this.f17498b, jp1.f17498b) && Intrinsics.areEqual(this.f17499c, jp1.f17499c) && Intrinsics.areEqual(this.f17500d, jp1.f17500d);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.IdCardScannerOpened";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f17497a), TuplesKt.m28425to("event_time", this.f17498b), TuplesKt.m28425to("client_time", this.f17499c), TuplesKt.m28425to("scanner_flavor", this.f17500d));
        return mapOf;
    }

    public int hashCode() {
        return (((((this.f17497a.hashCode() * 31) + this.f17498b.hashCode()) * 31) + this.f17499c.hashCode()) * 31) + this.f17500d.hashCode();
    }

    public String toString() {
        String str = this.f17497a;
        DateTime dateTime = this.f17498b;
        DateTime dateTime2 = this.f17499c;
        String str2 = this.f17500d;
        return "IdCardScannerOpened(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", scannerFlavor=" + str2 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ JP1(String str, DateTime dateTime, DateTime dateTime2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, dateTime, dateTime2, str2);
        if ((i & 1) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
        if ((i & 2) != 0) {
            dateTime = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime, "now()");
        }
        if ((i & 4) != 0) {
            dateTime2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime2, "now()");
        }
    }
}
