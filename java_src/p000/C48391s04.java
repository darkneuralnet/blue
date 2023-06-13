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
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b'\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t¢\u0006\u0004\bG\u0010HJ¦\u0001\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0016\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001c\u001a\u0004\b(\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b0\u0010,R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010\u001c\u001a\u0004\b2\u0010\u001eR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b7\u0010\u001c\u001a\u0004\b8\u0010\u001eR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b9\u00104\u001a\u0004\b:\u00106R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b;\u0010\u001c\u001a\u0004\b<\u0010\u001eR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\"\u0010D\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00190A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010\u001e¨\u0006I"}, m28432d2 = {"Ls04;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", CoreConstants.CONTEXT_SCOPE_VALUE, "currency", "", "allowPayPerRide", "allowAutoReload", "selectedPayPerRide", "errorDescription", "", "errorNetworkCode", "selectedOptionId", "selectedOptionAmount", "selectedOptionLinkCode", "autoReloadChoice", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;)Ls04;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getContext", "e", "getCurrency", "f", "Z", "getAllowPayPerRide", "()Z", "g", "getAllowAutoReload", "h", "getSelectedPayPerRide", "i", "getErrorDescription", "j", "Ljava/lang/Long;", "getErrorNetworkCode", "()Ljava/lang/Long;", "k", "getSelectedOptionId", "l", "getSelectedOptionAmount", "m", "getSelectedOptionLinkCode", "n", "Ljava/lang/Boolean;", "getAutoReloadChoice", "()Ljava/lang/Boolean;", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: s04  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C48391s04 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f108111a;

    /* renamed from: b */
    public final DateTime f108112b;

    /* renamed from: c */
    public final DateTime f108113c;

    /* renamed from: d */
    public final String f108114d;

    /* renamed from: e */
    public final String f108115e;

    /* renamed from: f */
    public final boolean f108116f;

    /* renamed from: g */
    public final boolean f108117g;

    /* renamed from: h */
    public final boolean f108118h;

    /* renamed from: i */
    public final String f108119i;

    /* renamed from: j */
    public final Long f108120j;

    /* renamed from: k */
    public final String f108121k;

    /* renamed from: l */
    public final Long f108122l;

    /* renamed from: m */
    public final String f108123m;

    /* renamed from: n */
    public final Boolean f108124n;

    public C48391s04(String eventId, DateTime eventTime, DateTime clientTime, String context, String currency, boolean z, boolean z2, boolean z3, String errorDescription, Long l, String str, Long l2, String str2, Boolean bool) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(errorDescription, "errorDescription");
        this.f108111a = eventId;
        this.f108112b = eventTime;
        this.f108113c = clientTime;
        this.f108114d = context;
        this.f108115e = currency;
        this.f108116f = z;
        this.f108117g = z2;
        this.f108118h = z3;
        this.f108119i = errorDescription;
        this.f108120j = l;
        this.f108121k = str;
        this.f108122l = l2;
        this.f108123m = str2;
        this.f108124n = bool;
    }

    /* renamed from: a */
    public final C48391s04 m14893a(String eventId, DateTime eventTime, DateTime clientTime, String context, String currency, boolean z, boolean z2, boolean z3, String errorDescription, Long l, String str, Long l2, String str2, Boolean bool) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(errorDescription, "errorDescription");
        return new C48391s04(eventId, eventTime, clientTime, context, currency, z, z2, z3, errorDescription, l, str, l2, str2, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C48391s04) {
            C48391s04 c48391s04 = (C48391s04) obj;
            return Intrinsics.areEqual(this.f108111a, c48391s04.f108111a) && Intrinsics.areEqual(this.f108112b, c48391s04.f108112b) && Intrinsics.areEqual(this.f108113c, c48391s04.f108113c) && Intrinsics.areEqual(this.f108114d, c48391s04.f108114d) && Intrinsics.areEqual(this.f108115e, c48391s04.f108115e) && this.f108116f == c48391s04.f108116f && this.f108117g == c48391s04.f108117g && this.f108118h == c48391s04.f108118h && Intrinsics.areEqual(this.f108119i, c48391s04.f108119i) && Intrinsics.areEqual(this.f108120j, c48391s04.f108120j) && Intrinsics.areEqual(this.f108121k, c48391s04.f108121k) && Intrinsics.areEqual(this.f108122l, c48391s04.f108122l) && Intrinsics.areEqual(this.f108123m, c48391s04.f108123m) && Intrinsics.areEqual(this.f108124n, c48391s04.f108124n);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.PreloadV2AddMoneyScreenError";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f108111a), TuplesKt.m28425to("event_time", this.f108112b), TuplesKt.m28425to("client_time", this.f108113c), TuplesKt.m28425to(CoreConstants.CONTEXT_SCOPE_VALUE, this.f108114d), TuplesKt.m28425to("currency", this.f108115e), TuplesKt.m28425to("allow_pay_per_ride", Boolean.valueOf(this.f108116f)), TuplesKt.m28425to("allow_auto_reload", Boolean.valueOf(this.f108117g)), TuplesKt.m28425to("selected_pay_per_ride", Boolean.valueOf(this.f108118h)), TuplesKt.m28425to("error_description", this.f108119i), TuplesKt.m28425to("error_network_code", this.f108120j), TuplesKt.m28425to("selected_option_id", this.f108121k), TuplesKt.m28425to("selected_option_amount", this.f108122l), TuplesKt.m28425to("selected_option_link_code", this.f108123m), TuplesKt.m28425to("auto_reload_choice", this.f108124n));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((this.f108111a.hashCode() * 31) + this.f108112b.hashCode()) * 31) + this.f108113c.hashCode()) * 31) + this.f108114d.hashCode()) * 31) + this.f108115e.hashCode()) * 31;
        boolean z = this.f108116f;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.f108117g;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.f108118h;
        int hashCode2 = (((i4 + (z3 ? 1 : z3 ? 1 : 0)) * 31) + this.f108119i.hashCode()) * 31;
        Long l = this.f108120j;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.f108121k;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.f108122l;
        int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.f108123m;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f108124n;
        return hashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        String str = this.f108111a;
        DateTime dateTime = this.f108112b;
        DateTime dateTime2 = this.f108113c;
        String str2 = this.f108114d;
        String str3 = this.f108115e;
        boolean z = this.f108116f;
        boolean z2 = this.f108117g;
        boolean z3 = this.f108118h;
        String str4 = this.f108119i;
        Long l = this.f108120j;
        String str5 = this.f108121k;
        Long l2 = this.f108122l;
        String str6 = this.f108123m;
        Boolean bool = this.f108124n;
        return "PreloadV2AddMoneyScreenError(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", context=" + str2 + ", currency=" + str3 + ", allowPayPerRide=" + z + ", allowAutoReload=" + z2 + ", selectedPayPerRide=" + z3 + ", errorDescription=" + str4 + ", errorNetworkCode=" + l + ", selectedOptionId=" + str5 + ", selectedOptionAmount=" + l2 + ", selectedOptionLinkCode=" + str6 + ", autoReloadChoice=" + bool + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C48391s04(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, boolean z, boolean z2, boolean z3, String str4, Long l, String str5, Long l2, String str6, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, str2, str3, z, z2, z3, str4, (i & 512) != 0 ? null : l, (i & 1024) != 0 ? null : str5, (i & 2048) != 0 ? null : l2, (i & 4096) != 0 ? null : str6, (i & 8192) != 0 ? null : bool);
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
