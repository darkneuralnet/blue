package p000;

import android.view.accessibility.AccessibilityManager;
/* renamed from: R1 */
/* loaded from: classes.dex */
public final class C7051R1 {

    /* renamed from: R1$a */
    /* loaded from: classes.dex */
    public static class C7052a {
        private C7052a() {
        }

        /* renamed from: a */
        public static boolean m87423a(AccessibilityManager accessibilityManager, InterfaceC7053b interfaceC7053b) {
            return accessibilityManager.addTouchExplorationStateChangeListener(new accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC7054c(interfaceC7053b));
        }

        /* renamed from: b */
        public static boolean m87422b(AccessibilityManager accessibilityManager, InterfaceC7053b interfaceC7053b) {
            return accessibilityManager.removeTouchExplorationStateChangeListener(new accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC7054c(interfaceC7053b));
        }
    }

    /* renamed from: R1$b */
    /* loaded from: classes.dex */
    public interface InterfaceC7053b {
        void onTouchExplorationStateChanged(boolean z);
    }

    /* renamed from: R1$c  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC7054c implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a */
        public final InterfaceC7053b f31400a;

        public accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC7054c(InterfaceC7053b interfaceC7053b) {
            this.f31400a = interfaceC7053b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC7054c)) {
                return false;
            }
            return this.f31400a.equals(((accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC7054c) obj).f31400a);
        }

        public int hashCode() {
            return this.f31400a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z) {
            this.f31400a.onTouchExplorationStateChanged(z);
        }
    }

    private C7051R1() {
    }

    /* renamed from: a */
    public static boolean m87425a(AccessibilityManager accessibilityManager, InterfaceC7053b interfaceC7053b) {
        return C7052a.m87423a(accessibilityManager, interfaceC7053b);
    }

    /* renamed from: b */
    public static boolean m87424b(AccessibilityManager accessibilityManager, InterfaceC7053b interfaceC7053b) {
        return C7052a.m87422b(accessibilityManager, interfaceC7053b);
    }
}
