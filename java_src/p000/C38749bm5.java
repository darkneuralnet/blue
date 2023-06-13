package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.analytics.AnalyticsEvent;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b/\u00100J^\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\t\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u0015\u001a\u0004\b(\u0010\u0017R\"\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00120)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0017¨\u00061"}, m28432d2 = {"Lbm5;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "direction", "", "isInRegistration", "", "opticalBrightness", Stripe3ds2AuthParams.FIELD_SOURCE, C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/String;)Lbm5;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getDirection", "e", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "f", "Ljava/lang/Double;", "getOpticalBrightness", "()Ljava/lang/Double;", "g", "getSource", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: bm5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C38749bm5 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f58111a;

    /* renamed from: b */
    public final DateTime f58112b;

    /* renamed from: c */
    public final DateTime f58113c;

    /* renamed from: d */
    public final String f58114d;

    /* renamed from: e */
    public final Boolean f58115e;

    /* renamed from: f */
    public final Double f58116f;

    /* renamed from: g */
    public final String f58117g;

    public C38749bm5() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ C38749bm5 copy$default(C38749bm5 c38749bm5, String str, DateTime dateTime, DateTime dateTime2, String str2, Boolean bool, Double d, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c38749bm5.f58111a;
        }
        if ((i & 2) != 0) {
            dateTime = c38749bm5.f58112b;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = c38749bm5.f58113c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 8) != 0) {
            str2 = c38749bm5.f58114d;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            bool = c38749bm5.f58115e;
        }
        Boolean bool2 = bool;
        if ((i & 32) != 0) {
            d = c38749bm5.f58116f;
        }
        Double d2 = d;
        if ((i & 64) != 0) {
            str3 = c38749bm5.f58117g;
        }
        return c38749bm5.m64031a(str, dateTime3, dateTime4, str4, bool2, d2, str3);
    }

    /* renamed from: a */
    public final C38749bm5 m64031a(String eventId, DateTime eventTime, DateTime clientTime, String str, Boolean bool, Double d, String str2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        return new C38749bm5(eventId, eventTime, clientTime, str, bool, d, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C38749bm5) {
            C38749bm5 c38749bm5 = (C38749bm5) obj;
            return Intrinsics.areEqual(this.f58111a, c38749bm5.f58111a) && Intrinsics.areEqual(this.f58112b, c38749bm5.f58112b) && Intrinsics.areEqual(this.f58113c, c38749bm5.f58113c) && Intrinsics.areEqual(this.f58114d, c38749bm5.f58114d) && Intrinsics.areEqual(this.f58115e, c38749bm5.f58115e) && Intrinsics.areEqual((Object) this.f58116f, (Object) c38749bm5.f58116f) && Intrinsics.areEqual(this.f58117g, c38749bm5.f58117g);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.ScannerFlashlightToggled";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f58111a), TuplesKt.m28425to("event_time", this.f58112b), TuplesKt.m28425to("client_time", this.f58113c), TuplesKt.m28425to("direction", this.f58114d), TuplesKt.m28425to("is_in_registration", this.f58115e), TuplesKt.m28425to("optical_brightness", this.f58116f), TuplesKt.m28425to(Stripe3ds2AuthParams.FIELD_SOURCE, this.f58117g));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((this.f58111a.hashCode() * 31) + this.f58112b.hashCode()) * 31) + this.f58113c.hashCode()) * 31;
        String str = this.f58114d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f58115e;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Double d = this.f58116f;
        int hashCode4 = (hashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.f58117g;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f58111a;
        DateTime dateTime = this.f58112b;
        DateTime dateTime2 = this.f58113c;
        String str2 = this.f58114d;
        Boolean bool = this.f58115e;
        Double d = this.f58116f;
        String str3 = this.f58117g;
        return "ScannerFlashlightToggled(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", direction=" + str2 + ", isInRegistration=" + bool + ", opticalBrightness=" + d + ", source=" + str3 + ")";
    }

    public C38749bm5(String eventId, DateTime eventTime, DateTime clientTime, String str, Boolean bool, Double d, String str2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        this.f58111a = eventId;
        this.f58112b = eventTime;
        this.f58113c = clientTime;
        this.f58114d = str;
        this.f58115e = bool;
        this.f58116f = d;
        this.f58117g = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C38749bm5(String str, DateTime dateTime, DateTime dateTime2, String str2, Boolean bool, Double d, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r0, r1, r3, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : d, (i & 64) == 0 ? str3 : null);
        String str4;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            str4 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str4, "randomUUID().toString()");
        } else {
            str4 = str;
        }
        if ((i & 2) != 0) {
            dateTime3 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime3, "now()");
        } else {
            dateTime3 = dateTime;
        }
        if ((i & 4) != 0) {
            dateTime4 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime4, "now()");
        } else {
            dateTime4 = dateTime2;
        }
    }
}
