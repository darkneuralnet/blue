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
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b.\u0010/J[\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\t\u0010!R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0014\u001a\u0004\b#\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0014\u001a\u0004\b%\u0010\u0016R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u0014\u001a\u0004\b'\u0010\u0016R\"\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00110(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0016¨\u00060"}, m28432d2 = {"Lcg6;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "birdId", "", "isPrivate", "ownershipKind", "actionKind", "tapSource", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getBirdId", "e", "Z", "()Z", "f", "getOwnershipKind", "g", "getActionKind", "h", "getTapSource", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: cg6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C39283cg6 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f61035a;

    /* renamed from: b */
    public final DateTime f61036b;

    /* renamed from: c */
    public final DateTime f61037c;

    /* renamed from: d */
    public final String f61038d;

    /* renamed from: e */
    public final boolean f61039e;

    /* renamed from: f */
    public final String f61040f;

    /* renamed from: g */
    public final String f61041g;

    /* renamed from: h */
    public final String f61042h;

    public C39283cg6(String eventId, DateTime eventTime, DateTime clientTime, String birdId, boolean z, String ownershipKind, String actionKind, String str) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(ownershipKind, "ownershipKind");
        Intrinsics.checkNotNullParameter(actionKind, "actionKind");
        this.f61035a = eventId;
        this.f61036b = eventTime;
        this.f61037c = clientTime;
        this.f61038d = birdId;
        this.f61039e = z;
        this.f61040f = ownershipKind;
        this.f61041g = actionKind;
        this.f61042h = str;
    }

    /* renamed from: a */
    public final C39283cg6 m61069a(String eventId, DateTime eventTime, DateTime clientTime, String birdId, boolean z, String ownershipKind, String actionKind, String str) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(ownershipKind, "ownershipKind");
        Intrinsics.checkNotNullParameter(actionKind, "actionKind");
        return new C39283cg6(eventId, eventTime, clientTime, birdId, z, ownershipKind, actionKind, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C39283cg6) {
            C39283cg6 c39283cg6 = (C39283cg6) obj;
            return Intrinsics.areEqual(this.f61035a, c39283cg6.f61035a) && Intrinsics.areEqual(this.f61036b, c39283cg6.f61036b) && Intrinsics.areEqual(this.f61037c, c39283cg6.f61037c) && Intrinsics.areEqual(this.f61038d, c39283cg6.f61038d) && this.f61039e == c39283cg6.f61039e && Intrinsics.areEqual(this.f61040f, c39283cg6.f61040f) && Intrinsics.areEqual(this.f61041g, c39283cg6.f61041g) && Intrinsics.areEqual(this.f61042h, c39283cg6.f61042h);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.UserActionTapped";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f61035a), TuplesKt.m28425to("event_time", this.f61036b), TuplesKt.m28425to("client_time", this.f61037c), TuplesKt.m28425to("bird_id", this.f61038d), TuplesKt.m28425to("is_private", Boolean.valueOf(this.f61039e)), TuplesKt.m28425to("ownership_kind", this.f61040f), TuplesKt.m28425to("action_kind", this.f61041g), TuplesKt.m28425to("tap_source", this.f61042h));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.f61035a.hashCode() * 31) + this.f61036b.hashCode()) * 31) + this.f61037c.hashCode()) * 31) + this.f61038d.hashCode()) * 31;
        boolean z = this.f61039e;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (((((hashCode + i) * 31) + this.f61040f.hashCode()) * 31) + this.f61041g.hashCode()) * 31;
        String str = this.f61042h;
        return hashCode2 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f61035a;
        DateTime dateTime = this.f61036b;
        DateTime dateTime2 = this.f61037c;
        String str2 = this.f61038d;
        boolean z = this.f61039e;
        String str3 = this.f61040f;
        String str4 = this.f61041g;
        String str5 = this.f61042h;
        return "UserActionTapped(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", birdId=" + str2 + ", isPrivate=" + z + ", ownershipKind=" + str3 + ", actionKind=" + str4 + ", tapSource=" + str5 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C39283cg6(String str, DateTime dateTime, DateTime dateTime2, String str2, boolean z, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, str2, z, str3, str4, (i & 128) != 0 ? null : str5);
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
