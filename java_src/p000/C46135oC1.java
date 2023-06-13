package p000;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;
@SuppressLint({"ViewConstructor"})
/* renamed from: oC1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C46135oC1 extends FrameLayout {

    /* renamed from: b */
    public ViewGroup f101597b;

    /* renamed from: c */
    public boolean f101598c;

    public C46135oC1(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.f101597b = viewGroup;
        viewGroup.setTag(C36351Ug4.ghost_view_holder, this);
        C44747lr6.m26736b(this.f101597b).mo31749c(this);
        this.f101598c = true;
    }

    /* renamed from: b */
    public static C46135oC1 m21640b(ViewGroup viewGroup) {
        return (C46135oC1) viewGroup.getTag(C36351Ug4.ghost_view_holder);
    }

    /* renamed from: d */
    public static void m21638d(View view, ArrayList<View> arrayList) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            m21638d((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    /* renamed from: e */
    public static boolean m21637e(View view, View view2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        if (view.getZ() != view2.getZ()) {
            if (view.getZ() <= view2.getZ()) {
                return false;
            }
            return true;
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(C44747lr6.m26737a(viewGroup, i));
            if (childAt == view) {
                return false;
            }
            if (childAt == view2) {
                break;
            }
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m21636f(ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        if (arrayList.isEmpty() || arrayList2.isEmpty() || arrayList.get(0) != arrayList2.get(0)) {
            return true;
        }
        int min = Math.min(arrayList.size(), arrayList2.size());
        for (int i = 1; i < min; i++) {
            View view = arrayList.get(i);
            View view2 = arrayList2.get(i);
            if (view != view2) {
                return m21637e(view, view2);
            }
        }
        if (arrayList2.size() == min) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m21641a(C47321qC1 c47321qC1) {
        ArrayList<View> arrayList = new ArrayList<>();
        m21638d(c47321qC1.f104905d, arrayList);
        int m21639c = m21639c(arrayList);
        if (m21639c >= 0 && m21639c < getChildCount()) {
            addView(c47321qC1, m21639c);
        } else {
            addView(c47321qC1);
        }
    }

    /* renamed from: c */
    public final int m21639c(ArrayList<View> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int childCount = getChildCount() - 1;
        int i = 0;
        while (i <= childCount) {
            int i2 = (i + childCount) / 2;
            m21638d(((C47321qC1) getChildAt(i2)).f104905d, arrayList2);
            if (m21636f(arrayList, arrayList2)) {
                i = i2 + 1;
            } else {
                childCount = i2 - 1;
            }
            arrayList2.clear();
        }
        return i;
    }

    /* renamed from: g */
    public void m21635g() {
        if (this.f101598c) {
            C44747lr6.m26736b(this.f101597b).mo31748d(this);
            C44747lr6.m26736b(this.f101597b).mo31749c(this);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (this.f101598c) {
            super.onViewAdded(view);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.f101597b.setTag(C36351Ug4.ghost_view_holder, null);
            C44747lr6.m26736b(this.f101597b).mo31748d(this);
            this.f101598c = false;
        }
    }
}
