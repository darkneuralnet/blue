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
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b)\u0010*JE\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\"\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000f0#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0014¨\u0006+"}, m28432d2 = {"Llv2;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "sessionId", "", "attempted", "abortedViaSkipButton", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getSessionId", "e", "Z", "getAttempted", "()Z", "f", "getAbortedViaSkipButton", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZZ)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: lv2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44783lv2 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f96952a;

    /* renamed from: b */
    public final DateTime f96953b;

    /* renamed from: c */
    public final DateTime f96954c;

    /* renamed from: d */
    public final String f96955d;

    /* renamed from: e */
    public final boolean f96956e;

    /* renamed from: f */
    public final boolean f96957f;

    public C44783lv2(String eventId, DateTime eventTime, DateTime clientTime, String sessionId, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f96952a = eventId;
        this.f96953b = eventTime;
        this.f96954c = clientTime;
        this.f96955d = sessionId;
        this.f96956e = z;
        this.f96957f = z2;
    }

    public static /* synthetic */ C44783lv2 copy$default(C44783lv2 c44783lv2, String str, DateTime dateTime, DateTime dateTime2, String str2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c44783lv2.f96952a;
        }
        if ((i & 2) != 0) {
            dateTime = c44783lv2.f96953b;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = c44783lv2.f96954c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 8) != 0) {
            str2 = c44783lv2.f96955d;
        }
        String str3 = str2;
        if ((i & 16) != 0) {
            z = c44783lv2.f96956e;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = c44783lv2.f96957f;
        }
        return c44783lv2.m26671a(str, dateTime3, dateTime4, str3, z3, z2);
    }

    /* renamed from: a */
    public final C44783lv2 m26671a(String eventId, DateTime eventTime, DateTime clientTime, String sessionId, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        return new C44783lv2(eventId, eventTime, clientTime, sessionId, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C44783lv2) {
            C44783lv2 c44783lv2 = (C44783lv2) obj;
            return Intrinsics.areEqual(this.f96952a, c44783lv2.f96952a) && Intrinsics.areEqual(this.f96953b, c44783lv2.f96953b) && Intrinsics.areEqual(this.f96954c, c44783lv2.f96954c) && Intrinsics.areEqual(this.f96955d, c44783lv2.f96955d) && this.f96956e == c44783lv2.f96956e && this.f96957f == c44783lv2.f96957f;
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.LocalSurveyScreenAborted";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f96952a), TuplesKt.m28425to("event_time", this.f96953b), TuplesKt.m28425to("client_time", this.f96954c), TuplesKt.m28425to(AnalyticsFields.SESSION_ID, this.f96955d), TuplesKt.m28425to("attempted", Boolean.valueOf(this.f96956e)), TuplesKt.m28425to("abortedViaSkipButton", Boolean.valueOf(this.f96957f)));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.f96952a.hashCode() * 31) + this.f96953b.hashCode()) * 31) + this.f96954c.hashCode()) * 31) + this.f96955d.hashCode()) * 31;
        boolean z = this.f96956e;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.f96957f;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        String str = this.f96952a;
        DateTime dateTime = this.f96953b;
        DateTime dateTime2 = this.f96954c;
        String str2 = this.f96955d;
        boolean z = this.f96956e;
        boolean z2 = this.f96957f;
        return "LocalSurveyScreenAborted(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", sessionId=" + str2 + ", attempted=" + z + ", abortedViaSkipButton=" + z2 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C44783lv2(String str, DateTime dateTime, DateTime dateTime2, String str2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r2, dateTime2, str2, z, z2);
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
