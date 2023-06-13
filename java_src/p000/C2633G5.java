package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import co.bird.android.app.feature.ridedetail.widget.RideSummaryWithReceiptView;
import com.google.android.gms.maps.MapView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: G5 */
/* loaded from: classes2.dex */
public final class C2633G5 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final CoordinatorLayout f10883a;

    /* renamed from: b */
    public final NestedScrollView f10884b;

    /* renamed from: c */
    public final CoordinatorLayout f10885c;

    /* renamed from: d */
    public final MapView f10886d;

    /* renamed from: e */
    public final LinearProgressIndicator f10887e;

    /* renamed from: f */
    public final RideSummaryWithReceiptView f10888f;

    public C2633G5(CoordinatorLayout coordinatorLayout, NestedScrollView nestedScrollView, CoordinatorLayout coordinatorLayout2, MapView mapView, LinearProgressIndicator linearProgressIndicator, RideSummaryWithReceiptView rideSummaryWithReceiptView) {
        this.f10883a = coordinatorLayout;
        this.f10884b = nestedScrollView;
        this.f10885c = coordinatorLayout2;
        this.f10886d = mapView;
        this.f10887e = linearProgressIndicator;
        this.f10888f = rideSummaryWithReceiptView;
    }

    /* renamed from: a */
    public static C2633G5 m105840a(View view) {
        int i = C36585Vg4.bottom;
        NestedScrollView nestedScrollView = (NestedScrollView) C34328Lp6.m96312a(view, i);
        if (nestedScrollView != null) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
            i = C36585Vg4.mapView;
            MapView mapView = (MapView) C34328Lp6.m96312a(view, i);
            if (mapView != null) {
                i = C36585Vg4.progressBar;
                LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                if (linearProgressIndicator != null) {
                    i = C36585Vg4.rideSummaryView;
                    RideSummaryWithReceiptView rideSummaryWithReceiptView = (RideSummaryWithReceiptView) C34328Lp6.m96312a(view, i);
                    if (rideSummaryWithReceiptView != null) {
                        return new C2633G5(coordinatorLayout, nestedScrollView, coordinatorLayout, mapView, linearProgressIndicator, rideSummaryWithReceiptView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C2633G5 m105838c(LayoutInflater layoutInflater) {
        return m105837d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C2633G5 m105837d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.activity_ride_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m105840a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public CoordinatorLayout getRoot() {
        return this.f10883a;
    }
}
