package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.location.Geofence;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import no.nordicsemi.android.ble.AbstractC26684u0;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b/\b\u0007\u0018\u0000 D2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0003:\u0001\u000eBq\b\u0000\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\u0006\u0010\u001b\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u0016\u0012\b\b\u0001\u0010\"\u001a\u00020\r\u0012\u0006\u0010%\u001a\u00020\r\u0012\u0006\u0010(\u001a\u00020\r\u0012\u0006\u0010-\u001a\u00020\u0007\u0012\u0006\u00100\u001a\u00020\u0007\u0012\b\b\u0001\u00103\u001a\u00020\u0007\u0012\b\b\u0001\u00106\u001a\u00020\u0007\u0012\b\b\u0001\u00109\u001a\u00020\r¢\u0006\u0004\bA\u0010BB\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\bA\u0010CJ\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0011\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0000H\u0096\u0002R\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000fR\u0017\u0010\u0015\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001d\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\"\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010%\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010!R\u0017\u0010(\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010!R\u0017\u0010-\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u00100\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u0010,R\u0017\u00103\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b1\u0010*\u001a\u0004\b2\u0010,R\u0017\u00106\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b4\u0010*\u001a\u0004\b5\u0010,R\u0017\u00109\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b7\u0010\u001f\u001a\u0004\b8\u0010!R(\u0010@\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b:\u0010\u0018\u0012\u0004\b>\u0010?\u001a\u0004\b;\u0010\u001a\"\u0004\b<\u0010=¨\u0006E"}, m28432d2 = {"Ld20;", "LaP1;", "Lorg/json/JSONObject;", "", "Lcom/google/android/gms/location/Geofence;", "x0", "otherGeofence", "", "b", "", "toString", "e", LegacyRepairType.OTHER_KEY, "", C17296a.f69688o, "Lorg/json/JSONObject;", "jsonObject", "c", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "", DateTokenConverter.CONVERTER_KEY, "D", "getLatitude", "()D", "latitude", "getLongitude", "longitude", "f", "I", "getRadiusMeter", "()I", "radiusMeter", "g", "r0", "cooldownEnterSeconds", "h", "s0", "cooldownExitSeconds", "i", "Z", "v", "()Z", "analyticsEnabledEnter", "j", "w", "analyticsEnabledExit", "k", "getEnterEvents", "enterEvents", "l", "getExitEvents", "exitEvents", "m", "getNotificationResponsivenessMs", "notificationResponsivenessMs", "n", "getDistanceFromGeofenceRefresh", AbstractC26684u0.f100690q, "(D)V", "getDistanceFromGeofenceRefresh$annotations", "()V", "distanceFromGeofenceRefresh", "<init>", "(Lorg/json/JSONObject;Ljava/lang/String;DDIIIZZZZI)V", "(Lorg/json/JSONObject;)V", "o", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: d20  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C39514d20 implements InterfaceC37933aP1<JSONObject>, Comparable<C39514d20> {

    /* renamed from: o */
    public static final C19665a f76005o = new C19665a(null);

    /* renamed from: b */
    public final JSONObject f76006b;

    /* renamed from: c */
    public final String f76007c;

    /* renamed from: d */
    public final double f76008d;

    /* renamed from: e */
    public final double f76009e;

    /* renamed from: f */
    public final int f76010f;

    /* renamed from: g */
    public final int f76011g;

    /* renamed from: h */
    public final int f76012h;

    /* renamed from: i */
    public final boolean f76013i;

    /* renamed from: j */
    public final boolean f76014j;

    /* renamed from: k */
    public final boolean f76015k;

    /* renamed from: l */
    public final boolean f76016l;

    /* renamed from: m */
    public final int f76017m;

    /* renamed from: n */
    public double f76018n;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004¨\u0006\u0014"}, m28432d2 = {"Ld20$a;", "", "", "ANALYTICS_ENABLED_ENTER", "Ljava/lang/String;", "ANALYTICS_ENABLED_EXIT", "COOLDOWN_ENTER_SECONDS", "COOLDOWN_EXIT_SECONDS", "", "DEFAULT_NOTIFICATION_RESPONSIVENESS_MS", "I", "ENTER_EVENTS", "EXIT_EVENTS", "ID", "LATITUDE", "LONGITUDE", "NOTIFICATION_RESPONSIVENESS_MS", "RADIUS_METERS", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: d20$a */
    /* loaded from: classes2.dex */
    public static final class C19665a {
        public /* synthetic */ C19665a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C19665a() {
        }
    }

    public C39514d20(JSONObject jsonObject, String id, double d, double d2, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, int i4) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(id, "id");
        this.f76006b = jsonObject;
        this.f76007c = id;
        this.f76008d = d;
        this.f76009e = d2;
        this.f76010f = i;
        this.f76011g = i2;
        this.f76012h = i3;
        this.f76013i = z;
        this.f76014j = z2;
        this.f76015k = z3;
        this.f76016l = z4;
        this.f76017m = i4;
        this.f76018n = -1.0d;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(C39514d20 other) {
        boolean z;
        Intrinsics.checkNotNullParameter(other, "other");
        double d = this.f76018n;
        if (d == -1.0d) {
            z = true;
        } else {
            z = false;
        }
        if (z || d >= other.f76018n) {
            return 1;
        }
        return -1;
    }

    /* renamed from: b */
    public final boolean m44706b(C39514d20 otherGeofence) {
        Intrinsics.checkNotNullParameter(otherGeofence, "otherGeofence");
        try {
            return C31696Aj2.m115349j(this.f76006b, otherGeofence.forJsonPut());
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // p000.InterfaceC37933aP1
    /* renamed from: e */
    public JSONObject forJsonPut() {
        return this.f76006b;
    }

    public final String getId() {
        return this.f76007c;
    }

    public final double getLatitude() {
        return this.f76008d;
    }

    public final double getLongitude() {
        return this.f76009e;
    }

    /* renamed from: r0 */
    public final int m44704r0() {
        return this.f76011g;
    }

    /* renamed from: s0 */
    public final int m44703s0() {
        return this.f76012h;
    }

    public String toString() {
        return "BrazeGeofence{id=" + this.f76007c + ", latitude=" + this.f76008d + ", longitude=" + this.f76009e + ", radiusMeters=" + this.f76010f + ", cooldownEnterSeconds=" + this.f76011g + ", cooldownExitSeconds=" + this.f76012h + ", analyticsEnabledEnter=" + this.f76013i + ", analyticsEnabledExit=" + this.f76014j + ", enterEvents=" + this.f76015k + ", exitEvents=" + this.f76016l + ", notificationResponsivenessMs=" + this.f76017m + ", distanceFromGeofenceRefresh=" + this.f76018n + " }";
    }

    /* renamed from: u0 */
    public final void m44702u0(double d) {
        this.f76018n = d;
    }

    /* renamed from: v */
    public final boolean m44701v() {
        return this.f76013i;
    }

    /* renamed from: w */
    public final boolean m44700w() {
        return this.f76014j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: x0 */
    public final Geofence m44699x0() {
        Geofence.Builder builder = new Geofence.Builder();
        builder.setRequestId(this.f76007c).setCircularRegion(this.f76008d, this.f76009e, this.f76010f).setNotificationResponsiveness(this.f76017m).setExpirationDuration(-1L);
        boolean z = this.f76015k;
        int i = z;
        if (this.f76016l) {
            i = (z ? 1 : 0) | 2;
        }
        builder.setTransitionTypes(i);
        Geofence build = builder.build();
        Intrinsics.checkNotNullExpressionValue(build, "builder.build()");
        return build;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C39514d20(JSONObject jsonObject) {
        this(jsonObject, r2, jsonObject.getDouble("latitude"), jsonObject.getDouble("longitude"), jsonObject.getInt("radius"), jsonObject.getInt("cooldown_enter"), jsonObject.getInt("cooldown_exit"), jsonObject.getBoolean("analytics_enabled_enter"), jsonObject.getBoolean("analytics_enabled_exit"), jsonObject.optBoolean("enter_events", true), jsonObject.optBoolean("exit_events", true), jsonObject.optInt("notification_responsiveness", 30000));
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        String string = jsonObject.getString("id");
        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(ID)");
    }
}
