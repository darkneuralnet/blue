package p000;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;
/* renamed from: s2 */
/* loaded from: classes.dex */
public class C28154s2 {

    /* renamed from: a */
    public final Object f108154a;

    /* renamed from: s2$a */
    /* loaded from: classes.dex */
    public static class C28155a extends AccessibilityNodeProvider {

        /* renamed from: a */
        public final C28154s2 f108155a;

        public C28155a(C28154s2 c28154s2) {
            this.f108155a = c28154s2;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C27125p2 mo4815b = this.f108155a.mo4815b(i);
            if (mo4815b == null) {
                return null;
            }
            return mo4815b.m20098U0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<C27125p2> m14862c = this.f108155a.m14862c(str, i);
            if (m14862c == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = m14862c.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(m14862c.get(i2).m20098U0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f108155a.mo4813f(i, i2, bundle);
        }
    }

    /* renamed from: s2$b */
    /* loaded from: classes.dex */
    public static class C28156b extends C28155a {
        public C28156b(C28154s2 c28154s2) {
            super(c28154s2);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i) {
            C27125p2 mo4814d = this.f108155a.mo4814d(i);
            if (mo4814d == null) {
                return null;
            }
            return mo4814d.m20098U0();
        }
    }

    /* renamed from: s2$c */
    /* loaded from: classes.dex */
    public static class C28157c extends C28156b {
        public C28157c(C28154s2 c28154s2) {
            super(c28154s2);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f108155a.m14863a(i, C27125p2.m20096V0(accessibilityNodeInfo), str, bundle);
        }
    }

    public C28154s2() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f108154a = new C28157c(this);
        } else {
            this.f108154a = new C28156b(this);
        }
    }

    /* renamed from: a */
    public void m14863a(int i, C27125p2 c27125p2, String str, Bundle bundle) {
    }

    /* renamed from: b */
    public C27125p2 mo4815b(int i) {
        return null;
    }

    /* renamed from: c */
    public List<C27125p2> m14862c(String str, int i) {
        return null;
    }

    /* renamed from: d */
    public C27125p2 mo4814d(int i) {
        return null;
    }

    /* renamed from: e */
    public Object m14861e() {
        return this.f108154a;
    }

    /* renamed from: f */
    public boolean mo4813f(int i, int i2, Bundle bundle) {
        return false;
    }

    public C28154s2(Object obj) {
        this.f108154a = obj;
    }
}
