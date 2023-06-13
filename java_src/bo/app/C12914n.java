package bo.app;

import android.location.Location;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C43664k20;
@Metadata(m28434bv = {}, m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\f\u0012\u0006\u0010\u0018\u001a\u00020\f\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u001b\u0010\u001cB\u0011\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001b\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013¨\u0006 "}, m28432d2 = {"Lbo/app/n;", "Lbo/app/x1;", "Lorg/json/JSONObject;", "e", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "getLatitude", "()D", "latitude", "getLongitude", "longitude", "w", "()Ljava/lang/Double;", "altitude", "v", "accuracy", "_latitude", "_longitude", "_altitude", "_accuracy", "<init>", "(DDLjava/lang/Double;Ljava/lang/Double;)V", "Landroid/location/Location;", "location", "(Landroid/location/Location;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.n */
/* loaded from: classes.dex */
public final class C12914n implements InterfaceC13200x1 {

    /* renamed from: b */
    private final double f58924b;

    /* renamed from: c */
    private final double f58925c;

    /* renamed from: d */
    private final Double f58926d;

    /* renamed from: e */
    private final Double f58927e;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.n$a */
    /* loaded from: classes.dex */
    public static final class C12915a extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12915a f58928b = new C12915a();

        public C12915a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Caught exception creating location Json.";
        }
    }

    public C12914n(double d, double d2, Double d3, Double d4) {
        this.f58924b = d;
        this.f58925c = d2;
        this.f58926d = d3;
        this.f58927e = d4;
        if (!C51781xj6.m4784d(getLatitude(), getLongitude())) {
            throw new IllegalArgumentException("Unable to create BrazeLocation. Latitude and longitude values are bounded by ±90 and ±180 respectively".toString());
        }
    }

    @Override // p000.InterfaceC37933aP1
    /* renamed from: e */
    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("latitude", getLatitude());
            jSONObject.put("longitude", getLongitude());
            if (m63303w() != null) {
                jSONObject.put("altitude", m63303w());
            }
            if (m63304v() != null) {
                jSONObject.put("ll_accuracy", m63304v());
            }
        } catch (JSONException e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C12915a.f58928b, 4, null);
        }
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C12914n) {
            C12914n c12914n = (C12914n) obj;
            return Intrinsics.areEqual((Object) Double.valueOf(this.f58924b), (Object) Double.valueOf(c12914n.f58924b)) && Intrinsics.areEqual((Object) Double.valueOf(this.f58925c), (Object) Double.valueOf(c12914n.f58925c)) && Intrinsics.areEqual((Object) this.f58926d, (Object) c12914n.f58926d) && Intrinsics.areEqual((Object) this.f58927e, (Object) c12914n.f58927e);
        }
        return false;
    }

    @Override // bo.app.InterfaceC13200x1
    public double getLatitude() {
        return this.f58924b;
    }

    @Override // bo.app.InterfaceC13200x1
    public double getLongitude() {
        return this.f58925c;
    }

    public int hashCode() {
        int hashCode = ((Double.hashCode(this.f58924b) * 31) + Double.hashCode(this.f58925c)) * 31;
        Double d = this.f58926d;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f58927e;
        return hashCode2 + (d2 != null ? d2.hashCode() : 0);
    }

    public String toString() {
        return "BrazeLocation(_latitude=" + this.f58924b + ", _longitude=" + this.f58925c + ", _altitude=" + this.f58926d + ", _accuracy=" + this.f58927e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* renamed from: v */
    public Double m63304v() {
        return this.f58927e;
    }

    /* renamed from: w */
    public Double m63303w() {
        return this.f58926d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12914n(Location location) {
        this(location.getLatitude(), location.getLongitude(), Double.valueOf(location.getAltitude()), Double.valueOf(location.getAccuracy()));
        Intrinsics.checkNotNullParameter(location, "location");
    }
}
