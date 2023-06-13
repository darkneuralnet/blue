package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.NestIcon;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m28432d2 = {"Lco/bird/android/model/wire/WireNestCapacityRecommendation;", "", "icon", "Lco/bird/android/model/constant/NestIcon;", "title", "", "quantity", "", "(Lco/bird/android/model/constant/NestIcon;Ljava/lang/String;I)V", "getIcon", "()Lco/bird/android/model/constant/NestIcon;", "getQuantity", "()I", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireNestCapacityRecommendation {
    @JsonProperty("icon")
    @InterfaceC41208ft5("icon")
    private final NestIcon icon;
    @JsonProperty("quantity")
    @InterfaceC41208ft5("quantity")
    private final int quantity;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public WireNestCapacityRecommendation() {
        this(null, null, 0, 7, null);
    }

    public static /* synthetic */ WireNestCapacityRecommendation copy$default(WireNestCapacityRecommendation wireNestCapacityRecommendation, NestIcon nestIcon, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            nestIcon = wireNestCapacityRecommendation.icon;
        }
        if ((i2 & 2) != 0) {
            str = wireNestCapacityRecommendation.title;
        }
        if ((i2 & 4) != 0) {
            i = wireNestCapacityRecommendation.quantity;
        }
        return wireNestCapacityRecommendation.copy(nestIcon, str, i);
    }

    public final NestIcon component1() {
        return this.icon;
    }

    public final String component2() {
        return this.title;
    }

    public final int component3() {
        return this.quantity;
    }

    public final WireNestCapacityRecommendation copy(NestIcon icon, String title, int i) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        return new WireNestCapacityRecommendation(icon, title, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireNestCapacityRecommendation) {
            WireNestCapacityRecommendation wireNestCapacityRecommendation = (WireNestCapacityRecommendation) obj;
            return this.icon == wireNestCapacityRecommendation.icon && Intrinsics.areEqual(this.title, wireNestCapacityRecommendation.title) && this.quantity == wireNestCapacityRecommendation.quantity;
        }
        return false;
    }

    public final NestIcon getIcon() {
        return this.icon;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((this.icon.hashCode() * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.quantity);
    }

    public String toString() {
        NestIcon nestIcon = this.icon;
        String str = this.title;
        int i = this.quantity;
        return "WireNestCapacityRecommendation(icon=" + nestIcon + ", title=" + str + ", quantity=" + i + ")";
    }

    public WireNestCapacityRecommendation(NestIcon icon, String title, int i) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        this.icon = icon;
        this.title = title;
        this.quantity = i;
    }

    public /* synthetic */ WireNestCapacityRecommendation(NestIcon nestIcon, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? NestIcon.UNKNOWN : nestIcon, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? 0 : i);
    }
}
