package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.widget.PieChart;
/* renamed from: Rb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35602Rb2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f32264a;

    /* renamed from: b */
    public final ImageView f32265b;

    /* renamed from: c */
    public final TextView f32266c;

    /* renamed from: d */
    public final PieChart f32267d;

    /* renamed from: e */
    public final TextView f32268e;

    public C35602Rb2(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, PieChart pieChart, TextView textView2) {
        this.f32264a = constraintLayout;
        this.f32265b = imageView;
        this.f32266c = textView;
        this.f32267d = pieChart;
        this.f32268e = textView2;
    }

    /* renamed from: a */
    public static C35602Rb2 m86576a(View view) {
        int i = C45831nh4.chevron;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C45831nh4.description;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C45831nh4.pieChart;
                PieChart pieChart = (PieChart) C34328Lp6.m96312a(view, i);
                if (pieChart != null) {
                    i = C45831nh4.title;
                    TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView2 != null) {
                        return new C35602Rb2((ConstraintLayout) view, imageView, textView, pieChart, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f32264a;
    }
}
