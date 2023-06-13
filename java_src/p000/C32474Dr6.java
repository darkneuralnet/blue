package p000;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.widget.standardcomponents.LabeledRatingItemView;
/* renamed from: Dr6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C32474Dr6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f6435a;

    /* renamed from: b */
    public final LabeledRatingItemView f6436b;

    /* renamed from: c */
    public final TextView f6437c;

    public C32474Dr6(ConstraintLayout constraintLayout, LabeledRatingItemView labeledRatingItemView, TextView textView) {
        this.f6435a = constraintLayout;
        this.f6436b = labeledRatingItemView;
        this.f6437c = textView;
    }

    /* renamed from: a */
    public static C32474Dr6 m109847a(View view) {
        int i = C52955zi4.ratingSection;
        LabeledRatingItemView labeledRatingItemView = (LabeledRatingItemView) C34328Lp6.m96312a(view, i);
        if (labeledRatingItemView != null) {
            i = C52955zi4.reviewBox;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                return new C32474Dr6((ConstraintLayout) view, labeledRatingItemView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f6435a;
    }
}
