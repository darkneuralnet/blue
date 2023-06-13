package co.bird.android.app.feature.ridedetail.widget;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.MapView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\n\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\f\u0010\u000b\u001a\u00020\b*\u00020\u0006H\u0002R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u0011"}, m28432d2 = {"Lco/bird/android/app/feature/ridedetail/widget/RouteMapBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;", "Lcom/google/android/gms/maps/MapView;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "parent", "child", "Landroid/view/View;", "dependency", "", "b", "c", C17296a.f69688o, "LHL2;", "LHL2;", "mapRoute", "<init>", "(LHL2;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class RouteMapBehavior extends CoordinatorLayout.Behavior<MapView> {

    /* renamed from: a */
    public final HL2 f62705a;

    public RouteMapBehavior(HL2 mapRoute) {
        Intrinsics.checkNotNullParameter(mapRoute, "mapRoute");
        this.f62705a = mapRoute;
    }

    /* renamed from: a */
    public final boolean m59426a(View view) {
        return view.getY() > 0.0f;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: b */
    public boolean layoutDependsOn(CoordinatorLayout parent, MapView child, View dependency) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(dependency, "dependency");
        return dependency instanceof NestedScrollView;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: c */
    public synchronized boolean onDependentViewChanged(CoordinatorLayout parent, MapView child, View dependency) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(dependency, "dependency");
        if (dependency instanceof NestedScrollView) {
            C42817ic5.m33750a(child, Integer.valueOf((int) ((NestedScrollView) dependency).getY()));
            if (m59426a(dependency)) {
                this.f62705a.mo8727D8(((NestedScrollView) dependency).getWidth(), (int) ((NestedScrollView) dependency).getY());
            }
            return true;
        }
        return false;
    }
}
