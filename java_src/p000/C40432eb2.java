package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: eb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40432eb2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f78591a;

    /* renamed from: b */
    public final TextView f78592b;

    /* renamed from: c */
    public final ImageView f78593c;

    /* renamed from: d */
    public final TextView f78594d;

    public C40432eb2(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2) {
        this.f78591a = constraintLayout;
        this.f78592b = textView;
        this.f78593c = imageView;
        this.f78594d = textView2;
    }

    /* renamed from: a */
    public static C40432eb2 m42731a(View view) {
        int i = C45248mi4.body;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C45248mi4.refresh;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null) {
                i = C45248mi4.title;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    return new C40432eb2((ConstraintLayout) view, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f78591a;
    }
}
