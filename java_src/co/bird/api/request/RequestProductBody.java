package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, m28432d2 = {"Lco/bird/api/request/RequestProductBody;", "", "id", "", "quantity", "", "limit", "(Ljava/lang/String;II)V", "getId", "()Ljava/lang/String;", "getLimit", "()I", "getQuantity", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RequestProductBody {
    @JsonProperty("userId")
    @InterfaceC41208ft5("userId")

    /* renamed from: id */
    private final String f68205id;
    @JsonProperty("limit")
    @InterfaceC41208ft5("limit")
    private final int limit;
    @JsonProperty("offset")
    @InterfaceC41208ft5("offset")
    private final int quantity;

    public RequestProductBody(String id, int i, int i2) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.f68205id = id;
        this.quantity = i;
        this.limit = i2;
    }

    public static /* synthetic */ RequestProductBody copy$default(RequestProductBody requestProductBody, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = requestProductBody.f68205id;
        }
        if ((i3 & 2) != 0) {
            i = requestProductBody.quantity;
        }
        if ((i3 & 4) != 0) {
            i2 = requestProductBody.limit;
        }
        return requestProductBody.copy(str, i, i2);
    }

    public final String component1() {
        return this.f68205id;
    }

    public final int component2() {
        return this.quantity;
    }

    public final int component3() {
        return this.limit;
    }

    public final RequestProductBody copy(String id, int i, int i2) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new RequestProductBody(id, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RequestProductBody) {
            RequestProductBody requestProductBody = (RequestProductBody) obj;
            return Intrinsics.areEqual(this.f68205id, requestProductBody.f68205id) && this.quantity == requestProductBody.quantity && this.limit == requestProductBody.limit;
        }
        return false;
    }

    public final String getId() {
        return this.f68205id;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public int hashCode() {
        return (((this.f68205id.hashCode() * 31) + Integer.hashCode(this.quantity)) * 31) + Integer.hashCode(this.limit);
    }

    public String toString() {
        String str = this.f68205id;
        int i = this.quantity;
        int i2 = this.limit;
        return "RequestProductBody(id=" + str + ", quantity=" + i + ", limit=" + i2 + ")";
    }
}
