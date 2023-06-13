package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import co.bird.android.widget.ClampToRatioImageView;
/* renamed from: H4 */
/* loaded from: classes2.dex */
public final class C3020H4 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RelativeLayout f12795a;

    /* renamed from: b */
    public final Button f12796b;

    /* renamed from: c */
    public final ImageView f12797c;

    /* renamed from: d */
    public final TextView f12798d;

    /* renamed from: e */
    public final ClampToRatioImageView f12799e;

    /* renamed from: f */
    public final TextView f12800f;

    public C3020H4(RelativeLayout relativeLayout, Button button, ImageView imageView, TextView textView, ClampToRatioImageView clampToRatioImageView, TextView textView2) {
        this.f12795a = relativeLayout;
        this.f12796b = button;
        this.f12797c = imageView;
        this.f12798d = textView;
        this.f12799e = clampToRatioImageView;
        this.f12800f = textView2;
    }

    /* renamed from: a */
    public static C3020H4 m104454a(View view) {
        int i = C36585Vg4.button;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C36585Vg4.divider;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null) {
                i = C36585Vg4.message;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    i = C36585Vg4.titleAsset;
                    ClampToRatioImageView clampToRatioImageView = (ClampToRatioImageView) C34328Lp6.m96312a(view, i);
                    if (clampToRatioImageView != null) {
                        i = C36585Vg4.titleText;
                        TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView2 != null) {
                            return new C3020H4((RelativeLayout) view, button, imageView, textView, clampToRatioImageView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C3020H4 m104452c(LayoutInflater layoutInflater) {
        return m104451d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C3020H4 m104451d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.activity_parking_announcement, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m104454a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RelativeLayout getRoot() {
        return this.f12795a;
    }
}
