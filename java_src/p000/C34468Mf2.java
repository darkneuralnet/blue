package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
/* renamed from: Mf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34468Mf2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f23367a;

    /* renamed from: b */
    public final ImageView f23368b;

    /* renamed from: c */
    public final ImageView f23369c;

    /* renamed from: d */
    public final TextView f23370d;

    /* renamed from: e */
    public final ShapeableImageView f23371e;

    /* renamed from: f */
    public final TextView f23372f;

    public C34468Mf2(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView, ShapeableImageView shapeableImageView, TextView textView2) {
        this.f23367a = constraintLayout;
        this.f23368b = imageView;
        this.f23369c = imageView2;
        this.f23370d = textView;
        this.f23371e = shapeableImageView;
        this.f23372f = textView2;
    }

    /* renamed from: a */
    public static C34468Mf2 m95082a(View view) {
        int i = C42866ih4.cameraIcon;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C42866ih4.closeIcon;
            ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView2 != null) {
                i = C42866ih4.header;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    i = C42866ih4.photo;
                    ShapeableImageView shapeableImageView = (ShapeableImageView) C34328Lp6.m96312a(view, i);
                    if (shapeableImageView != null) {
                        i = C42866ih4.required;
                        TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView2 != null) {
                            return new C34468Mf2((ConstraintLayout) view, imageView, imageView2, textView, shapeableImageView, textView2);
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
        return this.f23367a;
    }
}
