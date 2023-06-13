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
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u001a\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b4\u00105Jo\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000e\u001a\u00020\nHÆ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0018R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u0016\u001a\u0004\b+\u0010\u0018R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b-\u0010'R\"\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00130.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00103\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u0018¨\u00066"}, m28432d2 = {"LGL1;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", CoreConstants.CONTEXT_SCOPE_VALUE, "currentRole", "helpSystem", "", "openedInWebview", "openedExternalWindow", "articleId", "userInRide", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getContext", "e", "f", "getHelpSystem", "g", "Z", "getOpenedInWebview", "()Z", "h", "getOpenedExternalWindow", "i", "getArticleId", "j", "getUserInRide", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Z)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: GL1 */
/* loaded from: classes4.dex */
public final class GL1 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f11642a;

    /* renamed from: b */
    public final DateTime f11643b;

    /* renamed from: c */
    public final DateTime f11644c;

    /* renamed from: d */
    public final String f11645d;

    /* renamed from: e */
    public final String f11646e;

    /* renamed from: f */
    public final String f11647f;

    /* renamed from: g */
    public final boolean f11648g;

    /* renamed from: h */
    public final boolean f11649h;

    /* renamed from: i */
    public final String f11650i;

    /* renamed from: j */
    public final boolean f11651j;

    public GL1(String eventId, DateTime eventTime, DateTime clientTime, String context, String currentRole, String helpSystem, boolean z, boolean z2, String str, boolean z3) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(currentRole, "currentRole");
        Intrinsics.checkNotNullParameter(helpSystem, "helpSystem");
        this.f11642a = eventId;
        this.f11643b = eventTime;
        this.f11644c = clientTime;
        this.f11645d = context;
        this.f11646e = currentRole;
        this.f11647f = helpSystem;
        this.f11648g = z;
        this.f11649h = z2;
        this.f11650i = str;
        this.f11651j = z3;
    }

    /* renamed from: a */
    public final GL1 m105383a(String eventId, DateTime eventTime, DateTime clientTime, String context, String currentRole, String helpSystem, boolean z, boolean z2, String str, boolean z3) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(currentRole, "currentRole");
        Intrinsics.checkNotNullParameter(helpSystem, "helpSystem");
        return new GL1(eventId, eventTime, clientTime, context, currentRole, helpSystem, z, z2, str, z3);
    }

    /* renamed from: b */
    public final String m105382b() {
        return this.f11646e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GL1) {
            GL1 gl1 = (GL1) obj;
            return Intrinsics.areEqual(this.f11642a, gl1.f11642a) && Intrinsics.areEqual(this.f11643b, gl1.f11643b) && Intrinsics.areEqual(this.f11644c, gl1.f11644c) && Intrinsics.areEqual(this.f11645d, gl1.f11645d) && Intrinsics.areEqual(this.f11646e, gl1.f11646e) && Intrinsics.areEqual(this.f11647f, gl1.f11647f) && this.f11648g == gl1.f11648g && this.f11649h == gl1.f11649h && Intrinsics.areEqual(this.f11650i, gl1.f11650i) && this.f11651j == gl1.f11651j;
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.HelpOpened";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f11642a), TuplesKt.m28425to("event_time", this.f11643b), TuplesKt.m28425to("client_time", this.f11644c), TuplesKt.m28425to(CoreConstants.CONTEXT_SCOPE_VALUE, this.f11645d), TuplesKt.m28425to("current_role", this.f11646e), TuplesKt.m28425to("help_system", this.f11647f), TuplesKt.m28425to("opened_in_webview", Boolean.valueOf(this.f11648g)), TuplesKt.m28425to("opened_external_window", Boolean.valueOf(this.f11649h)), TuplesKt.m28425to("article_id", this.f11650i), TuplesKt.m28425to("user_in_ride", Boolean.valueOf(this.f11651j)));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((this.f11642a.hashCode() * 31) + this.f11643b.hashCode()) * 31) + this.f11644c.hashCode()) * 31) + this.f11645d.hashCode()) * 31) + this.f11646e.hashCode()) * 31) + this.f11647f.hashCode()) * 31;
        boolean z = this.f11648g;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.f11649h;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        String str = this.f11650i;
        int hashCode2 = (i4 + (str == null ? 0 : str.hashCode())) * 31;
        boolean z3 = this.f11651j;
        return hashCode2 + (z3 ? 1 : z3 ? 1 : 0);
    }

    public String toString() {
        String str = this.f11642a;
        DateTime dateTime = this.f11643b;
        DateTime dateTime2 = this.f11644c;
        String str2 = this.f11645d;
        String str3 = this.f11646e;
        String str4 = this.f11647f;
        boolean z = this.f11648g;
        boolean z2 = this.f11649h;
        String str5 = this.f11650i;
        boolean z3 = this.f11651j;
        return "HelpOpened(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", context=" + str2 + ", currentRole=" + str3 + ", helpSystem=" + str4 + ", openedInWebview=" + z + ", openedExternalWindow=" + z2 + ", articleId=" + str5 + ", userInRide=" + z3 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ GL1(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, boolean z, boolean z2, String str5, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, str2, str3, str4, z, z2, (i & 256) != 0 ? null : str5, z3);
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
