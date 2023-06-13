package co.bird.android.widget.cropper;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
/* renamed from: co.bird.android.widget.cropper.e */
/* loaded from: classes4.dex */
public final class C16659e {

    /* renamed from: g */
    public static final Matrix f68007g = new Matrix();

    /* renamed from: a */
    public final float f68008a;

    /* renamed from: b */
    public final float f68009b;

    /* renamed from: c */
    public final float f68010c;

    /* renamed from: d */
    public final float f68011d;

    /* renamed from: e */
    public final EnumC16661b f68012e;

    /* renamed from: f */
    public final PointF f68013f = new PointF();

    /* renamed from: co.bird.android.widget.cropper.e$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C16660a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f68014a;

        static {
            int[] iArr = new int[EnumC16661b.values().length];
            f68014a = iArr;
            try {
                iArr[EnumC16661b.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f68014a[EnumC16661b.TOP_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f68014a[EnumC16661b.BOTTOM_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f68014a[EnumC16661b.BOTTOM_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f68014a[EnumC16661b.LEFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f68014a[EnumC16661b.TOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f68014a[EnumC16661b.RIGHT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f68014a[EnumC16661b.BOTTOM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f68014a[EnumC16661b.CENTER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* renamed from: co.bird.android.widget.cropper.e$b */
    /* loaded from: classes4.dex */
    public enum EnumC16661b {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        CENTER
    }

    public C16659e(EnumC16661b enumC16661b, C16658d c16658d, float f, float f2) {
        this.f68012e = enumC16661b;
        this.f68008a = c16658d.m54087e();
        this.f68009b = c16658d.m54088d();
        this.f68010c = c16658d.m54089c();
        this.f68011d = c16658d.m54090b();
        m54059l(c16658d.m54084h(), f, f2);
    }

    /* renamed from: k */
    public static float m54060k(float f, float f2, float f3, float f4) {
        return (f3 - f) / (f4 - f2);
    }

    /* renamed from: a */
    public final void m54070a(RectF rectF, float f, RectF rectF2, int i, float f2, float f3, boolean z, boolean z2) {
        float f4 = i;
        if (f > f4) {
            f = ((f - f4) / 1.05f) + f4;
            this.f68013f.y -= (f - f4) / 1.1f;
        }
        float f5 = rectF2.bottom;
        if (f > f5) {
            this.f68013f.y -= (f - f5) / 2.0f;
        }
        if (f5 - f < f2) {
            f = f5;
        }
        float f6 = rectF.top;
        float f7 = this.f68009b;
        if (f - f6 < f7) {
            f = f6 + f7;
        }
        float f8 = this.f68011d;
        if (f - f6 > f8) {
            f = f6 + f8;
        }
        if (f5 - f < f2) {
            f = f5;
        }
        if (f3 > 0.0f) {
            float f9 = (f - f6) * f3;
            float f10 = this.f68008a;
            if (f9 < f10) {
                f = Math.min(f5, f6 + (f10 / f3));
                f9 = (f - rectF.top) * f3;
            }
            float f11 = this.f68010c;
            if (f9 > f11) {
                f = Math.min(rectF2.bottom, rectF.top + (f11 / f3));
                f9 = (f - rectF.top) * f3;
            }
            if (z && z2) {
                f = Math.min(f, Math.min(rectF2.bottom, rectF.top + (rectF2.width() / f3)));
            } else {
                if (z) {
                    float f12 = rectF.right;
                    float f13 = rectF2.left;
                    if (f12 - f9 < f13) {
                        f = Math.min(rectF2.bottom, rectF.top + ((f12 - f13) / f3));
                        f9 = (f - rectF.top) * f3;
                    }
                }
                if (z2) {
                    float f14 = rectF.left;
                    float f15 = rectF2.right;
                    if (f9 + f14 > f15) {
                        f = Math.min(f, Math.min(rectF2.bottom, rectF.top + ((f15 - f14) / f3)));
                    }
                }
            }
        }
        rectF.bottom = f;
    }

    /* renamed from: b */
    public final void m54069b(RectF rectF, float f) {
        rectF.bottom = rectF.top + (rectF.width() / f);
    }

    /* renamed from: c */
    public final void m54068c(RectF rectF, float f, RectF rectF2, float f2, float f3, boolean z, boolean z2) {
        if (f < 0.0f) {
            f /= 1.05f;
            this.f68013f.x -= f / 1.1f;
        }
        float f4 = rectF2.left;
        if (f < f4) {
            this.f68013f.x -= (f - f4) / 2.0f;
        }
        if (f - f4 < f2) {
            f = f4;
        }
        float f5 = rectF.right;
        float f6 = this.f68008a;
        if (f5 - f < f6) {
            f = f5 - f6;
        }
        float f7 = this.f68010c;
        if (f5 - f > f7) {
            f = f5 - f7;
        }
        if (f - f4 < f2) {
            f = f4;
        }
        if (f3 > 0.0f) {
            float f8 = (f5 - f) / f3;
            float f9 = this.f68009b;
            if (f8 < f9) {
                f = Math.max(f4, f5 - (f9 * f3));
                f8 = (rectF.right - f) / f3;
            }
            float f10 = this.f68011d;
            if (f8 > f10) {
                f = Math.max(rectF2.left, rectF.right - (f10 * f3));
                f8 = (rectF.right - f) / f3;
            }
            if (z && z2) {
                f = Math.max(f, Math.max(rectF2.left, rectF.right - (rectF2.height() * f3)));
            } else {
                if (z) {
                    float f11 = rectF.bottom;
                    float f12 = rectF2.top;
                    if (f11 - f8 < f12) {
                        f = Math.max(rectF2.left, rectF.right - ((f11 - f12) * f3));
                        f8 = (rectF.right - f) / f3;
                    }
                }
                if (z2) {
                    float f13 = rectF.top;
                    float f14 = rectF2.bottom;
                    if (f8 + f13 > f14) {
                        f = Math.max(f, Math.max(rectF2.left, rectF.right - ((f14 - f13) * f3)));
                    }
                }
            }
        }
        rectF.left = f;
    }

    /* renamed from: d */
    public final void m54067d(RectF rectF, float f) {
        rectF.left = rectF.right - (rectF.height() * f);
    }

    /* renamed from: e */
    public final void m54066e(RectF rectF, RectF rectF2, float f) {
        rectF.inset((rectF.width() - (rectF.height() * f)) / 2.0f, 0.0f);
        float f2 = rectF.left;
        float f3 = rectF2.left;
        if (f2 < f3) {
            rectF.offset(f3 - f2, 0.0f);
        }
        float f4 = rectF.right;
        float f5 = rectF2.right;
        if (f4 > f5) {
            rectF.offset(f5 - f4, 0.0f);
        }
    }

    /* renamed from: f */
    public final void m54065f(RectF rectF, float f, RectF rectF2, int i, float f2, float f3, boolean z, boolean z2) {
        float f4 = i;
        if (f > f4) {
            f = ((f - f4) / 1.05f) + f4;
            this.f68013f.x -= (f - f4) / 1.1f;
        }
        float f5 = rectF2.right;
        if (f > f5) {
            this.f68013f.x -= (f - f5) / 2.0f;
        }
        if (f5 - f < f2) {
            f = f5;
        }
        float f6 = rectF.left;
        float f7 = this.f68008a;
        if (f - f6 < f7) {
            f = f6 + f7;
        }
        float f8 = this.f68010c;
        if (f - f6 > f8) {
            f = f6 + f8;
        }
        if (f5 - f < f2) {
            f = f5;
        }
        if (f3 > 0.0f) {
            float f9 = (f - f6) / f3;
            float f10 = this.f68009b;
            if (f9 < f10) {
                f = Math.min(f5, f6 + (f10 * f3));
                f9 = (f - rectF.left) / f3;
            }
            float f11 = this.f68011d;
            if (f9 > f11) {
                f = Math.min(rectF2.right, rectF.left + (f11 * f3));
                f9 = (f - rectF.left) / f3;
            }
            if (z && z2) {
                f = Math.min(f, Math.min(rectF2.right, rectF.left + (rectF2.height() * f3)));
            } else {
                if (z) {
                    float f12 = rectF.bottom;
                    float f13 = rectF2.top;
                    if (f12 - f9 < f13) {
                        f = Math.min(rectF2.right, rectF.left + ((f12 - f13) * f3));
                        f9 = (f - rectF.left) / f3;
                    }
                }
                if (z2) {
                    float f14 = rectF.top;
                    float f15 = rectF2.bottom;
                    if (f9 + f14 > f15) {
                        f = Math.min(f, Math.min(rectF2.right, rectF.left + ((f15 - f14) * f3)));
                    }
                }
            }
        }
        rectF.right = f;
    }

    /* renamed from: g */
    public final void m54064g(RectF rectF, float f) {
        rectF.right = rectF.left + (rectF.height() * f);
    }

    /* renamed from: h */
    public final void m54063h(RectF rectF, float f, RectF rectF2, float f2, float f3, boolean z, boolean z2) {
        if (f < 0.0f) {
            f /= 1.05f;
            this.f68013f.y -= f / 1.1f;
        }
        float f4 = rectF2.top;
        if (f < f4) {
            this.f68013f.y -= (f - f4) / 2.0f;
        }
        if (f - f4 < f2) {
            f = f4;
        }
        float f5 = rectF.bottom;
        float f6 = this.f68009b;
        if (f5 - f < f6) {
            f = f5 - f6;
        }
        float f7 = this.f68011d;
        if (f5 - f > f7) {
            f = f5 - f7;
        }
        if (f - f4 < f2) {
            f = f4;
        }
        if (f3 > 0.0f) {
            float f8 = (f5 - f) * f3;
            float f9 = this.f68008a;
            if (f8 < f9) {
                f = Math.max(f4, f5 - (f9 / f3));
                f8 = (rectF.bottom - f) * f3;
            }
            float f10 = this.f68010c;
            if (f8 > f10) {
                f = Math.max(rectF2.top, rectF.bottom - (f10 / f3));
                f8 = (rectF.bottom - f) * f3;
            }
            if (z && z2) {
                f = Math.max(f, Math.max(rectF2.top, rectF.bottom - (rectF2.width() / f3)));
            } else {
                if (z) {
                    float f11 = rectF.right;
                    float f12 = rectF2.left;
                    if (f11 - f8 < f12) {
                        f = Math.max(rectF2.top, rectF.bottom - ((f11 - f12) / f3));
                        f8 = (rectF.bottom - f) * f3;
                    }
                }
                if (z2) {
                    float f13 = rectF.left;
                    float f14 = rectF2.right;
                    if (f8 + f13 > f14) {
                        f = Math.max(f, Math.max(rectF2.top, rectF.bottom - ((f14 - f13) / f3)));
                    }
                }
            }
        }
        rectF.top = f;
    }

    /* renamed from: i */
    public final void m54062i(RectF rectF, RectF rectF2, float f) {
        rectF.inset(0.0f, (rectF.height() - (rectF.width() / f)) / 2.0f);
        float f2 = rectF.top;
        float f3 = rectF2.top;
        if (f2 < f3) {
            rectF.offset(0.0f, f3 - f2);
        }
        float f4 = rectF.bottom;
        float f5 = rectF2.bottom;
        if (f4 > f5) {
            rectF.offset(0.0f, f5 - f4);
        }
    }

    /* renamed from: j */
    public final void m54061j(RectF rectF, float f) {
        rectF.top = rectF.bottom - (rectF.width() / f);
    }

    /* renamed from: l */
    public final void m54059l(RectF rectF, float f, float f2) {
        float f3;
        float f4;
        float f5;
        float f6 = 0.0f;
        switch (C16660a.f68014a[this.f68012e.ordinal()]) {
            case 1:
                f6 = rectF.left - f;
                f3 = rectF.top;
                f5 = f3 - f2;
                break;
            case 2:
                f6 = rectF.right - f;
                f3 = rectF.top;
                f5 = f3 - f2;
                break;
            case 3:
                f6 = rectF.left - f;
                f3 = rectF.bottom;
                f5 = f3 - f2;
                break;
            case 4:
                f6 = rectF.right - f;
                f3 = rectF.bottom;
                f5 = f3 - f2;
                break;
            case 5:
                f4 = rectF.left;
                f6 = f4 - f;
                f5 = 0.0f;
                break;
            case 6:
                f3 = rectF.top;
                f5 = f3 - f2;
                break;
            case 7:
                f4 = rectF.right;
                f6 = f4 - f;
                f5 = 0.0f;
                break;
            case 8:
                f3 = rectF.bottom;
                f5 = f3 - f2;
                break;
            case 9:
                f6 = rectF.centerX() - f;
                f3 = rectF.centerY();
                f5 = f3 - f2;
                break;
            default:
                f5 = 0.0f;
                break;
        }
        PointF pointF = this.f68013f;
        pointF.x = f6;
        pointF.y = f5;
    }

    /* renamed from: m */
    public void m54058m(RectF rectF, float f, float f2, RectF rectF2, int i, int i2, float f3, boolean z, float f4) {
        PointF pointF = this.f68013f;
        float f5 = f + pointF.x;
        float f6 = f2 + pointF.y;
        if (this.f68012e == EnumC16661b.CENTER) {
            m54057n(rectF, f5, f6, rectF2, i, i2, f3);
        } else if (z) {
            m54056o(rectF, f5, f6, rectF2, i, i2, f3, f4);
        } else {
            m54055p(rectF, f5, f6, rectF2, i, i2, f3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
        if ((r0 + r9) <= r10.bottom) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
        if ((r1 + r8) <= r10.right) goto L9;
     */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m54057n(RectF rectF, float f, float f2, RectF rectF2, int i, int i2, float f3) {
        float centerX = f - rectF.centerX();
        float centerY = f2 - rectF.centerY();
        float f4 = rectF.left;
        if (f4 + centerX >= 0.0f) {
            float f5 = rectF.right;
            if (f5 + centerX <= i) {
                if (f4 + centerX >= rectF2.left) {
                }
            }
        }
        centerX /= 1.05f;
        this.f68013f.x -= centerX / 2.0f;
        float f6 = rectF.top;
        if (f6 + centerY >= 0.0f) {
            float f7 = rectF.bottom;
            if (f7 + centerY <= i2) {
                if (f6 + centerY >= rectF2.top) {
                }
            }
        }
        centerY /= 1.05f;
        this.f68013f.y -= centerY / 2.0f;
        rectF.offset(centerX, centerY);
        m54054q(rectF, rectF2, f3);
    }

    /* renamed from: o */
    public final void m54056o(RectF rectF, float f, float f2, RectF rectF2, int i, int i2, float f3, float f4) {
        switch (C16660a.f68014a[this.f68012e.ordinal()]) {
            case 1:
                if (m54060k(f, f2, rectF.right, rectF.bottom) < f4) {
                    m54063h(rectF, f2, rectF2, f3, f4, true, false);
                    m54067d(rectF, f4);
                    return;
                }
                m54068c(rectF, f, rectF2, f3, f4, true, false);
                m54061j(rectF, f4);
                return;
            case 2:
                if (m54060k(rectF.left, f2, f, rectF.bottom) < f4) {
                    m54063h(rectF, f2, rectF2, f3, f4, false, true);
                    m54064g(rectF, f4);
                    return;
                }
                m54065f(rectF, f, rectF2, i, f3, f4, true, false);
                m54061j(rectF, f4);
                return;
            case 3:
                if (m54060k(f, rectF.top, rectF.right, f2) < f4) {
                    m54070a(rectF, f2, rectF2, i2, f3, f4, true, false);
                    m54067d(rectF, f4);
                    return;
                }
                m54068c(rectF, f, rectF2, f3, f4, false, true);
                m54069b(rectF, f4);
                return;
            case 4:
                if (m54060k(rectF.left, rectF.top, f, f2) < f4) {
                    m54070a(rectF, f2, rectF2, i2, f3, f4, false, true);
                    m54064g(rectF, f4);
                    return;
                }
                m54065f(rectF, f, rectF2, i, f3, f4, false, true);
                m54069b(rectF, f4);
                return;
            case 5:
                m54068c(rectF, f, rectF2, f3, f4, true, true);
                m54062i(rectF, rectF2, f4);
                return;
            case 6:
                m54063h(rectF, f2, rectF2, f3, f4, true, true);
                m54066e(rectF, rectF2, f4);
                return;
            case 7:
                m54065f(rectF, f, rectF2, i, f3, f4, true, true);
                m54062i(rectF, rectF2, f4);
                return;
            case 8:
                m54070a(rectF, f2, rectF2, i2, f3, f4, true, true);
                m54066e(rectF, rectF2, f4);
                return;
            default:
                return;
        }
    }

    /* renamed from: p */
    public final void m54055p(RectF rectF, float f, float f2, RectF rectF2, int i, int i2, float f3) {
        switch (C16660a.f68014a[this.f68012e.ordinal()]) {
            case 1:
                m54063h(rectF, f2, rectF2, f3, 0.0f, false, false);
                m54068c(rectF, f, rectF2, f3, 0.0f, false, false);
                return;
            case 2:
                m54063h(rectF, f2, rectF2, f3, 0.0f, false, false);
                m54065f(rectF, f, rectF2, i, f3, 0.0f, false, false);
                return;
            case 3:
                m54070a(rectF, f2, rectF2, i2, f3, 0.0f, false, false);
                m54068c(rectF, f, rectF2, f3, 0.0f, false, false);
                return;
            case 4:
                m54070a(rectF, f2, rectF2, i2, f3, 0.0f, false, false);
                m54065f(rectF, f, rectF2, i, f3, 0.0f, false, false);
                return;
            case 5:
                m54068c(rectF, f, rectF2, f3, 0.0f, false, false);
                return;
            case 6:
                m54063h(rectF, f2, rectF2, f3, 0.0f, false, false);
                return;
            case 7:
                m54065f(rectF, f, rectF2, i, f3, 0.0f, false, false);
                return;
            case 8:
                m54070a(rectF, f2, rectF2, i2, f3, 0.0f, false, false);
                return;
            default:
                return;
        }
    }

    /* renamed from: q */
    public final void m54054q(RectF rectF, RectF rectF2, float f) {
        float f2 = rectF.left;
        float f3 = rectF2.left;
        if (f2 < f3 + f) {
            rectF.offset(f3 - f2, 0.0f);
        }
        float f4 = rectF.top;
        float f5 = rectF2.top;
        if (f4 < f5 + f) {
            rectF.offset(0.0f, f5 - f4);
        }
        float f6 = rectF.right;
        float f7 = rectF2.right;
        if (f6 > f7 - f) {
            rectF.offset(f7 - f6, 0.0f);
        }
        float f8 = rectF.bottom;
        float f9 = rectF2.bottom;
        if (f8 > f9 - f) {
            rectF.offset(0.0f, f9 - f8);
        }
    }
}
