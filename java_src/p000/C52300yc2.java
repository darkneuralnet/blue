package p000;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: yc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52300yc2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f119837a;

    /* renamed from: b */
    public final TextView f119838b;

    /* renamed from: c */
    public final Barrier f119839c;

    /* renamed from: d */
    public final ImageView f119840d;

    /* renamed from: e */
    public final Button f119841e;

    /* renamed from: f */
    public final ImageView f119842f;

    /* renamed from: g */
    public final TextView f119843g;

    public C52300yc2(ConstraintLayout constraintLayout, TextView textView, Barrier barrier, ImageView imageView, Button button, ImageView imageView2, TextView textView2) {
        this.f119837a = constraintLayout;
        this.f119838b = textView;
        this.f119839c = barrier;
        this.f119840d = imageView;
        this.f119841e = button;
        this.f119842f = imageView2;
        this.f119843g = textView2;
    }

    /* renamed from: a */
    public static C52300yc2 m3171a(View view) {
        int i = C49991ui4.details;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C49991ui4.endBarrier;
            Barrier barrier = (Barrier) C34328Lp6.m96312a(view, i);
            if (barrier != null) {
                i = C49991ui4.greenCheck;
                ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView != null) {
                    i = C49991ui4.scanSerialButton;
                    Button button = (Button) C34328Lp6.m96312a(view, i);
                    if (button != null) {
                        i = C49991ui4.skuIcon;
                        ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                        if (imageView2 != null) {
                            i = C49991ui4.title;
                            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                            if (textView2 != null) {
                                return new C52300yc2((ConstraintLayout) view, textView, barrier, imageView, button, imageView2, textView2);
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
        return this.f119837a;
    }
}
