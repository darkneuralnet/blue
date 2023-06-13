package p000;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireSkuOrder;
import co.bird.android.model.wire.WireSkuScanItem;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, m28432d2 = {"LSw1;", "", "Lco/bird/android/model/wire/WireSkuScanItem;", "scanItem", "Lco/bird/android/model/wire/WireSkuOrder;", "skuOrder", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/model/wire/WireSkuScanItem;", "b", "()Lco/bird/android/model/wire/WireSkuScanItem;", "Lco/bird/android/model/wire/WireSkuOrder;", "getSkuOrder", "()Lco/bird/android/model/wire/WireSkuOrder;", "<init>", "(Lco/bird/android/model/wire/WireSkuScanItem;Lco/bird/android/model/wire/WireSkuOrder;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Sw1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36024Sw1 {

    /* renamed from: a */
    public final WireSkuScanItem f34505a;

    /* renamed from: b */
    public final WireSkuOrder f34506b;

    public C36024Sw1(WireSkuScanItem scanItem, WireSkuOrder skuOrder) {
        Intrinsics.checkNotNullParameter(scanItem, "scanItem");
        Intrinsics.checkNotNullParameter(skuOrder, "skuOrder");
        this.f34505a = scanItem;
        this.f34506b = skuOrder;
    }

    public static /* synthetic */ C36024Sw1 copy$default(C36024Sw1 c36024Sw1, WireSkuScanItem wireSkuScanItem, WireSkuOrder wireSkuOrder, int i, Object obj) {
        if ((i & 1) != 0) {
            wireSkuScanItem = c36024Sw1.f34505a;
        }
        if ((i & 2) != 0) {
            wireSkuOrder = c36024Sw1.f34506b;
        }
        return c36024Sw1.m84594a(wireSkuScanItem, wireSkuOrder);
    }

    /* renamed from: a */
    public final C36024Sw1 m84594a(WireSkuScanItem scanItem, WireSkuOrder skuOrder) {
        Intrinsics.checkNotNullParameter(scanItem, "scanItem");
        Intrinsics.checkNotNullParameter(skuOrder, "skuOrder");
        return new C36024Sw1(scanItem, skuOrder);
    }

    /* renamed from: b */
    public final WireSkuScanItem m84593b() {
        return this.f34505a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C36024Sw1) {
            C36024Sw1 c36024Sw1 = (C36024Sw1) obj;
            return Intrinsics.areEqual(this.f34505a, c36024Sw1.f34505a) && Intrinsics.areEqual(this.f34506b, c36024Sw1.f34506b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f34505a.hashCode() * 31) + this.f34506b.hashCode();
    }

    public String toString() {
        WireSkuScanItem wireSkuScanItem = this.f34505a;
        WireSkuOrder wireSkuOrder = this.f34506b;
        return "ForceScanConfirmation(scanItem=" + wireSkuScanItem + ", skuOrder=" + wireSkuOrder + ")";
    }
}
