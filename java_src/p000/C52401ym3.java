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
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b$\u0010%J1\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\r0\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0013¨\u0006&"}, m28432d2 = {"Lym3;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "Lxm3;", "bird", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "Lxm3;", "getBird", "()Lxm3;", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lxm3;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ym3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C52401ym3 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f120150a;

    /* renamed from: b */
    public final DateTime f120151b;

    /* renamed from: c */
    public final DateTime f120152c;

    /* renamed from: d */
    public final C51808xm3 f120153d;

    public C52401ym3(String eventId, DateTime eventTime, DateTime clientTime, C51808xm3 bird) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.f120150a = eventId;
        this.f120151b = eventTime;
        this.f120152c = clientTime;
        this.f120153d = bird;
    }

    public static /* synthetic */ C52401ym3 copy$default(C52401ym3 c52401ym3, String str, DateTime dateTime, DateTime dateTime2, C51808xm3 c51808xm3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c52401ym3.f120150a;
        }
        if ((i & 2) != 0) {
            dateTime = c52401ym3.f120151b;
        }
        if ((i & 4) != 0) {
            dateTime2 = c52401ym3.f120152c;
        }
        if ((i & 8) != 0) {
            c51808xm3 = c52401ym3.f120153d;
        }
        return c52401ym3.m2624a(str, dateTime, dateTime2, c51808xm3);
    }

    /* renamed from: a */
    public final C52401ym3 m2624a(String eventId, DateTime eventTime, DateTime clientTime, C51808xm3 bird) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(bird, "bird");
        return new C52401ym3(eventId, eventTime, clientTime, bird);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C52401ym3) {
            C52401ym3 c52401ym3 = (C52401ym3) obj;
            return Intrinsics.areEqual(this.f120150a, c52401ym3.f120150a) && Intrinsics.areEqual(this.f120151b, c52401ym3.f120151b) && Intrinsics.areEqual(this.f120152c, c52401ym3.f120152c) && Intrinsics.areEqual(this.f120153d, c52401ym3.f120153d);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.OperatorMapBirdTapped";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f120150a), TuplesKt.m28425to("event_time", this.f120151b), TuplesKt.m28425to("client_time", this.f120152c), TuplesKt.m28425to("bird", this.f120153d.m4717b()));
        return mapOf;
    }

    public int hashCode() {
        return (((((this.f120150a.hashCode() * 31) + this.f120151b.hashCode()) * 31) + this.f120152c.hashCode()) * 31) + this.f120153d.hashCode();
    }

    public String toString() {
        String str = this.f120150a;
        DateTime dateTime = this.f120151b;
        DateTime dateTime2 = this.f120152c;
        C51808xm3 c51808xm3 = this.f120153d;
        return "OperatorMapBirdTapped(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", bird=" + c51808xm3 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C52401ym3(String str, DateTime dateTime, DateTime dateTime2, C51808xm3 c51808xm3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, dateTime, dateTime2, c51808xm3);
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
