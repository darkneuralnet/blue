package p000;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireItemScrapReason;
import co.bird.android.model.wire.WireSkuScanItem;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0017"}, m28432d2 = {"LqA5;", "", "Lco/bird/android/model/wire/WireSkuScanItem;", "scanItem", "", "Lco/bird/android/model/wire/WireItemScrapReason;", "reasons", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/model/wire/WireSkuScanItem;", "c", "()Lco/bird/android/model/wire/WireSkuScanItem;", "b", "Ljava/util/List;", "()Ljava/util/List;", "<init>", "(Lco/bird/android/model/wire/WireSkuScanItem;Ljava/util/List;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: qA5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47307qA5 {

    /* renamed from: a */
    public final WireSkuScanItem f104830a;

    /* renamed from: b */
    public final List<WireItemScrapReason> f104831b;

    public C47307qA5(WireSkuScanItem scanItem, List<WireItemScrapReason> reasons) {
        Intrinsics.checkNotNullParameter(scanItem, "scanItem");
        Intrinsics.checkNotNullParameter(reasons, "reasons");
        this.f104830a = scanItem;
        this.f104831b = reasons;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C47307qA5 copy$default(C47307qA5 c47307qA5, WireSkuScanItem wireSkuScanItem, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            wireSkuScanItem = c47307qA5.f104830a;
        }
        if ((i & 2) != 0) {
            list = c47307qA5.f104831b;
        }
        return c47307qA5.m18000a(wireSkuScanItem, list);
    }

    /* renamed from: a */
    public final C47307qA5 m18000a(WireSkuScanItem scanItem, List<WireItemScrapReason> reasons) {
        Intrinsics.checkNotNullParameter(scanItem, "scanItem");
        Intrinsics.checkNotNullParameter(reasons, "reasons");
        return new C47307qA5(scanItem, reasons);
    }

    /* renamed from: b */
    public final List<WireItemScrapReason> m17999b() {
        return this.f104831b;
    }

    /* renamed from: c */
    public final WireSkuScanItem m17998c() {
        return this.f104830a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C47307qA5) {
            C47307qA5 c47307qA5 = (C47307qA5) obj;
            return Intrinsics.areEqual(this.f104830a, c47307qA5.f104830a) && Intrinsics.areEqual(this.f104831b, c47307qA5.f104831b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f104830a.hashCode() * 31) + this.f104831b.hashCode();
    }

    public String toString() {
        WireSkuScanItem wireSkuScanItem = this.f104830a;
        List<WireItemScrapReason> list = this.f104831b;
        return "ShowScrapReasons(scanItem=" + wireSkuScanItem + ", reasons=" + list + ")";
    }
}
