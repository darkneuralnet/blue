package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J#\u0010\b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m28432d2 = {"Lco/bird/api/response/ProductResponse;", "", "", "component1", "", "component2", "products", "total", "copy", "", "toString", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/util/List;", "getProducts", "()Ljava/util/List;", "I", "getTotal", "()I", "<init>", "(Ljava/util/List;I)V", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class ProductResponse {
    @JsonProperty("items")
    @InterfaceC41208ft5("items")
    private final List<Object> products;
    @JsonProperty("total")
    @InterfaceC41208ft5("total")
    private final int total;

    public ProductResponse() {
        this(null, 0, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductResponse copy$default(ProductResponse productResponse, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = productResponse.products;
        }
        if ((i2 & 2) != 0) {
            i = productResponse.total;
        }
        return productResponse.copy(list, i);
    }

    public final List<Object> component1() {
        return this.products;
    }

    public final int component2() {
        return this.total;
    }

    public final ProductResponse copy(List<Object> products, int i) {
        Intrinsics.checkNotNullParameter(products, "products");
        return new ProductResponse(products, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProductResponse) {
            ProductResponse productResponse = (ProductResponse) obj;
            return Intrinsics.areEqual(this.products, productResponse.products) && this.total == productResponse.total;
        }
        return false;
    }

    public final List<Object> getProducts() {
        return this.products;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        return (this.products.hashCode() * 31) + Integer.hashCode(this.total);
    }

    public String toString() {
        List<Object> list = this.products;
        int i = this.total;
        return "ProductResponse(products=" + list + ", total=" + i + ")";
    }

    public ProductResponse(List<Object> products, int i) {
        Intrinsics.checkNotNullParameter(products, "products");
        this.products = products;
        this.total = i;
    }

    public /* synthetic */ ProductResponse(List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new ArrayList() : list, (i2 & 2) != 0 ? 0 : i);
    }
}
