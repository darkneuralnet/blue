package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"LRQ2;", "", "", "latitude", "longitude", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "D", "getLatitude", "()D", "getLongitude", "<init>", "(DD)V", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: RQ2 */
/* loaded from: classes4.dex */
public final class RQ2 {
    @JsonProperty("latitude")
    @InterfaceC41208ft5("latitude")
    private final double latitude;
    @JsonProperty("longitude")
    @InterfaceC41208ft5("longitude")
    private final double longitude;

    public RQ2() {
        this(0.0d, 0.0d, 3, null);
    }

    public static /* synthetic */ RQ2 copy$default(RQ2 rq2, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = rq2.latitude;
        }
        if ((i & 2) != 0) {
            d2 = rq2.longitude;
        }
        return rq2.m86764a(d, d2);
    }

    /* renamed from: a */
    public final RQ2 m86764a(double d, double d2) {
        return new RQ2(d, d2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RQ2) {
            RQ2 rq2 = (RQ2) obj;
            return Double.compare(this.latitude, rq2.latitude) == 0 && Double.compare(this.longitude, rq2.longitude) == 0;
        }
        return false;
    }

    public int hashCode() {
        return (Double.hashCode(this.latitude) * 31) + Double.hashCode(this.longitude);
    }

    public String toString() {
        double d = this.latitude;
        double d2 = this.longitude;
        return "MerchantLocationBody(latitude=" + d + ", longitude=" + d2 + ")";
    }

    public RQ2(double d, double d2) {
        this.latitude = d;
        this.longitude = d2;
    }

    public /* synthetic */ RQ2(double d, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2);
    }
}
