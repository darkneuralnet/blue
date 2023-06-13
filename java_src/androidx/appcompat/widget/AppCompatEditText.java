package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
/* loaded from: classes.dex */
public class AppCompatEditText extends EditText implements InterfaceC41086fh3 {
    private final C27340pi mAppCompatEmojiEditTextHelper;
    private final C10331Zh mBackgroundTintHelper;
    private final W26 mDefaultOnReceiveContentListener;
    private C11070a mSuperCaller;
    private final C0686Bi mTextClassifierHelper;
    private final C1131Ci mTextHelper;

    /* renamed from: androidx.appcompat.widget.AppCompatEditText$a */
    /* loaded from: classes.dex */
    public class C11070a {
        public C11070a() {
        }

        /* renamed from: a */
        public TextClassifier m69961a() {
            return AppCompatEditText.super.getTextClassifier();
        }

        /* renamed from: b */
        public void m69960b(TextClassifier textClassifier) {
            AppCompatEditText.super.setTextClassifier(textClassifier);
        }
    }

    public AppCompatEditText(Context context) {
        this(context, null);
    }

    private C11070a getSuperCaller() {
        if (this.mSuperCaller == null) {
            this.mSuperCaller = new C11070a();
        }
        return this.mSuperCaller;
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

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0686Bi c0686Bi;
        if (Build.VERSION.SDK_INT < 28 && (c0686Bi = this.mTextClassifierHelper) != null) {
            return c0686Bi.m113665a();
        }
        return getSuperCaller().m69961a();
    }

    public void initEmojiKeyListener(C27340pi c27340pi) {
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

    public boolean isEmojiCompatEnabled() {
        return this.mAppCompatEmojiEditTextHelper.m18956c();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] m62542G;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.m111849r(this, onCreateInputConnection, editorInfo);
        InputConnection m15560a = C27981ri.m15560a(onCreateInputConnection, editorInfo, this);
        if (m15560a != null && Build.VERSION.SDK_INT <= 30 && (m62542G = C38790bq6.m62542G(this)) != null) {
            X91.m77283d(editorInfo, m62542G);
            m15560a = U22.m82048c(this, m15560a, editorInfo);
        }
        return this.mAppCompatEmojiEditTextHelper.m18954e(m15560a, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (C29279ui.m9871a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // p000.InterfaceC41086fh3
    public C44930mA0 onReceiveContent(C44930mA0 c44930mA0) {
        return this.mDefaultOnReceiveContentListener.mo42621a(this, c44930mA0);
    }

    @Override // android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        if (C29279ui.m9870b(this, i)) {
            return true;
        }
        return super.onTextContextMenuItem(i);
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
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1131Ci c1131Ci = this.mTextHelper;
        if (c1131Ci != null) {
            c1131Ci.m111851p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1131Ci c1131Ci = this.mTextHelper;
        if (c1131Ci != null) {
            c1131Ci.m111851p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(Q26.m89058r(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.mAppCompatEmojiEditTextHelper.m18953f(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.mAppCompatEmojiEditTextHelper.m18958a(keyListener));
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
    public void setTextClassifier(TextClassifier textClassifier) {
        C0686Bi c0686Bi;
        if (Build.VERSION.SDK_INT < 28 && (c0686Bi = this.mTextClassifierHelper) != null) {
            c0686Bi.m113664b(textClassifier);
        } else {
            getSuperCaller().m69960b(textClassifier);
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C50553vf4.editTextStyle);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(W46.m78859b(context), attributeSet, i);
        C46645p36.m20010a(this, getContext());
        C10331Zh c10331Zh = new C10331Zh(this);
        this.mBackgroundTintHelper = c10331Zh;
        c10331Zh.m72687e(attributeSet, i);
        C1131Ci c1131Ci = new C1131Ci(this);
        this.mTextHelper = c1131Ci;
        c1131Ci.m111854m(attributeSet, i);
        c1131Ci.m111865b();
        this.mTextClassifierHelper = new C0686Bi(this);
        this.mDefaultOnReceiveContentListener = new W26();
        C27340pi c27340pi = new C27340pi(this);
        this.mAppCompatEmojiEditTextHelper = c27340pi;
        c27340pi.m18955d(attributeSet, i);
        initEmojiKeyListener(c27340pi);
    }
}
