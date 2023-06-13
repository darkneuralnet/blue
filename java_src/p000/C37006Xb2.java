package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: Xb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37006Xb2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f43454a;

    /* renamed from: b */
    public final ImageView f43455b;

    /* renamed from: c */
    public final TextView f43456c;

    /* renamed from: d */
    public final ImageView f43457d;

    /* renamed from: e */
    public final TextView f43458e;

    public C37006Xb2(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, ImageView imageView2, TextView textView2) {
        this.f43454a = constraintLayout;
        this.f43455b = imageView;
        this.f43456c = textView;
        this.f43457d = imageView2;
        this.f43458e = textView2;
    }

    /* renamed from: a */
    public static C37006Xb2 m76815a(View view) {
        int i = C45248mi4.arrow;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C45248mi4.description;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C45248mi4.flag;
                ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView2 != null) {
                    i = C45248mi4.message;
                    TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView2 != null) {
                        return new C37006Xb2((ConstraintLayout) view, imageView, textView, imageView2, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f43454a;
    }
}
