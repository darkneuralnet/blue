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
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b%\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t¢\u0006\u0004\bD\u0010EJ\u009a\u0001\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0015\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001b\u001a\u0004\b'\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b/\u0010+R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\u001b\u001a\u0004\b1\u0010\u001dR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\u001b\u001a\u0004\b3\u0010\u001dR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b8\u0010\u001b\u001a\u0004\b9\u0010\u001dR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\"\u0010A\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00180>8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010C\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\u001d¨\u0006F"}, m28432d2 = {"Lt04;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", CoreConstants.CONTEXT_SCOPE_VALUE, "currency", "", "allowPayPerRide", "allowAutoReload", "selectedPayPerRide", "resolution", "selectedOptionId", "", "selectedOptionAmount", "selectedOptionLinkCode", "autoReloadChoice", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;)Lt04;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getContext", "e", "getCurrency", "f", "Z", "getAllowPayPerRide", "()Z", "g", "getAllowAutoReload", "h", "getSelectedPayPerRide", "i", "getResolution", "j", "getSelectedOptionId", "k", "Ljava/lang/Long;", "getSelectedOptionAmount", "()Ljava/lang/Long;", "l", "getSelectedOptionLinkCode", "m", "Ljava/lang/Boolean;", "getAutoReloadChoice", "()Ljava/lang/Boolean;", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: t04  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C48984t04 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f109668a;

    /* renamed from: b */
    public final DateTime f109669b;

    /* renamed from: c */
    public final DateTime f109670c;

    /* renamed from: d */
    public final String f109671d;

    /* renamed from: e */
    public final String f109672e;

    /* renamed from: f */
    public final boolean f109673f;

    /* renamed from: g */
    public final boolean f109674g;

    /* renamed from: h */
    public final boolean f109675h;

    /* renamed from: i */
    public final String f109676i;

    /* renamed from: j */
    public final String f109677j;

    /* renamed from: k */
    public final Long f109678k;

    /* renamed from: l */
    public final String f109679l;

    /* renamed from: m */
    public final Boolean f109680m;

    public C48984t04(String eventId, DateTime eventTime, DateTime clientTime, String context, String currency, boolean z, boolean z2, boolean z3, String resolution, String str, Long l, String str2, Boolean bool) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(resolution, "resolution");
        this.f109668a = eventId;
        this.f109669b = eventTime;
        this.f109670c = clientTime;
        this.f109671d = context;
        this.f109672e = currency;
        this.f109673f = z;
        this.f109674g = z2;
        this.f109675h = z3;
        this.f109676i = resolution;
        this.f109677j = str;
        this.f109678k = l;
        this.f109679l = str2;
        this.f109680m = bool;
    }

    /* renamed from: a */
    public final C48984t04 m13254a(String eventId, DateTime eventTime, DateTime clientTime, String context, String currency, boolean z, boolean z2, boolean z3, String resolution, String str, Long l, String str2, Boolean bool) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(resolution, "resolution");
        return new C48984t04(eventId, eventTime, clientTime, context, currency, z, z2, z3, resolution, str, l, str2, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C48984t04) {
            C48984t04 c48984t04 = (C48984t04) obj;
            return Intrinsics.areEqual(this.f109668a, c48984t04.f109668a) && Intrinsics.areEqual(this.f109669b, c48984t04.f109669b) && Intrinsics.areEqual(this.f109670c, c48984t04.f109670c) && Intrinsics.areEqual(this.f109671d, c48984t04.f109671d) && Intrinsics.areEqual(this.f109672e, c48984t04.f109672e) && this.f109673f == c48984t04.f109673f && this.f109674g == c48984t04.f109674g && this.f109675h == c48984t04.f109675h && Intrinsics.areEqual(this.f109676i, c48984t04.f109676i) && Intrinsics.areEqual(this.f109677j, c48984t04.f109677j) && Intrinsics.areEqual(this.f109678k, c48984t04.f109678k) && Intrinsics.areEqual(this.f109679l, c48984t04.f109679l) && Intrinsics.areEqual(this.f109680m, c48984t04.f109680m);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.PreloadV2AddMoneyScreenResolved";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f109668a), TuplesKt.m28425to("event_time", this.f109669b), TuplesKt.m28425to("client_time", this.f109670c), TuplesKt.m28425to(CoreConstants.CONTEXT_SCOPE_VALUE, this.f109671d), TuplesKt.m28425to("currency", this.f109672e), TuplesKt.m28425to("allow_pay_per_ride", Boolean.valueOf(this.f109673f)), TuplesKt.m28425to("allow_auto_reload", Boolean.valueOf(this.f109674g)), TuplesKt.m28425to("selected_pay_per_ride", Boolean.valueOf(this.f109675h)), TuplesKt.m28425to("resolution", this.f109676i), TuplesKt.m28425to("selected_option_id", this.f109677j), TuplesKt.m28425to("selected_option_amount", this.f109678k), TuplesKt.m28425to("selected_option_link_code", this.f109679l), TuplesKt.m28425to("auto_reload_choice", this.f109680m));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((this.f109668a.hashCode() * 31) + this.f109669b.hashCode()) * 31) + this.f109670c.hashCode()) * 31) + this.f109671d.hashCode()) * 31) + this.f109672e.hashCode()) * 31;
        boolean z = this.f109673f;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.f109674g;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.f109675h;
        int hashCode2 = (((i4 + (z3 ? 1 : z3 ? 1 : 0)) * 31) + this.f109676i.hashCode()) * 31;
        String str = this.f109677j;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.f109678k;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.f109679l;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f109680m;
        return hashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        String str = this.f109668a;
        DateTime dateTime = this.f109669b;
        DateTime dateTime2 = this.f109670c;
        String str2 = this.f109671d;
        String str3 = this.f109672e;
        boolean z = this.f109673f;
        boolean z2 = this.f109674g;
        boolean z3 = this.f109675h;
        String str4 = this.f109676i;
        String str5 = this.f109677j;
        Long l = this.f109678k;
        String str6 = this.f109679l;
        Boolean bool = this.f109680m;
        return "PreloadV2AddMoneyScreenResolved(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", context=" + str2 + ", currency=" + str3 + ", allowPayPerRide=" + z + ", allowAutoReload=" + z2 + ", selectedPayPerRide=" + z3 + ", resolution=" + str4 + ", selectedOptionId=" + str5 + ", selectedOptionAmount=" + l + ", selectedOptionLinkCode=" + str6 + ", autoReloadChoice=" + bool + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C48984t04(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, boolean z, boolean z2, boolean z3, String str4, String str5, Long l, String str6, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, str2, str3, z, z2, z3, str4, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : l, (i & 2048) != 0 ? null : str6, (i & 4096) != 0 ? null : bool);
        String str7;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str7 = uuid;
        } else {
            str7 = str;
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
