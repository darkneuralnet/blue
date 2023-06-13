package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
/* loaded from: classes.dex */
public class AppCompatButton extends Button {
    private C27653qi mAppCompatEmojiTextHelper;
    private final C10331Zh mBackgroundTintHelper;
    private final C1131Ci mTextHelper;

    public AppCompatButton(Context context) {
        this(context, null);
    }

    private C27653qi getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new C27653qi(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C10331Zh c10331Zh = this.mBackgroundTintHelper;
        if (c10331Zh != null) {
            c10331Zh.m72690b();
        }
        C1131Ci c1131Ci = this.mTextHelper;
        if (c1131Ci != null) {
            c1131Ci.m111865b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (C37406Yt6.f47599b) {
            return super.getAutoSizeMaxTextSize();
        }
        C1131Ci c1131Ci = this.mTextHelper;
        if (c1131Ci != null) {
            return c1131Ci.m111862e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (C37406Yt6.f47599b) {
            return super.getAutoSizeMinTextSize();
        }
        C1131Ci c1131Ci = this.mTextHelper;
        if (c1131Ci != null) {
            return c1131Ci.m111861f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (C37406Yt6.f47599b) {
            return super.getAutoSizeStepGranularity();
        }
        C1131Ci c1131Ci = this.mTextHelper;
        if (c1131Ci != null) {
            return c1131Ci.m111860g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (C37406Yt6.f47599b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C1131Ci c1131Ci = this.mTextHelper;
        if (c1131Ci != null) {
            return c1131Ci.m111859h();
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (C37406Yt6.f47599b) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        C1131Ci c1131Ci = this.mTextHelper;
        if (c1131Ci == null) {
            return 0;
        }
        return c1131Ci.m111858i();
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return Q26.m89059q(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C10331Zh c10331Zh = this.mBackgroundTintHelper;
        if (c10331Zh != null) {
            return c10331Zh.m72689c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C10331Zh c10331Zh = this.mBackgroundTintHelper;
        if (c10331Zh != null) {
            return c10331Zh.m72688d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.m111857j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.m111856k();
    }

    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().m17233b();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C1131Ci c1131Ci = this.mTextHelper;
        if (c1131Ci != null) {
            c1131Ci.m111852o(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        super.onTextChanged(charSequence, i, i2, i3);
        C1131Ci c1131Ci = this.mTextHelper;
        if (c1131Ci != null && !C37406Yt6.f47599b && c1131Ci.m111855l()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.mTextHelper.m111864c();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m17231d(z);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (C37406Yt6.f47599b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C1131Ci c1131Ci = this.mTextHelper;
        if (c1131Ci != null) {
            c1131Ci.m111847t(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (C37406Yt6.f47599b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C1131Ci c1131Ci = this.mTextHelper;
        if (c1131Ci != null) {
            c1131Ci.m111846u(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C37406Yt6.f47599b) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C1131Ci c1131Ci = this.mTextHelper;
        if (c1131Ci != null) {
            c1131Ci.m111845v(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C10331Zh c10331Zh = this.mBackgroundTintHelper;
        if (c10331Zh != null) {
            c10331Zh.m72686f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C10331Zh c10331Zh = this.mBackgroundTintHelper;
        if (c10331Zh != null) {
            c10331Zh.m72685g(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(Q26.m89058r(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m17230e(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m17234a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        C1131Ci c1131Ci = this.mTextHelper;
        if (c1131Ci != null) {
            c1131Ci.m111848s(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C10331Zh c10331Zh = this.mBackgroundTintHelper;
        if (c10331Zh != null) {
            c10331Zh.m72683i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C10331Zh c10331Zh = this.mBackgroundTintHelper;
        if (c10331Zh != null) {
            c10331Zh.m72682j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.m111844w(colorStateList);
        this.mTextHelper.m111865b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.m111843x(mode);
        this.mTextHelper.m111865b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1131Ci c1131Ci = this.mTextHelper;
        if (c1131Ci != null) {
            c1131Ci.m111850q(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (C37406Yt6.f47599b) {
            super.setTextSize(i, f);
            return;
        }
        C1131Ci c1131Ci = this.mTextHelper;
        if (c1131Ci != null) {
            c1131Ci.m111869A(i, f);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C50553vf4.buttonStyle);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(W46.m78859b(context), attributeSet, i);
        C46645p36.m20010a(this, getContext());
        C10331Zh c10331Zh = new C10331Zh(this);
        this.mBackgroundTintHelper = c10331Zh;
        c10331Zh.m72687e(attributeSet, i);
        C1131Ci c1131Ci = new C1131Ci(this);
        this.mTextHelper = c1131Ci;
        c1131Ci.m111854m(attributeSet, i);
        c1131Ci.m111865b();
        getEmojiTextViewHelper().m17232c(attributeSet, i);
    }
}
