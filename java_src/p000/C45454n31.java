package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: n31  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C45454n31 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f99269a;

    /* renamed from: b */
    public final ImageView f99270b;

    /* renamed from: c */
    public final Button f99271c;

    /* renamed from: d */
    public final TextView f99272d;

    /* renamed from: e */
    public final ConstraintLayout f99273e;

    /* renamed from: f */
    public final TextView f99274f;

    public C45454n31(ConstraintLayout constraintLayout, ImageView imageView, Button button, TextView textView, ConstraintLayout constraintLayout2, TextView textView2) {
        this.f99269a = constraintLayout;
        this.f99270b = imageView;
        this.f99271c = button;
        this.f99272d = textView;
        this.f99273e = constraintLayout2;
        this.f99274f = textView2;
    }

    /* renamed from: a */
    public static C45454n31 m24521a(View view) {
        int i = C36819Wg4.icon;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C36819Wg4.okay;
            Button button = (Button) C34328Lp6.m96312a(view, i);
            if (button != null) {
                i = C36819Wg4.reasons;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i = C36819Wg4.title;
                    TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView2 != null) {
                        return new C45454n31(constraintLayout, imageView, button, textView, constraintLayout, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C45454n31 m24519c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C45851nj4.dialog_command_center_error, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m24521a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f99269a;
    }
}
