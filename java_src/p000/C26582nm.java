package p000;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireTransferOrderFilter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J3\u0010\b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m28432d2 = {"Lnm;", "Lw86;", "", "Lco/bird/android/model/wire/WireTransferOrderFilter;", "filters", "selected", "", "loading", "b", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", C17296a.f69688o, "Ljava/util/List;", "getFilters", "()Ljava/util/List;", "c", "Z", "getLoading", "()Z", "<init>", "(Ljava/util/List;Ljava/util/List;Z)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: nm */
/* loaded from: classes3.dex */
public final class C26582nm implements InterfaceC50844w86 {

    /* renamed from: a */
    public final List<WireTransferOrderFilter> f100479a;

    /* renamed from: b */
    public final List<WireTransferOrderFilter> f100480b;

    /* renamed from: c */
    public final boolean f100481c;

    public C26582nm() {
        this(null, null, false, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C26582nm copy$default(C26582nm c26582nm, List list, List list2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = c26582nm.f100479a;
        }
        if ((i & 2) != 0) {
            list2 = c26582nm.f100480b;
        }
        if ((i & 4) != 0) {
            z = c26582nm.f100481c;
        }
        return c26582nm.m23208b(list, list2, z);
    }

    @Override // p000.InterfaceC50844w86
    /* renamed from: a */
    public List<WireTransferOrderFilter> mo7357a() {
        return this.f100480b;
    }

    /* renamed from: b */
    public final C26582nm m23208b(List<WireTransferOrderFilter> filters, List<WireTransferOrderFilter> selected, boolean z) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(selected, "selected");
        return new C26582nm(filters, selected, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C26582nm) {
            C26582nm c26582nm = (C26582nm) obj;
            return Intrinsics.areEqual(this.f100479a, c26582nm.f100479a) && Intrinsics.areEqual(this.f100480b, c26582nm.f100480b) && this.f100481c == c26582nm.f100481c;
        }
        return false;
    }

    @Override // p000.InterfaceC50844w86
    public List<WireTransferOrderFilter> getFilters() {
        return this.f100479a;
    }

    @Override // p000.InterfaceC50844w86
    public boolean getLoading() {
        return this.f100481c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f100479a.hashCode() * 31) + this.f100480b.hashCode()) * 31;
        boolean z = this.f100481c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        List<WireTransferOrderFilter> list = this.f100479a;
        List<WireTransferOrderFilter> list2 = this.f100480b;
        boolean z = this.f100481c;
        return "Apply(filters=" + list + ", selected=" + list2 + ", loading=" + z + ")";
    }

    public C26582nm(List<WireTransferOrderFilter> filters, List<WireTransferOrderFilter> selected, boolean z) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(selected, "selected");
        this.f100479a = filters;
        this.f100480b = selected;
        this.f100481c = z;
    }

    public /* synthetic */ C26582nm(List list, List list2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i & 4) != 0 ? false : z);
    }
}
