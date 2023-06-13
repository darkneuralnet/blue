package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, m28432d2 = {"Lco/bird/android/model/wire/WireRiderCellRect;", "", "lo", "Lco/bird/android/model/wire/WireLocation;", "hi", "(Lco/bird/android/model/wire/WireLocation;Lco/bird/android/model/wire/WireLocation;)V", "getHi", "()Lco/bird/android/model/wire/WireLocation;", "getLo", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireRiderCellRect {
    @JsonProperty("hi")
    @InterfaceC41208ft5("hi")

    /* renamed from: hi */
    private final WireLocation f66758hi;
    @JsonProperty("lo")
    @InterfaceC41208ft5("lo")

    /* renamed from: lo */
    private final WireLocation f66759lo;

    public WireRiderCellRect(WireLocation lo, WireLocation hi) {
        Intrinsics.checkNotNullParameter(lo, "lo");
        Intrinsics.checkNotNullParameter(hi, "hi");
        this.f66759lo = lo;
        this.f66758hi = hi;
    }

    public static /* synthetic */ WireRiderCellRect copy$default(WireRiderCellRect wireRiderCellRect, WireLocation wireLocation, WireLocation wireLocation2, int i, Object obj) {
        if ((i & 1) != 0) {
            wireLocation = wireRiderCellRect.f66759lo;
        }
        if ((i & 2) != 0) {
            wireLocation2 = wireRiderCellRect.f66758hi;
        }
        return wireRiderCellRect.copy(wireLocation, wireLocation2);
    }

    public final WireLocation component1() {
        return this.f66759lo;
    }

    public final WireLocation component2() {
        return this.f66758hi;
    }

    public final WireRiderCellRect copy(WireLocation lo, WireLocation hi) {
        Intrinsics.checkNotNullParameter(lo, "lo");
        Intrinsics.checkNotNullParameter(hi, "hi");
        return new WireRiderCellRect(lo, hi);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireRiderCellRect) {
            WireRiderCellRect wireRiderCellRect = (WireRiderCellRect) obj;
            return Intrinsics.areEqual(this.f66759lo, wireRiderCellRect.f66759lo) && Intrinsics.areEqual(this.f66758hi, wireRiderCellRect.f66758hi);
        }
        return false;
    }

    public final WireLocation getHi() {
        return this.f66758hi;
    }

    public final WireLocation getLo() {
        return this.f66759lo;
    }

    public int hashCode() {
        return (this.f66759lo.hashCode() * 31) + this.f66758hi.hashCode();
    }

    public String toString() {
        WireLocation wireLocation = this.f66759lo;
        WireLocation wireLocation2 = this.f66758hi;
        return "WireRiderCellRect(lo=" + wireLocation + ", hi=" + wireLocation2 + ")";
    }
}
