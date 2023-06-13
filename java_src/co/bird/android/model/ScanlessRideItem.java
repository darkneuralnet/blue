package co.bird.android.model;

import co.bird.android.model.wire.WireBird;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m28432d2 = {"Lco/bird/android/model/ScanlessRideItem;", "", "Lco/bird/android/model/wire/WireBird;", "component1", "LTk5;", "component2", "", "component3", "bird", "scanResult", "score", "copy", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/model/wire/WireBird;", "getBird", "()Lco/bird/android/model/wire/WireBird;", "LTk5;", "getScanResult", "()LTk5;", "D", "getScore", "()D", "<init>", "(Lco/bird/android/model/wire/WireBird;LTk5;D)V", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class ScanlessRideItem {
    private final WireBird bird;
    private final C36154Tk5 scanResult;
    private final double score;

    public ScanlessRideItem(WireBird bird, C36154Tk5 scanResult, double d) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(scanResult, "scanResult");
        this.bird = bird;
        this.scanResult = scanResult;
        this.score = d;
    }

    public static /* synthetic */ ScanlessRideItem copy$default(ScanlessRideItem scanlessRideItem, WireBird wireBird, C36154Tk5 c36154Tk5, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            wireBird = scanlessRideItem.bird;
        }
        if ((i & 2) != 0) {
            c36154Tk5 = scanlessRideItem.scanResult;
        }
        if ((i & 4) != 0) {
            d = scanlessRideItem.score;
        }
        return scanlessRideItem.copy(wireBird, c36154Tk5, d);
    }

    public final WireBird component1() {
        return this.bird;
    }

    public final C36154Tk5 component2() {
        return this.scanResult;
    }

    public final double component3() {
        return this.score;
    }

    public final ScanlessRideItem copy(WireBird bird, C36154Tk5 scanResult, double d) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(scanResult, "scanResult");
        return new ScanlessRideItem(bird, scanResult, d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ScanlessRideItem) {
            ScanlessRideItem scanlessRideItem = (ScanlessRideItem) obj;
            return Intrinsics.areEqual(this.bird, scanlessRideItem.bird) && Intrinsics.areEqual(this.scanResult, scanlessRideItem.scanResult) && Double.compare(this.score, scanlessRideItem.score) == 0;
        }
        return false;
    }

    public final WireBird getBird() {
        return this.bird;
    }

    public final C36154Tk5 getScanResult() {
        return this.scanResult;
    }

    public final double getScore() {
        return this.score;
    }

    public int hashCode() {
        return (((this.bird.hashCode() * 31) + this.scanResult.hashCode()) * 31) + Double.hashCode(this.score);
    }

    public String toString() {
        WireBird wireBird = this.bird;
        C36154Tk5 c36154Tk5 = this.scanResult;
        double d = this.score;
        return "ScanlessRideItem(bird=" + wireBird + ", scanResult=" + c36154Tk5 + ", score=" + d + ")";
    }
}
