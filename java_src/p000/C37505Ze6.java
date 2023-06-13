package p000;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireSkuOrder;
import co.bird.android.model.wire.WireSuccessfulScannedItem;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ1\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, m28432d2 = {"LZe6;", "LOC5;", "Lco/bird/android/model/wire/WireSkuOrder;", "skuOrder", "", "Lco/bird/android/model/wire/WireSuccessfulScannedItem;", "scannedItems", "", "error", "c", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", C17296a.f69688o, "Lco/bird/android/model/wire/WireSkuOrder;", "()Lco/bird/android/model/wire/WireSkuOrder;", "b", "Ljava/util/List;", "()Ljava/util/List;", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;", "<init>", "(Lco/bird/android/model/wire/WireSkuOrder;Ljava/util/List;Ljava/lang/Throwable;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ze6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37505Ze6 implements OC5 {

    /* renamed from: a */
    public final WireSkuOrder f48897a;

    /* renamed from: b */
    public final List<WireSuccessfulScannedItem> f48898b;

    /* renamed from: c */
    public final Throwable f48899c;

    public C37505Ze6() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C37505Ze6 copy$default(C37505Ze6 c37505Ze6, WireSkuOrder wireSkuOrder, List list, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            wireSkuOrder = c37505Ze6.f48897a;
        }
        if ((i & 2) != 0) {
            list = c37505Ze6.f48898b;
        }
        if ((i & 4) != 0) {
            th = c37505Ze6.f48899c;
        }
        return c37505Ze6.m72800c(wireSkuOrder, list, th);
    }

    @Override // p000.OC5
    /* renamed from: a */
    public WireSkuOrder mo72802a() {
        return this.f48897a;
    }

    @Override // p000.OC5
    /* renamed from: b */
    public List<WireSuccessfulScannedItem> mo72801b() {
        return this.f48898b;
    }

    /* renamed from: c */
    public final C37505Ze6 m72800c(WireSkuOrder wireSkuOrder, List<WireSuccessfulScannedItem> scannedItems, Throwable th) {
        Intrinsics.checkNotNullParameter(scannedItems, "scannedItems");
        return new C37505Ze6(wireSkuOrder, scannedItems, th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C37505Ze6) {
            C37505Ze6 c37505Ze6 = (C37505Ze6) obj;
            return Intrinsics.areEqual(this.f48897a, c37505Ze6.f48897a) && Intrinsics.areEqual(this.f48898b, c37505Ze6.f48898b) && Intrinsics.areEqual(this.f48899c, c37505Ze6.f48899c);
        }
        return false;
    }

    @Override // p000.OC5
    public Throwable getError() {
        return this.f48899c;
    }

    public int hashCode() {
        WireSkuOrder wireSkuOrder = this.f48897a;
        int hashCode = (((wireSkuOrder == null ? 0 : wireSkuOrder.hashCode()) * 31) + this.f48898b.hashCode()) * 31;
        Throwable th = this.f48899c;
        return hashCode + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        WireSkuOrder wireSkuOrder = this.f48897a;
        List<WireSuccessfulScannedItem> list = this.f48898b;
        Throwable th = this.f48899c;
        return "UpdateUi(skuOrder=" + wireSkuOrder + ", scannedItems=" + list + ", error=" + th + ")";
    }

    public C37505Ze6(WireSkuOrder wireSkuOrder, List<WireSuccessfulScannedItem> scannedItems, Throwable th) {
        Intrinsics.checkNotNullParameter(scannedItems, "scannedItems");
        this.f48897a = wireSkuOrder;
        this.f48898b = scannedItems;
        this.f48899c = th;
    }

    public /* synthetic */ C37505Ze6(WireSkuOrder wireSkuOrder, List list, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : wireSkuOrder, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : th);
    }
}
