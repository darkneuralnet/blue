package co.bird.android.app.feature.map.p008ui;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.Area;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m28432d2 = {"Lco/bird/android/app/feature/map/ui/RichPolygonArea;", "", "Lzp0;", "component1", "Lco/bird/android/model/persistence/Area;", "component2", "commonPolygon", "area", "copy", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lzp0;", "getCommonPolygon", "()Lzp0;", "Lco/bird/android/model/persistence/Area;", "getArea", "()Lco/bird/android/model/persistence/Area;", "<init>", "(Lzp0;Lco/bird/android/model/persistence/Area;)V", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.app.feature.map.ui.RichPolygonArea */
/* loaded from: classes2.dex */
final class RichPolygonArea {
    private final Area area;
    private final C53021zp0 commonPolygon;

    public RichPolygonArea(C53021zp0 commonPolygon, Area area) {
        Intrinsics.checkNotNullParameter(commonPolygon, "commonPolygon");
        Intrinsics.checkNotNullParameter(area, "area");
        this.commonPolygon = commonPolygon;
        this.area = area;
    }

    public static /* synthetic */ RichPolygonArea copy$default(RichPolygonArea richPolygonArea, C53021zp0 c53021zp0, Area area, int i, Object obj) {
        if ((i & 1) != 0) {
            c53021zp0 = richPolygonArea.commonPolygon;
        }
        if ((i & 2) != 0) {
            area = richPolygonArea.area;
        }
        return richPolygonArea.copy(c53021zp0, area);
    }

    public final C53021zp0 component1() {
        return this.commonPolygon;
    }

    public final Area component2() {
        return this.area;
    }

    public final RichPolygonArea copy(C53021zp0 commonPolygon, Area area) {
        Intrinsics.checkNotNullParameter(commonPolygon, "commonPolygon");
        Intrinsics.checkNotNullParameter(area, "area");
        return new RichPolygonArea(commonPolygon, area);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RichPolygonArea) {
            RichPolygonArea richPolygonArea = (RichPolygonArea) obj;
            return Intrinsics.areEqual(this.commonPolygon, richPolygonArea.commonPolygon) && Intrinsics.areEqual(this.area, richPolygonArea.area);
        }
        return false;
    }

    public final Area getArea() {
        return this.area;
    }

    public final C53021zp0 getCommonPolygon() {
        return this.commonPolygon;
    }

    public int hashCode() {
        return (this.commonPolygon.hashCode() * 31) + this.area.hashCode();
    }

    public String toString() {
        C53021zp0 c53021zp0 = this.commonPolygon;
        Area area = this.area;
        return "RichPolygonArea(commonPolygon=" + c53021zp0 + ", area=" + area + ")";
    }
}
