package p000;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;
/* renamed from: t2 */
/* loaded from: classes.dex */
public class C28509t2 {

    /* renamed from: t2$a */
    /* loaded from: classes.dex */
    public static class C28510a {
        private C28510a() {
        }

        /* renamed from: a */
        public static int m13207a(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollX();
        }

        /* renamed from: b */
        public static int m13206b(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollY();
        }

        /* renamed from: c */
        public static void m13205c(AccessibilityRecord accessibilityRecord, int i) {
            accessibilityRecord.setMaxScrollX(i);
        }

        /* renamed from: d */
        public static void m13204d(AccessibilityRecord accessibilityRecord, int i) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }

    /* renamed from: t2$b */
    /* loaded from: classes.dex */
    public static class C28511b {
        private C28511b() {
        }

        /* renamed from: a */
        public static void m13203a(AccessibilityRecord accessibilityRecord, View view, int i) {
            accessibilityRecord.setSource(view, i);
        }
    }

    /* renamed from: a */
    public static void m13210a(AccessibilityRecord accessibilityRecord, int i) {
        C28510a.m13205c(accessibilityRecord, i);
    }

    /* renamed from: b */
    public static void m13209b(AccessibilityRecord accessibilityRecord, int i) {
        C28510a.m13204d(accessibilityRecord, i);
    }

    /* renamed from: c */
    public static void m13208c(AccessibilityRecord accessibilityRecord, View view, int i) {
        C28511b.m13203a(accessibilityRecord, view, i);
    }
}
