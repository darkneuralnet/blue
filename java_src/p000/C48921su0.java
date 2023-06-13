package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
/* renamed from: su0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48921su0 {

    /* renamed from: su0$a */
    /* loaded from: classes.dex */
    public static class C28427a {
        private C28427a() {
        }

        /* renamed from: a */
        public static ColorStateList m13541a(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        /* renamed from: b */
        public static PorterDuff.Mode m13540b(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        /* renamed from: c */
        public static void m13539c(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        /* renamed from: d */
        public static void m13538d(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    /* renamed from: su0$b */
    /* loaded from: classes.dex */
    public static class C28428b {
        private C28428b() {
        }

        /* renamed from: a */
        public static Drawable m13537a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    private C48921su0() {
    }

    /* renamed from: a */
    public static Drawable m13546a(CompoundButton compoundButton) {
        return C28428b.m13537a(compoundButton);
    }

    /* renamed from: b */
    public static ColorStateList m13545b(CompoundButton compoundButton) {
        return C28427a.m13541a(compoundButton);
    }

    /* renamed from: c */
    public static PorterDuff.Mode m13544c(CompoundButton compoundButton) {
        return C28427a.m13540b(compoundButton);
    }

    /* renamed from: d */
    public static void m13543d(CompoundButton compoundButton, ColorStateList colorStateList) {
        C28427a.m13539c(compoundButton, colorStateList);
    }

    /* renamed from: e */
    public static void m13542e(CompoundButton compoundButton, PorterDuff.Mode mode) {
        C28427a.m13538d(compoundButton, mode);
    }
}
