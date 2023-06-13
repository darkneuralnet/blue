package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
/* renamed from: zm2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52993zm2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f122172a;

    /* renamed from: b */
    public final Space f122173b;

    /* renamed from: c */
    public final TextView f122174c;

    /* renamed from: d */
    public final ImageView f122175d;

    /* renamed from: e */
    public final View f122176e;

    /* renamed from: f */
    public final Group f122177f;

    /* renamed from: g */
    public final ImageView f122178g;

    /* renamed from: h */
    public final TextView f122179h;

    /* renamed from: i */
    public final ImageView f122180i;

    /* renamed from: j */
    public final View f122181j;

    /* renamed from: k */
    public final Group f122182k;

    /* renamed from: l */
    public final ImageView f122183l;

    /* renamed from: m */
    public final TextView f122184m;

    /* renamed from: n */
    public final ConstraintLayout f122185n;

    /* renamed from: o */
    public final ImageView f122186o;

    /* renamed from: p */
    public final View f122187p;

    /* renamed from: q */
    public final Group f122188q;

    /* renamed from: r */
    public final ImageView f122189r;

    /* renamed from: s */
    public final TextView f122190s;

    public C52993zm2(ConstraintLayout constraintLayout, Space space, TextView textView, ImageView imageView, View view, Group group, ImageView imageView2, TextView textView2, ImageView imageView3, View view2, Group group2, ImageView imageView4, TextView textView3, ConstraintLayout constraintLayout2, ImageView imageView5, View view3, Group group3, ImageView imageView6, TextView textView4) {
        this.f122172a = constraintLayout;
        this.f122173b = space;
        this.f122174c = textView;
        this.f122175d = imageView;
        this.f122176e = view;
        this.f122177f = group;
        this.f122178g = imageView2;
        this.f122179h = textView2;
        this.f122180i = imageView3;
        this.f122181j = view2;
        this.f122182k = group2;
        this.f122183l = imageView4;
        this.f122184m = textView3;
        this.f122185n = constraintLayout2;
        this.f122186o = imageView5;
        this.f122187p = view3;
        this.f122188q = group3;
        this.f122189r = imageView6;
        this.f122190s = textView4;
    }

    /* renamed from: a */
    public static C52993zm2 m447a(View view) {
        View m96312a;
        View m96312a2;
        View m96312a3;
        int i = C34488Mh4.headerSpace;
        Space space = (Space) C34328Lp6.m96312a(view, i);
        if (space != null) {
            i = C34488Mh4.headerText;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C34488Mh4.incompleteArrow;
                ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView != null && (m96312a = C34328Lp6.m96312a(view, (i = C34488Mh4.incompleteContainer))) != null) {
                    i = C34488Mh4.incompleteGroup;
                    Group group = (Group) C34328Lp6.m96312a(view, i);
                    if (group != null) {
                        i = C34488Mh4.incompleteIcon;
                        ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                        if (imageView2 != null) {
                            i = C34488Mh4.incompleteText;
                            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                            if (textView2 != null) {
                                i = C34488Mh4.outOfStockArrow;
                                ImageView imageView3 = (ImageView) C34328Lp6.m96312a(view, i);
                                if (imageView3 != null && (m96312a2 = C34328Lp6.m96312a(view, (i = C34488Mh4.outOfStockContainer))) != null) {
                                    i = C34488Mh4.outOfStockGroup;
                                    Group group2 = (Group) C34328Lp6.m96312a(view, i);
                                    if (group2 != null) {
                                        i = C34488Mh4.outOfStockIcon;
                                        ImageView imageView4 = (ImageView) C34328Lp6.m96312a(view, i);
                                        if (imageView4 != null) {
                                            i = C34488Mh4.outOfStockText;
                                            TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                                            if (textView3 != null) {
                                                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                                i = C34488Mh4.runningLowArrow;
                                                ImageView imageView5 = (ImageView) C34328Lp6.m96312a(view, i);
                                                if (imageView5 != null && (m96312a3 = C34328Lp6.m96312a(view, (i = C34488Mh4.runningLowContainer))) != null) {
                                                    i = C34488Mh4.runningLowGroup;
                                                    Group group3 = (Group) C34328Lp6.m96312a(view, i);
                                                    if (group3 != null) {
                                                        i = C34488Mh4.runningLowIcon;
                                                        ImageView imageView6 = (ImageView) C34328Lp6.m96312a(view, i);
                                                        if (imageView6 != null) {
                                                            i = C34488Mh4.runningLowText;
                                                            TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                                                            if (textView4 != null) {
                                                                return new C52993zm2(constraintLayout, space, textView, imageView, m96312a, group, imageView2, textView2, imageView3, m96312a2, group2, imageView4, textView3, constraintLayout, imageView5, m96312a3, group3, imageView6, textView4);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
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
        return this.f122172a;
    }
}
