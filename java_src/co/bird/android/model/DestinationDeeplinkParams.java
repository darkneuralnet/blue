package co.bird.android.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/model/DestinationDeeplinkParams;", "Lco/bird/android/model/GoDeepLinkParams;", "latitude", "", "longitude", "(Ljava/lang/Double;Ljava/lang/Double;)V", "getLatitude", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLongitude", "component1", "component2", "copy", "(Ljava/lang/Double;Ljava/lang/Double;)Lco/bird/android/model/DestinationDeeplinkParams;", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class DestinationDeeplinkParams implements GoDeepLinkParams {
    private final Double latitude;
    private final Double longitude;

    public DestinationDeeplinkParams(Double d, Double d2) {
        this.latitude = d;
        this.longitude = d2;
    }

    public static /* synthetic */ DestinationDeeplinkParams copy$default(DestinationDeeplinkParams destinationDeeplinkParams, Double d, Double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = destinationDeeplinkParams.latitude;
        }
        if ((i & 2) != 0) {
            d2 = destinationDeeplinkParams.longitude;
        }
        return destinationDeeplinkParams.copy(d, d2);
    }

    public final Double component1() {
        return this.latitude;
    }

    public final Double component2() {
        return this.longitude;
    }

    public final DestinationDeeplinkParams copy(Double d, Double d2) {
        return new DestinationDeeplinkParams(d, d2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DestinationDeeplinkParams) {
            DestinationDeeplinkParams destinationDeeplinkParams = (DestinationDeeplinkParams) obj;
            return Intrinsics.areEqual((Object) this.latitude, (Object) destinationDeeplinkParams.latitude) && Intrinsics.areEqual((Object) this.longitude, (Object) destinationDeeplinkParams.longitude);
        }
        return false;
    }

    public final Double getLatitude() {
        return this.latitude;
    }

    public final Double getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        Double d = this.latitude;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.longitude;
        return hashCode + (d2 != null ? d2.hashCode() : 0);
    }

    public String toString() {
        Double d = this.latitude;
        Double d2 = this.longitude;
        return "DestinationDeeplinkParams(latitude=" + d + ", longitude=" + d2 + ")";
    }
}
