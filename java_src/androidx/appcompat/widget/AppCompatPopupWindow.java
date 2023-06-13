package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
/* loaded from: classes.dex */
class AppCompatPopupWindow extends PopupWindow {

    /* renamed from: b */
    public static final boolean f52129b = false;

    /* renamed from: a */
    public boolean f52130a;

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m69958a(context, attributeSet, i, 0);
    }

    /* renamed from: a */
    public final void m69958a(Context context, AttributeSet attributeSet, int i, int i2) {
        Z46 m73747v = Z46.m73747v(context, attributeSet, C43509jm4.PopupWindow, i, i2);
        int i3 = C43509jm4.PopupWindow_overlapAnchor;
        if (m73747v.m73750s(i3)) {
            m69957b(m73747v.m73768a(i3, false));
        }
        setBackgroundDrawable(m73747v.m73762g(C43509jm4.PopupWindow_android_popupBackground));
        m73747v.m73746w();
    }

    /* renamed from: b */
    public final void m69957b(boolean z) {
        if (f52129b) {
            this.f52130a = z;
        } else {
            BY3.m113875a(this, z);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        if (f52129b && this.f52130a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        if (f52129b && this.f52130a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m69958a(context, attributeSet, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f52129b && this.f52130a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }
}
