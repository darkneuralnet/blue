package p000;

import android.view.View;
import android.widget.PopupWindow;
/* renamed from: BY3 */
/* loaded from: classes.dex */
public final class BY3 {

    /* renamed from: BY3$a */
    /* loaded from: classes.dex */
    public static class C0642a {
        private C0642a() {
        }

        /* renamed from: a */
        public static void m113872a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            popupWindow.showAsDropDown(view, i, i2, i3);
        }
    }

    /* renamed from: BY3$b */
    /* loaded from: classes.dex */
    public static class C0643b {
        private C0643b() {
        }

        /* renamed from: a */
        public static boolean m113871a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        /* renamed from: b */
        public static int m113870b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        /* renamed from: c */
        public static void m113869c(PopupWindow popupWindow, boolean z) {
            popupWindow.setOverlapAnchor(z);
        }

        /* renamed from: d */
        public static void m113868d(PopupWindow popupWindow, int i) {
            popupWindow.setWindowLayoutType(i);
        }
    }

    private BY3() {
    }

    /* renamed from: a */
    public static void m113875a(PopupWindow popupWindow, boolean z) {
        C0643b.m113869c(popupWindow, z);
    }

    /* renamed from: b */
    public static void m113874b(PopupWindow popupWindow, int i) {
        C0643b.m113868d(popupWindow, i);
    }

    /* renamed from: c */
    public static void m113873c(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        C0642a.m113872a(popupWindow, view, i, i2, i3);
    }
}
