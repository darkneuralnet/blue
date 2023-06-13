package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: Ve2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36565Ve2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f39373a;

    /* renamed from: b */
    public final TextView f39374b;

    /* renamed from: c */
    public final ImageView f39375c;

    /* renamed from: d */
    public final View f39376d;

    /* renamed from: e */
    public final TextView f39377e;

    /* renamed from: f */
    public final ImageView f39378f;

    /* renamed from: g */
    public final Space f39379g;

    /* renamed from: h */
    public final ImageView f39380h;

    /* renamed from: i */
    public final TextView f39381i;

    public C36565Ve2(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, View view, TextView textView2, ImageView imageView2, Space space, ImageView imageView3, TextView textView3) {
        this.f39373a = constraintLayout;
        this.f39374b = textView;
        this.f39375c = imageView;
        this.f39376d = view;
        this.f39377e = textView2;
        this.f39378f = imageView2;
        this.f39379g = space;
        this.f39380h = imageView3;
        this.f39381i = textView3;
    }

    /* renamed from: a */
    public static C36565Ve2 m79619a(View view) {
        View m96312a;
        int i = C33318Hh4.description;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C33318Hh4.descriptionIcon;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null && (m96312a = C34328Lp6.m96312a(view, (i = C33318Hh4.divider1))) != null) {
                i = C33318Hh4.dueAt;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C33318Hh4.dueIcon;
                    ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                    if (imageView2 != null) {
                        i = C33318Hh4.space;
                        Space space = (Space) C34328Lp6.m96312a(view, i);
                        if (space != null) {
                            i = C33318Hh4.status;
                            ImageView imageView3 = (ImageView) C34328Lp6.m96312a(view, i);
                            if (imageView3 != null) {
                                i = C33318Hh4.subtitle;
                                TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView3 != null) {
                                    return new C36565Ve2((ConstraintLayout) view, textView, imageView, m96312a, textView2, imageView2, space, imageView3, textView3);
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
        return this.f39373a;
    }
}
