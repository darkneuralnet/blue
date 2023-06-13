package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import p000.C38306b16;
/* renamed from: I56 */
/* loaded from: classes6.dex */
public class I56 extends PM2 implements C38306b16.InterfaceC12272b {

    /* renamed from: W */
    public static final int f14485W = C50021ul4.Widget_MaterialComponents_Tooltip;

    /* renamed from: X */
    public static final int f14486X = C49961uf4.tooltipStyle;

    /* renamed from: A */
    public CharSequence f14487A;

    /* renamed from: B */
    public final Context f14488B;

    /* renamed from: C */
    public final Paint.FontMetrics f14489C;

    /* renamed from: D */
    public final C38306b16 f14490D;

    /* renamed from: E */
    public final View.OnLayoutChangeListener f14491E;

    /* renamed from: F */
    public final Rect f14492F;

    /* renamed from: G */
    public int f14493G;

    /* renamed from: H */
    public int f14494H;

    /* renamed from: I */
    public int f14495I;

    /* renamed from: J */
    public int f14496J;

    /* renamed from: K */
    public int f14497K;

    /* renamed from: P */
    public int f14498P;

    /* renamed from: Q */
    public float f14499Q;

    /* renamed from: R */
    public float f14500R;

    /* renamed from: S */
    public final float f14501S;

    /* renamed from: T */
    public float f14502T;

    /* renamed from: U */
    public float f14503U;

    /* renamed from: I56$a */
    /* loaded from: classes6.dex */
    public class View$OnLayoutChangeListenerC3324a implements View.OnLayoutChangeListener {
        public View$OnLayoutChangeListenerC3324a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            I56.this.m102972D0(view);
        }
    }

    public I56(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f14489C = new Paint.FontMetrics();
        C38306b16 c38306b16 = new C38306b16(this);
        this.f14490D = c38306b16;
        this.f14491E = new View$OnLayoutChangeListenerC3324a();
        this.f14492F = new Rect();
        this.f14499Q = 1.0f;
        this.f14500R = 1.0f;
        this.f14501S = 0.5f;
        this.f14502T = 0.5f;
        this.f14503U = 1.0f;
        this.f14488B = context;
        c38306b16.m65107e().density = context.getResources().getDisplayMetrics().density;
        c38306b16.m65107e().setTextAlign(Paint.Align.CENTER);
    }

    /* renamed from: t0 */
    public static I56 m102967t0(Context context, AttributeSet attributeSet, int i, int i2) {
        I56 i56 = new I56(context, attributeSet, i, i2);
        i56.m102962y0(attributeSet, i, i2);
        return i56;
    }

    /* renamed from: A0 */
    public void m102975A0(float f) {
        this.f14502T = 1.2f;
        this.f14499Q = f;
        this.f14500R = f;
        this.f14503U = C27325pf.m19014b(0.0f, 1.0f, 0.19f, 1.0f, f);
        invalidateSelf();
    }

    /* renamed from: B0 */
    public void m102974B0(CharSequence charSequence) {
        if (!TextUtils.equals(this.f14487A, charSequence)) {
            this.f14487A = charSequence;
            this.f14490D.m65103i(true);
            invalidateSelf();
        }
    }

    /* renamed from: C0 */
    public void m102973C0(N06 n06) {
        this.f14490D.m65104h(n06, this.f14488B);
    }

    /* renamed from: D0 */
    public final void m102972D0(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.f14498P = iArr[0];
        view.getWindowVisibleDisplayFrame(this.f14492F);
    }

    @Override // p000.C38306b16.InterfaceC12272b
    /* renamed from: a */
    public void mo49869a() {
        invalidateSelf();
    }

    @Override // p000.PM2, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.save();
        canvas.scale(this.f14499Q, this.f14500R, getBounds().left + (getBounds().width() * 0.5f), getBounds().top + (getBounds().height() * this.f14502T));
        canvas.translate(m102970q0(), (float) (-((this.f14497K * Math.sqrt(2.0d)) - this.f14497K)));
        super.draw(canvas);
        m102964w0(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) Math.max(this.f14490D.m65107e().getTextSize(), this.f14495I);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) Math.max((this.f14493G * 2) + m102963x0(), this.f14494H);
    }

    @Override // p000.PM2, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        setShapeAppearanceModel(m90438E().m31523v().m31489s(m102966u0()).m31495m());
    }

    @Override // p000.PM2, android.graphics.drawable.Drawable, p000.C38306b16.InterfaceC12272b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    /* renamed from: q0 */
    public final float m102970q0() {
        int i;
        if (((this.f14492F.right - getBounds().right) - this.f14498P) - this.f14496J < 0) {
            i = ((this.f14492F.right - getBounds().right) - this.f14498P) - this.f14496J;
        } else if (((this.f14492F.left - getBounds().left) - this.f14498P) + this.f14496J > 0) {
            i = ((this.f14492F.left - getBounds().left) - this.f14498P) + this.f14496J;
        } else {
            return 0.0f;
        }
        return i;
    }

    /* renamed from: r0 */
    public final float m102969r0() {
        this.f14490D.m65107e().getFontMetrics(this.f14489C);
        Paint.FontMetrics fontMetrics = this.f14489C;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* renamed from: s0 */
    public final float m102968s0(Rect rect) {
        return rect.centerY() - m102969r0();
    }

    /* renamed from: u0 */
    public final L91 m102966u0() {
        float width = ((float) (getBounds().width() - (this.f14497K * Math.sqrt(2.0d)))) / 2.0f;
        return new C32588Ee3(new C42668iM2(this.f14497K), Math.min(Math.max(-m102970q0(), -width), width));
    }

    /* renamed from: v0 */
    public void m102965v0(View view) {
        if (view == null) {
            return;
        }
        view.removeOnLayoutChangeListener(this.f14491E);
    }

    /* renamed from: w0 */
    public final void m102964w0(Canvas canvas) {
        if (this.f14487A == null) {
            return;
        }
        Rect bounds = getBounds();
        int m102968s0 = (int) m102968s0(bounds);
        if (this.f14490D.m65108d() != null) {
            this.f14490D.m65107e().drawableState = getState();
            this.f14490D.m65102j(this.f14488B);
            this.f14490D.m65107e().setAlpha((int) (this.f14503U * 255.0f));
        }
        CharSequence charSequence = this.f14487A;
        canvas.drawText(charSequence, 0, charSequence.length(), bounds.centerX(), m102968s0, this.f14490D.m65107e());
    }

    /* renamed from: x0 */
    public final float m102963x0() {
        CharSequence charSequence = this.f14487A;
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f14490D.m65106f(charSequence.toString());
    }

    /* renamed from: y0 */
    public final void m102962y0(AttributeSet attributeSet, int i, int i2) {
        TypedArray m21866i = C46052o36.m21866i(this.f14488B, attributeSet, C37098Xl4.Tooltip, i, i2, new int[0]);
        this.f14497K = this.f14488B.getResources().getDimensionPixelSize(C35172Pf4.mtrl_tooltip_arrowSize);
        setShapeAppearanceModel(m90438E().m31523v().m31489s(m102966u0()).m31495m());
        m102974B0(m21866i.getText(C37098Xl4.Tooltip_android_text));
        N06 m94024g = NM2.m94024g(this.f14488B, m21866i, C37098Xl4.Tooltip_android_textAppearance);
        if (m94024g != null) {
            int i3 = C37098Xl4.Tooltip_android_textColor;
            if (m21866i.hasValue(i3)) {
                m94024g.m94479k(NM2.m94029b(this.f14488B, m21866i, i3));
            }
        }
        m102973C0(m94024g);
        m90416a0(ColorStateList.valueOf(m21866i.getColor(C37098Xl4.Tooltip_backgroundTint, HM2.m103948h(C33827Jm0.m99845p(HM2.m103953c(this.f14488B, 16842801, I56.class.getCanonicalName()), 229), C33827Jm0.m99845p(HM2.m103953c(this.f14488B, C49961uf4.colorOnBackground, I56.class.getCanonicalName()), 153)))));
        m90396k0(ColorStateList.valueOf(HM2.m103953c(this.f14488B, C49961uf4.colorSurface, I56.class.getCanonicalName())));
        this.f14493G = m21866i.getDimensionPixelSize(C37098Xl4.Tooltip_android_padding, 0);
        this.f14494H = m21866i.getDimensionPixelSize(C37098Xl4.Tooltip_android_minWidth, 0);
        this.f14495I = m21866i.getDimensionPixelSize(C37098Xl4.Tooltip_android_minHeight, 0);
        this.f14496J = m21866i.getDimensionPixelSize(C37098Xl4.Tooltip_android_layout_margin, 0);
        m21866i.recycle();
    }

    /* renamed from: z0 */
    public void m102961z0(View view) {
        if (view == null) {
            return;
        }
        m102972D0(view);
        view.addOnLayoutChangeListener(this.f14491E);
    }
}
