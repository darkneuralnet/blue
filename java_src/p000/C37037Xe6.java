package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireItemScrapReason;
import co.bird.android.model.wire.WireSkuScanItem;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ1\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0018\u001a\u0004\b\u0015\u0010\u0019¨\u0006\u001c"}, m28432d2 = {"LXe6;", "LNo5;", "Lco/bird/android/model/wire/WireSkuScanItem;", "scanItem", "", "Lco/bird/android/model/wire/WireItemScrapReason;", "reasons", "selectedReason", DateTokenConverter.CONVERTER_KEY, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", C17296a.f69688o, "Lco/bird/android/model/wire/WireSkuScanItem;", "c", "()Lco/bird/android/model/wire/WireSkuScanItem;", "b", "Ljava/util/List;", "()Ljava/util/List;", "Lco/bird/android/model/wire/WireItemScrapReason;", "()Lco/bird/android/model/wire/WireItemScrapReason;", "<init>", "(Lco/bird/android/model/wire/WireSkuScanItem;Ljava/util/List;Lco/bird/android/model/wire/WireItemScrapReason;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Xe6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37037Xe6 implements InterfaceC34786No5 {

    /* renamed from: a */
    public final WireSkuScanItem f43496a;

    /* renamed from: b */
    public final List<WireItemScrapReason> f43497b;

    /* renamed from: c */
    public final WireItemScrapReason f43498c;

    public C37037Xe6() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C37037Xe6 copy$default(C37037Xe6 c37037Xe6, WireSkuScanItem wireSkuScanItem, List list, WireItemScrapReason wireItemScrapReason, int i, Object obj) {
        if ((i & 1) != 0) {
            wireSkuScanItem = c37037Xe6.f43496a;
        }
        if ((i & 2) != 0) {
            list = c37037Xe6.f43497b;
        }
        if ((i & 4) != 0) {
            wireItemScrapReason = c37037Xe6.f43498c;
        }
        return c37037Xe6.m76737d(wireSkuScanItem, list, wireItemScrapReason);
    }

    @Override // p000.InterfaceC34786No5
    /* renamed from: a */
    public List<WireItemScrapReason> mo76740a() {
        return this.f43497b;
    }

    @Override // p000.InterfaceC34786No5
    /* renamed from: b */
    public WireItemScrapReason mo76739b() {
        return this.f43498c;
    }

    @Override // p000.InterfaceC34786No5
    /* renamed from: c */
    public WireSkuScanItem mo76738c() {
        return this.f43496a;
    }

    /* renamed from: d */
    public final C37037Xe6 m76737d(WireSkuScanItem wireSkuScanItem, List<WireItemScrapReason> reasons, WireItemScrapReason wireItemScrapReason) {
        Intrinsics.checkNotNullParameter(reasons, "reasons");
        return new C37037Xe6(wireSkuScanItem, reasons, wireItemScrapReason);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C37037Xe6) {
            C37037Xe6 c37037Xe6 = (C37037Xe6) obj;
            return Intrinsics.areEqual(this.f43496a, c37037Xe6.f43496a) && Intrinsics.areEqual(this.f43497b, c37037Xe6.f43497b) && Intrinsics.areEqual(this.f43498c, c37037Xe6.f43498c);
        }
        return false;
    }

    public int hashCode() {
        WireSkuScanItem wireSkuScanItem = this.f43496a;
        int hashCode = (((wireSkuScanItem == null ? 0 : wireSkuScanItem.hashCode()) * 31) + this.f43497b.hashCode()) * 31;
        WireItemScrapReason wireItemScrapReason = this.f43498c;
        return hashCode + (wireItemScrapReason != null ? wireItemScrapReason.hashCode() : 0);
    }

    public String toString() {
        WireSkuScanItem wireSkuScanItem = this.f43496a;
        List<WireItemScrapReason> list = this.f43497b;
        WireItemScrapReason wireItemScrapReason = this.f43498c;
        return "UpdateUi(scanItem=" + wireSkuScanItem + ", reasons=" + list + ", selectedReason=" + wireItemScrapReason + ")";
    }

    public C37037Xe6(WireSkuScanItem wireSkuScanItem, List<WireItemScrapReason> reasons, WireItemScrapReason wireItemScrapReason) {
        Intrinsics.checkNotNullParameter(reasons, "reasons");
        this.f43496a = wireSkuScanItem;
        this.f43497b = reasons;
        this.f43498c = wireItemScrapReason;
    }

    public /* synthetic */ C37037Xe6(WireSkuScanItem wireSkuScanItem, List list, WireItemScrapReason wireItemScrapReason, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : wireSkuScanItem, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : wireItemScrapReason);
    }
}
