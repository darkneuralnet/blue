package p000;

import ch.qos.logback.core.CoreConstants;
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
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b,\u0010-JO\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\"\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00100&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0015¨\u0006."}, m28432d2 = {"Lu04;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", CoreConstants.CONTEXT_SCOPE_VALUE, "currency", "", "allowPayPerRide", "allowAutoReload", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getContext", "e", "getCurrency", "f", "Z", "getAllowPayPerRide", "()Z", "g", "getAllowAutoReload", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;ZZ)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: u04  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49577u04 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f111470a;

    /* renamed from: b */
    public final DateTime f111471b;

    /* renamed from: c */
    public final DateTime f111472c;

    /* renamed from: d */
    public final String f111473d;

    /* renamed from: e */
    public final String f111474e;

    /* renamed from: f */
    public final boolean f111475f;

    /* renamed from: g */
    public final boolean f111476g;

    public C49577u04(String eventId, DateTime eventTime, DateTime clientTime, String context, String currency, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f111470a = eventId;
        this.f111471b = eventTime;
        this.f111472c = clientTime;
        this.f111473d = context;
        this.f111474e = currency;
        this.f111475f = z;
        this.f111476g = z2;
    }

    public static /* synthetic */ C49577u04 copy$default(C49577u04 c49577u04, String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c49577u04.f111470a;
        }
        if ((i & 2) != 0) {
            dateTime = c49577u04.f111471b;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = c49577u04.f111472c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 8) != 0) {
            str2 = c49577u04.f111473d;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            str3 = c49577u04.f111474e;
        }
        String str5 = str3;
        if ((i & 32) != 0) {
            z = c49577u04.f111475f;
        }
        boolean z3 = z;
        if ((i & 64) != 0) {
            z2 = c49577u04.f111476g;
        }
        return c49577u04.m11106a(str, dateTime3, dateTime4, str4, str5, z3, z2);
    }

    /* renamed from: a */
    public final C49577u04 m11106a(String eventId, DateTime eventTime, DateTime clientTime, String context, String currency, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new C49577u04(eventId, eventTime, clientTime, context, currency, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C49577u04) {
            C49577u04 c49577u04 = (C49577u04) obj;
            return Intrinsics.areEqual(this.f111470a, c49577u04.f111470a) && Intrinsics.areEqual(this.f111471b, c49577u04.f111471b) && Intrinsics.areEqual(this.f111472c, c49577u04.f111472c) && Intrinsics.areEqual(this.f111473d, c49577u04.f111473d) && Intrinsics.areEqual(this.f111474e, c49577u04.f111474e) && this.f111475f == c49577u04.f111475f && this.f111476g == c49577u04.f111476g;
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.PreloadV2AddMoneyScreenShown";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f111470a), TuplesKt.m28425to("event_time", this.f111471b), TuplesKt.m28425to("client_time", this.f111472c), TuplesKt.m28425to(CoreConstants.CONTEXT_SCOPE_VALUE, this.f111473d), TuplesKt.m28425to("currency", this.f111474e), TuplesKt.m28425to("allow_pay_per_ride", Boolean.valueOf(this.f111475f)), TuplesKt.m28425to("allow_auto_reload", Boolean.valueOf(this.f111476g)));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((this.f111470a.hashCode() * 31) + this.f111471b.hashCode()) * 31) + this.f111472c.hashCode()) * 31) + this.f111473d.hashCode()) * 31) + this.f111474e.hashCode()) * 31;
        boolean z = this.f111475f;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.f111476g;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        String str = this.f111470a;
        DateTime dateTime = this.f111471b;
        DateTime dateTime2 = this.f111472c;
        String str2 = this.f111473d;
        String str3 = this.f111474e;
        boolean z = this.f111475f;
        boolean z2 = this.f111476g;
        return "PreloadV2AddMoneyScreenShown(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", context=" + str2 + ", currency=" + str3 + ", allowPayPerRide=" + z + ", allowAutoReload=" + z2 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C49577u04(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, str2, str3, z, z2);
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
