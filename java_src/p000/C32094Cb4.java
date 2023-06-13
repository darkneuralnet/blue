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
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b!\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b=\u0010>J\u0083\u0001\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0014\u001a\u00020\nHÖ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\"\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b/\u0010(\u001a\u0004\b0\u0010*R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b1\u0010(\u001a\u0004\b2\u0010*R\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b3\u0010(\u001a\u0004\b4\u0010*R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b5\u0010\u0018\u001a\u0004\b6\u0010\u001aR\"\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0015078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010<\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\u001a¨\u0006?"}, m28432d2 = {"LCb4;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "sessionId", "", "passed", "", "numProgrammaticChecks", "numProgrammaticChecksFailed", "numProgrammaticChecksPassed", "numManualChecks", "numManualChecksFailed", "numManualChecksPassed", "flow", C17296a.f69688o, "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getSessionId", "e", "Z", "getPassed", "()Z", "f", "I", "getNumProgrammaticChecks", "()I", "g", "getNumProgrammaticChecksFailed", "h", "getNumProgrammaticChecksPassed", "i", "getNumManualChecks", "j", "getNumManualChecksFailed", "k", "getNumManualChecksPassed", "l", "getFlow", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZIIIIIILjava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Cb4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C32094Cb4 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f4294a;

    /* renamed from: b */
    public final DateTime f4295b;

    /* renamed from: c */
    public final DateTime f4296c;

    /* renamed from: d */
    public final String f4297d;

    /* renamed from: e */
    public final boolean f4298e;

    /* renamed from: f */
    public final int f4299f;

    /* renamed from: g */
    public final int f4300g;

    /* renamed from: h */
    public final int f4301h;

    /* renamed from: i */
    public final int f4302i;

    /* renamed from: j */
    public final int f4303j;

    /* renamed from: k */
    public final int f4304k;

    /* renamed from: l */
    public final String f4305l;

    public C32094Cb4(String eventId, DateTime eventTime, DateTime clientTime, String sessionId, boolean z, int i, int i2, int i3, int i4, int i5, int i6, String str) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f4294a = eventId;
        this.f4295b = eventTime;
        this.f4296c = clientTime;
        this.f4297d = sessionId;
        this.f4298e = z;
        this.f4299f = i;
        this.f4300g = i2;
        this.f4301h = i3;
        this.f4302i = i4;
        this.f4303j = i5;
        this.f4304k = i6;
        this.f4305l = str;
    }

    /* renamed from: a */
    public final C32094Cb4 m112081a(String eventId, DateTime eventTime, DateTime clientTime, String sessionId, boolean z, int i, int i2, int i3, int i4, int i5, int i6, String str) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        return new C32094Cb4(eventId, eventTime, clientTime, sessionId, z, i, i2, i3, i4, i5, i6, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C32094Cb4) {
            C32094Cb4 c32094Cb4 = (C32094Cb4) obj;
            return Intrinsics.areEqual(this.f4294a, c32094Cb4.f4294a) && Intrinsics.areEqual(this.f4295b, c32094Cb4.f4295b) && Intrinsics.areEqual(this.f4296c, c32094Cb4.f4296c) && Intrinsics.areEqual(this.f4297d, c32094Cb4.f4297d) && this.f4298e == c32094Cb4.f4298e && this.f4299f == c32094Cb4.f4299f && this.f4300g == c32094Cb4.f4300g && this.f4301h == c32094Cb4.f4301h && this.f4302i == c32094Cb4.f4302i && this.f4303j == c32094Cb4.f4303j && this.f4304k == c32094Cb4.f4304k && Intrinsics.areEqual(this.f4305l, c32094Cb4.f4305l);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.QualityControlCompleted";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f4294a), TuplesKt.m28425to("event_time", this.f4295b), TuplesKt.m28425to("client_time", this.f4296c), TuplesKt.m28425to(AnalyticsFields.SESSION_ID, this.f4297d), TuplesKt.m28425to("passed", Boolean.valueOf(this.f4298e)), TuplesKt.m28425to("num_programmatic_checks", Integer.valueOf(this.f4299f)), TuplesKt.m28425to("num_programmatic_checks_failed", Integer.valueOf(this.f4300g)), TuplesKt.m28425to("num_programmatic_checks_passed", Integer.valueOf(this.f4301h)), TuplesKt.m28425to("num_manual_checks", Integer.valueOf(this.f4302i)), TuplesKt.m28425to("num_manual_checks_failed", Integer.valueOf(this.f4303j)), TuplesKt.m28425to("num_manual_checks_passed", Integer.valueOf(this.f4304k)), TuplesKt.m28425to("flow", this.f4305l));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.f4294a.hashCode() * 31) + this.f4295b.hashCode()) * 31) + this.f4296c.hashCode()) * 31) + this.f4297d.hashCode()) * 31;
        boolean z = this.f4298e;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (((((((((((((hashCode + i) * 31) + Integer.hashCode(this.f4299f)) * 31) + Integer.hashCode(this.f4300g)) * 31) + Integer.hashCode(this.f4301h)) * 31) + Integer.hashCode(this.f4302i)) * 31) + Integer.hashCode(this.f4303j)) * 31) + Integer.hashCode(this.f4304k)) * 31;
        String str = this.f4305l;
        return hashCode2 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f4294a;
        DateTime dateTime = this.f4295b;
        DateTime dateTime2 = this.f4296c;
        String str2 = this.f4297d;
        boolean z = this.f4298e;
        int i = this.f4299f;
        int i2 = this.f4300g;
        int i3 = this.f4301h;
        int i4 = this.f4302i;
        int i5 = this.f4303j;
        int i6 = this.f4304k;
        String str3 = this.f4305l;
        return "QualityControlCompleted(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", sessionId=" + str2 + ", passed=" + z + ", numProgrammaticChecks=" + i + ", numProgrammaticChecksFailed=" + i2 + ", numProgrammaticChecksPassed=" + i3 + ", numManualChecks=" + i4 + ", numManualChecksFailed=" + i5 + ", numManualChecksPassed=" + i6 + ", flow=" + str3 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C32094Cb4(String str, DateTime dateTime, DateTime dateTime2, String str2, boolean z, int i, int i2, int i3, int i4, int i5, int i6, String str3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, str2, z, i, i2, i3, i4, i5, i6, (i7 & 2048) != 0 ? null : str3);
        String str4;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i7 & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str4 = uuid;
        } else {
            str4 = str;
        }
        if ((i7 & 2) != 0) {
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            dateTime3 = now;
        } else {
            dateTime3 = dateTime;
        }
        if ((i7 & 4) != 0) {
            DateTime now2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now2, "now()");
            dateTime4 = now2;
        } else {
            dateTime4 = dateTime2;
        }
    }
}
