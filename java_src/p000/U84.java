package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B5\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u0017\u0010\u0018J;\u0010\n\u001a\u00020\u00002\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\bHÖ\u0003R)\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, m28432d2 = {"LU84;", "LL14;", "", "Lkotlin/Pair;", "", "", "lineItems", "", "", "metadata", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: U84 */
/* loaded from: classes3.dex */
public final class U84 implements L14 {

    /* renamed from: a */
    public final List<Pair<String, Long>> f36897a;

    /* renamed from: b */
    public final Map<String, Object> f36898b;

    public U84(List<Pair<String, Long>> lineItems, Map<String, ? extends Object> metadata) {
        Intrinsics.checkNotNullParameter(lineItems, "lineItems");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.f36897a = lineItems;
        this.f36898b = metadata;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ U84 copy$default(U84 u84, List list, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            list = u84.f36897a;
        }
        if ((i & 2) != 0) {
            map = u84.f36898b;
        }
        return u84.m81920a(list, map);
    }

    /* renamed from: a */
    public final U84 m81920a(List<Pair<String, Long>> lineItems, Map<String, ? extends Object> metadata) {
        Intrinsics.checkNotNullParameter(lineItems, "lineItems");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return new U84(lineItems, metadata);
    }

    /* renamed from: b */
    public final List<Pair<String, Long>> m81919b() {
        return this.f36897a;
    }

    /* renamed from: c */
    public final Map<String, Object> m81918c() {
        return this.f36898b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof U84) {
            U84 u84 = (U84) obj;
            return Intrinsics.areEqual(this.f36897a, u84.f36897a) && Intrinsics.areEqual(this.f36898b, u84.f36898b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f36897a.hashCode() * 31) + this.f36898b.hashCode();
    }

    public String toString() {
        List<Pair<String, Long>> list = this.f36897a;
        Map<String, Object> map = this.f36898b;
        return "PromptConfirmPurchase(lineItems=" + list + ", metadata=" + map + ")";
    }
}
