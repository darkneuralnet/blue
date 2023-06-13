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
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0017\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b.\u0010/JO\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\tHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\"\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00100(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0015¨\u00060"}, m28432d2 = {"Lk40;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "sessionId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "bulkAction", "", "numberInBulk", "", "success", C17296a.f69688o, "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "getSessionId", "c", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", DateTokenConverter.CONVERTER_KEY, "getClientTime", "e", "getBulkAction", "f", "I", "getNumberInBulk", "()I", "g", "Z", "getSuccess", "()Z", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;IZ)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: k40  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43684k40 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f93840a;

    /* renamed from: b */
    public final String f93841b;

    /* renamed from: c */
    public final DateTime f93842c;

    /* renamed from: d */
    public final DateTime f93843d;

    /* renamed from: e */
    public final String f93844e;

    /* renamed from: f */
    public final int f93845f;

    /* renamed from: g */
    public final boolean f93846g;

    public C43684k40(String eventId, String sessionId, DateTime eventTime, DateTime clientTime, String bulkAction, int i, boolean z) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(bulkAction, "bulkAction");
        this.f93840a = eventId;
        this.f93841b = sessionId;
        this.f93842c = eventTime;
        this.f93843d = clientTime;
        this.f93844e = bulkAction;
        this.f93845f = i;
        this.f93846g = z;
    }

    public static /* synthetic */ C43684k40 copy$default(C43684k40 c43684k40, String str, String str2, DateTime dateTime, DateTime dateTime2, String str3, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = c43684k40.f93840a;
        }
        if ((i2 & 2) != 0) {
            str2 = c43684k40.f93841b;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            dateTime = c43684k40.f93842c;
        }
        DateTime dateTime3 = dateTime;
        if ((i2 & 8) != 0) {
            dateTime2 = c43684k40.f93843d;
        }
        DateTime dateTime4 = dateTime2;
        if ((i2 & 16) != 0) {
            str3 = c43684k40.f93844e;
        }
        String str5 = str3;
        if ((i2 & 32) != 0) {
            i = c43684k40.f93845f;
        }
        int i3 = i;
        if ((i2 & 64) != 0) {
            z = c43684k40.f93846g;
        }
        return c43684k40.m29381a(str, str4, dateTime3, dateTime4, str5, i3, z);
    }

    /* renamed from: a */
    public final C43684k40 m29381a(String eventId, String sessionId, DateTime eventTime, DateTime clientTime, String bulkAction, int i, boolean z) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(bulkAction, "bulkAction");
        return new C43684k40(eventId, sessionId, eventTime, clientTime, bulkAction, i, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C43684k40) {
            C43684k40 c43684k40 = (C43684k40) obj;
            return Intrinsics.areEqual(this.f93840a, c43684k40.f93840a) && Intrinsics.areEqual(this.f93841b, c43684k40.f93841b) && Intrinsics.areEqual(this.f93842c, c43684k40.f93842c) && Intrinsics.areEqual(this.f93843d, c43684k40.f93843d) && Intrinsics.areEqual(this.f93844e, c43684k40.f93844e) && this.f93845f == c43684k40.f93845f && this.f93846g == c43684k40.f93846g;
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.BulkScannerActionCompleted";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f93840a), TuplesKt.m28425to(AnalyticsFields.SESSION_ID, this.f93841b), TuplesKt.m28425to("event_time", this.f93842c), TuplesKt.m28425to("client_time", this.f93843d), TuplesKt.m28425to("bulk_action", this.f93844e), TuplesKt.m28425to("number_in_bulk", Integer.valueOf(this.f93845f)), TuplesKt.m28425to("success", Boolean.valueOf(this.f93846g)));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((this.f93840a.hashCode() * 31) + this.f93841b.hashCode()) * 31) + this.f93842c.hashCode()) * 31) + this.f93843d.hashCode()) * 31) + this.f93844e.hashCode()) * 31) + Integer.hashCode(this.f93845f)) * 31;
        boolean z = this.f93846g;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.f93840a;
        String str2 = this.f93841b;
        DateTime dateTime = this.f93842c;
        DateTime dateTime2 = this.f93843d;
        String str3 = this.f93844e;
        int i = this.f93845f;
        boolean z = this.f93846g;
        return "BulkScannerActionCompleted(eventId=" + str + ", sessionId=" + str2 + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", bulkAction=" + str3 + ", numberInBulk=" + i + ", success=" + z + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C43684k40(String str, String str2, DateTime dateTime, DateTime dateTime2, String str3, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, str2, r5, r6, str3, i, z);
        String str4;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i2 & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str4 = uuid;
        } else {
            str4 = str;
        }
        if ((i2 & 4) != 0) {
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            dateTime3 = now;
        } else {
            dateTime3 = dateTime;
        }
        if ((i2 & 8) != 0) {
            DateTime now2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now2, "now()");
            dateTime4 = now2;
        } else {
            dateTime4 = dateTime2;
        }
    }
}
