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
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b,\u0010-JO\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0013\u001a\u0004\b%\u0010\u0015R\"\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00100&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0015¨\u0006."}, m28432d2 = {"Le06;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", Stripe3ds2AuthParams.FIELD_SOURCE, "", "showedSkipButton", "autosubmitNo", "promptShown", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getSource", "e", "Z", "getShowedSkipButton", "()Z", "f", "getAutosubmitNo", "g", "getPromptShown", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZZLjava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: e06  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C40092e06 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f77539a;

    /* renamed from: b */
    public final DateTime f77540b;

    /* renamed from: c */
    public final DateTime f77541c;

    /* renamed from: d */
    public final String f77542d;

    /* renamed from: e */
    public final boolean f77543e;

    /* renamed from: f */
    public final boolean f77544f;

    /* renamed from: g */
    public final String f77545g;

    public C40092e06(String eventId, DateTime eventTime, DateTime clientTime, String source, boolean z, boolean z2, String promptShown) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(promptShown, "promptShown");
        this.f77539a = eventId;
        this.f77540b = eventTime;
        this.f77541c = clientTime;
        this.f77542d = source;
        this.f77543e = z;
        this.f77544f = z2;
        this.f77545g = promptShown;
    }

    public static /* synthetic */ C40092e06 copy$default(C40092e06 c40092e06, String str, DateTime dateTime, DateTime dateTime2, String str2, boolean z, boolean z2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c40092e06.f77539a;
        }
        if ((i & 2) != 0) {
            dateTime = c40092e06.f77540b;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = c40092e06.f77541c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 8) != 0) {
            str2 = c40092e06.f77542d;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            z = c40092e06.f77543e;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = c40092e06.f77544f;
        }
        boolean z4 = z2;
        if ((i & 64) != 0) {
            str3 = c40092e06.f77545g;
        }
        return c40092e06.m43407a(str, dateTime3, dateTime4, str4, z3, z4, str3);
    }

    /* renamed from: a */
    public final C40092e06 m43407a(String eventId, DateTime eventTime, DateTime clientTime, String source, boolean z, boolean z2, String promptShown) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(promptShown, "promptShown");
        return new C40092e06(eventId, eventTime, clientTime, source, z, z2, promptShown);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C40092e06) {
            C40092e06 c40092e06 = (C40092e06) obj;
            return Intrinsics.areEqual(this.f77539a, c40092e06.f77539a) && Intrinsics.areEqual(this.f77540b, c40092e06.f77540b) && Intrinsics.areEqual(this.f77541c, c40092e06.f77541c) && Intrinsics.areEqual(this.f77542d, c40092e06.f77542d) && this.f77543e == c40092e06.f77543e && this.f77544f == c40092e06.f77544f && Intrinsics.areEqual(this.f77545g, c40092e06.f77545g);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.TaxInformationScreenViewed";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f77539a), TuplesKt.m28425to("event_time", this.f77540b), TuplesKt.m28425to("client_time", this.f77541c), TuplesKt.m28425to(Stripe3ds2AuthParams.FIELD_SOURCE, this.f77542d), TuplesKt.m28425to("showed_skip_button", Boolean.valueOf(this.f77543e)), TuplesKt.m28425to("autosubmit_no", Boolean.valueOf(this.f77544f)), TuplesKt.m28425to("prompt_shown", this.f77545g));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.f77539a.hashCode() * 31) + this.f77540b.hashCode()) * 31) + this.f77541c.hashCode()) * 31) + this.f77542d.hashCode()) * 31;
        boolean z = this.f77543e;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.f77544f;
        return ((i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.f77545g.hashCode();
    }

    public String toString() {
        String str = this.f77539a;
        DateTime dateTime = this.f77540b;
        DateTime dateTime2 = this.f77541c;
        String str2 = this.f77542d;
        boolean z = this.f77543e;
        boolean z2 = this.f77544f;
        String str3 = this.f77545g;
        return "TaxInformationScreenViewed(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", source=" + str2 + ", showedSkipButton=" + z + ", autosubmitNo=" + z2 + ", promptShown=" + str3 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C40092e06(String str, DateTime dateTime, DateTime dateTime2, String str2, boolean z, boolean z2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, str2, z, z2, str3);
        String str4;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str4 = uuid;
        } else {
            str4 = str;
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
