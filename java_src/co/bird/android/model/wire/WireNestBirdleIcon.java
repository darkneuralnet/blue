package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.NestIcon;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/model/wire/WireNestBirdleIcon;", "", "icon", "Lco/bird/android/model/constant/NestIcon;", "count", "", "(Lco/bird/android/model/constant/NestIcon;I)V", "getCount", "()I", "getIcon", "()Lco/bird/android/model/constant/NestIcon;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireNestBirdleIcon {
    @JsonProperty("count")
    @InterfaceC41208ft5("count")
    private final int count;
    @JsonProperty("icon")
    @InterfaceC41208ft5("icon")
    private final NestIcon icon;

    public WireNestBirdleIcon() {
        this(null, 0, 3, null);
    }

    public static /* synthetic */ WireNestBirdleIcon copy$default(WireNestBirdleIcon wireNestBirdleIcon, NestIcon nestIcon, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            nestIcon = wireNestBirdleIcon.icon;
        }
        if ((i2 & 2) != 0) {
            i = wireNestBirdleIcon.count;
        }
        return wireNestBirdleIcon.copy(nestIcon, i);
    }

    public final NestIcon component1() {
        return this.icon;
    }

    public final int component2() {
        return this.count;
    }

    public final WireNestBirdleIcon copy(NestIcon icon, int i) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new WireNestBirdleIcon(icon, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireNestBirdleIcon) {
            WireNestBirdleIcon wireNestBirdleIcon = (WireNestBirdleIcon) obj;
            return this.icon == wireNestBirdleIcon.icon && this.count == wireNestBirdleIcon.count;
        }
        return false;
    }

    public final int getCount() {
        return this.count;
    }

    public final NestIcon getIcon() {
        return this.icon;
    }

    public int hashCode() {
        return (this.icon.hashCode() * 31) + Integer.hashCode(this.count);
    }

    public String toString() {
        NestIcon nestIcon = this.icon;
        int i = this.count;
        return "WireNestBirdleIcon(icon=" + nestIcon + ", count=" + i + ")";
    }

    public WireNestBirdleIcon(NestIcon icon, int i) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.icon = icon;
        this.count = i;
    }

    public /* synthetic */ WireNestBirdleIcon(NestIcon nestIcon, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? NestIcon.UNKNOWN : nestIcon, (i2 & 2) != 0 ? 0 : i);
    }
}
