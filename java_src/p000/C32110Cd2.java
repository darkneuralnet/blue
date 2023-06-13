package p000;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: Cd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32110Cd2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f4407a;

    /* renamed from: b */
    public final ImageView f4408b;

    /* renamed from: c */
    public final RecyclerView f4409c;

    /* renamed from: d */
    public final ImageView f4410d;

    public C32110Cd2(ConstraintLayout constraintLayout, ImageView imageView, RecyclerView recyclerView, ImageView imageView2) {
        this.f4407a = constraintLayout;
        this.f4408b = imageView;
        this.f4409c = recyclerView;
        this.f4410d = imageView2;
    }

    /* renamed from: a */
    public static C32110Cd2 m111962a(View view) {
        int i = C32616Eh4.leftArrow;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C32616Eh4.recyclerView;
            RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
            if (recyclerView != null) {
                i = C32616Eh4.rightArrow;
                ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView2 != null) {
                    return new C32110Cd2((ConstraintLayout) view, imageView, recyclerView, imageView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f4407a;
    }
}
