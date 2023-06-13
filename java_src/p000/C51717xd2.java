package p000;

import android.view.View;
import android.widget.ImageView;
/* renamed from: xd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51717xd2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ImageView f117906a;

    public C51717xd2(ImageView imageView) {
        this.f117906a = imageView;
    }

    /* renamed from: a */
    public static C51717xd2 m4922a(View view) {
        if (view != null) {
            return new C51717xd2((ImageView) view);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ImageView getRoot() {
        return this.f117906a;
    }
}
