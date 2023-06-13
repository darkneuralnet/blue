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
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b*\u0010+JO\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0013\u001a\u0004\b!\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010\u0015R\"\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000f0$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0015¨\u0006,"}, m28432d2 = {"Lqo3;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "notificationId", "actionKind", "category", "kind", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getNotificationId", "e", "getActionKind", "f", "getCategory", "g", "getKind", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: qo3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C47679qo3 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f105843a;

    /* renamed from: b */
    public final DateTime f105844b;

    /* renamed from: c */
    public final DateTime f105845c;

    /* renamed from: d */
    public final String f105846d;

    /* renamed from: e */
    public final String f105847e;

    /* renamed from: f */
    public final String f105848f;

    /* renamed from: g */
    public final String f105849g;

    public C47679qo3(String eventId, DateTime eventTime, DateTime clientTime, String notificationId, String actionKind, String category, String kind) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
        Intrinsics.checkNotNullParameter(actionKind, "actionKind");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.f105843a = eventId;
        this.f105844b = eventTime;
        this.f105845c = clientTime;
        this.f105846d = notificationId;
        this.f105847e = actionKind;
        this.f105848f = category;
        this.f105849g = kind;
    }

    public static /* synthetic */ C47679qo3 copy$default(C47679qo3 c47679qo3, String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c47679qo3.f105843a;
        }
        if ((i & 2) != 0) {
            dateTime = c47679qo3.f105844b;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = c47679qo3.f105845c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 8) != 0) {
            str2 = c47679qo3.f105846d;
        }
        String str6 = str2;
        if ((i & 16) != 0) {
            str3 = c47679qo3.f105847e;
        }
        String str7 = str3;
        if ((i & 32) != 0) {
            str4 = c47679qo3.f105848f;
        }
        String str8 = str4;
        if ((i & 64) != 0) {
            str5 = c47679qo3.f105849g;
        }
        return c47679qo3.m16965a(str, dateTime3, dateTime4, str6, str7, str8, str5);
    }

    /* renamed from: a */
    public final C47679qo3 m16965a(String eventId, DateTime eventTime, DateTime clientTime, String notificationId, String actionKind, String category, String kind) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
        Intrinsics.checkNotNullParameter(actionKind, "actionKind");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(kind, "kind");
        return new C47679qo3(eventId, eventTime, clientTime, notificationId, actionKind, category, kind);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C47679qo3) {
            C47679qo3 c47679qo3 = (C47679qo3) obj;
            return Intrinsics.areEqual(this.f105843a, c47679qo3.f105843a) && Intrinsics.areEqual(this.f105844b, c47679qo3.f105844b) && Intrinsics.areEqual(this.f105845c, c47679qo3.f105845c) && Intrinsics.areEqual(this.f105846d, c47679qo3.f105846d) && Intrinsics.areEqual(this.f105847e, c47679qo3.f105847e) && Intrinsics.areEqual(this.f105848f, c47679qo3.f105848f) && Intrinsics.areEqual(this.f105849g, c47679qo3.f105849g);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.OperatorNotificationActionTaken";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f105843a), TuplesKt.m28425to("event_time", this.f105844b), TuplesKt.m28425to("client_time", this.f105845c), TuplesKt.m28425to("notification_id", this.f105846d), TuplesKt.m28425to("actionKind", this.f105847e), TuplesKt.m28425to("category", this.f105848f), TuplesKt.m28425to("kind", this.f105849g));
        return mapOf;
    }

    public int hashCode() {
        return (((((((((((this.f105843a.hashCode() * 31) + this.f105844b.hashCode()) * 31) + this.f105845c.hashCode()) * 31) + this.f105846d.hashCode()) * 31) + this.f105847e.hashCode()) * 31) + this.f105848f.hashCode()) * 31) + this.f105849g.hashCode();
    }

    public String toString() {
        String str = this.f105843a;
        DateTime dateTime = this.f105844b;
        DateTime dateTime2 = this.f105845c;
        String str2 = this.f105846d;
        String str3 = this.f105847e;
        String str4 = this.f105848f;
        String str5 = this.f105849g;
        return "OperatorNotificationActionTaken(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", notificationId=" + str2 + ", actionKind=" + str3 + ", category=" + str4 + ", kind=" + str5 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C47679qo3(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, str2, str3, str4, str5);
        String str6;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str6 = uuid;
        } else {
            str6 = str;
        }
        if ((i & 2) != 0) {
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            dateTime3 = now;
        } else {
            dateTime3 = dateTime;
        }
        if ((i & 4) != 0) {
            DateTime now2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now2, "now()");
            dateTime4 = now2;
        } else {
            dateTime4 = dateTime2;
        }
    }
}
