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
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b#\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B}\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\bA\u0010BJ\u0090\u0001\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0014\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001a\u001a\u0004\b$\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001a\u001a\u0004\b&\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\u001a\u001a\u0004\b0\u0010\u001cR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b5\u0010\u001a\u001a\u0004\b6\u0010\u001cR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\"\u0010>\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00170;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010\u001c¨\u0006C"}, m28432d2 = {"Lr04;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", CoreConstants.CONTEXT_SCOPE_VALUE, "currency", "", "allowPayPerRide", "allowAutoReload", "selectedPayPerRide", "selectedOptionId", "", "selectedOptionAmount", "selectedOptionLinkCode", "autoReloadChoice", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;)Lr04;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getContext", "e", "getCurrency", "f", "Z", "getAllowPayPerRide", "()Z", "g", "getAllowAutoReload", "h", "getSelectedPayPerRide", "i", "getSelectedOptionId", "j", "Ljava/lang/Long;", "getSelectedOptionAmount", "()Ljava/lang/Long;", "k", "getSelectedOptionLinkCode", "l", "Ljava/lang/Boolean;", "getAutoReloadChoice", "()Ljava/lang/Boolean;", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: r04  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C47799r04 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f106182a;

    /* renamed from: b */
    public final DateTime f106183b;

    /* renamed from: c */
    public final DateTime f106184c;

    /* renamed from: d */
    public final String f106185d;

    /* renamed from: e */
    public final String f106186e;

    /* renamed from: f */
    public final boolean f106187f;

    /* renamed from: g */
    public final boolean f106188g;

    /* renamed from: h */
    public final boolean f106189h;

    /* renamed from: i */
    public final String f106190i;

    /* renamed from: j */
    public final Long f106191j;

    /* renamed from: k */
    public final String f106192k;

    /* renamed from: l */
    public final Boolean f106193l;

    public C47799r04(String eventId, DateTime eventTime, DateTime clientTime, String context, String currency, boolean z, boolean z2, boolean z3, String str, Long l, String str2, Boolean bool) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f106182a = eventId;
        this.f106183b = eventTime;
        this.f106184c = clientTime;
        this.f106185d = context;
        this.f106186e = currency;
        this.f106187f = z;
        this.f106188g = z2;
        this.f106189h = z3;
        this.f106190i = str;
        this.f106191j = l;
        this.f106192k = str2;
        this.f106193l = bool;
    }

    /* renamed from: a */
    public final C47799r04 m16692a(String eventId, DateTime eventTime, DateTime clientTime, String context, String currency, boolean z, boolean z2, boolean z3, String str, Long l, String str2, Boolean bool) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new C47799r04(eventId, eventTime, clientTime, context, currency, z, z2, z3, str, l, str2, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C47799r04) {
            C47799r04 c47799r04 = (C47799r04) obj;
            return Intrinsics.areEqual(this.f106182a, c47799r04.f106182a) && Intrinsics.areEqual(this.f106183b, c47799r04.f106183b) && Intrinsics.areEqual(this.f106184c, c47799r04.f106184c) && Intrinsics.areEqual(this.f106185d, c47799r04.f106185d) && Intrinsics.areEqual(this.f106186e, c47799r04.f106186e) && this.f106187f == c47799r04.f106187f && this.f106188g == c47799r04.f106188g && this.f106189h == c47799r04.f106189h && Intrinsics.areEqual(this.f106190i, c47799r04.f106190i) && Intrinsics.areEqual(this.f106191j, c47799r04.f106191j) && Intrinsics.areEqual(this.f106192k, c47799r04.f106192k) && Intrinsics.areEqual(this.f106193l, c47799r04.f106193l);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.PreloadV2AddMoneyScreenContinueTapped";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f106182a), TuplesKt.m28425to("event_time", this.f106183b), TuplesKt.m28425to("client_time", this.f106184c), TuplesKt.m28425to(CoreConstants.CONTEXT_SCOPE_VALUE, this.f106185d), TuplesKt.m28425to("currency", this.f106186e), TuplesKt.m28425to("allow_pay_per_ride", Boolean.valueOf(this.f106187f)), TuplesKt.m28425to("allow_auto_reload", Boolean.valueOf(this.f106188g)), TuplesKt.m28425to("selected_pay_per_ride", Boolean.valueOf(this.f106189h)), TuplesKt.m28425to("selected_option_id", this.f106190i), TuplesKt.m28425to("selected_option_amount", this.f106191j), TuplesKt.m28425to("selected_option_link_code", this.f106192k), TuplesKt.m28425to("auto_reload_choice", this.f106193l));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((this.f106182a.hashCode() * 31) + this.f106183b.hashCode()) * 31) + this.f106184c.hashCode()) * 31) + this.f106185d.hashCode()) * 31) + this.f106186e.hashCode()) * 31;
        boolean z = this.f106187f;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.f106188g;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.f106189h;
        int i5 = (i4 + (z3 ? 1 : z3 ? 1 : 0)) * 31;
        String str = this.f106190i;
        int hashCode2 = (i5 + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.f106191j;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.f106192k;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f106193l;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        String str = this.f106182a;
        DateTime dateTime = this.f106183b;
        DateTime dateTime2 = this.f106184c;
        String str2 = this.f106185d;
        String str3 = this.f106186e;
        boolean z = this.f106187f;
        boolean z2 = this.f106188g;
        boolean z3 = this.f106189h;
        String str4 = this.f106190i;
        Long l = this.f106191j;
        String str5 = this.f106192k;
        Boolean bool = this.f106193l;
        return "PreloadV2AddMoneyScreenContinueTapped(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", context=" + str2 + ", currency=" + str3 + ", allowPayPerRide=" + z + ", allowAutoReload=" + z2 + ", selectedPayPerRide=" + z3 + ", selectedOptionId=" + str4 + ", selectedOptionAmount=" + l + ", selectedOptionLinkCode=" + str5 + ", autoReloadChoice=" + bool + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C47799r04(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, boolean z, boolean z2, boolean z3, String str4, Long l, String str5, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, str2, str3, z, z2, z3, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? null : l, (i & 1024) != 0 ? null : str5, (i & 2048) != 0 ? null : bool);
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
