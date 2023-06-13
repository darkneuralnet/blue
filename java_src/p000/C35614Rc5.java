package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.analytics.AnalyticsEvent;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.AnalyticsFields;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.stripe.android.core.networking.RequestHeadersFactory;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b0\u00101Jk\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0015\u001a\u0004\b#\u0010\u0017R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0015\u001a\u0004\b%\u0010\u0017R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u0015\u001a\u0004\b'\u0010\u0017R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u0015\u001a\u0004\b)\u0010\u0017R\"\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00110*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0017¨\u00062"}, m28432d2 = {"LRc5;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "sessionId", "birdId", RequestHeadersFactory.MODEL, "previousRoute", "newRoute", "nestId", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getSessionId", "e", "getBirdId", "f", "getModel", "g", "getPreviousRoute", "h", "getNewRoute", "i", "getNestId", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Rc5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35614Rc5 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f32309a;

    /* renamed from: b */
    public final DateTime f32310b;

    /* renamed from: c */
    public final DateTime f32311c;

    /* renamed from: d */
    public final String f32312d;

    /* renamed from: e */
    public final String f32313e;

    /* renamed from: f */
    public final String f32314f;

    /* renamed from: g */
    public final String f32315g;

    /* renamed from: h */
    public final String f32316h;

    /* renamed from: i */
    public final String f32317i;

    public C35614Rc5(String eventId, DateTime eventTime, DateTime clientTime, String sessionId, String birdId, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        this.f32309a = eventId;
        this.f32310b = eventTime;
        this.f32311c = clientTime;
        this.f32312d = sessionId;
        this.f32313e = birdId;
        this.f32314f = str;
        this.f32315g = str2;
        this.f32316h = str3;
        this.f32317i = str4;
    }

    /* renamed from: a */
    public final C35614Rc5 m86550a(String eventId, DateTime eventTime, DateTime clientTime, String sessionId, String birdId, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        return new C35614Rc5(eventId, eventTime, clientTime, sessionId, birdId, str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C35614Rc5) {
            C35614Rc5 c35614Rc5 = (C35614Rc5) obj;
            return Intrinsics.areEqual(this.f32309a, c35614Rc5.f32309a) && Intrinsics.areEqual(this.f32310b, c35614Rc5.f32310b) && Intrinsics.areEqual(this.f32311c, c35614Rc5.f32311c) && Intrinsics.areEqual(this.f32312d, c35614Rc5.f32312d) && Intrinsics.areEqual(this.f32313e, c35614Rc5.f32313e) && Intrinsics.areEqual(this.f32314f, c35614Rc5.f32314f) && Intrinsics.areEqual(this.f32315g, c35614Rc5.f32315g) && Intrinsics.areEqual(this.f32316h, c35614Rc5.f32316h) && Intrinsics.areEqual(this.f32317i, c35614Rc5.f32317i);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.RoutingSubmitted";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f32309a), TuplesKt.m28425to("event_time", this.f32310b), TuplesKt.m28425to("client_time", this.f32311c), TuplesKt.m28425to(AnalyticsFields.SESSION_ID, this.f32312d), TuplesKt.m28425to("bird_id", this.f32313e), TuplesKt.m28425to(RequestHeadersFactory.MODEL, this.f32314f), TuplesKt.m28425to("previous_route", this.f32315g), TuplesKt.m28425to("new_route", this.f32316h), TuplesKt.m28425to("nest_id", this.f32317i));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f32309a.hashCode() * 31) + this.f32310b.hashCode()) * 31) + this.f32311c.hashCode()) * 31) + this.f32312d.hashCode()) * 31) + this.f32313e.hashCode()) * 31;
        String str = this.f32314f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f32315g;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f32316h;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f32317i;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.f32309a;
        DateTime dateTime = this.f32310b;
        DateTime dateTime2 = this.f32311c;
        String str2 = this.f32312d;
        String str3 = this.f32313e;
        String str4 = this.f32314f;
        String str5 = this.f32315g;
        String str6 = this.f32316h;
        String str7 = this.f32317i;
        return "RoutingSubmitted(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", sessionId=" + str2 + ", birdId=" + str3 + ", model=" + str4 + ", previousRoute=" + str5 + ", newRoute=" + str6 + ", nestId=" + str7 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C35614Rc5(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, str2, str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7);
        String str8;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str8 = uuid;
        } else {
            str8 = str;
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
