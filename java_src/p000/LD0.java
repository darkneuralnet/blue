package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0005\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0003HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m28432d2 = {"LLD0;", "", "", "", "couponIds", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/util/List;", "getCouponIds", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: LD0 */
/* loaded from: classes4.dex */
public final class LD0 {
    @JsonProperty("coupon_ids")
    @InterfaceC41208ft5("coupon_ids")
    private final List<String> couponIds;

    public LD0(List<String> couponIds) {
        Intrinsics.checkNotNullParameter(couponIds, "couponIds");
        this.couponIds = couponIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LD0 copy$default(LD0 ld0, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = ld0.couponIds;
        }
        return ld0.m97528a(list);
    }

    /* renamed from: a */
    public final LD0 m97528a(List<String> couponIds) {
        Intrinsics.checkNotNullParameter(couponIds, "couponIds");
        return new LD0(couponIds);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LD0) && Intrinsics.areEqual(this.couponIds, ((LD0) obj).couponIds);
    }

    public int hashCode() {
        return this.couponIds.hashCode();
    }

    public String toString() {
        List<String> list = this.couponIds;
        return "CouponExtensionRequest(couponIds=" + list + ")";
    }
}
