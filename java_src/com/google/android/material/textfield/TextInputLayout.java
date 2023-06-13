package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.customview.view.AbsSavedState;
import androidx.transition.C12055c;
import androidx.transition.Fade;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p000.C43037iy5;
/* loaded from: classes6.dex */
public class TextInputLayout extends LinearLayout {
    public static final int BOX_BACKGROUND_FILLED = 1;
    public static final int BOX_BACKGROUND_NONE = 0;
    public static final int BOX_BACKGROUND_OUTLINE = 2;
    private static final int DEFAULT_PLACEHOLDER_FADE_DURATION = 87;
    private static final int DEF_STYLE_RES = C50021ul4.Widget_Design_TextInputLayout;
    private static final int[][] EDIT_TEXT_BACKGROUND_RIPPLE_STATE = {new int[]{16842919}, new int[0]};
    public static final int END_ICON_CLEAR_TEXT = 2;
    public static final int END_ICON_CUSTOM = -1;
    public static final int END_ICON_DROPDOWN_MENU = 3;
    public static final int END_ICON_NONE = 0;
    public static final int END_ICON_PASSWORD_TOGGLE = 1;
    private static final int INVALID_MAX_LENGTH = -1;
    private static final int LABEL_SCALE_ANIMATION_DURATION = 167;
    private static final String LOG_TAG = "TextInputLayout";
    private static final int NO_WIDTH = -1;
    private static final int PLACEHOLDER_START_DELAY = 67;
    private ValueAnimator animator;
    private boolean areCornerRadiiRtl;
    private PM2 boxBackground;
    private boolean boxBackgroundApplied;
    private int boxBackgroundColor;
    private int boxBackgroundMode;
    private int boxCollapsedPaddingTopPx;
    private final int boxLabelCutoutPaddingPx;
    private int boxStrokeColor;
    private int boxStrokeWidthDefaultPx;
    private int boxStrokeWidthFocusedPx;
    private int boxStrokeWidthPx;
    private PM2 boxUnderlineDefault;
    private PM2 boxUnderlineFocused;
    final C37094Xl0 collapsingTextHelper;
    boolean counterEnabled;
    private int counterMaxLength;
    private int counterOverflowTextAppearance;
    private ColorStateList counterOverflowTextColor;
    private boolean counterOverflowed;
    private int counterTextAppearance;
    private ColorStateList counterTextColor;
    private TextView counterView;
    private int defaultFilledBackgroundColor;
    private ColorStateList defaultHintTextColor;
    private int defaultStrokeColor;
    private int disabledColor;
    private int disabledFilledBackgroundColor;
    EditText editText;
    private final LinkedHashSet<InterfaceC17928g> editTextAttachedListeners;
    private Drawable endDummyDrawable;
    private int endDummyDrawableWidth;
    private final C17930a endLayout;
    private boolean expandedHintEnabled;
    private StateListDrawable filledDropDownMenuBackground;
    private int focusedFilledBackgroundColor;
    private int focusedStrokeColor;
    private ColorStateList focusedTextColor;
    private CharSequence hint;
    private boolean hintAnimationEnabled;
    private boolean hintEnabled;
    private boolean hintExpanded;
    private int hoveredFilledBackgroundColor;
    private int hoveredStrokeColor;
    private boolean inDrawableStateChanged;
    private final C12 indicatorViewController;
    private final FrameLayout inputFrame;
    private boolean isProvidingHint;
    private InterfaceC17927f lengthCounter;
    private int maxEms;
    private int maxWidth;
    private int minEms;
    private int minWidth;
    private Drawable originalEditTextEndDrawable;
    private CharSequence originalHint;
    private PM2 outlinedDropDownMenuBackground;
    private boolean placeholderEnabled;
    private Fade placeholderFadeIn;
    private Fade placeholderFadeOut;
    private CharSequence placeholderText;
    private int placeholderTextAppearance;
    private ColorStateList placeholderTextColor;
    private TextView placeholderTextView;
    private boolean restoringSavedState;
    private C43037iy5 shapeAppearanceModel;
    private Drawable startDummyDrawable;
    private int startDummyDrawableWidth;
    private final C17935b startLayout;
    private ColorStateList strokeErrorColor;
    private final Rect tmpBoundsRect;
    private final Rect tmpRect;
    private final RectF tmpRectF;
    private Typeface typeface;

    /* loaded from: classes6.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C17921a();

        /* renamed from: d */
        public CharSequence f73553d;

        /* renamed from: e */
        public boolean f73554e;

        /* renamed from: com.google.android.material.textfield.TextInputLayout$SavedState$a */
        /* loaded from: classes6.dex */
        public class C17921a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f73553d) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f73553d, parcel, i);
            parcel.writeInt(this.f73554e ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f73553d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f73554e = parcel.readInt() == 1;
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$a */
    /* loaded from: classes6.dex */
    public class C17922a implements TextWatcher {
        public C17922a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.updateLabelState(!textInputLayout.restoringSavedState);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.counterEnabled) {
                textInputLayout2.updateCounter(editable);
            }
            if (TextInputLayout.this.placeholderEnabled) {
                TextInputLayout.this.updatePlaceholderText(editable);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$b */
    /* loaded from: classes6.dex */
    public class RunnableC17923b implements Runnable {
        public RunnableC17923b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.endLayout.m48625i();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$c */
    /* loaded from: classes6.dex */
    public class RunnableC17924c implements Runnable {
        public RunnableC17924c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.editText.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$d */
    /* loaded from: classes6.dex */
    public class C17925d implements ValueAnimator.AnimatorUpdateListener {
        public C17925d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.collapsingTextHelper.m76403m0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$e */
    /* loaded from: classes6.dex */
    public static class C17926e extends C5148M1 {

        /* renamed from: a */
        public final TextInputLayout f73559a;

        public C17926e(TextInputLayout textInputLayout) {
            this.f73559a = textInputLayout;
        }

        @Override // p000.C5148M1
        public void onInitializeAccessibilityNodeInfo(View view, C27125p2 c27125p2) {
            CharSequence charSequence;
            boolean z;
            String str;
            super.onInitializeAccessibilityNodeInfo(view, c27125p2);
            EditText editText = this.f73559a.getEditText();
            if (editText != null) {
                charSequence = editText.getText();
            } else {
                charSequence = null;
            }
            CharSequence hint = this.f73559a.getHint();
            CharSequence error = this.f73559a.getError();
            CharSequence placeholderText = this.f73559a.getPlaceholderText();
            int counterMaxLength = this.f73559a.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f73559a.getCounterOverflowDescription();
            boolean z2 = !TextUtils.isEmpty(charSequence);
            boolean z3 = !TextUtils.isEmpty(hint);
            boolean z4 = !this.f73559a.isHintExpanded();
            boolean z5 = !TextUtils.isEmpty(error);
            if (!z5 && TextUtils.isEmpty(counterOverflowDescription)) {
                z = false;
            } else {
                z = true;
            }
            if (z3) {
                str = hint.toString();
            } else {
                str = "";
            }
            this.f73559a.startLayout.m48585A(c27125p2);
            if (z2) {
                c27125p2.m20112N0(charSequence);
            } else if (!TextUtils.isEmpty(str)) {
                c27125p2.m20112N0(str);
                if (z4 && placeholderText != null) {
                    c27125p2.m20112N0(str + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                c27125p2.m20112N0(placeholderText);
            }
            if (!TextUtils.isEmpty(str)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    c27125p2.m20054s0(str);
                } else {
                    if (z2) {
                        str = ((Object) charSequence) + ", " + str;
                    }
                    c27125p2.m20112N0(str);
                }
                c27125p2.m20120J0(!z2);
            }
            c27125p2.m20044x0((charSequence == null || charSequence.length() != counterMaxLength) ? -1 : -1);
            if (z) {
                if (!z5) {
                    error = counterOverflowDescription;
                }
                c27125p2.m20062o0(error);
            }
            View m113009t = this.f73559a.indicatorViewController.m113009t();
            if (m113009t != null) {
                c27125p2.m20050u0(m113009t);
            }
            this.f73559a.endLayout.m48613o().mo43201o(view, c27125p2);
        }

        @Override // p000.C5148M1
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            this.f73559a.endLayout.m48613o().mo43200p(view, accessibilityEvent);
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$f */
    /* loaded from: classes6.dex */
    public interface InterfaceC17927f {
        /* renamed from: a */
        int mo48673a(Editable editable);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$g */
    /* loaded from: classes6.dex */
    public interface InterfaceC17928g {
        /* renamed from: a */
        void mo48589a(TextInputLayout textInputLayout);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$h */
    /* loaded from: classes6.dex */
    public interface InterfaceC17929h {
        /* renamed from: a */
        void m48672a(TextInputLayout textInputLayout, int i);
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }

    private void addPlaceholderTextView() {
        TextView textView = this.placeholderTextView;
        if (textView != null) {
            this.inputFrame.addView(textView);
            this.placeholderTextView.setVisibility(0);
        }
    }

    private void adjustFilledEditTextPaddingForLargeFont() {
        if (this.editText != null && this.boxBackgroundMode == 1) {
            if (NM2.m94021j(getContext())) {
                EditText editText = this.editText;
                C38790bq6.m62529M0(editText, C38790bq6.m62538I(editText), getResources().getDimensionPixelSize(C35172Pf4.material_filled_edittext_font_2_0_padding_top), C38790bq6.m62540H(this.editText), getResources().getDimensionPixelSize(C35172Pf4.material_filled_edittext_font_2_0_padding_bottom));
            } else if (NM2.m94022i(getContext())) {
                EditText editText2 = this.editText;
                C38790bq6.m62529M0(editText2, C38790bq6.m62538I(editText2), getResources().getDimensionPixelSize(C35172Pf4.material_filled_edittext_font_1_3_padding_top), C38790bq6.m62540H(this.editText), getResources().getDimensionPixelSize(C35172Pf4.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
    }

    private void applyBoxAttributes() {
        PM2 pm2 = this.boxBackground;
        if (pm2 == null) {
            return;
        }
        C43037iy5 m90438E = pm2.m90438E();
        C43037iy5 c43037iy5 = this.shapeAppearanceModel;
        if (m90438E != c43037iy5) {
            this.boxBackground.setShapeAppearanceModel(c43037iy5);
        }
        if (canDrawOutlineStroke()) {
            this.boxBackground.m90400i0(this.boxStrokeWidthPx, this.boxStrokeColor);
        }
        int calculateBoxBackgroundColor = calculateBoxBackgroundColor();
        this.boxBackgroundColor = calculateBoxBackgroundColor;
        this.boxBackground.m90416a0(ColorStateList.valueOf(calculateBoxBackgroundColor));
        applyBoxUnderlineAttributes();
        updateEditTextBoxBackgroundIfNeeded();
    }

    private void applyBoxUnderlineAttributes() {
        ColorStateList valueOf;
        if (this.boxUnderlineDefault != null && this.boxUnderlineFocused != null) {
            if (canDrawStroke()) {
                PM2 pm2 = this.boxUnderlineDefault;
                if (this.editText.isFocused()) {
                    valueOf = ColorStateList.valueOf(this.defaultStrokeColor);
                } else {
                    valueOf = ColorStateList.valueOf(this.boxStrokeColor);
                }
                pm2.m90416a0(valueOf);
                this.boxUnderlineFocused.m90416a0(ColorStateList.valueOf(this.boxStrokeColor));
            }
            invalidate();
        }
    }

    private void applyCutoutPadding(RectF rectF) {
        float f = rectF.left;
        int i = this.boxLabelCutoutPaddingPx;
        rectF.left = f - i;
        rectF.right += i;
    }

    private void assignBoxBackgroundByMode() {
        int i = this.boxBackgroundMode;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    if (this.hintEnabled && !(this.boxBackground instanceof FF0)) {
                        this.boxBackground = FF0.m107387p0(this.shapeAppearanceModel);
                    } else {
                        this.boxBackground = new PM2(this.shapeAppearanceModel);
                    }
                    this.boxUnderlineDefault = null;
                    this.boxUnderlineFocused = null;
                    return;
                }
                throw new IllegalArgumentException(this.boxBackgroundMode + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            this.boxBackground = new PM2(this.shapeAppearanceModel);
            this.boxUnderlineDefault = new PM2();
            this.boxUnderlineFocused = new PM2();
            return;
        }
        this.boxBackground = null;
        this.boxUnderlineDefault = null;
        this.boxUnderlineFocused = null;
    }

    private int calculateBoxBackgroundColor() {
        int i = this.boxBackgroundColor;
        if (this.boxBackgroundMode == 1) {
            return HM2.m103948h(HM2.m103951e(this, C49961uf4.colorSurface, 0), this.boxBackgroundColor);
        }
        return i;
    }

    private Rect calculateCollapsedTextBounds(Rect rect) {
        if (this.editText != null) {
            Rect rect2 = this.tmpBoundsRect;
            boolean m79294n = C36704Vt6.m79294n(this);
            rect2.bottom = rect.bottom;
            int i = this.boxBackgroundMode;
            if (i != 1) {
                if (i != 2) {
                    rect2.left = getLabelLeftBoundAlightWithPrefix(rect.left, m79294n);
                    rect2.top = getPaddingTop();
                    rect2.right = getLabelRightBoundAlignedWithSuffix(rect.right, m79294n);
                    return rect2;
                }
                rect2.left = rect.left + this.editText.getPaddingLeft();
                rect2.top = rect.top - calculateLabelMarginTop();
                rect2.right = rect.right - this.editText.getPaddingRight();
                return rect2;
            }
            rect2.left = getLabelLeftBoundAlightWithPrefix(rect.left, m79294n);
            rect2.top = rect.top + this.boxCollapsedPaddingTopPx;
            rect2.right = getLabelRightBoundAlignedWithSuffix(rect.right, m79294n);
            return rect2;
        }
        throw new IllegalStateException();
    }

    private int calculateExpandedLabelBottom(Rect rect, Rect rect2, float f) {
        if (isSingleLineFilledTextField()) {
            return (int) (rect2.top + f);
        }
        return rect.bottom - this.editText.getCompoundPaddingBottom();
    }

    private int calculateExpandedLabelTop(Rect rect, float f) {
        if (isSingleLineFilledTextField()) {
            return (int) (rect.centerY() - (f / 2.0f));
        }
        return rect.top + this.editText.getCompoundPaddingTop();
    }

    private Rect calculateExpandedTextBounds(Rect rect) {
        if (this.editText != null) {
            Rect rect2 = this.tmpBoundsRect;
            float m76380y = this.collapsingTextHelper.m76380y();
            rect2.left = rect.left + this.editText.getCompoundPaddingLeft();
            rect2.top = calculateExpandedLabelTop(rect, m76380y);
            rect2.right = rect.right - this.editText.getCompoundPaddingRight();
            rect2.bottom = calculateExpandedLabelBottom(rect, rect2, m76380y);
            return rect2;
        }
        throw new IllegalStateException();
    }

    private int calculateLabelMarginTop() {
        float m76396q;
        if (!this.hintEnabled) {
            return 0;
        }
        int i = this.boxBackgroundMode;
        if (i != 0) {
            if (i != 2) {
                return 0;
            }
            m76396q = this.collapsingTextHelper.m76396q() / 2.0f;
        } else {
            m76396q = this.collapsingTextHelper.m76396q();
        }
        return (int) m76396q;
    }

    private boolean canDrawOutlineStroke() {
        return this.boxBackgroundMode == 2 && canDrawStroke();
    }

    private boolean canDrawStroke() {
        return this.boxStrokeWidthPx > -1 && this.boxStrokeColor != 0;
    }

    private void closeCutout() {
        if (cutoutEnabled()) {
            ((FF0) this.boxBackground).m107385r0();
        }
    }

    private void collapseHint(boolean z) {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.animator.cancel();
        }
        if (z && this.hintAnimationEnabled) {
            animateToExpansionFraction(1.0f);
        } else {
            this.collapsingTextHelper.m76403m0(1.0f);
        }
        this.hintExpanded = false;
        if (cutoutEnabled()) {
            openCutout();
        }
        updatePlaceholderText();
        this.startLayout.m48571l(false);
        this.endLayout.m48657K(false);
    }

    private Fade createPlaceholderFadeTransition() {
        Fade fade = new Fade();
        fade.mo65847q0(C37997aW2.m71261f(getContext(), C49961uf4.motionDurationShort2, 87));
        fade.mo65845s0(C37997aW2.m71260g(getContext(), C49961uf4.motionEasingLinearInterpolator, C27325pf.f103879a));
        return fade;
    }

    private boolean cutoutEnabled() {
        return this.hintEnabled && !TextUtils.isEmpty(this.hint) && (this.boxBackground instanceof FF0);
    }

    private void dispatchOnEditTextAttached() {
        Iterator<InterfaceC17928g> it = this.editTextAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().mo48589a(this);
        }
    }

    private void drawBoxUnderline(Canvas canvas) {
        PM2 pm2;
        if (this.boxUnderlineFocused != null && (pm2 = this.boxUnderlineDefault) != null) {
            pm2.draw(canvas);
            if (this.editText.isFocused()) {
                Rect bounds = this.boxUnderlineFocused.getBounds();
                Rect bounds2 = this.boxUnderlineDefault.getBounds();
                float m76378z = this.collapsingTextHelper.m76378z();
                int centerX = bounds2.centerX();
                bounds.left = C27325pf.m19013c(centerX, bounds2.left, m76378z);
                bounds.right = C27325pf.m19013c(centerX, bounds2.right, m76378z);
                this.boxUnderlineFocused.draw(canvas);
            }
        }
    }

    private void drawHint(Canvas canvas) {
        if (this.hintEnabled) {
            this.collapsingTextHelper.m76406l(canvas);
        }
    }

    private void expandHint(boolean z) {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.animator.cancel();
        }
        if (z && this.hintAnimationEnabled) {
            animateToExpansionFraction(0.0f);
        } else {
            this.collapsingTextHelper.m76403m0(0.0f);
        }
        if (cutoutEnabled() && ((FF0) this.boxBackground).m107386q0()) {
            closeCutout();
        }
        this.hintExpanded = true;
        hidePlaceholderText();
        this.startLayout.m48571l(true);
        this.endLayout.m48657K(true);
    }

    private PM2 getDropDownMaterialShapeDrawable(boolean z) {
        float f;
        float dimensionPixelOffset;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(C35172Pf4.mtrl_shape_corner_size_small_component);
        if (z) {
            f = dimensionPixelOffset2;
        } else {
            f = 0.0f;
        }
        EditText editText = this.editText;
        if (editText instanceof MaterialAutoCompleteTextView) {
            dimensionPixelOffset = ((MaterialAutoCompleteTextView) editText).m48688g();
        } else {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(C35172Pf4.m3_comp_outlined_autocomplete_menu_container_elevation);
        }
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(C35172Pf4.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C43037iy5 m31495m = C43037iy5.m31544a().m31513G(f).m31509K(f).m31485w(dimensionPixelOffset2).m31518B(dimensionPixelOffset2).m31495m();
        PM2 m90393m = PM2.m90393m(getContext(), dimensionPixelOffset);
        m90393m.setShapeAppearanceModel(m31495m);
        m90393m.m90412c0(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        return m90393m;
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.editText;
        if ((editText instanceof AutoCompleteTextView) && !Q91.m88866a(editText)) {
            int m103952d = HM2.m103952d(this.editText, C49961uf4.colorControlHighlight);
            int i = this.boxBackgroundMode;
            if (i == 2) {
                return getOutlinedBoxBackgroundWithRipple(getContext(), this.boxBackground, m103952d, EDIT_TEXT_BACKGROUND_RIPPLE_STATE);
            }
            if (i == 1) {
                return getFilledBoxBackgroundWithRipple(this.boxBackground, this.boxBackgroundColor, m103952d, EDIT_TEXT_BACKGROUND_RIPPLE_STATE);
            }
            return null;
        }
        return this.boxBackground;
    }

    private static Drawable getFilledBoxBackgroundWithRipple(PM2 pm2, int i, int i2, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{HM2.m103947i(i2, i, 0.1f), i}), pm2, pm2);
    }

    private int getLabelLeftBoundAlightWithPrefix(int i, boolean z) {
        int compoundPaddingLeft = i + this.editText.getCompoundPaddingLeft();
        if (getPrefixText() != null && !z) {
            return (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
        }
        return compoundPaddingLeft;
    }

    private int getLabelRightBoundAlignedWithSuffix(int i, boolean z) {
        int compoundPaddingRight = i - this.editText.getCompoundPaddingRight();
        if (getPrefixText() != null && z) {
            return compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
        }
        return compoundPaddingRight;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.filledDropDownMenuBackground == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.filledDropDownMenuBackground = stateListDrawable;
            stateListDrawable.addState(new int[]{16842922}, getOrCreateOutlinedDropDownMenuBackground());
            this.filledDropDownMenuBackground.addState(new int[0], getDropDownMaterialShapeDrawable(false));
        }
        return this.filledDropDownMenuBackground;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.outlinedDropDownMenuBackground == null) {
            this.outlinedDropDownMenuBackground = getDropDownMaterialShapeDrawable(true);
        }
        return this.outlinedDropDownMenuBackground;
    }

    private static Drawable getOutlinedBoxBackgroundWithRipple(Context context, PM2 pm2, int i, int[][] iArr) {
        int m103953c = HM2.m103953c(context, C49961uf4.colorSurface, LOG_TAG);
        PM2 pm22 = new PM2(pm2.m90438E());
        int m103947i = HM2.m103947i(i, m103953c, 0.1f);
        pm22.m90416a0(new ColorStateList(iArr, new int[]{m103947i, 0}));
        pm22.setTint(m103953c);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{m103947i, m103953c});
        PM2 pm23 = new PM2(pm2.m90438E());
        pm23.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, pm22, pm23), pm2});
    }

    private void hidePlaceholderText() {
        TextView textView = this.placeholderTextView;
        if (textView != null && this.placeholderEnabled) {
            textView.setText((CharSequence) null);
            C12055c.m65804b(this.inputFrame, this.placeholderFadeOut);
            this.placeholderTextView.setVisibility(4);
        }
    }

    private boolean isSingleLineFilledTextField() {
        if (this.boxBackgroundMode == 1 && this.editText.getMinLines() <= 1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$new$0(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    private void onApplyBoxBackgroundMode() {
        assignBoxBackgroundByMode();
        updateEditTextBoxBackgroundIfNeeded();
        updateTextInputBoxState();
        updateBoxCollapsedPaddingTop();
        adjustFilledEditTextPaddingForLargeFont();
        if (this.boxBackgroundMode != 0) {
            updateInputLayoutMargins();
        }
        setDropDownMenuBackgroundIfNeeded();
    }

    private void openCutout() {
        if (!cutoutEnabled()) {
            return;
        }
        RectF rectF = this.tmpRectF;
        this.collapsingTextHelper.m76400o(rectF, this.editText.getWidth(), this.editText.getGravity());
        if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
            applyCutoutPadding(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.boxStrokeWidthPx);
            ((FF0) this.boxBackground).m107383t0(rectF);
        }
    }

    private void recalculateCutout() {
        if (cutoutEnabled() && !this.hintExpanded) {
            closeCutout();
            openCutout();
        }
    }

    private static void recursiveSetEnabled(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                recursiveSetEnabled((ViewGroup) childAt, z);
            }
        }
    }

    private void removePlaceholderTextView() {
        TextView textView = this.placeholderTextView;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void setDropDownMenuBackgroundIfNeeded() {
        EditText editText = this.editText;
        if (!(editText instanceof AutoCompleteTextView)) {
            return;
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        if (autoCompleteTextView.getDropDownBackground() == null) {
            int i = this.boxBackgroundMode;
            if (i == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
            } else if (i == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.editText == null) {
            if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
                Log.i(LOG_TAG, "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.editText = editText;
            int i = this.minEms;
            if (i != -1) {
                setMinEms(i);
            } else {
                setMinWidth(this.minWidth);
            }
            int i2 = this.maxEms;
            if (i2 != -1) {
                setMaxEms(i2);
            } else {
                setMaxWidth(this.maxWidth);
            }
            this.boxBackgroundApplied = false;
            onApplyBoxBackgroundMode();
            setTextInputAccessibilityDelegate(new C17926e(this));
            this.collapsingTextHelper.m76454B0(this.editText.getTypeface());
            this.collapsingTextHelper.m76409j0(this.editText.getTextSize());
            this.collapsingTextHelper.m76419e0(this.editText.getLetterSpacing());
            int gravity = this.editText.getGravity();
            this.collapsingTextHelper.m76431X((gravity & (-113)) | 48);
            this.collapsingTextHelper.m76411i0(gravity);
            this.editText.addTextChangedListener(new C17922a());
            if (this.defaultHintTextColor == null) {
                this.defaultHintTextColor = this.editText.getHintTextColors();
            }
            if (this.hintEnabled) {
                if (TextUtils.isEmpty(this.hint)) {
                    CharSequence hint = this.editText.getHint();
                    this.originalHint = hint;
                    setHint(hint);
                    this.editText.setHint((CharSequence) null);
                }
                this.isProvidingHint = true;
            }
            if (this.counterView != null) {
                updateCounter(this.editText.getText());
            }
            updateEditTextBackground();
            this.indicatorViewController.m113023f();
            this.startLayout.bringToFront();
            this.endLayout.bringToFront();
            dispatchOnEditTextAttached();
            this.endLayout.m48666C0();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            updateLabelState(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.hint)) {
            this.hint = charSequence;
            this.collapsingTextHelper.m76379y0(charSequence);
            if (!this.hintExpanded) {
                openCutout();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.placeholderEnabled == z) {
            return;
        }
        if (z) {
            addPlaceholderTextView();
        } else {
            removePlaceholderTextView();
            this.placeholderTextView = null;
        }
        this.placeholderEnabled = z;
    }

    private boolean shouldUpdateEndDummyDrawable() {
        if ((this.endLayout.m48659I() || ((this.endLayout.m48669B() && isEndIconVisible()) || this.endLayout.m48593y() != null)) && this.endLayout.getMeasuredWidth() > 0) {
            return true;
        }
        return false;
    }

    private boolean shouldUpdateStartDummyDrawable() {
        if ((getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.startLayout.getMeasuredWidth() > 0) {
            return true;
        }
        return false;
    }

    private void showPlaceholderText() {
        if (this.placeholderTextView != null && this.placeholderEnabled && !TextUtils.isEmpty(this.placeholderText)) {
            this.placeholderTextView.setText(this.placeholderText);
            C12055c.m65804b(this.inputFrame, this.placeholderFadeIn);
            this.placeholderTextView.setVisibility(0);
            this.placeholderTextView.bringToFront();
            announceForAccessibility(this.placeholderText);
        }
    }

    private void updateBoxCollapsedPaddingTop() {
        if (this.boxBackgroundMode == 1) {
            if (NM2.m94021j(getContext())) {
                this.boxCollapsedPaddingTopPx = getResources().getDimensionPixelSize(C35172Pf4.material_font_2_0_box_collapsed_padding_top);
            } else if (NM2.m94022i(getContext())) {
                this.boxCollapsedPaddingTopPx = getResources().getDimensionPixelSize(C35172Pf4.material_font_1_3_box_collapsed_padding_top);
            }
        }
    }

    private void updateBoxUnderlineBounds(Rect rect) {
        PM2 pm2 = this.boxUnderlineDefault;
        if (pm2 != null) {
            int i = rect.bottom;
            pm2.setBounds(rect.left, i - this.boxStrokeWidthDefaultPx, rect.right, i);
        }
        PM2 pm22 = this.boxUnderlineFocused;
        if (pm22 != null) {
            int i2 = rect.bottom;
            pm22.setBounds(rect.left, i2 - this.boxStrokeWidthFocusedPx, rect.right, i2);
        }
    }

    private void updateCounter() {
        if (this.counterView != null) {
            EditText editText = this.editText;
            updateCounter(editText == null ? null : editText.getText());
        }
    }

    private static void updateCounterContentDescription(Context context, TextView textView, int i, int i2, boolean z) {
        int i3;
        if (z) {
            i3 = C40534el4.character_counter_overflowed_content_description;
        } else {
            i3 = C40534el4.character_counter_content_description;
        }
        textView.setContentDescription(context.getString(i3, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    private void updateCounterTextAppearanceAndColor() {
        int i;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.counterView;
        if (textView != null) {
            if (this.counterOverflowed) {
                i = this.counterOverflowTextAppearance;
            } else {
                i = this.counterTextAppearance;
            }
            setTextAppearanceCompatWithErrorFallback(textView, i);
            if (!this.counterOverflowed && (colorStateList2 = this.counterTextColor) != null) {
                this.counterView.setTextColor(colorStateList2);
            }
            if (this.counterOverflowed && (colorStateList = this.counterOverflowTextColor) != null) {
                this.counterView.setTextColor(colorStateList);
            }
        }
    }

    @TargetApi(29)
    private void updateCursorColor(boolean z) {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList m103950f = HM2.m103950f(getContext(), C49961uf4.colorControlActivated);
        EditText editText = this.editText;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable != null && m103950f != null) {
                textCursorDrawable2 = this.editText.getTextCursorDrawable();
                if (z) {
                    ColorStateList colorStateList = this.strokeErrorColor;
                    if (colorStateList == null) {
                        colorStateList = ColorStateList.valueOf(this.boxStrokeColor);
                    }
                    m103950f = colorStateList;
                }
                P61.m90837o(textCursorDrawable2, m103950f);
            }
        }
    }

    private boolean updateEditTextHeightBasedOnIcon() {
        int max;
        if (this.editText == null || this.editText.getMeasuredHeight() >= (max = Math.max(this.endLayout.getMeasuredHeight(), this.startLayout.getMeasuredHeight()))) {
            return false;
        }
        this.editText.setMinimumHeight(max);
        return true;
    }

    private void updateInputLayoutMargins() {
        if (this.boxBackgroundMode != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.inputFrame.getLayoutParams();
            int calculateLabelMarginTop = calculateLabelMarginTop();
            if (calculateLabelMarginTop != layoutParams.topMargin) {
                layoutParams.topMargin = calculateLabelMarginTop;
                this.inputFrame.requestLayout();
            }
        }
    }

    private void updatePlaceholderMeasurementsBasedOnEditText() {
        EditText editText;
        if (this.placeholderTextView != null && (editText = this.editText) != null) {
            this.placeholderTextView.setGravity(editText.getGravity());
            this.placeholderTextView.setPadding(this.editText.getCompoundPaddingLeft(), this.editText.getCompoundPaddingTop(), this.editText.getCompoundPaddingRight(), this.editText.getCompoundPaddingBottom());
        }
    }

    private void updatePlaceholderText() {
        EditText editText = this.editText;
        updatePlaceholderText(editText == null ? null : editText.getText());
    }

    private void updateStrokeErrorColor(boolean z, boolean z2) {
        int defaultColor = this.strokeErrorColor.getDefaultColor();
        int colorForState = this.strokeErrorColor.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.strokeErrorColor.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.boxStrokeColor = colorForState2;
        } else if (z2) {
            this.boxStrokeColor = colorForState;
        } else {
            this.boxStrokeColor = defaultColor;
        }
    }

    public void addOnEditTextAttachedListener(InterfaceC17928g interfaceC17928g) {
        this.editTextAttachedListeners.add(interfaceC17928g);
        if (this.editText != null) {
            interfaceC17928g.mo48589a(this);
        }
    }

    public void addOnEndIconChangedListener(InterfaceC17929h interfaceC17929h) {
        this.endLayout.m48629g(interfaceC17929h);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            this.inputFrame.addView(view, layoutParams2);
            this.inputFrame.setLayoutParams(layoutParams);
            updateInputLayoutMargins();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    public void animateToExpansionFraction(float f) {
        if (this.collapsingTextHelper.m76378z() == f) {
            return;
        }
        if (this.animator == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.animator = valueAnimator;
            valueAnimator.setInterpolator(C37997aW2.m71260g(getContext(), C49961uf4.motionEasingEmphasizedInterpolator, C27325pf.f103880b));
            this.animator.setDuration(C37997aW2.m71261f(getContext(), C49961uf4.motionDurationMedium4, LABEL_SCALE_ANIMATION_DURATION));
            this.animator.addUpdateListener(new C17925d());
        }
        this.animator.setFloatValues(this.collapsingTextHelper.m76378z(), f);
        this.animator.start();
    }

    public void clearOnEditTextAttachedListeners() {
        this.editTextAttachedListeners.clear();
    }

    public void clearOnEndIconChangedListeners() {
        this.endLayout.m48623j();
    }

    public boolean cutoutIsOpen() {
        return cutoutEnabled() && ((FF0) this.boxBackground).m107386q0();
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.editText;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.originalHint != null) {
            boolean z = this.isProvidingHint;
            this.isProvidingHint = false;
            CharSequence hint = editText.getHint();
            this.editText.setHint(this.originalHint);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.editText.setHint(hint);
                this.isProvidingHint = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        viewStructure.setChildCount(this.inputFrame.getChildCount());
        for (int i2 = 0; i2 < this.inputFrame.getChildCount(); i2++) {
            View childAt = this.inputFrame.getChildAt(i2);
            ViewStructure newChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.editText) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.restoringSavedState = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.restoringSavedState = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        drawHint(canvas);
        drawBoxUnderline(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        boolean z;
        if (this.inDrawableStateChanged) {
            return;
        }
        boolean z2 = true;
        this.inDrawableStateChanged = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C37094Xl0 c37094Xl0 = this.collapsingTextHelper;
        if (c37094Xl0 != null) {
            z = c37094Xl0.m76383w0(drawableState) | false;
        } else {
            z = false;
        }
        if (this.editText != null) {
            if (!C38790bq6.m62504Z(this) || !isEnabled()) {
                z2 = false;
            }
            updateLabelState(z2);
        }
        updateEditTextBackground();
        updateTextInputBoxState();
        if (z) {
            invalidate();
        }
        this.inDrawableStateChanged = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.editText;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + calculateLabelMarginTop();
        }
        return super.getBaseline();
    }

    public PM2 getBoxBackground() {
        int i = this.boxBackgroundMode;
        if (i != 1 && i != 2) {
            throw new IllegalStateException();
        }
        return this.boxBackground;
    }

    public int getBoxBackgroundColor() {
        return this.boxBackgroundColor;
    }

    public int getBoxBackgroundMode() {
        return this.boxBackgroundMode;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.boxCollapsedPaddingTopPx;
    }

    public float getBoxCornerRadiusBottomEnd() {
        if (C36704Vt6.m79294n(this)) {
            return this.shapeAppearanceModel.m31535j().mo29259a(this.tmpRectF);
        }
        return this.shapeAppearanceModel.m31533l().mo29259a(this.tmpRectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        if (C36704Vt6.m79294n(this)) {
            return this.shapeAppearanceModel.m31533l().mo29259a(this.tmpRectF);
        }
        return this.shapeAppearanceModel.m31535j().mo29259a(this.tmpRectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        if (C36704Vt6.m79294n(this)) {
            return this.shapeAppearanceModel.m31527r().mo29259a(this.tmpRectF);
        }
        return this.shapeAppearanceModel.m31525t().mo29259a(this.tmpRectF);
    }

    public float getBoxCornerRadiusTopStart() {
        if (C36704Vt6.m79294n(this)) {
            return this.shapeAppearanceModel.m31525t().mo29259a(this.tmpRectF);
        }
        return this.shapeAppearanceModel.m31527r().mo29259a(this.tmpRectF);
    }

    public int getBoxStrokeColor() {
        return this.focusedStrokeColor;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.strokeErrorColor;
    }

    public int getBoxStrokeWidth() {
        return this.boxStrokeWidthDefaultPx;
    }

    public int getBoxStrokeWidthFocused() {
        return this.boxStrokeWidthFocusedPx;
    }

    public int getCounterMaxLength() {
        return this.counterMaxLength;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.counterEnabled && this.counterOverflowed && (textView = this.counterView) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.counterOverflowTextColor;
    }

    public ColorStateList getCounterTextColor() {
        return this.counterTextColor;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.defaultHintTextColor;
    }

    public EditText getEditText() {
        return this.editText;
    }

    public CharSequence getEndIconContentDescription() {
        return this.endLayout.m48615n();
    }

    public Drawable getEndIconDrawable() {
        return this.endLayout.m48611p();
    }

    public int getEndIconMinSize() {
        return this.endLayout.m48609q();
    }

    public int getEndIconMode() {
        return this.endLayout.m48607r();
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.endLayout.m48605s();
    }

    public CheckableImageButton getEndIconView() {
        return this.endLayout.m48603t();
    }

    public CharSequence getError() {
        if (this.indicatorViewController.m113047C()) {
            return this.indicatorViewController.m113013p();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.indicatorViewController.m113015n();
    }

    public CharSequence getErrorContentDescription() {
        return this.indicatorViewController.m113014o();
    }

    public int getErrorCurrentTextColors() {
        return this.indicatorViewController.m113012q();
    }

    public Drawable getErrorIconDrawable() {
        return this.endLayout.m48601u();
    }

    public CharSequence getHelperText() {
        if (this.indicatorViewController.m113046D()) {
            return this.indicatorViewController.m113010s();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.indicatorViewController.m113008u();
    }

    public CharSequence getHint() {
        if (this.hintEnabled) {
            return this.hint;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.collapsingTextHelper.m76396q();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.collapsingTextHelper.m76390t();
    }

    public ColorStateList getHintTextColor() {
        return this.focusedTextColor;
    }

    public InterfaceC17927f getLengthCounter() {
        return this.lengthCounter;
    }

    public int getMaxEms() {
        return this.maxEms;
    }

    public int getMaxWidth() {
        return this.maxWidth;
    }

    public int getMinEms() {
        return this.minEms;
    }

    public int getMinWidth() {
        return this.minWidth;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.endLayout.m48597w();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.endLayout.m48595x();
    }

    public CharSequence getPlaceholderText() {
        if (this.placeholderEnabled) {
            return this.placeholderText;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.placeholderTextAppearance;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.placeholderTextColor;
    }

    public CharSequence getPrefixText() {
        return this.startLayout.m48582a();
    }

    public ColorStateList getPrefixTextColor() {
        return this.startLayout.m48581b();
    }

    public TextView getPrefixTextView() {
        return this.startLayout.m48580c();
    }

    public C43037iy5 getShapeAppearanceModel() {
        return this.shapeAppearanceModel;
    }

    public CharSequence getStartIconContentDescription() {
        return this.startLayout.m48579d();
    }

    public Drawable getStartIconDrawable() {
        return this.startLayout.m48578e();
    }

    public int getStartIconMinSize() {
        return this.startLayout.m48577f();
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.startLayout.m48576g();
    }

    public CharSequence getSuffixText() {
        return this.endLayout.m48593y();
    }

    public ColorStateList getSuffixTextColor() {
        return this.endLayout.m48591z();
    }

    public TextView getSuffixTextView() {
        return this.endLayout.m48671A();
    }

    public Typeface getTypeface() {
        return this.typeface;
    }

    public boolean isCounterEnabled() {
        return this.counterEnabled;
    }

    public boolean isEndIconCheckable() {
        return this.endLayout.m48662F();
    }

    public boolean isEndIconVisible() {
        return this.endLayout.m48660H();
    }

    public boolean isErrorEnabled() {
        return this.indicatorViewController.m113047C();
    }

    public boolean isExpandedHintEnabled() {
        return this.expandedHintEnabled;
    }

    public final boolean isHelperTextDisplayed() {
        return this.indicatorViewController.m113006w();
    }

    public boolean isHelperTextEnabled() {
        return this.indicatorViewController.m113046D();
    }

    public boolean isHintAnimationEnabled() {
        return this.hintAnimationEnabled;
    }

    public boolean isHintEnabled() {
        return this.hintEnabled;
    }

    public final boolean isHintExpanded() {
        return this.hintExpanded;
    }

    @Deprecated
    public boolean isPasswordVisibilityToggleEnabled() {
        return this.endLayout.m48658J();
    }

    public boolean isProvidingHint() {
        return this.isProvidingHint;
    }

    public boolean isStartIconCheckable() {
        return this.startLayout.m48573j();
    }

    public boolean isStartIconVisible() {
        return this.startLayout.m48572k();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.collapsingTextHelper.m76442M(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.editText;
        if (editText != null) {
            Rect rect = this.tmpRect;
            C50167v01.m9396a(this, editText, rect);
            updateBoxUnderlineBounds(rect);
            if (this.hintEnabled) {
                this.collapsingTextHelper.m76409j0(this.editText.getTextSize());
                int gravity = this.editText.getGravity();
                this.collapsingTextHelper.m76431X((gravity & (-113)) | 48);
                this.collapsingTextHelper.m76411i0(gravity);
                this.collapsingTextHelper.m76435T(calculateCollapsedTextBounds(rect));
                this.collapsingTextHelper.m76421d0(calculateExpandedTextBounds(rect));
                this.collapsingTextHelper.m76440O();
                if (cutoutEnabled() && !this.hintExpanded) {
                    openCutout();
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean updateEditTextHeightBasedOnIcon = updateEditTextHeightBasedOnIcon();
        boolean updateDummyDrawables = updateDummyDrawables();
        if (updateEditTextHeightBasedOnIcon || updateDummyDrawables) {
            this.editText.post(new RunnableC17924c());
        }
        updatePlaceholderMeasurementsBasedOnEditText();
        this.endLayout.m48666C0();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m67617a());
        setError(savedState.f73553d);
        if (savedState.f73554e) {
            post(new RunnableC17923b());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z != this.areCornerRadiiRtl) {
            float mo29259a = this.shapeAppearanceModel.m31527r().mo29259a(this.tmpRectF);
            float mo29259a2 = this.shapeAppearanceModel.m31525t().mo29259a(this.tmpRectF);
            float mo29259a3 = this.shapeAppearanceModel.m31535j().mo29259a(this.tmpRectF);
            float mo29259a4 = this.shapeAppearanceModel.m31533l().mo29259a(this.tmpRectF);
            QC0 m31528q = this.shapeAppearanceModel.m31528q();
            QC0 m31526s = this.shapeAppearanceModel.m31526s();
            C43037iy5 m31495m = C43037iy5.m31544a().m31514F(m31526s).m31510J(m31528q).m31486v(this.shapeAppearanceModel.m31534k()).m31519A(this.shapeAppearanceModel.m31536i()).m31513G(mo29259a2).m31509K(mo29259a).m31485w(mo29259a4).m31518B(mo29259a3).m31495m();
            this.areCornerRadiiRtl = z;
            setShapeAppearanceModel(m31495m);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (shouldShowError()) {
            savedState.f73553d = getError();
        }
        savedState.f73554e = this.endLayout.m48661G();
        return savedState;
    }

    @Deprecated
    public void passwordVisibilityToggleRequested(boolean z) {
        this.endLayout.m48590z0(z);
    }

    public void refreshEndIconDrawableState() {
        this.endLayout.m48655M();
    }

    public void refreshErrorIconDrawableState() {
        this.endLayout.m48654N();
    }

    public void refreshStartIconDrawableState() {
        this.startLayout.m48570m();
    }

    public void removeOnEditTextAttachedListener(InterfaceC17928g interfaceC17928g) {
        this.editTextAttachedListeners.remove(interfaceC17928g);
    }

    public void removeOnEndIconChangedListener(InterfaceC17929h interfaceC17929h) {
        this.endLayout.m48652P(interfaceC17929h);
    }

    public void setBoxBackgroundColor(int i) {
        if (this.boxBackgroundColor != i) {
            this.boxBackgroundColor = i;
            this.defaultFilledBackgroundColor = i;
            this.focusedFilledBackgroundColor = i;
            this.hoveredFilledBackgroundColor = i;
            applyBoxAttributes();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(NA0.m94301c(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.defaultFilledBackgroundColor = defaultColor;
        this.boxBackgroundColor = defaultColor;
        this.disabledFilledBackgroundColor = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.focusedFilledBackgroundColor = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.hoveredFilledBackgroundColor = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        applyBoxAttributes();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.boxBackgroundMode) {
            return;
        }
        this.boxBackgroundMode = i;
        if (this.editText != null) {
            onApplyBoxBackgroundMode();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.boxCollapsedPaddingTopPx = i;
    }

    public void setBoxCornerFamily(int i) {
        this.shapeAppearanceModel = this.shapeAppearanceModel.m31523v().m31515E(i, this.shapeAppearanceModel.m31527r()).m31511I(i, this.shapeAppearanceModel.m31525t()).m31487u(i, this.shapeAppearanceModel.m31535j()).m31482z(i, this.shapeAppearanceModel.m31533l()).m31495m();
        applyBoxAttributes();
    }

    public void setBoxCornerRadii(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        boolean m79294n = C36704Vt6.m79294n(this);
        this.areCornerRadiiRtl = m79294n;
        if (m79294n) {
            f5 = f2;
        } else {
            f5 = f;
        }
        if (!m79294n) {
            f = f2;
        }
        if (m79294n) {
            f6 = f4;
        } else {
            f6 = f3;
        }
        if (!m79294n) {
            f3 = f4;
        }
        PM2 pm2 = this.boxBackground;
        if (pm2 == null || pm2.m90434I() != f5 || this.boxBackground.m90433J() != f || this.boxBackground.m90384s() != f6 || this.boxBackground.m90383t() != f3) {
            this.shapeAppearanceModel = this.shapeAppearanceModel.m31523v().m31513G(f5).m31509K(f).m31485w(f6).m31518B(f3).m31495m();
            applyBoxAttributes();
        }
    }

    public void setBoxCornerRadiiResources(int i, int i2, int i3, int i4) {
        setBoxCornerRadii(getContext().getResources().getDimension(i), getContext().getResources().getDimension(i2), getContext().getResources().getDimension(i4), getContext().getResources().getDimension(i3));
    }

    public void setBoxStrokeColor(int i) {
        if (this.focusedStrokeColor != i) {
            this.focusedStrokeColor = i;
            updateTextInputBoxState();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.defaultStrokeColor = colorStateList.getDefaultColor();
            this.disabledColor = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.hoveredStrokeColor = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.focusedStrokeColor = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.focusedStrokeColor != colorStateList.getDefaultColor()) {
            this.focusedStrokeColor = colorStateList.getDefaultColor();
        }
        updateTextInputBoxState();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.strokeErrorColor != colorStateList) {
            this.strokeErrorColor = colorStateList;
            updateTextInputBoxState();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.boxStrokeWidthDefaultPx = i;
        updateTextInputBoxState();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.boxStrokeWidthFocusedPx = i;
        updateTextInputBoxState();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.counterEnabled != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.counterView = appCompatTextView;
                appCompatTextView.setId(C33795Ji4.textinput_counter);
                Typeface typeface = this.typeface;
                if (typeface != null) {
                    this.counterView.setTypeface(typeface);
                }
                this.counterView.setMaxLines(1);
                this.indicatorViewController.m113024e(this.counterView, 2);
                C39093cM2.m61540d((ViewGroup.MarginLayoutParams) this.counterView.getLayoutParams(), getResources().getDimensionPixelOffset(C35172Pf4.mtrl_textinput_counter_margin_start));
                updateCounterTextAppearanceAndColor();
                updateCounter();
            } else {
                this.indicatorViewController.m113045E(this.counterView, 2);
                this.counterView = null;
            }
            this.counterEnabled = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.counterMaxLength != i) {
            if (i > 0) {
                this.counterMaxLength = i;
            } else {
                this.counterMaxLength = -1;
            }
            if (this.counterEnabled) {
                updateCounter();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.counterOverflowTextAppearance != i) {
            this.counterOverflowTextAppearance = i;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.counterOverflowTextColor != colorStateList) {
            this.counterOverflowTextColor = colorStateList;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.counterTextAppearance != i) {
            this.counterTextAppearance = i;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.counterTextColor != colorStateList) {
            this.counterTextColor = colorStateList;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.defaultHintTextColor = colorStateList;
        this.focusedTextColor = colorStateList;
        if (this.editText != null) {
            updateLabelState(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        recursiveSetEnabled(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.endLayout.m48650R(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.endLayout.m48649S(z);
    }

    public void setEndIconContentDescription(int i) {
        this.endLayout.m48648T(i);
    }

    public void setEndIconDrawable(int i) {
        this.endLayout.m48646V(i);
    }

    public void setEndIconMinSize(int i) {
        this.endLayout.m48644X(i);
    }

    public void setEndIconMode(int i) {
        this.endLayout.m48643Y(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        this.endLayout.m48642Z(onClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.endLayout.m48640a0(onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        this.endLayout.m48638b0(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        this.endLayout.m48636c0(colorStateList);
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        this.endLayout.m48634d0(mode);
    }

    public void setEndIconVisible(boolean z) {
        this.endLayout.m48632e0(z);
    }

    public void setError(CharSequence charSequence) {
        if (!this.indicatorViewController.m113047C()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            setErrorEnabled(true);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.indicatorViewController.m113031S(charSequence);
        } else {
            this.indicatorViewController.m113005x();
        }
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        this.indicatorViewController.m113043G(i);
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.indicatorViewController.m113042H(charSequence);
    }

    public void setErrorEnabled(boolean z) {
        this.indicatorViewController.m113041I(z);
    }

    public void setErrorIconDrawable(int i) {
        this.endLayout.m48630f0(i);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        this.endLayout.m48626h0(onClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.endLayout.m48624i0(onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.endLayout.m48622j0(colorStateList);
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        this.endLayout.m48620k0(mode);
    }

    public void setErrorTextAppearance(int i) {
        this.indicatorViewController.m113040J(i);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.indicatorViewController.m113039K(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.expandedHintEnabled != z) {
            this.expandedHintEnabled = z;
            updateLabelState(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (isHelperTextEnabled()) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!isHelperTextEnabled()) {
            setHelperTextEnabled(true);
        }
        this.indicatorViewController.m113030T(charSequence);
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.indicatorViewController.m113036N(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.indicatorViewController.m113037M(z);
    }

    public void setHelperTextTextAppearance(int i) {
        this.indicatorViewController.m113038L(i);
    }

    public void setHint(CharSequence charSequence) {
        if (this.hintEnabled) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.hintAnimationEnabled = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.hintEnabled) {
            this.hintEnabled = z;
            if (!z) {
                this.isProvidingHint = false;
                if (!TextUtils.isEmpty(this.hint) && TextUtils.isEmpty(this.editText.getHint())) {
                    this.editText.setHint(this.hint);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.editText.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.hint)) {
                        setHint(hint);
                    }
                    this.editText.setHint((CharSequence) null);
                }
                this.isProvidingHint = true;
            }
            if (this.editText != null) {
                updateInputLayoutMargins();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.collapsingTextHelper.m76434U(i);
        this.focusedTextColor = this.collapsingTextHelper.m76398p();
        if (this.editText != null) {
            updateLabelState(false);
            updateInputLayoutMargins();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.focusedTextColor != colorStateList) {
            if (this.defaultHintTextColor == null) {
                this.collapsingTextHelper.m76432W(colorStateList);
            }
            this.focusedTextColor = colorStateList;
            if (this.editText != null) {
                updateLabelState(false);
            }
        }
    }

    public void setLengthCounter(InterfaceC17927f interfaceC17927f) {
        this.lengthCounter = interfaceC17927f;
    }

    public void setMaxEms(int i) {
        this.maxEms = i;
        EditText editText = this.editText;
        if (editText != null && i != -1) {
            editText.setMaxEms(i);
        }
    }

    public void setMaxWidth(int i) {
        this.maxWidth = i;
        EditText editText = this.editText;
        if (editText != null && i != -1) {
            editText.setMaxWidth(i);
        }
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.minEms = i;
        EditText editText = this.editText;
        if (editText != null && i != -1) {
            editText.setMinEms(i);
        }
    }

    public void setMinWidth(int i) {
        this.minWidth = i;
        EditText editText = this.editText;
        if (editText != null && i != -1) {
            editText.setMinWidth(i);
        }
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        this.endLayout.m48616m0(i);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        this.endLayout.m48612o0(i);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        this.endLayout.m48608q0(z);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.endLayout.m48606r0(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.endLayout.m48604s0(mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.placeholderTextView == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.placeholderTextView = appCompatTextView;
            appCompatTextView.setId(C33795Ji4.textinput_placeholder);
            C38790bq6.m62539H0(this.placeholderTextView, 2);
            Fade createPlaceholderFadeTransition = createPlaceholderFadeTransition();
            this.placeholderFadeIn = createPlaceholderFadeTransition;
            createPlaceholderFadeTransition.mo65840x0(67L);
            this.placeholderFadeOut = createPlaceholderFadeTransition();
            setPlaceholderTextAppearance(this.placeholderTextAppearance);
            setPlaceholderTextColor(this.placeholderTextColor);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.placeholderEnabled) {
                setPlaceholderTextEnabled(true);
            }
            this.placeholderText = charSequence;
        }
        updatePlaceholderText();
    }

    public void setPlaceholderTextAppearance(int i) {
        this.placeholderTextAppearance = i;
        TextView textView = this.placeholderTextView;
        if (textView != null) {
            Q26.m89061o(textView, i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.placeholderTextColor != colorStateList) {
            this.placeholderTextColor = colorStateList;
            TextView textView = this.placeholderTextView;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.startLayout.m48569n(charSequence);
    }

    public void setPrefixTextAppearance(int i) {
        this.startLayout.m48568o(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.startLayout.m48567p(colorStateList);
    }

    public void setShapeAppearanceModel(C43037iy5 c43037iy5) {
        PM2 pm2 = this.boxBackground;
        if (pm2 != null && pm2.m90438E() != c43037iy5) {
            this.shapeAppearanceModel = c43037iy5;
            applyBoxAttributes();
        }
    }

    public void setStartIconCheckable(boolean z) {
        this.startLayout.m48566q(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? C29611vi.m8248b(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        this.startLayout.m48563t(i);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.startLayout.m48562u(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.startLayout.m48561v(onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        this.startLayout.m48560w(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.startLayout.m48559x(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.startLayout.m48558y(mode);
    }

    public void setStartIconVisible(boolean z) {
        this.startLayout.m48557z(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.endLayout.m48602t0(charSequence);
    }

    public void setSuffixTextAppearance(int i) {
        this.endLayout.m48600u0(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.endLayout.m48598v0(colorStateList);
    }

    public void setTextAppearanceCompatWithErrorFallback(TextView textView, int i) {
        boolean z = true;
        try {
            Q26.m89061o(textView, i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            Q26.m89061o(textView, C50021ul4.TextAppearance_AppCompat_Caption);
            textView.setTextColor(NA0.m94301c(getContext(), C33768Jf4.design_error));
        }
    }

    public void setTextInputAccessibilityDelegate(C17926e c17926e) {
        EditText editText = this.editText;
        if (editText != null) {
            C38790bq6.m62452v0(editText, c17926e);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.typeface) {
            this.typeface = typeface;
            this.collapsingTextHelper.m76454B0(typeface);
            this.indicatorViewController.m113034P(typeface);
            TextView textView = this.counterView;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    public boolean shouldShowError() {
        return this.indicatorViewController.m113017l();
    }

    public boolean updateDummyDrawables() {
        boolean z;
        if (this.editText == null) {
            return false;
        }
        boolean z2 = true;
        if (shouldUpdateStartDummyDrawable()) {
            int measuredWidth = this.startLayout.getMeasuredWidth() - this.editText.getPaddingLeft();
            if (this.startDummyDrawable == null || this.startDummyDrawableWidth != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.startDummyDrawable = colorDrawable;
                this.startDummyDrawableWidth = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] m89075a = Q26.m89075a(this.editText);
            Drawable drawable = m89075a[0];
            Drawable drawable2 = this.startDummyDrawable;
            if (drawable != drawable2) {
                Q26.m89066j(this.editText, drawable2, m89075a[1], m89075a[2], m89075a[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.startDummyDrawable != null) {
                Drawable[] m89075a2 = Q26.m89075a(this.editText);
                Q26.m89066j(this.editText, null, m89075a2[1], m89075a2[2], m89075a2[3]);
                this.startDummyDrawable = null;
                z = true;
            }
            z = false;
        }
        if (shouldUpdateEndDummyDrawable()) {
            int measuredWidth2 = this.endLayout.m48671A().getMeasuredWidth() - this.editText.getPaddingRight();
            CheckableImageButton m48617m = this.endLayout.m48617m();
            if (m48617m != null) {
                measuredWidth2 = measuredWidth2 + m48617m.getMeasuredWidth() + C39093cM2.m61542b((ViewGroup.MarginLayoutParams) m48617m.getLayoutParams());
            }
            Drawable[] m89075a3 = Q26.m89075a(this.editText);
            Drawable drawable3 = this.endDummyDrawable;
            if (drawable3 != null && this.endDummyDrawableWidth != measuredWidth2) {
                this.endDummyDrawableWidth = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                Q26.m89066j(this.editText, m89075a3[0], m89075a3[1], this.endDummyDrawable, m89075a3[3]);
            } else {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.endDummyDrawable = colorDrawable2;
                    this.endDummyDrawableWidth = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = m89075a3[2];
                Drawable drawable5 = this.endDummyDrawable;
                if (drawable4 != drawable5) {
                    this.originalEditTextEndDrawable = drawable4;
                    Q26.m89066j(this.editText, m89075a3[0], m89075a3[1], drawable5, m89075a3[3]);
                } else {
                    z2 = z;
                }
            }
        } else if (this.endDummyDrawable != null) {
            Drawable[] m89075a4 = Q26.m89075a(this.editText);
            if (m89075a4[2] == this.endDummyDrawable) {
                Q26.m89066j(this.editText, m89075a4[0], m89075a4[1], this.originalEditTextEndDrawable, m89075a4[3]);
            } else {
                z2 = z;
            }
            this.endDummyDrawable = null;
        } else {
            return z;
        }
        return z2;
    }

    public void updateEditTextBackground() {
        Drawable background;
        TextView textView;
        EditText editText = this.editText;
        if (editText == null || this.boxBackgroundMode != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (C39565d71.m44602a(background)) {
            background = background.mutate();
        }
        if (shouldShowError()) {
            background.setColorFilter(C27043oi.m20608e(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.counterOverflowed && (textView = this.counterView) != null) {
            background.setColorFilter(C27043oi.m20608e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            P61.m90849c(background);
            this.editText.refreshDrawableState();
        }
    }

    public void updateEditTextBoxBackgroundIfNeeded() {
        EditText editText = this.editText;
        if (editText != null && this.boxBackground != null) {
            if ((this.boxBackgroundApplied || editText.getBackground() == null) && this.boxBackgroundMode != 0) {
                C38790bq6.m62553A0(this.editText, getEditTextBoxBackground());
                this.boxBackgroundApplied = true;
            }
        }
    }

    public void updateLabelState(boolean z) {
        updateLabelState(z, false);
    }

    public void updateTextInputBoxState() {
        boolean z;
        boolean z2;
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.boxBackground != null && this.boxBackgroundMode != 0) {
            boolean z3 = false;
            if (!isFocused() && ((editText2 = this.editText) == null || !editText2.hasFocus())) {
                z = false;
            } else {
                z = true;
            }
            if (!isHovered() && ((editText = this.editText) == null || !editText.isHovered())) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (shouldShowError() || (this.counterView != null && this.counterOverflowed)) {
                z3 = true;
            }
            if (!isEnabled()) {
                this.boxStrokeColor = this.disabledColor;
            } else if (shouldShowError()) {
                if (this.strokeErrorColor != null) {
                    updateStrokeErrorColor(z, z2);
                } else {
                    this.boxStrokeColor = getErrorCurrentTextColors();
                }
            } else if (this.counterOverflowed && (textView = this.counterView) != null) {
                if (this.strokeErrorColor != null) {
                    updateStrokeErrorColor(z, z2);
                } else {
                    this.boxStrokeColor = textView.getCurrentTextColor();
                }
            } else if (z) {
                this.boxStrokeColor = this.focusedStrokeColor;
            } else if (z2) {
                this.boxStrokeColor = this.hoveredStrokeColor;
            } else {
                this.boxStrokeColor = this.defaultStrokeColor;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                updateCursorColor(z3);
            }
            this.endLayout.m48656L();
            refreshStartIconDrawableState();
            if (this.boxBackgroundMode == 2) {
                int i = this.boxStrokeWidthPx;
                if (z && isEnabled()) {
                    this.boxStrokeWidthPx = this.boxStrokeWidthFocusedPx;
                } else {
                    this.boxStrokeWidthPx = this.boxStrokeWidthDefaultPx;
                }
                if (this.boxStrokeWidthPx != i) {
                    recalculateCutout();
                }
            }
            if (this.boxBackgroundMode == 1) {
                if (!isEnabled()) {
                    this.boxBackgroundColor = this.disabledFilledBackgroundColor;
                } else if (z2 && !z) {
                    this.boxBackgroundColor = this.hoveredFilledBackgroundColor;
                } else if (z) {
                    this.boxBackgroundColor = this.focusedFilledBackgroundColor;
                } else {
                    this.boxBackgroundColor = this.defaultFilledBackgroundColor;
                }
            }
            applyBoxAttributes();
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C49961uf4.textInputStyle);
    }

    private void updateLabelState(boolean z, boolean z2) {
        ColorStateList colorStateList;
        TextView textView;
        int i;
        boolean isEnabled = isEnabled();
        EditText editText = this.editText;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.editText;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.defaultHintTextColor;
        if (colorStateList2 != null) {
            this.collapsingTextHelper.m76437R(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.defaultHintTextColor;
            if (colorStateList3 != null) {
                i = colorStateList3.getColorForState(new int[]{-16842910}, this.disabledColor);
            } else {
                i = this.disabledColor;
            }
            this.collapsingTextHelper.m76437R(ColorStateList.valueOf(i));
        } else if (shouldShowError()) {
            this.collapsingTextHelper.m76437R(this.indicatorViewController.m113011r());
        } else if (this.counterOverflowed && (textView = this.counterView) != null) {
            this.collapsingTextHelper.m76437R(textView.getTextColors());
        } else if (z4 && (colorStateList = this.focusedTextColor) != null) {
            this.collapsingTextHelper.m76432W(colorStateList);
        }
        if (!z3 && this.expandedHintEnabled && (!isEnabled() || !z4)) {
            if (z2 || !this.hintExpanded) {
                expandHint(z);
            }
        } else if (z2 || this.hintExpanded) {
            collapseHint(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlaceholderText(Editable editable) {
        if (this.lengthCounter.mo48673a(editable) == 0 && !this.hintExpanded) {
            showPlaceholderText();
        } else {
            hidePlaceholderText();
        }
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.endLayout.m48647U(charSequence);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.endLayout.m48645W(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.endLayout.m48628g0(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.endLayout.m48614n0(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.endLayout.m48610p0(drawable);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.startLayout.m48565r(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.startLayout.m48564s(drawable);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v66 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(VM2.m79935c(context, attributeSet, i, r9), attributeSet, i);
        ?? r3;
        int i2 = DEF_STYLE_RES;
        this.minEms = -1;
        this.maxEms = -1;
        this.minWidth = -1;
        this.maxWidth = -1;
        this.indicatorViewController = new C12(this);
        this.lengthCounter = new InterfaceC17927f() { // from class: S16
            @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC17927f
            /* renamed from: a */
            public final int mo48673a(Editable editable) {
                int lambda$new$0;
                lambda$new$0 = TextInputLayout.lambda$new$0(editable);
                return lambda$new$0;
            }
        };
        this.tmpRect = new Rect();
        this.tmpBoundsRect = new Rect();
        this.tmpRectF = new RectF();
        this.editTextAttachedListeners = new LinkedHashSet<>();
        C37094Xl0 c37094Xl0 = new C37094Xl0(this);
        this.collapsingTextHelper = c37094Xl0;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.inputFrame = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        TimeInterpolator timeInterpolator = C27325pf.f103879a;
        c37094Xl0.m76377z0(timeInterpolator);
        c37094Xl0.m76387u0(timeInterpolator);
        c37094Xl0.m76431X(8388659);
        int[] iArr = C37098Xl4.TextInputLayout;
        int i3 = C37098Xl4.TextInputLayout_counterTextAppearance;
        int i4 = C37098Xl4.TextInputLayout_counterOverflowTextAppearance;
        int i5 = C37098Xl4.TextInputLayout_errorTextAppearance;
        int i6 = C37098Xl4.TextInputLayout_helperTextTextAppearance;
        int i7 = C37098Xl4.TextInputLayout_hintTextAppearance;
        Z46 m21865j = C46052o36.m21865j(context2, attributeSet, iArr, i, i2, i3, i4, i5, i6, i7);
        C17935b c17935b = new C17935b(this, m21865j);
        this.startLayout = c17935b;
        this.hintEnabled = m21865j.m73768a(C37098Xl4.TextInputLayout_hintEnabled, true);
        setHint(m21865j.m73753p(C37098Xl4.TextInputLayout_android_hint));
        this.hintAnimationEnabled = m21865j.m73768a(C37098Xl4.TextInputLayout_hintAnimationEnabled, true);
        this.expandedHintEnabled = m21865j.m73768a(C37098Xl4.TextInputLayout_expandedHintEnabled, true);
        int i8 = C37098Xl4.TextInputLayout_android_minEms;
        if (m21865j.m73750s(i8)) {
            setMinEms(m21865j.m73758k(i8, -1));
        } else {
            int i9 = C37098Xl4.TextInputLayout_android_minWidth;
            if (m21865j.m73750s(i9)) {
                setMinWidth(m21865j.m73763f(i9, -1));
            }
        }
        int i10 = C37098Xl4.TextInputLayout_android_maxEms;
        if (m21865j.m73750s(i10)) {
            setMaxEms(m21865j.m73758k(i10, -1));
        } else {
            int i11 = C37098Xl4.TextInputLayout_android_maxWidth;
            if (m21865j.m73750s(i11)) {
                setMaxWidth(m21865j.m73763f(i11, -1));
            }
        }
        this.shapeAppearanceModel = C43037iy5.m31540e(context2, attributeSet, i, i2).m31495m();
        this.boxLabelCutoutPaddingPx = context2.getResources().getDimensionPixelOffset(C35172Pf4.mtrl_textinput_box_label_cutout_padding);
        this.boxCollapsedPaddingTopPx = m21865j.m73764e(C37098Xl4.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.boxStrokeWidthDefaultPx = m21865j.m73763f(C37098Xl4.TextInputLayout_boxStrokeWidth, context2.getResources().getDimensionPixelSize(C35172Pf4.mtrl_textinput_box_stroke_width_default));
        this.boxStrokeWidthFocusedPx = m21865j.m73763f(C37098Xl4.TextInputLayout_boxStrokeWidthFocused, context2.getResources().getDimensionPixelSize(C35172Pf4.mtrl_textinput_box_stroke_width_focused));
        this.boxStrokeWidthPx = this.boxStrokeWidthDefaultPx;
        float m73765d = m21865j.m73765d(C37098Xl4.TextInputLayout_boxCornerRadiusTopStart, -1.0f);
        float m73765d2 = m21865j.m73765d(C37098Xl4.TextInputLayout_boxCornerRadiusTopEnd, -1.0f);
        float m73765d3 = m21865j.m73765d(C37098Xl4.TextInputLayout_boxCornerRadiusBottomEnd, -1.0f);
        float m73765d4 = m21865j.m73765d(C37098Xl4.TextInputLayout_boxCornerRadiusBottomStart, -1.0f);
        C43037iy5.C24658b m31523v = this.shapeAppearanceModel.m31523v();
        if (m73765d >= 0.0f) {
            m31523v.m31513G(m73765d);
        }
        if (m73765d2 >= 0.0f) {
            m31523v.m31509K(m73765d2);
        }
        if (m73765d3 >= 0.0f) {
            m31523v.m31518B(m73765d3);
        }
        if (m73765d4 >= 0.0f) {
            m31523v.m31485w(m73765d4);
        }
        this.shapeAppearanceModel = m31523v.m31495m();
        ColorStateList m94030a = NM2.m94030a(context2, m21865j, C37098Xl4.TextInputLayout_boxBackgroundColor);
        if (m94030a != null) {
            int defaultColor = m94030a.getDefaultColor();
            this.defaultFilledBackgroundColor = defaultColor;
            this.boxBackgroundColor = defaultColor;
            if (m94030a.isStateful()) {
                this.disabledFilledBackgroundColor = m94030a.getColorForState(new int[]{-16842910}, -1);
                this.focusedFilledBackgroundColor = m94030a.getColorForState(new int[]{16842908, 16842910}, -1);
                this.hoveredFilledBackgroundColor = m94030a.getColorForState(new int[]{16843623, 16842910}, -1);
            } else {
                this.focusedFilledBackgroundColor = this.defaultFilledBackgroundColor;
                ColorStateList m8249a = C29611vi.m8249a(context2, C33768Jf4.mtrl_filled_background_color);
                this.disabledFilledBackgroundColor = m8249a.getColorForState(new int[]{-16842910}, -1);
                this.hoveredFilledBackgroundColor = m8249a.getColorForState(new int[]{16843623}, -1);
            }
        } else {
            this.boxBackgroundColor = 0;
            this.defaultFilledBackgroundColor = 0;
            this.disabledFilledBackgroundColor = 0;
            this.focusedFilledBackgroundColor = 0;
            this.hoveredFilledBackgroundColor = 0;
        }
        int i12 = C37098Xl4.TextInputLayout_android_textColorHint;
        if (m21865j.m73750s(i12)) {
            ColorStateList m73766c = m21865j.m73766c(i12);
            this.focusedTextColor = m73766c;
            this.defaultHintTextColor = m73766c;
        }
        int i13 = C37098Xl4.TextInputLayout_boxStrokeColor;
        ColorStateList m94030a2 = NM2.m94030a(context2, m21865j, i13);
        this.focusedStrokeColor = m21865j.m73767b(i13, 0);
        this.defaultStrokeColor = NA0.m94301c(context2, C33768Jf4.mtrl_textinput_default_box_stroke_color);
        this.disabledColor = NA0.m94301c(context2, C33768Jf4.mtrl_textinput_disabled_color);
        this.hoveredStrokeColor = NA0.m94301c(context2, C33768Jf4.mtrl_textinput_hovered_box_stroke_color);
        if (m94030a2 != null) {
            setBoxStrokeColorStateList(m94030a2);
        }
        int i14 = C37098Xl4.TextInputLayout_boxStrokeErrorColor;
        if (m21865j.m73750s(i14)) {
            setBoxStrokeErrorColor(NM2.m94030a(context2, m21865j, i14));
        }
        if (m21865j.m73755n(i7, -1) != -1) {
            r3 = 0;
            setHintTextAppearance(m21865j.m73755n(i7, 0));
        } else {
            r3 = 0;
        }
        int m73755n = m21865j.m73755n(i5, r3);
        CharSequence m73753p = m21865j.m73753p(C37098Xl4.TextInputLayout_errorContentDescription);
        int m73758k = m21865j.m73758k(C37098Xl4.TextInputLayout_errorAccessibilityLiveRegion, 1);
        boolean m73768a = m21865j.m73768a(C37098Xl4.TextInputLayout_errorEnabled, r3);
        int m73755n2 = m21865j.m73755n(i6, r3);
        boolean m73768a2 = m21865j.m73768a(C37098Xl4.TextInputLayout_helperTextEnabled, r3);
        CharSequence m73753p2 = m21865j.m73753p(C37098Xl4.TextInputLayout_helperText);
        int m73755n3 = m21865j.m73755n(C37098Xl4.TextInputLayout_placeholderTextAppearance, r3);
        CharSequence m73753p3 = m21865j.m73753p(C37098Xl4.TextInputLayout_placeholderText);
        boolean m73768a3 = m21865j.m73768a(C37098Xl4.TextInputLayout_counterEnabled, r3);
        setCounterMaxLength(m21865j.m73758k(C37098Xl4.TextInputLayout_counterMaxLength, -1));
        this.counterTextAppearance = m21865j.m73755n(i3, 0);
        this.counterOverflowTextAppearance = m21865j.m73755n(i4, 0);
        setBoxBackgroundMode(m21865j.m73758k(C37098Xl4.TextInputLayout_boxBackgroundMode, 0));
        setErrorContentDescription(m73753p);
        setErrorAccessibilityLiveRegion(m73758k);
        setCounterOverflowTextAppearance(this.counterOverflowTextAppearance);
        setHelperTextTextAppearance(m73755n2);
        setErrorTextAppearance(m73755n);
        setCounterTextAppearance(this.counterTextAppearance);
        setPlaceholderText(m73753p3);
        setPlaceholderTextAppearance(m73755n3);
        int i15 = C37098Xl4.TextInputLayout_errorTextColor;
        if (m21865j.m73750s(i15)) {
            setErrorTextColor(m21865j.m73766c(i15));
        }
        int i16 = C37098Xl4.TextInputLayout_helperTextTextColor;
        if (m21865j.m73750s(i16)) {
            setHelperTextColor(m21865j.m73766c(i16));
        }
        int i17 = C37098Xl4.TextInputLayout_hintTextColor;
        if (m21865j.m73750s(i17)) {
            setHintTextColor(m21865j.m73766c(i17));
        }
        int i18 = C37098Xl4.TextInputLayout_counterTextColor;
        if (m21865j.m73750s(i18)) {
            setCounterTextColor(m21865j.m73766c(i18));
        }
        int i19 = C37098Xl4.TextInputLayout_counterOverflowTextColor;
        if (m21865j.m73750s(i19)) {
            setCounterOverflowTextColor(m21865j.m73766c(i19));
        }
        int i20 = C37098Xl4.TextInputLayout_placeholderTextColor;
        if (m21865j.m73750s(i20)) {
            setPlaceholderTextColor(m21865j.m73766c(i20));
        }
        C17930a c17930a = new C17930a(this, m21865j);
        this.endLayout = c17930a;
        boolean m73768a4 = m21865j.m73768a(C37098Xl4.TextInputLayout_android_enabled, true);
        m21865j.m73746w();
        C38790bq6.m62539H0(this, 2);
        if (Build.VERSION.SDK_INT >= 26) {
            C38790bq6.m62537I0(this, 1);
        }
        frameLayout.addView(c17935b);
        frameLayout.addView(c17930a);
        addView(frameLayout);
        setEnabled(m73768a4);
        setHelperTextEnabled(m73768a2);
        setErrorEnabled(m73768a);
        setCounterEnabled(m73768a3);
        setHelperText(m73753p2);
    }

    public void updateCounter(Editable editable) {
        int mo48673a = this.lengthCounter.mo48673a(editable);
        boolean z = this.counterOverflowed;
        int i = this.counterMaxLength;
        if (i == -1) {
            this.counterView.setText(String.valueOf(mo48673a));
            this.counterView.setContentDescription(null);
            this.counterOverflowed = false;
        } else {
            this.counterOverflowed = mo48673a > i;
            updateCounterContentDescription(getContext(), this.counterView, mo48673a, this.counterMaxLength, this.counterOverflowed);
            if (z != this.counterOverflowed) {
                updateCounterTextAppearanceAndColor();
            }
            this.counterView.setText(C2697GG.m105577c().m105570j(getContext().getString(C40534el4.character_counter_pattern, Integer.valueOf(mo48673a), Integer.valueOf(this.counterMaxLength))));
        }
        if (this.editText == null || z == this.counterOverflowed) {
            return;
        }
        updateLabelState(false);
        updateTextInputBoxState();
        updateEditTextBackground();
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }
}
