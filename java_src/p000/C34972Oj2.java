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
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b,\u0010-JQ\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\tHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\"\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000f0&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0015¨\u0006."}, m28432d2 = {"LOj2;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "sessionId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "sku", "", "updatedBinCount", "binCountDelta", C17296a.f69688o, "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "getSessionId", "c", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", DateTokenConverter.CONVERTER_KEY, "getClientTime", "e", "getSku", "f", "I", "getUpdatedBinCount", "()I", "g", "getBinCountDelta", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;II)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Oj2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C34972Oj2 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f27137a;

    /* renamed from: b */
    public final String f27138b;

    /* renamed from: c */
    public final DateTime f27139c;

    /* renamed from: d */
    public final DateTime f27140d;

    /* renamed from: e */
    public final String f27141e;

    /* renamed from: f */
    public final int f27142f;

    /* renamed from: g */
    public final int f27143g;

    public C34972Oj2(String eventId, String str, DateTime eventTime, DateTime clientTime, String sku, int i, int i2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(sku, "sku");
        this.f27137a = eventId;
        this.f27138b = str;
        this.f27139c = eventTime;
        this.f27140d = clientTime;
        this.f27141e = sku;
        this.f27142f = i;
        this.f27143g = i2;
    }

    public static /* synthetic */ C34972Oj2 copy$default(C34972Oj2 c34972Oj2, String str, String str2, DateTime dateTime, DateTime dateTime2, String str3, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = c34972Oj2.f27137a;
        }
        if ((i3 & 2) != 0) {
            str2 = c34972Oj2.f27138b;
        }
        String str4 = str2;
        if ((i3 & 4) != 0) {
            dateTime = c34972Oj2.f27139c;
        }
        DateTime dateTime3 = dateTime;
        if ((i3 & 8) != 0) {
            dateTime2 = c34972Oj2.f27140d;
        }
        DateTime dateTime4 = dateTime2;
        if ((i3 & 16) != 0) {
            str3 = c34972Oj2.f27141e;
        }
        String str5 = str3;
        if ((i3 & 32) != 0) {
            i = c34972Oj2.f27142f;
        }
        int i4 = i;
        if ((i3 & 64) != 0) {
            i2 = c34972Oj2.f27143g;
        }
        return c34972Oj2.m91609a(str, str4, dateTime3, dateTime4, str5, i4, i2);
    }

    /* renamed from: a */
    public final C34972Oj2 m91609a(String eventId, String str, DateTime eventTime, DateTime clientTime, String sku, int i, int i2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(sku, "sku");
        return new C34972Oj2(eventId, str, eventTime, clientTime, sku, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C34972Oj2) {
            C34972Oj2 c34972Oj2 = (C34972Oj2) obj;
            return Intrinsics.areEqual(this.f27137a, c34972Oj2.f27137a) && Intrinsics.areEqual(this.f27138b, c34972Oj2.f27138b) && Intrinsics.areEqual(this.f27139c, c34972Oj2.f27139c) && Intrinsics.areEqual(this.f27140d, c34972Oj2.f27140d) && Intrinsics.areEqual(this.f27141e, c34972Oj2.f27141e) && this.f27142f == c34972Oj2.f27142f && this.f27143g == c34972Oj2.f27143g;
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.KanbanInventoryUpdateFailed";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f27137a), TuplesKt.m28425to(AnalyticsFields.SESSION_ID, this.f27138b), TuplesKt.m28425to("event_time", this.f27139c), TuplesKt.m28425to("client_time", this.f27140d), TuplesKt.m28425to("sku", this.f27141e), TuplesKt.m28425to("updated_bin_count", Integer.valueOf(this.f27142f)), TuplesKt.m28425to("bin_count_delta", Integer.valueOf(this.f27143g)));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = this.f27137a.hashCode() * 31;
        String str = this.f27138b;
        return ((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f27139c.hashCode()) * 31) + this.f27140d.hashCode()) * 31) + this.f27141e.hashCode()) * 31) + Integer.hashCode(this.f27142f)) * 31) + Integer.hashCode(this.f27143g);
    }

    public String toString() {
        String str = this.f27137a;
        String str2 = this.f27138b;
        DateTime dateTime = this.f27139c;
        DateTime dateTime2 = this.f27140d;
        String str3 = this.f27141e;
        int i = this.f27142f;
        int i2 = this.f27143g;
        return "KanbanInventoryUpdateFailed(eventId=" + str + ", sessionId=" + str2 + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", sku=" + str3 + ", updatedBinCount=" + i + ", binCountDelta=" + i2 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C34972Oj2(String str, String str2, DateTime dateTime, DateTime dateTime2, String str3, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, r6, str3, i, i2);
        String str4;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i3 & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str4 = uuid;
        } else {
            str4 = str;
        }
        String str5 = (i3 & 2) != 0 ? null : str2;
        if ((i3 & 4) != 0) {
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            dateTime3 = now;
        } else {
            dateTime3 = dateTime;
        }
        if ((i3 & 8) != 0) {
            DateTime now2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now2, "now()");
            dateTime4 = now2;
        } else {
            dateTime4 = dateTime2;
        }
    }
}
