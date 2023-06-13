package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: vy1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50740vy1 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f115014a;

    /* renamed from: b */
    public final View f115015b;

    /* renamed from: c */
    public final Button f115016c;

    /* renamed from: d */
    public final TextView f115017d;

    /* renamed from: e */
    public final TextView f115018e;

    /* renamed from: f */
    public final ImageView f115019f;

    public C50740vy1(ConstraintLayout constraintLayout, View view, Button button, TextView textView, TextView textView2, ImageView imageView) {
        this.f115014a = constraintLayout;
        this.f115015b = view;
        this.f115016c = button;
        this.f115017d = textView;
        this.f115018e = textView2;
        this.f115019f = imageView;
    }

    /* renamed from: a */
    public static C50740vy1 m7687a(View view) {
        int i = C52352yh4.iconInflectionPoint;
        View m96312a = C34328Lp6.m96312a(view, i);
        if (m96312a != null) {
            i = C52352yh4.inspectionButton;
            Button button = (Button) C34328Lp6.m96312a(view, i);
            if (button != null) {
                i = C52352yh4.repairsDescription;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    i = C52352yh4.repairsTitle;
                    TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView2 != null) {
                        i = C52352yh4.vehicleImage;
                        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                        if (imageView != null) {
                            return new C50740vy1((ConstraintLayout) view, m96312a, button, textView, textView2, imageView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C50740vy1 m7685c(LayoutInflater layoutInflater) {
        return m7684d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C50740vy1 m7684d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C44665lj4.fragment_repairs_landing, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m7687a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f115014a;
    }
}
