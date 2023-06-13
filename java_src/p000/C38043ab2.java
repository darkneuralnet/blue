package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: ab2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38043ab2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f50665a;

    /* renamed from: b */
    public final ImageView f50666b;

    /* renamed from: c */
    public final TextView f50667c;

    /* renamed from: d */
    public final TextView f50668d;

    public C38043ab2(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.f50665a = constraintLayout;
        this.f50666b = imageView;
        this.f50667c = textView;
        this.f50668d = textView2;
    }

    /* renamed from: a */
    public static C38043ab2 m71174a(View view) {
        int i = C45248mi4.icon;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C45248mi4.subtitle;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C45248mi4.title;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    return new C38043ab2((ConstraintLayout) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f50665a;
    }
}
