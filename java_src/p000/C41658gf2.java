package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: gf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41658gf2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f83994a;

    /* renamed from: b */
    public final ImageView f83995b;

    /* renamed from: c */
    public final TextView f83996c;

    /* renamed from: d */
    public final ImageView f83997d;

    /* renamed from: e */
    public final RecyclerView f83998e;

    public C41658gf2(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, ImageView imageView2, RecyclerView recyclerView) {
        this.f83994a = constraintLayout;
        this.f83995b = imageView;
        this.f83996c = textView;
        this.f83997d = imageView2;
        this.f83998e = recyclerView;
    }

    /* renamed from: a */
    public static C41658gf2 m37923a(View view) {
        int i = C35658Rh4.arrow;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C35658Rh4.display;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C35658Rh4.icon;
                ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView2 != null) {
                    i = C35658Rh4.recyclerView;
                    RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                    if (recyclerView != null) {
                        return new C41658gf2((ConstraintLayout) view, imageView, textView, imageView2, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f83994a;
    }
}
