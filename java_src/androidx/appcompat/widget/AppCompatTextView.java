package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p000.C51086wZ3;
/* loaded from: classes.dex */
public class AppCompatTextView extends TextView {
    private final C10331Zh mBackgroundTintHelper;
    private C27653qi mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;
    private Future<C51086wZ3> mPrecomputedTextFuture;
    private InterfaceC11084a mSuperCaller;
    private final C0686Bi mTextClassifierHelper;
    private final C1131Ci mTextHelper;

    /* renamed from: androidx.appcompat.widget.AppCompatTextView$a */
    /* loaded from: classes.dex */
    public interface InterfaceC11084a {
        /* renamed from: a */
        int mo69929a();

        /* renamed from: b */
        TextClassifier mo69928b();

        /* renamed from: c */
        int mo69927c();

        /* renamed from: d */
        void mo69926d(int i, int i2, int i3, int i4);

        /* renamed from: e */
        void mo69919e(int i);

        /* renamed from: f */
        int mo69925f();

        /* renamed from: g */
        void mo69924g(int i);

        /* renamed from: h */
        void mo69923h(int[] iArr, int i);

        /* renamed from: i */
        void mo69918i(int i);

        /* renamed from: j */
        int mo69922j();

        /* renamed from: k */
        int[] mo69921k();

        /* renamed from: l */
        void mo69920l(TextClassifier textClassifier);
    }

    /* renamed from: androidx.appcompat.widget.AppCompatTextView$b */
    /* loaded from: classes.dex */
    public class C11085b implements InterfaceC11084a {
        public C11085b() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.InterfaceC11084a
        /* renamed from: a */
        public int mo69929a() {
            return AppCompatTextView.super.getAutoSizeMinTextSize();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.InterfaceC11084a
        /* renamed from: b */
        public TextClassifier mo69928b() {
            return AppCompatTextView.super.getTextClassifier();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.InterfaceC11084a
        /* renamed from: c */
        public int mo69927c() {
            return AppCompatTextView.super.getAutoSizeMaxTextSize();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.InterfaceC11084a
        /* renamed from: d */
        public void mo69926d(int i, int i2, int i3, int i4) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.InterfaceC11084a
        /* renamed from: e */
        public void mo69919e(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.InterfaceC11084a
        /* renamed from: f */
        public int mo69925f() {
            return AppCompatTextView.super.getAutoSizeStepGranularity();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.InterfaceC11084a
        /* renamed from: g */
        public void mo69924g(int i) {
            AppCompatTextView.super.setAutoSizeTextTypeWithDefaults(i);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.InterfaceC11084a
        /* renamed from: h */
        public void mo69923h(int[] iArr, int i) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.InterfaceC11084a
        /* renamed from: i */
        public void mo69918i(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.InterfaceC11084a
        /* renamed from: j */
        public int mo69922j() {
            return AppCompatTextView.super.getAutoSizeTextType();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.InterfaceC11084a
        /* renamed from: k */
        public int[] mo69921k() {
            return AppCompatTextView.super.getAutoSizeTextAvailableSizes();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.InterfaceC11084a
        /* renamed from: l */
        public void mo69920l(TextClassifier textClassifier) {
            AppCompatTextView.super.setTextClassifier(textClassifier);
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatTextView$c */
    /* loaded from: classes.dex */
    public class C11086c extends C11085b {
        public C11086c() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.C11085b, androidx.appcompat.widget.AppCompatTextView.InterfaceC11084a
        /* renamed from: e */
        public void mo69919e(int i) {
            AppCompatTextView.super.setFirstBaselineToTopHeight(i);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.C11085b, androidx.appcompat.widget.AppCompatTextView.InterfaceC11084a
        /* renamed from: i */
        public void mo69918i(int i) {
            AppCompatTextView.super.setLastBaselineToBottomHeight(i);
        }
    }

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    private void consumeTextFutureAndSetBlocking() {
        Future<C51086wZ3> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                Q26.m89062n(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    private C27653qi getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new C27653qi(this);
        }
        return this.mEmojiTextViewHelper;
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
            return getSuperCaller().mo69927c();
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
            return getSuperCaller().mo69929a();
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
            return getSuperCaller().mo69925f();
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
            return getSuperCaller().mo69921k();
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
            if (getSuperCaller().mo69922j() != 1) {
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

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return Q26.m89074b(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return Q26.m89073c(this);
    }

    public InterfaceC11084a getSuperCaller() {
        if (this.mSuperCaller == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                this.mSuperCaller = new C11086c();
            } else if (i >= 26) {
                this.mSuperCaller = new C11085b();
            }
        }
        return this.mSuperCaller;
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
    public CharSequence getText() {
        consumeTextFutureAndSetBlocking();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0686Bi c0686Bi;
        if (Build.VERSION.SDK_INT < 28 && (c0686Bi = this.mTextClassifierHelper) != null) {
            return c0686Bi.m113665a();
        }
        return getSuperCaller().mo69928b();
    }

    public C51086wZ3.C29915a getTextMetricsParamsCompat() {
        return Q26.m89069g(this);
    }

    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().m17233b();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.m111849r(this, onCreateInputConnection, editorInfo);
        return C27981ri.m15560a(onCreateInputConnection, editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C1131Ci c1131Ci = this.mTextHelper;
        if (c1131Ci != null) {
            c1131Ci.m111852o(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        consumeTextFutureAndSetBlocking();
        super.onMeasure(i, i2);
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
            getSuperCaller().mo69926d(i, i2, i3, i4);
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
            getSuperCaller().mo69923h(iArr, i);
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
            getSuperCaller().mo69924g(i);
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
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1131Ci c1131Ci = this.mTextHelper;
        if (c1131Ci != null) {
            c1131Ci.m111851p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
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
        getEmojiTextViewHelper().m17230e(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m17234a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo69919e(i);
        } else {
            Q26.m89065k(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo69918i(i);
        } else {
            Q26.m89064l(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        Q26.m89063m(this, i);
    }

    public void setPrecomputedText(C51086wZ3 c51086wZ3) {
        Q26.m89062n(this, c51086wZ3);
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
            getSuperCaller().mo69920l(textClassifier);
        }
    }

    public void setTextFuture(Future<C51086wZ3> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C51086wZ3.C29915a c29915a) {
        Q26.m89060p(this, c29915a);
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

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        if (typeface != null && i > 0) {
            typeface2 = C33734Jb6.m100129a(getContext(), typeface, i);
        } else {
            typeface2 = null;
        }
        this.mIsSetTypefaceProcessing = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(W46.m78859b(context), attributeSet, i);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        C46645p36.m20010a(this, getContext());
        C10331Zh c10331Zh = new C10331Zh(this);
        this.mBackgroundTintHelper = c10331Zh;
        c10331Zh.m72687e(attributeSet, i);
        C1131Ci c1131Ci = new C1131Ci(this);
        this.mTextHelper = c1131Ci;
        c1131Ci.m111854m(attributeSet, i);
        c1131Ci.m111865b();
        this.mTextClassifierHelper = new C0686Bi(this);
        getEmojiTextViewHelper().m17232c(attributeSet, i);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? C29611vi.m8248b(context, i) : null, i2 != 0 ? C29611vi.m8248b(context, i2) : null, i3 != 0 ? C29611vi.m8248b(context, i3) : null, i4 != 0 ? C29611vi.m8248b(context, i4) : null);
        C1131Ci c1131Ci = this.mTextHelper;
        if (c1131Ci != null) {
            c1131Ci.m111851p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? C29611vi.m8248b(context, i) : null, i2 != 0 ? C29611vi.m8248b(context, i2) : null, i3 != 0 ? C29611vi.m8248b(context, i3) : null, i4 != 0 ? C29611vi.m8248b(context, i4) : null);
        C1131Ci c1131Ci = this.mTextHelper;
        if (c1131Ci != null) {
            c1131Ci.m111851p();
        }
    }
}
