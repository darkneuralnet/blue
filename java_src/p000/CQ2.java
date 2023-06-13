package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0006\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0003HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"LCQ2;", "", "", "", "merchantIds", "storeIds", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/util/List;", "b", "()Ljava/util/List;", "c", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: CQ2 */
/* loaded from: classes4.dex */
public final class CQ2 {
    @JsonProperty("merchant_ids")
    @InterfaceC41208ft5("merchant_ids")
    private final List<String> merchantIds;
    @JsonProperty("merchant_site_ids")
    @InterfaceC41208ft5("merchant_site_ids")
    private final List<String> storeIds;

    public CQ2(List<String> list, List<String> list2) {
        this.merchantIds = list;
        this.storeIds = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CQ2 copy$default(CQ2 cq2, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cq2.merchantIds;
        }
        if ((i & 2) != 0) {
            list2 = cq2.storeIds;
        }
        return cq2.m112244a(list, list2);
    }

    /* renamed from: a */
    public final CQ2 m112244a(List<String> list, List<String> list2) {
        return new CQ2(list, list2);
    }

    /* renamed from: b */
    public final List<String> m112243b() {
        return this.merchantIds;
    }

    /* renamed from: c */
    public final List<String> m112242c() {
        return this.storeIds;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CQ2) {
            CQ2 cq2 = (CQ2) obj;
            return Intrinsics.areEqual(this.merchantIds, cq2.merchantIds) && Intrinsics.areEqual(this.storeIds, cq2.storeIds);
        }
        return false;
    }

    public int hashCode() {
        List<String> list = this.merchantIds;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.storeIds;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        List<String> list = this.merchantIds;
        List<String> list2 = this.storeIds;
        return "MerchantCouponExtensions(merchantIds=" + list + ", storeIds=" + list2 + ")";
    }
}
