package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001f\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, m28432d2 = {"LMD0;", "", "", "couponId", "", "c", "b", "", "LCQ2;", "extensions", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/util/Map;", "getExtensions", "()Ljava/util/Map;", "<init>", "(Ljava/util/Map;)V", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: MD0 */
/* loaded from: classes4.dex */
public final class MD0 {
    @JsonProperty("extension_map")
    @InterfaceC41208ft5("extension_map")
    private final Map<String, CQ2> extensions;

    public MD0(Map<String, CQ2> extensions) {
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        this.extensions = extensions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MD0 copy$default(MD0 md0, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = md0.extensions;
        }
        return md0.m95573a(map);
    }

    /* renamed from: a */
    public final MD0 m95573a(Map<String, CQ2> extensions) {
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        return new MD0(extensions);
    }

    /* renamed from: b */
    public final List<String> m95572b(String couponId) {
        List<String> emptyList;
        List<String> m112243b;
        Intrinsics.checkNotNullParameter(couponId, "couponId");
        CQ2 cq2 = this.extensions.get(couponId);
        if (cq2 == null || (m112243b = cq2.m112243b()) == null) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        return m112243b;
    }

    /* renamed from: c */
    public final List<String> m95571c(String couponId) {
        List<String> emptyList;
        List<String> m112242c;
        Intrinsics.checkNotNullParameter(couponId, "couponId");
        CQ2 cq2 = this.extensions.get(couponId);
        if (cq2 == null || (m112242c = cq2.m112242c()) == null) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        return m112242c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MD0) && Intrinsics.areEqual(this.extensions, ((MD0) obj).extensions);
    }

    public int hashCode() {
        return this.extensions.hashCode();
    }

    public String toString() {
        Map<String, CQ2> map = this.extensions;
        return "CouponExtensionResponse(extensions=" + map + ")";
    }
}
