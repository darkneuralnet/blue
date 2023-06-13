package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: wf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51144wf2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f116315a;

    /* renamed from: b */
    public final ImageView f116316b;

    /* renamed from: c */
    public final TextView f116317c;

    /* renamed from: d */
    public final TextView f116318d;

    public C51144wf2(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.f116315a = constraintLayout;
        this.f116316b = imageView;
        this.f116317c = textView;
        this.f116318d = textView2;
    }

    /* renamed from: a */
    public static C51144wf2 m6537a(View view) {
        int i = C42866ih4.check;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C42866ih4.code;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C42866ih4.model;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    return new C51144wf2((ConstraintLayout) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f116315a;
    }
}
