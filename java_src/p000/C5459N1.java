package p000;

import android.view.accessibility.AccessibilityEvent;
/* renamed from: N1 */
/* loaded from: classes.dex */
public final class C5459N1 {

    /* renamed from: N1$a */
    /* loaded from: classes.dex */
    public static class C5460a {
        private C5460a() {
        }

        /* renamed from: a */
        public static int m94456a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getContentChangeTypes();
        }

        /* renamed from: b */
        public static void m94455b(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    private C5459N1() {
    }

    /* renamed from: a */
    public static int m94458a(AccessibilityEvent accessibilityEvent) {
        return C5460a.m94456a(accessibilityEvent);
    }

    /* renamed from: b */
    public static void m94457b(AccessibilityEvent accessibilityEvent, int i) {
        C5460a.m94455b(accessibilityEvent, i);
    }
}
