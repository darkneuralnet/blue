package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.Space;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: fg2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C41075fg2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f80439a;

    /* renamed from: b */
    public final CardView f80440b;

    /* renamed from: c */
    public final ImageView f80441c;

    /* renamed from: d */
    public final Space f80442d;

    /* renamed from: e */
    public final ImageView f80443e;

    public C41075fg2(ConstraintLayout constraintLayout, CardView cardView, ImageView imageView, Space space, ImageView imageView2) {
        this.f80439a = constraintLayout;
        this.f80440b = cardView;
        this.f80441c = imageView;
        this.f80442d = space;
        this.f80443e = imageView2;
    }

    /* renamed from: a */
    public static C41075fg2 m41043a(View view) {
        int i = C51176wi4.imageCardView;
        CardView cardView = (CardView) C34328Lp6.m96312a(view, i);
        if (cardView != null) {
            i = C51176wi4.pass_fail_icon;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null) {
                i = C51176wi4.space;
                Space space = (Space) C34328Lp6.m96312a(view, i);
                if (space != null) {
                    i = C51176wi4.vehicleIllustration;
                    ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                    if (imageView2 != null) {
                        return new C41075fg2((ConstraintLayout) view, cardView, imageView, space, imageView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f80439a;
    }
}
