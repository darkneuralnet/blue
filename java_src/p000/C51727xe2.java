package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: xe2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51727xe2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f117917a;

    /* renamed from: b */
    public final ImageView f117918b;

    /* renamed from: c */
    public final Space f117919c;

    /* renamed from: d */
    public final TextView f117920d;

    /* renamed from: e */
    public final ImageView f117921e;

    /* renamed from: f */
    public final TextView f117922f;

    /* renamed from: g */
    public final TextView f117923g;

    /* renamed from: h */
    public final Space f117924h;

    public C51727xe2(ConstraintLayout constraintLayout, ImageView imageView, Space space, TextView textView, ImageView imageView2, TextView textView2, TextView textView3, Space space2) {
        this.f117917a = constraintLayout;
        this.f117918b = imageView;
        this.f117919c = space;
        this.f117920d = textView;
        this.f117921e = imageView2;
        this.f117922f = textView2;
        this.f117923g = textView3;
        this.f117924h = space2;
    }

    /* renamed from: a */
    public static C51727xe2 m4911a(View view) {
        int i = C34488Mh4.arrow;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C34488Mh4.bottomSpace;
            Space space = (Space) C34328Lp6.m96312a(view, i);
            if (space != null) {
                i = C34488Mh4.healthStatusLabel;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    i = C34488Mh4.partImage;
                    ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                    if (imageView2 != null) {
                        i = C34488Mh4.subtitle;
                        TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView2 != null) {
                            i = C34488Mh4.title;
                            TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                            if (textView3 != null) {
                                i = C34488Mh4.topSpace;
                                Space space2 = (Space) C34328Lp6.m96312a(view, i);
                                if (space2 != null) {
                                    return new C51727xe2((ConstraintLayout) view, imageView, space, textView, imageView2, textView2, textView3, space2);
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
        return this.f117917a;
    }
}
