package co.bird.android.model;

import co.bird.android.model.wire.WireLocation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m28432d2 = {"Lco/bird/android/model/BleScanResult;", "", "LTk5;", "component1", "Lco/bird/android/model/wire/WireLocation;", "component2", "scanResult", "location", "copy", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "LTk5;", "getScanResult", "()LTk5;", "Lco/bird/android/model/wire/WireLocation;", "getLocation", "()Lco/bird/android/model/wire/WireLocation;", "<init>", "(LTk5;Lco/bird/android/model/wire/WireLocation;)V", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class BleScanResult {
    private final WireLocation location;
    private final C36154Tk5 scanResult;

    public BleScanResult(C36154Tk5 scanResult, WireLocation location) {
        Intrinsics.checkNotNullParameter(scanResult, "scanResult");
        Intrinsics.checkNotNullParameter(location, "location");
        this.scanResult = scanResult;
        this.location = location;
    }

    public static /* synthetic */ BleScanResult copy$default(BleScanResult bleScanResult, C36154Tk5 c36154Tk5, WireLocation wireLocation, int i, Object obj) {
        if ((i & 1) != 0) {
            c36154Tk5 = bleScanResult.scanResult;
        }
        if ((i & 2) != 0) {
            wireLocation = bleScanResult.location;
        }
        return bleScanResult.copy(c36154Tk5, wireLocation);
    }

    public final C36154Tk5 component1() {
        return this.scanResult;
    }

    public final WireLocation component2() {
        return this.location;
    }

    public final BleScanResult copy(C36154Tk5 scanResult, WireLocation location) {
        Intrinsics.checkNotNullParameter(scanResult, "scanResult");
        Intrinsics.checkNotNullParameter(location, "location");
        return new BleScanResult(scanResult, location);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BleScanResult) {
            BleScanResult bleScanResult = (BleScanResult) obj;
            return Intrinsics.areEqual(this.scanResult, bleScanResult.scanResult) && Intrinsics.areEqual(this.location, bleScanResult.location);
        }
        return false;
    }

    public final WireLocation getLocation() {
        return this.location;
    }

    public final C36154Tk5 getScanResult() {
        return this.scanResult;
    }

    public int hashCode() {
        return (this.scanResult.hashCode() * 31) + this.location.hashCode();
    }

    public String toString() {
        C36154Tk5 c36154Tk5 = this.scanResult;
        WireLocation wireLocation = this.location;
        return "BleScanResult(scanResult=" + c36154Tk5 + ", location=" + wireLocation + ")";
    }
}
