package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: Kc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33973Kc2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f19929a;

    /* renamed from: b */
    public final ImageView f19930b;

    /* renamed from: c */
    public final TextView f19931c;

    public C33973Kc2(ConstraintLayout constraintLayout, ImageView imageView, TextView textView) {
        this.f19929a = constraintLayout;
        this.f19930b = imageView;
        this.f19931c = textView;
    }

    /* renamed from: a */
    public static C33973Kc2 m98688a(View view) {
        int i = C45248mi4.photo;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C45248mi4.title;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                return new C33973Kc2((ConstraintLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f19929a;
    }
}
