package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
/* renamed from: Fe2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32821Fe2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f9871a;

    /* renamed from: b */
    public final TextView f9872b;

    /* renamed from: c */
    public final ConstraintLayout f9873c;

    /* renamed from: d */
    public final TextView f9874d;

    /* renamed from: e */
    public final View f9875e;

    /* renamed from: f */
    public final TextView f9876f;

    /* renamed from: g */
    public final View f9877g;

    /* renamed from: h */
    public final ImageView f9878h;

    /* renamed from: i */
    public final Group f9879i;

    public C32821Fe2(ConstraintLayout constraintLayout, TextView textView, ConstraintLayout constraintLayout2, TextView textView2, View view, TextView textView3, View view2, ImageView imageView, Group group) {
        this.f9871a = constraintLayout;
        this.f9872b = textView;
        this.f9873c = constraintLayout2;
        this.f9874d = textView2;
        this.f9875e = view;
        this.f9876f = textView3;
        this.f9877g = view2;
        this.f9878h = imageView;
        this.f9879i = group;
    }

    /* renamed from: a */
    public static C32821Fe2 m106819a(View view) {
        View m96312a;
        View m96312a2;
        int i = C34956Oh4.amountText;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = C34956Oh4.incentive;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null && (m96312a = C34328Lp6.m96312a(view, (i = C34956Oh4.outline))) != null) {
                i = C34956Oh4.promoText;
                TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView3 != null && (m96312a2 = C34328Lp6.m96312a(view, (i = C34956Oh4.selectedFlag))) != null) {
                    i = C34956Oh4.selectedIcon;
                    ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                    if (imageView != null) {
                        i = C34956Oh4.selectedIndicator;
                        Group group = (Group) C34328Lp6.m96312a(view, i);
                        if (group != null) {
                            return new C32821Fe2(constraintLayout, textView, constraintLayout, textView2, m96312a, textView3, m96312a2, imageView, group);
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
        return this.f9871a;
    }
}
