package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.C11028e;
import androidx.appcompat.view.menu.InterfaceC11039j;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements InterfaceC11039j.InterfaceC11040a, View.OnClickListener, ActionMenuView.InterfaceC11059a {

    /* renamed from: b */
    public C11032g f51774b;

    /* renamed from: c */
    public CharSequence f51775c;

    /* renamed from: d */
    public Drawable f51776d;

    /* renamed from: e */
    public C11028e.InterfaceC11030b f51777e;

    /* renamed from: f */
    public AbstractView$OnTouchListenerC32757Ex1 f51778f;

    /* renamed from: g */
    public AbstractC11017b f51779g;

    /* renamed from: h */
    public boolean f51780h;

    /* renamed from: i */
    public boolean f51781i;

    /* renamed from: j */
    public int f51782j;

    /* renamed from: k */
    public int f51783k;

    /* renamed from: l */
    public int f51784l;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    /* loaded from: classes.dex */
    public class C11016a extends AbstractView$OnTouchListenerC32757Ex1 {
        public C11016a() {
            super(ActionMenuItemView.this);
        }

        @Override // p000.AbstractView$OnTouchListenerC32757Ex1
        /* renamed from: b */
        public InterfaceC52642zA5 mo69952b() {
            AbstractC11017b abstractC11017b = ActionMenuItemView.this.f51779g;
            if (abstractC11017b != null) {
                return abstractC11017b.mo70002a();
            }
            return null;
        }

        @Override // p000.AbstractView$OnTouchListenerC32757Ex1
        /* renamed from: c */
        public boolean mo69951c() {
            InterfaceC52642zA5 mo69952b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C11028e.InterfaceC11030b interfaceC11030b = actionMenuItemView.f51777e;
            if (interfaceC11030b == null || !interfaceC11030b.mo70000b(actionMenuItemView.f51774b) || (mo69952b = mo69952b()) == null || !mo69952b.mo1721c()) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC11017b {
        /* renamed from: a */
        public abstract InterfaceC52642zA5 mo70002a();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC11059a
    /* renamed from: a */
    public boolean mo69984a() {
        return m70205f();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC11059a
    /* renamed from: b */
    public boolean mo69983b() {
        return m70205f() && this.f51774b.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11039j.InterfaceC11040a
    /* renamed from: c */
    public boolean mo49374c() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11039j.InterfaceC11040a
    /* renamed from: d */
    public void mo49373d(C11032g c11032g, int i) {
        int i2;
        this.f51774b = c11032g;
        setIcon(c11032g.getIcon());
        setTitle(c11032g.m70112i(this));
        setId(c11032g.getItemId());
        if (c11032g.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        setEnabled(c11032g.isEnabled());
        if (c11032g.hasSubMenu() && this.f51778f == null) {
            this.f51778f = new C11016a();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11039j.InterfaceC11040a
    /* renamed from: e */
    public C11032g mo49372e() {
        return this.f51774b;
    }

    /* renamed from: f */
    public boolean m70205f() {
        return !TextUtils.isEmpty(getText());
    }

    /* renamed from: g */
    public final boolean m70204g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480 && ((i < 640 || i2 < 480) && configuration.orientation != 2)) {
            return false;
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    /* renamed from: h */
    public final void m70203h() {
        CharSequence charSequence;
        CharSequence title;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f51775c);
        if (this.f51776d != null && (!this.f51774b.m70119B() || (!this.f51780h && !this.f51781i))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence2 = null;
        if (z3) {
            charSequence = this.f51775c;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence contentDescription = this.f51774b.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            if (z3) {
                title = null;
            } else {
                title = this.f51774b.getTitle();
            }
            setContentDescription(title);
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f51774b.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence2 = this.f51774b.getTitle();
            }
            E56.m109403a(this, charSequence2);
            return;
        }
        E56.m109403a(this, tooltipText);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C11028e.InterfaceC11030b interfaceC11030b = this.f51777e;
        if (interfaceC11030b != null) {
            interfaceC11030b.mo70000b(this.f51774b);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f51780h = m70204g();
        m70203h();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean m70205f = m70205f();
        if (m70205f && (i4 = this.f51783k) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(size, this.f51782j);
        } else {
            i3 = this.f51782j;
        }
        if (mode != 1073741824 && this.f51782j > 0 && measuredWidth < i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
        if (!m70205f && this.f51776d != null) {
            super.setPadding((getMeasuredWidth() - this.f51776d.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractView$OnTouchListenerC32757Ex1 abstractView$OnTouchListenerC32757Ex1;
        if (this.f51774b.hasSubMenu() && (abstractView$OnTouchListenerC32757Ex1 = this.f51778f) != null && abstractView$OnTouchListenerC32757Ex1.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f51781i != z) {
            this.f51781i = z;
            C11032g c11032g = this.f51774b;
            if (c11032g != null) {
                c11032g.m70118c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f51776d = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f51784l;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        m70203h();
    }

    public void setItemInvoker(C11028e.InterfaceC11030b interfaceC11030b) {
        this.f51777e = interfaceC11030b;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.f51783k = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC11017b abstractC11017b) {
        this.f51779g = abstractC11017b;
    }

    public void setShortcut(boolean z, char c) {
    }

    public void setTitle(CharSequence charSequence) {
        this.f51775c = charSequence;
        m70203h();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f51780h = m70204g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C43509jm4.ActionMenuItemView, i, 0);
        this.f51782j = obtainStyledAttributes.getDimensionPixelSize(C43509jm4.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f51784l = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f51783k = -1;
        setSaveEnabled(false);
    }
}
