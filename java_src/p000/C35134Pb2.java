package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: Pb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35134Pb2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f28717a;

    /* renamed from: b */
    public final ImageView f28718b;

    /* renamed from: c */
    public final TextView f28719c;

    /* renamed from: d */
    public final TextView f28720d;

    public C35134Pb2(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.f28717a = constraintLayout;
        this.f28718b = imageView;
        this.f28719c = textView;
        this.f28720d = textView2;
    }

    /* renamed from: a */
    public static C35134Pb2 m90079a(View view) {
        int i = C45831nh4.chevron;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C45831nh4.count;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C45831nh4.title;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    return new C35134Pb2((ConstraintLayout) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f28717a;
    }
}
