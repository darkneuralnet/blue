package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.feature.fleetstatus.kpi.views.SquareFrameLayout;
import co.bird.android.widget.PieChart;
import com.google.android.material.appbar.AppBarLayout;
/* renamed from: fy1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41254fy1 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final CoordinatorLayout f81224a;

    /* renamed from: b */
    public final AppBarLayout f81225b;

    /* renamed from: c */
    public final TextView f81226c;

    /* renamed from: d */
    public final SquareFrameLayout f81227d;

    /* renamed from: e */
    public final PieChart f81228e;

    /* renamed from: f */
    public final TextView f81229f;

    /* renamed from: g */
    public final LinearLayout f81230g;

    /* renamed from: h */
    public final RecyclerView f81231h;

    /* renamed from: i */
    public final CardView f81232i;

    /* renamed from: j */
    public final RecyclerView f81233j;

    public C41254fy1(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, TextView textView, SquareFrameLayout squareFrameLayout, PieChart pieChart, TextView textView2, LinearLayout linearLayout, RecyclerView recyclerView, CardView cardView, RecyclerView recyclerView2) {
        this.f81224a = coordinatorLayout;
        this.f81225b = appBarLayout;
        this.f81226c = textView;
        this.f81227d = squareFrameLayout;
        this.f81228e = pieChart;
        this.f81229f = textView2;
        this.f81230g = linearLayout;
        this.f81231h = recyclerView;
        this.f81232i = cardView;
        this.f81233j = recyclerView2;
    }

    /* renamed from: a */
    public static C41254fy1 m40402a(View view) {
        int i = C45831nh4.appbar;
        AppBarLayout appBarLayout = (AppBarLayout) C34328Lp6.m96312a(view, i);
        if (appBarLayout != null) {
            i = C45831nh4.backToCurrent;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C45831nh4.chartFrame;
                SquareFrameLayout squareFrameLayout = (SquareFrameLayout) C34328Lp6.m96312a(view, i);
                if (squareFrameLayout != null) {
                    i = C45831nh4.pieChart;
                    PieChart pieChart = (PieChart) C34328Lp6.m96312a(view, i);
                    if (pieChart != null) {
                        i = C45831nh4.predictedStatus;
                        TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView2 != null) {
                            i = C45831nh4.predictionButton;
                            LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
                            if (linearLayout != null) {
                                i = C45831nh4.predictions;
                                RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                                if (recyclerView != null) {
                                    i = C45831nh4.predictionsFrame;
                                    CardView cardView = (CardView) C34328Lp6.m96312a(view, i);
                                    if (cardView != null) {
                                        i = C45831nh4.recyclerView;
                                        RecyclerView recyclerView2 = (RecyclerView) C34328Lp6.m96312a(view, i);
                                        if (recyclerView2 != null) {
                                            return new C41254fy1((CoordinatorLayout) view, appBarLayout, textView, squareFrameLayout, pieChart, textView2, linearLayout, recyclerView, cardView, recyclerView2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C41254fy1 m40400c(LayoutInflater layoutInflater) {
        return m40399d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C41254fy1 m40399d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C38125aj4.fragment_fleet_status, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m40402a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public CoordinatorLayout getRoot() {
        return this.f81224a;
    }
}
