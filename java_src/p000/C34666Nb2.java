package p000;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: Nb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34666Nb2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f24830a;

    /* renamed from: b */
    public final TextView f24831b;

    /* renamed from: c */
    public final TextView f24832c;

    /* renamed from: d */
    public final ImageView f24833d;

    /* renamed from: e */
    public final FrameLayout f24834e;

    /* renamed from: f */
    public final ImageView f24835f;

    /* renamed from: g */
    public final TextView f24836g;

    /* renamed from: h */
    public final TextView f24837h;

    public C34666Nb2(ConstraintLayout constraintLayout, TextView textView, TextView textView2, ImageView imageView, FrameLayout frameLayout, ImageView imageView2, TextView textView3, TextView textView4) {
        this.f24830a = constraintLayout;
        this.f24831b = textView;
        this.f24832c = textView2;
        this.f24833d = imageView;
        this.f24834e = frameLayout;
        this.f24835f = imageView2;
        this.f24836g = textView3;
        this.f24837h = textView4;
    }

    /* renamed from: a */
    public static C34666Nb2 m93728a(View view) {
        int i = C45831nh4.caption;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C45831nh4.caption2;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                i = C45831nh4.chevron;
                ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView != null) {
                    i = C45831nh4.complication;
                    FrameLayout frameLayout = (FrameLayout) C34328Lp6.m96312a(view, i);
                    if (frameLayout != null) {
                        i = C45831nh4.icon;
                        ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                        if (imageView2 != null) {
                            i = C45831nh4.notification;
                            TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                            if (textView3 != null) {
                                i = C45831nh4.title;
                                TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView4 != null) {
                                    return new C34666Nb2((ConstraintLayout) view, textView, textView2, imageView, frameLayout, imageView2, textView3, textView4);
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
        return this.f24830a;
    }
}
