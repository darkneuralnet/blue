package p000;

import android.os.Build;
import android.view.View;
import android.view.Window;
/* renamed from: jB6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43166jB6 {

    /* renamed from: jB6$a */
    /* loaded from: classes.dex */
    public static class C24731a {
        private C24731a() {
        }

        /* renamed from: a */
        public static void m31025a(Window window, boolean z) {
            int i;
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (z) {
                i = systemUiVisibility & (-1793);
            } else {
                i = systemUiVisibility | 1792;
            }
            decorView.setSystemUiVisibility(i);
        }
    }

    /* renamed from: jB6$b */
    /* loaded from: classes.dex */
    public static class C24732b {
        private C24732b() {
        }

        /* renamed from: a */
        public static void m31024a(Window window, boolean z) {
            window.setDecorFitsSystemWindows(z);
        }
    }

    private C43166jB6() {
    }

    /* renamed from: a */
    public static C41989hC6 m31027a(Window window, View view) {
        return new C41989hC6(window, view);
    }

    /* renamed from: b */
    public static void m31026b(Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            C24732b.m31024a(window, z);
        } else {
            C24731a.m31025a(window, z);
        }
    }
}
