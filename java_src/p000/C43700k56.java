package p000;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.view.View;
/* renamed from: k56  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43700k56 {
    private C43700k56() {
    }

    /* renamed from: a */
    public static int m29328a(Context context, int i) {
        return NA0.m94301c(context, i);
    }

    /* renamed from: b */
    public static Drawable m29327b(Context context, int i) {
        return C29611vi.m8248b(context, i);
    }

    /* renamed from: c */
    public static void m29326c(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    /* renamed from: d */
    public static Drawable m29325d(Context context, int i) {
        return m29324e((NinePatchDrawable) m29327b(context, C32607Eg4.toast_frame), i);
    }

    /* renamed from: e */
    public static Drawable m29324e(Drawable drawable, int i) {
        drawable.setColorFilter(i, PorterDuff.Mode.SRC_IN);
        return drawable;
    }
}
