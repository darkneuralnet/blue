package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: z31  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C52568z31 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f120684a;

    /* renamed from: b */
    public final TextView f120685b;

    /* renamed from: c */
    public final ImageView f120686c;

    /* renamed from: d */
    public final Button f120687d;

    /* renamed from: e */
    public final TextView f120688e;

    /* renamed from: f */
    public final TextView f120689f;

    public C52568z31(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, Button button, TextView textView2, TextView textView3) {
        this.f120684a = constraintLayout;
        this.f120685b = textView;
        this.f120686c = imageView;
        this.f120687d = button;
        this.f120688e = textView2;
        this.f120689f = textView3;
    }

    /* renamed from: a */
    public static C52568z31 m1901a(View view) {
        int i = C36585Vg4.body;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C36585Vg4.clockIcon;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null) {
                i = C36585Vg4.confirm;
                Button button = (Button) C34328Lp6.m96312a(view, i);
                if (button != null) {
                    i = C36585Vg4.timer;
                    TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView2 != null) {
                        i = C36585Vg4.title;
                        TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView3 != null) {
                            return new C52568z31((ConstraintLayout) view, textView, imageView, button, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C52568z31 m1899c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.dialog_nest_claim_success, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m1901a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f120684a;
    }
}
