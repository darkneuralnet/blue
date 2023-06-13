package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;
/* renamed from: xY1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C51668xY1 {

    /* renamed from: xY1$a */
    /* loaded from: classes.dex */
    public static class C30230a {
        private C30230a() {
        }

        /* renamed from: a */
        public static ColorStateList m5033a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        /* renamed from: b */
        public static PorterDuff.Mode m5032b(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        /* renamed from: c */
        public static void m5031c(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        /* renamed from: d */
        public static void m5030d(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }

    private C51668xY1() {
    }

    /* renamed from: a */
    public static ColorStateList m5037a(ImageView imageView) {
        return C30230a.m5033a(imageView);
    }

    /* renamed from: b */
    public static PorterDuff.Mode m5036b(ImageView imageView) {
        return C30230a.m5032b(imageView);
    }

    /* renamed from: c */
    public static void m5035c(ImageView imageView, ColorStateList colorStateList) {
        C30230a.m5031c(imageView, colorStateList);
    }

    /* renamed from: d */
    public static void m5034d(ImageView imageView, PorterDuff.Mode mode) {
        C30230a.m5030d(imageView, mode);
    }
}
