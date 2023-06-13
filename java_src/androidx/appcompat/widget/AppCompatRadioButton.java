package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
/* loaded from: classes.dex */
public class AppCompatRadioButton extends RadioButton implements InterfaceC37753a56 {

    /* renamed from: b */
    public final C13649ci f52131b;

    /* renamed from: c */
    public final C10331Zh f52132c;

    /* renamed from: d */
    public final C1131Ci f52133d;

    /* renamed from: e */
    public C27653qi f52134e;

    public AppCompatRadioButton(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final C27653qi m69956a() {
        if (this.f52134e == null) {
            this.f52134e = new C27653qi(this);
        }
        return this.f52134e;
    }

    @Override // p000.InterfaceC37753a56
    /* renamed from: b */
    public ColorStateList mo69955b() {
        C13649ci c13649ci = this.f52131b;
        if (c13649ci != null) {
            return c13649ci.m61036c();
        }
        return null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C10331Zh c10331Zh = this.f52132c;
        if (c10331Zh != null) {
            c10331Zh.m72690b();
        }
        C1131Ci c1131Ci = this.f52133d;
        if (c1131Ci != null) {
            c1131Ci.m111865b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C13649ci c13649ci = this.f52131b;
        if (c13649ci != null) {
            return c13649ci.m61037b(compoundPaddingLeft);
        }
        return compoundPaddingLeft;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        m69956a().m17231d(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C10331Zh c10331Zh = this.f52132c;
        if (c10331Zh != null) {
            c10331Zh.m72686f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C10331Zh c10331Zh = this.f52132c;
        if (c10331Zh != null) {
            c10331Zh.m72685g(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C13649ci c13649ci = this.f52131b;
        if (c13649ci != null) {
            c13649ci.m61034e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1131Ci c1131Ci = this.f52133d;
        if (c1131Ci != null) {
            c1131Ci.m111851p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1131Ci c1131Ci = this.f52133d;
        if (c1131Ci != null) {
            c1131Ci.m111851p();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        m69956a().m17230e(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(m69956a().m17234a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C10331Zh c10331Zh = this.f52132c;
        if (c10331Zh != null) {
            c10331Zh.m72683i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C10331Zh c10331Zh = this.f52132c;
        if (c10331Zh != null) {
            c10331Zh.m72682j(mode);
        }
    }

    @Override // p000.InterfaceC37753a56
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C13649ci c13649ci = this.f52131b;
        if (c13649ci != null) {
            c13649ci.m61033f(colorStateList);
        }
    }

    @Override // p000.InterfaceC37753a56
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C13649ci c13649ci = this.f52131b;
        if (c13649ci != null) {
            c13649ci.m61032g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f52133d.m111844w(colorStateList);
        this.f52133d.m111865b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f52133d.m111843x(mode);
        this.f52133d.m111865b();
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C50553vf4.radioButtonStyle);
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(W46.m78859b(context), attributeSet, i);
        C46645p36.m20010a(this, getContext());
        C13649ci c13649ci = new C13649ci(this);
        this.f52131b = c13649ci;
        c13649ci.m61035d(attributeSet, i);
        C10331Zh c10331Zh = new C10331Zh(this);
        this.f52132c = c10331Zh;
        c10331Zh.m72687e(attributeSet, i);
        C1131Ci c1131Ci = new C1131Ci(this);
        this.f52133d = c1131Ci;
        c1131Ci.m111854m(attributeSet, i);
        m69956a().m17232c(attributeSet, i);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(C29611vi.m8248b(getContext(), i));
    }
}
