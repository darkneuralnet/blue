package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
/* renamed from: Qa2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35359Qa2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f30538a;

    /* renamed from: b */
    public final ShapeableImageView f30539b;

    /* renamed from: c */
    public final TextView f30540c;

    /* renamed from: d */
    public final ImageView f30541d;

    /* renamed from: e */
    public final CardView f30542e;

    /* renamed from: f */
    public final TextView f30543f;

    public C35359Qa2(ConstraintLayout constraintLayout, ShapeableImageView shapeableImageView, TextView textView, ImageView imageView, CardView cardView, TextView textView2) {
        this.f30538a = constraintLayout;
        this.f30539b = shapeableImageView;
        this.f30540c = textView;
        this.f30541d = imageView;
        this.f30542e = cardView;
        this.f30543f = textView2;
    }

    /* renamed from: a */
    public static C35359Qa2 m88392a(View view) {
        int i = C44062ki4.birdBackground;
        ShapeableImageView shapeableImageView = (ShapeableImageView) C34328Lp6.m96312a(view, i);
        if (shapeableImageView != null) {
            i = C44062ki4.birdCode;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C44062ki4.birdImage;
                ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView != null) {
                    i = C44062ki4.card;
                    CardView cardView = (CardView) C34328Lp6.m96312a(view, i);
                    if (cardView != null) {
                        i = C44062ki4.model;
                        TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView2 != null) {
                            return new C35359Qa2((ConstraintLayout) view, shapeableImageView, textView, imageView, cardView, textView2);
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
        return this.f30538a;
    }
}
