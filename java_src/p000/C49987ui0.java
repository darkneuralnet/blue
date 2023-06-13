package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
/* renamed from: ui0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49987ui0 {

    /* renamed from: ui0$a */
    /* loaded from: classes.dex */
    public static class C29281a {
        private C29281a() {
        }

        /* renamed from: a */
        public static Drawable m9863a(CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkDrawable();
        }
    }

    /* renamed from: ui0$b */
    /* loaded from: classes.dex */
    public static class C29282b {
        private C29282b() {
        }

        /* renamed from: a */
        public static void m9862a(CheckedTextView checkedTextView, ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        /* renamed from: b */
        public static void m9861b(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }
    }

    private C49987ui0() {
    }

    /* renamed from: a */
    public static Drawable m9866a(CheckedTextView checkedTextView) {
        return C29281a.m9863a(checkedTextView);
    }

    /* renamed from: b */
    public static void m9865b(CheckedTextView checkedTextView, ColorStateList colorStateList) {
        C29282b.m9862a(checkedTextView, colorStateList);
    }

    /* renamed from: c */
    public static void m9864c(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
        C29282b.m9861b(checkedTextView, mode);
    }
}
