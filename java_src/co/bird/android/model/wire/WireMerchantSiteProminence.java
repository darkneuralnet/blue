package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/model/wire/WireMerchantSiteProminence;", "", "banner", "", "pin", "(Ljava/lang/Double;Ljava/lang/Double;)V", "getBanner", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getPin", "component1", "component2", "copy", "(Ljava/lang/Double;Ljava/lang/Double;)Lco/bird/android/model/wire/WireMerchantSiteProminence;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireMerchantSiteProminence {
    @JsonProperty("banner")
    @InterfaceC41208ft5("banner")
    private final Double banner;
    @JsonProperty("pin")
    @InterfaceC41208ft5("pin")
    private final Double pin;

    public WireMerchantSiteProminence() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ WireMerchantSiteProminence copy$default(WireMerchantSiteProminence wireMerchantSiteProminence, Double d, Double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = wireMerchantSiteProminence.banner;
        }
        if ((i & 2) != 0) {
            d2 = wireMerchantSiteProminence.pin;
        }
        return wireMerchantSiteProminence.copy(d, d2);
    }

    public final Double component1() {
        return this.banner;
    }

    public final Double component2() {
        return this.pin;
    }

    public final WireMerchantSiteProminence copy(Double d, Double d2) {
        return new WireMerchantSiteProminence(d, d2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireMerchantSiteProminence) {
            WireMerchantSiteProminence wireMerchantSiteProminence = (WireMerchantSiteProminence) obj;
            return Intrinsics.areEqual((Object) this.banner, (Object) wireMerchantSiteProminence.banner) && Intrinsics.areEqual((Object) this.pin, (Object) wireMerchantSiteProminence.pin);
        }
        return false;
    }

    public final Double getBanner() {
        return this.banner;
    }

    public final Double getPin() {
        return this.pin;
    }

    public int hashCode() {
        Double d = this.banner;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.pin;
        return hashCode + (d2 != null ? d2.hashCode() : 0);
    }

    public String toString() {
        Double d = this.banner;
        Double d2 = this.pin;
        return "WireMerchantSiteProminence(banner=" + d + ", pin=" + d2 + ")";
    }

    public WireMerchantSiteProminence(Double d, Double d2) {
        this.banner = d;
        this.pin = d2;
    }

    public /* synthetic */ WireMerchantSiteProminence(Double d, Double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : d2);
    }
}
