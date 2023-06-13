package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.internal.FlowLayout;
import java.util.List;
import java.util.Set;
import p000.C27125p2;
import p000.C47023pi0;
/* loaded from: classes6.dex */
public class ChipGroup extends FlowLayout {

    /* renamed from: l */
    public static final int f72535l = C50021ul4.Widget_MaterialComponents_ChipGroup;

    /* renamed from: f */
    public int f72536f;

    /* renamed from: g */
    public int f72537g;

    /* renamed from: h */
    public InterfaceC17736d f72538h;

    /* renamed from: i */
    public final C47023pi0<Chip> f72539i;

    /* renamed from: j */
    public final int f72540j;

    /* renamed from: k */
    public final ViewGroup$OnHierarchyChangeListenerC17737e f72541k;

    /* loaded from: classes6.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$a */
    /* loaded from: classes6.dex */
    public class C17733a implements C47023pi0.InterfaceC27342b {
        public C17733a() {
        }

        @Override // p000.C47023pi0.InterfaceC27342b
        /* renamed from: a */
        public void mo18932a(Set<Integer> set) {
            if (ChipGroup.this.f72538h != null) {
                InterfaceC17736d interfaceC17736d = ChipGroup.this.f72538h;
                ChipGroup chipGroup = ChipGroup.this;
                interfaceC17736d.mo49932a(chipGroup, chipGroup.f72539i.m18943j(ChipGroup.this));
            }
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$b */
    /* loaded from: classes6.dex */
    public class C17734b implements InterfaceC17736d {
        public C17734b(InterfaceC17735c interfaceC17735c) {
        }

        @Override // com.google.android.material.chip.ChipGroup.InterfaceC17736d
        /* renamed from: a */
        public void mo49932a(ChipGroup chipGroup, List<Integer> list) {
            if (!ChipGroup.this.f72539i.m18941l()) {
                return;
            }
            ChipGroup.this.m49937j();
            throw null;
        }
    }

    @Deprecated
    /* renamed from: com.google.android.material.chip.ChipGroup$c */
    /* loaded from: classes6.dex */
    public interface InterfaceC17735c {
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$d */
    /* loaded from: classes6.dex */
    public interface InterfaceC17736d {
        /* renamed from: a */
        void mo49932a(ChipGroup chipGroup, List<Integer> list);
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$e */
    /* loaded from: classes6.dex */
    public class ViewGroup$OnHierarchyChangeListenerC17737e implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: b */
        public ViewGroup.OnHierarchyChangeListener f72544b;

        public ViewGroup$OnHierarchyChangeListenerC17737e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(C38790bq6.m62473l());
                }
                ChipGroup.this.f72539i.m18948e((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f72544b;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                chipGroup.f72539i.m18939n((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f72544b;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }

        public /* synthetic */ ViewGroup$OnHierarchyChangeListenerC17737e(ChipGroup chipGroup, C17733a c17733a) {
            this();
        }
    }

    public ChipGroup(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    @Override // com.google.android.material.internal.FlowLayout
    /* renamed from: d */
    public boolean mo49409d() {
        return super.mo49409d();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: j */
    public int m49937j() {
        return this.f72539i.m18942k();
    }

    /* renamed from: k */
    public int m49936k(View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt instanceof Chip) && m49934m(i2)) {
                if (((Chip) childAt) == view) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    /* renamed from: l */
    public final int m49935l() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof Chip) && m49934m(i2)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: m */
    public final boolean m49934m(int i) {
        return getChildAt(i).getVisibility() == 0;
    }

    /* renamed from: n */
    public boolean m49933n() {
        return this.f72539i.m18941l();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f72540j;
        if (i != -1) {
            this.f72539i.m18947f(i);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        int i2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C27125p2 m20096V0 = C27125p2.m20096V0(accessibilityNodeInfo);
        if (mo49409d()) {
            i = m49935l();
        } else {
            i = -1;
        }
        int m49411b = m49411b();
        if (m49933n()) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        m20096V0.m20076h0(C27125p2.C27127b.m20034b(m49411b, i, false, i2));
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.f72536f != i) {
            this.f72536f = i;
            m49407f(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.f72537g != i) {
            this.f72537g = i;
            m49406g(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(InterfaceC17735c interfaceC17735c) {
        if (interfaceC17735c == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new C17734b(interfaceC17735c));
        }
    }

    public void setOnCheckedStateChangeListener(InterfaceC17736d interfaceC17736d) {
        this.f72538h = interfaceC17736d;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f72541k.f72544b = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.f72539i.m18937p(z);
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // com.google.android.material.internal.FlowLayout
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(boolean z) {
        this.f72539i.m18936q(z);
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C49961uf4.chipGroupStyle);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ChipGroup(Context context, AttributeSet attributeSet, int i) {
        super(VM2.m79935c(context, attributeSet, i, r4), attributeSet, i);
        int i2 = f72535l;
        C47023pi0<Chip> c47023pi0 = new C47023pi0<>();
        this.f72539i = c47023pi0;
        ViewGroup$OnHierarchyChangeListenerC17737e viewGroup$OnHierarchyChangeListenerC17737e = new ViewGroup$OnHierarchyChangeListenerC17737e(this, null);
        this.f72541k = viewGroup$OnHierarchyChangeListenerC17737e;
        TypedArray m21866i = C46052o36.m21866i(getContext(), attributeSet, C37098Xl4.ChipGroup, i, i2, new int[0]);
        int dimensionPixelOffset = m21866i.getDimensionPixelOffset(C37098Xl4.ChipGroup_chipSpacing, 0);
        setChipSpacingHorizontal(m21866i.getDimensionPixelOffset(C37098Xl4.ChipGroup_chipSpacingHorizontal, dimensionPixelOffset));
        setChipSpacingVertical(m21866i.getDimensionPixelOffset(C37098Xl4.ChipGroup_chipSpacingVertical, dimensionPixelOffset));
        setSingleLine(m21866i.getBoolean(C37098Xl4.ChipGroup_singleLine, false));
        setSingleSelection(m21866i.getBoolean(C37098Xl4.ChipGroup_singleSelection, false));
        setSelectionRequired(m21866i.getBoolean(C37098Xl4.ChipGroup_selectionRequired, false));
        this.f72540j = m21866i.getResourceId(C37098Xl4.ChipGroup_checkedChip, -1);
        m21866i.recycle();
        c47023pi0.m18938o(new C17733a());
        super.setOnHierarchyChangeListener(viewGroup$OnHierarchyChangeListenerC17737e);
        C38790bq6.m62539H0(this, 1);
    }
}
