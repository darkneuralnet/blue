package p000;

import android.view.View;
import android.widget.ImageView;
/* renamed from: kb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43990kb2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ImageView f94608a;

    public C43990kb2(ImageView imageView) {
        this.f94608a = imageView;
    }

    /* renamed from: a */
    public static C43990kb2 m28809a(View view) {
        if (view != null) {
            return new C43990kb2((ImageView) view);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ImageView getRoot() {
        return this.f94608a;
    }
}
