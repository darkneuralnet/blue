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
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b'\u0010(JI\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0012\u001a\u0004\b \u0010\u0014R\"\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000e0!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0014¨\u0006)"}, m28432d2 = {"LNj2;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "sessionId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "sku", "failureReason", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "getSessionId", "c", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", DateTokenConverter.CONVERTER_KEY, "getClientTime", "e", "getSku", "f", "getFailureReason", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Nj2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C34738Nj2 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f25027a;

    /* renamed from: b */
    public final String f25028b;

    /* renamed from: c */
    public final DateTime f25029c;

    /* renamed from: d */
    public final DateTime f25030d;

    /* renamed from: e */
    public final String f25031e;

    /* renamed from: f */
    public final String f25032f;

    public C34738Nj2(String eventId, String str, DateTime eventTime, DateTime clientTime, String str2, String failureReason) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(failureReason, "failureReason");
        this.f25027a = eventId;
        this.f25028b = str;
        this.f25029c = eventTime;
        this.f25030d = clientTime;
        this.f25031e = str2;
        this.f25032f = failureReason;
    }

    public static /* synthetic */ C34738Nj2 copy$default(C34738Nj2 c34738Nj2, String str, String str2, DateTime dateTime, DateTime dateTime2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c34738Nj2.f25027a;
        }
        if ((i & 2) != 0) {
            str2 = c34738Nj2.f25028b;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            dateTime = c34738Nj2.f25029c;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 8) != 0) {
            dateTime2 = c34738Nj2.f25030d;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 16) != 0) {
            str3 = c34738Nj2.f25031e;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            str4 = c34738Nj2.f25032f;
        }
        return c34738Nj2.m93538a(str, str5, dateTime3, dateTime4, str6, str4);
    }

    /* renamed from: a */
    public final C34738Nj2 m93538a(String eventId, String str, DateTime eventTime, DateTime clientTime, String str2, String failureReason) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(failureReason, "failureReason");
        return new C34738Nj2(eventId, str, eventTime, clientTime, str2, failureReason);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C34738Nj2) {
            C34738Nj2 c34738Nj2 = (C34738Nj2) obj;
            return Intrinsics.areEqual(this.f25027a, c34738Nj2.f25027a) && Intrinsics.areEqual(this.f25028b, c34738Nj2.f25028b) && Intrinsics.areEqual(this.f25029c, c34738Nj2.f25029c) && Intrinsics.areEqual(this.f25030d, c34738Nj2.f25030d) && Intrinsics.areEqual(this.f25031e, c34738Nj2.f25031e) && Intrinsics.areEqual(this.f25032f, c34738Nj2.f25032f);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.KanbanInventoryScanFailed";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f25027a), TuplesKt.m28425to(AnalyticsFields.SESSION_ID, this.f25028b), TuplesKt.m28425to("event_time", this.f25029c), TuplesKt.m28425to("client_time", this.f25030d), TuplesKt.m28425to("sku", this.f25031e), TuplesKt.m28425to("failure_reason", this.f25032f));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = this.f25027a.hashCode() * 31;
        String str = this.f25028b;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f25029c.hashCode()) * 31) + this.f25030d.hashCode()) * 31;
        String str2 = this.f25031e;
        return ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f25032f.hashCode();
    }

    public String toString() {
        String str = this.f25027a;
        String str2 = this.f25028b;
        DateTime dateTime = this.f25029c;
        DateTime dateTime2 = this.f25030d;
        String str3 = this.f25031e;
        String str4 = this.f25032f;
        return "KanbanInventoryScanFailed(eventId=" + str + ", sessionId=" + str2 + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", sku=" + str3 + ", failureReason=" + str4 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C34738Nj2(String str, String str2, DateTime dateTime, DateTime dateTime2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r2, r3, dateTime2, (i & 16) != 0 ? null : str3, str4);
        if ((i & 1) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
        String str5 = str;
        String str6 = (i & 2) != 0 ? null : str2;
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
