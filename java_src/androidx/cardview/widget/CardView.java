package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: i */
    public static final int[] f52909i = {16842801};

    /* renamed from: j */
    public static final InterfaceC49374tg0 f52910j;

    /* renamed from: b */
    public boolean f52911b;

    /* renamed from: c */
    public boolean f52912c;

    /* renamed from: d */
    public int f52913d;

    /* renamed from: e */
    public int f52914e;

    /* renamed from: f */
    public final Rect f52915f;

    /* renamed from: g */
    public final Rect f52916g;

    /* renamed from: h */
    public final InterfaceC48781sg0 f52917h;

    /* renamed from: androidx.cardview.widget.CardView$a */
    /* loaded from: classes.dex */
    public class C11282a implements InterfaceC48781sg0 {

        /* renamed from: a */
        public Drawable f52918a;

        public C11282a() {
        }

        @Override // p000.InterfaceC48781sg0
        /* renamed from: a */
        public void mo13858a(int i, int i2, int i3, int i4) {
            CardView.this.f52916g.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.f52915f;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }

        @Override // p000.InterfaceC48781sg0
        /* renamed from: b */
        public boolean mo13857b() {
            return CardView.this.m68890q();
        }

        @Override // p000.InterfaceC48781sg0
        /* renamed from: c */
        public void mo13856c(Drawable drawable) {
            this.f52918a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // p000.InterfaceC48781sg0
        /* renamed from: d */
        public Drawable mo13855d() {
            return this.f52918a;
        }

        @Override // p000.InterfaceC48781sg0
        /* renamed from: e */
        public boolean mo13854e() {
            return CardView.this.m68892o();
        }

        @Override // p000.InterfaceC48781sg0
        /* renamed from: f */
        public View mo13853f() {
            return CardView.this;
        }
    }

    static {
        C47596qg0 c47596qg0 = new C47596qg0();
        f52910j = c47596qg0;
        c47596qg0.mo11935o();
    }

    public CardView(Context context) {
        this(context, null);
    }

    /* renamed from: h */
    public ColorStateList m68899h() {
        return f52910j.mo11938l(this.f52917h);
    }

    /* renamed from: i */
    public float m68898i() {
        return f52910j.mo11948b(this.f52917h);
    }

    /* renamed from: j */
    public int m68897j() {
        return this.f52915f.bottom;
    }

    /* renamed from: k */
    public int m68896k() {
        return this.f52915f.left;
    }

    /* renamed from: l */
    public int m68895l() {
        return this.f52915f.right;
    }

    /* renamed from: m */
    public int m68894m() {
        return this.f52915f.top;
    }

    /* renamed from: n */
    public float m68893n() {
        return f52910j.mo11936n(this.f52917h);
    }

    /* renamed from: o */
    public boolean m68892o() {
        return this.f52912c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        InterfaceC49374tg0 interfaceC49374tg0 = f52910j;
        if (!(interfaceC49374tg0 instanceof C47596qg0)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(interfaceC49374tg0.mo11945e(this.f52917h)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(interfaceC49374tg0.mo11942h(this.f52917h)), View.MeasureSpec.getSize(i2)), mode2);
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    /* renamed from: p */
    public float m68891p() {
        return f52910j.mo11939k(this.f52917h);
    }

    /* renamed from: q */
    public boolean m68890q() {
        return this.f52911b;
    }

    public void setCardBackgroundColor(int i) {
        f52910j.mo11940j(this.f52917h, ColorStateList.valueOf(i));
    }

    public void setCardElevation(float f) {
        f52910j.mo11937m(this.f52917h, f);
    }

    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.f52915f.set(i, i2, i3, i4);
        f52910j.mo11943g(this.f52917h);
    }

    public void setMaxCardElevation(float f) {
        f52910j.mo11947c(this.f52917h, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.f52914e = i;
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.f52913d = i;
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f52912c) {
            this.f52912c = z;
            f52910j.mo11949a(this.f52917h);
        }
    }

    public void setRadius(float f) {
        f52910j.mo11946d(this.f52917h, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f52911b != z) {
            this.f52911b = z;
            f52910j.mo11944f(this.f52917h);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C45218mf4.cardViewStyle);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f52910j.mo11940j(this.f52917h, colorStateList);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f52915f = rect;
        this.f52916g = new Rect();
        C11282a c11282a = new C11282a();
        this.f52917h = c11282a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C38748bm4.CardView, i, C52985zl4.CardView);
        int i2 = C38748bm4.CardView_cardBackgroundColor;
        if (obtainStyledAttributes.hasValue(i2)) {
            valueOf = obtainStyledAttributes.getColorStateList(i2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f52909i);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(C32130Cf4.cardview_light_background);
            } else {
                color = getResources().getColor(C32130Cf4.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(C38748bm4.CardView_cardCornerRadius, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(C38748bm4.CardView_cardElevation, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(C38748bm4.CardView_cardMaxElevation, 0.0f);
        this.f52911b = obtainStyledAttributes.getBoolean(C38748bm4.CardView_cardUseCompatPadding, false);
        this.f52912c = obtainStyledAttributes.getBoolean(C38748bm4.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C38748bm4.CardView_contentPadding, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(C38748bm4.CardView_contentPaddingLeft, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(C38748bm4.CardView_contentPaddingTop, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(C38748bm4.CardView_contentPaddingRight, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(C38748bm4.CardView_contentPaddingBottom, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f52913d = obtainStyledAttributes.getDimensionPixelSize(C38748bm4.CardView_android_minWidth, 0);
        this.f52914e = obtainStyledAttributes.getDimensionPixelSize(C38748bm4.CardView_android_minHeight, 0);
        obtainStyledAttributes.recycle();
        f52910j.mo11941i(c11282a, context, colorStateList, dimension, dimension2, f);
    }
}
