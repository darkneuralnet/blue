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
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u001a\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b5\u00106Jn\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0017\u001a\u0004\b%\u0010\u0019R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u000b\u0010(R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u0017\u001a\u0004\b.\u0010\u0019R\"\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00140/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u0019¨\u00067"}, m28432d2 = {"LeY;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "birdId", "birdModel", "rideId", "", "isPrimaryRide", "", "newSpeed", "trigger", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;JLjava/lang/String;)LeY;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getBirdId", "e", "getBirdModel", "f", "getRideId", "g", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "h", "J", "getNewSpeed", "()J", "i", "getTrigger", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;JLjava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: eY */
/* loaded from: classes4.dex */
public final class C20063eY implements AnalyticsEvent {

    /* renamed from: a */
    public final String f78520a;

    /* renamed from: b */
    public final DateTime f78521b;

    /* renamed from: c */
    public final DateTime f78522c;

    /* renamed from: d */
    public final String f78523d;

    /* renamed from: e */
    public final String f78524e;

    /* renamed from: f */
    public final String f78525f;

    /* renamed from: g */
    public final Boolean f78526g;

    /* renamed from: h */
    public final long f78527h;

    /* renamed from: i */
    public final String f78528i;

    public C20063eY(String eventId, DateTime eventTime, DateTime clientTime, String birdId, String birdModel, String str, Boolean bool, long j, String trigger) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(birdModel, "birdModel");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        this.f78520a = eventId;
        this.f78521b = eventTime;
        this.f78522c = clientTime;
        this.f78523d = birdId;
        this.f78524e = birdModel;
        this.f78525f = str;
        this.f78526g = bool;
        this.f78527h = j;
        this.f78528i = trigger;
    }

    /* renamed from: a */
    public final C20063eY m42802a(String eventId, DateTime eventTime, DateTime clientTime, String birdId, String birdModel, String str, Boolean bool, long j, String trigger) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(birdModel, "birdModel");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        return new C20063eY(eventId, eventTime, clientTime, birdId, birdModel, str, bool, j, trigger);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C20063eY) {
            C20063eY c20063eY = (C20063eY) obj;
            return Intrinsics.areEqual(this.f78520a, c20063eY.f78520a) && Intrinsics.areEqual(this.f78521b, c20063eY.f78521b) && Intrinsics.areEqual(this.f78522c, c20063eY.f78522c) && Intrinsics.areEqual(this.f78523d, c20063eY.f78523d) && Intrinsics.areEqual(this.f78524e, c20063eY.f78524e) && Intrinsics.areEqual(this.f78525f, c20063eY.f78525f) && Intrinsics.areEqual(this.f78526g, c20063eY.f78526g) && this.f78527h == c20063eY.f78527h && Intrinsics.areEqual(this.f78528i, c20063eY.f78528i);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.BluetoothSpeedSet";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f78520a), TuplesKt.m28425to("event_time", this.f78521b), TuplesKt.m28425to("client_time", this.f78522c), TuplesKt.m28425to("bird_id", this.f78523d), TuplesKt.m28425to("bird_model", this.f78524e), TuplesKt.m28425to("ride_id", this.f78525f), TuplesKt.m28425to("is_primary_ride", this.f78526g), TuplesKt.m28425to("new_speed", Long.valueOf(this.f78527h)), TuplesKt.m28425to("trigger", this.f78528i));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f78520a.hashCode() * 31) + this.f78521b.hashCode()) * 31) + this.f78522c.hashCode()) * 31) + this.f78523d.hashCode()) * 31) + this.f78524e.hashCode()) * 31;
        String str = this.f78525f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f78526g;
        return ((((hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31) + Long.hashCode(this.f78527h)) * 31) + this.f78528i.hashCode();
    }

    public String toString() {
        String str = this.f78520a;
        DateTime dateTime = this.f78521b;
        DateTime dateTime2 = this.f78522c;
        String str2 = this.f78523d;
        String str3 = this.f78524e;
        String str4 = this.f78525f;
        Boolean bool = this.f78526g;
        long j = this.f78527h;
        String str5 = this.f78528i;
        return "BluetoothSpeedSet(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", birdId=" + str2 + ", birdModel=" + str3 + ", rideId=" + str4 + ", isPrimaryRide=" + bool + ", newSpeed=" + j + ", trigger=" + str5 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C20063eY(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, Boolean bool, long j, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, str2, str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : bool, j, str5);
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
