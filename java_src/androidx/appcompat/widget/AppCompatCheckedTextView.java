package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
/* loaded from: classes.dex */
public class AppCompatCheckedTextView extends CheckedTextView {

    /* renamed from: b */
    public final C12480bi f52117b;

    /* renamed from: c */
    public final C10331Zh f52118c;

    /* renamed from: d */
    public final C1131Ci f52119d;

    /* renamed from: e */
    public C27653qi f52120e;

    public AppCompatCheckedTextView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final C27653qi m69962a() {
        if (this.f52120e == null) {
            this.f52120e = new C27653qi(this);
        }
        return this.f52120e;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1131Ci c1131Ci = this.f52119d;
        if (c1131Ci != null) {
            c1131Ci.m111865b();
        }
        C10331Zh c10331Zh = this.f52118c;
        if (c10331Zh != null) {
            c10331Zh.m72690b();
        }
        C12480bi c12480bi = this.f52117b;
        if (c12480bi != null) {
            c12480bi.m64117a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return Q26.m89059q(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C27981ri.m15560a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        m69962a().m17231d(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C10331Zh c10331Zh = this.f52118c;
        if (c10331Zh != null) {
            c10331Zh.m72686f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C10331Zh c10331Zh = this.f52118c;
        if (c10331Zh != null) {
            c10331Zh.m72685g(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C12480bi c12480bi = this.f52117b;
        if (c12480bi != null) {
            c12480bi.m64115c();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1131Ci c1131Ci = this.f52119d;
        if (c1131Ci != null) {
            c1131Ci.m111851p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1131Ci c1131Ci = this.f52119d;
        if (c1131Ci != null) {
            c1131Ci.m111851p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(Q26.m89058r(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        m69962a().m17230e(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C10331Zh c10331Zh = this.f52118c;
        if (c10331Zh != null) {
            c10331Zh.m72683i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C10331Zh c10331Zh = this.f52118c;
        if (c10331Zh != null) {
            c10331Zh.m72682j(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C12480bi c12480bi = this.f52117b;
        if (c12480bi != null) {
            c12480bi.m64114d(colorStateList);
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C12480bi c12480bi = this.f52117b;
        if (c12480bi != null) {
            c12480bi.m64113e(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f52119d.m111844w(colorStateList);
        this.f52119d.m111865b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f52119d.m111843x(mode);
        this.f52119d.m111865b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1131Ci c1131Ci = this.f52119d;
        if (c1131Ci != null) {
            c1131Ci.m111850q(context, i);
        }
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C50553vf4.checkedTextViewStyle);
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet, int i) {
        super(W46.m78859b(context), attributeSet, i);
        C46645p36.m20010a(this, getContext());
        C1131Ci c1131Ci = new C1131Ci(this);
        this.f52119d = c1131Ci;
        c1131Ci.m111854m(attributeSet, i);
        c1131Ci.m111865b();
        C10331Zh c10331Zh = new C10331Zh(this);
        this.f52118c = c10331Zh;
        c10331Zh.m72687e(attributeSet, i);
        C12480bi c12480bi = new C12480bi(this);
        this.f52117b = c12480bi;
        c12480bi.m64116b(attributeSet, i);
        m69962a().m17232c(attributeSet, i);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C29611vi.m8248b(getContext(), i));
    }
}
