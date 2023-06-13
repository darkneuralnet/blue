package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.SummaryItemIcon;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m28432d2 = {"Lco/bird/android/model/wire/WireSummaryItem;", "", "icon", "Lco/bird/android/model/constant/SummaryItemIcon;", "label", "", "count", "", "(Lco/bird/android/model/constant/SummaryItemIcon;Ljava/lang/String;I)V", "getCount", "()I", "getIcon", "()Lco/bird/android/model/constant/SummaryItemIcon;", "getLabel", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireSummaryItem {
    @JsonProperty("count")
    @InterfaceC41208ft5("count")
    private final int count;
    @JsonProperty("icon")
    @InterfaceC41208ft5("icon")
    private final SummaryItemIcon icon;
    @JsonProperty("label")
    @InterfaceC41208ft5("label")
    private final String label;

    public WireSummaryItem() {
        this(null, null, 0, 7, null);
    }

    public static /* synthetic */ WireSummaryItem copy$default(WireSummaryItem wireSummaryItem, SummaryItemIcon summaryItemIcon, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            summaryItemIcon = wireSummaryItem.icon;
        }
        if ((i2 & 2) != 0) {
            str = wireSummaryItem.label;
        }
        if ((i2 & 4) != 0) {
            i = wireSummaryItem.count;
        }
        return wireSummaryItem.copy(summaryItemIcon, str, i);
    }

    public final SummaryItemIcon component1() {
        return this.icon;
    }

    public final String component2() {
        return this.label;
    }

    public final int component3() {
        return this.count;
    }

    public final WireSummaryItem copy(SummaryItemIcon summaryItemIcon, String label, int i) {
        Intrinsics.checkNotNullParameter(label, "label");
        return new WireSummaryItem(summaryItemIcon, label, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireSummaryItem) {
            WireSummaryItem wireSummaryItem = (WireSummaryItem) obj;
            return this.icon == wireSummaryItem.icon && Intrinsics.areEqual(this.label, wireSummaryItem.label) && this.count == wireSummaryItem.count;
        }
        return false;
    }

    public final int getCount() {
        return this.count;
    }

    public final SummaryItemIcon getIcon() {
        return this.icon;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        SummaryItemIcon summaryItemIcon = this.icon;
        return ((((summaryItemIcon == null ? 0 : summaryItemIcon.hashCode()) * 31) + this.label.hashCode()) * 31) + Integer.hashCode(this.count);
    }

    public String toString() {
        SummaryItemIcon summaryItemIcon = this.icon;
        String str = this.label;
        int i = this.count;
        return "WireSummaryItem(icon=" + summaryItemIcon + ", label=" + str + ", count=" + i + ")";
    }

    public WireSummaryItem(SummaryItemIcon summaryItemIcon, String label, int i) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.icon = summaryItemIcon;
        this.label = label;
        this.count = i;
    }

    public /* synthetic */ WireSummaryItem(SummaryItemIcon summaryItemIcon, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : summaryItemIcon, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? 0 : i);
    }
}
