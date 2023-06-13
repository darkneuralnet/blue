package p000;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: Ls6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34355Ls6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f22175a;

    /* renamed from: b */
    public final Button f22176b;

    /* renamed from: c */
    public final View f22177c;

    /* renamed from: d */
    public final ImageView f22178d;

    /* renamed from: e */
    public final TextView f22179e;

    /* renamed from: f */
    public final TextView f22180f;

    public C34355Ls6(ConstraintLayout constraintLayout, Button button, View view, ImageView imageView, TextView textView, TextView textView2) {
        this.f22175a = constraintLayout;
        this.f22176b = button;
        this.f22177c = view;
        this.f22178d = imageView;
        this.f22179e = textView;
        this.f22180f = textView2;
    }

    /* renamed from: a */
    public static C34355Ls6 m96256a(View view) {
        View m96312a;
        int i = C34722Nh4.buyButton;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null && (m96312a = C34328Lp6.m96312a(view, (i = C34722Nh4.divider))) != null) {
            i = C34722Nh4.promotionIcon;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null) {
                i = C34722Nh4.subtitleText;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    i = C34722Nh4.titleText;
                    TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView2 != null) {
                        return new C34355Ls6((ConstraintLayout) view, button, m96312a, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f22175a;
    }
}
