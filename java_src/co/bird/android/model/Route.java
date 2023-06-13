package co.bird.android.model;

import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m28432d2 = {"Lco/bird/android/model/Route;", "", "points", "", "Lcom/google/android/gms/maps/model/LatLng;", "distanceMeters", "", "durationSeconds", "", "(Ljava/util/List;IJ)V", "getDistanceMeters", "()I", "getDurationSeconds", "()J", "getPoints", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class Route {
    private final int distanceMeters;
    private final long durationSeconds;
    private final List<LatLng> points;

    public Route() {
        this(null, 0, 0L, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Route copy$default(Route route, List list, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = route.points;
        }
        if ((i2 & 2) != 0) {
            i = route.distanceMeters;
        }
        if ((i2 & 4) != 0) {
            j = route.durationSeconds;
        }
        return route.copy(list, i, j);
    }

    public final List<LatLng> component1() {
        return this.points;
    }

    public final int component2() {
        return this.distanceMeters;
    }

    public final long component3() {
        return this.durationSeconds;
    }

    public final Route copy(List<LatLng> points, int i, long j) {
        Intrinsics.checkNotNullParameter(points, "points");
        return new Route(points, i, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Route) {
            Route route = (Route) obj;
            return Intrinsics.areEqual(this.points, route.points) && this.distanceMeters == route.distanceMeters && this.durationSeconds == route.durationSeconds;
        }
        return false;
    }

    public final int getDistanceMeters() {
        return this.distanceMeters;
    }

    public final long getDurationSeconds() {
        return this.durationSeconds;
    }

    public final List<LatLng> getPoints() {
        return this.points;
    }

    public int hashCode() {
        return (((this.points.hashCode() * 31) + Integer.hashCode(this.distanceMeters)) * 31) + Long.hashCode(this.durationSeconds);
    }

    public String toString() {
        List<LatLng> list = this.points;
        int i = this.distanceMeters;
        long j = this.durationSeconds;
        return "Route(points=" + list + ", distanceMeters=" + i + ", durationSeconds=" + j + ")";
    }

    public Route(List<LatLng> points, int i, long j) {
        Intrinsics.checkNotNullParameter(points, "points");
        this.points = points;
        this.distanceMeters = i;
        this.durationSeconds = j;
    }

    public /* synthetic */ Route(List list, int i, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? 0L : j);
    }
}
