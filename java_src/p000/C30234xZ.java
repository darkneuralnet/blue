package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.imageupload.ImageUploadBar;
/* renamed from: xZ */
/* loaded from: classes3.dex */
public final class C30234xZ implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f117802a;

    /* renamed from: b */
    public final TextView f117803b;

    /* renamed from: c */
    public final ImageView f117804c;

    /* renamed from: d */
    public final TextView f117805d;

    /* renamed from: e */
    public final FrameLayout f117806e;

    /* renamed from: f */
    public final View f117807f;

    /* renamed from: g */
    public final View f117808g;

    /* renamed from: h */
    public final ImageUploadBar f117809h;

    /* renamed from: i */
    public final TextView f117810i;

    /* renamed from: j */
    public final Button f117811j;

    public C30234xZ(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2, FrameLayout frameLayout, View view, View view2, ImageUploadBar imageUploadBar, TextView textView3, Button button) {
        this.f117802a = constraintLayout;
        this.f117803b = textView;
        this.f117804c = imageView;
        this.f117805d = textView2;
        this.f117806e = frameLayout;
        this.f117807f = view;
        this.f117808g = view2;
        this.f117809h = imageUploadBar;
        this.f117810i = textView3;
        this.f117811j = button;
    }

    /* renamed from: a */
    public static C30234xZ m5013a(View view) {
        View m96312a;
        View m96312a2;
        int i = C39912di4.bolStatus;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C39912di4.bolStatusIcon;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null) {
                i = C39912di4.bolStatusTitle;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C39912di4.buttonContainer;
                    FrameLayout frameLayout = (FrameLayout) C34328Lp6.m96312a(view, i);
                    if (frameLayout != null && (m96312a = C34328Lp6.m96312a(view, (i = C39912di4.divider1))) != null && (m96312a2 = C34328Lp6.m96312a(view, (i = C39912di4.divider2))) != null) {
                        i = C39912di4.imageUploadBar;
                        ImageUploadBar imageUploadBar = (ImageUploadBar) C34328Lp6.m96312a(view, i);
                        if (imageUploadBar != null) {
                            i = C39912di4.instructions;
                            TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                            if (textView3 != null) {
                                i = C39912di4.submit;
                                Button button = (Button) C34328Lp6.m96312a(view, i);
                                if (button != null) {
                                    return new C30234xZ((ConstraintLayout) view, textView, imageView, textView2, frameLayout, m96312a, m96312a2, imageUploadBar, textView3, button);
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
    public static C30234xZ m5011c(LayoutInflater layoutInflater) {
        return m5010d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C30234xZ m5010d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C35442Qj4.bottom_sheet_add_bol, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m5013a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f117802a;
    }
}
