package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\tHÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\tHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001c"}, m28432d2 = {"Lco/bird/android/model/wire/WireServiceCenterOrderSection;", "", "items", "", "Lco/bird/android/model/wire/WireOrderItemView;", "title", "", "emptyLabel", "idx", "", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;I)V", "getEmptyLabel", "()Ljava/lang/String;", "getIdx", "()I", "getItems", "()Ljava/util/List;", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireServiceCenterOrderSection {
    @JsonProperty("empty_label")
    @InterfaceC41208ft5("empty_label")
    private final String emptyLabel;
    @JsonProperty("idx")
    @InterfaceC41208ft5("idx")
    private final int idx;
    @JsonProperty("items")
    @InterfaceC41208ft5("items")
    private final List<WireOrderItemView> items;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public WireServiceCenterOrderSection() {
        this(null, null, null, 0, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WireServiceCenterOrderSection copy$default(WireServiceCenterOrderSection wireServiceCenterOrderSection, List list, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = wireServiceCenterOrderSection.items;
        }
        if ((i2 & 2) != 0) {
            str = wireServiceCenterOrderSection.title;
        }
        if ((i2 & 4) != 0) {
            str2 = wireServiceCenterOrderSection.emptyLabel;
        }
        if ((i2 & 8) != 0) {
            i = wireServiceCenterOrderSection.idx;
        }
        return wireServiceCenterOrderSection.copy(list, str, str2, i);
    }

    public final List<WireOrderItemView> component1() {
        return this.items;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.emptyLabel;
    }

    public final int component4() {
        return this.idx;
    }

    public final WireServiceCenterOrderSection copy(List<WireOrderItemView> items, String title, String str, int i) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        return new WireServiceCenterOrderSection(items, title, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireServiceCenterOrderSection) {
            WireServiceCenterOrderSection wireServiceCenterOrderSection = (WireServiceCenterOrderSection) obj;
            return Intrinsics.areEqual(this.items, wireServiceCenterOrderSection.items) && Intrinsics.areEqual(this.title, wireServiceCenterOrderSection.title) && Intrinsics.areEqual(this.emptyLabel, wireServiceCenterOrderSection.emptyLabel) && this.idx == wireServiceCenterOrderSection.idx;
        }
        return false;
    }

    public final String getEmptyLabel() {
        return this.emptyLabel;
    }

    public final int getIdx() {
        return this.idx;
    }

    public final List<WireOrderItemView> getItems() {
        return this.items;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = ((this.items.hashCode() * 31) + this.title.hashCode()) * 31;
        String str = this.emptyLabel;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.idx);
    }

    public String toString() {
        List<WireOrderItemView> list = this.items;
        String str = this.title;
        String str2 = this.emptyLabel;
        int i = this.idx;
        return "WireServiceCenterOrderSection(items=" + list + ", title=" + str + ", emptyLabel=" + str2 + ", idx=" + i + ")";
    }

    public WireServiceCenterOrderSection(List<WireOrderItemView> items, String title, String str, int i) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.items = items;
        this.title = title;
        this.emptyLabel = str;
        this.idx = i;
    }

    public /* synthetic */ WireServiceCenterOrderSection(List list, String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? 0 : i);
    }
}
