package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\bHÆ\u0003J=\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, m28432d2 = {"Lco/bird/api/response/PagedCollection;", "T", "", "total", "", "offset", "limit", "items", "", "(IIILjava/util/List;)V", "getItems", "()Ljava/util/List;", "getLimit", "()I", "getOffset", "getTotal", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class PagedCollection<T> {
    @JsonProperty("items")
    @InterfaceC41208ft5("items")
    private final List<T> items;
    @JsonProperty("limit")
    @InterfaceC41208ft5("limit")
    private final int limit;
    @JsonProperty("offset")
    @InterfaceC41208ft5("offset")
    private final int offset;
    @JsonProperty("total")
    @InterfaceC41208ft5("total")
    private final int total;

    public PagedCollection() {
        this(0, 0, 0, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PagedCollection copy$default(PagedCollection pagedCollection, int i, int i2, int i3, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = pagedCollection.total;
        }
        if ((i4 & 2) != 0) {
            i2 = pagedCollection.offset;
        }
        if ((i4 & 4) != 0) {
            i3 = pagedCollection.limit;
        }
        if ((i4 & 8) != 0) {
            list = pagedCollection.items;
        }
        return pagedCollection.copy(i, i2, i3, list);
    }

    public final int component1() {
        return this.total;
    }

    public final int component2() {
        return this.offset;
    }

    public final int component3() {
        return this.limit;
    }

    public final List<T> component4() {
        return this.items;
    }

    public final PagedCollection<T> copy(int i, int i2, int i3, List<? extends T> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new PagedCollection<>(i, i2, i3, items);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PagedCollection) {
            PagedCollection pagedCollection = (PagedCollection) obj;
            return this.total == pagedCollection.total && this.offset == pagedCollection.offset && this.limit == pagedCollection.limit && Intrinsics.areEqual(this.items, pagedCollection.items);
        }
        return false;
    }

    public final List<T> getItems() {
        return this.items;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.total) * 31) + Integer.hashCode(this.offset)) * 31) + Integer.hashCode(this.limit)) * 31) + this.items.hashCode();
    }

    public String toString() {
        int i = this.total;
        int i2 = this.offset;
        int i3 = this.limit;
        List<T> list = this.items;
        return "PagedCollection(total=" + i + ", offset=" + i2 + ", limit=" + i3 + ", items=" + list + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PagedCollection(int i, int i2, int i3, List<? extends T> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.total = i;
        this.offset = i2;
        this.limit = i3;
        this.items = items;
    }

    public /* synthetic */ PagedCollection(int i, int i2, int i3, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 100 : i3, (i4 & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
