package p000;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.RidePassView;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m28432d2 = {"LTU4;", "", "Lco/bird/android/model/persistence/RidePassView;", "ridePassView", "", "showPlusTaxDisclosure", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Lco/bird/android/model/persistence/RidePassView;", "b", "()Lco/bird/android/model/persistence/RidePassView;", "Z", "c", "()Z", "<init>", "(Lco/bird/android/model/persistence/RidePassView;Z)V", "ride-pass_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: TU4 */
/* loaded from: classes3.dex */
public final class TU4 {

    /* renamed from: a */
    public final RidePassView f35542a;

    /* renamed from: b */
    public final boolean f35543b;

    public TU4(RidePassView ridePassView, boolean z) {
        Intrinsics.checkNotNullParameter(ridePassView, "ridePassView");
        this.f35542a = ridePassView;
        this.f35543b = z;
    }

    public static /* synthetic */ TU4 copy$default(TU4 tu4, RidePassView ridePassView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            ridePassView = tu4.f35542a;
        }
        if ((i & 2) != 0) {
            z = tu4.f35543b;
        }
        return tu4.m83574a(ridePassView, z);
    }

    /* renamed from: a */
    public final TU4 m83574a(RidePassView ridePassView, boolean z) {
        Intrinsics.checkNotNullParameter(ridePassView, "ridePassView");
        return new TU4(ridePassView, z);
    }

    /* renamed from: b */
    public final RidePassView m83573b() {
        return this.f35542a;
    }

    /* renamed from: c */
    public final boolean m83572c() {
        return this.f35543b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TU4) {
            TU4 tu4 = (TU4) obj;
            return Intrinsics.areEqual(this.f35542a, tu4.f35542a) && this.f35543b == tu4.f35543b;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f35542a.hashCode() * 31;
        boolean z = this.f35543b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        RidePassView ridePassView = this.f35542a;
        boolean z = this.f35543b;
        return "RidePassHeaderModel(ridePassView=" + ridePassView + ", showPlusTaxDisclosure=" + z + ")";
    }

    public /* synthetic */ TU4(RidePassView ridePassView, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ridePassView, (i & 2) != 0 ? false : z);
    }
}
