package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
/* renamed from: be2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C38666be2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f57799a;

    /* renamed from: b */
    public final TextView f57800b;

    /* renamed from: c */
    public final Barrier f57801c;

    /* renamed from: d */
    public final ImageView f57802d;

    /* renamed from: e */
    public final TextView f57803e;

    /* renamed from: f */
    public final CircularProgressIndicator f57804f;

    /* renamed from: g */
    public final TextView f57805g;

    public C38666be2(ConstraintLayout constraintLayout, TextView textView, Barrier barrier, ImageView imageView, TextView textView2, CircularProgressIndicator circularProgressIndicator, TextView textView3) {
        this.f57799a = constraintLayout;
        this.f57800b = textView;
        this.f57801c = barrier;
        this.f57802d = imageView;
        this.f57803e = textView2;
        this.f57804f = circularProgressIndicator;
        this.f57805g = textView3;
    }

    /* renamed from: a */
    public static C38666be2 m64227a(View view) {
        int i = C36585Vg4.body;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C36585Vg4.endBarrier;
            Barrier barrier = (Barrier) C34328Lp6.m96312a(view, i);
            if (barrier != null) {
                i = C36585Vg4.image;
                ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView != null) {
                    i = C36585Vg4.metadata;
                    TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView2 != null) {
                        i = C36585Vg4.progressCircle;
                        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) C34328Lp6.m96312a(view, i);
                        if (circularProgressIndicator != null) {
                            i = C36585Vg4.title;
                            TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                            if (textView3 != null) {
                                return new C38666be2((ConstraintLayout) view, textView, barrier, imageView, textView2, circularProgressIndicator, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f57799a;
    }
}
