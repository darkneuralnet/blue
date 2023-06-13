package p000;

import android.graphics.drawable.Drawable;
/* renamed from: Z83 */
/* loaded from: classes5.dex */
public final class Z83 extends V61<Drawable> {
    public Z83(Drawable drawable) {
        super(drawable);
    }

    /* renamed from: f */
    public static VL4<Drawable> m73666f(Drawable drawable) {
        if (drawable != null) {
            return new Z83(drawable);
        }
        return null;
    }

    @Override // p000.VL4
    /* renamed from: a */
    public int mo5713a() {
        return Math.max(1, this.f38640b.getIntrinsicWidth() * this.f38640b.getIntrinsicHeight() * 4);
    }

    @Override // p000.VL4
    /* renamed from: b */
    public void mo5712b() {
    }

    @Override // p000.VL4
    /* renamed from: d */
    public Class<Drawable> mo5710d() {
        return this.f38640b.getClass();
    }
}
