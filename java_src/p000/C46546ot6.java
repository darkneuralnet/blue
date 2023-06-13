package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.imageview.ShapeableImageView;
/* renamed from: ot6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C46546ot6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final FrameLayout f102725a;

    /* renamed from: b */
    public final ShapeableImageView f102726b;

    public C46546ot6(FrameLayout frameLayout, ShapeableImageView shapeableImageView) {
        this.f102725a = frameLayout;
        this.f102726b = shapeableImageView;
    }

    /* renamed from: a */
    public static C46546ot6 m20355a(View view) {
        int i = C52955zi4.photo;
        ShapeableImageView shapeableImageView = (ShapeableImageView) C34328Lp6.m96312a(view, i);
        if (shapeableImageView != null) {
            return new C46546ot6((FrameLayout) view, shapeableImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C46546ot6 m20353c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C45268mk4.view_retakeable_photo, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m20355a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f102725a;
    }
}
