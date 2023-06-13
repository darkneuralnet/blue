package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.flightsheet.FlightSheet;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: C3 */
/* loaded from: classes3.dex */
public final class C0846C3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final CoordinatorLayout f3327a;

    /* renamed from: b */
    public final Button f3328b;

    /* renamed from: c */
    public final FrameLayout f3329c;

    /* renamed from: d */
    public final FlightSheet f3330d;

    /* renamed from: e */
    public final LinearProgressIndicator f3331e;

    /* renamed from: f */
    public final RecyclerView f3332f;

    public C0846C3(CoordinatorLayout coordinatorLayout, Button button, FrameLayout frameLayout, FlightSheet flightSheet, LinearProgressIndicator linearProgressIndicator, RecyclerView recyclerView) {
        this.f3327a = coordinatorLayout;
        this.f3328b = button;
        this.f3329c = frameLayout;
        this.f3330d = flightSheet;
        this.f3331e = linearProgressIndicator;
        this.f3332f = recyclerView;
    }

    /* renamed from: a */
    public static C0846C3 m112946a(View view) {
        int i = C45831nh4.action;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C45831nh4.buttonContainer;
            FrameLayout frameLayout = (FrameLayout) C34328Lp6.m96312a(view, i);
            if (frameLayout != null) {
                i = C45831nh4.flightSheet;
                FlightSheet flightSheet = (FlightSheet) C34328Lp6.m96312a(view, i);
                if (flightSheet != null) {
                    i = C45831nh4.progressBar;
                    LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                    if (linearProgressIndicator != null) {
                        i = C45831nh4.recyclerView;
                        RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                        if (recyclerView != null) {
                            return new C0846C3((CoordinatorLayout) view, button, frameLayout, flightSheet, linearProgressIndicator, recyclerView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C0846C3 m112944c(LayoutInflater layoutInflater) {
        return m112943d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C0846C3 m112943d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C38125aj4.activity_fleet_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m112946a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public CoordinatorLayout getRoot() {
        return this.f3327a;
    }
}
