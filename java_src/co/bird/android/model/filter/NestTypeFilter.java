package co.bird.android.model.filter;

import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\u0003J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0006\u0010\u000e\u001a\u00020\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m28432d2 = {"Lco/bird/android/model/filter/NestTypeFilter;", "", "showParkingNest", "", "(Z)V", "getShowParkingNest", "()Z", "atLeastOneEnabled", "component1", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "shouldShowNests", "toString", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class NestTypeFilter {
    private final boolean showParkingNest;

    public NestTypeFilter() {
        this(false, 1, null);
    }

    public static /* synthetic */ NestTypeFilter copy$default(NestTypeFilter nestTypeFilter, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = nestTypeFilter.showParkingNest;
        }
        return nestTypeFilter.copy(z);
    }

    public final boolean atLeastOneEnabled() {
        return this.showParkingNest;
    }

    public final boolean component1() {
        return this.showParkingNest;
    }

    public final NestTypeFilter copy(boolean z) {
        return new NestTypeFilter(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NestTypeFilter) && this.showParkingNest == ((NestTypeFilter) obj).showParkingNest;
    }

    public final boolean getShowParkingNest() {
        return this.showParkingNest;
    }

    public int hashCode() {
        boolean z = this.showParkingNest;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final boolean shouldShowNests() {
        return this.showParkingNest;
    }

    public String toString() {
        boolean z = this.showParkingNest;
        return "NestTypeFilter(showParkingNest=" + z + ")";
    }

    public NestTypeFilter(boolean z) {
        this.showParkingNest = z;
    }

    public /* synthetic */ NestTypeFilter(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
