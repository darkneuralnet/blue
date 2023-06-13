package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: dy1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40068dy1 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f77486a;

    /* renamed from: b */
    public final View f77487b;

    /* renamed from: c */
    public final ImageView f77488c;

    /* renamed from: d */
    public final LinearLayout f77489d;

    /* renamed from: e */
    public final TextView f77490e;

    /* renamed from: f */
    public final Space f77491f;

    public C40068dy1(ConstraintLayout constraintLayout, View view, ImageView imageView, LinearLayout linearLayout, TextView textView, Space space) {
        this.f77486a = constraintLayout;
        this.f77487b = view;
        this.f77488c = imageView;
        this.f77489d = linearLayout;
        this.f77490e = textView;
        this.f77491f = space;
    }

    /* renamed from: a */
    public static C40068dy1 m43468a(View view) {
        int i = C45841ni4.bottomDivider;
        View m96312a = C34328Lp6.m96312a(view, i);
        if (m96312a != null) {
            i = C45841ni4.close;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null) {
                i = C45841ni4.navBar;
                LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
                if (linearLayout != null) {
                    i = C45841ni4.navigationTitle;
                    TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView != null) {
                        i = C45841ni4.topGuide;
                        Space space = (Space) C34328Lp6.m96312a(view, i);
                        if (space != null) {
                            return new C40068dy1((ConstraintLayout) view, m96312a, imageView, linearLayout, textView, space);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C40068dy1 m43466c(LayoutInflater layoutInflater) {
        return m43465d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C40068dy1 m43465d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C38135ak4.fragment_feature_announcement, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m43468a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f77486a;
    }
}
