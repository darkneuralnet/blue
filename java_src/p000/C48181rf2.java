package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
/* renamed from: rf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48181rf2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f107439a;

    /* renamed from: b */
    public final Group f107440b;

    /* renamed from: c */
    public final TextView f107441c;

    /* renamed from: d */
    public final TextView f107442d;

    /* renamed from: e */
    public final TextView f107443e;

    /* renamed from: f */
    public final TextView f107444f;

    /* renamed from: g */
    public final View f107445g;

    /* renamed from: h */
    public final ImageView f107446h;

    /* renamed from: i */
    public final TextView f107447i;

    public C48181rf2(ConstraintLayout constraintLayout, Group group, TextView textView, TextView textView2, TextView textView3, TextView textView4, View view, ImageView imageView, TextView textView5) {
        this.f107439a = constraintLayout;
        this.f107440b = group;
        this.f107441c = textView;
        this.f107442d = textView2;
        this.f107443e = textView3;
        this.f107444f = textView4;
        this.f107445g = view;
        this.f107446h = imageView;
        this.f107447i = textView5;
    }

    /* renamed from: a */
    public static C48181rf2 m15589a(View view) {
        View m96312a;
        int i = C35892Sh4.available;
        Group group = (Group) C34328Lp6.m96312a(view, i);
        if (group != null) {
            i = C35892Sh4.co2Saved;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C35892Sh4.co2SavedLabel;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C35892Sh4.distance;
                    TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView3 != null) {
                        i = C35892Sh4.distanceLabel;
                        TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView4 != null && (m96312a = C34328Lp6.m96312a(view, (i = C35892Sh4.divider))) != null) {
                            i = C35892Sh4.heroImage;
                            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                            if (imageView != null) {
                                i = C35892Sh4.pendingTitle;
                                TextView textView5 = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView5 != null) {
                                    return new C48181rf2((ConstraintLayout) view, group, textView, textView2, textView3, textView4, m96312a, imageView, textView5);
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
        return this.f107439a;
    }
}
