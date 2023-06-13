package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: Ub2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36304Ub2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f37634a;

    /* renamed from: b */
    public final ImageView f37635b;

    /* renamed from: c */
    public final TextView f37636c;

    /* renamed from: d */
    public final TextView f37637d;

    public C36304Ub2(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.f37634a = constraintLayout;
        this.f37635b = imageView;
        this.f37636c = textView;
        this.f37637d = textView2;
    }

    /* renamed from: a */
    public static C36304Ub2 m81296a(View view) {
        int i = C45248mi4.chevron;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C45248mi4.subtitle;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C45248mi4.title;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    return new C36304Ub2((ConstraintLayout) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f37634a;
    }
}
