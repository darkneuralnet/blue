package p000;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireTransferOrderFilter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J3\u0010\b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m28432d2 = {"Lcl0;", "Lw86;", "", "Lco/bird/android/model/wire/WireTransferOrderFilter;", "filters", "selected", "", "loading", "b", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", C17296a.f69688o, "Ljava/util/List;", "getFilters", "()Ljava/util/List;", "c", "Z", "getLoading", "()Z", "<init>", "(Ljava/util/List;Ljava/util/List;Z)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: cl0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39327cl0 implements InterfaceC50844w86 {

    /* renamed from: a */
    public final List<WireTransferOrderFilter> f61175a;

    /* renamed from: b */
    public final List<WireTransferOrderFilter> f61176b;

    /* renamed from: c */
    public final boolean f61177c;

    public C39327cl0() {
        this(null, null, false, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C39327cl0 copy$default(C39327cl0 c39327cl0, List list, List list2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = c39327cl0.f61175a;
        }
        if ((i & 2) != 0) {
            list2 = c39327cl0.f61176b;
        }
        if ((i & 4) != 0) {
            z = c39327cl0.f61177c;
        }
        return c39327cl0.m60939b(list, list2, z);
    }

    @Override // p000.InterfaceC50844w86
    /* renamed from: a */
    public List<WireTransferOrderFilter> mo7357a() {
        return this.f61176b;
    }

    /* renamed from: b */
    public final C39327cl0 m60939b(List<WireTransferOrderFilter> filters, List<WireTransferOrderFilter> selected, boolean z) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(selected, "selected");
        return new C39327cl0(filters, selected, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C39327cl0) {
            C39327cl0 c39327cl0 = (C39327cl0) obj;
            return Intrinsics.areEqual(this.f61175a, c39327cl0.f61175a) && Intrinsics.areEqual(this.f61176b, c39327cl0.f61176b) && this.f61177c == c39327cl0.f61177c;
        }
        return false;
    }

    @Override // p000.InterfaceC50844w86
    public List<WireTransferOrderFilter> getFilters() {
        return this.f61175a;
    }

    @Override // p000.InterfaceC50844w86
    public boolean getLoading() {
        return this.f61177c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f61175a.hashCode() * 31) + this.f61176b.hashCode()) * 31;
        boolean z = this.f61177c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        List<WireTransferOrderFilter> list = this.f61175a;
        List<WireTransferOrderFilter> list2 = this.f61176b;
        boolean z = this.f61177c;
        return "Close(filters=" + list + ", selected=" + list2 + ", loading=" + z + ")";
    }

    public C39327cl0(List<WireTransferOrderFilter> filters, List<WireTransferOrderFilter> selected, boolean z) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(selected, "selected");
        this.f61175a = filters;
        this.f61176b = selected;
        this.f61177c = z;
    }

    public /* synthetic */ C39327cl0(List list, List list2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i & 4) != 0 ? false : z);
    }
}
