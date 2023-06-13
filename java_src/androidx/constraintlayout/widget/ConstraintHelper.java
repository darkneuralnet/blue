package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.C11515b;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
/* loaded from: classes.dex */
public abstract class ConstraintHelper extends View {

    /* renamed from: b */
    public int[] f53936b;

    /* renamed from: c */
    public int f53937c;

    /* renamed from: d */
    public Context f53938d;

    /* renamed from: e */
    public HL1 f53939e;

    /* renamed from: f */
    public boolean f53940f;

    /* renamed from: g */
    public String f53941g;

    /* renamed from: h */
    public String f53942h;

    /* renamed from: i */
    public View[] f53943i;

    /* renamed from: j */
    public HashMap<Integer, String> f53944j;

    public ConstraintHelper(Context context) {
        super(context);
        this.f53936b = new int[32];
        this.f53940f = false;
        this.f53943i = null;
        this.f53944j = new HashMap<>();
        this.f53938d = context;
        mo67862q(null);
    }

    /* renamed from: A */
    public void m67902A(ConstraintLayout constraintLayout) {
        String str;
        int m67893m;
        if (isInEditMode()) {
            m67886u(this.f53941g);
        }
        HL1 hl1 = this.f53939e;
        if (hl1 == null) {
            return;
        }
        hl1.mo100670a();
        for (int i = 0; i < this.f53937c; i++) {
            int i2 = this.f53936b[i];
            View viewById = constraintLayout.getViewById(i2);
            if (viewById == null && (m67893m = m67893m(constraintLayout, (str = this.f53944j.get(Integer.valueOf(i2))))) != 0) {
                this.f53936b[i] = m67893m;
                this.f53944j.put(Integer.valueOf(m67893m), str);
                viewById = constraintLayout.getViewById(m67893m);
            }
            if (viewById != null) {
                this.f53939e.mo100669c(constraintLayout.getViewWidget(viewById));
            }
        }
        this.f53939e.mo122b(constraintLayout.mLayoutWidget);
    }

    /* renamed from: B */
    public void m67901B() {
        if (this.f53939e == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).f54014v0 = (C43042iz0) this.f53939e;
        }
    }

    /* renamed from: e */
    public final void m67900e(String str) {
        if (str == null || str.length() == 0 || this.f53938d == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
            ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
        }
        int m67892n = m67892n(trim);
        if (m67892n != 0) {
            this.f53944j.put(Integer.valueOf(m67892n), trim);
            m67899f(m67892n);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
    }

    /* renamed from: f */
    public final void m67899f(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f53937c + 1;
        int[] iArr = this.f53936b;
        if (i2 > iArr.length) {
            this.f53936b = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f53936b;
        int i3 = this.f53937c;
        iArr2[i3] = i;
        this.f53937c = i3 + 1;
    }

    /* renamed from: g */
    public final void m67898g(String str) {
        ConstraintLayout constraintLayout;
        if (str == null || str.length() == 0 || this.f53938d == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout) getParent();
        } else {
            constraintLayout = null;
        }
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.LayoutParams) && trim.equals(((ConstraintLayout.LayoutParams) layoutParams).f53976c0)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    m67899f(childAt.getId());
                }
            }
        }
    }

    /* renamed from: h */
    public void m67897h(View view) {
        if (view == this) {
            return;
        }
        if (view.getId() == -1) {
            Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have an id");
        } else if (view.getParent() == null) {
            Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have a parent");
        } else {
            this.f53941g = null;
            m67899f(view.getId());
            requestLayout();
        }
    }

    /* renamed from: i */
    public void m67896i() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            m67895j((ConstraintLayout) parent);
        }
    }

    /* renamed from: j */
    public void m67895j(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f53937c; i++) {
            View viewById = constraintLayout.getViewById(this.f53936b[i]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* renamed from: k */
    public void mo67863k(ConstraintLayout constraintLayout) {
    }

    /* renamed from: l */
    public final int[] m67894l(View view, String str) {
        String[] split = str.split(",");
        view.getContext();
        int[] iArr = new int[split.length];
        int i = 0;
        for (String str2 : split) {
            int m67892n = m67892n(str2.trim());
            if (m67892n != 0) {
                iArr[i] = m67892n;
                i++;
            }
        }
        if (i != split.length) {
            return Arrays.copyOf(iArr, i);
        }
        return iArr;
    }

    /* renamed from: m */
    public final int m67893m(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f53938d.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* renamed from: n */
    public final int m67892n(String str) {
        ConstraintLayout constraintLayout;
        if (getParent() instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout) getParent();
        } else {
            constraintLayout = null;
        }
        int i = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object designInformation = constraintLayout.getDesignInformation(0, str);
            if (designInformation instanceof Integer) {
                i = ((Integer) designInformation).intValue();
            }
        }
        if (i == 0 && constraintLayout != null) {
            i = m67893m(constraintLayout, str);
        }
        if (i == 0) {
            try {
                i = C52945zh4.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (i == 0) {
            return this.f53938d.getResources().getIdentifier(str, "id", this.f53938d.getPackageName());
        }
        return i;
    }

    /* renamed from: o */
    public int[] m67891o() {
        return Arrays.copyOf(this.f53936b, this.f53937c);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f53941g;
        if (str != null) {
            m67886u(str);
        }
        String str2 = this.f53942h;
        if (str2 != null) {
            m67885v(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f53940f) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    /* renamed from: p */
    public View[] m67890p(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f53943i;
        if (viewArr == null || viewArr.length != this.f53937c) {
            this.f53943i = new View[this.f53937c];
        }
        for (int i = 0; i < this.f53937c; i++) {
            this.f53943i[i] = constraintLayout.getViewById(this.f53936b[i]);
        }
        return this.f53943i;
    }

    /* renamed from: q */
    public void mo67862q(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C39341cm4.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C39341cm4.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f53941g = string;
                    m67886u(string);
                } else if (index == C39341cm4.ConstraintLayout_Layout_constraint_referenced_tags) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f53942h = string2;
                    m67885v(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: r */
    public void mo67889r(C11515b.C11516a c11516a, JL1 jl1, ConstraintLayout.LayoutParams layoutParams, SparseArray<C43042iz0> sparseArray) {
        C11515b.C11518b c11518b = c11516a.f54086e;
        int[] iArr = c11518b.f54150k0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = c11518b.f54152l0;
            if (str != null) {
                if (str.length() > 0) {
                    C11515b.C11518b c11518b2 = c11516a.f54086e;
                    c11518b2.f54150k0 = m67894l(this, c11518b2.f54152l0);
                } else {
                    c11516a.f54086e.f54150k0 = null;
                }
            }
        }
        if (jl1 != null) {
            jl1.mo100670a();
            if (c11516a.f54086e.f54150k0 != null) {
                int i = 0;
                while (true) {
                    int[] iArr2 = c11516a.f54086e.f54150k0;
                    if (i < iArr2.length) {
                        C43042iz0 c43042iz0 = sparseArray.get(iArr2[i]);
                        if (c43042iz0 != null) {
                            jl1.mo100669c(c43042iz0);
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: s */
    public int m67888s(View view) {
        int i;
        int id = view.getId();
        int i2 = -1;
        if (id == -1) {
            return -1;
        }
        this.f53941g = null;
        int i3 = 0;
        while (true) {
            if (i3 >= this.f53937c) {
                break;
            } else if (this.f53936b[i3] == id) {
                int i4 = i3;
                while (true) {
                    i = this.f53937c;
                    if (i4 >= i - 1) {
                        break;
                    }
                    int[] iArr = this.f53936b;
                    int i5 = i4 + 1;
                    iArr[i4] = iArr[i5];
                    i4 = i5;
                }
                this.f53936b[i - 1] = 0;
                this.f53937c = i - 1;
                i2 = i3;
            } else {
                i3++;
            }
        }
        requestLayout();
        return i2;
    }

    public void setReferencedIds(int[] iArr) {
        this.f53941g = null;
        this.f53937c = 0;
        for (int i : iArr) {
            m67899f(i);
        }
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f53941g == null) {
            m67899f(i);
        }
    }

    /* renamed from: t */
    public void mo67887t(C43042iz0 c43042iz0, boolean z) {
    }

    /* renamed from: u */
    public void m67886u(String str) {
        this.f53941g = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f53937c = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                m67900e(str.substring(i));
                return;
            } else {
                m67900e(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    /* renamed from: v */
    public void m67885v(String str) {
        this.f53942h = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f53937c = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                m67898g(str.substring(i));
                return;
            } else {
                m67898g(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    /* renamed from: w */
    public void mo67870w(ConstraintLayout constraintLayout) {
    }

    /* renamed from: x */
    public void m67884x(ConstraintLayout constraintLayout) {
    }

    /* renamed from: y */
    public void mo67883y(ConstraintLayout constraintLayout) {
    }

    /* renamed from: z */
    public void mo67882z(C43635jz0 c43635jz0, HL1 hl1, SparseArray<C43042iz0> sparseArray) {
        hl1.mo100670a();
        for (int i = 0; i < this.f53937c; i++) {
            hl1.mo100669c(sparseArray.get(this.f53936b[i]));
        }
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53936b = new int[32];
        this.f53940f = false;
        this.f53943i = null;
        this.f53944j = new HashMap<>();
        this.f53938d = context;
        mo67862q(attributeSet);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53936b = new int[32];
        this.f53940f = false;
        this.f53943i = null;
        this.f53944j = new HashMap<>();
        this.f53938d = context;
        mo67862q(attributeSet);
    }
}
