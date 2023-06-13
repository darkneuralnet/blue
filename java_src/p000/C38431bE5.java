package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.analytics.AnalyticsEvent;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.AnalyticsFields;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001By\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b0\u00101J\u0088\u0001\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0013\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010\u001aR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0018\u001a\u0004\b%\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0018\u001a\u0004\b$\u0010\u001aR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b#\u0010'\u001a\u0004\b&\u0010(R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b\"\u0010(R\"\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00140*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u001a¨\u00062"}, m28432d2 = {"LbE5;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "birdId", "birdModel", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "sessionId", "mode", "method", "bulkAttemptId", "", "numberInBulk", "firmwareVersion", C17296a.f69688o, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)LbE5;", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "b", "c", DateTokenConverter.CONVERTER_KEY, "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "getClientTime", "f", "j", "g", "h", "i", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "k", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: bE5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C38431bE5 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f57120a;

    /* renamed from: b */
    public final String f57121b;

    /* renamed from: c */
    public final String f57122c;

    /* renamed from: d */
    public final DateTime f57123d;

    /* renamed from: e */
    public final DateTime f57124e;

    /* renamed from: f */
    public final String f57125f;

    /* renamed from: g */
    public final String f57126g;

    /* renamed from: h */
    public final String f57127h;

    /* renamed from: i */
    public final String f57128i;

    /* renamed from: j */
    public final Integer f57129j;

    /* renamed from: k */
    public final Integer f57130k;

    public C38431bE5(String eventId, String str, String str2, DateTime eventTime, DateTime clientTime, String sessionId, String mode, String method, String str3, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(method, "method");
        this.f57120a = eventId;
        this.f57121b = str;
        this.f57122c = str2;
        this.f57123d = eventTime;
        this.f57124e = clientTime;
        this.f57125f = sessionId;
        this.f57126g = mode;
        this.f57127h = method;
        this.f57128i = str3;
        this.f57129j = num;
        this.f57130k = num2;
    }

    /* renamed from: a */
    public final C38431bE5 m64783a(String eventId, String str, String str2, DateTime eventTime, DateTime clientTime, String sessionId, String mode, String method, String str3, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(method, "method");
        return new C38431bE5(eventId, str, str2, eventTime, clientTime, sessionId, mode, method, str3, num, num2);
    }

    /* renamed from: b */
    public final String m64782b() {
        return this.f57121b;
    }

    /* renamed from: c */
    public final String m64781c() {
        return this.f57122c;
    }

    /* renamed from: d */
    public final String m64780d() {
        return this.f57128i;
    }

    /* renamed from: e */
    public final String m64779e() {
        return this.f57120a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C38431bE5) {
            C38431bE5 c38431bE5 = (C38431bE5) obj;
            return Intrinsics.areEqual(this.f57120a, c38431bE5.f57120a) && Intrinsics.areEqual(this.f57121b, c38431bE5.f57121b) && Intrinsics.areEqual(this.f57122c, c38431bE5.f57122c) && Intrinsics.areEqual(this.f57123d, c38431bE5.f57123d) && Intrinsics.areEqual(this.f57124e, c38431bE5.f57124e) && Intrinsics.areEqual(this.f57125f, c38431bE5.f57125f) && Intrinsics.areEqual(this.f57126g, c38431bE5.f57126g) && Intrinsics.areEqual(this.f57127h, c38431bE5.f57127h) && Intrinsics.areEqual(this.f57128i, c38431bE5.f57128i) && Intrinsics.areEqual(this.f57129j, c38431bE5.f57129j) && Intrinsics.areEqual(this.f57130k, c38431bE5.f57130k);
        }
        return false;
    }

    /* renamed from: f */
    public final Integer m64778f() {
        return this.f57130k;
    }

    /* renamed from: g */
    public final String m64777g() {
        return this.f57127h;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.SleepStarted";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f57120a), TuplesKt.m28425to("bird_id", this.f57121b), TuplesKt.m28425to("bird_model", this.f57122c), TuplesKt.m28425to("event_time", this.f57123d), TuplesKt.m28425to("client_time", this.f57124e), TuplesKt.m28425to(AnalyticsFields.SESSION_ID, this.f57125f), TuplesKt.m28425to("mode", this.f57126g), TuplesKt.m28425to("method", this.f57127h), TuplesKt.m28425to("bulk_attempt_id", this.f57128i), TuplesKt.m28425to("number_in_bulk", this.f57129j), TuplesKt.m28425to("firmware_version", this.f57130k));
        return mapOf;
    }

    /* renamed from: h */
    public final String m64776h() {
        return this.f57126g;
    }

    public int hashCode() {
        int hashCode = this.f57120a.hashCode() * 31;
        String str = this.f57121b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f57122c;
        int hashCode3 = (((((((((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f57123d.hashCode()) * 31) + this.f57124e.hashCode()) * 31) + this.f57125f.hashCode()) * 31) + this.f57126g.hashCode()) * 31) + this.f57127h.hashCode()) * 31;
        String str3 = this.f57128i;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f57129j;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f57130k;
        return hashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    /* renamed from: i */
    public final Integer m64775i() {
        return this.f57129j;
    }

    /* renamed from: j */
    public final String m64774j() {
        return this.f57125f;
    }

    public String toString() {
        String str = this.f57120a;
        String str2 = this.f57121b;
        String str3 = this.f57122c;
        DateTime dateTime = this.f57123d;
        DateTime dateTime2 = this.f57124e;
        String str4 = this.f57125f;
        String str5 = this.f57126g;
        String str6 = this.f57127h;
        String str7 = this.f57128i;
        Integer num = this.f57129j;
        Integer num2 = this.f57130k;
        return "SleepStarted(eventId=" + str + ", birdId=" + str2 + ", birdModel=" + str3 + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", sessionId=" + str4 + ", mode=" + str5 + ", method=" + str6 + ", bulkAttemptId=" + str7 + ", numberInBulk=" + num + ", firmwareVersion=" + num2 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C38431bE5(String str, String str2, String str3, DateTime dateTime, DateTime dateTime2, String str4, String str5, String str6, String str7, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, r7, r8, str4, str5, str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : num, (i & 1024) != 0 ? null : num2);
        String str8;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str8 = uuid;
        } else {
            str8 = str;
        }
        String str9 = (i & 2) != 0 ? null : str2;
        String str10 = (i & 4) != 0 ? null : str3;
        if ((i & 8) != 0) {
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            dateTime3 = now;
        } else {
            dateTime3 = dateTime;
        }
        if ((i & 16) != 0) {
            DateTime now2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now2, "now()");
            dateTime4 = now2;
        } else {
            dateTime4 = dateTime2;
        }
    }
}
