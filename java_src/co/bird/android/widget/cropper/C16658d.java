package co.bird.android.widget.cropper;

import android.graphics.RectF;
import co.bird.android.widget.cropper.C16659e;
import co.bird.android.widget.cropper.CropImageView;
/* renamed from: co.bird.android.widget.cropper.d */
/* loaded from: classes4.dex */
public final class C16658d {

    /* renamed from: c */
    public float f67997c;

    /* renamed from: d */
    public float f67998d;

    /* renamed from: e */
    public float f67999e;

    /* renamed from: f */
    public float f68000f;

    /* renamed from: g */
    public float f68001g;

    /* renamed from: h */
    public float f68002h;

    /* renamed from: i */
    public float f68003i;

    /* renamed from: j */
    public float f68004j;

    /* renamed from: a */
    public final RectF f67995a = new RectF();

    /* renamed from: b */
    public final RectF f67996b = new RectF();

    /* renamed from: k */
    public float f68005k = 1.0f;

    /* renamed from: l */
    public float f68006l = 1.0f;

    /* renamed from: l */
    public static boolean m54080l(float f, float f2, float f3, float f4, float f5, float f6) {
        return f > f3 && f < f5 && f2 > f4 && f2 < f6;
    }

    /* renamed from: m */
    public static boolean m54079m(float f, float f2, float f3, float f4, float f5) {
        return Math.abs(f - f3) <= f5 && Math.abs(f2 - f4) <= f5;
    }

    /* renamed from: n */
    public static boolean m54078n(float f, float f2, float f3, float f4, float f5, float f6) {
        return f > f3 && f < f4 && Math.abs(f2 - f5) <= f6;
    }

    /* renamed from: o */
    public static boolean m54077o(float f, float f2, float f3, float f4, float f5, float f6) {
        return Math.abs(f - f3) <= f6 && f2 > f4 && f2 < f5;
    }

    /* renamed from: a */
    public final boolean m54091a() {
        return !m54071u();
    }

    /* renamed from: b */
    public float m54090b() {
        return Math.min(this.f68000f, this.f68004j / this.f68006l);
    }

    /* renamed from: c */
    public float m54089c() {
        return Math.min(this.f67999e, this.f68003i / this.f68005k);
    }

    /* renamed from: d */
    public float m54088d() {
        return Math.max(this.f67998d, this.f68002h / this.f68006l);
    }

    /* renamed from: e */
    public float m54087e() {
        return Math.max(this.f67997c, this.f68001g / this.f68005k);
    }

    /* renamed from: f */
    public C16659e m54086f(float f, float f2, float f3, CropImageView.EnumC16642c enumC16642c) {
        C16659e.EnumC16661b m54083i;
        if (enumC16642c == CropImageView.EnumC16642c.OVAL) {
            m54083i = m54085g(f, f2);
        } else {
            m54083i = m54083i(f, f2, f3);
        }
        if (m54083i != null) {
            return new C16659e(m54083i, this, f, f2);
        }
        return null;
    }

    /* renamed from: g */
    public final C16659e.EnumC16661b m54085g(float f, float f2) {
        float width = this.f67995a.width() / 6.0f;
        RectF rectF = this.f67995a;
        float f3 = rectF.left;
        float f4 = f3 + width;
        float f5 = f3 + (width * 5.0f);
        float height = rectF.height() / 6.0f;
        float f6 = this.f67995a.top;
        float f7 = f6 + height;
        float f8 = f6 + (height * 5.0f);
        if (f < f4) {
            if (f2 < f7) {
                return C16659e.EnumC16661b.TOP_LEFT;
            }
            if (f2 < f8) {
                return C16659e.EnumC16661b.LEFT;
            }
            return C16659e.EnumC16661b.BOTTOM_LEFT;
        } else if (f < f5) {
            if (f2 < f7) {
                return C16659e.EnumC16661b.TOP;
            }
            if (f2 < f8) {
                return C16659e.EnumC16661b.CENTER;
            }
            return C16659e.EnumC16661b.BOTTOM;
        } else if (f2 < f7) {
            return C16659e.EnumC16661b.TOP_RIGHT;
        } else {
            if (f2 < f8) {
                return C16659e.EnumC16661b.RIGHT;
            }
            return C16659e.EnumC16661b.BOTTOM_RIGHT;
        }
    }

    /* renamed from: h */
    public RectF m54084h() {
        this.f67996b.set(this.f67995a);
        return this.f67996b;
    }

    /* renamed from: i */
    public final C16659e.EnumC16661b m54083i(float f, float f2, float f3) {
        RectF rectF = this.f67995a;
        if (m54079m(f, f2, rectF.left, rectF.top, f3)) {
            return C16659e.EnumC16661b.TOP_LEFT;
        }
        RectF rectF2 = this.f67995a;
        if (m54079m(f, f2, rectF2.right, rectF2.top, f3)) {
            return C16659e.EnumC16661b.TOP_RIGHT;
        }
        RectF rectF3 = this.f67995a;
        if (m54079m(f, f2, rectF3.left, rectF3.bottom, f3)) {
            return C16659e.EnumC16661b.BOTTOM_LEFT;
        }
        RectF rectF4 = this.f67995a;
        if (m54079m(f, f2, rectF4.right, rectF4.bottom, f3)) {
            return C16659e.EnumC16661b.BOTTOM_RIGHT;
        }
        RectF rectF5 = this.f67995a;
        if (m54080l(f, f2, rectF5.left, rectF5.top, rectF5.right, rectF5.bottom) && m54091a()) {
            return C16659e.EnumC16661b.CENTER;
        }
        RectF rectF6 = this.f67995a;
        if (m54078n(f, f2, rectF6.left, rectF6.right, rectF6.top, f3)) {
            return C16659e.EnumC16661b.TOP;
        }
        RectF rectF7 = this.f67995a;
        if (m54078n(f, f2, rectF7.left, rectF7.right, rectF7.bottom, f3)) {
            return C16659e.EnumC16661b.BOTTOM;
        }
        RectF rectF8 = this.f67995a;
        if (m54077o(f, f2, rectF8.left, rectF8.top, rectF8.bottom, f3)) {
            return C16659e.EnumC16661b.LEFT;
        }
        RectF rectF9 = this.f67995a;
        if (m54077o(f, f2, rectF9.right, rectF9.top, rectF9.bottom, f3)) {
            return C16659e.EnumC16661b.RIGHT;
        }
        RectF rectF10 = this.f67995a;
        if (m54080l(f, f2, rectF10.left, rectF10.top, rectF10.right, rectF10.bottom) && !m54091a()) {
            return C16659e.EnumC16661b.CENTER;
        }
        return null;
    }

    /* renamed from: j */
    public float m54082j() {
        return this.f68006l;
    }

    /* renamed from: k */
    public float m54081k() {
        return this.f68005k;
    }

    /* renamed from: p */
    public void m54076p(float f, float f2, float f3, float f4) {
        this.f67999e = f;
        this.f68000f = f2;
        this.f68005k = f3;
        this.f68006l = f4;
    }

    /* renamed from: q */
    public void m54075q(CropImageOptions cropImageOptions) {
        this.f67997c = cropImageOptions.f67856y;
        this.f67998d = cropImageOptions.f67857z;
        this.f68001g = cropImageOptions.f67812A;
        this.f68002h = cropImageOptions.f67813B;
        this.f68003i = cropImageOptions.f67814C;
        this.f68004j = cropImageOptions.f67815D;
    }

    /* renamed from: r */
    public void m54074r(int i, int i2) {
        this.f68003i = i;
        this.f68004j = i2;
    }

    /* renamed from: s */
    public void m54073s(int i, int i2) {
        this.f68001g = i;
        this.f68002h = i2;
    }

    /* renamed from: t */
    public void m54072t(RectF rectF) {
        this.f67995a.set(rectF);
    }

    /* renamed from: u */
    public boolean m54071u() {
        return this.f67995a.width() >= 100.0f && this.f67995a.height() >= 100.0f;
    }
}
