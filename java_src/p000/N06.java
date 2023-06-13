package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import p000.C49785uM4;
/* renamed from: N06 */
/* loaded from: classes6.dex */
public class N06 {

    /* renamed from: a */
    public final ColorStateList f23947a;

    /* renamed from: b */
    public final ColorStateList f23948b;

    /* renamed from: c */
    public final ColorStateList f23949c;

    /* renamed from: d */
    public final String f23950d;

    /* renamed from: e */
    public final int f23951e;

    /* renamed from: f */
    public final int f23952f;

    /* renamed from: g */
    public final boolean f23953g;

    /* renamed from: h */
    public final float f23954h;

    /* renamed from: i */
    public final float f23955i;

    /* renamed from: j */
    public final float f23956j;

    /* renamed from: k */
    public final boolean f23957k;

    /* renamed from: l */
    public final float f23958l;

    /* renamed from: m */
    public ColorStateList f23959m;

    /* renamed from: n */
    public float f23960n;

    /* renamed from: o */
    public final int f23961o;

    /* renamed from: p */
    public boolean f23962p = false;

    /* renamed from: q */
    public Typeface f23963q;

    /* renamed from: N06$a */
    /* loaded from: classes6.dex */
    public class C5457a extends C49785uM4.AbstractC29183e {

        /* renamed from: a */
        public final /* synthetic */ P06 f23964a;

        public C5457a(P06 p06) {
            this.f23964a = p06;
        }

        @Override // p000.C49785uM4.AbstractC29183e
        /* renamed from: h */
        public void mo10376h(int i) {
            N06.this.f23962p = true;
            this.f23964a.mo49941a(i);
        }

        @Override // p000.C49785uM4.AbstractC29183e
        /* renamed from: i */
        public void mo10375i(Typeface typeface) {
            N06 n06 = N06.this;
            n06.f23963q = Typeface.create(typeface, n06.f23951e);
            N06.this.f23962p = true;
            this.f23964a.mo49940b(N06.this.f23963q, false);
        }
    }

    /* renamed from: N06$b */
    /* loaded from: classes6.dex */
    public class C5458b extends P06 {

        /* renamed from: a */
        public final /* synthetic */ Context f23966a;

        /* renamed from: b */
        public final /* synthetic */ TextPaint f23967b;

        /* renamed from: c */
        public final /* synthetic */ P06 f23968c;

        public C5458b(Context context, TextPaint textPaint, P06 p06) {
            this.f23966a = context;
            this.f23967b = textPaint;
            this.f23968c = p06;
        }

        @Override // p000.P06
        /* renamed from: a */
        public void mo49941a(int i) {
            this.f23968c.mo49941a(i);
        }

        @Override // p000.P06
        /* renamed from: b */
        public void mo49940b(Typeface typeface, boolean z) {
            N06.this.m94474p(this.f23966a, this.f23967b, typeface);
            this.f23968c.mo49940b(typeface, z);
        }
    }

    public N06(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C37098Xl4.TextAppearance);
        m94478l(obtainStyledAttributes.getDimension(C37098Xl4.TextAppearance_android_textSize, 0.0f));
        m94479k(NM2.m94029b(context, obtainStyledAttributes, C37098Xl4.TextAppearance_android_textColor));
        this.f23947a = NM2.m94029b(context, obtainStyledAttributes, C37098Xl4.TextAppearance_android_textColorHint);
        this.f23948b = NM2.m94029b(context, obtainStyledAttributes, C37098Xl4.TextAppearance_android_textColorLink);
        this.f23951e = obtainStyledAttributes.getInt(C37098Xl4.TextAppearance_android_textStyle, 0);
        this.f23952f = obtainStyledAttributes.getInt(C37098Xl4.TextAppearance_android_typeface, 1);
        int m94025f = NM2.m94025f(obtainStyledAttributes, C37098Xl4.TextAppearance_fontFamily, C37098Xl4.TextAppearance_android_fontFamily);
        this.f23961o = obtainStyledAttributes.getResourceId(m94025f, 0);
        this.f23950d = obtainStyledAttributes.getString(m94025f);
        this.f23953g = obtainStyledAttributes.getBoolean(C37098Xl4.TextAppearance_textAllCaps, false);
        this.f23949c = NM2.m94029b(context, obtainStyledAttributes, C37098Xl4.TextAppearance_android_shadowColor);
        this.f23954h = obtainStyledAttributes.getFloat(C37098Xl4.TextAppearance_android_shadowDx, 0.0f);
        this.f23955i = obtainStyledAttributes.getFloat(C37098Xl4.TextAppearance_android_shadowDy, 0.0f);
        this.f23956j = obtainStyledAttributes.getFloat(C37098Xl4.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, C37098Xl4.MaterialTextAppearance);
        int i2 = C37098Xl4.MaterialTextAppearance_android_letterSpacing;
        this.f23957k = obtainStyledAttributes2.hasValue(i2);
        this.f23958l = obtainStyledAttributes2.getFloat(i2, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    /* renamed from: d */
    public final void m94486d() {
        String str;
        if (this.f23963q == null && (str = this.f23950d) != null) {
            this.f23963q = Typeface.create(str, this.f23951e);
        }
        if (this.f23963q == null) {
            int i = this.f23952f;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        this.f23963q = Typeface.DEFAULT;
                    } else {
                        this.f23963q = Typeface.MONOSPACE;
                    }
                } else {
                    this.f23963q = Typeface.SERIF;
                }
            } else {
                this.f23963q = Typeface.SANS_SERIF;
            }
            this.f23963q = Typeface.create(this.f23963q, this.f23951e);
        }
    }

    /* renamed from: e */
    public Typeface m94485e() {
        m94486d();
        return this.f23963q;
    }

    /* renamed from: f */
    public Typeface m94484f(Context context) {
        if (this.f23962p) {
            return this.f23963q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface m10395h = C49785uM4.m10395h(context, this.f23961o);
                this.f23963q = m10395h;
                if (m10395h != null) {
                    this.f23963q = Typeface.create(m10395h, this.f23951e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font " + this.f23950d, e);
            }
        }
        m94486d();
        this.f23962p = true;
        return this.f23963q;
    }

    /* renamed from: g */
    public void m94483g(Context context, P06 p06) {
        if (m94477m(context)) {
            m94484f(context);
        } else {
            m94486d();
        }
        int i = this.f23961o;
        if (i == 0) {
            this.f23962p = true;
        }
        if (this.f23962p) {
            p06.mo49940b(this.f23963q, true);
            return;
        }
        try {
            C49785uM4.m10393j(context, i, new C5457a(p06), null);
        } catch (Resources.NotFoundException unused) {
            this.f23962p = true;
            p06.mo49941a(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.f23950d, e);
            this.f23962p = true;
            p06.mo49941a(-3);
        }
    }

    /* renamed from: h */
    public void m94482h(Context context, TextPaint textPaint, P06 p06) {
        m94474p(context, textPaint, m94485e());
        m94483g(context, new C5458b(context, textPaint, p06));
    }

    /* renamed from: i */
    public ColorStateList m94481i() {
        return this.f23959m;
    }

    /* renamed from: j */
    public float m94480j() {
        return this.f23960n;
    }

    /* renamed from: k */
    public void m94479k(ColorStateList colorStateList) {
        this.f23959m = colorStateList;
    }

    /* renamed from: l */
    public void m94478l(float f) {
        this.f23960n = f;
    }

    /* renamed from: m */
    public final boolean m94477m(Context context) {
        Typeface typeface;
        if (O06.m93015a()) {
            return true;
        }
        int i = this.f23961o;
        if (i != 0) {
            typeface = C49785uM4.m10400c(context, i);
        } else {
            typeface = null;
        }
        if (typeface != null) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public void m94476n(Context context, TextPaint textPaint, P06 p06) {
        int i;
        int i2;
        m94475o(context, textPaint, p06);
        ColorStateList colorStateList = this.f23959m;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i = -16777216;
        }
        textPaint.setColor(i);
        float f = this.f23956j;
        float f2 = this.f23954h;
        float f3 = this.f23955i;
        ColorStateList colorStateList2 = this.f23949c;
        if (colorStateList2 != null) {
            i2 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i2 = 0;
        }
        textPaint.setShadowLayer(f, f2, f3, i2);
    }

    /* renamed from: o */
    public void m94475o(Context context, TextPaint textPaint, P06 p06) {
        if (m94477m(context)) {
            m94474p(context, textPaint, m94484f(context));
        } else {
            m94482h(context, textPaint, p06);
        }
    }

    /* renamed from: p */
    public void m94474p(Context context, TextPaint textPaint, Typeface typeface) {
        boolean z;
        float f;
        Typeface m106903a = C32807Fc6.m106903a(context, typeface);
        if (m106903a != null) {
            typeface = m106903a;
        }
        textPaint.setTypeface(typeface);
        int i = this.f23951e & (~typeface.getStyle());
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        textPaint.setFakeBoldText(z);
        if ((i & 2) != 0) {
            f = -0.25f;
        } else {
            f = 0.0f;
        }
        textPaint.setTextSkewX(f);
        textPaint.setTextSize(this.f23960n);
        if (this.f23957k) {
            textPaint.setLetterSpacing(this.f23958l);
        }
    }
}
