package p000;

import android.view.View;
import android.widget.ImageView;
/* renamed from: bb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38636bb2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ImageView f57743a;

    /* renamed from: b */
    public final ImageView f57744b;

    public C38636bb2(ImageView imageView, ImageView imageView2) {
        this.f57743a = imageView;
        this.f57744b = imageView2;
    }

    /* renamed from: a */
    public static C38636bb2 m64295a(View view) {
        if (view != null) {
            ImageView imageView = (ImageView) view;
            return new C38636bb2(imageView, imageView);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ImageView getRoot() {
        return this.f57743a;
    }
}
