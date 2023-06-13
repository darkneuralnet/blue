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
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u001a\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b4\u00105Jn\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0018R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u000b\u0010'R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u0016\u001a\u0004\b-\u0010\u0018R\"\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00130.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00103\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u0018¨\u00066"}, m28432d2 = {"LCX;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "birdId", "birdModel", "rideId", "", "isPrimaryRide", "newLockState", "phase", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/String;)LCX;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getBirdId", "e", "getBirdModel", "f", "getRideId", "g", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "h", "Z", "getNewLockState", "()Z", "i", "getPhase", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: CX */
/* loaded from: classes4.dex */
public final class C1035CX implements AnalyticsEvent {

    /* renamed from: a */
    public final String f4177a;

    /* renamed from: b */
    public final DateTime f4178b;

    /* renamed from: c */
    public final DateTime f4179c;

    /* renamed from: d */
    public final String f4180d;

    /* renamed from: e */
    public final String f4181e;

    /* renamed from: f */
    public final String f4182f;

    /* renamed from: g */
    public final Boolean f4183g;

    /* renamed from: h */
    public final boolean f4184h;

    /* renamed from: i */
    public final String f4185i;

    public C1035CX(String eventId, DateTime eventTime, DateTime clientTime, String birdId, String birdModel, String str, Boolean bool, boolean z, String phase) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(birdModel, "birdModel");
        Intrinsics.checkNotNullParameter(phase, "phase");
        this.f4177a = eventId;
        this.f4178b = eventTime;
        this.f4179c = clientTime;
        this.f4180d = birdId;
        this.f4181e = birdModel;
        this.f4182f = str;
        this.f4183g = bool;
        this.f4184h = z;
        this.f4185i = phase;
    }

    /* renamed from: a */
    public final C1035CX m112177a(String eventId, DateTime eventTime, DateTime clientTime, String birdId, String birdModel, String str, Boolean bool, boolean z, String phase) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(birdModel, "birdModel");
        Intrinsics.checkNotNullParameter(phase, "phase");
        return new C1035CX(eventId, eventTime, clientTime, birdId, birdModel, str, bool, z, phase);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1035CX) {
            C1035CX c1035cx = (C1035CX) obj;
            return Intrinsics.areEqual(this.f4177a, c1035cx.f4177a) && Intrinsics.areEqual(this.f4178b, c1035cx.f4178b) && Intrinsics.areEqual(this.f4179c, c1035cx.f4179c) && Intrinsics.areEqual(this.f4180d, c1035cx.f4180d) && Intrinsics.areEqual(this.f4181e, c1035cx.f4181e) && Intrinsics.areEqual(this.f4182f, c1035cx.f4182f) && Intrinsics.areEqual(this.f4183g, c1035cx.f4183g) && this.f4184h == c1035cx.f4184h && Intrinsics.areEqual(this.f4185i, c1035cx.f4185i);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.BluetoothLockSet";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f4177a), TuplesKt.m28425to("event_time", this.f4178b), TuplesKt.m28425to("client_time", this.f4179c), TuplesKt.m28425to("bird_id", this.f4180d), TuplesKt.m28425to("bird_model", this.f4181e), TuplesKt.m28425to("ride_id", this.f4182f), TuplesKt.m28425to("is_primary_ride", this.f4183g), TuplesKt.m28425to("new_lock_state", Boolean.valueOf(this.f4184h)), TuplesKt.m28425to("phase", this.f4185i));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((this.f4177a.hashCode() * 31) + this.f4178b.hashCode()) * 31) + this.f4179c.hashCode()) * 31) + this.f4180d.hashCode()) * 31) + this.f4181e.hashCode()) * 31;
        String str = this.f4182f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f4183g;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        boolean z = this.f4184h;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode3 + i) * 31) + this.f4185i.hashCode();
    }

    public String toString() {
        String str = this.f4177a;
        DateTime dateTime = this.f4178b;
        DateTime dateTime2 = this.f4179c;
        String str2 = this.f4180d;
        String str3 = this.f4181e;
        String str4 = this.f4182f;
        Boolean bool = this.f4183g;
        boolean z = this.f4184h;
        String str5 = this.f4185i;
        return "BluetoothLockSet(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", birdId=" + str2 + ", birdModel=" + str3 + ", rideId=" + str4 + ", isPrimaryRide=" + bool + ", newLockState=" + z + ", phase=" + str5 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C1035CX(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, Boolean bool, boolean z, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, str2, str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : bool, z, str5);
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