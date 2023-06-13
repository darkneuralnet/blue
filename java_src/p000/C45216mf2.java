package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import com.google.android.material.card.MaterialCardView;
/* renamed from: mf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45216mf2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final MaterialCardView f98521a;

    /* renamed from: b */
    public final Barrier f98522b;

    /* renamed from: c */
    public final TextView f98523c;

    /* renamed from: d */
    public final ImageView f98524d;

    /* renamed from: e */
    public final View f98525e;

    /* renamed from: f */
    public final TextView f98526f;

    /* renamed from: g */
    public final TextView f98527g;

    /* renamed from: h */
    public final TextView f98528h;

    /* renamed from: i */
    public final TextView f98529i;

    /* renamed from: j */
    public final TextView f98530j;

    public C45216mf2(MaterialCardView materialCardView, Barrier barrier, TextView textView, ImageView imageView, View view, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.f98521a = materialCardView;
        this.f98522b = barrier;
        this.f98523c = textView;
        this.f98524d = imageView;
        this.f98525e = view;
        this.f98526f = textView2;
        this.f98527g = textView3;
        this.f98528h = textView4;
        this.f98529i = textView5;
        this.f98530j = textView6;
    }

    /* renamed from: a */
    public static C45216mf2 m25217a(View view) {
        View m96312a;
        int i = C36126Th4.barrier;
        Barrier barrier = (Barrier) C34328Lp6.m96312a(view, i);
        if (barrier != null) {
            i = C36126Th4.body;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C36126Th4.chevron;
                ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView != null && (m96312a = C34328Lp6.m96312a(view, (i = C36126Th4.divider))) != null) {
                    i = C36126Th4.promoTag;
                    TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView2 != null) {
                        i = C36126Th4.subscription;
                        TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView3 != null) {
                            i = C36126Th4.subscriptionInfo;
                            TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                            if (textView4 != null) {
                                i = C36126Th4.tag;
                                TextView textView5 = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView5 != null) {
                                    i = C36126Th4.title;
                                    TextView textView6 = (TextView) C34328Lp6.m96312a(view, i);
                                    if (textView6 != null) {
                                        return new C45216mf2((MaterialCardView) view, barrier, textView, imageView, m96312a, textView2, textView3, textView4, textView5, textView6);
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
    public MaterialCardView getRoot() {
        return this.f98521a;
    }
}
