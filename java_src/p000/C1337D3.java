package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: D3 */
/* loaded from: classes3.dex */
public final class C1337D3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f5113a;

    /* renamed from: b */
    public final Button f5114b;

    /* renamed from: c */
    public final ImageView f5115c;

    /* renamed from: d */
    public final TextView f5116d;

    /* renamed from: e */
    public final ConstraintLayout f5117e;

    /* renamed from: f */
    public final TextView f5118f;

    public C1337D3(ConstraintLayout constraintLayout, Button button, ImageView imageView, TextView textView, ConstraintLayout constraintLayout2, TextView textView2) {
        this.f5113a = constraintLayout;
        this.f5114b = button;
        this.f5115c = imageView;
        this.f5116d = textView;
        this.f5117e = constraintLayout2;
        this.f5118f = textView2;
    }

    /* renamed from: a */
    public static C1337D3 m111015a(View view) {
        int i = C47017ph4.cta;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C47017ph4.icon;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null) {
                i = C47017ph4.message;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i = C47017ph4.title;
                    TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView2 != null) {
                        return new C1337D3(constraintLayout, button, imageView, textView, constraintLayout, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C1337D3 m111013c(LayoutInflater layoutInflater) {
        return m111012d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C1337D3 m111012d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C38718bj4.activity_flock_together, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111015a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f5113a;
    }
}
