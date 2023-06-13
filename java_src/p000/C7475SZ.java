package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: SZ */
/* loaded from: classes3.dex */
public final class C7475SZ implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f33881a;

    /* renamed from: b */
    public final View f33882b;

    /* renamed from: c */
    public final Button f33883c;

    /* renamed from: d */
    public final ConstraintLayout f33884d;

    /* renamed from: e */
    public final ImageView f33885e;

    /* renamed from: f */
    public final TextView f33886f;

    public C7475SZ(ConstraintLayout constraintLayout, View view, Button button, ConstraintLayout constraintLayout2, ImageView imageView, TextView textView) {
        this.f33881a = constraintLayout;
        this.f33882b = view;
        this.f33883c = button;
        this.f33884d = constraintLayout2;
        this.f33885e = imageView;
        this.f33886f = textView;
    }

    /* renamed from: a */
    public static C7475SZ m85292a(View view) {
        int i = C33084Gh4.background;
        View m96312a = C34328Lp6.m96312a(view, i);
        if (m96312a != null) {
            i = C33084Gh4.confirm;
            Button button = (Button) C34328Lp6.m96312a(view, i);
            if (button != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = C33084Gh4.imageView;
                ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView != null) {
                    i = C33084Gh4.title;
                    TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView != null) {
                        return new C7475SZ(constraintLayout, m96312a, button, constraintLayout, imageView, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C7475SZ m85290c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C49408tj4.bottom_sheet_one_flow_onboarding, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m85292a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f33881a;
    }
}
