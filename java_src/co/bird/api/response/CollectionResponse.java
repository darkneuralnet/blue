package co.bird.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0010"}, m28432d2 = {"Lco/bird/api/response/CollectionResponse;", "T", "", "total", "", "offset", "items", "", "(IILjava/util/List;)V", "getItems", "()Ljava/util/List;", "getOffset", "()I", "getTotal", "hasMore", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public class CollectionResponse<T> {
    @JsonProperty("items")
    @InterfaceC41208ft5("items")
    private final List<T> items;
    @JsonProperty("offset")
    @InterfaceC41208ft5("offset")
    private final int offset;
    @JsonProperty("total")
    @InterfaceC41208ft5("total")
    private final int total;

    public CollectionResponse() {
        this(0, 0, null, 7, null);
    }

    public final List<T> getItems() {
        return this.items;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final int getTotal() {
        return this.total;
    }

    public final boolean hasMore() {
        return this.total != 0;
    }

    public CollectionResponse(int i, int i2, List<T> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.total = i;
        this.offset = i2;
        this.items = items;
    }

    public /* synthetic */ CollectionResponse(int i, int i2, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? new ArrayList() : list);
    }
}
