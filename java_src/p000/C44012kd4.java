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
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b)\u0010*JE\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\bHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\"\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000e0#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0014¨\u0006+"}, m28432d2 = {"Lkd4;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "birdId", "", "timeout", "timeRemaining", C17296a.f69688o, "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getBirdId", "e", "I", "getTimeout", "()I", "f", "getTimeRemaining", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;II)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: kd4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44012kd4 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f94680a;

    /* renamed from: b */
    public final DateTime f94681b;

    /* renamed from: c */
    public final DateTime f94682c;

    /* renamed from: d */
    public final String f94683d;

    /* renamed from: e */
    public final int f94684e;

    /* renamed from: f */
    public final int f94685f;

    public C44012kd4(String eventId, DateTime eventTime, DateTime clientTime, String birdId, int i, int i2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        this.f94680a = eventId;
        this.f94681b = eventTime;
        this.f94682c = clientTime;
        this.f94683d = birdId;
        this.f94684e = i;
        this.f94685f = i2;
    }

    public static /* synthetic */ C44012kd4 copy$default(C44012kd4 c44012kd4, String str, DateTime dateTime, DateTime dateTime2, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = c44012kd4.f94680a;
        }
        if ((i3 & 2) != 0) {
            dateTime = c44012kd4.f94681b;
        }
        DateTime dateTime3 = dateTime;
        if ((i3 & 4) != 0) {
            dateTime2 = c44012kd4.f94682c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i3 & 8) != 0) {
            str2 = c44012kd4.f94683d;
        }
        String str3 = str2;
        if ((i3 & 16) != 0) {
            i = c44012kd4.f94684e;
        }
        int i4 = i;
        if ((i3 & 32) != 0) {
            i2 = c44012kd4.f94685f;
        }
        return c44012kd4.m28714a(str, dateTime3, dateTime4, str3, i4, i2);
    }

    /* renamed from: a */
    public final C44012kd4 m28714a(String eventId, DateTime eventTime, DateTime clientTime, String birdId, int i, int i2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        return new C44012kd4(eventId, eventTime, clientTime, birdId, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C44012kd4) {
            C44012kd4 c44012kd4 = (C44012kd4) obj;
            return Intrinsics.areEqual(this.f94680a, c44012kd4.f94680a) && Intrinsics.areEqual(this.f94681b, c44012kd4.f94681b) && Intrinsics.areEqual(this.f94682c, c44012kd4.f94682c) && Intrinsics.areEqual(this.f94683d, c44012kd4.f94683d) && this.f94684e == c44012kd4.f94684e && this.f94685f == c44012kd4.f94685f;
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.QuickCaptureCanceled";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f94680a), TuplesKt.m28425to("event_time", this.f94681b), TuplesKt.m28425to("client_time", this.f94682c), TuplesKt.m28425to("bird_id", this.f94683d), TuplesKt.m28425to("timeout", Integer.valueOf(this.f94684e)), TuplesKt.m28425to("time_remaining", Integer.valueOf(this.f94685f)));
        return mapOf;
    }

    public int hashCode() {
        return (((((((((this.f94680a.hashCode() * 31) + this.f94681b.hashCode()) * 31) + this.f94682c.hashCode()) * 31) + this.f94683d.hashCode()) * 31) + Integer.hashCode(this.f94684e)) * 31) + Integer.hashCode(this.f94685f);
    }

    public String toString() {
        String str = this.f94680a;
        DateTime dateTime = this.f94681b;
        DateTime dateTime2 = this.f94682c;
        String str2 = this.f94683d;
        int i = this.f94684e;
        int i2 = this.f94685f;
        return "QuickCaptureCanceled(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", birdId=" + str2 + ", timeout=" + i + ", timeRemaining=" + i2 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C44012kd4(String str, DateTime dateTime, DateTime dateTime2, String str2, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r2, dateTime2, str2, i, i2);
        if ((i3 & 1) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
        String str3 = str;
        if ((i3 & 2) != 0) {
            dateTime = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime, "now()");
        }
        DateTime dateTime3 = dateTime;
        if ((i3 & 4) != 0) {
            dateTime2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime2, "now()");
        }
    }
}
