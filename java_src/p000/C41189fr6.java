package p000;

import android.view.ViewGroup;
/* renamed from: fr6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41189fr6 {

    /* renamed from: fr6$a */
    /* loaded from: classes.dex */
    public static class C20560a {
        private C20560a() {
        }

        /* renamed from: a */
        public static int m40700a(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        /* renamed from: b */
        public static boolean m40699b(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        /* renamed from: c */
        public static void m40698c(ViewGroup viewGroup, boolean z) {
            viewGroup.setTransitionGroup(z);
        }
    }

    private C41189fr6() {
    }

    /* renamed from: a */
    public static boolean m40701a(ViewGroup viewGroup) {
        return C20560a.m40699b(viewGroup);
    }
}
