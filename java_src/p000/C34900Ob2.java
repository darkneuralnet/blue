package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.widget.standardcomponents.LabeledRatingItemView;
/* renamed from: Ob2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34900Ob2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f26867a;

    /* renamed from: b */
    public final ImageView f26868b;

    /* renamed from: c */
    public final TextView f26869c;

    /* renamed from: d */
    public final ImageView f26870d;

    /* renamed from: e */
    public final LabeledRatingItemView f26871e;

    public C34900Ob2(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, ImageView imageView2, LabeledRatingItemView labeledRatingItemView) {
        this.f26867a = constraintLayout;
        this.f26868b = imageView;
        this.f26869c = textView;
        this.f26870d = imageView2;
        this.f26871e = labeledRatingItemView;
    }

    /* renamed from: a */
    public static C34900Ob2 m91890a(View view) {
        int i = C45831nh4.chevron;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C45831nh4.description;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C45831nh4.icon;
                ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView2 != null) {
                    i = C45831nh4.ratingSection;
                    LabeledRatingItemView labeledRatingItemView = (LabeledRatingItemView) C34328Lp6.m96312a(view, i);
                    if (labeledRatingItemView != null) {
                        return new C34900Ob2((ConstraintLayout) view, imageView, textView, imageView2, labeledRatingItemView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f26867a;
    }
}