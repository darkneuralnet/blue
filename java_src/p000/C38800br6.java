package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.feature.fleetstatus.kpi.views.FleetReportChartLegendView;
/* renamed from: br6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38800br6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f59640a;

    /* renamed from: b */
    public final TextView f59641b;

    /* renamed from: c */
    public final TextView f59642c;

    /* renamed from: d */
    public final ConstraintLayout f59643d;

    /* renamed from: e */
    public final View f59644e;

    /* renamed from: f */
    public final ImageView f59645f;

    /* renamed from: g */
    public final FleetReportChartLegendView f59646g;

    /* renamed from: h */
    public final ImageView f59647h;

    /* renamed from: i */
    public final TextView f59648i;

    /* renamed from: j */
    public final TextView f59649j;

    /* renamed from: k */
    public final TextView f59650k;

    /* renamed from: l */
    public final ImageView f59651l;

    public C38800br6(View view, TextView textView, TextView textView2, ConstraintLayout constraintLayout, View view2, ImageView imageView, FleetReportChartLegendView fleetReportChartLegendView, ImageView imageView2, TextView textView3, TextView textView4, TextView textView5, ImageView imageView3) {
        this.f59640a = view;
        this.f59641b = textView;
        this.f59642c = textView2;
        this.f59643d = constraintLayout;
        this.f59644e = view2;
        this.f59645f = imageView;
        this.f59646g = fleetReportChartLegendView;
        this.f59647h = imageView2;
        this.f59648i = textView3;
        this.f59649j = textView4;
        this.f59650k = textView5;
        this.f59651l = imageView3;
    }

    /* renamed from: a */
    public static C38800br6 m62275a(View view) {
        View m96312a;
        int i = C45831nh4.actualValue;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C45831nh4.actualValueMessage;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                i = C45831nh4.constraintLayout;
                ConstraintLayout constraintLayout = (ConstraintLayout) C34328Lp6.m96312a(view, i);
                if (constraintLayout != null && (m96312a = C34328Lp6.m96312a(view, (i = C45831nh4.divider))) != null) {
                    i = C45831nh4.infoIcon;
                    ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                    if (imageView != null) {
                        i = C45831nh4.legend;
                        FleetReportChartLegendView fleetReportChartLegendView = (FleetReportChartLegendView) C34328Lp6.m96312a(view, i);
                        if (fleetReportChartLegendView != null) {
                            i = C45831nh4.targetIcon;
                            ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                            if (imageView2 != null) {
                                i = C45831nh4.targetValue;
                                TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView3 != null) {
                                    i = C45831nh4.targetValueMessage;
                                    TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                                    if (textView4 != null) {
                                        i = C45831nh4.title;
                                        TextView textView5 = (TextView) C34328Lp6.m96312a(view, i);
                                        if (textView5 != null) {
                                            i = C45831nh4.titleIcon;
                                            ImageView imageView3 = (ImageView) C34328Lp6.m96312a(view, i);
                                            if (imageView3 != null) {
                                                return new C38800br6(view, textView, textView2, constraintLayout, m96312a, imageView, fleetReportChartLegendView, imageView2, textView3, textView4, textView5, imageView3);
                                            }
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

    /* renamed from: b */
    public static C38800br6 m62274b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C38125aj4.view_fleet_report_panel, viewGroup);
            return m62275a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f59640a;
    }
}
