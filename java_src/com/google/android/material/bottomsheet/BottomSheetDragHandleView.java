package com.google.android.material.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import p000.C27125p2;
import p000.InterfaceC28996u2;
/* loaded from: classes6.dex */
public class BottomSheetDragHandleView extends AppCompatImageView implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: k */
    public static final int f72432k = C50021ul4.Widget_Material3_BottomSheet_DragHandle;

    /* renamed from: b */
    public final AccessibilityManager f72433b;

    /* renamed from: c */
    public BottomSheetBehavior<?> f72434c;

    /* renamed from: d */
    public boolean f72435d;

    /* renamed from: e */
    public boolean f72436e;

    /* renamed from: f */
    public boolean f72437f;

    /* renamed from: g */
    public final String f72438g;

    /* renamed from: h */
    public final String f72439h;

    /* renamed from: i */
    public final String f72440i;

    /* renamed from: j */
    public final BottomSheetBehavior.AbstractC17702f f72441j;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDragHandleView$a */
    /* loaded from: classes6.dex */
    public class C17705a extends BottomSheetBehavior.AbstractC17702f {
        public C17705a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC17702f
        public void onSlide(View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC17702f
        public void onStateChanged(View view, int i) {
            BottomSheetDragHandleView.this.m50045k(i);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDragHandleView$b */
    /* loaded from: classes6.dex */
    public class C17706b extends C5148M1 {
        public C17706b() {
        }

        @Override // p000.C5148M1
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            if (accessibilityEvent.getEventType() == 1) {
                BottomSheetDragHandleView.this.m50049g();
            }
        }
    }

    public BottomSheetDragHandleView(Context context) {
        this(context, null);
    }

    /* renamed from: i */
    public static View m50047i(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ boolean m50046j(View view, InterfaceC28996u2.AbstractC28997a abstractC28997a) {
        return m50049g();
    }

    /* renamed from: f */
    public final void m50050f(String str) {
        if (this.f72433b == null) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
        obtain.getText().add(str);
        this.f72433b.sendAccessibilityEvent(obtain);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r1 != false) goto L14;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m50049g() {
        boolean z = false;
        if (!this.f72436e) {
            return false;
        }
        m50050f(this.f72440i);
        if (!this.f72434c.m50124P() && !this.f72434c.m50070v0()) {
            z = true;
        }
        int m50128L = this.f72434c.m50128L();
        int i = 6;
        int i2 = 3;
        if (m50128L != 4) {
            if (m50128L == 3) {
                if (!z) {
                    i = 4;
                }
                this.f72434c.m50082p0(i);
                return true;
            }
            if (!this.f72437f) {
                i2 = 4;
            }
            i = i2;
            this.f72434c.m50082p0(i);
            return true;
        }
    }

    /* renamed from: h */
    public final BottomSheetBehavior<?> m50048h() {
        View view = this;
        while (true) {
            view = m50047i(view);
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.C11529e) {
                    CoordinatorLayout.Behavior m67769f = ((CoordinatorLayout.C11529e) layoutParams).m67769f();
                    if (m67769f instanceof BottomSheetBehavior) {
                        return (BottomSheetBehavior) m67769f;
                    }
                }
            } else {
                return null;
            }
        }
    }

    /* renamed from: k */
    public final void m50045k(int i) {
        String str;
        if (i == 4) {
            this.f72437f = true;
        } else if (i == 3) {
            this.f72437f = false;
        }
        C27125p2.C27126a c27126a = C27125p2.C27126a.f102997i;
        if (this.f72437f) {
            str = this.f72438g;
        } else {
            str = this.f72439h;
        }
        C38790bq6.m62460r0(this, c27126a, str, new InterfaceC28996u2() { // from class: NZ
            @Override // p000.InterfaceC28996u2
            /* renamed from: a */
            public final boolean mo8762a(View view, InterfaceC28996u2.AbstractC28997a abstractC28997a) {
                boolean m50046j;
                m50046j = BottomSheetDragHandleView.this.m50046j(view, abstractC28997a);
                return m50046j;
            }
        });
    }

    /* renamed from: l */
    public final void m50044l(BottomSheetBehavior<?> bottomSheetBehavior) {
        BottomSheetBehavior<?> bottomSheetBehavior2 = this.f72434c;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.m50118V(this.f72441j);
            this.f72434c.m50112a0(null);
        }
        this.f72434c = bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.m50112a0(this);
            m50045k(this.f72434c.m50128L());
            this.f72434c.m50073u(this.f72441j);
        }
        m50043m();
    }

    /* renamed from: m */
    public final void m50043m() {
        boolean z;
        int i = 1;
        if (this.f72435d && this.f72434c != null) {
            z = true;
        } else {
            z = false;
        }
        this.f72436e = z;
        if (this.f72434c == null) {
            i = 2;
        }
        C38790bq6.m62539H0(this, i);
        setClickable(this.f72436e);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z) {
        this.f72435d = z;
        m50043m();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m50044l(m50048h());
        AccessibilityManager accessibilityManager = this.f72433b;
        if (accessibilityManager != null) {
            accessibilityManager.addAccessibilityStateChangeListener(this);
            onAccessibilityStateChanged(this.f72433b.isEnabled());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        AccessibilityManager accessibilityManager = this.f72433b;
        if (accessibilityManager != null) {
            accessibilityManager.removeAccessibilityStateChangeListener(this);
        }
        m50044l(null);
        super.onDetachedFromWindow();
    }

    public BottomSheetDragHandleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C49961uf4.bottomSheetDragHandleStyle);
    }

    public BottomSheetDragHandleView(Context context, AttributeSet attributeSet, int i) {
        super(VM2.m79935c(context, attributeSet, i, f72432k), attributeSet, i);
        this.f72438g = getResources().getString(C40534el4.bottomsheet_action_expand);
        this.f72439h = getResources().getString(C40534el4.bottomsheet_action_collapse);
        this.f72440i = getResources().getString(C40534el4.bottomsheet_drag_handle_clicked);
        this.f72441j = new C17705a();
        this.f72433b = (AccessibilityManager) getContext().getSystemService("accessibility");
        m50043m();
        C38790bq6.m62452v0(this, new C17706b());
    }
}
