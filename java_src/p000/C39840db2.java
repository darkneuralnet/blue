package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: db2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39840db2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f76821a;

    /* renamed from: b */
    public final TextView f76822b;

    /* renamed from: c */
    public final ImageView f76823c;

    /* renamed from: d */
    public final TextView f76824d;

    public C39840db2(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2) {
        this.f76821a = constraintLayout;
        this.f76822b = textView;
        this.f76823c = imageView;
        this.f76824d = textView2;
    }

    /* renamed from: a */
    public static C39840db2 m44073a(View view) {
        int i = C45248mi4.body;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C45248mi4.directions;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null) {
                i = C45248mi4.title;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    return new C39840db2((ConstraintLayout) view, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f76821a;
    }
}
