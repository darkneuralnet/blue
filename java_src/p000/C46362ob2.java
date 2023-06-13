package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: ob2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C46362ob2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f102164a;

    /* renamed from: b */
    public final ImageView f102165b;

    /* renamed from: c */
    public final ImageView f102166c;

    /* renamed from: d */
    public final TextView f102167d;

    public C46362ob2(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView) {
        this.f102164a = constraintLayout;
        this.f102165b = imageView;
        this.f102166c = imageView2;
        this.f102167d = textView;
    }

    /* renamed from: a */
    public static C46362ob2 m20814a(View view) {
        int i = C34488Mh4.arrow;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C34488Mh4.partImage;
            ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView2 != null) {
                i = C34488Mh4.title;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    return new C46362ob2((ConstraintLayout) view, imageView, imageView2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f102164a;
    }
}
