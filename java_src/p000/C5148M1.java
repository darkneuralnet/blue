package p000;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p000.C27125p2;
/* renamed from: M1 */
/* loaded from: classes.dex */
public class C5148M1 {
    private static final View.AccessibilityDelegate DEFAULT_DELEGATE = new View.AccessibilityDelegate();
    private final View.AccessibilityDelegate mBridge;
    private final View.AccessibilityDelegate mOriginalDelegate;

    /* renamed from: M1$a */
    /* loaded from: classes.dex */
    public static final class C5149a extends View.AccessibilityDelegate {

        /* renamed from: a */
        public final C5148M1 f22440a;

        public C5149a(C5148M1 c5148m1) {
            this.f22440a = c5148m1;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f22440a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C28154s2 accessibilityNodeProvider = this.f22440a.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return (AccessibilityNodeProvider) accessibilityNodeProvider.m14861e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f22440a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            C27125p2 m20096V0 = C27125p2.m20096V0(accessibilityNodeInfo);
            m20096V0.m20126G0(C38790bq6.m62495c0(view));
            m20096V0.m20056r0(C38790bq6.m62508X(view));
            m20096V0.m20138A0(C38790bq6.m62463q(view));
            m20096V0.m20114M0(C38790bq6.m62532L(view));
            this.f22440a.onInitializeAccessibilityNodeInfo(view, m20096V0);
            m20096V0.m20081f(accessibilityNodeInfo.getText(), view);
            List<C27125p2.C27126a> actionList = C5148M1.getActionList(view);
            for (int i = 0; i < actionList.size(); i++) {
                m20096V0.m20089b(actionList.get(i));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f22440a.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f22440a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f22440a.performAccessibilityAction(view, i, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i) {
            this.f22440a.sendAccessibilityEvent(view, i);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f22440a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    /* renamed from: M1$b */
    /* loaded from: classes.dex */
    public static class C5150b {
        private C5150b() {
        }

        /* renamed from: a */
        public static AccessibilityNodeProvider m96013a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        /* renamed from: b */
        public static boolean m96012b(View.AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
        }
    }

    public C5148M1() {
        this(DEFAULT_DELEGATE);
    }

    public static List<C27125p2.C27126a> getActionList(View view) {
        List<C27125p2.C27126a> list = (List) view.getTag(C34020Kh4.tag_accessibility_actions);
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    private boolean isSpanStillValid(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] m20059q = C27125p2.m20059q(view.createAccessibilityNodeInfo().getText());
            for (int i = 0; m20059q != null && i < m20059q.length; i++) {
                if (clickableSpan.equals(m20059q[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean performClickableSpanAction(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(C34020Kh4.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i)) != null) {
            ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
            if (isSpanStillValid(clickableSpan, view)) {
                clickableSpan.onClick(view);
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public C28154s2 getAccessibilityNodeProvider(View view) {
        AccessibilityNodeProvider m96013a = C5150b.m96013a(this.mOriginalDelegate, view);
        if (m96013a != null) {
            return new C28154s2(m96013a);
        }
        return null;
    }

    public View.AccessibilityDelegate getBridge() {
        return this.mBridge;
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(View view, C27125p2 c27125p2) {
        this.mOriginalDelegate.onInitializeAccessibilityNodeInfo(view, c27125p2.m20098U0());
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        List<C27125p2.C27126a> actionList = getActionList(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= actionList.size()) {
                break;
            }
            C27125p2.C27126a c27126a = actionList.get(i2);
            if (c27126a.m20038b() == i) {
                z = c27126a.m20036d(view, bundle);
                break;
            }
            i2++;
        }
        if (!z) {
            z = C5150b.m96012b(this.mOriginalDelegate, view, i, bundle);
        }
        if (!z && i == C34020Kh4.accessibility_action_clickable_span && bundle != null) {
            return performClickableSpanAction(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
        }
        return z;
    }

    public void sendAccessibilityEvent(View view, int i) {
        this.mOriginalDelegate.sendAccessibilityEvent(view, i);
    }

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C5148M1(View.AccessibilityDelegate accessibilityDelegate) {
        this.mOriginalDelegate = accessibilityDelegate;
        this.mBridge = new C5149a(this);
    }
}
