package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;
/* renamed from: androidx.recyclerview.widget.s */
/* loaded from: classes.dex */
public class C11949s extends C5148M1 {

    /* renamed from: a */
    public final RecyclerView f55584a;

    /* renamed from: b */
    public final C11950a f55585b;

    /* renamed from: androidx.recyclerview.widget.s$a */
    /* loaded from: classes.dex */
    public static class C11950a extends C5148M1 {

        /* renamed from: a */
        public final C11949s f55586a;

        /* renamed from: b */
        public Map<View, C5148M1> f55587b = new WeakHashMap();

        public C11950a(C11949s c11949s) {
            this.f55586a = c11949s;
        }

        /* renamed from: a */
        public C5148M1 m66138a(View view) {
            return this.f55587b.remove(view);
        }

        /* renamed from: b */
        public void m66137b(View view) {
            C5148M1 m62471m = C38790bq6.m62471m(view);
            if (m62471m != null && m62471m != this) {
                this.f55587b.put(view, m62471m);
            }
        }

        @Override // p000.C5148M1
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            C5148M1 c5148m1 = this.f55587b.get(view);
            if (c5148m1 != null) {
                return c5148m1.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // p000.C5148M1
        public C28154s2 getAccessibilityNodeProvider(View view) {
            C5148M1 c5148m1 = this.f55587b.get(view);
            if (c5148m1 != null) {
                return c5148m1.getAccessibilityNodeProvider(view);
            }
            return super.getAccessibilityNodeProvider(view);
        }

        @Override // p000.C5148M1
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            C5148M1 c5148m1 = this.f55587b.get(view);
            if (c5148m1 != null) {
                c5148m1.onInitializeAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // p000.C5148M1
        public void onInitializeAccessibilityNodeInfo(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) C27125p2 c27125p2) {
            if (!this.f55586a.m66139b() && this.f55586a.f55584a.getLayoutManager() != null) {
                this.f55586a.f55584a.getLayoutManager().m66590f1(view, c27125p2);
                C5148M1 c5148m1 = this.f55587b.get(view);
                if (c5148m1 != null) {
                    c5148m1.onInitializeAccessibilityNodeInfo(view, c27125p2);
                    return;
                } else {
                    super.onInitializeAccessibilityNodeInfo(view, c27125p2);
                    return;
                }
            }
            super.onInitializeAccessibilityNodeInfo(view, c27125p2);
        }

        @Override // p000.C5148M1
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            C5148M1 c5148m1 = this.f55587b.get(view);
            if (c5148m1 != null) {
                c5148m1.onPopulateAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // p000.C5148M1
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C5148M1 c5148m1 = this.f55587b.get(viewGroup);
            if (c5148m1 != null) {
                return c5148m1.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // p000.C5148M1
        public boolean performAccessibilityAction(@SuppressLint({"InvalidNullabilityOverride"}) View view, int i, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
            if (!this.f55586a.m66139b() && this.f55586a.f55584a.getLayoutManager() != null) {
                C5148M1 c5148m1 = this.f55587b.get(view);
                if (c5148m1 != null) {
                    if (c5148m1.performAccessibilityAction(view, i, bundle)) {
                        return true;
                    }
                } else if (super.performAccessibilityAction(view, i, bundle)) {
                    return true;
                }
                return this.f55586a.f55584a.getLayoutManager().m66558z1(view, i, bundle);
            }
            return super.performAccessibilityAction(view, i, bundle);
        }

        @Override // p000.C5148M1
        public void sendAccessibilityEvent(View view, int i) {
            C5148M1 c5148m1 = this.f55587b.get(view);
            if (c5148m1 != null) {
                c5148m1.sendAccessibilityEvent(view, i);
            } else {
                super.sendAccessibilityEvent(view, i);
            }
        }

        @Override // p000.C5148M1
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            C5148M1 c5148m1 = this.f55587b.get(view);
            if (c5148m1 != null) {
                c5148m1.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            } else {
                super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public C11949s(RecyclerView recyclerView) {
        this.f55584a = recyclerView;
        C5148M1 m66140a = m66140a();
        if (m66140a != null && (m66140a instanceof C11950a)) {
            this.f55585b = (C11950a) m66140a;
        } else {
            this.f55585b = new C11950a(this);
        }
    }

    /* renamed from: a */
    public C5148M1 m66140a() {
        return this.f55585b;
    }

    /* renamed from: b */
    public boolean m66139b() {
        return this.f55584a.hasPendingAdapterUpdates();
    }

    @Override // p000.C5148M1
    public void onInitializeAccessibilityEvent(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !m66139b()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().mo66450b1(accessibilityEvent);
            }
        }
    }

    @Override // p000.C5148M1
    public void onInitializeAccessibilityNodeInfo(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) C27125p2 c27125p2) {
        super.onInitializeAccessibilityNodeInfo(view, c27125p2);
        if (!m66139b() && this.f55584a.getLayoutManager() != null) {
            this.f55584a.getLayoutManager().m66593d1(c27125p2);
        }
    }

    @Override // p000.C5148M1
    public boolean performAccessibilityAction(@SuppressLint({"InvalidNullabilityOverride"}) View view, int i, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        if (!m66139b() && this.f55584a.getLayoutManager() != null) {
            return this.f55584a.getLayoutManager().m66563x1(i, bundle);
        }
        return false;
    }
}
