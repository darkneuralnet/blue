package p000;

import android.view.View;
import com.google.android.material.imageview.ShapeableImageView;
/* renamed from: Vb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36538Vb2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ShapeableImageView f39299a;

    public C36538Vb2(ShapeableImageView shapeableImageView) {
        this.f39299a = shapeableImageView;
    }

    /* renamed from: a */
    public static C36538Vb2 m79707a(View view) {
        if (view != null) {
            return new C36538Vb2((ShapeableImageView) view);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ShapeableImageView getRoot() {
        return this.f39299a;
    }
}
