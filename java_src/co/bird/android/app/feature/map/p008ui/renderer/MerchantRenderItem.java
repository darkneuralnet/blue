package co.bird.android.app.feature.map.p008ui.renderer;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireMerchantSite;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m28432d2 = {"Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;", "", "markerId", "", "merchantSite", "Lco/bird/android/model/wire/WireMerchantSite;", "pinSize", "", "pinVisibility", "Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;", "(Ljava/lang/String;Lco/bird/android/model/wire/WireMerchantSite;DLco/bird/android/app/feature/map/ui/renderer/PinVisibility;)V", "getMarkerId", "()Ljava/lang/String;", "getMerchantSite", "()Lco/bird/android/model/wire/WireMerchantSite;", "getPinSize", "()D", "getPinVisibility", "()Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: co.bird.android.app.feature.map.ui.renderer.MerchantRenderItem */
/* loaded from: classes2.dex */
public final class MerchantRenderItem {
    private final String markerId;
    private final WireMerchantSite merchantSite;
    private final double pinSize;
    private final PinVisibility pinVisibility;

    public MerchantRenderItem(String markerId, WireMerchantSite merchantSite, double d, PinVisibility pinVisibility) {
        Intrinsics.checkNotNullParameter(markerId, "markerId");
        Intrinsics.checkNotNullParameter(merchantSite, "merchantSite");
        Intrinsics.checkNotNullParameter(pinVisibility, "pinVisibility");
        this.markerId = markerId;
        this.merchantSite = merchantSite;
        this.pinSize = d;
        this.pinVisibility = pinVisibility;
    }

    public static /* synthetic */ MerchantRenderItem copy$default(MerchantRenderItem merchantRenderItem, String str, WireMerchantSite wireMerchantSite, double d, PinVisibility pinVisibility, int i, Object obj) {
        if ((i & 1) != 0) {
            str = merchantRenderItem.markerId;
        }
        if ((i & 2) != 0) {
            wireMerchantSite = merchantRenderItem.merchantSite;
        }
        WireMerchantSite wireMerchantSite2 = wireMerchantSite;
        if ((i & 4) != 0) {
            d = merchantRenderItem.pinSize;
        }
        double d2 = d;
        if ((i & 8) != 0) {
            pinVisibility = merchantRenderItem.pinVisibility;
        }
        return merchantRenderItem.copy(str, wireMerchantSite2, d2, pinVisibility);
    }

    public final String component1() {
        return this.markerId;
    }

    public final WireMerchantSite component2() {
        return this.merchantSite;
    }

    public final double component3() {
        return this.pinSize;
    }

    public final PinVisibility component4() {
        return this.pinVisibility;
    }

    public final MerchantRenderItem copy(String markerId, WireMerchantSite merchantSite, double d, PinVisibility pinVisibility) {
        Intrinsics.checkNotNullParameter(markerId, "markerId");
        Intrinsics.checkNotNullParameter(merchantSite, "merchantSite");
        Intrinsics.checkNotNullParameter(pinVisibility, "pinVisibility");
        return new MerchantRenderItem(markerId, merchantSite, d, pinVisibility);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MerchantRenderItem) {
            MerchantRenderItem merchantRenderItem = (MerchantRenderItem) obj;
            return Intrinsics.areEqual(this.markerId, merchantRenderItem.markerId) && Intrinsics.areEqual(this.merchantSite, merchantRenderItem.merchantSite) && Double.compare(this.pinSize, merchantRenderItem.pinSize) == 0 && this.pinVisibility == merchantRenderItem.pinVisibility;
        }
        return false;
    }

    public final String getMarkerId() {
        return this.markerId;
    }

    public final WireMerchantSite getMerchantSite() {
        return this.merchantSite;
    }

    public final double getPinSize() {
        return this.pinSize;
    }

    public final PinVisibility getPinVisibility() {
        return this.pinVisibility;
    }

    public int hashCode() {
        return (((((this.markerId.hashCode() * 31) + this.merchantSite.hashCode()) * 31) + Double.hashCode(this.pinSize)) * 31) + this.pinVisibility.hashCode();
    }

    public String toString() {
        String str = this.markerId;
        WireMerchantSite wireMerchantSite = this.merchantSite;
        double d = this.pinSize;
        PinVisibility pinVisibility = this.pinVisibility;
        return "MerchantRenderItem(markerId=" + str + ", merchantSite=" + wireMerchantSite + ", pinSize=" + d + ", pinVisibility=" + pinVisibility + ")";
    }

    public /* synthetic */ MerchantRenderItem(String str, WireMerchantSite wireMerchantSite, double d, PinVisibility pinVisibility, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, wireMerchantSite, (i & 4) != 0 ? 1.0d : d, pinVisibility);
    }
}
