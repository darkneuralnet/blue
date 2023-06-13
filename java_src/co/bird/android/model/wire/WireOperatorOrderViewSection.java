package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\bHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/model/wire/WireOperatorOrderViewSection;", "", "title", "", "items", "", "Lco/bird/android/model/wire/WireOperatorOrderView;", "idx", "", "(Ljava/lang/String;Ljava/util/List;I)V", "getIdx", "()I", "getItems", "()Ljava/util/List;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireOperatorOrderViewSection {
    @JsonProperty("idx")
    @InterfaceC41208ft5("idx")
    private final int idx;
    @JsonProperty("items")
    @InterfaceC41208ft5("items")
    private final List<WireOperatorOrderView> items;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public WireOperatorOrderViewSection() {
        this(null, null, 0, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WireOperatorOrderViewSection copy$default(WireOperatorOrderViewSection wireOperatorOrderViewSection, String str, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = wireOperatorOrderViewSection.title;
        }
        if ((i2 & 2) != 0) {
            list = wireOperatorOrderViewSection.items;
        }
        if ((i2 & 4) != 0) {
            i = wireOperatorOrderViewSection.idx;
        }
        return wireOperatorOrderViewSection.copy(str, list, i);
    }

    public final String component1() {
        return this.title;
    }

    public final List<WireOperatorOrderView> component2() {
        return this.items;
    }

    public final int component3() {
        return this.idx;
    }

    public final WireOperatorOrderViewSection copy(String title, List<WireOperatorOrderView> items, int i) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        return new WireOperatorOrderViewSection(title, items, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireOperatorOrderViewSection) {
            WireOperatorOrderViewSection wireOperatorOrderViewSection = (WireOperatorOrderViewSection) obj;
            return Intrinsics.areEqual(this.title, wireOperatorOrderViewSection.title) && Intrinsics.areEqual(this.items, wireOperatorOrderViewSection.items) && this.idx == wireOperatorOrderViewSection.idx;
        }
        return false;
    }

    public final int getIdx() {
        return this.idx;
    }

    public final List<WireOperatorOrderView> getItems() {
        return this.items;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + this.items.hashCode()) * 31) + Integer.hashCode(this.idx);
    }

    public String toString() {
        String str = this.title;
        List<WireOperatorOrderView> list = this.items;
        int i = this.idx;
        return "WireOperatorOrderViewSection(title=" + str + ", items=" + list + ", idx=" + i + ")";
    }

    public WireOperatorOrderViewSection(String title, List<WireOperatorOrderView> items, int i) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.title = title;
        this.items = items;
        this.idx = i;
    }

    public /* synthetic */ WireOperatorOrderViewSection(String str, List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 4) != 0 ? 0 : i);
    }
}
