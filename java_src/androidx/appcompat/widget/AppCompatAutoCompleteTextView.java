package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
/* loaded from: classes.dex */
public class AppCompatAutoCompleteTextView extends AutoCompleteTextView {

    /* renamed from: e */
    public static final int[] f52109e = {16843126};

    /* renamed from: b */
    public final C10331Zh f52110b;

    /* renamed from: c */
    public final C1131Ci f52111c;

    /* renamed from: d */
    public final C27340pi f52112d;

    public AppCompatAutoCompleteTextView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void m69964a(C27340pi c27340pi) {
        KeyListener keyListener = getKeyListener();
        if (c27340pi.m18957b(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener m18958a = c27340pi.m18958a(keyListener);
            if (m18958a == keyListener) {
                return;
            }
            super.setKeyListener(m18958a);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C10331Zh c10331Zh = this.f52110b;
        if (c10331Zh != null) {
            c10331Zh.m72690b();
        }
        C1131Ci c1131Ci = this.f52111c;
        if (c1131Ci != null) {
            c1131Ci.m111865b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return Q26.m89059q(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f52112d.m18954e(C27981ri.m15560a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C10331Zh c10331Zh = this.f52110b;
        if (c10331Zh != null) {
            c10331Zh.m72686f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C10331Zh c10331Zh = this.f52110b;
        if (c10331Zh != null) {
            c10331Zh.m72685g(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1131Ci c1131Ci = this.f52111c;
        if (c1131Ci != null) {
            c1131Ci.m111851p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1131Ci c1131Ci = this.f52111c;
        if (c1131Ci != null) {
            c1131Ci.m111851p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(Q26.m89058r(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C29611vi.m8248b(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f52112d.m18953f(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f52112d.m18958a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C10331Zh c10331Zh = this.f52110b;
        if (c10331Zh != null) {
            c10331Zh.m72683i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C10331Zh c10331Zh = this.f52110b;
        if (c10331Zh != null) {
            c10331Zh.m72682j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f52111c.m111844w(colorStateList);
        this.f52111c.m111865b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f52111c.m111843x(mode);
        this.f52111c.m111865b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1131Ci c1131Ci = this.f52111c;
        if (c1131Ci != null) {
            c1131Ci.m111850q(context, i);
        }
    }

    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C50553vf4.autoCompleteTextViewStyle);
    }

    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(W46.m78859b(context), attributeSet, i);
        C46645p36.m20010a(this, getContext());
        Z46 m73747v = Z46.m73747v(getContext(), attributeSet, f52109e, i, 0);
        if (m73747v.m73750s(0)) {
            setDropDownBackgroundDrawable(m73747v.m73762g(0));
        }
        m73747v.m73746w();
        C10331Zh c10331Zh = new C10331Zh(this);
        this.f52110b = c10331Zh;
        c10331Zh.m72687e(attributeSet, i);
        C1131Ci c1131Ci = new C1131Ci(this);
        this.f52111c = c1131Ci;
        c1131Ci.m111854m(attributeSet, i);
        c1131Ci.m111865b();
        C27340pi c27340pi = new C27340pi(this);
        this.f52112d = c27340pi;
        c27340pi.m18955d(attributeSet, i);
        m69964a(c27340pi);
    }
}
