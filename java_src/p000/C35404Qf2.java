package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: Qf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35404Qf2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f30700a;

    /* renamed from: b */
    public final TextView f30701b;

    /* renamed from: c */
    public final ImageView f30702c;

    /* renamed from: d */
    public final TextView f30703d;

    /* renamed from: e */
    public final Space f30704e;

    /* renamed from: f */
    public final Space f30705f;

    /* renamed from: g */
    public final TextView f30706g;

    /* renamed from: h */
    public final View f30707h;

    public C35404Qf2(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2, Space space, Space space2, TextView textView3, View view) {
        this.f30700a = constraintLayout;
        this.f30701b = textView;
        this.f30702c = imageView;
        this.f30703d = textView2;
        this.f30704e = space;
        this.f30705f = space2;
        this.f30706g = textView3;
        this.f30707h = view;
    }

    /* renamed from: a */
    public static C35404Qf2 m88273a(View view) {
        View m96312a;
        int i = C40494eh4.description;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C40494eh4.icon;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null) {
                i = C40494eh4.learnMore;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C40494eh4.space1;
                    Space space = (Space) C34328Lp6.m96312a(view, i);
                    if (space != null) {
                        i = C40494eh4.space2;
                        Space space2 = (Space) C34328Lp6.m96312a(view, i);
                        if (space2 != null) {
                            i = C40494eh4.title;
                            TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                            if (textView3 != null && (m96312a = C34328Lp6.m96312a(view, (i = C40494eh4.titleBackground))) != null) {
                                return new C35404Qf2((ConstraintLayout) view, textView, imageView, textView2, space, space2, textView3, m96312a);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C35404Qf2 m88271c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C32409Dk4.item_title_message, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88273a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f30700a;
    }
}
