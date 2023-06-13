package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: B31 */
/* loaded from: classes3.dex */
public final class B31 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f1567a;

    /* renamed from: b */
    public final TextView f1568b;

    /* renamed from: c */
    public final Button f1569c;

    /* renamed from: d */
    public final FrameLayout f1570d;

    /* renamed from: e */
    public final ImageView f1571e;

    /* renamed from: f */
    public final TextView f1572f;

    public B31(ConstraintLayout constraintLayout, TextView textView, Button button, FrameLayout frameLayout, ImageView imageView, TextView textView2) {
        this.f1567a = constraintLayout;
        this.f1568b = textView;
        this.f1569c = button;
        this.f1570d = frameLayout;
        this.f1571e = imageView;
        this.f1572f = textView2;
    }

    /* renamed from: a */
    public static B31 m114771a(View view) {
        int i = C39912di4.body;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C39912di4.complete;
            Button button = (Button) C34328Lp6.m96312a(view, i);
            if (button != null) {
                i = C39912di4.confetti;
                FrameLayout frameLayout = (FrameLayout) C34328Lp6.m96312a(view, i);
                if (frameLayout != null) {
                    i = C39912di4.image;
                    ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                    if (imageView != null) {
                        i = C39912di4.title;
                        TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView2 != null) {
                            return new B31((ConstraintLayout) view, textView, button, frameLayout, imageView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static B31 m114769c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C35442Qj4.dialog_operator_order_complete, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m114771a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f1567a;
    }
}
