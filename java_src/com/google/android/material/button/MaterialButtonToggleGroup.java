package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import p000.C27125p2;
import p000.C43037iy5;
/* loaded from: classes6.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: l */
    public static final int f72455l = C50021ul4.Widget_MaterialComponents_MaterialButtonToggleGroup;

    /* renamed from: b */
    public final List<C17722c> f72456b;

    /* renamed from: c */
    public final C17724e f72457c;

    /* renamed from: d */
    public final LinkedHashSet<InterfaceC17723d> f72458d;

    /* renamed from: e */
    public final Comparator<MaterialButton> f72459e;

    /* renamed from: f */
    public Integer[] f72460f;

    /* renamed from: g */
    public boolean f72461g;

    /* renamed from: h */
    public boolean f72462h;

    /* renamed from: i */
    public boolean f72463i;

    /* renamed from: j */
    public final int f72464j;

    /* renamed from: k */
    public Set<Integer> f72465k;

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$a */
    /* loaded from: classes6.dex */
    public class C17720a implements Comparator<MaterialButton> {
        public C17720a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            return Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$b */
    /* loaded from: classes6.dex */
    public class C17721b extends C5148M1 {
        public C17721b() {
        }

        @Override // p000.C5148M1
        public void onInitializeAccessibilityNodeInfo(View view, C27125p2 c27125p2) {
            super.onInitializeAccessibilityNodeInfo(view, c27125p2);
            c27125p2.m20074i0(C27125p2.C27128c.m20033a(0, 1, MaterialButtonToggleGroup.this.m50026j(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$c */
    /* loaded from: classes6.dex */
    public static class C17722c {

        /* renamed from: e */
        public static final NC0 f72468e = new C20168f0(0.0f);

        /* renamed from: a */
        public NC0 f72469a;

        /* renamed from: b */
        public NC0 f72470b;

        /* renamed from: c */
        public NC0 f72471c;

        /* renamed from: d */
        public NC0 f72472d;

        public C17722c(NC0 nc0, NC0 nc02, NC0 nc03, NC0 nc04) {
            this.f72469a = nc0;
            this.f72470b = nc03;
            this.f72471c = nc04;
            this.f72472d = nc02;
        }

        /* renamed from: a */
        public static C17722c m50010a(C17722c c17722c) {
            NC0 nc0 = f72468e;
            return new C17722c(nc0, c17722c.f72472d, nc0, c17722c.f72471c);
        }

        /* renamed from: b */
        public static C17722c m50009b(C17722c c17722c, View view) {
            return C36704Vt6.m79294n(view) ? m50008c(c17722c) : m50007d(c17722c);
        }

        /* renamed from: c */
        public static C17722c m50008c(C17722c c17722c) {
            NC0 nc0 = c17722c.f72469a;
            NC0 nc02 = c17722c.f72472d;
            NC0 nc03 = f72468e;
            return new C17722c(nc0, nc02, nc03, nc03);
        }

        /* renamed from: d */
        public static C17722c m50007d(C17722c c17722c) {
            NC0 nc0 = f72468e;
            return new C17722c(nc0, nc0, c17722c.f72470b, c17722c.f72471c);
        }

        /* renamed from: e */
        public static C17722c m50006e(C17722c c17722c, View view) {
            return C36704Vt6.m79294n(view) ? m50007d(c17722c) : m50008c(c17722c);
        }

        /* renamed from: f */
        public static C17722c m50005f(C17722c c17722c) {
            NC0 nc0 = c17722c.f72469a;
            NC0 nc02 = f72468e;
            return new C17722c(nc0, nc02, c17722c.f72470b, nc02);
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$d */
    /* loaded from: classes6.dex */
    public interface InterfaceC17723d {
        /* renamed from: a */
        void mo48500a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$e */
    /* loaded from: classes6.dex */
    public class C17724e implements MaterialButton.InterfaceC17719b {
        public C17724e() {
        }

        @Override // com.google.android.material.button.MaterialButton.InterfaceC17719b
        /* renamed from: a */
        public void mo50004a(MaterialButton materialButton, boolean z) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        public /* synthetic */ C17724e(MaterialButtonToggleGroup materialButtonToggleGroup, C17720a c17720a) {
            this();
        }
    }

    public MaterialButtonToggleGroup(Context context) {
        this(context, null);
    }

    /* renamed from: u */
    public static void m50015u(C43037iy5.C24658b c24658b, C17722c c17722c) {
        if (c17722c == null) {
            c24658b.m31493o(0.0f);
        } else {
            c24658b.m31512H(c17722c.f72469a).m31484x(c17722c.f72472d).m31508L(c17722c.f72470b).m31517C(c17722c.f72471c);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        m50017s(materialButton);
        m50016t(materialButton);
        m50031e(materialButton.getId(), materialButton.isChecked());
        C43037iy5 shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f72456b.add(new C17722c(shapeAppearanceModel.m31527r(), shapeAppearanceModel.m31535j(), shapeAppearanceModel.m31525t(), shapeAppearanceModel.m31533l()));
        materialButton.setEnabled(isEnabled());
        C38790bq6.m62452v0(materialButton, new C17721b());
    }

    /* renamed from: b */
    public void m50034b(InterfaceC17723d interfaceC17723d) {
        this.f72458d.add(interfaceC17723d);
    }

    /* renamed from: c */
    public final void m50033c() {
        int m50027i = m50027i();
        if (m50027i == -1) {
            return;
        }
        for (int i = m50027i + 1; i < getChildCount(); i++) {
            MaterialButton m50028h = m50028h(i);
            int min = Math.min(m50028h.getStrokeWidth(), m50028h(i - 1).getStrokeWidth());
            LinearLayout.LayoutParams m50032d = m50032d(m50028h);
            if (getOrientation() == 0) {
                C39093cM2.m61541c(m50032d, 0);
                C39093cM2.m61540d(m50032d, -min);
                m50032d.topMargin = 0;
            } else {
                m50032d.bottomMargin = 0;
                m50032d.topMargin = -min;
                C39093cM2.m61540d(m50032d, 0);
            }
            m50028h.setLayoutParams(m50032d);
        }
        m50019q(m50027i);
    }

    /* renamed from: d */
    public final LinearLayout.LayoutParams m50032d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        m50013w();
        super.dispatchDraw(canvas);
    }

    /* renamed from: e */
    public final void m50031e(int i, boolean z) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.f72465k);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.f72462h && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else if (!z && hashSet.contains(Integer.valueOf(i))) {
            if (!this.f72463i || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        } else {
            return;
        }
        m50014v(hashSet);
    }

    /* renamed from: f */
    public void m50030f() {
        m50014v(new HashSet());
    }

    /* renamed from: g */
    public final void m50029g(int i, boolean z) {
        Iterator<InterfaceC17723d> it = this.f72458d.iterator();
        while (it.hasNext()) {
            it.next().mo48500a(this, i, z);
        }
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f72460f;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i2;
    }

    /* renamed from: h */
    public final MaterialButton m50028h(int i) {
        return (MaterialButton) getChildAt(i);
    }

    /* renamed from: i */
    public final int m50027i() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (m50022n(i)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public final int m50026j(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) == view) {
                return i;
            }
            if ((getChildAt(i2) instanceof MaterialButton) && m50022n(i2)) {
                i++;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final int m50025k() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m50022n(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    /* renamed from: l */
    public final C17722c m50024l(int i, int i2, int i3) {
        boolean z;
        C17722c c17722c = this.f72456b.get(i);
        if (i2 == i3) {
            return c17722c;
        }
        if (getOrientation() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i == i2) {
            if (z) {
                return C17722c.m50006e(c17722c, this);
            }
            return C17722c.m50005f(c17722c);
        } else if (i == i3) {
            if (z) {
                return C17722c.m50009b(c17722c, this);
            }
            return C17722c.m50010a(c17722c);
        } else {
            return null;
        }
    }

    /* renamed from: m */
    public final int m50023m() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && m50022n(i2)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: n */
    public final boolean m50022n(int i) {
        if (getChildAt(i).getVisibility() != 8) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public boolean m50021o() {
        return this.f72462h;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f72464j;
        if (i != -1) {
            m50014v(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C27125p2 m20096V0 = C27125p2.m20096V0(accessibilityNodeInfo);
        int m50023m = m50023m();
        if (m50021o()) {
            i = 1;
        } else {
            i = 2;
        }
        m20096V0.m20076h0(C27125p2.C27127b.m20034b(1, m50023m, false, i));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        m50012x();
        m50033c();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f72456b.remove(indexOfChild);
        }
        m50012x();
        m50033c();
    }

    /* renamed from: p */
    public void m50020p(MaterialButton materialButton, boolean z) {
        if (this.f72461g) {
            return;
        }
        m50031e(materialButton.getId(), z);
    }

    /* renamed from: q */
    public final void m50019q(int i) {
        if (getChildCount() != 0 && i != -1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) m50028h(i).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams.topMargin = 0;
                layoutParams.bottomMargin = 0;
                return;
            }
            C39093cM2.m61541c(layoutParams, 0);
            C39093cM2.m61540d(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    /* renamed from: r */
    public final void m50018r(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof MaterialButton) {
            this.f72461g = true;
            ((MaterialButton) findViewById).setChecked(z);
            this.f72461g = false;
        }
    }

    /* renamed from: s */
    public final void m50017s(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(C38790bq6.m62473l());
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            m50028h(i).setEnabled(z);
        }
    }

    public void setSelectionRequired(boolean z) {
        this.f72463i = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.f72462h != z) {
            this.f72462h = z;
            m50030f();
        }
    }

    /* renamed from: t */
    public final void m50016t(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f72457c);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    /* renamed from: v */
    public final void m50014v(Set<Integer> set) {
        Set<Integer> set2 = this.f72465k;
        this.f72465k = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = m50028h(i).getId();
            m50018r(id, set.contains(Integer.valueOf(id)));
            if (set2.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                m50029g(id, set.contains(Integer.valueOf(id)));
            }
        }
        invalidate();
    }

    /* renamed from: w */
    public final void m50013w() {
        TreeMap treeMap = new TreeMap(this.f72459e);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(m50028h(i), Integer.valueOf(i));
        }
        this.f72460f = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    /* renamed from: x */
    public void m50012x() {
        int childCount = getChildCount();
        int m50027i = m50027i();
        int m50025k = m50025k();
        for (int i = 0; i < childCount; i++) {
            MaterialButton m50028h = m50028h(i);
            if (m50028h.getVisibility() != 8) {
                C43037iy5.C24658b m31523v = m50028h.getShapeAppearanceModel().m31523v();
                m50015u(m31523v, m50024l(i, m50027i, m50025k));
                m50028h.setShapeAppearanceModel(m31523v.m31495m());
            }
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C49961uf4.materialButtonToggleGroupStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i) {
        super(VM2.m79935c(context, attributeSet, i, r4), attributeSet, i);
        int i2 = f72455l;
        this.f72456b = new ArrayList();
        this.f72457c = new C17724e(this, null);
        this.f72458d = new LinkedHashSet<>();
        this.f72459e = new C17720a();
        this.f72461g = false;
        this.f72465k = new HashSet();
        TypedArray m21866i = C46052o36.m21866i(getContext(), attributeSet, C37098Xl4.MaterialButtonToggleGroup, i, i2, new int[0]);
        setSingleSelection(m21866i.getBoolean(C37098Xl4.MaterialButtonToggleGroup_singleSelection, false));
        this.f72464j = m21866i.getResourceId(C37098Xl4.MaterialButtonToggleGroup_checkedButton, -1);
        this.f72463i = m21866i.getBoolean(C37098Xl4.MaterialButtonToggleGroup_selectionRequired, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(m21866i.getBoolean(C37098Xl4.MaterialButtonToggleGroup_android_enabled, true));
        m21866i.recycle();
        C38790bq6.m62539H0(this, 1);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
