package co.bird.android.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m28432d2 = {"Lco/bird/android/model/DirectionsButton;", "Lco/bird/android/model/BountyFlightSheetButton;", "point", "Lco/bird/android/model/Point;", "(Lco/bird/android/model/Point;)V", "getPoint", "()Lco/bird/android/model/Point;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class DirectionsButton extends BountyFlightSheetButton {
    private final Point point;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectionsButton(Point point) {
        super(null);
        Intrinsics.checkNotNullParameter(point, "point");
        this.point = point;
    }

    public static /* synthetic */ DirectionsButton copy$default(DirectionsButton directionsButton, Point point, int i, Object obj) {
        if ((i & 1) != 0) {
            point = directionsButton.point;
        }
        return directionsButton.copy(point);
    }

    public final Point component1() {
        return this.point;
    }

    public final DirectionsButton copy(Point point) {
        Intrinsics.checkNotNullParameter(point, "point");
        return new DirectionsButton(point);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DirectionsButton) && Intrinsics.areEqual(this.point, ((DirectionsButton) obj).point);
    }

    public final Point getPoint() {
        return this.point;
    }

    public int hashCode() {
        return this.point.hashCode();
    }

    public String toString() {
        Point point = this.point;
        return "DirectionsButton(point=" + point + ")";
    }
}
