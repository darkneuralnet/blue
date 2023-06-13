package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
/* renamed from: qf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47588qf2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f105580a;

    /* renamed from: b */
    public final View f105581b;

    /* renamed from: c */
    public final TextView f105582c;

    /* renamed from: d */
    public final ImageView f105583d;

    /* renamed from: e */
    public final ShapeableImageView f105584e;

    /* renamed from: f */
    public final TextView f105585f;

    /* renamed from: g */
    public final TextView f105586g;

    public C47588qf2(ConstraintLayout constraintLayout, View view, TextView textView, ImageView imageView, ShapeableImageView shapeableImageView, TextView textView2, TextView textView3) {
        this.f105580a = constraintLayout;
        this.f105581b = view;
        this.f105582c = textView;
        this.f105583d = imageView;
        this.f105584e = shapeableImageView;
        this.f105585f = textView2;
        this.f105586g = textView3;
    }

    /* renamed from: a */
    public static C47588qf2 m17266a(View view) {
        int i = C35892Sh4.background;
        View m96312a = C34328Lp6.m96312a(view, i);
        if (m96312a != null) {
            i = C35892Sh4.body;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C35892Sh4.icon;
                ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView != null) {
                    i = C35892Sh4.image;
                    ShapeableImageView shapeableImageView = (ShapeableImageView) C34328Lp6.m96312a(view, i);
                    if (shapeableImageView != null) {
                        i = C35892Sh4.number;
                        TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView2 != null) {
                            i = C35892Sh4.title;
                            TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                            if (textView3 != null) {
                                return new C47588qf2((ConstraintLayout) view, m96312a, textView, imageView, shapeableImageView, textView2, textView3);
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
        return this.f105580a;
    }
}
