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
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b#\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r¢\u0006\u0004\bA\u0010BJ\u009e\u0001\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0015\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0016\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001a\u001a\u0004\b(\u0010\u001cR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001a\u001a\u0004\b*\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u001a\u001a\u0004\b,\u0010\u001cR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u001a\u001a\u0004\b.\u0010\u001cR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b7\u0010\u001a\u001a\u0004\b8\u0010\u001cR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b9\u00100\u001a\u0004\b:\u00102R\"\u0010>\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00170;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010\u001c¨\u0006C"}, m28432d2 = {"LaE5;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "birdId", "birdModel", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "sessionId", "mode", "method", "bulkAttemptId", "", "numberInBulk", "", "success", "bleExceptionType", "firmwareVersion", C17296a.f69688o, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/Integer;)LaE5;", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "getBirdId", "c", "getBirdModel", DateTokenConverter.CONVERTER_KEY, "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "e", "getClientTime", "f", "getSessionId", "g", "getMode", "h", "getMethod", "i", "getBulkAttemptId", "j", "Ljava/lang/Integer;", "getNumberInBulk", "()Ljava/lang/Integer;", "k", "Z", "getSuccess", "()Z", "l", "getBleExceptionType", "m", "getFirmwareVersion", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/Integer;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: aE5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C37838aE5 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f50144a;

    /* renamed from: b */
    public final String f50145b;

    /* renamed from: c */
    public final String f50146c;

    /* renamed from: d */
    public final DateTime f50147d;

    /* renamed from: e */
    public final DateTime f50148e;

    /* renamed from: f */
    public final String f50149f;

    /* renamed from: g */
    public final String f50150g;

    /* renamed from: h */
    public final String f50151h;

    /* renamed from: i */
    public final String f50152i;

    /* renamed from: j */
    public final Integer f50153j;

    /* renamed from: k */
    public final boolean f50154k;

    /* renamed from: l */
    public final String f50155l;

    /* renamed from: m */
    public final Integer f50156m;

    public C37838aE5(String eventId, String str, String str2, DateTime eventTime, DateTime clientTime, String sessionId, String mode, String method, String str3, Integer num, boolean z, String str4, Integer num2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(method, "method");
        this.f50144a = eventId;
        this.f50145b = str;
        this.f50146c = str2;
        this.f50147d = eventTime;
        this.f50148e = clientTime;
        this.f50149f = sessionId;
        this.f50150g = mode;
        this.f50151h = method;
        this.f50152i = str3;
        this.f50153j = num;
        this.f50154k = z;
        this.f50155l = str4;
        this.f50156m = num2;
    }

    /* renamed from: a */
    public final C37838aE5 m71742a(String eventId, String str, String str2, DateTime eventTime, DateTime clientTime, String sessionId, String mode, String method, String str3, Integer num, boolean z, String str4, Integer num2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(method, "method");
        return new C37838aE5(eventId, str, str2, eventTime, clientTime, sessionId, mode, method, str3, num, z, str4, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C37838aE5) {
            C37838aE5 c37838aE5 = (C37838aE5) obj;
            return Intrinsics.areEqual(this.f50144a, c37838aE5.f50144a) && Intrinsics.areEqual(this.f50145b, c37838aE5.f50145b) && Intrinsics.areEqual(this.f50146c, c37838aE5.f50146c) && Intrinsics.areEqual(this.f50147d, c37838aE5.f50147d) && Intrinsics.areEqual(this.f50148e, c37838aE5.f50148e) && Intrinsics.areEqual(this.f50149f, c37838aE5.f50149f) && Intrinsics.areEqual(this.f50150g, c37838aE5.f50150g) && Intrinsics.areEqual(this.f50151h, c37838aE5.f50151h) && Intrinsics.areEqual(this.f50152i, c37838aE5.f50152i) && Intrinsics.areEqual(this.f50153j, c37838aE5.f50153j) && this.f50154k == c37838aE5.f50154k && Intrinsics.areEqual(this.f50155l, c37838aE5.f50155l) && Intrinsics.areEqual(this.f50156m, c37838aE5.f50156m);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.SleepEnded";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f50144a), TuplesKt.m28425to("bird_id", this.f50145b), TuplesKt.m28425to("bird_model", this.f50146c), TuplesKt.m28425to("event_time", this.f50147d), TuplesKt.m28425to("client_time", this.f50148e), TuplesKt.m28425to(AnalyticsFields.SESSION_ID, this.f50149f), TuplesKt.m28425to("mode", this.f50150g), TuplesKt.m28425to("method", this.f50151h), TuplesKt.m28425to("bulk_attempt_id", this.f50152i), TuplesKt.m28425to("number_in_bulk", this.f50153j), TuplesKt.m28425to("success", Boolean.valueOf(this.f50154k)), TuplesKt.m28425to("ble_exception_type", this.f50155l), TuplesKt.m28425to("firmware_version", this.f50156m));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f50144a.hashCode() * 31;
        String str = this.f50145b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f50146c;
        int hashCode3 = (((((((((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f50147d.hashCode()) * 31) + this.f50148e.hashCode()) * 31) + this.f50149f.hashCode()) * 31) + this.f50150g.hashCode()) * 31) + this.f50151h.hashCode()) * 31;
        String str3 = this.f50152i;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f50153j;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z = this.f50154k;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode5 + i) * 31;
        String str4 = this.f50155l;
        int hashCode6 = (i2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.f50156m;
        return hashCode6 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f50144a;
        String str2 = this.f50145b;
        String str3 = this.f50146c;
        DateTime dateTime = this.f50147d;
        DateTime dateTime2 = this.f50148e;
        String str4 = this.f50149f;
        String str5 = this.f50150g;
        String str6 = this.f50151h;
        String str7 = this.f50152i;
        Integer num = this.f50153j;
        boolean z = this.f50154k;
        String str8 = this.f50155l;
        Integer num2 = this.f50156m;
        return "SleepEnded(eventId=" + str + ", birdId=" + str2 + ", birdModel=" + str3 + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", sessionId=" + str4 + ", mode=" + str5 + ", method=" + str6 + ", bulkAttemptId=" + str7 + ", numberInBulk=" + num + ", success=" + z + ", bleExceptionType=" + str8 + ", firmwareVersion=" + num2 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C37838aE5(String str, String str2, String str3, DateTime dateTime, DateTime dateTime2, String str4, String str5, String str6, String str7, Integer num, boolean z, String str8, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, r7, r8, str4, str5, str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : num, z, (i & 2048) != 0 ? null : str8, (i & 4096) != 0 ? null : num2);
        String str9;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str9 = uuid;
        } else {
            str9 = str;
        }
        String str10 = (i & 2) != 0 ? null : str2;
        String str11 = (i & 4) != 0 ? null : str3;
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
