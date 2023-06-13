package co.bird.android.model;

import co.bird.android.model.wire.WireBird;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J>\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001f"}, m28432d2 = {"Lco/bird/android/model/GoMapDeeplinkParams;", "Lco/bird/android/model/GoDeepLinkParams;", "latitude", "", "longitude", "bird", "Lco/bird/android/model/wire/WireBird;", "birdId", "", "(Ljava/lang/Double;Ljava/lang/Double;Lco/bird/android/model/wire/WireBird;Ljava/lang/String;)V", "getBird", "()Lco/bird/android/model/wire/WireBird;", "getBirdId", "()Ljava/lang/String;", "getLatitude", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLongitude", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Lco/bird/android/model/wire/WireBird;Ljava/lang/String;)Lco/bird/android/model/GoMapDeeplinkParams;", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class GoMapDeeplinkParams implements GoDeepLinkParams {
    private final WireBird bird;
    private final String birdId;
    private final Double latitude;
    private final Double longitude;

    public GoMapDeeplinkParams(Double d, Double d2, WireBird wireBird, String str) {
        this.latitude = d;
        this.longitude = d2;
        this.bird = wireBird;
        this.birdId = str;
    }

    public static /* synthetic */ GoMapDeeplinkParams copy$default(GoMapDeeplinkParams goMapDeeplinkParams, Double d, Double d2, WireBird wireBird, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            d = goMapDeeplinkParams.latitude;
        }
        if ((i & 2) != 0) {
            d2 = goMapDeeplinkParams.longitude;
        }
        if ((i & 4) != 0) {
            wireBird = goMapDeeplinkParams.bird;
        }
        if ((i & 8) != 0) {
            str = goMapDeeplinkParams.birdId;
        }
        return goMapDeeplinkParams.copy(d, d2, wireBird, str);
    }

    public final Double component1() {
        return this.latitude;
    }

    public final Double component2() {
        return this.longitude;
    }

    public final WireBird component3() {
        return this.bird;
    }

    public final String component4() {
        return this.birdId;
    }

    public final GoMapDeeplinkParams copy(Double d, Double d2, WireBird wireBird, String str) {
        return new GoMapDeeplinkParams(d, d2, wireBird, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GoMapDeeplinkParams) {
            GoMapDeeplinkParams goMapDeeplinkParams = (GoMapDeeplinkParams) obj;
            return Intrinsics.areEqual((Object) this.latitude, (Object) goMapDeeplinkParams.latitude) && Intrinsics.areEqual((Object) this.longitude, (Object) goMapDeeplinkParams.longitude) && Intrinsics.areEqual(this.bird, goMapDeeplinkParams.bird) && Intrinsics.areEqual(this.birdId, goMapDeeplinkParams.birdId);
        }
        return false;
    }

    public final WireBird getBird() {
        return this.bird;
    }

    public final String getBirdId() {
        return this.birdId;
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
        int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        WireBird wireBird = this.bird;
        int hashCode3 = (hashCode2 + (wireBird == null ? 0 : wireBird.hashCode())) * 31;
        String str = this.birdId;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        Double d = this.latitude;
        Double d2 = this.longitude;
        WireBird wireBird = this.bird;
        String str = this.birdId;
        return "GoMapDeeplinkParams(latitude=" + d + ", longitude=" + d2 + ", bird=" + wireBird + ", birdId=" + str + ")";
    }
}
