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
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%J=\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001d\u0010\u0013R\"\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\r0\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0013¨\u0006&"}, m28432d2 = {"LQj2;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "sessionId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "sku", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "getSessionId", "c", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", DateTokenConverter.CONVERTER_KEY, "getClientTime", "e", "getSku", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Qj2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35440Qj2 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f30796a;

    /* renamed from: b */
    public final String f30797b;

    /* renamed from: c */
    public final DateTime f30798c;

    /* renamed from: d */
    public final DateTime f30799d;

    /* renamed from: e */
    public final String f30800e;

    public C35440Qj2(String eventId, String str, DateTime eventTime, DateTime clientTime, String sku) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(sku, "sku");
        this.f30796a = eventId;
        this.f30797b = str;
        this.f30798c = eventTime;
        this.f30799d = clientTime;
        this.f30800e = sku;
    }

    public static /* synthetic */ C35440Qj2 copy$default(C35440Qj2 c35440Qj2, String str, String str2, DateTime dateTime, DateTime dateTime2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c35440Qj2.f30796a;
        }
        if ((i & 2) != 0) {
            str2 = c35440Qj2.f30797b;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            dateTime = c35440Qj2.f30798c;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 8) != 0) {
            dateTime2 = c35440Qj2.f30799d;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 16) != 0) {
            str3 = c35440Qj2.f30800e;
        }
        return c35440Qj2.m88142a(str, str4, dateTime3, dateTime4, str3);
    }

    /* renamed from: a */
    public final C35440Qj2 m88142a(String eventId, String str, DateTime eventTime, DateTime clientTime, String sku) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(sku, "sku");
        return new C35440Qj2(eventId, str, eventTime, clientTime, sku);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C35440Qj2) {
            C35440Qj2 c35440Qj2 = (C35440Qj2) obj;
            return Intrinsics.areEqual(this.f30796a, c35440Qj2.f30796a) && Intrinsics.areEqual(this.f30797b, c35440Qj2.f30797b) && Intrinsics.areEqual(this.f30798c, c35440Qj2.f30798c) && Intrinsics.areEqual(this.f30799d, c35440Qj2.f30799d) && Intrinsics.areEqual(this.f30800e, c35440Qj2.f30800e);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.KanbanInventoryViewed";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f30796a), TuplesKt.m28425to(AnalyticsFields.SESSION_ID, this.f30797b), TuplesKt.m28425to("event_time", this.f30798c), TuplesKt.m28425to("client_time", this.f30799d), TuplesKt.m28425to("sku", this.f30800e));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = this.f30796a.hashCode() * 31;
        String str = this.f30797b;
        return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f30798c.hashCode()) * 31) + this.f30799d.hashCode()) * 31) + this.f30800e.hashCode();
    }

    public String toString() {
        String str = this.f30796a;
        String str2 = this.f30797b;
        DateTime dateTime = this.f30798c;
        DateTime dateTime2 = this.f30799d;
        String str3 = this.f30800e;
        return "KanbanInventoryViewed(eventId=" + str + ", sessionId=" + str2 + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", sku=" + str3 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C35440Qj2(String str, String str2, DateTime dateTime, DateTime dateTime2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r2, r3, dateTime2, str3);
        if ((i & 1) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? null : str2;
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
