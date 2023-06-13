package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.ListPopupWindow;
/* loaded from: classes6.dex */
public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {

    /* renamed from: f */
    public final ListPopupWindow f73542f;

    /* renamed from: g */
    public final AccessibilityManager f73543g;

    /* renamed from: h */
    public final Rect f73544h;

    /* renamed from: i */
    public final int f73545i;

    /* renamed from: j */
    public final float f73546j;

    /* renamed from: k */
    public int f73547k;

    /* renamed from: l */
    public ColorStateList f73548l;

    /* renamed from: com.google.android.material.textfield.MaterialAutoCompleteTextView$a */
    /* loaded from: classes6.dex */
    public class C17919a implements AdapterView.OnItemClickListener {
        public C17919a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            Object item;
            MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
            if (i < 0) {
                item = materialAutoCompleteTextView.f73542f.m69877v();
            } else {
                item = materialAutoCompleteTextView.getAdapter().getItem(i);
            }
            MaterialAutoCompleteTextView.this.m48684k(item);
            AdapterView.OnItemClickListener onItemClickListener = MaterialAutoCompleteTextView.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i < 0) {
                    view = MaterialAutoCompleteTextView.this.f73542f.m69874y();
                    i = MaterialAutoCompleteTextView.this.f73542f.m69875x();
                    j = MaterialAutoCompleteTextView.this.f73542f.m69876w();
                }
                onItemClickListener.onItemClick(MaterialAutoCompleteTextView.this.f73542f.mo1720k(), view, i, j);
            }
            MaterialAutoCompleteTextView.this.f73542f.dismiss();
        }
    }

    /* renamed from: com.google.android.material.textfield.MaterialAutoCompleteTextView$b */
    /* loaded from: classes6.dex */
    public class C17920b<T> extends ArrayAdapter<String> {

        /* renamed from: b */
        public ColorStateList f73550b;

        /* renamed from: c */
        public ColorStateList f73551c;

        public C17920b(Context context, int i, String[] strArr) {
            super(context, i, strArr);
            m48678f();
        }

        /* renamed from: a */
        public final ColorStateList m48683a() {
            if (m48681c() && m48680d()) {
                int[] iArr = {16843623, -16842919};
                int[] iArr2 = {16842913, -16842919};
                return new ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{HM2.m103948h(MaterialAutoCompleteTextView.this.f73547k, MaterialAutoCompleteTextView.this.f73548l.getColorForState(iArr2, 0)), HM2.m103948h(MaterialAutoCompleteTextView.this.f73547k, MaterialAutoCompleteTextView.this.f73548l.getColorForState(iArr, 0)), MaterialAutoCompleteTextView.this.f73547k});
            }
            return null;
        }

        /* renamed from: b */
        public final Drawable m48682b() {
            if (!m48681c()) {
                return null;
            }
            ColorDrawable colorDrawable = new ColorDrawable(MaterialAutoCompleteTextView.this.f73547k);
            if (this.f73551c != null) {
                P61.m90837o(colorDrawable, this.f73550b);
                return new RippleDrawable(this.f73551c, colorDrawable, null);
            }
            return colorDrawable;
        }

        /* renamed from: c */
        public final boolean m48681c() {
            return MaterialAutoCompleteTextView.this.f73547k != 0;
        }

        /* renamed from: d */
        public final boolean m48680d() {
            return MaterialAutoCompleteTextView.this.f73548l != null;
        }

        /* renamed from: e */
        public final ColorStateList m48679e() {
            if (!m48680d()) {
                return null;
            }
            int[] iArr = {16842919};
            return new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{MaterialAutoCompleteTextView.this.f73548l.getColorForState(iArr, 0), 0});
        }

        /* renamed from: f */
        public void m48678f() {
            this.f73551c = m48679e();
            this.f73550b = m48683a();
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            Drawable drawable;
            View view2 = super.getView(i, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                if (MaterialAutoCompleteTextView.this.getText().toString().contentEquals(textView.getText())) {
                    drawable = m48682b();
                } else {
                    drawable = null;
                }
                C38790bq6.m62553A0(textView, drawable);
            }
            return view2;
        }
    }

    public MaterialAutoCompleteTextView(Context context) {
        this(context, null);
    }

    @Override // android.widget.AutoCompleteTextView
    public void dismissDropDown() {
        if (m48687h()) {
            this.f73542f.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    /* renamed from: f */
    public final TextInputLayout m48689f() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* renamed from: g */
    public float m48688g() {
        return this.f73546j;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout m48689f = m48689f();
        if (m48689f != null && m48689f.isProvidingHint()) {
            return m48689f.getHint();
        }
        return super.getHint();
    }

    /* renamed from: h */
    public final boolean m48687h() {
        AccessibilityManager accessibilityManager = this.f73543g;
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    /* renamed from: i */
    public final int m48686i() {
        ListAdapter adapter = getAdapter();
        TextInputLayout m48689f = m48689f();
        int i = 0;
        if (adapter == null || m48689f == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.f73542f.m69875x()) + 15);
        View view = null;
        int i2 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = adapter.getView(max, view, m48689f);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        Drawable m69887e = this.f73542f.m69887e();
        if (m69887e != null) {
            m69887e.getPadding(this.f73544h);
            Rect rect = this.f73544h;
            i2 += rect.left + rect.right;
        }
        return i2 + m48689f.getEndIconView().getMeasuredWidth();
    }

    /* renamed from: j */
    public final void m48685j() {
        TextInputLayout m48689f = m48689f();
        if (m48689f != null) {
            m48689f.updateEditTextBoxBackgroundIfNeeded();
        }
    }

    /* renamed from: k */
    public final <T extends ListAdapter & Filterable> void m48684k(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout m48689f = m48689f();
        if (m48689f != null && m48689f.isProvidingHint() && super.getHint() == null && UJ2.m81638c()) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f73542f.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m48686i()), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        if (m48687h()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.f73542f.mo69882p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        ListPopupWindow listPopupWindow = this.f73542f;
        if (listPopupWindow != null) {
            listPopupWindow.m69888b(drawable);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f73542f.m69894M(getOnItemSelectedListener());
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        m48685j();
    }

    public void setSimpleItemSelectedColor(int i) {
        this.f73547k = i;
        if (getAdapter() instanceof C17920b) {
            ((C17920b) getAdapter()).m48678f();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f73548l = colorStateList;
        if (getAdapter() instanceof C17920b) {
            ((C17920b) getAdapter()).m48678f();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        if (m48687h()) {
            this.f73542f.mo1722a();
        } else {
            super.showDropDown();
        }
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C49961uf4.autoCompleteTextViewStyle);
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new C17920b(getContext(), this.f73545i, strArr));
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(VM2.m79935c(context, attributeSet, i, 0), attributeSet, i);
        this.f73544h = new Rect();
        Context context2 = getContext();
        TypedArray m21866i = C46052o36.m21866i(context2, attributeSet, C37098Xl4.MaterialAutoCompleteTextView, i, C50021ul4.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        int i2 = C37098Xl4.MaterialAutoCompleteTextView_android_inputType;
        if (m21866i.hasValue(i2) && m21866i.getInt(i2, 0) == 0) {
            setKeyListener(null);
        }
        this.f73545i = m21866i.getResourceId(C37098Xl4.MaterialAutoCompleteTextView_simpleItemLayout, C50603vk4.mtrl_auto_complete_simple_item);
        this.f73546j = m21866i.getDimensionPixelOffset(C37098Xl4.MaterialAutoCompleteTextView_android_popupElevation, C35172Pf4.mtrl_exposed_dropdown_menu_popup_elevation);
        this.f73547k = m21866i.getColor(C37098Xl4.MaterialAutoCompleteTextView_simpleItemSelectedColor, 0);
        this.f73548l = NM2.m94029b(context2, m21866i, C37098Xl4.MaterialAutoCompleteTextView_simpleItemSelectedRippleColor);
        this.f73543g = (AccessibilityManager) context2.getSystemService("accessibility");
        ListPopupWindow listPopupWindow = new ListPopupWindow(context2);
        this.f73542f = listPopupWindow;
        listPopupWindow.m69897J(true);
        listPopupWindow.m69903D(this);
        listPopupWindow.m69898I(2);
        listPopupWindow.mo69882p(getAdapter());
        listPopupWindow.m69895L(new C17919a());
        int i3 = C37098Xl4.MaterialAutoCompleteTextView_simpleItems;
        if (m21866i.hasValue(i3)) {
            setSimpleItems(m21866i.getResourceId(i3, 0));
        }
        m21866i.recycle();
    }
}
