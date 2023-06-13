package p000;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
/* renamed from: Bd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C31876Bd2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final FrameLayout f2601a;

    /* renamed from: b */
    public final ImageView f2602b;

    public C31876Bd2(FrameLayout frameLayout, ImageView imageView) {
        this.f2601a = frameLayout;
        this.f2602b = imageView;
    }

    /* renamed from: a */
    public static C31876Bd2 m113748a(View view) {
        int i = C32616Eh4.image;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            return new C31876Bd2((FrameLayout) view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f2601a;
    }
}
