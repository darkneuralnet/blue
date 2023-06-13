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
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b%\u0010&JF\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\b\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\t\u0010\u001dR\"\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0014¨\u0006'"}, m28432d2 = {"Lhm;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "", "isLaunch", "isFromPush", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lhm;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "e", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: hm */
/* loaded from: classes4.dex */
public final class C22720hm implements AnalyticsEvent {

    /* renamed from: a */
    public final String f85862a;

    /* renamed from: b */
    public final DateTime f85863b;

    /* renamed from: c */
    public final DateTime f85864c;

    /* renamed from: d */
    public final Boolean f85865d;

    /* renamed from: e */
    public final Boolean f85866e;

    public C22720hm() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ C22720hm copy$default(C22720hm c22720hm, String str, DateTime dateTime, DateTime dateTime2, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c22720hm.f85862a;
        }
        if ((i & 2) != 0) {
            dateTime = c22720hm.f85863b;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = c22720hm.f85864c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 8) != 0) {
            bool = c22720hm.f85865d;
        }
        Boolean bool3 = bool;
        if ((i & 16) != 0) {
            bool2 = c22720hm.f85866e;
        }
        return c22720hm.m35882a(str, dateTime3, dateTime4, bool3, bool2);
    }

    /* renamed from: a */
    public final C22720hm m35882a(String eventId, DateTime eventTime, DateTime clientTime, Boolean bool, Boolean bool2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        return new C22720hm(eventId, eventTime, clientTime, bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C22720hm) {
            C22720hm c22720hm = (C22720hm) obj;
            return Intrinsics.areEqual(this.f85862a, c22720hm.f85862a) && Intrinsics.areEqual(this.f85863b, c22720hm.f85863b) && Intrinsics.areEqual(this.f85864c, c22720hm.f85864c) && Intrinsics.areEqual(this.f85865d, c22720hm.f85865d) && Intrinsics.areEqual(this.f85866e, c22720hm.f85866e);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.ApplicationOpened";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f85862a), TuplesKt.m28425to("event_time", this.f85863b), TuplesKt.m28425to("client_time", this.f85864c), TuplesKt.m28425to("is_launch", this.f85865d), TuplesKt.m28425to("is_from_push", this.f85866e));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((this.f85862a.hashCode() * 31) + this.f85863b.hashCode()) * 31) + this.f85864c.hashCode()) * 31;
        Boolean bool = this.f85865d;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f85866e;
        return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f85862a;
        DateTime dateTime = this.f85863b;
        DateTime dateTime2 = this.f85864c;
        Boolean bool = this.f85865d;
        Boolean bool2 = this.f85866e;
        return "ApplicationOpened(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", isLaunch=" + bool + ", isFromPush=" + bool2 + ")";
    }

    public C22720hm(String eventId, DateTime eventTime, DateTime clientTime, Boolean bool, Boolean bool2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        this.f85862a = eventId;
        this.f85863b = eventTime;
        this.f85864c = clientTime;
        this.f85865d = bool;
        this.f85866e = bool2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C22720hm(String str, DateTime dateTime, DateTime dateTime2, Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r2, dateTime2, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2);
        if ((i & 1) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
        String str2 = str;
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
