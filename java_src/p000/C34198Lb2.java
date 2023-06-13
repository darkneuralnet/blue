package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: Lb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34198Lb2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f21741a;

    /* renamed from: b */
    public final LinearLayout f21742b;

    /* renamed from: c */
    public final TextView f21743c;

    /* renamed from: d */
    public final ImageView f21744d;

    /* renamed from: e */
    public final TextView f21745e;

    public C34198Lb2(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, ImageView imageView, TextView textView2) {
        this.f21741a = linearLayout;
        this.f21742b = linearLayout2;
        this.f21743c = textView;
        this.f21744d = imageView;
        this.f21745e = textView2;
    }

    /* renamed from: a */
    public static C34198Lb2 m96604a(View view) {
        int i = C45831nh4.descriptionContainer;
        LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
        if (linearLayout != null) {
            i = C45831nh4.messageDescription;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C45831nh4.messageIcon;
                ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView != null) {
                    i = C45831nh4.messageTitle;
                    TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView2 != null) {
                        return new C34198Lb2((LinearLayout) view, linearLayout, textView, imageView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f21741a;
    }
}
