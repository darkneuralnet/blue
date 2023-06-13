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
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b)\u0010*JE\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\"\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000f0#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0014¨\u0006+"}, m28432d2 = {"Ltn0;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "birdId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "sessionId", "", "wasActionTaken", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "getBirdId", "c", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", DateTokenConverter.CONVERTER_KEY, "getClientTime", "e", "getSessionId", "f", "Z", "getWasActionTaken", "()Z", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Z)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: tn0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49444tn0 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f111003a;

    /* renamed from: b */
    public final String f111004b;

    /* renamed from: c */
    public final DateTime f111005c;

    /* renamed from: d */
    public final DateTime f111006d;

    /* renamed from: e */
    public final String f111007e;

    /* renamed from: f */
    public final boolean f111008f;

    public C49444tn0(String eventId, String birdId, DateTime eventTime, DateTime clientTime, String sessionId, boolean z) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f111003a = eventId;
        this.f111004b = birdId;
        this.f111005c = eventTime;
        this.f111006d = clientTime;
        this.f111007e = sessionId;
        this.f111008f = z;
    }

    public static /* synthetic */ C49444tn0 copy$default(C49444tn0 c49444tn0, String str, String str2, DateTime dateTime, DateTime dateTime2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c49444tn0.f111003a;
        }
        if ((i & 2) != 0) {
            str2 = c49444tn0.f111004b;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            dateTime = c49444tn0.f111005c;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 8) != 0) {
            dateTime2 = c49444tn0.f111006d;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 16) != 0) {
            str3 = c49444tn0.f111007e;
        }
        String str5 = str3;
        if ((i & 32) != 0) {
            z = c49444tn0.f111008f;
        }
        return c49444tn0.m11791a(str, str4, dateTime3, dateTime4, str5, z);
    }

    /* renamed from: a */
    public final C49444tn0 m11791a(String eventId, String birdId, DateTime eventTime, DateTime clientTime, String sessionId, boolean z) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        return new C49444tn0(eventId, birdId, eventTime, clientTime, sessionId, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C49444tn0) {
            C49444tn0 c49444tn0 = (C49444tn0) obj;
            return Intrinsics.areEqual(this.f111003a, c49444tn0.f111003a) && Intrinsics.areEqual(this.f111004b, c49444tn0.f111004b) && Intrinsics.areEqual(this.f111005c, c49444tn0.f111005c) && Intrinsics.areEqual(this.f111006d, c49444tn0.f111006d) && Intrinsics.areEqual(this.f111007e, c49444tn0.f111007e) && this.f111008f == c49444tn0.f111008f;
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.CommandCenterExited";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f111003a), TuplesKt.m28425to("bird_id", this.f111004b), TuplesKt.m28425to("event_time", this.f111005c), TuplesKt.m28425to("client_time", this.f111006d), TuplesKt.m28425to(AnalyticsFields.SESSION_ID, this.f111007e), TuplesKt.m28425to("was_action_taken", Boolean.valueOf(this.f111008f)));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((this.f111003a.hashCode() * 31) + this.f111004b.hashCode()) * 31) + this.f111005c.hashCode()) * 31) + this.f111006d.hashCode()) * 31) + this.f111007e.hashCode()) * 31;
        boolean z = this.f111008f;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.f111003a;
        String str2 = this.f111004b;
        DateTime dateTime = this.f111005c;
        DateTime dateTime2 = this.f111006d;
        String str3 = this.f111007e;
        boolean z = this.f111008f;
        return "CommandCenterExited(eventId=" + str + ", birdId=" + str2 + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", sessionId=" + str3 + ", wasActionTaken=" + z + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C49444tn0(String str, String str2, DateTime dateTime, DateTime dateTime2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, str2, r3, dateTime2, str3, z);
        if ((i & 1) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
        String str4 = str;
        if ((i & 4) != 0) {
            dateTime = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime, "now()");
        }
        DateTime dateTime3 = dateTime;
        if ((i & 8) != 0) {
            dateTime2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime2, "now()");
        }
    }
}
