package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: F31 */
/* loaded from: classes3.dex */
public final class F31 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f8506a;

    /* renamed from: b */
    public final Button f8507b;

    /* renamed from: c */
    public final View f8508c;

    /* renamed from: d */
    public final TextView f8509d;

    /* renamed from: e */
    public final SwitchCompat f8510e;

    /* renamed from: f */
    public final ImageView f8511f;

    /* renamed from: g */
    public final TextView f8512g;

    /* renamed from: h */
    public final Space f8513h;

    /* renamed from: i */
    public final TextView f8514i;

    public F31(ConstraintLayout constraintLayout, Button button, View view, TextView textView, SwitchCompat switchCompat, ImageView imageView, TextView textView2, Space space, TextView textView3) {
        this.f8506a = constraintLayout;
        this.f8507b = button;
        this.f8508c = view;
        this.f8509d = textView;
        this.f8510e = switchCompat;
        this.f8511f = imageView;
        this.f8512g = textView2;
        this.f8513h = space;
        this.f8514i = textView3;
    }

    /* renamed from: a */
    public static F31 m108060a(View view) {
        View m96312a;
        int i = C45248mi4.confirm;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null && (m96312a = C34328Lp6.m96312a(view, (i = C45248mi4.divider))) != null) {
            i = C45248mi4.dontShowAgain;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C45248mi4.dontShowAgainSwitch;
                SwitchCompat switchCompat = (SwitchCompat) C34328Lp6.m96312a(view, i);
                if (switchCompat != null) {
                    i = C45248mi4.illustration;
                    ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                    if (imageView != null) {
                        i = C45248mi4.message;
                        TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView2 != null) {
                            i = C45248mi4.space;
                            Space space = (Space) C34328Lp6.m96312a(view, i);
                            if (space != null) {
                                i = C45248mi4.title;
                                TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView3 != null) {
                                    return new F31((ConstraintLayout) view, button, m96312a, textView, switchCompat, imageView, textView2, space, textView3);
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
    public static F31 m108058c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37548Zj4.dialog_quick_capture_ready, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108060a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f8506a;
    }
}
