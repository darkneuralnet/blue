package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC11039j;
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC11039j.InterfaceC11040a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: b */
    public C11032g f51788b;

    /* renamed from: c */
    public ImageView f51789c;

    /* renamed from: d */
    public RadioButton f51790d;

    /* renamed from: e */
    public TextView f51791e;

    /* renamed from: f */
    public CheckBox f51792f;

    /* renamed from: g */
    public TextView f51793g;

    /* renamed from: h */
    public ImageView f51794h;

    /* renamed from: i */
    public ImageView f51795i;

    /* renamed from: j */
    public LinearLayout f51796j;

    /* renamed from: k */
    public Drawable f51797k;

    /* renamed from: l */
    public int f51798l;

    /* renamed from: m */
    public Context f51799m;

    /* renamed from: n */
    public boolean f51800n;

    /* renamed from: o */
    public Drawable f51801o;

    /* renamed from: p */
    public boolean f51802p;

    /* renamed from: q */
    public LayoutInflater f51803q;

    /* renamed from: r */
    public boolean f51804r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C50553vf4.listMenuViewStyle);
    }

    /* renamed from: a */
    public final void m70202a(View view) {
        m70201b(view, -1);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f51795i;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f51795i.getLayoutParams();
            rect.top += this.f51795i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    /* renamed from: b */
    public final void m70201b(View view, int i) {
        LinearLayout linearLayout = this.f51796j;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11039j.InterfaceC11040a
    /* renamed from: c */
    public boolean mo49374c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11039j.InterfaceC11040a
    /* renamed from: d */
    public void mo49373d(C11032g c11032g, int i) {
        int i2;
        this.f51788b = c11032g;
        if (c11032g.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        setTitle(c11032g.m70112i(this));
        setCheckable(c11032g.isCheckable());
        setShortcut(c11032g.m70120A(), c11032g.m70114g());
        setIcon(c11032g.getIcon());
        setEnabled(c11032g.isEnabled());
        m70196j(c11032g.hasSubMenu());
        setContentDescription(c11032g.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11039j.InterfaceC11040a
    /* renamed from: e */
    public C11032g mo49372e() {
        return this.f51788b;
    }

    /* renamed from: f */
    public final LayoutInflater m70200f() {
        if (this.f51803q == null) {
            this.f51803q = LayoutInflater.from(getContext());
        }
        return this.f51803q;
    }

    /* renamed from: g */
    public final void m70199g() {
        CheckBox checkBox = (CheckBox) m70200f().inflate(C32643Ek4.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.f51792f = checkBox;
        m70202a(checkBox);
    }

    /* renamed from: h */
    public final void m70198h() {
        ImageView imageView = (ImageView) m70200f().inflate(C32643Ek4.abc_list_menu_item_icon, (ViewGroup) this, false);
        this.f51789c = imageView;
        m70201b(imageView, 0);
    }

    /* renamed from: i */
    public final void m70197i() {
        RadioButton radioButton = (RadioButton) m70200f().inflate(C32643Ek4.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.f51790d = radioButton;
        m70202a(radioButton);
    }

    /* renamed from: j */
    public final void m70196j(boolean z) {
        int i;
        ImageView imageView = this.f51794h;
        if (imageView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        C38790bq6.m62553A0(this, this.f51797k);
        TextView textView = (TextView) findViewById(C39902dh4.title);
        this.f51791e = textView;
        int i = this.f51798l;
        if (i != -1) {
            textView.setTextAppearance(this.f51799m, i);
        }
        this.f51793g = (TextView) findViewById(C39902dh4.shortcut);
        ImageView imageView = (ImageView) findViewById(C39902dh4.submenuarrow);
        this.f51794h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f51801o);
        }
        this.f51795i = (ImageView) findViewById(C39902dh4.group_divider);
        this.f51796j = (LinearLayout) findViewById(C39902dh4.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f51789c != null && this.f51800n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f51789c.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.f51790d == null && this.f51792f == null) {
            return;
        }
        if (this.f51788b.m70108m()) {
            if (this.f51790d == null) {
                m70197i();
            }
            compoundButton = this.f51790d;
            view = this.f51792f;
        } else {
            if (this.f51792f == null) {
                m70199g();
            }
            compoundButton = this.f51792f;
            view = this.f51790d;
        }
        if (z) {
            compoundButton.setChecked(this.f51788b.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view != null && view.getVisibility() != 8) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        CheckBox checkBox = this.f51792f;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f51790d;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f51788b.m70108m()) {
            if (this.f51790d == null) {
                m70197i();
            }
            compoundButton = this.f51790d;
        } else {
            if (this.f51792f == null) {
                m70199g();
            }
            compoundButton = this.f51792f;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f51804r = z;
        this.f51800n = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        int i;
        ImageView imageView = this.f51795i;
        if (imageView != null) {
            if (!this.f51802p && z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z;
        if (!this.f51788b.m70095z() && !this.f51804r) {
            z = false;
        } else {
            z = true;
        }
        if (!z && !this.f51800n) {
            return;
        }
        ImageView imageView = this.f51789c;
        if (imageView == null && drawable == null && !this.f51800n) {
            return;
        }
        if (imageView == null) {
            m70198h();
        }
        if (drawable == null && !this.f51800n) {
            this.f51789c.setVisibility(8);
            return;
        }
        ImageView imageView2 = this.f51789c;
        if (!z) {
            drawable = null;
        }
        imageView2.setImageDrawable(drawable);
        if (this.f51789c.getVisibility() != 0) {
            this.f51789c.setVisibility(0);
        }
    }

    public void setShortcut(boolean z, char c) {
        int i;
        if (z && this.f51788b.m70120A()) {
            i = 0;
        } else {
            i = 8;
        }
        if (i == 0) {
            this.f51793g.setText(this.f51788b.m70113h());
        }
        if (this.f51793g.getVisibility() != i) {
            this.f51793g.setVisibility(i);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f51791e.setText(charSequence);
            if (this.f51791e.getVisibility() != 0) {
                this.f51791e.setVisibility(0);
            }
        } else if (this.f51791e.getVisibility() != 8) {
            this.f51791e.setVisibility(8);
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        Z46 m73747v = Z46.m73747v(getContext(), attributeSet, C43509jm4.MenuView, i, 0);
        this.f51797k = m73747v.m73762g(C43509jm4.MenuView_android_itemBackground);
        this.f51798l = m73747v.m73755n(C43509jm4.MenuView_android_itemTextAppearance, -1);
        this.f51800n = m73747v.m73768a(C43509jm4.MenuView_preserveIconSpacing, false);
        this.f51799m = context;
        this.f51801o = m73747v.m73762g(C43509jm4.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, C50553vf4.dropDownListViewStyle, 0);
        this.f51802p = obtainStyledAttributes.hasValue(0);
        m73747v.m73746w();
        obtainStyledAttributes.recycle();
    }
}
